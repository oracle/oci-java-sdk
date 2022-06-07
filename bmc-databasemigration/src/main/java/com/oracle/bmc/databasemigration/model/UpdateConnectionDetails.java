/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateConnectionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "databaseId",
        "connectDescriptor",
        "certificateTdn",
        "tlsWallet",
        "tlsKeystore",
        "sshDetails",
        "adminCredentials",
        "privateEndpoint",
        "vaultDetails",
        "freeformTags",
        "definedTags"
    })
    public UpdateConnectionDetails(
            String displayName,
            String databaseId,
            UpdateConnectDescriptor connectDescriptor,
            String certificateTdn,
            String tlsWallet,
            String tlsKeystore,
            UpdateSshDetails sshDetails,
            UpdateAdminCredentials adminCredentials,
            UpdatePrivateEndpoint privateEndpoint,
            UpdateVaultDetails vaultDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.databaseId = databaseId;
        this.connectDescriptor = connectDescriptor;
        this.certificateTdn = certificateTdn;
        this.tlsWallet = tlsWallet;
        this.tlsKeystore = tlsKeystore;
        this.sshDetails = sshDetails;
        this.adminCredentials = adminCredentials;
        this.privateEndpoint = privateEndpoint;
        this.vaultDetails = vaultDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Database Connection display name identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the cloud database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    public String getDatabaseId() {
        return databaseId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
    private final UpdateConnectDescriptor connectDescriptor;

    public UpdateConnectDescriptor getConnectDescriptor() {
        return connectDescriptor;
    }

    /**
     * This name is the distinguished name used while creating the certificate on target database. Not required for source container database connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
    private final String certificateTdn;

    public String getCertificateTdn() {
        return certificateTdn;
    }

    /**
     * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
    private final String tlsWallet;

    public String getTlsWallet() {
        return tlsWallet;
    }

    /**
     * keystore.jks file contents; base64 encoded String. Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
    private final String tlsKeystore;

    public String getTlsKeystore() {
        return tlsKeystore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
    private final UpdateSshDetails sshDetails;

    public UpdateSshDetails getSshDetails() {
        return sshDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
    private final UpdateAdminCredentials adminCredentials;

    public UpdateAdminCredentials getAdminCredentials() {
        return adminCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final UpdatePrivateEndpoint privateEndpoint;

    public UpdatePrivateEndpoint getPrivateEndpoint() {
        return privateEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    private final UpdateVaultDetails vaultDetails;

    public UpdateVaultDetails getVaultDetails() {
        return vaultDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateConnectionDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", connectDescriptor=").append(String.valueOf(this.connectDescriptor));
        sb.append(", certificateTdn=").append(String.valueOf(this.certificateTdn));
        sb.append(", tlsWallet=").append(String.valueOf(this.tlsWallet));
        sb.append(", tlsKeystore=").append(String.valueOf(this.tlsKeystore));
        sb.append(", sshDetails=").append(String.valueOf(this.sshDetails));
        sb.append(", adminCredentials=").append(String.valueOf(this.adminCredentials));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", vaultDetails=").append(String.valueOf(this.vaultDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionDetails)) {
            return false;
        }

        UpdateConnectionDetails other = (UpdateConnectionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.connectDescriptor, other.connectDescriptor)
                && java.util.Objects.equals(this.certificateTdn, other.certificateTdn)
                && java.util.Objects.equals(this.tlsWallet, other.tlsWallet)
                && java.util.Objects.equals(this.tlsKeystore, other.tlsKeystore)
                && java.util.Objects.equals(this.sshDetails, other.sshDetails)
                && java.util.Objects.equals(this.adminCredentials, other.adminCredentials)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && java.util.Objects.equals(this.vaultDetails, other.vaultDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectDescriptor == null ? 43 : this.connectDescriptor.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateTdn == null ? 43 : this.certificateTdn.hashCode());
        result = (result * PRIME) + (this.tlsWallet == null ? 43 : this.tlsWallet.hashCode());
        result = (result * PRIME) + (this.tlsKeystore == null ? 43 : this.tlsKeystore.hashCode());
        result = (result * PRIME) + (this.sshDetails == null ? 43 : this.sshDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.adminCredentials == null ? 43 : this.adminCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result = (result * PRIME) + (this.vaultDetails == null ? 43 : this.vaultDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
