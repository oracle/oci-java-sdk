/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTransferApplianceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTransferApplianceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lifecycleState",
        "customerShippingAddress",
        "expectedReturnDate",
        "pickupWindowStartTime",
        "pickupWindowEndTime",
        "minimumStorageCapacityInTerabytes"
    })
    public UpdateTransferApplianceDetails(
            LifecycleState lifecycleState,
            ShippingAddress customerShippingAddress,
            java.util.Date expectedReturnDate,
            java.util.Date pickupWindowStartTime,
            java.util.Date pickupWindowEndTime,
            Integer minimumStorageCapacityInTerabytes) {
        super();
        this.lifecycleState = lifecycleState;
        this.customerShippingAddress = customerShippingAddress;
        this.expectedReturnDate = expectedReturnDate;
        this.pickupWindowStartTime = pickupWindowStartTime;
        this.pickupWindowEndTime = pickupWindowEndTime;
        this.minimumStorageCapacityInTerabytes = minimumStorageCapacityInTerabytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }
        /** Expected return date from customer for the device, time portion should be zero. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedReturnDate")
        private java.util.Date expectedReturnDate;

        /**
         * Expected return date from customer for the device, time portion should be zero.
         *
         * @param expectedReturnDate the value to set
         * @return this builder
         */
        public Builder expectedReturnDate(java.util.Date expectedReturnDate) {
            this.expectedReturnDate = expectedReturnDate;
            this.__explicitlySet__.add("expectedReturnDate");
            return this;
        }
        /** Start time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowStartTime")
        private java.util.Date pickupWindowStartTime;

        /**
         * Start time for the window to pickup the device from customer.
         *
         * @param pickupWindowStartTime the value to set
         * @return this builder
         */
        public Builder pickupWindowStartTime(java.util.Date pickupWindowStartTime) {
            this.pickupWindowStartTime = pickupWindowStartTime;
            this.__explicitlySet__.add("pickupWindowStartTime");
            return this;
        }
        /** End time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowEndTime")
        private java.util.Date pickupWindowEndTime;

        /**
         * End time for the window to pickup the device from customer.
         *
         * @param pickupWindowEndTime the value to set
         * @return this builder
         */
        public Builder pickupWindowEndTime(java.util.Date pickupWindowEndTime) {
            this.pickupWindowEndTime = pickupWindowEndTime;
            this.__explicitlySet__.add("pickupWindowEndTime");
            return this;
        }
        /**
         * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumStorageCapacityInTerabytes")
        private Integer minimumStorageCapacityInTerabytes;

        /**
         * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
         *
         * @param minimumStorageCapacityInTerabytes the value to set
         * @return this builder
         */
        public Builder minimumStorageCapacityInTerabytes(
                Integer minimumStorageCapacityInTerabytes) {
            this.minimumStorageCapacityInTerabytes = minimumStorageCapacityInTerabytes;
            this.__explicitlySet__.add("minimumStorageCapacityInTerabytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTransferApplianceDetails build() {
            UpdateTransferApplianceDetails model =
                    new UpdateTransferApplianceDetails(
                            this.lifecycleState,
                            this.customerShippingAddress,
                            this.expectedReturnDate,
                            this.pickupWindowStartTime,
                            this.pickupWindowEndTime,
                            this.minimumStorageCapacityInTerabytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTransferApplianceDetails model) {
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("expectedReturnDate")) {
                this.expectedReturnDate(model.getExpectedReturnDate());
            }
            if (model.wasPropertyExplicitlySet("pickupWindowStartTime")) {
                this.pickupWindowStartTime(model.getPickupWindowStartTime());
            }
            if (model.wasPropertyExplicitlySet("pickupWindowEndTime")) {
                this.pickupWindowEndTime(model.getPickupWindowEndTime());
            }
            if (model.wasPropertyExplicitlySet("minimumStorageCapacityInTerabytes")) {
                this.minimumStorageCapacityInTerabytes(
                        model.getMinimumStorageCapacityInTerabytes());
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

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Preparing("PREPARING"),
        Finalized("FINALIZED"),
        ReturnLabelRequested("RETURN_LABEL_REQUESTED"),
        ReturnLabelGenerating("RETURN_LABEL_GENERATING"),
        ReturnLabelAvailable("RETURN_LABEL_AVAILABLE"),
        Deleted("DELETED"),
        CustomerNeverReceived("CUSTOMER_NEVER_RECEIVED"),
        Cancelled("CANCELLED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /** Expected return date from customer for the device, time portion should be zero. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedReturnDate")
    private final java.util.Date expectedReturnDate;

    /**
     * Expected return date from customer for the device, time portion should be zero.
     *
     * @return the value
     */
    public java.util.Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    /** Start time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowStartTime")
    private final java.util.Date pickupWindowStartTime;

    /**
     * Start time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getPickupWindowStartTime() {
        return pickupWindowStartTime;
    }

    /** End time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowEndTime")
    private final java.util.Date pickupWindowEndTime;

    /**
     * End time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getPickupWindowEndTime() {
        return pickupWindowEndTime;
    }

    /** Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumStorageCapacityInTerabytes")
    private final Integer minimumStorageCapacityInTerabytes;

    /**
     * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
     *
     * @return the value
     */
    public Integer getMinimumStorageCapacityInTerabytes() {
        return minimumStorageCapacityInTerabytes;
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
        sb.append("UpdateTransferApplianceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", expectedReturnDate=").append(String.valueOf(this.expectedReturnDate));
        sb.append(", pickupWindowStartTime=").append(String.valueOf(this.pickupWindowStartTime));
        sb.append(", pickupWindowEndTime=").append(String.valueOf(this.pickupWindowEndTime));
        sb.append(", minimumStorageCapacityInTerabytes=")
                .append(String.valueOf(this.minimumStorageCapacityInTerabytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTransferApplianceDetails)) {
            return false;
        }

        UpdateTransferApplianceDetails other = (UpdateTransferApplianceDetails) o;
        return java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.expectedReturnDate, other.expectedReturnDate)
                && java.util.Objects.equals(this.pickupWindowStartTime, other.pickupWindowStartTime)
                && java.util.Objects.equals(this.pickupWindowEndTime, other.pickupWindowEndTime)
                && java.util.Objects.equals(
                        this.minimumStorageCapacityInTerabytes,
                        other.minimumStorageCapacityInTerabytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedReturnDate == null
                                ? 43
                                : this.expectedReturnDate.hashCode());
        result =
                (result * PRIME)
                        + (this.pickupWindowStartTime == null
                                ? 43
                                : this.pickupWindowStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.pickupWindowEndTime == null
                                ? 43
                                : this.pickupWindowEndTime.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumStorageCapacityInTerabytes == null
                                ? 43
                                : this.minimumStorageCapacityInTerabytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
