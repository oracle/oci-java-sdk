/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * List of password policy rules that have values set. This map of stringKey:stringValue pairs can be used to aid users while setting/resetting password
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
    builder = PasswordPolicyConfiguredPasswordPolicyRules.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PasswordPolicyConfiguredPasswordPolicyRules
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value"})
    public PasswordPolicyConfiguredPasswordPolicyRules(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The specific password policy rule
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The specific password policy rule
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * User-friendly text that describes a specific password policy rule
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * User-friendly text that describes a specific password policy rule
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordPolicyConfiguredPasswordPolicyRules build() {
            PasswordPolicyConfiguredPasswordPolicyRules model =
                    new PasswordPolicyConfiguredPasswordPolicyRules(this.key, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordPolicyConfiguredPasswordPolicyRules model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * The specific password policy rule
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The specific password policy rule
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * User-friendly text that describes a specific password policy rule
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * User-friendly text that describes a specific password policy rule
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
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
        sb.append("PasswordPolicyConfiguredPasswordPolicyRules(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PasswordPolicyConfiguredPasswordPolicyRules)) {
            return false;
        }

        PasswordPolicyConfiguredPasswordPolicyRules other =
                (PasswordPolicyConfiguredPasswordPolicyRules) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
