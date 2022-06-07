/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Merchant details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MerchantDefinedData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MerchantDefinedData {
    @Deprecated
    @java.beans.ConstructorProperties({"promoType", "cloudAccountName"})
    public MerchantDefinedData(String promoType, String cloudAccountName) {
        super();
        this.promoType = promoType;
        this.cloudAccountName = cloudAccountName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("promoType")
        private String promoType;

        public Builder promoType(String promoType) {
            this.promoType = promoType;
            this.__explicitlySet__.add("promoType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudAccountName")
        private String cloudAccountName;

        public Builder cloudAccountName(String cloudAccountName) {
            this.cloudAccountName = cloudAccountName;
            this.__explicitlySet__.add("cloudAccountName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MerchantDefinedData build() {
            MerchantDefinedData __instance__ = new MerchantDefinedData(promoType, cloudAccountName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MerchantDefinedData o) {
            Builder copiedBuilder =
                    promoType(o.getPromoType()).cloudAccountName(o.getCloudAccountName());

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
     * Promotion type code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promoType")
    private final String promoType;

    public String getPromoType() {
        return promoType;
    }

    /**
     * Cloud account name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAccountName")
    private final String cloudAccountName;

    public String getCloudAccountName() {
        return cloudAccountName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MerchantDefinedData(");
        sb.append("promoType=").append(String.valueOf(this.promoType));
        sb.append(", cloudAccountName=").append(String.valueOf(this.cloudAccountName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.promoType == null ? 43 : this.promoType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAccountName == null ? 43 : this.cloudAccountName.hashCode());
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
