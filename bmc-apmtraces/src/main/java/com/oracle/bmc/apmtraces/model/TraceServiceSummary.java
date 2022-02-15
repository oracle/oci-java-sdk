/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the spans in a trace by service.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TraceServiceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TraceServiceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("spanServiceName")
        private String spanServiceName;

        public Builder spanServiceName(String spanServiceName) {
            this.spanServiceName = spanServiceName;
            this.__explicitlySet__.add("spanServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSpans")
        private Long totalSpans;

        public Builder totalSpans(Long totalSpans) {
            this.totalSpans = totalSpans;
            this.__explicitlySet__.add("totalSpans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorSpans")
        private Long errorSpans;

        public Builder errorSpans(Long errorSpans) {
            this.errorSpans = errorSpans;
            this.__explicitlySet__.add("errorSpans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TraceServiceSummary build() {
            TraceServiceSummary __instance__ =
                    new TraceServiceSummary(spanServiceName, totalSpans, errorSpans);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceServiceSummary o) {
            Builder copiedBuilder =
                    spanServiceName(o.getSpanServiceName())
                            .totalSpans(o.getTotalSpans())
                            .errorSpans(o.getErrorSpans());

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
     * Name associated with the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanServiceName")
    String spanServiceName;

    /**
     * Number of spans for serviceName in the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSpans")
    Long totalSpans;

    /**
     * Number of spans with errors for serviceName in the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorSpans")
    Long errorSpans;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
