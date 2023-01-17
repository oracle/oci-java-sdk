/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserFunction <br>
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
        builder = LogAnalyticsParserFunction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserFunction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parserMetaPlugin",
        "parserFunctionId",
        "parserFunctionName",
        "isEnabled",
        "isSystem",
        "parserId",
        "parserName",
        "parserMetaPluginName",
        "parserFunctionPriority",
        "parserFunctionParameters"
    })
    public LogAnalyticsParserFunction(
            LogAnalyticsParserMetaPlugin parserMetaPlugin,
            Long parserFunctionId,
            String parserFunctionName,
            Boolean isEnabled,
            Boolean isSystem,
            Long parserId,
            String parserName,
            String parserMetaPluginName,
            Long parserFunctionPriority,
            java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters) {
        super();
        this.parserMetaPlugin = parserMetaPlugin;
        this.parserFunctionId = parserFunctionId;
        this.parserFunctionName = parserFunctionName;
        this.isEnabled = isEnabled;
        this.isSystem = isSystem;
        this.parserId = parserId;
        this.parserName = parserName;
        this.parserMetaPluginName = parserMetaPluginName;
        this.parserFunctionPriority = parserFunctionPriority;
        this.parserFunctionParameters = parserFunctionParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPlugin")
        private LogAnalyticsParserMetaPlugin parserMetaPlugin;

        public Builder parserMetaPlugin(LogAnalyticsParserMetaPlugin parserMetaPlugin) {
            this.parserMetaPlugin = parserMetaPlugin;
            this.__explicitlySet__.add("parserMetaPlugin");
            return this;
        }
        /** The parser function unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
        private Long parserFunctionId;

        /**
         * The parser function unique identifier.
         *
         * @param parserFunctionId the value to set
         * @return this builder
         */
        public Builder parserFunctionId(Long parserFunctionId) {
            this.parserFunctionId = parserFunctionId;
            this.__explicitlySet__.add("parserFunctionId");
            return this;
        }
        /** The parser function internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionName")
        private String parserFunctionName;

        /**
         * The parser function internal name.
         *
         * @param parserFunctionName the value to set
         * @return this builder
         */
        public Builder parserFunctionName(String parserFunctionName) {
            this.parserFunctionName = parserFunctionName;
            this.__explicitlySet__.add("parserFunctionName");
            return this;
        }
        /** A flag inidcating whether or not the parser function is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the parser function is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The associated parser unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserId")
        private Long parserId;

        /**
         * The associated parser unique identifier.
         *
         * @param parserId the value to set
         * @return this builder
         */
        public Builder parserId(Long parserId) {
            this.parserId = parserId;
            this.__explicitlySet__.add("parserId");
            return this;
        }
        /** The associated parser internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserName")
        private String parserName;

        /**
         * The associated parser internal name.
         *
         * @param parserName the value to set
         * @return this builder
         */
        public Builder parserName(String parserName) {
            this.parserName = parserName;
            this.__explicitlySet__.add("parserName");
            return this;
        }
        /** The plugin internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginName")
        private String parserMetaPluginName;

        /**
         * The plugin internal name.
         *
         * @param parserMetaPluginName the value to set
         * @return this builder
         */
        public Builder parserMetaPluginName(String parserMetaPluginName) {
            this.parserMetaPluginName = parserMetaPluginName;
            this.__explicitlySet__.add("parserMetaPluginName");
            return this;
        }
        /** The parser function priority. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionPriority")
        private Long parserFunctionPriority;

        /**
         * The parser function priority.
         *
         * @param parserFunctionPriority the value to set
         * @return this builder
         */
        public Builder parserFunctionPriority(Long parserFunctionPriority) {
            this.parserFunctionPriority = parserFunctionPriority;
            this.__explicitlySet__.add("parserFunctionPriority");
            return this;
        }
        /** The parser function parameter list. */
        @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameters")
        private java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters;

        /**
         * The parser function parameter list.
         *
         * @param parserFunctionParameters the value to set
         * @return this builder
         */
        public Builder parserFunctionParameters(
                java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters) {
            this.parserFunctionParameters = parserFunctionParameters;
            this.__explicitlySet__.add("parserFunctionParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserFunction build() {
            LogAnalyticsParserFunction model =
                    new LogAnalyticsParserFunction(
                            this.parserMetaPlugin,
                            this.parserFunctionId,
                            this.parserFunctionName,
                            this.isEnabled,
                            this.isSystem,
                            this.parserId,
                            this.parserName,
                            this.parserMetaPluginName,
                            this.parserFunctionPriority,
                            this.parserFunctionParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserFunction model) {
            if (model.wasPropertyExplicitlySet("parserMetaPlugin")) {
                this.parserMetaPlugin(model.getParserMetaPlugin());
            }
            if (model.wasPropertyExplicitlySet("parserFunctionId")) {
                this.parserFunctionId(model.getParserFunctionId());
            }
            if (model.wasPropertyExplicitlySet("parserFunctionName")) {
                this.parserFunctionName(model.getParserFunctionName());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("parserId")) {
                this.parserId(model.getParserId());
            }
            if (model.wasPropertyExplicitlySet("parserName")) {
                this.parserName(model.getParserName());
            }
            if (model.wasPropertyExplicitlySet("parserMetaPluginName")) {
                this.parserMetaPluginName(model.getParserMetaPluginName());
            }
            if (model.wasPropertyExplicitlySet("parserFunctionPriority")) {
                this.parserFunctionPriority(model.getParserFunctionPriority());
            }
            if (model.wasPropertyExplicitlySet("parserFunctionParameters")) {
                this.parserFunctionParameters(model.getParserFunctionParameters());
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

    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPlugin")
    private final LogAnalyticsParserMetaPlugin parserMetaPlugin;

    public LogAnalyticsParserMetaPlugin getParserMetaPlugin() {
        return parserMetaPlugin;
    }

    /** The parser function unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionId")
    private final Long parserFunctionId;

    /**
     * The parser function unique identifier.
     *
     * @return the value
     */
    public Long getParserFunctionId() {
        return parserFunctionId;
    }

    /** The parser function internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionName")
    private final String parserFunctionName;

    /**
     * The parser function internal name.
     *
     * @return the value
     */
    public String getParserFunctionName() {
        return parserFunctionName;
    }

    /** A flag inidcating whether or not the parser function is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the parser function is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The associated parser unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserId")
    private final Long parserId;

    /**
     * The associated parser unique identifier.
     *
     * @return the value
     */
    public Long getParserId() {
        return parserId;
    }

    /** The associated parser internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserName")
    private final String parserName;

    /**
     * The associated parser internal name.
     *
     * @return the value
     */
    public String getParserName() {
        return parserName;
    }

    /** The plugin internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserMetaPluginName")
    private final String parserMetaPluginName;

    /**
     * The plugin internal name.
     *
     * @return the value
     */
    public String getParserMetaPluginName() {
        return parserMetaPluginName;
    }

    /** The parser function priority. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionPriority")
    private final Long parserFunctionPriority;

    /**
     * The parser function priority.
     *
     * @return the value
     */
    public Long getParserFunctionPriority() {
        return parserFunctionPriority;
    }

    /** The parser function parameter list. */
    @com.fasterxml.jackson.annotation.JsonProperty("parserFunctionParameters")
    private final java.util.List<LogAnalyticsParserFunctionParameter> parserFunctionParameters;

    /**
     * The parser function parameter list.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParserFunctionParameter> getParserFunctionParameters() {
        return parserFunctionParameters;
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
        sb.append("LogAnalyticsParserFunction(");
        sb.append("super=").append(super.toString());
        sb.append("parserMetaPlugin=").append(String.valueOf(this.parserMetaPlugin));
        sb.append(", parserFunctionId=").append(String.valueOf(this.parserFunctionId));
        sb.append(", parserFunctionName=").append(String.valueOf(this.parserFunctionName));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", parserId=").append(String.valueOf(this.parserId));
        sb.append(", parserName=").append(String.valueOf(this.parserName));
        sb.append(", parserMetaPluginName=").append(String.valueOf(this.parserMetaPluginName));
        sb.append(", parserFunctionPriority=").append(String.valueOf(this.parserFunctionPriority));
        sb.append(", parserFunctionParameters=")
                .append(String.valueOf(this.parserFunctionParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserFunction)) {
            return false;
        }

        LogAnalyticsParserFunction other = (LogAnalyticsParserFunction) o;
        return java.util.Objects.equals(this.parserMetaPlugin, other.parserMetaPlugin)
                && java.util.Objects.equals(this.parserFunctionId, other.parserFunctionId)
                && java.util.Objects.equals(this.parserFunctionName, other.parserFunctionName)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.parserId, other.parserId)
                && java.util.Objects.equals(this.parserName, other.parserName)
                && java.util.Objects.equals(this.parserMetaPluginName, other.parserMetaPluginName)
                && java.util.Objects.equals(
                        this.parserFunctionPriority, other.parserFunctionPriority)
                && java.util.Objects.equals(
                        this.parserFunctionParameters, other.parserFunctionParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.parserMetaPlugin == null ? 43 : this.parserMetaPlugin.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctionId == null ? 43 : this.parserFunctionId.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctionName == null
                                ? 43
                                : this.parserFunctionName.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.parserId == null ? 43 : this.parserId.hashCode());
        result = (result * PRIME) + (this.parserName == null ? 43 : this.parserName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserMetaPluginName == null
                                ? 43
                                : this.parserMetaPluginName.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctionPriority == null
                                ? 43
                                : this.parserFunctionPriority.hashCode());
        result =
                (result * PRIME)
                        + (this.parserFunctionParameters == null
                                ? 43
                                : this.parserFunctionParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
