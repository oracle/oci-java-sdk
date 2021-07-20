/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The connection details for a data asset.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = ConnectionDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromJdbcDetails.class,
        name = "GENERIC_JDBC_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromAmazonS3Details.class,
        name = "AMAZON_S3_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromObjectStorageDetails.class,
        name = "ORACLE_OBJECT_STORAGE_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromBICCDetails.class,
        name = "BICC_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromMySQLDetails.class,
        name = "MYSQL_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromAdwcDetails.class,
        name = "ORACLE_ADWC_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromAtpDetails.class,
        name = "ORACLE_ATP_CONNECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConnectionFromOracleDetails.class,
        name = "ORACLEDB_CONNECTION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ConnectionDetails {

    /**
     * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * User-defined description for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    Integer objectVersion;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    @com.fasterxml.jackson.annotation.JsonProperty("primarySchema")
    Schema primarySchema;

    /**
     * The properties for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
    java.util.List<ConnectionProperty> connectionProperties;

    /**
     * The default property for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ObjectMetadata metadata;

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
