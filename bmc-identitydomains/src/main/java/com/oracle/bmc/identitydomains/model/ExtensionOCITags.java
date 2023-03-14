/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * OCI Tags. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExtensionOCITags.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExtensionOCITags
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"freeformTags", "definedTags", "tagSlug"})
    public ExtensionOCITags(
            java.util.List<FreeformTags> freeformTags,
            java.util.List<DefinedTags> definedTags,
            Object tagSlug) {
        super();
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.tagSlug = tagSlug;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCI Freeform Tags
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true - type:
         * complex - required: false - mutability: readWrite - returned: default - multiValued: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.List<FreeformTags> freeformTags;

        /**
         * OCI Freeform Tags
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true - type:
         * complex - required: false - mutability: readWrite - returned: default - multiValued: true
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.List<FreeformTags> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * OCI Defined Tags
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [namespace, key, value] - type: complex -
         * idcsSearchable: true - required: false - mutability: readWrite - multiValued: true -
         * returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.List<DefinedTags> definedTags;

        /**
         * OCI Defined Tags
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [namespace, key, value] - type: complex -
         * idcsSearchable: true - required: false - mutability: readWrite - multiValued: true -
         * returned: default
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(java.util.List<DefinedTags> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * OCI Tag slug
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - type: binary - mutability: readOnly - returned: request
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tagSlug")
        private Object tagSlug;

        /**
         * OCI Tag slug
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - type: binary - mutability: readOnly - returned: request
         *
         * @param tagSlug the value to set
         * @return this builder
         */
        public Builder tagSlug(Object tagSlug) {
            this.tagSlug = tagSlug;
            this.__explicitlySet__.add("tagSlug");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionOCITags build() {
            ExtensionOCITags model =
                    new ExtensionOCITags(this.freeformTags, this.definedTags, this.tagSlug);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionOCITags model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("tagSlug")) {
                this.tagSlug(model.getTagSlug());
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
     * OCI Freeform Tags
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true - type:
     * complex - required: false - mutability: readWrite - returned: default - multiValued: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.List<FreeformTags> freeformTags;

    /**
     * OCI Freeform Tags
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true - type:
     * complex - required: false - mutability: readWrite - returned: default - multiValued: true
     *
     * @return the value
     */
    public java.util.List<FreeformTags> getFreeformTags() {
        return freeformTags;
    }

    /**
     * OCI Defined Tags
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [namespace, key, value] - type: complex -
     * idcsSearchable: true - required: false - mutability: readWrite - multiValued: true -
     * returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.List<DefinedTags> definedTags;

    /**
     * OCI Defined Tags
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [namespace, key, value] - type: complex -
     * idcsSearchable: true - required: false - mutability: readWrite - multiValued: true -
     * returned: default
     *
     * @return the value
     */
    public java.util.List<DefinedTags> getDefinedTags() {
        return definedTags;
    }

    /**
     * OCI Tag slug
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - type: binary - mutability: readOnly - returned: request
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tagSlug")
    private final Object tagSlug;

    /**
     * OCI Tag slug
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - type: binary - mutability: readOnly - returned: request
     *
     * @return the value
     */
    public Object getTagSlug() {
        return tagSlug;
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
        sb.append("ExtensionOCITags(");
        sb.append("super=").append(super.toString());
        sb.append("freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", tagSlug=").append(String.valueOf(this.tagSlug));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionOCITags)) {
            return false;
        }

        ExtensionOCITags other = (ExtensionOCITags) o;
        return java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.tagSlug, other.tagSlug)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.tagSlug == null ? 43 : this.tagSlug.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
