/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Anomaly.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Anomaly {
    @Deprecated
    @java.beans.ConstructorProperties({
        "signalName",
        "actualValue",
        "estimatedValue",
        "imputedValue",
        "anomalyScore"
    })
    public Anomaly(
            String signalName,
            Double actualValue,
            Double estimatedValue,
            Double imputedValue,
            Double anomalyScore) {
        super();
        this.signalName = signalName;
        this.actualValue = actualValue;
        this.estimatedValue = estimatedValue;
        this.imputedValue = imputedValue;
        this.anomalyScore = anomalyScore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of a signal where current anomaly point belongs to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signalName")
        private String signalName;

        /**
         * Name of a signal where current anomaly point belongs to
         * @param signalName the value to set
         * @return this builder
         **/
        public Builder signalName(String signalName) {
            this.signalName = signalName;
            this.__explicitlySet__.add("signalName");
            return this;
        }
        /**
         * The actual value for the anomaly point at given signal and timestamp/row
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actualValue")
        private Double actualValue;

        /**
         * The actual value for the anomaly point at given signal and timestamp/row
         * @param actualValue the value to set
         * @return this builder
         **/
        public Builder actualValue(Double actualValue) {
            this.actualValue = actualValue;
            this.__explicitlySet__.add("actualValue");
            return this;
        }
        /**
         * The estimated value for the anomaly point at given signal and timestamp/row
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedValue")
        private Double estimatedValue;

        /**
         * The estimated value for the anomaly point at given signal and timestamp/row
         * @param estimatedValue the value to set
         * @return this builder
         **/
        public Builder estimatedValue(Double estimatedValue) {
            this.estimatedValue = estimatedValue;
            this.__explicitlySet__.add("estimatedValue");
            return this;
        }
        /**
         * The value imputed by one of IDP step for missing values in origin data
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imputedValue")
        private Double imputedValue;

        /**
         * The value imputed by one of IDP step for missing values in origin data
         * @param imputedValue the value to set
         * @return this builder
         **/
        public Builder imputedValue(Double imputedValue) {
            this.imputedValue = imputedValue;
            this.__explicitlySet__.add("imputedValue");
            return this;
        }
        /**
         * A significant score ranged from 0 to 1 to each anomaly point
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("anomalyScore")
        private Double anomalyScore;

        /**
         * A significant score ranged from 0 to 1 to each anomaly point
         * @param anomalyScore the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of a signal where current anomaly point belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signalName")
    private final String signalName;

    /**
     * Name of a signal where current anomaly point belongs to
     * @return the value
     **/
    public String getSignalName() {
        return signalName;
    }

    /**
     * The actual value for the anomaly point at given signal and timestamp/row
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actualValue")
    private final Double actualValue;

    /**
     * The actual value for the anomaly point at given signal and timestamp/row
     * @return the value
     **/
    public Double getActualValue() {
        return actualValue;
    }

    /**
     * The estimated value for the anomaly point at given signal and timestamp/row
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedValue")
    private final Double estimatedValue;

    /**
     * The estimated value for the anomaly point at given signal and timestamp/row
     * @return the value
     **/
    public Double getEstimatedValue() {
        return estimatedValue;
    }

    /**
     * The value imputed by one of IDP step for missing values in origin data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imputedValue")
    private final Double imputedValue;

    /**
     * The value imputed by one of IDP step for missing values in origin data
     * @return the value
     **/
    public Double getImputedValue() {
        return imputedValue;
    }

    /**
     * A significant score ranged from 0 to 1 to each anomaly point
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anomalyScore")
    private final Double anomalyScore;

    /**
     * A significant score ranged from 0 to 1 to each anomaly point
     * @return the value
     **/
    public Double getAnomalyScore() {
        return anomalyScore;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Anomaly(");
        sb.append("signalName=").append(String.valueOf(this.signalName));
        sb.append(", actualValue=").append(String.valueOf(this.actualValue));
        sb.append(", estimatedValue=").append(String.valueOf(this.estimatedValue));
        sb.append(", imputedValue=").append(String.valueOf(this.imputedValue));
        sb.append(", anomalyScore=").append(String.valueOf(this.anomalyScore));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Anomaly)) {
            return false;
        }

        Anomaly other = (Anomaly) o;
        return java.util.Objects.equals(this.signalName, other.signalName)
                && java.util.Objects.equals(this.actualValue, other.actualValue)
                && java.util.Objects.equals(this.estimatedValue, other.estimatedValue)
                && java.util.Objects.equals(this.imputedValue, other.imputedValue)
                && java.util.Objects.equals(this.anomalyScore, other.anomalyScore)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.signalName == null ? 43 : this.signalName.hashCode());
        result = (result * PRIME) + (this.actualValue == null ? 43 : this.actualValue.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedValue == null ? 43 : this.estimatedValue.hashCode());
        result = (result * PRIME) + (this.imputedValue == null ? 43 : this.imputedValue.hashCode());
        result = (result * PRIME) + (this.anomalyScore == null ? 43 : this.anomalyScore.hashCode());
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
