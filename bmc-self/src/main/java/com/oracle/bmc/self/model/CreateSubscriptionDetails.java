/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * The data to create a Subscription.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSubscriptionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSubscriptionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "tenantId",
        "subscriptionDetails",
        "sellerId",
        "sourceType",
        "productId",
        "additionalDetails",
        "realm",
        "region",
        "freeformTags",
        "definedTags"
    })
    public CreateSubscriptionDetails(
            String displayName,
            String compartmentId,
            String tenantId,
            SubscriptionDetails subscriptionDetails,
            String sellerId,
            SourceType sourceType,
            String productId,
            java.util.List<ExtendedMetadata> additionalDetails,
            String realm,
            String region,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.tenantId = tenantId;
        this.subscriptionDetails = subscriptionDetails;
        this.sellerId = sellerId;
        this.sourceType = sourceType;
        this.productId = productId;
        this.additionalDetails = additionalDetails;
        this.realm = realm;
        this.region = region;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The subscription name. Must be unique within the compartment. This value can be updated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The subscription name. Must be unique within the compartment. This value can be updated.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to create the subscription in.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to create the subscription in.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant to create the subscription in.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant to create the subscription in.
         *
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionDetails")
        private SubscriptionDetails subscriptionDetails;

        public Builder subscriptionDetails(SubscriptionDetails subscriptionDetails) {
            this.subscriptionDetails = subscriptionDetails;
            this.__explicitlySet__.add("subscriptionDetails");
            return this;
        }
        /**
         * The OCID for the seller in SELF Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sellerId")
        private String sellerId;

        /**
         * The OCID for the seller in SELF Service.
         * @param sellerId the value to set
         * @return this builder
         **/
        public Builder sellerId(String sellerId) {
            this.sellerId = sellerId;
            this.__explicitlySet__.add("sellerId");
            return this;
        }
        /**
         * The type of seller in SELF Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * The type of seller in SELF Service.
         * @param sourceType the value to set
         * @return this builder
         **/
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The unique identifier of the marketplace listing in Oracle Cloud Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        /**
         * The unique identifier of the marketplace listing in Oracle Cloud Infrastructure.
         * @param productId the value to set
         * @return this builder
         **/
        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
            return this;
        }
        /**
         * Additional details that are specific for this subscription such as activation details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.List<ExtendedMetadata> additionalDetails;

        /**
         * Additional details that are specific for this subscription such as activation details.
         * @param additionalDetails the value to set
         * @return this builder
         **/
        public Builder additionalDetails(java.util.List<ExtendedMetadata> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * The realm from where customer is buying the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("realm")
        private String realm;

        /**
         * The realm from where customer is buying the subscription.
         * @param realm the value to set
         * @return this builder
         **/
        public Builder realm(String realm) {
            this.realm = realm;
            this.__explicitlySet__.add("realm");
            return this;
        }
        /**
         * The region from where customer is buying the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region from where customer is buying the subscription.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSubscriptionDetails build() {
            CreateSubscriptionDetails model =
                    new CreateSubscriptionDetails(
                            this.displayName,
                            this.compartmentId,
                            this.tenantId,
                            this.subscriptionDetails,
                            this.sellerId,
                            this.sourceType,
                            this.productId,
                            this.additionalDetails,
                            this.realm,
                            this.region,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSubscriptionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionDetails")) {
                this.subscriptionDetails(model.getSubscriptionDetails());
            }
            if (model.wasPropertyExplicitlySet("sellerId")) {
                this.sellerId(model.getSellerId());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("productId")) {
                this.productId(model.getProductId());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("realm")) {
                this.realm(model.getRealm());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
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
     * The subscription name. Must be unique within the compartment. This value can be updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The subscription name. Must be unique within the compartment. This value can be updated.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to create the subscription in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to create the subscription in.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant to create the subscription in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tenant to create the subscription in.
     *
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionDetails")
    private final SubscriptionDetails subscriptionDetails;

    public SubscriptionDetails getSubscriptionDetails() {
        return subscriptionDetails;
    }

    /**
     * The OCID for the seller in SELF Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sellerId")
    private final String sellerId;

    /**
     * The OCID for the seller in SELF Service.
     * @return the value
     **/
    public String getSellerId() {
        return sellerId;
    }

    /**
     * The type of seller in SELF Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * The type of seller in SELF Service.
     * @return the value
     **/
    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * The unique identifier of the marketplace listing in Oracle Cloud Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    private final String productId;

    /**
     * The unique identifier of the marketplace listing in Oracle Cloud Infrastructure.
     * @return the value
     **/
    public String getProductId() {
        return productId;
    }

    /**
     * Additional details that are specific for this subscription such as activation details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.List<ExtendedMetadata> additionalDetails;

    /**
     * Additional details that are specific for this subscription such as activation details.
     * @return the value
     **/
    public java.util.List<ExtendedMetadata> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * The realm from where customer is buying the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realm")
    private final String realm;

    /**
     * The realm from where customer is buying the subscription.
     * @return the value
     **/
    public String getRealm() {
        return realm;
    }

    /**
     * The region from where customer is buying the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region from where customer is buying the subscription.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateSubscriptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", subscriptionDetails=").append(String.valueOf(this.subscriptionDetails));
        sb.append(", sellerId=").append(String.valueOf(this.sellerId));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", productId=").append(String.valueOf(this.productId));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", realm=").append(String.valueOf(this.realm));
        sb.append(", region=").append(String.valueOf(this.region));
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
        if (!(o instanceof CreateSubscriptionDetails)) {
            return false;
        }

        CreateSubscriptionDetails other = (CreateSubscriptionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.subscriptionDetails, other.subscriptionDetails)
                && java.util.Objects.equals(this.sellerId, other.sellerId)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.region, other.region)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionDetails == null
                                ? 43
                                : this.subscriptionDetails.hashCode());
        result = (result * PRIME) + (this.sellerId == null ? 43 : this.sellerId.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
