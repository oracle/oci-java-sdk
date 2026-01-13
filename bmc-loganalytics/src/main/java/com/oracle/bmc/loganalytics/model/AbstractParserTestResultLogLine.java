/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AbstractParserTestResultLogLine <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AbstractParserTestResultLogLine.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AbstractParserTestResultLogLine
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"originalLogLine", "preProcessedLogLine"})
    public AbstractParserTestResultLogLine(String originalLogLine, String preProcessedLogLine) {
        super();
        this.originalLogLine = originalLogLine;
        this.preProcessedLogLine = preProcessedLogLine;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The original log line. */
        @com.fasterxml.jackson.annotation.JsonProperty("originalLogLine")
        private String originalLogLine;

        /**
         * The original log line.
         *
         * @param originalLogLine the value to set
         * @return this builder
         */
        public Builder originalLogLine(String originalLogLine) {
            this.originalLogLine = originalLogLine;
            this.__explicitlySet__.add("originalLogLine");
            return this;
        }
        /** The pre-processed log line. */
        @com.fasterxml.jackson.annotation.JsonProperty("preProcessedLogLine")
        private String preProcessedLogLine;

        /**
         * The pre-processed log line.
         *
         * @param preProcessedLogLine the value to set
         * @return this builder
         */
        public Builder preProcessedLogLine(String preProcessedLogLine) {
            this.preProcessedLogLine = preProcessedLogLine;
            this.__explicitlySet__.add("preProcessedLogLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AbstractParserTestResultLogLine build() {
            AbstractParserTestResultLogLine model =
                    new AbstractParserTestResultLogLine(
                            this.originalLogLine, this.preProcessedLogLine);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AbstractParserTestResultLogLine model) {
            if (model.wasPropertyExplicitlySet("originalLogLine")) {
                this.originalLogLine(model.getOriginalLogLine());
            }
            if (model.wasPropertyExplicitlySet("preProcessedLogLine")) {
                this.preProcessedLogLine(model.getPreProcessedLogLine());
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

    /** The original log line. */
    @com.fasterxml.jackson.annotation.JsonProperty("originalLogLine")
    private final String originalLogLine;

    /**
     * The original log line.
     *
     * @return the value
     */
    public String getOriginalLogLine() {
        return originalLogLine;
    }

    /** The pre-processed log line. */
    @com.fasterxml.jackson.annotation.JsonProperty("preProcessedLogLine")
    private final String preProcessedLogLine;

    /**
     * The pre-processed log line.
     *
     * @return the value
     */
    public String getPreProcessedLogLine() {
        return preProcessedLogLine;
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
        sb.append("AbstractParserTestResultLogLine(");
        sb.append("super=").append(super.toString());
        sb.append("originalLogLine=").append(String.valueOf(this.originalLogLine));
        sb.append(", preProcessedLogLine=").append(String.valueOf(this.preProcessedLogLine));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractParserTestResultLogLine)) {
            return false;
        }

        AbstractParserTestResultLogLine other = (AbstractParserTestResultLogLine) o;
        return java.util.Objects.equals(this.originalLogLine, other.originalLogLine)
                && java.util.Objects.equals(this.preProcessedLogLine, other.preProcessedLogLine)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originalLogLine == null ? 43 : this.originalLogLine.hashCode());
        result =
                (result * PRIME)
                        + (this.preProcessedLogLine == null
                                ? 43
                                : this.preProcessedLogLine.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
