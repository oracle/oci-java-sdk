/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The agent plugin
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Plugin.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Plugin extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "status", "lastUpdateTime", "message"})
    public Plugin(
            String name,
            String version,
            String status,
            java.util.Date lastUpdateTime,
            String message) {
        super();
        this.name = name;
        this.version = version;
        this.status = status;
        this.lastUpdateTime = lastUpdateTime;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The plugin name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The plugin name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The plugin version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The plugin version
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The plugin status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The plugin status
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The last update time of the plugin
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTime")
        private java.util.Date lastUpdateTime;

        /**
         * The last update time of the plugin
         * @param lastUpdateTime the value to set
         * @return this builder
         **/
        public Builder lastUpdateTime(java.util.Date lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            this.__explicitlySet__.add("lastUpdateTime");
            return this;
        }
        /**
         * The optional message from the agent plugin
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The optional message from the agent plugin
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Plugin build() {
            Plugin model =
                    new Plugin(
                            this.name,
                            this.version,
                            this.status,
                            this.lastUpdateTime,
                            this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Plugin model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lastUpdateTime")) {
                this.lastUpdateTime(model.getLastUpdateTime());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            return this;
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
     * The plugin name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The plugin name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The plugin version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The plugin version
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The plugin status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The plugin status
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * The last update time of the plugin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTime")
    private final java.util.Date lastUpdateTime;

    /**
     * The last update time of the plugin
     * @return the value
     **/
    public java.util.Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * The optional message from the agent plugin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The optional message from the agent plugin
     * @return the value
     **/
    public String getMessage() {
        return message;
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
        sb.append("Plugin(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lastUpdateTime=").append(String.valueOf(this.lastUpdateTime));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Plugin)) {
            return false;
        }

        Plugin other = (Plugin) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lastUpdateTime, other.lastUpdateTime)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdateTime == null ? 43 : this.lastUpdateTime.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
