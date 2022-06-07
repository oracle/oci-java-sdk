/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model of a variable for an orchestration resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OrchestrationVariable.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OrchestrationVariable {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "defaultValue",
        "description",
        "dataType",
        "isMandatory",
        "hintMessage"
    })
    public OrchestrationVariable(
            String name,
            String defaultValue,
            String description,
            OrchestrationVariableTypeEnum dataType,
            Boolean isMandatory,
            String hintMessage) {
        super();
        this.name = name;
        this.defaultValue = defaultValue;
        this.description = description;
        this.dataType = dataType;
        this.isMandatory = isMandatory;
        this.hintMessage = hintMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private OrchestrationVariableTypeEnum dataType;

        public Builder dataType(OrchestrationVariableTypeEnum dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hintMessage")
        private String hintMessage;

        public Builder hintMessage(String hintMessage) {
            this.hintMessage = hintMessage;
            this.__explicitlySet__.add("hintMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrchestrationVariable build() {
            OrchestrationVariable __instance__ =
                    new OrchestrationVariable(
                            name, defaultValue, description, dataType, isMandatory, hintMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrchestrationVariable o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .defaultValue(o.getDefaultValue())
                            .description(o.getDescription())
                            .dataType(o.getDataType())
                            .isMandatory(o.getIsMandatory())
                            .hintMessage(o.getHintMessage());

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
     * The name of the variable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The variable's default value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * A description of the variable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The data type of the variable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final OrchestrationVariableTypeEnum dataType;

    public OrchestrationVariableTypeEnum getDataType() {
        return dataType;
    }

    /**
     * Whether the variable is mandatory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /**
     * A brief textual description that helps to explain the variable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hintMessage")
    private final String hintMessage;

    public String getHintMessage() {
        return hintMessage;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OrchestrationVariable(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", hintMessage=").append(String.valueOf(this.hintMessage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrchestrationVariable)) {
            return false;
        }

        OrchestrationVariable other = (OrchestrationVariable) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.hintMessage, other.hintMessage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result = (result * PRIME) + (this.hintMessage == null ? 43 : this.hintMessage.hashCode());
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
