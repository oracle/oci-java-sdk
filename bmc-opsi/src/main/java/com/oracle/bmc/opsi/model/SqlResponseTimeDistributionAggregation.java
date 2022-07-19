/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Response time distribution entry.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlResponseTimeDistributionAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlResponseTimeDistributionAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"bucketId", "executionsCount"})
    public SqlResponseTimeDistributionAggregation(String bucketId, Long executionsCount) {
        super();
        this.bucketId = bucketId;
        this.executionsCount = executionsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Response time bucket id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketId")
        private String bucketId;

        /**
         * Response time bucket id
         * @param bucketId the value to set
         * @return this builder
         **/
        public Builder bucketId(String bucketId) {
            this.bucketId = bucketId;
            this.__explicitlySet__.add("bucketId");
            return this;
        }
        /**
         * Total number of SQL executions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
        private Long executionsCount;

        /**
         * Total number of SQL executions
         * @param executionsCount the value to set
         * @return this builder
         **/
        public Builder executionsCount(Long executionsCount) {
            this.executionsCount = executionsCount;
            this.__explicitlySet__.add("executionsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlResponseTimeDistributionAggregation build() {
            SqlResponseTimeDistributionAggregation __instance__ =
                    new SqlResponseTimeDistributionAggregation(bucketId, executionsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlResponseTimeDistributionAggregation o) {
            Builder copiedBuilder =
                    bucketId(o.getBucketId()).executionsCount(o.getExecutionsCount());

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
     * Response time bucket id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketId")
    private final String bucketId;

    /**
     * Response time bucket id
     * @return the value
     **/
    public String getBucketId() {
        return bucketId;
    }

    /**
     * Total number of SQL executions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionsCount")
    private final Long executionsCount;

    /**
     * Total number of SQL executions
     * @return the value
     **/
    public Long getExecutionsCount() {
        return executionsCount;
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
        sb.append("SqlResponseTimeDistributionAggregation(");
        sb.append("bucketId=").append(String.valueOf(this.bucketId));
        sb.append(", executionsCount=").append(String.valueOf(this.executionsCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlResponseTimeDistributionAggregation)) {
            return false;
        }

        SqlResponseTimeDistributionAggregation other = (SqlResponseTimeDistributionAggregation) o;
        return java.util.Objects.equals(this.bucketId, other.bucketId)
                && java.util.Objects.equals(this.executionsCount, other.executionsCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bucketId == null ? 43 : this.bucketId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionsCount == null ? 43 : this.executionsCount.hashCode());
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
