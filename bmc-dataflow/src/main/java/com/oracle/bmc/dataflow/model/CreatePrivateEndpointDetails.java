/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The details required to create a private endpoint.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePrivateEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePrivateEndpointDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "description",
        "displayName",
        "dnsZones",
        "freeformTags",
        "maxHostCount",
        "nsgIds",
        "scanDetails",
        "subnetId"
    })
    public CreatePrivateEndpointDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            String displayName,
            java.util.List<String> dnsZones,
            java.util.Map<String, String> freeformTags,
            Integer maxHostCount,
            java.util.List<String> nsgIds,
            java.util.List<Scan> scanDetails,
            String subnetId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.dnsZones = dnsZones;
        this.freeformTags = freeformTags;
        this.maxHostCount = maxHostCount;
        this.nsgIds = nsgIds;
        this.scanDetails = scanDetails;
        this.subnetId = subnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of a compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of a compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly description. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * An array of DNS zone names.
         * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
        private java.util.List<String> dnsZones;

        /**
         * An array of DNS zone names.
         * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
         *
         * @param dnsZones the value to set
         * @return this builder
         **/
        public Builder dnsZones(java.util.List<String> dnsZones) {
            this.dnsZones = dnsZones;
            this.__explicitlySet__.add("dnsZones");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The maximum number of hosts to be accessed through the private endpoint. This value is used
         * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
         * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
         * to 512.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxHostCount")
        private Integer maxHostCount;

        /**
         * The maximum number of hosts to be accessed through the private endpoint. This value is used
         * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
         * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
         * to 512.
         *
         * @param maxHostCount the value to set
         * @return this builder
         **/
        public Builder maxHostCount(Integer maxHostCount) {
            this.maxHostCount = maxHostCount;
            this.__explicitlySet__.add("maxHostCount");
            return this;
        }
        /**
         * An array of network security group OCIDs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of network security group OCIDs.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
         * [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanDetails")
        private java.util.List<Scan> scanDetails;

        /**
         * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
         * [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
         *
         * @param scanDetails the value to set
         * @return this builder
         **/
        public Builder scanDetails(java.util.List<Scan> scanDetails) {
            this.scanDetails = scanDetails;
            this.__explicitlySet__.add("scanDetails");
            return this;
        }
        /**
         * The OCID of a subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of a subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePrivateEndpointDetails build() {
            CreatePrivateEndpointDetails model =
                    new CreatePrivateEndpointDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.description,
                            this.displayName,
                            this.dnsZones,
                            this.freeformTags,
                            this.maxHostCount,
                            this.nsgIds,
                            this.scanDetails,
                            this.subnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePrivateEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dnsZones")) {
                this.dnsZones(model.getDnsZones());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("maxHostCount")) {
                this.maxHostCount(model.getMaxHostCount());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("scanDetails")) {
                this.scanDetails(model.getScanDetails());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
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
     * The OCID of a compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of a compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly description. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * An array of DNS zone names.
     * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
    private final java.util.List<String> dnsZones;

    /**
     * An array of DNS zone names.
     * Example: {@code [ "app.examplecorp.com", "app.examplecorp2.com" ]}
     *
     * @return the value
     **/
    public java.util.List<String> getDnsZones() {
        return dnsZones;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The maximum number of hosts to be accessed through the private endpoint. This value is used
     * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
     * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
     * to 512.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxHostCount")
    private final Integer maxHostCount;

    /**
     * The maximum number of hosts to be accessed through the private endpoint. This value is used
     * to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a
     * multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up
     * to 512.
     *
     * @return the value
     **/
    public Integer getMaxHostCount() {
        return maxHostCount;
    }

    /**
     * An array of network security group OCIDs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of network security group OCIDs.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
     * [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanDetails")
    private final java.util.List<Scan> scanDetails;

    /**
     * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
     * [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
     *
     * @return the value
     **/
    public java.util.List<Scan> getScanDetails() {
        return scanDetails;
    }

    /**
     * The OCID of a subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of a subnet.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
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
        sb.append("CreatePrivateEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dnsZones=").append(String.valueOf(this.dnsZones));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", maxHostCount=").append(String.valueOf(this.maxHostCount));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", scanDetails=").append(String.valueOf(this.scanDetails));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePrivateEndpointDetails)) {
            return false;
        }

        CreatePrivateEndpointDetails other = (CreatePrivateEndpointDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dnsZones, other.dnsZones)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.maxHostCount, other.maxHostCount)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.scanDetails, other.scanDetails)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dnsZones == null ? 43 : this.dnsZones.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.maxHostCount == null ? 43 : this.maxHostCount.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.scanDetails == null ? 43 : this.scanDetails.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
