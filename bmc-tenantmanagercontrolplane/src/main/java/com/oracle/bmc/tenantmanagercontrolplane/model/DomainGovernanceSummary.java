/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The summary of a domain govenance entity owned by a tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DomainGovernanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DomainGovernanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "ownerId",
        "domainId",
        "lifecycleState",
        "isGovernanceEnabled",
        "subscriptionEmail",
        "onsTopicId",
        "onsSubscriptionId",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DomainGovernanceSummary(
            String id,
            String ownerId,
            String domainId,
            DomainGovernance.LifecycleState lifecycleState,
            Boolean isGovernanceEnabled,
            String subscriptionEmail,
            String onsTopicId,
            String onsSubscriptionId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.ownerId = ownerId;
        this.domainId = domainId;
        this.lifecycleState = lifecycleState;
        this.isGovernanceEnabled = isGovernanceEnabled;
        this.subscriptionEmail = subscriptionEmail;
        this.onsTopicId = onsTopicId;
        this.onsSubscriptionId = onsSubscriptionId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the domain governance entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the domain governance entity.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the tenancy that owns this domain governance entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("ownerId")
        private String ownerId;

        /**
         * The OCID of the tenancy that owns this domain governance entity.
         *
         * @param ownerId the value to set
         * @return this builder
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            this.__explicitlySet__.add("ownerId");
            return this;
        }
        /** The OCID of the domain associated with this domain governance entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        /**
         * The OCID of the domain associated with this domain governance entity.
         *
         * @param domainId the value to set
         * @return this builder
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }
        /** The lifecycle state of the domain governance entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DomainGovernance.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the domain governance entity.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(DomainGovernance.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Indicates whether governance is enabled for this domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGovernanceEnabled")
        private Boolean isGovernanceEnabled;

        /**
         * Indicates whether governance is enabled for this domain.
         *
         * @param isGovernanceEnabled the value to set
         * @return this builder
         */
        public Builder isGovernanceEnabled(Boolean isGovernanceEnabled) {
            this.isGovernanceEnabled = isGovernanceEnabled;
            this.__explicitlySet__.add("isGovernanceEnabled");
            return this;
        }
        /**
         * Email address to be used to notify the user, and that the ONS subscription will be
         * created with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionEmail")
        private String subscriptionEmail;

        /**
         * Email address to be used to notify the user, and that the ONS subscription will be
         * created with.
         *
         * @param subscriptionEmail the value to set
         * @return this builder
         */
        public Builder subscriptionEmail(String subscriptionEmail) {
            this.subscriptionEmail = subscriptionEmail;
            this.__explicitlySet__.add("subscriptionEmail");
            return this;
        }
        /** The ONS topic associated with this domain governance entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
        private String onsTopicId;

        /**
         * The ONS topic associated with this domain governance entity.
         *
         * @param onsTopicId the value to set
         * @return this builder
         */
        public Builder onsTopicId(String onsTopicId) {
            this.onsTopicId = onsTopicId;
            this.__explicitlySet__.add("onsTopicId");
            return this;
        }
        /** The ONS subscription associated with this domain governance entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("onsSubscriptionId")
        private String onsSubscriptionId;

        /**
         * The ONS subscription associated with this domain governance entity.
         *
         * @param onsSubscriptionId the value to set
         * @return this builder
         */
        public Builder onsSubscriptionId(String onsSubscriptionId) {
            this.onsSubscriptionId = onsSubscriptionId;
            this.__explicitlySet__.add("onsSubscriptionId");
            return this;
        }
        /**
         * Date-time when this domain governance was created. An RFC 3339-formatted date and time
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date-time when this domain governance was created. An RFC 3339-formatted date and time
         * string.
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
         * Date-time when this domain governance was last updated. An RFC 3339-formatted date and
         * time string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date-time when this domain governance was last updated. An RFC 3339-formatted date and
         * time string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        public DomainGovernanceSummary build() {
            DomainGovernanceSummary model =
                    new DomainGovernanceSummary(
                            this.id,
                            this.ownerId,
                            this.domainId,
                            this.lifecycleState,
                            this.isGovernanceEnabled,
                            this.subscriptionEmail,
                            this.onsTopicId,
                            this.onsSubscriptionId,
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
        public Builder copy(DomainGovernanceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ownerId")) {
                this.ownerId(model.getOwnerId());
            }
            if (model.wasPropertyExplicitlySet("domainId")) {
                this.domainId(model.getDomainId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isGovernanceEnabled")) {
                this.isGovernanceEnabled(model.getIsGovernanceEnabled());
            }
            if (model.wasPropertyExplicitlySet("subscriptionEmail")) {
                this.subscriptionEmail(model.getSubscriptionEmail());
            }
            if (model.wasPropertyExplicitlySet("onsTopicId")) {
                this.onsTopicId(model.getOnsTopicId());
            }
            if (model.wasPropertyExplicitlySet("onsSubscriptionId")) {
                this.onsSubscriptionId(model.getOnsSubscriptionId());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the domain governance entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the domain governance entity.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the tenancy that owns this domain governance entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("ownerId")
    private final String ownerId;

    /**
     * The OCID of the tenancy that owns this domain governance entity.
     *
     * @return the value
     */
    public String getOwnerId() {
        return ownerId;
    }

    /** The OCID of the domain associated with this domain governance entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

    /**
     * The OCID of the domain associated with this domain governance entity.
     *
     * @return the value
     */
    public String getDomainId() {
        return domainId;
    }

    /** The lifecycle state of the domain governance entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DomainGovernance.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the domain governance entity.
     *
     * @return the value
     */
    public DomainGovernance.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Indicates whether governance is enabled for this domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGovernanceEnabled")
    private final Boolean isGovernanceEnabled;

    /**
     * Indicates whether governance is enabled for this domain.
     *
     * @return the value
     */
    public Boolean getIsGovernanceEnabled() {
        return isGovernanceEnabled;
    }

    /**
     * Email address to be used to notify the user, and that the ONS subscription will be created
     * with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionEmail")
    private final String subscriptionEmail;

    /**
     * Email address to be used to notify the user, and that the ONS subscription will be created
     * with.
     *
     * @return the value
     */
    public String getSubscriptionEmail() {
        return subscriptionEmail;
    }

    /** The ONS topic associated with this domain governance entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
    private final String onsTopicId;

    /**
     * The ONS topic associated with this domain governance entity.
     *
     * @return the value
     */
    public String getOnsTopicId() {
        return onsTopicId;
    }

    /** The ONS subscription associated with this domain governance entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("onsSubscriptionId")
    private final String onsSubscriptionId;

    /**
     * The ONS subscription associated with this domain governance entity.
     *
     * @return the value
     */
    public String getOnsSubscriptionId() {
        return onsSubscriptionId;
    }

    /**
     * Date-time when this domain governance was created. An RFC 3339-formatted date and time
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date-time when this domain governance was created. An RFC 3339-formatted date and time
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date-time when this domain governance was last updated. An RFC 3339-formatted date and time
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date-time when this domain governance was last updated. An RFC 3339-formatted date and time
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DomainGovernanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", ownerId=").append(String.valueOf(this.ownerId));
        sb.append(", domainId=").append(String.valueOf(this.domainId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isGovernanceEnabled=").append(String.valueOf(this.isGovernanceEnabled));
        sb.append(", subscriptionEmail=").append(String.valueOf(this.subscriptionEmail));
        sb.append(", onsTopicId=").append(String.valueOf(this.onsTopicId));
        sb.append(", onsSubscriptionId=").append(String.valueOf(this.onsSubscriptionId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof DomainGovernanceSummary)) {
            return false;
        }

        DomainGovernanceSummary other = (DomainGovernanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ownerId, other.ownerId)
                && java.util.Objects.equals(this.domainId, other.domainId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isGovernanceEnabled, other.isGovernanceEnabled)
                && java.util.Objects.equals(this.subscriptionEmail, other.subscriptionEmail)
                && java.util.Objects.equals(this.onsTopicId, other.onsTopicId)
                && java.util.Objects.equals(this.onsSubscriptionId, other.onsSubscriptionId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result = (result * PRIME) + (this.ownerId == null ? 43 : this.ownerId.hashCode());
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isGovernanceEnabled == null
                                ? 43
                                : this.isGovernanceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionEmail == null ? 43 : this.subscriptionEmail.hashCode());
        result = (result * PRIME) + (this.onsTopicId == null ? 43 : this.onsTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.onsSubscriptionId == null ? 43 : this.onsSubscriptionId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
