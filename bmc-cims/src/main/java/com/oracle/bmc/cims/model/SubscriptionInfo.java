/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubscriptionInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"csi", "subscriptionType"})
    public SubscriptionInfo(String csi, String subscriptionType) {
        super();
        this.csi = csi;
        this.subscriptionType = subscriptionType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** customer support identifier issued for a subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        /**
         * customer support identifier issued for a subscription
         *
         * @param csi the value to set
         * @return this builder
         */
        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /** subscription type of customer which determines payment profile */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
        private String subscriptionType;

        /**
         * subscription type of customer which determines payment profile
         *
         * @param subscriptionType the value to set
         * @return this builder
         */
        public Builder subscriptionType(String subscriptionType) {
            this.subscriptionType = subscriptionType;
            this.__explicitlySet__.add("subscriptionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionInfo build() {
            SubscriptionInfo model = new SubscriptionInfo(this.csi, this.subscriptionType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionInfo model) {
            if (model.wasPropertyExplicitlySet("csi")) {
                this.csi(model.getCsi());
            }
            if (model.wasPropertyExplicitlySet("subscriptionType")) {
                this.subscriptionType(model.getSubscriptionType());
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

    /** customer support identifier issued for a subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final String csi;

    /**
     * customer support identifier issued for a subscription
     *
     * @return the value
     */
    public String getCsi() {
        return csi;
    }

    /** subscription type of customer which determines payment profile */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
    private final String subscriptionType;

    /**
     * subscription type of customer which determines payment profile
     *
     * @return the value
     */
    public String getSubscriptionType() {
        return subscriptionType;
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
        sb.append("SubscriptionInfo(");
        sb.append("super=").append(super.toString());
        sb.append("csi=").append(String.valueOf(this.csi));
        sb.append(", subscriptionType=").append(String.valueOf(this.subscriptionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionInfo)) {
            return false;
        }

        SubscriptionInfo other = (SubscriptionInfo) o;
        return java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.subscriptionType, other.subscriptionType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionType == null ? 43 : this.subscriptionType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
