/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Fixed Number masking format uses a constant number for masking. To learn more, check Fixed
 * Number in the Data Safe documentation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FixedNumberFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FixedNumberFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The constant number to be used for masking. */
        @com.fasterxml.jackson.annotation.JsonProperty("fixedNumber")
        private java.math.BigDecimal fixedNumber;

        /**
         * The constant number to be used for masking.
         *
         * @param fixedNumber the value to set
         * @return this builder
         */
        public Builder fixedNumber(java.math.BigDecimal fixedNumber) {
            this.fixedNumber = fixedNumber;
            this.__explicitlySet__.add("fixedNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedNumberFormatEntry build() {
            FixedNumberFormatEntry model =
                    new FixedNumberFormatEntry(this.description, this.fixedNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedNumberFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("fixedNumber")) {
                this.fixedNumber(model.getFixedNumber());
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
    public FixedNumberFormatEntry(String description, java.math.BigDecimal fixedNumber) {
        super(description);
        this.fixedNumber = fixedNumber;
    }

    /** The constant number to be used for masking. */
    @com.fasterxml.jackson.annotation.JsonProperty("fixedNumber")
    private final java.math.BigDecimal fixedNumber;

    /**
     * The constant number to be used for masking.
     *
     * @return the value
     */
    public java.math.BigDecimal getFixedNumber() {
        return fixedNumber;
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
        sb.append("FixedNumberFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fixedNumber=").append(String.valueOf(this.fixedNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FixedNumberFormatEntry)) {
            return false;
        }

        FixedNumberFormatEntry other = (FixedNumberFormatEntry) o;
        return java.util.Objects.equals(this.fixedNumber, other.fixedNumber) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fixedNumber == null ? 43 : this.fixedNumber.hashCode());
        return result;
    }
}
