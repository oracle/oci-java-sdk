/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Information about the new gateway.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateGatewayDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateGatewayDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "endpointType",
        "subnetId",
        "networkSecurityGroupIds",
        "certificateId",
        "responseCacheDetails",
        "freeformTags",
        "definedTags",
        "caBundles"
    })
    public CreateGatewayDetails(
            String displayName,
            String compartmentId,
            Gateway.EndpointType endpointType,
            String subnetId,
            java.util.List<String> networkSecurityGroupIds,
            String certificateId,
            ResponseCacheDetails responseCacheDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<CaBundle> caBundles) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.endpointType = endpointType;
        this.subnetId = subnetId;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.certificateId = certificateId;
        this.responseCacheDetails = responseCacheDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.caBundles = caBundles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the
         * resource is created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the
         * resource is created.
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
         * Gateway endpoint type. {@code PUBLIC} will have a public ip address assigned to it, while {@code PRIVATE} will only be
         * accessible on a private IP address on the subnet.
         * <p>
         * Example: {@code PUBLIC} or {@code PRIVATE}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointType")
        private Gateway.EndpointType endpointType;

        /**
         * Gateway endpoint type. {@code PUBLIC} will have a public ip address assigned to it, while {@code PRIVATE} will only be
         * accessible on a private IP address on the subnet.
         * <p>
         * Example: {@code PUBLIC} or {@code PRIVATE}
         *
         * @param endpointType the value to set
         * @return this builder
         **/
        public Builder endpointType(Gateway.EndpointType endpointType) {
            this.endpointType = endpointType;
            this.__explicitlySet__.add("endpointType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet in which
         * related resources are created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet in which
         * related resources are created.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * An array of Network Security Groups OCIDs associated with this API Gateway.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of Network Security Groups OCIDs associated with this API Gateway.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
         *
         * @param certificateId the value to set
         * @return this builder
         **/
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCacheDetails")
        private ResponseCacheDetails responseCacheDetails;

        public Builder responseCacheDetails(ResponseCacheDetails responseCacheDetails) {
            this.responseCacheDetails = responseCacheDetails;
            this.__explicitlySet__.add("responseCacheDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         * with no predefined name, type, or namespace. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair
         * with no predefined name, type, or namespace. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * An array of CA bundles that should be used on the Gateway for TLS validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caBundles")
        private java.util.List<CaBundle> caBundles;

        /**
         * An array of CA bundles that should be used on the Gateway for TLS validation.
         * @param caBundles the value to set
         * @return this builder
         **/
        public Builder caBundles(java.util.List<CaBundle> caBundles) {
            this.caBundles = caBundles;
            this.__explicitlySet__.add("caBundles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGatewayDetails build() {
            CreateGatewayDetails model =
                    new CreateGatewayDetails(
                            this.displayName,
                            this.compartmentId,
                            this.endpointType,
                            this.subnetId,
                            this.networkSecurityGroupIds,
                            this.certificateId,
                            this.responseCacheDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.caBundles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGatewayDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("endpointType")) {
                this.endpointType(model.getEndpointType());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("responseCacheDetails")) {
                this.responseCacheDetails(model.getResponseCacheDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("caBundles")) {
                this.caBundles(model.getCaBundles());
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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the
     * resource is created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the
     * resource is created.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Gateway endpoint type. {@code PUBLIC} will have a public ip address assigned to it, while {@code PRIVATE} will only be
     * accessible on a private IP address on the subnet.
     * <p>
     * Example: {@code PUBLIC} or {@code PRIVATE}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointType")
    private final Gateway.EndpointType endpointType;

    /**
     * Gateway endpoint type. {@code PUBLIC} will have a public ip address assigned to it, while {@code PRIVATE} will only be
     * accessible on a private IP address on the subnet.
     * <p>
     * Example: {@code PUBLIC} or {@code PRIVATE}
     *
     * @return the value
     **/
    public Gateway.EndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet in which
     * related resources are created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet in which
     * related resources are created.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of Network Security Groups OCIDs associated with this API Gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of Network Security Groups OCIDs associated with this API Gateway.
     *
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     *
     * @return the value
     **/
    public String getCertificateId() {
        return certificateId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseCacheDetails")
    private final ResponseCacheDetails responseCacheDetails;

    public ResponseCacheDetails getResponseCacheDetails() {
        return responseCacheDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * An array of CA bundles that should be used on the Gateway for TLS validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caBundles")
    private final java.util.List<CaBundle> caBundles;

    /**
     * An array of CA bundles that should be used on the Gateway for TLS validation.
     * @return the value
     **/
    public java.util.List<CaBundle> getCaBundles() {
        return caBundles;
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
        sb.append("CreateGatewayDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", endpointType=").append(String.valueOf(this.endpointType));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", responseCacheDetails=").append(String.valueOf(this.responseCacheDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", caBundles=").append(String.valueOf(this.caBundles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGatewayDetails)) {
            return false;
        }

        CreateGatewayDetails other = (CreateGatewayDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.endpointType, other.endpointType)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.responseCacheDetails, other.responseCacheDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.caBundles, other.caBundles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.endpointType == null ? 43 : this.endpointType.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.responseCacheDetails == null
                                ? 43
                                : this.responseCacheDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.caBundles == null ? 43 : this.caBundles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
