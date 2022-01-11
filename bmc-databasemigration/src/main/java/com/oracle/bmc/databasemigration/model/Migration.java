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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Migration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Migration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waitAfter")
        private OdmsJobPhases waitAfter;

        public Builder waitAfter(OdmsJobPhases waitAfter) {
            this.waitAfter = waitAfter;
            this.__explicitlySet__.add("waitAfter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
        private String credentialsSecretId;

        public Builder credentialsSecretId(String credentialsSecretId) {
            this.credentialsSecretId = credentialsSecretId;
            this.__explicitlySet__.add("credentialsSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
        private String sourceDatabaseConnectionId;

        public Builder sourceDatabaseConnectionId(String sourceDatabaseConnectionId) {
            this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
            this.__explicitlySet__.add("sourceDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
        private String targetDatabaseConnectionId;

        public Builder targetDatabaseConnectionId(String targetDatabaseConnectionId) {
            this.targetDatabaseConnectionId = targetDatabaseConnectionId;
            this.__explicitlySet__.add("targetDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executingJobId")
        private String executingJobId;

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

        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<DatabaseObject> excludeObjects;

        public Builder excludeObjects(java.util.List<DatabaseObject> excludeObjects) {
            this.excludeObjects = excludeObjects;
            this.__explicitlySet__.add("excludeObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
        private java.util.List<DatabaseObject> includeObjects;

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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastMigration")
        private java.util.Date timeLastMigration;

        public Builder timeLastMigration(java.util.Date timeLastMigration) {
            this.timeLastMigration = timeLastMigration;
            this.__explicitlySet__.add("timeLastMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MigrationLifecycleStates lifecycleState;

        public Builder lifecycleState(MigrationLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private MigrationStatus lifecycleDetails;

        public Builder lifecycleDetails(MigrationStatus lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

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

    /**
     * The OCID of the resource
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Migration Display Name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * OCID of the compartment
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Migration type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    MigrationTypes type;

    /**
     * Name of a migration phase. The Job will wait after executing this
     * phase until the Resume Job endpoint is called.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waitAfter")
    OdmsJobPhases waitAfter;

    /**
     * The OCID of the registered on-premises ODMS Agent. Only valid for Offline Migrations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    String agentId;

    /**
     * OCID of the Secret in the OCI vault containing the Migration credentials. Used to store GoldenGate administrator user credentials.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
    String credentialsSecretId;

    /**
     * The OCID of the Source Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
    String sourceDatabaseConnectionId;

    /**
     * The OCID of the Source Container Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the Target Database Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
    String targetDatabaseConnectionId;

    /**
     * OCID of the current ODMS Job in execution for the Migration, if any.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executingJobId")
    String executingJobId;

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    DataTransferMediumDetails dataTransferMediumDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("dumpTransferDetails")
    DumpTransferDetails dumpTransferDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
    DataPumpSettings datapumpSettings;

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    AdvisorSettings advisorSettings;

    /**
     * Database objects to exclude from migration.
     * If 'includeObjects' are specified, only exclude object types can be specified with general wildcards (.*) for owner and objectName.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    java.util.List<DatabaseObject> excludeObjects;

    /**
     * Database objects to include from migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
    java.util.List<DatabaseObject> includeObjects;

    @com.fasterxml.jackson.annotation.JsonProperty("goldenGateDetails")
    GoldenGateDetails goldenGateDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    VaultDetails vaultDetails;

    /**
     * The time the Migration was created. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time of the last Migration details update. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The time of last Migration. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastMigration")
    java.util.Date timeLastMigration;

    /**
     * The current state of the Migration resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    MigrationLifecycleStates lifecycleState;

    /**
     * Additional status related to the execution and current state of the Migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    MigrationStatus lifecycleDetails;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
