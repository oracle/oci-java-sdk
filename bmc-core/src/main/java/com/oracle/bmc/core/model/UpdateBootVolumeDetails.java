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
        builder = UpdateBootVolumeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBootVolumeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "sizeInGBs",
        "vpusPerGB",
        "isAutoTuneEnabled",
        "bootVolumeReplicas",
        "autotunePolicies"
    })
    public UpdateBootVolumeDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            Long sizeInGBs,
            Long vpusPerGB,
            Boolean isAutoTuneEnabled,
            java.util.List<BootVolumeReplicaDetails> bootVolumeReplicas,
            java.util.List<AutotunePolicy> autotunePolicies) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.sizeInGBs = sizeInGBs;
        this.vpusPerGB = vpusPerGB;
        this.isAutoTuneEnabled = isAutoTuneEnabled;
        this.bootVolumeReplicas = bootVolumeReplicas;
        this.autotunePolicies = autotunePolicies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The number of volume performance units (VPUs) that will be applied to this volume per GB,
         * representing the Block Volume service's elastic performance options. See [Block Volume
         * Performance
         * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
         * for more information.
         *
         * <p>Allowed values:
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
         * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
         * for more information.
         *
         * <p>Allowed values:
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
        /**
         * Specifies whether the auto-tune performance is enabled for this boot volume. This field
         * is deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume
         * for detached autotune.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
        private Boolean isAutoTuneEnabled;

        /**
         * Specifies whether the auto-tune performance is enabled for this boot volume. This field
         * is deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume
         * for detached autotune.
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
         * The list of boot volume replicas that this boot volume will be updated to have in the
         * specified destination availability domains.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeReplicas")
        private java.util.List<BootVolumeReplicaDetails> bootVolumeReplicas;

        /**
         * The list of boot volume replicas that this boot volume will be updated to have in the
         * specified destination availability domains.
         *
         * @param bootVolumeReplicas the value to set
         * @return this builder
         */
        public Builder bootVolumeReplicas(
                java.util.List<BootVolumeReplicaDetails> bootVolumeReplicas) {
            this.bootVolumeReplicas = bootVolumeReplicas;
            this.__explicitlySet__.add("bootVolumeReplicas");
            return this;
        }
        /** The list of autotune policies to be enabled for this volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("autotunePolicies")
        private java.util.List<AutotunePolicy> autotunePolicies;

        /**
         * The list of autotune policies to be enabled for this volume.
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

        public UpdateBootVolumeDetails build() {
            UpdateBootVolumeDetails model =
                    new UpdateBootVolumeDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.sizeInGBs,
                            this.vpusPerGB,
                            this.isAutoTuneEnabled,
                            this.bootVolumeReplicas,
                            this.autotunePolicies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBootVolumeDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("vpusPerGB")) {
                this.vpusPerGB(model.getVpusPerGB());
            }
            if (model.wasPropertyExplicitlySet("isAutoTuneEnabled")) {
                this.isAutoTuneEnabled(model.getIsAutoTuneEnabled());
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
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options. See [Block Volume
     * Performance
     * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
     * for more information.
     *
     * <p>Allowed values:
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
     * Levels](https://docs.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels)
     * for more information.
     *
     * <p>Allowed values:
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

    /**
     * Specifies whether the auto-tune performance is enabled for this boot volume. This field is
     * deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for
     * detached autotune.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
    private final Boolean isAutoTuneEnabled;

    /**
     * Specifies whether the auto-tune performance is enabled for this boot volume. This field is
     * deprecated. Use the {@code DetachedVolumeAutotunePolicy} instead to enable the volume for
     * detached autotune.
     *
     * @return the value
     */
    public Boolean getIsAutoTuneEnabled() {
        return isAutoTuneEnabled;
    }

    /**
     * The list of boot volume replicas that this boot volume will be updated to have in the
     * specified destination availability domains.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeReplicas")
    private final java.util.List<BootVolumeReplicaDetails> bootVolumeReplicas;

    /**
     * The list of boot volume replicas that this boot volume will be updated to have in the
     * specified destination availability domains.
     *
     * @return the value
     */
    public java.util.List<BootVolumeReplicaDetails> getBootVolumeReplicas() {
        return bootVolumeReplicas;
    }

    /** The list of autotune policies to be enabled for this volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("autotunePolicies")
    private final java.util.List<AutotunePolicy> autotunePolicies;

    /**
     * The list of autotune policies to be enabled for this volume.
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
        sb.append("UpdateBootVolumeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", vpusPerGB=").append(String.valueOf(this.vpusPerGB));
        sb.append(", isAutoTuneEnabled=").append(String.valueOf(this.isAutoTuneEnabled));
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
        if (!(o instanceof UpdateBootVolumeDetails)) {
            return false;
        }

        UpdateBootVolumeDetails other = (UpdateBootVolumeDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(this.vpusPerGB, other.vpusPerGB)
                && java.util.Objects.equals(this.isAutoTuneEnabled, other.isAutoTuneEnabled)
                && java.util.Objects.equals(this.bootVolumeReplicas, other.bootVolumeReplicas)
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
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result = (result * PRIME) + (this.vpusPerGB == null ? 43 : this.vpusPerGB.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoTuneEnabled == null ? 43 : this.isAutoTuneEnabled.hashCode());
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
