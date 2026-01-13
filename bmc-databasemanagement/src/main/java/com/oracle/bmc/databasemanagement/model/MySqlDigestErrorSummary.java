/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Consists of the error and the number of times it is encountered. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlDigestErrorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDigestErrorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"error", "occurrenceCount"})
    public MySqlDigestErrorSummary(MySqlQueryMessage error, Integer occurrenceCount) {
        super();
        this.error = error;
        this.occurrenceCount = occurrenceCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private MySqlQueryMessage error;

        public Builder error(MySqlQueryMessage error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }
        /** The number of times a MySQL error is encountered. */
        @com.fasterxml.jackson.annotation.JsonProperty("occurrenceCount")
        private Integer occurrenceCount;

        /**
         * The number of times a MySQL error is encountered.
         *
         * @param occurrenceCount the value to set
         * @return this builder
         */
        public Builder occurrenceCount(Integer occurrenceCount) {
            this.occurrenceCount = occurrenceCount;
            this.__explicitlySet__.add("occurrenceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDigestErrorSummary build() {
            MySqlDigestErrorSummary model =
                    new MySqlDigestErrorSummary(this.error, this.occurrenceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDigestErrorSummary model) {
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
            }
            if (model.wasPropertyExplicitlySet("occurrenceCount")) {
                this.occurrenceCount(model.getOccurrenceCount());
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

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final MySqlQueryMessage error;

    public MySqlQueryMessage getError() {
        return error;
    }

    /** The number of times a MySQL error is encountered. */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceCount")
    private final Integer occurrenceCount;

    /**
     * The number of times a MySQL error is encountered.
     *
     * @return the value
     */
    public Integer getOccurrenceCount() {
        return occurrenceCount;
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
        sb.append("MySqlDigestErrorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("error=").append(String.valueOf(this.error));
        sb.append(", occurrenceCount=").append(String.valueOf(this.occurrenceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDigestErrorSummary)) {
            return false;
        }

        MySqlDigestErrorSummary other = (MySqlDigestErrorSummary) o;
        return java.util.Objects.equals(this.error, other.error)
                && java.util.Objects.equals(this.occurrenceCount, other.occurrenceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result =
                (result * PRIME)
                        + (this.occurrenceCount == null ? 43 : this.occurrenceCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
