/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParameter
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
    builder = LogAnalyticsParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParameter {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultValue",
        "description",
        "isActive",
        "name",
        "sourceId"
    })
    public LogAnalyticsParameter(
            String defaultValue, String description, Boolean isActive, String name, Long sourceId) {
        super();
        this.defaultValue = defaultValue;
        this.description = description;
        this.isActive = isActive;
        this.name = name;
        this.sourceId = sourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The default value of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value of the parameter.
         * @param defaultValue the value to set
         * @return this builder
         **/
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * The parameter description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The parameter description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A flag indicating whether or not the parameter is active.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * A flag indicating whether or not the parameter is active.
         *
         * @param isActive the value to set
         * @return this builder
         **/
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }
        /**
         * The parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The parameter name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The source unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParameter build() {
            LogAnalyticsParameter __instance__ =
                    new LogAnalyticsParameter(defaultValue, description, isActive, name, sourceId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParameter o) {
            Builder copiedBuilder =
                    defaultValue(o.getDefaultValue())
                            .description(o.getDescription())
                            .isActive(o.getIsActive())
                            .name(o.getName())
                            .sourceId(o.getSourceId());

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
     * The default value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value of the parameter.
     * @return the value
     **/
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * The parameter description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The parameter description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A flag indicating whether or not the parameter is active.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * A flag indicating whether or not the parameter is active.
     *
     * @return the value
     **/
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * The parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The parameter name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     * @return the value
     **/
    public Long getSourceId() {
        return sourceId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsParameter(");
        sb.append("defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isActive=").append(String.valueOf(this.isActive));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParameter)) {
            return false;
        }

        LogAnalyticsParameter other = (LogAnalyticsParameter) o;
        return java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isActive, other.isActive)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
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
