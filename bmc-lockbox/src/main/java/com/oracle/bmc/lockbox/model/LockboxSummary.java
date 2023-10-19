/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * Summary of the Lockbox. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LockboxSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LockboxSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "lockboxPartner",
        "compartmentId",
        "partnerId",
        "partnerCompartmentId",
        "resourceId",
        "approvalTemplateId",
        "maxAccessDuration",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public LockboxSummary(
            String id,
            String displayName,
            LockboxPartner lockboxPartner,
            String compartmentId,
            String partnerId,
            String partnerCompartmentId,
            String resourceId,
            String approvalTemplateId,
            String maxAccessDuration,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Lockbox.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.lockboxPartner = lockboxPartner;
        this.compartmentId = compartmentId;
        this.partnerId = partnerId;
        this.partnerCompartmentId = partnerCompartmentId;
        this.resourceId = resourceId;
        this.approvalTemplateId = approvalTemplateId;
        this.maxAccessDuration = maxAccessDuration;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Lockbox Identifier, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Lockbox Identifier, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The partner using this lockbox to lock a resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lockboxPartner")
        private LockboxPartner lockboxPartner;

        /**
         * The partner using this lockbox to lock a resource.
         *
         * @param lockboxPartner the value to set
         * @return this builder
         */
        public Builder lockboxPartner(LockboxPartner lockboxPartner) {
            this.lockboxPartner = lockboxPartner;
            this.__explicitlySet__.add("lockboxPartner");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
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
         * The unique identifier (OCID) of partner resource using this lockbox to lock a resource
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerId")
        private String partnerId;

        /**
         * The unique identifier (OCID) of partner resource using this lockbox to lock a resource
         *
         * @param partnerId the value to set
         * @return this builder
         */
        public Builder partnerId(String partnerId) {
            this.partnerId = partnerId;
            this.__explicitlySet__.add("partnerId");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerCompartmentId")
        private String partnerCompartmentId;

        /**
         * Compartment Identifier
         *
         * @param partnerCompartmentId the value to set
         * @return this builder
         */
        public Builder partnerCompartmentId(String partnerCompartmentId) {
            this.partnerCompartmentId = partnerCompartmentId;
            this.__explicitlySet__.add("partnerCompartmentId");
            return this;
        }
        /** The unique identifier (OCID) of associated resource that the lockbox is created for. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The unique identifier (OCID) of associated resource that the lockbox is created for.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Approval template ID */
        @com.fasterxml.jackson.annotation.JsonProperty("approvalTemplateId")
        private String approvalTemplateId;

        /**
         * Approval template ID
         *
         * @param approvalTemplateId the value to set
         * @return this builder
         */
        public Builder approvalTemplateId(String approvalTemplateId) {
            this.approvalTemplateId = approvalTemplateId;
            this.__explicitlySet__.add("approvalTemplateId");
            return this;
        }
        /** The maximum amount of time operator has access to associated resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAccessDuration")
        private String maxAccessDuration;

        /**
         * The maximum amount of time operator has access to associated resources.
         *
         * @param maxAccessDuration the value to set
         * @return this builder
         */
        public Builder maxAccessDuration(String maxAccessDuration) {
            this.maxAccessDuration = maxAccessDuration;
            this.__explicitlySet__.add("maxAccessDuration");
            return this;
        }
        /** The time the the Lockbox was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Lockbox was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Lockbox was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Lockbox was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Lockbox. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Lockbox.LifecycleState lifecycleState;

        /**
         * The current state of the Lockbox.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Lockbox.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
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
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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

        public LockboxSummary build() {
            LockboxSummary model =
                    new LockboxSummary(
                            this.id,
                            this.displayName,
                            this.lockboxPartner,
                            this.compartmentId,
                            this.partnerId,
                            this.partnerCompartmentId,
                            this.resourceId,
                            this.approvalTemplateId,
                            this.maxAccessDuration,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LockboxSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lockboxPartner")) {
                this.lockboxPartner(model.getLockboxPartner());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("partnerId")) {
                this.partnerId(model.getPartnerId());
            }
            if (model.wasPropertyExplicitlySet("partnerCompartmentId")) {
                this.partnerCompartmentId(model.getPartnerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("approvalTemplateId")) {
                this.approvalTemplateId(model.getApprovalTemplateId());
            }
            if (model.wasPropertyExplicitlySet("maxAccessDuration")) {
                this.maxAccessDuration(model.getMaxAccessDuration());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Lockbox Identifier, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Lockbox Identifier, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The partner using this lockbox to lock a resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lockboxPartner")
    private final LockboxPartner lockboxPartner;

    /**
     * The partner using this lockbox to lock a resource.
     *
     * @return the value
     */
    public LockboxPartner getLockboxPartner() {
        return lockboxPartner;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique identifier (OCID) of partner resource using this lockbox to lock a resource */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerId")
    private final String partnerId;

    /**
     * The unique identifier (OCID) of partner resource using this lockbox to lock a resource
     *
     * @return the value
     */
    public String getPartnerId() {
        return partnerId;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerCompartmentId")
    private final String partnerCompartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getPartnerCompartmentId() {
        return partnerCompartmentId;
    }

    /** The unique identifier (OCID) of associated resource that the lockbox is created for. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The unique identifier (OCID) of associated resource that the lockbox is created for.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Approval template ID */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalTemplateId")
    private final String approvalTemplateId;

    /**
     * Approval template ID
     *
     * @return the value
     */
    public String getApprovalTemplateId() {
        return approvalTemplateId;
    }

    /** The maximum amount of time operator has access to associated resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAccessDuration")
    private final String maxAccessDuration;

    /**
     * The maximum amount of time operator has access to associated resources.
     *
     * @return the value
     */
    public String getMaxAccessDuration() {
        return maxAccessDuration;
    }

    /** The time the the Lockbox was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Lockbox was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Lockbox was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Lockbox was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Lockbox. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Lockbox.LifecycleState lifecycleState;

    /**
     * The current state of the Lockbox.
     *
     * @return the value
     */
    public Lockbox.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
        sb.append("LockboxSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lockboxPartner=").append(String.valueOf(this.lockboxPartner));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", partnerId=").append(String.valueOf(this.partnerId));
        sb.append(", partnerCompartmentId=").append(String.valueOf(this.partnerCompartmentId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", approvalTemplateId=").append(String.valueOf(this.approvalTemplateId));
        sb.append(", maxAccessDuration=").append(String.valueOf(this.maxAccessDuration));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof LockboxSummary)) {
            return false;
        }

        LockboxSummary other = (LockboxSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lockboxPartner, other.lockboxPartner)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.partnerId, other.partnerId)
                && java.util.Objects.equals(this.partnerCompartmentId, other.partnerCompartmentId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.approvalTemplateId, other.approvalTemplateId)
                && java.util.Objects.equals(this.maxAccessDuration, other.maxAccessDuration)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result =
                (result * PRIME)
                        + (this.lockboxPartner == null ? 43 : this.lockboxPartner.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.partnerId == null ? 43 : this.partnerId.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerCompartmentId == null
                                ? 43
                                : this.partnerCompartmentId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.approvalTemplateId == null
                                ? 43
                                : this.approvalTemplateId.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAccessDuration == null ? 43 : this.maxAccessDuration.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
