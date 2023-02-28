/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVolumeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateVolumeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "vpusPerGB",
        "sizeInGBs",
        "isAutoTuneEnabled",
        "blockVolumeReplicas",
        "autotunePolicies"
    })
    public UpdateVolumeDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            Long vpusPerGB,
            Long sizeInGBs,
            Boolean isAutoTuneEnabled,
            java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas,
            java.util.List<AutotunePolicy> autotunePolicies) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.vpusPerGB = vpusPerGB;
        this.sizeInGBs = sizeInGBs;
        this.isAutoTuneEnabled = isAutoTuneEnabled;
        this.blockVolumeReplicas = blockVolumeReplicas;
        this.autotunePolicies = autotunePolicies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options. See [Block Volume
         * Performance
         * Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
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
         * <p>For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
        private Long vpusPerGB;

        /**
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options. See [Block Volume
         * Performance
         * Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
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
         * <p>For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
         *
         * @param vpusPerGB the value to set
         * @return this builder
         */
        public Builder vpusPerGB(Long vpusPerGB) {
            this.vpusPerGB = vpusPerGB;
            this.__explicitlySet__.add("vpusPerGB");
            return this;
        }
        /** The size to resize the volume to in GBs. Has to be larger than the current size. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        /**
         * The size to resize the volume to in GBs. Has to be larger than the current size.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         */
        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
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
         * The list of block volume replicas that this volume will be updated to have in the
         * specified destination availability domains.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeReplicas")
        private java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas;

        /**
         * The list of block volume replicas that this volume will be updated to have in the
         * specified destination availability domains.
         *
         * @param blockVolumeReplicas the value to set
         * @return this builder
         */
        public Builder blockVolumeReplicas(
                java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas) {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVolumeDetails build() {
            UpdateVolumeDetails model =
                    new UpdateVolumeDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.vpusPerGB,
                            this.sizeInGBs,
                            this.isAutoTuneEnabled,
                            this.blockVolumeReplicas,
                            this.autotunePolicies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("vpusPerGB")) {
                this.vpusPerGB(model.getVpusPerGB());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("isAutoTuneEnabled")) {
                this.isAutoTuneEnabled(model.getIsAutoTuneEnabled());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeReplicas")) {
                this.blockVolumeReplicas(model.getBlockVolumeReplicas());
            }
            if (model.wasPropertyExplicitlySet("autotunePolicies")) {
                this.autotunePolicies(model.getAutotunePolicies());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options. See [Block Volume
     * Performance
     * Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
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
     * <p>For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
    private final Long vpusPerGB;

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options. See [Block Volume
     * Performance
     * Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
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
     * <p>For performance autotune enabled volumes, it would be the Default(Minimum) VPUs/GB.
     *
     * @return the value
     */
    public Long getVpusPerGB() {
        return vpusPerGB;
    }

    /** The size to resize the volume to in GBs. Has to be larger than the current size. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Long sizeInGBs;

    /**
     * The size to resize the volume to in GBs. Has to be larger than the current size.
     *
     * @return the value
     */
    public Long getSizeInGBs() {
        return sizeInGBs;
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

    /**
     * The list of block volume replicas that this volume will be updated to have in the specified
     * destination availability domains.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeReplicas")
    private final java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas;

    /**
     * The list of block volume replicas that this volume will be updated to have in the specified
     * destination availability domains.
     *
     * @return the value
     */
    public java.util.List<BlockVolumeReplicaDetails> getBlockVolumeReplicas() {
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
        sb.append("UpdateVolumeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", vpusPerGB=").append(String.valueOf(this.vpusPerGB));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", isAutoTuneEnabled=").append(String.valueOf(this.isAutoTuneEnabled));
        sb.append(", blockVolumeReplicas=").append(String.valueOf(this.blockVolumeReplicas));
        sb.append(", autotunePolicies=").append(String.valueOf(this.autotunePolicies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeDetails)) {
            return false;
        }

        UpdateVolumeDetails other = (UpdateVolumeDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.vpusPerGB, other.vpusPerGB)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.isAutoTuneEnabled, other.isAutoTuneEnabled)
                && java.util.Objects.equals(this.blockVolumeReplicas, other.blockVolumeReplicas)
                && java.util.Objects.equals(this.autotunePolicies, other.autotunePolicies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.vpusPerGB == null ? 43 : this.vpusPerGB.hashCode());
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoTuneEnabled == null ? 43 : this.isAutoTuneEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeReplicas == null
                                ? 43
                                : this.blockVolumeReplicas.hashCode());
        result =
                (result * PRIME)
                        + (this.autotunePolicies == null ? 43 : this.autotunePolicies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
