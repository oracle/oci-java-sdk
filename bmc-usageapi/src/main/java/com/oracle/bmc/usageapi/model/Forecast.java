/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Forecast configuration of usage/cost.
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
        @com.fasterxml.jackson.annotation.JsonProperty("forecastType")
        private ForecastType forecastType;

        public Builder forecastType(ForecastType forecastType) {
            this.forecastType = forecastType;
            this.__explicitlySet__.add("forecastType");
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
                    new Forecast(forecastType, timeForecastStarted, timeForecastEnded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Forecast o) {
            Builder copiedBuilder =
                    forecastType(o.getForecastType())
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
     * BASIC uses the exponential smoothing (ETS) model to project future usage/costs based on history data. The basis for projections is a periodic set of equivalent historical days for which the projection is being made.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ForecastType {
        Basic("BASIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ForecastType> map;

        static {
            map = new java.util.HashMap<>();
            for (ForecastType v : ForecastType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ForecastType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ForecastType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ForecastType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * BASIC uses the exponential smoothing (ETS) model to project future usage/costs based on history data. The basis for projections is a periodic set of equivalent historical days for which the projection is being made.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forecastType")
    ForecastType forecastType;

    /**
     * The forecast start time. Defaults to UTC-1 if not specified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeForecastStarted")
    java.util.Date timeForecastStarted;

    /**
     * The forecast end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeForecastEnded")
    java.util.Date timeForecastEnded;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
