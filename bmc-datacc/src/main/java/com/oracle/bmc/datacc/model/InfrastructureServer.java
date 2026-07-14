/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Database Infrastructure Server details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InfrastructureServer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InfrastructureServer
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "serverName",
        "serverIpAddress",
        "ilomName",
        "ilomIpAddress",
        "lifecycleState",
        "baseVmCount",
        "instanceVmCount",
        "computeCapacity"
    })
    public InfrastructureServer(
            String id,
            String serverName,
            String serverIpAddress,
            String ilomName,
            String ilomIpAddress,
            InfrastructureServerLifecycleState lifecycleState,
            Integer baseVmCount,
            Integer instanceVmCount,
            ComputeCapacityDetails computeCapacity) {
        super();
        this.id = id;
        this.serverName = serverName;
        this.serverIpAddress = serverIpAddress;
        this.ilomName = ilomName;
        this.ilomIpAddress = ilomIpAddress;
        this.lifecycleState = lifecycleState;
        this.baseVmCount = baseVmCount;
        this.instanceVmCount = instanceVmCount;
        this.computeCapacity = computeCapacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Data Server of Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Data Server of Infrastructure.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Database Infrastructure Server name. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverName")
        private String serverName;

        /**
         * Database Infrastructure Server name.
         *
         * @param serverName the value to set
         * @return this builder
         */
        public Builder serverName(String serverName) {
            this.serverName = serverName;
            this.__explicitlySet__.add("serverName");
            return this;
        }
        /** Database Infrastructure Server IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverIpAddress")
        private String serverIpAddress;

        /**
         * Database Infrastructure Server IP address.
         *
         * @param serverIpAddress the value to set
         * @return this builder
         */
        public Builder serverIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            this.__explicitlySet__.add("serverIpAddress");
            return this;
        }
        /** Database Infrastructure Server ILOM name. */
        @com.fasterxml.jackson.annotation.JsonProperty("ilomName")
        private String ilomName;

        /**
         * Database Infrastructure Server ILOM name.
         *
         * @param ilomName the value to set
         * @return this builder
         */
        public Builder ilomName(String ilomName) {
            this.ilomName = ilomName;
            this.__explicitlySet__.add("ilomName");
            return this;
        }
        /** Database Infrastructure Server ILOM IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("ilomIpAddress")
        private String ilomIpAddress;

        /**
         * Database Infrastructure Server ILOM IP address.
         *
         * @param ilomIpAddress the value to set
         * @return this builder
         */
        public Builder ilomIpAddress(String ilomIpAddress) {
            this.ilomIpAddress = ilomIpAddress;
            this.__explicitlySet__.add("ilomIpAddress");
            return this;
        }
        /** The current state of the Database Infrastructure server. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private InfrastructureServerLifecycleState lifecycleState;

        /**
         * The current state of the Database Infrastructure server.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(InfrastructureServerLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Number of database virtual machines hosted on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseVmCount")
        private Integer baseVmCount;

        /**
         * Number of database virtual machines hosted on the server.
         *
         * @param baseVmCount the value to set
         * @return this builder
         */
        public Builder baseVmCount(Integer baseVmCount) {
            this.baseVmCount = baseVmCount;
            this.__explicitlySet__.add("baseVmCount");
            return this;
        }
        /** Number of instances hosted on the server. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceVmCount")
        private Integer instanceVmCount;

        /**
         * Number of instances hosted on the server.
         *
         * @param instanceVmCount the value to set
         * @return this builder
         */
        public Builder instanceVmCount(Integer instanceVmCount) {
            this.instanceVmCount = instanceVmCount;
            this.__explicitlySet__.add("instanceVmCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeCapacity")
        private ComputeCapacityDetails computeCapacity;

        public Builder computeCapacity(ComputeCapacityDetails computeCapacity) {
            this.computeCapacity = computeCapacity;
            this.__explicitlySet__.add("computeCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InfrastructureServer build() {
            InfrastructureServer model =
                    new InfrastructureServer(
                            this.id,
                            this.serverName,
                            this.serverIpAddress,
                            this.ilomName,
                            this.ilomIpAddress,
                            this.lifecycleState,
                            this.baseVmCount,
                            this.instanceVmCount,
                            this.computeCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InfrastructureServer model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("serverName")) {
                this.serverName(model.getServerName());
            }
            if (model.wasPropertyExplicitlySet("serverIpAddress")) {
                this.serverIpAddress(model.getServerIpAddress());
            }
            if (model.wasPropertyExplicitlySet("ilomName")) {
                this.ilomName(model.getIlomName());
            }
            if (model.wasPropertyExplicitlySet("ilomIpAddress")) {
                this.ilomIpAddress(model.getIlomIpAddress());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("baseVmCount")) {
                this.baseVmCount(model.getBaseVmCount());
            }
            if (model.wasPropertyExplicitlySet("instanceVmCount")) {
                this.instanceVmCount(model.getInstanceVmCount());
            }
            if (model.wasPropertyExplicitlySet("computeCapacity")) {
                this.computeCapacity(model.getComputeCapacity());
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
     * Oracle Data Server of Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Data Server of Infrastructure.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Database Infrastructure Server name. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverName")
    private final String serverName;

    /**
     * Database Infrastructure Server name.
     *
     * @return the value
     */
    public String getServerName() {
        return serverName;
    }

    /** Database Infrastructure Server IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverIpAddress")
    private final String serverIpAddress;

    /**
     * Database Infrastructure Server IP address.
     *
     * @return the value
     */
    public String getServerIpAddress() {
        return serverIpAddress;
    }

    /** Database Infrastructure Server ILOM name. */
    @com.fasterxml.jackson.annotation.JsonProperty("ilomName")
    private final String ilomName;

    /**
     * Database Infrastructure Server ILOM name.
     *
     * @return the value
     */
    public String getIlomName() {
        return ilomName;
    }

    /** Database Infrastructure Server ILOM IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("ilomIpAddress")
    private final String ilomIpAddress;

    /**
     * Database Infrastructure Server ILOM IP address.
     *
     * @return the value
     */
    public String getIlomIpAddress() {
        return ilomIpAddress;
    }

    /** The current state of the Database Infrastructure server. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final InfrastructureServerLifecycleState lifecycleState;

    /**
     * The current state of the Database Infrastructure server.
     *
     * @return the value
     */
    public InfrastructureServerLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Number of database virtual machines hosted on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseVmCount")
    private final Integer baseVmCount;

    /**
     * Number of database virtual machines hosted on the server.
     *
     * @return the value
     */
    public Integer getBaseVmCount() {
        return baseVmCount;
    }

    /** Number of instances hosted on the server. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceVmCount")
    private final Integer instanceVmCount;

    /**
     * Number of instances hosted on the server.
     *
     * @return the value
     */
    public Integer getInstanceVmCount() {
        return instanceVmCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("computeCapacity")
    private final ComputeCapacityDetails computeCapacity;

    public ComputeCapacityDetails getComputeCapacity() {
        return computeCapacity;
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
        sb.append("InfrastructureServer(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", serverName=").append(String.valueOf(this.serverName));
        sb.append(", serverIpAddress=").append(String.valueOf(this.serverIpAddress));
        sb.append(", ilomName=").append(String.valueOf(this.ilomName));
        sb.append(", ilomIpAddress=").append(String.valueOf(this.ilomIpAddress));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", baseVmCount=").append(String.valueOf(this.baseVmCount));
        sb.append(", instanceVmCount=").append(String.valueOf(this.instanceVmCount));
        sb.append(", computeCapacity=").append(String.valueOf(this.computeCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfrastructureServer)) {
            return false;
        }

        InfrastructureServer other = (InfrastructureServer) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.serverName, other.serverName)
                && java.util.Objects.equals(this.serverIpAddress, other.serverIpAddress)
                && java.util.Objects.equals(this.ilomName, other.ilomName)
                && java.util.Objects.equals(this.ilomIpAddress, other.ilomIpAddress)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.baseVmCount, other.baseVmCount)
                && java.util.Objects.equals(this.instanceVmCount, other.instanceVmCount)
                && java.util.Objects.equals(this.computeCapacity, other.computeCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.serverName == null ? 43 : this.serverName.hashCode());
        result =
                (result * PRIME)
                        + (this.serverIpAddress == null ? 43 : this.serverIpAddress.hashCode());
        result = (result * PRIME) + (this.ilomName == null ? 43 : this.ilomName.hashCode());
        result =
                (result * PRIME)
                        + (this.ilomIpAddress == null ? 43 : this.ilomIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.baseVmCount == null ? 43 : this.baseVmCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceVmCount == null ? 43 : this.instanceVmCount.hashCode());
        result =
                (result * PRIME)
                        + (this.computeCapacity == null ? 43 : this.computeCapacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
