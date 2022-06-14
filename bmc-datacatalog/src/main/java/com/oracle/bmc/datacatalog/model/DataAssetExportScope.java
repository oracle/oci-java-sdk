/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Scope of asset export, which consists of a container object (bucket, folder, schema, etc) within the asset,
 * and types of child objects contained by that object to be included.
 *    objectKey - Key of the container object to be exported. For example, key of schema_1.
 *    exportTypeIds - Type key(s) of objects within the container object to be exported. For example, type key of table or view.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataAssetExportScope.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataAssetExportScope {
    @Deprecated
    @java.beans.ConstructorProperties({"objectKey", "exportTypeIds"})
    public DataAssetExportScope(String objectKey, java.util.List<String> exportTypeIds) {
        super();
        this.objectKey = objectKey;
        this.exportTypeIds = exportTypeIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of the object selected for export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectKey")
        private String objectKey;

        /**
         * Unique key of the object selected for export.
         * @param objectKey the value to set
         * @return this builder
         **/
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            this.__explicitlySet__.add("objectKey");
            return this;
        }
        /**
         * Array of type keys selected for export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exportTypeIds")
        private java.util.List<String> exportTypeIds;

        /**
         * Array of type keys selected for export.
         * @param exportTypeIds the value to set
         * @return this builder
         **/
        public Builder exportTypeIds(java.util.List<String> exportTypeIds) {
            this.exportTypeIds = exportTypeIds;
            this.__explicitlySet__.add("exportTypeIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataAssetExportScope build() {
            DataAssetExportScope __instance__ = new DataAssetExportScope(objectKey, exportTypeIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataAssetExportScope o) {
            Builder copiedBuilder = objectKey(o.getObjectKey()).exportTypeIds(o.getExportTypeIds());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    /**
     * Unique key of the object selected for export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectKey")
    private final String objectKey;

    /**
     * Unique key of the object selected for export.
     * @return the value
     **/
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Array of type keys selected for export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportTypeIds")
    private final java.util.List<String> exportTypeIds;

    /**
     * Array of type keys selected for export.
     * @return the value
     **/
    public java.util.List<String> getExportTypeIds() {
        return exportTypeIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataAssetExportScope(");
        sb.append("objectKey=").append(String.valueOf(this.objectKey));
        sb.append(", exportTypeIds=").append(String.valueOf(this.exportTypeIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAssetExportScope)) {
            return false;
        }

        DataAssetExportScope other = (DataAssetExportScope) o;
        return java.util.Objects.equals(this.objectKey, other.objectKey)
                && java.util.Objects.equals(this.exportTypeIds, other.exportTypeIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectKey == null ? 43 : this.objectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.exportTypeIds == null ? 43 : this.exportTypeIds.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
