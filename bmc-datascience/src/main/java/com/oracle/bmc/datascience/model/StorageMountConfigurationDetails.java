/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The storage mount configuration details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "storageType",
    defaultImpl = StorageMountConfigurationDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FileStorageMountConfigurationDetails.class,
        name = "FILE_STORAGE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ObjectStorageMountConfigurationDetails.class,
        name = "OBJECT_STORAGE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class StorageMountConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"destinationDirectoryName", "destinationPath"})
    protected StorageMountConfigurationDetails(
            String destinationDirectoryName, String destinationPath) {
        super();
        this.destinationDirectoryName = destinationDirectoryName;
        this.destinationPath = destinationPath;
    }

    /**
     * The local directory name to be mounted
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationDirectoryName")
    private final String destinationDirectoryName;

    /**
     * The local directory name to be mounted
     * @return the value
     **/
    public String getDestinationDirectoryName() {
        return destinationDirectoryName;
    }

    /**
     * The local path of the mounted directory, excluding directory name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPath")
    private final String destinationPath;

    /**
     * The local path of the mounted directory, excluding directory name.
     * @return the value
     **/
    public String getDestinationPath() {
        return destinationPath;
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
        sb.append("StorageMountConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("destinationDirectoryName=")
                .append(String.valueOf(this.destinationDirectoryName));
        sb.append(", destinationPath=").append(String.valueOf(this.destinationPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageMountConfigurationDetails)) {
            return false;
        }

        StorageMountConfigurationDetails other = (StorageMountConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.destinationDirectoryName, other.destinationDirectoryName)
                && java.util.Objects.equals(this.destinationPath, other.destinationPath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationDirectoryName == null
                                ? 43
                                : this.destinationDirectoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationPath == null ? 43 : this.destinationPath.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of storage.
     **/
    public enum StorageType {
        FileStorage("FILE_STORAGE"),
        ObjectStorage("OBJECT_STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StorageType.class);

        private final String value;
        private static java.util.Map<String, StorageType> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageType v : StorageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
