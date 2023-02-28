/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * The information about the new migration plan. <br>
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
        builder = CreateMigrationPlanDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateMigrationPlanDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "migrationId",
        "sourceMigrationPlanId",
        "strategies",
        "targetEnvironments",
        "freeformTags",
        "definedTags"
    })
    public CreateMigrationPlanDetails(
            String displayName,
            String compartmentId,
            String migrationId,
            String sourceMigrationPlanId,
            java.util.List<ResourceAssessmentStrategy> strategies,
            java.util.List<TargetEnvironment> targetEnvironments,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.migrationId = migrationId;
        this.sourceMigrationPlanId = sourceMigrationPlanId;
        this.strategies = strategies;
        this.targetEnvironments = targetEnvironments;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Migration plan identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Migration plan identifier
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMigrationPlanDetails build() {
            CreateMigrationPlanDetails model =
                    new CreateMigrationPlanDetails(
                            this.displayName,
                            this.compartmentId,
                            this.migrationId,
                            this.sourceMigrationPlanId,
                            this.strategies,
                            this.targetEnvironments,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMigrationPlanDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("migrationId")) {
                this.migrationId(model.getMigrationId());
            }
            if (model.wasPropertyExplicitlySet("sourceMigrationPlanId")) {
                this.sourceMigrationPlanId(model.getSourceMigrationPlanId());
            }
            if (model.wasPropertyExplicitlySet("strategies")) {
                this.strategies(model.getStrategies());
            }
            if (model.wasPropertyExplicitlySet("targetEnvironments")) {
                this.targetEnvironments(model.getTargetEnvironments());
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

    /** Migration plan identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Migration plan identifier
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("CreateMigrationPlanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", migrationId=").append(String.valueOf(this.migrationId));
        sb.append(", sourceMigrationPlanId=").append(String.valueOf(this.sourceMigrationPlanId));
        sb.append(", strategies=").append(String.valueOf(this.strategies));
        sb.append(", targetEnvironments=").append(String.valueOf(this.targetEnvironments));
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
        if (!(o instanceof CreateMigrationPlanDetails)) {
            return false;
        }

        CreateMigrationPlanDetails other = (CreateMigrationPlanDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(this.sourceMigrationPlanId, other.sourceMigrationPlanId)
                && java.util.Objects.equals(this.strategies, other.strategies)
                && java.util.Objects.equals(this.targetEnvironments, other.targetEnvironments)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMigrationPlanId == null
                                ? 43
                                : this.sourceMigrationPlanId.hashCode());
        result = (result * PRIME) + (this.strategies == null ? 43 : this.strategies.hashCode());
        result =
                (result * PRIME)
                        + (this.targetEnvironments == null
                                ? 43
                                : this.targetEnvironments.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
