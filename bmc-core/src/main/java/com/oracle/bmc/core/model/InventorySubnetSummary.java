/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Lists subnet and its associated resources. <br>
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
        builder = InventorySubnetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InventorySubnetSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subnetId",
        "subnetName",
        "resourceType",
        "inventorySubnetCidrCollection",
        "dnsDomainName",
        "region",
        "compartmentId",
        "inventoryResourceSummary"
    })
    public InventorySubnetSummary(
            String subnetId,
            String subnetName,
            ResourceType resourceType,
            java.util.List<InventorySubnetCidrBlockSummary> inventorySubnetCidrCollection,
            String dnsDomainName,
            String region,
            String compartmentId,
            java.util.List<InventoryResourceSummary> inventoryResourceSummary) {
        super();
        this.subnetId = subnetId;
        this.subnetName = subnetName;
        this.resourceType = resourceType;
        this.inventorySubnetCidrCollection = inventorySubnetCidrCollection;
        this.dnsDomainName = dnsDomainName;
        this.region = region;
        this.compartmentId = compartmentId;
        this.inventoryResourceSummary = inventoryResourceSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** Name of the subnet within a VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetName")
        private String subnetName;

        /**
         * Name of the subnet within a VCN.
         *
         * @param subnetName the value to set
         * @return this builder
         */
        public Builder subnetName(String subnetName) {
            this.subnetName = subnetName;
            this.__explicitlySet__.add("subnetName");
            return this;
        }
        /** Resource types of the subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * Resource types of the subnet.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Lists CIDRs and utilization within the subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("inventorySubnetCidrCollection")
        private java.util.List<InventorySubnetCidrBlockSummary> inventorySubnetCidrCollection;

        /**
         * Lists CIDRs and utilization within the subnet.
         *
         * @param inventorySubnetCidrCollection the value to set
         * @return this builder
         */
        public Builder inventorySubnetCidrCollection(
                java.util.List<InventorySubnetCidrBlockSummary> inventorySubnetCidrCollection) {
            this.inventorySubnetCidrCollection = inventorySubnetCidrCollection;
            this.__explicitlySet__.add("inventorySubnetCidrCollection");
            return this;
        }
        /** DNS domain name of the subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsDomainName")
        private String dnsDomainName;

        /**
         * DNS domain name of the subnet.
         *
         * @param dnsDomainName the value to set
         * @return this builder
         */
        public Builder dnsDomainName(String dnsDomainName) {
            this.dnsDomainName = dnsDomainName;
            this.__explicitlySet__.add("dnsDomainName");
            return this;
        }
        /** Region name of the subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region name of the subnet.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Lists the {@code ResourceCollection} object. */
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryResourceSummary")
        private java.util.List<InventoryResourceSummary> inventoryResourceSummary;

        /**
         * Lists the {@code ResourceCollection} object.
         *
         * @param inventoryResourceSummary the value to set
         * @return this builder
         */
        public Builder inventoryResourceSummary(
                java.util.List<InventoryResourceSummary> inventoryResourceSummary) {
            this.inventoryResourceSummary = inventoryResourceSummary;
            this.__explicitlySet__.add("inventoryResourceSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventorySubnetSummary build() {
            InventorySubnetSummary model =
                    new InventorySubnetSummary(
                            this.subnetId,
                            this.subnetName,
                            this.resourceType,
                            this.inventorySubnetCidrCollection,
                            this.dnsDomainName,
                            this.region,
                            this.compartmentId,
                            this.inventoryResourceSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventorySubnetSummary model) {
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("subnetName")) {
                this.subnetName(model.getSubnetName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("inventorySubnetCidrCollection")) {
                this.inventorySubnetCidrCollection(model.getInventorySubnetCidrCollection());
            }
            if (model.wasPropertyExplicitlySet("dnsDomainName")) {
                this.dnsDomainName(model.getDnsDomainName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("inventoryResourceSummary")) {
                this.inventoryResourceSummary(model.getInventoryResourceSummary());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** Name of the subnet within a VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetName")
    private final String subnetName;

    /**
     * Name of the subnet within a VCN.
     *
     * @return the value
     */
    public String getSubnetName() {
        return subnetName;
    }

    /** Resource types of the subnet. */
    public enum ResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Subnet("Subnet"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Resource types of the subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * Resource types of the subnet.
     *
     * @return the value
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /** Lists CIDRs and utilization within the subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventorySubnetCidrCollection")
    private final java.util.List<InventorySubnetCidrBlockSummary> inventorySubnetCidrCollection;

    /**
     * Lists CIDRs and utilization within the subnet.
     *
     * @return the value
     */
    public java.util.List<InventorySubnetCidrBlockSummary> getInventorySubnetCidrCollection() {
        return inventorySubnetCidrCollection;
    }

    /** DNS domain name of the subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsDomainName")
    private final String dnsDomainName;

    /**
     * DNS domain name of the subnet.
     *
     * @return the value
     */
    public String getDnsDomainName() {
        return dnsDomainName;
    }

    /** Region name of the subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region name of the subnet.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Lists the {@code ResourceCollection} object. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryResourceSummary")
    private final java.util.List<InventoryResourceSummary> inventoryResourceSummary;

    /**
     * Lists the {@code ResourceCollection} object.
     *
     * @return the value
     */
    public java.util.List<InventoryResourceSummary> getInventoryResourceSummary() {
        return inventoryResourceSummary;
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
        sb.append("InventorySubnetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", subnetName=").append(String.valueOf(this.subnetName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", inventorySubnetCidrCollection=")
                .append(String.valueOf(this.inventorySubnetCidrCollection));
        sb.append(", dnsDomainName=").append(String.valueOf(this.dnsDomainName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", inventoryResourceSummary=")
                .append(String.valueOf(this.inventoryResourceSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventorySubnetSummary)) {
            return false;
        }

        InventorySubnetSummary other = (InventorySubnetSummary) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.subnetName, other.subnetName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(
                        this.inventorySubnetCidrCollection, other.inventorySubnetCidrCollection)
                && java.util.Objects.equals(this.dnsDomainName, other.dnsDomainName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.inventoryResourceSummary, other.inventoryResourceSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.subnetName == null ? 43 : this.subnetName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.inventorySubnetCidrCollection == null
                                ? 43
                                : this.inventorySubnetCidrCollection.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsDomainName == null ? 43 : this.dnsDomainName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryResourceSummary == null
                                ? 43
                                : this.inventoryResourceSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
