/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The parameters for creating a sender invitation. <br>
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
        builder = CreateSenderInvitationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSenderInvitationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "recipientTenancyId",
        "recipientEmailAddress",
        "displayName",
        "subjects",
        "freeformTags",
        "definedTags"
    })
    public CreateSenderInvitationDetails(
            String compartmentId,
            String recipientTenancyId,
            String recipientEmailAddress,
            String displayName,
            java.util.List<InvitationSubject> subjects,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.recipientTenancyId = recipientTenancyId;
        this.recipientEmailAddress = recipientEmailAddress;
        this.displayName = displayName;
        this.subjects = subjects;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the sender tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the sender tenancy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of the recipient tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("recipientTenancyId")
        private String recipientTenancyId;

        /**
         * OCID of the recipient tenancy.
         *
         * @param recipientTenancyId the value to set
         * @return this builder
         */
        public Builder recipientTenancyId(String recipientTenancyId) {
            this.recipientTenancyId = recipientTenancyId;
            this.__explicitlySet__.add("recipientTenancyId");
            return this;
        }
        /** Email address of the recipient. */
        @com.fasterxml.jackson.annotation.JsonProperty("recipientEmailAddress")
        private String recipientEmailAddress;

        /**
         * Email address of the recipient.
         *
         * @param recipientEmailAddress the value to set
         * @return this builder
         */
        public Builder recipientEmailAddress(String recipientEmailAddress) {
            this.recipientEmailAddress = recipientEmailAddress;
            this.__explicitlySet__.add("recipientEmailAddress");
            return this;
        }
        /**
         * A user-created name to describe the invitation. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-created name to describe the invitation. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The list of subjects this invitation contains. */
        @com.fasterxml.jackson.annotation.JsonProperty("subjects")
        private java.util.List<InvitationSubject> subjects;

        /**
         * The list of subjects this invitation contains.
         *
         * @param subjects the value to set
         * @return this builder
         */
        public Builder subjects(java.util.List<InvitationSubject> subjects) {
            this.subjects = subjects;
            this.__explicitlySet__.add("subjects");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSenderInvitationDetails build() {
            CreateSenderInvitationDetails model =
                    new CreateSenderInvitationDetails(
                            this.compartmentId,
                            this.recipientTenancyId,
                            this.recipientEmailAddress,
                            this.displayName,
                            this.subjects,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSenderInvitationDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("recipientTenancyId")) {
                this.recipientTenancyId(model.getRecipientTenancyId());
            }
            if (model.wasPropertyExplicitlySet("recipientEmailAddress")) {
                this.recipientEmailAddress(model.getRecipientEmailAddress());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("subjects")) {
                this.subjects(model.getSubjects());
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

    /** OCID of the sender tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the sender tenancy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID of the recipient tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("recipientTenancyId")
    private final String recipientTenancyId;

    /**
     * OCID of the recipient tenancy.
     *
     * @return the value
     */
    public String getRecipientTenancyId() {
        return recipientTenancyId;
    }

    /** Email address of the recipient. */
    @com.fasterxml.jackson.annotation.JsonProperty("recipientEmailAddress")
    private final String recipientEmailAddress;

    /**
     * Email address of the recipient.
     *
     * @return the value
     */
    public String getRecipientEmailAddress() {
        return recipientEmailAddress;
    }

    /** A user-created name to describe the invitation. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-created name to describe the invitation. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The list of subjects this invitation contains. */
    @com.fasterxml.jackson.annotation.JsonProperty("subjects")
    private final java.util.List<InvitationSubject> subjects;

    /**
     * The list of subjects this invitation contains.
     *
     * @return the value
     */
    public java.util.List<InvitationSubject> getSubjects() {
        return subjects;
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
        sb.append("CreateSenderInvitationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", recipientTenancyId=").append(String.valueOf(this.recipientTenancyId));
        sb.append(", recipientEmailAddress=").append(String.valueOf(this.recipientEmailAddress));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", subjects=").append(String.valueOf(this.subjects));
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
        if (!(o instanceof CreateSenderInvitationDetails)) {
            return false;
        }

        CreateSenderInvitationDetails other = (CreateSenderInvitationDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.recipientTenancyId, other.recipientTenancyId)
                && java.util.Objects.equals(this.recipientEmailAddress, other.recipientEmailAddress)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subjects, other.subjects)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.recipientTenancyId == null
                                ? 43
                                : this.recipientTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.recipientEmailAddress == null
                                ? 43
                                : this.recipientEmailAddress.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.subjects == null ? 43 : this.subjects.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
