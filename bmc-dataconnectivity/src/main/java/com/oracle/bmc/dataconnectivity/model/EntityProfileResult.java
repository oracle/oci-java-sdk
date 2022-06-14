/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * A metadata details of a profiling entity result.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EntityProfileResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EntityProfileResult {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeCount", "sampledRowCount", "estimatedRowCount"})
    public EntityProfileResult(
            Integer attributeCount, Integer sampledRowCount, Integer estimatedRowCount) {
        super();
        this.attributeCount = attributeCount;
        this.sampledRowCount = sampledRowCount;
        this.estimatedRowCount = estimatedRowCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of columns in the DataFrame (arrow buffer) sent from Java layer. This value is not impacted by the List of attributes to profile as being passed via configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributeCount")
        private Integer attributeCount;

        /**
         * Number of columns in the DataFrame (arrow buffer) sent from Java layer. This value is not impacted by the List of attributes to profile as being passed via configuration.
         * @param attributeCount the value to set
         * @return this builder
         **/
        public Builder attributeCount(Integer attributeCount) {
            this.attributeCount = attributeCount;
            this.__explicitlySet__.add("attributeCount");
            return this;
        }
        /**
         * Number of rows were that were sampled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sampledRowCount")
        private Integer sampledRowCount;

        /**
         * Number of rows were that were sampled
         * @param sampledRowCount the value to set
         * @return this builder
         **/
        public Builder sampledRowCount(Integer sampledRowCount) {
            this.sampledRowCount = sampledRowCount;
            this.__explicitlySet__.add("sampledRowCount");
            return this;
        }
        /**
         * The estimated row count in the source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
        private Integer estimatedRowCount;

        /**
         * The estimated row count in the source.
         * @param estimatedRowCount the value to set
         * @return this builder
         **/
        public Builder estimatedRowCount(Integer estimatedRowCount) {
            this.estimatedRowCount = estimatedRowCount;
            this.__explicitlySet__.add("estimatedRowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityProfileResult build() {
            EntityProfileResult __instance__ =
                    new EntityProfileResult(attributeCount, sampledRowCount, estimatedRowCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityProfileResult o) {
            Builder copiedBuilder =
                    attributeCount(o.getAttributeCount())
                            .sampledRowCount(o.getSampledRowCount())
                            .estimatedRowCount(o.getEstimatedRowCount());

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
     * Number of columns in the DataFrame (arrow buffer) sent from Java layer. This value is not impacted by the List of attributes to profile as being passed via configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeCount")
    private final Integer attributeCount;

    /**
     * Number of columns in the DataFrame (arrow buffer) sent from Java layer. This value is not impacted by the List of attributes to profile as being passed via configuration.
     * @return the value
     **/
    public Integer getAttributeCount() {
        return attributeCount;
    }

    /**
     * Number of rows were that were sampled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampledRowCount")
    private final Integer sampledRowCount;

    /**
     * Number of rows were that were sampled
     * @return the value
     **/
    public Integer getSampledRowCount() {
        return sampledRowCount;
    }

    /**
     * The estimated row count in the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
    private final Integer estimatedRowCount;

    /**
     * The estimated row count in the source.
     * @return the value
     **/
    public Integer getEstimatedRowCount() {
        return estimatedRowCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityProfileResult(");
        sb.append("attributeCount=").append(String.valueOf(this.attributeCount));
        sb.append(", sampledRowCount=").append(String.valueOf(this.sampledRowCount));
        sb.append(", estimatedRowCount=").append(String.valueOf(this.estimatedRowCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityProfileResult)) {
            return false;
        }

        EntityProfileResult other = (EntityProfileResult) o;
        return java.util.Objects.equals(this.attributeCount, other.attributeCount)
                && java.util.Objects.equals(this.sampledRowCount, other.sampledRowCount)
                && java.util.Objects.equals(this.estimatedRowCount, other.estimatedRowCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeCount == null ? 43 : this.attributeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.sampledRowCount == null ? 43 : this.sampledRowCount.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedRowCount == null ? 43 : this.estimatedRowCount.hashCode());
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
