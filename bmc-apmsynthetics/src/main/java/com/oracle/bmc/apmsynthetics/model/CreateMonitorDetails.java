/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the request body used to create a new monitor. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMonitorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateMonitorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "monitorType",
        "vantagePoints",
        "scriptId",
        "status",
        "repeatIntervalInSeconds",
        "isRunOnce",
        "timeoutInSeconds",
        "target",
        "scriptParameters",
        "configuration",
        "freeformTags",
        "definedTags",
        "isRunNow",
        "schedulingPolicy",
        "batchIntervalInSeconds"
    })
    public CreateMonitorDetails(
            String displayName,
            MonitorTypes monitorType,
            java.util.List<String> vantagePoints,
            String scriptId,
            MonitorStatus status,
            Integer repeatIntervalInSeconds,
            Boolean isRunOnce,
            Integer timeoutInSeconds,
            String target,
            java.util.List<MonitorScriptParameter> scriptParameters,
            MonitorConfiguration configuration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isRunNow,
            SchedulingPolicy schedulingPolicy,
            Integer batchIntervalInSeconds) {
        super();
        this.displayName = displayName;
        this.monitorType = monitorType;
        this.vantagePoints = vantagePoints;
        this.scriptId = scriptId;
        this.status = status;
        this.repeatIntervalInSeconds = repeatIntervalInSeconds;
        this.isRunOnce = isRunOnce;
        this.timeoutInSeconds = timeoutInSeconds;
        this.target = target;
        this.scriptParameters = scriptParameters;
        this.configuration = configuration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isRunNow = isRunNow;
        this.schedulingPolicy = schedulingPolicy;
        this.batchIntervalInSeconds = batchIntervalInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * A list of public and dedicated vantage points from which to execute the monitor. Use
         * /publicVantagePoints to fetch public vantage points, and /dedicatedVantagePoints to fetch
         * dedicated vantage points.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
        private java.util.List<String> vantagePoints;

        /**
         * A list of public and dedicated vantage points from which to execute the monitor. Use
         * /publicVantagePoints to fetch public vantage points, and /dedicatedVantagePoints to fetch
         * dedicated vantage points.
         *
         * @param vantagePoints the value to set
         * @return this builder
         */
        public Builder vantagePoints(java.util.List<String> vantagePoints) {
            this.vantagePoints = vantagePoints;
            this.__explicitlySet__.add("vantagePoints");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
         * types. For other monitor types, it should be set to null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
        private String scriptId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
         * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for
         * monitors. Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted
         * Browser and Browser monitors. Monitor will be allowed to run only for timeoutInSeconds
         * time. It would be terminated after that.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for
         * monitors. Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted
         * Browser and Browser monitors. Monitor will be allowed to run only for timeoutInSeconds
         * time. It would be terminated after that.
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
         * Specify the endpoint on which to run the monitor. For BROWSER and REST monitor types,
         * target is mandatory. If target is specified in the SCRIPTED_BROWSER monitor type, then
         * the monitor will run the selected script (specified by scriptId in monitor) against the
         * specified target endpoint. If target is not specified in the SCRIPTED_BROWSER monitor
         * type, then the monitor will run the selected script as it is.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Specify the endpoint on which to run the monitor. For BROWSER and REST monitor types,
         * target is mandatory. If target is specified in the SCRIPTED_BROWSER monitor type, then
         * the monitor will run the selected script (specified by scriptId in monitor) against the
         * specified target endpoint. If target is not specified in the SCRIPTED_BROWSER monitor
         * type, then the monitor will run the selected script as it is.
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
         * List of script parameters in the monitor. This is valid only for SCRIPTED_BROWSER and
         * SCRIPTED_REST monitor types. For other monitor types, it should be set to null. Example:
         * {@code [{"paramName": "userid", "paramValue":"testuser"}]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scriptParameters")
        private java.util.List<MonitorScriptParameter> scriptParameters;

        /**
         * List of script parameters in the monitor. This is valid only for SCRIPTED_BROWSER and
         * SCRIPTED_REST monitor types. For other monitor types, it should be set to null. Example:
         * {@code [{"paramName": "userid", "paramValue":"testuser"}]}
         *
         * @param scriptParameters the value to set
         * @return this builder
         */
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
        /** If isRunNow is enabled, then the monitor will run now. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRunNow")
        private Boolean isRunNow;

        /**
         * If isRunNow is enabled, then the monitor will run now.
         *
         * @param isRunNow the value to set
         * @return this builder
         */
        public Builder isRunNow(Boolean isRunNow) {
            this.isRunNow = isRunNow;
            this.__explicitlySet__.add("isRunNow");
            return this;
        }
        /** Scheduling policy on Vantage points. */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulingPolicy")
        private SchedulingPolicy schedulingPolicy;

        /**
         * Scheduling policy on Vantage points.
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
         * Time interval between 2 runs in round robin batch mode (*SchedulingPolicy -
         * BATCHED_ROUND_ROBIN).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("batchIntervalInSeconds")
        private Integer batchIntervalInSeconds;

        /**
         * Time interval between 2 runs in round robin batch mode (*SchedulingPolicy -
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMonitorDetails build() {
            CreateMonitorDetails model =
                    new CreateMonitorDetails(
                            this.displayName,
                            this.monitorType,
                            this.vantagePoints,
                            this.scriptId,
                            this.status,
                            this.repeatIntervalInSeconds,
                            this.isRunOnce,
                            this.timeoutInSeconds,
                            this.target,
                            this.scriptParameters,
                            this.configuration,
                            this.freeformTags,
                            this.definedTags,
                            this.isRunNow,
                            this.schedulingPolicy,
                            this.batchIntervalInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMonitorDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("monitorType")) {
                this.monitorType(model.getMonitorType());
            }
            if (model.wasPropertyExplicitlySet("vantagePoints")) {
                this.vantagePoints(model.getVantagePoints());
            }
            if (model.wasPropertyExplicitlySet("scriptId")) {
                this.scriptId(model.getScriptId());
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

    /**
     * A list of public and dedicated vantage points from which to execute the monitor. Use
     * /publicVantagePoints to fetch public vantage points, and /dedicatedVantagePoints to fetch
     * dedicated vantage points.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
    private final java.util.List<String> vantagePoints;

    /**
     * A list of public and dedicated vantage points from which to execute the monitor. Use
     * /publicVantagePoints to fetch public vantage points, and /dedicatedVantagePoints to fetch
     * dedicated vantage points.
     *
     * @return the value
     */
    public java.util.List<String> getVantagePoints() {
        return vantagePoints;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
     * types. For other monitor types, it should be set to null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
    private final String scriptId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
     * types. For other monitor types, it should be set to null.
     *
     * @return the value
     */
    public String getScriptId() {
        return scriptId;
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
     * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for
     * monitors. Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted
     * Browser and Browser monitors. Monitor will be allowed to run only for timeoutInSeconds time.
     * It would be terminated after that.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for
     * monitors. Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted
     * Browser and Browser monitors. Monitor will be allowed to run only for timeoutInSeconds time.
     * It would be terminated after that.
     *
     * @return the value
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * Specify the endpoint on which to run the monitor. For BROWSER and REST monitor types, target
     * is mandatory. If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor
     * will run the selected script (specified by scriptId in monitor) against the specified target
     * endpoint. If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor
     * will run the selected script as it is.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Specify the endpoint on which to run the monitor. For BROWSER and REST monitor types, target
     * is mandatory. If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor
     * will run the selected script (specified by scriptId in monitor) against the specified target
     * endpoint. If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor
     * will run the selected script as it is.
     *
     * @return the value
     */
    public String getTarget() {
        return target;
    }

    /**
     * List of script parameters in the monitor. This is valid only for SCRIPTED_BROWSER and
     * SCRIPTED_REST monitor types. For other monitor types, it should be set to null. Example:
     * {@code [{"paramName": "userid", "paramValue":"testuser"}]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptParameters")
    private final java.util.List<MonitorScriptParameter> scriptParameters;

    /**
     * List of script parameters in the monitor. This is valid only for SCRIPTED_BROWSER and
     * SCRIPTED_REST monitor types. For other monitor types, it should be set to null. Example:
     * {@code [{"paramName": "userid", "paramValue":"testuser"}]}
     *
     * @return the value
     */
    public java.util.List<MonitorScriptParameter> getScriptParameters() {
        return scriptParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final MonitorConfiguration configuration;

    public MonitorConfiguration getConfiguration() {
        return configuration;
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

    /** If isRunNow is enabled, then the monitor will run now. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRunNow")
    private final Boolean isRunNow;

    /**
     * If isRunNow is enabled, then the monitor will run now.
     *
     * @return the value
     */
    public Boolean getIsRunNow() {
        return isRunNow;
    }

    /** Scheduling policy on Vantage points. */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingPolicy")
    private final SchedulingPolicy schedulingPolicy;

    /**
     * Scheduling policy on Vantage points.
     *
     * @return the value
     */
    public SchedulingPolicy getSchedulingPolicy() {
        return schedulingPolicy;
    }

    /**
     * Time interval between 2 runs in round robin batch mode (*SchedulingPolicy -
     * BATCHED_ROUND_ROBIN).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("batchIntervalInSeconds")
    private final Integer batchIntervalInSeconds;

    /**
     * Time interval between 2 runs in round robin batch mode (*SchedulingPolicy -
     * BATCHED_ROUND_ROBIN).
     *
     * @return the value
     */
    public Integer getBatchIntervalInSeconds() {
        return batchIntervalInSeconds;
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
        sb.append("CreateMonitorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", monitorType=").append(String.valueOf(this.monitorType));
        sb.append(", vantagePoints=").append(String.valueOf(this.vantagePoints));
        sb.append(", scriptId=").append(String.valueOf(this.scriptId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", repeatIntervalInSeconds=")
                .append(String.valueOf(this.repeatIntervalInSeconds));
        sb.append(", isRunOnce=").append(String.valueOf(this.isRunOnce));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", scriptParameters=").append(String.valueOf(this.scriptParameters));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isRunNow=").append(String.valueOf(this.isRunNow));
        sb.append(", schedulingPolicy=").append(String.valueOf(this.schedulingPolicy));
        sb.append(", batchIntervalInSeconds=").append(String.valueOf(this.batchIntervalInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMonitorDetails)) {
            return false;
        }

        CreateMonitorDetails other = (CreateMonitorDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.monitorType, other.monitorType)
                && java.util.Objects.equals(this.vantagePoints, other.vantagePoints)
                && java.util.Objects.equals(this.scriptId, other.scriptId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.repeatIntervalInSeconds, other.repeatIntervalInSeconds)
                && java.util.Objects.equals(this.isRunOnce, other.isRunOnce)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.scriptParameters, other.scriptParameters)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isRunNow, other.isRunNow)
                && java.util.Objects.equals(this.schedulingPolicy, other.schedulingPolicy)
                && java.util.Objects.equals(
                        this.batchIntervalInSeconds, other.batchIntervalInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.monitorType == null ? 43 : this.monitorType.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePoints == null ? 43 : this.vantagePoints.hashCode());
        result = (result * PRIME) + (this.scriptId == null ? 43 : this.scriptId.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
