/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVolumeGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVolumeGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "backupPolicyId",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "sourceDetails",
        "volumeGroupReplicas",
        "clusterPlacementGroupId",
        "xrcKmsKeyId"
    })
    public CreateVolumeGroupDetails(
            String availabilityDomain,
            String backupPolicyId,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            VolumeGroupSourceDetails sourceDetails,
            java.util.List<VolumeGroupReplicaDetails> volumeGroupReplicas,
            String clusterPlacementGroupId,
            String xrcKmsKeyId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.backupPolicyId = backupPolicyId;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.sourceDetails = sourceDetails;
        this.volumeGroupReplicas = volumeGroupReplicas;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.xrcKmsKeyId = xrcKmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The availability domain of the volume group. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the volume group.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * If provided, specifies the ID of the volume backup policy to assign to the newly created
         * volume group. If omitted, no policy will be assigned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicyId")
        private String backupPolicyId;

        /**
         * If provided, specifies the ID of the volume backup policy to assign to the newly created
         * volume group. If omitted, no policy will be assigned.
         *
         * @param backupPolicyId the value to set
         * @return this builder
         */
        public Builder backupPolicyId(String backupPolicyId) {
            this.backupPolicyId = backupPolicyId;
            this.__explicitlySet__.add("backupPolicyId");
            return this;
        }
        /** The OCID of the compartment that contains the volume group. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the volume group.
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
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private VolumeGroupSourceDetails sourceDetails;

        public Builder sourceDetails(VolumeGroupSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * The list of volume group replicas that this volume group will be enabled to have in the
         * specified destination availability domains.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicas")
        private java.util.List<VolumeGroupReplicaDetails> volumeGroupReplicas;

        /**
         * The list of volume group replicas that this volume group will be enabled to have in the
         * specified destination availability domains.
         *
         * @param volumeGroupReplicas the value to set
         * @return this builder
         */
        public Builder volumeGroupReplicas(
                java.util.List<VolumeGroupReplicaDetails> volumeGroupReplicas) {
            this.volumeGroupReplicas = volumeGroupReplicas;
            this.__explicitlySet__.add("volumeGroupReplicas");
            return this;
        }
        /** The clusterPlacementGroup Id of the volume group for volume group placement. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The clusterPlacementGroup Id of the volume group for volume group placement.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * The OCID of the Vault service key which is the master encryption key for the volume's
         * cross region backups, which will be used in the destination region to encrypt the
         * backup's encryption keys. For more information about the Vault service and encryption
         * keys, see [Overview of Vault
         * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("xrcKmsKeyId")
        private String xrcKmsKeyId;

        /**
         * The OCID of the Vault service key which is the master encryption key for the volume's
         * cross region backups, which will be used in the destination region to encrypt the
         * backup's encryption keys. For more information about the Vault service and encryption
         * keys, see [Overview of Vault
         * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         * @param xrcKmsKeyId the value to set
         * @return this builder
         */
        public Builder xrcKmsKeyId(String xrcKmsKeyId) {
            this.xrcKmsKeyId = xrcKmsKeyId;
            this.__explicitlySet__.add("xrcKmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVolumeGroupDetails build() {
            CreateVolumeGroupDetails model =
                    new CreateVolumeGroupDetails(
                            this.availabilityDomain,
                            this.backupPolicyId,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.sourceDetails,
                            this.volumeGroupReplicas,
                            this.clusterPlacementGroupId,
                            this.xrcKmsKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVolumeGroupDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("backupPolicyId")) {
                this.backupPolicyId(model.getBackupPolicyId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("volumeGroupReplicas")) {
                this.volumeGroupReplicas(model.getVolumeGroupReplicas());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("xrcKmsKeyId")) {
                this.xrcKmsKeyId(model.getXrcKmsKeyId());
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

    /** The availability domain of the volume group. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the volume group.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * If provided, specifies the ID of the volume backup policy to assign to the newly created
     * volume group. If omitted, no policy will be assigned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicyId")
    private final String backupPolicyId;

    /**
     * If provided, specifies the ID of the volume backup policy to assign to the newly created
     * volume group. If omitted, no policy will be assigned.
     *
     * @return the value
     */
    public String getBackupPolicyId() {
        return backupPolicyId;
    }

    /** The OCID of the compartment that contains the volume group. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the volume group.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final VolumeGroupSourceDetails sourceDetails;

    public VolumeGroupSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * The list of volume group replicas that this volume group will be enabled to have in the
     * specified destination availability domains.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicas")
    private final java.util.List<VolumeGroupReplicaDetails> volumeGroupReplicas;

    /**
     * The list of volume group replicas that this volume group will be enabled to have in the
     * specified destination availability domains.
     *
     * @return the value
     */
    public java.util.List<VolumeGroupReplicaDetails> getVolumeGroupReplicas() {
        return volumeGroupReplicas;
    }

    /** The clusterPlacementGroup Id of the volume group for volume group placement. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The clusterPlacementGroup Id of the volume group for volume group placement.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * The OCID of the Vault service key which is the master encryption key for the volume's cross
     * region backups, which will be used in the destination region to encrypt the backup's
     * encryption keys. For more information about the Vault service and encryption keys, see
     * [Overview of Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xrcKmsKeyId")
    private final String xrcKmsKeyId;

    /**
     * The OCID of the Vault service key which is the master encryption key for the volume's cross
     * region backups, which will be used in the destination region to encrypt the backup's
     * encryption keys. For more information about the Vault service and encryption keys, see
     * [Overview of Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     * @return the value
     */
    public String getXrcKmsKeyId() {
        return xrcKmsKeyId;
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
        sb.append("CreateVolumeGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", backupPolicyId=").append(String.valueOf(this.backupPolicyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", volumeGroupReplicas=").append(String.valueOf(this.volumeGroupReplicas));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", xrcKmsKeyId=").append(String.valueOf(this.xrcKmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVolumeGroupDetails)) {
            return false;
        }

        CreateVolumeGroupDetails other = (CreateVolumeGroupDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.backupPolicyId, other.backupPolicyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.volumeGroupReplicas, other.volumeGroupReplicas)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.xrcKmsKeyId, other.xrcKmsKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.backupPolicyId == null ? 43 : this.backupPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupReplicas == null
                                ? 43
                                : this.volumeGroupReplicas.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result = (result * PRIME) + (this.xrcKmsKeyId == null ? 43 : this.xrcKmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
