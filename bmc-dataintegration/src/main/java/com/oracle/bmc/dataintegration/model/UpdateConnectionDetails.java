/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties used in connection update operations.
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
    defaultImpl = UpdateConnectionDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromLake.class,
        name = "LAKE_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromOracleEbs.class,
        name = "ORACLE_EBS_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromObjectStorage.class,
        name = "ORACLE_OBJECT_STORAGE_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromBICC.class,
        name = "BICC_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromRestNoAuth.class,
        name = "REST_NO_AUTH_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromHdfs.class,
        name = "HDFS_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromOAuth2.class,
        name = "OAUTH2_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromRestBasicAuth.class,
        name = "REST_BASIC_AUTH_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromOracleSiebel.class,
        name = "ORACLE_SIEBEL_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromMySqlHeatWave.class,
        name = "MYSQL_HEATWAVE_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromBIP.class,
        name = "BIP_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromMySQL.class,
        name = "MYSQL_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromJdbc.class,
        name = "GENERIC_JDBC_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromAmazonS3.class,
        name = "AMAZON_S3_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromAtp.class,
        name = "ORACLE_ATP_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromOracle.class,
        name = "ORACLEDB_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromAdwc.class,
        name = "ORACLE_ADWC_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateConnectionFromOraclePeopleSoft.class,
        name = "ORACLE_PEOPLESOFT_CONNECTION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateConnectionDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectStatus",
        "objectVersion",
        "identifier",
        "connectionProperties",
        "registryMetadata"
    })
    protected UpdateConnectionDetails(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            java.util.List<ConnectionProperty> connectionProperties,
            RegistryMetadata registryMetadata) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectStatus = objectStatus;
        this.objectVersion = objectVersion;
        this.identifier = identifier;
        this.connectionProperties = connectionProperties;
        this.registryMetadata = registryMetadata;
    }

    /**
     * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
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

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
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
     * User-defined description for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-defined description for the connection.
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
     * The properties for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
    private final java.util.List<ConnectionProperty> connectionProperties;

    /**
     * The properties for the connection.
     * @return the value
     **/
    public java.util.List<ConnectionProperty> getConnectionProperties() {
        return connectionProperties;
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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", connectionProperties=").append(String.valueOf(this.connectionProperties));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionDetails)) {
            return false;
        }

        UpdateConnectionDetails other = (UpdateConnectionDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.connectionProperties, other.connectionProperties)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionProperties == null
                                ? 43
                                : this.connectionProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of the connection.
     **/
    public enum ModelType {
        OracleAdwcConnection("ORACLE_ADWC_CONNECTION"),
        OracleAtpConnection("ORACLE_ATP_CONNECTION"),
        OracleObjectStorageConnection("ORACLE_OBJECT_STORAGE_CONNECTION"),
        OracledbConnection("ORACLEDB_CONNECTION"),
        MysqlConnection("MYSQL_CONNECTION"),
        GenericJdbcConnection("GENERIC_JDBC_CONNECTION"),
        BiccConnection("BICC_CONNECTION"),
        AmazonS3Connection("AMAZON_S3_CONNECTION"),
        BipConnection("BIP_CONNECTION"),
        LakeConnection("LAKE_CONNECTION"),
        OraclePeoplesoftConnection("ORACLE_PEOPLESOFT_CONNECTION"),
        OracleEbsConnection("ORACLE_EBS_CONNECTION"),
        OracleSiebelConnection("ORACLE_SIEBEL_CONNECTION"),
        HdfsConnection("HDFS_CONNECTION"),
        MysqlHeatwaveConnection("MYSQL_HEATWAVE_CONNECTION"),
        RestNoAuthConnection("REST_NO_AUTH_CONNECTION"),
        RestBasicAuthConnection("REST_BASIC_AUTH_CONNECTION"),
        Oauth2Connection("OAUTH2_CONNECTION"),
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
