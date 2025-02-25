/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The list of mappings between the Identity Domain Group and the IDP group.
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
    builder = IdentityProviderJitUserProvGroupMappings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IdentityProviderJitUserProvGroupMappings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "idpGroup"})
    public IdentityProviderJitUserProvGroupMappings(String value, String ref, String idpGroup) {
        super();
        this.value = value;
        this.ref = ref;
        this.idpGroup = idpGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Domain Group
         * <p>
         **Added In:** 2205120021
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - idcsSearchable: true
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Domain Group
         * <p>
         **Added In:** 2205120021
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - idcsSearchable: true
         *  - type: string
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Group URI
         * <p>
         **Added In:** 2205120021
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: reference
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Group URI
         * <p>
         **Added In:** 2205120021
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: reference
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * IDP Group Name
         * <p>
         **Added In:** 2205120021
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idpGroup")
        private String idpGroup;

        /**
         * IDP Group Name
         * <p>
         **Added In:** 2205120021
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - type: string
         * @param idpGroup the value to set
         * @return this builder
         **/
        public Builder idpGroup(String idpGroup) {
            this.idpGroup = idpGroup;
            this.__explicitlySet__.add("idpGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityProviderJitUserProvGroupMappings build() {
            IdentityProviderJitUserProvGroupMappings model =
                    new IdentityProviderJitUserProvGroupMappings(
                            this.value, this.ref, this.idpGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityProviderJitUserProvGroupMappings model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("idpGroup")) {
                this.idpGroup(model.getIdpGroup());
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
     * Domain Group
     * <p>
     **Added In:** 2205120021
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - idcsSearchable: true
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Domain Group
     * <p>
     **Added In:** 2205120021
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - idcsSearchable: true
     *  - type: string
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Group URI
     * <p>
     **Added In:** 2205120021
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: reference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Group URI
     * <p>
     **Added In:** 2205120021
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: reference
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * IDP Group Name
     * <p>
     **Added In:** 2205120021
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpGroup")
    private final String idpGroup;

    /**
     * IDP Group Name
     * <p>
     **Added In:** 2205120021
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - type: string
     * @return the value
     **/
    public String getIdpGroup() {
        return idpGroup;
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
        sb.append("IdentityProviderJitUserProvGroupMappings(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", idpGroup=").append(String.valueOf(this.idpGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityProviderJitUserProvGroupMappings)) {
            return false;
        }

        IdentityProviderJitUserProvGroupMappings other =
                (IdentityProviderJitUserProvGroupMappings) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.idpGroup, other.idpGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.idpGroup == null ? 43 : this.idpGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
