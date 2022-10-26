/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The CSV format attribute. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CsvFormatAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CsvFormatAttribute extends AbstractFormatAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The encoding for the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        /**
         * The encoding for the file.
         *
         * @param encoding the value to set
         * @return this builder
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }
        /** The escape character for the CSV format. */
        @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
        private String escapeCharacter;

        /**
         * The escape character for the CSV format.
         *
         * @param escapeCharacter the value to set
         * @return this builder
         */
        public Builder escapeCharacter(String escapeCharacter) {
            this.escapeCharacter = escapeCharacter;
            this.__explicitlySet__.add("escapeCharacter");
            return this;
        }
        /** The delimiter for the CSV format. */
        @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
        private String delimiter;

        /**
         * The delimiter for the CSV format.
         *
         * @param delimiter the value to set
         * @return this builder
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            this.__explicitlySet__.add("delimiter");
            return this;
        }
        /** The quote character for the CSV format. */
        @com.fasterxml.jackson.annotation.JsonProperty("quoteCharacter")
        private String quoteCharacter;

        /**
         * The quote character for the CSV format.
         *
         * @param quoteCharacter the value to set
         * @return this builder
         */
        public Builder quoteCharacter(String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            this.__explicitlySet__.add("quoteCharacter");
            return this;
        }
        /** Defines whether the file has a header row. */
        @com.fasterxml.jackson.annotation.JsonProperty("hasHeader")
        private Boolean hasHeader;

        /**
         * Defines whether the file has a header row.
         *
         * @param hasHeader the value to set
         * @return this builder
         */
        public Builder hasHeader(Boolean hasHeader) {
            this.hasHeader = hasHeader;
            this.__explicitlySet__.add("hasHeader");
            return this;
        }
        /** Defines whether a file pattern is supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFilePattern")
        private Boolean isFilePattern;

        /**
         * Defines whether a file pattern is supported.
         *
         * @param isFilePattern the value to set
         * @return this builder
         */
        public Builder isFilePattern(Boolean isFilePattern) {
            this.isFilePattern = isFilePattern;
            this.__explicitlySet__.add("isFilePattern");
            return this;
        }
        /** Format for timestamp information. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestampFormat")
        private String timestampFormat;

        /**
         * Format for timestamp information.
         *
         * @param timestampFormat the value to set
         * @return this builder
         */
        public Builder timestampFormat(String timestampFormat) {
            this.timestampFormat = timestampFormat;
            this.__explicitlySet__.add("timestampFormat");
            return this;
        }
        /** Defines whether the quote entire content while performing read/write. */
        @com.fasterxml.jackson.annotation.JsonProperty("isQuoteAll")
        private Boolean isQuoteAll;

        /**
         * Defines whether the quote entire content while performing read/write.
         *
         * @param isQuoteAll the value to set
         * @return this builder
         */
        public Builder isQuoteAll(Boolean isQuoteAll) {
            this.isQuoteAll = isQuoteAll;
            this.__explicitlySet__.add("isQuoteAll");
            return this;
        }
        /** Defines whether the file has a multiline content */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiline")
        private Boolean isMultiline;

        /**
         * Defines whether the file has a multiline content
         *
         * @param isMultiline the value to set
         * @return this builder
         */
        public Builder isMultiline(Boolean isMultiline) {
            this.isMultiline = isMultiline;
            this.__explicitlySet__.add("isMultiline");
            return this;
        }
        /** Defines whether the file has a trailing delimiter */
        @com.fasterxml.jackson.annotation.JsonProperty("isTrailingDelimiter")
        private Boolean isTrailingDelimiter;

        /**
         * Defines whether the file has a trailing delimiter
         *
         * @param isTrailingDelimiter the value to set
         * @return this builder
         */
        public Builder isTrailingDelimiter(Boolean isTrailingDelimiter) {
            this.isTrailingDelimiter = isTrailingDelimiter;
            this.__explicitlySet__.add("isTrailingDelimiter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CsvFormatAttribute build() {
            CsvFormatAttribute model =
                    new CsvFormatAttribute(
                            this.encoding,
                            this.escapeCharacter,
                            this.delimiter,
                            this.quoteCharacter,
                            this.hasHeader,
                            this.isFilePattern,
                            this.timestampFormat,
                            this.isQuoteAll,
                            this.isMultiline,
                            this.isTrailingDelimiter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CsvFormatAttribute model) {
            if (model.wasPropertyExplicitlySet("encoding")) {
                this.encoding(model.getEncoding());
            }
            if (model.wasPropertyExplicitlySet("escapeCharacter")) {
                this.escapeCharacter(model.getEscapeCharacter());
            }
            if (model.wasPropertyExplicitlySet("delimiter")) {
                this.delimiter(model.getDelimiter());
            }
            if (model.wasPropertyExplicitlySet("quoteCharacter")) {
                this.quoteCharacter(model.getQuoteCharacter());
            }
            if (model.wasPropertyExplicitlySet("hasHeader")) {
                this.hasHeader(model.getHasHeader());
            }
            if (model.wasPropertyExplicitlySet("isFilePattern")) {
                this.isFilePattern(model.getIsFilePattern());
            }
            if (model.wasPropertyExplicitlySet("timestampFormat")) {
                this.timestampFormat(model.getTimestampFormat());
            }
            if (model.wasPropertyExplicitlySet("isQuoteAll")) {
                this.isQuoteAll(model.getIsQuoteAll());
            }
            if (model.wasPropertyExplicitlySet("isMultiline")) {
                this.isMultiline(model.getIsMultiline());
            }
            if (model.wasPropertyExplicitlySet("isTrailingDelimiter")) {
                this.isTrailingDelimiter(model.getIsTrailingDelimiter());
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
    public CsvFormatAttribute(
            String encoding,
            String escapeCharacter,
            String delimiter,
            String quoteCharacter,
            Boolean hasHeader,
            Boolean isFilePattern,
            String timestampFormat,
            Boolean isQuoteAll,
            Boolean isMultiline,
            Boolean isTrailingDelimiter) {
        super();
        this.encoding = encoding;
        this.escapeCharacter = escapeCharacter;
        this.delimiter = delimiter;
        this.quoteCharacter = quoteCharacter;
        this.hasHeader = hasHeader;
        this.isFilePattern = isFilePattern;
        this.timestampFormat = timestampFormat;
        this.isQuoteAll = isQuoteAll;
        this.isMultiline = isMultiline;
        this.isTrailingDelimiter = isTrailingDelimiter;
    }

    /** The encoding for the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    private final String encoding;

    /**
     * The encoding for the file.
     *
     * @return the value
     */
    public String getEncoding() {
        return encoding;
    }

    /** The escape character for the CSV format. */
    @com.fasterxml.jackson.annotation.JsonProperty("escapeCharacter")
    private final String escapeCharacter;

    /**
     * The escape character for the CSV format.
     *
     * @return the value
     */
    public String getEscapeCharacter() {
        return escapeCharacter;
    }

    /** The delimiter for the CSV format. */
    @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
    private final String delimiter;

    /**
     * The delimiter for the CSV format.
     *
     * @return the value
     */
    public String getDelimiter() {
        return delimiter;
    }

    /** The quote character for the CSV format. */
    @com.fasterxml.jackson.annotation.JsonProperty("quoteCharacter")
    private final String quoteCharacter;

    /**
     * The quote character for the CSV format.
     *
     * @return the value
     */
    public String getQuoteCharacter() {
        return quoteCharacter;
    }

    /** Defines whether the file has a header row. */
    @com.fasterxml.jackson.annotation.JsonProperty("hasHeader")
    private final Boolean hasHeader;

    /**
     * Defines whether the file has a header row.
     *
     * @return the value
     */
    public Boolean getHasHeader() {
        return hasHeader;
    }

    /** Defines whether a file pattern is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFilePattern")
    private final Boolean isFilePattern;

    /**
     * Defines whether a file pattern is supported.
     *
     * @return the value
     */
    public Boolean getIsFilePattern() {
        return isFilePattern;
    }

    /** Format for timestamp information. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestampFormat")
    private final String timestampFormat;

    /**
     * Format for timestamp information.
     *
     * @return the value
     */
    public String getTimestampFormat() {
        return timestampFormat;
    }

    /** Defines whether the quote entire content while performing read/write. */
    @com.fasterxml.jackson.annotation.JsonProperty("isQuoteAll")
    private final Boolean isQuoteAll;

    /**
     * Defines whether the quote entire content while performing read/write.
     *
     * @return the value
     */
    public Boolean getIsQuoteAll() {
        return isQuoteAll;
    }

    /** Defines whether the file has a multiline content */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiline")
    private final Boolean isMultiline;

    /**
     * Defines whether the file has a multiline content
     *
     * @return the value
     */
    public Boolean getIsMultiline() {
        return isMultiline;
    }

    /** Defines whether the file has a trailing delimiter */
    @com.fasterxml.jackson.annotation.JsonProperty("isTrailingDelimiter")
    private final Boolean isTrailingDelimiter;

    /**
     * Defines whether the file has a trailing delimiter
     *
     * @return the value
     */
    public Boolean getIsTrailingDelimiter() {
        return isTrailingDelimiter;
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
        sb.append("CsvFormatAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", encoding=").append(String.valueOf(this.encoding));
        sb.append(", escapeCharacter=").append(String.valueOf(this.escapeCharacter));
        sb.append(", delimiter=").append(String.valueOf(this.delimiter));
        sb.append(", quoteCharacter=").append(String.valueOf(this.quoteCharacter));
        sb.append(", hasHeader=").append(String.valueOf(this.hasHeader));
        sb.append(", isFilePattern=").append(String.valueOf(this.isFilePattern));
        sb.append(", timestampFormat=").append(String.valueOf(this.timestampFormat));
        sb.append(", isQuoteAll=").append(String.valueOf(this.isQuoteAll));
        sb.append(", isMultiline=").append(String.valueOf(this.isMultiline));
        sb.append(", isTrailingDelimiter=").append(String.valueOf(this.isTrailingDelimiter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CsvFormatAttribute)) {
            return false;
        }

        CsvFormatAttribute other = (CsvFormatAttribute) o;
        return java.util.Objects.equals(this.encoding, other.encoding)
                && java.util.Objects.equals(this.escapeCharacter, other.escapeCharacter)
                && java.util.Objects.equals(this.delimiter, other.delimiter)
                && java.util.Objects.equals(this.quoteCharacter, other.quoteCharacter)
                && java.util.Objects.equals(this.hasHeader, other.hasHeader)
                && java.util.Objects.equals(this.isFilePattern, other.isFilePattern)
                && java.util.Objects.equals(this.timestampFormat, other.timestampFormat)
                && java.util.Objects.equals(this.isQuoteAll, other.isQuoteAll)
                && java.util.Objects.equals(this.isMultiline, other.isMultiline)
                && java.util.Objects.equals(this.isTrailingDelimiter, other.isTrailingDelimiter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.encoding == null ? 43 : this.encoding.hashCode());
        result =
                (result * PRIME)
                        + (this.escapeCharacter == null ? 43 : this.escapeCharacter.hashCode());
        result = (result * PRIME) + (this.delimiter == null ? 43 : this.delimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.quoteCharacter == null ? 43 : this.quoteCharacter.hashCode());
        result = (result * PRIME) + (this.hasHeader == null ? 43 : this.hasHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.isFilePattern == null ? 43 : this.isFilePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampFormat == null ? 43 : this.timestampFormat.hashCode());
        result = (result * PRIME) + (this.isQuoteAll == null ? 43 : this.isQuoteAll.hashCode());
        result = (result * PRIME) + (this.isMultiline == null ? 43 : this.isMultiline.hashCode());
        result =
                (result * PRIME)
                        + (this.isTrailingDelimiter == null
                                ? 43
                                : this.isTrailingDelimiter.hashCode());
        return result;
    }
}
