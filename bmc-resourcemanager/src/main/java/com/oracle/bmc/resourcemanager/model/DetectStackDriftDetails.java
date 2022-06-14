/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * The details for detecting drift in a stack
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectStackDriftDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectStackDriftDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceAddresses"})
    public DetectStackDriftDetails(java.util.List<String> resourceAddresses) {
        super();
        this.resourceAddresses = resourceAddresses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of resources in the specified stack to detect drift for. Each resource is identified by a resource address,
         * which is a string derived from the resource type and name specified in the stack's Terraform configuration plus an optional index.
         * For example, the resource address for the fourth Compute instance with the name "test_instance" is oci_core_instance.test_instance[3].
         * For more details and examples of resource addresses, see the Terraform documentation at [Resource spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAddresses")
        private java.util.List<String> resourceAddresses;

        /**
         * The list of resources in the specified stack to detect drift for. Each resource is identified by a resource address,
         * which is a string derived from the resource type and name specified in the stack's Terraform configuration plus an optional index.
         * For example, the resource address for the fourth Compute instance with the name "test_instance" is oci_core_instance.test_instance[3].
         * For more details and examples of resource addresses, see the Terraform documentation at [Resource spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
         *
         * @param resourceAddresses the value to set
         * @return this builder
         **/
        public Builder resourceAddresses(java.util.List<String> resourceAddresses) {
            this.resourceAddresses = resourceAddresses;
            this.__explicitlySet__.add("resourceAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectStackDriftDetails build() {
            DetectStackDriftDetails __instance__ = new DetectStackDriftDetails(resourceAddresses);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectStackDriftDetails o) {
            Builder copiedBuilder = resourceAddresses(o.getResourceAddresses());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The list of resources in the specified stack to detect drift for. Each resource is identified by a resource address,
     * which is a string derived from the resource type and name specified in the stack's Terraform configuration plus an optional index.
     * For example, the resource address for the fourth Compute instance with the name "test_instance" is oci_core_instance.test_instance[3].
     * For more details and examples of resource addresses, see the Terraform documentation at [Resource spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAddresses")
    private final java.util.List<String> resourceAddresses;

    /**
     * The list of resources in the specified stack to detect drift for. Each resource is identified by a resource address,
     * which is a string derived from the resource type and name specified in the stack's Terraform configuration plus an optional index.
     * For example, the resource address for the fourth Compute instance with the name "test_instance" is oci_core_instance.test_instance[3].
     * For more details and examples of resource addresses, see the Terraform documentation at [Resource spec](https://www.terraform.io/docs/internals/resource-addressing.html#examples).
     *
     * @return the value
     **/
    public java.util.List<String> getResourceAddresses() {
        return resourceAddresses;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectStackDriftDetails(");
        sb.append("resourceAddresses=").append(String.valueOf(this.resourceAddresses));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectStackDriftDetails)) {
            return false;
        }

        DetectStackDriftDetails other = (DetectStackDriftDetails) o;
        return java.util.Objects.equals(this.resourceAddresses, other.resourceAddresses)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceAddresses == null ? 43 : this.resourceAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
