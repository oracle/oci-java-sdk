/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Locale values for the Question <br>
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
        builder = SecurityQuestionQuestionText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityQuestionQuestionText
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "locale", "isDefault"})
    public SecurityQuestionQuestionText(String value, String locale, Boolean isDefault) {
        super();
        this.value = value;
        this.locale = locale;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The question text
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The question text
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
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
         * The locale
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
         * "locales" and attrValues.value eq "$(locale)" - idcsCanonicalValueSourceResourceType:
         * AllowedValue - idcsSearchable: true - multiValued: false - mutability: readWrite -
         * required: true - returned: always - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private String locale;

        /**
         * The locale
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
         * "locales" and attrValues.value eq "$(locale)" - idcsCanonicalValueSourceResourceType:
         * AllowedValue - idcsSearchable: true - multiValued: false - mutability: readWrite -
         * required: true - returned: always - type: string - uniqueness: none
         *
         * @param locale the value to set
         * @return this builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }
        /**
         * If true, specifies that the localized attribute instance value is the default and will be
         * returned if no localized value found for requesting user's preferred locale. One and only
         * one instance should have this attribute set to true.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("default")
        private Boolean isDefault;

        /**
         * If true, specifies that the localized attribute instance value is the default and will be
         * returned if no localized value found for requesting user's preferred locale. One and only
         * one instance should have this attribute set to true.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityQuestionQuestionText build() {
            SecurityQuestionQuestionText model =
                    new SecurityQuestionQuestionText(this.value, this.locale, this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityQuestionQuestionText model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.isDefault());
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
     * The question text
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The question text
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The locale
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
     * "locales" and attrValues.value eq "$(locale)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - idcsSearchable: true - multiValued: false - mutability: readWrite - required:
     * true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final String locale;

    /**
     * The locale
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
     * "locales" and attrValues.value eq "$(locale)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - idcsSearchable: true - multiValued: false - mutability: readWrite - required:
     * true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLocale() {
        return locale;
    }

    /**
     * If true, specifies that the localized attribute instance value is the default and will be
     * returned if no localized value found for requesting user's preferred locale. One and only one
     * instance should have this attribute set to true.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("default")
    private final Boolean isDefault;

    /**
     * If true, specifies that the localized attribute instance value is the default and will be
     * returned if no localized value found for requesting user's preferred locale. One and only one
     * instance should have this attribute set to true.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean isDefault() {
        return isDefault;
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
        sb.append("SecurityQuestionQuestionText(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityQuestionQuestionText)) {
            return false;
        }

        SecurityQuestionQuestionText other = (SecurityQuestionQuestionText) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
