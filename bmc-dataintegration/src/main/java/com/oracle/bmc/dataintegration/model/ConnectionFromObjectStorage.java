/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The connection details for an Oracle Object Storage data asset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConnectionFromObjectStorage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectionFromObjectStorage extends Connection {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primarySchema")
        private Schema primarySchema;

        public Builder primarySchema(Schema primarySchema) {
            this.primarySchema = primarySchema;
            this.__explicitlySet__.add("primarySchema");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }
        /**
         * The credential file content from an Oracle Object Storage wallet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        /**
         * The credential file content from an Oracle Object Storage wallet.
         * @param credentialFileContent the value to set
         * @return this builder
         **/
        public Builder credentialFileContent(String credentialFileContent) {
            this.credentialFileContent = credentialFileContent;
            this.__explicitlySet__.add("credentialFileContent");
            return this;
        }
        /**
         * The OCI user OCID for the user to connect to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCI user OCID for the user to connect to.
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The fingerprint for the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fingerPrint")
        private String fingerPrint;

        /**
         * The fingerprint for the user.
         * @param fingerPrint the value to set
         * @return this builder
         **/
        public Builder fingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            this.__explicitlySet__.add("fingerPrint");
            return this;
        }
        /**
         * The passphrase for the connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passPhrase")
        private String passPhrase;

        /**
         * The passphrase for the connection.
         * @param passPhrase the value to set
         * @return this builder
         **/
        public Builder passPhrase(String passPhrase) {
            this.passPhrase = passPhrase;
            this.__explicitlySet__.add("passPhrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionFromObjectStorage build() {
            ConnectionFromObjectStorage __instance__ =
                    new ConnectionFromObjectStorage(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            objectStatus,
                            identifier,
                            primarySchema,
                            connectionProperties,
                            isDefault,
                            metadata,
                            keyMap,
                            credentialFileContent,
                            userId,
                            fingerPrint,
                            passPhrase);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionFromObjectStorage o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .primarySchema(o.getPrimarySchema())
                            .connectionProperties(o.getConnectionProperties())
                            .isDefault(o.getIsDefault())
                            .metadata(o.getMetadata())
                            .keyMap(o.getKeyMap())
                            .credentialFileContent(o.getCredentialFileContent())
                            .userId(o.getUserId())
                            .fingerPrint(o.getFingerPrint())
                            .passPhrase(o.getPassPhrase());

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

    @Deprecated
    public ConnectionFromObjectStorage(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            Schema primarySchema,
            java.util.List<ConnectionProperty> connectionProperties,
            Boolean isDefault,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap,
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
                objectVersion,
                objectStatus,
                identifier,
                primarySchema,
                connectionProperties,
                isDefault,
                metadata,
                keyMap);
        this.credentialFileContent = credentialFileContent;
        this.userId = userId;
        this.fingerPrint = fingerPrint;
        this.passPhrase = passPhrase;
    }

    /**
     * The credential file content from an Oracle Object Storage wallet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    private final String credentialFileContent;

    /**
     * The credential file content from an Oracle Object Storage wallet.
     * @return the value
     **/
    public String getCredentialFileContent() {
        return credentialFileContent;
    }

    /**
     * The OCI user OCID for the user to connect to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCI user OCID for the user to connect to.
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * The fingerprint for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fingerPrint")
    private final String fingerPrint;

    /**
     * The fingerprint for the user.
     * @return the value
     **/
    public String getFingerPrint() {
        return fingerPrint;
    }

    /**
     * The passphrase for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passPhrase")
    private final String passPhrase;

    /**
     * The passphrase for the connection.
     * @return the value
     **/
    public String getPassPhrase() {
        return passPhrase;
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
        sb.append("ConnectionFromObjectStorage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", credentialFileContent=").append(String.valueOf(this.credentialFileContent));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", fingerPrint=").append(String.valueOf(this.fingerPrint));
        sb.append(", passPhrase=").append(String.valueOf(this.passPhrase));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionFromObjectStorage)) {
            return false;
        }

        ConnectionFromObjectStorage other = (ConnectionFromObjectStorage) o;
        return java.util.Objects.equals(this.credentialFileContent, other.credentialFileContent)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.fingerPrint, other.fingerPrint)
                && java.util.Objects.equals(this.passPhrase, other.passPhrase)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
