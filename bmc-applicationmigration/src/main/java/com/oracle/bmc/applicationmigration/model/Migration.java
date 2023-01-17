/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * The properties that define a migration. A migration represents the end-to-end workflow of moving
 * an application from a source environment to Oracle Cloud Infrastructure. Each migration moves a
 * single application to Oracle Cloud Infrastructure. For more information, see [Manage
 * Migrations](https://docs.cloud.oracle.com/iaas/application-migration/manage_migrations.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Migration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Migration extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "timeCreated",
        "sourceId",
        "applicationName",
        "applicationType",
        "preCreatedTargetDatabaseType",
        "isSelectiveMigration",
        "serviceConfig",
        "applicationConfig",
        "lifecycleState",
        "lifecycleDetails",
        "migrationState",
        "freeformTags",
        "definedTags"
    })
    public Migration(
            String id,
            String compartmentId,
            String displayName,
            String description,
            java.util.Date timeCreated,
            String sourceId,
            String applicationName,
            MigrationTypes applicationType,
            TargetDatabaseTypes preCreatedTargetDatabaseType,
            Boolean isSelectiveMigration,
            java.util.Map<String, ConfigurationField> serviceConfig,
            java.util.Map<String, ConfigurationField> applicationConfig,
            MigrationLifecycleStates lifecycleState,
            String lifecycleDetails,
            MigrationStates migrationState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.sourceId = sourceId;
        this.applicationName = applicationName;
        this.applicationType = applicationType;
        this.preCreatedTargetDatabaseType = preCreatedTargetDatabaseType;
        this.isSelectiveMigration = isSelectiveMigration;
        this.serviceConfig = serviceConfig;
        this.applicationConfig = applicationConfig;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.migrationState = migrationState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the migration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the migration.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the migration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the migration.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** User-friendly name of the migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name of the migration.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the migration.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time at which the migration was created, in the format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time at which the migration was created, in the format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source with which this migration is associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source with which this migration is associated.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * Name of the application which is being migrated. This is the name of the application in
         * the source environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * Name of the application which is being migrated. This is the name of the application in
         * the source environment.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /** The type of application being migrated. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
        private MigrationTypes applicationType;

        /**
         * The type of application being migrated.
         *
         * @param applicationType the value to set
         * @return this builder
         */
        public Builder applicationType(MigrationTypes applicationType) {
            this.applicationType = applicationType;
            this.__explicitlySet__.add("applicationType");
            return this;
        }
        /**
         * The pre-existing database type to be used in this migration. Currently, Application
         * migration only supports Oracle Cloud Infrastructure databases and this option is
         * currently available only for {@code JAVA_CLOUD_SERVICE} and {@code
         * WEBLOGIC_CLOUD_SERVICE} target instance types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
        private TargetDatabaseTypes preCreatedTargetDatabaseType;

        /**
         * The pre-existing database type to be used in this migration. Currently, Application
         * migration only supports Oracle Cloud Infrastructure databases and this option is
         * currently available only for {@code JAVA_CLOUD_SERVICE} and {@code
         * WEBLOGIC_CLOUD_SERVICE} target instance types.
         *
         * @param preCreatedTargetDatabaseType the value to set
         * @return this builder
         */
        public Builder preCreatedTargetDatabaseType(
                TargetDatabaseTypes preCreatedTargetDatabaseType) {
            this.preCreatedTargetDatabaseType = preCreatedTargetDatabaseType;
            this.__explicitlySet__.add("preCreatedTargetDatabaseType");
            return this;
        }
        /**
         * If set to {@code true}, Application Migration migrates only the application resources
         * that you specify. If set to {@code false}, Application Migration migrates the entire
         * application. When you migrate the entire application, all the application resources are
         * migrated to the target environment. You can selectively migrate resources only for the
         * Oracle Integration Cloud and Oracle Integration Cloud Service applications.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
        private Boolean isSelectiveMigration;

        /**
         * If set to {@code true}, Application Migration migrates only the application resources
         * that you specify. If set to {@code false}, Application Migration migrates the entire
         * application. When you migrate the entire application, all the application resources are
         * migrated to the target environment. You can selectively migrate resources only for the
         * Oracle Integration Cloud and Oracle Integration Cloud Service applications.
         *
         * @param isSelectiveMigration the value to set
         * @return this builder
         */
        public Builder isSelectiveMigration(Boolean isSelectiveMigration) {
            this.isSelectiveMigration = isSelectiveMigration;
            this.__explicitlySet__.add("isSelectiveMigration");
            return this;
        }
        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
        private java.util.Map<String, ConfigurationField> serviceConfig;

        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         *
         * @param serviceConfig the value to set
         * @return this builder
         */
        public Builder serviceConfig(java.util.Map<String, ConfigurationField> serviceConfig) {
            this.serviceConfig = serviceConfig;
            this.__explicitlySet__.add("serviceConfig");
            return this;
        }
        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
        private java.util.Map<String, ConfigurationField> applicationConfig;

        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         *
         * @param applicationConfig the value to set
         * @return this builder
         */
        public Builder applicationConfig(
                java.util.Map<String, ConfigurationField> applicationConfig) {
            this.applicationConfig = applicationConfig;
            this.__explicitlySet__.add("applicationConfig");
            return this;
        }
        /** The current state of the migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MigrationLifecycleStates lifecycleState;

        /**
         * The current state of the migration.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(MigrationLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current lifecycle state of the migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current lifecycle state of the migration.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current state of the overall migration process. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationState")
        private MigrationStates migrationState;

        /**
         * The current state of the overall migration process.
         *
         * @param migrationState the value to set
         * @return this builder
         */
        public Builder migrationState(MigrationStates migrationState) {
            this.migrationState = migrationState;
            this.__explicitlySet__.add("migrationState");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Migration build() {
            Migration model =
                    new Migration(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.sourceId,
                            this.applicationName,
                            this.applicationType,
                            this.preCreatedTargetDatabaseType,
                            this.isSelectiveMigration,
                            this.serviceConfig,
                            this.applicationConfig,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.migrationState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Migration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("applicationType")) {
                this.applicationType(model.getApplicationType());
            }
            if (model.wasPropertyExplicitlySet("preCreatedTargetDatabaseType")) {
                this.preCreatedTargetDatabaseType(model.getPreCreatedTargetDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("isSelectiveMigration")) {
                this.isSelectiveMigration(model.getIsSelectiveMigration());
            }
            if (model.wasPropertyExplicitlySet("serviceConfig")) {
                this.serviceConfig(model.getServiceConfig());
            }
            if (model.wasPropertyExplicitlySet("applicationConfig")) {
                this.applicationConfig(model.getApplicationConfig());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("migrationState")) {
                this.migrationState(model.getMigrationState());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the migration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the migration.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the migration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the migration.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** User-friendly name of the migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name of the migration.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the migration.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The date and time at which the migration was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time at which the migration was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source with which this migration is associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source with which this migration is associated.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Name of the application which is being migrated. This is the name of the application in the
     * source environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * Name of the application which is being migrated. This is the name of the application in the
     * source environment.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** The type of application being migrated. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationType")
    private final MigrationTypes applicationType;

    /**
     * The type of application being migrated.
     *
     * @return the value
     */
    public MigrationTypes getApplicationType() {
        return applicationType;
    }

    /**
     * The pre-existing database type to be used in this migration. Currently, Application migration
     * only supports Oracle Cloud Infrastructure databases and this option is currently available
     * only for {@code JAVA_CLOUD_SERVICE} and {@code WEBLOGIC_CLOUD_SERVICE} target instance types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
    private final TargetDatabaseTypes preCreatedTargetDatabaseType;

    /**
     * The pre-existing database type to be used in this migration. Currently, Application migration
     * only supports Oracle Cloud Infrastructure databases and this option is currently available
     * only for {@code JAVA_CLOUD_SERVICE} and {@code WEBLOGIC_CLOUD_SERVICE} target instance types.
     *
     * @return the value
     */
    public TargetDatabaseTypes getPreCreatedTargetDatabaseType() {
        return preCreatedTargetDatabaseType;
    }

    /**
     * If set to {@code true}, Application Migration migrates only the application resources that
     * you specify. If set to {@code false}, Application Migration migrates the entire application.
     * When you migrate the entire application, all the application resources are migrated to the
     * target environment. You can selectively migrate resources only for the Oracle Integration
     * Cloud and Oracle Integration Cloud Service applications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
    private final Boolean isSelectiveMigration;

    /**
     * If set to {@code true}, Application Migration migrates only the application resources that
     * you specify. If set to {@code false}, Application Migration migrates the entire application.
     * When you migrate the entire application, all the application resources are migrated to the
     * target environment. You can selectively migrate resources only for the Oracle Integration
     * Cloud and Oracle Integration Cloud Service applications.
     *
     * @return the value
     */
    public Boolean getIsSelectiveMigration() {
        return isSelectiveMigration;
    }

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
    private final java.util.Map<String, ConfigurationField> serviceConfig;

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     *
     * @return the value
     */
    public java.util.Map<String, ConfigurationField> getServiceConfig() {
        return serviceConfig;
    }

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
    private final java.util.Map<String, ConfigurationField> applicationConfig;

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     *
     * @return the value
     */
    public java.util.Map<String, ConfigurationField> getApplicationConfig() {
        return applicationConfig;
    }

    /** The current state of the migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MigrationLifecycleStates lifecycleState;

    /**
     * The current state of the migration.
     *
     * @return the value
     */
    public MigrationLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current lifecycle state of the migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current lifecycle state of the migration.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current state of the overall migration process. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationState")
    private final MigrationStates migrationState;

    /**
     * The current state of the overall migration process.
     *
     * @return the value
     */
    public MigrationStates getMigrationState() {
        return migrationState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("Migration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", applicationType=").append(String.valueOf(this.applicationType));
        sb.append(", preCreatedTargetDatabaseType=")
                .append(String.valueOf(this.preCreatedTargetDatabaseType));
        sb.append(", isSelectiveMigration=").append(String.valueOf(this.isSelectiveMigration));
        sb.append(", serviceConfig=").append(String.valueOf(this.serviceConfig));
        sb.append(", applicationConfig=").append(String.valueOf(this.applicationConfig));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", migrationState=").append(String.valueOf(this.migrationState));
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
        if (!(o instanceof Migration)) {
            return false;
        }

        Migration other = (Migration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.applicationType, other.applicationType)
                && java.util.Objects.equals(
                        this.preCreatedTargetDatabaseType, other.preCreatedTargetDatabaseType)
                && java.util.Objects.equals(this.isSelectiveMigration, other.isSelectiveMigration)
                && java.util.Objects.equals(this.serviceConfig, other.serviceConfig)
                && java.util.Objects.equals(this.applicationConfig, other.applicationConfig)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.migrationState, other.migrationState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationType == null ? 43 : this.applicationType.hashCode());
        result =
                (result * PRIME)
                        + (this.preCreatedTargetDatabaseType == null
                                ? 43
                                : this.preCreatedTargetDatabaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.isSelectiveMigration == null
                                ? 43
                                : this.isSelectiveMigration.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceConfig == null ? 43 : this.serviceConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationConfig == null ? 43 : this.applicationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationState == null ? 43 : this.migrationState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
