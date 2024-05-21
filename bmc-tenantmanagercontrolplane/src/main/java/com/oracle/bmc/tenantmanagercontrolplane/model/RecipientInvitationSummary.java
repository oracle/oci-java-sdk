/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The summary of the invitation model that the recipient owns.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecipientInvitationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecipientInvitationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "subjects",
        "senderInvitationId",
        "senderTenancyId",
        "lifecycleState",
        "status",
        "timeCreated",
        "timeUpdated",
        "recipientEmailAddress",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public RecipientInvitationSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.List<InvitationSubject> subjects,
            String senderInvitationId,
            String senderTenancyId,
            LifecycleState lifecycleState,
            RecipientInvitationStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String recipientEmailAddress,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.subjects = subjects;
        this.senderInvitationId = senderInvitationId;
        this.senderTenancyId = senderTenancyId;
        this.lifecycleState = lifecycleState;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.recipientEmailAddress = recipientEmailAddress;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the recipient invitation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the recipient invitation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the recipient tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the recipient tenancy.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-created name to describe the invitation. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-created name to describe the invitation. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The list of subjects the invitation contains.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subjects")
        private java.util.List<InvitationSubject> subjects;

        /**
         * The list of subjects the invitation contains.
         * @param subjects the value to set
         * @return this builder
         **/
        public Builder subjects(java.util.List<InvitationSubject> subjects) {
            this.subjects = subjects;
            this.__explicitlySet__.add("subjects");
            return this;
        }
        /**
         * OCID of the corresponding sender invitation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("senderInvitationId")
        private String senderInvitationId;

        /**
         * OCID of the corresponding sender invitation.
         * @param senderInvitationId the value to set
         * @return this builder
         **/
        public Builder senderInvitationId(String senderInvitationId) {
            this.senderInvitationId = senderInvitationId;
            this.__explicitlySet__.add("senderInvitationId");
            return this;
        }
        /**
         * OCID of the sender tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("senderTenancyId")
        private String senderTenancyId;

        /**
         * OCID of the sender tenancy.
         * @param senderTenancyId the value to set
         * @return this builder
         **/
        public Builder senderTenancyId(String senderTenancyId) {
            this.senderTenancyId = senderTenancyId;
            this.__explicitlySet__.add("senderTenancyId");
            return this;
        }
        /**
         * Lifecycle state of the recipient invitation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the recipient invitation.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Status of the recipient invitation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private RecipientInvitationStatus status;

        /**
         * Status of the recipient invitation.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(RecipientInvitationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Date and time when the recipient invitation was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time when the recipient invitation was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time when the recipient invitation was last updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time when the recipient invitation was last updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Email address of the recipient.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recipientEmailAddress")
        private String recipientEmailAddress;

        /**
         * Email address of the recipient.
         * @param recipientEmailAddress the value to set
         * @return this builder
         **/
        public Builder recipientEmailAddress(String recipientEmailAddress) {
            this.recipientEmailAddress = recipientEmailAddress;
            this.__explicitlySet__.add("recipientEmailAddress");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecipientInvitationSummary build() {
            RecipientInvitationSummary model =
                    new RecipientInvitationSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.subjects,
                            this.senderInvitationId,
                            this.senderTenancyId,
                            this.lifecycleState,
                            this.status,
                            this.timeCreated,
                            this.timeUpdated,
                            this.recipientEmailAddress,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecipientInvitationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("subjects")) {
                this.subjects(model.getSubjects());
            }
            if (model.wasPropertyExplicitlySet("senderInvitationId")) {
                this.senderInvitationId(model.getSenderInvitationId());
            }
            if (model.wasPropertyExplicitlySet("senderTenancyId")) {
                this.senderTenancyId(model.getSenderTenancyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("recipientEmailAddress")) {
                this.recipientEmailAddress(model.getRecipientEmailAddress());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * OCID of the recipient invitation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the recipient invitation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the recipient tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the recipient tenancy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-created name to describe the invitation. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-created name to describe the invitation. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The list of subjects the invitation contains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjects")
    private final java.util.List<InvitationSubject> subjects;

    /**
     * The list of subjects the invitation contains.
     * @return the value
     **/
    public java.util.List<InvitationSubject> getSubjects() {
        return subjects;
    }

    /**
     * OCID of the corresponding sender invitation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("senderInvitationId")
    private final String senderInvitationId;

    /**
     * OCID of the corresponding sender invitation.
     * @return the value
     **/
    public String getSenderInvitationId() {
        return senderInvitationId;
    }

    /**
     * OCID of the sender tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("senderTenancyId")
    private final String senderTenancyId;

    /**
     * OCID of the sender tenancy.
     * @return the value
     **/
    public String getSenderTenancyId() {
        return senderTenancyId;
    }

    /**
     * Lifecycle state of the recipient invitation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the recipient invitation.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Status of the recipient invitation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final RecipientInvitationStatus status;

    /**
     * Status of the recipient invitation.
     * @return the value
     **/
    public RecipientInvitationStatus getStatus() {
        return status;
    }

    /**
     * Date and time when the recipient invitation was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time when the recipient invitation was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time when the recipient invitation was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time when the recipient invitation was last updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Email address of the recipient.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recipientEmailAddress")
    private final String recipientEmailAddress;

    /**
     * Email address of the recipient.
     * @return the value
     **/
    public String getRecipientEmailAddress() {
        return recipientEmailAddress;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecipientInvitationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", subjects=").append(String.valueOf(this.subjects));
        sb.append(", senderInvitationId=").append(String.valueOf(this.senderInvitationId));
        sb.append(", senderTenancyId=").append(String.valueOf(this.senderTenancyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", recipientEmailAddress=").append(String.valueOf(this.recipientEmailAddress));
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
        if (!(o instanceof RecipientInvitationSummary)) {
            return false;
        }

        RecipientInvitationSummary other = (RecipientInvitationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subjects, other.subjects)
                && java.util.Objects.equals(this.senderInvitationId, other.senderInvitationId)
                && java.util.Objects.equals(this.senderTenancyId, other.senderTenancyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.recipientEmailAddress, other.recipientEmailAddress)
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
        result = (result * PRIME) + (this.subjects == null ? 43 : this.subjects.hashCode());
        result =
                (result * PRIME)
                        + (this.senderInvitationId == null
                                ? 43
                                : this.senderInvitationId.hashCode());
        result =
                (result * PRIME)
                        + (this.senderTenancyId == null ? 43 : this.senderTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.recipientEmailAddress == null
                                ? 43
                                : this.recipientEmailAddress.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
