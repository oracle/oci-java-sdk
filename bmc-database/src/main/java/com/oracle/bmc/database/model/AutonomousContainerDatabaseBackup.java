/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Autonomous Database backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousContainerDatabaseBackup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousContainerDatabaseBackup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "autonomousContainerDatabaseId",
        "displayName",
        "acdDisplayName",
        "type",
        "isAutomatic",
        "timeStarted",
        "timeEnded",
        "lifecycleDetails",
        "lifecycleState",
        "retentionPeriodInDays",
        "isRemoteBackup",
        "infrastructureType",
        "freeformTags",
        "definedTags",
        "systemTags",
        "autonomousDatabases"
    })
    public AutonomousContainerDatabaseBackup(
            String id,
            String compartmentId,
            String autonomousContainerDatabaseId,
            String displayName,
            String acdDisplayName,
            Type type,
            Boolean isAutomatic,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            Integer retentionPeriodInDays,
            Boolean isRemoteBackup,
            InfrastructureType infrastructureType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<AutonomousDatabaseInBackup> autonomousDatabases) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
        this.displayName = displayName;
        this.acdDisplayName = acdDisplayName;
        this.type = type;
        this.isAutomatic = isAutomatic;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.isRemoteBackup = isRemoteBackup;
        this.infrastructureType = infrastructureType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.autonomousDatabases = autonomousDatabases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database backup.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
        private String autonomousContainerDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Container Database.
         *
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            this.__explicitlySet__.add("autonomousContainerDatabaseId");
            return this;
        }
        /** A user-friendly name for the backup. This name need not be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the backup. This name need not be unique.
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
         * The user-friendly name for the Autonomous Container Database when the Backup was
         * initiated. This name need not be unique. This field captures the name at the time of
         * backup creation, accounting for possible later updates to the display name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("acdDisplayName")
        private String acdDisplayName;

        /**
         * The user-friendly name for the Autonomous Container Database when the Backup was
         * initiated. This name need not be unique. This field captures the name at the time of
         * backup creation, accounting for possible later updates to the display name.
         *
         * @param acdDisplayName the value to set
         * @return this builder
         */
        public Builder acdDisplayName(String acdDisplayName) {
            this.acdDisplayName = acdDisplayName;
            this.__explicitlySet__.add("acdDisplayName");
            return this;
        }
        /** The type of backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of backup.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Indicates whether the backup is user-initiated or automatic. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomatic")
        private Boolean isAutomatic;

        /**
         * Indicates whether the backup is user-initiated or automatic.
         *
         * @param isAutomatic the value to set
         * @return this builder
         */
        public Builder isAutomatic(Boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            this.__explicitlySet__.add("isAutomatic");
            return this;
        }
        /** The date and time the backup started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the backup started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The date and time the backup completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the backup completed.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current state of the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Retention period, in days, for long-term backups */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * Retention period, in days, for long-term backups
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /** Whether backup is for remote-region or local region */
        @com.fasterxml.jackson.annotation.JsonProperty("isRemoteBackup")
        private Boolean isRemoteBackup;

        /**
         * Whether backup is for remote-region or local region
         *
         * @param isRemoteBackup the value to set
         * @return this builder
         */
        public Builder isRemoteBackup(Boolean isRemoteBackup) {
            this.isRemoteBackup = isRemoteBackup;
            this.__explicitlySet__.add("isRemoteBackup");
            return this;
        }
        /** The infrastructure type this resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
        private InfrastructureType infrastructureType;

        /**
         * The infrastructure type this resource belongs to.
         *
         * @param infrastructureType the value to set
         * @return this builder
         */
        public Builder infrastructureType(InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            this.__explicitlySet__.add("infrastructureType");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * List of Autonomous Databases that is part of this Autonomous Container Database Backup
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabases")
        private java.util.List<AutonomousDatabaseInBackup> autonomousDatabases;

        /**
         * List of Autonomous Databases that is part of this Autonomous Container Database Backup
         *
         * @param autonomousDatabases the value to set
         * @return this builder
         */
        public Builder autonomousDatabases(
                java.util.List<AutonomousDatabaseInBackup> autonomousDatabases) {
            this.autonomousDatabases = autonomousDatabases;
            this.__explicitlySet__.add("autonomousDatabases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabaseBackup build() {
            AutonomousContainerDatabaseBackup model =
                    new AutonomousContainerDatabaseBackup(
                            this.id,
                            this.compartmentId,
                            this.autonomousContainerDatabaseId,
                            this.displayName,
                            this.acdDisplayName,
                            this.type,
                            this.isAutomatic,
                            this.timeStarted,
                            this.timeEnded,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.retentionPeriodInDays,
                            this.isRemoteBackup,
                            this.infrastructureType,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.autonomousDatabases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabaseBackup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseId")) {
                this.autonomousContainerDatabaseId(model.getAutonomousContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("acdDisplayName")) {
                this.acdDisplayName(model.getAcdDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isAutomatic")) {
                this.isAutomatic(model.getIsAutomatic());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("isRemoteBackup")) {
                this.isRemoteBackup(model.getIsRemoteBackup());
            }
            if (model.wasPropertyExplicitlySet("infrastructureType")) {
                this.infrastructureType(model.getInfrastructureType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabases")) {
                this.autonomousDatabases(model.getAutonomousDatabases());
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
     * Autonomous Database backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Database backup.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
    private final String autonomousContainerDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Container Database.
     *
     * @return the value
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }

    /** A user-friendly name for the backup. This name need not be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the backup. This name need not be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The user-friendly name for the Autonomous Container Database when the Backup was initiated.
     * This name need not be unique. This field captures the name at the time of backup creation,
     * accounting for possible later updates to the display name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("acdDisplayName")
    private final String acdDisplayName;

    /**
     * The user-friendly name for the Autonomous Container Database when the Backup was initiated.
     * This name need not be unique. This field captures the name at the time of backup creation,
     * accounting for possible later updates to the display name.
     *
     * @return the value
     */
    public String getAcdDisplayName() {
        return acdDisplayName;
    }

    /** The type of backup. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Incremental("INCREMENTAL"),
        Full("FULL"),
        VirtualFull("VIRTUAL_FULL"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /** The type of backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of backup.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Indicates whether the backup is user-initiated or automatic. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomatic")
    private final Boolean isAutomatic;

    /**
     * Indicates whether the backup is user-initiated or automatic.
     *
     * @return the value
     */
    public Boolean getIsAutomatic() {
        return isAutomatic;
    }

    /** The date and time the backup started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the backup started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The date and time the backup completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the backup completed.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current state of the backup. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /** The current state of the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Retention period, in days, for long-term backups */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * Retention period, in days, for long-term backups
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /** Whether backup is for remote-region or local region */
    @com.fasterxml.jackson.annotation.JsonProperty("isRemoteBackup")
    private final Boolean isRemoteBackup;

    /**
     * Whether backup is for remote-region or local region
     *
     * @return the value
     */
    public Boolean getIsRemoteBackup() {
        return isRemoteBackup;
    }

    /** The infrastructure type this resource belongs to. */
    public enum InfrastructureType implements com.oracle.bmc.http.internal.BmcEnum {
        Cloud("CLOUD"),
        CloudAtCustomer("CLOUD_AT_CUSTOMER"),
        ;

        private final String value;
        private static java.util.Map<String, InfrastructureType> map;

        static {
            map = new java.util.HashMap<>();
            for (InfrastructureType v : InfrastructureType.values()) {
                map.put(v.getValue(), v);
            }
        }

        InfrastructureType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InfrastructureType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid InfrastructureType: " + key);
        }
    };
    /** The infrastructure type this resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    private final InfrastructureType infrastructureType;

    /**
     * The infrastructure type this resource belongs to.
     *
     * @return the value
     */
    public InfrastructureType getInfrastructureType() {
        return infrastructureType;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** List of Autonomous Databases that is part of this Autonomous Container Database Backup */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabases")
    private final java.util.List<AutonomousDatabaseInBackup> autonomousDatabases;

    /**
     * List of Autonomous Databases that is part of this Autonomous Container Database Backup
     *
     * @return the value
     */
    public java.util.List<AutonomousDatabaseInBackup> getAutonomousDatabases() {
        return autonomousDatabases;
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
        sb.append("AutonomousContainerDatabaseBackup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", acdDisplayName=").append(String.valueOf(this.acdDisplayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isAutomatic=").append(String.valueOf(this.isAutomatic));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", isRemoteBackup=").append(String.valueOf(this.isRemoteBackup));
        sb.append(", infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", autonomousDatabases=").append(String.valueOf(this.autonomousDatabases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousContainerDatabaseBackup)) {
            return false;
        }

        AutonomousContainerDatabaseBackup other = (AutonomousContainerDatabaseBackup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.acdDisplayName, other.acdDisplayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isAutomatic, other.isAutomatic)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(this.isRemoteBackup, other.isRemoteBackup)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.autonomousDatabases, other.autonomousDatabases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.acdDisplayName == null ? 43 : this.acdDisplayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isAutomatic == null ? 43 : this.isAutomatic.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.isRemoteBackup == null ? 43 : this.isRemoteBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabases == null
                                ? 43
                                : this.autonomousDatabases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
