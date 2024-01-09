/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties used in data asset update operations. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = UpdateDataAssetDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromRest.class,
            name = "REST_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromMySqlHeatWave.class,
            name = "MYSQL_HEATWAVE_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromOracleEbs.class,
            name = "ORACLE_EBS_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromAdwc.class,
            name = "ORACLE_ADWC_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromHdfs.class,
            name = "HDFS_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromOraclePeopleSoft.class,
            name = "ORACLE_PEOPLESOFT_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromObjectStorage.class,
            name = "ORACLE_OBJECT_STORAGE_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromAmazonS3.class,
            name = "AMAZON_S3_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromMySQL.class,
            name = "MYSQL_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromOracleSiebel.class,
            name = "ORACLE_SIEBEL_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromLake.class,
            name = "LAKE_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromAtp.class,
            name = "ORACLE_ATP_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromJdbc.class,
            name = "GENERIC_JDBC_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromFusionApp.class,
            name = "FUSION_APP_DATA_ASSET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDataAssetFromOracle.class,
            name = "ORACLE_DATA_ASSET")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class UpdateDataAssetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "name",
        "description",
        "objectStatus",
        "objectVersion",
        "identifier",
        "externalKey",
        "assetProperties",
        "registryMetadata"
    })
    protected UpdateDataAssetDetails(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.objectStatus = objectStatus;
        this.objectVersion = objectVersion;
        this.identifier = identifier;
        this.externalKey = externalKey;
        this.assetProperties = assetProperties;
        this.registryMetadata = registryMetadata;
    }

    /** Generated key that can be used in API calls to identify data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify data asset.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The model version of an object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The user-defined description of the data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The user-defined description of the data asset.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /** The version of the object that is used to track changes in the object instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** The external key for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key for the object.
     *
     * @return the value
     */
    public String getExternalKey() {
        return externalKey;
    }

    /** Additional properties for the data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetProperties")
    private final java.util.Map<String, String> assetProperties;

    /**
     * Additional properties for the data asset.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAssetProperties() {
        return assetProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
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
        sb.append("UpdateDataAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", assetProperties=").append(String.valueOf(this.assetProperties));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataAssetDetails)) {
            return false;
        }

        UpdateDataAssetDetails other = (UpdateDataAssetDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.assetProperties, other.assetProperties)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
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
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result =
                (result * PRIME)
                        + (this.assetProperties == null ? 43 : this.assetProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the data asset. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        OracleDataAsset("ORACLE_DATA_ASSET"),
        OracleObjectStorageDataAsset("ORACLE_OBJECT_STORAGE_DATA_ASSET"),
        OracleAtpDataAsset("ORACLE_ATP_DATA_ASSET"),
        OracleAdwcDataAsset("ORACLE_ADWC_DATA_ASSET"),
        MysqlDataAsset("MYSQL_DATA_ASSET"),
        GenericJdbcDataAsset("GENERIC_JDBC_DATA_ASSET"),
        FusionAppDataAsset("FUSION_APP_DATA_ASSET"),
        AmazonS3DataAsset("AMAZON_S3_DATA_ASSET"),
        LakeDataAsset("LAKE_DATA_ASSET"),
        OraclePeoplesoftDataAsset("ORACLE_PEOPLESOFT_DATA_ASSET"),
        OracleSiebelDataAsset("ORACLE_SIEBEL_DATA_ASSET"),
        OracleEbsDataAsset("ORACLE_EBS_DATA_ASSET"),
        HdfsDataAsset("HDFS_DATA_ASSET"),
        MysqlHeatwaveDataAsset("MYSQL_HEATWAVE_DATA_ASSET"),
        RestDataAsset("REST_DATA_ASSET"),
        ;

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ModelType: " + key);
        }
    };
}
