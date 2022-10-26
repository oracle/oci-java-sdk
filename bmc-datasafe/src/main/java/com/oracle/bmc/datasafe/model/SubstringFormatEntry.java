/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Substring masking format extracts a portion of the original column value and uses it to
 * replace the original value. It internally uses the Oracle SUBSTR function. It takes the start
 * position and length as input, extracts substring from the original value using SUBSTR, and uses
 * the substring to replace the original value. To learn more, check Substring in the Data Safe
 * documentation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubstringFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SubstringFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The starting position in the original string from where the substring should be
         * extracted. It can be either a positive or a negative integer. If It's negative, the
         * counting starts from the end of the string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startPosition")
        private Integer startPosition;

        /**
         * The starting position in the original string from where the substring should be
         * extracted. It can be either a positive or a negative integer. If It's negative, the
         * counting starts from the end of the string.
         *
         * @param startPosition the value to set
         * @return this builder
         */
        public Builder startPosition(Integer startPosition) {
            this.startPosition = startPosition;
            this.__explicitlySet__.add("startPosition");
            return this;
        }
        /**
         * The number of characters that should be there in the substring. It should be an integer
         * and greater than zero.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * The number of characters that should be there in the substring. It should be an integer
         * and greater than zero.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubstringFormatEntry build() {
            SubstringFormatEntry model =
                    new SubstringFormatEntry(this.description, this.startPosition, this.length);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubstringFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("startPosition")) {
                this.startPosition(model.getStartPosition());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
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
    public SubstringFormatEntry(String description, Integer startPosition, Integer length) {
        super(description);
        this.startPosition = startPosition;
        this.length = length;
    }

    /**
     * The starting position in the original string from where the substring should be extracted. It
     * can be either a positive or a negative integer. If It's negative, the counting starts from
     * the end of the string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startPosition")
    private final Integer startPosition;

    /**
     * The starting position in the original string from where the substring should be extracted. It
     * can be either a positive or a negative integer. If It's negative, the counting starts from
     * the end of the string.
     *
     * @return the value
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    /**
     * The number of characters that should be there in the substring. It should be an integer and
     * greater than zero.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * The number of characters that should be there in the substring. It should be an integer and
     * greater than zero.
     *
     * @return the value
     */
    public Integer getLength() {
        return length;
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
        sb.append("SubstringFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", startPosition=").append(String.valueOf(this.startPosition));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubstringFormatEntry)) {
            return false;
        }

        SubstringFormatEntry other = (SubstringFormatEntry) o;
        return java.util.Objects.equals(this.startPosition, other.startPosition)
                && java.util.Objects.equals(this.length, other.length)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.startPosition == null ? 43 : this.startPosition.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        return result;
    }
}
