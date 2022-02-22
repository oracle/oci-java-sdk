/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data profile response.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataProfile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataProfile {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityProfileResult")
        private EntityProfileResult entityProfileResult;

        public Builder entityProfileResult(EntityProfileResult entityProfileResult) {
            this.entityProfileResult = entityProfileResult;
            this.__explicitlySet__.add("entityProfileResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributeProfileResults")
        private java.util.List<AttributeProfileResult> attributeProfileResults;

        public Builder attributeProfileResults(
                java.util.List<AttributeProfileResult> attributeProfileResults) {
            this.attributeProfileResults = attributeProfileResults;
            this.__explicitlySet__.add("attributeProfileResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataProfile build() {
            DataProfile __instance__ =
                    new DataProfile(entityName, entityProfileResult, attributeProfileResults);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataProfile o) {
            Builder copiedBuilder =
                    entityName(o.getEntityName())
                            .entityProfileResult(o.getEntityProfileResult())
                            .attributeProfileResults(o.getAttributeProfileResults());

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
     * Entity name for which prodilig is requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    @com.fasterxml.jackson.annotation.JsonProperty("entityProfileResult")
    EntityProfileResult entityProfileResult;

    /**
     * Array of profiling results
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeProfileResults")
    java.util.List<AttributeProfileResult> attributeProfileResults;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
