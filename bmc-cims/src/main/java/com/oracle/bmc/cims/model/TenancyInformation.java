/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the customer's tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TenancyInformation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TenancyInformation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customerSupportKey", "tenancyId"})
    public TenancyInformation(String customerSupportKey, String tenancyId) {
        super();
        this.customerSupportKey = customerSupportKey;
        this.tenancyId = tenancyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Customer Support Identifier number associated with the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerSupportKey")
        private String customerSupportKey;

        /**
         * The Customer Support Identifier number associated with the tenancy.
         * @param customerSupportKey the value to set
         * @return this builder
         **/
        public Builder customerSupportKey(String customerSupportKey) {
            this.customerSupportKey = customerSupportKey;
            this.__explicitlySet__.add("customerSupportKey");
            return this;
        }
        /**
         * The OCID of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The OCID of the tenancy.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TenancyInformation build() {
            TenancyInformation model =
                    new TenancyInformation(this.customerSupportKey, this.tenancyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TenancyInformation model) {
            if (model.wasPropertyExplicitlySet("customerSupportKey")) {
                this.customerSupportKey(model.getCustomerSupportKey());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
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
     * The Customer Support Identifier number associated with the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerSupportKey")
    private final String customerSupportKey;

    /**
     * The Customer Support Identifier number associated with the tenancy.
     * @return the value
     **/
    public String getCustomerSupportKey() {
        return customerSupportKey;
    }

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The OCID of the tenancy.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
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
        sb.append("TenancyInformation(");
        sb.append("super=").append(super.toString());
        sb.append("customerSupportKey=").append(String.valueOf(this.customerSupportKey));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TenancyInformation)) {
            return false;
        }

        TenancyInformation other = (TenancyInformation) o;
        return java.util.Objects.equals(this.customerSupportKey, other.customerSupportKey)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customerSupportKey == null
                                ? 43
                                : this.customerSupportKey.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
