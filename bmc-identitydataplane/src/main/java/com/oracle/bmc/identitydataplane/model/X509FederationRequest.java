/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = X509FederationRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class X509FederationRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intermediateCertificates")
        private java.util.List<String> intermediateCertificates;

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

    /**
     * The x509 certificate of the service instance, issued by his CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    String certificate;

    /**
     * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
     * key will by put inside the security token by the auth service after successful validation of the certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    String publicKey;

    /**
     * An array of intermediate certificates to form the chain from the leaf certificate to the root CA. If auth
     * service already has the intermediate certificate(s), then this is not required.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intermediateCertificates")
    java.util.List<String> intermediateCertificates;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
