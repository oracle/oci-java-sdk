/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A listener's SSL handling configuration.
 * <p>
 * To use SSL, a listener must be associated with a {@link Certificate}.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SSLConfiguration.Builder.class)
public class SSLConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
        private Integer verifyDepth;

        @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
        private Boolean verifyPeerCertificate;

        public SSLConfiguration build() {
            return new SSLConfiguration(certificateName, verifyDepth, verifyPeerCertificate);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLConfiguration o) {
            return certificateName(o.getCertificateName())
                    .verifyDepth(o.getVerifyDepth())
                    .verifyPeerCertificate(o.getVerifyPeerCertificate());
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
     * Example: `My_certificate_bundle`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Pattern(regexp = "/^[a-zA-Z0-9_.-]*$/")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String certificateName;

    /**
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer verifyDepth;

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Boolean verifyPeerCertificate;
}
