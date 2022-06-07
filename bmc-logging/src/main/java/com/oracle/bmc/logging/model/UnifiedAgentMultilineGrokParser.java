/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Multiline grok parser.
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
    builder = UnifiedAgentMultilineGrokParser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "parserType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("grokNameKey")
        private String grokNameKey;

        public Builder grokNameKey(String grokNameKey) {
            this.grokNameKey = grokNameKey;
            this.__explicitlySet__.add("grokNameKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("grokFailureKey")
        private String grokFailureKey;

        public Builder grokFailureKey(String grokFailureKey) {
            this.grokFailureKey = grokFailureKey;
            this.__explicitlySet__.add("grokFailureKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("multiLineStartRegexp")
        private String multiLineStartRegexp;

        public Builder multiLineStartRegexp(String multiLineStartRegexp) {
            this.multiLineStartRegexp = multiLineStartRegexp;
            this.__explicitlySet__.add("multiLineStartRegexp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patterns")
        private java.util.List<GrokPattern> patterns;

        public Builder patterns(java.util.List<GrokPattern> patterns) {
            this.patterns = patterns;
            this.__explicitlySet__.add("patterns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentMultilineGrokParser build() {
            UnifiedAgentMultilineGrokParser __instance__ =
                    new UnifiedAgentMultilineGrokParser(
                            fieldTimeKey,
                            types,
                            nullValuePattern,
                            isNullEmptyString,
                            isEstimateCurrentEvent,
                            isKeepTimeKey,
                            timeoutInMilliseconds,
                            grokNameKey,
                            grokFailureKey,
                            multiLineStartRegexp,
                            patterns);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentMultilineGrokParser o) {
            Builder copiedBuilder =
                    fieldTimeKey(o.getFieldTimeKey())
                            .types(o.getTypes())
                            .nullValuePattern(o.getNullValuePattern())
                            .isNullEmptyString(o.getIsNullEmptyString())
                            .isEstimateCurrentEvent(o.getIsEstimateCurrentEvent())
                            .isKeepTimeKey(o.getIsKeepTimeKey())
                            .timeoutInMilliseconds(o.getTimeoutInMilliseconds())
                            .grokNameKey(o.getGrokNameKey())
                            .grokFailureKey(o.getGrokFailureKey())
                            .multiLineStartRegexp(o.getMultiLineStartRegexp())
                            .patterns(o.getPatterns());

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

    @com.fasterxml.jackson.annotation.JsonProperty("grokNameKey")
    private final String grokNameKey;

    public String getGrokNameKey() {
        return grokNameKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("grokFailureKey")
    private final String grokFailureKey;

    public String getGrokFailureKey() {
        return grokFailureKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("multiLineStartRegexp")
    private final String multiLineStartRegexp;

    public String getMultiLineStartRegexp() {
        return multiLineStartRegexp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<GrokPattern> patterns;

    public java.util.List<GrokPattern> getPatterns() {
        return patterns;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UnifiedAgentMultilineGrokParser(");
        sb.append("super=").append(super.toString());
        sb.append(", grokNameKey=").append(String.valueOf(this.grokNameKey));
        sb.append(", grokFailureKey=").append(String.valueOf(this.grokFailureKey));
        sb.append(", multiLineStartRegexp=").append(String.valueOf(this.multiLineStartRegexp));
        sb.append(", patterns=").append(String.valueOf(this.patterns));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
