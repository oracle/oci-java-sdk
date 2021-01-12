/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingingestion.model;

/**
 * The request body for the PutLogs request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200831")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PutLogsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PutLogsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("specversion")
        private String specversion;

        public Builder specversion(String specversion) {
            this.specversion = specversion;
            this.__explicitlySet__.add("specversion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logEntryBatches")
        private java.util.List<LogEntryBatch> logEntryBatches;

        public Builder logEntryBatches(java.util.List<LogEntryBatch> logEntryBatches) {
            this.logEntryBatches = logEntryBatches;
            this.__explicitlySet__.add("logEntryBatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PutLogsDetails build() {
            PutLogsDetails __instance__ = new PutLogsDetails(specversion, logEntryBatches);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PutLogsDetails o) {
            Builder copiedBuilder =
                    specversion(o.getSpecversion()).logEntryBatches(o.getLogEntryBatches());

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
     * Required for identifying the version of the data format being used.
     * Permitted values include: \"1.0\"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("specversion")
    String specversion;

    /**
     * List of log-batches. Each batch has a single source, type and subject.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logEntryBatches")
    java.util.List<LogEntryBatch> logEntryBatches;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
