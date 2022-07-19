/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseStorageAggregateMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseStorageAggregateMetrics {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageAllocated",
        "storageUsed",
        "storageUsedByTableSpace"
    })
    public DatabaseStorageAggregateMetrics(
            MetricDataPoint storageAllocated,
            MetricDataPoint storageUsed,
            java.util.List<MetricDataPoint> storageUsedByTableSpace) {
        super();
        this.storageAllocated = storageAllocated;
        this.storageUsed = storageUsed;
        this.storageUsedByTableSpace = storageUsedByTableSpace;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /**
         * A list of the storage metrics grouped by TableSpace for a specific Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedByTableSpace")
        private java.util.List<MetricDataPoint> storageUsedByTableSpace;

        /**
         * A list of the storage metrics grouped by TableSpace for a specific Managed Database.
         * @param storageUsedByTableSpace the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageAllocated")
    private final MetricDataPoint storageAllocated;

    public MetricDataPoint getStorageAllocated() {
        return storageAllocated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageUsed")
    private final MetricDataPoint storageUsed;

    public MetricDataPoint getStorageUsed() {
        return storageUsed;
    }

    /**
     * A list of the storage metrics grouped by TableSpace for a specific Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedByTableSpace")
    private final java.util.List<MetricDataPoint> storageUsedByTableSpace;

    /**
     * A list of the storage metrics grouped by TableSpace for a specific Managed Database.
     * @return the value
     **/
    public java.util.List<MetricDataPoint> getStorageUsedByTableSpace() {
        return storageUsedByTableSpace;
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
        sb.append("DatabaseStorageAggregateMetrics(");
        sb.append("storageAllocated=").append(String.valueOf(this.storageAllocated));
        sb.append(", storageUsed=").append(String.valueOf(this.storageUsed));
        sb.append(", storageUsedByTableSpace=")
                .append(String.valueOf(this.storageUsedByTableSpace));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseStorageAggregateMetrics)) {
            return false;
        }

        DatabaseStorageAggregateMetrics other = (DatabaseStorageAggregateMetrics) o;
        return java.util.Objects.equals(this.storageAllocated, other.storageAllocated)
                && java.util.Objects.equals(this.storageUsed, other.storageUsed)
                && java.util.Objects.equals(
                        this.storageUsedByTableSpace, other.storageUsedByTableSpace)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageAllocated == null ? 43 : this.storageAllocated.hashCode());
        result = (result * PRIME) + (this.storageUsed == null ? 43 : this.storageUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsedByTableSpace == null
                                ? 43
                                : this.storageUsedByTableSpace.hashCode());
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
