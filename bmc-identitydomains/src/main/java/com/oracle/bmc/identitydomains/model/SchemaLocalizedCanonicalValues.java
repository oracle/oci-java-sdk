/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A collection of Localized canonical values. <br>
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
        builder = SchemaLocalizedCanonicalValues.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchemaLocalizedCanonicalValues
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "canonicalValue", "locale"})
    public SchemaLocalizedCanonicalValues(
            String value, java.util.List<String> canonicalValue, String locale) {
        super();
        this.value = value;
        this.canonicalValue = canonicalValue;
        this.locale = locale;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Localized display value
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Localized display value
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Canonical values
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalValue")
        private java.util.List<String> canonicalValue;

        /**
         * Canonical values
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param canonicalValue the value to set
         * @return this builder
         */
        public Builder canonicalValue(java.util.List<String> canonicalValue) {
            this.canonicalValue = canonicalValue;
            this.__explicitlySet__.add("canonicalValue");
            return this;
        }
        /**
         * Locale used
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private String locale;

        /**
         * Locale used
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param locale the value to set
         * @return this builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaLocalizedCanonicalValues build() {
            SchemaLocalizedCanonicalValues model =
                    new SchemaLocalizedCanonicalValues(
                            this.value, this.canonicalValue, this.locale);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaLocalizedCanonicalValues model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("canonicalValue")) {
                this.canonicalValue(model.getCanonicalValue());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
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
     * Localized display value
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Localized display value
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Canonical values
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalValue")
    private final java.util.List<String> canonicalValue;

    /**
     * Canonical values
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getCanonicalValue() {
        return canonicalValue;
    }

    /**
     * Locale used
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final String locale;

    /**
     * Locale used
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLocale() {
        return locale;
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
        sb.append("SchemaLocalizedCanonicalValues(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", canonicalValue=").append(String.valueOf(this.canonicalValue));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaLocalizedCanonicalValues)) {
            return false;
        }

        SchemaLocalizedCanonicalValues other = (SchemaLocalizedCanonicalValues) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.canonicalValue, other.canonicalValue)
                && java.util.Objects.equals(this.locale, other.locale)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.canonicalValue == null ? 43 : this.canonicalValue.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
