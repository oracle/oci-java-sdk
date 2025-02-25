/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Information about the Terraform configuration.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceRecordType",
    defaultImpl = ConfigSourceRecord.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DevOpsConfigSourceRecord.class,
        name = "DEVOPS_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GitConfigSourceRecord.class,
        name = "GIT_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ZipUploadConfigSourceRecord.class,
        name = "ZIP_UPLOAD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BitbucketCloudConfigSourceRecord.class,
        name = "BITBUCKET_CLOUD_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BitbucketServerConfigSourceRecord.class,
        name = "BITBUCKET_SERVER_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ObjectStorageConfigSourceRecord.class,
        name = "OBJECT_STORAGE_CONFIG_SOURCE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ConfigSourceRecord extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected ConfigSourceRecord() {
        super();
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
        sb.append("ConfigSourceRecord(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigSourceRecord)) {
            return false;
        }

        ConfigSourceRecord other = (ConfigSourceRecord) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of configuration source to use for the Terraform configuration.
     *
     **/
    public enum ConfigSourceRecordType {
        BitbucketCloudConfigSource("BITBUCKET_CLOUD_CONFIG_SOURCE"),
        BitbucketServerConfigSource("BITBUCKET_SERVER_CONFIG_SOURCE"),
        CompartmentConfigSource("COMPARTMENT_CONFIG_SOURCE"),
        DevopsConfigSource("DEVOPS_CONFIG_SOURCE"),
        GitConfigSource("GIT_CONFIG_SOURCE"),
        ObjectStorageConfigSource("OBJECT_STORAGE_CONFIG_SOURCE"),
        ZipUpload("ZIP_UPLOAD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfigSourceRecordType.class);

        private final String value;
        private static java.util.Map<String, ConfigSourceRecordType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigSourceRecordType v : ConfigSourceRecordType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfigSourceRecordType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigSourceRecordType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfigSourceRecordType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
