/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Object Storage Source Details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorageSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The path relative to the prefix specified in the dataset source details (file name). */
        @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
        private String relativePath;

        /**
         * The path relative to the prefix specified in the dataset source details (file name).
         *
         * @param relativePath the value to set
         * @return this builder
         */
        public Builder relativePath(String relativePath) {
            this.relativePath = relativePath;
            this.__explicitlySet__.add("relativePath");
            return this;
        }
        /** The full path of the file this record belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The full path of the file this record belongs to.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The offset into the file containing the content. */
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private java.math.BigDecimal offset;

        /**
         * The offset into the file containing the content.
         *
         * @param offset the value to set
         * @return this builder
         */
        public Builder offset(java.math.BigDecimal offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /** The length from the offset into the file containing the content. */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private java.math.BigDecimal length;

        /**
         * The length from the offset into the file containing the content.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(java.math.BigDecimal length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageSourceDetails build() {
            ObjectStorageSourceDetails model =
                    new ObjectStorageSourceDetails(
                            this.relativePath, this.path, this.offset, this.length);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageSourceDetails model) {
            if (model.wasPropertyExplicitlySet("relativePath")) {
                this.relativePath(model.getRelativePath());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
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
    public ObjectStorageSourceDetails(
            String relativePath,
            String path,
            java.math.BigDecimal offset,
            java.math.BigDecimal length) {
        super();
        this.relativePath = relativePath;
        this.path = path;
        this.offset = offset;
        this.length = length;
    }

    /** The path relative to the prefix specified in the dataset source details (file name). */
    @com.fasterxml.jackson.annotation.JsonProperty("relativePath")
    private final String relativePath;

    /**
     * The path relative to the prefix specified in the dataset source details (file name).
     *
     * @return the value
     */
    public String getRelativePath() {
        return relativePath;
    }

    /** The full path of the file this record belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The full path of the file this record belongs to.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The offset into the file containing the content. */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final java.math.BigDecimal offset;

    /**
     * The offset into the file containing the content.
     *
     * @return the value
     */
    public java.math.BigDecimal getOffset() {
        return offset;
    }

    /** The length from the offset into the file containing the content. */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final java.math.BigDecimal length;

    /**
     * The length from the offset into the file containing the content.
     *
     * @return the value
     */
    public java.math.BigDecimal getLength() {
        return length;
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
        sb.append("ObjectStorageSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", relativePath=").append(String.valueOf(this.relativePath));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageSourceDetails)) {
            return false;
        }

        ObjectStorageSourceDetails other = (ObjectStorageSourceDetails) o;
        return java.util.Objects.equals(this.relativePath, other.relativePath)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.relativePath == null ? 43 : this.relativePath.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        return result;
    }
}
