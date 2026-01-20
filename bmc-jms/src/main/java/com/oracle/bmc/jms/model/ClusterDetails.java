/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The state of the cluster during a specified time period. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterType", "nodeCount", "podCount", "containerCount"})
    public ClusterDetails(
            ClusterType clusterType, Integer nodeCount, Integer podCount, Integer containerCount) {
        super();
        this.clusterType = clusterType;
        this.nodeCount = nodeCount;
        this.podCount = podCount;
        this.containerCount = containerCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
        private ClusterType clusterType;

        /**
         * The type of the cluster.
         *
         * @param clusterType the value to set
         * @return this builder
         */
        public Builder clusterType(ClusterType clusterType) {
            this.clusterType = clusterType;
            this.__explicitlySet__.add("clusterType");
            return this;
        }
        /** Number of nodes as reported in the last cluster scan */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * Number of nodes as reported in the last cluster scan
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** Number of pods as reported in the last cluster scan */
        @com.fasterxml.jackson.annotation.JsonProperty("podCount")
        private Integer podCount;

        /**
         * Number of pods as reported in the last cluster scan
         *
         * @param podCount the value to set
         * @return this builder
         */
        public Builder podCount(Integer podCount) {
            this.podCount = podCount;
            this.__explicitlySet__.add("podCount");
            return this;
        }
        /** Number of containers as reported in the last cluster scan */
        @com.fasterxml.jackson.annotation.JsonProperty("containerCount")
        private Integer containerCount;

        /**
         * Number of containers as reported in the last cluster scan
         *
         * @param containerCount the value to set
         * @return this builder
         */
        public Builder containerCount(Integer containerCount) {
            this.containerCount = containerCount;
            this.__explicitlySet__.add("containerCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterDetails build() {
            ClusterDetails model =
                    new ClusterDetails(
                            this.clusterType, this.nodeCount, this.podCount, this.containerCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterDetails model) {
            if (model.wasPropertyExplicitlySet("clusterType")) {
                this.clusterType(model.getClusterType());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("podCount")) {
                this.podCount(model.getPodCount());
            }
            if (model.wasPropertyExplicitlySet("containerCount")) {
                this.containerCount(model.getContainerCount());
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

    /** The type of the cluster. */
    public enum ClusterType implements com.oracle.bmc.http.internal.BmcEnum {
        Oke("OKE"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClusterType.class);

        private final String value;
        private static java.util.Map<String, ClusterType> map;

        static {
            map = new java.util.HashMap<>();
            for (ClusterType v : ClusterType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClusterType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClusterType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClusterType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
    private final ClusterType clusterType;

    /**
     * The type of the cluster.
     *
     * @return the value
     */
    public ClusterType getClusterType() {
        return clusterType;
    }

    /** Number of nodes as reported in the last cluster scan */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * Number of nodes as reported in the last cluster scan
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** Number of pods as reported in the last cluster scan */
    @com.fasterxml.jackson.annotation.JsonProperty("podCount")
    private final Integer podCount;

    /**
     * Number of pods as reported in the last cluster scan
     *
     * @return the value
     */
    public Integer getPodCount() {
        return podCount;
    }

    /** Number of containers as reported in the last cluster scan */
    @com.fasterxml.jackson.annotation.JsonProperty("containerCount")
    private final Integer containerCount;

    /**
     * Number of containers as reported in the last cluster scan
     *
     * @return the value
     */
    public Integer getContainerCount() {
        return containerCount;
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
        sb.append("ClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterType=").append(String.valueOf(this.clusterType));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", podCount=").append(String.valueOf(this.podCount));
        sb.append(", containerCount=").append(String.valueOf(this.containerCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterDetails)) {
            return false;
        }

        ClusterDetails other = (ClusterDetails) o;
        return java.util.Objects.equals(this.clusterType, other.clusterType)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.podCount, other.podCount)
                && java.util.Objects.equals(this.containerCount, other.containerCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterType == null ? 43 : this.clusterType.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.podCount == null ? 43 : this.podCount.hashCode());
        result =
                (result * PRIME)
                        + (this.containerCount == null ? 43 : this.containerCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
