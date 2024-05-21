/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Each value of this attribute describes an attribute of Group that will be sent in a Security Assertion Markup Language (SAML) assertion.
 * <p>
 **Deprecated Since: 18.2.2**
 * <p>
 **SCIM++ Properties:**
 *  - caseExact: false
 *  - idcsCompositeKey: [name]
 *  - idcsSearchable: false
 *  - idcsValuePersistedInOtherAttribute: true
 *  - multiValued: true
 *  - mutability: readWrite
 *  - required: false
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppGroupAssertionAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppGroupAssertionAttributes
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "format", "condition", "groupName"})
    public AppGroupAssertionAttributes(
            String name, String format, String condition, String groupName) {
        super();
        this.name = name;
        this.format = format;
        this.condition = condition;
        this.groupName = groupName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The attribute represents the name of the attribute that will be used in the Security Assertion Markup Language (SAML) assertion
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The attribute represents the name of the attribute that will be used in the Security Assertion Markup Language (SAML) assertion
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicates the format of the assertion attribute.
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private String format;

        /**
         * Indicates the format of the assertion attribute.
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param format the value to set
         * @return this builder
         **/
        public Builder format(String format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }
        /**
         * Indicates the filter types that are supported for the Group assertion attributes.
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * Indicates the filter types that are supported for the Group assertion attributes.
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param condition the value to set
         * @return this builder
         **/
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * Indicates the group name that are supported for the group assertion attributes.
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * Indicates the group name that are supported for the group assertion attributes.
         * <p>
         **Deprecated Since: 18.2.2**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - idcsValuePersistedInOtherAttribute: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param groupName the value to set
         * @return this builder
         **/
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppGroupAssertionAttributes build() {
            AppGroupAssertionAttributes model =
                    new AppGroupAssertionAttributes(
                            this.name, this.format, this.condition, this.groupName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppGroupAssertionAttributes model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
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
     * The attribute represents the name of the attribute that will be used in the Security Assertion Markup Language (SAML) assertion
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The attribute represents the name of the attribute that will be used in the Security Assertion Markup Language (SAML) assertion
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Indicates the format of the assertion attribute.
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final String format;

    /**
     * Indicates the format of the assertion attribute.
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getFormat() {
        return format;
    }

    /**
     * Indicates the filter types that are supported for the Group assertion attributes.
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * Indicates the filter types that are supported for the Group assertion attributes.
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCondition() {
        return condition;
    }

    /**
     * Indicates the group name that are supported for the group assertion attributes.
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * Indicates the group name that are supported for the group assertion attributes.
     * <p>
     **Deprecated Since: 18.2.2**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - idcsValuePersistedInOtherAttribute: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getGroupName() {
        return groupName;
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
        sb.append("AppGroupAssertionAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppGroupAssertionAttributes)) {
            return false;
        }

        AppGroupAssertionAttributes other = (AppGroupAssertionAttributes) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
