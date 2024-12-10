/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An asynchronous replica of a block volume that can then be used to create
 * a new block volume or recover a block volume. For more information, see [Overview
 * of Cross-Region Volume Replication](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/volumereplication.htm)
 * To use any of the API operations, you must be authorized in an IAM policy.
 * If you're not authorized, talk to an administrator. If you're an administrator
 * who needs to write policies to give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockVolumeReplica.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlockVolumeReplica extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "lifecycleState",
        "sizeInGBs",
        "timeCreated",
        "timeLastSynced",
        "blockVolumeId",
        "totalDataTransferredInGBs",
        "volumeGroupReplicaId",
        "kmsKeyId"
    })
    public BlockVolumeReplica(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            LifecycleState lifecycleState,
            Long sizeInGBs,
            java.util.Date timeCreated,
            java.util.Date timeLastSynced,
            String blockVolumeId,
            Long totalDataTransferredInGBs,
            String volumeGroupReplicaId,
            String kmsKeyId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.sizeInGBs = sizeInGBs;
        this.timeCreated = timeCreated;
        this.timeLastSynced = timeLastSynced;
        this.blockVolumeId = blockVolumeId;
        this.totalDataTransferredInGBs = totalDataTransferredInGBs;
        this.volumeGroupReplicaId = volumeGroupReplicaId;
        this.kmsKeyId = kmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the block volume replica.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the block volume replica.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the compartment that contains the block volume replica.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the block volume replica.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The block volume replica's Oracle ID (OCID).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The block volume replica's Oracle ID (OCID).
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of a block volume replica.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of a block volume replica.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The size of the source block volume, in GBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The size of the source block volume, in GBs.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         **/
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }
        /**
         * The date and time the block volume replica was created. Format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the block volume replica was created. Format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the block volume replica was last synced from the source block volume.
         * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        /**
         * The date and time the block volume replica was last synced from the source block volume.
         * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeLastSynced the value to set
         * @return this builder
         **/
        public Builder timeLastSynced(java.util.Date timeLastSynced) {
            this.timeLastSynced = timeLastSynced;
            this.__explicitlySet__.add("timeLastSynced");
            return this;
        }
        /**
         * The OCID of the source block volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
        private String blockVolumeId;

        /**
         * The OCID of the source block volume.
         * @param blockVolumeId the value to set
         * @return this builder
         **/
        public Builder blockVolumeId(String blockVolumeId) {
            this.blockVolumeId = blockVolumeId;
            this.__explicitlySet__.add("blockVolumeId");
            return this;
        }
        /**
         * The total size of the data transferred from the source block volume to the block volume replica, in GBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalDataTransferredInGBs")
        private Long totalDataTransferredInGBs;

        /**
         * The total size of the data transferred from the source block volume to the block volume replica, in GBs.
         *
         * @param totalDataTransferredInGBs the value to set
         * @return this builder
         **/
        public Builder totalDataTransferredInGBs(Long totalDataTransferredInGBs) {
            this.totalDataTransferredInGBs = totalDataTransferredInGBs;
            this.__explicitlySet__.add("totalDataTransferredInGBs");
            return this;
        }
        /**
         * The OCID of the volume group replica.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicaId")
        private String volumeGroupReplicaId;

        /**
         * The OCID of the volume group replica.
         *
         * @param volumeGroupReplicaId the value to set
         * @return this builder
         **/
        public Builder volumeGroupReplicaId(String volumeGroupReplicaId) {
            this.volumeGroupReplicaId = volumeGroupReplicaId;
            this.__explicitlySet__.add("volumeGroupReplicaId");
            return this;
        }
        /**
         * The OCID of the Vault service key to assign as the master encryption key for the block volume replica, see
         * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Vault service key to assign as the master encryption key for the block volume replica, see
         * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockVolumeReplica build() {
            BlockVolumeReplica model =
                    new BlockVolumeReplica(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.lifecycleState,
                            this.sizeInGBs,
                            this.timeCreated,
                            this.timeLastSynced,
                            this.blockVolumeId,
                            this.totalDataTransferredInGBs,
                            this.volumeGroupReplicaId,
                            this.kmsKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockVolumeReplica model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
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
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastSynced")) {
                this.timeLastSynced(model.getTimeLastSynced());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeId")) {
                this.blockVolumeId(model.getBlockVolumeId());
            }
            if (model.wasPropertyExplicitlySet("totalDataTransferredInGBs")) {
                this.totalDataTransferredInGBs(model.getTotalDataTransferredInGBs());
            }
            if (model.wasPropertyExplicitlySet("volumeGroupReplicaId")) {
                this.volumeGroupReplicaId(model.getVolumeGroupReplicaId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
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
     * The availability domain of the block volume replica.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the block volume replica.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment that contains the block volume replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the block volume replica.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The block volume replica's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The block volume replica's Oracle ID (OCID).
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The current state of a block volume replica.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Activating("ACTIVATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of a block volume replica.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of a block volume replica.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The size of the source block volume, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The size of the source block volume, in GBs.
     *
     * @return the value
     **/
    public Long getSizeInGBs() {
        return sizeInGBs;
    }

    /**
     * The date and time the block volume replica was created. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the block volume replica was created. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the block volume replica was last synced from the source block volume.
     * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    private final java.util.Date timeLastSynced;

    /**
     * The date and time the block volume replica was last synced from the source block volume.
     * Format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSynced() {
        return timeLastSynced;
    }

    /**
     * The OCID of the source block volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeId")
    private final String blockVolumeId;

    /**
     * The OCID of the source block volume.
     * @return the value
     **/
    public String getBlockVolumeId() {
        return blockVolumeId;
    }

    /**
     * The total size of the data transferred from the source block volume to the block volume replica, in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDataTransferredInGBs")
    private final Long totalDataTransferredInGBs;

    /**
     * The total size of the data transferred from the source block volume to the block volume replica, in GBs.
     *
     * @return the value
     **/
    public Long getTotalDataTransferredInGBs() {
        return totalDataTransferredInGBs;
    }

    /**
     * The OCID of the volume group replica.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicaId")
    private final String volumeGroupReplicaId;

    /**
     * The OCID of the volume group replica.
     *
     * @return the value
     **/
    public String getVolumeGroupReplicaId() {
        return volumeGroupReplicaId;
    }

    /**
     * The OCID of the Vault service key to assign as the master encryption key for the block volume replica, see
     * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Vault service key to assign as the master encryption key for the block volume replica, see
     * [Overview of Vault service](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
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
        sb.append("BlockVolumeReplica(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastSynced=").append(String.valueOf(this.timeLastSynced));
        sb.append(", blockVolumeId=").append(String.valueOf(this.blockVolumeId));
        sb.append(", totalDataTransferredInGBs=")
                .append(String.valueOf(this.totalDataTransferredInGBs));
        sb.append(", volumeGroupReplicaId=").append(String.valueOf(this.volumeGroupReplicaId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockVolumeReplica)) {
            return false;
        }

        BlockVolumeReplica other = (BlockVolumeReplica) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastSynced, other.timeLastSynced)
                && java.util.Objects.equals(this.blockVolumeId, other.blockVolumeId)
                && java.util.Objects.equals(
                        this.totalDataTransferredInGBs, other.totalDataTransferredInGBs)
                && java.util.Objects.equals(this.volumeGroupReplicaId, other.volumeGroupReplicaId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSynced == null ? 43 : this.timeLastSynced.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeId == null ? 43 : this.blockVolumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.totalDataTransferredInGBs == null
                                ? 43
                                : this.totalDataTransferredInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupReplicaId == null
                                ? 43
                                : this.volumeGroupReplicaId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
