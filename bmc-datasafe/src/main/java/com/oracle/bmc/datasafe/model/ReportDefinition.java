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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReportDefinition {
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
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the parent report definition. In the case of seeded report definition, this is same as definition OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

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

    public Category getCategory() {
        return category;
    }

    /**
     * A description of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Specifies the name of a resource that provides data for the report. For example alerts, events.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    private final ReportDefinitionDataSource dataSource;

    public ReportDefinitionDataSource getDataSource() {
        return dataSource;
    }

    /**
     * Signifies whether the definition is seeded or user defined. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
    private final Boolean isSeeded;

    public Boolean getIsSeeded() {
        return isSeeded;
    }

    /**
     * Specifies how the report definitions are ordered in the display.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    private final Integer displayOrder;

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Specifies the time at which the report definition was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time of the report definition update in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Additional scim filters used to specialize the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
    private final String scimFilter;

    public String getScimFilter() {
        return scimFilter;
    }

    /**
     * An array of column objects in the order (left to right) displayed in the report. A column object stores all information about a column, including the name displayed on the UI, corresponding field name in the data source, data type of the column, and column visibility (if the column is visible to the user).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnInfo")
    private final java.util.List<Column> columnInfo;

    public java.util.List<Column> getColumnInfo() {
        return columnInfo;
    }

    /**
     * An array of column filter objects. A column Filter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
    private final java.util.List<ColumnFilter> columnFilters;

    public java.util.List<ColumnFilter> getColumnFilters() {
        return columnFilters;
    }

    /**
     * An array of column sorting objects. Each column sorting object stores the column name to be sorted and if the sorting is in ascending order; sorting is done by the first column in the array, then by the second column in the array, etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnSortings")
    private final java.util.List<ColumnSorting> columnSortings;

    public java.util.List<ColumnSorting> getColumnSortings() {
        return columnSortings;
    }

    /**
     * An array of report summary objects in the order (left to right)  displayed in the report.  A  report summary object stores all information about summary of report to be displayed, including the name displayed on UI, the display order, corresponding group by and count of values, summary visibility (if the summary is visible to user).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final java.util.List<Summary> summary;

    public java.util.List<Summary> getSummary() {
        return summary;
    }

    /**
     * The OCID of the compartment containing the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current state of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ReportDefinitionLifecycleState lifecycleState;

    public ReportDefinitionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

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

    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ReportDefinition(");
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
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
