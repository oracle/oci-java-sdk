/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Address verficiation result <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VerifyAddressReceipt.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VerifyAddressReceipt
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"address", "quality", "verificationCode"})
    public VerifyAddressReceipt(
            Address address, AddressQualityType quality, AddressVerificationCode verificationCode) {
        super();
        this.address = address;
        this.quality = quality;
        this.verificationCode = verificationCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private Address address;

        public Builder address(Address address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** Address quality type. */
        @com.fasterxml.jackson.annotation.JsonProperty("quality")
        private AddressQualityType quality;

        /**
         * Address quality type.
         *
         * @param quality the value to set
         * @return this builder
         */
        public Builder quality(AddressQualityType quality) {
            this.quality = quality;
            this.__explicitlySet__.add("quality");
            return this;
        }
        /** Address verification code. */
        @com.fasterxml.jackson.annotation.JsonProperty("verificationCode")
        private AddressVerificationCode verificationCode;

        /**
         * Address verification code.
         *
         * @param verificationCode the value to set
         * @return this builder
         */
        public Builder verificationCode(AddressVerificationCode verificationCode) {
            this.verificationCode = verificationCode;
            this.__explicitlySet__.add("verificationCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VerifyAddressReceipt build() {
            VerifyAddressReceipt model =
                    new VerifyAddressReceipt(this.address, this.quality, this.verificationCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VerifyAddressReceipt model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("quality")) {
                this.quality(model.getQuality());
            }
            if (model.wasPropertyExplicitlySet("verificationCode")) {
                this.verificationCode(model.getVerificationCode());
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

    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final Address address;

    public Address getAddress() {
        return address;
    }

    /** Address quality type. */
    @com.fasterxml.jackson.annotation.JsonProperty("quality")
    private final AddressQualityType quality;

    /**
     * Address quality type.
     *
     * @return the value
     */
    public AddressQualityType getQuality() {
        return quality;
    }

    /** Address verification code. */
    @com.fasterxml.jackson.annotation.JsonProperty("verificationCode")
    private final AddressVerificationCode verificationCode;

    /**
     * Address verification code.
     *
     * @return the value
     */
    public AddressVerificationCode getVerificationCode() {
        return verificationCode;
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
        sb.append("VerifyAddressReceipt(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", quality=").append(String.valueOf(this.quality));
        sb.append(", verificationCode=").append(String.valueOf(this.verificationCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyAddressReceipt)) {
            return false;
        }

        VerifyAddressReceipt other = (VerifyAddressReceipt) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.quality, other.quality)
                && java.util.Objects.equals(this.verificationCode, other.verificationCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.quality == null ? 43 : this.quality.hashCode());
        result =
                (result * PRIME)
                        + (this.verificationCode == null ? 43 : this.verificationCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
