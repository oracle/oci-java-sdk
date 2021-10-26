/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Object containing information about a mirror record
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RepositoryMirrorRecord.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RepositoryMirrorRecord {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mirrorStatus")
        private MirrorStatus mirrorStatus;

        public Builder mirrorStatus(MirrorStatus mirrorStatus) {
            this.mirrorStatus = mirrorStatus;
            this.__explicitlySet__.add("mirrorStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnqueued")
        private java.util.Date timeEnqueued;

        public Builder timeEnqueued(java.util.Date timeEnqueued) {
            this.timeEnqueued = timeEnqueued;
            this.__explicitlySet__.add("timeEnqueued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryMirrorRecord build() {
            RepositoryMirrorRecord __instance__ =
                    new RepositoryMirrorRecord(
                            mirrorStatus, workRequestId, timeEnqueued, timeStarted, timeEnded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryMirrorRecord o) {
            Builder copiedBuilder =
                    mirrorStatus(o.getMirrorStatus())
                            .workRequestId(o.getWorkRequestId())
                            .timeEnqueued(o.getTimeEnqueued())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded());

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
     * Mirror status of current mirror entry.
     * QUEUED - Mirroring Queued
     * RUNNING - Mirroring is Running
     * PASSED - Mirroring Passed
     * FAILED - Mirroring Failed
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MirrorStatus {
        None("NONE"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Passed("PASSED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MirrorStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MirrorStatus v : MirrorStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MirrorStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MirrorStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MirrorStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Mirror status of current mirror entry.
     * QUEUED - Mirroring Queued
     * RUNNING - Mirroring is Running
     * PASSED - Mirroring Passed
     * FAILED - Mirroring Failed
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mirrorStatus")
    MirrorStatus mirrorStatus;

    /**
     * Workrequest Id to track current mirror operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    String workRequestId;

    /**
     * The time to enqueue a mirror operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnqueued")
    java.util.Date timeEnqueued;

    /**
     * The time to start a mirror operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * Time that the mirror operation ended or null if it hasn't yet ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
