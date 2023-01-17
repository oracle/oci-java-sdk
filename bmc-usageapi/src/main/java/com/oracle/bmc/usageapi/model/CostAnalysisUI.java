/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The common fields for Cost Analysis UI rendering.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CostAnalysisUI.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CostAnalysisUI extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"graph", "isCumulativeGraph"})
    public CostAnalysisUI(Graph graph, Boolean isCumulativeGraph) {
        super();
        this.graph = graph;
        this.isCumulativeGraph = isCumulativeGraph;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The graph type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("graph")
        private Graph graph;

        /**
         * The graph type.
         * @param graph the value to set
         * @return this builder
         **/
        public Builder graph(Graph graph) {
            this.graph = graph;
            this.__explicitlySet__.add("graph");
            return this;
        }
        /**
         * A cumulative graph.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCumulativeGraph")
        private Boolean isCumulativeGraph;

        /**
         * A cumulative graph.
         * @param isCumulativeGraph the value to set
         * @return this builder
         **/
        public Builder isCumulativeGraph(Boolean isCumulativeGraph) {
            this.isCumulativeGraph = isCumulativeGraph;
            this.__explicitlySet__.add("isCumulativeGraph");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostAnalysisUI build() {
            CostAnalysisUI model = new CostAnalysisUI(this.graph, this.isCumulativeGraph);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostAnalysisUI model) {
            if (model.wasPropertyExplicitlySet("graph")) {
                this.graph(model.getGraph());
            }
            if (model.wasPropertyExplicitlySet("isCumulativeGraph")) {
                this.isCumulativeGraph(model.getIsCumulativeGraph());
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
     * The graph type.
     **/
    public enum Graph {
        Bars("BARS"),
        Lines("LINES"),
        StackedLines("STACKED_LINES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Graph.class);

        private final String value;
        private static java.util.Map<String, Graph> map;

        static {
            map = new java.util.HashMap<>();
            for (Graph v : Graph.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Graph(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Graph create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Graph', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The graph type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("graph")
    private final Graph graph;

    /**
     * The graph type.
     * @return the value
     **/
    public Graph getGraph() {
        return graph;
    }

    /**
     * A cumulative graph.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCumulativeGraph")
    private final Boolean isCumulativeGraph;

    /**
     * A cumulative graph.
     * @return the value
     **/
    public Boolean getIsCumulativeGraph() {
        return isCumulativeGraph;
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
        sb.append("CostAnalysisUI(");
        sb.append("super=").append(super.toString());
        sb.append("graph=").append(String.valueOf(this.graph));
        sb.append(", isCumulativeGraph=").append(String.valueOf(this.isCumulativeGraph));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostAnalysisUI)) {
            return false;
        }

        CostAnalysisUI other = (CostAnalysisUI) o;
        return java.util.Objects.equals(this.graph, other.graph)
                && java.util.Objects.equals(this.isCumulativeGraph, other.isCumulativeGraph)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.graph == null ? 43 : this.graph.hashCode());
        result =
                (result * PRIME)
                        + (this.isCumulativeGraph == null ? 43 : this.isCumulativeGraph.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
