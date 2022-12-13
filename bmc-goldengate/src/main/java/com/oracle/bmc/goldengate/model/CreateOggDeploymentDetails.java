/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Deployment Data for creating an OggDeployment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOggDeploymentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateOggDeploymentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "deploymentName",
        "adminUsername",
        "adminPassword",
        "certificate",
        "key"
    })
    public CreateOggDeploymentDetails(
            String deploymentName,
            String adminUsername,
            String adminPassword,
            String certificate,
            String key) {
        super();
        this.deploymentName = deploymentName;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.certificate = certificate;
        this.key = key;
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
        /**
         * The password associated with the GoldenGate deployment console username. The password
         * must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1
         * numeric, and 1 special character. Special characters such as \u2018$\u2019,
         * \u2018^\u2019, or \u2018?\u2019 are not allowed. This field will be deprecated and
         * replaced by "passwordSecretId".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The password associated with the GoldenGate deployment console username. The password
         * must be 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1
         * numeric, and 1 special character. Special characters such as \u2018$\u2019,
         * \u2018^\u2019, or \u2018?\u2019 are not allowed. This field will be deprecated and
         * replaced by "passwordSecretId".
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

        public CreateOggDeploymentDetails build() {
            CreateOggDeploymentDetails model =
                    new CreateOggDeploymentDetails(
                            this.deploymentName,
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
        public Builder copy(CreateOggDeploymentDetails model) {
            if (model.wasPropertyExplicitlySet("deploymentName")) {
                this.deploymentName(model.getDeploymentName());
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

    /**
     * The password associated with the GoldenGate deployment console username. The password must be
     * 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1
     * special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019
     * are not allowed. This field will be deprecated and replaced by "passwordSecretId".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The password associated with the GoldenGate deployment console username. The password must be
     * 8 to 30 characters long and must contain at least 1 uppercase, 1 lowercase, 1 numeric, and 1
     * special character. Special characters such as \u2018$\u2019, \u2018^\u2019, or \u2018?\u2019
     * are not allowed. This field will be deprecated and replaced by "passwordSecretId".
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
        sb.append("CreateOggDeploymentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("deploymentName=").append(String.valueOf(this.deploymentName));
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
        if (!(o instanceof CreateOggDeploymentDetails)) {
            return false;
        }

        CreateOggDeploymentDetails other = (CreateOggDeploymentDetails) o;
        return java.util.Objects.equals(this.deploymentName, other.deploymentName)
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
                        + (this.deploymentName == null ? 43 : this.deploymentName.hashCode());
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
