/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * An outbound replication record of a MySQL Server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedMySqlDatabaseOutboundReplicationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseOutboundReplicationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "replicaHost",
        "replicaPort",
        "replicaUuid",
        "replicaServerId"
    })
    public ManagedMySqlDatabaseOutboundReplicationSummary(
            String replicaHost, Integer replicaPort, String replicaUuid, Long replicaServerId) {
        super();
        this.replicaHost = replicaHost;
        this.replicaPort = replicaPort;
        this.replicaUuid = replicaUuid;
        this.replicaServerId = replicaServerId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The host name of the replica server, as specified on the replica with the --report-host
         * option. This can differ from the machine name as configured in the operating system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaHost")
        private String replicaHost;

        /**
         * The host name of the replica server, as specified on the replica with the --report-host
         * option. This can differ from the machine name as configured in the operating system.
         *
         * @param replicaHost the value to set
         * @return this builder
         */
        public Builder replicaHost(String replicaHost) {
            this.replicaHost = replicaHost;
            this.__explicitlySet__.add("replicaHost");
            return this;
        }
        /**
         * The port on the replica server, as specified on the replica with the --report-port
         * option. A zero in this column means that the replica port (--report-port) was not set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaPort")
        private Integer replicaPort;

        /**
         * The port on the replica server, as specified on the replica with the --report-port
         * option. A zero in this column means that the replica port (--report-port) was not set.
         *
         * @param replicaPort the value to set
         * @return this builder
         */
        public Builder replicaPort(Integer replicaPort) {
            this.replicaPort = replicaPort;
            this.__explicitlySet__.add("replicaPort");
            return this;
        }
        /** The Universally Unique Identifier (UUID) value of the replica server. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaUuid")
        private String replicaUuid;

        /**
         * The Universally Unique Identifier (UUID) value of the replica server.
         *
         * @param replicaUuid the value to set
         * @return this builder
         */
        public Builder replicaUuid(String replicaUuid) {
            this.replicaUuid = replicaUuid;
            this.__explicitlySet__.add("replicaUuid");
            return this;
        }
        /** The server ID value of the replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaServerId")
        private Long replicaServerId;

        /**
         * The server ID value of the replica.
         *
         * @param replicaServerId the value to set
         * @return this builder
         */
        public Builder replicaServerId(Long replicaServerId) {
            this.replicaServerId = replicaServerId;
            this.__explicitlySet__.add("replicaServerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseOutboundReplicationSummary build() {
            ManagedMySqlDatabaseOutboundReplicationSummary model =
                    new ManagedMySqlDatabaseOutboundReplicationSummary(
                            this.replicaHost,
                            this.replicaPort,
                            this.replicaUuid,
                            this.replicaServerId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseOutboundReplicationSummary model) {
            if (model.wasPropertyExplicitlySet("replicaHost")) {
                this.replicaHost(model.getReplicaHost());
            }
            if (model.wasPropertyExplicitlySet("replicaPort")) {
                this.replicaPort(model.getReplicaPort());
            }
            if (model.wasPropertyExplicitlySet("replicaUuid")) {
                this.replicaUuid(model.getReplicaUuid());
            }
            if (model.wasPropertyExplicitlySet("replicaServerId")) {
                this.replicaServerId(model.getReplicaServerId());
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
     * The host name of the replica server, as specified on the replica with the --report-host
     * option. This can differ from the machine name as configured in the operating system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaHost")
    private final String replicaHost;

    /**
     * The host name of the replica server, as specified on the replica with the --report-host
     * option. This can differ from the machine name as configured in the operating system.
     *
     * @return the value
     */
    public String getReplicaHost() {
        return replicaHost;
    }

    /**
     * The port on the replica server, as specified on the replica with the --report-port option. A
     * zero in this column means that the replica port (--report-port) was not set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaPort")
    private final Integer replicaPort;

    /**
     * The port on the replica server, as specified on the replica with the --report-port option. A
     * zero in this column means that the replica port (--report-port) was not set.
     *
     * @return the value
     */
    public Integer getReplicaPort() {
        return replicaPort;
    }

    /** The Universally Unique Identifier (UUID) value of the replica server. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaUuid")
    private final String replicaUuid;

    /**
     * The Universally Unique Identifier (UUID) value of the replica server.
     *
     * @return the value
     */
    public String getReplicaUuid() {
        return replicaUuid;
    }

    /** The server ID value of the replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaServerId")
    private final Long replicaServerId;

    /**
     * The server ID value of the replica.
     *
     * @return the value
     */
    public Long getReplicaServerId() {
        return replicaServerId;
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
        sb.append("ManagedMySqlDatabaseOutboundReplicationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("replicaHost=").append(String.valueOf(this.replicaHost));
        sb.append(", replicaPort=").append(String.valueOf(this.replicaPort));
        sb.append(", replicaUuid=").append(String.valueOf(this.replicaUuid));
        sb.append(", replicaServerId=").append(String.valueOf(this.replicaServerId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseOutboundReplicationSummary)) {
            return false;
        }

        ManagedMySqlDatabaseOutboundReplicationSummary other =
                (ManagedMySqlDatabaseOutboundReplicationSummary) o;
        return java.util.Objects.equals(this.replicaHost, other.replicaHost)
                && java.util.Objects.equals(this.replicaPort, other.replicaPort)
                && java.util.Objects.equals(this.replicaUuid, other.replicaUuid)
                && java.util.Objects.equals(this.replicaServerId, other.replicaServerId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.replicaHost == null ? 43 : this.replicaHost.hashCode());
        result = (result * PRIME) + (this.replicaPort == null ? 43 : this.replicaPort.hashCode());
        result = (result * PRIME) + (this.replicaUuid == null ? 43 : this.replicaUuid.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaServerId == null ? 43 : this.replicaServerId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
