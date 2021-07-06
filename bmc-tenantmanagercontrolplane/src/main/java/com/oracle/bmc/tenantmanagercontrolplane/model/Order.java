/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Order Details for Console plugin display
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Order.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Order {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private String orderNumber;

        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
        private String dataCenterRegion;

        public Builder dataCenterRegion(String dataCenterRegion) {
            this.dataCenterRegion = dataCenterRegion;
            this.__explicitlySet__.add("dataCenterRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("orderState")
        private String orderState;

        public Builder orderState(String orderState) {
            this.orderState = orderState;
            this.__explicitlySet__.add("orderState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
        private java.util.List<SubscriptionInfo> subscriptions;

        public Builder subscriptions(java.util.List<SubscriptionInfo> subscriptions) {
            this.subscriptions = subscriptions;
            this.__explicitlySet__.add("subscriptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Order build() {
            Order __instance__ =
                    new Order(orderNumber, dataCenterRegion, adminEmail, orderState, subscriptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Order o) {
            Builder copiedBuilder =
                    orderNumber(o.getOrderNumber())
                            .dataCenterRegion(o.getDataCenterRegion())
                            .adminEmail(o.getAdminEmail())
                            .orderState(o.getOrderState())
                            .subscriptions(o.getSubscriptions());

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
     * Immutable and unique order number holding customer subscription information
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    String orderNumber;

    /**
     * Order's data center region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    String dataCenterRegion;

    /**
     * Admin e-mail owning subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    String adminEmail;

    /**
     * State of order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderState")
    String orderState;

    /**
     * Array of subscriptions associated with the order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
    java.util.List<SubscriptionInfo> subscriptions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
