/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Create MySql Assessment resource parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMySqlAssessmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMySqlAssessmentDetails extends CreateAssessmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** Assessment migration scope. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationScope")
        private MigrationScopeMySql migrationScope;

        /**
         * Assessment migration scope.
         *
         * @param migrationScope the value to set
         * @return this builder
         */
        public Builder migrationScope(MigrationScopeMySql migrationScope) {
            this.migrationScope = migrationScope;
            this.__explicitlySet__.add("migrationScope");
            return this;
        }
        /**
         * Database objects to exclude from migration, cannot be specified alongside
         * 'includeObjects'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<MySqlDatabaseObject> excludeObjects;

        /**
         * Database objects to exclude from migration, cannot be specified alongside
         * 'includeObjects'
         *
         * @param excludeObjects the value to set
         * @return this builder
         */
        public Builder excludeObjects(java.util.List<MySqlDatabaseObject> excludeObjects) {
            this.excludeObjects = excludeObjects;
            this.__explicitlySet__.add("excludeObjects");
            return this;
        }
        /**
         * Database objects to include from migration, cannot be specified alongside
         * 'excludeObjects'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
        private java.util.List<MySqlDatabaseObject> includeObjects;

        /**
         * Database objects to include from migration, cannot be specified alongside
         * 'excludeObjects'
         *
         * @param includeObjects the value to set
         * @return this builder
         */
        public Builder includeObjects(java.util.List<MySqlDatabaseObject> includeObjects) {
            this.includeObjects = includeObjects;
            this.__explicitlySet__.add("includeObjects");
            return this;
        }
        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
        private String bulkIncludeExcludeData;

        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         *
         * @param bulkIncludeExcludeData the value to set
         * @return this builder
         */
        public Builder bulkIncludeExcludeData(String bulkIncludeExcludeData) {
            this.bulkIncludeExcludeData = bulkIncludeExcludeData;
            this.__explicitlySet__.add("bulkIncludeExcludeData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMySqlAssessmentDetails build() {
            CreateMySqlAssessmentDetails model =
                    new CreateMySqlAssessmentDetails(
                            this.description,
                            this.compartmentId,
                            this.displayName,
                            this.networkSpeedMegabitPerSecond,
                            this.acceptableDowntime,
                            this.databaseDataSize,
                            this.ddlExpectation,
                            this.creationType,
                            this.sourceDatabaseConnection,
                            this.targetDatabaseConnection,
                            this.freeformTags,
                            this.definedTags,
                            this.migrationScope,
                            this.excludeObjects,
                            this.includeObjects,
                            this.bulkIncludeExcludeData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMySqlAssessmentDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnection")) {
                this.sourceDatabaseConnection(model.getSourceDatabaseConnection());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnection")) {
                this.targetDatabaseConnection(model.getTargetDatabaseConnection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("migrationScope")) {
                this.migrationScope(model.getMigrationScope());
            }
            if (model.wasPropertyExplicitlySet("excludeObjects")) {
                this.excludeObjects(model.getExcludeObjects());
            }
            if (model.wasPropertyExplicitlySet("includeObjects")) {
                this.includeObjects(model.getIncludeObjects());
            }
            if (model.wasPropertyExplicitlySet("bulkIncludeExcludeData")) {
                this.bulkIncludeExcludeData(model.getBulkIncludeExcludeData());
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

    @Deprecated
    public CreateMySqlAssessmentDetails(
            String description,
            String compartmentId,
            String displayName,
            NetworkSpeedMegabitPerSecond networkSpeedMegabitPerSecond,
            AcceptableDowntime acceptableDowntime,
            DatabaseDataSize databaseDataSize,
            DdlExpectation ddlExpectation,
            CreationType creationType,
            SourceAssessmentConnection sourceDatabaseConnection,
            TargetAssessmentConnection targetDatabaseConnection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            MigrationScopeMySql migrationScope,
            java.util.List<MySqlDatabaseObject> excludeObjects,
            java.util.List<MySqlDatabaseObject> includeObjects,
            String bulkIncludeExcludeData) {
        super(
                description,
                compartmentId,
                displayName,
                networkSpeedMegabitPerSecond,
                acceptableDowntime,
                databaseDataSize,
                ddlExpectation,
                creationType,
                sourceDatabaseConnection,
                targetDatabaseConnection,
                freeformTags,
                definedTags);
        this.migrationScope = migrationScope;
        this.excludeObjects = excludeObjects;
        this.includeObjects = includeObjects;
        this.bulkIncludeExcludeData = bulkIncludeExcludeData;
    }

    /** Assessment migration scope. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationScope")
    private final MigrationScopeMySql migrationScope;

    /**
     * Assessment migration scope.
     *
     * @return the value
     */
    public MigrationScopeMySql getMigrationScope() {
        return migrationScope;
    }

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    private final java.util.List<MySqlDatabaseObject> excludeObjects;

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     *
     * @return the value
     */
    public java.util.List<MySqlDatabaseObject> getExcludeObjects() {
        return excludeObjects;
    }

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
    private final java.util.List<MySqlDatabaseObject> includeObjects;

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     *
     * @return the value
     */
    public java.util.List<MySqlDatabaseObject> getIncludeObjects() {
        return includeObjects;
    }

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
    private final String bulkIncludeExcludeData;

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     *
     * @return the value
     */
    public String getBulkIncludeExcludeData() {
        return bulkIncludeExcludeData;
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
        sb.append("CreateMySqlAssessmentDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", migrationScope=").append(String.valueOf(this.migrationScope));
        sb.append(", excludeObjects=").append(String.valueOf(this.excludeObjects));
        sb.append(", includeObjects=").append(String.valueOf(this.includeObjects));
        sb.append(", bulkIncludeExcludeData=").append(String.valueOf(this.bulkIncludeExcludeData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMySqlAssessmentDetails)) {
            return false;
        }

        CreateMySqlAssessmentDetails other = (CreateMySqlAssessmentDetails) o;
        return java.util.Objects.equals(this.migrationScope, other.migrationScope)
                && java.util.Objects.equals(this.excludeObjects, other.excludeObjects)
                && java.util.Objects.equals(this.includeObjects, other.includeObjects)
                && java.util.Objects.equals(
                        this.bulkIncludeExcludeData, other.bulkIncludeExcludeData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.migrationScope == null ? 43 : this.migrationScope.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeObjects == null ? 43 : this.excludeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.includeObjects == null ? 43 : this.includeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkIncludeExcludeData == null
                                ? 43
                                : this.bulkIncludeExcludeData.hashCode());
        return result;
    }
}
