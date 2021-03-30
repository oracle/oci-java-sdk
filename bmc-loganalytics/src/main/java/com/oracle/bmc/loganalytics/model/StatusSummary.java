/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * StatusSummary
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StatusSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StatusSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("chunksProcessed")
        private Long chunksProcessed;

        public Builder chunksProcessed(Long chunksProcessed) {
            this.chunksProcessed = chunksProcessed;
            this.__explicitlySet__.add("chunksProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
        private String failureDetails;

        public Builder failureDetails(String failureDetails) {
            this.failureDetails = failureDetails;
            this.__explicitlySet__.add("failureDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filename")
        private String filename;

        public Builder filename(String filename) {
            this.filename = filename;
            this.__explicitlySet__.add("filename");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
        private Long totalChunks;

        public Builder totalChunks(Long totalChunks) {
            this.totalChunks = totalChunks;
            this.__explicitlySet__.add("totalChunks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatusSummary build() {
            StatusSummary __instance__ =
                    new StatusSummary(
                            chunksProcessed, failureDetails, filename, status, totalChunks);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatusSummary o) {
            Builder copiedBuilder =
                    chunksProcessed(o.getChunksProcessed())
                            .failureDetails(o.getFailureDetails())
                            .filename(o.getFilename())
                            .status(o.getStatus())
                            .totalChunks(o.getTotalChunks());

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
     * The number of chunks processed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksProcessed")
    Long chunksProcessed;

    /**
     * The failure details, if any.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
    String failureDetails;

    /**
     * The filename.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filename")
    String filename;

    /**
     * The status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    String status;

    /**
     * The total number of chunks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
    Long totalChunks;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
