/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Information about the monitor.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MonitorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonitorSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
        private MonitorTypes monitorType;

        public Builder monitorType(MonitorTypes monitorType) {
            this.monitorType = monitorType;
            this.__explicitlySet__.add("monitorType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
        private java.util.List<VantagePointInfo> vantagePoints;

        public Builder vantagePoints(java.util.List<VantagePointInfo> vantagePoints) {
            this.vantagePoints = vantagePoints;
            this.__explicitlySet__.add("vantagePoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointCount")
        private Integer vantagePointCount;

        public Builder vantagePointCount(Integer vantagePointCount) {
            this.vantagePointCount = vantagePointCount;
            this.__explicitlySet__.add("vantagePointCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
        private String scriptId;

        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            this.__explicitlySet__.add("scriptId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptName")
        private String scriptName;

        public Builder scriptName(String scriptName) {
            this.scriptName = scriptName;
            this.__explicitlySet__.add("scriptName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private MonitorStatus status;

        public Builder status(MonitorStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repeatIntervalInSeconds")
        private Integer repeatIntervalInSeconds;

        public Builder repeatIntervalInSeconds(Integer repeatIntervalInSeconds) {
            this.repeatIntervalInSeconds = repeatIntervalInSeconds;
            this.__explicitlySet__.add("repeatIntervalInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorSummary build() {
            MonitorSummary __instance__ =
                    new MonitorSummary(
                            id,
                            displayName,
                            monitorType,
                            vantagePoints,
                            vantagePointCount,
                            scriptId,
                            scriptName,
                            status,
                            repeatIntervalInSeconds,
                            timeoutInSeconds,
                            target,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .monitorType(o.getMonitorType())
                            .vantagePoints(o.getVantagePoints())
                            .vantagePointCount(o.getVantagePointCount())
                            .scriptId(o.getScriptId())
                            .scriptName(o.getScriptName())
                            .status(o.getStatus())
                            .repeatIntervalInSeconds(o.getRepeatIntervalInSeconds())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
                            .target(o.getTarget())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The type of monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
    MonitorTypes monitorType;

    /**
     * List of vantage points where the monitor is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
    java.util.List<VantagePointInfo> vantagePoints;

    /**
     * Number of vantage points where monitor is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointCount")
    Integer vantagePointCount;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
     * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
    String scriptId;

    /**
     * Name of the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptName")
    String scriptName;

    /**
     * Enables or disables the monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    MonitorStatus status;

    /**
     * Interval in seconds after the start time when the job should be repeated.
     * Minimum repeatIntervalInSeconds should be 300 seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatIntervalInSeconds")
    Integer repeatIntervalInSeconds;

    /**
     * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors.
     * Also, timeoutInSeconds should be a multiple of 60.
     * Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    Integer timeoutInSeconds;

    /**
     * Specify the endpoint on which to run the monitor.
     * For BROWSER and REST monitor types, target is mandatory.
     * If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint.
     * If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    String target;

    /**
     * The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-13T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
