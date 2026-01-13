/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Deployment Upgrade. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeploymentUpgradeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeploymentUpgradeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "deploymentId",
        "deploymentUpgradeType",
        "timeStarted",
        "timeFinished",
        "oggVersion",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleSubState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "previousOggVersion",
        "timeSchedule",
        "isSnoozed",
        "timeSnoozedUntil",
        "timeReleased",
        "releaseType",
        "isSecurityFix",
        "isRollbackAllowed",
        "timeOggVersionSupportedUntil",
        "isCancelAllowed",
        "isRescheduleAllowed",
        "timeScheduleMax"
    })
    public DeploymentUpgradeSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String deploymentId,
            DeploymentUpgradeType deploymentUpgradeType,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String oggVersion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            LifecycleSubState lifecycleSubState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String previousOggVersion,
            java.util.Date timeSchedule,
            Boolean isSnoozed,
            java.util.Date timeSnoozedUntil,
            java.util.Date timeReleased,
            ReleaseType releaseType,
            Boolean isSecurityFix,
            Boolean isRollbackAllowed,
            java.util.Date timeOggVersionSupportedUntil,
            Boolean isCancelAllowed,
            Boolean isRescheduleAllowed,
            java.util.Date timeScheduleMax) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.deploymentId = deploymentId;
        this.deploymentUpgradeType = deploymentUpgradeType;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.oggVersion = oggVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleSubState = lifecycleSubState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.previousOggVersion = previousOggVersion;
        this.timeSchedule = timeSchedule;
        this.isSnoozed = isSnoozed;
        this.timeSnoozedUntil = timeSnoozedUntil;
        this.timeReleased = timeReleased;
        this.releaseType = releaseType;
        this.isSecurityFix = isSecurityFix;
        this.isRollbackAllowed = isRollbackAllowed;
        this.timeOggVersionSupportedUntil = timeOggVersionSupportedUntil;
        this.isCancelAllowed = isCancelAllowed;
        this.isRescheduleAllowed = isRescheduleAllowed;
        this.timeScheduleMax = timeScheduleMax;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Metadata about this specific object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment being referenced.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
        private String deploymentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * deployment being referenced.
         *
         * @param deploymentId the value to set
         * @return this builder
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            this.__explicitlySet__.add("deploymentId");
            return this;
        }
        /** The type of the deployment upgrade: MANUAL or AUTOMATIC */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentUpgradeType")
        private DeploymentUpgradeType deploymentUpgradeType;

        /**
         * The type of the deployment upgrade: MANUAL or AUTOMATIC
         *
         * @param deploymentUpgradeType the value to set
         * @return this builder
         */
        public Builder deploymentUpgradeType(DeploymentUpgradeType deploymentUpgradeType) {
            this.deploymentUpgradeType = deploymentUpgradeType;
            this.__explicitlySet__.add("deploymentUpgradeType");
            return this;
        }
        /**
         * The date and time the request was started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the request was started. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the request was finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the request was finished. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** Version of OGG */
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         */
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }
        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
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
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was last updated. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Possible lifecycle states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Possible lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Possible GGS lifecycle sub-states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
        private LifecycleSubState lifecycleSubState;

        /**
         * Possible GGS lifecycle sub-states.
         *
         * @param lifecycleSubState the value to set
         * @return this builder
         */
        public Builder lifecycleSubState(LifecycleSubState lifecycleSubState) {
            this.lifecycleSubState = lifecycleSubState;
            this.__explicitlySet__.add("lifecycleSubState");
            return this;
        }
        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Describes the object's current state in detail. For example, it can be used to provide
         * actionable information for a resource in a Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only.
         *
         * <p>Example: {@code {"bar-key": "value"}}
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
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Tags defined for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Version of OGG */
        @com.fasterxml.jackson.annotation.JsonProperty("previousOggVersion")
        private String previousOggVersion;

        /**
         * Version of OGG
         *
         * @param previousOggVersion the value to set
         * @return this builder
         */
        public Builder previousOggVersion(String previousOggVersion) {
            this.previousOggVersion = previousOggVersion;
            this.__explicitlySet__.add("previousOggVersion");
            return this;
        }
        /**
         * The time of upgrade schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSchedule")
        private java.util.Date timeSchedule;

        /**
         * The time of upgrade schedule. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeSchedule the value to set
         * @return this builder
         */
        public Builder timeSchedule(java.util.Date timeSchedule) {
            this.timeSchedule = timeSchedule;
            this.__explicitlySet__.add("timeSchedule");
            return this;
        }
        /** Indicates if upgrade notifications are snoozed or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSnoozed")
        private Boolean isSnoozed;

        /**
         * Indicates if upgrade notifications are snoozed or not.
         *
         * @param isSnoozed the value to set
         * @return this builder
         */
        public Builder isSnoozed(Boolean isSnoozed) {
            this.isSnoozed = isSnoozed;
            this.__explicitlySet__.add("isSnoozed");
            return this;
        }
        /**
         * The time the upgrade notifications are snoozed until. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSnoozedUntil")
        private java.util.Date timeSnoozedUntil;

        /**
         * The time the upgrade notifications are snoozed until. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeSnoozedUntil the value to set
         * @return this builder
         */
        public Builder timeSnoozedUntil(java.util.Date timeSnoozedUntil) {
            this.timeSnoozedUntil = timeSnoozedUntil;
            this.__explicitlySet__.add("timeSnoozedUntil");
            return this;
        }
        /**
         * The time the resource was released. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The time the resource was released. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /** The type of release. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseType")
        private ReleaseType releaseType;

        /**
         * The type of release.
         *
         * @param releaseType the value to set
         * @return this builder
         */
        public Builder releaseType(ReleaseType releaseType) {
            this.releaseType = releaseType;
            this.__explicitlySet__.add("releaseType");
            return this;
        }
        /** Indicates if OGG release contains security fix. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSecurityFix")
        private Boolean isSecurityFix;

        /**
         * Indicates if OGG release contains security fix.
         *
         * @param isSecurityFix the value to set
         * @return this builder
         */
        public Builder isSecurityFix(Boolean isSecurityFix) {
            this.isSecurityFix = isSecurityFix;
            this.__explicitlySet__.add("isSecurityFix");
            return this;
        }
        /**
         * Indicates if rollback is allowed. In practice only the last upgrade can be rolled back. -
         * Manual upgrade is allowed to rollback only until the old version isn't deprecated yet. -
         * Automatic upgrade by default is not allowed, unless a serious issue does not justify.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRollbackAllowed")
        private Boolean isRollbackAllowed;

        /**
         * Indicates if rollback is allowed. In practice only the last upgrade can be rolled back. -
         * Manual upgrade is allowed to rollback only until the old version isn't deprecated yet. -
         * Automatic upgrade by default is not allowed, unless a serious issue does not justify.
         *
         * @param isRollbackAllowed the value to set
         * @return this builder
         */
        public Builder isRollbackAllowed(Boolean isRollbackAllowed) {
            this.isRollbackAllowed = isRollbackAllowed;
            this.__explicitlySet__.add("isRollbackAllowed");
            return this;
        }
        /**
         * The time until OGG version is supported. After this date has passed OGG version will not
         * be available anymore. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOggVersionSupportedUntil")
        private java.util.Date timeOggVersionSupportedUntil;

        /**
         * The time until OGG version is supported. After this date has passed OGG version will not
         * be available anymore. The format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
         *
         * @param timeOggVersionSupportedUntil the value to set
         * @return this builder
         */
        public Builder timeOggVersionSupportedUntil(java.util.Date timeOggVersionSupportedUntil) {
            this.timeOggVersionSupportedUntil = timeOggVersionSupportedUntil;
            this.__explicitlySet__.add("timeOggVersionSupportedUntil");
            return this;
        }
        /**
         * Indicates if cancel is allowed. Scheduled upgrade can be cancelled only if target version
         * is not forced by service, otherwise only reschedule allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCancelAllowed")
        private Boolean isCancelAllowed;

        /**
         * Indicates if cancel is allowed. Scheduled upgrade can be cancelled only if target version
         * is not forced by service, otherwise only reschedule allowed.
         *
         * @param isCancelAllowed the value to set
         * @return this builder
         */
        public Builder isCancelAllowed(Boolean isCancelAllowed) {
            this.isCancelAllowed = isCancelAllowed;
            this.__explicitlySet__.add("isCancelAllowed");
            return this;
        }
        /**
         * Indicates if reschedule is allowed. Upgrade can be rescheduled postponed until the end of
         * the service defined auto-upgrade period.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRescheduleAllowed")
        private Boolean isRescheduleAllowed;

        /**
         * Indicates if reschedule is allowed. Upgrade can be rescheduled postponed until the end of
         * the service defined auto-upgrade period.
         *
         * @param isRescheduleAllowed the value to set
         * @return this builder
         */
        public Builder isRescheduleAllowed(Boolean isRescheduleAllowed) {
            this.isRescheduleAllowed = isRescheduleAllowed;
            this.__explicitlySet__.add("isRescheduleAllowed");
            return this;
        }
        /**
         * Indicates the latest time until the deployment upgrade could be rescheduled. The format
         * is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleMax")
        private java.util.Date timeScheduleMax;

        /**
         * Indicates the latest time until the deployment upgrade could be rescheduled. The format
         * is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         *
         * @param timeScheduleMax the value to set
         * @return this builder
         */
        public Builder timeScheduleMax(java.util.Date timeScheduleMax) {
            this.timeScheduleMax = timeScheduleMax;
            this.__explicitlySet__.add("timeScheduleMax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentUpgradeSummary build() {
            DeploymentUpgradeSummary model =
                    new DeploymentUpgradeSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.deploymentId,
                            this.deploymentUpgradeType,
                            this.timeStarted,
                            this.timeFinished,
                            this.oggVersion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleSubState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.previousOggVersion,
                            this.timeSchedule,
                            this.isSnoozed,
                            this.timeSnoozedUntil,
                            this.timeReleased,
                            this.releaseType,
                            this.isSecurityFix,
                            this.isRollbackAllowed,
                            this.timeOggVersionSupportedUntil,
                            this.isCancelAllowed,
                            this.isRescheduleAllowed,
                            this.timeScheduleMax);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentUpgradeSummary model) {
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
            if (model.wasPropertyExplicitlySet("deploymentId")) {
                this.deploymentId(model.getDeploymentId());
            }
            if (model.wasPropertyExplicitlySet("deploymentUpgradeType")) {
                this.deploymentUpgradeType(model.getDeploymentUpgradeType());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
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
            if (model.wasPropertyExplicitlySet("lifecycleSubState")) {
                this.lifecycleSubState(model.getLifecycleSubState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
            if (model.wasPropertyExplicitlySet("previousOggVersion")) {
                this.previousOggVersion(model.getPreviousOggVersion());
            }
            if (model.wasPropertyExplicitlySet("timeSchedule")) {
                this.timeSchedule(model.getTimeSchedule());
            }
            if (model.wasPropertyExplicitlySet("isSnoozed")) {
                this.isSnoozed(model.getIsSnoozed());
            }
            if (model.wasPropertyExplicitlySet("timeSnoozedUntil")) {
                this.timeSnoozedUntil(model.getTimeSnoozedUntil());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("releaseType")) {
                this.releaseType(model.getReleaseType());
            }
            if (model.wasPropertyExplicitlySet("isSecurityFix")) {
                this.isSecurityFix(model.getIsSecurityFix());
            }
            if (model.wasPropertyExplicitlySet("isRollbackAllowed")) {
                this.isRollbackAllowed(model.getIsRollbackAllowed());
            }
            if (model.wasPropertyExplicitlySet("timeOggVersionSupportedUntil")) {
                this.timeOggVersionSupportedUntil(model.getTimeOggVersionSupportedUntil());
            }
            if (model.wasPropertyExplicitlySet("isCancelAllowed")) {
                this.isCancelAllowed(model.getIsCancelAllowed());
            }
            if (model.wasPropertyExplicitlySet("isRescheduleAllowed")) {
                this.isRescheduleAllowed(model.getIsRescheduleAllowed());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleMax")) {
                this.timeScheduleMax(model.getTimeScheduleMax());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Metadata about this specific object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment being referenced.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * deployment being referenced.
     *
     * @return the value
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /** The type of the deployment upgrade: MANUAL or AUTOMATIC */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentUpgradeType")
    private final DeploymentUpgradeType deploymentUpgradeType;

    /**
     * The type of the deployment upgrade: MANUAL or AUTOMATIC
     *
     * @return the value
     */
    public DeploymentUpgradeType getDeploymentUpgradeType() {
        return deploymentUpgradeType;
    }

    /**
     * The date and time the request was started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the request was started. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the request was finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the request was finished. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** Version of OGG */
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     */
    public String getOggVersion() {
        return oggVersion;
    }

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was last updated. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Possible lifecycle states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Possible lifecycle states.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Possible GGS lifecycle sub-states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
    private final LifecycleSubState lifecycleSubState;

    /**
     * Possible GGS lifecycle sub-states.
     *
     * @return the value
     */
    public LifecycleSubState getLifecycleSubState() {
        return lifecycleSubState;
    }

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Describes the object's current state in detail. For example, it can be used to provide
     * actionable information for a resource in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. Exists
     * for cross-compatibility only.
     *
     * <p>Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Tags defined for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * Cloud Infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Version of OGG */
    @com.fasterxml.jackson.annotation.JsonProperty("previousOggVersion")
    private final String previousOggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     */
    public String getPreviousOggVersion() {
        return previousOggVersion;
    }

    /**
     * The time of upgrade schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSchedule")
    private final java.util.Date timeSchedule;

    /**
     * The time of upgrade schedule. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeSchedule() {
        return timeSchedule;
    }

    /** Indicates if upgrade notifications are snoozed or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSnoozed")
    private final Boolean isSnoozed;

    /**
     * Indicates if upgrade notifications are snoozed or not.
     *
     * @return the value
     */
    public Boolean getIsSnoozed() {
        return isSnoozed;
    }

    /**
     * The time the upgrade notifications are snoozed until. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnoozedUntil")
    private final java.util.Date timeSnoozedUntil;

    /**
     * The time the upgrade notifications are snoozed until. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeSnoozedUntil() {
        return timeSnoozedUntil;
    }

    /**
     * The time the resource was released. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The time the resource was released. The format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /** The type of release. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseType")
    private final ReleaseType releaseType;

    /**
     * The type of release.
     *
     * @return the value
     */
    public ReleaseType getReleaseType() {
        return releaseType;
    }

    /** Indicates if OGG release contains security fix. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSecurityFix")
    private final Boolean isSecurityFix;

    /**
     * Indicates if OGG release contains security fix.
     *
     * @return the value
     */
    public Boolean getIsSecurityFix() {
        return isSecurityFix;
    }

    /**
     * Indicates if rollback is allowed. In practice only the last upgrade can be rolled back. -
     * Manual upgrade is allowed to rollback only until the old version isn't deprecated yet. -
     * Automatic upgrade by default is not allowed, unless a serious issue does not justify.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRollbackAllowed")
    private final Boolean isRollbackAllowed;

    /**
     * Indicates if rollback is allowed. In practice only the last upgrade can be rolled back. -
     * Manual upgrade is allowed to rollback only until the old version isn't deprecated yet. -
     * Automatic upgrade by default is not allowed, unless a serious issue does not justify.
     *
     * @return the value
     */
    public Boolean getIsRollbackAllowed() {
        return isRollbackAllowed;
    }

    /**
     * The time until OGG version is supported. After this date has passed OGG version will not be
     * available anymore. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOggVersionSupportedUntil")
    private final java.util.Date timeOggVersionSupportedUntil;

    /**
     * The time until OGG version is supported. After this date has passed OGG version will not be
     * available anymore. The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeOggVersionSupportedUntil() {
        return timeOggVersionSupportedUntil;
    }

    /**
     * Indicates if cancel is allowed. Scheduled upgrade can be cancelled only if target version is
     * not forced by service, otherwise only reschedule allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCancelAllowed")
    private final Boolean isCancelAllowed;

    /**
     * Indicates if cancel is allowed. Scheduled upgrade can be cancelled only if target version is
     * not forced by service, otherwise only reschedule allowed.
     *
     * @return the value
     */
    public Boolean getIsCancelAllowed() {
        return isCancelAllowed;
    }

    /**
     * Indicates if reschedule is allowed. Upgrade can be rescheduled postponed until the end of the
     * service defined auto-upgrade period.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRescheduleAllowed")
    private final Boolean isRescheduleAllowed;

    /**
     * Indicates if reschedule is allowed. Upgrade can be rescheduled postponed until the end of the
     * service defined auto-upgrade period.
     *
     * @return the value
     */
    public Boolean getIsRescheduleAllowed() {
        return isRescheduleAllowed;
    }

    /**
     * Indicates the latest time until the deployment upgrade could be rescheduled. The format is
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleMax")
    private final java.util.Date timeScheduleMax;

    /**
     * Indicates the latest time until the deployment upgrade could be rescheduled. The format is
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduleMax() {
        return timeScheduleMax;
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
        sb.append("DeploymentUpgradeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", deploymentUpgradeType=").append(String.valueOf(this.deploymentUpgradeType));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleSubState=").append(String.valueOf(this.lifecycleSubState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", previousOggVersion=").append(String.valueOf(this.previousOggVersion));
        sb.append(", timeSchedule=").append(String.valueOf(this.timeSchedule));
        sb.append(", isSnoozed=").append(String.valueOf(this.isSnoozed));
        sb.append(", timeSnoozedUntil=").append(String.valueOf(this.timeSnoozedUntil));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", releaseType=").append(String.valueOf(this.releaseType));
        sb.append(", isSecurityFix=").append(String.valueOf(this.isSecurityFix));
        sb.append(", isRollbackAllowed=").append(String.valueOf(this.isRollbackAllowed));
        sb.append(", timeOggVersionSupportedUntil=")
                .append(String.valueOf(this.timeOggVersionSupportedUntil));
        sb.append(", isCancelAllowed=").append(String.valueOf(this.isCancelAllowed));
        sb.append(", isRescheduleAllowed=").append(String.valueOf(this.isRescheduleAllowed));
        sb.append(", timeScheduleMax=").append(String.valueOf(this.timeScheduleMax));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentUpgradeSummary)) {
            return false;
        }

        DeploymentUpgradeSummary other = (DeploymentUpgradeSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.deploymentUpgradeType, other.deploymentUpgradeType)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleSubState, other.lifecycleSubState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.previousOggVersion, other.previousOggVersion)
                && java.util.Objects.equals(this.timeSchedule, other.timeSchedule)
                && java.util.Objects.equals(this.isSnoozed, other.isSnoozed)
                && java.util.Objects.equals(this.timeSnoozedUntil, other.timeSnoozedUntil)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.releaseType, other.releaseType)
                && java.util.Objects.equals(this.isSecurityFix, other.isSecurityFix)
                && java.util.Objects.equals(this.isRollbackAllowed, other.isRollbackAllowed)
                && java.util.Objects.equals(
                        this.timeOggVersionSupportedUntil, other.timeOggVersionSupportedUntil)
                && java.util.Objects.equals(this.isCancelAllowed, other.isCancelAllowed)
                && java.util.Objects.equals(this.isRescheduleAllowed, other.isRescheduleAllowed)
                && java.util.Objects.equals(this.timeScheduleMax, other.timeScheduleMax)
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
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentUpgradeType == null
                                ? 43
                                : this.deploymentUpgradeType.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubState == null ? 43 : this.lifecycleSubState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.previousOggVersion == null
                                ? 43
                                : this.previousOggVersion.hashCode());
        result = (result * PRIME) + (this.timeSchedule == null ? 43 : this.timeSchedule.hashCode());
        result = (result * PRIME) + (this.isSnoozed == null ? 43 : this.isSnoozed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnoozedUntil == null ? 43 : this.timeSnoozedUntil.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.releaseType == null ? 43 : this.releaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.isSecurityFix == null ? 43 : this.isSecurityFix.hashCode());
        result =
                (result * PRIME)
                        + (this.isRollbackAllowed == null ? 43 : this.isRollbackAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOggVersionSupportedUntil == null
                                ? 43
                                : this.timeOggVersionSupportedUntil.hashCode());
        result =
                (result * PRIME)
                        + (this.isCancelAllowed == null ? 43 : this.isCancelAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.isRescheduleAllowed == null
                                ? 43
                                : this.isRescheduleAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleMax == null ? 43 : this.timeScheduleMax.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
