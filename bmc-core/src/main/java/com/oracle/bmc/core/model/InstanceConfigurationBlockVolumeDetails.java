/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Create new block volumes or attach to an existing volume. Specify either createDetails or volumeId.
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
    builder = InstanceConfigurationBlockVolumeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceConfigurationBlockVolumeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"attachDetails", "createDetails", "volumeId"})
    public InstanceConfigurationBlockVolumeDetails(
            InstanceConfigurationAttachVolumeDetails attachDetails,
            InstanceConfigurationCreateVolumeDetails createDetails,
            String volumeId) {
        super();
        this.attachDetails = attachDetails;
        this.createDetails = createDetails;
        this.volumeId = volumeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("attachDetails")
        private InstanceConfigurationAttachVolumeDetails attachDetails;

        public Builder attachDetails(InstanceConfigurationAttachVolumeDetails attachDetails) {
            this.attachDetails = attachDetails;
            this.__explicitlySet__.add("attachDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createDetails")
        private InstanceConfigurationCreateVolumeDetails createDetails;

        public Builder createDetails(InstanceConfigurationCreateVolumeDetails createDetails) {
            this.createDetails = createDetails;
            this.__explicitlySet__.add("createDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationBlockVolumeDetails build() {
            InstanceConfigurationBlockVolumeDetails __instance__ =
                    new InstanceConfigurationBlockVolumeDetails(
                            attachDetails, createDetails, volumeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationBlockVolumeDetails o) {
            Builder copiedBuilder =
                    attachDetails(o.getAttachDetails())
                            .createDetails(o.getCreateDetails())
                            .volumeId(o.getVolumeId());

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

    @com.fasterxml.jackson.annotation.JsonProperty("attachDetails")
    private final InstanceConfigurationAttachVolumeDetails attachDetails;

    public InstanceConfigurationAttachVolumeDetails getAttachDetails() {
        return attachDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createDetails")
    private final InstanceConfigurationCreateVolumeDetails createDetails;

    public InstanceConfigurationCreateVolumeDetails getCreateDetails() {
        return createDetails;
    }

    /**
     * The OCID of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    private final String volumeId;

    public String getVolumeId() {
        return volumeId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceConfigurationBlockVolumeDetails(");
        sb.append("attachDetails=").append(String.valueOf(this.attachDetails));
        sb.append(", createDetails=").append(String.valueOf(this.createDetails));
        sb.append(", volumeId=").append(String.valueOf(this.volumeId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationBlockVolumeDetails)) {
            return false;
        }

        InstanceConfigurationBlockVolumeDetails other = (InstanceConfigurationBlockVolumeDetails) o;
        return java.util.Objects.equals(this.attachDetails, other.attachDetails)
                && java.util.Objects.equals(this.createDetails, other.createDetails)
                && java.util.Objects.equals(this.volumeId, other.volumeId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attachDetails == null ? 43 : this.attachDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.createDetails == null ? 43 : this.createDetails.hashCode());
        result = (result * PRIME) + (this.volumeId == null ? 43 : this.volumeId.hashCode());
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
