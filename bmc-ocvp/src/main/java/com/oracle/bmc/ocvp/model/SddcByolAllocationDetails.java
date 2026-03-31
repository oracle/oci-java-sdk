/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The BYOL allocations used for VMware SDDC provisioning.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SddcByolAllocationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SddcByolAllocationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"loadBalancerByolAllocationId", "loadBalancerInstanceCount"})
    public SddcByolAllocationDetails(
            String loadBalancerByolAllocationId, Integer loadBalancerInstanceCount) {
        super();
        this.loadBalancerByolAllocationId = loadBalancerByolAllocationId;
        this.loadBalancerInstanceCount = loadBalancerInstanceCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware Avi Load Balancer.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerByolAllocationId")
        private String loadBalancerByolAllocationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware Avi Load Balancer.
         *
         * @param loadBalancerByolAllocationId the value to set
         * @return this builder
         **/
        public Builder loadBalancerByolAllocationId(String loadBalancerByolAllocationId) {
            this.loadBalancerByolAllocationId = loadBalancerByolAllocationId;
            this.__explicitlySet__.add("loadBalancerByolAllocationId");
            return this;
        }
        /**
         * The number of VMware Avi Load Balancer instances to be deployed on VMware SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerInstanceCount")
        private Integer loadBalancerInstanceCount;

        /**
         * The number of VMware Avi Load Balancer instances to be deployed on VMware SDDC.
         *
         * @param loadBalancerInstanceCount the value to set
         * @return this builder
         **/
        public Builder loadBalancerInstanceCount(Integer loadBalancerInstanceCount) {
            this.loadBalancerInstanceCount = loadBalancerInstanceCount;
            this.__explicitlySet__.add("loadBalancerInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SddcByolAllocationDetails build() {
            SddcByolAllocationDetails model =
                    new SddcByolAllocationDetails(
                            this.loadBalancerByolAllocationId, this.loadBalancerInstanceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SddcByolAllocationDetails model) {
            if (model.wasPropertyExplicitlySet("loadBalancerByolAllocationId")) {
                this.loadBalancerByolAllocationId(model.getLoadBalancerByolAllocationId());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerInstanceCount")) {
                this.loadBalancerInstanceCount(model.getLoadBalancerInstanceCount());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware Avi Load Balancer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerByolAllocationId")
    private final String loadBalancerByolAllocationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VMware BYOL Allocation used to deploy VMware Avi Load Balancer.
     *
     * @return the value
     **/
    public String getLoadBalancerByolAllocationId() {
        return loadBalancerByolAllocationId;
    }

    /**
     * The number of VMware Avi Load Balancer instances to be deployed on VMware SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerInstanceCount")
    private final Integer loadBalancerInstanceCount;

    /**
     * The number of VMware Avi Load Balancer instances to be deployed on VMware SDDC.
     *
     * @return the value
     **/
    public Integer getLoadBalancerInstanceCount() {
        return loadBalancerInstanceCount;
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
        sb.append("SddcByolAllocationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("loadBalancerByolAllocationId=")
                .append(String.valueOf(this.loadBalancerByolAllocationId));
        sb.append(", loadBalancerInstanceCount=")
                .append(String.valueOf(this.loadBalancerInstanceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SddcByolAllocationDetails)) {
            return false;
        }

        SddcByolAllocationDetails other = (SddcByolAllocationDetails) o;
        return java.util.Objects.equals(
                        this.loadBalancerByolAllocationId, other.loadBalancerByolAllocationId)
                && java.util.Objects.equals(
                        this.loadBalancerInstanceCount, other.loadBalancerInstanceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.loadBalancerByolAllocationId == null
                                ? 43
                                : this.loadBalancerByolAllocationId.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerInstanceCount == null
                                ? 43
                                : this.loadBalancerInstanceCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
