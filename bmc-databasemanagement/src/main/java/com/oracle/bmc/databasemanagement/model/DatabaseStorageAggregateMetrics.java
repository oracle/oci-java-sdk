/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database storage metric values. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseStorageAggregateMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseStorageAggregateMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** A list of the storage metrics grouped by TableSpace for a specific Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedByTableSpace")
        private java.util.List<MetricDataPoint> storageUsedByTableSpace;

        /**
         * A list of the storage metrics grouped by TableSpace for a specific Managed Database.
         *
         * @param storageUsedByTableSpace the value to set
         * @return this builder
         */
        public Builder storageUsedByTableSpace(
                java.util.List<MetricDataPoint> storageUsedByTableSpace) {
            this.storageUsedByTableSpace = storageUsedByTableSpace;
            this.__explicitlySet__.add("storageUsedByTableSpace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseStorageAggregateMetrics build() {
            DatabaseStorageAggregateMetrics model =
                    new DatabaseStorageAggregateMetrics(
                            this.storageAllocated, this.storageUsed, this.storageUsedByTableSpace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseStorageAggregateMetrics model) {
            if (model.wasPropertyExplicitlySet("storageAllocated")) {
                this.storageAllocated(model.getStorageAllocated());
            }
            if (model.wasPropertyExplicitlySet("storageUsed")) {
                this.storageUsed(model.getStorageUsed());
            }
            if (model.wasPropertyExplicitlySet("storageUsedByTableSpace")) {
                this.storageUsedByTableSpace(model.getStorageUsedByTableSpace());
            }
            return this;
        }
    }

    /** Create a new builder. */
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

    /** A list of the storage metrics grouped by TableSpace for a specific Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedByTableSpace")
    private final java.util.List<MetricDataPoint> storageUsedByTableSpace;

    /**
     * A list of the storage metrics grouped by TableSpace for a specific Managed Database.
     *
     * @return the value
     */
    public java.util.List<MetricDataPoint> getStorageUsedByTableSpace() {
        return storageUsedByTableSpace;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseStorageAggregateMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("storageAllocated=").append(String.valueOf(this.storageAllocated));
        sb.append(", storageUsed=").append(String.valueOf(this.storageUsed));
        sb.append(", storageUsedByTableSpace=")
                .append(String.valueOf(this.storageUsedByTableSpace));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
