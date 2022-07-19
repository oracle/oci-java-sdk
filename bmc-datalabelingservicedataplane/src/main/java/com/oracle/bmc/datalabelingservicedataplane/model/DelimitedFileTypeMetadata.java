/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Metadata of delimited files.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DelimitedFileTypeMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "formatType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DelimitedFileTypeMetadata extends TextFileTypeMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of a selected column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of a selected column.
         * @param columnName the value to set
         * @return this builder
         **/
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /**
         * The index of a selected column. This is a zero-based index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
        private Integer columnIndex;

        /**
         * The index of a selected column. This is a zero-based index.
         * @param columnIndex the value to set
         * @return this builder
         **/
        public Builder columnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
            this.__explicitlySet__.add("columnIndex");
            return this;
        }
        /**
         * A column delimiter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnDelimiter")
        private String columnDelimiter;

        /**
         * A column delimiter
         * @param columnDelimiter the value to set
         * @return this builder
         **/
        public Builder columnDelimiter(String columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            this.__explicitlySet__.add("columnDelimiter");
            return this;
        }
        /**
         * A line delimiter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineDelimiter")
        private String lineDelimiter;

        /**
         * A line delimiter.
         * @param lineDelimiter the value to set
         * @return this builder
         **/
        public Builder lineDelimiter(String lineDelimiter) {
            this.lineDelimiter = lineDelimiter;
            this.__explicitlySet__.add("lineDelimiter");
            return this;
        }
        /**
         * An escape character.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
        private String escapeCharacter;

        /**
         * An escape character.
         * @param escapeCharacter the value to set
         * @return this builder
         **/
        public Builder escapeCharacter(String escapeCharacter) {
            this.escapeCharacter = escapeCharacter;
            this.__explicitlySet__.add("escapeCharacter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DelimitedFileTypeMetadata build() {
            DelimitedFileTypeMetadata __instance__ =
                    new DelimitedFileTypeMetadata(
                            columnName,
                            columnIndex,
                            columnDelimiter,
                            lineDelimiter,
                            escapeCharacter);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelimitedFileTypeMetadata o) {
            Builder copiedBuilder =
                    columnName(o.getColumnName())
                            .columnIndex(o.getColumnIndex())
                            .columnDelimiter(o.getColumnDelimiter())
                            .lineDelimiter(o.getLineDelimiter())
                            .escapeCharacter(o.getEscapeCharacter());

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

    @Deprecated
    public DelimitedFileTypeMetadata(
            String columnName,
            Integer columnIndex,
            String columnDelimiter,
            String lineDelimiter,
            String escapeCharacter) {
        super();
        this.columnName = columnName;
        this.columnIndex = columnIndex;
        this.columnDelimiter = columnDelimiter;
        this.lineDelimiter = lineDelimiter;
        this.escapeCharacter = escapeCharacter;
    }

    /**
     * The name of a selected column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of a selected column.
     * @return the value
     **/
    public String getColumnName() {
        return columnName;
    }

    /**
     * The index of a selected column. This is a zero-based index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
    private final Integer columnIndex;

    /**
     * The index of a selected column. This is a zero-based index.
     * @return the value
     **/
    public Integer getColumnIndex() {
        return columnIndex;
    }

    /**
     * A column delimiter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnDelimiter")
    private final String columnDelimiter;

    /**
     * A column delimiter
     * @return the value
     **/
    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    /**
     * A line delimiter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineDelimiter")
    private final String lineDelimiter;

    /**
     * A line delimiter.
     * @return the value
     **/
    public String getLineDelimiter() {
        return lineDelimiter;
    }

    /**
     * An escape character.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
    private final String escapeCharacter;

    /**
     * An escape character.
     * @return the value
     **/
    public String getEscapeCharacter() {
        return escapeCharacter;
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
        sb.append("DelimitedFileTypeMetadata(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", columnIndex=").append(String.valueOf(this.columnIndex));
        sb.append(", columnDelimiter=").append(String.valueOf(this.columnDelimiter));
        sb.append(", lineDelimiter=").append(String.valueOf(this.lineDelimiter));
        sb.append(", escapeCharacter=").append(String.valueOf(this.escapeCharacter));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelimitedFileTypeMetadata)) {
            return false;
        }

        DelimitedFileTypeMetadata other = (DelimitedFileTypeMetadata) o;
        return java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.columnIndex, other.columnIndex)
                && java.util.Objects.equals(this.columnDelimiter, other.columnDelimiter)
                && java.util.Objects.equals(this.lineDelimiter, other.lineDelimiter)
                && java.util.Objects.equals(this.escapeCharacter, other.escapeCharacter)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.columnIndex == null ? 43 : this.columnIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.columnDelimiter == null ? 43 : this.columnDelimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.lineDelimiter == null ? 43 : this.lineDelimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.escapeCharacter == null ? 43 : this.escapeCharacter.hashCode());
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
