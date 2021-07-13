/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * An object to hold value information for each anomaly point
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Anomaly.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Anomaly {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("signalName")
        private String signalName;

        public Builder signalName(String signalName) {
            this.signalName = signalName;
            this.__explicitlySet__.add("signalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actualValue")
        private Double actualValue;

        public Builder actualValue(Double actualValue) {
            this.actualValue = actualValue;
            this.__explicitlySet__.add("actualValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedValue")
        private Double estimatedValue;

        public Builder estimatedValue(Double estimatedValue) {
            this.estimatedValue = estimatedValue;
            this.__explicitlySet__.add("estimatedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imputedValue")
        private Double imputedValue;

        public Builder imputedValue(Double imputedValue) {
            this.imputedValue = imputedValue;
            this.__explicitlySet__.add("imputedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("anomalyScore")
        private Double anomalyScore;

        public Builder anomalyScore(Double anomalyScore) {
            this.anomalyScore = anomalyScore;
            this.__explicitlySet__.add("anomalyScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Anomaly build() {
            Anomaly __instance__ =
                    new Anomaly(
                            signalName, actualValue, estimatedValue, imputedValue, anomalyScore);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Anomaly o) {
            Builder copiedBuilder =
                    signalName(o.getSignalName())
                            .actualValue(o.getActualValue())
                            .estimatedValue(o.getEstimatedValue())
                            .imputedValue(o.getImputedValue())
                            .anomalyScore(o.getAnomalyScore());

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
     * Name of a signal where current anomaly point belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signalName")
    String signalName;

    /**
     * The actual value for the anomaly point at given signal and timestamp/row
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualValue")
    Double actualValue;

    /**
     * The estimated value for the anomaly point at given signal and timestamp/row
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedValue")
    Double estimatedValue;

    /**
     * The value imputed by one of IDP step for missing values in origin data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imputedValue")
    Double imputedValue;

    /**
     * A significant score ranged from 0 to 1 to each anomaly point
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anomalyScore")
    Double anomalyScore;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
