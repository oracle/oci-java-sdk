/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The connection details for a FUSION_APP BICC connection. <br>
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
        builder = ConnectionFromBICCDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConnectionFromBICCDetails extends ConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecret")
        private SensitiveAttribute passwordSecret;

        public Builder passwordSecret(SensitiveAttribute passwordSecret) {
            this.passwordSecret = passwordSecret;
            this.__explicitlySet__.add("passwordSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultExternalStorage")
        private ExternalStorage defaultExternalStorage;

        public Builder defaultExternalStorage(ExternalStorage defaultExternalStorage) {
            this.defaultExternalStorage = defaultExternalStorage;
            this.__explicitlySet__.add("defaultExternalStorage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionFromBICCDetails build() {
            ConnectionFromBICCDetails model =
                    new ConnectionFromBICCDetails(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.primarySchema,
                            this.connectionProperties,
                            this.isDefault,
                            this.metadata,
                            this.username,
                            this.passwordSecret,
                            this.defaultExternalStorage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionFromBICCDetails model) {
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
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("primarySchema")) {
                this.primarySchema(model.getPrimarySchema());
            }
            if (model.wasPropertyExplicitlySet("connectionProperties")) {
                this.connectionProperties(model.getConnectionProperties());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("passwordSecret")) {
                this.passwordSecret(model.getPasswordSecret());
            }
            if (model.wasPropertyExplicitlySet("defaultExternalStorage")) {
                this.defaultExternalStorage(model.getDefaultExternalStorage());
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
    public ConnectionFromBICCDetails(
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
            String username,
            SensitiveAttribute passwordSecret,
            ExternalStorage defaultExternalStorage) {
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
                metadata);
        this.username = username;
        this.passwordSecret = passwordSecret;
        this.defaultExternalStorage = defaultExternalStorage;
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

    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecret")
    private final SensitiveAttribute passwordSecret;

    public SensitiveAttribute getPasswordSecret() {
        return passwordSecret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultExternalStorage")
    private final ExternalStorage defaultExternalStorage;

    public ExternalStorage getDefaultExternalStorage() {
        return defaultExternalStorage;
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
        sb.append("ConnectionFromBICCDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", passwordSecret=").append(String.valueOf(this.passwordSecret));
        sb.append(", defaultExternalStorage=").append(String.valueOf(this.defaultExternalStorage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionFromBICCDetails)) {
            return false;
        }

        ConnectionFromBICCDetails other = (ConnectionFromBICCDetails) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.passwordSecret, other.passwordSecret)
                && java.util.Objects.equals(
                        this.defaultExternalStorage, other.defaultExternalStorage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecret == null ? 43 : this.passwordSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultExternalStorage == null
                                ? 43
                                : this.defaultExternalStorage.hashCode());
        return result;
    }
}
