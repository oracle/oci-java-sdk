/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Configures the logging policies for the execution logs of an API Deployment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExecutionLogPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExecutionLogPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "logLevel"})
    public ExecutionLogPolicy(Boolean isEnabled, LogLevel logLevel) {
        super();
        this.isEnabled = isEnabled;
        this.logLevel = logLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables pushing of execution logs to the legacy OCI Object Storage log archival bucket.
         *
         * <p>Oracle recommends using the OCI Logging service to enable, retrieve, and query
         * execution logs for an API Deployment. If there is an active log object for the API
         * Deployment and its category is set to 'execution' in OCI Logging service, the logs will
         * not be uploaded to the legacy OCI Object Storage log archival bucket.
         *
         * <p>Please note that the functionality to push to the legacy OCI Object Storage log
         * archival bucket has been deprecated and will be removed in the future.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables pushing of execution logs to the legacy OCI Object Storage log archival bucket.
         *
         * <p>Oracle recommends using the OCI Logging service to enable, retrieve, and query
         * execution logs for an API Deployment. If there is an active log object for the API
         * Deployment and its category is set to 'execution' in OCI Logging service, the logs will
         * not be uploaded to the legacy OCI Object Storage log archival bucket.
         *
         * <p>Please note that the functionality to push to the legacy OCI Object Storage log
         * archival bucket has been deprecated and will be removed in the future.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Specifies the log level used to control logging output of execution logs. Enabling
         * logging at a given level also enables logging at all higher levels.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
        private LogLevel logLevel;

        /**
         * Specifies the log level used to control logging output of execution logs. Enabling
         * logging at a given level also enables logging at all higher levels.
         *
         * @param logLevel the value to set
         * @return this builder
         */
        public Builder logLevel(LogLevel logLevel) {
            this.logLevel = logLevel;
            this.__explicitlySet__.add("logLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecutionLogPolicy build() {
            ExecutionLogPolicy model = new ExecutionLogPolicy(this.isEnabled, this.logLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecutionLogPolicy model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("logLevel")) {
                this.logLevel(model.getLogLevel());
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
     * Enables pushing of execution logs to the legacy OCI Object Storage log archival bucket.
     *
     * <p>Oracle recommends using the OCI Logging service to enable, retrieve, and query execution
     * logs for an API Deployment. If there is an active log object for the API Deployment and its
     * category is set to 'execution' in OCI Logging service, the logs will not be uploaded to the
     * legacy OCI Object Storage log archival bucket.
     *
     * <p>Please note that the functionality to push to the legacy OCI Object Storage log archival
     * bucket has been deprecated and will be removed in the future.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables pushing of execution logs to the legacy OCI Object Storage log archival bucket.
     *
     * <p>Oracle recommends using the OCI Logging service to enable, retrieve, and query execution
     * logs for an API Deployment. If there is an active log object for the API Deployment and its
     * category is set to 'execution' in OCI Logging service, the logs will not be uploaded to the
     * legacy OCI Object Storage log archival bucket.
     *
     * <p>Please note that the functionality to push to the legacy OCI Object Storage log archival
     * bucket has been deprecated and will be removed in the future.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Specifies the log level used to control logging output of execution logs. Enabling logging at
     * a given level also enables logging at all higher levels.
     */
    public enum LogLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Info("INFO"),
        Warn("WARN"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LogLevel.class);

        private final String value;
        private static java.util.Map<String, LogLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (LogLevel v : LogLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LogLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LogLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the log level used to control logging output of execution logs. Enabling logging at
     * a given level also enables logging at all higher levels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    private final LogLevel logLevel;

    /**
     * Specifies the log level used to control logging output of execution logs. Enabling logging at
     * a given level also enables logging at all higher levels.
     *
     * @return the value
     */
    public LogLevel getLogLevel() {
        return logLevel;
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
        sb.append("ExecutionLogPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", logLevel=").append(String.valueOf(this.logLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecutionLogPolicy)) {
            return false;
        }

        ExecutionLogPolicy other = (ExecutionLogPolicy) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.logLevel, other.logLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.logLevel == null ? 43 : this.logLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
