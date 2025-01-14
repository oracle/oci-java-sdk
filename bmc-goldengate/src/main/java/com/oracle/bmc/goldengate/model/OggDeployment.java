/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment Data for an OggDeployment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OggDeployment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OggDeployment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deploymentName",
        "adminUsername",
        "oggVersion",
        "certificate",
        "credentialStore",
        "identityDomainId",
        "passwordSecretId",
        "groupToRolesMapping"
    })
    public OggDeployment(
            String deploymentName,
            String adminUsername,
            String oggVersion,
            String certificate,
            CredentialStore credentialStore,
            String identityDomainId,
            String passwordSecretId,
            GroupToRolesMappingDetails groupToRolesMapping) {
        super();
        this.deploymentName = deploymentName;
        this.adminUsername = adminUsername;
        this.oggVersion = oggVersion;
        this.certificate = certificate;
        this.credentialStore = credentialStore;
        this.identityDomainId = identityDomainId;
        this.passwordSecretId = passwordSecretId;
        this.groupToRolesMapping = groupToRolesMapping;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters
         * long, must contain only alphanumeric characters and must start with a letter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentName")
        private String deploymentName;

        /**
         * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters
         * long, must contain only alphanumeric characters and must start with a letter.
         *
         * @param deploymentName the value to set
         * @return this builder
         */
        public Builder deploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            this.__explicitlySet__.add("deploymentName");
            return this;
        }
        /** The GoldenGate deployment console username. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        /**
         * The GoldenGate deployment console username.
         *
         * @param adminUsername the value to set
         * @return this builder
         */
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }
        /** Version of OGG */
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         */
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }
        /** The base64 encoded content of the PEM file containing the SSL certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        /**
         * The base64 encoded content of the PEM file containing the SSL certificate.
         *
         * @param certificate the value to set
         * @return this builder
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }
        /** The type of credential store for OGG. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialStore")
        private CredentialStore credentialStore;

        /**
         * The type of credential store for OGG.
         *
         * @param credentialStore the value to set
         * @return this builder
         */
        public Builder credentialStore(CredentialStore credentialStore) {
            this.credentialStore = credentialStore;
            this.__explicitlySet__.add("credentialStore");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Identity Domain when IAM credential store is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainId")
        private String identityDomainId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Identity Domain when IAM credential store is used.
         *
         * @param identityDomainId the value to set
         * @return this builder
         */
        public Builder identityDomainId(String identityDomainId) {
            this.identityDomainId = identityDomainId;
            this.__explicitlySet__.add("identityDomainId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret where the deployment password is stored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Secret where the deployment password is stored.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupToRolesMapping")
        private GroupToRolesMappingDetails groupToRolesMapping;

        public Builder groupToRolesMapping(GroupToRolesMappingDetails groupToRolesMapping) {
            this.groupToRolesMapping = groupToRolesMapping;
            this.__explicitlySet__.add("groupToRolesMapping");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OggDeployment build() {
            OggDeployment model =
                    new OggDeployment(
                            this.deploymentName,
                            this.adminUsername,
                            this.oggVersion,
                            this.certificate,
                            this.credentialStore,
                            this.identityDomainId,
                            this.passwordSecretId,
                            this.groupToRolesMapping);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OggDeployment model) {
            if (model.wasPropertyExplicitlySet("deploymentName")) {
                this.deploymentName(model.getDeploymentName());
            }
            if (model.wasPropertyExplicitlySet("adminUsername")) {
                this.adminUsername(model.getAdminUsername());
            }
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
            }
            if (model.wasPropertyExplicitlySet("certificate")) {
                this.certificate(model.getCertificate());
            }
            if (model.wasPropertyExplicitlySet("credentialStore")) {
                this.credentialStore(model.getCredentialStore());
            }
            if (model.wasPropertyExplicitlySet("identityDomainId")) {
                this.identityDomainId(model.getIdentityDomainId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("groupToRolesMapping")) {
                this.groupToRolesMapping(model.getGroupToRolesMapping());
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

    /**
     * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters
     * long, must contain only alphanumeric characters and must start with a letter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentName")
    private final String deploymentName;

    /**
     * The name given to the GoldenGate service deployment. The name must be 1 to 32 characters
     * long, must contain only alphanumeric characters and must start with a letter.
     *
     * @return the value
     */
    public String getDeploymentName() {
        return deploymentName;
    }

    /** The GoldenGate deployment console username. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    private final String adminUsername;

    /**
     * The GoldenGate deployment console username.
     *
     * @return the value
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /** Version of OGG */
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     */
    public String getOggVersion() {
        return oggVersion;
    }

    /** The base64 encoded content of the PEM file containing the SSL certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final String certificate;

    /**
     * The base64 encoded content of the PEM file containing the SSL certificate.
     *
     * @return the value
     */
    public String getCertificate() {
        return certificate;
    }

    /** The type of credential store for OGG. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialStore")
    private final CredentialStore credentialStore;

    /**
     * The type of credential store for OGG.
     *
     * @return the value
     */
    public CredentialStore getCredentialStore() {
        return credentialStore;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Identity Domain when IAM credential store is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainId")
    private final String identityDomainId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Identity Domain when IAM credential store is used.
     *
     * @return the value
     */
    public String getIdentityDomainId() {
        return identityDomainId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret where the deployment password is stored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Secret where the deployment password is stored.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("groupToRolesMapping")
    private final GroupToRolesMappingDetails groupToRolesMapping;

    public GroupToRolesMappingDetails getGroupToRolesMapping() {
        return groupToRolesMapping;
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
        sb.append("OggDeployment(");
        sb.append("super=").append(super.toString());
        sb.append("deploymentName=").append(String.valueOf(this.deploymentName));
        sb.append(", adminUsername=").append(String.valueOf(this.adminUsername));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append(", credentialStore=").append(String.valueOf(this.credentialStore));
        sb.append(", identityDomainId=").append(String.valueOf(this.identityDomainId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", groupToRolesMapping=").append(String.valueOf(this.groupToRolesMapping));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OggDeployment)) {
            return false;
        }

        OggDeployment other = (OggDeployment) o;
        return java.util.Objects.equals(this.deploymentName, other.deploymentName)
                && java.util.Objects.equals(this.adminUsername, other.adminUsername)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.credentialStore, other.credentialStore)
                && java.util.Objects.equals(this.identityDomainId, other.identityDomainId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.groupToRolesMapping, other.groupToRolesMapping)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deploymentName == null ? 43 : this.deploymentName.hashCode());
        result =
                (result * PRIME)
                        + (this.adminUsername == null ? 43 : this.adminUsername.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialStore == null ? 43 : this.credentialStore.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomainId == null ? 43 : this.identityDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.groupToRolesMapping == null
                                ? 43
                                : this.groupToRolesMapping.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
