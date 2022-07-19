/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waa.model;

/**
 * The information about new WebAppAccelerationLoadBalancer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211230")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateWebAppAccelerationLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "backendType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateWebAppAccelerationLoadBalancerDetails
        extends CreateWebAppAccelerationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("webAppAccelerationPolicyId")
        private String webAppAccelerationPolicyId;

        public Builder webAppAccelerationPolicyId(String webAppAccelerationPolicyId) {
            this.webAppAccelerationPolicyId = webAppAccelerationPolicyId;
            this.__explicitlySet__.add("webAppAccelerationPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * LoadBalancer [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to which the WebAppAccelerationPolicy is attached to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        /**
         * LoadBalancer [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to which the WebAppAccelerationPolicy is attached to.
         * @param loadBalancerId the value to set
         * @return this builder
         **/
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            this.__explicitlySet__.add("loadBalancerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWebAppAccelerationLoadBalancerDetails build() {
            CreateWebAppAccelerationLoadBalancerDetails __instance__ =
                    new CreateWebAppAccelerationLoadBalancerDetails(
                            displayName,
                            compartmentId,
                            webAppAccelerationPolicyId,
                            freeformTags,
                            definedTags,
                            systemTags,
                            loadBalancerId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWebAppAccelerationLoadBalancerDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .webAppAccelerationPolicyId(o.getWebAppAccelerationPolicyId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .loadBalancerId(o.getLoadBalancerId());

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

    @Deprecated
    public CreateWebAppAccelerationLoadBalancerDetails(
            String displayName,
            String compartmentId,
            String webAppAccelerationPolicyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String loadBalancerId) {
        super(
                displayName,
                compartmentId,
                webAppAccelerationPolicyId,
                freeformTags,
                definedTags,
                systemTags);
        this.loadBalancerId = loadBalancerId;
    }

    /**
     * LoadBalancer [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to which the WebAppAccelerationPolicy is attached to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    private final String loadBalancerId;

    /**
     * LoadBalancer [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to which the WebAppAccelerationPolicy is attached to.
     * @return the value
     **/
    public String getLoadBalancerId() {
        return loadBalancerId;
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
        sb.append("CreateWebAppAccelerationLoadBalancerDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", loadBalancerId=").append(String.valueOf(this.loadBalancerId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWebAppAccelerationLoadBalancerDetails)) {
            return false;
        }

        CreateWebAppAccelerationLoadBalancerDetails other =
                (CreateWebAppAccelerationLoadBalancerDetails) o;
        return java.util.Objects.equals(this.loadBalancerId, other.loadBalancerId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.loadBalancerId == null ? 43 : this.loadBalancerId.hashCode());
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
