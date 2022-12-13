/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details to create a Database Connection resource.
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
    builder = CreateConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateConnectionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "databaseType",
        "manualDatabaseSubType",
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
        "definedTags",
        "nsgIds"
    })
    public CreateConnectionDetails(
            String compartmentId,
            String displayName,
            DatabaseConnectionTypes databaseType,
            DatabaseManualConnectionSubTypes manualDatabaseSubType,
            String databaseId,
            CreateConnectDescriptor connectDescriptor,
            String certificateTdn,
            String tlsWallet,
            String tlsKeystore,
            CreateSshDetails sshDetails,
            CreateAdminCredentials adminCredentials,
            CreatePrivateEndpoint privateEndpoint,
            CreateVaultDetails vaultDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> nsgIds) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.databaseType = databaseType;
        this.manualDatabaseSubType = manualDatabaseSubType;
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
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the compartment
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Database Connection display name identifier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Database Connection display name identifier.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Database connection type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseConnectionTypes databaseType;

        /**
         * Database connection type.
         *
         * @param databaseType the value to set
         * @return this builder
         **/
        public Builder databaseType(DatabaseConnectionTypes databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * Database manual connection subtype. This value can only be specified for manual connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("manualDatabaseSubType")
        private DatabaseManualConnectionSubTypes manualDatabaseSubType;

        /**
         * Database manual connection subtype. This value can only be specified for manual connections.
         *
         * @param manualDatabaseSubType the value to set
         * @return this builder
         **/
        public Builder manualDatabaseSubType(
                DatabaseManualConnectionSubTypes manualDatabaseSubType) {
            this.manualDatabaseSubType = manualDatabaseSubType;
            this.__explicitlySet__.add("manualDatabaseSubType");
            return this;
        }
        /**
         * The OCID of the cloud database. Required if the database connection type is Autonomous.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The OCID of the cloud database. Required if the database connection type is Autonomous.
         *
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
        private CreateConnectDescriptor connectDescriptor;

        public Builder connectDescriptor(CreateConnectDescriptor connectDescriptor) {
            this.connectDescriptor = connectDescriptor;
            this.__explicitlySet__.add("connectDescriptor");
            return this;
        }
        /**
         * This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified.
         * Not required for source container database connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
        private String certificateTdn;

        /**
         * This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified.
         * Not required for source container database connections.
         *
         * @param certificateTdn the value to set
         * @return this builder
         **/
        public Builder certificateTdn(String certificateTdn) {
            this.certificateTdn = certificateTdn;
            this.__explicitlySet__.add("certificateTdn");
            return this;
        }
        /**
         * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
        private String tlsWallet;

        /**
         * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
         *
         * @param tlsWallet the value to set
         * @return this builder
         **/
        public Builder tlsWallet(String tlsWallet) {
            this.tlsWallet = tlsWallet;
            this.__explicitlySet__.add("tlsWallet");
            return this;
        }
        /**
         * keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
        private String tlsKeystore;

        /**
         * keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
         *
         * @param tlsKeystore the value to set
         * @return this builder
         **/
        public Builder tlsKeystore(String tlsKeystore) {
            this.tlsKeystore = tlsKeystore;
            this.__explicitlySet__.add("tlsKeystore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
        private CreateSshDetails sshDetails;

        public Builder sshDetails(CreateSshDetails sshDetails) {
            this.sshDetails = sshDetails;
            this.__explicitlySet__.add("sshDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
        private CreateAdminCredentials adminCredentials;

        public Builder adminCredentials(CreateAdminCredentials adminCredentials) {
            this.adminCredentials = adminCredentials;
            this.__explicitlySet__.add("adminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private CreatePrivateEndpoint privateEndpoint;

        public Builder privateEndpoint(CreatePrivateEndpoint privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private CreateVaultDetails vaultDetails;

        public Builder vaultDetails(CreateVaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * An array of Network Security Group OCIDs used to define network access for Connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of Network Security Group OCIDs used to define network access for Connections.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateConnectionDetails build() {
            CreateConnectionDetails model =
                    new CreateConnectionDetails(
                            this.compartmentId,
                            this.displayName,
                            this.databaseType,
                            this.manualDatabaseSubType,
                            this.databaseId,
                            this.connectDescriptor,
                            this.certificateTdn,
                            this.tlsWallet,
                            this.tlsKeystore,
                            this.sshDetails,
                            this.adminCredentials,
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
        public Builder copy(CreateConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("manualDatabaseSubType")) {
                this.manualDatabaseSubType(model.getManualDatabaseSubType());
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
     * OCID of the compartment
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Database Connection display name identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Database Connection display name identifier.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Database connection type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseConnectionTypes databaseType;

    /**
     * Database connection type.
     *
     * @return the value
     **/
    public DatabaseConnectionTypes getDatabaseType() {
        return databaseType;
    }

    /**
     * Database manual connection subtype. This value can only be specified for manual connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manualDatabaseSubType")
    private final DatabaseManualConnectionSubTypes manualDatabaseSubType;

    /**
     * Database manual connection subtype. This value can only be specified for manual connections.
     *
     * @return the value
     **/
    public DatabaseManualConnectionSubTypes getManualDatabaseSubType() {
        return manualDatabaseSubType;
    }

    /**
     * The OCID of the cloud database. Required if the database connection type is Autonomous.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The OCID of the cloud database. Required if the database connection type is Autonomous.
     *
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
    private final CreateConnectDescriptor connectDescriptor;

    public CreateConnectDescriptor getConnectDescriptor() {
        return connectDescriptor;
    }

    /**
     * This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified.
     * Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
    private final String certificateTdn;

    /**
     * This name is the distinguished name used while creating the certificate on target database. Requires a TLS wallet to be specified.
     * Not required for source container database connections.
     *
     * @return the value
     **/
    public String getCertificateTdn() {
        return certificateTdn;
    }

    /**
     * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsWallet")
    private final String tlsWallet;

    /**
     * cwallet.sso containing containing the TCPS/SSL certificate; base64 encoded String. Not required for source container database connections.
     *
     * @return the value
     **/
    public String getTlsWallet() {
        return tlsWallet;
    }

    /**
     * keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tlsKeystore")
    private final String tlsKeystore;

    /**
     * keystore.jks file contents; base64 encoded String. Requires a TLS wallet to be specified. Not required for source container database connections.
     *
     * @return the value
     **/
    public String getTlsKeystore() {
        return tlsKeystore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
    private final CreateSshDetails sshDetails;

    public CreateSshDetails getSshDetails() {
        return sshDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
    private final CreateAdminCredentials adminCredentials;

    public CreateAdminCredentials getAdminCredentials() {
        return adminCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final CreatePrivateEndpoint privateEndpoint;

    public CreatePrivateEndpoint getPrivateEndpoint() {
        return privateEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    private final CreateVaultDetails vaultDetails;

    public CreateVaultDetails getVaultDetails() {
        return vaultDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
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

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * An array of Network Security Group OCIDs used to define network access for Connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of Network Security Group OCIDs used to define network access for Connections.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", manualDatabaseSubType=").append(String.valueOf(this.manualDatabaseSubType));
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
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateConnectionDetails)) {
            return false;
        }

        CreateConnectionDetails other = (CreateConnectionDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.manualDatabaseSubType, other.manualDatabaseSubType)
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
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.manualDatabaseSubType == null
                                ? 43
                                : this.manualDatabaseSubType.hashCode());
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
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
