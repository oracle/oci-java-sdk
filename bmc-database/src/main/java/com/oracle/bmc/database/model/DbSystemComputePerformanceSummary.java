/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Representation of disk performance detail parameters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DbSystemComputePerformanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemComputePerformanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"shape", "computePerformanceList"})
    public DbSystemComputePerformanceSummary(
            String shape, java.util.List<ComputePerformanceSummary> computePerformanceList) {
        super();
        this.shape = shape;
        this.computePerformanceList = computePerformanceList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape of the DB system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the DB system.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * List of Compute performance details for the specified DB system shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computePerformanceList")
        private java.util.List<ComputePerformanceSummary> computePerformanceList;

        /**
         * List of Compute performance details for the specified DB system shape.
         * @param computePerformanceList the value to set
         * @return this builder
         **/
        public Builder computePerformanceList(
                java.util.List<ComputePerformanceSummary> computePerformanceList) {
            this.computePerformanceList = computePerformanceList;
            this.__explicitlySet__.add("computePerformanceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemComputePerformanceSummary build() {
            DbSystemComputePerformanceSummary __instance__ =
                    new DbSystemComputePerformanceSummary(shape, computePerformanceList);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemComputePerformanceSummary o) {
            Builder copiedBuilder =
                    shape(o.getShape()).computePerformanceList(o.getComputePerformanceList());

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
     * The shape of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the DB system.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * List of Compute performance details for the specified DB system shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computePerformanceList")
    private final java.util.List<ComputePerformanceSummary> computePerformanceList;

    /**
     * List of Compute performance details for the specified DB system shape.
     * @return the value
     **/
    public java.util.List<ComputePerformanceSummary> getComputePerformanceList() {
        return computePerformanceList;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystemComputePerformanceSummary(");
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", computePerformanceList=").append(String.valueOf(this.computePerformanceList));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemComputePerformanceSummary)) {
            return false;
        }

        DbSystemComputePerformanceSummary other = (DbSystemComputePerformanceSummary) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(
                        this.computePerformanceList, other.computePerformanceList)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.computePerformanceList == null
                                ? 43
                                : this.computePerformanceList.hashCode());
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
