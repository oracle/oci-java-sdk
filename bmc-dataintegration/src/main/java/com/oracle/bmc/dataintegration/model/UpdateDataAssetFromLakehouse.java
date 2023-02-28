/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the Lakehouse data asset type. <br>
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
        builder = UpdateDataAssetFromLakehouse.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateDataAssetFromLakehouse extends UpdateDataAssetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetProperties")
        private java.util.Map<String, String> assetProperties;

        public Builder assetProperties(java.util.Map<String, String> assetProperties) {
            this.assetProperties = assetProperties;
            this.__explicitlySet__.add("assetProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }
        /** The Lakehouse Ocid. */
        @com.fasterxml.jackson.annotation.JsonProperty("lakehouseOcid")
        private String lakehouseOcid;

        /**
         * The Lakehouse Ocid.
         *
         * @param lakehouseOcid the value to set
         * @return this builder
         */
        public Builder lakehouseOcid(String lakehouseOcid) {
            this.lakehouseOcid = lakehouseOcid;
            this.__explicitlySet__.add("lakehouseOcid");
            return this;
        }
        /** The metastoreId for the specified Lakehouse Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The metastoreId for the specified Lakehouse Resource.
         *
         * @param metastoreId the value to set
         * @return this builder
         */
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /** The rangerEndpoint for the specified Lakehouse Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("rangerEndpoint")
        private String rangerEndpoint;

        /**
         * The rangerEndpoint for the specified Lakehouse Resource.
         *
         * @param rangerEndpoint the value to set
         * @return this builder
         */
        public Builder rangerEndpoint(String rangerEndpoint) {
            this.rangerEndpoint = rangerEndpoint;
            this.__explicitlySet__.add("rangerEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private UpdateConnectionFromLakehouse defaultConnection;

        public Builder defaultConnection(UpdateConnectionFromLakehouse defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataAssetFromLakehouse build() {
            UpdateDataAssetFromLakehouse model =
                    new UpdateDataAssetFromLakehouse(
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.externalKey,
                            this.assetProperties,
                            this.registryMetadata,
                            this.lakehouseOcid,
                            this.metastoreId,
                            this.rangerEndpoint,
                            this.defaultConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataAssetFromLakehouse model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
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
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("assetProperties")) {
                this.assetProperties(model.getAssetProperties());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("lakehouseOcid")) {
                this.lakehouseOcid(model.getLakehouseOcid());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("rangerEndpoint")) {
                this.rangerEndpoint(model.getRangerEndpoint());
            }
            if (model.wasPropertyExplicitlySet("defaultConnection")) {
                this.defaultConnection(model.getDefaultConnection());
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
    public UpdateDataAssetFromLakehouse(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata,
            String lakehouseOcid,
            String metastoreId,
            String rangerEndpoint,
            UpdateConnectionFromLakehouse defaultConnection) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                objectVersion,
                identifier,
                externalKey,
                assetProperties,
                registryMetadata);
        this.lakehouseOcid = lakehouseOcid;
        this.metastoreId = metastoreId;
        this.rangerEndpoint = rangerEndpoint;
        this.defaultConnection = defaultConnection;
    }

    /** The Lakehouse Ocid. */
    @com.fasterxml.jackson.annotation.JsonProperty("lakehouseOcid")
    private final String lakehouseOcid;

    /**
     * The Lakehouse Ocid.
     *
     * @return the value
     */
    public String getLakehouseOcid() {
        return lakehouseOcid;
    }

    /** The metastoreId for the specified Lakehouse Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The metastoreId for the specified Lakehouse Resource.
     *
     * @return the value
     */
    public String getMetastoreId() {
        return metastoreId;
    }

    /** The rangerEndpoint for the specified Lakehouse Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("rangerEndpoint")
    private final String rangerEndpoint;

    /**
     * The rangerEndpoint for the specified Lakehouse Resource.
     *
     * @return the value
     */
    public String getRangerEndpoint() {
        return rangerEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final UpdateConnectionFromLakehouse defaultConnection;

    public UpdateConnectionFromLakehouse getDefaultConnection() {
        return defaultConnection;
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
        sb.append("UpdateDataAssetFromLakehouse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", lakehouseOcid=").append(String.valueOf(this.lakehouseOcid));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", rangerEndpoint=").append(String.valueOf(this.rangerEndpoint));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataAssetFromLakehouse)) {
            return false;
        }

        UpdateDataAssetFromLakehouse other = (UpdateDataAssetFromLakehouse) o;
        return java.util.Objects.equals(this.lakehouseOcid, other.lakehouseOcid)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.rangerEndpoint, other.rangerEndpoint)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.lakehouseOcid == null ? 43 : this.lakehouseOcid.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.rangerEndpoint == null ? 43 : this.rangerEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        return result;
    }
}
