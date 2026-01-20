/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/**
 * The data to update a PrivilegedApiControl. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatePrivilegedApiControlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePrivilegedApiControlDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "resourceType",
        "resources",
        "notificationTopicId",
        "approverGroupIdList",
        "privilegedOperationList",
        "numberOfApprovers",
        "freeformTags",
        "definedTags"
    })
    public UpdatePrivilegedApiControlDetails(
            String displayName,
            String description,
            String resourceType,
            java.util.List<String> resources,
            String notificationTopicId,
            java.util.List<String> approverGroupIdList,
            java.util.List<PrivilegedApiDetails> privilegedOperationList,
            Integer numberOfApprovers,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.resourceType = resourceType;
        this.resources = resources;
        this.notificationTopicId = notificationTopicId;
        this.approverGroupIdList = approverGroupIdList;
        this.privilegedOperationList = privilegedOperationList;
        this.numberOfApprovers = numberOfApprovers;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the privilegedApi control. Needs to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the privilegedApi control. Needs to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the privilegedApi control. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the privilegedApi control.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** resourceType for which the PrivilegedApiControl is applicable */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * resourceType for which the PrivilegedApiControl is applicable
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** contains Resource details */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<String> resources;

        /**
         * contains Resource details
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * The OCID of the OCI Notification topic to publish messages related to this Delegation
         * Control.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The OCID of the OCI Notification topic to publish messages related to this Delegation
         * Control.
         *
         * @param notificationTopicId the value to set
         * @return this builder
         */
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }
        /**
         * List of user IAM group ids who can approve an privilegedApi request associated with a
         * target resource under the governance of this privilegedApi control.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approverGroupIdList")
        private java.util.List<String> approverGroupIdList;

        /**
         * List of user IAM group ids who can approve an privilegedApi request associated with a
         * target resource under the governance of this privilegedApi control.
         *
         * @param approverGroupIdList the value to set
         * @return this builder
         */
        public Builder approverGroupIdList(java.util.List<String> approverGroupIdList) {
            this.approverGroupIdList = approverGroupIdList;
            this.__explicitlySet__.add("approverGroupIdList");
            return this;
        }
        /**
         * List of privileged operator operations. If Privileged API Managment is enabled for a
         * resource it will be validated whether the operation done by the operator is a part of
         * privileged operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegedOperationList")
        private java.util.List<PrivilegedApiDetails> privilegedOperationList;

        /**
         * List of privileged operator operations. If Privileged API Managment is enabled for a
         * resource it will be validated whether the operation done by the operator is a part of
         * privileged operation.
         *
         * @param privilegedOperationList the value to set
         * @return this builder
         */
        public Builder privilegedOperationList(
                java.util.List<PrivilegedApiDetails> privilegedOperationList) {
            this.privilegedOperationList = privilegedOperationList;
            this.__explicitlySet__.add("privilegedOperationList");
            return this;
        }
        /** Number of approvers required to approve an privilegedApi request. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfApprovers")
        private Integer numberOfApprovers;

        /**
         * Number of approvers required to approve an privilegedApi request.
         *
         * @param numberOfApprovers the value to set
         * @return this builder
         */
        public Builder numberOfApprovers(Integer numberOfApprovers) {
            this.numberOfApprovers = numberOfApprovers;
            this.__explicitlySet__.add("numberOfApprovers");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePrivilegedApiControlDetails build() {
            UpdatePrivilegedApiControlDetails model =
                    new UpdatePrivilegedApiControlDetails(
                            this.displayName,
                            this.description,
                            this.resourceType,
                            this.resources,
                            this.notificationTopicId,
                            this.approverGroupIdList,
                            this.privilegedOperationList,
                            this.numberOfApprovers,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivilegedApiControlDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("approverGroupIdList")) {
                this.approverGroupIdList(model.getApproverGroupIdList());
            }
            if (model.wasPropertyExplicitlySet("privilegedOperationList")) {
                this.privilegedOperationList(model.getPrivilegedOperationList());
            }
            if (model.wasPropertyExplicitlySet("numberOfApprovers")) {
                this.numberOfApprovers(model.getNumberOfApprovers());
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

    /** Name of the privilegedApi control. Needs to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the privilegedApi control. Needs to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the privilegedApi control. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the privilegedApi control.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** resourceType for which the PrivilegedApiControl is applicable */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * resourceType for which the PrivilegedApiControl is applicable
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** contains Resource details */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<String> resources;

    /**
     * contains Resource details
     *
     * @return the value
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * The OCID of the OCI Notification topic to publish messages related to this Delegation
     * Control.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The OCID of the OCI Notification topic to publish messages related to this Delegation
     * Control.
     *
     * @return the value
     */
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    /**
     * List of user IAM group ids who can approve an privilegedApi request associated with a target
     * resource under the governance of this privilegedApi control.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approverGroupIdList")
    private final java.util.List<String> approverGroupIdList;

    /**
     * List of user IAM group ids who can approve an privilegedApi request associated with a target
     * resource under the governance of this privilegedApi control.
     *
     * @return the value
     */
    public java.util.List<String> getApproverGroupIdList() {
        return approverGroupIdList;
    }

    /**
     * List of privileged operator operations. If Privileged API Managment is enabled for a resource
     * it will be validated whether the operation done by the operator is a part of privileged
     * operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegedOperationList")
    private final java.util.List<PrivilegedApiDetails> privilegedOperationList;

    /**
     * List of privileged operator operations. If Privileged API Managment is enabled for a resource
     * it will be validated whether the operation done by the operator is a part of privileged
     * operation.
     *
     * @return the value
     */
    public java.util.List<PrivilegedApiDetails> getPrivilegedOperationList() {
        return privilegedOperationList;
    }

    /** Number of approvers required to approve an privilegedApi request. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfApprovers")
    private final Integer numberOfApprovers;

    /**
     * Number of approvers required to approve an privilegedApi request.
     *
     * @return the value
     */
    public Integer getNumberOfApprovers() {
        return numberOfApprovers;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("UpdatePrivilegedApiControlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", approverGroupIdList=").append(String.valueOf(this.approverGroupIdList));
        sb.append(", privilegedOperationList=")
                .append(String.valueOf(this.privilegedOperationList));
        sb.append(", numberOfApprovers=").append(String.valueOf(this.numberOfApprovers));
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
        if (!(o instanceof UpdatePrivilegedApiControlDetails)) {
            return false;
        }

        UpdatePrivilegedApiControlDetails other = (UpdatePrivilegedApiControlDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(this.approverGroupIdList, other.approverGroupIdList)
                && java.util.Objects.equals(
                        this.privilegedOperationList, other.privilegedOperationList)
                && java.util.Objects.equals(this.numberOfApprovers, other.numberOfApprovers)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.approverGroupIdList == null
                                ? 43
                                : this.approverGroupIdList.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegedOperationList == null
                                ? 43
                                : this.privilegedOperationList.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfApprovers == null ? 43 : this.numberOfApprovers.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
