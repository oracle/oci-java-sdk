/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Deterministic Encryption (Date) masking format encrypts column data using a cryptographic
 * key and Advanced Encryption Standard (AES 128). It can be used to encrypt date columns only.
 * It requires a range of dates as input defined by the startDate and endDate attributes. The
 * start date must be less than or equal to the end date.
 * <p>
 * The original column values in all the rows must be within the specified date range. The
 * encrypted values are also within the specified range. Therefore, to ensure uniqueness, the
 * total number of dates in the range must be greater than or equal to the number of distinct
 * original values in the column. If an original value is not in the specified date range, it
 * might not produce a one-to-one mapping. All non-confirming values are mapped to a single
 * encrypted value, thereby producing a many-to-one mapping.
 * <p>
 * Deterministic Encryption (Date) is a format-preserving, deterministic and reversible masking
 * format, which requires a seed value while submitting a masking work request. Passing the
 * same seed value when masking multiple times or masking different databases ensures that
 * the data is masked deterministically. To learn more, check Deterministic Encryption in the
 * Data Safe documentation.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeterministicEncryptionDateFormatEntry.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DeterministicEncryptionDateFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeterministicEncryptionDateFormatEntry build() {
            DeterministicEncryptionDateFormatEntry __instance__ =
                    new DeterministicEncryptionDateFormatEntry(description, startDate, endDate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeterministicEncryptionDateFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .startDate(o.getStartDate())
                            .endDate(o.getEndDate());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public DeterministicEncryptionDateFormatEntry(
            String description, java.util.Date startDate, java.util.Date endDate) {
        super(description);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * The lower bound of the range within which all the original column values fall.
     * The start date must be less than or equal to the end date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    java.util.Date startDate;

    /**
     * The upper bound of the range within which all the original column values fall.
     * The end date must be greater than or equal to the start date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    java.util.Date endDate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
