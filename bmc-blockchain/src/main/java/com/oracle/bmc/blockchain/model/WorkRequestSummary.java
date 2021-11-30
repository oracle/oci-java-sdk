/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * A description of workrequest status
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class WorkRequestSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkRequest.Status status;

        public Builder status(WorkRequest.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestSummary build() {
            WorkRequestSummary __instance__ =
                    new WorkRequestSummary(
                            operationType,
                            status,
                            id,
                            compartmentId,
                            resources,
                            percentComplete,
                            timeAccepted,
                            timeStarted,
                            timeFinished);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestSummary o) {
            Builder copiedBuilder =
                    operationType(o.getOperationType())
                            .status(o.getStatus())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .resources(o.getResources())
                            .percentComplete(o.getPercentComplete())
                            .timeAccepted(o.getTimeAccepted())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished());

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
     * type of the work request
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OperationType {
        CreatePlatform("CREATE_PLATFORM"),
        UpdatePlatform("UPDATE_PLATFORM"),
        UpgradePlatform("UPGRADE_PLATFORM"),
        DeletePlatform("DELETE_PLATFORM"),
        ScalePlatform("SCALE_PLATFORM"),
        StartPlatform("START_PLATFORM"),
        StopPlatform("STOP_PLATFORM"),
        CustomizePlatform("CUSTOMIZE_PLATFORM"),
        ScaleStorage("SCALE_STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * type of the work request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    OperationType operationType;

    /**
     * status of current work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    WorkRequest.Status status;

    /**
     * The id of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The ocid of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request affects multiple resources,
     * and those resources are not in the same compartment, it is up to the service team to pick the primary
     * resource whose compartment should be used
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The resources affected by this work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    java.util.List<WorkRequestResource> resources;

    /**
     * Percentage of the request completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Float percentComplete;

    /**
     * The date and time the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    /**
     * The date and time the request was started, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time the object was finished, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
