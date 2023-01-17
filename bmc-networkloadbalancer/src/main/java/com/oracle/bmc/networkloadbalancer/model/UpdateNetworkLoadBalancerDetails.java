/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * Configuration details to update a network load balancer.
 *
 * <p>*Caution:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateNetworkLoadBalancerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateNetworkLoadBalancerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isPreserveSourceDestination",
        "nlbIpVersion",
        "freeformTags",
        "definedTags"
    })
    public UpdateNetworkLoadBalancerDetails(
            String displayName,
            Boolean isPreserveSourceDestination,
            NlbIpVersion nlbIpVersion,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.isPreserveSourceDestination = isPreserveSourceDestination;
        this.nlbIpVersion = nlbIpVersion;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-friendly display name for the network load balancer, which does not have to be
         * unique and can be changed. Avoid entering confidential information.
         *
         * <p>Example: {@code example_network_load_balancer}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name for the network load balancer, which does not have to be
         * unique and can be changed. Avoid entering confidential information.
         *
         * <p>Example: {@code example_network_load_balancer}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
         * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC,
         * and packets are sent to the backend with the entire IP header intact.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
        private Boolean isPreserveSourceDestination;

        /**
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
         * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC,
         * and packets are sent to the backend with the entire IP header intact.
         *
         * @param isPreserveSourceDestination the value to set
         * @return this builder
         */
        public Builder isPreserveSourceDestination(Boolean isPreserveSourceDestination) {
            this.isPreserveSourceDestination = isPreserveSourceDestination;
            this.__explicitlySet__.add("isPreserveSourceDestination");
            return this;
        }
        /** IP version associated with the NLB. */
        @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
        private NlbIpVersion nlbIpVersion;

        /**
         * IP version associated with the NLB.
         *
         * @param nlbIpVersion the value to set
         * @return this builder
         */
        public Builder nlbIpVersion(NlbIpVersion nlbIpVersion) {
            this.nlbIpVersion = nlbIpVersion;
            this.__explicitlySet__.add("nlbIpVersion");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNetworkLoadBalancerDetails build() {
            UpdateNetworkLoadBalancerDetails model =
                    new UpdateNetworkLoadBalancerDetails(
                            this.displayName,
                            this.isPreserveSourceDestination,
                            this.nlbIpVersion,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNetworkLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isPreserveSourceDestination")) {
                this.isPreserveSourceDestination(model.getIsPreserveSourceDestination());
            }
            if (model.wasPropertyExplicitlySet("nlbIpVersion")) {
                this.nlbIpVersion(model.getNlbIpVersion());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The user-friendly display name for the network load balancer, which does not have to be
     * unique and can be changed. Avoid entering confidential information.
     *
     * <p>Example: {@code example_network_load_balancer}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name for the network load balancer, which does not have to be
     * unique and can be changed. Avoid entering confidential information.
     *
     * <p>Example: {@code example_network_load_balancer}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
     * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC, and
     * packets are sent to the backend with the entire IP header intact.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
    private final Boolean isPreserveSourceDestination;

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
     * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC, and
     * packets are sent to the backend with the entire IP header intact.
     *
     * @return the value
     */
    public Boolean getIsPreserveSourceDestination() {
        return isPreserveSourceDestination;
    }

    /** IP version associated with the NLB. */
    @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
    private final NlbIpVersion nlbIpVersion;

    /**
     * IP version associated with the NLB.
     *
     * @return the value
     */
    public NlbIpVersion getNlbIpVersion() {
        return nlbIpVersion;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateNetworkLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPreserveSourceDestination=")
                .append(String.valueOf(this.isPreserveSourceDestination));
        sb.append(", nlbIpVersion=").append(String.valueOf(this.nlbIpVersion));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNetworkLoadBalancerDetails)) {
            return false;
        }

        UpdateNetworkLoadBalancerDetails other = (UpdateNetworkLoadBalancerDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.isPreserveSourceDestination, other.isPreserveSourceDestination)
                && java.util.Objects.equals(this.nlbIpVersion, other.nlbIpVersion)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreserveSourceDestination == null
                                ? 43
                                : this.isPreserveSourceDestination.hashCode());
        result = (result * PRIME) + (this.nlbIpVersion == null ? 43 : this.nlbIpVersion.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
