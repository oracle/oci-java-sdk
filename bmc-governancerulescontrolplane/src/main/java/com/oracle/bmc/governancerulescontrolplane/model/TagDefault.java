/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Tag defaults let you specify a default tag (tagnamespace.tag="value") to apply to all resource types
 * in a specified compartment. The tag default is applied at the time the resource is created. Resources
 * that exist in the compartment before you create the tag default are not tagged.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TagDefault.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TagDefault extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tagName", "value", "isRequired"})
    public TagDefault(String tagName, String value, Boolean isRequired) {
        super();
        this.tagName = tagName;
        this.value = value;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the tag. The tag default will always assign a default value for this tag name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagName")
        private String tagName;

        /**
         * The name of the tag. The tag default will always assign a default value for this tag name.
         *
         * @param tagName the value to set
         * @return this builder
         **/
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            this.__explicitlySet__.add("tagName");
            return this;
        }
        /**
         * The default value for the tag name. This will be applied to all new resources created in the compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The default value for the tag name. This will be applied to all new resources created in the compartment.
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * If you specify that a value is required, a value is set during resource creation (either by
         * the user creating the resource or another tag default). If no value is set, resource
         * creation is blocked.
         * <p>
         * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
         * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
         * <p>
         * Example: {@code false}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * If you specify that a value is required, a value is set during resource creation (either by
         * the user creating the resource or another tag default). If no value is set, resource
         * creation is blocked.
         * <p>
         * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
         * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
         * <p>
         * Example: {@code false}
         *
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TagDefault build() {
            TagDefault model = new TagDefault(this.tagName, this.value, this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TagDefault model) {
            if (model.wasPropertyExplicitlySet("tagName")) {
                this.tagName(model.getTagName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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
     * The name of the tag. The tag default will always assign a default value for this tag name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagName")
    private final String tagName;

    /**
     * The name of the tag. The tag default will always assign a default value for this tag name.
     *
     * @return the value
     **/
    public String getTagName() {
        return tagName;
    }

    /**
     * The default value for the tag name. This will be applied to all new resources created in the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The default value for the tag name. This will be applied to all new resources created in the compartment.
     *
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag default). If no value is set, resource
     * creation is blocked.
     * <p>
     * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
     * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * If you specify that a value is required, a value is set during resource creation (either by
     * the user creating the resource or another tag default). If no value is set, resource
     * creation is blocked.
     * <p>
     * If the {@code isRequired} flag is set to "true", the value is set during resource creation.
     * * If the {@code isRequired} flag is set to "false", the value you enter is set during resource creation.
     * <p>
     * Example: {@code false}
     *
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("TagDefault(");
        sb.append("super=").append(super.toString());
        sb.append("tagName=").append(String.valueOf(this.tagName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagDefault)) {
            return false;
        }

        TagDefault other = (TagDefault) o;
        return java.util.Objects.equals(this.tagName, other.tagName)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tagName == null ? 43 : this.tagName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
