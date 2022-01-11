/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details of Upload File.
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
    builder = UploadFileSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UploadFileSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("reference")
        private String reference;

        public Builder reference(String reference) {
            this.reference = reference;
            this.__explicitlySet__.add("reference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
        private java.math.BigDecimal totalChunks;

        public Builder totalChunks(java.math.BigDecimal totalChunks) {
            this.totalChunks = totalChunks;
            this.__explicitlySet__.add("totalChunks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chunksConsumed")
        private java.math.BigDecimal chunksConsumed;

        public Builder chunksConsumed(java.math.BigDecimal chunksConsumed) {
            this.chunksConsumed = chunksConsumed;
            this.__explicitlySet__.add("chunksConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chunksSuccess")
        private java.math.BigDecimal chunksSuccess;

        public Builder chunksSuccess(java.math.BigDecimal chunksSuccess) {
            this.chunksSuccess = chunksSuccess;
            this.__explicitlySet__.add("chunksSuccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chunksFail")
        private java.math.BigDecimal chunksFail;

        public Builder chunksFail(java.math.BigDecimal chunksFail) {
            this.chunksFail = chunksFail;
            this.__explicitlySet__.add("chunksFail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logNamespace")
        private String logNamespace;

        public Builder logNamespace(String logNamespace) {
            this.logNamespace = logNamespace;
            this.__explicitlySet__.add("logNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
        private String logGroupName;

        public Builder logGroupName(String logGroupName) {
            this.logGroupName = logGroupName;
            this.__explicitlySet__.add("logGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
        private String failureDetails;

        public Builder failureDetails(String failureDetails) {
            this.failureDetails = failureDetails;
            this.__explicitlySet__.add("failureDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadFileSummary build() {
            UploadFileSummary __instance__ =
                    new UploadFileSummary(
                            reference,
                            name,
                            status,
                            totalChunks,
                            chunksConsumed,
                            chunksSuccess,
                            chunksFail,
                            timeStarted,
                            sourceName,
                            entityType,
                            entityName,
                            logNamespace,
                            logGroupId,
                            logGroupName,
                            failureDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadFileSummary o) {
            Builder copiedBuilder =
                    reference(o.getReference())
                            .name(o.getName())
                            .status(o.getStatus())
                            .totalChunks(o.getTotalChunks())
                            .chunksConsumed(o.getChunksConsumed())
                            .chunksSuccess(o.getChunksSuccess())
                            .chunksFail(o.getChunksFail())
                            .timeStarted(o.getTimeStarted())
                            .sourceName(o.getSourceName())
                            .entityType(o.getEntityType())
                            .entityName(o.getEntityName())
                            .logNamespace(o.getLogNamespace())
                            .logGroupId(o.getLogGroupId())
                            .logGroupName(o.getLogGroupName())
                            .failureDetails(o.getFailureDetails());

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
     * Unique internal identifier to refer upload file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    String reference;

    /**
     * Name of the file
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * Processing status of the file.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        InProgress("IN_PROGRESS"),
        Successful("SUCCESSFUL"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Processing status of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * Number of estimated chunks for this file. A chunk is a portion of the log file used for the processing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalChunks")
    java.math.BigDecimal totalChunks;

    /**
     * Number of chunks processed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksConsumed")
    java.math.BigDecimal chunksConsumed;

    /**
     * Number of chunks processed successfully.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksSuccess")
    java.math.BigDecimal chunksSuccess;

    /**
     * Number of chunks failed processing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunksFail")
    java.math.BigDecimal chunksFail;

    /**
     * The time when this file processing started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * Name of the log source used for processing this file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * Name of the entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * Name of the entity associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * (Deprecated) Name of the log namespace associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logNamespace")
    String logNamespace;

    /**
     * Log group OCID associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    String logGroupId;

    /**
     * Name of the log group associated with the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupName")
    String logGroupName;

    /**
     * The details about upload processing failure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failureDetails")
    String failureDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
