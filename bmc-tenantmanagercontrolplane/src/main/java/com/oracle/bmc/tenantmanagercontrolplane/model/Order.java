/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Order details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Order.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Order {
    @Deprecated
    @java.beans.ConstructorProperties({
        "orderNumber",
        "dataCenterRegion",
        "adminEmail",
        "orderState",
        "subscriptions"
    })
    public Order(
            String orderNumber,
            String dataCenterRegion,
            String adminEmail,
            String orderState,
            java.util.List<SubscriptionInfo> subscriptions) {
        super();
        this.orderNumber = orderNumber;
        this.dataCenterRegion = dataCenterRegion;
        this.adminEmail = adminEmail;
        this.orderState = orderState;
        this.subscriptions = subscriptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Immutable and unique order number holding customer subscription information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    private final String orderNumber;

    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Order's data center region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    private final String dataCenterRegion;

    public String getDataCenterRegion() {
        return dataCenterRegion;
    }

    /**
     * Administrator email owning the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * State of the order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderState")
    private final String orderState;

    public String getOrderState() {
        return orderState;
    }

    /**
     * Array of subscriptions associated with the order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
    private final java.util.List<SubscriptionInfo> subscriptions;

    public java.util.List<SubscriptionInfo> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Order(");
        sb.append("orderNumber=").append(String.valueOf(this.orderNumber));
        sb.append(", dataCenterRegion=").append(String.valueOf(this.dataCenterRegion));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", orderState=").append(String.valueOf(this.orderState));
        sb.append(", subscriptions=").append(String.valueOf(this.subscriptions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }

        Order other = (Order) o;
        return java.util.Objects.equals(this.orderNumber, other.orderNumber)
                && java.util.Objects.equals(this.dataCenterRegion, other.dataCenterRegion)
                && java.util.Objects.equals(this.adminEmail, other.adminEmail)
                && java.util.Objects.equals(this.orderState, other.orderState)
                && java.util.Objects.equals(this.subscriptions, other.subscriptions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.orderNumber == null ? 43 : this.orderNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCenterRegion == null ? 43 : this.dataCenterRegion.hashCode());
        result = (result * PRIME) + (this.adminEmail == null ? 43 : this.adminEmail.hashCode());
        result = (result * PRIME) + (this.orderState == null ? 43 : this.orderState.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptions == null ? 43 : this.subscriptions.hashCode());
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
