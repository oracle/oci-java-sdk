/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * OLVM Power management definitions <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmPowerManagement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmPowerManagement
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "agents",
        "isAutomaticPmEnabled",
        "isEnabled",
        "isKDumpDetection",
        "pmProxies",
        "status",
        "type",
        "username"
    })
    public OlvmPowerManagement(
            String address,
            java.util.List<OlvmAgent> agents,
            Boolean isAutomaticPmEnabled,
            Boolean isEnabled,
            Boolean isKDumpDetection,
            java.util.List<OlvmPmProxy> pmProxies,
            Status status,
            String type,
            String username) {
        super();
        this.address = address;
        this.agents = agents;
        this.isAutomaticPmEnabled = isAutomaticPmEnabled;
        this.isEnabled = isEnabled;
        this.isKDumpDetection = isKDumpDetection;
        this.pmProxies = pmProxies;
        this.status = status;
        this.type = type;
        this.username = username;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Address of power management */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * Address of power management
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** Supported sources of random number generator. */
        @com.fasterxml.jackson.annotation.JsonProperty("agents")
        private java.util.List<OlvmAgent> agents;

        /**
         * Supported sources of random number generator.
         *
         * @param agents the value to set
         * @return this builder
         */
        public Builder agents(java.util.List<OlvmAgent> agents) {
            this.agents = agents;
            this.__explicitlySet__.add("agents");
            return this;
        }
        /** Toggles the automated power control of the host in order to save energy. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticPmEnabled")
        private Boolean isAutomaticPmEnabled;

        /**
         * Toggles the automated power control of the host in order to save energy.
         *
         * @param isAutomaticPmEnabled the value to set
         * @return this builder
         */
        public Builder isAutomaticPmEnabled(Boolean isAutomaticPmEnabled) {
            this.isAutomaticPmEnabled = isAutomaticPmEnabled;
            this.__explicitlySet__.add("isAutomaticPmEnabled");
            return this;
        }
        /** Indicates whether power management configuration is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether power management configuration is enabled or disabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** Toggles whether to determine if kdump is running on the host before it is shut down. */
        @com.fasterxml.jackson.annotation.JsonProperty("isKDumpDetection")
        private Boolean isKDumpDetection;

        /**
         * Toggles whether to determine if kdump is running on the host before it is shut down.
         *
         * @param isKDumpDetection the value to set
         * @return this builder
         */
        public Builder isKDumpDetection(Boolean isKDumpDetection) {
            this.isKDumpDetection = isKDumpDetection;
            this.__explicitlySet__.add("isKDumpDetection");
            return this;
        }
        /** Determines the power management proxy. */
        @com.fasterxml.jackson.annotation.JsonProperty("pmProxies")
        private java.util.List<OlvmPmProxy> pmProxies;

        /**
         * Determines the power management proxy.
         *
         * @param pmProxies the value to set
         * @return this builder
         */
        public Builder pmProxies(java.util.List<OlvmPmProxy> pmProxies) {
            this.pmProxies = pmProxies;
            this.__explicitlySet__.add("pmProxies");
            return this;
        }
        /** Determines the power status of the host. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Determines the power status of the host.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Fencing device code. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Fencing device code.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** A valid user name for power management. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * A valid user name for power management.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmPowerManagement build() {
            OlvmPowerManagement model =
                    new OlvmPowerManagement(
                            this.address,
                            this.agents,
                            this.isAutomaticPmEnabled,
                            this.isEnabled,
                            this.isKDumpDetection,
                            this.pmProxies,
                            this.status,
                            this.type,
                            this.username);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmPowerManagement model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("agents")) {
                this.agents(model.getAgents());
            }
            if (model.wasPropertyExplicitlySet("isAutomaticPmEnabled")) {
                this.isAutomaticPmEnabled(model.getIsAutomaticPmEnabled());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isKDumpDetection")) {
                this.isKDumpDetection(model.getIsKDumpDetection());
            }
            if (model.wasPropertyExplicitlySet("pmProxies")) {
                this.pmProxies(model.getPmProxies());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
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

    /** Address of power management */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * Address of power management
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /** Supported sources of random number generator. */
    @com.fasterxml.jackson.annotation.JsonProperty("agents")
    private final java.util.List<OlvmAgent> agents;

    /**
     * Supported sources of random number generator.
     *
     * @return the value
     */
    public java.util.List<OlvmAgent> getAgents() {
        return agents;
    }

    /** Toggles the automated power control of the host in order to save energy. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticPmEnabled")
    private final Boolean isAutomaticPmEnabled;

    /**
     * Toggles the automated power control of the host in order to save energy.
     *
     * @return the value
     */
    public Boolean getIsAutomaticPmEnabled() {
        return isAutomaticPmEnabled;
    }

    /** Indicates whether power management configuration is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether power management configuration is enabled or disabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** Toggles whether to determine if kdump is running on the host before it is shut down. */
    @com.fasterxml.jackson.annotation.JsonProperty("isKDumpDetection")
    private final Boolean isKDumpDetection;

    /**
     * Toggles whether to determine if kdump is running on the host before it is shut down.
     *
     * @return the value
     */
    public Boolean getIsKDumpDetection() {
        return isKDumpDetection;
    }

    /** Determines the power management proxy. */
    @com.fasterxml.jackson.annotation.JsonProperty("pmProxies")
    private final java.util.List<OlvmPmProxy> pmProxies;

    /**
     * Determines the power management proxy.
     *
     * @return the value
     */
    public java.util.List<OlvmPmProxy> getPmProxies() {
        return pmProxies;
    }

    /** Determines the power status of the host. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Off("OFF"),
        On("ON"),
        Unknown("UNKNOWN"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /** Determines the power status of the host. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Determines the power status of the host.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Fencing device code. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Fencing device code.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** A valid user name for power management. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * A valid user name for power management.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
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
        sb.append("OlvmPowerManagement(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", agents=").append(String.valueOf(this.agents));
        sb.append(", isAutomaticPmEnabled=").append(String.valueOf(this.isAutomaticPmEnabled));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isKDumpDetection=").append(String.valueOf(this.isKDumpDetection));
        sb.append(", pmProxies=").append(String.valueOf(this.pmProxies));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmPowerManagement)) {
            return false;
        }

        OlvmPowerManagement other = (OlvmPowerManagement) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.agents, other.agents)
                && java.util.Objects.equals(this.isAutomaticPmEnabled, other.isAutomaticPmEnabled)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isKDumpDetection, other.isKDumpDetection)
                && java.util.Objects.equals(this.pmProxies, other.pmProxies)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.username, other.username)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.agents == null ? 43 : this.agents.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutomaticPmEnabled == null
                                ? 43
                                : this.isAutomaticPmEnabled.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isKDumpDetection == null ? 43 : this.isKDumpDetection.hashCode());
        result = (result * PRIME) + (this.pmProxies == null ? 43 : this.pmProxies.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
