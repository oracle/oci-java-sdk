/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * Sku details for billing subscription.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BillingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BillingDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sku",
        "metricType",
        "rateAllocation",
        "hasGovSku",
        "meters"
    })
    public BillingDetails(
            String sku,
            MetricType metricType,
            Float rateAllocation,
            Boolean hasGovSku,
            java.util.List<Meter> meters) {
        super();
        this.sku = sku;
        this.metricType = metricType;
        this.rateAllocation = rateAllocation;
        this.hasGovSku = hasGovSku;
        this.meters = meters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Sku for service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * Sku for service.
         * @param sku the value to set
         * @return this builder
         **/
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /**
         * The part's metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        /**
         * The part's metric.
         * @param metricType the value to set
         * @return this builder
         **/
        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }
        /**
         * Tha rate of this sku meter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rateAllocation")
        private Float rateAllocation;

        /**
         * Tha rate of this sku meter.
         * @param rateAllocation the value to set
         * @return this builder
         **/
        public Builder rateAllocation(Float rateAllocation) {
            this.rateAllocation = rateAllocation;
            this.__explicitlySet__.add("rateAllocation");
            return this;
        }
        /**
         * Whether this sku is assign to gov product.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasGovSku")
        private Boolean hasGovSku;

        /**
         * Whether this sku is assign to gov product.
         * @param hasGovSku the value to set
         * @return this builder
         **/
        public Builder hasGovSku(Boolean hasGovSku) {
            this.hasGovSku = hasGovSku;
            this.__explicitlySet__.add("hasGovSku");
            return this;
        }
        /**
         * The meters associated with sku.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("meters")
        private java.util.List<Meter> meters;

        /**
         * The meters associated with sku.
         * @param meters the value to set
         * @return this builder
         **/
        public Builder meters(java.util.List<Meter> meters) {
            this.meters = meters;
            this.__explicitlySet__.add("meters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BillingDetails build() {
            BillingDetails model =
                    new BillingDetails(
                            this.sku,
                            this.metricType,
                            this.rateAllocation,
                            this.hasGovSku,
                            this.meters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BillingDetails model) {
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("rateAllocation")) {
                this.rateAllocation(model.getRateAllocation());
            }
            if (model.wasPropertyExplicitlySet("hasGovSku")) {
                this.hasGovSku(model.getHasGovSku());
            }
            if (model.wasPropertyExplicitlySet("meters")) {
                this.meters(model.getMeters());
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
     * Sku for service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * Sku for service.
     * @return the value
     **/
    public String getSku() {
        return sku;
    }

    /**
     * The part's metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final MetricType metricType;

    /**
     * The part's metric.
     * @return the value
     **/
    public MetricType getMetricType() {
        return metricType;
    }

    /**
     * Tha rate of this sku meter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateAllocation")
    private final Float rateAllocation;

    /**
     * Tha rate of this sku meter.
     * @return the value
     **/
    public Float getRateAllocation() {
        return rateAllocation;
    }

    /**
     * Whether this sku is assign to gov product.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasGovSku")
    private final Boolean hasGovSku;

    /**
     * Whether this sku is assign to gov product.
     * @return the value
     **/
    public Boolean getHasGovSku() {
        return hasGovSku;
    }

    /**
     * The meters associated with sku.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meters")
    private final java.util.List<Meter> meters;

    /**
     * The meters associated with sku.
     * @return the value
     **/
    public java.util.List<Meter> getMeters() {
        return meters;
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
        sb.append("BillingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
        sb.append(", metricType=").append(String.valueOf(this.metricType));
        sb.append(", rateAllocation=").append(String.valueOf(this.rateAllocation));
        sb.append(", hasGovSku=").append(String.valueOf(this.hasGovSku));
        sb.append(", meters=").append(String.valueOf(this.meters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BillingDetails)) {
            return false;
        }

        BillingDetails other = (BillingDetails) o;
        return java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(this.rateAllocation, other.rateAllocation)
                && java.util.Objects.equals(this.hasGovSku, other.hasGovSku)
                && java.util.Objects.equals(this.meters, other.meters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
        result =
                (result * PRIME)
                        + (this.rateAllocation == null ? 43 : this.rateAllocation.hashCode());
        result = (result * PRIME) + (this.hasGovSku == null ? 43 : this.hasGovSku.hashCode());
        result = (result * PRIME) + (this.meters == null ? 43 : this.meters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
