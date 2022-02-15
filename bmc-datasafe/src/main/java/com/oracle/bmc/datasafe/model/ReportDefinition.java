/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReportDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
        private ReportDefinitionDataSource dataSource;

        public Builder dataSource(ReportDefinitionDataSource dataSource) {
            this.dataSource = dataSource;
            this.__explicitlySet__.add("dataSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
        private Boolean isSeeded;

        public Builder isSeeded(Boolean isSeeded) {
            this.isSeeded = isSeeded;
            this.__explicitlySet__.add("isSeeded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
        private Integer displayOrder;

        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            this.__explicitlySet__.add("displayOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
        private String scimFilter;

        public Builder scimFilter(String scimFilter) {
            this.scimFilter = scimFilter;
            this.__explicitlySet__.add("scimFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnInfo")
        private java.util.List<Column> columnInfo;

        public Builder columnInfo(java.util.List<Column> columnInfo) {
            this.columnInfo = columnInfo;
            this.__explicitlySet__.add("columnInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
        private java.util.List<ColumnFilter> columnFilters;

        public Builder columnFilters(java.util.List<ColumnFilter> columnFilters) {
            this.columnFilters = columnFilters;
            this.__explicitlySet__.add("columnFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnSortings")
        private java.util.List<ColumnSorting> columnSortings;

        public Builder columnSortings(java.util.List<ColumnSorting> columnSortings) {
            this.columnSortings = columnSortings;
            this.__explicitlySet__.add("columnSortings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private java.util.List<Summary> summary;

        public Builder summary(java.util.List<Summary> summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ReportDefinitionLifecycleState lifecycleState;

        public Builder lifecycleState(ReportDefinitionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportDefinition build() {
            ReportDefinition __instance__ =
                    new ReportDefinition(
                            displayName,
                            id,
                            parentId,
                            category,
                            description,
                            dataSource,
                            isSeeded,
                            displayOrder,
                            timeCreated,
                            timeUpdated,
                            scimFilter,
                            columnInfo,
                            columnFilters,
                            columnSortings,
                            summary,
                            compartmentId,
                            lifecycleState,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportDefinition o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .id(o.getId())
                            .parentId(o.getParentId())
                            .category(o.getCategory())
                            .description(o.getDescription())
                            .dataSource(o.getDataSource())
                            .isSeeded(o.getIsSeeded())
                            .displayOrder(o.getDisplayOrder())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .scimFilter(o.getScimFilter())
                            .columnInfo(o.getColumnInfo())
                            .columnFilters(o.getColumnFilters())
                            .columnSortings(o.getColumnSortings())
                            .summary(o.getSummary())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the parent report definition. In the case of seeded report definition, this is same as definition OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    String parentId;
    /**
     * Specifies the name of the category that this report belongs to.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Category {
        CustomReports("CUSTOM_REPORTS"),
        Summary("SUMMARY"),
        ActivityAuditing("ACTIVITY_AUDITING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Category category;

    /**
     * A description of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Specifies the name of a resource that provides data for the report. For example alerts, events.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    ReportDefinitionDataSource dataSource;

    /**
     * Signifies whether the definition is seeded or user defined. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
    Boolean isSeeded;

    /**
     * Specifies how the report definitions are ordered in the display.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    Integer displayOrder;

    /**
     * Specifies the time at which the report definition was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time of the report definition update in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Additional scim filters used to specialize the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
    String scimFilter;

    /**
     * An array of column objects in the order (left to right) displayed in the report. A column object stores all information about a column, including the name displayed on the UI, corresponding field name in the data source, data type of the column, and column visibility (if the column is visible to the user).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnInfo")
    java.util.List<Column> columnInfo;

    /**
     * An array of column filter objects. A column Filter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
    java.util.List<ColumnFilter> columnFilters;

    /**
     * An array of column sorting objects. Each column sorting object stores the column name to be sorted and if the sorting is in ascending order; sorting is done by the first column in the array, then by the second column in the array, etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnSortings")
    java.util.List<ColumnSorting> columnSortings;

    /**
     * An array of report summary objects in the order (left to right)  displayed in the report.  A  report summary object stores all information about summary of report to be displayed, including the name displayed on UI, the display order, corresponding group by and count of values, summary visibility (if the summary is visible to user).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    java.util.List<Summary> summary;

    /**
     * The OCID of the compartment containing the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The current state of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    ReportDefinitionLifecycleState lifecycleState;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
