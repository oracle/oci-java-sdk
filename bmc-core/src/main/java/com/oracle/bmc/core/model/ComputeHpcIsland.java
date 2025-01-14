/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A compute HPC island. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ComputeHpcIsland.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeHpcIsland
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeCapacityTopologyId",
        "id",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "totalComputeBareMetalHostCount"
    })
    public ComputeHpcIsland(
            String computeCapacityTopologyId,
            String id,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Long totalComputeBareMetalHostCount) {
        super();
        this.computeCapacityTopologyId = computeCapacityTopologyId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.totalComputeBareMetalHostCount = totalComputeBareMetalHostCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compute capacity topology.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCapacityTopologyId")
        private String computeCapacityTopologyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compute capacity topology.
         *
         * @param computeCapacityTopologyId the value to set
         * @return this builder
         */
        public Builder computeCapacityTopologyId(String computeCapacityTopologyId) {
            this.computeCapacityTopologyId = computeCapacityTopologyId;
            this.__explicitlySet__.add("computeCapacityTopologyId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compute HPC island.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compute HPC island.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of the compute HPC island. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the compute HPC island.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time that the compute HPC island was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the compute HPC island was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time that the compute HPC island was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the compute HPC island was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The total number of compute bare metal hosts located in this compute HPC island. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalComputeBareMetalHostCount")
        private Long totalComputeBareMetalHostCount;

        /**
         * The total number of compute bare metal hosts located in this compute HPC island.
         *
         * @param totalComputeBareMetalHostCount the value to set
         * @return this builder
         */
        public Builder totalComputeBareMetalHostCount(Long totalComputeBareMetalHostCount) {
            this.totalComputeBareMetalHostCount = totalComputeBareMetalHostCount;
            this.__explicitlySet__.add("totalComputeBareMetalHostCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeHpcIsland build() {
            ComputeHpcIsland model =
                    new ComputeHpcIsland(
                            this.computeCapacityTopologyId,
                            this.id,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.totalComputeBareMetalHostCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeHpcIsland model) {
            if (model.wasPropertyExplicitlySet("computeCapacityTopologyId")) {
                this.computeCapacityTopologyId(model.getComputeCapacityTopologyId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("totalComputeBareMetalHostCount")) {
                this.totalComputeBareMetalHostCount(model.getTotalComputeBareMetalHostCount());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compute capacity topology.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCapacityTopologyId")
    private final String computeCapacityTopologyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compute capacity topology.
     *
     * @return the value
     */
    public String getComputeCapacityTopologyId() {
        return computeCapacityTopologyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compute HPC island.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compute HPC island.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of the compute HPC island. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the compute HPC island. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the compute HPC island.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time that the compute HPC island was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the compute HPC island was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the compute HPC island was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the compute HPC island was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The total number of compute bare metal hosts located in this compute HPC island. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalComputeBareMetalHostCount")
    private final Long totalComputeBareMetalHostCount;

    /**
     * The total number of compute bare metal hosts located in this compute HPC island.
     *
     * @return the value
     */
    public Long getTotalComputeBareMetalHostCount() {
        return totalComputeBareMetalHostCount;
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
        sb.append("ComputeHpcIsland(");
        sb.append("super=").append(super.toString());
        sb.append("computeCapacityTopologyId=")
                .append(String.valueOf(this.computeCapacityTopologyId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", totalComputeBareMetalHostCount=")
                .append(String.valueOf(this.totalComputeBareMetalHostCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeHpcIsland)) {
            return false;
        }

        ComputeHpcIsland other = (ComputeHpcIsland) o;
        return java.util.Objects.equals(
                        this.computeCapacityTopologyId, other.computeCapacityTopologyId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.totalComputeBareMetalHostCount, other.totalComputeBareMetalHostCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.computeCapacityTopologyId == null
                                ? 43
                                : this.computeCapacityTopologyId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.totalComputeBareMetalHostCount == null
                                ? 43
                                : this.totalComputeBareMetalHostCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
