/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Metadata of delimited files. <br>
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
        builder = DelimitedFileTypeMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "formatType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DelimitedFileTypeMetadata extends TextFileTypeMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of a selected column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of a selected column.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** The index of a selected column. This is a zero-based index. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
        private Integer columnIndex;

        /**
         * The index of a selected column. This is a zero-based index.
         *
         * @param columnIndex the value to set
         * @return this builder
         */
        public Builder columnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
            this.__explicitlySet__.add("columnIndex");
            return this;
        }
        /** A column delimiter */
        @com.fasterxml.jackson.annotation.JsonProperty("columnDelimiter")
        private String columnDelimiter;

        /**
         * A column delimiter
         *
         * @param columnDelimiter the value to set
         * @return this builder
         */
        public Builder columnDelimiter(String columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            this.__explicitlySet__.add("columnDelimiter");
            return this;
        }
        /** A line delimiter. */
        @com.fasterxml.jackson.annotation.JsonProperty("lineDelimiter")
        private String lineDelimiter;

        /**
         * A line delimiter.
         *
         * @param lineDelimiter the value to set
         * @return this builder
         */
        public Builder lineDelimiter(String lineDelimiter) {
            this.lineDelimiter = lineDelimiter;
            this.__explicitlySet__.add("lineDelimiter");
            return this;
        }
        /** An escape character. */
        @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
        private String escapeCharacter;

        /**
         * An escape character.
         *
         * @param escapeCharacter the value to set
         * @return this builder
         */
        public Builder escapeCharacter(String escapeCharacter) {
            this.escapeCharacter = escapeCharacter;
            this.__explicitlySet__.add("escapeCharacter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DelimitedFileTypeMetadata build() {
            DelimitedFileTypeMetadata model =
                    new DelimitedFileTypeMetadata(
                            this.columnName,
                            this.columnIndex,
                            this.columnDelimiter,
                            this.lineDelimiter,
                            this.escapeCharacter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelimitedFileTypeMetadata model) {
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("columnIndex")) {
                this.columnIndex(model.getColumnIndex());
            }
            if (model.wasPropertyExplicitlySet("columnDelimiter")) {
                this.columnDelimiter(model.getColumnDelimiter());
            }
            if (model.wasPropertyExplicitlySet("lineDelimiter")) {
                this.lineDelimiter(model.getLineDelimiter());
            }
            if (model.wasPropertyExplicitlySet("escapeCharacter")) {
                this.escapeCharacter(model.getEscapeCharacter());
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

    /** The name of a selected column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of a selected column.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** The index of a selected column. This is a zero-based index. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
    private final Integer columnIndex;

    /**
     * The index of a selected column. This is a zero-based index.
     *
     * @return the value
     */
    public Integer getColumnIndex() {
        return columnIndex;
    }

    /** A column delimiter */
    @com.fasterxml.jackson.annotation.JsonProperty("columnDelimiter")
    private final String columnDelimiter;

    /**
     * A column delimiter
     *
     * @return the value
     */
    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    /** A line delimiter. */
    @com.fasterxml.jackson.annotation.JsonProperty("lineDelimiter")
    private final String lineDelimiter;

    /**
     * A line delimiter.
     *
     * @return the value
     */
    public String getLineDelimiter() {
        return lineDelimiter;
    }

    /** An escape character. */
    @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
    private final String escapeCharacter;

    /**
     * An escape character.
     *
     * @return the value
     */
    public String getEscapeCharacter() {
        return escapeCharacter;
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
        sb.append("DelimitedFileTypeMetadata(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", columnIndex=").append(String.valueOf(this.columnIndex));
        sb.append(", columnDelimiter=").append(String.valueOf(this.columnDelimiter));
        sb.append(", lineDelimiter=").append(String.valueOf(this.lineDelimiter));
        sb.append(", escapeCharacter=").append(String.valueOf(this.escapeCharacter));
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
                && super.equals(other);
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
        return result;
    }
}
