/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the traffic route taken in the path in {@code PathAnalysisResult}.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TrafficRoute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TrafficRoute extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reachabilityStatus", "nodes", "routeAnalysisDescription"})
    public TrafficRoute(
            ReachabilityStatus reachabilityStatus,
            java.util.List<TrafficNode> nodes,
            String routeAnalysisDescription) {
        super();
        this.reachabilityStatus = reachabilityStatus;
        this.nodes = nodes;
        this.routeAnalysisDescription = routeAnalysisDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Reachability status for the given traffic route.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reachabilityStatus")
        private ReachabilityStatus reachabilityStatus;

        /**
         * Reachability status for the given traffic route.
         * @param reachabilityStatus the value to set
         * @return this builder
         **/
        public Builder reachabilityStatus(ReachabilityStatus reachabilityStatus) {
            this.reachabilityStatus = reachabilityStatus;
            this.__explicitlySet__.add("reachabilityStatus");
            return this;
        }
        /**
         * The ordered sequence of nodes in the given the traffic route forming a path.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<TrafficNode> nodes;

        /**
         * The ordered sequence of nodes in the given the traffic route forming a path.
         * @param nodes the value to set
         * @return this builder
         **/
        public Builder nodes(java.util.List<TrafficNode> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }
        /**
         * A description of the traffic route analysis. For example: "Traffic might not reach a destination
         * due to the LB backend being unhealthy".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeAnalysisDescription")
        private String routeAnalysisDescription;

        /**
         * A description of the traffic route analysis. For example: "Traffic might not reach a destination
         * due to the LB backend being unhealthy".
         *
         * @param routeAnalysisDescription the value to set
         * @return this builder
         **/
        public Builder routeAnalysisDescription(String routeAnalysisDescription) {
            this.routeAnalysisDescription = routeAnalysisDescription;
            this.__explicitlySet__.add("routeAnalysisDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TrafficRoute build() {
            TrafficRoute model =
                    new TrafficRoute(
                            this.reachabilityStatus, this.nodes, this.routeAnalysisDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrafficRoute model) {
            if (model.wasPropertyExplicitlySet("reachabilityStatus")) {
                this.reachabilityStatus(model.getReachabilityStatus());
            }
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
            }
            if (model.wasPropertyExplicitlySet("routeAnalysisDescription")) {
                this.routeAnalysisDescription(model.getRouteAnalysisDescription());
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
     * Reachability status for the given traffic route.
     **/
    public enum ReachabilityStatus {
        Reachable("REACHABLE"),
        Unreachable("UNREACHABLE"),
        Indeterminate("INDETERMINATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReachabilityStatus.class);

        private final String value;
        private static java.util.Map<String, ReachabilityStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ReachabilityStatus v : ReachabilityStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReachabilityStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReachabilityStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReachabilityStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Reachability status for the given traffic route.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reachabilityStatus")
    private final ReachabilityStatus reachabilityStatus;

    /**
     * Reachability status for the given traffic route.
     * @return the value
     **/
    public ReachabilityStatus getReachabilityStatus() {
        return reachabilityStatus;
    }

    /**
     * The ordered sequence of nodes in the given the traffic route forming a path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<TrafficNode> nodes;

    /**
     * The ordered sequence of nodes in the given the traffic route forming a path.
     * @return the value
     **/
    public java.util.List<TrafficNode> getNodes() {
        return nodes;
    }

    /**
     * A description of the traffic route analysis. For example: "Traffic might not reach a destination
     * due to the LB backend being unhealthy".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeAnalysisDescription")
    private final String routeAnalysisDescription;

    /**
     * A description of the traffic route analysis. For example: "Traffic might not reach a destination
     * due to the LB backend being unhealthy".
     *
     * @return the value
     **/
    public String getRouteAnalysisDescription() {
        return routeAnalysisDescription;
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
        sb.append("TrafficRoute(");
        sb.append("super=").append(super.toString());
        sb.append("reachabilityStatus=").append(String.valueOf(this.reachabilityStatus));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(", routeAnalysisDescription=")
                .append(String.valueOf(this.routeAnalysisDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrafficRoute)) {
            return false;
        }

        TrafficRoute other = (TrafficRoute) o;
        return java.util.Objects.equals(this.reachabilityStatus, other.reachabilityStatus)
                && java.util.Objects.equals(this.nodes, other.nodes)
                && java.util.Objects.equals(
                        this.routeAnalysisDescription, other.routeAnalysisDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reachabilityStatus == null
                                ? 43
                                : this.reachabilityStatus.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result =
                (result * PRIME)
                        + (this.routeAnalysisDescription == null
                                ? 43
                                : this.routeAnalysisDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
