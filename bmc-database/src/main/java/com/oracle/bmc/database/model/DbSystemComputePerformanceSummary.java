/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class DbSystemComputePerformanceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
            DbSystemComputePerformanceSummary model =
                    new DbSystemComputePerformanceSummary(this.shape, this.computePerformanceList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemComputePerformanceSummary model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("computePerformanceList")) {
                this.computePerformanceList(model.getComputePerformanceList());
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystemComputePerformanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", computePerformanceList=").append(String.valueOf(this.computePerformanceList));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
