/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.analytics.model;

/**
 * Service instance capacity metadata (e.g.: OLPU count, number of users, ...etc...).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capacity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Capacity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
        private CapacityType capacityType;

        public Builder capacityType(CapacityType capacityType) {
            this.capacityType = capacityType;
            this.__explicitlySet__.add("capacityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
        private Integer capacityValue;

        public Builder capacityValue(Integer capacityValue) {
            this.capacityValue = capacityValue;
            this.__explicitlySet__.add("capacityValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capacity build() {
            Capacity __instance__ = new Capacity(capacityType, capacityValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capacity o) {
            Builder copiedBuilder =
                    capacityType(o.getCapacityType()).capacityValue(o.getCapacityValue());

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
     * The capacity model to use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
    CapacityType capacityType;

    /**
     * The capacity value selected (OLPU count, number of users, ...etc...). This parameter affects the
     * number of CPUs, amount of memory or other resources allocated to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
    Integer capacityValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
