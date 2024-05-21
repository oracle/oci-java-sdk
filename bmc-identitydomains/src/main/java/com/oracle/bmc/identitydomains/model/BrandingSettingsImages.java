/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * References to various images
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
    builder = BrandingSettingsImages.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BrandingSettingsImages
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "type", "display"})
    public BrandingSettingsImages(String value, String type, String display) {
        super();
        this.value = value;
        this.type = type;
        this.display = display;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Image URI
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: reference
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Image URI
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: reference
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Indicates the image type
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Indicates the image type
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: true
         *  - returned: default
         *  - type: string
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * A human-readable name, primarily used for display purposes
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * A human-readable name, primarily used for display purposes
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param display the value to set
         * @return this builder
         **/
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BrandingSettingsImages build() {
            BrandingSettingsImages model =
                    new BrandingSettingsImages(this.value, this.type, this.display);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BrandingSettingsImages model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
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
     * Image URI
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: reference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Image URI
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: reference
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Indicates the image type
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Indicates the image type
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: true
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * A human-readable name, primarily used for display purposes
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * A human-readable name, primarily used for display purposes
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getDisplay() {
        return display;
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
        sb.append("BrandingSettingsImages(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BrandingSettingsImages)) {
            return false;
        }

        BrandingSettingsImages other = (BrandingSettingsImages) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.display, other.display)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
