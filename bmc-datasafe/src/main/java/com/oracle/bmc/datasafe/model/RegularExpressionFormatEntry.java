/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Regular Expression masking format gives the flexibility to use regular expressions to search
 * for sensitive data in a column of Large Object data type (LOB), and replace the data with a fixed
 * string, fixed number, null value, or SQL expression. It can also be used for columns of VARCHAR2
 * type to mask parts of strings. To learn more, check Regular Expressions in the Data Safe
 * documentation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RegularExpressionFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RegularExpressionFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The pattern that should be used to search for data. */
        @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
        private String regularExpression;

        /**
         * The pattern that should be used to search for data.
         *
         * @param regularExpression the value to set
         * @return this builder
         */
        public Builder regularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            this.__explicitlySet__.add("regularExpression");
            return this;
        }
        /**
         * The value that should be used to replace the data matching the regular expression. It can
         * be a fixed string, fixed number or null value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replaceWith")
        private String replaceWith;

        /**
         * The value that should be used to replace the data matching the regular expression. It can
         * be a fixed string, fixed number or null value.
         *
         * @param replaceWith the value to set
         * @return this builder
         */
        public Builder replaceWith(String replaceWith) {
            this.replaceWith = replaceWith;
            this.__explicitlySet__.add("replaceWith");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegularExpressionFormatEntry build() {
            RegularExpressionFormatEntry model =
                    new RegularExpressionFormatEntry(
                            this.description, this.regularExpression, this.replaceWith);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegularExpressionFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("regularExpression")) {
                this.regularExpression(model.getRegularExpression());
            }
            if (model.wasPropertyExplicitlySet("replaceWith")) {
                this.replaceWith(model.getReplaceWith());
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
    public RegularExpressionFormatEntry(
            String description, String regularExpression, String replaceWith) {
        super(description);
        this.regularExpression = regularExpression;
        this.replaceWith = replaceWith;
    }

    /** The pattern that should be used to search for data. */
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    private final String regularExpression;

    /**
     * The pattern that should be used to search for data.
     *
     * @return the value
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * The value that should be used to replace the data matching the regular expression. It can be
     * a fixed string, fixed number or null value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaceWith")
    private final String replaceWith;

    /**
     * The value that should be used to replace the data matching the regular expression. It can be
     * a fixed string, fixed number or null value.
     *
     * @return the value
     */
    public String getReplaceWith() {
        return replaceWith;
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
        sb.append("RegularExpressionFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", regularExpression=").append(String.valueOf(this.regularExpression));
        sb.append(", replaceWith=").append(String.valueOf(this.replaceWith));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegularExpressionFormatEntry)) {
            return false;
        }

        RegularExpressionFormatEntry other = (RegularExpressionFormatEntry) o;
        return java.util.Objects.equals(this.regularExpression, other.regularExpression)
                && java.util.Objects.equals(this.replaceWith, other.replaceWith)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.regularExpression == null ? 43 : this.regularExpression.hashCode());
        result = (result * PRIME) + (this.replaceWith == null ? 43 : this.replaceWith.hashCode());
        return result;
    }
}
