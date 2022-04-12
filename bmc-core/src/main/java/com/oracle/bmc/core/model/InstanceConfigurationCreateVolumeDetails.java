/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Creates a new block volume. Please see {@link CreateVolumeDetails}
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
    builder = InstanceConfigurationCreateVolumeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceConfigurationCreateVolumeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicyId")
        private String backupPolicyId;

        public Builder backupPolicyId(String backupPolicyId) {
            this.backupPolicyId = backupPolicyId;
            this.__explicitlySet__.add("backupPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private InstanceConfigurationVolumeSourceDetails sourceDetails;

        public Builder sourceDetails(InstanceConfigurationVolumeSourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationCreateVolumeDetails build() {
            InstanceConfigurationCreateVolumeDetails __instance__ =
                    new InstanceConfigurationCreateVolumeDetails(
                            availabilityDomain,
                            backupPolicyId,
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            kmsKeyId,
                            vpusPerGB,
                            sizeInGBs,
                            sourceDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationCreateVolumeDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .backupPolicyId(o.getBackupPolicyId())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .kmsKeyId(o.getKmsKeyId())
                            .vpusPerGB(o.getVpusPerGB())
                            .sizeInGBs(o.getSizeInGBs())
                            .sourceDetails(o.getSourceDetails());

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
     * The availability domain of the volume.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * If provided, specifies the ID of the volume backup policy to assign to the newly
     * created volume. If omitted, no policy will be assigned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicyId")
    String backupPolicyId;

    /**
     * The OCID of the compartment that contains the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

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
     * The OCID of the Key Management key to assign as the master encryption key
     * for the volume.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * The number of volume performance units (VPUs) that will be applied to this volume per GB,
     * representing the Block Volume service's elastic performance options.
     * See [Block Volume Performance Levels](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/blockvolumeperformance.htm#perf_levels) for more information.
     * <p>
     * Allowed values:
     * <p>
     * {@code 0}: Represents Lower Cost option.
     * <p>
     * {@code 10}: Represents Balanced option.
     * <p>
     * {@code 20}: Represents Higher Performance option.
     * <p>
     * {@code 30}-{@code 120}: Represents the Ultra High Performance option.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpusPerGB")
    Long vpusPerGB;

    /**
     * The size of the volume in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    Long sizeInGBs;

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    InstanceConfigurationVolumeSourceDetails sourceDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
