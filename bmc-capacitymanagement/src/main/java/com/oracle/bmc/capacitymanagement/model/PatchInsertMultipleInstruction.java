/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * An operation that inserts multiple consecutive values into an array, shifting array items as
 * necessary and handling NOT_FOUND exceptions by creating the implied containing structure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchInsertMultipleInstruction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchInsertMultipleInstruction extends PatchInstruction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("selection")
        private String selection;

        public Builder selection(String selection) {
            this.selection = selection;
            this.__explicitlySet__.add("selection");
            return this;
        }
        /** A list of consecutive values to be inserted into the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Object> values;

        /**
         * A list of consecutive values to be inserted into the target.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<Object> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /**
         * A selection to be evaluated against the array for identifying a particular reference item
         * within it, with the same format and semantics as {@code selection}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("selectedItem")
        private String selectedItem;

        /**
         * A selection to be evaluated against the array for identifying a particular reference item
         * within it, with the same format and semantics as {@code selection}.
         *
         * @param selectedItem the value to set
         * @return this builder
         */
        public Builder selectedItem(String selectedItem) {
            this.selectedItem = selectedItem;
            this.__explicitlySet__.add("selectedItem");
            return this;
        }
        /**
         * Where to insert the values, relative to the first item matched by {@code selectedItem}.
         * If {@code selectedItem} is unspecified, then "BEFORE" specifies insertion at the first
         * position in an array and "AFTER" specifies insertion at the last position. If {@code
         * selectedItem} is specified but results in an empty selection, then both values specify
         * insertion at the last position.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Position position;

        /**
         * Where to insert the values, relative to the first item matched by {@code selectedItem}.
         * If {@code selectedItem} is unspecified, then "BEFORE" specifies insertion at the first
         * position in an array and "AFTER" specifies insertion at the last position. If {@code
         * selectedItem} is specified but results in an empty selection, then both values specify
         * insertion at the last position.
         *
         * @param position the value to set
         * @return this builder
         */
        public Builder position(Position position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchInsertMultipleInstruction build() {
            PatchInsertMultipleInstruction model =
                    new PatchInsertMultipleInstruction(
                            this.selection, this.values, this.selectedItem, this.position);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchInsertMultipleInstruction model) {
            if (model.wasPropertyExplicitlySet("selection")) {
                this.selection(model.getSelection());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("selectedItem")) {
                this.selectedItem(model.getSelectedItem());
            }
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
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

    @Deprecated
    public PatchInsertMultipleInstruction(
            String selection,
            java.util.List<Object> values,
            String selectedItem,
            Position position) {
        super(selection);
        this.values = values;
        this.selectedItem = selectedItem;
        this.position = position;
    }

    /** A list of consecutive values to be inserted into the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Object> values;

    /**
     * A list of consecutive values to be inserted into the target.
     *
     * @return the value
     */
    public java.util.List<Object> getValues() {
        return values;
    }

    /**
     * A selection to be evaluated against the array for identifying a particular reference item
     * within it, with the same format and semantics as {@code selection}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selectedItem")
    private final String selectedItem;

    /**
     * A selection to be evaluated against the array for identifying a particular reference item
     * within it, with the same format and semantics as {@code selection}.
     *
     * @return the value
     */
    public String getSelectedItem() {
        return selectedItem;
    }

    /**
     * Where to insert the values, relative to the first item matched by {@code selectedItem}. If
     * {@code selectedItem} is unspecified, then "BEFORE" specifies insertion at the first position
     * in an array and "AFTER" specifies insertion at the last position. If {@code selectedItem} is
     * specified but results in an empty selection, then both values specify insertion at the last
     * position.
     */
    public enum Position implements com.oracle.bmc.http.internal.BmcEnum {
        Before("BEFORE"),
        After("AFTER"),
        ;

        private final String value;
        private static java.util.Map<String, Position> map;

        static {
            map = new java.util.HashMap<>();
            for (Position v : Position.values()) {
                map.put(v.getValue(), v);
            }
        }

        Position(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Position create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Position: " + key);
        }
    };
    /**
     * Where to insert the values, relative to the first item matched by {@code selectedItem}. If
     * {@code selectedItem} is unspecified, then "BEFORE" specifies insertion at the first position
     * in an array and "AFTER" specifies insertion at the last position. If {@code selectedItem} is
     * specified but results in an empty selection, then both values specify insertion at the last
     * position.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Position position;

    /**
     * Where to insert the values, relative to the first item matched by {@code selectedItem}. If
     * {@code selectedItem} is unspecified, then "BEFORE" specifies insertion at the first position
     * in an array and "AFTER" specifies insertion at the last position. If {@code selectedItem} is
     * specified but results in an empty selection, then both values specify insertion at the last
     * position.
     *
     * @return the value
     */
    public Position getPosition() {
        return position;
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
        sb.append("PatchInsertMultipleInstruction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", selectedItem=").append(String.valueOf(this.selectedItem));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchInsertMultipleInstruction)) {
            return false;
        }

        PatchInsertMultipleInstruction other = (PatchInsertMultipleInstruction) o;
        return java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.selectedItem, other.selectedItem)
                && java.util.Objects.equals(this.position, other.position)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.selectedItem == null ? 43 : this.selectedItem.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        return result;
    }
}
