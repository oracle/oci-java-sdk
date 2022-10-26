/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/** The type of the format entry. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public enum FormatEntryType implements com.oracle.bmc.http.internal.BmcEnum {
    DeleteRows("DELETE_ROWS"),
    DeterministicSubstitution("DETERMINISTIC_SUBSTITUTION"),
    DeterministicEncryption("DETERMINISTIC_ENCRYPTION"),
    DeterministicEncryptionDate("DETERMINISTIC_ENCRYPTION_DATE"),
    FixedNumber("FIXED_NUMBER"),
    FixedString("FIXED_STRING"),
    LibraryMaskingFormat("LIBRARY_MASKING_FORMAT"),
    NullValue("NULL_VALUE"),
    PostProcessingFunction("POST_PROCESSING_FUNCTION"),
    PreserveOriginalData("PRESERVE_ORIGINAL_DATA"),
    RandomDate("RANDOM_DATE"),
    RandomDecimalNumber("RANDOM_DECIMAL_NUMBER"),
    RandomDigits("RANDOM_DIGITS"),
    RandomList("RANDOM_LIST"),
    RandomNumber("RANDOM_NUMBER"),
    RandomString("RANDOM_STRING"),
    RandomSubstitution("RANDOM_SUBSTITUTION"),
    RegularExpression("REGULAR_EXPRESSION"),
    Shuffle("SHUFFLE"),
    SqlExpression("SQL_EXPRESSION"),
    Substring("SUBSTRING"),
    TruncateTable("TRUNCATE_TABLE"),
    UserDefinedFunction("USER_DEFINED_FUNCTION"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FormatEntryType.class);

    private final String value;
    private static java.util.Map<String, FormatEntryType> map;

    static {
        map = new java.util.HashMap<>();
        for (FormatEntryType v : FormatEntryType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    FormatEntryType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static FormatEntryType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'FormatEntryType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
