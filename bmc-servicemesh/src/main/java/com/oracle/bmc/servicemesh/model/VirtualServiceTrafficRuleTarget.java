/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Traffic router target for an ingress gateway. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualServiceTrafficRuleTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualServiceTrafficRuleTarget extends TrafficRuleTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the virtual service where the request will be routed. */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualServiceId")
        private String virtualServiceId;

        /**
         * The OCID of the virtual service where the request will be routed.
         *
         * @param virtualServiceId the value to set
         * @return this builder
         */
        public Builder virtualServiceId(String virtualServiceId) {
            this.virtualServiceId = virtualServiceId;
            this.__explicitlySet__.add("virtualServiceId");
            return this;
        }
        /**
         * The port on the virtual service to target. Mandatory if the virtual deployments are
         * listening on multiple ports.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port on the virtual service to target. Mandatory if the virtual deployments are
         * listening on multiple ports.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Weight of traffic target. */
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * Weight of traffic target.
         *
         * @param weight the value to set
         * @return this builder
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualServiceTrafficRuleTarget build() {
            VirtualServiceTrafficRuleTarget model =
                    new VirtualServiceTrafficRuleTarget(
                            this.virtualServiceId, this.port, this.weight);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualServiceTrafficRuleTarget model) {
            if (model.wasPropertyExplicitlySet("virtualServiceId")) {
                this.virtualServiceId(model.getVirtualServiceId());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
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

    @Deprecated
    public VirtualServiceTrafficRuleTarget(String virtualServiceId, Integer port, Integer weight) {
        super();
        this.virtualServiceId = virtualServiceId;
        this.port = port;
        this.weight = weight;
    }

    /** The OCID of the virtual service where the request will be routed. */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualServiceId")
    private final String virtualServiceId;

    /**
     * The OCID of the virtual service where the request will be routed.
     *
     * @return the value
     */
    public String getVirtualServiceId() {
        return virtualServiceId;
    }

    /**
     * The port on the virtual service to target. Mandatory if the virtual deployments are listening
     * on multiple ports.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port on the virtual service to target. Mandatory if the virtual deployments are listening
     * on multiple ports.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Weight of traffic target. */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * Weight of traffic target.
     *
     * @return the value
     */
    public Integer getWeight() {
        return weight;
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
        sb.append("VirtualServiceTrafficRuleTarget(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", virtualServiceId=").append(String.valueOf(this.virtualServiceId));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualServiceTrafficRuleTarget)) {
            return false;
        }

        VirtualServiceTrafficRuleTarget other = (VirtualServiceTrafficRuleTarget) o;
        return java.util.Objects.equals(this.virtualServiceId, other.virtualServiceId)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.weight, other.weight)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualServiceId == null ? 43 : this.virtualServiceId.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        return result;
    }
}
