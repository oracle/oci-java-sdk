/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Defines the replication topology of an OCI cache cluster, including the primary cluster and
 * associated secondary clusters participating in replication. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ClusterReplicationTopology.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterReplicationTopology
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"primaryCluster", "secondaryClusters"})
    public ClusterReplicationTopology(
            MemberCluster primaryCluster, java.util.List<MemberCluster> secondaryClusters) {
        super();
        this.primaryCluster = primaryCluster;
        this.secondaryClusters = secondaryClusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("primaryCluster")
        private MemberCluster primaryCluster;

        public Builder primaryCluster(MemberCluster primaryCluster) {
            this.primaryCluster = primaryCluster;
            this.__explicitlySet__.add("primaryCluster");
            return this;
        }
        /** The list of secondary clusters that replicate data from the primary cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryClusters")
        private java.util.List<MemberCluster> secondaryClusters;

        /**
         * The list of secondary clusters that replicate data from the primary cluster.
         *
         * @param secondaryClusters the value to set
         * @return this builder
         */
        public Builder secondaryClusters(java.util.List<MemberCluster> secondaryClusters) {
            this.secondaryClusters = secondaryClusters;
            this.__explicitlySet__.add("secondaryClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterReplicationTopology build() {
            ClusterReplicationTopology model =
                    new ClusterReplicationTopology(this.primaryCluster, this.secondaryClusters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterReplicationTopology model) {
            if (model.wasPropertyExplicitlySet("primaryCluster")) {
                this.primaryCluster(model.getPrimaryCluster());
            }
            if (model.wasPropertyExplicitlySet("secondaryClusters")) {
                this.secondaryClusters(model.getSecondaryClusters());
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

    @com.fasterxml.jackson.annotation.JsonProperty("primaryCluster")
    private final MemberCluster primaryCluster;

    public MemberCluster getPrimaryCluster() {
        return primaryCluster;
    }

    /** The list of secondary clusters that replicate data from the primary cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryClusters")
    private final java.util.List<MemberCluster> secondaryClusters;

    /**
     * The list of secondary clusters that replicate data from the primary cluster.
     *
     * @return the value
     */
    public java.util.List<MemberCluster> getSecondaryClusters() {
        return secondaryClusters;
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
        sb.append("ClusterReplicationTopology(");
        sb.append("super=").append(super.toString());
        sb.append("primaryCluster=").append(String.valueOf(this.primaryCluster));
        sb.append(", secondaryClusters=").append(String.valueOf(this.secondaryClusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterReplicationTopology)) {
            return false;
        }

        ClusterReplicationTopology other = (ClusterReplicationTopology) o;
        return java.util.Objects.equals(this.primaryCluster, other.primaryCluster)
                && java.util.Objects.equals(this.secondaryClusters, other.secondaryClusters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.primaryCluster == null ? 43 : this.primaryCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryClusters == null ? 43 : this.secondaryClusters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
