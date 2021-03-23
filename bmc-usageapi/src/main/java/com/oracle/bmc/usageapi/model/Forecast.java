/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Forcast configuration of usage/cost.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Forecast.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Forecast {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("forcastType")
        private ForcastType forcastType;

        public Builder forcastType(ForcastType forcastType) {
            this.forcastType = forcastType;
            this.__explicitlySet__.add("forcastType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeForecastStarted")
        private java.util.Date timeForecastStarted;

        public Builder timeForecastStarted(java.util.Date timeForecastStarted) {
            this.timeForecastStarted = timeForecastStarted;
            this.__explicitlySet__.add("timeForecastStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeForecastEnded")
        private java.util.Date timeForecastEnded;

        public Builder timeForecastEnded(java.util.Date timeForecastEnded) {
            this.timeForecastEnded = timeForecastEnded;
            this.__explicitlySet__.add("timeForecastEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Forecast build() {
            Forecast __instance__ =
                    new Forecast(forcastType, timeForecastStarted, timeForecastEnded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Forecast o) {
            Builder copiedBuilder =
                    forcastType(o.getForcastType())
                            .timeForecastStarted(o.getTimeForecastStarted())
                            .timeForecastEnded(o.getTimeForecastEnded());

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
     * BASIC uses ETS to project future usage/cost based on history data. The basis for projections will be a rolling set of equivalent historical days for which projection is being made.
     **/
    public enum ForcastType {
        Basic("BASIC"),
        ;

        private final String value;
        private static java.util.Map<String, ForcastType> map;

        static {
            map = new java.util.HashMap<>();
            for (ForcastType v : ForcastType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ForcastType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ForcastType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ForcastType: " + key);
        }
    };
    /**
     * BASIC uses ETS to project future usage/cost based on history data. The basis for projections will be a rolling set of equivalent historical days for which projection is being made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forcastType")
    ForcastType forcastType;

    /**
     * forecast start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeForecastStarted")
    java.util.Date timeForecastStarted;

    /**
     * forecast end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeForecastEnded")
    java.util.Date timeForecastEnded;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
