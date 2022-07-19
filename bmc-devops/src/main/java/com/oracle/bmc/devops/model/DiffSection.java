/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about a section of changes within a difference chunk.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiffSection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiffSection {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "lines"})
    public DiffSection(String type, java.util.List<DiffLineDetails> lines) {
        super();
        this.type = type;
        this.lines = lines;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of change.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of change.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The lines within changed section.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<DiffLineDetails> lines;

        /**
         * The lines within changed section.
         * @param lines the value to set
         * @return this builder
         **/
        public Builder lines(java.util.List<DiffLineDetails> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiffSection build() {
            DiffSection __instance__ = new DiffSection(type, lines);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiffSection o) {
            Builder copiedBuilder = type(o.getType()).lines(o.getLines());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Type of change.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of change.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * The lines within changed section.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    private final java.util.List<DiffLineDetails> lines;

    /**
     * The lines within changed section.
     * @return the value
     **/
    public java.util.List<DiffLineDetails> getLines() {
        return lines;
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
        sb.append("DiffSection(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", lines=").append(String.valueOf(this.lines));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiffSection)) {
            return false;
        }

        DiffSection other = (DiffSection) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lines, other.lines)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.lines == null ? 43 : this.lines.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
