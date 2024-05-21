/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The PARQUET format attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ParquetFormatAttribute.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParquetFormatAttribute extends AbstractFormatAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFilePattern")
        private Boolean isFilePattern;

        public Builder isFilePattern(Boolean isFilePattern) {
            this.isFilePattern = isFilePattern;
            this.__explicitlySet__.add("isFilePattern");
            return this;
        }
        /**
         * The compression for the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compression")
        private String compression;

        /**
         * The compression for the file.
         * @param compression the value to set
         * @return this builder
         **/
        public Builder compression(String compression) {
            this.compression = compression;
            this.__explicitlySet__.add("compression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParquetFormatAttribute build() {
            ParquetFormatAttribute model =
                    new ParquetFormatAttribute(this.isFilePattern, this.compression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParquetFormatAttribute model) {
            if (model.wasPropertyExplicitlySet("isFilePattern")) {
                this.isFilePattern(model.getIsFilePattern());
            }
            if (model.wasPropertyExplicitlySet("compression")) {
                this.compression(model.getCompression());
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
    public ParquetFormatAttribute(Boolean isFilePattern, String compression) {
        super(isFilePattern);
        this.compression = compression;
    }

    /**
     * The compression for the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compression")
    private final String compression;

    /**
     * The compression for the file.
     * @return the value
     **/
    public String getCompression() {
        return compression;
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
        sb.append("ParquetFormatAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compression=").append(String.valueOf(this.compression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParquetFormatAttribute)) {
            return false;
        }

        ParquetFormatAttribute other = (ParquetFormatAttribute) o;
        return java.util.Objects.equals(this.compression, other.compression) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.compression == null ? 43 : this.compression.hashCode());
        return result;
    }
}
