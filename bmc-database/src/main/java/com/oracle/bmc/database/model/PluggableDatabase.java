/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * A pluggable database (PDB) is portable collection of schemas, schema objects, and non-schema objects that appears to an Oracle client as a non-container database. To use a PDB, it needs to be plugged into a CDB.
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized, talk to a tenancy administrator. If you are an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PluggableDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PluggableDatabase extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "containerDatabaseId",
        "pdbName",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "connectionStrings",
        "openMode",
        "isRestricted",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "pluggableDatabaseManagementConfig",
        "refreshableCloneConfig",
        "pdbNodeLevelDetails"
    })
    public PluggableDatabase(
            String id,
            String containerDatabaseId,
            String pdbName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            PluggableDatabaseConnectionStrings connectionStrings,
            OpenMode openMode,
            Boolean isRestricted,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            PluggableDatabaseManagementConfig pluggableDatabaseManagementConfig,
            PluggableDatabaseRefreshableCloneConfig refreshableCloneConfig,
            java.util.List<PluggableDatabaseNodeLevelDetails> pdbNodeLevelDetails) {
        super();
        this.id = id;
        this.containerDatabaseId = containerDatabaseId;
        this.pdbName = pdbName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.connectionStrings = connectionStrings;
        this.openMode = openMode;
        this.isRestricted = isRestricted;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.pluggableDatabaseManagementConfig = pluggableDatabaseManagementConfig;
        this.refreshableCloneConfig = refreshableCloneConfig;
        this.pdbNodeLevelDetails = pdbNodeLevelDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the pluggable database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the pluggable database.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CDB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
        private String containerDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CDB.
         * @param containerDatabaseId the value to set
         * @return this builder
         **/
        public Builder containerDatabaseId(String containerDatabaseId) {
            this.containerDatabaseId = containerDatabaseId;
            this.__explicitlySet__.add("containerDatabaseId");
            return this;
        }
        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        /**
         * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
         * @param pdbName the value to set
         * @return this builder
         **/
        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }
        /**
         * The current state of the pluggable database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the pluggable database.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Detailed message for the lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed message for the lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the pluggable database was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the pluggable database was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private PluggableDatabaseConnectionStrings connectionStrings;

        public Builder connectionStrings(PluggableDatabaseConnectionStrings connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }
        /**
         * **Deprecated.** Use {@link #pluggableDatabaseNodeLevelDetails(PluggableDatabaseNodeLevelDetailsRequest) pluggableDatabaseNodeLevelDetails} for OpenMode details.
         * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        /**
         * **Deprecated.** Use {@link #pluggableDatabaseNodeLevelDetails(PluggableDatabaseNodeLevelDetailsRequest) pluggableDatabaseNodeLevelDetails} for OpenMode details.
         * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
         *
         * @param openMode the value to set
         * @return this builder
         **/
        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }
        /**
         * The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode,
         * the user needs both create a session and have restricted session privileges to connect to it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
        private Boolean isRestricted;

        /**
         * The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode,
         * the user needs both create a session and have restricted session privileges to connect to it.
         *
         * @param isRestricted the value to set
         * @return this builder
         **/
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
            this.__explicitlySet__.add("isRestricted");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabaseManagementConfig")
        private PluggableDatabaseManagementConfig pluggableDatabaseManagementConfig;

        public Builder pluggableDatabaseManagementConfig(
                PluggableDatabaseManagementConfig pluggableDatabaseManagementConfig) {
            this.pluggableDatabaseManagementConfig = pluggableDatabaseManagementConfig;
            this.__explicitlySet__.add("pluggableDatabaseManagementConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshableCloneConfig")
        private PluggableDatabaseRefreshableCloneConfig refreshableCloneConfig;

        public Builder refreshableCloneConfig(
                PluggableDatabaseRefreshableCloneConfig refreshableCloneConfig) {
            this.refreshableCloneConfig = refreshableCloneConfig;
            this.__explicitlySet__.add("refreshableCloneConfig");
            return this;
        }
        /**
         * Pluggable Database Node Level Details.
         * Example: [{"nodeName" : "node1", "openMode" : "READ_WRITE"}, {"nodeName" : "node2", "openMode" : "READ_ONLY"}]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pdbNodeLevelDetails")
        private java.util.List<PluggableDatabaseNodeLevelDetails> pdbNodeLevelDetails;

        /**
         * Pluggable Database Node Level Details.
         * Example: [{"nodeName" : "node1", "openMode" : "READ_WRITE"}, {"nodeName" : "node2", "openMode" : "READ_ONLY"}]
         *
         * @param pdbNodeLevelDetails the value to set
         * @return this builder
         **/
        public Builder pdbNodeLevelDetails(
                java.util.List<PluggableDatabaseNodeLevelDetails> pdbNodeLevelDetails) {
            this.pdbNodeLevelDetails = pdbNodeLevelDetails;
            this.__explicitlySet__.add("pdbNodeLevelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluggableDatabase build() {
            PluggableDatabase model =
                    new PluggableDatabase(
                            this.id,
                            this.containerDatabaseId,
                            this.pdbName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.connectionStrings,
                            this.openMode,
                            this.isRestricted,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.pluggableDatabaseManagementConfig,
                            this.refreshableCloneConfig,
                            this.pdbNodeLevelDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluggableDatabase model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseId")) {
                this.containerDatabaseId(model.getContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("pdbName")) {
                this.pdbName(model.getPdbName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("connectionStrings")) {
                this.connectionStrings(model.getConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
            }
            if (model.wasPropertyExplicitlySet("isRestricted")) {
                this.isRestricted(model.getIsRestricted());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("pluggableDatabaseManagementConfig")) {
                this.pluggableDatabaseManagementConfig(
                        model.getPluggableDatabaseManagementConfig());
            }
            if (model.wasPropertyExplicitlySet("refreshableCloneConfig")) {
                this.refreshableCloneConfig(model.getRefreshableCloneConfig());
            }
            if (model.wasPropertyExplicitlySet("pdbNodeLevelDetails")) {
                this.pdbNodeLevelDetails(model.getPdbNodeLevelDetails());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the pluggable database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the pluggable database.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CDB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
    private final String containerDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the CDB.
     * @return the value
     **/
    public String getContainerDatabaseId() {
        return containerDatabaseId;
    }

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    private final String pdbName;

    /**
     * The name for the pluggable database (PDB). The name is unique in the context of a {@link Database}. The name must begin with an alphabetic character and can contain a maximum of thirty alphanumeric characters. Special characters are not permitted. The pluggable database name should not be same as the container database name.
     * @return the value
     **/
    public String getPdbName() {
        return pdbName;
    }

    /**
     * The current state of the pluggable database.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Updating("UPDATING"),
        Failed("FAILED"),
        Relocating("RELOCATING"),
        Relocated("RELOCATED"),
        Refreshing("REFRESHING"),
        RestoreInProgress("RESTORE_IN_PROGRESS"),
        RestoreFailed("RESTORE_FAILED"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Disabled("DISABLED"),

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
     * The current state of the pluggable database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the pluggable database.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Detailed message for the lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed message for the lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the pluggable database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the pluggable database was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final PluggableDatabaseConnectionStrings connectionStrings;

    public PluggableDatabaseConnectionStrings getConnectionStrings() {
        return connectionStrings;
    }

    /**
     * **Deprecated.** Use {@link #pluggableDatabaseNodeLevelDetails(PluggableDatabaseNodeLevelDetailsRequest) pluggableDatabaseNodeLevelDetails} for OpenMode details.
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     *
     **/
    public enum OpenMode {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),
        Mounted("MOUNTED"),
        Migrate("MIGRATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OpenMode.class);

        private final String value;
        private static java.util.Map<String, OpenMode> map;

        static {
            map = new java.util.HashMap<>();
            for (OpenMode v : OpenMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OpenMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OpenMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OpenMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * **Deprecated.** Use {@link #pluggableDatabaseNodeLevelDetails(PluggableDatabaseNodeLevelDetailsRequest) pluggableDatabaseNodeLevelDetails} for OpenMode details.
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final OpenMode openMode;

    /**
     * **Deprecated.** Use {@link #pluggableDatabaseNodeLevelDetails(PluggableDatabaseNodeLevelDetailsRequest) pluggableDatabaseNodeLevelDetails} for OpenMode details.
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     *
     * @return the value
     **/
    public OpenMode getOpenMode() {
        return openMode;
    }

    /**
     * The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode,
     * the user needs both create a session and have restricted session privileges to connect to it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRestricted")
    private final Boolean isRestricted;

    /**
     * The restricted mode of the pluggable database. If a pluggable database is opened in restricted mode,
     * the user needs both create a session and have restricted session privileges to connect to it.
     *
     * @return the value
     **/
    public Boolean getIsRestricted() {
        return isRestricted;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabaseManagementConfig")
    private final PluggableDatabaseManagementConfig pluggableDatabaseManagementConfig;

    public PluggableDatabaseManagementConfig getPluggableDatabaseManagementConfig() {
        return pluggableDatabaseManagementConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("refreshableCloneConfig")
    private final PluggableDatabaseRefreshableCloneConfig refreshableCloneConfig;

    public PluggableDatabaseRefreshableCloneConfig getRefreshableCloneConfig() {
        return refreshableCloneConfig;
    }

    /**
     * Pluggable Database Node Level Details.
     * Example: [{"nodeName" : "node1", "openMode" : "READ_WRITE"}, {"nodeName" : "node2", "openMode" : "READ_ONLY"}]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbNodeLevelDetails")
    private final java.util.List<PluggableDatabaseNodeLevelDetails> pdbNodeLevelDetails;

    /**
     * Pluggable Database Node Level Details.
     * Example: [{"nodeName" : "node1", "openMode" : "READ_WRITE"}, {"nodeName" : "node2", "openMode" : "READ_ONLY"}]
     *
     * @return the value
     **/
    public java.util.List<PluggableDatabaseNodeLevelDetails> getPdbNodeLevelDetails() {
        return pdbNodeLevelDetails;
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
        sb.append("PluggableDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", containerDatabaseId=").append(String.valueOf(this.containerDatabaseId));
        sb.append(", pdbName=").append(String.valueOf(this.pdbName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(", isRestricted=").append(String.valueOf(this.isRestricted));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", pluggableDatabaseManagementConfig=")
                .append(String.valueOf(this.pluggableDatabaseManagementConfig));
        sb.append(", refreshableCloneConfig=").append(String.valueOf(this.refreshableCloneConfig));
        sb.append(", pdbNodeLevelDetails=").append(String.valueOf(this.pdbNodeLevelDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluggableDatabase)) {
            return false;
        }

        PluggableDatabase other = (PluggableDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.containerDatabaseId, other.containerDatabaseId)
                && java.util.Objects.equals(this.pdbName, other.pdbName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && java.util.Objects.equals(this.isRestricted, other.isRestricted)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.pluggableDatabaseManagementConfig,
                        other.pluggableDatabaseManagementConfig)
                && java.util.Objects.equals(
                        this.refreshableCloneConfig, other.refreshableCloneConfig)
                && java.util.Objects.equals(this.pdbNodeLevelDetails, other.pdbNodeLevelDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseId == null
                                ? 43
                                : this.containerDatabaseId.hashCode());
        result = (result * PRIME) + (this.pdbName == null ? 43 : this.pdbName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result = (result * PRIME) + (this.isRestricted == null ? 43 : this.isRestricted.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.pluggableDatabaseManagementConfig == null
                                ? 43
                                : this.pluggableDatabaseManagementConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableCloneConfig == null
                                ? 43
                                : this.refreshableCloneConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.pdbNodeLevelDetails == null
                                ? 43
                                : this.pdbNodeLevelDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
