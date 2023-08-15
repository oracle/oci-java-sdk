/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment Details for updating an OggDeployment <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOggDeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOggDeploymentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialStore",
        "identityDomainId",
        "passwordSecretId",
        "adminUsername",
        "adminPassword",
        "certificate",
        "key"
    })
    public UpdateOggDeploymentDetails(
            CredentialStore credentialStore,
            String identityDomainId,
            String passwordSecretId,
            String adminUsername,
            String adminPassword,
            String certificate,
            String key) {
        super();
        this.credentialStore = credentialStore;
        this.identityDomainId = identityDomainId;
        this.passwordSecretId = passwordSecretId;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.certificate = certificate;
        this.key = key;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The password associated with the GoldenGate deployment console username. The password
         * must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1
         * numeric, and 1 special character. Special characters such as '$', '^', or '?' are not
         * allowed. This field will be deprecated and replaced by "passwordSecretId".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The password associated with the GoldenGate deployment console username. The password
         * must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1
         * numeric, and 1 special character. Special characters such as '$', '^', or '?' are not
         * allowed. This field will be deprecated and replaced by "passwordSecretId".
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /** A PEM-encoded SSL certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        /**
         * A PEM-encoded SSL certificate.
         *
         * @param certificate the value to set
         * @return this builder
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }
        /** A PEM-encoded private key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A PEM-encoded private key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOggDeploymentDetails build() {
            UpdateOggDeploymentDetails model =
                    new UpdateOggDeploymentDetails(
                            this.credentialStore,
                            this.identityDomainId,
                            this.passwordSecretId,
                            this.adminUsername,
                            this.adminPassword,
                            this.certificate,
                            this.key);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOggDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("credentialStore")) {
                this.credentialStore(model.getCredentialStore());
            }
            if (model.wasPropertyExplicitlySet("identityDomainId")) {
                this.identityDomainId(model.getIdentityDomainId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("adminUsername")) {
                this.adminUsername(model.getAdminUsername());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("certificate")) {
                this.certificate(model.getCertificate());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
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

    /**
     * The password associated with the GoldenGate deployment console username. The password must be
     * 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1
     * special character. Special characters such as '$', '^', or '?' are not allowed. This field
     * will be deprecated and replaced by "passwordSecretId".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The password associated with the GoldenGate deployment console username. The password must be
     * 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1
     * special character. Special characters such as '$', '^', or '?' are not allowed. This field
     * will be deprecated and replaced by "passwordSecretId".
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /** A PEM-encoded SSL certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final String certificate;

    /**
     * A PEM-encoded SSL certificate.
     *
     * @return the value
     */
    public String getCertificate() {
        return certificate;
    }

    /** A PEM-encoded private key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A PEM-encoded private key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
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
        sb.append("UpdateOggDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialStore=").append(String.valueOf(this.credentialStore));
        sb.append(", identityDomainId=").append(String.valueOf(this.identityDomainId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", adminUsername=").append(String.valueOf(this.adminUsername));
        sb.append(", adminPassword=").append("<redacted>");
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOggDeploymentDetails)) {
            return false;
        }

        UpdateOggDeploymentDetails other = (UpdateOggDeploymentDetails) o;
        return java.util.Objects.equals(this.credentialStore, other.credentialStore)
                && java.util.Objects.equals(this.identityDomainId, other.identityDomainId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.adminUsername, other.adminUsername)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.key, other.key)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
                        + (this.adminUsername == null ? 43 : this.adminUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
