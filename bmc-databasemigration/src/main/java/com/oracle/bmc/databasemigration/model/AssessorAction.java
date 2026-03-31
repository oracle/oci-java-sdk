/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Assessor Action
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssessorAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssessorAction extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "title",
        "description",
        "isDisabled",
        "userDefinedProperties",
        "resourceId"
    })
    public AssessorAction(
            AssessorActionNames name,
            String displayName,
            String title,
            String description,
            Boolean isDisabled,
            UserDefinedProperties userDefinedProperties,
            String resourceId) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.title = title;
        this.description = description;
        this.isDisabled = isDisabled;
        this.userDefinedProperties = userDefinedProperties;
        this.resourceId = resourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Assessor Action Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private AssessorActionNames name;

        /**
         * The Assessor Action Name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(AssessorActionNames name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The Assessor Action Title.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The Assessor Action Title.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * A user-friendly description. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Defines if the action is enabled or disabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        /**
         * Defines if the action is enabled or disabled.
         * @param isDisabled the value to set
         * @return this builder
         **/
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userDefinedProperties")
        private UserDefinedProperties userDefinedProperties;

        public Builder userDefinedProperties(UserDefinedProperties userDefinedProperties) {
            this.userDefinedProperties = userDefinedProperties;
            this.__explicitlySet__.add("userDefinedProperties");
            return this;
        }
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the resource being referenced.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssessorAction build() {
            AssessorAction model =
                    new AssessorAction(
                            this.name,
                            this.displayName,
                            this.title,
                            this.description,
                            this.isDisabled,
                            this.userDefinedProperties,
                            this.resourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssessorAction model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isDisabled")) {
                this.isDisabled(model.getIsDisabled());
            }
            if (model.wasPropertyExplicitlySet("userDefinedProperties")) {
                this.userDefinedProperties(model.getUserDefinedProperties());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
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
     * The Assessor Action Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final AssessorActionNames name;

    /**
     * The Assessor Action Name.
     * @return the value
     **/
    public AssessorActionNames getName() {
        return name;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Assessor Action Title.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The Assessor Action Title.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * A user-friendly description. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Defines if the action is enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    private final Boolean isDisabled;

    /**
     * Defines if the action is enabled or disabled.
     * @return the value
     **/
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userDefinedProperties")
    private final UserDefinedProperties userDefinedProperties;

    public UserDefinedProperties getUserDefinedProperties() {
        return userDefinedProperties;
    }

    /**
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
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
        sb.append("AssessorAction(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isDisabled=").append(String.valueOf(this.isDisabled));
        sb.append(", userDefinedProperties=").append(String.valueOf(this.userDefinedProperties));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssessorAction)) {
            return false;
        }

        AssessorAction other = (AssessorAction) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isDisabled, other.isDisabled)
                && java.util.Objects.equals(this.userDefinedProperties, other.userDefinedProperties)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isDisabled == null ? 43 : this.isDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.userDefinedProperties == null
                                ? 43
                                : this.userDefinedProperties.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
