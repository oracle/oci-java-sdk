/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The common fields for queries.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportQuery")
        private ReportQuery reportQuery;

        public Builder reportQuery(ReportQuery reportQuery) {
            this.reportQuery = reportQuery;
            this.__explicitlySet__.add("reportQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("costAnalysisUI")
        private CostAnalysisUI costAnalysisUI;

        public Builder costAnalysisUI(CostAnalysisUI costAnalysisUI) {
            this.costAnalysisUI = costAnalysisUI;
            this.__explicitlySet__.add("costAnalysisUI");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private java.math.BigDecimal version;

        public Builder version(java.math.BigDecimal version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryDefinition build() {
            QueryDefinition __instance__ =
                    new QueryDefinition(displayName, reportQuery, costAnalysisUI, version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryDefinition o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .reportQuery(o.getReportQuery())
                            .costAnalysisUI(o.getCostAnalysisUI())
                            .version(o.getVersion());

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
     * The query display name. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("reportQuery")
    ReportQuery reportQuery;

    @com.fasterxml.jackson.annotation.JsonProperty("costAnalysisUI")
    CostAnalysisUI costAnalysisUI;

    /**
     * The saved query version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    java.math.BigDecimal version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
