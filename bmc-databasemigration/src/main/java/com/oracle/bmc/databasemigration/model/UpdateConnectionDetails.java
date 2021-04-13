/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details to update in a Database Connection resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200720")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
        private UpdateConnectDescriptor connectDescriptor;

        public Builder connectDescriptor(UpdateConnectDescriptor connectDescriptor) {
            this.connectDescriptor = connectDescriptor;
            this.__explicitlySet__.add("connectDescriptor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
        private String certificateTdn;

        public Builder certificateTdn(String certificateTdn) {
            this.certificateTdn = certificateTdn;
            this.__explicitlySet__.add("certificateTdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
        private String tlsWallet;

        public Builder tlsWallet(String tlsWallet) {
            this.tlsWallet = tlsWallet;
            this.__explicitlySet__.add("tlsWallet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
        private String tlsKeystore;

        public Builder tlsKeystore(String tlsKeystore) {
            this.tlsKeystore = tlsKeystore;
            this.__explicitlySet__.add("tlsKeystore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
        private UpdateSshDetails sshDetails;

        public Builder sshDetails(UpdateSshDetails sshDetails) {
            this.sshDetails = sshDetails;
            this.__explicitlySet__.add("sshDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
        private UpdateAdminCredentials adminCredentials;

        public Builder adminCredentials(UpdateAdminCredentials adminCredentials) {
            this.adminCredentials = adminCredentials;
            this.__explicitlySet__.add("adminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private UpdatePrivateEndpoint privateEndpoint;

        public Builder privateEndpoint(UpdatePrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private UpdateVaultDetails vaultDetails;

        public Builder vaultDetails(UpdateVaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionDetails build() {
            UpdateConnectionDetails __instance__ =
                    new UpdateConnectionDetails(
                            displayName,
                            databaseId,
                            connectDescriptor,
                            certificateTdn,
                            tlsWallet,
                            tlsKeystore,
                            sshDetails,
                            adminCredentials,
                            privateEndpoint,
                            vaultDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .databaseId(o.getDatabaseId())
                            .connectDescriptor(o.getConnectDescriptor())
                            .certificateTdn(o.getCertificateTdn())
                            .tlsWallet(o.getTlsWallet())
                            .tlsKeystore(o.getTlsKeystore())
                            .sshDetails(o.getSshDetails())
                            .adminCredentials(o.getAdminCredentials())
                            .privateEndpoint(o.getPrivateEndpoint())
                            .vaultDetails(o.getVaultDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * Database Connection display name identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the cloud database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    String databaseId;

    @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
    UpdateConnectDescriptor connectDescriptor;

    /**
     * This name is the distinguished name used while creating the certificate on target database. Not required for source container database connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
    String certificateTdn;

    /**
     * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
    String tlsWallet;

    /**
     * keystore.jks file contents; base64 encoded String. Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
    String tlsKeystore;

    @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
    UpdateSshDetails sshDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
    UpdateAdminCredentials adminCredentials;

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    UpdatePrivateEndpoint privateEndpoint;

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    UpdateVaultDetails vaultDetails;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
