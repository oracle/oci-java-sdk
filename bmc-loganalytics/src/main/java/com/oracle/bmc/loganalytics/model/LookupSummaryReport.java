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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LookupSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LookupSummaryReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("userCreatedCount")
        private Integer userCreatedCount;

        public Builder userCreatedCount(Integer userCreatedCount) {
            this.userCreatedCount = userCreatedCount;
            this.__explicitlySet__.add("userCreatedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedCount")
        private Integer oracleDefinedCount;

        public Builder oracleDefinedCount(Integer oracleDefinedCount) {
            this.oracleDefinedCount = oracleDefinedCount;
            this.__explicitlySet__.add("oracleDefinedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

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

    /**
     * The number of user created lookups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userCreatedCount")
    Integer userCreatedCount;

    /**
     * The number of oracle defined lookups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedCount")
    Integer oracleDefinedCount;

    /**
     * The total number of lookups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    Integer totalCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
