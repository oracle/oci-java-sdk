/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the source volume replica which the volume group will be created from. The volume group
 * replica shoulbe be in the same availability domain as the volume group. Only one volume group can
 * be created from a volume group replica at the same time. <br>
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
        builder = VolumeGroupSourceFromVolumeGroupReplicaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VolumeGroupSourceFromVolumeGroupReplicaDetails extends VolumeGroupSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the volume group replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicaId")
        private String volumeGroupReplicaId;

        /**
         * The OCID of the volume group replica.
         *
         * @param volumeGroupReplicaId the value to set
         * @return this builder
         */
        public Builder volumeGroupReplicaId(String volumeGroupReplicaId) {
            this.volumeGroupReplicaId = volumeGroupReplicaId;
            this.__explicitlySet__.add("volumeGroupReplicaId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeGroupSourceFromVolumeGroupReplicaDetails build() {
            VolumeGroupSourceFromVolumeGroupReplicaDetails model =
                    new VolumeGroupSourceFromVolumeGroupReplicaDetails(this.volumeGroupReplicaId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeGroupSourceFromVolumeGroupReplicaDetails model) {
            if (model.wasPropertyExplicitlySet("volumeGroupReplicaId")) {
                this.volumeGroupReplicaId(model.getVolumeGroupReplicaId());
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
    public VolumeGroupSourceFromVolumeGroupReplicaDetails(String volumeGroupReplicaId) {
        super();
        this.volumeGroupReplicaId = volumeGroupReplicaId;
    }

    /** The OCID of the volume group replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeGroupReplicaId")
    private final String volumeGroupReplicaId;

    /**
     * The OCID of the volume group replica.
     *
     * @return the value
     */
    public String getVolumeGroupReplicaId() {
        return volumeGroupReplicaId;
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
        sb.append("VolumeGroupSourceFromVolumeGroupReplicaDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", volumeGroupReplicaId=").append(String.valueOf(this.volumeGroupReplicaId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeGroupSourceFromVolumeGroupReplicaDetails)) {
            return false;
        }

        VolumeGroupSourceFromVolumeGroupReplicaDetails other =
                (VolumeGroupSourceFromVolumeGroupReplicaDetails) o;
        return java.util.Objects.equals(this.volumeGroupReplicaId, other.volumeGroupReplicaId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.volumeGroupReplicaId == null
                                ? 43
                                : this.volumeGroupReplicaId.hashCode());
        return result;
    }
}
