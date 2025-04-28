/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A detachable block volume device that allows you to dynamically expand the storage capacity of an
 * instance. For more information, see [Overview of Cloud Volume
 * Storage](https://docs.oracle.com/iaas/Content/Block/Concepts/overview.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Volume.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Volume extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "systemTags",
        "id",
        "isHydrated",
        "kmsKeyId",
        "lifecycleState",
        "vpusPerGB",
        "clusterPlacementGroupId",
        "sizeInGBs",
        "sizeInMBs",
        "sourceDetails",
        "timeCreated",
        "volumeGroupId",
        "isAutoTuneEnabled",
        "autoTunedVpusPerGB",
        "blockVolumeReplicas",
        "autotunePolicies",
        "isReservationsEnabled"
    })
    public Volume(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String id,
            Boolean isHydrated,
            String kmsKeyId,
            LifecycleState lifecycleState,
            Long vpusPerGB,
            String clusterPlacementGroupId,
            Long sizeInGBs,
            Long sizeInMBs,
            VolumeSourceDetails sourceDetails,
            java.util.Date timeCreated,
            String volumeGroupId,
            Boolean isAutoTuneEnabled,
            Long autoTunedVpusPerGB,
            java.util.List<BlockVolumeReplicaInfo> blockVolumeReplicas,
            java.util.List<AutotunePolicy> autotunePolicies,
            Boolean isReservationsEnabled) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
        this.id = id;
        this.isHydrated = isHydrated;
        this.kmsKeyId = kmsKeyId;
        this.lifecycleState = lifecycleState;
        this.vpusPerGB = vpusPerGB;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.sizeInGBs = sizeInGBs;
        this.sizeInMBs = sizeInMBs;
        this.sourceDetails = sourceDetails;
        this.timeCreated = timeCreated;
        this.volumeGroupId = volumeGroupId;
        this.isAutoTuneEnabled = isAutoTuneEnabled;
        this.autoTunedVpusPerGB = autoTunedVpusPerGB;
        this.blockVolumeReplicas = blockVolumeReplicas;
        this.autotunePolicies = autotunePolicies;
        this.isReservationsEnabled = isReservationsEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the volume.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the volume.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The OCID of the compartment that contains the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the volume.
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** The OCID of the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the volume.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Specifies whether the cloned volume's data has finished copying from the source volume or
         * backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
        private Boolean isHydrated;

        /**
         * Specifies whether the cloned volume's data has finished copying from the source volume or
         * backup.
         *
         * @param isHydrated the value to set
         * @return this builder
         */
        public Builder isHydrated(Boolean isHydrated) {
            this.isHydrated = isHydrated;
            this.__explicitlySet__.add("isHydrated");
            return this;
        }
        /** The OCID of the Vault service key which is the master encryption key for the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Vault service key which is the master encryption key for the volume.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /** The current state of a volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of a volume.
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
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options. See [Block Volume
         * Performance
         * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
         * for more information.
         *
         * <p>Allowed values:
         *
         * <p>{@code 0}: Represents Lower Cost option.
         *
         * <p>{@code 10}: Represents Balanced option.
         *
         * <p>{@code 20}: Represents Higher Performance option.
         *
         * <p>{@code 30}-{@code 120}: Represents the Ultra High Performance option.
         *
         * <p>For performance autotune enabled volumes, It would be the Default(Minimum) VPUs/GB.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
        private Long vpusPerGB;

        /**
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options. See [Block Volume
         * Performance
         * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
         * for more information.
         *
         * <p>Allowed values:
         *
         * <p>{@code 0}: Represents Lower Cost option.
         *
         * <p>{@code 10}: Represents Balanced option.
         *
         * <p>{@code 20}: Represents Higher Performance option.
         *
         * <p>{@code 30}-{@code 120}: Represents the Ultra High Performance option.
         *
         * <p>For performance autotune enabled volumes, It would be the Default(Minimum) VPUs/GB.
         *
         * @param vpusPerGB the value to set
         * @return this builder
         */
        public Builder vpusPerGB(Long vpusPerGB) {
            this.vpusPerGB = vpusPerGB;
            this.__explicitlySet__.add("vpusPerGB");
            return this;
        }
        /** The clusterPlacementGroup Id of the volume for volume placement. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The clusterPlacementGroup Id of the volume for volume placement.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /** The size of the volume in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The size of the volume in GBs.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         */
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }
        /** The size of the volume in MBs. This field is deprecated. Use sizeInGBs instead. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The size of the volume in MBs. This field is deprecated. Use sizeInGBs instead.
         *
         * @param sizeInMBs the value to set
         * @return this builder
         */
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private VolumeSourceDetails sourceDetails;

        public Builder sourceDetails(VolumeSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * The date and time the volume was created. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the volume was created. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The OCID of the source volume group. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * The OCID of the source volume group.
         *
         * @param volumeGroupId the value to set
         * @return this builder
         */
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }
        /**
         * Specifies whether the auto-tune performance is enabled for this volume. This field is
         * deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for
         * detached autotune.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
        private Boolean isAutoTuneEnabled;

        /**
         * Specifies whether the auto-tune performance is enabled for this volume. This field is
         * deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for
         * detached autotune.
         *
         * @param isAutoTuneEnabled the value to set
         * @return this builder
         */
        public Builder isAutoTuneEnabled(Boolean isAutoTuneEnabled) {
            this.isAutoTuneEnabled = isAutoTuneEnabled;
            this.__explicitlySet__.add("isAutoTuneEnabled");
            return this;
        }
        /**
         * The number of Volume Performance Units per GB that this volume is effectively tuned to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoTunedVpusPerGB")
        private Long autoTunedVpusPerGB;

        /**
         * The number of Volume Performance Units per GB that this volume is effectively tuned to.
         *
         * @param autoTunedVpusPerGB the value to set
         * @return this builder
         */
        public Builder autoTunedVpusPerGB(Long autoTunedVpusPerGB) {
            this.autoTunedVpusPerGB = autoTunedVpusPerGB;
            this.__explicitlySet__.add("autoTunedVpusPerGB");
            return this;
        }
        /** The list of block volume replicas of this volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeReplicas")
        private java.util.List<BlockVolumeReplicaInfo> blockVolumeReplicas;

        /**
         * The list of block volume replicas of this volume.
         *
         * @param blockVolumeReplicas the value to set
         * @return this builder
         */
        public Builder blockVolumeReplicas(
                java.util.List<BlockVolumeReplicaInfo> blockVolumeReplicas) {
            this.blockVolumeReplicas = blockVolumeReplicas;
            this.__explicitlySet__.add("blockVolumeReplicas");
            return this;
        }
        /** The list of autotune policies enabled for this volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("autotunePolicies")
        private java.util.List<AutotunePolicy> autotunePolicies;

        /**
         * The list of autotune policies enabled for this volume.
         *
         * @param autotunePolicies the value to set
         * @return this builder
         */
        public Builder autotunePolicies(java.util.List<AutotunePolicy> autotunePolicies) {
            this.autotunePolicies = autotunePolicies;
            this.__explicitlySet__.add("autotunePolicies");
            return this;
        }
        /**
         * Reservations-enabled is a boolean field that allows to enable PR (Persistent Reservation)
         * on a volume.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isReservationsEnabled")
        private Boolean isReservationsEnabled;

        /**
         * Reservations-enabled is a boolean field that allows to enable PR (Persistent Reservation)
         * on a volume.
         *
         * @param isReservationsEnabled the value to set
         * @return this builder
         */
        public Builder isReservationsEnabled(Boolean isReservationsEnabled) {
            this.isReservationsEnabled = isReservationsEnabled;
            this.__explicitlySet__.add("isReservationsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Volume build() {
            Volume model =
                    new Volume(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.systemTags,
                            this.id,
                            this.isHydrated,
                            this.kmsKeyId,
                            this.lifecycleState,
                            this.vpusPerGB,
                            this.clusterPlacementGroupId,
                            this.sizeInGBs,
                            this.sizeInMBs,
                            this.sourceDetails,
                            this.timeCreated,
                            this.volumeGroupId,
                            this.isAutoTuneEnabled,
                            this.autoTunedVpusPerGB,
                            this.blockVolumeReplicas,
                            this.autotunePolicies,
                            this.isReservationsEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Volume model) {
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("isHydrated")) {
                this.isHydrated(model.getIsHydrated());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("vpusPerGB")) {
                this.vpusPerGB(model.getVpusPerGB());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("sizeInMBs")) {
                this.sizeInMBs(model.getSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("volumeGroupId")) {
                this.volumeGroupId(model.getVolumeGroupId());
            }
            if (model.wasPropertyExplicitlySet("isAutoTuneEnabled")) {
                this.isAutoTuneEnabled(model.getIsAutoTuneEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoTunedVpusPerGB")) {
                this.autoTunedVpusPerGB(model.getAutoTunedVpusPerGB());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeReplicas")) {
                this.blockVolumeReplicas(model.getBlockVolumeReplicas());
            }
            if (model.wasPropertyExplicitlySet("autotunePolicies")) {
                this.autotunePolicies(model.getAutotunePolicies());
            }
            if (model.wasPropertyExplicitlySet("isReservationsEnabled")) {
                this.isReservationsEnabled(model.getIsReservationsEnabled());
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

    /**
     * The availability domain of the volume.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the volume.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The OCID of the compartment that contains the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the volume.
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The OCID of the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the volume.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Specifies whether the cloned volume's data has finished copying from the source volume or
     * backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
    private final Boolean isHydrated;

    /**
     * Specifies whether the cloned volume's data has finished copying from the source volume or
     * backup.
     *
     * @return the value
     */
    public Boolean getIsHydrated() {
        return isHydrated;
    }

    /** The OCID of the Vault service key which is the master encryption key for the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Vault service key which is the master encryption key for the volume.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /** The current state of a volume. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Restoring("RESTORING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Faulty("FAULTY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of a volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of a volume.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options. See [Block Volume
     * Performance
     * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
     * for more information.
     *
     * <p>Allowed values:
     *
     * <p>{@code 0}: Represents Lower Cost option.
     *
     * <p>{@code 10}: Represents Balanced option.
     *
     * <p>{@code 20}: Represents Higher Performance option.
     *
     * <p>{@code 30}-{@code 120}: Represents the Ultra High Performance option.
     *
     * <p>For performance autotune enabled volumes, It would be the Default(Minimum) VPUs/GB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
    private final Long vpusPerGB;

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options. See [Block Volume
     * Performance
     * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
     * for more information.
     *
     * <p>Allowed values:
     *
     * <p>{@code 0}: Represents Lower Cost option.
     *
     * <p>{@code 10}: Represents Balanced option.
     *
     * <p>{@code 20}: Represents Higher Performance option.
     *
     * <p>{@code 30}-{@code 120}: Represents the Ultra High Performance option.
     *
     * <p>For performance autotune enabled volumes, It would be the Default(Minimum) VPUs/GB.
     *
     * @return the value
     */
    public Long getVpusPerGB() {
        return vpusPerGB;
    }

    /** The clusterPlacementGroup Id of the volume for volume placement. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The clusterPlacementGroup Id of the volume for volume placement.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /** The size of the volume in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The size of the volume in GBs.
     *
     * @return the value
     */
    public Long getSizeInGBs() {
        return sizeInGBs;
    }

    /** The size of the volume in MBs. This field is deprecated. Use sizeInGBs instead. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The size of the volume in MBs. This field is deprecated. Use sizeInGBs instead.
     *
     * @return the value
     */
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final VolumeSourceDetails sourceDetails;

    public VolumeSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * The date and time the volume was created. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the volume was created. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The OCID of the source volume group. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * The OCID of the source volume group.
     *
     * @return the value
     */
    public String getVolumeGroupId() {
        return volumeGroupId;
    }

    /**
     * Specifies whether the auto-tune performance is enabled for this volume. This field is
     * deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for
     * detached autotune.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
    private final Boolean isAutoTuneEnabled;

    /**
     * Specifies whether the auto-tune performance is enabled for this volume. This field is
     * deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for
     * detached autotune.
     *
     * @return the value
     */
    public Boolean getIsAutoTuneEnabled() {
        return isAutoTuneEnabled;
    }

    /** The number of Volume Performance Units per GB that this volume is effectively tuned to. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoTunedVpusPerGB")
    private final Long autoTunedVpusPerGB;

    /**
     * The number of Volume Performance Units per GB that this volume is effectively tuned to.
     *
     * @return the value
     */
    public Long getAutoTunedVpusPerGB() {
        return autoTunedVpusPerGB;
    }

    /** The list of block volume replicas of this volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeReplicas")
    private final java.util.List<BlockVolumeReplicaInfo> blockVolumeReplicas;

    /**
     * The list of block volume replicas of this volume.
     *
     * @return the value
     */
    public java.util.List<BlockVolumeReplicaInfo> getBlockVolumeReplicas() {
        return blockVolumeReplicas;
    }

    /** The list of autotune policies enabled for this volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("autotunePolicies")
    private final java.util.List<AutotunePolicy> autotunePolicies;

    /**
     * The list of autotune policies enabled for this volume.
     *
     * @return the value
     */
    public java.util.List<AutotunePolicy> getAutotunePolicies() {
        return autotunePolicies;
    }

    /**
     * Reservations-enabled is a boolean field that allows to enable PR (Persistent Reservation) on
     * a volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isReservationsEnabled")
    private final Boolean isReservationsEnabled;

    /**
     * Reservations-enabled is a boolean field that allows to enable PR (Persistent Reservation) on
     * a volume.
     *
     * @return the value
     */
    public Boolean getIsReservationsEnabled() {
        return isReservationsEnabled;
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
        sb.append("Volume(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isHydrated=").append(String.valueOf(this.isHydrated));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", vpusPerGB=").append(String.valueOf(this.vpusPerGB));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(", isAutoTuneEnabled=").append(String.valueOf(this.isAutoTuneEnabled));
        sb.append(", autoTunedVpusPerGB=").append(String.valueOf(this.autoTunedVpusPerGB));
        sb.append(", blockVolumeReplicas=").append(String.valueOf(this.blockVolumeReplicas));
        sb.append(", autotunePolicies=").append(String.valueOf(this.autotunePolicies));
        sb.append(", isReservationsEnabled=").append(String.valueOf(this.isReservationsEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Volume)) {
            return false;
        }

        Volume other = (Volume) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isHydrated, other.isHydrated)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.vpusPerGB, other.vpusPerGB)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && java.util.Objects.equals(this.isAutoTuneEnabled, other.isAutoTuneEnabled)
                && java.util.Objects.equals(this.autoTunedVpusPerGB, other.autoTunedVpusPerGB)
                && java.util.Objects.equals(this.blockVolumeReplicas, other.blockVolumeReplicas)
                && java.util.Objects.equals(this.autotunePolicies, other.autotunePolicies)
                && java.util.Objects.equals(this.isReservationsEnabled, other.isReservationsEnabled)
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.isHydrated == null ? 43 : this.isHydrated.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.vpusPerGB == null ? 43 : this.vpusPerGB.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoTuneEnabled == null ? 43 : this.isAutoTuneEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoTunedVpusPerGB == null
                                ? 43
                                : this.autoTunedVpusPerGB.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeReplicas == null
                                ? 43
                                : this.blockVolumeReplicas.hashCode());
        result =
                (result * PRIME)
                        + (this.autotunePolicies == null ? 43 : this.autotunePolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.isReservationsEnabled == null
                                ? 43
                                : this.isReservationsEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
