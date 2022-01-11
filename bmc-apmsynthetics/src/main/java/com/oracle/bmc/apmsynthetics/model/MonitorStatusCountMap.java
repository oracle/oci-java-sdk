/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the monitor count per state.
 * Example: {@code { "total" : 5, "enabled" : 3 , "disabled" : 2, "invalid" : 0 }}
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitorStatusCountMap.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonitorStatusCountMap {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private Integer enabled;

        public Builder enabled(Integer enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("disabled")
        private Integer disabled;

        public Builder disabled(Integer disabled) {
            this.disabled = disabled;
            this.__explicitlySet__.add("disabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invalid")
        private Integer invalid;

        public Builder invalid(Integer invalid) {
            this.invalid = invalid;
            this.__explicitlySet__.add("invalid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorStatusCountMap build() {
            MonitorStatusCountMap __instance__ =
                    new MonitorStatusCountMap(total, enabled, disabled, invalid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorStatusCountMap o) {
            Builder copiedBuilder =
                    total(o.getTotal())
                            .enabled(o.getEnabled())
                            .disabled(o.getDisabled())
                            .invalid(o.getInvalid());

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
     * Total number of monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    Integer total;

    /**
     * Number of enabled monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    Integer enabled;

    /**
     * Number of disabled monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disabled")
    Integer disabled;

    /**
     * Number of invalid monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invalid")
    Integer invalid;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
