/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * User defined properties
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UserDefinedProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserDefinedProperties
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "helpLinkUrl",
        "helpLinkText",
        "properties"
    })
    public UserDefinedProperties(
            String displayName,
            String description,
            String helpLinkUrl,
            String helpLinkText,
            java.util.List<UserDefinedProperty> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.helpLinkUrl = helpLinkUrl;
        this.helpLinkText = helpLinkText;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The Help URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpLinkUrl")
        private String helpLinkUrl;

        /**
         * The Help URL.
         * @param helpLinkUrl the value to set
         * @return this builder
         **/
        public Builder helpLinkUrl(String helpLinkUrl) {
            this.helpLinkUrl = helpLinkUrl;
            this.__explicitlySet__.add("helpLinkUrl");
            return this;
        }
        /**
         * The Help link text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpLinkText")
        private String helpLinkText;

        /**
         * The Help link text.
         * @param helpLinkText the value to set
         * @return this builder
         **/
        public Builder helpLinkText(String helpLinkText) {
            this.helpLinkText = helpLinkText;
            this.__explicitlySet__.add("helpLinkText");
            return this;
        }
        /**
         * Array of user defined properties.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<UserDefinedProperty> properties;

        /**
         * Array of user defined properties.
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.List<UserDefinedProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserDefinedProperties build() {
            UserDefinedProperties model =
                    new UserDefinedProperties(
                            this.displayName,
                            this.description,
                            this.helpLinkUrl,
                            this.helpLinkText,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserDefinedProperties model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("helpLinkUrl")) {
                this.helpLinkUrl(model.getHelpLinkUrl());
            }
            if (model.wasPropertyExplicitlySet("helpLinkText")) {
                this.helpLinkText(model.getHelpLinkText());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
     * The Help URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpLinkUrl")
    private final String helpLinkUrl;

    /**
     * The Help URL.
     * @return the value
     **/
    public String getHelpLinkUrl() {
        return helpLinkUrl;
    }

    /**
     * The Help link text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpLinkText")
    private final String helpLinkText;

    /**
     * The Help link text.
     * @return the value
     **/
    public String getHelpLinkText() {
        return helpLinkText;
    }

    /**
     * Array of user defined properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<UserDefinedProperty> properties;

    /**
     * Array of user defined properties.
     * @return the value
     **/
    public java.util.List<UserDefinedProperty> getProperties() {
        return properties;
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
        sb.append("UserDefinedProperties(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", helpLinkUrl=").append(String.valueOf(this.helpLinkUrl));
        sb.append(", helpLinkText=").append(String.valueOf(this.helpLinkText));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserDefinedProperties)) {
            return false;
        }

        UserDefinedProperties other = (UserDefinedProperties) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.helpLinkUrl, other.helpLinkUrl)
                && java.util.Objects.equals(this.helpLinkText, other.helpLinkText)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.helpLinkUrl == null ? 43 : this.helpLinkUrl.hashCode());
        result = (result * PRIME) + (this.helpLinkText == null ? 43 : this.helpLinkText.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
