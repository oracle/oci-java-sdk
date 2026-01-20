/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details of the shard peer <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShardPeerWithExadbXs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShardPeerWithExadbXs
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vmClusterId",
        "shardGroup",
        "status",
        "supportingResourceId",
        "containerDatabaseId",
        "timeCreated",
        "timeUpdated",
        "protectionMode",
        "transportType",
        "metadata"
    })
    public ShardPeerWithExadbXs(
            String vmClusterId,
            String shardGroup,
            Status status,
            String supportingResourceId,
            String containerDatabaseId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DistributedDbProtectionMode protectionMode,
            DistributedDbTransportType transportType,
            DistributedDbMetadata metadata) {
        super();
        this.vmClusterId = vmClusterId;
        this.shardGroup = shardGroup;
        this.status = status;
        this.supportingResourceId = supportingResourceId;
        this.containerDatabaseId = containerDatabaseId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VmCluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VmCluster.
         *
         * @param vmClusterId the value to set
         * @return this builder
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /** The name of the shardGroup for the peer. */
        @com.fasterxml.jackson.annotation.JsonProperty("shardGroup")
        private String shardGroup;

        /**
         * The name of the shardGroup for the peer.
         *
         * @param shardGroup the value to set
         * @return this builder
         */
        public Builder shardGroup(String shardGroup) {
            this.shardGroup = shardGroup;
            this.__explicitlySet__.add("shardGroup");
            return this;
        }
        /** Status of EXADB_XS based shard peer. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of EXADB_XS based shard peer.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** the identifier of the underlying supporting resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
        private String supportingResourceId;

        /**
         * the identifier of the underlying supporting resource.
         *
         * @param supportingResourceId the value to set
         * @return this builder
         */
        public Builder supportingResourceId(String supportingResourceId) {
            this.supportingResourceId = supportingResourceId;
            this.__explicitlySet__.add("supportingResourceId");
            return this;
        }
        /** the identifier of the container database for underlying supporting resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
        private String containerDatabaseId;

        /**
         * the identifier of the container database for underlying supporting resource.
         *
         * @param containerDatabaseId the value to set
         * @return this builder
         */
        public Builder containerDatabaseId(String containerDatabaseId) {
            this.containerDatabaseId = containerDatabaseId;
            this.__explicitlySet__.add("containerDatabaseId");
            return this;
        }
        /** The time the shard peer was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the shard peer was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the shard peer was last updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the shard peer was last updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The protectionMode for the shard peer. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private DistributedDbProtectionMode protectionMode;

        /**
         * The protectionMode for the shard peer.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(DistributedDbProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /** The redo transport type to use for this Data Guard association. */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private DistributedDbTransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(DistributedDbTransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private DistributedDbMetadata metadata;

        public Builder metadata(DistributedDbMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShardPeerWithExadbXs build() {
            ShardPeerWithExadbXs model =
                    new ShardPeerWithExadbXs(
                            this.vmClusterId,
                            this.shardGroup,
                            this.status,
                            this.supportingResourceId,
                            this.containerDatabaseId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.protectionMode,
                            this.transportType,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShardPeerWithExadbXs model) {
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("shardGroup")) {
                this.shardGroup(model.getShardGroup());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("supportingResourceId")) {
                this.supportingResourceId(model.getSupportingResourceId());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseId")) {
                this.containerDatabaseId(model.getContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * VmCluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VmCluster.
     *
     * @return the value
     */
    public String getVmClusterId() {
        return vmClusterId;
    }

    /** The name of the shardGroup for the peer. */
    @com.fasterxml.jackson.annotation.JsonProperty("shardGroup")
    private final String shardGroup;

    /**
     * The name of the shardGroup for the peer.
     *
     * @return the value
     */
    public String getShardGroup() {
        return shardGroup;
    }

    /** Status of EXADB_XS based shard peer. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),
        Created("CREATED"),
        ReadyForConfiguration("READY_FOR_CONFIGURATION"),
        Configured("CONFIGURED"),
        NeedsAttention("NEEDS_ATTENTION"),

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
    /** Status of EXADB_XS based shard peer. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of EXADB_XS based shard peer.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** the identifier of the underlying supporting resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
    private final String supportingResourceId;

    /**
     * the identifier of the underlying supporting resource.
     *
     * @return the value
     */
    public String getSupportingResourceId() {
        return supportingResourceId;
    }

    /** the identifier of the container database for underlying supporting resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
    private final String containerDatabaseId;

    /**
     * the identifier of the container database for underlying supporting resource.
     *
     * @return the value
     */
    public String getContainerDatabaseId() {
        return containerDatabaseId;
    }

    /** The time the shard peer was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the shard peer was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the shard peer was last updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the shard peer was last updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The protectionMode for the shard peer. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final DistributedDbProtectionMode protectionMode;

    /**
     * The protectionMode for the shard peer.
     *
     * @return the value
     */
    public DistributedDbProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /** The redo transport type to use for this Data Guard association. */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final DistributedDbTransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association.
     *
     * @return the value
     */
    public DistributedDbTransportType getTransportType() {
        return transportType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final DistributedDbMetadata metadata;

    public DistributedDbMetadata getMetadata() {
        return metadata;
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
        sb.append("ShardPeerWithExadbXs(");
        sb.append("super=").append(super.toString());
        sb.append("vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", shardGroup=").append(String.valueOf(this.shardGroup));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", supportingResourceId=").append(String.valueOf(this.supportingResourceId));
        sb.append(", containerDatabaseId=").append(String.valueOf(this.containerDatabaseId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShardPeerWithExadbXs)) {
            return false;
        }

        ShardPeerWithExadbXs other = (ShardPeerWithExadbXs) o;
        return java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.shardGroup, other.shardGroup)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.supportingResourceId, other.supportingResourceId)
                && java.util.Objects.equals(this.containerDatabaseId, other.containerDatabaseId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result = (result * PRIME) + (this.shardGroup == null ? 43 : this.shardGroup.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.supportingResourceId == null
                                ? 43
                                : this.supportingResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseId == null
                                ? 43
                                : this.containerDatabaseId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
