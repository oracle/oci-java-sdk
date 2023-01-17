/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the volume group to clone from.
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
    builder = VolumeGroupSourceFromVolumeGroupDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VolumeGroupSourceFromVolumeGroupDetails extends VolumeGroupSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the volume group to clone from.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
        private String volumeGroupId;

        /**
         * The OCID of the volume group to clone from.
         * @param volumeGroupId the value to set
         * @return this builder
         **/
        public Builder volumeGroupId(String volumeGroupId) {
            this.volumeGroupId = volumeGroupId;
            this.__explicitlySet__.add("volumeGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeGroupSourceFromVolumeGroupDetails build() {
            VolumeGroupSourceFromVolumeGroupDetails model =
                    new VolumeGroupSourceFromVolumeGroupDetails(this.volumeGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeGroupSourceFromVolumeGroupDetails model) {
            if (model.wasPropertyExplicitlySet("volumeGroupId")) {
                this.volumeGroupId(model.getVolumeGroupId());
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

    @Deprecated
    public VolumeGroupSourceFromVolumeGroupDetails(String volumeGroupId) {
        super();
        this.volumeGroupId = volumeGroupId;
    }

    /**
     * The OCID of the volume group to clone from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupId")
    private final String volumeGroupId;

    /**
     * The OCID of the volume group to clone from.
     * @return the value
     **/
    public String getVolumeGroupId() {
        return volumeGroupId;
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
        sb.append("VolumeGroupSourceFromVolumeGroupDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", volumeGroupId=").append(String.valueOf(this.volumeGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeGroupSourceFromVolumeGroupDetails)) {
            return false;
        }

        VolumeGroupSourceFromVolumeGroupDetails other = (VolumeGroupSourceFromVolumeGroupDetails) o;
        return java.util.Objects.equals(this.volumeGroupId, other.volumeGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupId == null ? 43 : this.volumeGroupId.hashCode());
        return result;
    }
}
