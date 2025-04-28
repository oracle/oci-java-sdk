/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The agent plugin information <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentPluginSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceAgentPluginSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "status", "timeLastUpdatedUtc"})
    public InstanceAgentPluginSummary(
            String name, Status status, java.util.Date timeLastUpdatedUtc) {
        super();
        this.name = name;
        this.status = status;
        this.timeLastUpdatedUtc = timeLastUpdatedUtc;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The plugin name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The plugin name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The plugin status Specified the plugin state on the instance * {@code RUNNING} - The
         * plugin is in running state * {@code STOPPED} - The plugin is in stopped state * {@code
         * NOT_SUPPORTED} - The plugin is not supported on this platform * {@code INVALID} - The
         * plugin state is not recognizable by the service
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The plugin status Specified the plugin state on the instance * {@code RUNNING} - The
         * plugin is in running state * {@code STOPPED} - The plugin is in stopped state * {@code
         * NOT_SUPPORTED} - The plugin is not supported on this platform * {@code INVALID} - The
         * plugin state is not recognizable by the service
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The last update time of the plugin in UTC */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdatedUtc")
        private java.util.Date timeLastUpdatedUtc;

        /**
         * The last update time of the plugin in UTC
         *
         * @param timeLastUpdatedUtc the value to set
         * @return this builder
         */
        public Builder timeLastUpdatedUtc(java.util.Date timeLastUpdatedUtc) {
            this.timeLastUpdatedUtc = timeLastUpdatedUtc;
            this.__explicitlySet__.add("timeLastUpdatedUtc");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentPluginSummary build() {
            InstanceAgentPluginSummary model =
                    new InstanceAgentPluginSummary(this.name, this.status, this.timeLastUpdatedUtc);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentPluginSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeLastUpdatedUtc")) {
                this.timeLastUpdatedUtc(model.getTimeLastUpdatedUtc());
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

    /** The plugin name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The plugin name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The plugin status Specified the plugin state on the instance * {@code RUNNING} - The plugin
     * is in running state * {@code STOPPED} - The plugin is in stopped state * {@code
     * NOT_SUPPORTED} - The plugin is not supported on this platform * {@code INVALID} - The plugin
     * state is not recognizable by the service
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Running("RUNNING"),
        Stopped("STOPPED"),
        NotSupported("NOT_SUPPORTED"),
        Invalid("INVALID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

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
     * The plugin status Specified the plugin state on the instance * {@code RUNNING} - The plugin
     * is in running state * {@code STOPPED} - The plugin is in stopped state * {@code
     * NOT_SUPPORTED} - The plugin is not supported on this platform * {@code INVALID} - The plugin
     * state is not recognizable by the service
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The plugin status Specified the plugin state on the instance * {@code RUNNING} - The plugin
     * is in running state * {@code STOPPED} - The plugin is in stopped state * {@code
     * NOT_SUPPORTED} - The plugin is not supported on this platform * {@code INVALID} - The plugin
     * state is not recognizable by the service
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The last update time of the plugin in UTC */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdatedUtc")
    private final java.util.Date timeLastUpdatedUtc;

    /**
     * The last update time of the plugin in UTC
     *
     * @return the value
     */
    public java.util.Date getTimeLastUpdatedUtc() {
        return timeLastUpdatedUtc;
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
        sb.append("InstanceAgentPluginSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeLastUpdatedUtc=").append(String.valueOf(this.timeLastUpdatedUtc));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentPluginSummary)) {
            return false;
        }

        InstanceAgentPluginSummary other = (InstanceAgentPluginSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeLastUpdatedUtc, other.timeLastUpdatedUtc)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdatedUtc == null
                                ? 43
                                : this.timeLastUpdatedUtc.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
