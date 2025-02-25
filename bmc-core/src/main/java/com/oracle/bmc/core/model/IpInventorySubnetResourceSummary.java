/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Provides the IP Inventory details of a subnet and its associated resources.
 *
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
    builder = IpInventorySubnetResourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IpInventorySubnetResourceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ipId",
        "ipAddress",
        "ipAddressLifetime",
        "parentCidr",
        "associatedPublicIp",
        "publicIpLifetime",
        "associatedPublicIpPool",
        "dnsHostName",
        "assignedResourceName",
        "assignedResourceType",
        "addressType",
        "assignedTime"
    })
    public IpInventorySubnetResourceSummary(
            String ipId,
            String ipAddress,
            IpAddressLifetime ipAddressLifetime,
            String parentCidr,
            String associatedPublicIp,
            PublicIpLifetime publicIpLifetime,
            AssociatedPublicIpPool associatedPublicIpPool,
            String dnsHostName,
            String assignedResourceName,
            AssignedResourceType assignedResourceType,
            String addressType,
            java.util.Date assignedTime) {
        super();
        this.ipId = ipId;
        this.ipAddress = ipAddress;
        this.ipAddressLifetime = ipAddressLifetime;
        this.parentCidr = parentCidr;
        this.associatedPublicIp = associatedPublicIp;
        this.publicIpLifetime = publicIpLifetime;
        this.associatedPublicIpPool = associatedPublicIpPool;
        this.dnsHostName = dnsHostName;
        this.assignedResourceName = assignedResourceName;
        this.assignedResourceType = assignedResourceType;
        this.addressType = addressType;
        this.assignedTime = assignedTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipId")
        private String ipId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP address.
         * @param ipId the value to set
         * @return this builder
         **/
        public Builder ipId(String ipId) {
            this.ipId = ipId;
            this.__explicitlySet__.add("ipId");
            return this;
        }
        /**
         * Lists the allocated private IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * Lists the allocated private IP address.
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * Lifetime of the allocated private IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddressLifetime")
        private IpAddressLifetime ipAddressLifetime;

        /**
         * Lifetime of the allocated private IP address.
         * @param ipAddressLifetime the value to set
         * @return this builder
         **/
        public Builder ipAddressLifetime(IpAddressLifetime ipAddressLifetime) {
            this.ipAddressLifetime = ipAddressLifetime;
            this.__explicitlySet__.add("ipAddressLifetime");
            return this;
        }
        /**
         * The address range the IP address is assigned from.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentCidr")
        private String parentCidr;

        /**
         * The address range the IP address is assigned from.
         * @param parentCidr the value to set
         * @return this builder
         **/
        public Builder parentCidr(String parentCidr) {
            this.parentCidr = parentCidr;
            this.__explicitlySet__.add("parentCidr");
            return this;
        }
        /**
         * Associated public IP address for the private IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedPublicIp")
        private String associatedPublicIp;

        /**
         * Associated public IP address for the private IP address.
         * @param associatedPublicIp the value to set
         * @return this builder
         **/
        public Builder associatedPublicIp(String associatedPublicIp) {
            this.associatedPublicIp = associatedPublicIp;
            this.__explicitlySet__.add("associatedPublicIp");
            return this;
        }
        /**
         * Lifetime of the assigned public IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpLifetime")
        private PublicIpLifetime publicIpLifetime;

        /**
         * Lifetime of the assigned public IP address.
         * @param publicIpLifetime the value to set
         * @return this builder
         **/
        public Builder publicIpLifetime(PublicIpLifetime publicIpLifetime) {
            this.publicIpLifetime = publicIpLifetime;
            this.__explicitlySet__.add("publicIpLifetime");
            return this;
        }
        /**
         * Public IP address Pool the IP address is allocated from.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("associatedPublicIpPool")
        private AssociatedPublicIpPool associatedPublicIpPool;

        /**
         * Public IP address Pool the IP address is allocated from.
         * @param associatedPublicIpPool the value to set
         * @return this builder
         **/
        public Builder associatedPublicIpPool(AssociatedPublicIpPool associatedPublicIpPool) {
            this.associatedPublicIpPool = associatedPublicIpPool;
            this.__explicitlySet__.add("associatedPublicIpPool");
            return this;
        }
        /**
         * DNS hostname of the IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsHostName")
        private String dnsHostName;

        /**
         * DNS hostname of the IP address.
         * @param dnsHostName the value to set
         * @return this builder
         **/
        public Builder dnsHostName(String dnsHostName) {
            this.dnsHostName = dnsHostName;
            this.__explicitlySet__.add("dnsHostName");
            return this;
        }
        /**
         * Name of the created resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignedResourceName")
        private String assignedResourceName;

        /**
         * Name of the created resource.
         * @param assignedResourceName the value to set
         * @return this builder
         **/
        public Builder assignedResourceName(String assignedResourceName) {
            this.assignedResourceName = assignedResourceName;
            this.__explicitlySet__.add("assignedResourceName");
            return this;
        }
        /**
         * Type of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignedResourceType")
        private AssignedResourceType assignedResourceType;

        /**
         * Type of the resource.
         * @param assignedResourceType the value to set
         * @return this builder
         **/
        public Builder assignedResourceType(AssignedResourceType assignedResourceType) {
            this.assignedResourceType = assignedResourceType;
            this.__explicitlySet__.add("assignedResourceType");
            return this;
        }
        /**
         * Address type of the allocated private IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addressType")
        private String addressType;

        /**
         * Address type of the allocated private IP address.
         * @param addressType the value to set
         * @return this builder
         **/
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            this.__explicitlySet__.add("addressType");
            return this;
        }
        /**
         * Assigned time of the private IP address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assignedTime")
        private java.util.Date assignedTime;

        /**
         * Assigned time of the private IP address.
         * @param assignedTime the value to set
         * @return this builder
         **/
        public Builder assignedTime(java.util.Date assignedTime) {
            this.assignedTime = assignedTime;
            this.__explicitlySet__.add("assignedTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpInventorySubnetResourceSummary build() {
            IpInventorySubnetResourceSummary model =
                    new IpInventorySubnetResourceSummary(
                            this.ipId,
                            this.ipAddress,
                            this.ipAddressLifetime,
                            this.parentCidr,
                            this.associatedPublicIp,
                            this.publicIpLifetime,
                            this.associatedPublicIpPool,
                            this.dnsHostName,
                            this.assignedResourceName,
                            this.assignedResourceType,
                            this.addressType,
                            this.assignedTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpInventorySubnetResourceSummary model) {
            if (model.wasPropertyExplicitlySet("ipId")) {
                this.ipId(model.getIpId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("ipAddressLifetime")) {
                this.ipAddressLifetime(model.getIpAddressLifetime());
            }
            if (model.wasPropertyExplicitlySet("parentCidr")) {
                this.parentCidr(model.getParentCidr());
            }
            if (model.wasPropertyExplicitlySet("associatedPublicIp")) {
                this.associatedPublicIp(model.getAssociatedPublicIp());
            }
            if (model.wasPropertyExplicitlySet("publicIpLifetime")) {
                this.publicIpLifetime(model.getPublicIpLifetime());
            }
            if (model.wasPropertyExplicitlySet("associatedPublicIpPool")) {
                this.associatedPublicIpPool(model.getAssociatedPublicIpPool());
            }
            if (model.wasPropertyExplicitlySet("dnsHostName")) {
                this.dnsHostName(model.getDnsHostName());
            }
            if (model.wasPropertyExplicitlySet("assignedResourceName")) {
                this.assignedResourceName(model.getAssignedResourceName());
            }
            if (model.wasPropertyExplicitlySet("assignedResourceType")) {
                this.assignedResourceType(model.getAssignedResourceType());
            }
            if (model.wasPropertyExplicitlySet("addressType")) {
                this.addressType(model.getAddressType());
            }
            if (model.wasPropertyExplicitlySet("assignedTime")) {
                this.assignedTime(model.getAssignedTime());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipId")
    private final String ipId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IP address.
     * @return the value
     **/
    public String getIpId() {
        return ipId;
    }

    /**
     * Lists the allocated private IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * Lists the allocated private IP address.
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Lifetime of the allocated private IP address.
     **/
    public enum IpAddressLifetime {
        Ephemeral("Ephemeral"),
        Reserved("Reserved"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IpAddressLifetime.class);

        private final String value;
        private static java.util.Map<String, IpAddressLifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (IpAddressLifetime v : IpAddressLifetime.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IpAddressLifetime(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IpAddressLifetime create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IpAddressLifetime', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Lifetime of the allocated private IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddressLifetime")
    private final IpAddressLifetime ipAddressLifetime;

    /**
     * Lifetime of the allocated private IP address.
     * @return the value
     **/
    public IpAddressLifetime getIpAddressLifetime() {
        return ipAddressLifetime;
    }

    /**
     * The address range the IP address is assigned from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentCidr")
    private final String parentCidr;

    /**
     * The address range the IP address is assigned from.
     * @return the value
     **/
    public String getParentCidr() {
        return parentCidr;
    }

    /**
     * Associated public IP address for the private IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedPublicIp")
    private final String associatedPublicIp;

    /**
     * Associated public IP address for the private IP address.
     * @return the value
     **/
    public String getAssociatedPublicIp() {
        return associatedPublicIp;
    }

    /**
     * Lifetime of the assigned public IP address.
     **/
    public enum PublicIpLifetime {
        Ephemeral("Ephemeral"),
        Reserved("Reserved"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PublicIpLifetime.class);

        private final String value;
        private static java.util.Map<String, PublicIpLifetime> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicIpLifetime v : PublicIpLifetime.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicIpLifetime(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicIpLifetime create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicIpLifetime', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Lifetime of the assigned public IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpLifetime")
    private final PublicIpLifetime publicIpLifetime;

    /**
     * Lifetime of the assigned public IP address.
     * @return the value
     **/
    public PublicIpLifetime getPublicIpLifetime() {
        return publicIpLifetime;
    }

    /**
     * Public IP address Pool the IP address is allocated from.
     **/
    public enum AssociatedPublicIpPool {
        Oracle("ORACLE"),
        Byoip("BYOIP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssociatedPublicIpPool.class);

        private final String value;
        private static java.util.Map<String, AssociatedPublicIpPool> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociatedPublicIpPool v : AssociatedPublicIpPool.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssociatedPublicIpPool(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociatedPublicIpPool create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssociatedPublicIpPool', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Public IP address Pool the IP address is allocated from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedPublicIpPool")
    private final AssociatedPublicIpPool associatedPublicIpPool;

    /**
     * Public IP address Pool the IP address is allocated from.
     * @return the value
     **/
    public AssociatedPublicIpPool getAssociatedPublicIpPool() {
        return associatedPublicIpPool;
    }

    /**
     * DNS hostname of the IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsHostName")
    private final String dnsHostName;

    /**
     * DNS hostname of the IP address.
     * @return the value
     **/
    public String getDnsHostName() {
        return dnsHostName;
    }

    /**
     * Name of the created resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedResourceName")
    private final String assignedResourceName;

    /**
     * Name of the created resource.
     * @return the value
     **/
    public String getAssignedResourceName() {
        return assignedResourceName;
    }

    /**
     * Type of the resource.
     **/
    public enum AssignedResourceType {
        Resource("Resource"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssignedResourceType.class);

        private final String value;
        private static java.util.Map<String, AssignedResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssignedResourceType v : AssignedResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssignedResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssignedResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssignedResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedResourceType")
    private final AssignedResourceType assignedResourceType;

    /**
     * Type of the resource.
     * @return the value
     **/
    public AssignedResourceType getAssignedResourceType() {
        return assignedResourceType;
    }

    /**
     * Address type of the allocated private IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressType")
    private final String addressType;

    /**
     * Address type of the allocated private IP address.
     * @return the value
     **/
    public String getAddressType() {
        return addressType;
    }

    /**
     * Assigned time of the private IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignedTime")
    private final java.util.Date assignedTime;

    /**
     * Assigned time of the private IP address.
     * @return the value
     **/
    public java.util.Date getAssignedTime() {
        return assignedTime;
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
        sb.append("IpInventorySubnetResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("ipId=").append(String.valueOf(this.ipId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", ipAddressLifetime=").append(String.valueOf(this.ipAddressLifetime));
        sb.append(", parentCidr=").append(String.valueOf(this.parentCidr));
        sb.append(", associatedPublicIp=").append(String.valueOf(this.associatedPublicIp));
        sb.append(", publicIpLifetime=").append(String.valueOf(this.publicIpLifetime));
        sb.append(", associatedPublicIpPool=").append(String.valueOf(this.associatedPublicIpPool));
        sb.append(", dnsHostName=").append(String.valueOf(this.dnsHostName));
        sb.append(", assignedResourceName=").append(String.valueOf(this.assignedResourceName));
        sb.append(", assignedResourceType=").append(String.valueOf(this.assignedResourceType));
        sb.append(", addressType=").append(String.valueOf(this.addressType));
        sb.append(", assignedTime=").append(String.valueOf(this.assignedTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpInventorySubnetResourceSummary)) {
            return false;
        }

        IpInventorySubnetResourceSummary other = (IpInventorySubnetResourceSummary) o;
        return java.util.Objects.equals(this.ipId, other.ipId)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.ipAddressLifetime, other.ipAddressLifetime)
                && java.util.Objects.equals(this.parentCidr, other.parentCidr)
                && java.util.Objects.equals(this.associatedPublicIp, other.associatedPublicIp)
                && java.util.Objects.equals(this.publicIpLifetime, other.publicIpLifetime)
                && java.util.Objects.equals(
                        this.associatedPublicIpPool, other.associatedPublicIpPool)
                && java.util.Objects.equals(this.dnsHostName, other.dnsHostName)
                && java.util.Objects.equals(this.assignedResourceName, other.assignedResourceName)
                && java.util.Objects.equals(this.assignedResourceType, other.assignedResourceType)
                && java.util.Objects.equals(this.addressType, other.addressType)
                && java.util.Objects.equals(this.assignedTime, other.assignedTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipId == null ? 43 : this.ipId.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.ipAddressLifetime == null ? 43 : this.ipAddressLifetime.hashCode());
        result = (result * PRIME) + (this.parentCidr == null ? 43 : this.parentCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedPublicIp == null
                                ? 43
                                : this.associatedPublicIp.hashCode());
        result =
                (result * PRIME)
                        + (this.publicIpLifetime == null ? 43 : this.publicIpLifetime.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedPublicIpPool == null
                                ? 43
                                : this.associatedPublicIpPool.hashCode());
        result = (result * PRIME) + (this.dnsHostName == null ? 43 : this.dnsHostName.hashCode());
        result =
                (result * PRIME)
                        + (this.assignedResourceName == null
                                ? 43
                                : this.assignedResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.assignedResourceType == null
                                ? 43
                                : this.assignedResourceType.hashCode());
        result = (result * PRIME) + (this.addressType == null ? 43 : this.addressType.hashCode());
        result = (result * PRIME) + (this.assignedTime == null ? 43 : this.assignedTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
