/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Defines limits applicable to an insight type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InsightLimits.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InsightLimits extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"maxTimeRangeDays", "maxRows"})
    public InsightLimits(Integer maxTimeRangeDays, Integer maxRows) {
        super();
        this.maxTimeRangeDays = maxTimeRangeDays;
        this.maxRows = maxRows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Maximum allowed time range in days. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTimeRangeDays")
        private Integer maxTimeRangeDays;

        /**
         * Maximum allowed time range in days.
         *
         * @param maxTimeRangeDays the value to set
         * @return this builder
         */
        public Builder maxTimeRangeDays(Integer maxTimeRangeDays) {
            this.maxTimeRangeDays = maxTimeRangeDays;
            this.__explicitlySet__.add("maxTimeRangeDays");
            return this;
        }
        /** Maximum number of rows returned. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxRows")
        private Integer maxRows;

        /**
         * Maximum number of rows returned.
         *
         * @param maxRows the value to set
         * @return this builder
         */
        public Builder maxRows(Integer maxRows) {
            this.maxRows = maxRows;
            this.__explicitlySet__.add("maxRows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InsightLimits build() {
            InsightLimits model = new InsightLimits(this.maxTimeRangeDays, this.maxRows);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InsightLimits model) {
            if (model.wasPropertyExplicitlySet("maxTimeRangeDays")) {
                this.maxTimeRangeDays(model.getMaxTimeRangeDays());
            }
            if (model.wasPropertyExplicitlySet("maxRows")) {
                this.maxRows(model.getMaxRows());
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

    /** Maximum allowed time range in days. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTimeRangeDays")
    private final Integer maxTimeRangeDays;

    /**
     * Maximum allowed time range in days.
     *
     * @return the value
     */
    public Integer getMaxTimeRangeDays() {
        return maxTimeRangeDays;
    }

    /** Maximum number of rows returned. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRows")
    private final Integer maxRows;

    /**
     * Maximum number of rows returned.
     *
     * @return the value
     */
    public Integer getMaxRows() {
        return maxRows;
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
        sb.append("InsightLimits(");
        sb.append("super=").append(super.toString());
        sb.append("maxTimeRangeDays=").append(String.valueOf(this.maxTimeRangeDays));
        sb.append(", maxRows=").append(String.valueOf(this.maxRows));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InsightLimits)) {
            return false;
        }

        InsightLimits other = (InsightLimits) o;
        return java.util.Objects.equals(this.maxTimeRangeDays, other.maxTimeRangeDays)
                && java.util.Objects.equals(this.maxRows, other.maxRows)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxTimeRangeDays == null ? 43 : this.maxTimeRangeDays.hashCode());
        result = (result * PRIME) + (this.maxRows == null ? 43 : this.maxRows.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
