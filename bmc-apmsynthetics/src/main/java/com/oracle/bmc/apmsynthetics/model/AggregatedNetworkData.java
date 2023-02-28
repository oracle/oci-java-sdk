/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * aggregated network data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AggregatedNetworkData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AggregatedNetworkData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resultState",
        "vantagePointNodes",
        "nodesByLevel",
        "links",
        "errorDetails"
    })
    public AggregatedNetworkData(
            ResultState resultState,
            java.util.List<VantagePointNode> vantagePointNodes,
            java.util.List<java.util.List<Node>> nodesByLevel,
            java.util.Map<String, Link> links,
            String errorDetails) {
        super();
        this.resultState = resultState;
        this.vantagePointNodes = vantagePointNodes;
        this.nodesByLevel = nodesByLevel;
        this.links = links;
        this.errorDetails = errorDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** state of the result */
        @com.fasterxml.jackson.annotation.JsonProperty("resultState")
        private ResultState resultState;

        /**
         * state of the result
         *
         * @param resultState the value to set
         * @return this builder
         */
        public Builder resultState(ResultState resultState) {
            this.resultState = resultState;
            this.__explicitlySet__.add("resultState");
            return this;
        }
        /** List of VantagePointNode items. */
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointNodes")
        private java.util.List<VantagePointNode> vantagePointNodes;

        /**
         * List of VantagePointNode items.
         *
         * @param vantagePointNodes the value to set
         * @return this builder
         */
        public Builder vantagePointNodes(java.util.List<VantagePointNode> vantagePointNodes) {
            this.vantagePointNodes = vantagePointNodes;
            this.__explicitlySet__.add("vantagePointNodes");
            return this;
        }
        /** 2d array of nodes where each internal array corresponds to 1 level */
        @com.fasterxml.jackson.annotation.JsonProperty("nodesByLevel")
        private java.util.List<java.util.List<Node>> nodesByLevel;

        /**
         * 2d array of nodes where each internal array corresponds to 1 level
         *
         * @param nodesByLevel the value to set
         * @return this builder
         */
        public Builder nodesByLevel(java.util.List<java.util.List<Node>> nodesByLevel) {
            this.nodesByLevel = nodesByLevel;
            this.__explicitlySet__.add("nodesByLevel");
            return this;
        }
        /** map of Link objects */
        @com.fasterxml.jackson.annotation.JsonProperty("links")
        private java.util.Map<String, Link> links;

        /**
         * map of Link objects
         *
         * @param links the value to set
         * @return this builder
         */
        public Builder links(java.util.Map<String, Link> links) {
            this.links = links;
            this.__explicitlySet__.add("links");
            return this;
        }
        /** string contaiing error details */
        @com.fasterxml.jackson.annotation.JsonProperty("errorDetails")
        private String errorDetails;

        /**
         * string contaiing error details
         *
         * @param errorDetails the value to set
         * @return this builder
         */
        public Builder errorDetails(String errorDetails) {
            this.errorDetails = errorDetails;
            this.__explicitlySet__.add("errorDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AggregatedNetworkData build() {
            AggregatedNetworkData model =
                    new AggregatedNetworkData(
                            this.resultState,
                            this.vantagePointNodes,
                            this.nodesByLevel,
                            this.links,
                            this.errorDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AggregatedNetworkData model) {
            if (model.wasPropertyExplicitlySet("resultState")) {
                this.resultState(model.getResultState());
            }
            if (model.wasPropertyExplicitlySet("vantagePointNodes")) {
                this.vantagePointNodes(model.getVantagePointNodes());
            }
            if (model.wasPropertyExplicitlySet("nodesByLevel")) {
                this.nodesByLevel(model.getNodesByLevel());
            }
            if (model.wasPropertyExplicitlySet("links")) {
                this.links(model.getLinks());
            }
            if (model.wasPropertyExplicitlySet("errorDetails")) {
                this.errorDetails(model.getErrorDetails());
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

    /** state of the result */
    public enum ResultState implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        Failure("FAILURE"),
        Partial("PARTIAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResultState.class);

        private final String value;
        private static java.util.Map<String, ResultState> map;

        static {
            map = new java.util.HashMap<>();
            for (ResultState v : ResultState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResultState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResultState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResultState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** state of the result */
    @com.fasterxml.jackson.annotation.JsonProperty("resultState")
    private final ResultState resultState;

    /**
     * state of the result
     *
     * @return the value
     */
    public ResultState getResultState() {
        return resultState;
    }

    /** List of VantagePointNode items. */
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointNodes")
    private final java.util.List<VantagePointNode> vantagePointNodes;

    /**
     * List of VantagePointNode items.
     *
     * @return the value
     */
    public java.util.List<VantagePointNode> getVantagePointNodes() {
        return vantagePointNodes;
    }

    /** 2d array of nodes where each internal array corresponds to 1 level */
    @com.fasterxml.jackson.annotation.JsonProperty("nodesByLevel")
    private final java.util.List<java.util.List<Node>> nodesByLevel;

    /**
     * 2d array of nodes where each internal array corresponds to 1 level
     *
     * @return the value
     */
    public java.util.List<java.util.List<Node>> getNodesByLevel() {
        return nodesByLevel;
    }

    /** map of Link objects */
    @com.fasterxml.jackson.annotation.JsonProperty("links")
    private final java.util.Map<String, Link> links;

    /**
     * map of Link objects
     *
     * @return the value
     */
    public java.util.Map<String, Link> getLinks() {
        return links;
    }

    /** string contaiing error details */
    @com.fasterxml.jackson.annotation.JsonProperty("errorDetails")
    private final String errorDetails;

    /**
     * string contaiing error details
     *
     * @return the value
     */
    public String getErrorDetails() {
        return errorDetails;
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
        sb.append("AggregatedNetworkData(");
        sb.append("super=").append(super.toString());
        sb.append("resultState=").append(String.valueOf(this.resultState));
        sb.append(", vantagePointNodes=").append(String.valueOf(this.vantagePointNodes));
        sb.append(", nodesByLevel=").append(String.valueOf(this.nodesByLevel));
        sb.append(", links=").append(String.valueOf(this.links));
        sb.append(", errorDetails=").append(String.valueOf(this.errorDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregatedNetworkData)) {
            return false;
        }

        AggregatedNetworkData other = (AggregatedNetworkData) o;
        return java.util.Objects.equals(this.resultState, other.resultState)
                && java.util.Objects.equals(this.vantagePointNodes, other.vantagePointNodes)
                && java.util.Objects.equals(this.nodesByLevel, other.nodesByLevel)
                && java.util.Objects.equals(this.links, other.links)
                && java.util.Objects.equals(this.errorDetails, other.errorDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultState == null ? 43 : this.resultState.hashCode());
        result =
                (result * PRIME)
                        + (this.vantagePointNodes == null ? 43 : this.vantagePointNodes.hashCode());
        result = (result * PRIME) + (this.nodesByLevel == null ? 43 : this.nodesByLevel.hashCode());
        result = (result * PRIME) + (this.links == null ? 43 : this.links.hashCode());
        result = (result * PRIME) + (this.errorDetails == null ? 43 : this.errorDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
