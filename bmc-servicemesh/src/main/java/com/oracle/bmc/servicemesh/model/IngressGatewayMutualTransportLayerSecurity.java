/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Mutual TLS settings used when sending requests to virtual services within the mesh.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressGatewayMutualTransportLayerSecurity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngressGatewayMutualTransportLayerSecurity {
    @Deprecated
    @java.beans.ConstructorProperties({"certificateId", "maximumValidity"})
    public IngressGatewayMutualTransportLayerSecurity(
            String certificateId, Integer maximumValidity) {
        super();
        this.certificateId = certificateId;
        this.maximumValidity = maximumValidity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
         *
         * @param certificateId the value to set
         * @return this builder
         **/
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /**
         * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
         * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
         * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
         * will be renewed every 30 days.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
        private Integer maximumValidity;

        /**
         * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
         * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
         * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
         * will be renewed every 30 days.
         *
         * @param maximumValidity the value to set
         * @return this builder
         **/
        public Builder maximumValidity(Integer maximumValidity) {
            this.maximumValidity = maximumValidity;
            this.__explicitlySet__.add("maximumValidity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressGatewayMutualTransportLayerSecurity build() {
            IngressGatewayMutualTransportLayerSecurity __instance__ =
                    new IngressGatewayMutualTransportLayerSecurity(certificateId, maximumValidity);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressGatewayMutualTransportLayerSecurity o) {
            Builder copiedBuilder =
                    certificateId(o.getCertificateId()).maximumValidity(o.getMaximumValidity());

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
     * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
     *
     * @return the value
     **/
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
     * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
     * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
     * will be renewed every 30 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
    private final Integer maximumValidity;

    /**
     * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
     * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
     * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
     * will be renewed every 30 days.
     *
     * @return the value
     **/
    public Integer getMaximumValidity() {
        return maximumValidity;
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
        sb.append("IngressGatewayMutualTransportLayerSecurity(");
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", maximumValidity=").append(String.valueOf(this.maximumValidity));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressGatewayMutualTransportLayerSecurity)) {
            return false;
        }

        IngressGatewayMutualTransportLayerSecurity other =
                (IngressGatewayMutualTransportLayerSecurity) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.maximumValidity, other.maximumValidity)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumValidity == null ? 43 : this.maximumValidity.hashCode());
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
