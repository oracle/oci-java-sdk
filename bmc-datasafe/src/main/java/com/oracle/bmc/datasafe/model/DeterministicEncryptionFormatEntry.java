/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Deterministic Encryption masking format encrypts column data using a cryptographic key and
 * Advanced Encryption Standard (AES 128). It can be used to encrypt character and number columns.
 * It can encrypt ASCII data without any input (except seed value), but it needs a regular
 * expression to encrypt non-ASCII data.
 *
 * <p>Deterministic Encryption is a format-preserving, deterministic and reversible masking format,
 * which requires a seed value while submitting a masking work request. Passing the same seed value
 * when masking multiple times or masking different databases ensures that the data is masked
 * deterministically. To learn more, check Deterministic Encryption in the Data Safe documentation.
 * <br>
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
        builder = DeterministicEncryptionFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DeterministicEncryptionFormatEntry extends FormatEntry {
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
         * The regular expression to be used for masking. For data with characters in the ASCII
         * character set, providing a regular expression is optional. However, it is required if the
         * data contains multi-byte characters. If not provided, an error is returned when a
         * multi-byte character is found.
         *
         * <p>In the case of ASCII characters, if a regular expression is not provided,
         * Deterministic Encryption can encrypt variable-length column values while preserving their
         * original format.
         *
         * <p>If a regular expression is provided, the column values in all the rows must match the
         * regular expression. Deterministic Encryption supports a subset of the regular expression
         * language. It supports encryption of fixed-length strings, and does not support * or +
         * syntax of regular expressions. The encrypted values also match the regular expression,
         * which helps to ensure that the original format is preserved. If an original value does
         * not match the regular expression, Deterministic Encryption might not produce a one-to-one
         * mapping. All non-confirming values are mapped to a single encrypted value, thereby
         * producing a many-to-one mapping.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
        private String regularExpression;

        /**
         * The regular expression to be used for masking. For data with characters in the ASCII
         * character set, providing a regular expression is optional. However, it is required if the
         * data contains multi-byte characters. If not provided, an error is returned when a
         * multi-byte character is found.
         *
         * <p>In the case of ASCII characters, if a regular expression is not provided,
         * Deterministic Encryption can encrypt variable-length column values while preserving their
         * original format.
         *
         * <p>If a regular expression is provided, the column values in all the rows must match the
         * regular expression. Deterministic Encryption supports a subset of the regular expression
         * language. It supports encryption of fixed-length strings, and does not support * or +
         * syntax of regular expressions. The encrypted values also match the regular expression,
         * which helps to ensure that the original format is preserved. If an original value does
         * not match the regular expression, Deterministic Encryption might not produce a one-to-one
         * mapping. All non-confirming values are mapped to a single encrypted value, thereby
         * producing a many-to-one mapping.
         *
         * @param regularExpression the value to set
         * @return this builder
         */
        public Builder regularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            this.__explicitlySet__.add("regularExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeterministicEncryptionFormatEntry build() {
            DeterministicEncryptionFormatEntry model =
                    new DeterministicEncryptionFormatEntry(
                            this.description, this.regularExpression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeterministicEncryptionFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("regularExpression")) {
                this.regularExpression(model.getRegularExpression());
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
    public DeterministicEncryptionFormatEntry(String description, String regularExpression) {
        super(description);
        this.regularExpression = regularExpression;
    }

    /**
     * The regular expression to be used for masking. For data with characters in the ASCII
     * character set, providing a regular expression is optional. However, it is required if the
     * data contains multi-byte characters. If not provided, an error is returned when a multi-byte
     * character is found.
     *
     * <p>In the case of ASCII characters, if a regular expression is not provided, Deterministic
     * Encryption can encrypt variable-length column values while preserving their original format.
     *
     * <p>If a regular expression is provided, the column values in all the rows must match the
     * regular expression. Deterministic Encryption supports a subset of the regular expression
     * language. It supports encryption of fixed-length strings, and does not support * or + syntax
     * of regular expressions. The encrypted values also match the regular expression, which helps
     * to ensure that the original format is preserved. If an original value does not match the
     * regular expression, Deterministic Encryption might not produce a one-to-one mapping. All
     * non-confirming values are mapped to a single encrypted value, thereby producing a many-to-one
     * mapping.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    private final String regularExpression;

    /**
     * The regular expression to be used for masking. For data with characters in the ASCII
     * character set, providing a regular expression is optional. However, it is required if the
     * data contains multi-byte characters. If not provided, an error is returned when a multi-byte
     * character is found.
     *
     * <p>In the case of ASCII characters, if a regular expression is not provided, Deterministic
     * Encryption can encrypt variable-length column values while preserving their original format.
     *
     * <p>If a regular expression is provided, the column values in all the rows must match the
     * regular expression. Deterministic Encryption supports a subset of the regular expression
     * language. It supports encryption of fixed-length strings, and does not support * or + syntax
     * of regular expressions. The encrypted values also match the regular expression, which helps
     * to ensure that the original format is preserved. If an original value does not match the
     * regular expression, Deterministic Encryption might not produce a one-to-one mapping. All
     * non-confirming values are mapped to a single encrypted value, thereby producing a many-to-one
     * mapping.
     *
     * @return the value
     */
    public String getRegularExpression() {
        return regularExpression;
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
        sb.append("DeterministicEncryptionFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", regularExpression=").append(String.valueOf(this.regularExpression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeterministicEncryptionFormatEntry)) {
            return false;
        }

        DeterministicEncryptionFormatEntry other = (DeterministicEncryptionFormatEntry) o;
        return java.util.Objects.equals(this.regularExpression, other.regularExpression)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.regularExpression == null ? 43 : this.regularExpression.hashCode());
        return result;
    }
}
