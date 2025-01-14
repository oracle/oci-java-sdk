/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Cost estimation for volume <br>
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
        builder = VolumeCostEstimation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VolumeCostEstimation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "capacityGb",
        "description",
        "totalGbPerMonth",
        "totalGbPerMonthBySubscription"
    })
    public VolumeCostEstimation(
            java.math.BigDecimal capacityGb,
            String description,
            java.math.BigDecimal totalGbPerMonth,
            java.math.BigDecimal totalGbPerMonthBySubscription) {
        super();
        this.capacityGb = capacityGb;
        this.description = description;
        this.totalGbPerMonth = totalGbPerMonth;
        this.totalGbPerMonthBySubscription = totalGbPerMonthBySubscription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Gigabyte storage capacity */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityGb")
        private java.math.BigDecimal capacityGb;

        /**
         * Gigabyte storage capacity
         *
         * @param capacityGb the value to set
         * @return this builder
         */
        public Builder capacityGb(java.math.BigDecimal capacityGb) {
            this.capacityGb = capacityGb;
            this.__explicitlySet__.add("capacityGb");
            return this;
        }
        /** Volume description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Volume description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Gigabyte storage capacity per month. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonth")
        private java.math.BigDecimal totalGbPerMonth;

        /**
         * Gigabyte storage capacity per month.
         *
         * @param totalGbPerMonth the value to set
         * @return this builder
         */
        public Builder totalGbPerMonth(java.math.BigDecimal totalGbPerMonth) {
            this.totalGbPerMonth = totalGbPerMonth;
            this.__explicitlySet__.add("totalGbPerMonth");
            return this;
        }
        /** Gigabyte storage capacity per month by subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonthBySubscription")
        private java.math.BigDecimal totalGbPerMonthBySubscription;

        /**
         * Gigabyte storage capacity per month by subscription
         *
         * @param totalGbPerMonthBySubscription the value to set
         * @return this builder
         */
        public Builder totalGbPerMonthBySubscription(
                java.math.BigDecimal totalGbPerMonthBySubscription) {
            this.totalGbPerMonthBySubscription = totalGbPerMonthBySubscription;
            this.__explicitlySet__.add("totalGbPerMonthBySubscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeCostEstimation build() {
            VolumeCostEstimation model =
                    new VolumeCostEstimation(
                            this.capacityGb,
                            this.description,
                            this.totalGbPerMonth,
                            this.totalGbPerMonthBySubscription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeCostEstimation model) {
            if (model.wasPropertyExplicitlySet("capacityGb")) {
                this.capacityGb(model.getCapacityGb());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("totalGbPerMonth")) {
                this.totalGbPerMonth(model.getTotalGbPerMonth());
            }
            if (model.wasPropertyExplicitlySet("totalGbPerMonthBySubscription")) {
                this.totalGbPerMonthBySubscription(model.getTotalGbPerMonthBySubscription());
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

    /** Gigabyte storage capacity */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityGb")
    private final java.math.BigDecimal capacityGb;

    /**
     * Gigabyte storage capacity
     *
     * @return the value
     */
    public java.math.BigDecimal getCapacityGb() {
        return capacityGb;
    }

    /** Volume description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Volume description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Gigabyte storage capacity per month. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonth")
    private final java.math.BigDecimal totalGbPerMonth;

    /**
     * Gigabyte storage capacity per month.
     *
     * @return the value
     */
    public java.math.BigDecimal getTotalGbPerMonth() {
        return totalGbPerMonth;
    }

    /** Gigabyte storage capacity per month by subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonthBySubscription")
    private final java.math.BigDecimal totalGbPerMonthBySubscription;

    /**
     * Gigabyte storage capacity per month by subscription
     *
     * @return the value
     */
    public java.math.BigDecimal getTotalGbPerMonthBySubscription() {
        return totalGbPerMonthBySubscription;
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
        sb.append("VolumeCostEstimation(");
        sb.append("super=").append(super.toString());
        sb.append("capacityGb=").append(String.valueOf(this.capacityGb));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", totalGbPerMonth=").append(String.valueOf(this.totalGbPerMonth));
        sb.append(", totalGbPerMonthBySubscription=")
                .append(String.valueOf(this.totalGbPerMonthBySubscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeCostEstimation)) {
            return false;
        }

        VolumeCostEstimation other = (VolumeCostEstimation) o;
        return java.util.Objects.equals(this.capacityGb, other.capacityGb)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.totalGbPerMonth, other.totalGbPerMonth)
                && java.util.Objects.equals(
                        this.totalGbPerMonthBySubscription, other.totalGbPerMonthBySubscription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capacityGb == null ? 43 : this.capacityGb.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.totalGbPerMonth == null ? 43 : this.totalGbPerMonth.hashCode());
        result =
                (result * PRIME)
                        + (this.totalGbPerMonthBySubscription == null
                                ? 43
                                : this.totalGbPerMonthBySubscription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
