/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Multiline parser.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentMultilineParser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "parserType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentMultilineParser extends UnifiedAgentParser {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
        private String fieldTimeKey;

        public Builder fieldTimeKey(String fieldTimeKey) {
            this.fieldTimeKey = fieldTimeKey;
            this.__explicitlySet__.add("fieldTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private java.util.Map<String, String> types;

        public Builder types(java.util.Map<String, String> types) {
            this.types = types;
            this.__explicitlySet__.add("types");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nullValuePattern")
        private String nullValuePattern;

        public Builder nullValuePattern(String nullValuePattern) {
            this.nullValuePattern = nullValuePattern;
            this.__explicitlySet__.add("nullValuePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNullEmptyString")
        private Boolean isNullEmptyString;

        public Builder isNullEmptyString(Boolean isNullEmptyString) {
            this.isNullEmptyString = isNullEmptyString;
            this.__explicitlySet__.add("isNullEmptyString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEstimateCurrentEvent")
        private Boolean isEstimateCurrentEvent;

        public Builder isEstimateCurrentEvent(Boolean isEstimateCurrentEvent) {
            this.isEstimateCurrentEvent = isEstimateCurrentEvent;
            this.__explicitlySet__.add("isEstimateCurrentEvent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isKeepTimeKey")
        private Boolean isKeepTimeKey;

        public Builder isKeepTimeKey(Boolean isKeepTimeKey) {
            this.isKeepTimeKey = isKeepTimeKey;
            this.__explicitlySet__.add("isKeepTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMilliseconds")
        private Integer timeoutInMilliseconds;

        public Builder timeoutInMilliseconds(Integer timeoutInMilliseconds) {
            this.timeoutInMilliseconds = timeoutInMilliseconds;
            this.__explicitlySet__.add("timeoutInMilliseconds");
            return this;
        }
        /**
         * First line pattern format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("formatFirstline")
        private String formatFirstline;

        /**
         * First line pattern format.
         * @param formatFirstline the value to set
         * @return this builder
         **/
        public Builder formatFirstline(String formatFirstline) {
            this.formatFirstline = formatFirstline;
            this.__explicitlySet__.add("formatFirstline");
            return this;
        }
        /**
         * Mutiline pattern format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private java.util.List<String> format;

        /**
         * Mutiline pattern format.
         * @param format the value to set
         * @return this builder
         **/
        public Builder format(java.util.List<String> format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentMultilineParser build() {
            UnifiedAgentMultilineParser model =
                    new UnifiedAgentMultilineParser(
                            this.fieldTimeKey,
                            this.types,
                            this.nullValuePattern,
                            this.isNullEmptyString,
                            this.isEstimateCurrentEvent,
                            this.isKeepTimeKey,
                            this.timeoutInMilliseconds,
                            this.formatFirstline,
                            this.format);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentMultilineParser model) {
            if (model.wasPropertyExplicitlySet("fieldTimeKey")) {
                this.fieldTimeKey(model.getFieldTimeKey());
            }
            if (model.wasPropertyExplicitlySet("types")) {
                this.types(model.getTypes());
            }
            if (model.wasPropertyExplicitlySet("nullValuePattern")) {
                this.nullValuePattern(model.getNullValuePattern());
            }
            if (model.wasPropertyExplicitlySet("isNullEmptyString")) {
                this.isNullEmptyString(model.getIsNullEmptyString());
            }
            if (model.wasPropertyExplicitlySet("isEstimateCurrentEvent")) {
                this.isEstimateCurrentEvent(model.getIsEstimateCurrentEvent());
            }
            if (model.wasPropertyExplicitlySet("isKeepTimeKey")) {
                this.isKeepTimeKey(model.getIsKeepTimeKey());
            }
            if (model.wasPropertyExplicitlySet("timeoutInMilliseconds")) {
                this.timeoutInMilliseconds(model.getTimeoutInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("formatFirstline")) {
                this.formatFirstline(model.getFormatFirstline());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
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
    public UnifiedAgentMultilineParser(
            String fieldTimeKey,
            java.util.Map<String, String> types,
            String nullValuePattern,
            Boolean isNullEmptyString,
            Boolean isEstimateCurrentEvent,
            Boolean isKeepTimeKey,
            Integer timeoutInMilliseconds,
            String formatFirstline,
            java.util.List<String> format) {
        super(
                fieldTimeKey,
                types,
                nullValuePattern,
                isNullEmptyString,
                isEstimateCurrentEvent,
                isKeepTimeKey,
                timeoutInMilliseconds);
        this.formatFirstline = formatFirstline;
        this.format = format;
    }

    /**
     * First line pattern format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("formatFirstline")
    private final String formatFirstline;

    /**
     * First line pattern format.
     * @return the value
     **/
    public String getFormatFirstline() {
        return formatFirstline;
    }

    /**
     * Mutiline pattern format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final java.util.List<String> format;

    /**
     * Mutiline pattern format.
     * @return the value
     **/
    public java.util.List<String> getFormat() {
        return format;
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
        sb.append("UnifiedAgentMultilineParser(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", formatFirstline=").append(String.valueOf(this.formatFirstline));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentMultilineParser)) {
            return false;
        }

        UnifiedAgentMultilineParser other = (UnifiedAgentMultilineParser) o;
        return java.util.Objects.equals(this.formatFirstline, other.formatFirstline)
                && java.util.Objects.equals(this.format, other.format)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.formatFirstline == null ? 43 : this.formatFirstline.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        return result;
    }
}
