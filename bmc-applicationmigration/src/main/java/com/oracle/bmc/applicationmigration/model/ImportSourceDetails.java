/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * / Basic details about the source, import manifest and object storage bucket as well as object name of the archive that should be used during import
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImportSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImportSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("manifest")
        private ImportManifest manifest;

        public Builder manifest(ImportManifest manifest) {
            this.manifest = manifest;
            this.__explicitlySet__.add("manifest");
            return this;
        }
        /**
         * the object storage namespace where the bucket and uploaded object resides
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * the object storage namespace where the bucket and uploaded object resides
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * the bucket wherein the export archive exists in object storage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * the bucket wherein the export archive exists in object storage
         * @param bucket the value to set
         * @return this builder
         **/
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /**
         * the name of the archive as it exists in object storage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * the name of the archive as it exists in object storage
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportSourceDetails build() {
            ImportSourceDetails model =
                    new ImportSourceDetails(
                            this.manifest, this.namespace, this.bucket, this.objectName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportSourceDetails model) {
            if (model.wasPropertyExplicitlySet("manifest")) {
                this.manifest(model.getManifest());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
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
    public ImportSourceDetails(
            ImportManifest manifest, String namespace, String bucket, String objectName) {
        super();
        this.manifest = manifest;
        this.namespace = namespace;
        this.bucket = bucket;
        this.objectName = objectName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("manifest")
    private final ImportManifest manifest;

    public ImportManifest getManifest() {
        return manifest;
    }

    /**
     * the object storage namespace where the bucket and uploaded object resides
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * the object storage namespace where the bucket and uploaded object resides
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * the bucket wherein the export archive exists in object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * the bucket wherein the export archive exists in object storage
     * @return the value
     **/
    public String getBucket() {
        return bucket;
    }

    /**
     * the name of the archive as it exists in object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * the name of the archive as it exists in object storage
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
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
        sb.append("ImportSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", manifest=").append(String.valueOf(this.manifest));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportSourceDetails)) {
            return false;
        }

        ImportSourceDetails other = (ImportSourceDetails) o;
        return java.util.Objects.equals(this.manifest, other.manifest)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.manifest == null ? 43 : this.manifest.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        return result;
    }
}
