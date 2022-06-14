/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = X509FederationRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class X509FederationRequest {
    @Deprecated
    @java.beans.ConstructorProperties({"certificate", "publicKey", "intermediateCertificates"})
    public X509FederationRequest(
            String certificate, String publicKey, java.util.List<String> intermediateCertificates) {
        super();
        this.certificate = certificate;
        this.publicKey = publicKey;
        this.intermediateCertificates = intermediateCertificates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The x509 certificate of the service instance, issued by his CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        /**
         * The x509 certificate of the service instance, issued by his CA.
         * @param certificate the value to set
         * @return this builder
         **/
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }
        /**
         * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
         * key will by put inside the security token by the auth service after successful validation of the certificate.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
         * key will by put inside the security token by the auth service after successful validation of the certificate.
         *
         * @param publicKey the value to set
         * @return this builder
         **/
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }
        /**
         * An array of intermediate certificates to form the chain from the leaf certificate to the root CA. If auth
         * service already has the intermediate certificate(s), then this is not required.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intermediateCertificates")
        private java.util.List<String> intermediateCertificates;

        /**
         * An array of intermediate certificates to form the chain from the leaf certificate to the root CA. If auth
         * service already has the intermediate certificate(s), then this is not required.
         *
         * @param intermediateCertificates the value to set
         * @return this builder
         **/
        public Builder intermediateCertificates(java.util.List<String> intermediateCertificates) {
            this.intermediateCertificates = intermediateCertificates;
            this.__explicitlySet__.add("intermediateCertificates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public X509FederationRequest build() {
            X509FederationRequest __instance__ =
                    new X509FederationRequest(certificate, publicKey, intermediateCertificates);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(X509FederationRequest o) {
            Builder copiedBuilder =
                    certificate(o.getCertificate())
                            .publicKey(o.getPublicKey())
                            .intermediateCertificates(o.getIntermediateCertificates());

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
     * The x509 certificate of the service instance, issued by his CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final String certificate;

    /**
     * The x509 certificate of the service instance, issued by his CA.
     * @return the value
     **/
    public String getCertificate() {
        return certificate;
    }

    /**
     * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
     * key will by put inside the security token by the auth service after successful validation of the certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
     * key will by put inside the security token by the auth service after successful validation of the certificate.
     *
     * @return the value
     **/
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * An array of intermediate certificates to form the chain from the leaf certificate to the root CA. If auth
     * service already has the intermediate certificate(s), then this is not required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intermediateCertificates")
    private final java.util.List<String> intermediateCertificates;

    /**
     * An array of intermediate certificates to form the chain from the leaf certificate to the root CA. If auth
     * service already has the intermediate certificate(s), then this is not required.
     *
     * @return the value
     **/
    public java.util.List<String> getIntermediateCertificates() {
        return intermediateCertificates;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("X509FederationRequest(");
        sb.append("certificate=").append(String.valueOf(this.certificate));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", intermediateCertificates=")
                .append(String.valueOf(this.intermediateCertificates));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof X509FederationRequest)) {
            return false;
        }

        X509FederationRequest other = (X509FederationRequest) o;
        return java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(
                        this.intermediateCertificates, other.intermediateCertificates)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.intermediateCertificates == null
                                ? 43
                                : this.intermediateCertificates.hashCode());
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
