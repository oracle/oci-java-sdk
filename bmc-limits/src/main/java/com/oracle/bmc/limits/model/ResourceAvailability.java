/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.model;

/**
 * The availability of a given resource limit, based on the usage, tenant service limits, and quotas set for the tenancy.
 * Note: We cannot guarantee this data for all the limits. In such cases, these fields will be empty.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceAvailability.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResourceAvailability {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("used")
        private Long used;

        public Builder used(Long used) {
            this.used = used;
            this.__explicitlySet__.add("used");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("available")
        private Long available;

        public Builder available(Long available) {
            this.available = available;
            this.__explicitlySet__.add("available");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fractionalUsage")
        private java.math.BigDecimal fractionalUsage;

        public Builder fractionalUsage(java.math.BigDecimal fractionalUsage) {
            this.fractionalUsage = fractionalUsage;
            this.__explicitlySet__.add("fractionalUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fractionalAvailability")
        private java.math.BigDecimal fractionalAvailability;

        public Builder fractionalAvailability(java.math.BigDecimal fractionalAvailability) {
            this.fractionalAvailability = fractionalAvailability;
            this.__explicitlySet__.add("fractionalAvailability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("effectiveQuotaValue")
        private java.math.BigDecimal effectiveQuotaValue;

        public Builder effectiveQuotaValue(java.math.BigDecimal effectiveQuotaValue) {
            this.effectiveQuotaValue = effectiveQuotaValue;
            this.__explicitlySet__.add("effectiveQuotaValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAvailability build() {
            ResourceAvailability __instance__ =
                    new ResourceAvailability(
                            used,
                            available,
                            fractionalUsage,
                            fractionalAvailability,
                            effectiveQuotaValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceAvailability o) {
            Builder copiedBuilder =
                    used(o.getUsed())
                            .available(o.getAvailable())
                            .fractionalUsage(o.getFractionalUsage())
                            .fractionalAvailability(o.getFractionalAvailability())
                            .effectiveQuotaValue(o.getEffectiveQuotaValue());

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
     * The current usage in the given compartment. To support resources with fractional counts,
     * the field rounds up to the nearest integer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("used")
    Long used;

    /**
     * The count of available resources. To support resources with fractional counts,
     * the field rounds down to the nearest integer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("available")
    Long available;

    /**
     * The current most accurate usage in the given compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fractionalUsage")
    java.math.BigDecimal fractionalUsage;

    /**
     * The most accurate count of available resources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fractionalAvailability")
    java.math.BigDecimal fractionalAvailability;

    /**
     * The effective quota value for the given compartment. This field is only present if there is a
     * current quota policy affecting the current resource in the target region or availability domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveQuotaValue")
    java.math.BigDecimal effectiveQuotaValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
