/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * A managed instance has an agent with the WebLogic Management Service plugin running.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagedInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedInstance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "hostName",
        "serverCount",
        "pluginStatus",
        "timeCreated",
        "timeUpdated",
        "osName",
        "osArch",
        "configuration"
    })
    public ManagedInstance(
            String id,
            String displayName,
            String compartmentId,
            String hostName,
            Integer serverCount,
            String pluginStatus,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String osName,
            String osArch,
            ManagedInstanceConfiguration configuration) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.hostName = hostName;
        this.serverCount = serverCount;
        this.pluginStatus = pluginStatus;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.osName = osName;
        this.osArch = osArch;
        this.configuration = configuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name that does not have to be unique and is changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name that does not have to be unique and is changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The FQDN of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The FQDN of the managed instance.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The number of servers running in the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverCount")
        private Integer serverCount;

        /**
         * The number of servers running in the managed instance.
         *
         * @param serverCount the value to set
         * @return this builder
         */
        public Builder serverCount(Integer serverCount) {
            this.serverCount = serverCount;
            this.__explicitlySet__.add("serverCount");
            return this;
        }
        /** The plugin status of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginStatus")
        private String pluginStatus;

        /**
         * The plugin status of the managed instance.
         *
         * @param pluginStatus the value to set
         * @return this builder
         */
        public Builder pluginStatus(String pluginStatus) {
            this.pluginStatus = pluginStatus;
            this.__explicitlySet__.add("pluginStatus");
            return this;
        }
        /**
         * The date and time the managed instance was first reported (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the managed instance was first reported (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the managed instance was last report (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the managed instance was last report (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The operating system name on the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        /**
         * The operating system name on the managed instance.
         *
         * @param osName the value to set
         * @return this builder
         */
        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }
        /** The operating system architecture on the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("osArch")
        private String osArch;

        /**
         * The operating system architecture on the managed instance.
         *
         * @param osArch the value to set
         * @return this builder
         */
        public Builder osArch(String osArch) {
            this.osArch = osArch;
            this.__explicitlySet__.add("osArch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private ManagedInstanceConfiguration configuration;

        public Builder configuration(ManagedInstanceConfiguration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedInstance build() {
            ManagedInstance model =
                    new ManagedInstance(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.hostName,
                            this.serverCount,
                            this.pluginStatus,
                            this.timeCreated,
                            this.timeUpdated,
                            this.osName,
                            this.osArch,
                            this.configuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedInstance model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("serverCount")) {
                this.serverCount(model.getServerCount());
            }
            if (model.wasPropertyExplicitlySet("pluginStatus")) {
                this.pluginStatus(model.getPluginStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("osName")) {
                this.osName(model.getOsName());
            }
            if (model.wasPropertyExplicitlySet("osArch")) {
                this.osArch(model.getOsArch());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
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
     * managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name that does not have to be unique and is changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name that does not have to be unique and is changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The FQDN of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The FQDN of the managed instance.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The number of servers running in the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverCount")
    private final Integer serverCount;

    /**
     * The number of servers running in the managed instance.
     *
     * @return the value
     */
    public Integer getServerCount() {
        return serverCount;
    }

    /** The plugin status of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginStatus")
    private final String pluginStatus;

    /**
     * The plugin status of the managed instance.
     *
     * @return the value
     */
    public String getPluginStatus() {
        return pluginStatus;
    }

    /**
     * The date and time the managed instance was first reported (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the managed instance was first reported (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the managed instance was last report (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the managed instance was last report (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The operating system name on the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    private final String osName;

    /**
     * The operating system name on the managed instance.
     *
     * @return the value
     */
    public String getOsName() {
        return osName;
    }

    /** The operating system architecture on the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("osArch")
    private final String osArch;

    /**
     * The operating system architecture on the managed instance.
     *
     * @return the value
     */
    public String getOsArch() {
        return osArch;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final ManagedInstanceConfiguration configuration;

    public ManagedInstanceConfiguration getConfiguration() {
        return configuration;
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
        sb.append("ManagedInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", serverCount=").append(String.valueOf(this.serverCount));
        sb.append(", pluginStatus=").append(String.valueOf(this.pluginStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", osName=").append(String.valueOf(this.osName));
        sb.append(", osArch=").append(String.valueOf(this.osArch));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedInstance)) {
            return false;
        }

        ManagedInstance other = (ManagedInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.serverCount, other.serverCount)
                && java.util.Objects.equals(this.pluginStatus, other.pluginStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.osName, other.osName)
                && java.util.Objects.equals(this.osArch, other.osArch)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.serverCount == null ? 43 : this.serverCount.hashCode());
        result = (result * PRIME) + (this.pluginStatus == null ? 43 : this.pluginStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.osName == null ? 43 : this.osName.hashCode());
        result = (result * PRIME) + (this.osArch == null ? 43 : this.osArch.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
