/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Password Verifiers for DB User.
 *
 * <p>*Added In:** 18.2.2
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - idcsSearchable: true - multiValued: true -
 * mutability: readOnly - required: false - returned: request - type: complex - uniqueness: none
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UserExtPasswordVerifiers.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserExtPasswordVerifiers
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "value"})
    public UserExtPasswordVerifiers(String type, String value) {
        super();
        this.type = type;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of database password verifier (for example, MR-SHA512 or SSHA).
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of database password verifier (for example, MR-SHA512 or SSHA).
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Hash value of database password verifier.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: none
         * - multiValued: false - mutability: readOnly - required: true - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Hash value of database password verifier.
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: none
         * - multiValued: false - mutability: readOnly - required: true - returned: default - type:
         * string - uniqueness: none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtPasswordVerifiers build() {
            UserExtPasswordVerifiers model = new UserExtPasswordVerifiers(this.type, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtPasswordVerifiers model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * Type of database password verifier (for example, MR-SHA512 or SSHA).
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of database password verifier (for example, MR-SHA512 or SSHA).
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Hash value of database password verifier.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: none -
     * multiValued: false - mutability: readOnly - required: true - returned: default - type: string
     * - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Hash value of database password verifier.
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: none -
     * multiValued: false - mutability: readOnly - required: true - returned: default - type: string
     * - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
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
        sb.append("UserExtPasswordVerifiers(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtPasswordVerifiers)) {
            return false;
        }

        UserExtPasswordVerifiers other = (UserExtPasswordVerifiers) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
