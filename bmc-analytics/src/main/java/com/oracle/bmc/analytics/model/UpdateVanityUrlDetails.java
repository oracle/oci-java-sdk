/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Input payload to update a vanity url.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateVanityUrlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateVanityUrlDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
        private String privateKey;

        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            this.__explicitlySet__.add("privateKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = publicCertificate;
            this.__explicitlySet__.add("publicCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            this.__explicitlySet__.add("caCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVanityUrlDetails build() {
            UpdateVanityUrlDetails __instance__ =
                    new UpdateVanityUrlDetails(
                            passphrase, privateKey, publicCertificate, caCertificate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVanityUrlDetails o) {
            Builder copiedBuilder =
                    passphrase(o.getPassphrase())
                            .privateKey(o.getPrivateKey())
                            .publicCertificate(o.getPublicCertificate())
                            .caCertificate(o.getCaCertificate());

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
     * Passphrase for the PEM Private key (if any).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    String passphrase;

    /**
     * PEM Private key for HTTPS connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
    String privateKey;

    /**
     * PEM certificate for HTTPS connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
    String publicCertificate;

    /**
     * PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    String caCertificate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
