/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Description of report definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReportDefinition extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "id",
        "parentId",
        "category",
        "description",
        "dataSource",
        "isSeeded",
        "displayOrder",
        "timeCreated",
        "timeUpdated",
        "scimFilter",
        "columnInfo",
        "columnFilters",
        "columnSortings",
        "summary",
        "compartmentId",
        "lifecycleState",
        "schedule",
        "scheduledReportMimeType",
        "scheduledReportRowLimit",
        "scheduledReportName",
        "scheduledReportCompartmentId",
        "recordTimeSpan",
        "complianceStandards",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ReportDefinition(
            String displayName,
            String id,
            String parentId,
            Category category,
            String description,
            ReportDefinitionDataSource dataSource,
            Boolean isSeeded,
            Integer displayOrder,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String scimFilter,
            java.util.List<Column> columnInfo,
            java.util.List<ColumnFilter> columnFilters,
            java.util.List<ColumnSorting> columnSortings,
            java.util.List<Summary> summary,
            String compartmentId,
            ReportDefinitionLifecycleState lifecycleState,
            String schedule,
            ScheduledReportMimeType scheduledReportMimeType,
            Integer scheduledReportRowLimit,
            String scheduledReportName,
            String scheduledReportCompartmentId,
            String recordTimeSpan,
            java.util.List<String> complianceStandards,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.id = id;
        this.parentId = parentId;
        this.category = category;
        this.description = description;
        this.dataSource = dataSource;
        this.isSeeded = isSeeded;
        this.displayOrder = displayOrder;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.scimFilter = scimFilter;
        this.columnInfo = columnInfo;
        this.columnFilters = columnFilters;
        this.columnSortings = columnSortings;
        this.summary = summary;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.schedule = schedule;
        this.scheduledReportMimeType = scheduledReportMimeType;
        this.scheduledReportRowLimit = scheduledReportRowLimit;
        this.scheduledReportName = scheduledReportName;
        this.scheduledReportCompartmentId = scheduledReportCompartmentId;
        this.recordTimeSpan = recordTimeSpan;
        this.complianceStandards = complianceStandards;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the report definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the report definition.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the report definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the report definition.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the parent report definition. In the case of seeded report definition, this is same as definition OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * The OCID of the parent report definition. In the case of seeded report definition, this is same as definition OCID.
         * @param parentId the value to set
         * @return this builder
         **/
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /**
         * Specifies the name of the category that this report belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * Specifies the name of the category that this report belongs to.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * A description of the report definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the report definition.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Specifies the name of a resource that provides data for the report. For example alerts, events.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
        private ReportDefinitionDataSource dataSource;

        /**
         * Specifies the name of a resource that provides data for the report. For example alerts, events.
         * @param dataSource the value to set
         * @return this builder
         **/
        public Builder dataSource(ReportDefinitionDataSource dataSource) {
            this.dataSource = dataSource;
            this.__explicitlySet__.add("dataSource");
            return this;
        }
        /**
         * Signifies whether the definition is seeded or user defined. Values can either be 'true' or 'false'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
        private Boolean isSeeded;

        /**
         * Signifies whether the definition is seeded or user defined. Values can either be 'true' or 'false'.
         * @param isSeeded the value to set
         * @return this builder
         **/
        public Builder isSeeded(Boolean isSeeded) {
            this.isSeeded = isSeeded;
            this.__explicitlySet__.add("isSeeded");
            return this;
        }
        /**
         * Specifies how the report definitions are ordered in the display.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
        private Integer displayOrder;

        /**
         * Specifies how the report definitions are ordered in the display.
         * @param displayOrder the value to set
         * @return this builder
         **/
        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            this.__explicitlySet__.add("displayOrder");
            return this;
        }
        /**
         * Specifies the date and time the report definition was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Specifies the date and time the report definition was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the report definition was updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the report definition was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Additional SCIM filters used to define the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
        private String scimFilter;

        /**
         * Additional SCIM filters used to define the report.
         * @param scimFilter the value to set
         * @return this builder
         **/
        public Builder scimFilter(String scimFilter) {
            this.scimFilter = scimFilter;
            this.__explicitlySet__.add("scimFilter");
            return this;
        }
        /**
         * An array of column objects in the order (left to right) displayed in the report. A column object stores all information about a column, including the name displayed on the UI, corresponding field name in the data source, data type of the column, and column visibility (if the column is visible to the user).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnInfo")
        private java.util.List<Column> columnInfo;

        /**
         * An array of column objects in the order (left to right) displayed in the report. A column object stores all information about a column, including the name displayed on the UI, corresponding field name in the data source, data type of the column, and column visibility (if the column is visible to the user).
         * @param columnInfo the value to set
         * @return this builder
         **/
        public Builder columnInfo(java.util.List<Column> columnInfo) {
            this.columnInfo = columnInfo;
            this.__explicitlySet__.add("columnInfo");
            return this;
        }
        /**
         * An array of columnFilter objects. A columnFilter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
        private java.util.List<ColumnFilter> columnFilters;

        /**
         * An array of columnFilter objects. A columnFilter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
         * @param columnFilters the value to set
         * @return this builder
         **/
        public Builder columnFilters(java.util.List<ColumnFilter> columnFilters) {
            this.columnFilters = columnFilters;
            this.__explicitlySet__.add("columnFilters");
            return this;
        }
        /**
         * An array of column sorting objects. Each column sorting object stores the column name to be sorted and if the sorting is in ascending order; sorting is done by the first column in the array, then by the second column in the array, etc.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnSortings")
        private java.util.List<ColumnSorting> columnSortings;

        /**
         * An array of column sorting objects. Each column sorting object stores the column name to be sorted and if the sorting is in ascending order; sorting is done by the first column in the array, then by the second column in the array, etc.
         * @param columnSortings the value to set
         * @return this builder
         **/
        public Builder columnSortings(java.util.List<ColumnSorting> columnSortings) {
            this.columnSortings = columnSortings;
            this.__explicitlySet__.add("columnSortings");
            return this;
        }
        /**
         * An array of report summary objects in the order (left to right)  displayed in the report.  A  report summary object stores all information about summary of report to be displayed, including the name displayed on UI, the display order, corresponding group by and count of values, summary visibility (if the summary is visible to user).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private java.util.List<Summary> summary;

        /**
         * An array of report summary objects in the order (left to right)  displayed in the report.  A  report summary object stores all information about summary of report to be displayed, including the name displayed on UI, the display order, corresponding group by and count of values, summary visibility (if the summary is visible to user).
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(java.util.List<Summary> summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * The OCID of the compartment containing the report definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the report definition.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The current state of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ReportDefinitionLifecycleState lifecycleState;

        /**
         * The current state of the report.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ReportDefinitionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The schedule to generate the report periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * No constraint introduced when it is '*'. When not, day of week must equal the given value
         * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * The schedule to generate the report periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * No constraint introduced when it is '*'. When not, day of week must equal the given value
         * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         * @param schedule the value to set
         * @return this builder
         **/
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * Specifies the format of the report ( either .xls or .pdf or .json)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportMimeType")
        private ScheduledReportMimeType scheduledReportMimeType;

        /**
         * Specifies the format of the report ( either .xls or .pdf or .json)
         * @param scheduledReportMimeType the value to set
         * @return this builder
         **/
        public Builder scheduledReportMimeType(ScheduledReportMimeType scheduledReportMimeType) {
            this.scheduledReportMimeType = scheduledReportMimeType;
            this.__explicitlySet__.add("scheduledReportMimeType");
            return this;
        }
        /**
         * Specifies the limit on the number of rows in the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportRowLimit")
        private Integer scheduledReportRowLimit;

        /**
         * Specifies the limit on the number of rows in the report.
         * @param scheduledReportRowLimit the value to set
         * @return this builder
         **/
        public Builder scheduledReportRowLimit(Integer scheduledReportRowLimit) {
            this.scheduledReportRowLimit = scheduledReportRowLimit;
            this.__explicitlySet__.add("scheduledReportRowLimit");
            return this;
        }
        /**
         * The name of the report to be scheduled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportName")
        private String scheduledReportName;

        /**
         * The name of the report to be scheduled.
         * @param scheduledReportName the value to set
         * @return this builder
         **/
        public Builder scheduledReportName(String scheduledReportName) {
            this.scheduledReportName = scheduledReportName;
            this.__explicitlySet__.add("scheduledReportName");
            return this;
        }
        /**
         * The OCID of the compartment in which the scheduled resource will be created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportCompartmentId")
        private String scheduledReportCompartmentId;

        /**
         * The OCID of the compartment in which the scheduled resource will be created.
         *
         * @param scheduledReportCompartmentId the value to set
         * @return this builder
         **/
        public Builder scheduledReportCompartmentId(String scheduledReportCompartmentId) {
            this.scheduledReportCompartmentId = scheduledReportCompartmentId;
            this.__explicitlySet__.add("scheduledReportCompartmentId");
            return this;
        }
        /**
         * The time span for the records in the report to be scheduled.
         * <period-value><period>
         * Allowed period strings - "H","D","M","Y"
         * Each of the above fields potentially introduce constraints. A workRequest is created only
         * when period-value satisfies all the constraints. Constraints introduced:
         * 1. period = H (The allowed range for period-value is [1, 23])
         * 2. period = D (The allowed range for period-value is [1, 30])
         * 3. period = M (The allowed range for period-value is [1, 11])
         * 4. period = Y (The minimum period-value is 1)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recordTimeSpan")
        private String recordTimeSpan;

        /**
         * The time span for the records in the report to be scheduled.
         * <period-value><period>
         * Allowed period strings - "H","D","M","Y"
         * Each of the above fields potentially introduce constraints. A workRequest is created only
         * when period-value satisfies all the constraints. Constraints introduced:
         * 1. period = H (The allowed range for period-value is [1, 23])
         * 2. period = D (The allowed range for period-value is [1, 30])
         * 3. period = M (The allowed range for period-value is [1, 11])
         * 4. period = Y (The minimum period-value is 1)
         *
         * @param recordTimeSpan the value to set
         * @return this builder
         **/
        public Builder recordTimeSpan(String recordTimeSpan) {
            this.recordTimeSpan = recordTimeSpan;
            this.__explicitlySet__.add("recordTimeSpan");
            return this;
        }
        /**
         * The list of the data protection regulations/standards used in the report that will help demonstrate compliance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceStandards")
        private java.util.List<String> complianceStandards;

        /**
         * The list of the data protection regulations/standards used in the report that will help demonstrate compliance.
         * @param complianceStandards the value to set
         * @return this builder
         **/
        public Builder complianceStandards(java.util.List<String> complianceStandards) {
            this.complianceStandards = complianceStandards;
            this.__explicitlySet__.add("complianceStandards");
            return this;
        }
        /**
         * Details about the current state of the report definition in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the report definition in Data Safe.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportDefinition build() {
            ReportDefinition model =
                    new ReportDefinition(
                            this.displayName,
                            this.id,
                            this.parentId,
                            this.category,
                            this.description,
                            this.dataSource,
                            this.isSeeded,
                            this.displayOrder,
                            this.timeCreated,
                            this.timeUpdated,
                            this.scimFilter,
                            this.columnInfo,
                            this.columnFilters,
                            this.columnSortings,
                            this.summary,
                            this.compartmentId,
                            this.lifecycleState,
                            this.schedule,
                            this.scheduledReportMimeType,
                            this.scheduledReportRowLimit,
                            this.scheduledReportName,
                            this.scheduledReportCompartmentId,
                            this.recordTimeSpan,
                            this.complianceStandards,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportDefinition model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dataSource")) {
                this.dataSource(model.getDataSource());
            }
            if (model.wasPropertyExplicitlySet("isSeeded")) {
                this.isSeeded(model.getIsSeeded());
            }
            if (model.wasPropertyExplicitlySet("displayOrder")) {
                this.displayOrder(model.getDisplayOrder());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("scimFilter")) {
                this.scimFilter(model.getScimFilter());
            }
            if (model.wasPropertyExplicitlySet("columnInfo")) {
                this.columnInfo(model.getColumnInfo());
            }
            if (model.wasPropertyExplicitlySet("columnFilters")) {
                this.columnFilters(model.getColumnFilters());
            }
            if (model.wasPropertyExplicitlySet("columnSortings")) {
                this.columnSortings(model.getColumnSortings());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("scheduledReportMimeType")) {
                this.scheduledReportMimeType(model.getScheduledReportMimeType());
            }
            if (model.wasPropertyExplicitlySet("scheduledReportRowLimit")) {
                this.scheduledReportRowLimit(model.getScheduledReportRowLimit());
            }
            if (model.wasPropertyExplicitlySet("scheduledReportName")) {
                this.scheduledReportName(model.getScheduledReportName());
            }
            if (model.wasPropertyExplicitlySet("scheduledReportCompartmentId")) {
                this.scheduledReportCompartmentId(model.getScheduledReportCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("recordTimeSpan")) {
                this.recordTimeSpan(model.getRecordTimeSpan());
            }
            if (model.wasPropertyExplicitlySet("complianceStandards")) {
                this.complianceStandards(model.getComplianceStandards());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the report definition.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the report definition.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the parent report definition. In the case of seeded report definition, this is same as definition OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * The OCID of the parent report definition. In the case of seeded report definition, this is same as definition OCID.
     * @return the value
     **/
    public String getParentId() {
        return parentId;
    }

    /**
     * Specifies the name of the category that this report belongs to.
     **/
    public enum Category {
        CustomReports("CUSTOM_REPORTS"),
        Summary("SUMMARY"),
        ActivityAuditing("ACTIVITY_AUDITING"),
        FirewallViolations("FIREWALL_VIOLATIONS"),
        AllowedSql("ALLOWED_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the name of the category that this report belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * Specifies the name of the category that this report belongs to.
     * @return the value
     **/
    public Category getCategory() {
        return category;
    }

    /**
     * A description of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the report definition.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Specifies the name of a resource that provides data for the report. For example alerts, events.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    private final ReportDefinitionDataSource dataSource;

    /**
     * Specifies the name of a resource that provides data for the report. For example alerts, events.
     * @return the value
     **/
    public ReportDefinitionDataSource getDataSource() {
        return dataSource;
    }

    /**
     * Signifies whether the definition is seeded or user defined. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
    private final Boolean isSeeded;

    /**
     * Signifies whether the definition is seeded or user defined. Values can either be 'true' or 'false'.
     * @return the value
     **/
    public Boolean getIsSeeded() {
        return isSeeded;
    }

    /**
     * Specifies how the report definitions are ordered in the display.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    private final Integer displayOrder;

    /**
     * Specifies how the report definitions are ordered in the display.
     * @return the value
     **/
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Specifies the date and time the report definition was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Specifies the date and time the report definition was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the report definition was updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the report definition was updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Additional SCIM filters used to define the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
    private final String scimFilter;

    /**
     * Additional SCIM filters used to define the report.
     * @return the value
     **/
    public String getScimFilter() {
        return scimFilter;
    }

    /**
     * An array of column objects in the order (left to right) displayed in the report. A column object stores all information about a column, including the name displayed on the UI, corresponding field name in the data source, data type of the column, and column visibility (if the column is visible to the user).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnInfo")
    private final java.util.List<Column> columnInfo;

    /**
     * An array of column objects in the order (left to right) displayed in the report. A column object stores all information about a column, including the name displayed on the UI, corresponding field name in the data source, data type of the column, and column visibility (if the column is visible to the user).
     * @return the value
     **/
    public java.util.List<Column> getColumnInfo() {
        return columnInfo;
    }

    /**
     * An array of columnFilter objects. A columnFilter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
    private final java.util.List<ColumnFilter> columnFilters;

    /**
     * An array of columnFilter objects. A columnFilter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
     * @return the value
     **/
    public java.util.List<ColumnFilter> getColumnFilters() {
        return columnFilters;
    }

    /**
     * An array of column sorting objects. Each column sorting object stores the column name to be sorted and if the sorting is in ascending order; sorting is done by the first column in the array, then by the second column in the array, etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnSortings")
    private final java.util.List<ColumnSorting> columnSortings;

    /**
     * An array of column sorting objects. Each column sorting object stores the column name to be sorted and if the sorting is in ascending order; sorting is done by the first column in the array, then by the second column in the array, etc.
     * @return the value
     **/
    public java.util.List<ColumnSorting> getColumnSortings() {
        return columnSortings;
    }

    /**
     * An array of report summary objects in the order (left to right)  displayed in the report.  A  report summary object stores all information about summary of report to be displayed, including the name displayed on UI, the display order, corresponding group by and count of values, summary visibility (if the summary is visible to user).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final java.util.List<Summary> summary;

    /**
     * An array of report summary objects in the order (left to right)  displayed in the report.  A  report summary object stores all information about summary of report to be displayed, including the name displayed on UI, the display order, corresponding group by and count of values, summary visibility (if the summary is visible to user).
     * @return the value
     **/
    public java.util.List<Summary> getSummary() {
        return summary;
    }

    /**
     * The OCID of the compartment containing the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the report definition.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current state of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ReportDefinitionLifecycleState lifecycleState;

    /**
     * The current state of the report.
     * @return the value
     **/
    public ReportDefinitionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The schedule to generate the report periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * No constraint introduced when it is '*'. When not, day of week must equal the given value
     * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * The schedule to generate the report periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * No constraint introduced when it is '*'. When not, day of week must equal the given value
     * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     **/
    public String getSchedule() {
        return schedule;
    }

    /**
     * Specifies the format of the report ( either .xls or .pdf or .json)
     **/
    public enum ScheduledReportMimeType {
        Pdf("PDF"),
        Xls("XLS"),
        Json("JSON"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScheduledReportMimeType.class);

        private final String value;
        private static java.util.Map<String, ScheduledReportMimeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScheduledReportMimeType v : ScheduledReportMimeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScheduledReportMimeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScheduledReportMimeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScheduledReportMimeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the format of the report ( either .xls or .pdf or .json)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportMimeType")
    private final ScheduledReportMimeType scheduledReportMimeType;

    /**
     * Specifies the format of the report ( either .xls or .pdf or .json)
     * @return the value
     **/
    public ScheduledReportMimeType getScheduledReportMimeType() {
        return scheduledReportMimeType;
    }

    /**
     * Specifies the limit on the number of rows in the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportRowLimit")
    private final Integer scheduledReportRowLimit;

    /**
     * Specifies the limit on the number of rows in the report.
     * @return the value
     **/
    public Integer getScheduledReportRowLimit() {
        return scheduledReportRowLimit;
    }

    /**
     * The name of the report to be scheduled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportName")
    private final String scheduledReportName;

    /**
     * The name of the report to be scheduled.
     * @return the value
     **/
    public String getScheduledReportName() {
        return scheduledReportName;
    }

    /**
     * The OCID of the compartment in which the scheduled resource will be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledReportCompartmentId")
    private final String scheduledReportCompartmentId;

    /**
     * The OCID of the compartment in which the scheduled resource will be created.
     *
     * @return the value
     **/
    public String getScheduledReportCompartmentId() {
        return scheduledReportCompartmentId;
    }

    /**
     * The time span for the records in the report to be scheduled.
     * <period-value><period>
     * Allowed period strings - "H","D","M","Y"
     * Each of the above fields potentially introduce constraints. A workRequest is created only
     * when period-value satisfies all the constraints. Constraints introduced:
     * 1. period = H (The allowed range for period-value is [1, 23])
     * 2. period = D (The allowed range for period-value is [1, 30])
     * 3. period = M (The allowed range for period-value is [1, 11])
     * 4. period = Y (The minimum period-value is 1)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordTimeSpan")
    private final String recordTimeSpan;

    /**
     * The time span for the records in the report to be scheduled.
     * <period-value><period>
     * Allowed period strings - "H","D","M","Y"
     * Each of the above fields potentially introduce constraints. A workRequest is created only
     * when period-value satisfies all the constraints. Constraints introduced:
     * 1. period = H (The allowed range for period-value is [1, 23])
     * 2. period = D (The allowed range for period-value is [1, 30])
     * 3. period = M (The allowed range for period-value is [1, 11])
     * 4. period = Y (The minimum period-value is 1)
     *
     * @return the value
     **/
    public String getRecordTimeSpan() {
        return recordTimeSpan;
    }

    /**
     * The list of the data protection regulations/standards used in the report that will help demonstrate compliance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceStandards")
    private final java.util.List<String> complianceStandards;

    /**
     * The list of the data protection regulations/standards used in the report that will help demonstrate compliance.
     * @return the value
     **/
    public java.util.List<String> getComplianceStandards() {
        return complianceStandards;
    }

    /**
     * Details about the current state of the report definition in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the report definition in Data Safe.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ReportDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataSource=").append(String.valueOf(this.dataSource));
        sb.append(", isSeeded=").append(String.valueOf(this.isSeeded));
        sb.append(", displayOrder=").append(String.valueOf(this.displayOrder));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", scimFilter=").append(String.valueOf(this.scimFilter));
        sb.append(", columnInfo=").append(String.valueOf(this.columnInfo));
        sb.append(", columnFilters=").append(String.valueOf(this.columnFilters));
        sb.append(", columnSortings=").append(String.valueOf(this.columnSortings));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", scheduledReportMimeType=")
                .append(String.valueOf(this.scheduledReportMimeType));
        sb.append(", scheduledReportRowLimit=")
                .append(String.valueOf(this.scheduledReportRowLimit));
        sb.append(", scheduledReportName=").append(String.valueOf(this.scheduledReportName));
        sb.append(", scheduledReportCompartmentId=")
                .append(String.valueOf(this.scheduledReportCompartmentId));
        sb.append(", recordTimeSpan=").append(String.valueOf(this.recordTimeSpan));
        sb.append(", complianceStandards=").append(String.valueOf(this.complianceStandards));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportDefinition)) {
            return false;
        }

        ReportDefinition other = (ReportDefinition) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dataSource, other.dataSource)
                && java.util.Objects.equals(this.isSeeded, other.isSeeded)
                && java.util.Objects.equals(this.displayOrder, other.displayOrder)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.scimFilter, other.scimFilter)
                && java.util.Objects.equals(this.columnInfo, other.columnInfo)
                && java.util.Objects.equals(this.columnFilters, other.columnFilters)
                && java.util.Objects.equals(this.columnSortings, other.columnSortings)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(
                        this.scheduledReportMimeType, other.scheduledReportMimeType)
                && java.util.Objects.equals(
                        this.scheduledReportRowLimit, other.scheduledReportRowLimit)
                && java.util.Objects.equals(this.scheduledReportName, other.scheduledReportName)
                && java.util.Objects.equals(
                        this.scheduledReportCompartmentId, other.scheduledReportCompartmentId)
                && java.util.Objects.equals(this.recordTimeSpan, other.recordTimeSpan)
                && java.util.Objects.equals(this.complianceStandards, other.complianceStandards)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dataSource == null ? 43 : this.dataSource.hashCode());
        result = (result * PRIME) + (this.isSeeded == null ? 43 : this.isSeeded.hashCode());
        result = (result * PRIME) + (this.displayOrder == null ? 43 : this.displayOrder.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.scimFilter == null ? 43 : this.scimFilter.hashCode());
        result = (result * PRIME) + (this.columnInfo == null ? 43 : this.columnInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.columnFilters == null ? 43 : this.columnFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.columnSortings == null ? 43 : this.columnSortings.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledReportMimeType == null
                                ? 43
                                : this.scheduledReportMimeType.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledReportRowLimit == null
                                ? 43
                                : this.scheduledReportRowLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledReportName == null
                                ? 43
                                : this.scheduledReportName.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledReportCompartmentId == null
                                ? 43
                                : this.scheduledReportCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.recordTimeSpan == null ? 43 : this.recordTimeSpan.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceStandards == null
                                ? 43
                                : this.complianceStandards.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
