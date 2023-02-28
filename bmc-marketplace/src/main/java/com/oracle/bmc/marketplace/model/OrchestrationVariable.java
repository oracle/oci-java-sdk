/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model of a variable for an orchestration resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OrchestrationVariable.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OrchestrationVariable
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The name of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the variable.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The variable's default value. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The variable's default value.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** A description of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the variable.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The data type of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private OrchestrationVariableTypeEnum dataType;

        /**
         * The data type of the variable.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(OrchestrationVariableTypeEnum dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Whether the variable is mandatory. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        /**
         * Whether the variable is mandatory.
         *
         * @param isMandatory the value to set
         * @return this builder
         */
        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }
        /** A brief textual description that helps to explain the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("hintMessage")
        private String hintMessage;

        /**
         * A brief textual description that helps to explain the variable.
         *
         * @param hintMessage the value to set
         * @return this builder
         */
        public Builder hintMessage(String hintMessage) {
            this.hintMessage = hintMessage;
            this.__explicitlySet__.add("hintMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrchestrationVariable build() {
            OrchestrationVariable model =
                    new OrchestrationVariable(
                            this.name,
                            this.defaultValue,
                            this.description,
                            this.dataType,
                            this.isMandatory,
                            this.hintMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrchestrationVariable model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("isMandatory")) {
                this.isMandatory(model.getIsMandatory());
            }
            if (model.wasPropertyExplicitlySet("hintMessage")) {
                this.hintMessage(model.getHintMessage());
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

    /** The name of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the variable.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The variable's default value. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The variable's default value.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** A description of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the variable.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The data type of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final OrchestrationVariableTypeEnum dataType;

    /**
     * The data type of the variable.
     *
     * @return the value
     */
    public OrchestrationVariableTypeEnum getDataType() {
        return dataType;
    }

    /** Whether the variable is mandatory. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    /**
     * Whether the variable is mandatory.
     *
     * @return the value
     */
    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /** A brief textual description that helps to explain the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("hintMessage")
    private final String hintMessage;

    /**
     * A brief textual description that helps to explain the variable.
     *
     * @return the value
     */
    public String getHintMessage() {
        return hintMessage;
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
        sb.append("OrchestrationVariable(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", hintMessage=").append(String.valueOf(this.hintMessage));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
