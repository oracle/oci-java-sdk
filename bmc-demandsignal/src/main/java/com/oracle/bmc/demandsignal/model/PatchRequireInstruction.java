/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.model;

/**
 * A precondition operation that requires a selection to be non-empty, and optionally to include an item with a specified value
 * (useful for asserting that a value exists before attempting to update it, avoiding accidental creation).
 * It fails if the selection is empty, or if value is provided and no item of the selection matches it.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PatchRequireInstruction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchRequireInstruction extends PatchInstruction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("selection")
        private String selection;

        public Builder selection(String selection) {
            this.selection = selection;
            this.__explicitlySet__.add("selection");
            return this;
        }
        /**
         * A value to be compared against each item of the selection.
         * If this value is an object, then it matches any item that would be unaffected by applying this value as a merge operation.
         * Otherwise, it matches any item to which it is equal according to the rules of [JSON Schema](https://tools.ietf.org/html/draft-handrews-json-schema-00#section-4.2.3).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Object value;

        /**
         * A value to be compared against each item of the selection.
         * If this value is an object, then it matches any item that would be unaffected by applying this value as a merge operation.
         * Otherwise, it matches any item to which it is equal according to the rules of [JSON Schema](https://tools.ietf.org/html/draft-handrews-json-schema-00#section-4.2.3).
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Object value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchRequireInstruction build() {
            PatchRequireInstruction model = new PatchRequireInstruction(this.selection, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchRequireInstruction model) {
            if (model.wasPropertyExplicitlySet("selection")) {
                this.selection(model.getSelection());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    @Deprecated
    public PatchRequireInstruction(String selection, Object value) {
        super(selection);
        this.value = value;
    }

    /**
     * A value to be compared against each item of the selection.
     * If this value is an object, then it matches any item that would be unaffected by applying this value as a merge operation.
     * Otherwise, it matches any item to which it is equal according to the rules of [JSON Schema](https://tools.ietf.org/html/draft-handrews-json-schema-00#section-4.2.3).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Object value;

    /**
     * A value to be compared against each item of the selection.
     * If this value is an object, then it matches any item that would be unaffected by applying this value as a merge operation.
     * Otherwise, it matches any item to which it is equal according to the rules of [JSON Schema](https://tools.ietf.org/html/draft-handrews-json-schema-00#section-4.2.3).
     *
     * @return the value
     **/
    public Object getValue() {
        return value;
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
        sb.append("PatchRequireInstruction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchRequireInstruction)) {
            return false;
        }

        PatchRequireInstruction other = (PatchRequireInstruction) o;
        return java.util.Objects.equals(this.value, other.value) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
