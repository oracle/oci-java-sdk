/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * The information about a monitor. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Monitor.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Monitor extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "monitorType",
        "vantagePoints",
        "vantagePointCount",
        "scriptId",
        "scriptName",
        "contentType",
        "status",
        "repeatIntervalInSeconds",
        "isRunOnce",
        "timeoutInSeconds",
        "target",
        "scriptParameters",
        "configuration",
        "availabilityConfiguration",
        "maintenanceWindowSchedule",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "isRunNow",
        "schedulingPolicy",
        "batchIntervalInSeconds",
        "isIPv6",
        "createdBy",
        "lastUpdatedBy"
    })
    public Monitor(
            String id,
            String displayName,
            MonitorTypes monitorType,
            java.util.List<VantagePointInfo> vantagePoints,
            Integer vantagePointCount,
            String scriptId,
            String scriptName,
            ContentTypes contentType,
            MonitorStatus status,
            Integer repeatIntervalInSeconds,
            Boolean isRunOnce,
            Integer timeoutInSeconds,
            String target,
            java.util.List<MonitorScriptParameterInfo> scriptParameters,
            MonitorConfiguration configuration,
            AvailabilityConfiguration availabilityConfiguration,
            MaintenanceWindowSchedule maintenanceWindowSchedule,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isRunNow,
            SchedulingPolicy schedulingPolicy,
            Integer batchIntervalInSeconds,
            Boolean isIPv6,
            String createdBy,
            String lastUpdatedBy) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.monitorType = monitorType;
        this.vantagePoints = vantagePoints;
        this.vantagePointCount = vantagePointCount;
        this.scriptId = scriptId;
        this.scriptName = scriptName;
        this.contentType = contentType;
        this.status = status;
        this.repeatIntervalInSeconds = repeatIntervalInSeconds;
        this.isRunOnce = isRunOnce;
        this.timeoutInSeconds = timeoutInSeconds;
        this.target = target;
        this.scriptParameters = scriptParameters;
        this.configuration = configuration;
        this.availabilityConfiguration = availabilityConfiguration;
        this.maintenanceWindowSchedule = maintenanceWindowSchedule;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isRunNow = isRunNow;
        this.schedulingPolicy = schedulingPolicy;
        this.batchIntervalInSeconds = batchIntervalInSeconds;
        this.isIPv6 = isIPv6;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * monitor.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * monitor.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Type of monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
        private MonitorTypes monitorType;

        /**
         * Type of monitor.
         *
         * @param monitorType the value to set
         * @return this builder
         */
        public Builder monitorType(MonitorTypes monitorType) {
            this.monitorType = monitorType;
            this.__explicitlySet__.add("monitorType");
            return this;
        }
        /** List of public, dedicated and onPremise vantage points where the monitor is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
        private java.util.List<VantagePointInfo> vantagePoints;

        /**
         * List of public, dedicated and onPremise vantage points where the monitor is running.
         *
         * @param vantagePoints the value to set
         * @return this builder
         */
        public Builder vantagePoints(java.util.List<VantagePointInfo> vantagePoints) {
            this.vantagePoints = vantagePoints;
            this.__explicitlySet__.add("vantagePoints");
            return this;
        }
        /** Number of vantage points where monitor is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointCount")
        private Integer vantagePointCount;

        /**
         * Number of vantage points where monitor is running.
         *
         * @param vantagePointCount the value to set
         * @return this builder
         */
        public Builder vantagePointCount(Integer vantagePointCount) {
            this.vantagePointCount = vantagePointCount;
            this.__explicitlySet__.add("vantagePointCount");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
         * types. For other monitor types, it should be set to null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
        private String scriptId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
         * types. For other monitor types, it should be set to null.
         *
         * @param scriptId the value to set
         * @return this builder
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            this.__explicitlySet__.add("scriptId");
            return this;
        }
        /** Name of the script. */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptName")
        private String scriptName;

        /**
         * Name of the script.
         *
         * @param scriptName the value to set
         * @return this builder
         */
        public Builder scriptName(String scriptName) {
            this.scriptName = scriptName;
            this.__explicitlySet__.add("scriptName");
            return this;
        }
        /** Content type of the script. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentTypes contentType;

        /**
         * Content type of the script.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(ContentTypes contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /** Enables or disables the monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private MonitorStatus status;

        /**
         * Enables or disables the monitor.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(MonitorStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Interval in seconds after the start time when the job should be repeated. Minimum
         * repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and
         * Browser monitors, and 60 seconds for REST monitor.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repeatIntervalInSeconds")
        private Integer repeatIntervalInSeconds;

        /**
         * Interval in seconds after the start time when the job should be repeated. Minimum
         * repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and
         * Browser monitors, and 60 seconds for REST monitor.
         *
         * @param repeatIntervalInSeconds the value to set
         * @return this builder
         */
        public Builder repeatIntervalInSeconds(Integer repeatIntervalInSeconds) {
            this.repeatIntervalInSeconds = repeatIntervalInSeconds;
            this.__explicitlySet__.add("repeatIntervalInSeconds");
            return this;
        }
        /** If runOnce is enabled, then the monitor will run once. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRunOnce")
        private Boolean isRunOnce;

        /**
         * If runOnce is enabled, then the monitor will run once.
         *
         * @param isRunOnce the value to set
         * @return this builder
         */
        public Builder isRunOnce(Boolean isRunOnce) {
            this.isRunOnce = isRunOnce;
            this.__explicitlySet__.add("isRunOnce");
            return this;
        }
        /**
         * Timeout in seconds. If isFailureRetried is true, then timeout cannot be more than 30% of
         * repeatIntervalInSeconds time for monitors. If isFailureRetried is false, then timeout
         * cannot be more than 50% of repeatIntervalInSeconds time for monitors. Also,
         * timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted Browser and
         * Browser monitors. Monitor will be allowed to run only for timeoutInSeconds time. It would
         * be terminated after that.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Timeout in seconds. If isFailureRetried is true, then timeout cannot be more than 30% of
         * repeatIntervalInSeconds time for monitors. If isFailureRetried is false, then timeout
         * cannot be more than 50% of repeatIntervalInSeconds time for monitors. Also,
         * timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted Browser and
         * Browser monitors. Monitor will be allowed to run only for timeoutInSeconds time. It would
         * be terminated after that.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }
        /**
         * Specify the endpoint on which to run the monitor. For BROWSER, REST, NETWORK, DNS and FTP
         * monitor types, target is mandatory. If target is specified in the SCRIPTED_BROWSER
         * monitor type, then the monitor will run the selected script (specified by scriptId in
         * monitor) against the specified target endpoint. If target is not specified in the
         * SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
         * For NETWORK monitor with TCP protocol, a port needs to be provided along with target.
         * Example: 192.168.0.1:80.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Specify the endpoint on which to run the monitor. For BROWSER, REST, NETWORK, DNS and FTP
         * monitor types, target is mandatory. If target is specified in the SCRIPTED_BROWSER
         * monitor type, then the monitor will run the selected script (specified by scriptId in
         * monitor) against the specified target endpoint. If target is not specified in the
         * SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
         * For NETWORK monitor with TCP protocol, a port needs to be provided along with target.
         * Example: 192.168.0.1:80.
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /**
         * List of script parameters. Example: {@code [{"monitorScriptParameter": {"paramName":
         * "userid", "paramValue":"testuser"}, "isSecret": false, "isOverwritten": false}]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptParameters")
        private java.util.List<MonitorScriptParameterInfo> scriptParameters;

        /**
         * List of script parameters. Example: {@code [{"monitorScriptParameter": {"paramName":
         * "userid", "paramValue":"testuser"}, "isSecret": false, "isOverwritten": false}]}
         *
         * @param scriptParameters the value to set
         * @return this builder
         */
        public Builder scriptParameters(
                java.util.List<MonitorScriptParameterInfo> scriptParameters) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfiguration")
        private AvailabilityConfiguration availabilityConfiguration;

        public Builder availabilityConfiguration(
                AvailabilityConfiguration availabilityConfiguration) {
            this.availabilityConfiguration = availabilityConfiguration;
            this.__explicitlySet__.add("availabilityConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowSchedule")
        private MaintenanceWindowSchedule maintenanceWindowSchedule;

        public Builder maintenanceWindowSchedule(
                MaintenanceWindowSchedule maintenanceWindowSchedule) {
            this.maintenanceWindowSchedule = maintenanceWindowSchedule;
            this.__explicitlySet__.add("maintenanceWindowSchedule");
            return this;
        }
        /**
         * The time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-13T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-13T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** If isRunNow is enabled, then the monitor will run immediately. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRunNow")
        private Boolean isRunNow;

        /**
         * If isRunNow is enabled, then the monitor will run immediately.
         *
         * @param isRunNow the value to set
         * @return this builder
         */
        public Builder isRunNow(Boolean isRunNow) {
            this.isRunNow = isRunNow;
            this.__explicitlySet__.add("isRunNow");
            return this;
        }
        /** Scheduling policy to decide the distribution of monitor executions on vantage points. */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulingPolicy")
        private SchedulingPolicy schedulingPolicy;

        /**
         * Scheduling policy to decide the distribution of monitor executions on vantage points.
         *
         * @param schedulingPolicy the value to set
         * @return this builder
         */
        public Builder schedulingPolicy(SchedulingPolicy schedulingPolicy) {
            this.schedulingPolicy = schedulingPolicy;
            this.__explicitlySet__.add("schedulingPolicy");
            return this;
        }
        /**
         * Time interval between two runs in round robin batch mode (SchedulingPolicy -
         * BATCHED_ROUND_ROBIN).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("batchIntervalInSeconds")
        private Integer batchIntervalInSeconds;

        /**
         * Time interval between two runs in round robin batch mode (SchedulingPolicy -
         * BATCHED_ROUND_ROBIN).
         *
         * @param batchIntervalInSeconds the value to set
         * @return this builder
         */
        public Builder batchIntervalInSeconds(Integer batchIntervalInSeconds) {
            this.batchIntervalInSeconds = batchIntervalInSeconds;
            this.__explicitlySet__.add("batchIntervalInSeconds");
            return this;
        }
        /** If enabled, domain name will resolve to an IPv6 address. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIPv6")
        private Boolean isIPv6;

        /**
         * If enabled, domain name will resolve to an IPv6 address.
         *
         * @param isIPv6 the value to set
         * @return this builder
         */
        public Builder isIPv6(Boolean isIPv6) {
            this.isIPv6 = isIPv6;
            this.__explicitlySet__.add("isIPv6");
            return this;
        }
        /** Name of the user that created the monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * Name of the user that created the monitor.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Name of the user that recently updated the monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
        private String lastUpdatedBy;

        /**
         * Name of the user that recently updated the monitor.
         *
         * @param lastUpdatedBy the value to set
         * @return this builder
         */
        public Builder lastUpdatedBy(String lastUpdatedBy) {
            this.lastUpdatedBy = lastUpdatedBy;
            this.__explicitlySet__.add("lastUpdatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Monitor build() {
            Monitor model =
                    new Monitor(
                            this.id,
                            this.displayName,
                            this.monitorType,
                            this.vantagePoints,
                            this.vantagePointCount,
                            this.scriptId,
                            this.scriptName,
                            this.contentType,
                            this.status,
                            this.repeatIntervalInSeconds,
                            this.isRunOnce,
                            this.timeoutInSeconds,
                            this.target,
                            this.scriptParameters,
                            this.configuration,
                            this.availabilityConfiguration,
                            this.maintenanceWindowSchedule,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.isRunNow,
                            this.schedulingPolicy,
                            this.batchIntervalInSeconds,
                            this.isIPv6,
                            this.createdBy,
                            this.lastUpdatedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Monitor model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("monitorType")) {
                this.monitorType(model.getMonitorType());
            }
            if (model.wasPropertyExplicitlySet("vantagePoints")) {
                this.vantagePoints(model.getVantagePoints());
            }
            if (model.wasPropertyExplicitlySet("vantagePointCount")) {
                this.vantagePointCount(model.getVantagePointCount());
            }
            if (model.wasPropertyExplicitlySet("scriptId")) {
                this.scriptId(model.getScriptId());
            }
            if (model.wasPropertyExplicitlySet("scriptName")) {
                this.scriptName(model.getScriptName());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("repeatIntervalInSeconds")) {
                this.repeatIntervalInSeconds(model.getRepeatIntervalInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isRunOnce")) {
                this.isRunOnce(model.getIsRunOnce());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("scriptParameters")) {
                this.scriptParameters(model.getScriptParameters());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("availabilityConfiguration")) {
                this.availabilityConfiguration(model.getAvailabilityConfiguration());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowSchedule")) {
                this.maintenanceWindowSchedule(model.getMaintenanceWindowSchedule());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isRunNow")) {
                this.isRunNow(model.getIsRunNow());
            }
            if (model.wasPropertyExplicitlySet("schedulingPolicy")) {
                this.schedulingPolicy(model.getSchedulingPolicy());
            }
            if (model.wasPropertyExplicitlySet("batchIntervalInSeconds")) {
                this.batchIntervalInSeconds(model.getBatchIntervalInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isIPv6")) {
                this.isIPv6(model.getIsIPv6());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedBy")) {
                this.lastUpdatedBy(model.getLastUpdatedBy());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * monitor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * monitor.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique name that can be edited. The name should not contain any confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Type of monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
    private final MonitorTypes monitorType;

    /**
     * Type of monitor.
     *
     * @return the value
     */
    public MonitorTypes getMonitorType() {
        return monitorType;
    }

    /** List of public, dedicated and onPremise vantage points where the monitor is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
    private final java.util.List<VantagePointInfo> vantagePoints;

    /**
     * List of public, dedicated and onPremise vantage points where the monitor is running.
     *
     * @return the value
     */
    public java.util.List<VantagePointInfo> getVantagePoints() {
        return vantagePoints;
    }

    /** Number of vantage points where monitor is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointCount")
    private final Integer vantagePointCount;

    /**
     * Number of vantage points where monitor is running.
     *
     * @return the value
     */
    public Integer getVantagePointCount() {
        return vantagePointCount;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
     * types. For other monitor types, it should be set to null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
    private final String scriptId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
     * types. For other monitor types, it should be set to null.
     *
     * @return the value
     */
    public String getScriptId() {
        return scriptId;
    }

    /** Name of the script. */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptName")
    private final String scriptName;

    /**
     * Name of the script.
     *
     * @return the value
     */
    public String getScriptName() {
        return scriptName;
    }

    /** Content type of the script. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final ContentTypes contentType;

    /**
     * Content type of the script.
     *
     * @return the value
     */
    public ContentTypes getContentType() {
        return contentType;
    }

    /** Enables or disables the monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final MonitorStatus status;

    /**
     * Enables or disables the monitor.
     *
     * @return the value
     */
    public MonitorStatus getStatus() {
        return status;
    }

    /**
     * Interval in seconds after the start time when the job should be repeated. Minimum
     * repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and Browser
     * monitors, and 60 seconds for REST monitor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repeatIntervalInSeconds")
    private final Integer repeatIntervalInSeconds;

    /**
     * Interval in seconds after the start time when the job should be repeated. Minimum
     * repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and Browser
     * monitors, and 60 seconds for REST monitor.
     *
     * @return the value
     */
    public Integer getRepeatIntervalInSeconds() {
        return repeatIntervalInSeconds;
    }

    /** If runOnce is enabled, then the monitor will run once. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRunOnce")
    private final Boolean isRunOnce;

    /**
     * If runOnce is enabled, then the monitor will run once.
     *
     * @return the value
     */
    public Boolean getIsRunOnce() {
        return isRunOnce;
    }

    /**
     * Timeout in seconds. If isFailureRetried is true, then timeout cannot be more than 30% of
     * repeatIntervalInSeconds time for monitors. If isFailureRetried is false, then timeout cannot
     * be more than 50% of repeatIntervalInSeconds time for monitors. Also, timeoutInSeconds should
     * be a multiple of 60 for Scripted REST, Scripted Browser and Browser monitors. Monitor will be
     * allowed to run only for timeoutInSeconds time. It would be terminated after that.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Timeout in seconds. If isFailureRetried is true, then timeout cannot be more than 30% of
     * repeatIntervalInSeconds time for monitors. If isFailureRetried is false, then timeout cannot
     * be more than 50% of repeatIntervalInSeconds time for monitors. Also, timeoutInSeconds should
     * be a multiple of 60 for Scripted REST, Scripted Browser and Browser monitors. Monitor will be
     * allowed to run only for timeoutInSeconds time. It would be terminated after that.
     *
     * @return the value
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * Specify the endpoint on which to run the monitor. For BROWSER, REST, NETWORK, DNS and FTP
     * monitor types, target is mandatory. If target is specified in the SCRIPTED_BROWSER monitor
     * type, then the monitor will run the selected script (specified by scriptId in monitor)
     * against the specified target endpoint. If target is not specified in the SCRIPTED_BROWSER
     * monitor type, then the monitor will run the selected script as it is. For NETWORK monitor
     * with TCP protocol, a port needs to be provided along with target. Example: 192.168.0.1:80.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Specify the endpoint on which to run the monitor. For BROWSER, REST, NETWORK, DNS and FTP
     * monitor types, target is mandatory. If target is specified in the SCRIPTED_BROWSER monitor
     * type, then the monitor will run the selected script (specified by scriptId in monitor)
     * against the specified target endpoint. If target is not specified in the SCRIPTED_BROWSER
     * monitor type, then the monitor will run the selected script as it is. For NETWORK monitor
     * with TCP protocol, a port needs to be provided along with target. Example: 192.168.0.1:80.
     *
     * @return the value
     */
    public String getTarget() {
        return target;
    }

    /**
     * List of script parameters. Example: {@code [{"monitorScriptParameter": {"paramName":
     * "userid", "paramValue":"testuser"}, "isSecret": false, "isOverwritten": false}]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptParameters")
    private final java.util.List<MonitorScriptParameterInfo> scriptParameters;

    /**
     * List of script parameters. Example: {@code [{"monitorScriptParameter": {"paramName":
     * "userid", "paramValue":"testuser"}, "isSecret": false, "isOverwritten": false}]}
     *
     * @return the value
     */
    public java.util.List<MonitorScriptParameterInfo> getScriptParameters() {
        return scriptParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final MonitorConfiguration configuration;

    public MonitorConfiguration getConfiguration() {
        return configuration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityConfiguration")
    private final AvailabilityConfiguration availabilityConfiguration;

    public AvailabilityConfiguration getAvailabilityConfiguration() {
        return availabilityConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowSchedule")
    private final MaintenanceWindowSchedule maintenanceWindowSchedule;

    public MaintenanceWindowSchedule getMaintenanceWindowSchedule() {
        return maintenanceWindowSchedule;
    }

    /**
     * The time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-13T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-13T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** If isRunNow is enabled, then the monitor will run immediately. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRunNow")
    private final Boolean isRunNow;

    /**
     * If isRunNow is enabled, then the monitor will run immediately.
     *
     * @return the value
     */
    public Boolean getIsRunNow() {
        return isRunNow;
    }

    /** Scheduling policy to decide the distribution of monitor executions on vantage points. */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingPolicy")
    private final SchedulingPolicy schedulingPolicy;

    /**
     * Scheduling policy to decide the distribution of monitor executions on vantage points.
     *
     * @return the value
     */
    public SchedulingPolicy getSchedulingPolicy() {
        return schedulingPolicy;
    }

    /**
     * Time interval between two runs in round robin batch mode (SchedulingPolicy -
     * BATCHED_ROUND_ROBIN).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchIntervalInSeconds")
    private final Integer batchIntervalInSeconds;

    /**
     * Time interval between two runs in round robin batch mode (SchedulingPolicy -
     * BATCHED_ROUND_ROBIN).
     *
     * @return the value
     */
    public Integer getBatchIntervalInSeconds() {
        return batchIntervalInSeconds;
    }

    /** If enabled, domain name will resolve to an IPv6 address. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIPv6")
    private final Boolean isIPv6;

    /**
     * If enabled, domain name will resolve to an IPv6 address.
     *
     * @return the value
     */
    public Boolean getIsIPv6() {
        return isIPv6;
    }

    /** Name of the user that created the monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * Name of the user that created the monitor.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Name of the user that recently updated the monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
    private final String lastUpdatedBy;

    /**
     * Name of the user that recently updated the monitor.
     *
     * @return the value
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Monitor(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", monitorType=").append(String.valueOf(this.monitorType));
        sb.append(", vantagePoints=").append(String.valueOf(this.vantagePoints));
        sb.append(", vantagePointCount=").append(String.valueOf(this.vantagePointCount));
        sb.append(", scriptId=").append(String.valueOf(this.scriptId));
        sb.append(", scriptName=").append(String.valueOf(this.scriptName));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", repeatIntervalInSeconds=")
                .append(String.valueOf(this.repeatIntervalInSeconds));
        sb.append(", isRunOnce=").append(String.valueOf(this.isRunOnce));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", scriptParameters=").append(String.valueOf(this.scriptParameters));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", availabilityConfiguration=")
                .append(String.valueOf(this.availabilityConfiguration));
        sb.append(", maintenanceWindowSchedule=")
                .append(String.valueOf(this.maintenanceWindowSchedule));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isRunNow=").append(String.valueOf(this.isRunNow));
        sb.append(", schedulingPolicy=").append(String.valueOf(this.schedulingPolicy));
        sb.append(", batchIntervalInSeconds=").append(String.valueOf(this.batchIntervalInSeconds));
        sb.append(", isIPv6=").append(String.valueOf(this.isIPv6));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", lastUpdatedBy=").append(String.valueOf(this.lastUpdatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Monitor)) {
            return false;
        }

        Monitor other = (Monitor) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.monitorType, other.monitorType)
                && java.util.Objects.equals(this.vantagePoints, other.vantagePoints)
                && java.util.Objects.equals(this.vantagePointCount, other.vantagePointCount)
                && java.util.Objects.equals(this.scriptId, other.scriptId)
                && java.util.Objects.equals(this.scriptName, other.scriptName)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.repeatIntervalInSeconds, other.repeatIntervalInSeconds)
                && java.util.Objects.equals(this.isRunOnce, other.isRunOnce)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.scriptParameters, other.scriptParameters)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(
                        this.availabilityConfiguration, other.availabilityConfiguration)
                && java.util.Objects.equals(
                        this.maintenanceWindowSchedule, other.maintenanceWindowSchedule)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isRunNow, other.isRunNow)
                && java.util.Objects.equals(this.schedulingPolicy, other.schedulingPolicy)
                && java.util.Objects.equals(
                        this.batchIntervalInSeconds, other.batchIntervalInSeconds)
                && java.util.Objects.equals(this.isIPv6, other.isIPv6)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.lastUpdatedBy, other.lastUpdatedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.monitorType == null ? 43 : this.monitorType.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePoints == null ? 43 : this.vantagePoints.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePointCount == null ? 43 : this.vantagePointCount.hashCode());
        result = (result * PRIME) + (this.scriptId == null ? 43 : this.scriptId.hashCode());
        result = (result * PRIME) + (this.scriptName == null ? 43 : this.scriptName.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.repeatIntervalInSeconds == null
                                ? 43
                                : this.repeatIntervalInSeconds.hashCode());
        result = (result * PRIME) + (this.isRunOnce == null ? 43 : this.isRunOnce.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptParameters == null ? 43 : this.scriptParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityConfiguration == null
                                ? 43
                                : this.availabilityConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowSchedule == null
                                ? 43
                                : this.maintenanceWindowSchedule.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.isRunNow == null ? 43 : this.isRunNow.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulingPolicy == null ? 43 : this.schedulingPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.batchIntervalInSeconds == null
                                ? 43
                                : this.batchIntervalInSeconds.hashCode());
        result = (result * PRIME) + (this.isIPv6 == null ? 43 : this.isIPv6.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdatedBy == null ? 43 : this.lastUpdatedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
