/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Compute Instance Configuration instance details.
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
    builder = ComputeInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "instanceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeInstanceDetails extends InstanceConfigurationInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumes")
        private java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes;

        public Builder blockVolumes(
                java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes) {
            this.blockVolumes = blockVolumes;
            this.__explicitlySet__.add("blockVolumes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("launchDetails")
        private InstanceConfigurationLaunchInstanceDetails launchDetails;

        public Builder launchDetails(InstanceConfigurationLaunchInstanceDetails launchDetails) {
            this.launchDetails = launchDetails;
            this.__explicitlySet__.add("launchDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnics")
        private java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics;

        public Builder secondaryVnics(
                java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics) {
            this.secondaryVnics = secondaryVnics;
            this.__explicitlySet__.add("secondaryVnics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceDetails build() {
            ComputeInstanceDetails __instance__ =
                    new ComputeInstanceDetails(blockVolumes, launchDetails, secondaryVnics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceDetails o) {
            Builder copiedBuilder =
                    blockVolumes(o.getBlockVolumes())
                            .launchDetails(o.getLaunchDetails())
                            .secondaryVnics(o.getSecondaryVnics());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public ComputeInstanceDetails(
            java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes,
            InstanceConfigurationLaunchInstanceDetails launchDetails,
            java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics) {
        super();
        this.blockVolumes = blockVolumes;
        this.launchDetails = launchDetails;
        this.secondaryVnics = secondaryVnics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumes")
    private final java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes;

    public java.util.List<InstanceConfigurationBlockVolumeDetails> getBlockVolumes() {
        return blockVolumes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("launchDetails")
    private final InstanceConfigurationLaunchInstanceDetails launchDetails;

    public InstanceConfigurationLaunchInstanceDetails getLaunchDetails() {
        return launchDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnics")
    private final java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics;

    public java.util.List<InstanceConfigurationAttachVnicDetails> getSecondaryVnics() {
        return secondaryVnics;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComputeInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", blockVolumes=").append(String.valueOf(this.blockVolumes));
        sb.append(", launchDetails=").append(String.valueOf(this.launchDetails));
        sb.append(", secondaryVnics=").append(String.valueOf(this.secondaryVnics));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceDetails)) {
            return false;
        }

        ComputeInstanceDetails other = (ComputeInstanceDetails) o;
        return java.util.Objects.equals(this.blockVolumes, other.blockVolumes)
                && java.util.Objects.equals(this.launchDetails, other.launchDetails)
                && java.util.Objects.equals(this.secondaryVnics, other.secondaryVnics)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.blockVolumes == null ? 43 : this.blockVolumes.hashCode());
        result =
                (result * PRIME)
                        + (this.launchDetails == null ? 43 : this.launchDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryVnics == null ? 43 : this.secondaryVnics.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
