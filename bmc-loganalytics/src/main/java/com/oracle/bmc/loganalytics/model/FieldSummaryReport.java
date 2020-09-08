/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * FieldSummaryReport
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
    builder = FieldSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FieldSummaryReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
        private Integer nonOobCount;

        public Builder nonOobCount(Integer nonOobCount) {
            this.nonOobCount = nonOobCount;
            this.__explicitlySet__.add("nonOobCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
        private Integer oobCount;

        public Builder oobCount(Integer oobCount) {
            this.oobCount = oobCount;
            this.__explicitlySet__.add("oobCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageDetails")
        private java.util.List<UsageStatusItem> usageDetails;

        public Builder usageDetails(java.util.List<UsageStatusItem> usageDetails) {
            this.usageDetails = usageDetails;
            this.__explicitlySet__.add("usageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldSummaryReport build() {
            FieldSummaryReport __instance__ =
                    new FieldSummaryReport(nonOobCount, oobCount, usageDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldSummaryReport o) {
            Builder copiedBuilder =
                    nonOobCount(o.getNonOobCount())
                            .oobCount(o.getOobCount())
                            .usageDetails(o.getUsageDetails());

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
     * non out-of-the-box count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
    Integer nonOobCount;

    /**
     * out-of-the-box count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
    Integer oobCount;

    /**
     * usage detail
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageDetails")
    java.util.List<UsageStatusItem> usageDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
