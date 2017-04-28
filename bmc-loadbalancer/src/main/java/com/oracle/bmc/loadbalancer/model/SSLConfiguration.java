/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A listener's SSL handling configuration.
 * <p>
 * To use SSL, a listener must be associated with a {@link Certificate}.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = SSLConfiguration.Builder.class)
public class SSLConfiguration {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("certificateName")
        private String certificateName;

        @JsonProperty("verifyDepth")
        private Integer verifyDepth;

        @JsonProperty("verifyPeerCertificate")
        private Boolean verifyPeerCertificate;

        public SSLConfiguration build() {
            return new SSLConfiguration(certificateName, verifyDepth, verifyPeerCertificate);
        }

        @JsonIgnore
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
     * <p>
     * Example: `My certificate bundle`
     *
     **/
    @JsonProperty("certificateName")
    @Valid
    @NotNull
    String certificateName;

    /**
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: `3`
     *
     **/
    @JsonProperty("verifyDepth")
    @Valid
    @NotNull
    Integer verifyDepth;

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("verifyPeerCertificate")
    @Valid
    @NotNull
    Boolean verifyPeerCertificate;
}
