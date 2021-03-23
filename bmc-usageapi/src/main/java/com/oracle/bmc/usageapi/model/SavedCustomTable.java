/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SavedCustomTable.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SavedCustomTable {
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

    /**
     * the name of custom table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * row groupBy key list.
     * example:
     *   `[\"tagNamespace\", \"tagKey\", \"tagValue\", \"service\", \"skuName\", \"skuPartNumber\", \"unit\",
     *     \"compartmentName\", \"compartmentPath\", \"compartmentId\", \"platform\", \"region\", \"logicalAd\",
     *     \"resourceId\", \"tenantId\", \"tenantName\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowGroupBy")
    java.util.List<String> rowGroupBy;

    /**
     * column groupBy key list.
     * example:
     *   `[\"tagNamespace\", \"tagKey\", \"tagValue\", \"service\", \"skuName\", \"skuPartNumber\", \"unit\",
     *     \"compartmentName\", \"compartmentPath\", \"compartmentId\", \"platform\", \"region\", \"logicalAd\",
     *     \"resourceId\", \"tenantId\", \"tenantName\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnGroupBy")
    java.util.List<String> columnGroupBy;

    /**
     * GroupBy a specific tagKey. Provide tagNamespace and tagKey in tag object. Only support one tag in the list
     * example:
     *   `[{\"namespace\":\"oracle\", \"key\":\"createdBy\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByTag")
    java.util.List<Tag> groupByTag;

    /**
     * The compartment depth level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentDepth")
    java.math.BigDecimal compartmentDepth;

    /**
     * the version of custom table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    java.math.BigDecimal version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
