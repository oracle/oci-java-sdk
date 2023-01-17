/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Represents a data source in the Data Integration service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = DataAsset.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromJdbc.class,
        name = "GENERIC_JDBC_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromOracleDetails.class,
        name = "ORACLE_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromAdwcDetails.class,
        name = "ORACLE_ADWC_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromAmazonS3.class,
        name = "AMAZON_S3_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromLakehouseDetails.class,
        name = "LAKE_HOUSE_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromObjectStorageDetails.class,
        name = "ORACLE_OBJECT_STORAGE_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromFusionApp.class,
        name = "FUSION_APP_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromAtpDetails.class,
        name = "ORACLE_ATP_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromMySQL.class,
        name = "MYSQL_DATA_ASSET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DataAssetFromRestDetails.class,
        name = "REST_DATA_ASSET"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DataAsset extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "name",
        "description",
        "objectStatus",
        "identifier",
        "externalKey",
        "assetProperties",
        "nativeTypeSystem",
        "objectVersion",
        "parentRef",
        "metadata",
        "keyMap"
    })
    protected DataAsset(
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
            java.util.Map<String, String> keyMap) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.externalKey = externalKey;
        this.assetProperties = assetProperties;
        this.nativeTypeSystem = nativeTypeSystem;
        this.objectVersion = objectVersion;
        this.parentRef = parentRef;
        this.metadata = metadata;
        this.keyMap = keyMap;
    }

    /**
     * Generated key that can be used in API calls to identify data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify data asset.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * User-defined description of the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-defined description of the data asset.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * The external key for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key for the object.
     * @return the value
     **/
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Additional properties for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetProperties")
    private final java.util.Map<String, String> assetProperties;

    /**
     * Additional properties for the data asset.
     * @return the value
     **/
    public java.util.Map<String, String> getAssetProperties() {
        return assetProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nativeTypeSystem")
    private final TypeSystem nativeTypeSystem;

    public TypeSystem getNativeTypeSystem() {
        return nativeTypeSystem;
    }

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     * @return the value
     **/
    public Integer getObjectVersion() {
        return objectVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
    private final java.util.Map<String, String> keyMap;

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
     * @return the value
     **/
    public java.util.Map<String, String> getKeyMap() {
        return keyMap;
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
        sb.append("DataAsset(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", assetProperties=").append(String.valueOf(this.assetProperties));
        sb.append(", nativeTypeSystem=").append(String.valueOf(this.nativeTypeSystem));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", keyMap=").append(String.valueOf(this.keyMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAsset)) {
            return false;
        }

        DataAsset other = (DataAsset) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.assetProperties, other.assetProperties)
                && java.util.Objects.equals(this.nativeTypeSystem, other.nativeTypeSystem)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.keyMap, other.keyMap)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result =
                (result * PRIME)
                        + (this.assetProperties == null ? 43 : this.assetProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.nativeTypeSystem == null ? 43 : this.nativeTypeSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.keyMap == null ? 43 : this.keyMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of the data asset.
     **/
    public enum ModelType {
        OracleDataAsset("ORACLE_DATA_ASSET"),
        OracleObjectStorageDataAsset("ORACLE_OBJECT_STORAGE_DATA_ASSET"),
        OracleAtpDataAsset("ORACLE_ATP_DATA_ASSET"),
        OracleAdwcDataAsset("ORACLE_ADWC_DATA_ASSET"),
        MysqlDataAsset("MYSQL_DATA_ASSET"),
        GenericJdbcDataAsset("GENERIC_JDBC_DATA_ASSET"),
        FusionAppDataAsset("FUSION_APP_DATA_ASSET"),
        AmazonS3DataAsset("AMAZON_S3_DATA_ASSET"),
        LakeHouseDataAsset("LAKE_HOUSE_DATA_ASSET"),
        RestDataAsset("REST_DATA_ASSET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
