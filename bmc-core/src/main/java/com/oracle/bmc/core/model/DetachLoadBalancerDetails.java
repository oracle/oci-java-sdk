/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents a load balancer that is to be detached from an instance pool. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetachLoadBalancerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetachLoadBalancerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"loadBalancerId", "backendSetName"})
    public DetachLoadBalancerDetails(String loadBalancerId, String backendSetName) {
        super();
        this.loadBalancerId = loadBalancerId;
        this.backendSetName = backendSetName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the load balancer to detach from the instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * The OCID of the load balancer to detach from the instance pool.
         *
         * @param loadBalancerId the value to set
         * @return this builder
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }
        /** The name of the backend set on the load balancer to detach from the instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the backend set on the load balancer to detach from the instance pool.
         *
         * @param backendSetName the value to set
         * @return this builder
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetachLoadBalancerDetails build() {
            DetachLoadBalancerDetails model =
                    new DetachLoadBalancerDetails(this.loadBalancerId, this.backendSetName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("loadBalancerId")) {
                this.loadBalancerId(model.getLoadBalancerId());
            }
            if (model.wasPropertyExplicitlySet("backendSetName")) {
                this.backendSetName(model.getBackendSetName());
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

    /** The OCID of the load balancer to detach from the instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * The OCID of the load balancer to detach from the instance pool.
     *
     * @return the value
     */
    public String getLoadBalancerId() {
        return loadBalancerId;
    }

    /** The name of the backend set on the load balancer to detach from the instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the backend set on the load balancer to detach from the instance pool.
     *
     * @return the value
     */
    public String getBackendSetName() {
        return backendSetName;
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
        sb.append("DetachLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachLoadBalancerDetails)) {
            return false;
        }

        DetachLoadBalancerDetails other = (DetachLoadBalancerDetails) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
