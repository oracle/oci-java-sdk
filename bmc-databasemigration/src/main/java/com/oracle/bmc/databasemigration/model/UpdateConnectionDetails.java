/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details to update in a Database Connection resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "replicationCredentials",
        "privateEndpoint",
        "vaultDetails",
        "freeformTags",
        "definedTags",
        "nsgIds"
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
            UpdateAdminCredentials replicationCredentials,
            UpdatePrivateEndpoint privateEndpoint,
            UpdateVaultDetails vaultDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> nsgIds) {
        super();
        this.displayName = displayName;
        this.databaseId = databaseId;
        this.connectDescriptor = connectDescriptor;
        this.certificateTdn = certificateTdn;
        this.tlsWallet = tlsWallet;
        this.tlsKeystore = tlsKeystore;
        this.sshDetails = sshDetails;
        this.adminCredentials = adminCredentials;
        this.replicationCredentials = replicationCredentials;
        this.privateEndpoint = privateEndpoint;
        this.vaultDetails = vaultDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Database Connection display name identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Database Connection display name identifier.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the cloud database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The OCID of the cloud database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
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
        /**
         * This name is the distinguished name used while creating the certificate on target
         * database. Not required for source container database connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
        private String certificateTdn;

        /**
         * This name is the distinguished name used while creating the certificate on target
         * database. Not required for source container database connections.
         *
         * @param certificateTdn the value to set
         * @return this builder
         */
        public Builder certificateTdn(String certificateTdn) {
            this.certificateTdn = certificateTdn;
            this.__explicitlySet__.add("certificateTdn");
            return this;
        }
        /**
         * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not
         * required for source container database connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
        private String tlsWallet;

        /**
         * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not
         * required for source container database connections.
         *
         * @param tlsWallet the value to set
         * @return this builder
         */
        public Builder tlsWallet(String tlsWallet) {
            this.tlsWallet = tlsWallet;
            this.__explicitlySet__.add("tlsWallet");
            return this;
        }
        /**
         * keystore.jks file contents; base64 encoded String. Not required for source container
         * database connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
        private String tlsKeystore;

        /**
         * keystore.jks file contents; base64 encoded String. Not required for source container
         * database connections.
         *
         * @param tlsKeystore the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonProperty("replicationCredentials")
        private UpdateAdminCredentials replicationCredentials;

        public Builder replicationCredentials(UpdateAdminCredentials replicationCredentials) {
            this.replicationCredentials = replicationCredentials;
            this.__explicitlySet__.add("replicationCredentials");
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
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * An array of Network Security Group OCIDs used to define network access for Connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of Network Security Group OCIDs used to define network access for Connections.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionDetails build() {
            UpdateConnectionDetails model =
                    new UpdateConnectionDetails(
                            this.displayName,
                            this.databaseId,
                            this.connectDescriptor,
                            this.certificateTdn,
                            this.tlsWallet,
                            this.tlsKeystore,
                            this.sshDetails,
                            this.adminCredentials,
                            this.replicationCredentials,
                            this.privateEndpoint,
                            this.vaultDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("connectDescriptor")) {
                this.connectDescriptor(model.getConnectDescriptor());
            }
            if (model.wasPropertyExplicitlySet("certificateTdn")) {
                this.certificateTdn(model.getCertificateTdn());
            }
            if (model.wasPropertyExplicitlySet("tlsWallet")) {
                this.tlsWallet(model.getTlsWallet());
            }
            if (model.wasPropertyExplicitlySet("tlsKeystore")) {
                this.tlsKeystore(model.getTlsKeystore());
            }
            if (model.wasPropertyExplicitlySet("sshDetails")) {
                this.sshDetails(model.getSshDetails());
            }
            if (model.wasPropertyExplicitlySet("adminCredentials")) {
                this.adminCredentials(model.getAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("replicationCredentials")) {
                this.replicationCredentials(model.getReplicationCredentials());
            }
            if (model.wasPropertyExplicitlySet("privateEndpoint")) {
                this.privateEndpoint(model.getPrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("vaultDetails")) {
                this.vaultDetails(model.getVaultDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Database Connection display name identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Database Connection display name identifier.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the cloud database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The OCID of the cloud database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
    private final UpdateConnectDescriptor connectDescriptor;

    public UpdateConnectDescriptor getConnectDescriptor() {
        return connectDescriptor;
    }

    /**
     * This name is the distinguished name used while creating the certificate on target database.
     * Not required for source container database connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
    private final String certificateTdn;

    /**
     * This name is the distinguished name used while creating the certificate on target database.
     * Not required for source container database connections.
     *
     * @return the value
     */
    public String getCertificateTdn() {
        return certificateTdn;
    }

    /**
     * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not
     * required for source container database connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
    private final String tlsWallet;

    /**
     * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not
     * required for source container database connections.
     *
     * @return the value
     */
    public String getTlsWallet() {
        return tlsWallet;
    }

    /**
     * keystore.jks file contents; base64 encoded String. Not required for source container database
     * connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
    private final String tlsKeystore;

    /**
     * keystore.jks file contents; base64 encoded String. Not required for source container database
     * connections.
     *
     * @return the value
     */
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

    @com.fasterxml.jackson.annotation.JsonProperty("replicationCredentials")
    private final UpdateAdminCredentials replicationCredentials;

    public UpdateAdminCredentials getReplicationCredentials() {
        return replicationCredentials;
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
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** An array of Network Security Group OCIDs used to define network access for Connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of Network Security Group OCIDs used to define network access for Connections.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", connectDescriptor=").append(String.valueOf(this.connectDescriptor));
        sb.append(", certificateTdn=").append(String.valueOf(this.certificateTdn));
        sb.append(", tlsWallet=").append(String.valueOf(this.tlsWallet));
        sb.append(", tlsKeystore=").append(String.valueOf(this.tlsKeystore));
        sb.append(", sshDetails=").append(String.valueOf(this.sshDetails));
        sb.append(", adminCredentials=").append(String.valueOf(this.adminCredentials));
        sb.append(", replicationCredentials=").append(String.valueOf(this.replicationCredentials));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", vaultDetails=").append(String.valueOf(this.vaultDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
                && java.util.Objects.equals(
                        this.replicationCredentials, other.replicationCredentials)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && java.util.Objects.equals(this.vaultDetails, other.vaultDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
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
                        + (this.replicationCredentials == null
                                ? 43
                                : this.replicationCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result = (result * PRIME) + (this.vaultDetails == null ? 43 : this.vaultDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
