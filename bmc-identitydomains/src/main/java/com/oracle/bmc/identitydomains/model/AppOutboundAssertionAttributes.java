/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Use to construct the outgoing SAML attributes
 *
 * <p>*Added In:** 18.2.6
 *
 * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable: true -
 * multiValued: false - mutability: readOnly - required: false - returned: default - type: complex -
 * uniqueness: none <br>
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
        builder = AppOutboundAssertionAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppOutboundAssertionAttributes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "direction"})
    public AppOutboundAssertionAttributes(String value, String ref, String direction) {
        super();
        this.value = value;
        this.ref = ref;
        this.direction = direction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Mapped Attribute identifier
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - mutability: readOnly
         * - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Mapped Attribute identifier
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - mutability: readOnly
         * - required: true - returned: default - type: string - uniqueness: none
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
         * Mapped Attribute URI
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false
         * - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Mapped Attribute URI
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false
         * - returned: default - type: reference - uniqueness: none
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
         * Mapped Attribute Direction
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private String direction;

        /**
         * Mapped Attribute Direction
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param direction the value to set
         * @return this builder
         */
        public Builder direction(String direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppOutboundAssertionAttributes build() {
            AppOutboundAssertionAttributes model =
                    new AppOutboundAssertionAttributes(this.value, this.ref, this.direction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppOutboundAssertionAttributes model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("direction")) {
                this.direction(model.getDirection());
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
     * Mapped Attribute identifier
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - mutability: readOnly -
     * required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Mapped Attribute identifier
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - mutability: readOnly -
     * required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Mapped Attribute URI
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false -
     * returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Mapped Attribute URI
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false -
     * returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * Mapped Attribute Direction
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final String direction;

    /**
     * Mapped Attribute Direction
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDirection() {
        return direction;
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
        sb.append("AppOutboundAssertionAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppOutboundAssertionAttributes)) {
            return false;
        }

        AppOutboundAssertionAttributes other = (AppOutboundAssertionAttributes) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.direction, other.direction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
