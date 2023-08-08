/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Each value of this attribute describes an attribute of User that will be sent in a Security
 * Assertion Markup Language (SAML) assertion.
 *
 * <p>*Deprecated Since: 18.2.2**
 *
 * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable: false -
 * idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability: readWrite - required:
 * false - returned: default - type: complex - uniqueness: none <br>
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
        builder = AppUserAssertionAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppUserAssertionAttributes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "userStoreAttributeName", "format"})
    public AppUserAssertionAttributes(String name, String userStoreAttributeName, String format) {
        super();
        this.name = name;
        this.userStoreAttributeName = userStoreAttributeName;
        this.format = format;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The attribute represents the name of the attribute that will be used in the Security
         * Assertion Markup Language (SAML) assertion
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The attribute represents the name of the attribute that will be used in the Security
         * Assertion Markup Language (SAML) assertion
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: true - returned: default - type: string - uniqueness: none
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * This attribute specifies which user attribute should be used to create the value of the
         * SAML assertion attribute. The userstore attribute can be constructed by using attributes
         * from the Oracle Identity Cloud Service Core Users schema. <br>
         * <b>Note</b>: Attributes from extensions to the Core User schema are not supported in
         * v1.0.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userStoreAttributeName")
        private String userStoreAttributeName;

        /**
         * This attribute specifies which user attribute should be used to create the value of the
         * SAML assertion attribute. The userstore attribute can be constructed by using attributes
         * from the Oracle Identity Cloud Service Core Users schema. <br>
         * <b>Note</b>: Attributes from extensions to the Core User schema are not supported in
         * v1.0.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: true - returned: default - type: string - uniqueness: none
         *
         * @param userStoreAttributeName the value to set
         * @return this builder
         */
        public Builder userStoreAttributeName(String userStoreAttributeName) {
            this.userStoreAttributeName = userStoreAttributeName;
            this.__explicitlySet__.add("userStoreAttributeName");
            return this;
        }
        /**
         * Indicates the format of the assertion attribute.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private String format;

        /**
         * Indicates the format of the assertion attribute.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param format the value to set
         * @return this builder
         */
        public Builder format(String format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppUserAssertionAttributes build() {
            AppUserAssertionAttributes model =
                    new AppUserAssertionAttributes(
                            this.name, this.userStoreAttributeName, this.format);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppUserAssertionAttributes model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("userStoreAttributeName")) {
                this.userStoreAttributeName(model.getUserStoreAttributeName());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
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
     * The attribute represents the name of the attribute that will be used in the Security
     * Assertion Markup Language (SAML) assertion
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The attribute represents the name of the attribute that will be used in the Security
     * Assertion Markup Language (SAML) assertion
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * This attribute specifies which user attribute should be used to create the value of the SAML
     * assertion attribute. The userstore attribute can be constructed by using attributes from the
     * Oracle Identity Cloud Service Core Users schema. <br>
     * <b>Note</b>: Attributes from extensions to the Core User schema are not supported in v1.0.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userStoreAttributeName")
    private final String userStoreAttributeName;

    /**
     * This attribute specifies which user attribute should be used to create the value of the SAML
     * assertion attribute. The userstore attribute can be constructed by using attributes from the
     * Oracle Identity Cloud Service Core Users schema. <br>
     * <b>Note</b>: Attributes from extensions to the Core User schema are not supported in v1.0.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getUserStoreAttributeName() {
        return userStoreAttributeName;
    }

    /**
     * Indicates the format of the assertion attribute.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final String format;

    /**
     * Indicates the format of the assertion attribute.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFormat() {
        return format;
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
        sb.append("AppUserAssertionAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", userStoreAttributeName=").append(String.valueOf(this.userStoreAttributeName));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppUserAssertionAttributes)) {
            return false;
        }

        AppUserAssertionAttributes other = (AppUserAssertionAttributes) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.userStoreAttributeName, other.userStoreAttributeName)
                && java.util.Objects.equals(this.format, other.format)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.userStoreAttributeName == null
                                ? 43
                                : this.userStoreAttributeName.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
