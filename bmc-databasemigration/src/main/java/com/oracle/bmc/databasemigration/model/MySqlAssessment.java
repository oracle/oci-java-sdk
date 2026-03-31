/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * MySql Assessment resource
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MySqlAssessment.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "databaseCombination"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MySqlAssessment extends Assessment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("networkSpeedMegabitPerSecond")
        private NetworkSpeedMegabitPerSecond networkSpeedMegabitPerSecond;

        public Builder networkSpeedMegabitPerSecond(
                NetworkSpeedMegabitPerSecond networkSpeedMegabitPerSecond) {
            this.networkSpeedMegabitPerSecond = networkSpeedMegabitPerSecond;
            this.__explicitlySet__.add("networkSpeedMegabitPerSecond");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("acceptableDowntime")
        private AcceptableDowntime acceptableDowntime;

        public Builder acceptableDowntime(AcceptableDowntime acceptableDowntime) {
            this.acceptableDowntime = acceptableDowntime;
            this.__explicitlySet__.add("acceptableDowntime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDataSize")
        private DatabaseDataSize databaseDataSize;

        public Builder databaseDataSize(DatabaseDataSize databaseDataSize) {
            this.databaseDataSize = databaseDataSize;
            this.__explicitlySet__.add("databaseDataSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ddlExpectation")
        private DdlExpectation ddlExpectation;

        public Builder ddlExpectation(DdlExpectation ddlExpectation) {
            this.ddlExpectation = ddlExpectation;
            this.__explicitlySet__.add("ddlExpectation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationType")
        private CreationType creationType;

        public Builder creationType(CreationType creationType) {
            this.creationType = creationType;
            this.__explicitlySet__.add("creationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
        private String migrationId;

        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            this.__explicitlySet__.add("migrationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnection")
        private SourceAssessmentConnection sourceDatabaseConnection;

        public Builder sourceDatabaseConnection(
                SourceAssessmentConnection sourceDatabaseConnection) {
            this.sourceDatabaseConnection = sourceDatabaseConnection;
            this.__explicitlySet__.add("sourceDatabaseConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnection")
        private TargetAssessmentConnection targetDatabaseConnection;

        public Builder targetDatabaseConnection(
                TargetAssessmentConnection targetDatabaseConnection) {
            this.targetDatabaseConnection = targetDatabaseConnection;
            this.__explicitlySet__.add("targetDatabaseConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AssessmentLifecycleStates lifecycleState;

        public Builder lifecycleState(AssessmentLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assessmentMigrationType")
        private AssessmentMigrationTypes assessmentMigrationType;

        public Builder assessmentMigrationType(AssessmentMigrationTypes assessmentMigrationType) {
            this.assessmentMigrationType = assessmentMigrationType;
            this.__explicitlySet__.add("assessmentMigrationType");
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

        public MySqlAssessment build() {
            MySqlAssessment model =
                    new MySqlAssessment(
                            this.id,
                            this.description,
                            this.displayName,
                            this.compartmentId,
                            this.networkSpeedMegabitPerSecond,
                            this.acceptableDowntime,
                            this.databaseDataSize,
                            this.ddlExpectation,
                            this.creationType,
                            this.migrationId,
                            this.sourceDatabaseConnection,
                            this.targetDatabaseConnection,
                            this.lifecycleState,
                            this.assessmentMigrationType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlAssessment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("networkSpeedMegabitPerSecond")) {
                this.networkSpeedMegabitPerSecond(model.getNetworkSpeedMegabitPerSecond());
            }
            if (model.wasPropertyExplicitlySet("acceptableDowntime")) {
                this.acceptableDowntime(model.getAcceptableDowntime());
            }
            if (model.wasPropertyExplicitlySet("databaseDataSize")) {
                this.databaseDataSize(model.getDatabaseDataSize());
            }
            if (model.wasPropertyExplicitlySet("ddlExpectation")) {
                this.ddlExpectation(model.getDdlExpectation());
            }
            if (model.wasPropertyExplicitlySet("creationType")) {
                this.creationType(model.getCreationType());
            }
            if (model.wasPropertyExplicitlySet("migrationId")) {
                this.migrationId(model.getMigrationId());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnection")) {
                this.sourceDatabaseConnection(model.getSourceDatabaseConnection());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnection")) {
                this.targetDatabaseConnection(model.getTargetDatabaseConnection());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("assessmentMigrationType")) {
                this.assessmentMigrationType(model.getAssessmentMigrationType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    @Deprecated
    public MySqlAssessment(
            String id,
            String description,
            String displayName,
            String compartmentId,
            NetworkSpeedMegabitPerSecond networkSpeedMegabitPerSecond,
            AcceptableDowntime acceptableDowntime,
            DatabaseDataSize databaseDataSize,
            DdlExpectation ddlExpectation,
            CreationType creationType,
            String migrationId,
            SourceAssessmentConnection sourceDatabaseConnection,
            TargetAssessmentConnection targetDatabaseConnection,
            AssessmentLifecycleStates lifecycleState,
            AssessmentMigrationTypes assessmentMigrationType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super(
                id,
                description,
                displayName,
                compartmentId,
                networkSpeedMegabitPerSecond,
                acceptableDowntime,
                databaseDataSize,
                ddlExpectation,
                creationType,
                migrationId,
                sourceDatabaseConnection,
                targetDatabaseConnection,
                lifecycleState,
                assessmentMigrationType,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags,
                systemTags);
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
        sb.append("MySqlAssessment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlAssessment)) {
            return false;
        }

        MySqlAssessment other = (MySqlAssessment) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
