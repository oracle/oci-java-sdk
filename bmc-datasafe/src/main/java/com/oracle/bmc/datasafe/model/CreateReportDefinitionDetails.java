/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Description of a new report definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateReportDefinitionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateReportDefinitionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "parentId",
        "description",
        "columnInfo",
        "columnFilters",
        "columnSortings",
        "summary",
        "freeformTags",
        "definedTags"
    })
    public CreateReportDefinitionDetails(
            String compartmentId,
            String displayName,
            String parentId,
            String description,
            java.util.List<Column> columnInfo,
            java.util.List<ColumnFilter> columnFilters,
            java.util.List<ColumnSorting> columnSortings,
            java.util.List<Summary> summary,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.parentId = parentId;
        this.description = description;
        this.columnInfo = columnInfo;
        this.columnFilters = columnFilters;
        this.columnSortings = columnSortings;
        this.summary = summary;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * Specifies the name of the report definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Specifies the name of the report definition.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the parent report definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * The OCID of the parent report definition.
         * @param parentId the value to set
         * @return this builder
         **/
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
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
         * An array of column filter objects. A column Filter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
        private java.util.List<ColumnFilter> columnFilters;

        /**
         * An array of column filter objects. A column Filter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateReportDefinitionDetails build() {
            CreateReportDefinitionDetails model =
                    new CreateReportDefinitionDetails(
                            this.compartmentId,
                            this.displayName,
                            this.parentId,
                            this.description,
                            this.columnInfo,
                            this.columnFilters,
                            this.columnSortings,
                            this.summary,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateReportDefinitionDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Specifies the name of the report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Specifies the name of the report definition.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the parent report definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * The OCID of the parent report definition.
     * @return the value
     **/
    public String getParentId() {
        return parentId;
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
     * An array of column filter objects. A column Filter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnFilters")
    private final java.util.List<ColumnFilter> columnFilters;

    /**
     * An array of column filter objects. A column Filter object stores all information about a column filter including field name, an operator, one or more expressions, if the filter is enabled, or if the filter is hidden.
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
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

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateReportDefinitionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", columnInfo=").append(String.valueOf(this.columnInfo));
        sb.append(", columnFilters=").append(String.valueOf(this.columnFilters));
        sb.append(", columnSortings=").append(String.valueOf(this.columnSortings));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateReportDefinitionDetails)) {
            return false;
        }

        CreateReportDefinitionDetails other = (CreateReportDefinitionDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.columnInfo, other.columnInfo)
                && java.util.Objects.equals(this.columnFilters, other.columnFilters)
                && java.util.Objects.equals(this.columnSortings, other.columnSortings)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.columnInfo == null ? 43 : this.columnInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.columnFilters == null ? 43 : this.columnFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.columnSortings == null ? 43 : this.columnSortings.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
