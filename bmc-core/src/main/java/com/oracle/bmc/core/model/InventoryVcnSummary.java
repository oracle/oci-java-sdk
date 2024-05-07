/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Provides the summary of a VCN's IP Inventory data under specified compartments. <br>
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
        builder = InventoryVcnSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InventoryVcnSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vcnId",
        "vcnName",
        "resourceType",
        "inventoryVcnCidrBlockCollection",
        "dnsDomainName",
        "region",
        "compartmentId",
        "inventorySubnetcollection"
    })
    public InventoryVcnSummary(
            String vcnId,
            String vcnName,
            ResourceType resourceType,
            java.util.List<InventoryVcnCidrBlockSummary> inventoryVcnCidrBlockCollection,
            String dnsDomainName,
            String region,
            String compartmentId,
            java.util.List<InventorySubnetSummary> inventorySubnetcollection) {
        super();
        this.vcnId = vcnId;
        this.vcnName = vcnName;
        this.resourceType = resourceType;
        this.inventoryVcnCidrBlockCollection = inventoryVcnCidrBlockCollection;
        this.dnsDomainName = dnsDomainName;
        this.region = region;
        this.compartmentId = compartmentId;
        this.inventorySubnetcollection = inventorySubnetcollection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN .
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VCN .
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** Name of the VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnName")
        private String vcnName;

        /**
         * Name of the VCN.
         *
         * @param vcnName the value to set
         * @return this builder
         */
        public Builder vcnName(String vcnName) {
            this.vcnName = vcnName;
            this.__explicitlySet__.add("vcnName");
            return this;
        }
        /** Resource types of the VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * Resource types of the VCN.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Lists {@code InventoryVcnCidrBlockSummary} objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryVcnCidrBlockCollection")
        private java.util.List<InventoryVcnCidrBlockSummary> inventoryVcnCidrBlockCollection;

        /**
         * Lists {@code InventoryVcnCidrBlockSummary} objects.
         *
         * @param inventoryVcnCidrBlockCollection the value to set
         * @return this builder
         */
        public Builder inventoryVcnCidrBlockCollection(
                java.util.List<InventoryVcnCidrBlockSummary> inventoryVcnCidrBlockCollection) {
            this.inventoryVcnCidrBlockCollection = inventoryVcnCidrBlockCollection;
            this.__explicitlySet__.add("inventoryVcnCidrBlockCollection");
            return this;
        }
        /** DNS domain name of the VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsDomainName")
        private String dnsDomainName;

        /**
         * DNS domain name of the VCN.
         *
         * @param dnsDomainName the value to set
         * @return this builder
         */
        public Builder dnsDomainName(String dnsDomainName) {
            this.dnsDomainName = dnsDomainName;
            this.__explicitlySet__.add("dnsDomainName");
            return this;
        }
        /** Region name of the VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region name of the VCN.
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
        /** Lists {@code Subnetcollection} objects */
        @com.fasterxml.jackson.annotation.JsonProperty("inventorySubnetcollection")
        private java.util.List<InventorySubnetSummary> inventorySubnetcollection;

        /**
         * Lists {@code Subnetcollection} objects
         *
         * @param inventorySubnetcollection the value to set
         * @return this builder
         */
        public Builder inventorySubnetcollection(
                java.util.List<InventorySubnetSummary> inventorySubnetcollection) {
            this.inventorySubnetcollection = inventorySubnetcollection;
            this.__explicitlySet__.add("inventorySubnetcollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventoryVcnSummary build() {
            InventoryVcnSummary model =
                    new InventoryVcnSummary(
                            this.vcnId,
                            this.vcnName,
                            this.resourceType,
                            this.inventoryVcnCidrBlockCollection,
                            this.dnsDomainName,
                            this.region,
                            this.compartmentId,
                            this.inventorySubnetcollection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventoryVcnSummary model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("vcnName")) {
                this.vcnName(model.getVcnName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("inventoryVcnCidrBlockCollection")) {
                this.inventoryVcnCidrBlockCollection(model.getInventoryVcnCidrBlockCollection());
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
            if (model.wasPropertyExplicitlySet("inventorySubnetcollection")) {
                this.inventorySubnetcollection(model.getInventorySubnetcollection());
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
     * the VCN .
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VCN .
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** Name of the VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnName")
    private final String vcnName;

    /**
     * Name of the VCN.
     *
     * @return the value
     */
    public String getVcnName() {
        return vcnName;
    }

    /** Resource types of the VCN. */
    public enum ResourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Vcn("VCN"),

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
    /** Resource types of the VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * Resource types of the VCN.
     *
     * @return the value
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /** Lists {@code InventoryVcnCidrBlockSummary} objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryVcnCidrBlockCollection")
    private final java.util.List<InventoryVcnCidrBlockSummary> inventoryVcnCidrBlockCollection;

    /**
     * Lists {@code InventoryVcnCidrBlockSummary} objects.
     *
     * @return the value
     */
    public java.util.List<InventoryVcnCidrBlockSummary> getInventoryVcnCidrBlockCollection() {
        return inventoryVcnCidrBlockCollection;
    }

    /** DNS domain name of the VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsDomainName")
    private final String dnsDomainName;

    /**
     * DNS domain name of the VCN.
     *
     * @return the value
     */
    public String getDnsDomainName() {
        return dnsDomainName;
    }

    /** Region name of the VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region name of the VCN.
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

    /** Lists {@code Subnetcollection} objects */
    @com.fasterxml.jackson.annotation.JsonProperty("inventorySubnetcollection")
    private final java.util.List<InventorySubnetSummary> inventorySubnetcollection;

    /**
     * Lists {@code Subnetcollection} objects
     *
     * @return the value
     */
    public java.util.List<InventorySubnetSummary> getInventorySubnetcollection() {
        return inventorySubnetcollection;
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
        sb.append("InventoryVcnSummary(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", vcnName=").append(String.valueOf(this.vcnName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", inventoryVcnCidrBlockCollection=")
                .append(String.valueOf(this.inventoryVcnCidrBlockCollection));
        sb.append(", dnsDomainName=").append(String.valueOf(this.dnsDomainName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", inventorySubnetcollection=")
                .append(String.valueOf(this.inventorySubnetcollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventoryVcnSummary)) {
            return false;
        }

        InventoryVcnSummary other = (InventoryVcnSummary) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.vcnName, other.vcnName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(
                        this.inventoryVcnCidrBlockCollection, other.inventoryVcnCidrBlockCollection)
                && java.util.Objects.equals(this.dnsDomainName, other.dnsDomainName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.inventorySubnetcollection, other.inventorySubnetcollection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.vcnName == null ? 43 : this.vcnName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryVcnCidrBlockCollection == null
                                ? 43
                                : this.inventoryVcnCidrBlockCollection.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsDomainName == null ? 43 : this.dnsDomainName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.inventorySubnetcollection == null
                                ? 43
                                : this.inventorySubnetcollection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
