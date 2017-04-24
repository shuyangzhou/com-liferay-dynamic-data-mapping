// This file was automatically generated from form.soy.
// Please don't edit this file by hand.

/**
 * @fileoverview Templates in namespace ddm.
 * @hassoydeltemplate {ddm.field}
 * @hassoydelcall {ddm.field}
 * @public
 */

if (typeof ddm == 'undefined') { var ddm = {}; }


ddm.__deltemplate_s2_86478705 = function(opt_data, opt_ignored) {
  return '';
};
if (goog.DEBUG) {
  ddm.__deltemplate_s2_86478705.soyTemplateName = 'ddm.__deltemplate_s2_86478705';
}
soy.$$registerDelegateFn(soy.$$getDelTemplateId('ddm.field'), '', 0, ddm.__deltemplate_s2_86478705);


ddm.fields = function(opt_data, opt_ignored) {
  var output = '';
  var fieldList12 = opt_data.fields;
  var fieldListLen12 = fieldList12.length;
  for (var fieldIndex12 = 0; fieldIndex12 < fieldListLen12; fieldIndex12++) {
    var fieldData12 = fieldList12[fieldIndex12];
    var variant__soy4 = fieldData12.type;
    output += '<div class="clearfix ' + ((! fieldData12.visible) ? 'hide' : '') + ' lfr-ddm-form-field-container">' + soy.$$getDelegateFn(soy.$$getDelTemplateId('ddm.field'), variant__soy4, true)(fieldData12) + '</div>';
  }
  return output;
};
if (goog.DEBUG) {
  ddm.fields.soyTemplateName = 'ddm.fields';
}


ddm.form_renderer_js = function(opt_data, opt_ignored) {
  return '<script type="text/javascript">AUI().use( \'liferay-ddm-form-renderer\', \'liferay-ddm-form-renderer-field\', function(A) {Liferay.DDM.Renderer.FieldTypes.register(' + soy.$$filterNoAutoescape(opt_data.fieldTypes) + '); Liferay.component( \'' + soy.$$escapeJsString(opt_data.containerId) + 'DDMForm\', new Liferay.DDM.Renderer.Form({container: \'#' + soy.$$escapeJsString(opt_data.containerId) + '\', context: ' + soy.$$filterNoAutoescape(opt_data.context) + ', definition: ' + soy.$$filterNoAutoescape(opt_data.definition) + ', evaluatorURL: \'' + soy.$$escapeJsString(opt_data.evaluatorURL) + '\', layout: ' + soy.$$filterNoAutoescape(opt_data.layout) + ', portletNamespace: \'' + soy.$$escapeJsString(opt_data.portletNamespace) + '\', readOnly: ' + soy.$$escapeJsValue(opt_data.readOnly) + '}).render() ); var destroyFormHandle = function(event) {var form = Liferay.component(\'' + soy.$$escapeJsString(opt_data.containerId) + 'DDMForm\'); var portlet = event.portlet; if (portlet && portlet.contains(form.get(\'container\'))) {form.destroy(); Liferay.detach(\'destroyPortlet\', destroyFormHandle);}}; Liferay.on(\'destroyPortlet\', destroyFormHandle);});<\/script>';
};
if (goog.DEBUG) {
  ddm.form_renderer_js.soyTemplateName = 'ddm.form_renderer_js';
}


ddm.form_rows = function(opt_data, opt_ignored) {
  var output = '';
  var rowList45 = opt_data.rows;
  var rowListLen45 = rowList45.length;
  for (var rowIndex45 = 0; rowIndex45 < rowListLen45; rowIndex45++) {
    var rowData45 = rowList45[rowIndex45];
    output += '<div class="row">' + ddm.form_row_columns(soy.$$augmentMap(opt_data, {columns: rowData45.columns})) + '</div>';
  }
  return output;
};
if (goog.DEBUG) {
  ddm.form_rows.soyTemplateName = 'ddm.form_rows';
}


ddm.form_row_column = function(opt_data, opt_ignored) {
  return '<div class="col-md-' + soy.$$escapeHtmlAttribute(opt_data.column.size) + '">' + ddm.fields(soy.$$augmentMap(opt_data, {fields: opt_data.column.fields})) + '</div>';
};
if (goog.DEBUG) {
  ddm.form_row_column.soyTemplateName = 'ddm.form_row_column';
}


ddm.form_row_columns = function(opt_data, opt_ignored) {
  var output = '';
  var columnList57 = opt_data.columns;
  var columnListLen57 = columnList57.length;
  for (var columnIndex57 = 0; columnIndex57 < columnListLen57; columnIndex57++) {
    var columnData57 = columnList57[columnIndex57];
    output += ddm.form_row_column(soy.$$augmentMap(opt_data, {column: columnData57}));
  }
  return output;
};
if (goog.DEBUG) {
  ddm.form_row_columns.soyTemplateName = 'ddm.form_row_columns';
}


ddm.required_warning_message = function(opt_data, opt_ignored) {
  return '' + ((opt_data.showRequiredFieldsWarning) ? soy.$$filterNoAutoescape(opt_data.requiredFieldsWarningMessageHTML) : '');
};
if (goog.DEBUG) {
  ddm.required_warning_message.soyTemplateName = 'ddm.required_warning_message';
}


ddm.wizard_form = function(opt_data, opt_ignored) {
  var output = '<div class="lfr-ddm-form-container" id="' + soy.$$escapeHtmlAttribute(opt_data.containerId) + '"><div class="lfr-ddm-form-content">';
  if (opt_data.pages.length > 1) {
    output += '<div class="lfr-ddm-form-wizard"><ul class="multi-step-progress-bar">';
    var pageList81 = opt_data.pages;
    var pageListLen81 = pageList81.length;
    for (var pageIndex81 = 0; pageIndex81 < pageListLen81; pageIndex81++) {
      var pageData81 = pageList81[pageIndex81];
      output += '<li ' + ((pageIndex81 == 0) ? 'class="active"' : '') + '><div class="progress-bar-title">' + soy.$$filterNoAutoescape(pageData81.title) + '</div><div class="divider"></div><div class="progress-bar-step">' + soy.$$escapeHtml(pageIndex81 + 1) + '</div></li>';
    }
    output += '</ul></div>';
  }
  output += '<div class="lfr-ddm-form-pages">';
  var pageList108 = opt_data.pages;
  var pageListLen108 = pageList108.length;
  for (var pageIndex108 = 0; pageIndex108 < pageListLen108; pageIndex108++) {
    var pageData108 = pageList108[pageIndex108];
    output += '<div class="' + ((pageIndex108 == 0) ? 'active' : '') + ' lfr-ddm-form-page">' + ((pageData108.title) ? '<h3 class="lfr-ddm-form-page-title">' + soy.$$filterNoAutoescape(pageData108.title) + '</h3>' : '') + ((pageData108.description) ? '<h4 class="lfr-ddm-form-page-description">' + soy.$$filterNoAutoescape(pageData108.description) + '</h4>' : '') + ddm.required_warning_message(soy.$$augmentMap(opt_data, {showRequiredFieldsWarning: pageData108.showRequiredFieldsWarning, requiredFieldsWarningMessageHTML: opt_data.requiredFieldsWarningMessageHTML})) + ddm.form_rows(soy.$$augmentMap(opt_data, {rows: pageData108.rows})) + '</div>';
  }
  output += '</div></div><div class="lfr-ddm-form-pagination-controls"><button class="btn btn-lg btn-primary hide lfr-ddm-form-pagination-prev" type="button"><i class="icon-angle-left"></i> ' + soy.$$escapeHtml(opt_data.strings.previous) + '</button><button class="btn btn-lg btn-primary' + ((opt_data.pages.length == 1) ? ' hide' : '') + ' lfr-ddm-form-pagination-next pull-right" type="button">' + soy.$$escapeHtml(opt_data.strings.next) + ' <i class="icon-angle-right"></i></button>' + ((opt_data.showSubmitButton) ? '<button class="btn btn-lg btn-primary' + ((opt_data.pages.length > 1) ? ' hide' : '') + ' lfr-ddm-form-submit pull-right" disabled type="submit">' + soy.$$escapeHtml(opt_data.submitLabel) + '</button>' : '') + '</div></div>';
  return output;
};
if (goog.DEBUG) {
  ddm.wizard_form.soyTemplateName = 'ddm.wizard_form';
}


ddm.paginated_form = function(opt_data, opt_ignored) {
  var output = '<div class="lfr-ddm-form-container" id="' + soy.$$escapeHtmlAttribute(opt_data.containerId) + '"><div class="lfr-ddm-form-content"><div class="lfr-ddm-form-pages">';
  var pageList156 = opt_data.pages;
  var pageListLen156 = pageList156.length;
  for (var pageIndex156 = 0; pageIndex156 < pageListLen156; pageIndex156++) {
    var pageData156 = pageList156[pageIndex156];
    output += '<div class="' + ((pageIndex156 == 0) ? 'active' : '') + ' lfr-ddm-form-page">' + ((pageData156.title) ? '<h3 class="lfr-ddm-form-page-title">' + soy.$$filterNoAutoescape(pageData156.title) + '</h3>' : '') + ((pageData156.description) ? '<h4 class="lfr-ddm-form-page-description">' + soy.$$filterNoAutoescape(pageData156.description) + '</h4>' : '') + ddm.required_warning_message(soy.$$augmentMap(opt_data, {showRequiredFieldsWarning: pageData156.showRequiredFieldsWarning, requiredFieldsWarningMessageHTML: opt_data.requiredFieldsWarningMessageHTML})) + ddm.form_rows(soy.$$augmentMap(opt_data, {rows: pageData156.rows})) + '</div>';
  }
  output += '</div>';
  if (opt_data.pages.length > 1) {
    output += '<div class="lfr-ddm-form-paginated"><ul class="pagination pagination-content">';
    var pageList169 = opt_data.pages;
    var pageListLen169 = pageList169.length;
    for (var pageIndex169 = 0; pageIndex169 < pageListLen169; pageIndex169++) {
      var pageData169 = pageList169[pageIndex169];
      output += '<li ' + ((pageIndex169 == 0) ? 'class="active"' : '') + '><a href="#">' + soy.$$escapeHtml(pageIndex169 + 1) + '</a></li>';
    }
    output += '</ul></div>';
  }
  output += '</div><div class="lfr-ddm-form-pagination-controls"><button class="btn btn-lg btn-primary hide lfr-ddm-form-pagination-prev" type="button"><i class="icon-angle-left"></i> ' + soy.$$escapeHtml(opt_data.strings.previous) + '</button><button class="btn btn-lg btn-primary' + ((opt_data.pages.length == 1) ? ' hide' : '') + ' lfr-ddm-form-pagination-next pull-right" type="button">' + soy.$$escapeHtml(opt_data.strings.next) + ' <i class="icon-angle-right"></i></button>' + ((opt_data.showSubmitButton) ? '<button class="btn btn-lg btn-primary' + ((opt_data.pages.length > 1) ? ' hide' : '') + ' lfr-ddm-form-submit pull-right" disabled type="submit">' + soy.$$escapeHtml(opt_data.submitLabel) + '</button>' : '') + '</div></div>';
  return output;
};
if (goog.DEBUG) {
  ddm.paginated_form.soyTemplateName = 'ddm.paginated_form';
}


ddm.simple_form = function(opt_data, opt_ignored) {
  var output = '<div class="lfr-ddm-form-container" id="' + soy.$$escapeHtmlAttribute(opt_data.containerId) + '"><div class="lfr-ddm-form-fields">';
  var pageList200 = opt_data.pages;
  var pageListLen200 = pageList200.length;
  for (var pageIndex200 = 0; pageIndex200 < pageListLen200; pageIndex200++) {
    var pageData200 = pageList200[pageIndex200];
    output += ddm.required_warning_message(soy.$$augmentMap(opt_data, {showRequiredFieldsWarning: pageData200.showRequiredFieldsWarning, requiredFieldsWarningMessageHTML: opt_data.requiredFieldsWarningMessageHTML})) + ddm.form_rows(soy.$$augmentMap(opt_data, {rows: pageData200.rows}));
  }
  output += '</div></div>';
  return output;
};
if (goog.DEBUG) {
  ddm.simple_form.soyTemplateName = 'ddm.simple_form';
}


ddm.tabbed_form = function(opt_data, opt_ignored) {
  var output = '<div class="lfr-ddm-form-container" id="' + soy.$$escapeHtmlAttribute(opt_data.containerId) + '"><div class="lfr-ddm-form-tabs"><ul class="nav navbar-nav">';
  var pageList210 = opt_data.pages;
  var pageListLen210 = pageList210.length;
  for (var pageIndex210 = 0; pageIndex210 < pageListLen210; pageIndex210++) {
    var pageData210 = pageList210[pageIndex210];
    output += '<li><a href="javascript:;">' + soy.$$escapeHtml(pageData210.title) + '</a></li>';
  }
  output += '</ul><div class="tab-content">';
  var pageList224 = opt_data.pages;
  var pageListLen224 = pageList224.length;
  for (var pageIndex224 = 0; pageIndex224 < pageListLen224; pageIndex224++) {
    var pageData224 = pageList224[pageIndex224];
    output += '<div class="lfr-ddm-form-page tab-pane ' + ((pageIndex224 == 0) ? 'active' : '') + '">' + ddm.required_warning_message(soy.$$augmentMap(opt_data, {showRequiredFieldsWarning: pageData224.showRequiredFieldsWarning, requiredFieldsWarningMessageHTML: opt_data.requiredFieldsWarningMessageHTML})) + ddm.form_rows(soy.$$augmentMap(opt_data, {rows: pageData224.rows})) + '</div>';
  }
  output += '</div></div></div>';
  return output;
};
if (goog.DEBUG) {
  ddm.tabbed_form.soyTemplateName = 'ddm.tabbed_form';
}


ddm.tabbed_form_frame = function(opt_data, opt_ignored) {
  opt_data = opt_data || {};
  return '<div class="lfr-ddm-form-page tab-pane ' + ((opt_data.active) ? 'active' : '') + '"></div>';
};
if (goog.DEBUG) {
  ddm.tabbed_form_frame.soyTemplateName = 'ddm.tabbed_form_frame';
}


ddm.settings_form = function(opt_data, opt_ignored) {
  var output = '<div class="lfr-ddm-form-container" id="' + soy.$$escapeHtmlAttribute(opt_data.containerId) + '"><div class="lfr-ddm-settings-form">';
  var pageList248 = opt_data.pages;
  var pageListLen248 = pageList248.length;
  for (var pageIndex248 = 0; pageIndex248 < pageListLen248; pageIndex248++) {
    var pageData248 = pageList248[pageIndex248];
    output += '<div class="lfr-ddm-form-page' + ((pageIndex248 == 0) ? ' active basic' : '') + ((pageIndex248 == pageListLen248 - 1) ? ' advanced' : '') + '">' + ddm.form_rows(soy.$$augmentMap(opt_data, {rows: pageData248.rows})) + '</div>';
  }
  output += '</div></div>';
  return output;
};
if (goog.DEBUG) {
  ddm.settings_form.soyTemplateName = 'ddm.settings_form';
}
