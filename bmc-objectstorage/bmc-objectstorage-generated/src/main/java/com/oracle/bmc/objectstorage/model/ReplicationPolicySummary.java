/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The summary of a replication policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReplicationPolicySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReplicationPolicySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationRegionName")
        private String destinationRegionName;

        public Builder destinationRegionName(String destinationRegionName) {
            this.destinationRegionName = destinationRegionName;
            this.__explicitlySet__.add("destinationRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
        private String destinationBucketName;

        public Builder destinationBucketName(String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            this.__explicitlySet__.add("destinationBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSync")
        private java.util.Date timeLastSync;

        public Builder timeLastSync(java.util.Date timeLastSync) {
            this.timeLastSync = timeLastSync;
            this.__explicitlySet__.add("timeLastSync");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
        private String statusMessage;

        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            this.__explicitlySet__.add("statusMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationPolicySummary build() {
            ReplicationPolicySummary __instance__ =
                    new ReplicationPolicySummary(
                            id,
                            name,
                            destinationRegionName,
                            destinationBucketName,
                            timeCreated,
                            timeLastSync,
                            status,
                            statusMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationPolicySummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .destinationRegionName(o.getDestinationRegionName())
                            .destinationBucketName(o.getDestinationBucketName())
                            .timeCreated(o.getTimeCreated())
                            .timeLastSync(o.getTimeLastSync())
                            .status(o.getStatus())
                            .statusMessage(o.getStatusMessage());

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
     * The id of the replication policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The destination region to replicate to, for example "us-ashburn-1".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationRegionName")
    String destinationRegionName;

    /**
     * The bucket to replicate to in the destination region. Replication policy creation does not automatically
     * create a destination bucket. Create the destination bucket before creating the policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
    String destinationBucketName;

    /**
     * The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Changes made to the source bucket before this time has been replicated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSync")
    java.util.Date timeLastSync;
    /**
     * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
     * described in the status message, the status will become ACTIVE.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Active("ACTIVE"),
        ClientError("CLIENT_ERROR"),

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
     * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue
     * described in the status message, the status will become ACTIVE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * A human-readable description of the status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
    String statusMessage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
