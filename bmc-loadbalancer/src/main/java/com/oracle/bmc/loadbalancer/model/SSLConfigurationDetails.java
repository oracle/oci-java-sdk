/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The load balancer's SSL handling configuration details.
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SSLConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SSLConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
        private Integer verifyDepth;

        public Builder verifyDepth(Integer verifyDepth) {
            this.verifyDepth = verifyDepth;
            this.__explicitlySet__.add("verifyDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
        private Boolean verifyPeerCertificate;

        public Builder verifyPeerCertificate(Boolean verifyPeerCertificate) {
            this.verifyPeerCertificate = verifyPeerCertificate;
            this.__explicitlySet__.add("verifyPeerCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SSLConfigurationDetails build() {
            SSLConfigurationDetails __instance__ =
                    new SSLConfigurationDetails(
                            certificateName, verifyDepth, verifyPeerCertificate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLConfigurationDetails o) {
            Builder copiedBuilder =
                    certificateName(o.getCertificateName())
                            .verifyDepth(o.getVerifyDepth())
                            .verifyPeerCertificate(o.getVerifyPeerCertificate());

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
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * Valid certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     * <p>
     * Example: `example_certificate_bundle`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    String certificateName;

    /**
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
    Integer verifyDepth;

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
    Boolean verifyPeerCertificate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
