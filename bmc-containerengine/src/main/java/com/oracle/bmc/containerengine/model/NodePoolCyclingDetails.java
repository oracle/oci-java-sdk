/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Node Pool Cycling Details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NodePoolCyclingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NodePoolCyclingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maximumUnavailable",
        "maximumSurge",
        "isNodeCyclingEnabled",
        "cycleModes"
    })
    public NodePoolCyclingDetails(
            String maximumUnavailable,
            String maximumSurge,
            Boolean isNodeCyclingEnabled,
            java.util.List<CycleMode> cycleModes) {
        super();
        this.maximumUnavailable = maximumUnavailable;
        this.maximumSurge = maximumSurge;
        this.isNodeCyclingEnabled = isNodeCyclingEnabled;
        this.cycleModes = cycleModes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Maximum active nodes that would be terminated from nodepool during the cycling nodepool
         * process. OKE supports both integer and percentage input. Defaults to 0, Ranges from 0 to
         * Nodepool size or 0% to 100%
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumUnavailable")
        private String maximumUnavailable;

        /**
         * Maximum active nodes that would be terminated from nodepool during the cycling nodepool
         * process. OKE supports both integer and percentage input. Defaults to 0, Ranges from 0 to
         * Nodepool size or 0% to 100%
         *
         * @param maximumUnavailable the value to set
         * @return this builder
         */
        public Builder maximumUnavailable(String maximumUnavailable) {
            this.maximumUnavailable = maximumUnavailable;
            this.__explicitlySet__.add("maximumUnavailable");
            return this;
        }
        /**
         * Maximum additional new compute instances that would be temporarily created and added to
         * nodepool during the cycling nodepool process. OKE supports both integer and percentage
         * input. Defaults to 1, Ranges from 0 to Nodepool size or 0% to 100%
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumSurge")
        private String maximumSurge;

        /**
         * Maximum additional new compute instances that would be temporarily created and added to
         * nodepool during the cycling nodepool process. OKE supports both integer and percentage
         * input. Defaults to 1, Ranges from 0 to Nodepool size or 0% to 100%
         *
         * @param maximumSurge the value to set
         * @return this builder
         */
        public Builder maximumSurge(String maximumSurge) {
            this.maximumSurge = maximumSurge;
            this.__explicitlySet__.add("maximumSurge");
            return this;
        }
        /** If cycling operation should be performed on the nodes in the node pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("isNodeCyclingEnabled")
        private Boolean isNodeCyclingEnabled;

        /**
         * If cycling operation should be performed on the nodes in the node pool.
         *
         * @param isNodeCyclingEnabled the value to set
         * @return this builder
         */
        public Builder isNodeCyclingEnabled(Boolean isNodeCyclingEnabled) {
            this.isNodeCyclingEnabled = isNodeCyclingEnabled;
            this.__explicitlySet__.add("isNodeCyclingEnabled");
            return this;
        }
        /** An ordered list of cycle modes that should be performed on the OKE nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("cycleModes")
        private java.util.List<CycleMode> cycleModes;

        /**
         * An ordered list of cycle modes that should be performed on the OKE nodes.
         *
         * @param cycleModes the value to set
         * @return this builder
         */
        public Builder cycleModes(java.util.List<CycleMode> cycleModes) {
            this.cycleModes = cycleModes;
            this.__explicitlySet__.add("cycleModes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolCyclingDetails build() {
            NodePoolCyclingDetails model =
                    new NodePoolCyclingDetails(
                            this.maximumUnavailable,
                            this.maximumSurge,
                            this.isNodeCyclingEnabled,
                            this.cycleModes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolCyclingDetails model) {
            if (model.wasPropertyExplicitlySet("maximumUnavailable")) {
                this.maximumUnavailable(model.getMaximumUnavailable());
            }
            if (model.wasPropertyExplicitlySet("maximumSurge")) {
                this.maximumSurge(model.getMaximumSurge());
            }
            if (model.wasPropertyExplicitlySet("isNodeCyclingEnabled")) {
                this.isNodeCyclingEnabled(model.getIsNodeCyclingEnabled());
            }
            if (model.wasPropertyExplicitlySet("cycleModes")) {
                this.cycleModes(model.getCycleModes());
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
     * Maximum active nodes that would be terminated from nodepool during the cycling nodepool
     * process. OKE supports both integer and percentage input. Defaults to 0, Ranges from 0 to
     * Nodepool size or 0% to 100%
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumUnavailable")
    private final String maximumUnavailable;

    /**
     * Maximum active nodes that would be terminated from nodepool during the cycling nodepool
     * process. OKE supports both integer and percentage input. Defaults to 0, Ranges from 0 to
     * Nodepool size or 0% to 100%
     *
     * @return the value
     */
    public String getMaximumUnavailable() {
        return maximumUnavailable;
    }

    /**
     * Maximum additional new compute instances that would be temporarily created and added to
     * nodepool during the cycling nodepool process. OKE supports both integer and percentage input.
     * Defaults to 1, Ranges from 0 to Nodepool size or 0% to 100%
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumSurge")
    private final String maximumSurge;

    /**
     * Maximum additional new compute instances that would be temporarily created and added to
     * nodepool during the cycling nodepool process. OKE supports both integer and percentage input.
     * Defaults to 1, Ranges from 0 to Nodepool size or 0% to 100%
     *
     * @return the value
     */
    public String getMaximumSurge() {
        return maximumSurge;
    }

    /** If cycling operation should be performed on the nodes in the node pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("isNodeCyclingEnabled")
    private final Boolean isNodeCyclingEnabled;

    /**
     * If cycling operation should be performed on the nodes in the node pool.
     *
     * @return the value
     */
    public Boolean getIsNodeCyclingEnabled() {
        return isNodeCyclingEnabled;
    }

    /** An ordered list of cycle modes that should be performed on the OKE nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("cycleModes")
    private final java.util.List<CycleMode> cycleModes;

    /**
     * An ordered list of cycle modes that should be performed on the OKE nodes.
     *
     * @return the value
     */
    public java.util.List<CycleMode> getCycleModes() {
        return cycleModes;
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
        sb.append("NodePoolCyclingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maximumUnavailable=").append(String.valueOf(this.maximumUnavailable));
        sb.append(", maximumSurge=").append(String.valueOf(this.maximumSurge));
        sb.append(", isNodeCyclingEnabled=").append(String.valueOf(this.isNodeCyclingEnabled));
        sb.append(", cycleModes=").append(String.valueOf(this.cycleModes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodePoolCyclingDetails)) {
            return false;
        }

        NodePoolCyclingDetails other = (NodePoolCyclingDetails) o;
        return java.util.Objects.equals(this.maximumUnavailable, other.maximumUnavailable)
                && java.util.Objects.equals(this.maximumSurge, other.maximumSurge)
                && java.util.Objects.equals(this.isNodeCyclingEnabled, other.isNodeCyclingEnabled)
                && java.util.Objects.equals(this.cycleModes, other.cycleModes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maximumUnavailable == null
                                ? 43
                                : this.maximumUnavailable.hashCode());
        result = (result * PRIME) + (this.maximumSurge == null ? 43 : this.maximumSurge.hashCode());
        result =
                (result * PRIME)
                        + (this.isNodeCyclingEnabled == null
                                ? 43
                                : this.isNodeCyclingEnabled.hashCode());
        result = (result * PRIME) + (this.cycleModes == null ? 43 : this.cycleModes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
