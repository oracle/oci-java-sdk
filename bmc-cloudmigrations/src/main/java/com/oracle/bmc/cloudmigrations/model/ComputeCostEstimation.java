/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Cost estimation for compute <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeCostEstimation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeCostEstimation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ocpuPerHour",
        "ocpuPerHourBySubscription",
        "memoryGbPerHour",
        "memoryGbPerHourBySubscription",
        "gpuPerHour",
        "gpuPerHourBySubscription",
        "totalPerHour",
        "totalPerHourBySubscription",
        "ocpuCount",
        "memoryAmountGb",
        "gpuCount"
    })
    public ComputeCostEstimation(
            java.math.BigDecimal ocpuPerHour,
            java.math.BigDecimal ocpuPerHourBySubscription,
            java.math.BigDecimal memoryGbPerHour,
            java.math.BigDecimal memoryGbPerHourBySubscription,
            java.math.BigDecimal gpuPerHour,
            java.math.BigDecimal gpuPerHourBySubscription,
            java.math.BigDecimal totalPerHour,
            java.math.BigDecimal totalPerHourBySubscription,
            java.math.BigDecimal ocpuCount,
            java.math.BigDecimal memoryAmountGb,
            java.math.BigDecimal gpuCount) {
        super();
        this.ocpuPerHour = ocpuPerHour;
        this.ocpuPerHourBySubscription = ocpuPerHourBySubscription;
        this.memoryGbPerHour = memoryGbPerHour;
        this.memoryGbPerHourBySubscription = memoryGbPerHourBySubscription;
        this.gpuPerHour = gpuPerHour;
        this.gpuPerHourBySubscription = gpuPerHourBySubscription;
        this.totalPerHour = totalPerHour;
        this.totalPerHourBySubscription = totalPerHourBySubscription;
        this.ocpuCount = ocpuCount;
        this.memoryAmountGb = memoryAmountGb;
        this.gpuCount = gpuCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCPU per hour */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuPerHour")
        private java.math.BigDecimal ocpuPerHour;

        /**
         * OCPU per hour
         *
         * @param ocpuPerHour the value to set
         * @return this builder
         */
        public Builder ocpuPerHour(java.math.BigDecimal ocpuPerHour) {
            this.ocpuPerHour = ocpuPerHour;
            this.__explicitlySet__.add("ocpuPerHour");
            return this;
        }
        /** OCPU per hour by subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuPerHourBySubscription")
        private java.math.BigDecimal ocpuPerHourBySubscription;

        /**
         * OCPU per hour by subscription
         *
         * @param ocpuPerHourBySubscription the value to set
         * @return this builder
         */
        public Builder ocpuPerHourBySubscription(java.math.BigDecimal ocpuPerHourBySubscription) {
            this.ocpuPerHourBySubscription = ocpuPerHourBySubscription;
            this.__explicitlySet__.add("ocpuPerHourBySubscription");
            return this;
        }
        /** Gigabyte per hour */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryGbPerHour")
        private java.math.BigDecimal memoryGbPerHour;

        /**
         * Gigabyte per hour
         *
         * @param memoryGbPerHour the value to set
         * @return this builder
         */
        public Builder memoryGbPerHour(java.math.BigDecimal memoryGbPerHour) {
            this.memoryGbPerHour = memoryGbPerHour;
            this.__explicitlySet__.add("memoryGbPerHour");
            return this;
        }
        /** Gigabyte per hour by subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryGbPerHourBySubscription")
        private java.math.BigDecimal memoryGbPerHourBySubscription;

        /**
         * Gigabyte per hour by subscription
         *
         * @param memoryGbPerHourBySubscription the value to set
         * @return this builder
         */
        public Builder memoryGbPerHourBySubscription(
                java.math.BigDecimal memoryGbPerHourBySubscription) {
            this.memoryGbPerHourBySubscription = memoryGbPerHourBySubscription;
            this.__explicitlySet__.add("memoryGbPerHourBySubscription");
            return this;
        }
        /** GPU per hour */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuPerHour")
        private java.math.BigDecimal gpuPerHour;

        /**
         * GPU per hour
         *
         * @param gpuPerHour the value to set
         * @return this builder
         */
        public Builder gpuPerHour(java.math.BigDecimal gpuPerHour) {
            this.gpuPerHour = gpuPerHour;
            this.__explicitlySet__.add("gpuPerHour");
            return this;
        }
        /** GPU per hour by subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuPerHourBySubscription")
        private java.math.BigDecimal gpuPerHourBySubscription;

        /**
         * GPU per hour by subscription
         *
         * @param gpuPerHourBySubscription the value to set
         * @return this builder
         */
        public Builder gpuPerHourBySubscription(java.math.BigDecimal gpuPerHourBySubscription) {
            this.gpuPerHourBySubscription = gpuPerHourBySubscription;
            this.__explicitlySet__.add("gpuPerHourBySubscription");
            return this;
        }
        /** Total per hour */
        @com.fasterxml.jackson.annotation.JsonProperty("totalPerHour")
        private java.math.BigDecimal totalPerHour;

        /**
         * Total per hour
         *
         * @param totalPerHour the value to set
         * @return this builder
         */
        public Builder totalPerHour(java.math.BigDecimal totalPerHour) {
            this.totalPerHour = totalPerHour;
            this.__explicitlySet__.add("totalPerHour");
            return this;
        }
        /** Total usage per hour by subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("totalPerHourBySubscription")
        private java.math.BigDecimal totalPerHourBySubscription;

        /**
         * Total usage per hour by subscription
         *
         * @param totalPerHourBySubscription the value to set
         * @return this builder
         */
        public Builder totalPerHourBySubscription(java.math.BigDecimal totalPerHourBySubscription) {
            this.totalPerHourBySubscription = totalPerHourBySubscription;
            this.__explicitlySet__.add("totalPerHourBySubscription");
            return this;
        }
        /** Total number of OCPUs */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private java.math.BigDecimal ocpuCount;

        /**
         * Total number of OCPUs
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(java.math.BigDecimal ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** Total usage of memory */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryAmountGb")
        private java.math.BigDecimal memoryAmountGb;

        /**
         * Total usage of memory
         *
         * @param memoryAmountGb the value to set
         * @return this builder
         */
        public Builder memoryAmountGb(java.math.BigDecimal memoryAmountGb) {
            this.memoryAmountGb = memoryAmountGb;
            this.__explicitlySet__.add("memoryAmountGb");
            return this;
        }
        /** Total number of GPU */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuCount")
        private java.math.BigDecimal gpuCount;

        /**
         * Total number of GPU
         *
         * @param gpuCount the value to set
         * @return this builder
         */
        public Builder gpuCount(java.math.BigDecimal gpuCount) {
            this.gpuCount = gpuCount;
            this.__explicitlySet__.add("gpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeCostEstimation build() {
            ComputeCostEstimation model =
                    new ComputeCostEstimation(
                            this.ocpuPerHour,
                            this.ocpuPerHourBySubscription,
                            this.memoryGbPerHour,
                            this.memoryGbPerHourBySubscription,
                            this.gpuPerHour,
                            this.gpuPerHourBySubscription,
                            this.totalPerHour,
                            this.totalPerHourBySubscription,
                            this.ocpuCount,
                            this.memoryAmountGb,
                            this.gpuCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeCostEstimation model) {
            if (model.wasPropertyExplicitlySet("ocpuPerHour")) {
                this.ocpuPerHour(model.getOcpuPerHour());
            }
            if (model.wasPropertyExplicitlySet("ocpuPerHourBySubscription")) {
                this.ocpuPerHourBySubscription(model.getOcpuPerHourBySubscription());
            }
            if (model.wasPropertyExplicitlySet("memoryGbPerHour")) {
                this.memoryGbPerHour(model.getMemoryGbPerHour());
            }
            if (model.wasPropertyExplicitlySet("memoryGbPerHourBySubscription")) {
                this.memoryGbPerHourBySubscription(model.getMemoryGbPerHourBySubscription());
            }
            if (model.wasPropertyExplicitlySet("gpuPerHour")) {
                this.gpuPerHour(model.getGpuPerHour());
            }
            if (model.wasPropertyExplicitlySet("gpuPerHourBySubscription")) {
                this.gpuPerHourBySubscription(model.getGpuPerHourBySubscription());
            }
            if (model.wasPropertyExplicitlySet("totalPerHour")) {
                this.totalPerHour(model.getTotalPerHour());
            }
            if (model.wasPropertyExplicitlySet("totalPerHourBySubscription")) {
                this.totalPerHourBySubscription(model.getTotalPerHourBySubscription());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("memoryAmountGb")) {
                this.memoryAmountGb(model.getMemoryAmountGb());
            }
            if (model.wasPropertyExplicitlySet("gpuCount")) {
                this.gpuCount(model.getGpuCount());
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

    /** OCPU per hour */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuPerHour")
    private final java.math.BigDecimal ocpuPerHour;

    /**
     * OCPU per hour
     *
     * @return the value
     */
    public java.math.BigDecimal getOcpuPerHour() {
        return ocpuPerHour;
    }

    /** OCPU per hour by subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuPerHourBySubscription")
    private final java.math.BigDecimal ocpuPerHourBySubscription;

    /**
     * OCPU per hour by subscription
     *
     * @return the value
     */
    public java.math.BigDecimal getOcpuPerHourBySubscription() {
        return ocpuPerHourBySubscription;
    }

    /** Gigabyte per hour */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryGbPerHour")
    private final java.math.BigDecimal memoryGbPerHour;

    /**
     * Gigabyte per hour
     *
     * @return the value
     */
    public java.math.BigDecimal getMemoryGbPerHour() {
        return memoryGbPerHour;
    }

    /** Gigabyte per hour by subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryGbPerHourBySubscription")
    private final java.math.BigDecimal memoryGbPerHourBySubscription;

    /**
     * Gigabyte per hour by subscription
     *
     * @return the value
     */
    public java.math.BigDecimal getMemoryGbPerHourBySubscription() {
        return memoryGbPerHourBySubscription;
    }

    /** GPU per hour */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuPerHour")
    private final java.math.BigDecimal gpuPerHour;

    /**
     * GPU per hour
     *
     * @return the value
     */
    public java.math.BigDecimal getGpuPerHour() {
        return gpuPerHour;
    }

    /** GPU per hour by subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuPerHourBySubscription")
    private final java.math.BigDecimal gpuPerHourBySubscription;

    /**
     * GPU per hour by subscription
     *
     * @return the value
     */
    public java.math.BigDecimal getGpuPerHourBySubscription() {
        return gpuPerHourBySubscription;
    }

    /** Total per hour */
    @com.fasterxml.jackson.annotation.JsonProperty("totalPerHour")
    private final java.math.BigDecimal totalPerHour;

    /**
     * Total per hour
     *
     * @return the value
     */
    public java.math.BigDecimal getTotalPerHour() {
        return totalPerHour;
    }

    /** Total usage per hour by subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("totalPerHourBySubscription")
    private final java.math.BigDecimal totalPerHourBySubscription;

    /**
     * Total usage per hour by subscription
     *
     * @return the value
     */
    public java.math.BigDecimal getTotalPerHourBySubscription() {
        return totalPerHourBySubscription;
    }

    /** Total number of OCPUs */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final java.math.BigDecimal ocpuCount;

    /**
     * Total number of OCPUs
     *
     * @return the value
     */
    public java.math.BigDecimal getOcpuCount() {
        return ocpuCount;
    }

    /** Total usage of memory */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryAmountGb")
    private final java.math.BigDecimal memoryAmountGb;

    /**
     * Total usage of memory
     *
     * @return the value
     */
    public java.math.BigDecimal getMemoryAmountGb() {
        return memoryAmountGb;
    }

    /** Total number of GPU */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuCount")
    private final java.math.BigDecimal gpuCount;

    /**
     * Total number of GPU
     *
     * @return the value
     */
    public java.math.BigDecimal getGpuCount() {
        return gpuCount;
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
        sb.append("ComputeCostEstimation(");
        sb.append("super=").append(super.toString());
        sb.append("ocpuPerHour=").append(String.valueOf(this.ocpuPerHour));
        sb.append(", ocpuPerHourBySubscription=")
                .append(String.valueOf(this.ocpuPerHourBySubscription));
        sb.append(", memoryGbPerHour=").append(String.valueOf(this.memoryGbPerHour));
        sb.append(", memoryGbPerHourBySubscription=")
                .append(String.valueOf(this.memoryGbPerHourBySubscription));
        sb.append(", gpuPerHour=").append(String.valueOf(this.gpuPerHour));
        sb.append(", gpuPerHourBySubscription=")
                .append(String.valueOf(this.gpuPerHourBySubscription));
        sb.append(", totalPerHour=").append(String.valueOf(this.totalPerHour));
        sb.append(", totalPerHourBySubscription=")
                .append(String.valueOf(this.totalPerHourBySubscription));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memoryAmountGb=").append(String.valueOf(this.memoryAmountGb));
        sb.append(", gpuCount=").append(String.valueOf(this.gpuCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeCostEstimation)) {
            return false;
        }

        ComputeCostEstimation other = (ComputeCostEstimation) o;
        return java.util.Objects.equals(this.ocpuPerHour, other.ocpuPerHour)
                && java.util.Objects.equals(
                        this.ocpuPerHourBySubscription, other.ocpuPerHourBySubscription)
                && java.util.Objects.equals(this.memoryGbPerHour, other.memoryGbPerHour)
                && java.util.Objects.equals(
                        this.memoryGbPerHourBySubscription, other.memoryGbPerHourBySubscription)
                && java.util.Objects.equals(this.gpuPerHour, other.gpuPerHour)
                && java.util.Objects.equals(
                        this.gpuPerHourBySubscription, other.gpuPerHourBySubscription)
                && java.util.Objects.equals(this.totalPerHour, other.totalPerHour)
                && java.util.Objects.equals(
                        this.totalPerHourBySubscription, other.totalPerHourBySubscription)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memoryAmountGb, other.memoryAmountGb)
                && java.util.Objects.equals(this.gpuCount, other.gpuCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpuPerHour == null ? 43 : this.ocpuPerHour.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuPerHourBySubscription == null
                                ? 43
                                : this.ocpuPerHourBySubscription.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryGbPerHour == null ? 43 : this.memoryGbPerHour.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryGbPerHourBySubscription == null
                                ? 43
                                : this.memoryGbPerHourBySubscription.hashCode());
        result = (result * PRIME) + (this.gpuPerHour == null ? 43 : this.gpuPerHour.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuPerHourBySubscription == null
                                ? 43
                                : this.gpuPerHourBySubscription.hashCode());
        result = (result * PRIME) + (this.totalPerHour == null ? 43 : this.totalPerHour.hashCode());
        result =
                (result * PRIME)
                        + (this.totalPerHourBySubscription == null
                                ? 43
                                : this.totalPerHourBySubscription.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryAmountGb == null ? 43 : this.memoryAmountGb.hashCode());
        result = (result * PRIME) + (this.gpuCount == null ? 43 : this.gpuCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
