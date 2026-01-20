/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * The information about new Lockbox. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateLockboxDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLockboxDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "resourceId",
        "lockboxPartner",
        "compartmentId",
        "partnerId",
        "partnerCompartmentId",
        "approvalTemplateId",
        "maxAccessDuration",
        "accessContextAttributes",
        "freeformTags",
        "definedTags"
    })
    public CreateLockboxDetails(
            String displayName,
            String resourceId,
            LockboxPartner lockboxPartner,
            String compartmentId,
            String partnerId,
            String partnerCompartmentId,
            String approvalTemplateId,
            String maxAccessDuration,
            AccessContextAttributeCollection accessContextAttributes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.resourceId = resourceId;
        this.lockboxPartner = lockboxPartner;
        this.compartmentId = compartmentId;
        this.partnerId = partnerId;
        this.partnerCompartmentId = partnerCompartmentId;
        this.approvalTemplateId = approvalTemplateId;
        this.maxAccessDuration = maxAccessDuration;
        this.accessContextAttributes = accessContextAttributes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Lockbox Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Lockbox Identifier
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The unique identifier (OCID) of the customer's resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The unique identifier (OCID) of the customer's resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
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
        /** The unique identifier (OCID) of the compartment where the resource is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier (OCID) of the compartment where the resource is located.
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

        @com.fasterxml.jackson.annotation.JsonProperty("accessContextAttributes")
        private AccessContextAttributeCollection accessContextAttributes;

        public Builder accessContextAttributes(
                AccessContextAttributeCollection accessContextAttributes) {
            this.accessContextAttributes = accessContextAttributes;
            this.__explicitlySet__.add("accessContextAttributes");
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

        public CreateLockboxDetails build() {
            CreateLockboxDetails model =
                    new CreateLockboxDetails(
                            this.displayName,
                            this.resourceId,
                            this.lockboxPartner,
                            this.compartmentId,
                            this.partnerId,
                            this.partnerCompartmentId,
                            this.approvalTemplateId,
                            this.maxAccessDuration,
                            this.accessContextAttributes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLockboxDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
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
            if (model.wasPropertyExplicitlySet("approvalTemplateId")) {
                this.approvalTemplateId(model.getApprovalTemplateId());
            }
            if (model.wasPropertyExplicitlySet("maxAccessDuration")) {
                this.maxAccessDuration(model.getMaxAccessDuration());
            }
            if (model.wasPropertyExplicitlySet("accessContextAttributes")) {
                this.accessContextAttributes(model.getAccessContextAttributes());
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

    /** Lockbox Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Lockbox Identifier
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The unique identifier (OCID) of the customer's resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The unique identifier (OCID) of the customer's resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
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

    /** The unique identifier (OCID) of the compartment where the resource is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier (OCID) of the compartment where the resource is located.
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

    @com.fasterxml.jackson.annotation.JsonProperty("accessContextAttributes")
    private final AccessContextAttributeCollection accessContextAttributes;

    public AccessContextAttributeCollection getAccessContextAttributes() {
        return accessContextAttributes;
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
        sb.append("CreateLockboxDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", lockboxPartner=").append(String.valueOf(this.lockboxPartner));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", partnerId=").append(String.valueOf(this.partnerId));
        sb.append(", partnerCompartmentId=").append(String.valueOf(this.partnerCompartmentId));
        sb.append(", approvalTemplateId=").append(String.valueOf(this.approvalTemplateId));
        sb.append(", maxAccessDuration=").append(String.valueOf(this.maxAccessDuration));
        sb.append(", accessContextAttributes=")
                .append(String.valueOf(this.accessContextAttributes));
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
        if (!(o instanceof CreateLockboxDetails)) {
            return false;
        }

        CreateLockboxDetails other = (CreateLockboxDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.lockboxPartner, other.lockboxPartner)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.partnerId, other.partnerId)
                && java.util.Objects.equals(this.partnerCompartmentId, other.partnerCompartmentId)
                && java.util.Objects.equals(this.approvalTemplateId, other.approvalTemplateId)
                && java.util.Objects.equals(this.maxAccessDuration, other.maxAccessDuration)
                && java.util.Objects.equals(
                        this.accessContextAttributes, other.accessContextAttributes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.approvalTemplateId == null
                                ? 43
                                : this.approvalTemplateId.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAccessDuration == null ? 43 : this.maxAccessDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.accessContextAttributes == null
                                ? 43
                                : this.accessContextAttributes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
