/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Order details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Order.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Order extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Immutable and unique order number holding customer subscription information. */
        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private String orderNumber;

        /**
         * Immutable and unique order number holding customer subscription information.
         *
         * @param orderNumber the value to set
         * @return this builder
         */
        public Builder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }
        /** Order's data center region. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
        private String dataCenterRegion;

        /**
         * Order's data center region.
         *
         * @param dataCenterRegion the value to set
         * @return this builder
         */
        public Builder dataCenterRegion(String dataCenterRegion) {
            this.dataCenterRegion = dataCenterRegion;
            this.__explicitlySet__.add("dataCenterRegion");
            return this;
        }
        /** Email address of the administrator who owns the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        /**
         * Email address of the administrator who owns the subscription.
         *
         * @param adminEmail the value to set
         * @return this builder
         */
        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }
        /** State of the order. */
        @com.fasterxml.jackson.annotation.JsonProperty("orderState")
        private String orderState;

        /**
         * State of the order.
         *
         * @param orderState the value to set
         * @return this builder
         */
        public Builder orderState(String orderState) {
            this.orderState = orderState;
            this.__explicitlySet__.add("orderState");
            return this;
        }
        /** Array of subscriptions associated with the order. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
        private java.util.List<SubscriptionInfo> subscriptions;

        /**
         * Array of subscriptions associated with the order.
         *
         * @param subscriptions the value to set
         * @return this builder
         */
        public Builder subscriptions(java.util.List<SubscriptionInfo> subscriptions) {
            this.subscriptions = subscriptions;
            this.__explicitlySet__.add("subscriptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Order build() {
            Order model =
                    new Order(
                            this.orderNumber,
                            this.dataCenterRegion,
                            this.adminEmail,
                            this.orderState,
                            this.subscriptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Order model) {
            if (model.wasPropertyExplicitlySet("orderNumber")) {
                this.orderNumber(model.getOrderNumber());
            }
            if (model.wasPropertyExplicitlySet("dataCenterRegion")) {
                this.dataCenterRegion(model.getDataCenterRegion());
            }
            if (model.wasPropertyExplicitlySet("adminEmail")) {
                this.adminEmail(model.getAdminEmail());
            }
            if (model.wasPropertyExplicitlySet("orderState")) {
                this.orderState(model.getOrderState());
            }
            if (model.wasPropertyExplicitlySet("subscriptions")) {
                this.subscriptions(model.getSubscriptions());
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

    /** Immutable and unique order number holding customer subscription information. */
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    private final String orderNumber;

    /**
     * Immutable and unique order number holding customer subscription information.
     *
     * @return the value
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /** Order's data center region. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    private final String dataCenterRegion;

    /**
     * Order's data center region.
     *
     * @return the value
     */
    public String getDataCenterRegion() {
        return dataCenterRegion;
    }

    /** Email address of the administrator who owns the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    /**
     * Email address of the administrator who owns the subscription.
     *
     * @return the value
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /** State of the order. */
    @com.fasterxml.jackson.annotation.JsonProperty("orderState")
    private final String orderState;

    /**
     * State of the order.
     *
     * @return the value
     */
    public String getOrderState() {
        return orderState;
    }

    /** Array of subscriptions associated with the order. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
    private final java.util.List<SubscriptionInfo> subscriptions;

    /**
     * Array of subscriptions associated with the order.
     *
     * @return the value
     */
    public java.util.List<SubscriptionInfo> getSubscriptions() {
        return subscriptions;
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
        sb.append("Order(");
        sb.append("super=").append(super.toString());
        sb.append("orderNumber=").append(String.valueOf(this.orderNumber));
        sb.append(", dataCenterRegion=").append(String.valueOf(this.dataCenterRegion));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", orderState=").append(String.valueOf(this.orderState));
        sb.append(", subscriptions=").append(String.valueOf(this.subscriptions));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
