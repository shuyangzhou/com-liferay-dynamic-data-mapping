/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.dynamic.data.mapping.service.base;

import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceService;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceFinder;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstancePersistence;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceRecordFinder;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceRecordPersistence;
import com.liferay.dynamic.data.mapping.service.persistence.DDMFormInstanceVersionPersistence;
import com.liferay.dynamic.data.mapping.service.persistence.DDMStructureFinder;
import com.liferay.dynamic.data.mapping.service.persistence.DDMStructurePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.service.persistence.WorkflowDefinitionLinkPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the ddm form instance remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.dynamic.data.mapping.service.impl.DDMFormInstanceServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.dynamic.data.mapping.service.impl.DDMFormInstanceServiceImpl
 * @see com.liferay.dynamic.data.mapping.service.DDMFormInstanceServiceUtil
 * @generated
 */
public abstract class DDMFormInstanceServiceBaseImpl extends BaseServiceImpl
	implements DDMFormInstanceService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.dynamic.data.mapping.service.DDMFormInstanceServiceUtil} to access the ddm form instance remote service.
	 */

	/**
	 * Returns the ddm form instance local service.
	 *
	 * @return the ddm form instance local service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMFormInstanceLocalService getDDMFormInstanceLocalService() {
		return ddmFormInstanceLocalService;
	}

	/**
	 * Sets the ddm form instance local service.
	 *
	 * @param ddmFormInstanceLocalService the ddm form instance local service
	 */
	public void setDDMFormInstanceLocalService(
		com.liferay.dynamic.data.mapping.service.DDMFormInstanceLocalService ddmFormInstanceLocalService) {
		this.ddmFormInstanceLocalService = ddmFormInstanceLocalService;
	}

	/**
	 * Returns the ddm form instance remote service.
	 *
	 * @return the ddm form instance remote service
	 */
	public DDMFormInstanceService getDDMFormInstanceService() {
		return ddmFormInstanceService;
	}

	/**
	 * Sets the ddm form instance remote service.
	 *
	 * @param ddmFormInstanceService the ddm form instance remote service
	 */
	public void setDDMFormInstanceService(
		DDMFormInstanceService ddmFormInstanceService) {
		this.ddmFormInstanceService = ddmFormInstanceService;
	}

	/**
	 * Returns the ddm form instance persistence.
	 *
	 * @return the ddm form instance persistence
	 */
	public DDMFormInstancePersistence getDDMFormInstancePersistence() {
		return ddmFormInstancePersistence;
	}

	/**
	 * Sets the ddm form instance persistence.
	 *
	 * @param ddmFormInstancePersistence the ddm form instance persistence
	 */
	public void setDDMFormInstancePersistence(
		DDMFormInstancePersistence ddmFormInstancePersistence) {
		this.ddmFormInstancePersistence = ddmFormInstancePersistence;
	}

	/**
	 * Returns the ddm form instance finder.
	 *
	 * @return the ddm form instance finder
	 */
	public DDMFormInstanceFinder getDDMFormInstanceFinder() {
		return ddmFormInstanceFinder;
	}

	/**
	 * Sets the ddm form instance finder.
	 *
	 * @param ddmFormInstanceFinder the ddm form instance finder
	 */
	public void setDDMFormInstanceFinder(
		DDMFormInstanceFinder ddmFormInstanceFinder) {
		this.ddmFormInstanceFinder = ddmFormInstanceFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the workflow definition link local service.
	 *
	 * @return the workflow definition link local service
	 */
	public com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalService getWorkflowDefinitionLinkLocalService() {
		return workflowDefinitionLinkLocalService;
	}

	/**
	 * Sets the workflow definition link local service.
	 *
	 * @param workflowDefinitionLinkLocalService the workflow definition link local service
	 */
	public void setWorkflowDefinitionLinkLocalService(
		com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService) {
		this.workflowDefinitionLinkLocalService = workflowDefinitionLinkLocalService;
	}

	/**
	 * Returns the workflow definition link persistence.
	 *
	 * @return the workflow definition link persistence
	 */
	public WorkflowDefinitionLinkPersistence getWorkflowDefinitionLinkPersistence() {
		return workflowDefinitionLinkPersistence;
	}

	/**
	 * Sets the workflow definition link persistence.
	 *
	 * @param workflowDefinitionLinkPersistence the workflow definition link persistence
	 */
	public void setWorkflowDefinitionLinkPersistence(
		WorkflowDefinitionLinkPersistence workflowDefinitionLinkPersistence) {
		this.workflowDefinitionLinkPersistence = workflowDefinitionLinkPersistence;
	}

	/**
	 * Returns the ddm form instance record local service.
	 *
	 * @return the ddm form instance record local service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordLocalService getDDMFormInstanceRecordLocalService() {
		return ddmFormInstanceRecordLocalService;
	}

	/**
	 * Sets the ddm form instance record local service.
	 *
	 * @param ddmFormInstanceRecordLocalService the ddm form instance record local service
	 */
	public void setDDMFormInstanceRecordLocalService(
		com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordLocalService ddmFormInstanceRecordLocalService) {
		this.ddmFormInstanceRecordLocalService = ddmFormInstanceRecordLocalService;
	}

	/**
	 * Returns the ddm form instance record remote service.
	 *
	 * @return the ddm form instance record remote service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordService getDDMFormInstanceRecordService() {
		return ddmFormInstanceRecordService;
	}

	/**
	 * Sets the ddm form instance record remote service.
	 *
	 * @param ddmFormInstanceRecordService the ddm form instance record remote service
	 */
	public void setDDMFormInstanceRecordService(
		com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordService ddmFormInstanceRecordService) {
		this.ddmFormInstanceRecordService = ddmFormInstanceRecordService;
	}

	/**
	 * Returns the ddm form instance record persistence.
	 *
	 * @return the ddm form instance record persistence
	 */
	public DDMFormInstanceRecordPersistence getDDMFormInstanceRecordPersistence() {
		return ddmFormInstanceRecordPersistence;
	}

	/**
	 * Sets the ddm form instance record persistence.
	 *
	 * @param ddmFormInstanceRecordPersistence the ddm form instance record persistence
	 */
	public void setDDMFormInstanceRecordPersistence(
		DDMFormInstanceRecordPersistence ddmFormInstanceRecordPersistence) {
		this.ddmFormInstanceRecordPersistence = ddmFormInstanceRecordPersistence;
	}

	/**
	 * Returns the ddm form instance record finder.
	 *
	 * @return the ddm form instance record finder
	 */
	public DDMFormInstanceRecordFinder getDDMFormInstanceRecordFinder() {
		return ddmFormInstanceRecordFinder;
	}

	/**
	 * Sets the ddm form instance record finder.
	 *
	 * @param ddmFormInstanceRecordFinder the ddm form instance record finder
	 */
	public void setDDMFormInstanceRecordFinder(
		DDMFormInstanceRecordFinder ddmFormInstanceRecordFinder) {
		this.ddmFormInstanceRecordFinder = ddmFormInstanceRecordFinder;
	}

	/**
	 * Returns the ddm form instance version local service.
	 *
	 * @return the ddm form instance version local service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionLocalService getDDMFormInstanceVersionLocalService() {
		return ddmFormInstanceVersionLocalService;
	}

	/**
	 * Sets the ddm form instance version local service.
	 *
	 * @param ddmFormInstanceVersionLocalService the ddm form instance version local service
	 */
	public void setDDMFormInstanceVersionLocalService(
		com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionLocalService ddmFormInstanceVersionLocalService) {
		this.ddmFormInstanceVersionLocalService = ddmFormInstanceVersionLocalService;
	}

	/**
	 * Returns the ddm form instance version remote service.
	 *
	 * @return the ddm form instance version remote service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionService getDDMFormInstanceVersionService() {
		return ddmFormInstanceVersionService;
	}

	/**
	 * Sets the ddm form instance version remote service.
	 *
	 * @param ddmFormInstanceVersionService the ddm form instance version remote service
	 */
	public void setDDMFormInstanceVersionService(
		com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionService ddmFormInstanceVersionService) {
		this.ddmFormInstanceVersionService = ddmFormInstanceVersionService;
	}

	/**
	 * Returns the ddm form instance version persistence.
	 *
	 * @return the ddm form instance version persistence
	 */
	public DDMFormInstanceVersionPersistence getDDMFormInstanceVersionPersistence() {
		return ddmFormInstanceVersionPersistence;
	}

	/**
	 * Sets the ddm form instance version persistence.
	 *
	 * @param ddmFormInstanceVersionPersistence the ddm form instance version persistence
	 */
	public void setDDMFormInstanceVersionPersistence(
		DDMFormInstanceVersionPersistence ddmFormInstanceVersionPersistence) {
		this.ddmFormInstanceVersionPersistence = ddmFormInstanceVersionPersistence;
	}

	/**
	 * Returns the ddm structure local service.
	 *
	 * @return the ddm structure local service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMStructureLocalService getDDMStructureLocalService() {
		return ddmStructureLocalService;
	}

	/**
	 * Sets the ddm structure local service.
	 *
	 * @param ddmStructureLocalService the ddm structure local service
	 */
	public void setDDMStructureLocalService(
		com.liferay.dynamic.data.mapping.service.DDMStructureLocalService ddmStructureLocalService) {
		this.ddmStructureLocalService = ddmStructureLocalService;
	}

	/**
	 * Returns the ddm structure remote service.
	 *
	 * @return the ddm structure remote service
	 */
	public com.liferay.dynamic.data.mapping.service.DDMStructureService getDDMStructureService() {
		return ddmStructureService;
	}

	/**
	 * Sets the ddm structure remote service.
	 *
	 * @param ddmStructureService the ddm structure remote service
	 */
	public void setDDMStructureService(
		com.liferay.dynamic.data.mapping.service.DDMStructureService ddmStructureService) {
		this.ddmStructureService = ddmStructureService;
	}

	/**
	 * Returns the ddm structure persistence.
	 *
	 * @return the ddm structure persistence
	 */
	public DDMStructurePersistence getDDMStructurePersistence() {
		return ddmStructurePersistence;
	}

	/**
	 * Sets the ddm structure persistence.
	 *
	 * @param ddmStructurePersistence the ddm structure persistence
	 */
	public void setDDMStructurePersistence(
		DDMStructurePersistence ddmStructurePersistence) {
		this.ddmStructurePersistence = ddmStructurePersistence;
	}

	/**
	 * Returns the ddm structure finder.
	 *
	 * @return the ddm structure finder
	 */
	public DDMStructureFinder getDDMStructureFinder() {
		return ddmStructureFinder;
	}

	/**
	 * Sets the ddm structure finder.
	 *
	 * @param ddmStructureFinder the ddm structure finder
	 */
	public void setDDMStructureFinder(DDMStructureFinder ddmStructureFinder) {
		this.ddmStructureFinder = ddmStructureFinder;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DDMFormInstanceService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DDMFormInstance.class;
	}

	protected String getModelClassName() {
		return DDMFormInstance.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ddmFormInstancePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMFormInstanceLocalService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMFormInstanceLocalService ddmFormInstanceLocalService;
	@BeanReference(type = DDMFormInstanceService.class)
	protected DDMFormInstanceService ddmFormInstanceService;
	@BeanReference(type = DDMFormInstancePersistence.class)
	protected DDMFormInstancePersistence ddmFormInstancePersistence;
	@BeanReference(type = DDMFormInstanceFinder.class)
	protected DDMFormInstanceFinder ddmFormInstanceFinder;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalService.class)
	protected com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalService workflowDefinitionLinkLocalService;
	@ServiceReference(type = WorkflowDefinitionLinkPersistence.class)
	protected WorkflowDefinitionLinkPersistence workflowDefinitionLinkPersistence;
	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordLocalService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordLocalService ddmFormInstanceRecordLocalService;
	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMFormInstanceRecordService ddmFormInstanceRecordService;
	@BeanReference(type = DDMFormInstanceRecordPersistence.class)
	protected DDMFormInstanceRecordPersistence ddmFormInstanceRecordPersistence;
	@BeanReference(type = DDMFormInstanceRecordFinder.class)
	protected DDMFormInstanceRecordFinder ddmFormInstanceRecordFinder;
	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionLocalService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionLocalService ddmFormInstanceVersionLocalService;
	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMFormInstanceVersionService ddmFormInstanceVersionService;
	@BeanReference(type = DDMFormInstanceVersionPersistence.class)
	protected DDMFormInstanceVersionPersistence ddmFormInstanceVersionPersistence;
	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMStructureLocalService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMStructureLocalService ddmStructureLocalService;
	@BeanReference(type = com.liferay.dynamic.data.mapping.service.DDMStructureService.class)
	protected com.liferay.dynamic.data.mapping.service.DDMStructureService ddmStructureService;
	@BeanReference(type = DDMStructurePersistence.class)
	protected DDMStructurePersistence ddmStructurePersistence;
	@BeanReference(type = DDMStructureFinder.class)
	protected DDMStructureFinder ddmStructureFinder;
}