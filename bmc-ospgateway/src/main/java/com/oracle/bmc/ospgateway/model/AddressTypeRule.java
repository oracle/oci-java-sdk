/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Address type rule information
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddressTypeRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddressTypeRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"thirdPartyValidation", "fields"})
    public AddressTypeRule(
            ThirdPartyValidationType thirdPartyValidation, java.util.List<Field> fields) {
        super();
        this.thirdPartyValidation = thirdPartyValidation;
        this.fields = fields;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Third party validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyValidation")
        private ThirdPartyValidationType thirdPartyValidation;

        /**
         * Third party validation.
         * @param thirdPartyValidation the value to set
         * @return this builder
         **/
        public Builder thirdPartyValidation(ThirdPartyValidationType thirdPartyValidation) {
            this.thirdPartyValidation = thirdPartyValidation;
            this.__explicitlySet__.add("thirdPartyValidation");
            return this;
        }
        /**
         * Address type rule fields
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<Field> fields;

        /**
         * Address type rule fields
         * @param fields the value to set
         * @return this builder
         **/
        public Builder fields(java.util.List<Field> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddressTypeRule build() {
            AddressTypeRule model = new AddressTypeRule(this.thirdPartyValidation, this.fields);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddressTypeRule model) {
            if (model.wasPropertyExplicitlySet("thirdPartyValidation")) {
                this.thirdPartyValidation(model.getThirdPartyValidation());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
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
     * Third party validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyValidation")
    private final ThirdPartyValidationType thirdPartyValidation;

    /**
     * Third party validation.
     * @return the value
     **/
    public ThirdPartyValidationType getThirdPartyValidation() {
        return thirdPartyValidation;
    }

    /**
     * Address type rule fields
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<Field> fields;

    /**
     * Address type rule fields
     * @return the value
     **/
    public java.util.List<Field> getFields() {
        return fields;
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
        sb.append("AddressTypeRule(");
        sb.append("super=").append(super.toString());
        sb.append("thirdPartyValidation=").append(String.valueOf(this.thirdPartyValidation));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddressTypeRule)) {
            return false;
        }

        AddressTypeRule other = (AddressTypeRule) o;
        return java.util.Objects.equals(this.thirdPartyValidation, other.thirdPartyValidation)
                && java.util.Objects.equals(this.fields, other.fields)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.thirdPartyValidation == null
                                ? 43
                                : this.thirdPartyValidation.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
