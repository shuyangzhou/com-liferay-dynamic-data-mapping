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

package com.liferay.dynamic.data.mapping.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.dynamic.data.mapping.model.DDMStructureLink;
import com.liferay.dynamic.data.mapping.model.DDMStructureLinkModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.petra.string.StringPool;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the DDMStructureLink service. Represents a row in the &quot;DDMStructureLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DDMStructureLinkModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DDMStructureLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureLinkImpl
 * @see DDMStructureLink
 * @see DDMStructureLinkModel
 * @generated
 */
@ProviderType
public class DDMStructureLinkModelImpl extends BaseModelImpl<DDMStructureLink>
	implements DDMStructureLinkModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ddm structure link model instance should use the {@link DDMStructureLink} interface instead.
	 */
	public static final String TABLE_NAME = "DDMStructureLink";
	public static final Object[][] TABLE_COLUMNS = {
			{ "structureLinkId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "classNameId", Types.BIGINT },
			{ "classPK", Types.BIGINT },
			{ "structureId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("structureLinkId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("classNameId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("classPK", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("structureId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table DDMStructureLink (structureLinkId LONG not null primary key,companyId LONG,classNameId LONG,classPK LONG,structureId LONG)";
	public static final String TABLE_SQL_DROP = "drop table DDMStructureLink";
	public static final String ORDER_BY_JPQL = " ORDER BY ddmStructureLink.structureLinkId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DDMStructureLink.structureLinkId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.dynamic.data.mapping.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.dynamic.data.mapping.model.DDMStructureLink"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.dynamic.data.mapping.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.dynamic.data.mapping.model.DDMStructureLink"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.dynamic.data.mapping.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.dynamic.data.mapping.model.DDMStructureLink"),
			true);
	public static final long CLASSNAMEID_COLUMN_BITMASK = 1L;
	public static final long CLASSPK_COLUMN_BITMASK = 2L;
	public static final long STRUCTUREID_COLUMN_BITMASK = 4L;
	public static final long STRUCTURELINKID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.dynamic.data.mapping.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.dynamic.data.mapping.model.DDMStructureLink"));

	public DDMStructureLinkModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _structureLinkId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStructureLinkId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _structureLinkId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DDMStructureLink.class;
	}

	@Override
	public String getModelClassName() {
		return DDMStructureLink.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("structureLinkId", getStructureLinkId());
		attributes.put("companyId", getCompanyId());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("structureId", getStructureId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long structureLinkId = (Long)attributes.get("structureLinkId");

		if (structureLinkId != null) {
			setStructureLinkId(structureLinkId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Long structureId = (Long)attributes.get("structureId");

		if (structureId != null) {
			setStructureId(structureId);
		}
	}

	@Override
	public long getStructureLinkId() {
		return _structureLinkId;
	}

	@Override
	public void setStructureLinkId(long structureLinkId) {
		_structureLinkId = structureLinkId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	@Override
	public void setClassName(String className) {
		long classNameId = 0;

		if (Validator.isNotNull(className)) {
			classNameId = PortalUtil.getClassNameId(className);
		}

		setClassNameId(classNameId);
	}

	@Override
	public long getClassNameId() {
		return _classNameId;
	}

	@Override
	public void setClassNameId(long classNameId) {
		_columnBitmask |= CLASSNAMEID_COLUMN_BITMASK;

		if (!_setOriginalClassNameId) {
			_setOriginalClassNameId = true;

			_originalClassNameId = _classNameId;
		}

		_classNameId = classNameId;
	}

	public long getOriginalClassNameId() {
		return _originalClassNameId;
	}

	@Override
	public long getClassPK() {
		return _classPK;
	}

	@Override
	public void setClassPK(long classPK) {
		_columnBitmask |= CLASSPK_COLUMN_BITMASK;

		if (!_setOriginalClassPK) {
			_setOriginalClassPK = true;

			_originalClassPK = _classPK;
		}

		_classPK = classPK;
	}

	public long getOriginalClassPK() {
		return _originalClassPK;
	}

	@Override
	public long getStructureId() {
		return _structureId;
	}

	@Override
	public void setStructureId(long structureId) {
		_columnBitmask |= STRUCTUREID_COLUMN_BITMASK;

		if (!_setOriginalStructureId) {
			_setOriginalStructureId = true;

			_originalStructureId = _structureId;
		}

		_structureId = structureId;
	}

	public long getOriginalStructureId() {
		return _originalStructureId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DDMStructureLink.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DDMStructureLink toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DDMStructureLink)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DDMStructureLinkImpl ddmStructureLinkImpl = new DDMStructureLinkImpl();

		ddmStructureLinkImpl.setStructureLinkId(getStructureLinkId());
		ddmStructureLinkImpl.setCompanyId(getCompanyId());
		ddmStructureLinkImpl.setClassNameId(getClassNameId());
		ddmStructureLinkImpl.setClassPK(getClassPK());
		ddmStructureLinkImpl.setStructureId(getStructureId());

		ddmStructureLinkImpl.resetOriginalValues();

		return ddmStructureLinkImpl;
	}

	@Override
	public int compareTo(DDMStructureLink ddmStructureLink) {
		long primaryKey = ddmStructureLink.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DDMStructureLink)) {
			return false;
		}

		DDMStructureLink ddmStructureLink = (DDMStructureLink)obj;

		long primaryKey = ddmStructureLink.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		DDMStructureLinkModelImpl ddmStructureLinkModelImpl = this;

		ddmStructureLinkModelImpl._originalClassNameId = ddmStructureLinkModelImpl._classNameId;

		ddmStructureLinkModelImpl._setOriginalClassNameId = false;

		ddmStructureLinkModelImpl._originalClassPK = ddmStructureLinkModelImpl._classPK;

		ddmStructureLinkModelImpl._setOriginalClassPK = false;

		ddmStructureLinkModelImpl._originalStructureId = ddmStructureLinkModelImpl._structureId;

		ddmStructureLinkModelImpl._setOriginalStructureId = false;

		ddmStructureLinkModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<DDMStructureLink> toCacheModel() {
		DDMStructureLinkCacheModel ddmStructureLinkCacheModel = new DDMStructureLinkCacheModel();

		ddmStructureLinkCacheModel.structureLinkId = getStructureLinkId();

		ddmStructureLinkCacheModel.companyId = getCompanyId();

		ddmStructureLinkCacheModel.classNameId = getClassNameId();

		ddmStructureLinkCacheModel.classPK = getClassPK();

		ddmStructureLinkCacheModel.structureId = getStructureId();

		return ddmStructureLinkCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{structureLinkId=");
		sb.append(getStructureLinkId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", structureId=");
		sb.append(getStructureId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.dynamic.data.mapping.model.DDMStructureLink");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>structureLinkId</column-name><column-value><![CDATA[");
		sb.append(getStructureLinkId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>structureId</column-name><column-value><![CDATA[");
		sb.append(getStructureId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = DDMStructureLink.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			DDMStructureLink.class
		};
	private long _structureLinkId;
	private long _companyId;
	private long _classNameId;
	private long _originalClassNameId;
	private boolean _setOriginalClassNameId;
	private long _classPK;
	private long _originalClassPK;
	private boolean _setOriginalClassPK;
	private long _structureId;
	private long _originalStructureId;
	private boolean _setOriginalStructureId;
	private long _columnBitmask;
	private DDMStructureLink _escapedModel;
}