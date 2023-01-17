/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Cost estimation for storage
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StorageCostEstimation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StorageCostEstimation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "volumes",
        "totalGbPerMonth",
        "totalGbPerMonthBySubscription"
    })
    public StorageCostEstimation(
            java.util.List<VolumeCostEstimation> volumes,
            java.math.BigDecimal totalGbPerMonth,
            java.math.BigDecimal totalGbPerMonthBySubscription) {
        super();
        this.volumes = volumes;
        this.totalGbPerMonth = totalGbPerMonth;
        this.totalGbPerMonthBySubscription = totalGbPerMonthBySubscription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Volume estimation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumes")
        private java.util.List<VolumeCostEstimation> volumes;

        /**
         * Volume estimation
         * @param volumes the value to set
         * @return this builder
         **/
        public Builder volumes(java.util.List<VolumeCostEstimation> volumes) {
            this.volumes = volumes;
            this.__explicitlySet__.add("volumes");
            return this;
        }
        /**
         * Gigabyte storage capacity per month.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonth")
        private java.math.BigDecimal totalGbPerMonth;

        /**
         * Gigabyte storage capacity per month.
         * @param totalGbPerMonth the value to set
         * @return this builder
         **/
        public Builder totalGbPerMonth(java.math.BigDecimal totalGbPerMonth) {
            this.totalGbPerMonth = totalGbPerMonth;
            this.__explicitlySet__.add("totalGbPerMonth");
            return this;
        }
        /**
         * Gigabyte storage capacity per month by subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonthBySubscription")
        private java.math.BigDecimal totalGbPerMonthBySubscription;

        /**
         * Gigabyte storage capacity per month by subscription.
         * @param totalGbPerMonthBySubscription the value to set
         * @return this builder
         **/
        public Builder totalGbPerMonthBySubscription(
                java.math.BigDecimal totalGbPerMonthBySubscription) {
            this.totalGbPerMonthBySubscription = totalGbPerMonthBySubscription;
            this.__explicitlySet__.add("totalGbPerMonthBySubscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageCostEstimation build() {
            StorageCostEstimation model =
                    new StorageCostEstimation(
                            this.volumes, this.totalGbPerMonth, this.totalGbPerMonthBySubscription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageCostEstimation model) {
            if (model.wasPropertyExplicitlySet("volumes")) {
                this.volumes(model.getVolumes());
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
     * Volume estimation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumes")
    private final java.util.List<VolumeCostEstimation> volumes;

    /**
     * Volume estimation
     * @return the value
     **/
    public java.util.List<VolumeCostEstimation> getVolumes() {
        return volumes;
    }

    /**
     * Gigabyte storage capacity per month.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonth")
    private final java.math.BigDecimal totalGbPerMonth;

    /**
     * Gigabyte storage capacity per month.
     * @return the value
     **/
    public java.math.BigDecimal getTotalGbPerMonth() {
        return totalGbPerMonth;
    }

    /**
     * Gigabyte storage capacity per month by subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalGbPerMonthBySubscription")
    private final java.math.BigDecimal totalGbPerMonthBySubscription;

    /**
     * Gigabyte storage capacity per month by subscription.
     * @return the value
     **/
    public java.math.BigDecimal getTotalGbPerMonthBySubscription() {
        return totalGbPerMonthBySubscription;
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
        sb.append("StorageCostEstimation(");
        sb.append("super=").append(super.toString());
        sb.append("volumes=").append(String.valueOf(this.volumes));
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
        if (!(o instanceof StorageCostEstimation)) {
            return false;
        }

        StorageCostEstimation other = (StorageCostEstimation) o;
        return java.util.Objects.equals(this.volumes, other.volumes)
                && java.util.Objects.equals(this.totalGbPerMonth, other.totalGbPerMonth)
                && java.util.Objects.equals(
                        this.totalGbPerMonthBySubscription, other.totalGbPerMonthBySubscription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.volumes == null ? 43 : this.volumes.hashCode());
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
