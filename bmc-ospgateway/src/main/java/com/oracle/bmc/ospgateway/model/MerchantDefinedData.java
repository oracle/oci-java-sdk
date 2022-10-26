/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Merchant details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MerchantDefinedData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MerchantDefinedData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"promoType", "cloudAccountName"})
    public MerchantDefinedData(String promoType, String cloudAccountName) {
        super();
        this.promoType = promoType;
        this.cloudAccountName = cloudAccountName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Promotion type code. */
        @com.fasterxml.jackson.annotation.JsonProperty("promoType")
        private String promoType;

        /**
         * Promotion type code.
         *
         * @param promoType the value to set
         * @return this builder
         */
        public Builder promoType(String promoType) {
            this.promoType = promoType;
            this.__explicitlySet__.add("promoType");
            return this;
        }
        /** Cloud account name. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAccountName")
        private String cloudAccountName;

        /**
         * Cloud account name.
         *
         * @param cloudAccountName the value to set
         * @return this builder
         */
        public Builder cloudAccountName(String cloudAccountName) {
            this.cloudAccountName = cloudAccountName;
            this.__explicitlySet__.add("cloudAccountName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MerchantDefinedData build() {
            MerchantDefinedData model =
                    new MerchantDefinedData(this.promoType, this.cloudAccountName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MerchantDefinedData model) {
            if (model.wasPropertyExplicitlySet("promoType")) {
                this.promoType(model.getPromoType());
            }
            if (model.wasPropertyExplicitlySet("cloudAccountName")) {
                this.cloudAccountName(model.getCloudAccountName());
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

    /** Promotion type code. */
    @com.fasterxml.jackson.annotation.JsonProperty("promoType")
    private final String promoType;

    /**
     * Promotion type code.
     *
     * @return the value
     */
    public String getPromoType() {
        return promoType;
    }

    /** Cloud account name. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAccountName")
    private final String cloudAccountName;

    /**
     * Cloud account name.
     *
     * @return the value
     */
    public String getCloudAccountName() {
        return cloudAccountName;
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
        sb.append("MerchantDefinedData(");
        sb.append("super=").append(super.toString());
        sb.append("promoType=").append(String.valueOf(this.promoType));
        sb.append(", cloudAccountName=").append(String.valueOf(this.cloudAccountName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MerchantDefinedData)) {
            return false;
        }

        MerchantDefinedData other = (MerchantDefinedData) o;
        return java.util.Objects.equals(this.promoType, other.promoType)
                && java.util.Objects.equals(this.cloudAccountName, other.cloudAccountName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.promoType == null ? 43 : this.promoType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAccountName == null ? 43 : this.cloudAccountName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
