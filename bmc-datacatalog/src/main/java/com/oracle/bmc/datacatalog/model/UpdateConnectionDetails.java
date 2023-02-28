/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in connection update operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "customPropertyMembers",
        "properties",
        "encProperties",
        "isDefault"
    })
    public UpdateConnectionDetails(
            String description,
            String displayName,
            java.util.List<CustomPropertySetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties,
            java.util.Map<String, java.util.Map<String, String>> encProperties,
            Boolean isDefault) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
        this.encProperties = encProperties;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A description of the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the connection.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The list of customized properties along with the values for this object */
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         *
         * @param customPropertyMembers the value to set
         * @return this builder
         */
        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the connection type.
         * Each connection type definition defines it's set of required and optional properties. The
         * map keys are category names and the values are maps of property name to property value.
         * Every property is contained inside of a category. Most connections have required
         * properties within the "default" category. To determine the set of optional and required
         * properties for a connection type, a query can be done on '/types?type=connection' that
         * returns a collection of all connection types. The appropriate connection type, which will
         * include definitions of all of it's properties, can be identified from this collection.
         * Example: {@code {"properties": { "default": { "username": "user1"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the connection type.
         * Each connection type definition defines it's set of required and optional properties. The
         * map keys are category names and the values are maps of property name to property value.
         * Every property is contained inside of a category. Most connections have required
         * properties within the "default" category. To determine the set of optional and required
         * properties for a connection type, a query can be done on '/types?type=connection' that
         * returns a collection of all connection types. The appropriate connection type, which will
         * include definitions of all of it's properties, can be identified from this collection.
         * Example: {@code {"properties": { "default": { "username": "user1"}}}}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * A map of maps that contains the encrypted values for sensitive properties which are
         * specific to the connection type. Each connection type definition defines it's set of
         * required and optional properties. The map keys are category names and the values are maps
         * of property name to property value. Every property is contained inside of a category.
         * Most connections have required properties within the "default" category. To determine the
         * set of optional and required properties for a connection type, a query can be done on
         * '/types?type=connection' that returns a collection of all connection types. The
         * appropriate connection type, which will include definitions of all of it's properties,
         * can be identified from this collection. Example: {@code {"encProperties": { "default": {
         * "password": "example-password"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encProperties")
        private java.util.Map<String, java.util.Map<String, String>> encProperties;

        /**
         * A map of maps that contains the encrypted values for sensitive properties which are
         * specific to the connection type. Each connection type definition defines it's set of
         * required and optional properties. The map keys are category names and the values are maps
         * of property name to property value. Every property is contained inside of a category.
         * Most connections have required properties within the "default" category. To determine the
         * set of optional and required properties for a connection type, a query can be done on
         * '/types?type=connection' that returns a collection of all connection types. The
         * appropriate connection type, which will include definitions of all of it's properties,
         * can be identified from this collection. Example: {@code {"encProperties": { "default": {
         * "password": "example-password"}}}}
         *
         * @param encProperties the value to set
         * @return this builder
         */
        public Builder encProperties(
                java.util.Map<String, java.util.Map<String, String>> encProperties) {
            this.encProperties = encProperties;
            this.__explicitlySet__.add("encProperties");
            return this;
        }
        /** Indicates whether this connection is the default connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether this connection is the default connection.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConnectionDetails build() {
            UpdateConnectionDetails model =
                    new UpdateConnectionDetails(
                            this.description,
                            this.displayName,
                            this.customPropertyMembers,
                            this.properties,
                            this.encProperties,
                            this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("encProperties")) {
                this.encProperties(model.getEncProperties());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
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

    /** A description of the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the connection.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The list of customized properties along with the values for this object */
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     *
     * @return the value
     */
    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * A map of maps that contains the properties which are specific to the connection type. Each
     * connection type definition defines it's set of required and optional properties. The map keys
     * are category names and the values are maps of property name to property value. Every property
     * is contained inside of a category. Most connections have required properties within the
     * "default" category. To determine the set of optional and required properties for a connection
     * type, a query can be done on '/types?type=connection' that returns a collection of all
     * connection types. The appropriate connection type, which will include definitions of all of
     * it's properties, can be identified from this collection. Example: {@code {"properties": {
     * "default": { "username": "user1"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the connection type. Each
     * connection type definition defines it's set of required and optional properties. The map keys
     * are category names and the values are maps of property name to property value. Every property
     * is contained inside of a category. Most connections have required properties within the
     * "default" category. To determine the set of optional and required properties for a connection
     * type, a query can be done on '/types?type=connection' that returns a collection of all
     * connection types. The appropriate connection type, which will include definitions of all of
     * it's properties, can be identified from this collection. Example: {@code {"properties": {
     * "default": { "username": "user1"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    /**
     * A map of maps that contains the encrypted values for sensitive properties which are specific
     * to the connection type. Each connection type definition defines it's set of required and
     * optional properties. The map keys are category names and the values are maps of property name
     * to property value. Every property is contained inside of a category. Most connections have
     * required properties within the "default" category. To determine the set of optional and
     * required properties for a connection type, a query can be done on '/types?type=connection'
     * that returns a collection of all connection types. The appropriate connection type, which
     * will include definitions of all of it's properties, can be identified from this collection.
     * Example: {@code {"encProperties": { "default": { "password": "example-password"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encProperties")
    private final java.util.Map<String, java.util.Map<String, String>> encProperties;

    /**
     * A map of maps that contains the encrypted values for sensitive properties which are specific
     * to the connection type. Each connection type definition defines it's set of required and
     * optional properties. The map keys are category names and the values are maps of property name
     * to property value. Every property is contained inside of a category. Most connections have
     * required properties within the "default" category. To determine the set of optional and
     * required properties for a connection type, a query can be done on '/types?type=connection'
     * that returns a collection of all connection types. The appropriate connection type, which
     * will include definitions of all of it's properties, can be identified from this collection.
     * Example: {@code {"encProperties": { "default": { "password": "example-password"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getEncProperties() {
        return encProperties;
    }

    /** Indicates whether this connection is the default connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether this connection is the default connection.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("UpdateConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", encProperties=").append(String.valueOf(this.encProperties));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionDetails)) {
            return false;
        }

        UpdateConnectionDetails other = (UpdateConnectionDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.encProperties, other.encProperties)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.encProperties == null ? 43 : this.encProperties.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
