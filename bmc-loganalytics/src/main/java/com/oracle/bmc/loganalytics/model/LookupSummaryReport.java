/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary report of lookups in the tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LookupSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LookupSummaryReport {
    @Deprecated
    @java.beans.ConstructorProperties({"userCreatedCount", "oracleDefinedCount", "totalCount"})
    public LookupSummaryReport(
            Integer userCreatedCount, Integer oracleDefinedCount, Integer totalCount) {
        super();
        this.userCreatedCount = userCreatedCount;
        this.oracleDefinedCount = oracleDefinedCount;
        this.totalCount = totalCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of user created lookups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userCreatedCount")
        private Integer userCreatedCount;

        /**
         * The number of user created lookups.
         * @param userCreatedCount the value to set
         * @return this builder
         **/
        public Builder userCreatedCount(Integer userCreatedCount) {
            this.userCreatedCount = userCreatedCount;
            this.__explicitlySet__.add("userCreatedCount");
            return this;
        }
        /**
         * The number of oracle defined lookups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedCount")
        private Integer oracleDefinedCount;

        /**
         * The number of oracle defined lookups.
         * @param oracleDefinedCount the value to set
         * @return this builder
         **/
        public Builder oracleDefinedCount(Integer oracleDefinedCount) {
            this.oracleDefinedCount = oracleDefinedCount;
            this.__explicitlySet__.add("oracleDefinedCount");
            return this;
        }
        /**
         * The total number of lookups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * The total number of lookups.
         * @param totalCount the value to set
         * @return this builder
         **/
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LookupSummaryReport build() {
            LookupSummaryReport __instance__ =
                    new LookupSummaryReport(userCreatedCount, oracleDefinedCount, totalCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LookupSummaryReport o) {
            Builder copiedBuilder =
                    userCreatedCount(o.getUserCreatedCount())
                            .oracleDefinedCount(o.getOracleDefinedCount())
                            .totalCount(o.getTotalCount());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of user created lookups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userCreatedCount")
    private final Integer userCreatedCount;

    /**
     * The number of user created lookups.
     * @return the value
     **/
    public Integer getUserCreatedCount() {
        return userCreatedCount;
    }

    /**
     * The number of oracle defined lookups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedCount")
    private final Integer oracleDefinedCount;

    /**
     * The number of oracle defined lookups.
     * @return the value
     **/
    public Integer getOracleDefinedCount() {
        return oracleDefinedCount;
    }

    /**
     * The total number of lookups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * The total number of lookups.
     * @return the value
     **/
    public Integer getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LookupSummaryReport(");
        sb.append("userCreatedCount=").append(String.valueOf(this.userCreatedCount));
        sb.append(", oracleDefinedCount=").append(String.valueOf(this.oracleDefinedCount));
        sb.append(", totalCount=").append(String.valueOf(this.totalCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LookupSummaryReport)) {
            return false;
        }

        LookupSummaryReport other = (LookupSummaryReport) o;
        return java.util.Objects.equals(this.userCreatedCount, other.userCreatedCount)
                && java.util.Objects.equals(this.oracleDefinedCount, other.oracleDefinedCount)
                && java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.userCreatedCount == null ? 43 : this.userCreatedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleDefinedCount == null
                                ? 43
                                : this.oracleDefinedCount.hashCode());
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
