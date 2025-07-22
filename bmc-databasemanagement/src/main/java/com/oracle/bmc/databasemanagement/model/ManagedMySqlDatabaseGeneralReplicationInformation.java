/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * General information about the replication of a MySQL server. <br>
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
        builder = ManagedMySqlDatabaseGeneralReplicationInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseGeneralReplicationInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceType",
        "hostName",
        "port",
        "serverId",
        "serverUuid",
        "secondsBehindSourceMax",
        "fetchStatusSummary",
        "applyStatusSummary",
        "isHighAvailabilityEnabled",
        "highAvailabilityMemberState",
        "inboundReplicationsCount",
        "readOnly",
        "gtidMode",
        "executedGtidSet",
        "binaryLogging",
        "binaryLogFormat",
        "outboundReplicationsCount"
    })
    public ManagedMySqlDatabaseGeneralReplicationInformation(
            String instanceType,
            String hostName,
            Integer port,
            Long serverId,
            String serverUuid,
            Long secondsBehindSourceMax,
            String fetchStatusSummary,
            String applyStatusSummary,
            Boolean isHighAvailabilityEnabled,
            String highAvailabilityMemberState,
            Integer inboundReplicationsCount,
            MySqlReadOnly readOnly,
            String gtidMode,
            String executedGtidSet,
            String binaryLogging,
            String binaryLogFormat,
            Integer outboundReplicationsCount) {
        super();
        this.instanceType = instanceType;
        this.hostName = hostName;
        this.port = port;
        this.serverId = serverId;
        this.serverUuid = serverUuid;
        this.secondsBehindSourceMax = secondsBehindSourceMax;
        this.fetchStatusSummary = fetchStatusSummary;
        this.applyStatusSummary = applyStatusSummary;
        this.isHighAvailabilityEnabled = isHighAvailabilityEnabled;
        this.highAvailabilityMemberState = highAvailabilityMemberState;
        this.inboundReplicationsCount = inboundReplicationsCount;
        this.readOnly = readOnly;
        this.gtidMode = gtidMode;
        this.executedGtidSet = executedGtidSet;
        this.binaryLogging = binaryLogging;
        this.binaryLogFormat = binaryLogFormat;
        this.outboundReplicationsCount = outboundReplicationsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the instance for example, Source, Replica, Primary Group Member, and
         * Secondary Group Member. If the instance is replicating from one or more sources and has
         * one or more replicas, which means, it belongs to a replication chain, the instance type
         * can be Replica/Source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
        private String instanceType;

        /**
         * The type of the instance for example, Source, Replica, Primary Group Member, and
         * Secondary Group Member. If the instance is replicating from one or more sources and has
         * one or more replicas, which means, it belongs to a replication chain, the instance type
         * can be Replica/Source.
         *
         * @param instanceType the value to set
         * @return this builder
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            this.__explicitlySet__.add("instanceType");
            return this;
        }
        /** This server's host name. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * This server's host name.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The number of the port on which the server listens for TCP/IP connections. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The number of the port on which the server listens for TCP/IP connections.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** This server's ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverId")
        private Long serverId;

        /**
         * This server's ID.
         *
         * @param serverId the value to set
         * @return this builder
         */
        public Builder serverId(Long serverId) {
            this.serverId = serverId;
            this.__explicitlySet__.add("serverId");
            return this;
        }
        /** This server's Universally Unique Identifier (UUID). */
        @com.fasterxml.jackson.annotation.JsonProperty("serverUuid")
        private String serverUuid;

        /**
         * This server's Universally Unique Identifier (UUID).
         *
         * @param serverUuid the value to set
         * @return this builder
         */
        public Builder serverUuid(String serverUuid) {
            this.serverUuid = serverUuid;
            this.__explicitlySet__.add("serverUuid");
            return this;
        }
        /**
         * The number of seconds the replica is behind the source. When multiple sources are
         * involved, this is the maximum value across all sources.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secondsBehindSourceMax")
        private Long secondsBehindSourceMax;

        /**
         * The number of seconds the replica is behind the source. When multiple sources are
         * involved, this is the maximum value across all sources.
         *
         * @param secondsBehindSourceMax the value to set
         * @return this builder
         */
        public Builder secondsBehindSourceMax(Long secondsBehindSourceMax) {
            this.secondsBehindSourceMax = secondsBehindSourceMax;
            this.__explicitlySet__.add("secondsBehindSourceMax");
            return this;
        }
        /** A summary of the current status of fetch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("fetchStatusSummary")
        private String fetchStatusSummary;

        /**
         * A summary of the current status of fetch operations.
         *
         * @param fetchStatusSummary the value to set
         * @return this builder
         */
        public Builder fetchStatusSummary(String fetchStatusSummary) {
            this.fetchStatusSummary = fetchStatusSummary;
            this.__explicitlySet__.add("fetchStatusSummary");
            return this;
        }
        /** A summary of the current status of apply operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("applyStatusSummary")
        private String applyStatusSummary;

        /**
         * A summary of the current status of apply operations.
         *
         * @param applyStatusSummary the value to set
         * @return this builder
         */
        public Builder applyStatusSummary(String applyStatusSummary) {
            this.applyStatusSummary = applyStatusSummary;
            this.__explicitlySet__.add("applyStatusSummary");
            return this;
        }
        /** Specifies if high availability is enabled on this server. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailabilityEnabled")
        private Boolean isHighAvailabilityEnabled;

        /**
         * Specifies if high availability is enabled on this server.
         *
         * @param isHighAvailabilityEnabled the value to set
         * @return this builder
         */
        public Builder isHighAvailabilityEnabled(Boolean isHighAvailabilityEnabled) {
            this.isHighAvailabilityEnabled = isHighAvailabilityEnabled;
            this.__explicitlySet__.add("isHighAvailabilityEnabled");
            return this;
        }
        /** The state of this server as a group replication member. */
        @com.fasterxml.jackson.annotation.JsonProperty("highAvailabilityMemberState")
        private String highAvailabilityMemberState;

        /**
         * The state of this server as a group replication member.
         *
         * @param highAvailabilityMemberState the value to set
         * @return this builder
         */
        public Builder highAvailabilityMemberState(String highAvailabilityMemberState) {
            this.highAvailabilityMemberState = highAvailabilityMemberState;
            this.__explicitlySet__.add("highAvailabilityMemberState");
            return this;
        }
        /** The number of sources this server is replicating from. */
        @com.fasterxml.jackson.annotation.JsonProperty("inboundReplicationsCount")
        private Integer inboundReplicationsCount;

        /**
         * The number of sources this server is replicating from.
         *
         * @param inboundReplicationsCount the value to set
         * @return this builder
         */
        public Builder inboundReplicationsCount(Integer inboundReplicationsCount) {
            this.inboundReplicationsCount = inboundReplicationsCount;
            this.__explicitlySet__.add("inboundReplicationsCount");
            return this;
        }
        /**
         * If the value is ON, the instance is configured as read_only. If the value is SUPER, the
         * instance is configured as super_read_only. If the value is OFF, the instance is neither
         * read_only nor super_read_only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
        private MySqlReadOnly readOnly;

        /**
         * If the value is ON, the instance is configured as read_only. If the value is SUPER, the
         * instance is configured as super_read_only. If the value is OFF, the instance is neither
         * read_only nor super_read_only.
         *
         * @param readOnly the value to set
         * @return this builder
         */
        public Builder readOnly(MySqlReadOnly readOnly) {
            this.readOnly = readOnly;
            this.__explicitlySet__.add("readOnly");
            return this;
        }
        /** The Global Transaction Identifier (GTID) mode of this server. */
        @com.fasterxml.jackson.annotation.JsonProperty("gtidMode")
        private String gtidMode;

        /**
         * The Global Transaction Identifier (GTID) mode of this server.
         *
         * @param gtidMode the value to set
         * @return this builder
         */
        public Builder gtidMode(String gtidMode) {
            this.gtidMode = gtidMode;
            this.__explicitlySet__.add("gtidMode");
            return this;
        }
        /**
         * The set of global transaction identifiers for transactions that have been executed on
         * this source server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executedGtidSet")
        private String executedGtidSet;

        /**
         * The set of global transaction identifiers for transactions that have been executed on
         * this source server.
         *
         * @param executedGtidSet the value to set
         * @return this builder
         */
        public Builder executedGtidSet(String executedGtidSet) {
            this.executedGtidSet = executedGtidSet;
            this.__explicitlySet__.add("executedGtidSet");
            return this;
        }
        /** The status of binary logging on this server. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogging")
        private String binaryLogging;

        /**
         * The status of binary logging on this server.
         *
         * @param binaryLogging the value to set
         * @return this builder
         */
        public Builder binaryLogging(String binaryLogging) {
            this.binaryLogging = binaryLogging;
            this.__explicitlySet__.add("binaryLogging");
            return this;
        }
        /** The binary logging format used by this server. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogFormat")
        private String binaryLogFormat;

        /**
         * The binary logging format used by this server.
         *
         * @param binaryLogFormat the value to set
         * @return this builder
         */
        public Builder binaryLogFormat(String binaryLogFormat) {
            this.binaryLogFormat = binaryLogFormat;
            this.__explicitlySet__.add("binaryLogFormat");
            return this;
        }
        /** The number of replicas replicating from this server. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundReplicationsCount")
        private Integer outboundReplicationsCount;

        /**
         * The number of replicas replicating from this server.
         *
         * @param outboundReplicationsCount the value to set
         * @return this builder
         */
        public Builder outboundReplicationsCount(Integer outboundReplicationsCount) {
            this.outboundReplicationsCount = outboundReplicationsCount;
            this.__explicitlySet__.add("outboundReplicationsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseGeneralReplicationInformation build() {
            ManagedMySqlDatabaseGeneralReplicationInformation model =
                    new ManagedMySqlDatabaseGeneralReplicationInformation(
                            this.instanceType,
                            this.hostName,
                            this.port,
                            this.serverId,
                            this.serverUuid,
                            this.secondsBehindSourceMax,
                            this.fetchStatusSummary,
                            this.applyStatusSummary,
                            this.isHighAvailabilityEnabled,
                            this.highAvailabilityMemberState,
                            this.inboundReplicationsCount,
                            this.readOnly,
                            this.gtidMode,
                            this.executedGtidSet,
                            this.binaryLogging,
                            this.binaryLogFormat,
                            this.outboundReplicationsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseGeneralReplicationInformation model) {
            if (model.wasPropertyExplicitlySet("instanceType")) {
                this.instanceType(model.getInstanceType());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("serverId")) {
                this.serverId(model.getServerId());
            }
            if (model.wasPropertyExplicitlySet("serverUuid")) {
                this.serverUuid(model.getServerUuid());
            }
            if (model.wasPropertyExplicitlySet("secondsBehindSourceMax")) {
                this.secondsBehindSourceMax(model.getSecondsBehindSourceMax());
            }
            if (model.wasPropertyExplicitlySet("fetchStatusSummary")) {
                this.fetchStatusSummary(model.getFetchStatusSummary());
            }
            if (model.wasPropertyExplicitlySet("applyStatusSummary")) {
                this.applyStatusSummary(model.getApplyStatusSummary());
            }
            if (model.wasPropertyExplicitlySet("isHighAvailabilityEnabled")) {
                this.isHighAvailabilityEnabled(model.getIsHighAvailabilityEnabled());
            }
            if (model.wasPropertyExplicitlySet("highAvailabilityMemberState")) {
                this.highAvailabilityMemberState(model.getHighAvailabilityMemberState());
            }
            if (model.wasPropertyExplicitlySet("inboundReplicationsCount")) {
                this.inboundReplicationsCount(model.getInboundReplicationsCount());
            }
            if (model.wasPropertyExplicitlySet("readOnly")) {
                this.readOnly(model.getReadOnly());
            }
            if (model.wasPropertyExplicitlySet("gtidMode")) {
                this.gtidMode(model.getGtidMode());
            }
            if (model.wasPropertyExplicitlySet("executedGtidSet")) {
                this.executedGtidSet(model.getExecutedGtidSet());
            }
            if (model.wasPropertyExplicitlySet("binaryLogging")) {
                this.binaryLogging(model.getBinaryLogging());
            }
            if (model.wasPropertyExplicitlySet("binaryLogFormat")) {
                this.binaryLogFormat(model.getBinaryLogFormat());
            }
            if (model.wasPropertyExplicitlySet("outboundReplicationsCount")) {
                this.outboundReplicationsCount(model.getOutboundReplicationsCount());
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
     * The type of the instance for example, Source, Replica, Primary Group Member, and Secondary
     * Group Member. If the instance is replicating from one or more sources and has one or more
     * replicas, which means, it belongs to a replication chain, the instance type can be
     * Replica/Source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
    private final String instanceType;

    /**
     * The type of the instance for example, Source, Replica, Primary Group Member, and Secondary
     * Group Member. If the instance is replicating from one or more sources and has one or more
     * replicas, which means, it belongs to a replication chain, the instance type can be
     * Replica/Source.
     *
     * @return the value
     */
    public String getInstanceType() {
        return instanceType;
    }

    /** This server's host name. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * This server's host name.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The number of the port on which the server listens for TCP/IP connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The number of the port on which the server listens for TCP/IP connections.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** This server's ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverId")
    private final Long serverId;

    /**
     * This server's ID.
     *
     * @return the value
     */
    public Long getServerId() {
        return serverId;
    }

    /** This server's Universally Unique Identifier (UUID). */
    @com.fasterxml.jackson.annotation.JsonProperty("serverUuid")
    private final String serverUuid;

    /**
     * This server's Universally Unique Identifier (UUID).
     *
     * @return the value
     */
    public String getServerUuid() {
        return serverUuid;
    }

    /**
     * The number of seconds the replica is behind the source. When multiple sources are involved,
     * this is the maximum value across all sources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secondsBehindSourceMax")
    private final Long secondsBehindSourceMax;

    /**
     * The number of seconds the replica is behind the source. When multiple sources are involved,
     * this is the maximum value across all sources.
     *
     * @return the value
     */
    public Long getSecondsBehindSourceMax() {
        return secondsBehindSourceMax;
    }

    /** A summary of the current status of fetch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("fetchStatusSummary")
    private final String fetchStatusSummary;

    /**
     * A summary of the current status of fetch operations.
     *
     * @return the value
     */
    public String getFetchStatusSummary() {
        return fetchStatusSummary;
    }

    /** A summary of the current status of apply operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("applyStatusSummary")
    private final String applyStatusSummary;

    /**
     * A summary of the current status of apply operations.
     *
     * @return the value
     */
    public String getApplyStatusSummary() {
        return applyStatusSummary;
    }

    /** Specifies if high availability is enabled on this server. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailabilityEnabled")
    private final Boolean isHighAvailabilityEnabled;

    /**
     * Specifies if high availability is enabled on this server.
     *
     * @return the value
     */
    public Boolean getIsHighAvailabilityEnabled() {
        return isHighAvailabilityEnabled;
    }

    /** The state of this server as a group replication member. */
    @com.fasterxml.jackson.annotation.JsonProperty("highAvailabilityMemberState")
    private final String highAvailabilityMemberState;

    /**
     * The state of this server as a group replication member.
     *
     * @return the value
     */
    public String getHighAvailabilityMemberState() {
        return highAvailabilityMemberState;
    }

    /** The number of sources this server is replicating from. */
    @com.fasterxml.jackson.annotation.JsonProperty("inboundReplicationsCount")
    private final Integer inboundReplicationsCount;

    /**
     * The number of sources this server is replicating from.
     *
     * @return the value
     */
    public Integer getInboundReplicationsCount() {
        return inboundReplicationsCount;
    }

    /**
     * If the value is ON, the instance is configured as read_only. If the value is SUPER, the
     * instance is configured as super_read_only. If the value is OFF, the instance is neither
     * read_only nor super_read_only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    private final MySqlReadOnly readOnly;

    /**
     * If the value is ON, the instance is configured as read_only. If the value is SUPER, the
     * instance is configured as super_read_only. If the value is OFF, the instance is neither
     * read_only nor super_read_only.
     *
     * @return the value
     */
    public MySqlReadOnly getReadOnly() {
        return readOnly;
    }

    /** The Global Transaction Identifier (GTID) mode of this server. */
    @com.fasterxml.jackson.annotation.JsonProperty("gtidMode")
    private final String gtidMode;

    /**
     * The Global Transaction Identifier (GTID) mode of this server.
     *
     * @return the value
     */
    public String getGtidMode() {
        return gtidMode;
    }

    /**
     * The set of global transaction identifiers for transactions that have been executed on this
     * source server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executedGtidSet")
    private final String executedGtidSet;

    /**
     * The set of global transaction identifiers for transactions that have been executed on this
     * source server.
     *
     * @return the value
     */
    public String getExecutedGtidSet() {
        return executedGtidSet;
    }

    /** The status of binary logging on this server. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogging")
    private final String binaryLogging;

    /**
     * The status of binary logging on this server.
     *
     * @return the value
     */
    public String getBinaryLogging() {
        return binaryLogging;
    }

    /** The binary logging format used by this server. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogFormat")
    private final String binaryLogFormat;

    /**
     * The binary logging format used by this server.
     *
     * @return the value
     */
    public String getBinaryLogFormat() {
        return binaryLogFormat;
    }

    /** The number of replicas replicating from this server. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundReplicationsCount")
    private final Integer outboundReplicationsCount;

    /**
     * The number of replicas replicating from this server.
     *
     * @return the value
     */
    public Integer getOutboundReplicationsCount() {
        return outboundReplicationsCount;
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
        sb.append("ManagedMySqlDatabaseGeneralReplicationInformation(");
        sb.append("super=").append(super.toString());
        sb.append("instanceType=").append(String.valueOf(this.instanceType));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", serverId=").append(String.valueOf(this.serverId));
        sb.append(", serverUuid=").append(String.valueOf(this.serverUuid));
        sb.append(", secondsBehindSourceMax=").append(String.valueOf(this.secondsBehindSourceMax));
        sb.append(", fetchStatusSummary=").append(String.valueOf(this.fetchStatusSummary));
        sb.append(", applyStatusSummary=").append(String.valueOf(this.applyStatusSummary));
        sb.append(", isHighAvailabilityEnabled=")
                .append(String.valueOf(this.isHighAvailabilityEnabled));
        sb.append(", highAvailabilityMemberState=")
                .append(String.valueOf(this.highAvailabilityMemberState));
        sb.append(", inboundReplicationsCount=")
                .append(String.valueOf(this.inboundReplicationsCount));
        sb.append(", readOnly=").append(String.valueOf(this.readOnly));
        sb.append(", gtidMode=").append(String.valueOf(this.gtidMode));
        sb.append(", executedGtidSet=").append(String.valueOf(this.executedGtidSet));
        sb.append(", binaryLogging=").append(String.valueOf(this.binaryLogging));
        sb.append(", binaryLogFormat=").append(String.valueOf(this.binaryLogFormat));
        sb.append(", outboundReplicationsCount=")
                .append(String.valueOf(this.outboundReplicationsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseGeneralReplicationInformation)) {
            return false;
        }

        ManagedMySqlDatabaseGeneralReplicationInformation other =
                (ManagedMySqlDatabaseGeneralReplicationInformation) o;
        return java.util.Objects.equals(this.instanceType, other.instanceType)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.serverId, other.serverId)
                && java.util.Objects.equals(this.serverUuid, other.serverUuid)
                && java.util.Objects.equals(
                        this.secondsBehindSourceMax, other.secondsBehindSourceMax)
                && java.util.Objects.equals(this.fetchStatusSummary, other.fetchStatusSummary)
                && java.util.Objects.equals(this.applyStatusSummary, other.applyStatusSummary)
                && java.util.Objects.equals(
                        this.isHighAvailabilityEnabled, other.isHighAvailabilityEnabled)
                && java.util.Objects.equals(
                        this.highAvailabilityMemberState, other.highAvailabilityMemberState)
                && java.util.Objects.equals(
                        this.inboundReplicationsCount, other.inboundReplicationsCount)
                && java.util.Objects.equals(this.readOnly, other.readOnly)
                && java.util.Objects.equals(this.gtidMode, other.gtidMode)
                && java.util.Objects.equals(this.executedGtidSet, other.executedGtidSet)
                && java.util.Objects.equals(this.binaryLogging, other.binaryLogging)
                && java.util.Objects.equals(this.binaryLogFormat, other.binaryLogFormat)
                && java.util.Objects.equals(
                        this.outboundReplicationsCount, other.outboundReplicationsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceType == null ? 43 : this.instanceType.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.serverId == null ? 43 : this.serverId.hashCode());
        result = (result * PRIME) + (this.serverUuid == null ? 43 : this.serverUuid.hashCode());
        result =
                (result * PRIME)
                        + (this.secondsBehindSourceMax == null
                                ? 43
                                : this.secondsBehindSourceMax.hashCode());
        result =
                (result * PRIME)
                        + (this.fetchStatusSummary == null
                                ? 43
                                : this.fetchStatusSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.applyStatusSummary == null
                                ? 43
                                : this.applyStatusSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighAvailabilityEnabled == null
                                ? 43
                                : this.isHighAvailabilityEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.highAvailabilityMemberState == null
                                ? 43
                                : this.highAvailabilityMemberState.hashCode());
        result =
                (result * PRIME)
                        + (this.inboundReplicationsCount == null
                                ? 43
                                : this.inboundReplicationsCount.hashCode());
        result = (result * PRIME) + (this.readOnly == null ? 43 : this.readOnly.hashCode());
        result = (result * PRIME) + (this.gtidMode == null ? 43 : this.gtidMode.hashCode());
        result =
                (result * PRIME)
                        + (this.executedGtidSet == null ? 43 : this.executedGtidSet.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogging == null ? 43 : this.binaryLogging.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogFormat == null ? 43 : this.binaryLogFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundReplicationsCount == null
                                ? 43
                                : this.outboundReplicationsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
