/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration resource
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Migration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Migration {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "type",
        "waitAfter",
        "agentId",
        "credentialsSecretId",
        "sourceDatabaseConnectionId",
        "sourceContainerDatabaseConnectionId",
        "targetDatabaseConnectionId",
        "executingJobId",
        "dataTransferMediumDetails",
        "dumpTransferDetails",
        "datapumpSettings",
        "advisorSettings",
        "excludeObjects",
        "includeObjects",
        "goldenGateDetails",
        "vaultDetails",
        "timeCreated",
        "timeUpdated",
        "timeLastMigration",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Migration(
            String id,
            String displayName,
            String compartmentId,
            MigrationTypes type,
            OdmsJobPhases waitAfter,
            String agentId,
            String credentialsSecretId,
            String sourceDatabaseConnectionId,
            String sourceContainerDatabaseConnectionId,
            String targetDatabaseConnectionId,
            String executingJobId,
            DataTransferMediumDetails dataTransferMediumDetails,
            DumpTransferDetails dumpTransferDetails,
            DataPumpSettings datapumpSettings,
            AdvisorSettings advisorSettings,
            java.util.List<DatabaseObject> excludeObjects,
            java.util.List<DatabaseObject> includeObjects,
            GoldenGateDetails goldenGateDetails,
            VaultDetails vaultDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastMigration,
            MigrationLifecycleStates lifecycleState,
            MigrationStatus lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.type = type;
        this.waitAfter = waitAfter;
        this.agentId = agentId;
        this.credentialsSecretId = credentialsSecretId;
        this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
        this.targetDatabaseConnectionId = targetDatabaseConnectionId;
        this.executingJobId = executingJobId;
        this.dataTransferMediumDetails = dataTransferMediumDetails;
        this.dumpTransferDetails = dumpTransferDetails;
        this.datapumpSettings = datapumpSettings;
        this.advisorSettings = advisorSettings;
        this.excludeObjects = excludeObjects;
        this.includeObjects = includeObjects;
        this.goldenGateDetails = goldenGateDetails;
        this.vaultDetails = vaultDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastMigration = timeLastMigration;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Migration Display Name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Migration Display Name
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * OCID of the compartment
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Migration type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        /**
         * Migration type.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Name of a migration phase. The Job will wait after executing this
         * phase until the Resume Job endpoint is called.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("waitAfter")
        private OdmsJobPhases waitAfter;

        /**
         * Name of a migration phase. The Job will wait after executing this
         * phase until the Resume Job endpoint is called.
         *
         * @param waitAfter the value to set
         * @return this builder
         **/
        public Builder waitAfter(OdmsJobPhases waitAfter) {
            this.waitAfter = waitAfter;
            this.__explicitlySet__.add("waitAfter");
            return this;
        }
        /**
         * The OCID of the registered on-premises ODMS Agent. Only valid for Offline Migrations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The OCID of the registered on-premises ODMS Agent. Only valid for Offline Migrations.
         *
         * @param agentId the value to set
         * @return this builder
         **/
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * OCID of the Secret in the OCI vault containing the Migration credentials. Used to store GoldenGate administrator user credentials.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
        private String credentialsSecretId;

        /**
         * OCID of the Secret in the OCI vault containing the Migration credentials. Used to store GoldenGate administrator user credentials.
         *
         * @param credentialsSecretId the value to set
         * @return this builder
         **/
        public Builder credentialsSecretId(String credentialsSecretId) {
            this.credentialsSecretId = credentialsSecretId;
            this.__explicitlySet__.add("credentialsSecretId");
            return this;
        }
        /**
         * The OCID of the Source Database Connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
        private String sourceDatabaseConnectionId;

        /**
         * The OCID of the Source Database Connection.
         *
         * @param sourceDatabaseConnectionId the value to set
         * @return this builder
         **/
        public Builder sourceDatabaseConnectionId(String sourceDatabaseConnectionId) {
            this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
            this.__explicitlySet__.add("sourceDatabaseConnectionId");
            return this;
        }
        /**
         * The OCID of the Source Container Database Connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the Source Container Database Connection.
         *
         * @param sourceContainerDatabaseConnectionId the value to set
         * @return this builder
         **/
        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }
        /**
         * The OCID of the Target Database Connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
        private String targetDatabaseConnectionId;

        /**
         * The OCID of the Target Database Connection.
         *
         * @param targetDatabaseConnectionId the value to set
         * @return this builder
         **/
        public Builder targetDatabaseConnectionId(String targetDatabaseConnectionId) {
            this.targetDatabaseConnectionId = targetDatabaseConnectionId;
            this.__explicitlySet__.add("targetDatabaseConnectionId");
            return this;
        }
        /**
         * OCID of the current ODMS Job in execution for the Migration, if any.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executingJobId")
        private String executingJobId;

        /**
         * OCID of the current ODMS Job in execution for the Migration, if any.
         *
         * @param executingJobId the value to set
         * @return this builder
         **/
        public Builder executingJobId(String executingJobId) {
            this.executingJobId = executingJobId;
            this.__explicitlySet__.add("executingJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
        private DataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                DataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dumpTransferDetails")
        private DumpTransferDetails dumpTransferDetails;

        public Builder dumpTransferDetails(DumpTransferDetails dumpTransferDetails) {
            this.dumpTransferDetails = dumpTransferDetails;
            this.__explicitlySet__.add("dumpTransferDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
        private DataPumpSettings datapumpSettings;

        public Builder datapumpSettings(DataPumpSettings datapumpSettings) {
            this.datapumpSettings = datapumpSettings;
            this.__explicitlySet__.add("datapumpSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
        private AdvisorSettings advisorSettings;

        public Builder advisorSettings(AdvisorSettings advisorSettings) {
            this.advisorSettings = advisorSettings;
            this.__explicitlySet__.add("advisorSettings");
            return this;
        }
        /**
         * Database objects to exclude from migration.
         * If 'includeObjects' are specified, only exclude object types can be specified with general wildcards (.*) for owner and objectName.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<DatabaseObject> excludeObjects;

        /**
         * Database objects to exclude from migration.
         * If 'includeObjects' are specified, only exclude object types can be specified with general wildcards (.*) for owner and objectName.
         *
         * @param excludeObjects the value to set
         * @return this builder
         **/
        public Builder excludeObjects(java.util.List<DatabaseObject> excludeObjects) {
            this.excludeObjects = excludeObjects;
            this.__explicitlySet__.add("excludeObjects");
            return this;
        }
        /**
         * Database objects to include from migration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
        private java.util.List<DatabaseObject> includeObjects;

        /**
         * Database objects to include from migration.
         *
         * @param includeObjects the value to set
         * @return this builder
         **/
        public Builder includeObjects(java.util.List<DatabaseObject> includeObjects) {
            this.includeObjects = includeObjects;
            this.__explicitlySet__.add("includeObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("goldenGateDetails")
        private GoldenGateDetails goldenGateDetails;

        public Builder goldenGateDetails(GoldenGateDetails goldenGateDetails) {
            this.goldenGateDetails = goldenGateDetails;
            this.__explicitlySet__.add("goldenGateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private VaultDetails vaultDetails;

        public Builder vaultDetails(VaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
            return this;
        }
        /**
         * The time the Migration was created. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Migration was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time of the last Migration details update. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time of the last Migration details update. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time of last Migration. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastMigration")
        private java.util.Date timeLastMigration;

        /**
         * The time of last Migration. An RFC3339 formatted datetime string.
         *
         * @param timeLastMigration the value to set
         * @return this builder
         **/
        public Builder timeLastMigration(java.util.Date timeLastMigration) {
            this.timeLastMigration = timeLastMigration;
            this.__explicitlySet__.add("timeLastMigration");
            return this;
        }
        /**
         * The current state of the Migration resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MigrationLifecycleStates lifecycleState;

        /**
         * The current state of the Migration resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MigrationLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional status related to the execution and current state of the Migration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private MigrationStatus lifecycleDetails;

        /**
         * Additional status related to the execution and current state of the Migration.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(MigrationStatus lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Migration build() {
            Migration __instance__ =
                    new Migration(
                            id,
                            displayName,
                            compartmentId,
                            type,
                            waitAfter,
                            agentId,
                            credentialsSecretId,
                            sourceDatabaseConnectionId,
                            sourceContainerDatabaseConnectionId,
                            targetDatabaseConnectionId,
                            executingJobId,
                            dataTransferMediumDetails,
                            dumpTransferDetails,
                            datapumpSettings,
                            advisorSettings,
                            excludeObjects,
                            includeObjects,
                            goldenGateDetails,
                            vaultDetails,
                            timeCreated,
                            timeUpdated,
                            timeLastMigration,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Migration o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .type(o.getType())
                            .waitAfter(o.getWaitAfter())
                            .agentId(o.getAgentId())
                            .credentialsSecretId(o.getCredentialsSecretId())
                            .sourceDatabaseConnectionId(o.getSourceDatabaseConnectionId())
                            .sourceContainerDatabaseConnectionId(
                                    o.getSourceContainerDatabaseConnectionId())
                            .targetDatabaseConnectionId(o.getTargetDatabaseConnectionId())
                            .executingJobId(o.getExecutingJobId())
                            .dataTransferMediumDetails(o.getDataTransferMediumDetails())
                            .dumpTransferDetails(o.getDumpTransferDetails())
                            .datapumpSettings(o.getDatapumpSettings())
                            .advisorSettings(o.getAdvisorSettings())
                            .excludeObjects(o.getExcludeObjects())
                            .includeObjects(o.getIncludeObjects())
                            .goldenGateDetails(o.getGoldenGateDetails())
                            .vaultDetails(o.getVaultDetails())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .timeLastMigration(o.getTimeLastMigration())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the resource
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Migration Display Name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Migration Display Name
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID of the compartment
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Migration type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final MigrationTypes type;

    /**
     * Migration type.
     *
     * @return the value
     **/
    public MigrationTypes getType() {
        return type;
    }

    /**
     * Name of a migration phase. The Job will wait after executing this
     * phase until the Resume Job endpoint is called.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waitAfter")
    private final OdmsJobPhases waitAfter;

    /**
     * Name of a migration phase. The Job will wait after executing this
     * phase until the Resume Job endpoint is called.
     *
     * @return the value
     **/
    public OdmsJobPhases getWaitAfter() {
        return waitAfter;
    }

    /**
     * The OCID of the registered on-premises ODMS Agent. Only valid for Offline Migrations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The OCID of the registered on-premises ODMS Agent. Only valid for Offline Migrations.
     *
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
    }

    /**
     * OCID of the Secret in the OCI vault containing the Migration credentials. Used to store GoldenGate administrator user credentials.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
    private final String credentialsSecretId;

    /**
     * OCID of the Secret in the OCI vault containing the Migration credentials. Used to store GoldenGate administrator user credentials.
     *
     * @return the value
     **/
    public String getCredentialsSecretId() {
        return credentialsSecretId;
    }

    /**
     * The OCID of the Source Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
    private final String sourceDatabaseConnectionId;

    /**
     * The OCID of the Source Database Connection.
     *
     * @return the value
     **/
    public String getSourceDatabaseConnectionId() {
        return sourceDatabaseConnectionId;
    }

    /**
     * The OCID of the Source Container Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the Source Container Database Connection.
     *
     * @return the value
     **/
    public String getSourceContainerDatabaseConnectionId() {
        return sourceContainerDatabaseConnectionId;
    }

    /**
     * The OCID of the Target Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
    private final String targetDatabaseConnectionId;

    /**
     * The OCID of the Target Database Connection.
     *
     * @return the value
     **/
    public String getTargetDatabaseConnectionId() {
        return targetDatabaseConnectionId;
    }

    /**
     * OCID of the current ODMS Job in execution for the Migration, if any.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executingJobId")
    private final String executingJobId;

    /**
     * OCID of the current ODMS Job in execution for the Migration, if any.
     *
     * @return the value
     **/
    public String getExecutingJobId() {
        return executingJobId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    private final DataTransferMediumDetails dataTransferMediumDetails;

    public DataTransferMediumDetails getDataTransferMediumDetails() {
        return dataTransferMediumDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dumpTransferDetails")
    private final DumpTransferDetails dumpTransferDetails;

    public DumpTransferDetails getDumpTransferDetails() {
        return dumpTransferDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
    private final DataPumpSettings datapumpSettings;

    public DataPumpSettings getDatapumpSettings() {
        return datapumpSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    private final AdvisorSettings advisorSettings;

    public AdvisorSettings getAdvisorSettings() {
        return advisorSettings;
    }

    /**
     * Database objects to exclude from migration.
     * If 'includeObjects' are specified, only exclude object types can be specified with general wildcards (.*) for owner and objectName.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    private final java.util.List<DatabaseObject> excludeObjects;

    /**
     * Database objects to exclude from migration.
     * If 'includeObjects' are specified, only exclude object types can be specified with general wildcards (.*) for owner and objectName.
     *
     * @return the value
     **/
    public java.util.List<DatabaseObject> getExcludeObjects() {
        return excludeObjects;
    }

    /**
     * Database objects to include from migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
    private final java.util.List<DatabaseObject> includeObjects;

    /**
     * Database objects to include from migration.
     *
     * @return the value
     **/
    public java.util.List<DatabaseObject> getIncludeObjects() {
        return includeObjects;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("goldenGateDetails")
    private final GoldenGateDetails goldenGateDetails;

    public GoldenGateDetails getGoldenGateDetails() {
        return goldenGateDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    private final VaultDetails vaultDetails;

    public VaultDetails getVaultDetails() {
        return vaultDetails;
    }

    /**
     * The time the Migration was created. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Migration was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time of the last Migration details update. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time of the last Migration details update. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time of last Migration. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastMigration")
    private final java.util.Date timeLastMigration;

    /**
     * The time of last Migration. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastMigration() {
        return timeLastMigration;
    }

    /**
     * The current state of the Migration resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MigrationLifecycleStates lifecycleState;

    /**
     * The current state of the Migration resource.
     *
     * @return the value
     **/
    public MigrationLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional status related to the execution and current state of the Migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final MigrationStatus lifecycleDetails;

    /**
     * Additional status related to the execution and current state of the Migration.
     *
     * @return the value
     **/
    public MigrationStatus getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Migration(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", waitAfter=").append(String.valueOf(this.waitAfter));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", credentialsSecretId=").append(String.valueOf(this.credentialsSecretId));
        sb.append(", sourceDatabaseConnectionId=")
                .append(String.valueOf(this.sourceDatabaseConnectionId));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", targetDatabaseConnectionId=")
                .append(String.valueOf(this.targetDatabaseConnectionId));
        sb.append(", executingJobId=").append(String.valueOf(this.executingJobId));
        sb.append(", dataTransferMediumDetails=")
                .append(String.valueOf(this.dataTransferMediumDetails));
        sb.append(", dumpTransferDetails=").append(String.valueOf(this.dumpTransferDetails));
        sb.append(", datapumpSettings=").append(String.valueOf(this.datapumpSettings));
        sb.append(", advisorSettings=").append(String.valueOf(this.advisorSettings));
        sb.append(", excludeObjects=").append(String.valueOf(this.excludeObjects));
        sb.append(", includeObjects=").append(String.valueOf(this.includeObjects));
        sb.append(", goldenGateDetails=").append(String.valueOf(this.goldenGateDetails));
        sb.append(", vaultDetails=").append(String.valueOf(this.vaultDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastMigration=").append(String.valueOf(this.timeLastMigration));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Migration)) {
            return false;
        }

        Migration other = (Migration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.waitAfter, other.waitAfter)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.credentialsSecretId, other.credentialsSecretId)
                && java.util.Objects.equals(
                        this.sourceDatabaseConnectionId, other.sourceDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.targetDatabaseConnectionId, other.targetDatabaseConnectionId)
                && java.util.Objects.equals(this.executingJobId, other.executingJobId)
                && java.util.Objects.equals(
                        this.dataTransferMediumDetails, other.dataTransferMediumDetails)
                && java.util.Objects.equals(this.dumpTransferDetails, other.dumpTransferDetails)
                && java.util.Objects.equals(this.datapumpSettings, other.datapumpSettings)
                && java.util.Objects.equals(this.advisorSettings, other.advisorSettings)
                && java.util.Objects.equals(this.excludeObjects, other.excludeObjects)
                && java.util.Objects.equals(this.includeObjects, other.includeObjects)
                && java.util.Objects.equals(this.goldenGateDetails, other.goldenGateDetails)
                && java.util.Objects.equals(this.vaultDetails, other.vaultDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastMigration, other.timeLastMigration)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.waitAfter == null ? 43 : this.waitAfter.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialsSecretId == null
                                ? 43
                                : this.credentialsSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabaseConnectionId == null
                                ? 43
                                : this.sourceDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceContainerDatabaseConnectionId == null
                                ? 43
                                : this.sourceContainerDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseConnectionId == null
                                ? 43
                                : this.targetDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.executingJobId == null ? 43 : this.executingJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataTransferMediumDetails == null
                                ? 43
                                : this.dataTransferMediumDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.dumpTransferDetails == null
                                ? 43
                                : this.dumpTransferDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.datapumpSettings == null ? 43 : this.datapumpSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorSettings == null ? 43 : this.advisorSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeObjects == null ? 43 : this.excludeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.includeObjects == null ? 43 : this.includeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.goldenGateDetails == null ? 43 : this.goldenGateDetails.hashCode());
        result = (result * PRIME) + (this.vaultDetails == null ? 43 : this.vaultDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastMigration == null ? 43 : this.timeLastMigration.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
