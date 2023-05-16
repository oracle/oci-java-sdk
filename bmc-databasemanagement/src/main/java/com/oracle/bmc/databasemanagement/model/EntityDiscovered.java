/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The base discover entity. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType",
        defaultImpl = EntityDiscovered.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExternalStorageGridDiscoverySummary.class,
            name = "STORAGE_GRID_DISCOVER_SUMMARY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExternalExadataInfrastructureDiscovery.class,
            name = "INFRASTRUCTURE_DISCOVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExternalDatabaseSystemDiscoverySummary.class,
            name = "DATABASE_SYSTEM_DISCOVER_SUMMARY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExternalExadataInfrastructureDiscoverySummary.class,
            name = "INFRASTRUCTURE_DISCOVER_SUMMARY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExternalStorageServerDiscoverySummary.class,
            name = "STORAGE_SERVER_DISCOVER_SUMMARY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class EntityDiscovered extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "agentId",
        "connectorId",
        "displayName",
        "version",
        "internalId",
        "status",
        "discoverStatus",
        "discoverErrorCode",
        "discoverErrorMsg"
    })
    protected EntityDiscovered(
            String id,
            String agentId,
            String connectorId,
            String displayName,
            String version,
            String internalId,
            String status,
            DiscoverStatus discoverStatus,
            String discoverErrorCode,
            String discoverErrorMsg) {
        super();
        this.id = id;
        this.agentId = agentId;
        this.connectorId = connectorId;
        this.displayName = displayName;
        this.version = version;
        this.internalId = internalId;
        this.status = status;
        this.discoverStatus = discoverStatus;
        this.discoverErrorCode = discoverErrorCode;
        this.discoverErrorMsg = discoverErrorMsg;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). Null for
     * new discover case.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). Null for
     * new discover case.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * agent could be used for monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * agent could be used for monitoring.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * associated connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * associated connector.
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
    }

    /** The name of the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the entity.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The version of the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the entity.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The internal identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("internalId")
    private final String internalId;

    /**
     * The internal identifier.
     *
     * @return the value
     */
    public String getInternalId() {
        return internalId;
    }

    /** The status of the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The status of the entity.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The status of the entity discover. */
    public enum DiscoverStatus implements com.oracle.bmc.http.internal.BmcEnum {
        PrevDiscovered("PREV_DISCOVERED"),
        NewDiscovered("NEW_DISCOVERED"),
        NotFound("NOT_FOUND"),
        Discovering("DISCOVERING"),
        ;

        private final String value;
        private static java.util.Map<String, DiscoverStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoverStatus v : DiscoverStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        DiscoverStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoverStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DiscoverStatus: " + key);
        }
    };
    /** The status of the entity discover. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoverStatus")
    private final DiscoverStatus discoverStatus;

    /**
     * The status of the entity discover.
     *
     * @return the value
     */
    public DiscoverStatus getDiscoverStatus() {
        return discoverStatus;
    }

    /** The error code of the discovery on the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("discoverErrorCode")
    private final String discoverErrorCode;

    /**
     * The error code of the discovery on the resource
     *
     * @return the value
     */
    public String getDiscoverErrorCode() {
        return discoverErrorCode;
    }

    /** The error message of the discovery on the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("discoverErrorMsg")
    private final String discoverErrorMsg;

    /**
     * The error message of the discovery on the resource
     *
     * @return the value
     */
    public String getDiscoverErrorMsg() {
        return discoverErrorMsg;
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
        sb.append("EntityDiscovered(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", internalId=").append(String.valueOf(this.internalId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", discoverStatus=").append(String.valueOf(this.discoverStatus));
        sb.append(", discoverErrorCode=").append(String.valueOf(this.discoverErrorCode));
        sb.append(", discoverErrorMsg=").append(String.valueOf(this.discoverErrorMsg));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityDiscovered)) {
            return false;
        }

        EntityDiscovered other = (EntityDiscovered) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.internalId, other.internalId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.discoverStatus, other.discoverStatus)
                && java.util.Objects.equals(this.discoverErrorCode, other.discoverErrorCode)
                && java.util.Objects.equals(this.discoverErrorMsg, other.discoverErrorMsg)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.internalId == null ? 43 : this.internalId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.discoverStatus == null ? 43 : this.discoverStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.discoverErrorCode == null ? 43 : this.discoverErrorCode.hashCode());
        result =
                (result * PRIME)
                        + (this.discoverErrorMsg == null ? 43 : this.discoverErrorMsg.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of discovered entities. */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        StorageServerDiscoverSummary("STORAGE_SERVER_DISCOVER_SUMMARY"),
        StorageGridDiscoverSummary("STORAGE_GRID_DISCOVER_SUMMARY"),
        DatabaseSystemDiscoverSummary("DATABASE_SYSTEM_DISCOVER_SUMMARY"),
        InfrastructureDiscoverSummary("INFRASTRUCTURE_DISCOVER_SUMMARY"),
        InfrastructureDiscover("INFRASTRUCTURE_DISCOVER"),
        ;

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                map.put(v.getValue(), v);
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EntityType: " + key);
        }
    };
}
