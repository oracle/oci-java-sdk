/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MonitorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitorSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "monitorType",
        "vantagePoints",
        "vantagePointCount",
        "scriptId",
        "scriptName",
        "status",
        "repeatIntervalInSeconds",
        "isRunOnce",
        "timeoutInSeconds",
        "target",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public MonitorSummary(
            String id,
            String displayName,
            MonitorTypes monitorType,
            java.util.List<VantagePointInfo> vantagePoints,
            Integer vantagePointCount,
            String scriptId,
            String scriptName,
            MonitorStatus status,
            Integer repeatIntervalInSeconds,
            Boolean isRunOnce,
            Integer timeoutInSeconds,
            String target,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.monitorType = monitorType;
        this.vantagePoints = vantagePoints;
        this.vantagePointCount = vantagePointCount;
        this.scriptId = scriptId;
        this.scriptName = scriptName;
        this.status = status;
        this.repeatIntervalInSeconds = repeatIntervalInSeconds;
        this.isRunOnce = isRunOnce;
        this.timeoutInSeconds = timeoutInSeconds;
        this.target = target;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the monitor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the monitor.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The type of monitor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
        private MonitorTypes monitorType;

        /**
         * The type of monitor.
         * @param monitorType the value to set
         * @return this builder
         **/
        public Builder monitorType(MonitorTypes monitorType) {
            this.monitorType = monitorType;
            this.__explicitlySet__.add("monitorType");
            return this;
        }
        /**
         * List of public and dedicated vantage points where the monitor is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
        private java.util.List<VantagePointInfo> vantagePoints;

        /**
         * List of public and dedicated vantage points where the monitor is running.
         * @param vantagePoints the value to set
         * @return this builder
         **/
        public Builder vantagePoints(java.util.List<VantagePointInfo> vantagePoints) {
            this.vantagePoints = vantagePoints;
            this.__explicitlySet__.add("vantagePoints");
            return this;
        }
        /**
         * Number of vantage points where monitor is running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointCount")
        private Integer vantagePointCount;

        /**
         * Number of vantage points where monitor is running.
         * @param vantagePointCount the value to set
         * @return this builder
         **/
        public Builder vantagePointCount(Integer vantagePointCount) {
            this.vantagePointCount = vantagePointCount;
            this.__explicitlySet__.add("vantagePointCount");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
         * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
        private String scriptId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
         * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
         *
         * @param scriptId the value to set
         * @return this builder
         **/
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            this.__explicitlySet__.add("scriptId");
            return this;
        }
        /**
         * Name of the script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scriptName")
        private String scriptName;

        /**
         * Name of the script.
         * @param scriptName the value to set
         * @return this builder
         **/
        public Builder scriptName(String scriptName) {
            this.scriptName = scriptName;
            this.__explicitlySet__.add("scriptName");
            return this;
        }
        /**
         * Enables or disables the monitor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private MonitorStatus status;

        /**
         * Enables or disables the monitor.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(MonitorStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Interval in seconds after the start time when the job should be repeated.
         * Minimum repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and Browser monitors, and 60 seconds for REST monitor.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repeatIntervalInSeconds")
        private Integer repeatIntervalInSeconds;

        /**
         * Interval in seconds after the start time when the job should be repeated.
         * Minimum repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and Browser monitors, and 60 seconds for REST monitor.
         *
         * @param repeatIntervalInSeconds the value to set
         * @return this builder
         **/
        public Builder repeatIntervalInSeconds(Integer repeatIntervalInSeconds) {
            this.repeatIntervalInSeconds = repeatIntervalInSeconds;
            this.__explicitlySet__.add("repeatIntervalInSeconds");
            return this;
        }
        /**
         * If runOnce is enabled, then the monitor will run once.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRunOnce")
        private Boolean isRunOnce;

        /**
         * If runOnce is enabled, then the monitor will run once.
         * @param isRunOnce the value to set
         * @return this builder
         **/
        public Builder isRunOnce(Boolean isRunOnce) {
            this.isRunOnce = isRunOnce;
            this.__explicitlySet__.add("isRunOnce");
            return this;
        }
        /**
         * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors.
         * Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted Browser and Browser monitors.
         * Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors.
         * Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted Browser and Browser monitors.
         * Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }
        /**
         * Specify the endpoint on which to run the monitor.
         * For BROWSER and REST monitor types, target is mandatory.
         * If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint.
         * If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * Specify the endpoint on which to run the monitor.
         * For BROWSER and REST monitor types, target is mandatory.
         * If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint.
         * If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
         *
         * @param target the value to set
         * @return this builder
         **/
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /**
         * The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-12T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-12T22:47:12.613Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-13T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2020-02-13T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
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
                            isRunOnce,
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
                            .isRunOnce(o.getIsRunOnce())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the monitor.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitorType")
    private final MonitorTypes monitorType;

    /**
     * The type of monitor.
     * @return the value
     **/
    public MonitorTypes getMonitorType() {
        return monitorType;
    }

    /**
     * List of public and dedicated vantage points where the monitor is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePoints")
    private final java.util.List<VantagePointInfo> vantagePoints;

    /**
     * List of public and dedicated vantage points where the monitor is running.
     * @return the value
     **/
    public java.util.List<VantagePointInfo> getVantagePoints() {
        return vantagePoints;
    }

    /**
     * Number of vantage points where monitor is running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointCount")
    private final Integer vantagePointCount;

    /**
     * Number of vantage points where monitor is running.
     * @return the value
     **/
    public Integer getVantagePointCount() {
        return vantagePointCount;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
     * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptId")
    private final String scriptId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
     * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     *
     * @return the value
     **/
    public String getScriptId() {
        return scriptId;
    }

    /**
     * Name of the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptName")
    private final String scriptName;

    /**
     * Name of the script.
     * @return the value
     **/
    public String getScriptName() {
        return scriptName;
    }

    /**
     * Enables or disables the monitor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final MonitorStatus status;

    /**
     * Enables or disables the monitor.
     * @return the value
     **/
    public MonitorStatus getStatus() {
        return status;
    }

    /**
     * Interval in seconds after the start time when the job should be repeated.
     * Minimum repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and Browser monitors, and 60 seconds for REST monitor.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatIntervalInSeconds")
    private final Integer repeatIntervalInSeconds;

    /**
     * Interval in seconds after the start time when the job should be repeated.
     * Minimum repeatIntervalInSeconds should be 300 seconds for Scripted REST, Scripted Browser and Browser monitors, and 60 seconds for REST monitor.
     *
     * @return the value
     **/
    public Integer getRepeatIntervalInSeconds() {
        return repeatIntervalInSeconds;
    }

    /**
     * If runOnce is enabled, then the monitor will run once.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRunOnce")
    private final Boolean isRunOnce;

    /**
     * If runOnce is enabled, then the monitor will run once.
     * @return the value
     **/
    public Boolean getIsRunOnce() {
        return isRunOnce;
    }

    /**
     * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors.
     * Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted Browser and Browser monitors.
     * Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors.
     * Also, timeoutInSeconds should be a multiple of 60 for Scripted REST, Scripted Browser and Browser monitors.
     * Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
     *
     * @return the value
     **/
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * Specify the endpoint on which to run the monitor.
     * For BROWSER and REST monitor types, target is mandatory.
     * If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint.
     * If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * Specify the endpoint on which to run the monitor.
     * For BROWSER and REST monitor types, target is mandatory.
     * If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint.
     * If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
     *
     * @return the value
     **/
    public String getTarget() {
        return target;
    }

    /**
     * The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-13T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-13T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MonitorSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", monitorType=").append(String.valueOf(this.monitorType));
        sb.append(", vantagePoints=").append(String.valueOf(this.vantagePoints));
        sb.append(", vantagePointCount=").append(String.valueOf(this.vantagePointCount));
        sb.append(", scriptId=").append(String.valueOf(this.scriptId));
        sb.append(", scriptName=").append(String.valueOf(this.scriptName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", repeatIntervalInSeconds=")
                .append(String.valueOf(this.repeatIntervalInSeconds));
        sb.append(", isRunOnce=").append(String.valueOf(this.isRunOnce));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorSummary)) {
            return false;
        }

        MonitorSummary other = (MonitorSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.monitorType, other.monitorType)
                && java.util.Objects.equals(this.vantagePoints, other.vantagePoints)
                && java.util.Objects.equals(this.vantagePointCount, other.vantagePointCount)
                && java.util.Objects.equals(this.scriptId, other.scriptId)
                && java.util.Objects.equals(this.scriptName, other.scriptName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(
                        this.repeatIntervalInSeconds, other.repeatIntervalInSeconds)
                && java.util.Objects.equals(this.isRunOnce, other.isRunOnce)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
