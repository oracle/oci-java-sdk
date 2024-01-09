/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Compute Instance Configuration instance details. <br>
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
        builder = ComputeInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "instanceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeInstanceDetails extends InstanceConfigurationInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Block volume parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumes")
        private java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes;

        /**
         * Block volume parameters.
         *
         * @param blockVolumes the value to set
         * @return this builder
         */
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
        /** Secondary VNIC parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnics")
        private java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics;

        /**
         * Secondary VNIC parameters.
         *
         * @param secondaryVnics the value to set
         * @return this builder
         */
        public Builder secondaryVnics(
                java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics) {
            this.secondaryVnics = secondaryVnics;
            this.__explicitlySet__.add("secondaryVnics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceDetails build() {
            ComputeInstanceDetails model =
                    new ComputeInstanceDetails(
                            this.blockVolumes, this.launchDetails, this.secondaryVnics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("blockVolumes")) {
                this.blockVolumes(model.getBlockVolumes());
            }
            if (model.wasPropertyExplicitlySet("launchDetails")) {
                this.launchDetails(model.getLaunchDetails());
            }
            if (model.wasPropertyExplicitlySet("secondaryVnics")) {
                this.secondaryVnics(model.getSecondaryVnics());
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

    /** Block volume parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumes")
    private final java.util.List<InstanceConfigurationBlockVolumeDetails> blockVolumes;

    /**
     * Block volume parameters.
     *
     * @return the value
     */
    public java.util.List<InstanceConfigurationBlockVolumeDetails> getBlockVolumes() {
        return blockVolumes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("launchDetails")
    private final InstanceConfigurationLaunchInstanceDetails launchDetails;

    public InstanceConfigurationLaunchInstanceDetails getLaunchDetails() {
        return launchDetails;
    }

    /** Secondary VNIC parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryVnics")
    private final java.util.List<InstanceConfigurationAttachVnicDetails> secondaryVnics;

    /**
     * Secondary VNIC parameters.
     *
     * @return the value
     */
    public java.util.List<InstanceConfigurationAttachVnicDetails> getSecondaryVnics() {
        return secondaryVnics;
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
        sb.append("ComputeInstanceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", blockVolumes=").append(String.valueOf(this.blockVolumes));
        sb.append(", launchDetails=").append(String.valueOf(this.launchDetails));
        sb.append(", secondaryVnics=").append(String.valueOf(this.secondaryVnics));
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
                && super.equals(other);
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
        return result;
    }
}
