/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The HPC cluster configuration requested when launching instances of a cluster network.
 *
 * <p>If the parameter is provided, instances will only be placed within the HPC island and list of
 * network blocks that you specify. If a list of network blocks are missing or not provided, the
 * instances will be placed in any HPC blocks in the HPC island that you specify. If the values of
 * HPC island or network block that you provide are not valid, an error is returned. <br>
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
        builder = ClusterConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"networkBlockIds", "hpcIslandId"})
    public ClusterConfigurationDetails(java.util.List<String> networkBlockIds, String hpcIslandId) {
        super();
        this.networkBlockIds = networkBlockIds;
        this.hpcIslandId = hpcIslandId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of network block OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkBlockIds")
        private java.util.List<String> networkBlockIds;

        /**
         * The list of network block OCIDs.
         *
         * @param networkBlockIds the value to set
         * @return this builder
         */
        public Builder networkBlockIds(java.util.List<String> networkBlockIds) {
            this.networkBlockIds = networkBlockIds;
            this.__explicitlySet__.add("networkBlockIds");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * HPC island.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
        private String hpcIslandId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * HPC island.
         *
         * @param hpcIslandId the value to set
         * @return this builder
         */
        public Builder hpcIslandId(String hpcIslandId) {
            this.hpcIslandId = hpcIslandId;
            this.__explicitlySet__.add("hpcIslandId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterConfigurationDetails build() {
            ClusterConfigurationDetails model =
                    new ClusterConfigurationDetails(this.networkBlockIds, this.hpcIslandId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("networkBlockIds")) {
                this.networkBlockIds(model.getNetworkBlockIds());
            }
            if (model.wasPropertyExplicitlySet("hpcIslandId")) {
                this.hpcIslandId(model.getHpcIslandId());
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

    /** The list of network block OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkBlockIds")
    private final java.util.List<String> networkBlockIds;

    /**
     * The list of network block OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getNetworkBlockIds() {
        return networkBlockIds;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HPC
     * island.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
    private final String hpcIslandId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HPC
     * island.
     *
     * @return the value
     */
    public String getHpcIslandId() {
        return hpcIslandId;
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
        sb.append("ClusterConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("networkBlockIds=").append(String.valueOf(this.networkBlockIds));
        sb.append(", hpcIslandId=").append(String.valueOf(this.hpcIslandId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterConfigurationDetails)) {
            return false;
        }

        ClusterConfigurationDetails other = (ClusterConfigurationDetails) o;
        return java.util.Objects.equals(this.networkBlockIds, other.networkBlockIds)
                && java.util.Objects.equals(this.hpcIslandId, other.hpcIslandId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.networkBlockIds == null ? 43 : this.networkBlockIds.hashCode());
        result = (result * PRIME) + (this.hpcIslandId == null ? 43 : this.hpcIslandId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
