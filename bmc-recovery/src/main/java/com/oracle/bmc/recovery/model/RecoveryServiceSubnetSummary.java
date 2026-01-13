/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Each Recovery Service subnet uses a single private endpoint on a subnet of your choice within a
 * VCN. The private endpoint need not be on the same subnet as the Oracle Cloud Database, although,
 * it must be on a subnet that can communicate with the Oracle Cloud Database. To use any of the API
 * operations, you must be authorized in an IAM policy. If you are not authorized, talk to an
 * administrator. If you are an administrator who needs to write policies to give users access, see
 * Getting Started with Policies. For information about access control and compartments, see
 * [Overview of the Identity
 * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecoveryServiceSubnetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecoveryServiceSubnetSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "vcnId",
        "subnetId",
        "subnets",
        "nsgIds",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public RecoveryServiceSubnetSummary(
            String id,
            String displayName,
            String compartmentId,
            String vcnId,
            String subnetId,
            java.util.List<String> subnets,
            java.util.List<String> nsgIds,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.subnets = subnets;
        this.nsgIds = nsgIds;
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
        /** The recovery service subnet OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The recovery service subnet OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-provided name for the recovery service subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-provided name for the recovery service subnet.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The compartment OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID.
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
         * The OCID of the virtual cloud network (VCN) associated with the recovery service subnet.
         * You can create a single recovery service subnet per VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the virtual cloud network (VCN) associated with the recovery service subnet.
         * You can create a single recovery service subnet per VCN.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** Deprecated. One of the subnets associated with the Recovery Service subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Deprecated. One of the subnets associated with the Recovery Service subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** A list of OCIDs of all the subnets associated with the Recovery Service subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnets")
        private java.util.List<String> subnets;

        /**
         * A list of OCIDs of all the subnets associated with the Recovery Service subnet.
         *
         * @param subnets the value to set
         * @return this builder
         */
        public Builder subnets(java.util.List<String> subnets) {
            this.subnets = subnets;
            this.__explicitlySet__.add("subnets");
            return this;
        }
        /**
         * A list of network security group (NSG) OCIDs that are associated with the Recovery
         * Service subnet. You can specify a maximum of 5 unique OCIDs, which implies that you can
         * associate a maximum of 5 NSGs to each Recovery Service subnet. Specify an empty array if
         * you want to remove all the associated NSGs from a Recovery Service subnet. See {@link
         * NetworkSecurityGroup} for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of network security group (NSG) OCIDs that are associated with the Recovery
         * Service subnet. You can specify a maximum of 5 unique OCIDs, which implies that you can
         * associate a maximum of 5 NSGs to each Recovery Service subnet. Specify an empty array if
         * you want to remove all the associated NSGs from a Recovery Service subnet. See {@link
         * NetworkSecurityGroup} for more information.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the last created time for a recovery
         * service subnet. For example: '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An RFC3339 formatted datetime string that indicates the last created time for a recovery
         * service subnet. For example: '2020-05-22T21:10:29.600Z'.
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
         * An RFC3339 formatted datetime string that indicates the last updated time for a recovery
         * service subnet. For example: '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * An RFC3339 formatted datetime string that indicates the last updated time for a recovery
         * service subnet. For example: '2020-05-22T21:10:29.600Z'.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the recovery service subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the recovery service subnet.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Detailed description about the current lifecycle state of the recovery service subnet.
         * For example, it can be used to provide actionable information for a resource in a Failed
         * state
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed description about the current lifecycle state of the recovery service subnet.
         * For example, it can be used to provide actionable information for a resource in a Failed
         * state
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
         * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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

        public RecoveryServiceSubnetSummary build() {
            RecoveryServiceSubnetSummary model =
                    new RecoveryServiceSubnetSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.vcnId,
                            this.subnetId,
                            this.subnets,
                            this.nsgIds,
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
        public Builder copy(RecoveryServiceSubnetSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("subnets")) {
                this.subnets(model.getSubnets());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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

    /** The recovery service subnet OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The recovery service subnet OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-provided name for the recovery service subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-provided name for the recovery service subnet.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The compartment OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the virtual cloud network (VCN) associated with the recovery service subnet. You
     * can create a single recovery service subnet per VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the virtual cloud network (VCN) associated with the recovery service subnet. You
     * can create a single recovery service subnet per VCN.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** Deprecated. One of the subnets associated with the Recovery Service subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Deprecated. One of the subnets associated with the Recovery Service subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** A list of OCIDs of all the subnets associated with the Recovery Service subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnets")
    private final java.util.List<String> subnets;

    /**
     * A list of OCIDs of all the subnets associated with the Recovery Service subnet.
     *
     * @return the value
     */
    public java.util.List<String> getSubnets() {
        return subnets;
    }

    /**
     * A list of network security group (NSG) OCIDs that are associated with the Recovery Service
     * subnet. You can specify a maximum of 5 unique OCIDs, which implies that you can associate a
     * maximum of 5 NSGs to each Recovery Service subnet. Specify an empty array if you want to
     * remove all the associated NSGs from a Recovery Service subnet. See {@link
     * NetworkSecurityGroup} for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of network security group (NSG) OCIDs that are associated with the Recovery Service
     * subnet. You can specify a maximum of 5 unique OCIDs, which implies that you can associate a
     * maximum of 5 NSGs to each Recovery Service subnet. Specify an empty array if you want to
     * remove all the associated NSGs from a Recovery Service subnet. See {@link
     * NetworkSecurityGroup} for more information.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the last created time for a recovery
     * service subnet. For example: '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An RFC3339 formatted datetime string that indicates the last created time for a recovery
     * service subnet. For example: '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the last updated time for a recovery
     * service subnet. For example: '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * An RFC3339 formatted datetime string that indicates the last updated time for a recovery
     * service subnet. For example: '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the recovery service subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the recovery service subnet.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Detailed description about the current lifecycle state of the recovery service subnet. For
     * example, it can be used to provide actionable information for a resource in a Failed state
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed description about the current lifecycle state of the recovery service subnet. For
     * example, it can be used to provide actionable information for a resource in a Failed state
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
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
        sb.append("RecoveryServiceSubnetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", subnets=").append(String.valueOf(this.subnets));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
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
        if (!(o instanceof RecoveryServiceSubnetSummary)) {
            return false;
        }

        RecoveryServiceSubnetSummary other = (RecoveryServiceSubnetSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.subnets, other.subnets)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.subnets == null ? 43 : this.subnets.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
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
