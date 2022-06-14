/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * DEPRECATED -- please use HeatWave API instead.
 * Details about the Analytics Cluster properties to be updated.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAnalyticsClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAnalyticsClusterDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"shapeName", "clusterSize"})
    public UpdateAnalyticsClusterDetails(String shapeName, Integer clusterSize) {
        super();
        this.shapeName = shapeName;
        this.clusterSize = clusterSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A change to the shape of the nodes in the Analytics Cluster will
         * result in the entire cluster being torn down and re-created with
         * Compute instances of the new Shape. This may result in significant
         * downtime for the analytics capability while the Analytics Cluster is
         * re-provisioned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * A change to the shape of the nodes in the Analytics Cluster will
         * result in the entire cluster being torn down and re-created with
         * Compute instances of the new Shape. This may result in significant
         * downtime for the analytics capability while the Analytics Cluster is
         * re-provisioned.
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * A change to the number of nodes in the Analytics Cluster will result
         * in the entire cluster being torn down and re-created with the new
         * cluster of nodes. This may result in a significant downtime for the
         * analytics capability while the Analytics Cluster is
         * re-provisioned.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        /**
         * A change to the number of nodes in the Analytics Cluster will result
         * in the entire cluster being torn down and re-created with the new
         * cluster of nodes. This may result in a significant downtime for the
         * analytics capability while the Analytics Cluster is
         * re-provisioned.
         *
         * @param clusterSize the value to set
         * @return this builder
         **/
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            this.__explicitlySet__.add("clusterSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAnalyticsClusterDetails build() {
            UpdateAnalyticsClusterDetails __instance__ =
                    new UpdateAnalyticsClusterDetails(shapeName, clusterSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAnalyticsClusterDetails o) {
            Builder copiedBuilder = shapeName(o.getShapeName()).clusterSize(o.getClusterSize());

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

    /**
     * A change to the shape of the nodes in the Analytics Cluster will
     * result in the entire cluster being torn down and re-created with
     * Compute instances of the new Shape. This may result in significant
     * downtime for the analytics capability while the Analytics Cluster is
     * re-provisioned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * A change to the shape of the nodes in the Analytics Cluster will
     * result in the entire cluster being torn down and re-created with
     * Compute instances of the new Shape. This may result in significant
     * downtime for the analytics capability while the Analytics Cluster is
     * re-provisioned.
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * A change to the number of nodes in the Analytics Cluster will result
     * in the entire cluster being torn down and re-created with the new
     * cluster of nodes. This may result in a significant downtime for the
     * analytics capability while the Analytics Cluster is
     * re-provisioned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    private final Integer clusterSize;

    /**
     * A change to the number of nodes in the Analytics Cluster will result
     * in the entire cluster being torn down and re-created with the new
     * cluster of nodes. This may result in a significant downtime for the
     * analytics capability while the Analytics Cluster is
     * re-provisioned.
     *
     * @return the value
     **/
    public Integer getClusterSize() {
        return clusterSize;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateAnalyticsClusterDetails(");
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", clusterSize=").append(String.valueOf(this.clusterSize));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAnalyticsClusterDetails)) {
            return false;
        }

        UpdateAnalyticsClusterDetails other = (UpdateAnalyticsClusterDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.clusterSize, other.clusterSize)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.clusterSize == null ? 43 : this.clusterSize.hashCode());
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
