/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The details to update an Oracle Object Storage data asset connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateConnectionFromObjectStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateConnectionFromObjectStorage extends UpdateConnectionDetails {
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
        /** The credential file content from an Oracle Object Storage wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        /**
         * The credential file content from an Oracle Object Storage wallet.
         *
         * @param credentialFileContent the value to set
         * @return this builder
         */
        public Builder credentialFileContent(String credentialFileContent) {
            this.credentialFileContent = credentialFileContent;
            this.__explicitlySet__.add("credentialFileContent");
            return this;
        }
        /** The OCI user OCID for the user to connect to. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCI user OCID for the user to connect to.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** The fingerprint for the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("fingerPrint")
        private String fingerPrint;

        /**
         * The fingerprint for the user.
         *
         * @param fingerPrint the value to set
         * @return this builder
         */
        public Builder fingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            this.__explicitlySet__.add("fingerPrint");
            return this;
        }
        /** The passphrase for the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("passPhrase")
        private String passPhrase;

        /**
         * The passphrase for the connection.
         *
         * @param passPhrase the value to set
         * @return this builder
         */
        public Builder passPhrase(String passPhrase) {
            this.passPhrase = passPhrase;
            this.__explicitlySet__.add("passPhrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionFromObjectStorage build() {
            UpdateConnectionFromObjectStorage model =
                    new UpdateConnectionFromObjectStorage(
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
                            this.credentialFileContent,
                            this.userId,
                            this.fingerPrint,
                            this.passPhrase);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionFromObjectStorage model) {
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
            if (model.wasPropertyExplicitlySet("credentialFileContent")) {
                this.credentialFileContent(model.getCredentialFileContent());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("fingerPrint")) {
                this.fingerPrint(model.getFingerPrint());
            }
            if (model.wasPropertyExplicitlySet("passPhrase")) {
                this.passPhrase(model.getPassPhrase());
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
    public UpdateConnectionFromObjectStorage(
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
            String credentialFileContent,
            String userId,
            String fingerPrint,
            String passPhrase) {
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
        this.credentialFileContent = credentialFileContent;
        this.userId = userId;
        this.fingerPrint = fingerPrint;
        this.passPhrase = passPhrase;
    }

    /** The credential file content from an Oracle Object Storage wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    private final String credentialFileContent;

    /**
     * The credential file content from an Oracle Object Storage wallet.
     *
     * @return the value
     */
    public String getCredentialFileContent() {
        return credentialFileContent;
    }

    /** The OCI user OCID for the user to connect to. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCI user OCID for the user to connect to.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** The fingerprint for the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("fingerPrint")
    private final String fingerPrint;

    /**
     * The fingerprint for the user.
     *
     * @return the value
     */
    public String getFingerPrint() {
        return fingerPrint;
    }

    /** The passphrase for the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("passPhrase")
    private final String passPhrase;

    /**
     * The passphrase for the connection.
     *
     * @return the value
     */
    public String getPassPhrase() {
        return passPhrase;
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
        sb.append("UpdateConnectionFromObjectStorage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", credentialFileContent=").append(String.valueOf(this.credentialFileContent));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", fingerPrint=").append(String.valueOf(this.fingerPrint));
        sb.append(", passPhrase=").append(String.valueOf(this.passPhrase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionFromObjectStorage)) {
            return false;
        }

        UpdateConnectionFromObjectStorage other = (UpdateConnectionFromObjectStorage) o;
        return java.util.Objects.equals(this.credentialFileContent, other.credentialFileContent)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.fingerPrint, other.fingerPrint)
                && java.util.Objects.equals(this.passPhrase, other.passPhrase)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.credentialFileContent == null
                                ? 43
                                : this.credentialFileContent.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.fingerPrint == null ? 43 : this.fingerPrint.hashCode());
        result = (result * PRIME) + (this.passPhrase == null ? 43 : this.passPhrase.hashCode());
        return result;
    }
}
