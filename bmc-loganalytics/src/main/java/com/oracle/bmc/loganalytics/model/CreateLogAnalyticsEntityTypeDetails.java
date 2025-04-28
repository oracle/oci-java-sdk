/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details for new log analytics entity type to be added. <br>
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
        builder = CreateLogAnalyticsEntityTypeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLogAnalyticsEntityTypeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "category", "properties"})
    public CreateLogAnalyticsEntityTypeDetails(
            String name, String category, java.util.List<EntityTypeProperty> properties) {
        super();
        this.name = name;
        this.category = category;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Log analytics entity type name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Log analytics entity type name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Log analytics entity type category. Category will be used for grouping and filtering. */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Log analytics entity type category. Category will be used for grouping and filtering.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** Log analytics entity type property definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<EntityTypeProperty> properties;

        /**
         * Log analytics entity type property definition.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<EntityTypeProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLogAnalyticsEntityTypeDetails build() {
            CreateLogAnalyticsEntityTypeDetails model =
                    new CreateLogAnalyticsEntityTypeDetails(
                            this.name, this.category, this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLogAnalyticsEntityTypeDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Log analytics entity type name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Log analytics entity type name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Log analytics entity type category. Category will be used for grouping and filtering. */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Log analytics entity type category. Category will be used for grouping and filtering.
     *
     * @return the value
     */
    public String getCategory() {
        return category;
    }

    /** Log analytics entity type property definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<EntityTypeProperty> properties;

    /**
     * Log analytics entity type property definition.
     *
     * @return the value
     */
    public java.util.List<EntityTypeProperty> getProperties() {
        return properties;
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
        sb.append("CreateLogAnalyticsEntityTypeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLogAnalyticsEntityTypeDetails)) {
            return false;
        }

        CreateLogAnalyticsEntityTypeDetails other = (CreateLogAnalyticsEntityTypeDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
