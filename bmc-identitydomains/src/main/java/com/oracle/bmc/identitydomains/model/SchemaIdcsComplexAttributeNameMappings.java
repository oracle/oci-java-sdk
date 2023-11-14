/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Specifies the mapping between external identity source attributes and Oracle Identity Cloud
 * Service complex attributes (e.g. email => emails[work].value) <br>
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
        builder = SchemaIdcsComplexAttributeNameMappings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchemaIdcsComplexAttributeNameMappings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "mapsTo", "idcsRtsaHideAttribute"})
    public SchemaIdcsComplexAttributeNameMappings(
            String name, String mapsTo, Boolean idcsRtsaHideAttribute) {
        super();
        this.name = name;
        this.mapsTo = mapsTo;
        this.idcsRtsaHideAttribute = idcsRtsaHideAttribute;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The attribute that represents the display name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The attribute that represents the display name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
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
         * The attribute that is mapped to the attribute mapping
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mapsTo")
        private String mapsTo;

        /**
         * The attribute that is mapped to the attribute mapping
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: true - returned: default - type: string - uniqueness: none
         *
         * @param mapsTo the value to set
         * @return this builder
         */
        public Builder mapsTo(String mapsTo) {
            this.mapsTo = mapsTo;
            this.__explicitlySet__.add("mapsTo");
            return this;
        }
        /**
         * Specifies if the attributes that is mapped should be hidden externally
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRtsaHideAttribute")
        private Boolean idcsRtsaHideAttribute;

        /**
         * Specifies if the attributes that is mapped should be hidden externally
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param idcsRtsaHideAttribute the value to set
         * @return this builder
         */
        public Builder idcsRtsaHideAttribute(Boolean idcsRtsaHideAttribute) {
            this.idcsRtsaHideAttribute = idcsRtsaHideAttribute;
            this.__explicitlySet__.add("idcsRtsaHideAttribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaIdcsComplexAttributeNameMappings build() {
            SchemaIdcsComplexAttributeNameMappings model =
                    new SchemaIdcsComplexAttributeNameMappings(
                            this.name, this.mapsTo, this.idcsRtsaHideAttribute);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaIdcsComplexAttributeNameMappings model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("mapsTo")) {
                this.mapsTo(model.getMapsTo());
            }
            if (model.wasPropertyExplicitlySet("idcsRtsaHideAttribute")) {
                this.idcsRtsaHideAttribute(model.getIdcsRtsaHideAttribute());
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
     * The attribute that represents the display name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The attribute that represents the display name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The attribute that is mapped to the attribute mapping
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mapsTo")
    private final String mapsTo;

    /**
     * The attribute that is mapped to the attribute mapping
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMapsTo() {
        return mapsTo;
    }

    /**
     * Specifies if the attributes that is mapped should be hidden externally
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRtsaHideAttribute")
    private final Boolean idcsRtsaHideAttribute;

    /**
     * Specifies if the attributes that is mapped should be hidden externally
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsRtsaHideAttribute() {
        return idcsRtsaHideAttribute;
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
        sb.append("SchemaIdcsComplexAttributeNameMappings(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", mapsTo=").append(String.valueOf(this.mapsTo));
        sb.append(", idcsRtsaHideAttribute=").append(String.valueOf(this.idcsRtsaHideAttribute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaIdcsComplexAttributeNameMappings)) {
            return false;
        }

        SchemaIdcsComplexAttributeNameMappings other = (SchemaIdcsComplexAttributeNameMappings) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.mapsTo, other.mapsTo)
                && java.util.Objects.equals(this.idcsRtsaHideAttribute, other.idcsRtsaHideAttribute)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.mapsTo == null ? 43 : this.mapsTo.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRtsaHideAttribute == null
                                ? 43
                                : this.idcsRtsaHideAttribute.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
