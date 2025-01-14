/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Mutual TLS settings used when sending requests to virtual services within the mesh. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IngressGatewayMutualTransportLayerSecurityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IngressGatewayMutualTransportLayerSecurityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"maximumValidity"})
    public IngressGatewayMutualTransportLayerSecurityDetails(Integer maximumValidity) {
        super();
        this.maximumValidity = maximumValidity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of days the mTLS certificate is valid. This value should be less than the
         * Maximum Validity Duration for Certificates (Days) setting on the Certificate Authority
         * associated with this Mesh. The certificate will be automatically renewed after 2/3 of the
         * validity period, so a certificate with a maximum validity of 45 days will be renewed
         * every 30 days.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
        private Integer maximumValidity;

        /**
         * The number of days the mTLS certificate is valid. This value should be less than the
         * Maximum Validity Duration for Certificates (Days) setting on the Certificate Authority
         * associated with this Mesh. The certificate will be automatically renewed after 2/3 of the
         * validity period, so a certificate with a maximum validity of 45 days will be renewed
         * every 30 days.
         *
         * @param maximumValidity the value to set
         * @return this builder
         */
        public Builder maximumValidity(Integer maximumValidity) {
            this.maximumValidity = maximumValidity;
            this.__explicitlySet__.add("maximumValidity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressGatewayMutualTransportLayerSecurityDetails build() {
            IngressGatewayMutualTransportLayerSecurityDetails model =
                    new IngressGatewayMutualTransportLayerSecurityDetails(this.maximumValidity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressGatewayMutualTransportLayerSecurityDetails model) {
            if (model.wasPropertyExplicitlySet("maximumValidity")) {
                this.maximumValidity(model.getMaximumValidity());
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

    /**
     * The number of days the mTLS certificate is valid. This value should be less than the Maximum
     * Validity Duration for Certificates (Days) setting on the Certificate Authority associated
     * with this Mesh. The certificate will be automatically renewed after 2/3 of the validity
     * period, so a certificate with a maximum validity of 45 days will be renewed every 30 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
    private final Integer maximumValidity;

    /**
     * The number of days the mTLS certificate is valid. This value should be less than the Maximum
     * Validity Duration for Certificates (Days) setting on the Certificate Authority associated
     * with this Mesh. The certificate will be automatically renewed after 2/3 of the validity
     * period, so a certificate with a maximum validity of 45 days will be renewed every 30 days.
     *
     * @return the value
     */
    public Integer getMaximumValidity() {
        return maximumValidity;
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
        sb.append("IngressGatewayMutualTransportLayerSecurityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maximumValidity=").append(String.valueOf(this.maximumValidity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressGatewayMutualTransportLayerSecurityDetails)) {
            return false;
        }

        IngressGatewayMutualTransportLayerSecurityDetails other =
                (IngressGatewayMutualTransportLayerSecurityDetails) o;
        return java.util.Objects.equals(this.maximumValidity, other.maximumValidity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maximumValidity == null ? 43 : this.maximumValidity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
