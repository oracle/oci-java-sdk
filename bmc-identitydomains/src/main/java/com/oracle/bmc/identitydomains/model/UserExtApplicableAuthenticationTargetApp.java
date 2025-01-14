/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The app against which the user will authenticate. The value is not persisted but rather
 * calculated. If the user's delegatedAuthenticationTargetApp is set, that value is returned.
 * Otherwise, the app returned by evaluating the user's applicable Delegated Authentication Policy
 * is returned.
 *
 * <p>*Added In:** 18.1.6
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: false - mutability: readOnly
 * - required: false - returned: request - type: complex - uniqueness: none <br>
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
        builder = UserExtApplicableAuthenticationTargetApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserExtApplicableAuthenticationTargetApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "type", "display", "targetRequestTimeout"})
    public UserExtApplicableAuthenticationTargetApp(
            String value, String ref, String type, String display, Integer targetRequestTimeout) {
        super();
        this.value = value;
        this.ref = ref;
        this.type = type;
        this.display = display;
        this.targetRequestTimeout = targetRequestTimeout;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * App identifier
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * App identifier
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * returned: default - type: string - uniqueness: none
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
         * App URI
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * App URI
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * A label that indicates whether this is an App or IdentitySource.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * A label that indicates whether this is an App or IdentitySource.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none
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
         * App Display Name
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * App Display Name
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
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
         * Timeout interval for Synchronization TargetAction in milliseconds
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: integer -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRequestTimeout")
        private Integer targetRequestTimeout;

        /**
         * Timeout interval for Synchronization TargetAction in milliseconds
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: integer -
         * uniqueness: none
         *
         * @param targetRequestTimeout the value to set
         * @return this builder
         */
        public Builder targetRequestTimeout(Integer targetRequestTimeout) {
            this.targetRequestTimeout = targetRequestTimeout;
            this.__explicitlySet__.add("targetRequestTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtApplicableAuthenticationTargetApp build() {
            UserExtApplicableAuthenticationTargetApp model =
                    new UserExtApplicableAuthenticationTargetApp(
                            this.value,
                            this.ref,
                            this.type,
                            this.display,
                            this.targetRequestTimeout);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtApplicableAuthenticationTargetApp model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("targetRequestTimeout")) {
                this.targetRequestTimeout(model.getTargetRequestTimeout());
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
     * App identifier
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * App identifier
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * App URI
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * App URI
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * A label that indicates whether this is an App or IdentitySource.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * A label that indicates whether this is an App or IdentitySource.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * App Display Name
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * App Display Name
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Timeout interval for Synchronization TargetAction in milliseconds
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRequestTimeout")
    private final Integer targetRequestTimeout;

    /**
     * Timeout interval for Synchronization TargetAction in milliseconds
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getTargetRequestTimeout() {
        return targetRequestTimeout;
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
        sb.append("UserExtApplicableAuthenticationTargetApp(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", targetRequestTimeout=").append(String.valueOf(this.targetRequestTimeout));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtApplicableAuthenticationTargetApp)) {
            return false;
        }

        UserExtApplicableAuthenticationTargetApp other =
                (UserExtApplicableAuthenticationTargetApp) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.targetRequestTimeout, other.targetRequestTimeout)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result =
                (result * PRIME)
                        + (this.targetRequestTimeout == null
                                ? 43
                                : this.targetRequestTimeout.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
