/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Fixed String masking format uses a constant string for masking. To learn
 * more, check Fixed String in the Data Safe documentation.
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
    builder = FixedStringFormatEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FixedStringFormatEntry extends FormatEntry {
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
         * The constant string to be used for masking.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fixedString")
        private String fixedString;

        /**
         * The constant string to be used for masking.
         * @param fixedString the value to set
         * @return this builder
         **/
        public Builder fixedString(String fixedString) {
            this.fixedString = fixedString;
            this.__explicitlySet__.add("fixedString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedStringFormatEntry build() {
            FixedStringFormatEntry model =
                    new FixedStringFormatEntry(this.description, this.fixedString);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedStringFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("fixedString")) {
                this.fixedString(model.getFixedString());
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
    public FixedStringFormatEntry(String description, String fixedString) {
        super(description);
        this.fixedString = fixedString;
    }

    /**
     * The constant string to be used for masking.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fixedString")
    private final String fixedString;

    /**
     * The constant string to be used for masking.
     * @return the value
     **/
    public String getFixedString() {
        return fixedString;
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
        sb.append("FixedStringFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fixedString=").append(String.valueOf(this.fixedString));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FixedStringFormatEntry)) {
            return false;
        }

        FixedStringFormatEntry other = (FixedStringFormatEntry) o;
        return java.util.Objects.equals(this.fixedString, other.fixedString) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fixedString == null ? 43 : this.fixedString.hashCode());
        return result;
    }
}
