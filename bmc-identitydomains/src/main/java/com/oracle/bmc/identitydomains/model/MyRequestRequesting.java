/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Requestable resource reference.
 * <p>
 **SCIM++ Properties:**
 *  - idcsSearchable: true
 *  - multiValued: false
 *  - mutability: immutable
 *  - required: true
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
    builder = MyRequestRequesting.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyRequestRequesting extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "display", "description", "type"})
    public MyRequestRequesting(
            String value, String ref, String display, String description, Type type) {
        super();
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.description = description;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Resource identifier
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsCsvAttributeName: requesting_id
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Resource identifier
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsCsvAttributeName: requesting_id
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
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
        /**
         * Resource URI
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Resource URI
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Resource display name
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * Resource display name
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param display the value to set
         * @return this builder
         **/
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * Resource description
         * <p>
         **Added In:** 2307071836
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Resource description
         * <p>
         **Added In:** 2307071836
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Requestable type. Allowed values are Group and App.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsCsvAttributeName: Requestable Type
         *  - idcsDefaultValue: Group
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Requestable type. Allowed values are Group and App.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsCsvAttributeName: Requestable Type
         *  - idcsDefaultValue: Group
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyRequestRequesting build() {
            MyRequestRequesting model =
                    new MyRequestRequesting(
                            this.value, this.ref, this.display, this.description, this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyRequestRequesting model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * Resource identifier
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCsvAttributeName: requesting_id
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Resource identifier
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCsvAttributeName: requesting_id
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Resource URI
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Resource URI
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * Resource display name
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * Resource display name
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplay() {
        return display;
    }

    /**
     * Resource description
     * <p>
     **Added In:** 2307071836
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Resource description
     * <p>
     **Added In:** 2307071836
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Requestable type. Allowed values are Group and App.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCsvAttributeName: Requestable Type
     *  - idcsDefaultValue: Group
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Type {
        Group("Group"),
        App("App"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Requestable type. Allowed values are Group and App.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCsvAttributeName: Requestable Type
     *  - idcsDefaultValue: Group
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Requestable type. Allowed values are Group and App.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCsvAttributeName: Requestable Type
     *  - idcsDefaultValue: Group
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Type getType() {
        return type;
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
        sb.append("MyRequestRequesting(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyRequestRequesting)) {
            return false;
        }

        MyRequestRequesting other = (MyRequestRequesting) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
