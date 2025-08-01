/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Property item in name/value pair <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NamedCredentialProperty.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamedCredentialProperty
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value", "valueCategory"})
    public NamedCredentialProperty(String name, String value, ValueCategoryType valueCategory) {
        super();
        this.name = name;
        this.value = value;
        this.valueCategory = valueCategory;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the property */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the property
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Value of the property */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of the property
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The category of the Named credential property value. CLEAR_TEXT indicates the value field
         * contains a clear text value. SECRET_IDENTIFIER indicates the value field contains a vault
         * secret ocid identifier. ADB_IDENTIFIER indicates the value field contains an Autonomous
         * database ocid identifier. ALLOWED_VALUE indicates the value should be selected from the
         * options in the allowedValues field.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("valueCategory")
        private ValueCategoryType valueCategory;

        /**
         * The category of the Named credential property value. CLEAR_TEXT indicates the value field
         * contains a clear text value. SECRET_IDENTIFIER indicates the value field contains a vault
         * secret ocid identifier. ADB_IDENTIFIER indicates the value field contains an Autonomous
         * database ocid identifier. ALLOWED_VALUE indicates the value should be selected from the
         * options in the allowedValues field.
         *
         * @param valueCategory the value to set
         * @return this builder
         */
        public Builder valueCategory(ValueCategoryType valueCategory) {
            this.valueCategory = valueCategory;
            this.__explicitlySet__.add("valueCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedCredentialProperty build() {
            NamedCredentialProperty model =
                    new NamedCredentialProperty(this.name, this.value, this.valueCategory);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedCredentialProperty model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("valueCategory")) {
                this.valueCategory(model.getValueCategory());
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

    /** Name of the property */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the property
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Value of the property */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of the property
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The category of the Named credential property value. CLEAR_TEXT indicates the value field
     * contains a clear text value. SECRET_IDENTIFIER indicates the value field contains a vault
     * secret ocid identifier. ADB_IDENTIFIER indicates the value field contains an Autonomous
     * database ocid identifier. ALLOWED_VALUE indicates the value should be selected from the
     * options in the allowedValues field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCategory")
    private final ValueCategoryType valueCategory;

    /**
     * The category of the Named credential property value. CLEAR_TEXT indicates the value field
     * contains a clear text value. SECRET_IDENTIFIER indicates the value field contains a vault
     * secret ocid identifier. ADB_IDENTIFIER indicates the value field contains an Autonomous
     * database ocid identifier. ALLOWED_VALUE indicates the value should be selected from the
     * options in the allowedValues field.
     *
     * @return the value
     */
    public ValueCategoryType getValueCategory() {
        return valueCategory;
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
        sb.append("NamedCredentialProperty(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", valueCategory=").append(String.valueOf(this.valueCategory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedCredentialProperty)) {
            return false;
        }

        NamedCredentialProperty other = (NamedCredentialProperty) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.valueCategory, other.valueCategory)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.valueCategory == null ? 43 : this.valueCategory.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
