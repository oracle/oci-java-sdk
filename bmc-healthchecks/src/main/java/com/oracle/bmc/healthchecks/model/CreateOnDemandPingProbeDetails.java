/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The request body used to create an on-demand ping probe.
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
    builder = CreateOnDemandPingProbeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOnDemandPingProbeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "targets",
        "vantagePointNames",
        "port",
        "timeoutInSeconds",
        "protocol"
    })
    public CreateOnDemandPingProbeDetails(
            String compartmentId,
            java.util.List<String> targets,
            java.util.List<String> vantagePointNames,
            Integer port,
            Integer timeoutInSeconds,
            PingProbeProtocol protocol) {
        super();
        this.compartmentId = compartmentId;
        this.targets = targets;
        this.vantagePointNames = vantagePointNames;
        this.port = port;
        this.timeoutInSeconds = timeoutInSeconds;
        this.protocol = protocol;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
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
        private PingProbeProtocol protocol;

        public Builder protocol(PingProbeProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOnDemandPingProbeDetails build() {
            CreateOnDemandPingProbeDetails model =
                    new CreateOnDemandPingProbeDetails(
                            this.compartmentId,
                            this.targets,
                            this.vantagePointNames,
                            this.port,
                            this.timeoutInSeconds,
                            this.protocol);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOnDemandPingProbeDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
            }
            if (model.wasPropertyExplicitlySet("vantagePointNames")) {
                this.vantagePointNames(model.getVantagePointNames());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
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
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
    private final PingProbeProtocol protocol;

    public PingProbeProtocol getProtocol() {
        return protocol;
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
        sb.append("CreateOnDemandPingProbeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(", vantagePointNames=").append(String.valueOf(this.vantagePointNames));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOnDemandPingProbeDetails)) {
            return false;
        }

        CreateOnDemandPingProbeDetails other = (CreateOnDemandPingProbeDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targets, other.targets)
                && java.util.Objects.equals(this.vantagePointNames, other.vantagePointNames)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePointNames == null ? 43 : this.vantagePointNames.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
