/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * An attribute within a key, the attribute property is being deprecated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeyAttribute extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"position", "shapeField", "attribute"})
    public KeyAttribute(Integer position, ShapeField shapeField, ShapeField attribute) {
        super();
        this.position = position;
        this.shapeField = shapeField;
        this.attribute = attribute;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The position of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        /**
         * The position of the attribute.
         *
         * @param position the value to set
         * @return this builder
         */
        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeField")
        private ShapeField shapeField;

        public Builder shapeField(ShapeField shapeField) {
            this.shapeField = shapeField;
            this.__explicitlySet__.add("shapeField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attribute")
        private ShapeField attribute;

        public Builder attribute(ShapeField attribute) {
            this.attribute = attribute;
            this.__explicitlySet__.add("attribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyAttribute build() {
            KeyAttribute model = new KeyAttribute(this.position, this.shapeField, this.attribute);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyAttribute model) {
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("shapeField")) {
                this.shapeField(model.getShapeField());
            }
            if (model.wasPropertyExplicitlySet("attribute")) {
                this.attribute(model.getAttribute());
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

    /** The position of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    /**
     * The position of the attribute.
     *
     * @return the value
     */
    public Integer getPosition() {
        return position;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeField")
    private final ShapeField shapeField;

    public ShapeField getShapeField() {
        return shapeField;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("attribute")
    private final ShapeField attribute;

    public ShapeField getAttribute() {
        return attribute;
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
        sb.append("KeyAttribute(");
        sb.append("super=").append(super.toString());
        sb.append("position=").append(String.valueOf(this.position));
        sb.append(", shapeField=").append(String.valueOf(this.shapeField));
        sb.append(", attribute=").append(String.valueOf(this.attribute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyAttribute)) {
            return false;
        }

        KeyAttribute other = (KeyAttribute) o;
        return java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.shapeField, other.shapeField)
                && java.util.Objects.equals(this.attribute, other.attribute)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.shapeField == null ? 43 : this.shapeField.hashCode());
        result = (result * PRIME) + (this.attribute == null ? 43 : this.attribute.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
