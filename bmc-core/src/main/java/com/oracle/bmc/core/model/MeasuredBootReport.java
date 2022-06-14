/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The measured boot report for a shielded instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MeasuredBootReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MeasuredBootReport {
    @Deprecated
    @java.beans.ConstructorProperties({"isPolicyVerificationSuccessful", "measurements"})
    public MeasuredBootReport(
            Boolean isPolicyVerificationSuccessful, MeasuredBootReportMeasurements measurements) {
        super();
        this.isPolicyVerificationSuccessful = isPolicyVerificationSuccessful;
        this.measurements = measurements;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the verification succeeded, and the new values match the expected values.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPolicyVerificationSuccessful")
        private Boolean isPolicyVerificationSuccessful;

        /**
         * Whether the verification succeeded, and the new values match the expected values.
         *
         * @param isPolicyVerificationSuccessful the value to set
         * @return this builder
         **/
        public Builder isPolicyVerificationSuccessful(Boolean isPolicyVerificationSuccessful) {
            this.isPolicyVerificationSuccessful = isPolicyVerificationSuccessful;
            this.__explicitlySet__.add("isPolicyVerificationSuccessful");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("measurements")
        private MeasuredBootReportMeasurements measurements;

        public Builder measurements(MeasuredBootReportMeasurements measurements) {
            this.measurements = measurements;
            this.__explicitlySet__.add("measurements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeasuredBootReport build() {
            MeasuredBootReport __instance__ =
                    new MeasuredBootReport(isPolicyVerificationSuccessful, measurements);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeasuredBootReport o) {
            Builder copiedBuilder =
                    isPolicyVerificationSuccessful(o.getIsPolicyVerificationSuccessful())
                            .measurements(o.getMeasurements());

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
     * Whether the verification succeeded, and the new values match the expected values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPolicyVerificationSuccessful")
    private final Boolean isPolicyVerificationSuccessful;

    /**
     * Whether the verification succeeded, and the new values match the expected values.
     *
     * @return the value
     **/
    public Boolean getIsPolicyVerificationSuccessful() {
        return isPolicyVerificationSuccessful;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("measurements")
    private final MeasuredBootReportMeasurements measurements;

    public MeasuredBootReportMeasurements getMeasurements() {
        return measurements;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MeasuredBootReport(");
        sb.append("isPolicyVerificationSuccessful=")
                .append(String.valueOf(this.isPolicyVerificationSuccessful));
        sb.append(", measurements=").append(String.valueOf(this.measurements));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeasuredBootReport)) {
            return false;
        }

        MeasuredBootReport other = (MeasuredBootReport) o;
        return java.util.Objects.equals(
                        this.isPolicyVerificationSuccessful, other.isPolicyVerificationSuccessful)
                && java.util.Objects.equals(this.measurements, other.measurements)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPolicyVerificationSuccessful == null
                                ? 43
                                : this.isPolicyVerificationSuccessful.hashCode());
        result = (result * PRIME) + (this.measurements == null ? 43 : this.measurements.hashCode());
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
