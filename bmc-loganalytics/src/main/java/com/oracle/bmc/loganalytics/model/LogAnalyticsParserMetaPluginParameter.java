/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserMetaPluginParameter <br>
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
        builder = LogAnalyticsParserMetaPluginParameter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsParserMetaPluginParameter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "name",
        "isMandatory",
        "isRepeatable",
        "pluginName",
        "type"
    })
    public LogAnalyticsParserMetaPluginParameter(
            String description,
            String name,
            Boolean isMandatory,
            Boolean isRepeatable,
            String pluginName,
            String type) {
        super();
        this.description = description;
        this.name = name;
        this.isMandatory = isMandatory;
        this.isRepeatable = isRepeatable;
        this.pluginName = pluginName;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The parameter description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The parameter description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The parameter internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The parameter internal name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A flag indicating whether or not the parameter is mandatory. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        /**
         * A flag indicating whether or not the parameter is mandatory.
         *
         * @param isMandatory the value to set
         * @return this builder
         */
        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }
        /** A flag indicating whether or not the parameter is repeatable. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRepeatable")
        private Boolean isRepeatable;

        /**
         * A flag indicating whether or not the parameter is repeatable.
         *
         * @param isRepeatable the value to set
         * @return this builder
         */
        public Builder isRepeatable(Boolean isRepeatable) {
            this.isRepeatable = isRepeatable;
            this.__explicitlySet__.add("isRepeatable");
            return this;
        }
        /** The plugin internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
        private String pluginName;

        /**
         * The plugin internal name.
         *
         * @param pluginName the value to set
         * @return this builder
         */
        public Builder pluginName(String pluginName) {
            this.pluginName = pluginName;
            this.__explicitlySet__.add("pluginName");
            return this;
        }
        /** The parameter type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The parameter type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserMetaPluginParameter build() {
            LogAnalyticsParserMetaPluginParameter model =
                    new LogAnalyticsParserMetaPluginParameter(
                            this.description,
                            this.name,
                            this.isMandatory,
                            this.isRepeatable,
                            this.pluginName,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserMetaPluginParameter model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isMandatory")) {
                this.isMandatory(model.getIsMandatory());
            }
            if (model.wasPropertyExplicitlySet("isRepeatable")) {
                this.isRepeatable(model.getIsRepeatable());
            }
            if (model.wasPropertyExplicitlySet("pluginName")) {
                this.pluginName(model.getPluginName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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

    /** The parameter description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The parameter description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The parameter internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The parameter internal name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A flag indicating whether or not the parameter is mandatory. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    /**
     * A flag indicating whether or not the parameter is mandatory.
     *
     * @return the value
     */
    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /** A flag indicating whether or not the parameter is repeatable. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRepeatable")
    private final Boolean isRepeatable;

    /**
     * A flag indicating whether or not the parameter is repeatable.
     *
     * @return the value
     */
    public Boolean getIsRepeatable() {
        return isRepeatable;
    }

    /** The plugin internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
    private final String pluginName;

    /**
     * The plugin internal name.
     *
     * @return the value
     */
    public String getPluginName() {
        return pluginName;
    }

    /** The parameter type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The parameter type.
     *
     * @return the value
     */
    public String getType() {
        return type;
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
        sb.append("LogAnalyticsParserMetaPluginParameter(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", isRepeatable=").append(String.valueOf(this.isRepeatable));
        sb.append(", pluginName=").append(String.valueOf(this.pluginName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserMetaPluginParameter)) {
            return false;
        }

        LogAnalyticsParserMetaPluginParameter other = (LogAnalyticsParserMetaPluginParameter) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.isRepeatable, other.isRepeatable)
                && java.util.Objects.equals(this.pluginName, other.pluginName)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result = (result * PRIME) + (this.isRepeatable == null ? 43 : this.isRepeatable.hashCode());
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
