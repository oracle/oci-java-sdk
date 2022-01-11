/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * The properties that define a migration. A migration represents the end-to-end workflow of moving an application from a source
 * environment to Oracle Cloud Infrastructure. Each migration moves a single application to Oracle Cloud Infrastructure.
 * For more information, see [Manage Migrations](https://docs.cloud.oracle.com/iaas/application-migration/manage_migrations.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator.
 * If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private MigrationTypes applicationType;

        public Builder applicationType(MigrationTypes applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
        private TargetDatabaseTypes preCreatedTargetDatabaseType;

        public Builder preCreatedTargetDatabaseType(
                TargetDatabaseTypes preCreatedTargetDatabaseType) {
            this.preCreatedTargetDatabaseType = preCreatedTargetDatabaseType;
            this.__explicitlySet__.add("preCreatedTargetDatabaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
        private Boolean isSelectiveMigration;

        public Builder isSelectiveMigration(Boolean isSelectiveMigration) {
            this.isSelectiveMigration = isSelectiveMigration;
            this.__explicitlySet__.add("isSelectiveMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
        private java.util.Map<String, ConfigurationField> serviceConfig;

        public Builder serviceConfig(java.util.Map<String, ConfigurationField> serviceConfig) {
            this.serviceConfig = serviceConfig;
            this.__explicitlySet__.add("serviceConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
        private java.util.Map<String, ConfigurationField> applicationConfig;

        public Builder applicationConfig(
                java.util.Map<String, ConfigurationField> applicationConfig) {
            this.applicationConfig = applicationConfig;
            this.__explicitlySet__.add("applicationConfig");
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
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationState")
        private MigrationStates migrationState;

        public Builder migrationState(MigrationStates migrationState) {
            this.migrationState = migrationState;
            this.__explicitlySet__.add("migrationState");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Migration build() {
            Migration __instance__ =
                    new Migration(
                            id,
                            compartmentId,
                            displayName,
                            description,
                            timeCreated,
                            sourceId,
                            applicationName,
                            applicationType,
                            preCreatedTargetDatabaseType,
                            isSelectiveMigration,
                            serviceConfig,
                            applicationConfig,
                            lifecycleState,
                            lifecycleDetails,
                            migrationState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Migration o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .sourceId(o.getSourceId())
                            .applicationName(o.getApplicationName())
                            .applicationType(o.getApplicationType())
                            .preCreatedTargetDatabaseType(o.getPreCreatedTargetDatabaseType())
                            .isSelectiveMigration(o.getIsSelectiveMigration())
                            .serviceConfig(o.getServiceConfig())
                            .applicationConfig(o.getApplicationConfig())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .migrationState(o.getMigrationState())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * User-friendly name of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The date and time at which the migration was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source with which this migration is associated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * Name of the application which is being migrated. This is the name of the application in the source environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    String applicationName;

    /**
     * The type of application being migrated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    MigrationTypes applicationType;

    /**
     * The pre-existing database type to be used in this migration. Currently, Application migration only supports Oracle Cloud
     * Infrastructure databases and this option is currently available only for {@code JAVA_CLOUD_SERVICE} and {@code WEBLOGIC_CLOUD_SERVICE} target instance types.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
    TargetDatabaseTypes preCreatedTargetDatabaseType;

    /**
     * If set to {@code true}, Application Migration migrates only the application resources that you specify. If set to {@code false}, Application Migration migrates the entire application. When you migrate the entire application, all the application resources are migrated to the target environment. You can selectively migrate resources only for the Oracle Integration Cloud and Oracle Integration Cloud Service applications.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
    Boolean isSelectiveMigration;

    /**
     * Configuration required to migrate the application. In addition to the key and value, additional fields are provided
     * to describe type type and purpose of each field. Only the value for each key is required when passing configuration to the
     * CreateMigration operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
    java.util.Map<String, ConfigurationField> serviceConfig;

    /**
     * Configuration required to migrate the application. In addition to the key and value, additional fields are provided
     * to describe type type and purpose of each field. Only the value for each key is required when passing configuration to the
     * CreateMigration operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
    java.util.Map<String, ConfigurationField> applicationConfig;

    /**
     * The current state of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    MigrationLifecycleStates lifecycleState;

    /**
     * Details about the current lifecycle state of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The current state of the overall migration process.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("migrationState")
    MigrationStates migrationState;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
