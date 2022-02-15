/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A format entry is part of a masking format and defines the logic to mask data. A format
 * entry can be a basic masking format such as Random Number, or it can be a library masking
 * format. If a masking format has more than one format entries, the combined output of all
 * the format entries is used for masking.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = FormatEntry.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomStringFormatEntry.class,
        name = "RANDOM_STRING"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeterministicSubstitutionFormatEntry.class,
        name = "DETERMINISTIC_SUBSTITUTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeterministicEncryptionFormatEntry.class,
        name = "DETERMINISTIC_ENCRYPTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomDecimalNumberFormatEntry.class,
        name = "RANDOM_DECIMAL_NUMBER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomSubstitutionFormatEntry.class,
        name = "RANDOM_SUBSTITUTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PPFFormatEntry.class,
        name = "POST_PROCESSING_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NullValueFormatEntry.class,
        name = "NULL_VALUE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FixedNumberFormatEntry.class,
        name = "FIXED_NUMBER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RegularExpressionFormatEntry.class,
        name = "REGULAR_EXPRESSION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UDFFormatEntry.class,
        name = "USER_DEFINED_FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ShuffleFormatEntry.class,
        name = "SHUFFLE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FixedStringFormatEntry.class,
        name = "FIXED_STRING"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TruncateTableFormatEntry.class,
        name = "TRUNCATE_TABLE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LibraryMaskingFormatEntry.class,
        name = "LIBRARY_MASKING_FORMAT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SQLExpressionFormatEntry.class,
        name = "SQL_EXPRESSION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeterministicEncryptionDateFormatEntry.class,
        name = "DETERMINISTIC_ENCRYPTION_DATE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomDigitsFormatEntry.class,
        name = "RANDOM_DIGITS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DeleteRowsFormatEntry.class,
        name = "DELETE_ROWS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SubstringFormatEntry.class,
        name = "SUBSTRING"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomNumberFormatEntry.class,
        name = "RANDOM_NUMBER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PreserveOriginalDataFormatEntry.class,
        name = "PRESERVE_ORIGINAL_DATA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomDateFormatEntry.class,
        name = "RANDOM_DATE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RandomListFormatEntry.class,
        name = "RANDOM_LIST"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FormatEntry {

    /**
     * The description of the format entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
}
