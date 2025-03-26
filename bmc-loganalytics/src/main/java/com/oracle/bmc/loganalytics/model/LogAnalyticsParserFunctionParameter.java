/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserFunctionParameter
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
    builder = LogAnalyticsParserFunctionParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserFunctionParameter
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parserFunctionId",
        "parserFunctionParameterName",
        "parserFunctionParameterId",
        "parserMetaPluginParameterName",
        "parserMetaPluginParameterValue",
        "parserName",
        "parserMetaPluginParameter"
    })
    public LogAnalyticsParserFunctionParameter(
            Long parserFunctionId,
            String parserFunctionParameterName,
            Long parserFunctionParameterId,
            String parserMetaPluginParameterName,
            String parserMetaPluginParameterValue,
            String parserName,
            LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter) {
        super();
        this.parserFunctionId = parserFunctionId;
        this.parserFunctionParameterName = parserFunctionParameterName;
        this.parserFunctionParameterId = parserFunctionParameterId;
        this.parserMetaPluginParameterName = parserMetaPluginParameterName;
        this.parserMetaPluginParameterValue = parserMetaPluginParameterValue;
        this.parserName = parserName;
        this.parserMetaPluginParameter = parserMetaPluginParameter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The parser function unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
        private Long parserFunctionId;

        /**
         * The parser function unique identifier.
         * @param parserFunctionId the value to set
         * @return this builder
         **/
        public Builder parserFunctionId(Long parserFunctionId) {
            this.parserFunctionId = parserFunctionId;
            this.__explicitlySet__.add("parserFunctionId");
            return this;
        }
        /**
         * The internal name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterName")
        private String parserFunctionParameterName;

        /**
         * The internal name
         * @param parserFunctionParameterName the value to set
         * @return this builder
         **/
        public Builder parserFunctionParameterName(String parserFunctionParameterName) {
            this.parserFunctionParameterName = parserFunctionParameterName;
            this.__explicitlySet__.add("parserFunctionParameterName");
            return this;
        }
        /**
         * The parameter unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterId")
        private Long parserFunctionParameterId;

        /**
         * The parameter unique identifier.
         * @param parserFunctionParameterId the value to set
         * @return this builder
         **/
        public Builder parserFunctionParameterId(Long parserFunctionParameterId) {
            this.parserFunctionParameterId = parserFunctionParameterId;
            this.__explicitlySet__.add("parserFunctionParameterId");
            return this;
        }
        /**
         * The parameter internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterName")
        private String parserMetaPluginParameterName;

        /**
         * The parameter internal name.
         * @param parserMetaPluginParameterName the value to set
         * @return this builder
         **/
        public Builder parserMetaPluginParameterName(String parserMetaPluginParameterName) {
            this.parserMetaPluginParameterName = parserMetaPluginParameterName;
            this.__explicitlySet__.add("parserMetaPluginParameterName");
            return this;
        }
        /**
         * The parameter value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterValue")
        private String parserMetaPluginParameterValue;

        /**
         * The parameter value.
         * @param parserMetaPluginParameterValue the value to set
         * @return this builder
         **/
        public Builder parserMetaPluginParameterValue(String parserMetaPluginParameterValue) {
            this.parserMetaPluginParameterValue = parserMetaPluginParameterValue;
            this.__explicitlySet__.add("parserMetaPluginParameterValue");
            return this;
        }
        /**
         * The parser internal name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        /**
         * The parser internal name.
         * @param parserName the value to set
         * @return this builder
         **/
        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameter")
        private LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter;

        public Builder parserMetaPluginParameter(
                LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter) {
            this.parserMetaPluginParameter = parserMetaPluginParameter;
            this.__explicitlySet__.add("parserMetaPluginParameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserFunctionParameter build() {
            LogAnalyticsParserFunctionParameter model =
                    new LogAnalyticsParserFunctionParameter(
                            this.parserFunctionId,
                            this.parserFunctionParameterName,
                            this.parserFunctionParameterId,
                            this.parserMetaPluginParameterName,
                            this.parserMetaPluginParameterValue,
                            this.parserName,
                            this.parserMetaPluginParameter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserFunctionParameter model) {
            if (model.wasPropertyExplicitlySet("parserFunctionId")) {
                this.parserFunctionId(model.getParserFunctionId());
            }
            if (model.wasPropertyExplicitlySet("parserFunctionParameterName")) {
                this.parserFunctionParameterName(model.getParserFunctionParameterName());
            }
            if (model.wasPropertyExplicitlySet("parserFunctionParameterId")) {
                this.parserFunctionParameterId(model.getParserFunctionParameterId());
            }
            if (model.wasPropertyExplicitlySet("parserMetaPluginParameterName")) {
                this.parserMetaPluginParameterName(model.getParserMetaPluginParameterName());
            }
            if (model.wasPropertyExplicitlySet("parserMetaPluginParameterValue")) {
                this.parserMetaPluginParameterValue(model.getParserMetaPluginParameterValue());
            }
            if (model.wasPropertyExplicitlySet("parserName")) {
                this.parserName(model.getParserName());
            }
            if (model.wasPropertyExplicitlySet("parserMetaPluginParameter")) {
                this.parserMetaPluginParameter(model.getParserMetaPluginParameter());
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
     * The parser function unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
    private final Long parserFunctionId;

    /**
     * The parser function unique identifier.
     * @return the value
     **/
    public Long getParserFunctionId() {
        return parserFunctionId;
    }

    /**
     * The internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterName")
    private final String parserFunctionParameterName;

    /**
     * The internal name
     * @return the value
     **/
    public String getParserFunctionParameterName() {
        return parserFunctionParameterName;
    }

    /**
     * The parameter unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameterId")
    private final Long parserFunctionParameterId;

    /**
     * The parameter unique identifier.
     * @return the value
     **/
    public Long getParserFunctionParameterId() {
        return parserFunctionParameterId;
    }

    /**
     * The parameter internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterName")
    private final String parserMetaPluginParameterName;

    /**
     * The parameter internal name.
     * @return the value
     **/
    public String getParserMetaPluginParameterName() {
        return parserMetaPluginParameterName;
    }

    /**
     * The parameter value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameterValue")
    private final String parserMetaPluginParameterValue;

    /**
     * The parameter value.
     * @return the value
     **/
    public String getParserMetaPluginParameterValue() {
        return parserMetaPluginParameterValue;
    }

    /**
     * The parser internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    private final String parserName;

    /**
     * The parser internal name.
     * @return the value
     **/
    public String getParserName() {
        return parserName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginParameter")
    private final LogAnalyticsParserMetaPluginParameter parserMetaPluginParameter;

    public LogAnalyticsParserMetaPluginParameter getParserMetaPluginParameter() {
        return parserMetaPluginParameter;
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
        sb.append("LogAnalyticsParserFunctionParameter(");
        sb.append("super=").append(super.toString());
        sb.append("parserFunctionId=").append(String.valueOf(this.parserFunctionId));
        sb.append(", parserFunctionParameterName=")
                .append(String.valueOf(this.parserFunctionParameterName));
        sb.append(", parserFunctionParameterId=")
                .append(String.valueOf(this.parserFunctionParameterId));
        sb.append(", parserMetaPluginParameterName=")
                .append(String.valueOf(this.parserMetaPluginParameterName));
        sb.append(", parserMetaPluginParameterValue=")
                .append(String.valueOf(this.parserMetaPluginParameterValue));
        sb.append(", parserName=").append(String.valueOf(this.parserName));
        sb.append(", parserMetaPluginParameter=")
                .append(String.valueOf(this.parserMetaPluginParameter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserFunctionParameter)) {
            return false;
        }

        LogAnalyticsParserFunctionParameter other = (LogAnalyticsParserFunctionParameter) o;
        return java.util.Objects.equals(this.parserFunctionId, other.parserFunctionId)
                && java.util.Objects.equals(
                        this.parserFunctionParameterName, other.parserFunctionParameterName)
                && java.util.Objects.equals(
                        this.parserFunctionParameterId, other.parserFunctionParameterId)
                && java.util.Objects.equals(
                        this.parserMetaPluginParameterName, other.parserMetaPluginParameterName)
                && java.util.Objects.equals(
                        this.parserMetaPluginParameterValue, other.parserMetaPluginParameterValue)
                && java.util.Objects.equals(this.parserName, other.parserName)
                && java.util.Objects.equals(
                        this.parserMetaPluginParameter, other.parserMetaPluginParameter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.parserFunctionId == null ? 43 : this.parserFunctionId.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctionParameterName == null
                                ? 43
                                : this.parserFunctionParameterName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctionParameterId == null
                                ? 43
                                : this.parserFunctionParameterId.hashCode());
        result =
                (result * PRIME)
                        + (this.parserMetaPluginParameterName == null
                                ? 43
                                : this.parserMetaPluginParameterName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserMetaPluginParameterValue == null
                                ? 43
                                : this.parserMetaPluginParameterValue.hashCode());
        result = (result * PRIME) + (this.parserName == null ? 43 : this.parserName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserMetaPluginParameter == null
                                ? 43
                                : this.parserMetaPluginParameter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
