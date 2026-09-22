/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A crypto assessment that provides insight into database cryptographic posture. The assessment
 * evaluates data and network encryption, certificates, key management, backups, and
 * quantum-readiness settings for a target database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CryptoAssessment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "timeLastAssessed",
        "lifecycleState",
        "lifecycleDetails",
        "type",
        "triggeredBy",
        "targetType",
        "targetId",
        "targetDatabaseGroupId",
        "databaseVersion",
        "databaseName",
        "databaseArchitecture",
        "cryptoProvider",
        "postureCategory",
        "schedule",
        "cryptoPosture",
        "issueCount",
        "targetsWithIssuesCount",
        "isAssessmentScheduled",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CryptoAssessment(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastAssessed,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Type type,
            TriggeredBy triggeredBy,
            TargetType targetType,
            String targetId,
            String targetDatabaseGroupId,
            String databaseVersion,
            String databaseName,
            String databaseArchitecture,
            String cryptoProvider,
            CryptoPostureCategory postureCategory,
            String schedule,
            CryptoPosture cryptoPosture,
            Integer issueCount,
            Integer targetsWithIssuesCount,
            Boolean isAssessmentScheduled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastAssessed = timeLastAssessed;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.type = type;
        this.triggeredBy = triggeredBy;
        this.targetType = targetType;
        this.targetId = targetId;
        this.targetDatabaseGroupId = targetDatabaseGroupId;
        this.databaseVersion = databaseVersion;
        this.databaseName = databaseName;
        this.databaseArchitecture = databaseArchitecture;
        this.cryptoProvider = cryptoProvider;
        this.postureCategory = postureCategory;
        this.schedule = schedule;
        this.cryptoPosture = cryptoPosture;
        this.issueCount = issueCount;
        this.targetsWithIssuesCount = targetsWithIssuesCount;
        this.isAssessmentScheduled = isAssessmentScheduled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the crypto assessment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The display name of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the crypto assessment.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the crypto assessment.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the compartment that contains the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the crypto assessment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The date and time the crypto assessment was created, in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the crypto assessment was created, in RFC3339 format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the crypto assessment was last updated, in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the crypto assessment was last updated, in RFC3339 format.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The date and time the crypto posture was last assessed, in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
        private java.util.Date timeLastAssessed;

        /**
         * The date and time the crypto posture was last assessed, in RFC3339 format.
         *
         * @param timeLastAssessed the value to set
         * @return this builder
         */
        public Builder timeLastAssessed(java.util.Date timeLastAssessed) {
            this.timeLastAssessed = timeLastAssessed;
            this.__explicitlySet__.add("timeLastAssessed");
            return this;
        }
        /** The current lifecycle state of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the crypto assessment.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current lifecycle state of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current lifecycle state of the crypto assessment.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The type of this crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of this crypto assessment.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The actor that created the assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
        private TriggeredBy triggeredBy;

        /**
         * The actor that created the assessment.
         *
         * @param triggeredBy the value to set
         * @return this builder
         */
        public Builder triggeredBy(TriggeredBy triggeredBy) {
            this.triggeredBy = triggeredBy;
            this.__explicitlySet__.add("triggeredBy");
            return this;
        }
        /** The target type of the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        /**
         * The target type of the crypto assessment.
         *
         * @param targetType the value to set
         * @return this builder
         */
        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The OCID of the target database group. This is returned when {@code targetType} is {@code
         * TARGET_DATABASE_GROUP}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseGroupId")
        private String targetDatabaseGroupId;

        /**
         * The OCID of the target database group. This is returned when {@code targetType} is {@code
         * TARGET_DATABASE_GROUP}.
         *
         * @param targetDatabaseGroupId the value to set
         * @return this builder
         */
        public Builder targetDatabaseGroupId(String targetDatabaseGroupId) {
            this.targetDatabaseGroupId = targetDatabaseGroupId;
            this.__explicitlySet__.add("targetDatabaseGroupId");
            return this;
        }
        /** The version of the assessed target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The version of the assessed target database.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** The name of the assessed target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The name of the assessed target database.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** The architecture of the assessed target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseArchitecture")
        private String databaseArchitecture;

        /**
         * The architecture of the assessed target database.
         *
         * @param databaseArchitecture the value to set
         * @return this builder
         */
        public Builder databaseArchitecture(String databaseArchitecture) {
            this.databaseArchitecture = databaseArchitecture;
            this.__explicitlySet__.add("databaseArchitecture");
            return this;
        }
        /** Cryptographic provider and version information observed on the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("cryptoProvider")
        private String cryptoProvider;

        /**
         * Cryptographic provider and version information observed on the target.
         *
         * @param cryptoProvider the value to set
         * @return this builder
         */
        public Builder cryptoProvider(String cryptoProvider) {
            this.cryptoProvider = cryptoProvider;
            this.__explicitlySet__.add("cryptoProvider");
            return this;
        }
        /** Overall posture category for the crypto assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("postureCategory")
        private CryptoPostureCategory postureCategory;

        /**
         * Overall posture category for the crypto assessment.
         *
         * @param postureCategory the value to set
         * @return this builder
         */
        public Builder postureCategory(CryptoPostureCategory postureCategory) {
            this.postureCategory = postureCategory;
            this.__explicitlySet__.add("postureCategory");
            return this;
        }
        /**
         * The schedule used to run the crypto assessment periodically. The schedule uses the
         * format: <version-string>;<version-specific-schedule>
         *
         * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
         * <day-of-month>
         *
         * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules.
         * Do not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
         * service generates a default monthly schedule for an assessment created on day 29, 30, or
         * 31 of a month, it uses day 28.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * The schedule used to run the crypto assessment periodically. The schedule uses the
         * format: <version-string>;<version-specific-schedule>
         *
         * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
         * <day-of-month>
         *
         * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules.
         * Do not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
         * service generates a default monthly schedule for an assessment created on day 29, 30, or
         * 31 of a month, it uses day 28.
         *
         * @param schedule the value to set
         * @return this builder
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cryptoPosture")
        private CryptoPosture cryptoPosture;

        public Builder cryptoPosture(CryptoPosture cryptoPosture) {
            this.cryptoPosture = cryptoPosture;
            this.__explicitlySet__.add("cryptoPosture");
            return this;
        }
        /** Number of crypto issues detected in this assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("issueCount")
        private Integer issueCount;

        /**
         * Number of crypto issues detected in this assessment.
         *
         * @param issueCount the value to set
         * @return this builder
         */
        public Builder issueCount(Integer issueCount) {
            this.issueCount = issueCount;
            this.__explicitlySet__.add("issueCount");
            return this;
        }
        /**
         * Number of assessed targets with one or more crypto issues. For a target database
         * assessment, this value is 1 when the target has issues and 0 otherwise. For a target
         * database group assessment, this value is the number of targets in the group that have
         * issues.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsWithIssuesCount")
        private Integer targetsWithIssuesCount;

        /**
         * Number of assessed targets with one or more crypto issues. For a target database
         * assessment, this value is 1 when the target has issues and 0 otherwise. For a target
         * database group assessment, this value is the number of targets in the group that have
         * issues.
         *
         * @param targetsWithIssuesCount the value to set
         * @return this builder
         */
        public Builder targetsWithIssuesCount(Integer targetsWithIssuesCount) {
            this.targetsWithIssuesCount = targetsWithIssuesCount;
            this.__explicitlySet__.add("targetsWithIssuesCount");
            return this;
        }
        /**
         * Indicates whether scheduled execution is active for this crypto assessment. When false,
         * the schedule value is retained but scheduled execution is paused.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAssessmentScheduled")
        private Boolean isAssessmentScheduled;

        /**
         * Indicates whether scheduled execution is active for this crypto assessment. When false,
         * the schedule value is retained but scheduled execution is paused.
         *
         * @param isAssessmentScheduled the value to set
         * @return this builder
         */
        public Builder isAssessmentScheduled(Boolean isAssessmentScheduled) {
            this.isAssessmentScheduled = isAssessmentScheduled;
            this.__explicitlySet__.add("isAssessmentScheduled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
         * "true"}}}
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

        public CryptoAssessment build() {
            CryptoAssessment model =
                    new CryptoAssessment(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastAssessed,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.type,
                            this.triggeredBy,
                            this.targetType,
                            this.targetId,
                            this.targetDatabaseGroupId,
                            this.databaseVersion,
                            this.databaseName,
                            this.databaseArchitecture,
                            this.cryptoProvider,
                            this.postureCategory,
                            this.schedule,
                            this.cryptoPosture,
                            this.issueCount,
                            this.targetsWithIssuesCount,
                            this.isAssessmentScheduled,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("triggeredBy")) {
                this.triggeredBy(model.getTriggeredBy());
            }
            if (model.wasPropertyExplicitlySet("targetType")) {
                this.targetType(model.getTargetType());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseGroupId")) {
                this.targetDatabaseGroupId(model.getTargetDatabaseGroupId());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseArchitecture")) {
                this.databaseArchitecture(model.getDatabaseArchitecture());
            }
            if (model.wasPropertyExplicitlySet("cryptoProvider")) {
                this.cryptoProvider(model.getCryptoProvider());
            }
            if (model.wasPropertyExplicitlySet("postureCategory")) {
                this.postureCategory(model.getPostureCategory());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("cryptoPosture")) {
                this.cryptoPosture(model.getCryptoPosture());
            }
            if (model.wasPropertyExplicitlySet("issueCount")) {
                this.issueCount(model.getIssueCount());
            }
            if (model.wasPropertyExplicitlySet("targetsWithIssuesCount")) {
                this.targetsWithIssuesCount(model.getTargetsWithIssuesCount());
            }
            if (model.wasPropertyExplicitlySet("isAssessmentScheduled")) {
                this.isAssessmentScheduled(model.getIsAssessmentScheduled());
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

    /** The OCID of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the crypto assessment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The display name of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the crypto assessment.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the crypto assessment.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The OCID of the compartment that contains the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the crypto assessment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The date and time the crypto assessment was created, in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the crypto assessment was created, in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the crypto assessment was last updated, in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the crypto assessment was last updated, in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time the crypto posture was last assessed, in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
    private final java.util.Date timeLastAssessed;

    /**
     * The date and time the crypto posture was last assessed, in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeLastAssessed() {
        return timeLastAssessed;
    }

    /** The current lifecycle state of the crypto assessment. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current lifecycle state of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the crypto assessment.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current lifecycle state of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current lifecycle state of the crypto assessment.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The type of this crypto assessment. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Latest("LATEST"),
        Saved("SAVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The type of this crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of this crypto assessment.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The actor that created the assessment. */
    public enum TriggeredBy implements com.oracle.bmc.http.internal.BmcEnum {
        User("USER"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggeredBy.class);

        private final String value;
        private static java.util.Map<String, TriggeredBy> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggeredBy v : TriggeredBy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggeredBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggeredBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggeredBy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The actor that created the assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
    private final TriggeredBy triggeredBy;

    /**
     * The actor that created the assessment.
     *
     * @return the value
     */
    public TriggeredBy getTriggeredBy() {
        return triggeredBy;
    }

    /** The target type of the crypto assessment. */
    public enum TargetType implements com.oracle.bmc.http.internal.BmcEnum {
        TargetDatabase("TARGET_DATABASE"),
        TargetDatabaseGroup("TARGET_DATABASE_GROUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetType.class);

        private final String value;
        private static java.util.Map<String, TargetType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetType v : TargetType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The target type of the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final TargetType targetType;

    /**
     * The target type of the crypto assessment.
     *
     * @return the value
     */
    public TargetType getTargetType() {
        return targetType;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The OCID of the target database group. This is returned when {@code targetType} is {@code
     * TARGET_DATABASE_GROUP}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseGroupId")
    private final String targetDatabaseGroupId;

    /**
     * The OCID of the target database group. This is returned when {@code targetType} is {@code
     * TARGET_DATABASE_GROUP}.
     *
     * @return the value
     */
    public String getTargetDatabaseGroupId() {
        return targetDatabaseGroupId;
    }

    /** The version of the assessed target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The version of the assessed target database.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** The name of the assessed target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The name of the assessed target database.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** The architecture of the assessed target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseArchitecture")
    private final String databaseArchitecture;

    /**
     * The architecture of the assessed target database.
     *
     * @return the value
     */
    public String getDatabaseArchitecture() {
        return databaseArchitecture;
    }

    /** Cryptographic provider and version information observed on the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("cryptoProvider")
    private final String cryptoProvider;

    /**
     * Cryptographic provider and version information observed on the target.
     *
     * @return the value
     */
    public String getCryptoProvider() {
        return cryptoProvider;
    }

    /** Overall posture category for the crypto assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("postureCategory")
    private final CryptoPostureCategory postureCategory;

    /**
     * Overall posture category for the crypto assessment.
     *
     * @return the value
     */
    public CryptoPostureCategory getPostureCategory() {
        return postureCategory;
    }

    /**
     * The schedule used to run the crypto assessment periodically. The schedule uses the format:
     * <version-string>;<version-specific-schedule>
     *
     * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
     * <day-of-month>
     *
     * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules. Do
     * not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
     * service generates a default monthly schedule for an assessment created on day 29, 30, or 31
     * of a month, it uses day 28.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * The schedule used to run the crypto assessment periodically. The schedule uses the format:
     * <version-string>;<version-specific-schedule>
     *
     * <p>For v1, the version-specific schedule format is: <ss> <mm> <hh> <day-of-week>
     * <day-of-month>
     *
     * <p>Specify either day-of-week for weekly schedules or day-of-month for monthly schedules. Do
     * not specify both. For monthly schedules, day-of-month must be between 1 and 28. If the
     * service generates a default monthly schedule for an assessment created on day 29, 30, or 31
     * of a month, it uses day 28.
     *
     * @return the value
     */
    public String getSchedule() {
        return schedule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cryptoPosture")
    private final CryptoPosture cryptoPosture;

    public CryptoPosture getCryptoPosture() {
        return cryptoPosture;
    }

    /** Number of crypto issues detected in this assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("issueCount")
    private final Integer issueCount;

    /**
     * Number of crypto issues detected in this assessment.
     *
     * @return the value
     */
    public Integer getIssueCount() {
        return issueCount;
    }

    /**
     * Number of assessed targets with one or more crypto issues. For a target database assessment,
     * this value is 1 when the target has issues and 0 otherwise. For a target database group
     * assessment, this value is the number of targets in the group that have issues.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsWithIssuesCount")
    private final Integer targetsWithIssuesCount;

    /**
     * Number of assessed targets with one or more crypto issues. For a target database assessment,
     * this value is 1 when the target has issues and 0 otherwise. For a target database group
     * assessment, this value is the number of targets in the group that have issues.
     *
     * @return the value
     */
    public Integer getTargetsWithIssuesCount() {
        return targetsWithIssuesCount;
    }

    /**
     * Indicates whether scheduled execution is active for this crypto assessment. When false, the
     * schedule value is retained but scheduled execution is paused.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAssessmentScheduled")
    private final Boolean isAssessmentScheduled;

    /**
     * Indicates whether scheduled execution is active for this crypto assessment. When false, the
     * schedule value is retained but scheduled execution is paused.
     *
     * @return the value
     */
    public Boolean getIsAssessmentScheduled() {
        return isAssessmentScheduled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see Resource Tags. Example: {@code {"orcl-cloud": {"free-tier-retained":
     * "true"}}}
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
        sb.append("CryptoAssessment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", triggeredBy=").append(String.valueOf(this.triggeredBy));
        sb.append(", targetType=").append(String.valueOf(this.targetType));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetDatabaseGroupId=").append(String.valueOf(this.targetDatabaseGroupId));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseArchitecture=").append(String.valueOf(this.databaseArchitecture));
        sb.append(", cryptoProvider=").append(String.valueOf(this.cryptoProvider));
        sb.append(", postureCategory=").append(String.valueOf(this.postureCategory));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", cryptoPosture=").append(String.valueOf(this.cryptoPosture));
        sb.append(", issueCount=").append(String.valueOf(this.issueCount));
        sb.append(", targetsWithIssuesCount=").append(String.valueOf(this.targetsWithIssuesCount));
        sb.append(", isAssessmentScheduled=").append(String.valueOf(this.isAssessmentScheduled));
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
        if (!(o instanceof CryptoAssessment)) {
            return false;
        }

        CryptoAssessment other = (CryptoAssessment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.triggeredBy, other.triggeredBy)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetDatabaseGroupId, other.targetDatabaseGroupId)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseArchitecture, other.databaseArchitecture)
                && java.util.Objects.equals(this.cryptoProvider, other.cryptoProvider)
                && java.util.Objects.equals(this.postureCategory, other.postureCategory)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.cryptoPosture, other.cryptoPosture)
                && java.util.Objects.equals(this.issueCount, other.issueCount)
                && java.util.Objects.equals(
                        this.targetsWithIssuesCount, other.targetsWithIssuesCount)
                && java.util.Objects.equals(this.isAssessmentScheduled, other.isAssessmentScheduled)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastAssessed == null ? 43 : this.timeLastAssessed.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.triggeredBy == null ? 43 : this.triggeredBy.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseGroupId == null
                                ? 43
                                : this.targetDatabaseGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseArchitecture == null
                                ? 43
                                : this.databaseArchitecture.hashCode());
        result =
                (result * PRIME)
                        + (this.cryptoProvider == null ? 43 : this.cryptoProvider.hashCode());
        result =
                (result * PRIME)
                        + (this.postureCategory == null ? 43 : this.postureCategory.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result =
                (result * PRIME)
                        + (this.cryptoPosture == null ? 43 : this.cryptoPosture.hashCode());
        result = (result * PRIME) + (this.issueCount == null ? 43 : this.issueCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithIssuesCount == null
                                ? 43
                                : this.targetsWithIssuesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isAssessmentScheduled == null
                                ? 43
                                : this.isAssessmentScheduled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
