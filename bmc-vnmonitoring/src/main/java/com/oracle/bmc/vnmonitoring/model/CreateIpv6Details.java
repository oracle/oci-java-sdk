/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * <br>
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
        builder = CreateIpv6Details.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateIpv6Details
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "ipAddress",
        "isInternetAccessAllowed",
        "vnicId"
    })
    public CreateIpv6Details(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String ipAddress,
            Boolean isInternetAccessAllowed,
            String vnicId) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.ipAddress = ipAddress;
        this.isInternetAccessAllowed = isInternetAccessAllowed;
        this.vnicId = vnicId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * An IPv6 address of your choice. Must be an available IP address within the subnet's CIDR.
         * If you don't specify a value, Oracle automatically assigns an IPv6 address from the
         * subnet. The subnet is the one that contains the VNIC you specify in {@code vnicId}.
         *
         * <p>Example: {@code 2001:DB8::}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * An IPv6 address of your choice. Must be an available IP address within the subnet's CIDR.
         * If you don't specify a value, Oracle automatically assigns an IPv6 address from the
         * subnet. The subnet is the one that contains the VNIC you specify in {@code vnicId}.
         *
         * <p>Example: {@code 2001:DB8::}
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6
         * in a public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code
         * true}, the IPv6 uses its public IP address for internet communication.
         *
         * <p>If {@code isInternetAccessAllowed} is set to {@code false}, the resulting {@code
         * publicIpAddress} attribute for the {@code Ipv6} is null.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isInternetAccessAllowed")
        private Boolean isInternetAccessAllowed;

        /**
         * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6
         * in a public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code
         * true}, the IPv6 uses its public IP address for internet communication.
         *
         * <p>If {@code isInternetAccessAllowed} is set to {@code false}, the resulting {@code
         * publicIpAddress} attribute for the {@code Ipv6} is null.
         *
         * <p>Example: {@code true}
         *
         * @param isInternetAccessAllowed the value to set
         * @return this builder
         */
        public Builder isInternetAccessAllowed(Boolean isInternetAccessAllowed) {
            this.isInternetAccessAllowed = isInternetAccessAllowed;
            this.__explicitlySet__.add("isInternetAccessAllowed");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC to assign the IPv6 to. The IPv6 will be in the VNIC's subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC to assign the IPv6 to. The IPv6 will be in the VNIC's subnet.
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIpv6Details build() {
            CreateIpv6Details model =
                    new CreateIpv6Details(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.ipAddress,
                            this.isInternetAccessAllowed,
                            this.vnicId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIpv6Details model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("isInternetAccessAllowed")) {
                this.isInternetAccessAllowed(model.getIsInternetAccessAllowed());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
     * An IPv6 address of your choice. Must be an available IP address within the subnet's CIDR. If
     * you don't specify a value, Oracle automatically assigns an IPv6 address from the subnet. The
     * subnet is the one that contains the VNIC you specify in {@code vnicId}.
     *
     * <p>Example: {@code 2001:DB8::}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * An IPv6 address of your choice. Must be an available IP address within the subnet's CIDR. If
     * you don't specify a value, Oracle automatically assigns an IPv6 address from the subnet. The
     * subnet is the one that contains the VNIC you specify in {@code vnicId}.
     *
     * <p>Example: {@code 2001:DB8::}
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6 in a
     * public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code true},
     * the IPv6 uses its public IP address for internet communication.
     *
     * <p>If {@code isInternetAccessAllowed} is set to {@code false}, the resulting {@code
     * publicIpAddress} attribute for the {@code Ipv6} is null.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isInternetAccessAllowed")
    private final Boolean isInternetAccessAllowed;

    /**
     * Whether the IPv6 can be used for internet communication. Allowed by default for an IPv6 in a
     * public subnet. Never allowed for an IPv6 in a private subnet. If the value is {@code true},
     * the IPv6 uses its public IP address for internet communication.
     *
     * <p>If {@code isInternetAccessAllowed} is set to {@code false}, the resulting {@code
     * publicIpAddress} attribute for the {@code Ipv6} is null.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsInternetAccessAllowed() {
        return isInternetAccessAllowed;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC
     * to assign the IPv6 to. The IPv6 will be in the VNIC's subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC
     * to assign the IPv6 to. The IPv6 will be in the VNIC's subnet.
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
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
        sb.append("CreateIpv6Details(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", isInternetAccessAllowed=")
                .append(String.valueOf(this.isInternetAccessAllowed));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIpv6Details)) {
            return false;
        }

        CreateIpv6Details other = (CreateIpv6Details) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(
                        this.isInternetAccessAllowed, other.isInternetAccessAllowed)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.isInternetAccessAllowed == null
                                ? 43
                                : this.isInternetAccessAllowed.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
