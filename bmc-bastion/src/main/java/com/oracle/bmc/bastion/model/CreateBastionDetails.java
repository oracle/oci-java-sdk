/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * The configuration details for a new bastion. A bastion provides secured, public access to target
 * resources in the cloud that you cannot otherwise reach from the internet. A bastion resides in a
 * public subnet and establishes the network infrastructure needed to connect a user to a target
 * resource in a private subnet. <br>
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
        builder = CreateBastionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBastionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bastionType",
        "name",
        "compartmentId",
        "targetSubnetId",
        "phoneBookEntry",
        "staticJumpHostIpAddresses",
        "clientCidrBlockAllowList",
        "maxSessionTtlInSeconds",
        "dnsProxyStatus",
        "freeformTags",
        "definedTags"
    })
    public CreateBastionDetails(
            String bastionType,
            String name,
            String compartmentId,
            String targetSubnetId,
            String phoneBookEntry,
            java.util.List<String> staticJumpHostIpAddresses,
            java.util.List<String> clientCidrBlockAllowList,
            Integer maxSessionTtlInSeconds,
            BastionDnsProxyStatus dnsProxyStatus,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.bastionType = bastionType;
        this.name = name;
        this.compartmentId = compartmentId;
        this.targetSubnetId = targetSubnetId;
        this.phoneBookEntry = phoneBookEntry;
        this.staticJumpHostIpAddresses = staticJumpHostIpAddresses;
        this.clientCidrBlockAllowList = clientCidrBlockAllowList;
        this.maxSessionTtlInSeconds = maxSessionTtlInSeconds;
        this.dnsProxyStatus = dnsProxyStatus;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of bastion. Use {@code standard}. */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionType")
        private String bastionType;

        /**
         * The type of bastion. Use {@code standard}.
         *
         * @param bastionType the value to set
         * @return this builder
         */
        public Builder bastionType(String bastionType) {
            this.bastionType = bastionType;
            this.__explicitlySet__.add("bastionType");
            return this;
        }
        /** The name of the bastion, which can't be changed after creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the bastion, which can't be changed after creation.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The unique identifier (OCID) of the compartment where the bastion is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier (OCID) of the compartment where the bastion is located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The unique identifier (OCID) of the subnet that the bastion connects to. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetSubnetId")
        private String targetSubnetId;

        /**
         * The unique identifier (OCID) of the subnet that the bastion connects to.
         *
         * @param targetSubnetId the value to set
         * @return this builder
         */
        public Builder targetSubnetId(String targetSubnetId) {
            this.targetSubnetId = targetSubnetId;
            this.__explicitlySet__.add("targetSubnetId");
            return this;
        }
        /**
         * The phonebook entry of the customer's team, which can't be changed after creation. Not
         * applicable to {@code standard} bastions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("phoneBookEntry")
        private String phoneBookEntry;

        /**
         * The phonebook entry of the customer's team, which can't be changed after creation. Not
         * applicable to {@code standard} bastions.
         *
         * @param phoneBookEntry the value to set
         * @return this builder
         */
        public Builder phoneBookEntry(String phoneBookEntry) {
            this.phoneBookEntry = phoneBookEntry;
            this.__explicitlySet__.add("phoneBookEntry");
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
        /** The desired dns proxy status of the bastion. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsProxyStatus")
        private BastionDnsProxyStatus dnsProxyStatus;

        /**
         * The desired dns proxy status of the bastion.
         *
         * @param dnsProxyStatus the value to set
         * @return this builder
         */
        public Builder dnsProxyStatus(BastionDnsProxyStatus dnsProxyStatus) {
            this.dnsProxyStatus = dnsProxyStatus;
            this.__explicitlySet__.add("dnsProxyStatus");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBastionDetails build() {
            CreateBastionDetails model =
                    new CreateBastionDetails(
                            this.bastionType,
                            this.name,
                            this.compartmentId,
                            this.targetSubnetId,
                            this.phoneBookEntry,
                            this.staticJumpHostIpAddresses,
                            this.clientCidrBlockAllowList,
                            this.maxSessionTtlInSeconds,
                            this.dnsProxyStatus,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBastionDetails model) {
            if (model.wasPropertyExplicitlySet("bastionType")) {
                this.bastionType(model.getBastionType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetSubnetId")) {
                this.targetSubnetId(model.getTargetSubnetId());
            }
            if (model.wasPropertyExplicitlySet("phoneBookEntry")) {
                this.phoneBookEntry(model.getPhoneBookEntry());
            }
            if (model.wasPropertyExplicitlySet("staticJumpHostIpAddresses")) {
                this.staticJumpHostIpAddresses(model.getStaticJumpHostIpAddresses());
            }
            if (model.wasPropertyExplicitlySet("clientCidrBlockAllowList")) {
                this.clientCidrBlockAllowList(model.getClientCidrBlockAllowList());
            }
            if (model.wasPropertyExplicitlySet("maxSessionTtlInSeconds")) {
                this.maxSessionTtlInSeconds(model.getMaxSessionTtlInSeconds());
            }
            if (model.wasPropertyExplicitlySet("dnsProxyStatus")) {
                this.dnsProxyStatus(model.getDnsProxyStatus());
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

    /** The type of bastion. Use {@code standard}. */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionType")
    private final String bastionType;

    /**
     * The type of bastion. Use {@code standard}.
     *
     * @return the value
     */
    public String getBastionType() {
        return bastionType;
    }

    /** The name of the bastion, which can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the bastion, which can't be changed after creation.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The unique identifier (OCID) of the compartment where the bastion is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier (OCID) of the compartment where the bastion is located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique identifier (OCID) of the subnet that the bastion connects to. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetSubnetId")
    private final String targetSubnetId;

    /**
     * The unique identifier (OCID) of the subnet that the bastion connects to.
     *
     * @return the value
     */
    public String getTargetSubnetId() {
        return targetSubnetId;
    }

    /**
     * The phonebook entry of the customer's team, which can't be changed after creation. Not
     * applicable to {@code standard} bastions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phoneBookEntry")
    private final String phoneBookEntry;

    /**
     * The phonebook entry of the customer's team, which can't be changed after creation. Not
     * applicable to {@code standard} bastions.
     *
     * @return the value
     */
    public String getPhoneBookEntry() {
        return phoneBookEntry;
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

    /** The desired dns proxy status of the bastion. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsProxyStatus")
    private final BastionDnsProxyStatus dnsProxyStatus;

    /**
     * The desired dns proxy status of the bastion.
     *
     * @return the value
     */
    public BastionDnsProxyStatus getDnsProxyStatus() {
        return dnsProxyStatus;
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
        sb.append("CreateBastionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bastionType=").append(String.valueOf(this.bastionType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetSubnetId=").append(String.valueOf(this.targetSubnetId));
        sb.append(", phoneBookEntry=").append(String.valueOf(this.phoneBookEntry));
        sb.append(", staticJumpHostIpAddresses=")
                .append(String.valueOf(this.staticJumpHostIpAddresses));
        sb.append(", clientCidrBlockAllowList=")
                .append(String.valueOf(this.clientCidrBlockAllowList));
        sb.append(", maxSessionTtlInSeconds=").append(String.valueOf(this.maxSessionTtlInSeconds));
        sb.append(", dnsProxyStatus=").append(String.valueOf(this.dnsProxyStatus));
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
        if (!(o instanceof CreateBastionDetails)) {
            return false;
        }

        CreateBastionDetails other = (CreateBastionDetails) o;
        return java.util.Objects.equals(this.bastionType, other.bastionType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetSubnetId, other.targetSubnetId)
                && java.util.Objects.equals(this.phoneBookEntry, other.phoneBookEntry)
                && java.util.Objects.equals(
                        this.staticJumpHostIpAddresses, other.staticJumpHostIpAddresses)
                && java.util.Objects.equals(
                        this.clientCidrBlockAllowList, other.clientCidrBlockAllowList)
                && java.util.Objects.equals(
                        this.maxSessionTtlInSeconds, other.maxSessionTtlInSeconds)
                && java.util.Objects.equals(this.dnsProxyStatus, other.dnsProxyStatus)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bastionType == null ? 43 : this.bastionType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetSubnetId == null ? 43 : this.targetSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.phoneBookEntry == null ? 43 : this.phoneBookEntry.hashCode());
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
        result =
                (result * PRIME)
                        + (this.maxSessionTtlInSeconds == null
                                ? 43
                                : this.maxSessionTtlInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsProxyStatus == null ? 43 : this.dnsProxyStatus.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
