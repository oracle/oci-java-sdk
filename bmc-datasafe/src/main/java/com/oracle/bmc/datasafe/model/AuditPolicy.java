/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The resource represents all available audit policies relevant for the target database with their
 * corresponding audit conditions. The audit policies could be in any one of the following 3 states
 * in the target database 1) Created and enabled 2) Created but not enabled 3) Not created For more
 * details on available audit policies, refer to
 * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827).
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuditPolicy extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "targetId",
        "isDataSafeServiceAccountExcluded",
        "timeLastProvisioned",
        "timeLastRetrieved",
        "auditSpecifications",
        "auditConditions",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AuditPolicy(
            String id,
            String compartmentId,
            String displayName,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            AuditPolicyLifecycleState lifecycleState,
            String lifecycleDetails,
            String targetId,
            Boolean isDataSafeServiceAccountExcluded,
            java.util.Date timeLastProvisioned,
            java.util.Date timeLastRetrieved,
            java.util.List<AuditSpecification> auditSpecifications,
            java.util.List<AuditConditions> auditConditions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.targetId = targetId;
        this.isDataSafeServiceAccountExcluded = isDataSafeServiceAccountExcluded;
        this.timeLastProvisioned = timeLastProvisioned;
        this.timeLastRetrieved = timeLastRetrieved;
        this.auditSpecifications = auditSpecifications;
        this.auditConditions = auditConditions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the audit policy.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment containing the audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the audit policy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the audit policy.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the audit policy.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The time the the audit policy was created, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the audit policy was created, in the format defined by RFC3339.
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
         * The last date and time the audit policy was updated, in the format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last date and time the audit policy was updated, in the format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the audit policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditPolicyLifecycleState lifecycleState;

        /**
         * The current state of the audit policy.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AuditPolicyLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current state of the audit policy in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the audit policy in Data Safe.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The OCID of the target for which the audit policy is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target for which the audit policy is created.
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
         * Option provided to users at the target to indicate whether the Data Safe service account
         * has to be excluded while provisioning the audit policies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataSafeServiceAccountExcluded")
        private Boolean isDataSafeServiceAccountExcluded;

        /**
         * Option provided to users at the target to indicate whether the Data Safe service account
         * has to be excluded while provisioning the audit policies.
         *
         * @param isDataSafeServiceAccountExcluded the value to set
         * @return this builder
         */
        public Builder isDataSafeServiceAccountExcluded(Boolean isDataSafeServiceAccountExcluded) {
            this.isDataSafeServiceAccountExcluded = isDataSafeServiceAccountExcluded;
            this.__explicitlySet__.add("isDataSafeServiceAccountExcluded");
            return this;
        }
        /**
         * Indicates the last provisioning time of audit policies on the target, in the format
         * defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastProvisioned")
        private java.util.Date timeLastProvisioned;

        /**
         * Indicates the last provisioning time of audit policies on the target, in the format
         * defined by RFC3339.
         *
         * @param timeLastProvisioned the value to set
         * @return this builder
         */
        public Builder timeLastProvisioned(java.util.Date timeLastProvisioned) {
            this.timeLastProvisioned = timeLastProvisioned;
            this.__explicitlySet__.add("timeLastProvisioned");
            return this;
        }
        /**
         * The time when the audit policies was last retrieved from this target, in the format
         * defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRetrieved")
        private java.util.Date timeLastRetrieved;

        /**
         * The time when the audit policies was last retrieved from this target, in the format
         * defined by RFC3339.
         *
         * @param timeLastRetrieved the value to set
         * @return this builder
         */
        public Builder timeLastRetrieved(java.util.Date timeLastRetrieved) {
            this.timeLastRetrieved = timeLastRetrieved;
            this.__explicitlySet__.add("timeLastRetrieved");
            return this;
        }
        /**
         * Represents all available audit policy specifications relevant for the target database.
         * For more details on available audit polcies, refer to
         * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("auditSpecifications")
        private java.util.List<AuditSpecification> auditSpecifications;

        /**
         * Represents all available audit policy specifications relevant for the target database.
         * For more details on available audit polcies, refer to
         * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827).
         *
         * @param auditSpecifications the value to set
         * @return this builder
         */
        public Builder auditSpecifications(java.util.List<AuditSpecification> auditSpecifications) {
            this.auditSpecifications = auditSpecifications;
            this.__explicitlySet__.add("auditSpecifications");
            return this;
        }
        /** Lists the audit policy provisioning conditions for the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditConditions")
        private java.util.List<AuditConditions> auditConditions;

        /**
         * Lists the audit policy provisioning conditions for the target database.
         *
         * @param auditConditions the value to set
         * @return this builder
         */
        public Builder auditConditions(java.util.List<AuditConditions> auditConditions) {
            this.auditConditions = auditConditions;
            this.__explicitlySet__.add("auditConditions");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public AuditPolicy build() {
            AuditPolicy model =
                    new AuditPolicy(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.targetId,
                            this.isDataSafeServiceAccountExcluded,
                            this.timeLastProvisioned,
                            this.timeLastRetrieved,
                            this.auditSpecifications,
                            this.auditConditions,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditPolicy model) {
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
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("isDataSafeServiceAccountExcluded")) {
                this.isDataSafeServiceAccountExcluded(model.getIsDataSafeServiceAccountExcluded());
            }
            if (model.wasPropertyExplicitlySet("timeLastProvisioned")) {
                this.timeLastProvisioned(model.getTimeLastProvisioned());
            }
            if (model.wasPropertyExplicitlySet("timeLastRetrieved")) {
                this.timeLastRetrieved(model.getTimeLastRetrieved());
            }
            if (model.wasPropertyExplicitlySet("auditSpecifications")) {
                this.auditSpecifications(model.getAuditSpecifications());
            }
            if (model.wasPropertyExplicitlySet("auditConditions")) {
                this.auditConditions(model.getAuditConditions());
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

    /** The OCID of the audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the audit policy.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment containing the audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the audit policy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the audit policy.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the audit policy.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The time the the audit policy was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the audit policy was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The last date and time the audit policy was updated, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last date and time the audit policy was updated, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the audit policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditPolicyLifecycleState lifecycleState;

    /**
     * The current state of the audit policy.
     *
     * @return the value
     */
    public AuditPolicyLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current state of the audit policy in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the audit policy in Data Safe.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The OCID of the target for which the audit policy is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target for which the audit policy is created.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * Option provided to users at the target to indicate whether the Data Safe service account has
     * to be excluded while provisioning the audit policies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataSafeServiceAccountExcluded")
    private final Boolean isDataSafeServiceAccountExcluded;

    /**
     * Option provided to users at the target to indicate whether the Data Safe service account has
     * to be excluded while provisioning the audit policies.
     *
     * @return the value
     */
    public Boolean getIsDataSafeServiceAccountExcluded() {
        return isDataSafeServiceAccountExcluded;
    }

    /**
     * Indicates the last provisioning time of audit policies on the target, in the format defined
     * by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastProvisioned")
    private final java.util.Date timeLastProvisioned;

    /**
     * Indicates the last provisioning time of audit policies on the target, in the format defined
     * by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastProvisioned() {
        return timeLastProvisioned;
    }

    /**
     * The time when the audit policies was last retrieved from this target, in the format defined
     * by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRetrieved")
    private final java.util.Date timeLastRetrieved;

    /**
     * The time when the audit policies was last retrieved from this target, in the format defined
     * by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastRetrieved() {
        return timeLastRetrieved;
    }

    /**
     * Represents all available audit policy specifications relevant for the target database. For
     * more details on available audit polcies, refer to
     * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auditSpecifications")
    private final java.util.List<AuditSpecification> auditSpecifications;

    /**
     * Represents all available audit policy specifications relevant for the target database. For
     * more details on available audit polcies, refer to
     * [documentation](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/audit-policies.html#GUID-361A9A9A-7C21-4F5A-8945-9B3A0C472827).
     *
     * @return the value
     */
    public java.util.List<AuditSpecification> getAuditSpecifications() {
        return auditSpecifications;
    }

    /** Lists the audit policy provisioning conditions for the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditConditions")
    private final java.util.List<AuditConditions> auditConditions;

    /**
     * Lists the audit policy provisioning conditions for the target database.
     *
     * @return the value
     */
    public java.util.List<AuditConditions> getAuditConditions() {
        return auditConditions;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("AuditPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", isDataSafeServiceAccountExcluded=")
                .append(String.valueOf(this.isDataSafeServiceAccountExcluded));
        sb.append(", timeLastProvisioned=").append(String.valueOf(this.timeLastProvisioned));
        sb.append(", timeLastRetrieved=").append(String.valueOf(this.timeLastRetrieved));
        sb.append(", auditSpecifications=").append(String.valueOf(this.auditSpecifications));
        sb.append(", auditConditions=").append(String.valueOf(this.auditConditions));
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
        if (!(o instanceof AuditPolicy)) {
            return false;
        }

        AuditPolicy other = (AuditPolicy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.isDataSafeServiceAccountExcluded,
                        other.isDataSafeServiceAccountExcluded)
                && java.util.Objects.equals(this.timeLastProvisioned, other.timeLastProvisioned)
                && java.util.Objects.equals(this.timeLastRetrieved, other.timeLastRetrieved)
                && java.util.Objects.equals(this.auditSpecifications, other.auditSpecifications)
                && java.util.Objects.equals(this.auditConditions, other.auditConditions)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataSafeServiceAccountExcluded == null
                                ? 43
                                : this.isDataSafeServiceAccountExcluded.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastProvisioned == null
                                ? 43
                                : this.timeLastProvisioned.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastRetrieved == null ? 43 : this.timeLastRetrieved.hashCode());
        result =
                (result * PRIME)
                        + (this.auditSpecifications == null
                                ? 43
                                : this.auditSpecifications.hashCode());
        result =
                (result * PRIME)
                        + (this.auditConditions == null ? 43 : this.auditConditions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
