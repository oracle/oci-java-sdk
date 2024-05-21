/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeterministicEncryptionDateFormatEntry.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeterministicEncryptionDateFormatEntry extends FormatEntry {
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
         * The lower bound of the range within which all the original column values fall.
         * The start date must be less than or equal to the end date.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        /**
         * The lower bound of the range within which all the original column values fall.
         * The start date must be less than or equal to the end date.
         *
         * @param startDate the value to set
         * @return this builder
         **/
        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /**
         * The upper bound of the range within which all the original column values fall.
         * The end date must be greater than or equal to the start date.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        /**
         * The upper bound of the range within which all the original column values fall.
         * The end date must be greater than or equal to the start date.
         *
         * @param endDate the value to set
         * @return this builder
         **/
        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeterministicEncryptionDateFormatEntry build() {
            DeterministicEncryptionDateFormatEntry model =
                    new DeterministicEncryptionDateFormatEntry(
                            this.description, this.startDate, this.endDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeterministicEncryptionDateFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
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
    private final java.util.Date startDate;

    /**
     * The lower bound of the range within which all the original column values fall.
     * The start date must be less than or equal to the end date.
     *
     * @return the value
     **/
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * The upper bound of the range within which all the original column values fall.
     * The end date must be greater than or equal to the start date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    /**
     * The upper bound of the range within which all the original column values fall.
     * The end date must be greater than or equal to the start date.
     *
     * @return the value
     **/
    public java.util.Date getEndDate() {
        return endDate;
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
        sb.append("DeterministicEncryptionDateFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeterministicEncryptionDateFormatEntry)) {
            return false;
        }

        DeterministicEncryptionDateFormatEntry other = (DeterministicEncryptionDateFormatEntry) o;
        return java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        return result;
    }
}
