/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * ParserTestResult
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParserTestResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParserTestResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "additionalInfo",
        "entries",
        "exampleContent",
        "lines",
        "namedCaptureGroups"
    })
    public ParserTestResult(
            java.util.Map<String, String> additionalInfo,
            java.util.List<AbstractParserTestResultLogEntry> entries,
            String exampleContent,
            java.util.List<AbstractParserTestResultLogLine> lines,
            java.util.List<String> namedCaptureGroups) {
        super();
        this.additionalInfo = additionalInfo;
        this.entries = entries;
        this.exampleContent = exampleContent;
        this.lines = lines;
        this.namedCaptureGroups = namedCaptureGroups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
        private java.util.Map<String, String> additionalInfo;

        public Builder additionalInfo(java.util.Map<String, String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            this.__explicitlySet__.add("additionalInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<AbstractParserTestResultLogEntry> entries;

        public Builder entries(java.util.List<AbstractParserTestResultLogEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
        private String exampleContent;

        public Builder exampleContent(String exampleContent) {
            this.exampleContent = exampleContent;
            this.__explicitlySet__.add("exampleContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<AbstractParserTestResultLogLine> lines;

        public Builder lines(java.util.List<AbstractParserTestResultLogLine> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namedCaptureGroups")
        private java.util.List<String> namedCaptureGroups;

        public Builder namedCaptureGroups(java.util.List<String> namedCaptureGroups) {
            this.namedCaptureGroups = namedCaptureGroups;
            this.__explicitlySet__.add("namedCaptureGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParserTestResult build() {
            ParserTestResult __instance__ =
                    new ParserTestResult(
                            additionalInfo, entries, exampleContent, lines, namedCaptureGroups);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParserTestResult o) {
            Builder copiedBuilder =
                    additionalInfo(o.getAdditionalInfo())
                            .entries(o.getEntries())
                            .exampleContent(o.getExampleContent())
                            .lines(o.getLines())
                            .namedCaptureGroups(o.getNamedCaptureGroups());

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
     * Additional information for the test result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
    private final java.util.Map<String, String> additionalInfo;

    public java.util.Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * The test result log entries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    private final java.util.List<AbstractParserTestResultLogEntry> entries;

    public java.util.List<AbstractParserTestResultLogEntry> getEntries() {
        return entries;
    }

    /**
     * The example content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    private final String exampleContent;

    public String getExampleContent() {
        return exampleContent;
    }

    /**
     * The test result log lines.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    private final java.util.List<AbstractParserTestResultLogLine> lines;

    public java.util.List<AbstractParserTestResultLogLine> getLines() {
        return lines;
    }

    /**
     * The named capture groups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namedCaptureGroups")
    private final java.util.List<String> namedCaptureGroups;

    public java.util.List<String> getNamedCaptureGroups() {
        return namedCaptureGroups;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ParserTestResult(");
        sb.append("additionalInfo=").append(String.valueOf(this.additionalInfo));
        sb.append(", entries=").append(String.valueOf(this.entries));
        sb.append(", exampleContent=").append(String.valueOf(this.exampleContent));
        sb.append(", lines=").append(String.valueOf(this.lines));
        sb.append(", namedCaptureGroups=").append(String.valueOf(this.namedCaptureGroups));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParserTestResult)) {
            return false;
        }

        ParserTestResult other = (ParserTestResult) o;
        return java.util.Objects.equals(this.additionalInfo, other.additionalInfo)
                && java.util.Objects.equals(this.entries, other.entries)
                && java.util.Objects.equals(this.exampleContent, other.exampleContent)
                && java.util.Objects.equals(this.lines, other.lines)
                && java.util.Objects.equals(this.namedCaptureGroups, other.namedCaptureGroups)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.additionalInfo == null ? 43 : this.additionalInfo.hashCode());
        result = (result * PRIME) + (this.entries == null ? 43 : this.entries.hashCode());
        result =
                (result * PRIME)
                        + (this.exampleContent == null ? 43 : this.exampleContent.hashCode());
        result = (result * PRIME) + (this.lines == null ? 43 : this.lines.hashCode());
        result =
                (result * PRIME)
                        + (this.namedCaptureGroups == null
                                ? 43
                                : this.namedCaptureGroups.hashCode());
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
