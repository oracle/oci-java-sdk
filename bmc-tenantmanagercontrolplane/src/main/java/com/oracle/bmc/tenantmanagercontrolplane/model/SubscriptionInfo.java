/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public final class SubscriptionInfo {
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
        @com.fasterxml.jackson.annotation.JsonProperty("spmSubscriptionId")
        private String spmSubscriptionId;

        public Builder spmSubscriptionId(String spmSubscriptionId) {
            this.spmSubscriptionId = spmSubscriptionId;
            this.__explicitlySet__.add("spmSubscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<Sku> skus;

        public Builder skus(java.util.List<Sku> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionInfo build() {
            SubscriptionInfo __instance__ =
                    new SubscriptionInfo(spmSubscriptionId, service, startDate, endDate, skus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionInfo o) {
            Builder copiedBuilder =
                    spmSubscriptionId(o.getSpmSubscriptionId())
                            .service(o.getService())
                            .startDate(o.getStartDate())
                            .endDate(o.getEndDate())
                            .skus(o.getSkus());

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
     * Subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spmSubscriptionId")
    private final String spmSubscriptionId;

    public String getSpmSubscriptionId() {
        return spmSubscriptionId;
    }

    /**
     * Service name for subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    public String getService() {
        return service;
    }

    /**
     * Subscription start date. An RFC 3339-formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final java.util.Date startDate;

    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Subscription end date. An RFC 3339-formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * List of SKUs the subscription contains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    private final java.util.List<Sku> skus;

    public java.util.List<Sku> getSkus() {
        return skus;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SubscriptionInfo(");
        sb.append("spmSubscriptionId=").append(String.valueOf(this.spmSubscriptionId));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", skus=").append(String.valueOf(this.skus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
