/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The details of OCI Search with OpenSearch data source information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OciObjectStorageDataSourceConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataSourceConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciObjectStorageDataSourceConfig extends DataSourceConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableMultiModality")
        private Boolean shouldEnableMultiModality;

        public Builder shouldEnableMultiModality(Boolean shouldEnableMultiModality) {
            this.shouldEnableMultiModality = shouldEnableMultiModality;
            this.__explicitlySet__.add("shouldEnableMultiModality");
            return this;
        }
        /**
         * The locations of data items in Object Storage, can either be an object (File) or a prefix
         * (folder).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePrefixes")
        private java.util.List<ObjectStoragePrefix> objectStoragePrefixes;

        /**
         * The locations of data items in Object Storage, can either be an object (File) or a prefix
         * (folder).
         *
         * @param objectStoragePrefixes the value to set
         * @return this builder
         */
        public Builder objectStoragePrefixes(
                java.util.List<ObjectStoragePrefix> objectStoragePrefixes) {
            this.objectStoragePrefixes = objectStoragePrefixes;
            this.__explicitlySet__.add("objectStoragePrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciObjectStorageDataSourceConfig build() {
            OciObjectStorageDataSourceConfig model =
                    new OciObjectStorageDataSourceConfig(
                            this.shouldEnableMultiModality, this.objectStoragePrefixes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciObjectStorageDataSourceConfig model) {
            if (model.wasPropertyExplicitlySet("shouldEnableMultiModality")) {
                this.shouldEnableMultiModality(model.getShouldEnableMultiModality());
            }
            if (model.wasPropertyExplicitlySet("objectStoragePrefixes")) {
                this.objectStoragePrefixes(model.getObjectStoragePrefixes());
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
    public OciObjectStorageDataSourceConfig(
            Boolean shouldEnableMultiModality,
            java.util.List<ObjectStoragePrefix> objectStoragePrefixes) {
        super(shouldEnableMultiModality);
        this.objectStoragePrefixes = objectStoragePrefixes;
    }

    /**
     * The locations of data items in Object Storage, can either be an object (File) or a prefix
     * (folder).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStoragePrefixes")
    private final java.util.List<ObjectStoragePrefix> objectStoragePrefixes;

    /**
     * The locations of data items in Object Storage, can either be an object (File) or a prefix
     * (folder).
     *
     * @return the value
     */
    public java.util.List<ObjectStoragePrefix> getObjectStoragePrefixes() {
        return objectStoragePrefixes;
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
        sb.append("OciObjectStorageDataSourceConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", objectStoragePrefixes=").append(String.valueOf(this.objectStoragePrefixes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciObjectStorageDataSourceConfig)) {
            return false;
        }

        OciObjectStorageDataSourceConfig other = (OciObjectStorageDataSourceConfig) o;
        return java.util.Objects.equals(this.objectStoragePrefixes, other.objectStoragePrefixes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.objectStoragePrefixes == null
                                ? 43
                                : this.objectStoragePrefixes.hashCode());
        return result;
    }
}
