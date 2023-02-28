/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Traffic router target for a virtual service version. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualDeploymentTrafficRuleTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VirtualDeploymentTrafficRuleTarget extends TrafficRuleTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the virtual deployment where the request will be routed. */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualDeploymentId")
        private String virtualDeploymentId;

        /**
         * The OCID of the virtual deployment where the request will be routed.
         *
         * @param virtualDeploymentId the value to set
         * @return this builder
         */
        public Builder virtualDeploymentId(String virtualDeploymentId) {
            this.virtualDeploymentId = virtualDeploymentId;
            this.__explicitlySet__.add("virtualDeploymentId");
            return this;
        }
        /**
         * Port on virtual deployment to target. If port is missing, the rule will target all ports
         * on the virtual deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Port on virtual deployment to target. If port is missing, the rule will target all ports
         * on the virtual deployment.
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

        public VirtualDeploymentTrafficRuleTarget build() {
            VirtualDeploymentTrafficRuleTarget model =
                    new VirtualDeploymentTrafficRuleTarget(
                            this.virtualDeploymentId, this.port, this.weight);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualDeploymentTrafficRuleTarget model) {
            if (model.wasPropertyExplicitlySet("virtualDeploymentId")) {
                this.virtualDeploymentId(model.getVirtualDeploymentId());
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
    public VirtualDeploymentTrafficRuleTarget(
            String virtualDeploymentId, Integer port, Integer weight) {
        super();
        this.virtualDeploymentId = virtualDeploymentId;
        this.port = port;
        this.weight = weight;
    }

    /** The OCID of the virtual deployment where the request will be routed. */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualDeploymentId")
    private final String virtualDeploymentId;

    /**
     * The OCID of the virtual deployment where the request will be routed.
     *
     * @return the value
     */
    public String getVirtualDeploymentId() {
        return virtualDeploymentId;
    }

    /**
     * Port on virtual deployment to target. If port is missing, the rule will target all ports on
     * the virtual deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Port on virtual deployment to target. If port is missing, the rule will target all ports on
     * the virtual deployment.
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
        sb.append("VirtualDeploymentTrafficRuleTarget(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", virtualDeploymentId=").append(String.valueOf(this.virtualDeploymentId));
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
        if (!(o instanceof VirtualDeploymentTrafficRuleTarget)) {
            return false;
        }

        VirtualDeploymentTrafficRuleTarget other = (VirtualDeploymentTrafficRuleTarget) o;
        return java.util.Objects.equals(this.virtualDeploymentId, other.virtualDeploymentId)
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
                        + (this.virtualDeploymentId == null
                                ? 43
                                : this.virtualDeploymentId.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        return result;
    }
}
