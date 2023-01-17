/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Create Migration resource parameters.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMigrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMigrationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "displayName",
        "compartmentId",
        "agentId",
        "sourceDatabaseConnectionId",
        "sourceContainerDatabaseConnectionId",
        "targetDatabaseConnectionId",
        "dataTransferMediumDetails",
        "dumpTransferDetails",
        "datapumpSettings",
        "advisorSettings",
        "excludeObjects",
        "includeObjects",
        "goldenGateDetails",
        "vaultDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateMigrationDetails(
            MigrationTypes type,
            String displayName,
            String compartmentId,
            String agentId,
            String sourceDatabaseConnectionId,
            String sourceContainerDatabaseConnectionId,
            String targetDatabaseConnectionId,
            CreateDataTransferMediumDetails dataTransferMediumDetails,
            CreateDumpTransferDetails dumpTransferDetails,
            CreateDataPumpSettings datapumpSettings,
            CreateAdvisorSettings advisorSettings,
            java.util.List<DatabaseObject> excludeObjects,
            java.util.List<DatabaseObject> includeObjects,
            CreateGoldenGateDetails goldenGateDetails,
            CreateVaultDetails vaultDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.type = type;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.agentId = agentId;
        this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
        this.targetDatabaseConnectionId = targetDatabaseConnectionId;
        this.dataTransferMediumDetails = dataTransferMediumDetails;
        this.dumpTransferDetails = dumpTransferDetails;
        this.datapumpSettings = datapumpSettings;
        this.advisorSettings = advisorSettings;
        this.excludeObjects = excludeObjects;
        this.includeObjects = includeObjects;
        this.goldenGateDetails = goldenGateDetails;
        this.vaultDetails = vaultDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The OCID of the registered ODMS Agent. Only valid for Offline Logical Migrations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The OCID of the registered ODMS Agent. Only valid for Offline Logical Migrations.
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
         * The OCID of the Source Container Database Connection. Only used for Online migrations.
         * Only Connections of type Non-Autonomous can be used as source container databases.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the Source Container Database Connection. Only used for Online migrations.
         * Only Connections of type Non-Autonomous can be used as source container databases.
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
        private CreateDataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                CreateDataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dumpTransferDetails")
        private CreateDumpTransferDetails dumpTransferDetails;

        public Builder dumpTransferDetails(CreateDumpTransferDetails dumpTransferDetails) {
            this.dumpTransferDetails = dumpTransferDetails;
            this.__explicitlySet__.add("dumpTransferDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
        private CreateDataPumpSettings datapumpSettings;

        public Builder datapumpSettings(CreateDataPumpSettings datapumpSettings) {
            this.datapumpSettings = datapumpSettings;
            this.__explicitlySet__.add("datapumpSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
        private CreateAdvisorSettings advisorSettings;

        public Builder advisorSettings(CreateAdvisorSettings advisorSettings) {
            this.advisorSettings = advisorSettings;
            this.__explicitlySet__.add("advisorSettings");
            return this;
        }
        /**
         * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<DatabaseObject> excludeObjects;

        /**
         * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
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
         * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
        private java.util.List<DatabaseObject> includeObjects;

        /**
         * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
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
        private CreateGoldenGateDetails goldenGateDetails;

        public Builder goldenGateDetails(CreateGoldenGateDetails goldenGateDetails) {
            this.goldenGateDetails = goldenGateDetails;
            this.__explicitlySet__.add("goldenGateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private CreateVaultDetails vaultDetails;

        public Builder vaultDetails(CreateVaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMigrationDetails build() {
            CreateMigrationDetails model =
                    new CreateMigrationDetails(
                            this.type,
                            this.displayName,
                            this.compartmentId,
                            this.agentId,
                            this.sourceDatabaseConnectionId,
                            this.sourceContainerDatabaseConnectionId,
                            this.targetDatabaseConnectionId,
                            this.dataTransferMediumDetails,
                            this.dumpTransferDetails,
                            this.datapumpSettings,
                            this.advisorSettings,
                            this.excludeObjects,
                            this.includeObjects,
                            this.goldenGateDetails,
                            this.vaultDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnectionId")) {
                this.sourceDatabaseConnectionId(model.getSourceDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDatabaseConnectionId")) {
                this.sourceContainerDatabaseConnectionId(
                        model.getSourceContainerDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnectionId")) {
                this.targetDatabaseConnectionId(model.getTargetDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("dataTransferMediumDetails")) {
                this.dataTransferMediumDetails(model.getDataTransferMediumDetails());
            }
            if (model.wasPropertyExplicitlySet("dumpTransferDetails")) {
                this.dumpTransferDetails(model.getDumpTransferDetails());
            }
            if (model.wasPropertyExplicitlySet("datapumpSettings")) {
                this.datapumpSettings(model.getDatapumpSettings());
            }
            if (model.wasPropertyExplicitlySet("advisorSettings")) {
                this.advisorSettings(model.getAdvisorSettings());
            }
            if (model.wasPropertyExplicitlySet("excludeObjects")) {
                this.excludeObjects(model.getExcludeObjects());
            }
            if (model.wasPropertyExplicitlySet("includeObjects")) {
                this.includeObjects(model.getIncludeObjects());
            }
            if (model.wasPropertyExplicitlySet("goldenGateDetails")) {
                this.goldenGateDetails(model.getGoldenGateDetails());
            }
            if (model.wasPropertyExplicitlySet("vaultDetails")) {
                this.vaultDetails(model.getVaultDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the registered ODMS Agent. Only valid for Offline Logical Migrations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The OCID of the registered ODMS Agent. Only valid for Offline Logical Migrations.
     *
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
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
     * The OCID of the Source Container Database Connection. Only used for Online migrations.
     * Only Connections of type Non-Autonomous can be used as source container databases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the Source Container Database Connection. Only used for Online migrations.
     * Only Connections of type Non-Autonomous can be used as source container databases.
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    private final CreateDataTransferMediumDetails dataTransferMediumDetails;

    public CreateDataTransferMediumDetails getDataTransferMediumDetails() {
        return dataTransferMediumDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dumpTransferDetails")
    private final CreateDumpTransferDetails dumpTransferDetails;

    public CreateDumpTransferDetails getDumpTransferDetails() {
        return dumpTransferDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("datapumpSettings")
    private final CreateDataPumpSettings datapumpSettings;

    public CreateDataPumpSettings getDatapumpSettings() {
        return datapumpSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    private final CreateAdvisorSettings advisorSettings;

    public CreateAdvisorSettings getAdvisorSettings() {
        return advisorSettings;
    }

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    private final java.util.List<DatabaseObject> excludeObjects;

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     *
     * @return the value
     **/
    public java.util.List<DatabaseObject> getExcludeObjects() {
        return excludeObjects;
    }

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
    private final java.util.List<DatabaseObject> includeObjects;

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     *
     * @return the value
     **/
    public java.util.List<DatabaseObject> getIncludeObjects() {
        return includeObjects;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("goldenGateDetails")
    private final CreateGoldenGateDetails goldenGateDetails;

    public CreateGoldenGateDetails getGoldenGateDetails() {
        return goldenGateDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    private final CreateVaultDetails vaultDetails;

    public CreateVaultDetails getVaultDetails() {
        return vaultDetails;
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
        sb.append("CreateMigrationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", sourceDatabaseConnectionId=")
                .append(String.valueOf(this.sourceDatabaseConnectionId));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", targetDatabaseConnectionId=")
                .append(String.valueOf(this.targetDatabaseConnectionId));
        sb.append(", dataTransferMediumDetails=")
                .append(String.valueOf(this.dataTransferMediumDetails));
        sb.append(", dumpTransferDetails=").append(String.valueOf(this.dumpTransferDetails));
        sb.append(", datapumpSettings=").append(String.valueOf(this.datapumpSettings));
        sb.append(", advisorSettings=").append(String.valueOf(this.advisorSettings));
        sb.append(", excludeObjects=").append(String.valueOf(this.excludeObjects));
        sb.append(", includeObjects=").append(String.valueOf(this.includeObjects));
        sb.append(", goldenGateDetails=").append(String.valueOf(this.goldenGateDetails));
        sb.append(", vaultDetails=").append(String.valueOf(this.vaultDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMigrationDetails)) {
            return false;
        }

        CreateMigrationDetails other = (CreateMigrationDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(
                        this.sourceDatabaseConnectionId, other.sourceDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.targetDatabaseConnectionId, other.targetDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.dataTransferMediumDetails, other.dataTransferMediumDetails)
                && java.util.Objects.equals(this.dumpTransferDetails, other.dumpTransferDetails)
                && java.util.Objects.equals(this.datapumpSettings, other.datapumpSettings)
                && java.util.Objects.equals(this.advisorSettings, other.advisorSettings)
                && java.util.Objects.equals(this.excludeObjects, other.excludeObjects)
                && java.util.Objects.equals(this.includeObjects, other.includeObjects)
                && java.util.Objects.equals(this.goldenGateDetails, other.goldenGateDetails)
                && java.util.Objects.equals(this.vaultDetails, other.vaultDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
