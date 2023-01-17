/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * A single subscription's details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubscriptionInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscriptionInfo extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "spmSubscriptionId",
        "service",
        "startDate",
        "endDate",
        "skus"
    })
    public SubscriptionInfo(
            String spmSubscriptionId,
            String service,
            java.util.Date startDate,
            java.util.Date endDate,
            java.util.List<Sku> skus) {
        super();
        this.spmSubscriptionId = spmSubscriptionId;
        this.service = service;
        this.startDate = startDate;
        this.endDate = endDate;
        this.skus = skus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Subscription ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spmSubscriptionId")
        private String spmSubscriptionId;

        /**
         * Subscription ID.
         * @param spmSubscriptionId the value to set
         * @return this builder
         **/
        public Builder spmSubscriptionId(String spmSubscriptionId) {
            this.spmSubscriptionId = spmSubscriptionId;
            this.__explicitlySet__.add("spmSubscriptionId");
            return this;
        }
        /**
         * Service name for subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * Service name for subscription.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * Subscription start date. An RFC 3339-formatted date and time string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        /**
         * Subscription start date. An RFC 3339-formatted date and time string.
         * @param startDate the value to set
         * @return this builder
         **/
        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /**
         * Subscription end date. An RFC 3339-formatted date and time string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        /**
         * Subscription end date. An RFC 3339-formatted date and time string.
         * @param endDate the value to set
         * @return this builder
         **/
        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }
        /**
         * List of SKUs the subscription contains.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<Sku> skus;

        /**
         * List of SKUs the subscription contains.
         * @param skus the value to set
         * @return this builder
         **/
        public Builder skus(java.util.List<Sku> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionInfo build() {
            SubscriptionInfo model =
                    new SubscriptionInfo(
                            this.spmSubscriptionId,
                            this.service,
                            this.startDate,
                            this.endDate,
                            this.skus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionInfo model) {
            if (model.wasPropertyExplicitlySet("spmSubscriptionId")) {
                this.spmSubscriptionId(model.getSpmSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
            }
            if (model.wasPropertyExplicitlySet("skus")) {
                this.skus(model.getSkus());
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
     * Subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spmSubscriptionId")
    private final String spmSubscriptionId;

    /**
     * Subscription ID.
     * @return the value
     **/
    public String getSpmSubscriptionId() {
        return spmSubscriptionId;
    }

    /**
     * Service name for subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * Service name for subscription.
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * Subscription start date. An RFC 3339-formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final java.util.Date startDate;

    /**
     * Subscription start date. An RFC 3339-formatted date and time string.
     * @return the value
     **/
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Subscription end date. An RFC 3339-formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    /**
     * Subscription end date. An RFC 3339-formatted date and time string.
     * @return the value
     **/
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * List of SKUs the subscription contains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    private final java.util.List<Sku> skus;

    /**
     * List of SKUs the subscription contains.
     * @return the value
     **/
    public java.util.List<Sku> getSkus() {
        return skus;
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
        sb.append("SubscriptionInfo(");
        sb.append("super=").append(super.toString());
        sb.append("spmSubscriptionId=").append(String.valueOf(this.spmSubscriptionId));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", skus=").append(String.valueOf(this.skus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionInfo)) {
            return false;
        }

        SubscriptionInfo other = (SubscriptionInfo) o;
        return java.util.Objects.equals(this.spmSubscriptionId, other.spmSubscriptionId)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && java.util.Objects.equals(this.skus, other.skus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.spmSubscriptionId == null ? 43 : this.spmSubscriptionId.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result = (result * PRIME) + (this.skus == null ? 43 : this.skus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
