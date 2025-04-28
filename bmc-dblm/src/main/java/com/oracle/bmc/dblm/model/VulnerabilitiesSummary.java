/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * Summary of vulnerabilities found in registered resources grouped by severity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VulnerabilitiesSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VulnerabilitiesSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"total", "critical", "high", "medium", "info", "low"})
    public VulnerabilitiesSummary(
            Integer total,
            Integer critical,
            Integer high,
            Integer medium,
            Integer info,
            Integer low) {
        super();
        this.total = total;
        this.critical = critical;
        this.high = high;
        this.medium = medium;
        this.info = info;
        this.low = low;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        /**
         * Total number of vulnerabilities.
         *
         * @param total the value to set
         * @return this builder
         */
        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }
        /** Cumulative number of resources that have critical level vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("critical")
        private Integer critical;

        /**
         * Cumulative number of resources that have critical level vulnerabilities.
         *
         * @param critical the value to set
         * @return this builder
         */
        public Builder critical(Integer critical) {
            this.critical = critical;
            this.__explicitlySet__.add("critical");
            return this;
        }
        /** Cumulative number of resources that have high level vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private Integer high;

        /**
         * Cumulative number of resources that have high level vulnerabilities.
         *
         * @param high the value to set
         * @return this builder
         */
        public Builder high(Integer high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }
        /** Cumulative number of resources that have medium level vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("medium")
        private Integer medium;

        /**
         * Cumulative number of resources that have medium level vulnerabilities.
         *
         * @param medium the value to set
         * @return this builder
         */
        public Builder medium(Integer medium) {
            this.medium = medium;
            this.__explicitlySet__.add("medium");
            return this;
        }
        /** Cumulative number of resources that have info level vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("info")
        private Integer info;

        /**
         * Cumulative number of resources that have info level vulnerabilities.
         *
         * @param info the value to set
         * @return this builder
         */
        public Builder info(Integer info) {
            this.info = info;
            this.__explicitlySet__.add("info");
            return this;
        }
        /** Cumulative number of resources that have low level vulnerabilities. */
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private Integer low;

        /**
         * Cumulative number of resources that have low level vulnerabilities.
         *
         * @param low the value to set
         * @return this builder
         */
        public Builder low(Integer low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VulnerabilitiesSummary build() {
            VulnerabilitiesSummary model =
                    new VulnerabilitiesSummary(
                            this.total, this.critical, this.high, this.medium, this.info, this.low);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VulnerabilitiesSummary model) {
            if (model.wasPropertyExplicitlySet("total")) {
                this.total(model.getTotal());
            }
            if (model.wasPropertyExplicitlySet("critical")) {
                this.critical(model.getCritical());
            }
            if (model.wasPropertyExplicitlySet("high")) {
                this.high(model.getHigh());
            }
            if (model.wasPropertyExplicitlySet("medium")) {
                this.medium(model.getMedium());
            }
            if (model.wasPropertyExplicitlySet("info")) {
                this.info(model.getInfo());
            }
            if (model.wasPropertyExplicitlySet("low")) {
                this.low(model.getLow());
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

    /** Total number of vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

    /**
     * Total number of vulnerabilities.
     *
     * @return the value
     */
    public Integer getTotal() {
        return total;
    }

    /** Cumulative number of resources that have critical level vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("critical")
    private final Integer critical;

    /**
     * Cumulative number of resources that have critical level vulnerabilities.
     *
     * @return the value
     */
    public Integer getCritical() {
        return critical;
    }

    /** Cumulative number of resources that have high level vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final Integer high;

    /**
     * Cumulative number of resources that have high level vulnerabilities.
     *
     * @return the value
     */
    public Integer getHigh() {
        return high;
    }

    /** Cumulative number of resources that have medium level vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    private final Integer medium;

    /**
     * Cumulative number of resources that have medium level vulnerabilities.
     *
     * @return the value
     */
    public Integer getMedium() {
        return medium;
    }

    /** Cumulative number of resources that have info level vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("info")
    private final Integer info;

    /**
     * Cumulative number of resources that have info level vulnerabilities.
     *
     * @return the value
     */
    public Integer getInfo() {
        return info;
    }

    /** Cumulative number of resources that have low level vulnerabilities. */
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final Integer low;

    /**
     * Cumulative number of resources that have low level vulnerabilities.
     *
     * @return the value
     */
    public Integer getLow() {
        return low;
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
        sb.append("VulnerabilitiesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("total=").append(String.valueOf(this.total));
        sb.append(", critical=").append(String.valueOf(this.critical));
        sb.append(", high=").append(String.valueOf(this.high));
        sb.append(", medium=").append(String.valueOf(this.medium));
        sb.append(", info=").append(String.valueOf(this.info));
        sb.append(", low=").append(String.valueOf(this.low));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VulnerabilitiesSummary)) {
            return false;
        }

        VulnerabilitiesSummary other = (VulnerabilitiesSummary) o;
        return java.util.Objects.equals(this.total, other.total)
                && java.util.Objects.equals(this.critical, other.critical)
                && java.util.Objects.equals(this.high, other.high)
                && java.util.Objects.equals(this.medium, other.medium)
                && java.util.Objects.equals(this.info, other.info)
                && java.util.Objects.equals(this.low, other.low)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + (this.critical == null ? 43 : this.critical.hashCode());
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + (this.medium == null ? 43 : this.medium.hashCode());
        result = (result * PRIME) + (this.info == null ? 43 : this.info.hashCode());
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
