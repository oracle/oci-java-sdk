/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * While creating the Delegation Control, specify how Service Provider Actions are approved and the users who have the privilege of approving the Service Provider Actions associated with the Delegation Control.
 * <p>
 * You must specify which Service Provider Actions must be pre-approved. The rest of the Service Provider Actions associated with the Delegation Control will require an explicit approval from the users selected either through the approver groups or individually.
 * <p>
 * You must name your Delegation Control appropriately so it reflects the resources that will be governed by the Delegation Control. Neither the Delegation Controls nor their assignments to resources are visible to the support operators.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDelegationControlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDelegationControlDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "numApprovalsRequired",
        "preApprovedServiceProviderActionNames",
        "delegationSubscriptionIds",
        "isAutoApproveDuringMaintenance",
        "resourceIds",
        "resourceType",
        "notificationTopicId",
        "notificationMessageFormat",
        "vaultId",
        "vaultKeyId",
        "freeformTags",
        "definedTags"
    })
    public CreateDelegationControlDetails(
            String compartmentId,
            String displayName,
            String description,
            Integer numApprovalsRequired,
            java.util.List<String> preApprovedServiceProviderActionNames,
            java.util.List<String> delegationSubscriptionIds,
            Boolean isAutoApproveDuringMaintenance,
            java.util.List<String> resourceIds,
            DelegationControlResourceType resourceType,
            String notificationTopicId,
            DelegationControl.NotificationMessageFormat notificationMessageFormat,
            String vaultId,
            String vaultKeyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.numApprovalsRequired = numApprovalsRequired;
        this.preApprovedServiceProviderActionNames = preApprovedServiceProviderActionNames;
        this.delegationSubscriptionIds = delegationSubscriptionIds;
        this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
        this.resourceIds = resourceIds;
        this.resourceType = resourceType;
        this.notificationTopicId = notificationTopicId;
        this.notificationMessageFormat = notificationMessageFormat;
        this.vaultId = vaultId;
        this.vaultKeyId = vaultKeyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment that contains this Delegation Control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this Delegation Control.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Name of the Delegation Control. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the Delegation Control. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description of the Delegation Control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Delegation Control.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * number of approvals required.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numApprovalsRequired")
        private Integer numApprovalsRequired;

        /**
         * number of approvals required.
         * @param numApprovalsRequired the value to set
         * @return this builder
         **/
        public Builder numApprovalsRequired(Integer numApprovalsRequired) {
            this.numApprovalsRequired = numApprovalsRequired;
            this.__explicitlySet__.add("numApprovalsRequired");
            return this;
        }
        /**
         * List of pre-approved Service Provider Action names. The list of pre-defined Service Provider Actions can be obtained from the ListServiceProviderActions API. Delegated Resource Access Requests associated with a resource governed by this Delegation Control will be
         * automatically approved if the Delegated Resource Access Request only contain Service Provider Actions in the pre-approved list.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preApprovedServiceProviderActionNames")
        private java.util.List<String> preApprovedServiceProviderActionNames;

        /**
         * List of pre-approved Service Provider Action names. The list of pre-defined Service Provider Actions can be obtained from the ListServiceProviderActions API. Delegated Resource Access Requests associated with a resource governed by this Delegation Control will be
         * automatically approved if the Delegated Resource Access Request only contain Service Provider Actions in the pre-approved list.
         *
         * @param preApprovedServiceProviderActionNames the value to set
         * @return this builder
         **/
        public Builder preApprovedServiceProviderActionNames(
                java.util.List<String> preApprovedServiceProviderActionNames) {
            this.preApprovedServiceProviderActionNames = preApprovedServiceProviderActionNames;
            this.__explicitlySet__.add("preApprovedServiceProviderActionNames");
            return this;
        }
        /**
         * List of Delegation Subscription OCID that are allowed for this Delegation Control. The allowed subscriptions will determine the available Service Provider Actions. Only support operators for the allowed subscriptions are allowed to create Delegated Resource Access Request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("delegationSubscriptionIds")
        private java.util.List<String> delegationSubscriptionIds;

        /**
         * List of Delegation Subscription OCID that are allowed for this Delegation Control. The allowed subscriptions will determine the available Service Provider Actions. Only support operators for the allowed subscriptions are allowed to create Delegated Resource Access Request.
         * @param delegationSubscriptionIds the value to set
         * @return this builder
         **/
        public Builder delegationSubscriptionIds(java.util.List<String> delegationSubscriptionIds) {
            this.delegationSubscriptionIds = delegationSubscriptionIds;
            this.__explicitlySet__.add("delegationSubscriptionIds");
            return this;
        }
        /**
         * Set to true to allow all Delegated Resource Access Request to be approved automatically during maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
        private Boolean isAutoApproveDuringMaintenance;

        /**
         * Set to true to allow all Delegated Resource Access Request to be approved automatically during maintenance.
         * @param isAutoApproveDuringMaintenance the value to set
         * @return this builder
         **/
        public Builder isAutoApproveDuringMaintenance(Boolean isAutoApproveDuringMaintenance) {
            this.isAutoApproveDuringMaintenance = isAutoApproveDuringMaintenance;
            this.__explicitlySet__.add("isAutoApproveDuringMaintenance");
            return this;
        }
        /**
         * The OCID of the selected resources that this Delegation Control is applicable to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
        private java.util.List<String> resourceIds;

        /**
         * The OCID of the selected resources that this Delegation Control is applicable to.
         * @param resourceIds the value to set
         * @return this builder
         **/
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            this.__explicitlySet__.add("resourceIds");
            return this;
        }
        /**
         * Resource type for which the Delegation Control is applicable to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private DelegationControlResourceType resourceType;

        /**
         * Resource type for which the Delegation Control is applicable to.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(DelegationControlResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The OCID of the OCI Notification topic to publish messages related to this Delegation Control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * The OCID of the OCI Notification topic to publish messages related to this Delegation Control.
         * @param notificationTopicId the value to set
         * @return this builder
         **/
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }
        /**
         * The format of the OCI Notification messages for this Delegation Control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationMessageFormat")
        private DelegationControl.NotificationMessageFormat notificationMessageFormat;

        /**
         * The format of the OCI Notification messages for this Delegation Control.
         * @param notificationMessageFormat the value to set
         * @return this builder
         **/
        public Builder notificationMessageFormat(
                DelegationControl.NotificationMessageFormat notificationMessageFormat) {
            this.notificationMessageFormat = notificationMessageFormat;
            this.__explicitlySet__.add("notificationMessageFormat");
            return this;
        }
        /**
         * The OCID of the OCI Vault that will store the secrets containing the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER. Delegate Access Control Service will generate the SSH keys and store them as secrets in the OCI Vault.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the OCI Vault that will store the secrets containing the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER. Delegate Access Control Service will generate the SSH keys and store them as secrets in the OCI Vault.
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The OCID of the Master Encryption Key in the OCI Vault specified by vaultId. This key will be used to encrypt the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultKeyId")
        private String vaultKeyId;

        /**
         * The OCID of the Master Encryption Key in the OCI Vault specified by vaultId. This key will be used to encrypt the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER.
         * @param vaultKeyId the value to set
         * @return this builder
         **/
        public Builder vaultKeyId(String vaultKeyId) {
            this.vaultKeyId = vaultKeyId;
            this.__explicitlySet__.add("vaultKeyId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
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
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDelegationControlDetails build() {
            CreateDelegationControlDetails model =
                    new CreateDelegationControlDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.numApprovalsRequired,
                            this.preApprovedServiceProviderActionNames,
                            this.delegationSubscriptionIds,
                            this.isAutoApproveDuringMaintenance,
                            this.resourceIds,
                            this.resourceType,
                            this.notificationTopicId,
                            this.notificationMessageFormat,
                            this.vaultId,
                            this.vaultKeyId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDelegationControlDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("numApprovalsRequired")) {
                this.numApprovalsRequired(model.getNumApprovalsRequired());
            }
            if (model.wasPropertyExplicitlySet("preApprovedServiceProviderActionNames")) {
                this.preApprovedServiceProviderActionNames(
                        model.getPreApprovedServiceProviderActionNames());
            }
            if (model.wasPropertyExplicitlySet("delegationSubscriptionIds")) {
                this.delegationSubscriptionIds(model.getDelegationSubscriptionIds());
            }
            if (model.wasPropertyExplicitlySet("isAutoApproveDuringMaintenance")) {
                this.isAutoApproveDuringMaintenance(model.getIsAutoApproveDuringMaintenance());
            }
            if (model.wasPropertyExplicitlySet("resourceIds")) {
                this.resourceIds(model.getResourceIds());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("notificationMessageFormat")) {
                this.notificationMessageFormat(model.getNotificationMessageFormat());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("vaultKeyId")) {
                this.vaultKeyId(model.getVaultKeyId());
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
     * The OCID of the compartment that contains this Delegation Control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this Delegation Control.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Name of the Delegation Control. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the Delegation Control. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the Delegation Control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Delegation Control.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * number of approvals required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numApprovalsRequired")
    private final Integer numApprovalsRequired;

    /**
     * number of approvals required.
     * @return the value
     **/
    public Integer getNumApprovalsRequired() {
        return numApprovalsRequired;
    }

    /**
     * List of pre-approved Service Provider Action names. The list of pre-defined Service Provider Actions can be obtained from the ListServiceProviderActions API. Delegated Resource Access Requests associated with a resource governed by this Delegation Control will be
     * automatically approved if the Delegated Resource Access Request only contain Service Provider Actions in the pre-approved list.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preApprovedServiceProviderActionNames")
    private final java.util.List<String> preApprovedServiceProviderActionNames;

    /**
     * List of pre-approved Service Provider Action names. The list of pre-defined Service Provider Actions can be obtained from the ListServiceProviderActions API. Delegated Resource Access Requests associated with a resource governed by this Delegation Control will be
     * automatically approved if the Delegated Resource Access Request only contain Service Provider Actions in the pre-approved list.
     *
     * @return the value
     **/
    public java.util.List<String> getPreApprovedServiceProviderActionNames() {
        return preApprovedServiceProviderActionNames;
    }

    /**
     * List of Delegation Subscription OCID that are allowed for this Delegation Control. The allowed subscriptions will determine the available Service Provider Actions. Only support operators for the allowed subscriptions are allowed to create Delegated Resource Access Request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("delegationSubscriptionIds")
    private final java.util.List<String> delegationSubscriptionIds;

    /**
     * List of Delegation Subscription OCID that are allowed for this Delegation Control. The allowed subscriptions will determine the available Service Provider Actions. Only support operators for the allowed subscriptions are allowed to create Delegated Resource Access Request.
     * @return the value
     **/
    public java.util.List<String> getDelegationSubscriptionIds() {
        return delegationSubscriptionIds;
    }

    /**
     * Set to true to allow all Delegated Resource Access Request to be approved automatically during maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproveDuringMaintenance")
    private final Boolean isAutoApproveDuringMaintenance;

    /**
     * Set to true to allow all Delegated Resource Access Request to be approved automatically during maintenance.
     * @return the value
     **/
    public Boolean getIsAutoApproveDuringMaintenance() {
        return isAutoApproveDuringMaintenance;
    }

    /**
     * The OCID of the selected resources that this Delegation Control is applicable to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
    private final java.util.List<String> resourceIds;

    /**
     * The OCID of the selected resources that this Delegation Control is applicable to.
     * @return the value
     **/
    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * Resource type for which the Delegation Control is applicable to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final DelegationControlResourceType resourceType;

    /**
     * Resource type for which the Delegation Control is applicable to.
     * @return the value
     **/
    public DelegationControlResourceType getResourceType() {
        return resourceType;
    }

    /**
     * The OCID of the OCI Notification topic to publish messages related to this Delegation Control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * The OCID of the OCI Notification topic to publish messages related to this Delegation Control.
     * @return the value
     **/
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    /**
     * The format of the OCI Notification messages for this Delegation Control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationMessageFormat")
    private final DelegationControl.NotificationMessageFormat notificationMessageFormat;

    /**
     * The format of the OCI Notification messages for this Delegation Control.
     * @return the value
     **/
    public DelegationControl.NotificationMessageFormat getNotificationMessageFormat() {
        return notificationMessageFormat;
    }

    /**
     * The OCID of the OCI Vault that will store the secrets containing the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER. Delegate Access Control Service will generate the SSH keys and store them as secrets in the OCI Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the OCI Vault that will store the secrets containing the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER. Delegate Access Control Service will generate the SSH keys and store them as secrets in the OCI Vault.
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The OCID of the Master Encryption Key in the OCI Vault specified by vaultId. This key will be used to encrypt the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultKeyId")
    private final String vaultKeyId;

    /**
     * The OCID of the Master Encryption Key in the OCI Vault specified by vaultId. This key will be used to encrypt the SSH keys to access the resource governed by this Delegation Control by Delegate Access Control Service. This property is required when resourceType is CLOUDVMCLUSTER.
     * @return the value
     **/
    public String getVaultKeyId() {
        return vaultKeyId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDelegationControlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", numApprovalsRequired=").append(String.valueOf(this.numApprovalsRequired));
        sb.append(", preApprovedServiceProviderActionNames=")
                .append(String.valueOf(this.preApprovedServiceProviderActionNames));
        sb.append(", delegationSubscriptionIds=")
                .append(String.valueOf(this.delegationSubscriptionIds));
        sb.append(", isAutoApproveDuringMaintenance=")
                .append(String.valueOf(this.isAutoApproveDuringMaintenance));
        sb.append(", resourceIds=").append(String.valueOf(this.resourceIds));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", notificationMessageFormat=")
                .append(String.valueOf(this.notificationMessageFormat));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", vaultKeyId=").append(String.valueOf(this.vaultKeyId));
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
        if (!(o instanceof CreateDelegationControlDetails)) {
            return false;
        }

        CreateDelegationControlDetails other = (CreateDelegationControlDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.numApprovalsRequired, other.numApprovalsRequired)
                && java.util.Objects.equals(
                        this.preApprovedServiceProviderActionNames,
                        other.preApprovedServiceProviderActionNames)
                && java.util.Objects.equals(
                        this.delegationSubscriptionIds, other.delegationSubscriptionIds)
                && java.util.Objects.equals(
                        this.isAutoApproveDuringMaintenance, other.isAutoApproveDuringMaintenance)
                && java.util.Objects.equals(this.resourceIds, other.resourceIds)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(
                        this.notificationMessageFormat, other.notificationMessageFormat)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.vaultKeyId, other.vaultKeyId)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.numApprovalsRequired == null
                                ? 43
                                : this.numApprovalsRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.preApprovedServiceProviderActionNames == null
                                ? 43
                                : this.preApprovedServiceProviderActionNames.hashCode());
        result =
                (result * PRIME)
                        + (this.delegationSubscriptionIds == null
                                ? 43
                                : this.delegationSubscriptionIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproveDuringMaintenance == null
                                ? 43
                                : this.isAutoApproveDuringMaintenance.hashCode());
        result = (result * PRIME) + (this.resourceIds == null ? 43 : this.resourceIds.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationMessageFormat == null
                                ? 43
                                : this.notificationMessageFormat.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.vaultKeyId == null ? 43 : this.vaultKeyId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
