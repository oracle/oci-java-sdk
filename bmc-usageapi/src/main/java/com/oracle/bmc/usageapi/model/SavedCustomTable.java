/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The custom table for Cost Analysis UI rendering.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SavedCustomTable.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SavedCustomTable {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "rowGroupBy",
        "columnGroupBy",
        "groupByTag",
        "compartmentDepth",
        "version"
    })
    public SavedCustomTable(
            String displayName,
            java.util.List<String> rowGroupBy,
            java.util.List<String> columnGroupBy,
            java.util.List<Tag> groupByTag,
            java.math.BigDecimal compartmentDepth,
            java.math.BigDecimal version) {
        super();
        this.displayName = displayName;
        this.rowGroupBy = rowGroupBy;
        this.columnGroupBy = columnGroupBy;
        this.groupByTag = groupByTag;
        this.compartmentDepth = compartmentDepth;
        this.version = version;
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

        @com.fasterxml.jackson.annotation.JsonProperty("rowGroupBy")
        private java.util.List<String> rowGroupBy;

        public Builder rowGroupBy(java.util.List<String> rowGroupBy) {
            this.rowGroupBy = rowGroupBy;
            this.__explicitlySet__.add("rowGroupBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnGroupBy")
        private java.util.List<String> columnGroupBy;

        public Builder columnGroupBy(java.util.List<String> columnGroupBy) {
            this.columnGroupBy = columnGroupBy;
            this.__explicitlySet__.add("columnGroupBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
        private java.util.List<Tag> groupByTag;

        public Builder groupByTag(java.util.List<Tag> groupByTag) {
            this.groupByTag = groupByTag;
            this.__explicitlySet__.add("groupByTag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
        private java.math.BigDecimal compartmentDepth;

        public Builder compartmentDepth(java.math.BigDecimal compartmentDepth) {
            this.compartmentDepth = compartmentDepth;
            this.__explicitlySet__.add("compartmentDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private java.math.BigDecimal version;

        public Builder version(java.math.BigDecimal version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SavedCustomTable build() {
            SavedCustomTable __instance__ =
                    new SavedCustomTable(
                            displayName,
                            rowGroupBy,
                            columnGroupBy,
                            groupByTag,
                            compartmentDepth,
                            version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SavedCustomTable o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .rowGroupBy(o.getRowGroupBy())
                            .columnGroupBy(o.getColumnGroupBy())
                            .groupByTag(o.getGroupByTag())
                            .compartmentDepth(o.getCompartmentDepth())
                            .version(o.getVersion());

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
     * The name of the custom table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The row groupBy key list.
     * example:
     *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
     *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
     *     "resourceId", "tenantId", "tenantName"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowGroupBy")
    private final java.util.List<String> rowGroupBy;

    public java.util.List<String> getRowGroupBy() {
        return rowGroupBy;
    }

    /**
     * The column groupBy key list.
     * example:
     *   {@code ["tagNamespace", "tagKey", "tagValue", "service", "skuName", "skuPartNumber", "unit",
     *     "compartmentName", "compartmentPath", "compartmentId", "platform", "region", "logicalAd",
     *     "resourceId", "tenantId", "tenantName"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnGroupBy")
    private final java.util.List<String> columnGroupBy;

    public java.util.List<String> getColumnGroupBy() {
        return columnGroupBy;
    }

    /**
     * GroupBy a specific tagKey. Provide the tagNamespace and tagKey in the tag object. Only one tag in the list is supported.
     * For example:
     *   {@code [{"namespace":"oracle", "key":"createdBy"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    private final java.util.List<Tag> groupByTag;

    public java.util.List<Tag> getGroupByTag() {
        return groupByTag;
    }

    /**
     * The compartment depth level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    private final java.math.BigDecimal compartmentDepth;

    public java.math.BigDecimal getCompartmentDepth() {
        return compartmentDepth;
    }

    /**
     * The version of the custom table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final java.math.BigDecimal version;

    public java.math.BigDecimal getVersion() {
        return version;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SavedCustomTable(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", rowGroupBy=").append(String.valueOf(this.rowGroupBy));
        sb.append(", columnGroupBy=").append(String.valueOf(this.columnGroupBy));
        sb.append(", groupByTag=").append(String.valueOf(this.groupByTag));
        sb.append(", compartmentDepth=").append(String.valueOf(this.compartmentDepth));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SavedCustomTable)) {
            return false;
        }

        SavedCustomTable other = (SavedCustomTable) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.rowGroupBy, other.rowGroupBy)
                && java.util.Objects.equals(this.columnGroupBy, other.columnGroupBy)
                && java.util.Objects.equals(this.groupByTag, other.groupByTag)
                && java.util.Objects.equals(this.compartmentDepth, other.compartmentDepth)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.rowGroupBy == null ? 43 : this.rowGroupBy.hashCode());
        result =
                (result * PRIME)
                        + (this.columnGroupBy == null ? 43 : this.columnGroupBy.hashCode());
        result = (result * PRIME) + (this.groupByTag == null ? 43 : this.groupByTag.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentDepth == null ? 43 : this.compartmentDepth.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
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
