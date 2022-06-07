/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
    property = "configSourceType",
    defaultImpl = ConfigSource.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GitConfigSource.class,
        name = "GIT_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ObjectStorageConfigSource.class,
        name = "OBJECT_STORAGE_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CompartmentConfigSource.class,
        name = "COMPARTMENT_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ZipUploadConfigSource.class,
        name = "ZIP_UPLOAD"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ConfigSource {
    @Deprecated
    @java.beans.ConstructorProperties({"workingDirectory"})
    protected ConfigSource(String workingDirectory) {
        super();
        this.workingDirectory = workingDirectory;
    }

    /**
     * File path to the directory to use for running Terraform.
     * If not specified, the root directory is used.
     * Required when using a zip Terraform configuration ({@code configSourceType} value of {@code ZIP_UPLOAD}) that contains folders.
     * Ignored for the {@code configSourceType} value of {@code COMPARTMENT_CONFIG_SOURCE}.
     * For more information about required and recommended file structure, see
     * [File Structure (Terraform Configurations for Resource Manager)](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#filestructure).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfigSource(");
        sb.append("workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigSource)) {
            return false;
        }

        ConfigSource other = (ConfigSource) o;
        return java.util.Objects.equals(this.workingDirectory, other.workingDirectory);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.workingDirectory == null ? 43 : this.workingDirectory.hashCode());
        return result;
    }

    /**
     * The type of configuration source to use for the Terraform configuration.
     *
     **/
    public enum ConfigSourceType {
        ZipUpload("ZIP_UPLOAD"),
        GitConfigSource("GIT_CONFIG_SOURCE"),
        CompartmentConfigSource("COMPARTMENT_CONFIG_SOURCE"),
        ObjectStorageConfigSource("OBJECT_STORAGE_CONFIG_SOURCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfigSourceType.class);

        private final String value;
        private static java.util.Map<String, ConfigSourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigSourceType v : ConfigSourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfigSourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigSourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfigSourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
