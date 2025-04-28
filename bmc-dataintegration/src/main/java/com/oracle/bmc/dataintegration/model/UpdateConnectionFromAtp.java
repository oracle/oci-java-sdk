/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The details to update an Autonomous Transaction Processing data asset connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateConnectionFromAtp.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateConnectionFromAtp extends UpdateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.List<ConnectionProperty> connectionProperties;

        public Builder connectionProperties(
                java.util.List<ConnectionProperty> connectionProperties) {
            this.connectionProperties = connectionProperties;
            this.__explicitlySet__.add("connectionProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }
        /** The Autonomous Transaction Processing instance service name. */
        @com.fasterxml.jackson.annotation.JsonProperty("tnsAlias")
        private String tnsAlias;

        /**
         * The Autonomous Transaction Processing instance service name.
         *
         * @param tnsAlias the value to set
         * @return this builder
         */
        public Builder tnsAlias(String tnsAlias) {
            this.tnsAlias = tnsAlias;
            this.__explicitlySet__.add("tnsAlias");
            return this;
        }
        /** Array of service names that are available for selection in the tnsAlias property. */
        @com.fasterxml.jackson.annotation.JsonProperty("tnsNames")
        private java.util.List<String> tnsNames;

        /**
         * Array of service names that are available for selection in the tnsAlias property.
         *
         * @param tnsNames the value to set
         * @return this builder
         */
        public Builder tnsNames(java.util.List<String> tnsNames) {
            this.tnsNames = tnsNames;
            this.__explicitlySet__.add("tnsNames");
            return this;
        }
        /** The user name for the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The user name for the connection.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** The password for the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password for the connection.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecret")
        private SensitiveAttribute passwordSecret;

        public Builder passwordSecret(SensitiveAttribute passwordSecret) {
            this.passwordSecret = passwordSecret;
            this.__explicitlySet__.add("passwordSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionFromAtp build() {
            UpdateConnectionFromAtp model =
                    new UpdateConnectionFromAtp(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.connectionProperties,
                            this.registryMetadata,
                            this.tnsAlias,
                            this.tnsNames,
                            this.username,
                            this.password,
                            this.passwordSecret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionFromAtp model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("connectionProperties")) {
                this.connectionProperties(model.getConnectionProperties());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("tnsAlias")) {
                this.tnsAlias(model.getTnsAlias());
            }
            if (model.wasPropertyExplicitlySet("tnsNames")) {
                this.tnsNames(model.getTnsNames());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("passwordSecret")) {
                this.passwordSecret(model.getPasswordSecret());
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

    @Deprecated
    public UpdateConnectionFromAtp(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            java.util.List<ConnectionProperty> connectionProperties,
            RegistryMetadata registryMetadata,
            String tnsAlias,
            java.util.List<String> tnsNames,
            String username,
            String password,
            SensitiveAttribute passwordSecret) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                objectVersion,
                identifier,
                connectionProperties,
                registryMetadata);
        this.tnsAlias = tnsAlias;
        this.tnsNames = tnsNames;
        this.username = username;
        this.password = password;
        this.passwordSecret = passwordSecret;
    }

    /** The Autonomous Transaction Processing instance service name. */
    @com.fasterxml.jackson.annotation.JsonProperty("tnsAlias")
    private final String tnsAlias;

    /**
     * The Autonomous Transaction Processing instance service name.
     *
     * @return the value
     */
    public String getTnsAlias() {
        return tnsAlias;
    }

    /** Array of service names that are available for selection in the tnsAlias property. */
    @com.fasterxml.jackson.annotation.JsonProperty("tnsNames")
    private final java.util.List<String> tnsNames;

    /**
     * Array of service names that are available for selection in the tnsAlias property.
     *
     * @return the value
     */
    public java.util.List<String> getTnsNames() {
        return tnsNames;
    }

    /** The user name for the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The user name for the connection.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** The password for the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password for the connection.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecret")
    private final SensitiveAttribute passwordSecret;

    public SensitiveAttribute getPasswordSecret() {
        return passwordSecret;
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
        sb.append("UpdateConnectionFromAtp(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", tnsAlias=").append(String.valueOf(this.tnsAlias));
        sb.append(", tnsNames=").append(String.valueOf(this.tnsNames));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", passwordSecret=").append(String.valueOf(this.passwordSecret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionFromAtp)) {
            return false;
        }

        UpdateConnectionFromAtp other = (UpdateConnectionFromAtp) o;
        return java.util.Objects.equals(this.tnsAlias, other.tnsAlias)
                && java.util.Objects.equals(this.tnsNames, other.tnsNames)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.passwordSecret, other.passwordSecret)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.tnsAlias == null ? 43 : this.tnsAlias.hashCode());
        result = (result * PRIME) + (this.tnsNames == null ? 43 : this.tnsNames.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecret == null ? 43 : this.passwordSecret.hashCode());
        return result;
    }
}
