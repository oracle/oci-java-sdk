/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Multiline grok parser. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentMultilineGrokParser.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "parserType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentMultilineGrokParser extends UnifiedAgentParser {
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
        /** Grok name key. */
        @com.fasterxml.jackson.annotation.JsonProperty("grokNameKey")
        private String grokNameKey;

        /**
         * Grok name key.
         *
         * @param grokNameKey the value to set
         * @return this builder
         */
        public Builder grokNameKey(String grokNameKey) {
            this.grokNameKey = grokNameKey;
            this.__explicitlySet__.add("grokNameKey");
            return this;
        }
        /** Grok failure key. */
        @com.fasterxml.jackson.annotation.JsonProperty("grokFailureKey")
        private String grokFailureKey;

        /**
         * Grok failure key.
         *
         * @param grokFailureKey the value to set
         * @return this builder
         */
        public Builder grokFailureKey(String grokFailureKey) {
            this.grokFailureKey = grokFailureKey;
            this.__explicitlySet__.add("grokFailureKey");
            return this;
        }
        /** Multiline start regexp pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("multiLineStartRegexp")
        private String multiLineStartRegexp;

        /**
         * Multiline start regexp pattern.
         *
         * @param multiLineStartRegexp the value to set
         * @return this builder
         */
        public Builder multiLineStartRegexp(String multiLineStartRegexp) {
            this.multiLineStartRegexp = multiLineStartRegexp;
            this.__explicitlySet__.add("multiLineStartRegexp");
            return this;
        }
        /** Grok pattern object. */
        @com.fasterxml.jackson.annotation.JsonProperty("patterns")
        private java.util.List<GrokPattern> patterns;

        /**
         * Grok pattern object.
         *
         * @param patterns the value to set
         * @return this builder
         */
        public Builder patterns(java.util.List<GrokPattern> patterns) {
            this.patterns = patterns;
            this.__explicitlySet__.add("patterns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentMultilineGrokParser build() {
            UnifiedAgentMultilineGrokParser model =
                    new UnifiedAgentMultilineGrokParser(
                            this.fieldTimeKey,
                            this.types,
                            this.nullValuePattern,
                            this.isNullEmptyString,
                            this.isEstimateCurrentEvent,
                            this.isKeepTimeKey,
                            this.timeoutInMilliseconds,
                            this.grokNameKey,
                            this.grokFailureKey,
                            this.multiLineStartRegexp,
                            this.patterns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentMultilineGrokParser model) {
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
            if (model.wasPropertyExplicitlySet("grokNameKey")) {
                this.grokNameKey(model.getGrokNameKey());
            }
            if (model.wasPropertyExplicitlySet("grokFailureKey")) {
                this.grokFailureKey(model.getGrokFailureKey());
            }
            if (model.wasPropertyExplicitlySet("multiLineStartRegexp")) {
                this.multiLineStartRegexp(model.getMultiLineStartRegexp());
            }
            if (model.wasPropertyExplicitlySet("patterns")) {
                this.patterns(model.getPatterns());
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
    public UnifiedAgentMultilineGrokParser(
            String fieldTimeKey,
            java.util.Map<String, String> types,
            String nullValuePattern,
            Boolean isNullEmptyString,
            Boolean isEstimateCurrentEvent,
            Boolean isKeepTimeKey,
            Integer timeoutInMilliseconds,
            String grokNameKey,
            String grokFailureKey,
            String multiLineStartRegexp,
            java.util.List<GrokPattern> patterns) {
        super(
                fieldTimeKey,
                types,
                nullValuePattern,
                isNullEmptyString,
                isEstimateCurrentEvent,
                isKeepTimeKey,
                timeoutInMilliseconds);
        this.grokNameKey = grokNameKey;
        this.grokFailureKey = grokFailureKey;
        this.multiLineStartRegexp = multiLineStartRegexp;
        this.patterns = patterns;
    }

    /** Grok name key. */
    @com.fasterxml.jackson.annotation.JsonProperty("grokNameKey")
    private final String grokNameKey;

    /**
     * Grok name key.
     *
     * @return the value
     */
    public String getGrokNameKey() {
        return grokNameKey;
    }

    /** Grok failure key. */
    @com.fasterxml.jackson.annotation.JsonProperty("grokFailureKey")
    private final String grokFailureKey;

    /**
     * Grok failure key.
     *
     * @return the value
     */
    public String getGrokFailureKey() {
        return grokFailureKey;
    }

    /** Multiline start regexp pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("multiLineStartRegexp")
    private final String multiLineStartRegexp;

    /**
     * Multiline start regexp pattern.
     *
     * @return the value
     */
    public String getMultiLineStartRegexp() {
        return multiLineStartRegexp;
    }

    /** Grok pattern object. */
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<GrokPattern> patterns;

    /**
     * Grok pattern object.
     *
     * @return the value
     */
    public java.util.List<GrokPattern> getPatterns() {
        return patterns;
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
        sb.append("UnifiedAgentMultilineGrokParser(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", grokNameKey=").append(String.valueOf(this.grokNameKey));
        sb.append(", grokFailureKey=").append(String.valueOf(this.grokFailureKey));
        sb.append(", multiLineStartRegexp=").append(String.valueOf(this.multiLineStartRegexp));
        sb.append(", patterns=").append(String.valueOf(this.patterns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentMultilineGrokParser)) {
            return false;
        }

        UnifiedAgentMultilineGrokParser other = (UnifiedAgentMultilineGrokParser) o;
        return java.util.Objects.equals(this.grokNameKey, other.grokNameKey)
                && java.util.Objects.equals(this.grokFailureKey, other.grokFailureKey)
                && java.util.Objects.equals(this.multiLineStartRegexp, other.multiLineStartRegexp)
                && java.util.Objects.equals(this.patterns, other.patterns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.grokNameKey == null ? 43 : this.grokNameKey.hashCode());
        result =
                (result * PRIME)
                        + (this.grokFailureKey == null ? 43 : this.grokFailureKey.hashCode());
        result =
                (result * PRIME)
                        + (this.multiLineStartRegexp == null
                                ? 43
                                : this.multiLineStartRegexp.hashCode());
        result = (result * PRIME) + (this.patterns == null ? 43 : this.patterns.hashCode());
        return result;
    }
}
