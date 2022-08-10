/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Random Number masking format generates random and unique integers within
 * a range. The range is defined by the startValue and endValue attributes. The
 * start value must be less than or equal to the end value. When masking columns
 * with uniqueness constraint, ensure that the range is sufficient enough to
 * generate unique values. To learn more, check Random Number in the Data Safe
 * documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RandomNumberFormatEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RandomNumberFormatEntry extends FormatEntry {
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
         * The lower bound of the range within which random numbers should be
         * generated. It must be less than or equal to the end value. It
         * supports input of long type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startValue")
        private Long startValue;

        /**
         * The lower bound of the range within which random numbers should be
         * generated. It must be less than or equal to the end value. It
         * supports input of long type.
         *
         * @param startValue the value to set
         * @return this builder
         **/
        public Builder startValue(Long startValue) {
            this.startValue = startValue;
            this.__explicitlySet__.add("startValue");
            return this;
        }
        /**
         * The upper bound of the range within which random numbers should be
         * generated. It must be greater than or equal to the start value.
         * It supports input of long type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endValue")
        private Long endValue;

        /**
         * The upper bound of the range within which random numbers should be
         * generated. It must be greater than or equal to the start value.
         * It supports input of long type.
         *
         * @param endValue the value to set
         * @return this builder
         **/
        public Builder endValue(Long endValue) {
            this.endValue = endValue;
            this.__explicitlySet__.add("endValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RandomNumberFormatEntry build() {
            RandomNumberFormatEntry model =
                    new RandomNumberFormatEntry(this.description, this.startValue, this.endValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RandomNumberFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("startValue")) {
                this.startValue(model.getStartValue());
            }
            if (model.wasPropertyExplicitlySet("endValue")) {
                this.endValue(model.getEndValue());
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
    public RandomNumberFormatEntry(String description, Long startValue, Long endValue) {
        super(description);
        this.startValue = startValue;
        this.endValue = endValue;
    }

    /**
     * The lower bound of the range within which random numbers should be
     * generated. It must be less than or equal to the end value. It
     * supports input of long type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startValue")
    private final Long startValue;

    /**
     * The lower bound of the range within which random numbers should be
     * generated. It must be less than or equal to the end value. It
     * supports input of long type.
     *
     * @return the value
     **/
    public Long getStartValue() {
        return startValue;
    }

    /**
     * The upper bound of the range within which random numbers should be
     * generated. It must be greater than or equal to the start value.
     * It supports input of long type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endValue")
    private final Long endValue;

    /**
     * The upper bound of the range within which random numbers should be
     * generated. It must be greater than or equal to the start value.
     * It supports input of long type.
     *
     * @return the value
     **/
    public Long getEndValue() {
        return endValue;
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
        sb.append("RandomNumberFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", startValue=").append(String.valueOf(this.startValue));
        sb.append(", endValue=").append(String.valueOf(this.endValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RandomNumberFormatEntry)) {
            return false;
        }

        RandomNumberFormatEntry other = (RandomNumberFormatEntry) o;
        return java.util.Objects.equals(this.startValue, other.startValue)
                && java.util.Objects.equals(this.endValue, other.endValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.startValue == null ? 43 : this.startValue.hashCode());
        result = (result * PRIME) + (this.endValue == null ? 43 : this.endValue.hashCode());
        return result;
    }
}
