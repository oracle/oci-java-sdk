/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data per tablespace for a Pluggable database
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TablespaceUsageTrendAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TablespaceUsageTrendAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
        private String tablespaceName;

        public Builder tablespaceName(String tablespaceName) {
            this.tablespaceName = tablespaceName;
            this.__explicitlySet__.add("tablespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceType")
        private String tablespaceType;

        public Builder tablespaceType(String tablespaceType) {
            this.tablespaceType = tablespaceType;
            this.__explicitlySet__.add("tablespaceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageData")
        private java.util.List<TablespaceUsageTrend> usageData;

        public Builder usageData(java.util.List<TablespaceUsageTrend> usageData) {
            this.usageData = usageData;
            this.__explicitlySet__.add("usageData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TablespaceUsageTrendAggregation build() {
            TablespaceUsageTrendAggregation __instance__ =
                    new TablespaceUsageTrendAggregation(tablespaceName, tablespaceType, usageData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TablespaceUsageTrendAggregation o) {
            Builder copiedBuilder =
                    tablespaceName(o.getTablespaceName())
                            .tablespaceType(o.getTablespaceType())
                            .usageData(o.getUsageData());

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
     * The name of tablespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceName")
    String tablespaceName;

    /**
     * Type of tablespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceType")
    String tablespaceType;

    /**
     * List of usage data samples for a tablespace
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageData")
    java.util.List<TablespaceUsageTrend> usageData;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
