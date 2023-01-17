/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserField <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsParserField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserField
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "field",
        "parserFieldId",
        "parserFieldExpression",
        "parserFieldName",
        "storageFieldName",
        "parserFieldIntegratorName",
        "parserName",
        "parserFieldSequence",
        "parser",
        "structuredColumnInfo"
    })
    public LogAnalyticsParserField(
            LogAnalyticsField field,
            Long parserFieldId,
            String parserFieldExpression,
            String parserFieldName,
            String storageFieldName,
            String parserFieldIntegratorName,
            String parserName,
            Long parserFieldSequence,
            LogAnalyticsParser parser,
            String structuredColumnInfo) {
        super();
        this.field = field;
        this.parserFieldId = parserFieldId;
        this.parserFieldExpression = parserFieldExpression;
        this.parserFieldName = parserFieldName;
        this.storageFieldName = storageFieldName;
        this.parserFieldIntegratorName = parserFieldIntegratorName;
        this.parserName = parserName;
        this.parserFieldSequence = parserFieldSequence;
        this.parser = parser;
        this.structuredColumnInfo = structuredColumnInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private LogAnalyticsField field;

        public Builder field(LogAnalyticsField field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }
        /** The parser field unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldId")
        private Long parserFieldId;

        /**
         * The parser field unique identifier.
         *
         * @param parserFieldId the value to set
         * @return this builder
         */
        public Builder parserFieldId(Long parserFieldId) {
            this.parserFieldId = parserFieldId;
            this.__explicitlySet__.add("parserFieldId");
            return this;
        }
        /** the parser field expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldExpression")
        private String parserFieldExpression;

        /**
         * the parser field expression.
         *
         * @param parserFieldExpression the value to set
         * @return this builder
         */
        public Builder parserFieldExpression(String parserFieldExpression) {
            this.parserFieldExpression = parserFieldExpression;
            this.__explicitlySet__.add("parserFieldExpression");
            return this;
        }
        /** The parser field internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldName")
        private String parserFieldName;

        /**
         * The parser field internal name.
         *
         * @param parserFieldName the value to set
         * @return this builder
         */
        public Builder parserFieldName(String parserFieldName) {
            this.parserFieldName = parserFieldName;
            this.__explicitlySet__.add("parserFieldName");
            return this;
        }
        /** The storage field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageFieldName")
        private String storageFieldName;

        /**
         * The storage field name.
         *
         * @param storageFieldName the value to set
         * @return this builder
         */
        public Builder storageFieldName(String storageFieldName) {
            this.storageFieldName = storageFieldName;
            this.__explicitlySet__.add("storageFieldName");
            return this;
        }
        /** The integrator name. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldIntegratorName")
        private String parserFieldIntegratorName;

        /**
         * The integrator name.
         *
         * @param parserFieldIntegratorName the value to set
         * @return this builder
         */
        public Builder parserFieldIntegratorName(String parserFieldIntegratorName) {
            this.parserFieldIntegratorName = parserFieldIntegratorName;
            this.__explicitlySet__.add("parserFieldIntegratorName");
            return this;
        }
        /** The parser internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        /**
         * The parser internal name.
         *
         * @param parserName the value to set
         * @return this builder
         */
        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }
        /** The parser field sequence. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFieldSequence")
        private Long parserFieldSequence;

        /**
         * The parser field sequence.
         *
         * @param parserFieldSequence the value to set
         * @return this builder
         */
        public Builder parserFieldSequence(Long parserFieldSequence) {
            this.parserFieldSequence = parserFieldSequence;
            this.__explicitlySet__.add("parserFieldSequence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parser")
        private LogAnalyticsParser parser;

        public Builder parser(LogAnalyticsParser parser) {
            this.parser = parser;
            this.__explicitlySet__.add("parser");
            return this;
        }
        /** The structured column information. */
        @com.fasterxml.jackson.annotation.JsonProperty("structuredColumnInfo")
        private String structuredColumnInfo;

        /**
         * The structured column information.
         *
         * @param structuredColumnInfo the value to set
         * @return this builder
         */
        public Builder structuredColumnInfo(String structuredColumnInfo) {
            this.structuredColumnInfo = structuredColumnInfo;
            this.__explicitlySet__.add("structuredColumnInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserField build() {
            LogAnalyticsParserField model =
                    new LogAnalyticsParserField(
                            this.field,
                            this.parserFieldId,
                            this.parserFieldExpression,
                            this.parserFieldName,
                            this.storageFieldName,
                            this.parserFieldIntegratorName,
                            this.parserName,
                            this.parserFieldSequence,
                            this.parser,
                            this.structuredColumnInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserField model) {
            if (model.wasPropertyExplicitlySet("field")) {
                this.field(model.getField());
            }
            if (model.wasPropertyExplicitlySet("parserFieldId")) {
                this.parserFieldId(model.getParserFieldId());
            }
            if (model.wasPropertyExplicitlySet("parserFieldExpression")) {
                this.parserFieldExpression(model.getParserFieldExpression());
            }
            if (model.wasPropertyExplicitlySet("parserFieldName")) {
                this.parserFieldName(model.getParserFieldName());
            }
            if (model.wasPropertyExplicitlySet("storageFieldName")) {
                this.storageFieldName(model.getStorageFieldName());
            }
            if (model.wasPropertyExplicitlySet("parserFieldIntegratorName")) {
                this.parserFieldIntegratorName(model.getParserFieldIntegratorName());
            }
            if (model.wasPropertyExplicitlySet("parserName")) {
                this.parserName(model.getParserName());
            }
            if (model.wasPropertyExplicitlySet("parserFieldSequence")) {
                this.parserFieldSequence(model.getParserFieldSequence());
            }
            if (model.wasPropertyExplicitlySet("parser")) {
                this.parser(model.getParser());
            }
            if (model.wasPropertyExplicitlySet("structuredColumnInfo")) {
                this.structuredColumnInfo(model.getStructuredColumnInfo());
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

    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final LogAnalyticsField field;

    public LogAnalyticsField getField() {
        return field;
    }

    /** The parser field unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldId")
    private final Long parserFieldId;

    /**
     * The parser field unique identifier.
     *
     * @return the value
     */
    public Long getParserFieldId() {
        return parserFieldId;
    }

    /** the parser field expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldExpression")
    private final String parserFieldExpression;

    /**
     * the parser field expression.
     *
     * @return the value
     */
    public String getParserFieldExpression() {
        return parserFieldExpression;
    }

    /** The parser field internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldName")
    private final String parserFieldName;

    /**
     * The parser field internal name.
     *
     * @return the value
     */
    public String getParserFieldName() {
        return parserFieldName;
    }

    /** The storage field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageFieldName")
    private final String storageFieldName;

    /**
     * The storage field name.
     *
     * @return the value
     */
    public String getStorageFieldName() {
        return storageFieldName;
    }

    /** The integrator name. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldIntegratorName")
    private final String parserFieldIntegratorName;

    /**
     * The integrator name.
     *
     * @return the value
     */
    public String getParserFieldIntegratorName() {
        return parserFieldIntegratorName;
    }

    /** The parser internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    private final String parserName;

    /**
     * The parser internal name.
     *
     * @return the value
     */
    public String getParserName() {
        return parserName;
    }

    /** The parser field sequence. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFieldSequence")
    private final Long parserFieldSequence;

    /**
     * The parser field sequence.
     *
     * @return the value
     */
    public Long getParserFieldSequence() {
        return parserFieldSequence;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parser")
    private final LogAnalyticsParser parser;

    public LogAnalyticsParser getParser() {
        return parser;
    }

    /** The structured column information. */
    @com.fasterxml.jackson.annotation.JsonProperty("structuredColumnInfo")
    private final String structuredColumnInfo;

    /**
     * The structured column information.
     *
     * @return the value
     */
    public String getStructuredColumnInfo() {
        return structuredColumnInfo;
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
        sb.append("LogAnalyticsParserField(");
        sb.append("super=").append(super.toString());
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", parserFieldId=").append(String.valueOf(this.parserFieldId));
        sb.append(", parserFieldExpression=").append(String.valueOf(this.parserFieldExpression));
        sb.append(", parserFieldName=").append(String.valueOf(this.parserFieldName));
        sb.append(", storageFieldName=").append(String.valueOf(this.storageFieldName));
        sb.append(", parserFieldIntegratorName=")
                .append(String.valueOf(this.parserFieldIntegratorName));
        sb.append(", parserName=").append(String.valueOf(this.parserName));
        sb.append(", parserFieldSequence=").append(String.valueOf(this.parserFieldSequence));
        sb.append(", parser=").append(String.valueOf(this.parser));
        sb.append(", structuredColumnInfo=").append(String.valueOf(this.structuredColumnInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserField)) {
            return false;
        }

        LogAnalyticsParserField other = (LogAnalyticsParserField) o;
        return java.util.Objects.equals(this.field, other.field)
                && java.util.Objects.equals(this.parserFieldId, other.parserFieldId)
                && java.util.Objects.equals(this.parserFieldExpression, other.parserFieldExpression)
                && java.util.Objects.equals(this.parserFieldName, other.parserFieldName)
                && java.util.Objects.equals(this.storageFieldName, other.storageFieldName)
                && java.util.Objects.equals(
                        this.parserFieldIntegratorName, other.parserFieldIntegratorName)
                && java.util.Objects.equals(this.parserName, other.parserName)
                && java.util.Objects.equals(this.parserFieldSequence, other.parserFieldSequence)
                && java.util.Objects.equals(this.parser, other.parser)
                && java.util.Objects.equals(this.structuredColumnInfo, other.structuredColumnInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFieldId == null ? 43 : this.parserFieldId.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFieldExpression == null
                                ? 43
                                : this.parserFieldExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFieldName == null ? 43 : this.parserFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.storageFieldName == null ? 43 : this.storageFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFieldIntegratorName == null
                                ? 43
                                : this.parserFieldIntegratorName.hashCode());
        result = (result * PRIME) + (this.parserName == null ? 43 : this.parserName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFieldSequence == null
                                ? 43
                                : this.parserFieldSequence.hashCode());
        result = (result * PRIME) + (this.parser == null ? 43 : this.parser.hashCode());
        result =
                (result * PRIME)
                        + (this.structuredColumnInfo == null
                                ? 43
                                : this.structuredColumnInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
