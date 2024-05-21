/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents a load balancer that is to be attached to an instance pool.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttachLoadBalancerDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"loadBalancerId", "backendSetName", "port", "vnicSelection"})
    public AttachLoadBalancerDetails(
            String loadBalancerId, String backendSetName, Integer port, String vnicSelection) {
        super();
        this.loadBalancerId = loadBalancerId;
        this.backendSetName = backendSetName;
        this.port = port;
        this.vnicSelection = vnicSelection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         **/
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /**
         * The name of the backend set on the load balancer to add instances to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the backend set on the load balancer to add instances to.
         * @param backendSetName the value to set
         * @return this builder
         **/
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }
        /**
         * The port value to use when creating the backend set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port value to use when creating the backend set.
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * Indicates which VNIC on each instance in the pool should be used to associate with the load balancer.
         * Possible values are "PrimaryVnic" or the displayName of one of the secondary VNICs on the instance configuration
         * that is associated with the instance pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicSelection")
        private String vnicSelection;

        /**
         * Indicates which VNIC on each instance in the pool should be used to associate with the load balancer.
         * Possible values are "PrimaryVnic" or the displayName of one of the secondary VNICs on the instance configuration
         * that is associated with the instance pool.
         *
         * @param vnicSelection the value to set
         * @return this builder
         **/
        public Builder vnicSelection(String vnicSelection) {
            this.vnicSelection = vnicSelection;
            this.__explicitlySet__.add("vnicSelection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachLoadBalancerDetails build() {
            AttachLoadBalancerDetails model =
                    new AttachLoadBalancerDetails(
                            this.loadBalancerId,
                            this.backendSetName,
                            this.port,
                            this.vnicSelection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("loadBalancerId")) {
                this.loadBalancerId(model.getLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("backendSetName")) {
                this.backendSetName(model.getBackendSetName());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("vnicSelection")) {
                this.vnicSelection(model.getVnicSelection());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the load balancer to attach to the instance pool.
     *
     * @return the value
     **/
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /**
     * The name of the backend set on the load balancer to add instances to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the backend set on the load balancer to add instances to.
     * @return the value
     **/
    public String getBackendSetName() {
        return backendSetName;
    }

    /**
     * The port value to use when creating the backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port value to use when creating the backend set.
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * Indicates which VNIC on each instance in the pool should be used to associate with the load balancer.
     * Possible values are "PrimaryVnic" or the displayName of one of the secondary VNICs on the instance configuration
     * that is associated with the instance pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicSelection")
    private final String vnicSelection;

    /**
     * Indicates which VNIC on each instance in the pool should be used to associate with the load balancer.
     * Possible values are "PrimaryVnic" or the displayName of one of the secondary VNICs on the instance configuration
     * that is associated with the instance pool.
     *
     * @return the value
     **/
    public String getVnicSelection() {
        return vnicSelection;
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
        sb.append("AttachLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", vnicSelection=").append(String.valueOf(this.vnicSelection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachLoadBalancerDetails)) {
            return false;
        }

        AttachLoadBalancerDetails other = (AttachLoadBalancerDetails) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.vnicSelection, other.vnicSelection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.vnicSelection == null ? 43 : this.vnicSelection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
