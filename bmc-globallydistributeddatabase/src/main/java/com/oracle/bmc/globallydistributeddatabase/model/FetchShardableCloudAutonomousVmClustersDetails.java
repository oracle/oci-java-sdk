/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Details required for fetch sharded cloud autonomous vm clusters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FetchShardableCloudAutonomousVmClustersDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FetchShardableCloudAutonomousVmClustersDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "lifecycleState",
        "lifecycleStateDetails",
        "minimumAvailableCdbCount",
        "areDepletedClustersIncluded",
        "regions"
    })
    public FetchShardableCloudAutonomousVmClustersDetails(
            String compartmentId,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            Integer minimumAvailableCdbCount,
            Boolean areDepletedClustersIncluded,
            java.util.List<String> regions) {
        super();
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.minimumAvailableCdbCount = minimumAvailableCdbCount;
        this.areDepletedClustersIncluded = areDepletedClustersIncluded;
        this.regions = regions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment id of cloud autonomous vm clusters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment id of cloud autonomous vm clusters.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Lifecycle states for shardable Cloud autonomous vm cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle states for shardable Cloud autonomous vm cluster.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Detailed message for the lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Detailed message for the lifecycle state.
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /**
         * List only clusters for which atleast given minimum CDB count is available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumAvailableCdbCount")
        private Integer minimumAvailableCdbCount;

        /**
         * List only clusters for which atleast given minimum CDB count is available.
         * @param minimumAvailableCdbCount the value to set
         * @return this builder
         **/
        public Builder minimumAvailableCdbCount(Integer minimumAvailableCdbCount) {
            this.minimumAvailableCdbCount = minimumAvailableCdbCount;
            this.__explicitlySet__.add("minimumAvailableCdbCount");
            return this;
        }
        /**
         * Flag to indicate of response shall also include clusters for which no more capacity is left to create new resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areDepletedClustersIncluded")
        private Boolean areDepletedClustersIncluded;

        /**
         * Flag to indicate of response shall also include clusters for which no more capacity is left to create new resources.
         * @param areDepletedClustersIncluded the value to set
         * @return this builder
         **/
        public Builder areDepletedClustersIncluded(Boolean areDepletedClustersIncluded) {
            this.areDepletedClustersIncluded = areDepletedClustersIncluded;
            this.__explicitlySet__.add("areDepletedClustersIncluded");
            return this;
        }
        /**
         * Region code of regions for which sharded cloud autonomous vm clusters need to be fetched.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * Region code of regions for which sharded cloud autonomous vm clusters need to be fetched.
         * @param regions the value to set
         * @return this builder
         **/
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FetchShardableCloudAutonomousVmClustersDetails build() {
            FetchShardableCloudAutonomousVmClustersDetails model =
                    new FetchShardableCloudAutonomousVmClustersDetails(
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.minimumAvailableCdbCount,
                            this.areDepletedClustersIncluded,
                            this.regions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchShardableCloudAutonomousVmClustersDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("minimumAvailableCdbCount")) {
                this.minimumAvailableCdbCount(model.getMinimumAvailableCdbCount());
            }
            if (model.wasPropertyExplicitlySet("areDepletedClustersIncluded")) {
                this.areDepletedClustersIncluded(model.getAreDepletedClustersIncluded());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
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
     * Compartment id of cloud autonomous vm clusters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment id of cloud autonomous vm clusters.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Lifecycle states for shardable Cloud autonomous vm cluster.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Failed("FAILED"),
        NeedsAttention("NEEDS_ATTENTION"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),
        Unavailable("UNAVAILABLE"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * Lifecycle states for shardable Cloud autonomous vm cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle states for shardable Cloud autonomous vm cluster.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Detailed message for the lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Detailed message for the lifecycle state.
     * @return the value
     **/
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /**
     * List only clusters for which atleast given minimum CDB count is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumAvailableCdbCount")
    private final Integer minimumAvailableCdbCount;

    /**
     * List only clusters for which atleast given minimum CDB count is available.
     * @return the value
     **/
    public Integer getMinimumAvailableCdbCount() {
        return minimumAvailableCdbCount;
    }

    /**
     * Flag to indicate of response shall also include clusters for which no more capacity is left to create new resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areDepletedClustersIncluded")
    private final Boolean areDepletedClustersIncluded;

    /**
     * Flag to indicate of response shall also include clusters for which no more capacity is left to create new resources.
     * @return the value
     **/
    public Boolean getAreDepletedClustersIncluded() {
        return areDepletedClustersIncluded;
    }

    /**
     * Region code of regions for which sharded cloud autonomous vm clusters need to be fetched.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * Region code of regions for which sharded cloud autonomous vm clusters need to be fetched.
     * @return the value
     **/
    public java.util.List<String> getRegions() {
        return regions;
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
        sb.append("FetchShardableCloudAutonomousVmClustersDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", minimumAvailableCdbCount=")
                .append(String.valueOf(this.minimumAvailableCdbCount));
        sb.append(", areDepletedClustersIncluded=")
                .append(String.valueOf(this.areDepletedClustersIncluded));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchShardableCloudAutonomousVmClustersDetails)) {
            return false;
        }

        FetchShardableCloudAutonomousVmClustersDetails other =
                (FetchShardableCloudAutonomousVmClustersDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(
                        this.minimumAvailableCdbCount, other.minimumAvailableCdbCount)
                && java.util.Objects.equals(
                        this.areDepletedClustersIncluded, other.areDepletedClustersIncluded)
                && java.util.Objects.equals(this.regions, other.regions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumAvailableCdbCount == null
                                ? 43
                                : this.minimumAvailableCdbCount.hashCode());
        result =
                (result * PRIME)
                        + (this.areDepletedClustersIncluded == null
                                ? 43
                                : this.areDepletedClustersIncluded.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
