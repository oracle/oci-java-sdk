/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database storage metric values.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseStorageAggregateMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseStorageAggregateMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("storageAllocated")
        private MetricDataPoint storageAllocated;

        public Builder storageAllocated(MetricDataPoint storageAllocated) {
            this.storageAllocated = storageAllocated;
            this.__explicitlySet__.add("storageAllocated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageUsed")
        private MetricDataPoint storageUsed;

        public Builder storageUsed(MetricDataPoint storageUsed) {
            this.storageUsed = storageUsed;
            this.__explicitlySet__.add("storageUsed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedByTableSpace")
        private java.util.List<MetricDataPoint> storageUsedByTableSpace;

        public Builder storageUsedByTableSpace(
                java.util.List<MetricDataPoint> storageUsedByTableSpace) {
            this.storageUsedByTableSpace = storageUsedByTableSpace;
            this.__explicitlySet__.add("storageUsedByTableSpace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseStorageAggregateMetrics build() {
            DatabaseStorageAggregateMetrics __instance__ =
                    new DatabaseStorageAggregateMetrics(
                            storageAllocated, storageUsed, storageUsedByTableSpace);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseStorageAggregateMetrics o) {
            Builder copiedBuilder =
                    storageAllocated(o.getStorageAllocated())
                            .storageUsed(o.getStorageUsed())
                            .storageUsedByTableSpace(o.getStorageUsedByTableSpace());

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

    @com.fasterxml.jackson.annotation.JsonProperty("storageAllocated")
    MetricDataPoint storageAllocated;

    @com.fasterxml.jackson.annotation.JsonProperty("storageUsed")
    MetricDataPoint storageUsed;

    /**
     * A list of the storage metrics grouped by TableSpace for a specific database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedByTableSpace")
    java.util.List<MetricDataPoint> storageUsedByTableSpace;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
