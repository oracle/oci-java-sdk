/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AbstractParserTestResultLogLine
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AbstractParserTestResultLogLine.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AbstractParserTestResultLogLine
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "originalLogLine",
        "preProcessedLogLine",
        "findStartIndex",
        "findEndIndex",
        "replaceString",
        "replaceStartIndex",
        "replaceEndIndex",
        "grpNameValueMap"
    })
    public AbstractParserTestResultLogLine(
            String originalLogLine,
            String preProcessedLogLine,
            Integer findStartIndex,
            Integer findEndIndex,
            String replaceString,
            Integer replaceStartIndex,
            Integer replaceEndIndex,
            java.util.Map<String, NamedCaptureValue> grpNameValueMap) {
        super();
        this.originalLogLine = originalLogLine;
        this.preProcessedLogLine = preProcessedLogLine;
        this.findStartIndex = findStartIndex;
        this.findEndIndex = findEndIndex;
        this.replaceString = replaceString;
        this.replaceStartIndex = replaceStartIndex;
        this.replaceEndIndex = replaceEndIndex;
        this.grpNameValueMap = grpNameValueMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The original log line.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalLogLine")
        private String originalLogLine;

        /**
         * The original log line.
         * @param originalLogLine the value to set
         * @return this builder
         **/
        public Builder originalLogLine(String originalLogLine) {
            this.originalLogLine = originalLogLine;
            this.__explicitlySet__.add("originalLogLine");
            return this;
        }
        /**
         * The pre-processed log line.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preProcessedLogLine")
        private String preProcessedLogLine;

        /**
         * The pre-processed log line.
         * @param preProcessedLogLine the value to set
         * @return this builder
         **/
        public Builder preProcessedLogLine(String preProcessedLogLine) {
            this.preProcessedLogLine = preProcessedLogLine;
            this.__explicitlySet__.add("preProcessedLogLine");
            return this;
        }
        /**
         * The find start index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("findStartIndex")
        private Integer findStartIndex;

        /**
         * The find start index.
         * @param findStartIndex the value to set
         * @return this builder
         **/
        public Builder findStartIndex(Integer findStartIndex) {
            this.findStartIndex = findStartIndex;
            this.__explicitlySet__.add("findStartIndex");
            return this;
        }
        /**
         * The find end index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("findEndIndex")
        private Integer findEndIndex;

        /**
         * The find end index.
         * @param findEndIndex the value to set
         * @return this builder
         **/
        public Builder findEndIndex(Integer findEndIndex) {
            this.findEndIndex = findEndIndex;
            this.__explicitlySet__.add("findEndIndex");
            return this;
        }
        /**
         * The replacement string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replaceString")
        private String replaceString;

        /**
         * The replacement string.
         * @param replaceString the value to set
         * @return this builder
         **/
        public Builder replaceString(String replaceString) {
            this.replaceString = replaceString;
            this.__explicitlySet__.add("replaceString");
            return this;
        }
        /**
         * The replace start index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replaceStartIndex")
        private Integer replaceStartIndex;

        /**
         * The replace start index.
         * @param replaceStartIndex the value to set
         * @return this builder
         **/
        public Builder replaceStartIndex(Integer replaceStartIndex) {
            this.replaceStartIndex = replaceStartIndex;
            this.__explicitlySet__.add("replaceStartIndex");
            return this;
        }
        /**
         * The replace end index.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replaceEndIndex")
        private Integer replaceEndIndex;

        /**
         * The replace end index.
         * @param replaceEndIndex the value to set
         * @return this builder
         **/
        public Builder replaceEndIndex(Integer replaceEndIndex) {
            this.replaceEndIndex = replaceEndIndex;
            this.__explicitlySet__.add("replaceEndIndex");
            return this;
        }
        /**
         * The group name value map.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("grpNameValueMap")
        private java.util.Map<String, NamedCaptureValue> grpNameValueMap;

        /**
         * The group name value map.
         * @param grpNameValueMap the value to set
         * @return this builder
         **/
        public Builder grpNameValueMap(java.util.Map<String, NamedCaptureValue> grpNameValueMap) {
            this.grpNameValueMap = grpNameValueMap;
            this.__explicitlySet__.add("grpNameValueMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AbstractParserTestResultLogLine build() {
            AbstractParserTestResultLogLine model =
                    new AbstractParserTestResultLogLine(
                            this.originalLogLine,
                            this.preProcessedLogLine,
                            this.findStartIndex,
                            this.findEndIndex,
                            this.replaceString,
                            this.replaceStartIndex,
                            this.replaceEndIndex,
                            this.grpNameValueMap);
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
            if (model.wasPropertyExplicitlySet("findStartIndex")) {
                this.findStartIndex(model.getFindStartIndex());
            }
            if (model.wasPropertyExplicitlySet("findEndIndex")) {
                this.findEndIndex(model.getFindEndIndex());
            }
            if (model.wasPropertyExplicitlySet("replaceString")) {
                this.replaceString(model.getReplaceString());
            }
            if (model.wasPropertyExplicitlySet("replaceStartIndex")) {
                this.replaceStartIndex(model.getReplaceStartIndex());
            }
            if (model.wasPropertyExplicitlySet("replaceEndIndex")) {
                this.replaceEndIndex(model.getReplaceEndIndex());
            }
            if (model.wasPropertyExplicitlySet("grpNameValueMap")) {
                this.grpNameValueMap(model.getGrpNameValueMap());
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

    /**
     * The original log line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalLogLine")
    private final String originalLogLine;

    /**
     * The original log line.
     * @return the value
     **/
    public String getOriginalLogLine() {
        return originalLogLine;
    }

    /**
     * The pre-processed log line.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preProcessedLogLine")
    private final String preProcessedLogLine;

    /**
     * The pre-processed log line.
     * @return the value
     **/
    public String getPreProcessedLogLine() {
        return preProcessedLogLine;
    }

    /**
     * The find start index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("findStartIndex")
    private final Integer findStartIndex;

    /**
     * The find start index.
     * @return the value
     **/
    public Integer getFindStartIndex() {
        return findStartIndex;
    }

    /**
     * The find end index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("findEndIndex")
    private final Integer findEndIndex;

    /**
     * The find end index.
     * @return the value
     **/
    public Integer getFindEndIndex() {
        return findEndIndex;
    }

    /**
     * The replacement string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replaceString")
    private final String replaceString;

    /**
     * The replacement string.
     * @return the value
     **/
    public String getReplaceString() {
        return replaceString;
    }

    /**
     * The replace start index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replaceStartIndex")
    private final Integer replaceStartIndex;

    /**
     * The replace start index.
     * @return the value
     **/
    public Integer getReplaceStartIndex() {
        return replaceStartIndex;
    }

    /**
     * The replace end index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replaceEndIndex")
    private final Integer replaceEndIndex;

    /**
     * The replace end index.
     * @return the value
     **/
    public Integer getReplaceEndIndex() {
        return replaceEndIndex;
    }

    /**
     * The group name value map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grpNameValueMap")
    private final java.util.Map<String, NamedCaptureValue> grpNameValueMap;

    /**
     * The group name value map.
     * @return the value
     **/
    public java.util.Map<String, NamedCaptureValue> getGrpNameValueMap() {
        return grpNameValueMap;
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
        sb.append("AbstractParserTestResultLogLine(");
        sb.append("super=").append(super.toString());
        sb.append("originalLogLine=").append(String.valueOf(this.originalLogLine));
        sb.append(", preProcessedLogLine=").append(String.valueOf(this.preProcessedLogLine));
        sb.append(", findStartIndex=").append(String.valueOf(this.findStartIndex));
        sb.append(", findEndIndex=").append(String.valueOf(this.findEndIndex));
        sb.append(", replaceString=").append(String.valueOf(this.replaceString));
        sb.append(", replaceStartIndex=").append(String.valueOf(this.replaceStartIndex));
        sb.append(", replaceEndIndex=").append(String.valueOf(this.replaceEndIndex));
        sb.append(", grpNameValueMap=").append(String.valueOf(this.grpNameValueMap));
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
                && java.util.Objects.equals(this.findStartIndex, other.findStartIndex)
                && java.util.Objects.equals(this.findEndIndex, other.findEndIndex)
                && java.util.Objects.equals(this.replaceString, other.replaceString)
                && java.util.Objects.equals(this.replaceStartIndex, other.replaceStartIndex)
                && java.util.Objects.equals(this.replaceEndIndex, other.replaceEndIndex)
                && java.util.Objects.equals(this.grpNameValueMap, other.grpNameValueMap)
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
        result =
                (result * PRIME)
                        + (this.findStartIndex == null ? 43 : this.findStartIndex.hashCode());
        result = (result * PRIME) + (this.findEndIndex == null ? 43 : this.findEndIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.replaceString == null ? 43 : this.replaceString.hashCode());
        result =
                (result * PRIME)
                        + (this.replaceStartIndex == null ? 43 : this.replaceStartIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.replaceEndIndex == null ? 43 : this.replaceEndIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.grpNameValueMap == null ? 43 : this.grpNameValueMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
