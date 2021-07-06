/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * A single subscription's details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubscriptionInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SubscriptionInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Subscription id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spmSubscriptionId")
    String spmSubscriptionId;

    /**
     * Service name for subscription
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    String service;

    /**
     * Subscription start date. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    java.util.Date startDate;

    /**
     * Subscription end date. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    java.util.Date endDate;

    /**
     * List of SKUs the subscription contains
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    java.util.List<Sku> skus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
