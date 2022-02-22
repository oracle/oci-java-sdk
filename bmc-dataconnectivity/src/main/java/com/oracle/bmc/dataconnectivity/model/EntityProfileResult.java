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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EntityProfileResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EntityProfileResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("attributeCount")
        private Integer attributeCount;

        public Builder attributeCount(Integer attributeCount) {
            this.attributeCount = attributeCount;
            this.__explicitlySet__.add("attributeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampledRowCount")
        private Integer sampledRowCount;

        public Builder sampledRowCount(Integer sampledRowCount) {
            this.sampledRowCount = sampledRowCount;
            this.__explicitlySet__.add("sampledRowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
        private Integer estimatedRowCount;

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

    /**
     * Number of columns in the DataFrame (arrow buffer) sent from Java layer. This value is not impacted by the List of attributes to profile as being passed via configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeCount")
    Integer attributeCount;

    /**
     * Number of rows were that were sampled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampledRowCount")
    Integer sampledRowCount;

    /**
     * The estimated row count in the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedRowCount")
    Integer estimatedRowCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
