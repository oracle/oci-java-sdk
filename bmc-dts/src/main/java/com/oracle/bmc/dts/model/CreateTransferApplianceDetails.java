/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTransferApplianceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTransferApplianceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "customerShippingAddress",
        "minimumStorageCapacityInTerabytes"
    })
    public CreateTransferApplianceDetails(
            ShippingAddress customerShippingAddress, Integer minimumStorageCapacityInTerabytes) {
        super();
        this.customerShippingAddress = customerShippingAddress;
        this.minimumStorageCapacityInTerabytes = minimumStorageCapacityInTerabytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }
        /**
         * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumStorageCapacityInTerabytes")
        private Integer minimumStorageCapacityInTerabytes;

        /**
         * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
         * @param minimumStorageCapacityInTerabytes the value to set
         * @return this builder
         **/
        public Builder minimumStorageCapacityInTerabytes(
                Integer minimumStorageCapacityInTerabytes) {
            this.minimumStorageCapacityInTerabytes = minimumStorageCapacityInTerabytes;
            this.__explicitlySet__.add("minimumStorageCapacityInTerabytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTransferApplianceDetails build() {
            CreateTransferApplianceDetails model =
                    new CreateTransferApplianceDetails(
                            this.customerShippingAddress, this.minimumStorageCapacityInTerabytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTransferApplianceDetails model) {
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("minimumStorageCapacityInTerabytes")) {
                this.minimumStorageCapacityInTerabytes(
                        model.getMinimumStorageCapacityInTerabytes());
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

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /**
     * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumStorageCapacityInTerabytes")
    private final Integer minimumStorageCapacityInTerabytes;

    /**
     * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
     * @return the value
     **/
    public Integer getMinimumStorageCapacityInTerabytes() {
        return minimumStorageCapacityInTerabytes;
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
        sb.append("CreateTransferApplianceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("customerShippingAddress=").append(String.valueOf(this.customerShippingAddress));
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
        if (!(o instanceof CreateTransferApplianceDetails)) {
            return false;
        }

        CreateTransferApplianceDetails other = (CreateTransferApplianceDetails) o;
        return java.util.Objects.equals(this.customerShippingAddress, other.customerShippingAddress)
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
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumStorageCapacityInTerabytes == null
                                ? 43
                                : this.minimumStorageCapacityInTerabytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
