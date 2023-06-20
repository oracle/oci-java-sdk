/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Object for request additional nodes for a roverCluster
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestAdditionalNodesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestAdditionalNodesDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"numberOfAdditionalNodes"})
    public RequestAdditionalNodesDetails(Integer numberOfAdditionalNodes) {
        super();
        this.numberOfAdditionalNodes = numberOfAdditionalNodes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of additional nodes to be requested for a roverCluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfAdditionalNodes")
        private Integer numberOfAdditionalNodes;

        /**
         * Number of additional nodes to be requested for a roverCluster.
         * @param numberOfAdditionalNodes the value to set
         * @return this builder
         **/
        public Builder numberOfAdditionalNodes(Integer numberOfAdditionalNodes) {
            this.numberOfAdditionalNodes = numberOfAdditionalNodes;
            this.__explicitlySet__.add("numberOfAdditionalNodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestAdditionalNodesDetails build() {
            RequestAdditionalNodesDetails model =
                    new RequestAdditionalNodesDetails(this.numberOfAdditionalNodes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestAdditionalNodesDetails model) {
            if (model.wasPropertyExplicitlySet("numberOfAdditionalNodes")) {
                this.numberOfAdditionalNodes(model.getNumberOfAdditionalNodes());
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
     * Number of additional nodes to be requested for a roverCluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfAdditionalNodes")
    private final Integer numberOfAdditionalNodes;

    /**
     * Number of additional nodes to be requested for a roverCluster.
     * @return the value
     **/
    public Integer getNumberOfAdditionalNodes() {
        return numberOfAdditionalNodes;
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
        sb.append("RequestAdditionalNodesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("numberOfAdditionalNodes=").append(String.valueOf(this.numberOfAdditionalNodes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestAdditionalNodesDetails)) {
            return false;
        }

        RequestAdditionalNodesDetails other = (RequestAdditionalNodesDetails) o;
        return java.util.Objects.equals(this.numberOfAdditionalNodes, other.numberOfAdditionalNodes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.numberOfAdditionalNodes == null
                                ? 43
                                : this.numberOfAdditionalNodes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
