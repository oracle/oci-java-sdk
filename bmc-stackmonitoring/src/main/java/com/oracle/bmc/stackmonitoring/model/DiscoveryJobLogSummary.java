/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Log of a specific job <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiscoveryJobLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveryJobLogSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "logType", "logMessage", "timeCreated", "systemTags"})
    public DiscoveryJobLogSummary(
            String id,
            LogType logType,
            String logMessage,
            java.util.Date timeCreated,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.logType = logType;
        this.logMessage = logMessage;
        this.timeCreated = timeCreated;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of Discovery job */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of Discovery job
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Type of log (INFO, WARNING, ERROR or SUCCESS) */
        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private LogType logType;

        /**
         * Type of log (INFO, WARNING, ERROR or SUCCESS)
         *
         * @param logType the value to set
         * @return this builder
         */
        public Builder logType(LogType logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }
        /** Log message */
        @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
        private String logMessage;

        /**
         * Log message
         *
         * @param logMessage the value to set
         * @return this builder
         */
        public Builder logMessage(String logMessage) {
            this.logMessage = logMessage;
            this.__explicitlySet__.add("logMessage");
            return this;
        }
        /** Time the Job log was created */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the Job log was created
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveryJobLogSummary build() {
            DiscoveryJobLogSummary model =
                    new DiscoveryJobLogSummary(
                            this.id,
                            this.logType,
                            this.logMessage,
                            this.timeCreated,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryJobLogSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("logType")) {
                this.logType(model.getLogType());
            }
            if (model.wasPropertyExplicitlySet("logMessage")) {
                this.logMessage(model.getLogMessage());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of Discovery job */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of Discovery job
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Type of log (INFO, WARNING, ERROR or SUCCESS) */
    public enum LogType implements com.oracle.bmc.http.internal.BmcEnum {
        Info("INFO"),
        Warning("WARNING"),
        Error("ERROR"),
        Success("SUCCESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LogType.class);

        private final String value;
        private static java.util.Map<String, LogType> map;

        static {
            map = new java.util.HashMap<>();
            for (LogType v : LogType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LogType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of log (INFO, WARNING, ERROR or SUCCESS) */
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final LogType logType;

    /**
     * Type of log (INFO, WARNING, ERROR or SUCCESS)
     *
     * @return the value
     */
    public LogType getLogType() {
        return logType;
    }

    /** Log message */
    @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
    private final String logMessage;

    /**
     * Log message
     *
     * @return the value
     */
    public String getLogMessage() {
        return logMessage;
    }

    /** Time the Job log was created */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the Job log was created
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("DiscoveryJobLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", logMessage=").append(String.valueOf(this.logMessage));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryJobLogSummary)) {
            return false;
        }

        DiscoveryJobLogSummary other = (DiscoveryJobLogSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.logMessage, other.logMessage)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result = (result * PRIME) + (this.logMessage == null ? 43 : this.logMessage.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
