/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Summary details for the Lake data asset type.
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
    builder = DataAssetSummaryFromLake.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataAssetSummaryFromLake extends DataAssetSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("nativeTypeSystem")
        private TypeSystem nativeTypeSystem;

        public Builder nativeTypeSystem(TypeSystem nativeTypeSystem) {
            this.nativeTypeSystem = nativeTypeSystem;
            this.__explicitlySet__.add("nativeTypeSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The Lake Ocid.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lakeId")
        private String lakeId;

        /**
         * The Lake Ocid.
         * @param lakeId the value to set
         * @return this builder
         **/
        public Builder lakeId(String lakeId) {
            this.lakeId = lakeId;
            this.__explicitlySet__.add("lakeId");
            return this;
        }
        /**
         * The metastoreId for the specified Lake Resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The metastoreId for the specified Lake Resource.
         * @param metastoreId the value to set
         * @return this builder
         **/
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /**
         * The lakeProxyEndpoint for the specified Lake Resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lakeProxyEndpoint")
        private String lakeProxyEndpoint;

        /**
         * The lakeProxyEndpoint for the specified Lake Resource.
         * @param lakeProxyEndpoint the value to set
         * @return this builder
         **/
        public Builder lakeProxyEndpoint(String lakeProxyEndpoint) {
            this.lakeProxyEndpoint = lakeProxyEndpoint;
            this.__explicitlySet__.add("lakeProxyEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private ConnectionSummaryFromLake defaultConnection;

        public Builder defaultConnection(ConnectionSummaryFromLake defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataAssetSummaryFromLake build() {
            DataAssetSummaryFromLake model =
                    new DataAssetSummaryFromLake(
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.identifier,
                            this.externalKey,
                            this.assetProperties,
                            this.nativeTypeSystem,
                            this.objectVersion,
                            this.parentRef,
                            this.metadata,
                            this.lakeId,
                            this.metastoreId,
                            this.lakeProxyEndpoint,
                            this.defaultConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataAssetSummaryFromLake model) {
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
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("assetProperties")) {
                this.assetProperties(model.getAssetProperties());
            }
            if (model.wasPropertyExplicitlySet("nativeTypeSystem")) {
                this.nativeTypeSystem(model.getNativeTypeSystem());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("lakeId")) {
                this.lakeId(model.getLakeId());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("lakeProxyEndpoint")) {
                this.lakeProxyEndpoint(model.getLakeProxyEndpoint());
            }
            if (model.wasPropertyExplicitlySet("defaultConnection")) {
                this.defaultConnection(model.getDefaultConnection());
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

    @Deprecated
    public DataAssetSummaryFromLake(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            TypeSystem nativeTypeSystem,
            Integer objectVersion,
            ParentReference parentRef,
            ObjectMetadata metadata,
            String lakeId,
            String metastoreId,
            String lakeProxyEndpoint,
            ConnectionSummaryFromLake defaultConnection) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                identifier,
                externalKey,
                assetProperties,
                nativeTypeSystem,
                objectVersion,
                parentRef,
                metadata);
        this.lakeId = lakeId;
        this.metastoreId = metastoreId;
        this.lakeProxyEndpoint = lakeProxyEndpoint;
        this.defaultConnection = defaultConnection;
    }

    /**
     * The Lake Ocid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lakeId")
    private final String lakeId;

    /**
     * The Lake Ocid.
     * @return the value
     **/
    public String getLakeId() {
        return lakeId;
    }

    /**
     * The metastoreId for the specified Lake Resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The metastoreId for the specified Lake Resource.
     * @return the value
     **/
    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * The lakeProxyEndpoint for the specified Lake Resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lakeProxyEndpoint")
    private final String lakeProxyEndpoint;

    /**
     * The lakeProxyEndpoint for the specified Lake Resource.
     * @return the value
     **/
    public String getLakeProxyEndpoint() {
        return lakeProxyEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final ConnectionSummaryFromLake defaultConnection;

    public ConnectionSummaryFromLake getDefaultConnection() {
        return defaultConnection;
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
        sb.append("DataAssetSummaryFromLake(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", lakeId=").append(String.valueOf(this.lakeId));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", lakeProxyEndpoint=").append(String.valueOf(this.lakeProxyEndpoint));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAssetSummaryFromLake)) {
            return false;
        }

        DataAssetSummaryFromLake other = (DataAssetSummaryFromLake) o;
        return java.util.Objects.equals(this.lakeId, other.lakeId)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.lakeProxyEndpoint, other.lakeProxyEndpoint)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.lakeId == null ? 43 : this.lakeId.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.lakeProxyEndpoint == null ? 43 : this.lakeProxyEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        return result;
    }
}
