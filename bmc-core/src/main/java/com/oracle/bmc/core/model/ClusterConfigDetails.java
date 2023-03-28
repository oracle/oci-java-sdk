/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The HPC cluster configuration requested when launching instances in a compute capacity reservation.
 * <p>
 * If the parameter is provided, the reservation is created with the HPC island and a list of HPC blocks that you
 * specify. If a list of HPC blocks are missing or not provided, the reservation is created with any HPC blocks in
 * the HPC island that you specify. If the values of HPC island or HPC block that you provide are not valid, an error
 * is returned.
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
    builder = ClusterConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterConfigDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hpcIslandId", "networkBlockIds"})
    public ClusterConfigDetails(String hpcIslandId, java.util.List<String> networkBlockIds) {
        super();
        this.hpcIslandId = hpcIslandId;
        this.networkBlockIds = networkBlockIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HpcIsland.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
        private String hpcIslandId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HpcIsland.
         *
         * @param hpcIslandId the value to set
         * @return this builder
         **/
        public Builder hpcIslandId(String hpcIslandId) {
            this.hpcIslandId = hpcIslandId;
            this.__explicitlySet__.add("hpcIslandId");
            return this;
        }
        /**
         * The list of OCID of the network blocks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkBlockIds")
        private java.util.List<String> networkBlockIds;

        /**
         * The list of OCID of the network blocks.
         * @param networkBlockIds the value to set
         * @return this builder
         **/
        public Builder networkBlockIds(java.util.List<String> networkBlockIds) {
            this.networkBlockIds = networkBlockIds;
            this.__explicitlySet__.add("networkBlockIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterConfigDetails build() {
            ClusterConfigDetails model =
                    new ClusterConfigDetails(this.hpcIslandId, this.networkBlockIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterConfigDetails model) {
            if (model.wasPropertyExplicitlySet("hpcIslandId")) {
                this.hpcIslandId(model.getHpcIslandId());
            }
            if (model.wasPropertyExplicitlySet("networkBlockIds")) {
                this.networkBlockIds(model.getNetworkBlockIds());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HpcIsland.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
    private final String hpcIslandId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HpcIsland.
     *
     * @return the value
     **/
    public String getHpcIslandId() {
        return hpcIslandId;
    }

    /**
     * The list of OCID of the network blocks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkBlockIds")
    private final java.util.List<String> networkBlockIds;

    /**
     * The list of OCID of the network blocks.
     * @return the value
     **/
    public java.util.List<String> getNetworkBlockIds() {
        return networkBlockIds;
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
        sb.append("ClusterConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hpcIslandId=").append(String.valueOf(this.hpcIslandId));
        sb.append(", networkBlockIds=").append(String.valueOf(this.networkBlockIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterConfigDetails)) {
            return false;
        }

        ClusterConfigDetails other = (ClusterConfigDetails) o;
        return java.util.Objects.equals(this.hpcIslandId, other.hpcIslandId)
                && java.util.Objects.equals(this.networkBlockIds, other.networkBlockIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hpcIslandId == null ? 43 : this.hpcIslandId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkBlockIds == null ? 43 : this.networkBlockIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
