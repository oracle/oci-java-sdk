/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * The configuration to update on an existing bastion. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateBastionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBastionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxSessionTtlInSeconds",
        "staticJumpHostIpAddresses",
        "clientCidrBlockAllowList",
        "freeformTags",
        "definedTags",
        "securityAttributes"
    })
    public UpdateBastionDetails(
            Integer maxSessionTtlInSeconds,
            java.util.List<String> staticJumpHostIpAddresses,
            java.util.List<String> clientCidrBlockAllowList,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
        super();
        this.maxSessionTtlInSeconds = maxSessionTtlInSeconds;
        this.staticJumpHostIpAddresses = staticJumpHostIpAddresses;
        this.clientCidrBlockAllowList = clientCidrBlockAllowList;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The maximum amount of time that any session on the bastion can remain active. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSessionTtlInSeconds")
        private Integer maxSessionTtlInSeconds;

        /**
         * The maximum amount of time that any session on the bastion can remain active.
         *
         * @param maxSessionTtlInSeconds the value to set
         * @return this builder
         */
        public Builder maxSessionTtlInSeconds(Integer maxSessionTtlInSeconds) {
            this.maxSessionTtlInSeconds = maxSessionTtlInSeconds;
            this.__explicitlySet__.add("maxSessionTtlInSeconds");
            return this;
        }
        /**
         * A list of IP addresses of the hosts that the bastion has access to. Not applicable to
         * {@code standard} bastions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("staticJumpHostIpAddresses")
        private java.util.List<String> staticJumpHostIpAddresses;

        /**
         * A list of IP addresses of the hosts that the bastion has access to. Not applicable to
         * {@code standard} bastions.
         *
         * @param staticJumpHostIpAddresses the value to set
         * @return this builder
         */
        public Builder staticJumpHostIpAddresses(java.util.List<String> staticJumpHostIpAddresses) {
            this.staticJumpHostIpAddresses = staticJumpHostIpAddresses;
            this.__explicitlySet__.add("staticJumpHostIpAddresses");
            return this;
        }
        /**
         * A list of address ranges in CIDR notation that you want to allow to connect to sessions
         * hosted by this bastion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientCidrBlockAllowList")
        private java.util.List<String> clientCidrBlockAllowList;

        /**
         * A list of address ranges in CIDR notation that you want to allow to connect to sessions
         * hosted by this bastion.
         *
         * @param clientCidrBlockAllowList the value to set
         * @return this builder
         */
        public Builder clientCidrBlockAllowList(java.util.List<String> clientCidrBlockAllowList) {
            this.clientCidrBlockAllowList = clientCidrBlockAllowList;
            this.__explicitlySet__.add("clientCidrBlockAllowList");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBastionDetails build() {
            UpdateBastionDetails model =
                    new UpdateBastionDetails(
                            this.maxSessionTtlInSeconds,
                            this.staticJumpHostIpAddresses,
                            this.clientCidrBlockAllowList,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBastionDetails model) {
            if (model.wasPropertyExplicitlySet("maxSessionTtlInSeconds")) {
                this.maxSessionTtlInSeconds(model.getMaxSessionTtlInSeconds());
            }
            if (model.wasPropertyExplicitlySet("staticJumpHostIpAddresses")) {
                this.staticJumpHostIpAddresses(model.getStaticJumpHostIpAddresses());
            }
            if (model.wasPropertyExplicitlySet("clientCidrBlockAllowList")) {
                this.clientCidrBlockAllowList(model.getClientCidrBlockAllowList());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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

    /** The maximum amount of time that any session on the bastion can remain active. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSessionTtlInSeconds")
    private final Integer maxSessionTtlInSeconds;

    /**
     * The maximum amount of time that any session on the bastion can remain active.
     *
     * @return the value
     */
    public Integer getMaxSessionTtlInSeconds() {
        return maxSessionTtlInSeconds;
    }

    /**
     * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code
     * standard} bastions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("staticJumpHostIpAddresses")
    private final java.util.List<String> staticJumpHostIpAddresses;

    /**
     * A list of IP addresses of the hosts that the bastion has access to. Not applicable to {@code
     * standard} bastions.
     *
     * @return the value
     */
    public java.util.List<String> getStaticJumpHostIpAddresses() {
        return staticJumpHostIpAddresses;
    }

    /**
     * A list of address ranges in CIDR notation that you want to allow to connect to sessions
     * hosted by this bastion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCidrBlockAllowList")
    private final java.util.List<String> clientCidrBlockAllowList;

    /**
     * A list of address ranges in CIDR notation that you want to allow to connect to sessions
     * hosted by this bastion.
     *
     * @return the value
     */
    public java.util.List<String> getClientCidrBlockAllowList() {
        return clientCidrBlockAllowList;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        sb.append("UpdateBastionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maxSessionTtlInSeconds=").append(String.valueOf(this.maxSessionTtlInSeconds));
        sb.append(", staticJumpHostIpAddresses=")
                .append(String.valueOf(this.staticJumpHostIpAddresses));
        sb.append(", clientCidrBlockAllowList=")
                .append(String.valueOf(this.clientCidrBlockAllowList));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBastionDetails)) {
            return false;
        }

        UpdateBastionDetails other = (UpdateBastionDetails) o;
        return java.util.Objects.equals(this.maxSessionTtlInSeconds, other.maxSessionTtlInSeconds)
                && java.util.Objects.equals(
                        this.staticJumpHostIpAddresses, other.staticJumpHostIpAddresses)
                && java.util.Objects.equals(
                        this.clientCidrBlockAllowList, other.clientCidrBlockAllowList)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxSessionTtlInSeconds == null
                                ? 43
                                : this.maxSessionTtlInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.staticJumpHostIpAddresses == null
                                ? 43
                                : this.staticJumpHostIpAddresses.hashCode());
        result =
                (result * PRIME)
                        + (this.clientCidrBlockAllowList == null
                                ? 43
                                : this.clientCidrBlockAllowList.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
