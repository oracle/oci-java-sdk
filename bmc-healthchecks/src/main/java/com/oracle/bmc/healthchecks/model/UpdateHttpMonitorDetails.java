/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The request body used to update an HTTP monitor.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateHttpMonitorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateHttpMonitorDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targets",
        "vantagePointNames",
        "port",
        "timeoutInSeconds",
        "protocol",
        "method",
        "path",
        "headers",
        "displayName",
        "intervalInSeconds",
        "isEnabled",
        "freeformTags",
        "definedTags"
    })
    public UpdateHttpMonitorDetails(
            java.util.List<String> targets,
            java.util.List<String> vantagePointNames,
            Integer port,
            Integer timeoutInSeconds,
            HttpProbeProtocol protocol,
            HttpProbeMethod method,
            String path,
            java.util.Map<String, String> headers,
            String displayName,
            Integer intervalInSeconds,
            Boolean isEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.targets = targets;
        this.vantagePointNames = vantagePointNames;
        this.port = port;
        this.timeoutInSeconds = timeoutInSeconds;
        this.protocol = protocol;
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.displayName = displayName;
        this.intervalInSeconds = intervalInSeconds;
        this.isEnabled = isEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of targets (hostnames or IP addresses) of the probe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<String> targets;

        /**
         * A list of targets (hostnames or IP addresses) of the probe.
         * @param targets the value to set
         * @return this builder
         **/
        public Builder targets(java.util.List<String> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }
        /**
         * A list of names of vantage points from which to execute the probe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointNames")
        private java.util.List<String> vantagePointNames;

        /**
         * A list of names of vantage points from which to execute the probe.
         * @param vantagePointNames the value to set
         * @return this builder
         **/
        public Builder vantagePointNames(java.util.List<String> vantagePointNames) {
            this.vantagePointNames = vantagePointNames;
            this.__explicitlySet__.add("vantagePointNames");
            return this;
        }
        /**
         * The port on which to probe endpoints. If unspecified, probes will use the
         * default port of their protocol.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port on which to probe endpoints. If unspecified, probes will use the
         * default port of their protocol.
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The probe timeout in seconds. Valid values: 10, 20, 30, and 60.
         * The probe timeout must be less than or equal to {@code intervalInSeconds} for monitors.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * The probe timeout in seconds. Valid values: 10, 20, 30, and 60.
         * The probe timeout must be less than or equal to {@code intervalInSeconds} for monitors.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private HttpProbeProtocol protocol;

        public Builder protocol(HttpProbeProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("method")
        private HttpProbeMethod method;

        public Builder method(HttpProbeMethod method) {
            this.method = method;
            this.__explicitlySet__.add("method");
            return this;
        }
        /**
         * The optional URL path to probe, including query parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The optional URL path to probe, including query parameters.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * A dictionary of HTTP request headers.
         * <p>
         *Note:* Monitors and probes do not support the use of the {@code Authorization} HTTP header.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.Map<String, String> headers;

        /**
         * A dictionary of HTTP request headers.
         * <p>
         *Note:* Monitors and probes do not support the use of the {@code Authorization} HTTP header.
         *
         * @param headers the value to set
         * @return this builder
         **/
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }
        /**
         * A user-friendly and mutable name suitable for display in a user interface.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly and mutable name suitable for display in a user interface.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The monitor interval in seconds. Valid values: 10, 30, and 60.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
        private Integer intervalInSeconds;

        /**
         * The monitor interval in seconds. Valid values: 10, 30, and 60.
         *
         * @param intervalInSeconds the value to set
         * @return this builder
         **/
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            this.__explicitlySet__.add("intervalInSeconds");
            return this;
        }
        /**
         * Enables or disables the monitor. Set to 'true' to launch monitoring.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables or disables the monitor. Set to 'true' to launch monitoring.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace.  For more information,
         * see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace.  For more information,
         * see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public UpdateHttpMonitorDetails build() {
            UpdateHttpMonitorDetails __instance__ =
                    new UpdateHttpMonitorDetails(
                            targets,
                            vantagePointNames,
                            port,
                            timeoutInSeconds,
                            protocol,
                            method,
                            path,
                            headers,
                            displayName,
                            intervalInSeconds,
                            isEnabled,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateHttpMonitorDetails o) {
            Builder copiedBuilder =
                    targets(o.getTargets())
                            .vantagePointNames(o.getVantagePointNames())
                            .port(o.getPort())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
                            .protocol(o.getProtocol())
                            .method(o.getMethod())
                            .path(o.getPath())
                            .headers(o.getHeaders())
                            .displayName(o.getDisplayName())
                            .intervalInSeconds(o.getIntervalInSeconds())
                            .isEnabled(o.getIsEnabled())
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
     * A list of targets (hostnames or IP addresses) of the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<String> targets;

    /**
     * A list of targets (hostnames or IP addresses) of the probe.
     * @return the value
     **/
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * A list of names of vantage points from which to execute the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointNames")
    private final java.util.List<String> vantagePointNames;

    /**
     * A list of names of vantage points from which to execute the probe.
     * @return the value
     **/
    public java.util.List<String> getVantagePointNames() {
        return vantagePointNames;
    }

    /**
     * The port on which to probe endpoints. If unspecified, probes will use the
     * default port of their protocol.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port on which to probe endpoints. If unspecified, probes will use the
     * default port of their protocol.
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * The probe timeout in seconds. Valid values: 10, 20, 30, and 60.
     * The probe timeout must be less than or equal to {@code intervalInSeconds} for monitors.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * The probe timeout in seconds. Valid values: 10, 20, 30, and 60.
     * The probe timeout must be less than or equal to {@code intervalInSeconds} for monitors.
     *
     * @return the value
     **/
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final HttpProbeProtocol protocol;

    public HttpProbeProtocol getProtocol() {
        return protocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("method")
    private final HttpProbeMethod method;

    public HttpProbeMethod getMethod() {
        return method;
    }

    /**
     * The optional URL path to probe, including query parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The optional URL path to probe, including query parameters.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * A dictionary of HTTP request headers.
     * <p>
     *Note:* Monitors and probes do not support the use of the {@code Authorization} HTTP header.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.Map<String, String> headers;

    /**
     * A dictionary of HTTP request headers.
     * <p>
     *Note:* Monitors and probes do not support the use of the {@code Authorization} HTTP header.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * A user-friendly and mutable name suitable for display in a user interface.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly and mutable name suitable for display in a user interface.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The monitor interval in seconds. Valid values: 10, 30, and 60.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
    private final Integer intervalInSeconds;

    /**
     * The monitor interval in seconds. Valid values: 10, 30, and 60.
     *
     * @return the value
     **/
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /**
     * Enables or disables the monitor. Set to 'true' to launch monitoring.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables or disables the monitor. Set to 'true' to launch monitoring.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace.  For more information,
     * see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace.  For more information,
     * see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("UpdateHttpMonitorDetails(");
        sb.append("targets=").append(String.valueOf(this.targets));
        sb.append(", vantagePointNames=").append(String.valueOf(this.vantagePointNames));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", method=").append(String.valueOf(this.method));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", intervalInSeconds=").append(String.valueOf(this.intervalInSeconds));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
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
        if (!(o instanceof UpdateHttpMonitorDetails)) {
            return false;
        }

        UpdateHttpMonitorDetails other = (UpdateHttpMonitorDetails) o;
        return java.util.Objects.equals(this.targets, other.targets)
                && java.util.Objects.equals(this.vantagePointNames, other.vantagePointNames)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.method, other.method)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.intervalInSeconds, other.intervalInSeconds)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePointNames == null ? 43 : this.vantagePointNames.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.method == null ? 43 : this.method.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInSeconds == null ? 43 : this.intervalInSeconds.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
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
