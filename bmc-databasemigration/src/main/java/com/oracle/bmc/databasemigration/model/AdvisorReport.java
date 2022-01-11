/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Pre-Migration advisor report details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdvisorReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AdvisorReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("reportLocationDetails")
        private AdvisorReportLocationDetails reportLocationDetails;

        public Builder reportLocationDetails(AdvisorReportLocationDetails reportLocationDetails) {
            this.reportLocationDetails = reportLocationDetails;
            this.__explicitlySet__.add("reportLocationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private AdvisorResults result;

        public Builder result(AdvisorResults result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatal")
        private Integer numberOfFatal;

        public Builder numberOfFatal(Integer numberOfFatal) {
            this.numberOfFatal = numberOfFatal;
            this.__explicitlySet__.add("numberOfFatal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatalBlockers")
        private Integer numberOfFatalBlockers;

        public Builder numberOfFatalBlockers(Integer numberOfFatalBlockers) {
            this.numberOfFatalBlockers = numberOfFatalBlockers;
            this.__explicitlySet__.add("numberOfFatalBlockers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfWarnings")
        private Integer numberOfWarnings;

        public Builder numberOfWarnings(Integer numberOfWarnings) {
            this.numberOfWarnings = numberOfWarnings;
            this.__explicitlySet__.add("numberOfWarnings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfInformationalResults")
        private Integer numberOfInformationalResults;

        public Builder numberOfInformationalResults(Integer numberOfInformationalResults) {
            this.numberOfInformationalResults = numberOfInformationalResults;
            this.__explicitlySet__.add("numberOfInformationalResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdvisorReport build() {
            AdvisorReport __instance__ =
                    new AdvisorReport(
                            reportLocationDetails,
                            result,
                            numberOfFatal,
                            numberOfFatalBlockers,
                            numberOfWarnings,
                            numberOfInformationalResults);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdvisorReport o) {
            Builder copiedBuilder =
                    reportLocationDetails(o.getReportLocationDetails())
                            .result(o.getResult())
                            .numberOfFatal(o.getNumberOfFatal())
                            .numberOfFatalBlockers(o.getNumberOfFatalBlockers())
                            .numberOfWarnings(o.getNumberOfWarnings())
                            .numberOfInformationalResults(o.getNumberOfInformationalResults());

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

    @com.fasterxml.jackson.annotation.JsonProperty("reportLocationDetails")
    AdvisorReportLocationDetails reportLocationDetails;

    /**
     * Pre-Migration advisor result.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    AdvisorResults result;

    /**
     * Number of Fatal results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatal")
    Integer numberOfFatal;

    /**
     * Number of Fatal Blocker results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatalBlockers")
    Integer numberOfFatalBlockers;

    /**
     * Number of Warning results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfWarnings")
    Integer numberOfWarnings;

    /**
     * Number of Informational results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfInformationalResults")
    Integer numberOfInformationalResults;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
