/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * CCD commitment creation details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCcdCommitmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCcdCommitmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "quantity",
        "displayName",
        "subscriptionId",
        "compartmentId",
        "fillerTenancyId",
        "usageEligibility",
        "secondarySkus",
        "timeCcdCommitmentStarts",
        "timeCcdCommitmentEnds",
        "freeformTags",
        "definedTags"
    })
    public CreateCcdCommitmentDetails(
            Long quantity,
            String displayName,
            String subscriptionId,
            String compartmentId,
            String fillerTenancyId,
            UsageEligibility usageEligibility,
            java.util.List<SecondarySkus> secondarySkus,
            java.util.Date timeCcdCommitmentStarts,
            java.util.Date timeCcdCommitmentEnds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.quantity = quantity;
        this.displayName = displayName;
        this.subscriptionId = subscriptionId;
        this.compartmentId = compartmentId;
        this.fillerTenancyId = fillerTenancyId;
        this.usageEligibility = usageEligibility;
        this.secondarySkus = secondarySkus;
        this.timeCcdCommitmentStarts = timeCcdCommitmentStarts;
        this.timeCcdCommitmentEnds = timeCcdCommitmentEnds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The hourly quantity that the customer is committing to a CCD offer's main SKU. For FLEX
         * offers, this quantity must equal the CCD offer's minQuantity and maxQuantity when both
         * are provided. For example, if the quantity is 1000, then you are committing to a 1000
         * usage quantity value per hour.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Long quantity;

        /**
         * The hourly quantity that the customer is committing to a CCD offer's main SKU. For FLEX
         * offers, this quantity must equal the CCD offer's minQuantity and maxQuantity when both
         * are provided. For example, if the quantity is 1000, then you are committing to a 1000
         * usage quantity value per hour.
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * The CCD commitment name. Ensure the name is unique across subscription IDs. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The CCD commitment name. Ensure the name is unique across subscription IDs. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The subscription OCID value the CCD offer is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The subscription OCID value the CCD offer is applicable to.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * The compartment OCID where you want to create the CCD commitment. Must be the root
         * compartment OCID of a parent tenancy (if part of an organization), or a standalone
         * tenancy to which the subscription is associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID where you want to create the CCD commitment. Must be the root
         * compartment OCID of a parent tenancy (if part of an organization), or a standalone
         * tenancy to which the subscription is associated.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The tenancy OCID you want to apply filler usage to. */
        @com.fasterxml.jackson.annotation.JsonProperty("fillerTenancyId")
        private String fillerTenancyId;

        /**
         * The tenancy OCID you want to apply filler usage to.
         *
         * @param fillerTenancyId the value to set
         * @return this builder
         */
        public Builder fillerTenancyId(String fillerTenancyId) {
            this.fillerTenancyId = fillerTenancyId;
            this.__explicitlySet__.add("fillerTenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageEligibility")
        private UsageEligibility usageEligibility;

        public Builder usageEligibility(UsageEligibility usageEligibility) {
            this.usageEligibility = usageEligibility;
            this.__explicitlySet__.add("usageEligibility");
            return this;
        }
        /**
         * The bundled SKUs selected for this commitment. Supply {@code quantity} only for
         * components whose offer quantity rule is {@code CUSTOMER_SELECTED}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secondarySkus")
        private java.util.List<SecondarySkus> secondarySkus;

        /**
         * The bundled SKUs selected for this commitment. Supply {@code quantity} only for
         * components whose offer quantity rule is {@code CUSTOMER_SELECTED}.
         *
         * @param secondarySkus the value to set
         * @return this builder
         */
        public Builder secondarySkus(java.util.List<SecondarySkus> secondarySkus) {
            this.secondarySkus = secondarySkus;
            this.__explicitlySet__.add("secondarySkus");
            return this;
        }
        /**
         * The inclusive date and time when the CCD commitment will be effective. The date and time
         * must be rounded up to the exact hour, and must be in the future. The format is defined by
         * RFC 3339. For example, if you want to commit to a CCD on 2025-06-01 12:00:00, you should
         * create a request any time before 2025-06-01 12:00:00. You can only create CCD for a
         * Scheduled or Current CCD offer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentStarts")
        private java.util.Date timeCcdCommitmentStarts;

        /**
         * The inclusive date and time when the CCD commitment will be effective. The date and time
         * must be rounded up to the exact hour, and must be in the future. The format is defined by
         * RFC 3339. For example, if you want to commit to a CCD on 2025-06-01 12:00:00, you should
         * create a request any time before 2025-06-01 12:00:00. You can only create CCD for a
         * Scheduled or Current CCD offer.
         *
         * @param timeCcdCommitmentStarts the value to set
         * @return this builder
         */
        public Builder timeCcdCommitmentStarts(java.util.Date timeCcdCommitmentStarts) {
            this.timeCcdCommitmentStarts = timeCcdCommitmentStarts;
            this.__explicitlySet__.add("timeCcdCommitmentStarts");
            return this;
        }
        /**
         * The exclusive time the CCD commitment ends. The time gets computed using {@code
         * timeCcdCommitmentStarts} from the {@code ccdCommitment}, and the minimum commitment term
         * associated with {@code CcdOffer}. The default value is set as null at the time of CCD
         * commitment creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentEnds")
        private java.util.Date timeCcdCommitmentEnds;

        /**
         * The exclusive time the CCD commitment ends. The time gets computed using {@code
         * timeCcdCommitmentStarts} from the {@code ccdCommitment}, and the minimum commitment term
         * associated with {@code CcdOffer}. The default value is set as null at the time of CCD
         * commitment creation.
         *
         * @param timeCcdCommitmentEnds the value to set
         * @return this builder
         */
        public Builder timeCcdCommitmentEnds(java.util.Date timeCcdCommitmentEnds) {
            this.timeCcdCommitmentEnds = timeCcdCommitmentEnds;
            this.__explicitlySet__.add("timeCcdCommitmentEnds");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public CreateCcdCommitmentDetails build() {
            CreateCcdCommitmentDetails model =
                    new CreateCcdCommitmentDetails(
                            this.quantity,
                            this.displayName,
                            this.subscriptionId,
                            this.compartmentId,
                            this.fillerTenancyId,
                            this.usageEligibility,
                            this.secondarySkus,
                            this.timeCcdCommitmentStarts,
                            this.timeCcdCommitmentEnds,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCcdCommitmentDetails model) {
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fillerTenancyId")) {
                this.fillerTenancyId(model.getFillerTenancyId());
            }
            if (model.wasPropertyExplicitlySet("usageEligibility")) {
                this.usageEligibility(model.getUsageEligibility());
            }
            if (model.wasPropertyExplicitlySet("secondarySkus")) {
                this.secondarySkus(model.getSecondarySkus());
            }
            if (model.wasPropertyExplicitlySet("timeCcdCommitmentStarts")) {
                this.timeCcdCommitmentStarts(model.getTimeCcdCommitmentStarts());
            }
            if (model.wasPropertyExplicitlySet("timeCcdCommitmentEnds")) {
                this.timeCcdCommitmentEnds(model.getTimeCcdCommitmentEnds());
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
     * The hourly quantity that the customer is committing to a CCD offer's main SKU. For FLEX
     * offers, this quantity must equal the CCD offer's minQuantity and maxQuantity when both are
     * provided. For example, if the quantity is 1000, then you are committing to a 1000 usage
     * quantity value per hour.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Long quantity;

    /**
     * The hourly quantity that the customer is committing to a CCD offer's main SKU. For FLEX
     * offers, this quantity must equal the CCD offer's minQuantity and maxQuantity when both are
     * provided. For example, if the quantity is 1000, then you are committing to a 1000 usage
     * quantity value per hour.
     *
     * @return the value
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * The CCD commitment name. Ensure the name is unique across subscription IDs. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The CCD commitment name. Ensure the name is unique across subscription IDs. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The subscription OCID value the CCD offer is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The subscription OCID value the CCD offer is applicable to.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The compartment OCID where you want to create the CCD commitment. Must be the root
     * compartment OCID of a parent tenancy (if part of an organization), or a standalone tenancy to
     * which the subscription is associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID where you want to create the CCD commitment. Must be the root
     * compartment OCID of a parent tenancy (if part of an organization), or a standalone tenancy to
     * which the subscription is associated.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The tenancy OCID you want to apply filler usage to. */
    @com.fasterxml.jackson.annotation.JsonProperty("fillerTenancyId")
    private final String fillerTenancyId;

    /**
     * The tenancy OCID you want to apply filler usage to.
     *
     * @return the value
     */
    public String getFillerTenancyId() {
        return fillerTenancyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usageEligibility")
    private final UsageEligibility usageEligibility;

    public UsageEligibility getUsageEligibility() {
        return usageEligibility;
    }

    /**
     * The bundled SKUs selected for this commitment. Supply {@code quantity} only for components
     * whose offer quantity rule is {@code CUSTOMER_SELECTED}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secondarySkus")
    private final java.util.List<SecondarySkus> secondarySkus;

    /**
     * The bundled SKUs selected for this commitment. Supply {@code quantity} only for components
     * whose offer quantity rule is {@code CUSTOMER_SELECTED}.
     *
     * @return the value
     */
    public java.util.List<SecondarySkus> getSecondarySkus() {
        return secondarySkus;
    }

    /**
     * The inclusive date and time when the CCD commitment will be effective. The date and time must
     * be rounded up to the exact hour, and must be in the future. The format is defined by RFC
     * 3339. For example, if you want to commit to a CCD on 2025-06-01 12:00:00, you should create a
     * request any time before 2025-06-01 12:00:00. You can only create CCD for a Scheduled or
     * Current CCD offer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentStarts")
    private final java.util.Date timeCcdCommitmentStarts;

    /**
     * The inclusive date and time when the CCD commitment will be effective. The date and time must
     * be rounded up to the exact hour, and must be in the future. The format is defined by RFC
     * 3339. For example, if you want to commit to a CCD on 2025-06-01 12:00:00, you should create a
     * request any time before 2025-06-01 12:00:00. You can only create CCD for a Scheduled or
     * Current CCD offer.
     *
     * @return the value
     */
    public java.util.Date getTimeCcdCommitmentStarts() {
        return timeCcdCommitmentStarts;
    }

    /**
     * The exclusive time the CCD commitment ends. The time gets computed using {@code
     * timeCcdCommitmentStarts} from the {@code ccdCommitment}, and the minimum commitment term
     * associated with {@code CcdOffer}. The default value is set as null at the time of CCD
     * commitment creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentEnds")
    private final java.util.Date timeCcdCommitmentEnds;

    /**
     * The exclusive time the CCD commitment ends. The time gets computed using {@code
     * timeCcdCommitmentStarts} from the {@code ccdCommitment}, and the minimum commitment term
     * associated with {@code CcdOffer}. The default value is set as null at the time of CCD
     * commitment creation.
     *
     * @return the value
     */
    public java.util.Date getTimeCcdCommitmentEnds() {
        return timeCcdCommitmentEnds;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("CreateCcdCommitmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("quantity=").append(String.valueOf(this.quantity));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fillerTenancyId=").append(String.valueOf(this.fillerTenancyId));
        sb.append(", usageEligibility=").append(String.valueOf(this.usageEligibility));
        sb.append(", secondarySkus=").append(String.valueOf(this.secondarySkus));
        sb.append(", timeCcdCommitmentStarts=")
                .append(String.valueOf(this.timeCcdCommitmentStarts));
        sb.append(", timeCcdCommitmentEnds=").append(String.valueOf(this.timeCcdCommitmentEnds));
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
        if (!(o instanceof CreateCcdCommitmentDetails)) {
            return false;
        }

        CreateCcdCommitmentDetails other = (CreateCcdCommitmentDetails) o;
        return java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fillerTenancyId, other.fillerTenancyId)
                && java.util.Objects.equals(this.usageEligibility, other.usageEligibility)
                && java.util.Objects.equals(this.secondarySkus, other.secondarySkus)
                && java.util.Objects.equals(
                        this.timeCcdCommitmentStarts, other.timeCcdCommitmentStarts)
                && java.util.Objects.equals(this.timeCcdCommitmentEnds, other.timeCcdCommitmentEnds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.fillerTenancyId == null ? 43 : this.fillerTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.usageEligibility == null ? 43 : this.usageEligibility.hashCode());
        result =
                (result * PRIME)
                        + (this.secondarySkus == null ? 43 : this.secondarySkus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCcdCommitmentStarts == null
                                ? 43
                                : this.timeCcdCommitmentStarts.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCcdCommitmentEnds == null
                                ? 43
                                : this.timeCcdCommitmentEnds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
