/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateVolumeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateVolumeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
        private Long vpusPerGB;

        public Builder vpusPerGB(Long vpusPerGB) {
            this.vpusPerGB = vpusPerGB;
            this.__explicitlySet__.add("vpusPerGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Long sizeInGBs;

        public Builder sizeInGBs(Long sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
        private Boolean isAutoTuneEnabled;

        public Builder isAutoTuneEnabled(Boolean isAutoTuneEnabled) {
            this.isAutoTuneEnabled = isAutoTuneEnabled;
            this.__explicitlySet__.add("isAutoTuneEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeReplicas")
        private java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas;

        public Builder blockVolumeReplicas(
                java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas) {
            this.blockVolumeReplicas = blockVolumeReplicas;
            this.__explicitlySet__.add("blockVolumeReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVolumeDetails build() {
            UpdateVolumeDetails __instance__ =
                    new UpdateVolumeDetails(
                            definedTags,
                            displayName,
                            freeformTags,
                            vpusPerGB,
                            sizeInGBs,
                            isAutoTuneEnabled,
                            blockVolumeReplicas);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVolumeDetails o) {
            Builder copiedBuilder =
                    definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .vpusPerGB(o.getVpusPerGB())
                            .sizeInGBs(o.getSizeInGBs())
                            .isAutoTuneEnabled(o.getIsAutoTuneEnabled())
                            .blockVolumeReplicas(o.getBlockVolumeReplicas());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options.
     * See [Block Volume Elastic Performance](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeelasticperformance.htm) for more information.
     * <p>
     * Allowed values:
     * <p>
     * {@code 0}: Represents Lower Cost option.
     * <p>
     * {@code 10}: Represents Balanced option.
     * <p>
     * {@code 20}: Represents Higher Performance option.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
    Long vpusPerGB;

    /**
     * The size to resize the volume to in GBs. Has to be larger than the current size.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    Long sizeInGBs;

    /**
     * Specifies whether the auto-tune performance is enabled for this volume.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoTuneEnabled")
    Boolean isAutoTuneEnabled;

    /**
     * The list of block volume replicas that this volume will be updated to have
     * in the specified destination availability domains.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeReplicas")
    java.util.List<BlockVolumeReplicaDetails> blockVolumeReplicas;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
