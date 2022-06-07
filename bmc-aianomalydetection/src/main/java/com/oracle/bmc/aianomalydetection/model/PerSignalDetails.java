/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Detailed information like statistics, metrics and status for a signal
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PerSignalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PerSignalDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "signalName",
        "mviRatio",
        "isQuantized",
        "fap",
        "min",
        "max",
        "std",
        "status",
        "details"
    })
    public PerSignalDetails(
            String signalName,
            Double mviRatio,
            Boolean isQuantized,
            Float fap,
            Double min,
            Double max,
            Double std,
            Status status,
            String details) {
        super();
        this.signalName = signalName;
        this.mviRatio = mviRatio;
        this.isQuantized = isQuantized;
        this.fap = fap;
        this.min = min;
        this.max = max;
        this.std = std;
        this.status = status;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("signalName")
        private String signalName;

        public Builder signalName(String signalName) {
            this.signalName = signalName;
            this.__explicitlySet__.add("signalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mviRatio")
        private Double mviRatio;

        public Builder mviRatio(Double mviRatio) {
            this.mviRatio = mviRatio;
            this.__explicitlySet__.add("mviRatio");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isQuantized")
        private Boolean isQuantized;

        public Builder isQuantized(Boolean isQuantized) {
            this.isQuantized = isQuantized;
            this.__explicitlySet__.add("isQuantized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fap")
        private Float fap;

        public Builder fap(Float fap) {
            this.fap = fap;
            this.__explicitlySet__.add("fap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Double min;

        public Builder min(Double min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Double max;

        public Builder max(Double max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("std")
        private Double std;

        public Builder std(Double std) {
            this.std = std;
            this.__explicitlySet__.add("std");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PerSignalDetails build() {
            PerSignalDetails __instance__ =
                    new PerSignalDetails(
                            signalName, mviRatio, isQuantized, fap, min, max, std, status, details);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerSignalDetails o) {
            Builder copiedBuilder =
                    signalName(o.getSignalName())
                            .mviRatio(o.getMviRatio())
                            .isQuantized(o.getIsQuantized())
                            .fap(o.getFap())
                            .min(o.getMin())
                            .max(o.getMax())
                            .std(o.getStd())
                            .status(o.getStatus())
                            .details(o.getDetails());

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
     * The name of a signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signalName")
    private final String signalName;

    public String getSignalName() {
        return signalName;
    }

    /**
     * The ratio of missing values in a signal filled/imputed by the IDP algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mviRatio")
    private final Double mviRatio;

    public Double getMviRatio() {
        return mviRatio;
    }

    /**
     * A boolean value to indicate if a signal is quantized or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isQuantized")
    private final Boolean isQuantized;

    public Boolean getIsQuantized() {
        return isQuantized;
    }

    /**
     * Accuracy metric for a signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fap")
    private final Float fap;

    public Float getFap() {
        return fap;
    }

    /**
     * Min value within a signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Double min;

    public Double getMin() {
        return min;
    }

    /**
     * Max value within a signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Double max;

    public Double getMax() {
        return max;
    }

    /**
     * Standard deviation of values within a signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("std")
    private final Double std;

    public Double getStd() {
        return std;
    }

    /**
     * Status of the signal:
     *  * ACCEPTED - the signal is used for training the model
     *  * DROPPED - the signal does not meet requirement, and is dropped before training the model.
     *  * OTHER - placeholder for other status
     *
     **/
    public enum Status {
        Accepted("ACCEPTED"),
        Dropped("DROPPED"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the signal:
     *  * ACCEPTED - the signal is used for training the model
     *  * DROPPED - the signal does not meet requirement, and is dropped before training the model.
     *  * OTHER - placeholder for other status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * detailed information for a signal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PerSignalDetails(");
        sb.append("signalName=").append(String.valueOf(this.signalName));
        sb.append(", mviRatio=").append(String.valueOf(this.mviRatio));
        sb.append(", isQuantized=").append(String.valueOf(this.isQuantized));
        sb.append(", fap=").append(String.valueOf(this.fap));
        sb.append(", min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", std=").append(String.valueOf(this.std));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerSignalDetails)) {
            return false;
        }

        PerSignalDetails other = (PerSignalDetails) o;
        return java.util.Objects.equals(this.signalName, other.signalName)
                && java.util.Objects.equals(this.mviRatio, other.mviRatio)
                && java.util.Objects.equals(this.isQuantized, other.isQuantized)
                && java.util.Objects.equals(this.fap, other.fap)
                && java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.std, other.std)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.signalName == null ? 43 : this.signalName.hashCode());
        result = (result * PRIME) + (this.mviRatio == null ? 43 : this.mviRatio.hashCode());
        result = (result * PRIME) + (this.isQuantized == null ? 43 : this.isQuantized.hashCode());
        result = (result * PRIME) + (this.fap == null ? 43 : this.fap.hashCode());
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + (this.std == null ? 43 : this.std.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
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
