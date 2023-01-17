/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Random Digits masking format generates random digits of length within a range. The length
 * range is defined by the startLength and endLength attributes. The start length must be less than
 * or equal to the end length. When masking columns with uniqueness constraint, ensure that the
 * length range is sufficient enough to generate unique values. This masking format pads to the
 * appropriate length in a string, but does not pad when used for a number column. It's a
 * complementary type of Random Number, which is not padded. <br>
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
        builder = RandomDigitsFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RandomDigitsFormatEntry extends FormatEntry {
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
         * The minimum number of digits the generated values should have. It can be any integer
         * greater than zero, but it must be less than or equal to the end length.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startLength")
        private Integer startLength;

        /**
         * The minimum number of digits the generated values should have. It can be any integer
         * greater than zero, but it must be less than or equal to the end length.
         *
         * @param startLength the value to set
         * @return this builder
         */
        public Builder startLength(Integer startLength) {
            this.startLength = startLength;
            this.__explicitlySet__.add("startLength");
            return this;
        }
        /**
         * The maximum number of digits the generated values should have. It can be any integer
         * greater than zero, but it must be greater than or equal to the start length.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endLength")
        private Integer endLength;

        /**
         * The maximum number of digits the generated values should have. It can be any integer
         * greater than zero, but it must be greater than or equal to the start length.
         *
         * @param endLength the value to set
         * @return this builder
         */
        public Builder endLength(Integer endLength) {
            this.endLength = endLength;
            this.__explicitlySet__.add("endLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RandomDigitsFormatEntry build() {
            RandomDigitsFormatEntry model =
                    new RandomDigitsFormatEntry(this.description, this.startLength, this.endLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RandomDigitsFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("startLength")) {
                this.startLength(model.getStartLength());
            }
            if (model.wasPropertyExplicitlySet("endLength")) {
                this.endLength(model.getEndLength());
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
    public RandomDigitsFormatEntry(String description, Integer startLength, Integer endLength) {
        super(description);
        this.startLength = startLength;
        this.endLength = endLength;
    }

    /**
     * The minimum number of digits the generated values should have. It can be any integer greater
     * than zero, but it must be less than or equal to the end length.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startLength")
    private final Integer startLength;

    /**
     * The minimum number of digits the generated values should have. It can be any integer greater
     * than zero, but it must be less than or equal to the end length.
     *
     * @return the value
     */
    public Integer getStartLength() {
        return startLength;
    }

    /**
     * The maximum number of digits the generated values should have. It can be any integer greater
     * than zero, but it must be greater than or equal to the start length.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endLength")
    private final Integer endLength;

    /**
     * The maximum number of digits the generated values should have. It can be any integer greater
     * than zero, but it must be greater than or equal to the start length.
     *
     * @return the value
     */
    public Integer getEndLength() {
        return endLength;
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
        sb.append("RandomDigitsFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", startLength=").append(String.valueOf(this.startLength));
        sb.append(", endLength=").append(String.valueOf(this.endLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RandomDigitsFormatEntry)) {
            return false;
        }

        RandomDigitsFormatEntry other = (RandomDigitsFormatEntry) o;
        return java.util.Objects.equals(this.startLength, other.startLength)
                && java.util.Objects.equals(this.endLength, other.endLength)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.startLength == null ? 43 : this.startLength.hashCode());
        result = (result * PRIME) + (this.endLength == null ? 43 : this.endLength.hashCode());
        return result;
    }
}
