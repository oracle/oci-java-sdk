/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the configuration for updating a certificate based on the keys from an imported certificate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCertificateByImportingConfigDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateCertificateByImportingConfigDetails extends UpdateCertificateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stage")
        private Stage stage;

        public Builder stage(Stage stage) {
            this.stage = stage;
            this.__explicitlySet__.add("stage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
        private String certChainPem;

        public Builder certChainPem(String certChainPem) {
            this.certChainPem = certChainPem;
            this.__explicitlySet__.add("certChainPem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPem")
        private String privateKeyPem;

        public Builder privateKeyPem(String privateKeyPem) {
            this.privateKeyPem = privateKeyPem;
            this.__explicitlySet__.add("privateKeyPem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPemPassphrase")
        private String privateKeyPemPassphrase;

        public Builder privateKeyPemPassphrase(String privateKeyPemPassphrase) {
            this.privateKeyPemPassphrase = privateKeyPemPassphrase;
            this.__explicitlySet__.add("privateKeyPemPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCertificateByImportingConfigDetails build() {
            UpdateCertificateByImportingConfigDetails __instance__ =
                    new UpdateCertificateByImportingConfigDetails(
                            versionName,
                            stage,
                            certChainPem,
                            privateKeyPem,
                            certificatePem,
                            privateKeyPemPassphrase);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCertificateByImportingConfigDetails o) {
            Builder copiedBuilder =
                    versionName(o.getVersionName())
                            .stage(o.getStage())
                            .certChainPem(o.getCertChainPem())
                            .privateKeyPem(o.getPrivateKeyPem())
                            .certificatePem(o.getCertificatePem())
                            .privateKeyPemPassphrase(o.getPrivateKeyPemPassphrase());

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

    @Deprecated
    public UpdateCertificateByImportingConfigDetails(
            String versionName,
            Stage stage,
            String certChainPem,
            String privateKeyPem,
            String certificatePem,
            String privateKeyPemPassphrase) {
        super(versionName, stage);
        this.certChainPem = certChainPem;
        this.privateKeyPem = privateKeyPem;
        this.certificatePem = certificatePem;
        this.privateKeyPemPassphrase = privateKeyPemPassphrase;
    }

    /**
     * The certificate chain (in PEM format) for the imported certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
    String certChainPem;

    /**
     * The private key (in PEM format) for the imported certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPem")
    String privateKeyPem;

    /**
     * The certificate (in PEM format) for the imported certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    String certificatePem;

    /**
     * An optional passphrase for the private key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPemPassphrase")
    String privateKeyPemPassphrase;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
