/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Provide configuration information about the application in the target environment. Application
 * Migration migrates the application to the target environment only after you provide this
 * information. The information that you must provide varies depending on the type of application
 * that you are migrating. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ConfigurationField
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "group",
        "type",
        "value",
        "description",
        "resourceList",
        "isRequired",
        "isMutable"
    })
    public ConfigurationField(
            String name,
            String group,
            String type,
            String value,
            String description,
            java.util.List<ResourceField> resourceList,
            Boolean isRequired,
            Boolean isMutable) {
        super();
        this.name = name;
        this.group = group;
        this.type = type;
        this.value = value;
        this.description = description;
        this.resourceList = resourceList;
        this.isRequired = isRequired;
        this.isMutable = isMutable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the configuration field. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the configuration field.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The name of the group to which this field belongs, if any. */
        @com.fasterxml.jackson.annotation.JsonProperty("group")
        private String group;

        /**
         * The name of the group to which this field belongs, if any.
         *
         * @param group the value to set
         * @return this builder
         */
        public Builder group(String group) {
            this.group = group;
            this.__explicitlySet__.add("group");
            return this;
        }
        /** The type of the configuration field. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of the configuration field.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The value of the field. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the field.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Help text to guide the user in setting the configuration value. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Help text to guide the user in setting the configuration value.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A list of resources associated with a specific configuration object. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
        private java.util.List<ResourceField> resourceList;

        /**
         * A list of resources associated with a specific configuration object.
         *
         * @param resourceList the value to set
         * @return this builder
         */
        public Builder resourceList(java.util.List<ResourceField> resourceList) {
            this.resourceList = resourceList;
            this.__explicitlySet__.add("resourceList");
            return this;
        }
        /** Indicates whether or not the field is required (defaults to {@code true}). */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Indicates whether or not the field is required (defaults to {@code true}).
         *
         * @param isRequired the value to set
         * @return this builder
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }
        /** Indicates whether or not the field may be modified (defaults to {@code true}). */
        @com.fasterxml.jackson.annotation.JsonProperty("isMutable")
        private Boolean isMutable;

        /**
         * Indicates whether or not the field may be modified (defaults to {@code true}).
         *
         * @param isMutable the value to set
         * @return this builder
         */
        public Builder isMutable(Boolean isMutable) {
            this.isMutable = isMutable;
            this.__explicitlySet__.add("isMutable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationField build() {
            ConfigurationField model =
                    new ConfigurationField(
                            this.name,
                            this.group,
                            this.type,
                            this.value,
                            this.description,
                            this.resourceList,
                            this.isRequired,
                            this.isMutable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationField model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("group")) {
                this.group(model.getGroup());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceList")) {
                this.resourceList(model.getResourceList());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("isMutable")) {
                this.isMutable(model.getIsMutable());
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

    /** The name of the configuration field. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the configuration field.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The name of the group to which this field belongs, if any. */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    private final String group;

    /**
     * The name of the group to which this field belongs, if any.
     *
     * @return the value
     */
    public String getGroup() {
        return group;
    }

    /** The type of the configuration field. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of the configuration field.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The value of the field. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the field.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Help text to guide the user in setting the configuration value. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Help text to guide the user in setting the configuration value.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A list of resources associated with a specific configuration object. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
    private final java.util.List<ResourceField> resourceList;

    /**
     * A list of resources associated with a specific configuration object.
     *
     * @return the value
     */
    public java.util.List<ResourceField> getResourceList() {
        return resourceList;
    }

    /** Indicates whether or not the field is required (defaults to {@code true}). */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Indicates whether or not the field is required (defaults to {@code true}).
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /** Indicates whether or not the field may be modified (defaults to {@code true}). */
    @com.fasterxml.jackson.annotation.JsonProperty("isMutable")
    private final Boolean isMutable;

    /**
     * Indicates whether or not the field may be modified (defaults to {@code true}).
     *
     * @return the value
     */
    public Boolean getIsMutable() {
        return isMutable;
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
        sb.append("ConfigurationField(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", group=").append(String.valueOf(this.group));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceList=").append(String.valueOf(this.resourceList));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", isMutable=").append(String.valueOf(this.isMutable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationField)) {
            return false;
        }

        ConfigurationField other = (ConfigurationField) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.group, other.group)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceList, other.resourceList)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.isMutable, other.isMutable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.group == null ? 43 : this.group.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.resourceList == null ? 43 : this.resourceList.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.isMutable == null ? 43 : this.isMutable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
