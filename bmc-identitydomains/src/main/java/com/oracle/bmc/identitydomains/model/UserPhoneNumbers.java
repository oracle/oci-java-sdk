/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Phone numbers <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserPhoneNumbers.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserPhoneNumbers
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "display", "type", "primary", "verified"})
    public UserPhoneNumbers(
            String value, String display, Type type, Boolean primary, Boolean verified) {
        super();
        this.value = value;
        this.display = display;
        this.type = type;
        this.primary = primary;
        this.verified = verified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * User's phone number
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * User's phone number
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
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
         * A human-readable name, primarily used for display purposes. READ ONLY
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * A human-readable name, primarily used for display purposes. READ ONLY
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param display the value to set
         * @return this builder
         */
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * A label that indicates the attribute's function- for example, 'work', 'home', or 'mobile'
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * A label that indicates the attribute's function- for example, 'work', 'home', or 'mobile'
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * A Boolean value that indicates the 'primary' or preferred attribute value for this
         * attribute--for example, the preferred phone number or primary phone number. The primary
         * attribute value 'true' MUST appear no more than once.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primary")
        private Boolean primary;

        /**
         * A Boolean value that indicates the 'primary' or preferred attribute value for this
         * attribute--for example, the preferred phone number or primary phone number. The primary
         * attribute value 'true' MUST appear no more than once.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param primary the value to set
         * @return this builder
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            this.__explicitlySet__.add("primary");
            return this;
        }
        /**
         * A Boolean value that indicates if the phone number is verified.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("verified")
        private Boolean verified;

        /**
         * A Boolean value that indicates if the phone number is verified.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param verified the value to set
         * @return this builder
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
            this.__explicitlySet__.add("verified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserPhoneNumbers build() {
            UserPhoneNumbers model =
                    new UserPhoneNumbers(
                            this.value, this.display, this.type, this.primary, this.verified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserPhoneNumbers model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("primary")) {
                this.primary(model.getPrimary());
            }
            if (model.wasPropertyExplicitlySet("verified")) {
                this.verified(model.getVerified());
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

    /**
     * User's phone number
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * User's phone number
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * A human-readable name, primarily used for display purposes. READ ONLY
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * A human-readable name, primarily used for display purposes. READ ONLY
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplay() {
        return display;
    }

    /**
     * A label that indicates the attribute's function- for example, 'work', 'home', or 'mobile'
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Work("work"),
        Home("home"),
        Mobile("mobile"),
        Fax("fax"),
        Pager("pager"),
        Other("other"),
        Recovery("recovery"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * A label that indicates the attribute's function- for example, 'work', 'home', or 'mobile'
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * A label that indicates the attribute's function- for example, 'work', 'home', or 'mobile'
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * A Boolean value that indicates the 'primary' or preferred attribute value for this
     * attribute--for example, the preferred phone number or primary phone number. The primary
     * attribute value 'true' MUST appear no more than once.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primary")
    private final Boolean primary;

    /**
     * A Boolean value that indicates the 'primary' or preferred attribute value for this
     * attribute--for example, the preferred phone number or primary phone number. The primary
     * attribute value 'true' MUST appear no more than once.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * A Boolean value that indicates if the phone number is verified.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verified")
    private final Boolean verified;

    /**
     * A Boolean value that indicates if the phone number is verified.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getVerified() {
        return verified;
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
        sb.append("UserPhoneNumbers(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", primary=").append(String.valueOf(this.primary));
        sb.append(", verified=").append(String.valueOf(this.verified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserPhoneNumbers)) {
            return false;
        }

        UserPhoneNumbers other = (UserPhoneNumbers) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.primary, other.primary)
                && java.util.Objects.equals(this.verified, other.verified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.primary == null ? 43 : this.primary.hashCode());
        result = (result * PRIME) + (this.verified == null ? 43 : this.verified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
