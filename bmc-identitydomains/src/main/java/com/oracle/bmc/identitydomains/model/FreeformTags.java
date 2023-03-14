/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * OCI Freeform Tags
 * <p>
 **Added In:** 2011192329
 * <p>
 **SCIM++ Properties:**
 *  - idcsCompositeKey: [key, value]
 *  - idcsSearchable: true
 *  - type: complex
 *  - required: false
 *  - mutability: readWrite
 *  - returned: default
 *  - multiValued: true
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FreeformTags.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FreeformTags extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value"})
    public FreeformTags(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCI Tag key
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - type: string
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - idcsSearchable: true
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * OCI Tag key
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - type: string
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - idcsSearchable: true
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
         * OCI Tag value
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - type: string
         *  - idcsSearchable: true
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * OCI Tag value
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - type: string
         *  - idcsSearchable: true
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

        public FreeformTags build() {
            FreeformTags model = new FreeformTags(this.key, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FreeformTags model) {
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
     * OCI Tag key
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - type: string
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - idcsSearchable: true
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * OCI Tag key
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - type: string
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - idcsSearchable: true
     *  - uniqueness: none
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * OCI Tag value
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - type: string
     *  - idcsSearchable: true
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * OCI Tag value
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - type: string
     *  - idcsSearchable: true
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
        sb.append("FreeformTags(");
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
        if (!(o instanceof FreeformTags)) {
            return false;
        }

        FreeformTags other = (FreeformTags) o;
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
