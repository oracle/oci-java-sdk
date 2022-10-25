/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A detachable boot volume device that contains the image used to boot a Compute instance. For more information, see
 * [Overview of Boot Volumes](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/bootvolumes.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BootVolume.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BootVolume extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "systemTags",
        "displayName",
        "freeformTags",
        "id",
        "imageId",
        "isHydrated",
        "vpusPerGB",
        "lifecycleState",
        "sizeInGBs",
        "sizeInMBs",
        "sourceDetails",
        "timeCreated",
        "volumeGroupId",
        "kmsKeyId",
        "isAutoTuneEnabled",
        "autoTunedVpusPerGB",
        "bootVolumeReplicas",
        "autotunePolicies"
    })
    public BootVolume(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            String imageId,
            Boolean isHydrated,
            Long vpusPerGB,
            LifecycleState lifecycleState,
            Long sizeInGBs,
            Long sizeInMBs,
            BootVolumeSourceDetails sourceDetails,
            java.util.Date timeCreated,
            String volumeGroupId,
            String kmsKeyId,
            Boolean isAutoTuneEnabled,
            Long autoTunedVpusPerGB,
            java.util.List<BootVolumeReplicaInfo> bootVolumeReplicas,
            java.util.List<AutotunePolicy> autotunePolicies) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.imageId = imageId;
        this.isHydrated = isHydrated;
        this.vpusPerGB = vpusPerGB;
        this.lifecycleState = lifecycleState;
        this.sizeInGBs = sizeInGBs;
        this.sizeInMBs = sizeInMBs;
        this.sourceDetails = sourceDetails;
        this.timeCreated = timeCreated;
        this.volumeGroupId = volumeGroupId;
        this.kmsKeyId = kmsKeyId;
        this.isAutoTuneEnabled = isAutoTuneEnabled;
        this.autoTunedVpusPerGB = autoTunedVpusPerGB;
        this.bootVolumeReplicas = bootVolumeReplicas;
        this.autotunePolicies = autotunePolicies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the boot volume.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the boot volume.
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
         * The OCID of the compartment that contains the boot volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the boot volume.
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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
         * The boot volume's Oracle ID (OCID).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The boot volume's Oracle ID (OCID).
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The image OCID used to create the boot volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The image OCID used to create the boot volume.
         * @param imageId the value to set
         * @return this builder
         **/
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * Specifies whether the boot volume's data has finished copying
         * from the source boot volume or boot volume backup.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
        private Boolean isHydrated;

        /**
         * Specifies whether the boot volume's data has finished copying
         * from the source boot volume or boot volume backup.
         *
         * @param isHydrated the value to set
         * @return this builder
         **/
        public Builder isHydrated(Boolean isHydrated) {
            this.isHydrated = isHydrated;
            this.__explicitlySet__.add("isHydrated");
            return this;
        }
        /**
         * The number of volume performance units (VPUs) that will be applied to this boot volume per GB,
         * representing the Block Volume service's elastic performance options.
         * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
         * <p>
         * Allowed values:
         * <p>
         * {@code 10}: Represents Balanced option.
         * <p>
         * {@code 20}: Represents Higher Performance option.
         * <p>
         * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
         * <p>
         * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
        private Long vpusPerGB;

        /**
         * The number of volume performance units (VPUs) that will be applied to this boot volume per GB,
         * representing the Block Volume service's elastic performance options.
         * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
         * <p>
         * Allowed values:
         * <p>
         * {@code 10}: Represents Balanced option.
         * <p>
         * {@code 20}: Represents Higher Performance option.
         * <p>
         * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
         * <p>
         * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
         *
         * @param vpusPerGB the value to set
         * @return this builder
         **/
        public Builder vpusPerGB(Long vpusPerGB) {
            this.vpusPerGB = vpusPerGB;
            this.__explicitlySet__.add("vpusPerGB");
            return this;
        }
        /**
         * The current state of a boot volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of a boot volume.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The size of the boot volume in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The size of the boot volume in GBs.
         * @param sizeInGBs the value to set
         * @return this builder
         **/
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }
        /**
         * The size of the volume in MBs. The value must be a multiple of 1024.
         * This field is deprecated. Please use sizeInGBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The size of the volume in MBs. The value must be a multiple of 1024.
         * This field is deprecated. Please use sizeInGBs.
         *
         * @param sizeInMBs the value to set
         * @return this builder
         **/
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private BootVolumeSourceDetails sourceDetails;

        public Builder sourceDetails(BootVolumeSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * The date and time the boot volume was created. Format defined
         * by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the boot volume was created. Format defined
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
         * The OCID of the source volume group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * The OCID of the source volume group.
         * @param volumeGroupId the value to set
         * @return this builder
         **/
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }
        /**
         * The OCID of the Key Management master encryption key assigned to the boot volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Key Management master encryption key assigned to the boot volume.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * Specifies whether the auto-tune performance is enabled for this boot volume. This field is deprecated.
         * Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for detached autotune.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
        private Boolean isAutoTuneEnabled;

        /**
         * Specifies whether the auto-tune performance is enabled for this boot volume. This field is deprecated.
         * Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for detached autotune.
         *
         * @param isAutoTuneEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoTuneEnabled(Boolean isAutoTuneEnabled) {
            this.isAutoTuneEnabled = isAutoTuneEnabled;
            this.__explicitlySet__.add("isAutoTuneEnabled");
            return this;
        }
        /**
         * The number of Volume Performance Units per GB that this boot volume is effectively tuned to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoTunedVpusPerGB")
        private Long autoTunedVpusPerGB;

        /**
         * The number of Volume Performance Units per GB that this boot volume is effectively tuned to.
         *
         * @param autoTunedVpusPerGB the value to set
         * @return this builder
         **/
        public Builder autoTunedVpusPerGB(Long autoTunedVpusPerGB) {
            this.autoTunedVpusPerGB = autoTunedVpusPerGB;
            this.__explicitlySet__.add("autoTunedVpusPerGB");
            return this;
        }
        /**
         * The list of boot volume replicas of this boot volume
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeReplicas")
        private java.util.List<BootVolumeReplicaInfo> bootVolumeReplicas;

        /**
         * The list of boot volume replicas of this boot volume
         * @param bootVolumeReplicas the value to set
         * @return this builder
         **/
        public Builder bootVolumeReplicas(
                java.util.List<BootVolumeReplicaInfo> bootVolumeReplicas) {
            this.bootVolumeReplicas = bootVolumeReplicas;
            this.__explicitlySet__.add("bootVolumeReplicas");
            return this;
        }
        /**
         * The list of autotune policies enabled for this volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autotunePolicies")
        private java.util.List<AutotunePolicy> autotunePolicies;

        /**
         * The list of autotune policies enabled for this volume.
         * @param autotunePolicies the value to set
         * @return this builder
         **/
        public Builder autotunePolicies(java.util.List<AutotunePolicy> autotunePolicies) {
            this.autotunePolicies = autotunePolicies;
            this.__explicitlySet__.add("autotunePolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BootVolume build() {
            BootVolume model =
                    new BootVolume(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.systemTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.imageId,
                            this.isHydrated,
                            this.vpusPerGB,
                            this.lifecycleState,
                            this.sizeInGBs,
                            this.sizeInMBs,
                            this.sourceDetails,
                            this.timeCreated,
                            this.volumeGroupId,
                            this.kmsKeyId,
                            this.isAutoTuneEnabled,
                            this.autoTunedVpusPerGB,
                            this.bootVolumeReplicas,
                            this.autotunePolicies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BootVolume model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("isHydrated")) {
                this.isHydrated(model.getIsHydrated());
            }
            if (model.wasPropertyExplicitlySet("vpusPerGB")) {
                this.vpusPerGB(model.getVpusPerGB());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("isAutoTuneEnabled")) {
                this.isAutoTuneEnabled(model.getIsAutoTuneEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoTunedVpusPerGB")) {
                this.autoTunedVpusPerGB(model.getAutoTunedVpusPerGB());
            }
            if (model.wasPropertyExplicitlySet("bootVolumeReplicas")) {
                this.bootVolumeReplicas(model.getBootVolumeReplicas());
            }
            if (model.wasPropertyExplicitlySet("autotunePolicies")) {
                this.autotunePolicies(model.getAutotunePolicies());
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
     * The availability domain of the boot volume.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the boot volume.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment that contains the boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the boot volume.
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
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
     * The boot volume's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The boot volume's Oracle ID (OCID).
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The image OCID used to create the boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The image OCID used to create the boot volume.
     * @return the value
     **/
    public String getImageId() {
        return imageId;
    }

    /**
     * Specifies whether the boot volume's data has finished copying
     * from the source boot volume or boot volume backup.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
    private final Boolean isHydrated;

    /**
     * Specifies whether the boot volume's data has finished copying
     * from the source boot volume or boot volume backup.
     *
     * @return the value
     **/
    public Boolean getIsHydrated() {
        return isHydrated;
    }

    /**
     * The number of volume performance units (VPUs) that will be applied to this boot volume per GB,
     * representing the Block Volume service's elastic performance options.
     * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * <p>
     * Allowed values:
     * <p>
     * {@code 10}: Represents Balanced option.
     * <p>
     * {@code 20}: Represents Higher Performance option.
     * <p>
     * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
     * <p>
     * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
    private final Long vpusPerGB;

    /**
     * The number of volume performance units (VPUs) that will be applied to this boot volume per GB,
     * representing the Block Volume service's elastic performance options.
     * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * <p>
     * Allowed values:
     * <p>
     * {@code 10}: Represents Balanced option.
     * <p>
     * {@code 20}: Represents Higher Performance option.
     * <p>
     * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
     * <p>
     * For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
     *
     * @return the value
     **/
    public Long getVpusPerGB() {
        return vpusPerGB;
    }

    /**
     * The current state of a boot volume.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Restoring("RESTORING"),
        Available("AVAILABLE"),
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
     * The current state of a boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of a boot volume.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The size of the boot volume in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The size of the boot volume in GBs.
     * @return the value
     **/
    public Long getSizeInGBs() {
        return sizeInGBs;
    }

    /**
     * The size of the volume in MBs. The value must be a multiple of 1024.
     * This field is deprecated. Please use sizeInGBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The size of the volume in MBs. The value must be a multiple of 1024.
     * This field is deprecated. Please use sizeInGBs.
     *
     * @return the value
     **/
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final BootVolumeSourceDetails sourceDetails;

    public BootVolumeSourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * The date and time the boot volume was created. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the boot volume was created. Format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The OCID of the source volume group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * The OCID of the source volume group.
     * @return the value
     **/
    public String getVolumeGroupId() {
        return volumeGroupId;
    }

    /**
     * The OCID of the Key Management master encryption key assigned to the boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Key Management master encryption key assigned to the boot volume.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Specifies whether the auto-tune performance is enabled for this boot volume. This field is deprecated.
     * Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for detached autotune.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
    private final Boolean isAutoTuneEnabled;

    /**
     * Specifies whether the auto-tune performance is enabled for this boot volume. This field is deprecated.
     * Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for detached autotune.
     *
     * @return the value
     **/
    public Boolean getIsAutoTuneEnabled() {
        return isAutoTuneEnabled;
    }

    /**
     * The number of Volume Performance Units per GB that this boot volume is effectively tuned to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoTunedVpusPerGB")
    private final Long autoTunedVpusPerGB;

    /**
     * The number of Volume Performance Units per GB that this boot volume is effectively tuned to.
     *
     * @return the value
     **/
    public Long getAutoTunedVpusPerGB() {
        return autoTunedVpusPerGB;
    }

    /**
     * The list of boot volume replicas of this boot volume
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeReplicas")
    private final java.util.List<BootVolumeReplicaInfo> bootVolumeReplicas;

    /**
     * The list of boot volume replicas of this boot volume
     * @return the value
     **/
    public java.util.List<BootVolumeReplicaInfo> getBootVolumeReplicas() {
        return bootVolumeReplicas;
    }

    /**
     * The list of autotune policies enabled for this volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autotunePolicies")
    private final java.util.List<AutotunePolicy> autotunePolicies;

    /**
     * The list of autotune policies enabled for this volume.
     * @return the value
     **/
    public java.util.List<AutotunePolicy> getAutotunePolicies() {
        return autotunePolicies;
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
        sb.append("BootVolume(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", isHydrated=").append(String.valueOf(this.isHydrated));
        sb.append(", vpusPerGB=").append(String.valueOf(this.vpusPerGB));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", isAutoTuneEnabled=").append(String.valueOf(this.isAutoTuneEnabled));
        sb.append(", autoTunedVpusPerGB=").append(String.valueOf(this.autoTunedVpusPerGB));
        sb.append(", bootVolumeReplicas=").append(String.valueOf(this.bootVolumeReplicas));
        sb.append(", autotunePolicies=").append(String.valueOf(this.autotunePolicies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BootVolume)) {
            return false;
        }

        BootVolume other = (BootVolume) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.isHydrated, other.isHydrated)
                && java.util.Objects.equals(this.vpusPerGB, other.vpusPerGB)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.isAutoTuneEnabled, other.isAutoTuneEnabled)
                && java.util.Objects.equals(this.autoTunedVpusPerGB, other.autoTunedVpusPerGB)
                && java.util.Objects.equals(this.bootVolumeReplicas, other.bootVolumeReplicas)
                && java.util.Objects.equals(this.autotunePolicies, other.autotunePolicies)
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.isHydrated == null ? 43 : this.isHydrated.hashCode());
        result = (result * PRIME) + (this.vpusPerGB == null ? 43 : this.vpusPerGB.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
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
                        + (this.bootVolumeReplicas == null
                                ? 43
                                : this.bootVolumeReplicas.hashCode());
        result =
                (result * PRIME)
                        + (this.autotunePolicies == null ? 43 : this.autotunePolicies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
