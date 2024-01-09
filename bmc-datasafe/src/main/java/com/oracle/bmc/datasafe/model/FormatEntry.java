/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A format entry is part of a masking format and defines the logic to mask data. A format entry can
 * be a basic masking format such as Random Number, or it can be a library masking format. If a
 * masking format has more than one format entries, the combined output of all the format entries is
 * used for masking. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = FormatEntry.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomStringFormatEntry.class,
            name = "RANDOM_STRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeterministicSubstitutionFormatEntry.class,
            name = "DETERMINISTIC_SUBSTITUTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeterministicEncryptionFormatEntry.class,
            name = "DETERMINISTIC_ENCRYPTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomDecimalNumberFormatEntry.class,
            name = "RANDOM_DECIMAL_NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomSubstitutionFormatEntry.class,
            name = "RANDOM_SUBSTITUTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PPFFormatEntry.class,
            name = "POST_PROCESSING_FUNCTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NullValueFormatEntry.class,
            name = "NULL_VALUE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FixedNumberFormatEntry.class,
            name = "FIXED_NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RegularExpressionFormatEntry.class,
            name = "REGULAR_EXPRESSION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UDFFormatEntry.class,
            name = "USER_DEFINED_FUNCTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ShuffleFormatEntry.class,
            name = "SHUFFLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FixedStringFormatEntry.class,
            name = "FIXED_STRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TruncateTableFormatEntry.class,
            name = "TRUNCATE_TABLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LibraryMaskingFormatEntry.class,
            name = "LIBRARY_MASKING_FORMAT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SQLExpressionFormatEntry.class,
            name = "SQL_EXPRESSION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeterministicEncryptionDateFormatEntry.class,
            name = "DETERMINISTIC_ENCRYPTION_DATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomDigitsFormatEntry.class,
            name = "RANDOM_DIGITS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DeleteRowsFormatEntry.class,
            name = "DELETE_ROWS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SubstringFormatEntry.class,
            name = "SUBSTRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PatternFormatEntry.class,
            name = "PATTERN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomNumberFormatEntry.class,
            name = "RANDOM_NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreserveOriginalDataFormatEntry.class,
            name = "PRESERVE_ORIGINAL_DATA"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomDateFormatEntry.class,
            name = "RANDOM_DATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RandomListFormatEntry.class,
            name = "RANDOM_LIST")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class FormatEntry extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description"})
    protected FormatEntry(String description) {
        super();
        this.description = description;
    }

    /** The description of the format entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the format entry.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("FormatEntry(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormatEntry)) {
            return false;
        }

        FormatEntry other = (FormatEntry) o;
        return java.util.Objects.equals(this.description, other.description) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
