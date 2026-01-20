/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Forecast configuration of usage or cost. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Forecast.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Forecast extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"forecastType", "timeForecastStarted", "timeForecastEnded"})
    public Forecast(
            ForecastType forecastType,
            java.util.Date timeForecastStarted,
            java.util.Date timeForecastEnded) {
        super();
        this.forecastType = forecastType;
        this.timeForecastStarted = timeForecastStarted;
        this.timeForecastEnded = timeForecastEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * BASIC uses the exponential smoothing (ETS) model to project future usage or costs based
         * on history data. The basis for projections is a periodic set of equivalent historical
         * days for which the projection is being made.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("forecastType")
        private ForecastType forecastType;

        /**
         * BASIC uses the exponential smoothing (ETS) model to project future usage or costs based
         * on history data. The basis for projections is a periodic set of equivalent historical
         * days for which the projection is being made.
         *
         * @param forecastType the value to set
         * @return this builder
         */
        public Builder forecastType(ForecastType forecastType) {
            this.forecastType = forecastType;
            this.__explicitlySet__.add("forecastType");
            return this;
        }
        /** The forecast start time. Defaults to UTC-1 if not specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeForecastStarted")
        private java.util.Date timeForecastStarted;

        /**
         * The forecast start time. Defaults to UTC-1 if not specified.
         *
         * @param timeForecastStarted the value to set
         * @return this builder
         */
        public Builder timeForecastStarted(java.util.Date timeForecastStarted) {
            this.timeForecastStarted = timeForecastStarted;
            this.__explicitlySet__.add("timeForecastStarted");
            return this;
        }
        /** The forecast end time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeForecastEnded")
        private java.util.Date timeForecastEnded;

        /**
         * The forecast end time.
         *
         * @param timeForecastEnded the value to set
         * @return this builder
         */
        public Builder timeForecastEnded(java.util.Date timeForecastEnded) {
            this.timeForecastEnded = timeForecastEnded;
            this.__explicitlySet__.add("timeForecastEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Forecast build() {
            Forecast model =
                    new Forecast(
                            this.forecastType, this.timeForecastStarted, this.timeForecastEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Forecast model) {
            if (model.wasPropertyExplicitlySet("forecastType")) {
                this.forecastType(model.getForecastType());
            }
            if (model.wasPropertyExplicitlySet("timeForecastStarted")) {
                this.timeForecastStarted(model.getTimeForecastStarted());
            }
            if (model.wasPropertyExplicitlySet("timeForecastEnded")) {
                this.timeForecastEnded(model.getTimeForecastEnded());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * BASIC uses the exponential smoothing (ETS) model to project future usage or costs based on
     * history data. The basis for projections is a periodic set of equivalent historical days for
     * which the projection is being made.
     */
    public enum ForecastType implements com.oracle.bmc.http.internal.BmcEnum {
        Basic("BASIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ForecastType.class);

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
     * BASIC uses the exponential smoothing (ETS) model to project future usage or costs based on
     * history data. The basis for projections is a periodic set of equivalent historical days for
     * which the projection is being made.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forecastType")
    private final ForecastType forecastType;

    /**
     * BASIC uses the exponential smoothing (ETS) model to project future usage or costs based on
     * history data. The basis for projections is a periodic set of equivalent historical days for
     * which the projection is being made.
     *
     * @return the value
     */
    public ForecastType getForecastType() {
        return forecastType;
    }

    /** The forecast start time. Defaults to UTC-1 if not specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeForecastStarted")
    private final java.util.Date timeForecastStarted;

    /**
     * The forecast start time. Defaults to UTC-1 if not specified.
     *
     * @return the value
     */
    public java.util.Date getTimeForecastStarted() {
        return timeForecastStarted;
    }

    /** The forecast end time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeForecastEnded")
    private final java.util.Date timeForecastEnded;

    /**
     * The forecast end time.
     *
     * @return the value
     */
    public java.util.Date getTimeForecastEnded() {
        return timeForecastEnded;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Forecast(");
        sb.append("super=").append(super.toString());
        sb.append("forecastType=").append(String.valueOf(this.forecastType));
        sb.append(", timeForecastStarted=").append(String.valueOf(this.timeForecastStarted));
        sb.append(", timeForecastEnded=").append(String.valueOf(this.timeForecastEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Forecast)) {
            return false;
        }

        Forecast other = (Forecast) o;
        return java.util.Objects.equals(this.forecastType, other.forecastType)
                && java.util.Objects.equals(this.timeForecastStarted, other.timeForecastStarted)
                && java.util.Objects.equals(this.timeForecastEnded, other.timeForecastEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.forecastType == null ? 43 : this.forecastType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeForecastStarted == null
                                ? 43
                                : this.timeForecastStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeForecastEnded == null ? 43 : this.timeForecastEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
