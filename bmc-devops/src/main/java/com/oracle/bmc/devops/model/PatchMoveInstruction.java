/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * An operation that "puts" values from elsewhere in the target, functionally equivalent to a single
 * add and then a remove. The first item of the selection is replaced, or created if the selection
 * is empty. NOT_FOUND exceptions in the selection are handled by creating the implied containing
 * structure. This operation fails if the {@code from} selection yields any exceptions, or if an
 * item is moved to any of its descendants. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PatchMoveInstruction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchMoveInstruction extends PatchInstruction {
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
         * The selection that is to be moved, with the same format and semantics as {@code
         * selection}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("from")
        private String from;

        /**
         * The selection that is to be moved, with the same format and semantics as {@code
         * selection}.
         *
         * @param from the value to set
         * @return this builder
         */
        public Builder from(String from) {
            this.from = from;
            this.__explicitlySet__.add("from");
            return this;
        }
        /**
         * Where to insert the value in an array, relative to the first item in the selection. If
         * there is no such item, then "BEFORE" specifies insertion at the first position in an
         * array and "AFTER" specifies insertion at the last position. If the first item in the
         * selection is not the child of an array, then this field has no effect.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Position position;

        /**
         * Where to insert the value in an array, relative to the first item in the selection. If
         * there is no such item, then "BEFORE" specifies insertion at the first position in an
         * array and "AFTER" specifies insertion at the last position. If the first item in the
         * selection is not the child of an array, then this field has no effect.
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

        public PatchMoveInstruction build() {
            PatchMoveInstruction model =
                    new PatchMoveInstruction(this.selection, this.from, this.position);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchMoveInstruction model) {
            if (model.wasPropertyExplicitlySet("selection")) {
                this.selection(model.getSelection());
            }
            if (model.wasPropertyExplicitlySet("from")) {
                this.from(model.getFrom());
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
    public PatchMoveInstruction(String selection, String from, Position position) {
        super(selection);
        this.from = from;
        this.position = position;
    }

    /**
     * The selection that is to be moved, with the same format and semantics as {@code selection}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    private final String from;

    /**
     * The selection that is to be moved, with the same format and semantics as {@code selection}.
     *
     * @return the value
     */
    public String getFrom() {
        return from;
    }

    /**
     * Where to insert the value in an array, relative to the first item in the selection. If there
     * is no such item, then "BEFORE" specifies insertion at the first position in an array and
     * "AFTER" specifies insertion at the last position. If the first item in the selection is not
     * the child of an array, then this field has no effect.
     */
    public enum Position implements com.oracle.bmc.http.internal.BmcEnum {
        At("AT"),
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
     * Where to insert the value in an array, relative to the first item in the selection. If there
     * is no such item, then "BEFORE" specifies insertion at the first position in an array and
     * "AFTER" specifies insertion at the last position. If the first item in the selection is not
     * the child of an array, then this field has no effect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Position position;

    /**
     * Where to insert the value in an array, relative to the first item in the selection. If there
     * is no such item, then "BEFORE" specifies insertion at the first position in an array and
     * "AFTER" specifies insertion at the last position. If the first item in the selection is not
     * the child of an array, then this field has no effect.
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
        sb.append("PatchMoveInstruction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", from=").append(String.valueOf(this.from));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchMoveInstruction)) {
            return false;
        }

        PatchMoveInstruction other = (PatchMoveInstruction) o;
        return java.util.Objects.equals(this.from, other.from)
                && java.util.Objects.equals(this.position, other.position)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.from == null ? 43 : this.from.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        return result;
    }
}
