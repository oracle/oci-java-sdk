/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * CPU Usage metric for the host <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostCpuUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostCpuUsage extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Percentage of CPU time spent in user mode */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUserModeInPercent")
        private Float cpuUserModeInPercent;

        /**
         * Percentage of CPU time spent in user mode
         *
         * @param cpuUserModeInPercent the value to set
         * @return this builder
         */
        public Builder cpuUserModeInPercent(Float cpuUserModeInPercent) {
            this.cpuUserModeInPercent = cpuUserModeInPercent;
            this.__explicitlySet__.add("cpuUserModeInPercent");
            return this;
        }
        /** Percentage of CPU time spent in system mode */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuSystemModeInPercent")
        private Float cpuSystemModeInPercent;

        /**
         * Percentage of CPU time spent in system mode
         *
         * @param cpuSystemModeInPercent the value to set
         * @return this builder
         */
        public Builder cpuSystemModeInPercent(Float cpuSystemModeInPercent) {
            this.cpuSystemModeInPercent = cpuSystemModeInPercent;
            this.__explicitlySet__.add("cpuSystemModeInPercent");
            return this;
        }
        /** Amount of CPU Time spent in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSec")
        private Double cpuUsageInSec;

        /**
         * Amount of CPU Time spent in seconds
         *
         * @param cpuUsageInSec the value to set
         * @return this builder
         */
        public Builder cpuUsageInSec(Double cpuUsageInSec) {
            this.cpuUsageInSec = cpuUsageInSec;
            this.__explicitlySet__.add("cpuUsageInSec");
            return this;
        }
        /** Amount of CPU Time spent in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationInPercent")
        private Float cpuUtilizationInPercent;

        /**
         * Amount of CPU Time spent in percentage
         *
         * @param cpuUtilizationInPercent the value to set
         * @return this builder
         */
        public Builder cpuUtilizationInPercent(Float cpuUtilizationInPercent) {
            this.cpuUtilizationInPercent = cpuUtilizationInPercent;
            this.__explicitlySet__.add("cpuUtilizationInPercent");
            return this;
        }
        /** Amount of CPU time stolen in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuStolenInPercent")
        private Float cpuStolenInPercent;

        /**
         * Amount of CPU time stolen in percentage
         *
         * @param cpuStolenInPercent the value to set
         * @return this builder
         */
        public Builder cpuStolenInPercent(Float cpuStolenInPercent) {
            this.cpuStolenInPercent = cpuStolenInPercent;
            this.__explicitlySet__.add("cpuStolenInPercent");
            return this;
        }
        /** Amount of CPU idle time in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuIdleInPercent")
        private Float cpuIdleInPercent;

        /**
         * Amount of CPU idle time in percentage
         *
         * @param cpuIdleInPercent the value to set
         * @return this builder
         */
        public Builder cpuIdleInPercent(Float cpuIdleInPercent) {
            this.cpuIdleInPercent = cpuIdleInPercent;
            this.__explicitlySet__.add("cpuIdleInPercent");
            return this;
        }
        /** Load average in the last 1 minute */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad1min")
        private Float cpuLoad1min;

        /**
         * Load average in the last 1 minute
         *
         * @param cpuLoad1min the value to set
         * @return this builder
         */
        public Builder cpuLoad1min(Float cpuLoad1min) {
            this.cpuLoad1min = cpuLoad1min;
            this.__explicitlySet__.add("cpuLoad1min");
            return this;
        }
        /** Load average in the last 5 minutes */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad5min")
        private Float cpuLoad5min;

        /**
         * Load average in the last 5 minutes
         *
         * @param cpuLoad5min the value to set
         * @return this builder
         */
        public Builder cpuLoad5min(Float cpuLoad5min) {
            this.cpuLoad5min = cpuLoad5min;
            this.__explicitlySet__.add("cpuLoad5min");
            return this;
        }
        /** Load average in the last 15 minutes */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad15min")
        private Float cpuLoad15min;

        /**
         * Load average in the last 15 minutes
         *
         * @param cpuLoad15min the value to set
         * @return this builder
         */
        public Builder cpuLoad15min(Float cpuLoad15min) {
            this.cpuLoad15min = cpuLoad15min;
            this.__explicitlySet__.add("cpuLoad15min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostCpuUsage build() {
            HostCpuUsage model =
                    new HostCpuUsage(
                            this.timeCollected,
                            this.cpuUserModeInPercent,
                            this.cpuSystemModeInPercent,
                            this.cpuUsageInSec,
                            this.cpuUtilizationInPercent,
                            this.cpuStolenInPercent,
                            this.cpuIdleInPercent,
                            this.cpuLoad1min,
                            this.cpuLoad5min,
                            this.cpuLoad15min);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostCpuUsage model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("cpuUserModeInPercent")) {
                this.cpuUserModeInPercent(model.getCpuUserModeInPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuSystemModeInPercent")) {
                this.cpuSystemModeInPercent(model.getCpuSystemModeInPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuUsageInSec")) {
                this.cpuUsageInSec(model.getCpuUsageInSec());
            }
            if (model.wasPropertyExplicitlySet("cpuUtilizationInPercent")) {
                this.cpuUtilizationInPercent(model.getCpuUtilizationInPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuStolenInPercent")) {
                this.cpuStolenInPercent(model.getCpuStolenInPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuIdleInPercent")) {
                this.cpuIdleInPercent(model.getCpuIdleInPercent());
            }
            if (model.wasPropertyExplicitlySet("cpuLoad1min")) {
                this.cpuLoad1min(model.getCpuLoad1min());
            }
            if (model.wasPropertyExplicitlySet("cpuLoad5min")) {
                this.cpuLoad5min(model.getCpuLoad5min());
            }
            if (model.wasPropertyExplicitlySet("cpuLoad15min")) {
                this.cpuLoad15min(model.getCpuLoad15min());
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

    @Deprecated
    public HostCpuUsage(
            java.util.Date timeCollected,
            Float cpuUserModeInPercent,
            Float cpuSystemModeInPercent,
            Double cpuUsageInSec,
            Float cpuUtilizationInPercent,
            Float cpuStolenInPercent,
            Float cpuIdleInPercent,
            Float cpuLoad1min,
            Float cpuLoad5min,
            Float cpuLoad15min) {
        super(timeCollected);
        this.cpuUserModeInPercent = cpuUserModeInPercent;
        this.cpuSystemModeInPercent = cpuSystemModeInPercent;
        this.cpuUsageInSec = cpuUsageInSec;
        this.cpuUtilizationInPercent = cpuUtilizationInPercent;
        this.cpuStolenInPercent = cpuStolenInPercent;
        this.cpuIdleInPercent = cpuIdleInPercent;
        this.cpuLoad1min = cpuLoad1min;
        this.cpuLoad5min = cpuLoad5min;
        this.cpuLoad15min = cpuLoad15min;
    }

    /** Percentage of CPU time spent in user mode */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUserModeInPercent")
    private final Float cpuUserModeInPercent;

    /**
     * Percentage of CPU time spent in user mode
     *
     * @return the value
     */
    public Float getCpuUserModeInPercent() {
        return cpuUserModeInPercent;
    }

    /** Percentage of CPU time spent in system mode */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuSystemModeInPercent")
    private final Float cpuSystemModeInPercent;

    /**
     * Percentage of CPU time spent in system mode
     *
     * @return the value
     */
    public Float getCpuSystemModeInPercent() {
        return cpuSystemModeInPercent;
    }

    /** Amount of CPU Time spent in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSec")
    private final Double cpuUsageInSec;

    /**
     * Amount of CPU Time spent in seconds
     *
     * @return the value
     */
    public Double getCpuUsageInSec() {
        return cpuUsageInSec;
    }

    /** Amount of CPU Time spent in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationInPercent")
    private final Float cpuUtilizationInPercent;

    /**
     * Amount of CPU Time spent in percentage
     *
     * @return the value
     */
    public Float getCpuUtilizationInPercent() {
        return cpuUtilizationInPercent;
    }

    /** Amount of CPU time stolen in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuStolenInPercent")
    private final Float cpuStolenInPercent;

    /**
     * Amount of CPU time stolen in percentage
     *
     * @return the value
     */
    public Float getCpuStolenInPercent() {
        return cpuStolenInPercent;
    }

    /** Amount of CPU idle time in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuIdleInPercent")
    private final Float cpuIdleInPercent;

    /**
     * Amount of CPU idle time in percentage
     *
     * @return the value
     */
    public Float getCpuIdleInPercent() {
        return cpuIdleInPercent;
    }

    /** Load average in the last 1 minute */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad1min")
    private final Float cpuLoad1min;

    /**
     * Load average in the last 1 minute
     *
     * @return the value
     */
    public Float getCpuLoad1min() {
        return cpuLoad1min;
    }

    /** Load average in the last 5 minutes */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad5min")
    private final Float cpuLoad5min;

    /**
     * Load average in the last 5 minutes
     *
     * @return the value
     */
    public Float getCpuLoad5min() {
        return cpuLoad5min;
    }

    /** Load average in the last 15 minutes */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad15min")
    private final Float cpuLoad15min;

    /**
     * Load average in the last 15 minutes
     *
     * @return the value
     */
    public Float getCpuLoad15min() {
        return cpuLoad15min;
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
        sb.append("HostCpuUsage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", cpuUserModeInPercent=").append(String.valueOf(this.cpuUserModeInPercent));
        sb.append(", cpuSystemModeInPercent=").append(String.valueOf(this.cpuSystemModeInPercent));
        sb.append(", cpuUsageInSec=").append(String.valueOf(this.cpuUsageInSec));
        sb.append(", cpuUtilizationInPercent=")
                .append(String.valueOf(this.cpuUtilizationInPercent));
        sb.append(", cpuStolenInPercent=").append(String.valueOf(this.cpuStolenInPercent));
        sb.append(", cpuIdleInPercent=").append(String.valueOf(this.cpuIdleInPercent));
        sb.append(", cpuLoad1min=").append(String.valueOf(this.cpuLoad1min));
        sb.append(", cpuLoad5min=").append(String.valueOf(this.cpuLoad5min));
        sb.append(", cpuLoad15min=").append(String.valueOf(this.cpuLoad15min));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostCpuUsage)) {
            return false;
        }

        HostCpuUsage other = (HostCpuUsage) o;
        return java.util.Objects.equals(this.cpuUserModeInPercent, other.cpuUserModeInPercent)
                && java.util.Objects.equals(
                        this.cpuSystemModeInPercent, other.cpuSystemModeInPercent)
                && java.util.Objects.equals(this.cpuUsageInSec, other.cpuUsageInSec)
                && java.util.Objects.equals(
                        this.cpuUtilizationInPercent, other.cpuUtilizationInPercent)
                && java.util.Objects.equals(this.cpuStolenInPercent, other.cpuStolenInPercent)
                && java.util.Objects.equals(this.cpuIdleInPercent, other.cpuIdleInPercent)
                && java.util.Objects.equals(this.cpuLoad1min, other.cpuLoad1min)
                && java.util.Objects.equals(this.cpuLoad5min, other.cpuLoad5min)
                && java.util.Objects.equals(this.cpuLoad15min, other.cpuLoad15min)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cpuUserModeInPercent == null
                                ? 43
                                : this.cpuUserModeInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuSystemModeInPercent == null
                                ? 43
                                : this.cpuSystemModeInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUsageInSec == null ? 43 : this.cpuUsageInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuUtilizationInPercent == null
                                ? 43
                                : this.cpuUtilizationInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuStolenInPercent == null
                                ? 43
                                : this.cpuStolenInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuIdleInPercent == null ? 43 : this.cpuIdleInPercent.hashCode());
        result = (result * PRIME) + (this.cpuLoad1min == null ? 43 : this.cpuLoad1min.hashCode());
        result = (result * PRIME) + (this.cpuLoad5min == null ? 43 : this.cpuLoad5min.hashCode());
        result = (result * PRIME) + (this.cpuLoad15min == null ? 43 : this.cpuLoad15min.hashCode());
        return result;
    }
}
