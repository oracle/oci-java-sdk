/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Summary of the migration plan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrationPlanSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MigrationPlanSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "migrationId",
        "strategies",
        "migrationPlanStats",
        "calculatedLimits",
        "targetEnvironments",
        "referenceToRmsStack",
        "sourceMigrationPlanId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MigrationPlanSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            MigrationPlan.LifecycleState lifecycleState,
            String lifecycleDetails,
            String migrationId,
            java.util.List<ResourceAssessmentStrategy> strategies,
            MigrationPlanStats migrationPlanStats,
            java.util.Map<String, Integer> calculatedLimits,
            java.util.List<TargetEnvironment> targetEnvironments,
            String referenceToRmsStack,
            String sourceMigrationPlanId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.migrationId = migrationId;
        this.strategies = strategies;
        this.migrationPlanStats = migrationPlanStats;
        this.calculatedLimits = calculatedLimits;
        this.targetEnvironments = targetEnvironments;
        this.referenceToRmsStack = referenceToRmsStack;
        this.sourceMigrationPlanId = sourceMigrationPlanId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique Oracle ID (OCID) that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique Oracle ID (OCID) that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment containing the migration plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the migration plan.
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The time when the migration plan was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the migration plan was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the migration plan was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the migration plan was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the migration plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MigrationPlan.LifecycleState lifecycleState;

        /**
         * The current state of the migration plan.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(MigrationPlan.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The OCID of the associated migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
        private String migrationId;

        /**
         * The OCID of the associated migration.
         *
         * @param migrationId the value to set
         * @return this builder
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            this.__explicitlySet__.add("migrationId");
            return this;
        }
        /** List of strategies for the resources to be migrated. */
        @com.fasterxml.jackson.annotation.JsonProperty("strategies")
        private java.util.List<ResourceAssessmentStrategy> strategies;

        /**
         * List of strategies for the resources to be migrated.
         *
         * @param strategies the value to set
         * @return this builder
         */
        public Builder strategies(java.util.List<ResourceAssessmentStrategy> strategies) {
            this.strategies = strategies;
            this.__explicitlySet__.add("strategies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanStats")
        private MigrationPlanStats migrationPlanStats;

        public Builder migrationPlanStats(MigrationPlanStats migrationPlanStats) {
            this.migrationPlanStats = migrationPlanStats;
            this.__explicitlySet__.add("migrationPlanStats");
            return this;
        }
        /**
         * Limits of the resources that are needed for migration. Example: {"BlockVolume": 2, "VCN":
         * 1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("calculatedLimits")
        private java.util.Map<String, Integer> calculatedLimits;

        /**
         * Limits of the resources that are needed for migration. Example: {"BlockVolume": 2, "VCN":
         * 1}
         *
         * @param calculatedLimits the value to set
         * @return this builder
         */
        public Builder calculatedLimits(java.util.Map<String, Integer> calculatedLimits) {
            this.calculatedLimits = calculatedLimits;
            this.__explicitlySet__.add("calculatedLimits");
            return this;
        }
        /** List of target environments. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetEnvironments")
        private java.util.List<TargetEnvironment> targetEnvironments;

        /**
         * List of target environments.
         *
         * @param targetEnvironments the value to set
         * @return this builder
         */
        public Builder targetEnvironments(java.util.List<TargetEnvironment> targetEnvironments) {
            this.targetEnvironments = targetEnvironments;
            this.__explicitlySet__.add("targetEnvironments");
            return this;
        }
        /** OCID of the referenced ORM job. */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceToRmsStack")
        private String referenceToRmsStack;

        /**
         * OCID of the referenced ORM job.
         *
         * @param referenceToRmsStack the value to set
         * @return this builder
         */
        public Builder referenceToRmsStack(String referenceToRmsStack) {
            this.referenceToRmsStack = referenceToRmsStack;
            this.__explicitlySet__.add("referenceToRmsStack");
            return this;
        }
        /** Source migraiton plan ID to be cloned. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceMigrationPlanId")
        private String sourceMigrationPlanId;

        /**
         * Source migraiton plan ID to be cloned.
         *
         * @param sourceMigrationPlanId the value to set
         * @return this builder
         */
        public Builder sourceMigrationPlanId(String sourceMigrationPlanId) {
            this.sourceMigrationPlanId = sourceMigrationPlanId;
            this.__explicitlySet__.add("sourceMigrationPlanId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. It
         * exists only for cross-compatibility. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. It
         * exists only for cross-compatibility. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationPlanSummary build() {
            MigrationPlanSummary model =
                    new MigrationPlanSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.migrationId,
                            this.strategies,
                            this.migrationPlanStats,
                            this.calculatedLimits,
                            this.targetEnvironments,
                            this.referenceToRmsStack,
                            this.sourceMigrationPlanId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationPlanSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("migrationId")) {
                this.migrationId(model.getMigrationId());
            }
            if (model.wasPropertyExplicitlySet("strategies")) {
                this.strategies(model.getStrategies());
            }
            if (model.wasPropertyExplicitlySet("migrationPlanStats")) {
                this.migrationPlanStats(model.getMigrationPlanStats());
            }
            if (model.wasPropertyExplicitlySet("calculatedLimits")) {
                this.calculatedLimits(model.getCalculatedLimits());
            }
            if (model.wasPropertyExplicitlySet("targetEnvironments")) {
                this.targetEnvironments(model.getTargetEnvironments());
            }
            if (model.wasPropertyExplicitlySet("referenceToRmsStack")) {
                this.referenceToRmsStack(model.getReferenceToRmsStack());
            }
            if (model.wasPropertyExplicitlySet("sourceMigrationPlanId")) {
                this.sourceMigrationPlanId(model.getSourceMigrationPlanId());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The unique Oracle ID (OCID) that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique Oracle ID (OCID) that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment containing the migration plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the migration plan.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The time when the migration plan was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the migration plan was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the migration plan was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the migration plan was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the migration plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MigrationPlan.LifecycleState lifecycleState;

    /**
     * The current state of the migration plan.
     *
     * @return the value
     */
    public MigrationPlan.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The OCID of the associated migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
    private final String migrationId;

    /**
     * The OCID of the associated migration.
     *
     * @return the value
     */
    public String getMigrationId() {
        return migrationId;
    }

    /** List of strategies for the resources to be migrated. */
    @com.fasterxml.jackson.annotation.JsonProperty("strategies")
    private final java.util.List<ResourceAssessmentStrategy> strategies;

    /**
     * List of strategies for the resources to be migrated.
     *
     * @return the value
     */
    public java.util.List<ResourceAssessmentStrategy> getStrategies() {
        return strategies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanStats")
    private final MigrationPlanStats migrationPlanStats;

    public MigrationPlanStats getMigrationPlanStats() {
        return migrationPlanStats;
    }

    /**
     * Limits of the resources that are needed for migration. Example: {"BlockVolume": 2, "VCN": 1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("calculatedLimits")
    private final java.util.Map<String, Integer> calculatedLimits;

    /**
     * Limits of the resources that are needed for migration. Example: {"BlockVolume": 2, "VCN": 1}
     *
     * @return the value
     */
    public java.util.Map<String, Integer> getCalculatedLimits() {
        return calculatedLimits;
    }

    /** List of target environments. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetEnvironments")
    private final java.util.List<TargetEnvironment> targetEnvironments;

    /**
     * List of target environments.
     *
     * @return the value
     */
    public java.util.List<TargetEnvironment> getTargetEnvironments() {
        return targetEnvironments;
    }

    /** OCID of the referenced ORM job. */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceToRmsStack")
    private final String referenceToRmsStack;

    /**
     * OCID of the referenced ORM job.
     *
     * @return the value
     */
    public String getReferenceToRmsStack() {
        return referenceToRmsStack;
    }

    /** Source migraiton plan ID to be cloned. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMigrationPlanId")
    private final String sourceMigrationPlanId;

    /**
     * Source migraiton plan ID to be cloned.
     *
     * @return the value
     */
    public String getSourceMigrationPlanId() {
        return sourceMigrationPlanId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists
     * only for cross-compatibility. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists
     * only for cross-compatibility. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MigrationPlanSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", migrationId=").append(String.valueOf(this.migrationId));
        sb.append(", strategies=").append(String.valueOf(this.strategies));
        sb.append(", migrationPlanStats=").append(String.valueOf(this.migrationPlanStats));
        sb.append(", calculatedLimits=").append(String.valueOf(this.calculatedLimits));
        sb.append(", targetEnvironments=").append(String.valueOf(this.targetEnvironments));
        sb.append(", referenceToRmsStack=").append(String.valueOf(this.referenceToRmsStack));
        sb.append(", sourceMigrationPlanId=").append(String.valueOf(this.sourceMigrationPlanId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationPlanSummary)) {
            return false;
        }

        MigrationPlanSummary other = (MigrationPlanSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(this.strategies, other.strategies)
                && java.util.Objects.equals(this.migrationPlanStats, other.migrationPlanStats)
                && java.util.Objects.equals(this.calculatedLimits, other.calculatedLimits)
                && java.util.Objects.equals(this.targetEnvironments, other.targetEnvironments)
                && java.util.Objects.equals(this.referenceToRmsStack, other.referenceToRmsStack)
                && java.util.Objects.equals(this.sourceMigrationPlanId, other.sourceMigrationPlanId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result = (result * PRIME) + (this.strategies == null ? 43 : this.strategies.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationPlanStats == null
                                ? 43
                                : this.migrationPlanStats.hashCode());
        result =
                (result * PRIME)
                        + (this.calculatedLimits == null ? 43 : this.calculatedLimits.hashCode());
        result =
                (result * PRIME)
                        + (this.targetEnvironments == null
                                ? 43
                                : this.targetEnvironments.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceToRmsStack == null
                                ? 43
                                : this.referenceToRmsStack.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMigrationPlanId == null
                                ? 43
                                : this.sourceMigrationPlanId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
