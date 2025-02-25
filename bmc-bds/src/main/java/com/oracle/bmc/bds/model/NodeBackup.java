/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the Node's backup.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodeBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodeBackup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "nodeInstanceId",
        "nodeHostName",
        "backupTriggerType",
        "nodeBackupConfigId",
        "backupType",
        "lifecycleState",
        "timeCreated"
    })
    public NodeBackup(
            String id,
            String displayName,
            String nodeInstanceId,
            String nodeHostName,
            BackupTriggerType backupTriggerType,
            String nodeBackupConfigId,
            BackupType backupType,
            LifecycleState lifecycleState,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.nodeInstanceId = nodeInstanceId;
        this.nodeHostName = nodeHostName;
        this.backupTriggerType = backupTriggerType;
        this.nodeBackupConfigId = nodeBackupConfigId;
        this.backupType = backupType;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the node backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the node backup.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * BDS generated name for the backup. Format is nodeHostName_timeCreated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * BDS generated name for the backup. Format is nodeHostName_timeCreated
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The instance OCID of the node, which is the resource from which the node backup was acquired.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeInstanceId")
        private String nodeInstanceId;

        /**
         * The instance OCID of the node, which is the resource from which the node backup was acquired.
         * @param nodeInstanceId the value to set
         * @return this builder
         **/
        public Builder nodeInstanceId(String nodeInstanceId) {
            this.nodeInstanceId = nodeInstanceId;
            this.__explicitlySet__.add("nodeInstanceId");
            return this;
        }
        /**
         * Host name of the node to which this backup belongs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeHostName")
        private String nodeHostName;

        /**
         * Host name of the node to which this backup belongs.
         * @param nodeHostName the value to set
         * @return this builder
         **/
        public Builder nodeHostName(String nodeHostName) {
            this.nodeHostName = nodeHostName;
            this.__explicitlySet__.add("nodeHostName");
            return this;
        }
        /**
         * type based on how backup action was initiated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupTriggerType")
        private BackupTriggerType backupTriggerType;

        /**
         * type based on how backup action was initiated.
         * @param backupTriggerType the value to set
         * @return this builder
         **/
        public Builder backupTriggerType(BackupTriggerType backupTriggerType) {
            this.backupTriggerType = backupTriggerType;
            this.__explicitlySet__.add("backupTriggerType");
            return this;
        }
        /**
         * The ID of the nodeBackupConfiguration if the NodeBackup is automatically created by applying the configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeBackupConfigId")
        private String nodeBackupConfigId;

        /**
         * The ID of the nodeBackupConfiguration if the NodeBackup is automatically created by applying the configuration.
         * @param nodeBackupConfigId the value to set
         * @return this builder
         **/
        public Builder nodeBackupConfigId(String nodeBackupConfigId) {
            this.nodeBackupConfigId = nodeBackupConfigId;
            this.__explicitlySet__.add("nodeBackupConfigId");
            return this;
        }
        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        /**
         * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
         * @param backupType the value to set
         * @return this builder
         **/
        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /**
         * The state of the NodeBackup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the NodeBackup.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeBackup build() {
            NodeBackup model =
                    new NodeBackup(
                            this.id,
                            this.displayName,
                            this.nodeInstanceId,
                            this.nodeHostName,
                            this.backupTriggerType,
                            this.nodeBackupConfigId,
                            this.backupType,
                            this.lifecycleState,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeBackup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nodeInstanceId")) {
                this.nodeInstanceId(model.getNodeInstanceId());
            }
            if (model.wasPropertyExplicitlySet("nodeHostName")) {
                this.nodeHostName(model.getNodeHostName());
            }
            if (model.wasPropertyExplicitlySet("backupTriggerType")) {
                this.backupTriggerType(model.getBackupTriggerType());
            }
            if (model.wasPropertyExplicitlySet("nodeBackupConfigId")) {
                this.nodeBackupConfigId(model.getNodeBackupConfigId());
            }
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The id of the node backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the node backup.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * BDS generated name for the backup. Format is nodeHostName_timeCreated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * BDS generated name for the backup. Format is nodeHostName_timeCreated
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The instance OCID of the node, which is the resource from which the node backup was acquired.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeInstanceId")
    private final String nodeInstanceId;

    /**
     * The instance OCID of the node, which is the resource from which the node backup was acquired.
     * @return the value
     **/
    public String getNodeInstanceId() {
        return nodeInstanceId;
    }

    /**
     * Host name of the node to which this backup belongs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeHostName")
    private final String nodeHostName;

    /**
     * Host name of the node to which this backup belongs.
     * @return the value
     **/
    public String getNodeHostName() {
        return nodeHostName;
    }

    /**
     * type based on how backup action was initiated.
     **/
    public enum BackupTriggerType {
        Manual("MANUAL"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupTriggerType.class);

        private final String value;
        private static java.util.Map<String, BackupTriggerType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupTriggerType v : BackupTriggerType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupTriggerType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupTriggerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupTriggerType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * type based on how backup action was initiated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupTriggerType")
    private final BackupTriggerType backupTriggerType;

    /**
     * type based on how backup action was initiated.
     * @return the value
     **/
    public BackupTriggerType getBackupTriggerType() {
        return backupTriggerType;
    }

    /**
     * The ID of the nodeBackupConfiguration if the NodeBackup is automatically created by applying the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeBackupConfigId")
    private final String nodeBackupConfigId;

    /**
     * The ID of the nodeBackupConfiguration if the NodeBackup is automatically created by applying the configuration.
     * @return the value
     **/
    public String getNodeBackupConfigId() {
        return nodeBackupConfigId;
    }

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
     **/
    public enum BackupType {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupType.class);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final BackupType backupType;

    /**
     * Incremental backup type includes only the changes since the last backup. Full backup type includes all changes since the volume was created.
     * @return the value
     **/
    public BackupType getBackupType() {
        return backupType;
    }

    /**
     * The state of the NodeBackup.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Partial("PARTIAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the NodeBackup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the NodeBackup.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("NodeBackup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", nodeInstanceId=").append(String.valueOf(this.nodeInstanceId));
        sb.append(", nodeHostName=").append(String.valueOf(this.nodeHostName));
        sb.append(", backupTriggerType=").append(String.valueOf(this.backupTriggerType));
        sb.append(", nodeBackupConfigId=").append(String.valueOf(this.nodeBackupConfigId));
        sb.append(", backupType=").append(String.valueOf(this.backupType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeBackup)) {
            return false;
        }

        NodeBackup other = (NodeBackup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nodeInstanceId, other.nodeInstanceId)
                && java.util.Objects.equals(this.nodeHostName, other.nodeHostName)
                && java.util.Objects.equals(this.backupTriggerType, other.backupTriggerType)
                && java.util.Objects.equals(this.nodeBackupConfigId, other.nodeBackupConfigId)
                && java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
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
                        + (this.nodeInstanceId == null ? 43 : this.nodeInstanceId.hashCode());
        result = (result * PRIME) + (this.nodeHostName == null ? 43 : this.nodeHostName.hashCode());
        result =
                (result * PRIME)
                        + (this.backupTriggerType == null ? 43 : this.backupTriggerType.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeBackupConfigId == null
                                ? 43
                                : this.nodeBackupConfigId.hashCode());
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
