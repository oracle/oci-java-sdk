/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * ParserTestResult <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParserTestResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ParserTestResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Additional information for the test result. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
        private java.util.Map<String, String> additionalInfo;

        /**
         * Additional information for the test result.
         *
         * @param additionalInfo the value to set
         * @return this builder
         */
        public Builder additionalInfo(java.util.Map<String, String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            this.__explicitlySet__.add("additionalInfo");
            return this;
        }
        /** The test result log entries. */
        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<AbstractParserTestResultLogEntry> entries;

        /**
         * The test result log entries.
         *
         * @param entries the value to set
         * @return this builder
         */
        public Builder entries(java.util.List<AbstractParserTestResultLogEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }
        /** The example content. */
        @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
        private String exampleContent;

        /**
         * The example content.
         *
         * @param exampleContent the value to set
         * @return this builder
         */
        public Builder exampleContent(String exampleContent) {
            this.exampleContent = exampleContent;
            this.__explicitlySet__.add("exampleContent");
            return this;
        }
        /** The test result log lines. */
        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<AbstractParserTestResultLogLine> lines;

        /**
         * The test result log lines.
         *
         * @param lines the value to set
         * @return this builder
         */
        public Builder lines(java.util.List<AbstractParserTestResultLogLine> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }
        /** The named capture groups. */
        @com.fasterxml.jackson.annotation.JsonProperty("namedCaptureGroups")
        private java.util.List<String> namedCaptureGroups;

        /**
         * The named capture groups.
         *
         * @param namedCaptureGroups the value to set
         * @return this builder
         */
        public Builder namedCaptureGroups(java.util.List<String> namedCaptureGroups) {
            this.namedCaptureGroups = namedCaptureGroups;
            this.__explicitlySet__.add("namedCaptureGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParserTestResult build() {
            ParserTestResult model =
                    new ParserTestResult(
                            this.additionalInfo,
                            this.entries,
                            this.exampleContent,
                            this.lines,
                            this.namedCaptureGroups);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParserTestResult model) {
            if (model.wasPropertyExplicitlySet("additionalInfo")) {
                this.additionalInfo(model.getAdditionalInfo());
            }
            if (model.wasPropertyExplicitlySet("entries")) {
                this.entries(model.getEntries());
            }
            if (model.wasPropertyExplicitlySet("exampleContent")) {
                this.exampleContent(model.getExampleContent());
            }
            if (model.wasPropertyExplicitlySet("lines")) {
                this.lines(model.getLines());
            }
            if (model.wasPropertyExplicitlySet("namedCaptureGroups")) {
                this.namedCaptureGroups(model.getNamedCaptureGroups());
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

    /** Additional information for the test result. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalInfo")
    private final java.util.Map<String, String> additionalInfo;

    /**
     * Additional information for the test result.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    /** The test result log entries. */
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    private final java.util.List<AbstractParserTestResultLogEntry> entries;

    /**
     * The test result log entries.
     *
     * @return the value
     */
    public java.util.List<AbstractParserTestResultLogEntry> getEntries() {
        return entries;
    }

    /** The example content. */
    @com.fasterxml.jackson.annotation.JsonProperty("exampleContent")
    private final String exampleContent;

    /**
     * The example content.
     *
     * @return the value
     */
    public String getExampleContent() {
        return exampleContent;
    }

    /** The test result log lines. */
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    private final java.util.List<AbstractParserTestResultLogLine> lines;

    /**
     * The test result log lines.
     *
     * @return the value
     */
    public java.util.List<AbstractParserTestResultLogLine> getLines() {
        return lines;
    }

    /** The named capture groups. */
    @com.fasterxml.jackson.annotation.JsonProperty("namedCaptureGroups")
    private final java.util.List<String> namedCaptureGroups;

    /**
     * The named capture groups.
     *
     * @return the value
     */
    public java.util.List<String> getNamedCaptureGroups() {
        return namedCaptureGroups;
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
        sb.append("ParserTestResult(");
        sb.append("super=").append(super.toString());
        sb.append("additionalInfo=").append(String.valueOf(this.additionalInfo));
        sb.append(", entries=").append(String.valueOf(this.entries));
        sb.append(", exampleContent=").append(String.valueOf(this.exampleContent));
        sb.append(", lines=").append(String.valueOf(this.lines));
        sb.append(", namedCaptureGroups=").append(String.valueOf(this.namedCaptureGroups));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
