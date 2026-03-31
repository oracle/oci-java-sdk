/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The OCI Object Storage namespace and bucket details of the datasource
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OciObjectStorageConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciObjectStorageConfiguration extends ConnectorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of Object Storage Configurations for datasource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageConfigList")
        private java.util.List<ObjectStorageConfig> storageConfigList;

        /**
         * List of Object Storage Configurations for datasource.
         * @param storageConfigList the value to set
         * @return this builder
         **/
        public Builder storageConfigList(java.util.List<ObjectStorageConfig> storageConfigList) {
            this.storageConfigList = storageConfigList;
            this.__explicitlySet__.add("storageConfigList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciObjectStorageConfiguration build() {
            OciObjectStorageConfiguration model =
                    new OciObjectStorageConfiguration(this.storageConfigList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciObjectStorageConfiguration model) {
            if (model.wasPropertyExplicitlySet("storageConfigList")) {
                this.storageConfigList(model.getStorageConfigList());
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
    public OciObjectStorageConfiguration(java.util.List<ObjectStorageConfig> storageConfigList) {
        super();
        this.storageConfigList = storageConfigList;
    }

    /**
     * List of Object Storage Configurations for datasource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageConfigList")
    private final java.util.List<ObjectStorageConfig> storageConfigList;

    /**
     * List of Object Storage Configurations for datasource.
     * @return the value
     **/
    public java.util.List<ObjectStorageConfig> getStorageConfigList() {
        return storageConfigList;
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
        sb.append("OciObjectStorageConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", storageConfigList=").append(String.valueOf(this.storageConfigList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciObjectStorageConfiguration)) {
            return false;
        }

        OciObjectStorageConfiguration other = (OciObjectStorageConfiguration) o;
        return java.util.Objects.equals(this.storageConfigList, other.storageConfigList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.storageConfigList == null ? 43 : this.storageConfigList.hashCode());
        return result;
    }
}
