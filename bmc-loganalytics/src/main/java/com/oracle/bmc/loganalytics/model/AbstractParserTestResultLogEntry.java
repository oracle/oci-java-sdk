/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AbstractParserTestResultLogEntry
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
    builder = AbstractParserTestResultLogEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AbstractParserTestResultLogEntry
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "extraInfoAttributes",
        "fieldMap",
        "fieldNameValueMap",
        "fieldPositionValueMap",
        "fields",
        "logEntry",
        "matchStatus",
        "matchStatusDescription",
        "fieldMapping",
        "metadata",
        "action",
        "timestampZone",
        "timestampStartIndex",
        "timestampEndIndex",
        "timestampEpochMillisec",
        "textMatchInfo",
        "matchResult",
        "loglines",
        "functionNames"
    })
    public AbstractParserTestResultLogEntry(
            java.util.Map<String, String> extraInfoAttributes,
            java.util.Map<String, String> fieldMap,
            java.util.Map<String, String> fieldNameValueMap,
            java.util.Map<String, String> fieldPositionValueMap,
            java.util.Map<String, String> fields,
            String logEntry,
            String matchStatus,
            String matchStatusDescription,
            java.util.List<ParserTestResultFieldValue> fieldMapping,
            java.util.List<ParserTestResultFieldValue> metadata,
            String action,
            String timestampZone,
            Integer timestampStartIndex,
            Integer timestampEndIndex,
            Long timestampEpochMillisec,
            AbstractParserTestResultLogLine textMatchInfo,
            RegexMatchResult matchResult,
            java.util.List<AbstractParserTestResultLogLine> loglines,
            java.util.List<String> functionNames) {
        super();
        this.extraInfoAttributes = extraInfoAttributes;
        this.fieldMap = fieldMap;
        this.fieldNameValueMap = fieldNameValueMap;
        this.fieldPositionValueMap = fieldPositionValueMap;
        this.fields = fields;
        this.logEntry = logEntry;
        this.matchStatus = matchStatus;
        this.matchStatusDescription = matchStatusDescription;
        this.fieldMapping = fieldMapping;
        this.metadata = metadata;
        this.action = action;
        this.timestampZone = timestampZone;
        this.timestampStartIndex = timestampStartIndex;
        this.timestampEndIndex = timestampEndIndex;
        this.timestampEpochMillisec = timestampEpochMillisec;
        this.textMatchInfo = textMatchInfo;
        this.matchResult = matchResult;
        this.loglines = loglines;
        this.functionNames = functionNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Extra information attributes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extraInfoAttributes")
        private java.util.Map<String, String> extraInfoAttributes;

        /**
         * Extra information attributes.
         * @param extraInfoAttributes the value to set
         * @return this builder
         **/
        public Builder extraInfoAttributes(java.util.Map<String, String> extraInfoAttributes) {
            this.extraInfoAttributes = extraInfoAttributes;
            this.__explicitlySet__.add("extraInfoAttributes");
            return this;
        }
        /**
         * The field map.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldMap")
        private java.util.Map<String, String> fieldMap;

        /**
         * The field map.
         * @param fieldMap the value to set
         * @return this builder
         **/
        public Builder fieldMap(java.util.Map<String, String> fieldMap) {
            this.fieldMap = fieldMap;
            this.__explicitlySet__.add("fieldMap");
            return this;
        }
        /**
         * The field name value map.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldNameValueMap")
        private java.util.Map<String, String> fieldNameValueMap;

        /**
         * The field name value map.
         * @param fieldNameValueMap the value to set
         * @return this builder
         **/
        public Builder fieldNameValueMap(java.util.Map<String, String> fieldNameValueMap) {
            this.fieldNameValueMap = fieldNameValueMap;
            this.__explicitlySet__.add("fieldNameValueMap");
            return this;
        }
        /**
         * The field position value map.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldPositionValueMap")
        private java.util.Map<String, String> fieldPositionValueMap;

        /**
         * The field position value map.
         * @param fieldPositionValueMap the value to set
         * @return this builder
         **/
        public Builder fieldPositionValueMap(java.util.Map<String, String> fieldPositionValueMap) {
            this.fieldPositionValueMap = fieldPositionValueMap;
            this.__explicitlySet__.add("fieldPositionValueMap");
            return this;
        }
        /**
         * The parser fields.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.Map<String, String> fields;

        /**
         * The parser fields.
         * @param fields the value to set
         * @return this builder
         **/
        public Builder fields(java.util.Map<String, String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /**
         * The log entry.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logEntry")
        private String logEntry;

        /**
         * The log entry.
         * @param logEntry the value to set
         * @return this builder
         **/
        public Builder logEntry(String logEntry) {
            this.logEntry = logEntry;
            this.__explicitlySet__.add("logEntry");
            return this;
        }
        /**
         * The match status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
        private String matchStatus;

        /**
         * The match status.
         * @param matchStatus the value to set
         * @return this builder
         **/
        public Builder matchStatus(String matchStatus) {
            this.matchStatus = matchStatus;
            this.__explicitlySet__.add("matchStatus");
            return this;
        }
        /**
         * The match status description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchStatusDescription")
        private String matchStatusDescription;

        /**
         * The match status description.
         * @param matchStatusDescription the value to set
         * @return this builder
         **/
        public Builder matchStatusDescription(String matchStatusDescription) {
            this.matchStatusDescription = matchStatusDescription;
            this.__explicitlySet__.add("matchStatusDescription");
            return this;
        }
        /**
         * Additional properties on the field map.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldMapping")
        private java.util.List<ParserTestResultFieldValue> fieldMapping;

        /**
         * Additional properties on the field map.
         * @param fieldMapping the value to set
         * @return this builder
         **/
        public Builder fieldMapping(java.util.List<ParserTestResultFieldValue> fieldMapping) {
            this.fieldMapping = fieldMapping;
            this.__explicitlySet__.add("fieldMapping");
            return this;
        }
        /**
         * Additional properties on the field map if sub parser with actions defined.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.List<ParserTestResultFieldValue> metadata;

        /**
         * Additional properties on the field map if sub parser with actions defined.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.List<ParserTestResultFieldValue> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The parser action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The parser action.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The timezone corresponding to the timestamp detected in the log entry (e.g. GMT).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestampZone")
        private String timestampZone;

        /**
         * The timezone corresponding to the timestamp detected in the log entry (e.g. GMT).
         * @param timestampZone the value to set
         * @return this builder
         **/
        public Builder timestampZone(String timestampZone) {
            this.timestampZone = timestampZone;
            this.__explicitlySet__.add("timestampZone");
            return this;
        }
        /**
         * In case of regex parser, if there is any timestamp identified in the log entry,
         * this value signifies the index in the log entry from which timestamp starts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestampStartIndex")
        private Integer timestampStartIndex;

        /**
         * In case of regex parser, if there is any timestamp identified in the log entry,
         * this value signifies the index in the log entry from which timestamp starts.
         *
         * @param timestampStartIndex the value to set
         * @return this builder
         **/
        public Builder timestampStartIndex(Integer timestampStartIndex) {
            this.timestampStartIndex = timestampStartIndex;
            this.__explicitlySet__.add("timestampStartIndex");
            return this;
        }
        /**
         * In case of regex parser, if there is any timestamp identified in the log entry,
         * this value signifies the index in the log entry at which timestamp ends.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestampEndIndex")
        private Integer timestampEndIndex;

        /**
         * In case of regex parser, if there is any timestamp identified in the log entry,
         * this value signifies the index in the log entry at which timestamp ends.
         *
         * @param timestampEndIndex the value to set
         * @return this builder
         **/
        public Builder timestampEndIndex(Integer timestampEndIndex) {
            this.timestampEndIndex = timestampEndIndex;
            this.__explicitlySet__.add("timestampEndIndex");
            return this;
        }
        /**
         * The timestamp epoch in milliseconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestampEpochMillisec")
        private Long timestampEpochMillisec;

        /**
         * The timestamp epoch in milliseconds.
         * @param timestampEpochMillisec the value to set
         * @return this builder
         **/
        public Builder timestampEpochMillisec(Long timestampEpochMillisec) {
            this.timestampEpochMillisec = timestampEpochMillisec;
            this.__explicitlySet__.add("timestampEpochMillisec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("textMatchInfo")
        private AbstractParserTestResultLogLine textMatchInfo;

        public Builder textMatchInfo(AbstractParserTestResultLogLine textMatchInfo) {
            this.textMatchInfo = textMatchInfo;
            this.__explicitlySet__.add("textMatchInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchResult")
        private RegexMatchResult matchResult;

        public Builder matchResult(RegexMatchResult matchResult) {
            this.matchResult = matchResult;
            this.__explicitlySet__.add("matchResult");
            return this;
        }
        /**
         * Test result log lines.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loglines")
        private java.util.List<AbstractParserTestResultLogLine> loglines;

        /**
         * Test result log lines.
         * @param loglines the value to set
         * @return this builder
         **/
        public Builder loglines(java.util.List<AbstractParserTestResultLogLine> loglines) {
            this.loglines = loglines;
            this.__explicitlySet__.add("loglines");
            return this;
        }
        /**
         * The parser function names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionNames")
        private java.util.List<String> functionNames;

        /**
         * The parser function names.
         * @param functionNames the value to set
         * @return this builder
         **/
        public Builder functionNames(java.util.List<String> functionNames) {
            this.functionNames = functionNames;
            this.__explicitlySet__.add("functionNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AbstractParserTestResultLogEntry build() {
            AbstractParserTestResultLogEntry model =
                    new AbstractParserTestResultLogEntry(
                            this.extraInfoAttributes,
                            this.fieldMap,
                            this.fieldNameValueMap,
                            this.fieldPositionValueMap,
                            this.fields,
                            this.logEntry,
                            this.matchStatus,
                            this.matchStatusDescription,
                            this.fieldMapping,
                            this.metadata,
                            this.action,
                            this.timestampZone,
                            this.timestampStartIndex,
                            this.timestampEndIndex,
                            this.timestampEpochMillisec,
                            this.textMatchInfo,
                            this.matchResult,
                            this.loglines,
                            this.functionNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AbstractParserTestResultLogEntry model) {
            if (model.wasPropertyExplicitlySet("extraInfoAttributes")) {
                this.extraInfoAttributes(model.getExtraInfoAttributes());
            }
            if (model.wasPropertyExplicitlySet("fieldMap")) {
                this.fieldMap(model.getFieldMap());
            }
            if (model.wasPropertyExplicitlySet("fieldNameValueMap")) {
                this.fieldNameValueMap(model.getFieldNameValueMap());
            }
            if (model.wasPropertyExplicitlySet("fieldPositionValueMap")) {
                this.fieldPositionValueMap(model.getFieldPositionValueMap());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("logEntry")) {
                this.logEntry(model.getLogEntry());
            }
            if (model.wasPropertyExplicitlySet("matchStatus")) {
                this.matchStatus(model.getMatchStatus());
            }
            if (model.wasPropertyExplicitlySet("matchStatusDescription")) {
                this.matchStatusDescription(model.getMatchStatusDescription());
            }
            if (model.wasPropertyExplicitlySet("fieldMapping")) {
                this.fieldMapping(model.getFieldMapping());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("timestampZone")) {
                this.timestampZone(model.getTimestampZone());
            }
            if (model.wasPropertyExplicitlySet("timestampStartIndex")) {
                this.timestampStartIndex(model.getTimestampStartIndex());
            }
            if (model.wasPropertyExplicitlySet("timestampEndIndex")) {
                this.timestampEndIndex(model.getTimestampEndIndex());
            }
            if (model.wasPropertyExplicitlySet("timestampEpochMillisec")) {
                this.timestampEpochMillisec(model.getTimestampEpochMillisec());
            }
            if (model.wasPropertyExplicitlySet("textMatchInfo")) {
                this.textMatchInfo(model.getTextMatchInfo());
            }
            if (model.wasPropertyExplicitlySet("matchResult")) {
                this.matchResult(model.getMatchResult());
            }
            if (model.wasPropertyExplicitlySet("loglines")) {
                this.loglines(model.getLoglines());
            }
            if (model.wasPropertyExplicitlySet("functionNames")) {
                this.functionNames(model.getFunctionNames());
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
     * Extra information attributes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extraInfoAttributes")
    private final java.util.Map<String, String> extraInfoAttributes;

    /**
     * Extra information attributes.
     * @return the value
     **/
    public java.util.Map<String, String> getExtraInfoAttributes() {
        return extraInfoAttributes;
    }

    /**
     * The field map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMap")
    private final java.util.Map<String, String> fieldMap;

    /**
     * The field map.
     * @return the value
     **/
    public java.util.Map<String, String> getFieldMap() {
        return fieldMap;
    }

    /**
     * The field name value map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNameValueMap")
    private final java.util.Map<String, String> fieldNameValueMap;

    /**
     * The field name value map.
     * @return the value
     **/
    public java.util.Map<String, String> getFieldNameValueMap() {
        return fieldNameValueMap;
    }

    /**
     * The field position value map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldPositionValueMap")
    private final java.util.Map<String, String> fieldPositionValueMap;

    /**
     * The field position value map.
     * @return the value
     **/
    public java.util.Map<String, String> getFieldPositionValueMap() {
        return fieldPositionValueMap;
    }

    /**
     * The parser fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.Map<String, String> fields;

    /**
     * The parser fields.
     * @return the value
     **/
    public java.util.Map<String, String> getFields() {
        return fields;
    }

    /**
     * The log entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logEntry")
    private final String logEntry;

    /**
     * The log entry.
     * @return the value
     **/
    public String getLogEntry() {
        return logEntry;
    }

    /**
     * The match status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
    private final String matchStatus;

    /**
     * The match status.
     * @return the value
     **/
    public String getMatchStatus() {
        return matchStatus;
    }

    /**
     * The match status description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatusDescription")
    private final String matchStatusDescription;

    /**
     * The match status description.
     * @return the value
     **/
    public String getMatchStatusDescription() {
        return matchStatusDescription;
    }

    /**
     * Additional properties on the field map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMapping")
    private final java.util.List<ParserTestResultFieldValue> fieldMapping;

    /**
     * Additional properties on the field map.
     * @return the value
     **/
    public java.util.List<ParserTestResultFieldValue> getFieldMapping() {
        return fieldMapping;
    }

    /**
     * Additional properties on the field map if sub parser with actions defined.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.List<ParserTestResultFieldValue> metadata;

    /**
     * Additional properties on the field map if sub parser with actions defined.
     * @return the value
     **/
    public java.util.List<ParserTestResultFieldValue> getMetadata() {
        return metadata;
    }

    /**
     * The parser action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The parser action.
     * @return the value
     **/
    public String getAction() {
        return action;
    }

    /**
     * The timezone corresponding to the timestamp detected in the log entry (e.g. GMT).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampZone")
    private final String timestampZone;

    /**
     * The timezone corresponding to the timestamp detected in the log entry (e.g. GMT).
     * @return the value
     **/
    public String getTimestampZone() {
        return timestampZone;
    }

    /**
     * In case of regex parser, if there is any timestamp identified in the log entry,
     * this value signifies the index in the log entry from which timestamp starts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampStartIndex")
    private final Integer timestampStartIndex;

    /**
     * In case of regex parser, if there is any timestamp identified in the log entry,
     * this value signifies the index in the log entry from which timestamp starts.
     *
     * @return the value
     **/
    public Integer getTimestampStartIndex() {
        return timestampStartIndex;
    }

    /**
     * In case of regex parser, if there is any timestamp identified in the log entry,
     * this value signifies the index in the log entry at which timestamp ends.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampEndIndex")
    private final Integer timestampEndIndex;

    /**
     * In case of regex parser, if there is any timestamp identified in the log entry,
     * this value signifies the index in the log entry at which timestamp ends.
     *
     * @return the value
     **/
    public Integer getTimestampEndIndex() {
        return timestampEndIndex;
    }

    /**
     * The timestamp epoch in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestampEpochMillisec")
    private final Long timestampEpochMillisec;

    /**
     * The timestamp epoch in milliseconds.
     * @return the value
     **/
    public Long getTimestampEpochMillisec() {
        return timestampEpochMillisec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("textMatchInfo")
    private final AbstractParserTestResultLogLine textMatchInfo;

    public AbstractParserTestResultLogLine getTextMatchInfo() {
        return textMatchInfo;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchResult")
    private final RegexMatchResult matchResult;

    public RegexMatchResult getMatchResult() {
        return matchResult;
    }

    /**
     * Test result log lines.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loglines")
    private final java.util.List<AbstractParserTestResultLogLine> loglines;

    /**
     * Test result log lines.
     * @return the value
     **/
    public java.util.List<AbstractParserTestResultLogLine> getLoglines() {
        return loglines;
    }

    /**
     * The parser function names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionNames")
    private final java.util.List<String> functionNames;

    /**
     * The parser function names.
     * @return the value
     **/
    public java.util.List<String> getFunctionNames() {
        return functionNames;
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
        sb.append("AbstractParserTestResultLogEntry(");
        sb.append("super=").append(super.toString());
        sb.append("extraInfoAttributes=").append(String.valueOf(this.extraInfoAttributes));
        sb.append(", fieldMap=").append(String.valueOf(this.fieldMap));
        sb.append(", fieldNameValueMap=").append(String.valueOf(this.fieldNameValueMap));
        sb.append(", fieldPositionValueMap=").append(String.valueOf(this.fieldPositionValueMap));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", logEntry=").append(String.valueOf(this.logEntry));
        sb.append(", matchStatus=").append(String.valueOf(this.matchStatus));
        sb.append(", matchStatusDescription=").append(String.valueOf(this.matchStatusDescription));
        sb.append(", fieldMapping=").append(String.valueOf(this.fieldMapping));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", timestampZone=").append(String.valueOf(this.timestampZone));
        sb.append(", timestampStartIndex=").append(String.valueOf(this.timestampStartIndex));
        sb.append(", timestampEndIndex=").append(String.valueOf(this.timestampEndIndex));
        sb.append(", timestampEpochMillisec=").append(String.valueOf(this.timestampEpochMillisec));
        sb.append(", textMatchInfo=").append(String.valueOf(this.textMatchInfo));
        sb.append(", matchResult=").append(String.valueOf(this.matchResult));
        sb.append(", loglines=").append(String.valueOf(this.loglines));
        sb.append(", functionNames=").append(String.valueOf(this.functionNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractParserTestResultLogEntry)) {
            return false;
        }

        AbstractParserTestResultLogEntry other = (AbstractParserTestResultLogEntry) o;
        return java.util.Objects.equals(this.extraInfoAttributes, other.extraInfoAttributes)
                && java.util.Objects.equals(this.fieldMap, other.fieldMap)
                && java.util.Objects.equals(this.fieldNameValueMap, other.fieldNameValueMap)
                && java.util.Objects.equals(this.fieldPositionValueMap, other.fieldPositionValueMap)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.logEntry, other.logEntry)
                && java.util.Objects.equals(this.matchStatus, other.matchStatus)
                && java.util.Objects.equals(
                        this.matchStatusDescription, other.matchStatusDescription)
                && java.util.Objects.equals(this.fieldMapping, other.fieldMapping)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.timestampZone, other.timestampZone)
                && java.util.Objects.equals(this.timestampStartIndex, other.timestampStartIndex)
                && java.util.Objects.equals(this.timestampEndIndex, other.timestampEndIndex)
                && java.util.Objects.equals(
                        this.timestampEpochMillisec, other.timestampEpochMillisec)
                && java.util.Objects.equals(this.textMatchInfo, other.textMatchInfo)
                && java.util.Objects.equals(this.matchResult, other.matchResult)
                && java.util.Objects.equals(this.loglines, other.loglines)
                && java.util.Objects.equals(this.functionNames, other.functionNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.extraInfoAttributes == null
                                ? 43
                                : this.extraInfoAttributes.hashCode());
        result = (result * PRIME) + (this.fieldMap == null ? 43 : this.fieldMap.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldNameValueMap == null ? 43 : this.fieldNameValueMap.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldPositionValueMap == null
                                ? 43
                                : this.fieldPositionValueMap.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.logEntry == null ? 43 : this.logEntry.hashCode());
        result = (result * PRIME) + (this.matchStatus == null ? 43 : this.matchStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.matchStatusDescription == null
                                ? 43
                                : this.matchStatusDescription.hashCode());
        result = (result * PRIME) + (this.fieldMapping == null ? 43 : this.fieldMapping.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampZone == null ? 43 : this.timestampZone.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampStartIndex == null
                                ? 43
                                : this.timestampStartIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampEndIndex == null ? 43 : this.timestampEndIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampEpochMillisec == null
                                ? 43
                                : this.timestampEpochMillisec.hashCode());
        result =
                (result * PRIME)
                        + (this.textMatchInfo == null ? 43 : this.textMatchInfo.hashCode());
        result = (result * PRIME) + (this.matchResult == null ? 43 : this.matchResult.hashCode());
        result = (result * PRIME) + (this.loglines == null ? 43 : this.loglines.hashCode());
        result =
                (result * PRIME)
                        + (this.functionNames == null ? 43 : this.functionNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
