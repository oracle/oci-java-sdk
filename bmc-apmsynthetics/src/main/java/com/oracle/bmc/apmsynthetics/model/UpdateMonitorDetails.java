/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the request body used to update a monitor.
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
    builder = UpdateMonitorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateMonitorDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
        private java.util.List<String> vantagePoints;

        public Builder vantagePoints(java.util.List<String> vantagePoints) {
            this.vantagePoints = vantagePoints;
            this.__explicitlySet__.add("vantagePoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
        private String scriptId;

        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            this.__explicitlySet__.add("scriptId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("scriptParameters")
        private java.util.List<MonitorScriptParameter> scriptParameters;

        public Builder scriptParameters(java.util.List<MonitorScriptParameter> scriptParameters) {
            this.scriptParameters = scriptParameters;
            this.__explicitlySet__.add("scriptParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private MonitorConfiguration configuration;

        public Builder configuration(MonitorConfiguration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
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

        public UpdateMonitorDetails build() {
            UpdateMonitorDetails __instance__ =
                    new UpdateMonitorDetails(
                            displayName,
                            vantagePoints,
                            scriptId,
                            status,
                            repeatIntervalInSeconds,
                            timeoutInSeconds,
                            target,
                            scriptParameters,
                            configuration,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMonitorDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .vantagePoints(o.getVantagePoints())
                            .scriptId(o.getScriptId())
                            .status(o.getStatus())
                            .repeatIntervalInSeconds(o.getRepeatIntervalInSeconds())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
                            .target(o.getTarget())
                            .scriptParameters(o.getScriptParameters())
                            .configuration(o.getConfiguration())
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
     * Unique name that can be edited. The name should not contain any confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A list of vantage points from which to execute the monitor.
     * Use /publicVantagePoints to fetch public vantage points.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
    java.util.List<String> vantagePoints;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
     * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
    String scriptId;

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
     * Also, timeoutInSeconds should be a multiple of 60. Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
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
     * List of script parameters in the monitor.
     * This is valid only for SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     * Example: {@code [{"paramName": "userid", "paramValue":"testuser"}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptParameters")
    java.util.List<MonitorScriptParameter> scriptParameters;

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    MonitorConfiguration configuration;

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
