/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mngdmac.model;

/**
 * The data to update an order in MAC_ORDER bucket. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250320")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpsActionUpdateMacOrderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpsActionUpdateMacOrderDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "orderStatus",
        "ipRange",
        "timeBillingStarted",
        "timeBillingEnded"
    })
    public OpsActionUpdateMacOrderDetails(
            MacOrder.OrderStatus orderStatus,
            String ipRange,
            java.util.Date timeBillingStarted,
            java.util.Date timeBillingEnded) {
        super();
        this.orderStatus = orderStatus;
        this.ipRange = ipRange;
        this.timeBillingStarted = timeBillingStarted;
        this.timeBillingEnded = timeBillingEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The new status of the MacOrder. */
        @com.fasterxml.jackson.annotation.JsonProperty("orderStatus")
        private MacOrder.OrderStatus orderStatus;

        /**
         * The new status of the MacOrder.
         *
         * @param orderStatus the value to set
         * @return this builder
         */
        public Builder orderStatus(MacOrder.OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            this.__explicitlySet__.add("orderStatus");
            return this;
        }
        /** The IP Range specified by the customer for this order. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipRange")
        private String ipRange;

        /**
         * The IP Range specified by the customer for this order.
         *
         * @param ipRange the value to set
         * @return this builder
         */
        public Builder ipRange(String ipRange) {
            this.ipRange = ipRange;
            this.__explicitlySet__.add("ipRange");
            return this;
        }
        /**
         * The date and time this mac order is Active from. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBillingStarted")
        private java.util.Date timeBillingStarted;

        /**
         * The date and time this mac order is Active from. An RFC3339 formatted datetime string.
         *
         * @param timeBillingStarted the value to set
         * @return this builder
         */
        public Builder timeBillingStarted(java.util.Date timeBillingStarted) {
            this.timeBillingStarted = timeBillingStarted;
            this.__explicitlySet__.add("timeBillingStarted");
            return this;
        }
        /**
         * The date and time this mac order until which this mac is Active. An RFC3339 formatted
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBillingEnded")
        private java.util.Date timeBillingEnded;

        /**
         * The date and time this mac order until which this mac is Active. An RFC3339 formatted
         * datetime string.
         *
         * @param timeBillingEnded the value to set
         * @return this builder
         */
        public Builder timeBillingEnded(java.util.Date timeBillingEnded) {
            this.timeBillingEnded = timeBillingEnded;
            this.__explicitlySet__.add("timeBillingEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsActionUpdateMacOrderDetails build() {
            OpsActionUpdateMacOrderDetails model =
                    new OpsActionUpdateMacOrderDetails(
                            this.orderStatus,
                            this.ipRange,
                            this.timeBillingStarted,
                            this.timeBillingEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsActionUpdateMacOrderDetails model) {
            if (model.wasPropertyExplicitlySet("orderStatus")) {
                this.orderStatus(model.getOrderStatus());
            }
            if (model.wasPropertyExplicitlySet("ipRange")) {
                this.ipRange(model.getIpRange());
            }
            if (model.wasPropertyExplicitlySet("timeBillingStarted")) {
                this.timeBillingStarted(model.getTimeBillingStarted());
            }
            if (model.wasPropertyExplicitlySet("timeBillingEnded")) {
                this.timeBillingEnded(model.getTimeBillingEnded());
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

    /** The new status of the MacOrder. */
    @com.fasterxml.jackson.annotation.JsonProperty("orderStatus")
    private final MacOrder.OrderStatus orderStatus;

    /**
     * The new status of the MacOrder.
     *
     * @return the value
     */
    public MacOrder.OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /** The IP Range specified by the customer for this order. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipRange")
    private final String ipRange;

    /**
     * The IP Range specified by the customer for this order.
     *
     * @return the value
     */
    public String getIpRange() {
        return ipRange;
    }

    /** The date and time this mac order is Active from. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBillingStarted")
    private final java.util.Date timeBillingStarted;

    /**
     * The date and time this mac order is Active from. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeBillingStarted() {
        return timeBillingStarted;
    }

    /**
     * The date and time this mac order until which this mac is Active. An RFC3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBillingEnded")
    private final java.util.Date timeBillingEnded;

    /**
     * The date and time this mac order until which this mac is Active. An RFC3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeBillingEnded() {
        return timeBillingEnded;
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
        sb.append("OpsActionUpdateMacOrderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("orderStatus=").append(String.valueOf(this.orderStatus));
        sb.append(", ipRange=").append(String.valueOf(this.ipRange));
        sb.append(", timeBillingStarted=").append(String.valueOf(this.timeBillingStarted));
        sb.append(", timeBillingEnded=").append(String.valueOf(this.timeBillingEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsActionUpdateMacOrderDetails)) {
            return false;
        }

        OpsActionUpdateMacOrderDetails other = (OpsActionUpdateMacOrderDetails) o;
        return java.util.Objects.equals(this.orderStatus, other.orderStatus)
                && java.util.Objects.equals(this.ipRange, other.ipRange)
                && java.util.Objects.equals(this.timeBillingStarted, other.timeBillingStarted)
                && java.util.Objects.equals(this.timeBillingEnded, other.timeBillingEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.orderStatus == null ? 43 : this.orderStatus.hashCode());
        result = (result * PRIME) + (this.ipRange == null ? 43 : this.ipRange.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBillingStarted == null
                                ? 43
                                : this.timeBillingStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBillingEnded == null ? 43 : this.timeBillingEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
