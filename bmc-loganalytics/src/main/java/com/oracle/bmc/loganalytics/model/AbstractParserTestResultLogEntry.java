/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * AbstractParserTestResultLogEntry <br>
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
        builder = AbstractParserTestResultLogEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AbstractParserTestResultLogEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "extraInfoAttributes",
        "fieldMap",
        "fieldNameValueMap",
        "fieldPositionValueMap",
        "fields",
        "logEntry",
        "matchStatus",
        "matchStatusDescription"
    })
    public AbstractParserTestResultLogEntry(
            java.util.Map<String, String> extraInfoAttributes,
            java.util.Map<String, String> fieldMap,
            java.util.Map<String, String> fieldNameValueMap,
            java.util.Map<String, String> fieldPositionValueMap,
            java.util.Map<String, String> fields,
            String logEntry,
            String matchStatus,
            String matchStatusDescription) {
        super();
        this.extraInfoAttributes = extraInfoAttributes;
        this.fieldMap = fieldMap;
        this.fieldNameValueMap = fieldNameValueMap;
        this.fieldPositionValueMap = fieldPositionValueMap;
        this.fields = fields;
        this.logEntry = logEntry;
        this.matchStatus = matchStatus;
        this.matchStatusDescription = matchStatusDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Extra information attributes. */
        @com.fasterxml.jackson.annotation.JsonProperty("extraInfoAttributes")
        private java.util.Map<String, String> extraInfoAttributes;

        /**
         * Extra information attributes.
         *
         * @param extraInfoAttributes the value to set
         * @return this builder
         */
        public Builder extraInfoAttributes(java.util.Map<String, String> extraInfoAttributes) {
            this.extraInfoAttributes = extraInfoAttributes;
            this.__explicitlySet__.add("extraInfoAttributes");
            return this;
        }
        /** The field map. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldMap")
        private java.util.Map<String, String> fieldMap;

        /**
         * The field map.
         *
         * @param fieldMap the value to set
         * @return this builder
         */
        public Builder fieldMap(java.util.Map<String, String> fieldMap) {
            this.fieldMap = fieldMap;
            this.__explicitlySet__.add("fieldMap");
            return this;
        }
        /** The field name value map. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldNameValueMap")
        private java.util.Map<String, String> fieldNameValueMap;

        /**
         * The field name value map.
         *
         * @param fieldNameValueMap the value to set
         * @return this builder
         */
        public Builder fieldNameValueMap(java.util.Map<String, String> fieldNameValueMap) {
            this.fieldNameValueMap = fieldNameValueMap;
            this.__explicitlySet__.add("fieldNameValueMap");
            return this;
        }
        /** The field position value map. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldPositionValueMap")
        private java.util.Map<String, String> fieldPositionValueMap;

        /**
         * The field position value map.
         *
         * @param fieldPositionValueMap the value to set
         * @return this builder
         */
        public Builder fieldPositionValueMap(java.util.Map<String, String> fieldPositionValueMap) {
            this.fieldPositionValueMap = fieldPositionValueMap;
            this.__explicitlySet__.add("fieldPositionValueMap");
            return this;
        }
        /** The parser fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.Map<String, String> fields;

        /**
         * The parser fields.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.Map<String, String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /** The log entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("logEntry")
        private String logEntry;

        /**
         * The log entry.
         *
         * @param logEntry the value to set
         * @return this builder
         */
        public Builder logEntry(String logEntry) {
            this.logEntry = logEntry;
            this.__explicitlySet__.add("logEntry");
            return this;
        }
        /** The match status. */
        @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
        private String matchStatus;

        /**
         * The match status.
         *
         * @param matchStatus the value to set
         * @return this builder
         */
        public Builder matchStatus(String matchStatus) {
            this.matchStatus = matchStatus;
            this.__explicitlySet__.add("matchStatus");
            return this;
        }
        /** The match status description. */
        @com.fasterxml.jackson.annotation.JsonProperty("matchStatusDescription")
        private String matchStatusDescription;

        /**
         * The match status description.
         *
         * @param matchStatusDescription the value to set
         * @return this builder
         */
        public Builder matchStatusDescription(String matchStatusDescription) {
            this.matchStatusDescription = matchStatusDescription;
            this.__explicitlySet__.add("matchStatusDescription");
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
                            this.matchStatusDescription);
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

    /** Extra information attributes. */
    @com.fasterxml.jackson.annotation.JsonProperty("extraInfoAttributes")
    private final java.util.Map<String, String> extraInfoAttributes;

    /**
     * Extra information attributes.
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtraInfoAttributes() {
        return extraInfoAttributes;
    }

    /** The field map. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldMap")
    private final java.util.Map<String, String> fieldMap;

    /**
     * The field map.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFieldMap() {
        return fieldMap;
    }

    /** The field name value map. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNameValueMap")
    private final java.util.Map<String, String> fieldNameValueMap;

    /**
     * The field name value map.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFieldNameValueMap() {
        return fieldNameValueMap;
    }

    /** The field position value map. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldPositionValueMap")
    private final java.util.Map<String, String> fieldPositionValueMap;

    /**
     * The field position value map.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFieldPositionValueMap() {
        return fieldPositionValueMap;
    }

    /** The parser fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.Map<String, String> fields;

    /**
     * The parser fields.
     *
     * @return the value
     */
    public java.util.Map<String, String> getFields() {
        return fields;
    }

    /** The log entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("logEntry")
    private final String logEntry;

    /**
     * The log entry.
     *
     * @return the value
     */
    public String getLogEntry() {
        return logEntry;
    }

    /** The match status. */
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatus")
    private final String matchStatus;

    /**
     * The match status.
     *
     * @return the value
     */
    public String getMatchStatus() {
        return matchStatus;
    }

    /** The match status description. */
    @com.fasterxml.jackson.annotation.JsonProperty("matchStatusDescription")
    private final String matchStatusDescription;

    /**
     * The match status description.
     *
     * @return the value
     */
    public String getMatchStatusDescription() {
        return matchStatusDescription;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
