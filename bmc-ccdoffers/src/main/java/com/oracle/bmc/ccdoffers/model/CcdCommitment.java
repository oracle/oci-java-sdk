/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The created CCD commitment details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CcdCommitment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CcdCommitment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "quantity",
        "displayName",
        "offerId",
        "sourceType",
        "reclaimTerm",
        "reclaimTermUnit",
        "timeCcdCommitmentStarts",
        "timeCcdCommitmentEnds",
        "subscriptionId",
        "compartmentId",
        "fillerTenancyId",
        "fillerTenancyHomeRegion",
        "usageEligibility",
        "secondarySkus",
        "lifecycleState",
        "lifecycleDetails",
        "skuQuantityPriceModel",
        "timeCreated",
        "timeUpdated",
        "timeTerminated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "lastUpdatedBy",
        "createdBy",
        "approvedBy"
    })
    public CcdCommitment(
            String id,
            Long quantity,
            String displayName,
            String offerId,
            CcdOffer.SourceType sourceType,
            Long reclaimTerm,
            CcdOffer.ReclaimTermUnit reclaimTermUnit,
            java.util.Date timeCcdCommitmentStarts,
            java.util.Date timeCcdCommitmentEnds,
            String subscriptionId,
            String compartmentId,
            String fillerTenancyId,
            String fillerTenancyHomeRegion,
            UsageEligibility usageEligibility,
            java.util.List<SecondarySkus> secondarySkus,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails,
            java.util.List<CommittedSkuQuantityPriceModel> skuQuantityPriceModel,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeTerminated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String lastUpdatedBy,
            String createdBy,
            String approvedBy) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.displayName = displayName;
        this.offerId = offerId;
        this.sourceType = sourceType;
        this.reclaimTerm = reclaimTerm;
        this.reclaimTermUnit = reclaimTermUnit;
        this.timeCcdCommitmentStarts = timeCcdCommitmentStarts;
        this.timeCcdCommitmentEnds = timeCcdCommitmentEnds;
        this.subscriptionId = subscriptionId;
        this.compartmentId = compartmentId;
        this.fillerTenancyId = fillerTenancyId;
        this.fillerTenancyHomeRegion = fillerTenancyHomeRegion;
        this.usageEligibility = usageEligibility;
        this.secondarySkus = secondarySkus;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.skuQuantityPriceModel = skuQuantityPriceModel;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeTerminated = timeTerminated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.lastUpdatedBy = lastUpdatedBy;
        this.createdBy = createdBy;
        this.approvedBy = approvedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The CCD commitment resource OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The CCD commitment resource OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The hourly quantity that the customer is committing to a CCD offer's main SKU. For
         * example, if the quantity is 1000, then you are committing to a 1000 usage quantity value
         * per hour.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Long quantity;

        /**
         * The hourly quantity that the customer is committing to a CCD offer's main SKU. For
         * example, if the quantity is 1000, then you are committing to a 1000 usage quantity value
         * per hour.
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
         * The CCD commitment name. Ensure the name is unique for a given subscription ID. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The CCD commitment name. Ensure the name is unique for a given subscription ID. Avoid
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
        /** The CCD offer OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("offerId")
        private String offerId;

        /**
         * The CCD offer OCID.
         *
         * @param offerId the value to set
         * @return this builder
         */
        public Builder offerId(String offerId) {
            this.offerId = offerId;
            this.__explicitlySet__.add("offerId");
            return this;
        }
        /** The commercial workflow of the associated CCD offer. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private CcdOffer.SourceType sourceType;

        /**
         * The commercial workflow of the associated CCD offer.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(CcdOffer.SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /**
         * The reclaim term copied from the offer when the commitment is created. The value is
         * measured in {@code reclaimTermUnit}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimTerm")
        private Long reclaimTerm;

        /**
         * The reclaim term copied from the offer when the commitment is created. The value is
         * measured in {@code reclaimTermUnit}.
         *
         * @param reclaimTerm the value to set
         * @return this builder
         */
        public Builder reclaimTerm(Long reclaimTerm) {
            this.reclaimTerm = reclaimTerm;
            this.__explicitlySet__.add("reclaimTerm");
            return this;
        }
        /**
         * The unit used to measure {@code reclaimTerm}, copied from the offer when the commitment
         * is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimTermUnit")
        private CcdOffer.ReclaimTermUnit reclaimTermUnit;

        /**
         * The unit used to measure {@code reclaimTerm}, copied from the offer when the commitment
         * is created.
         *
         * @param reclaimTermUnit the value to set
         * @return this builder
         */
        public Builder reclaimTermUnit(CcdOffer.ReclaimTermUnit reclaimTermUnit) {
            this.reclaimTermUnit = reclaimTermUnit;
            this.__explicitlySet__.add("reclaimTermUnit");
            return this;
        }
        /**
         * The date and time the CCD commitment will be effective.The format is defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentStarts")
        private java.util.Date timeCcdCommitmentStarts;

        /**
         * The date and time the CCD commitment will be effective.The format is defined by RFC 3339.
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
         * The date and time the CCD commitment will be deactivated. The date and time is calculated
         * based on {@code timeCcdCommitmentStarts}, the term, and units of the CCD offer. For
         * example: {@code 2025-06-01T03:00:00}. The format is defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentEnds")
        private java.util.Date timeCcdCommitmentEnds;

        /**
         * The date and time the CCD commitment will be deactivated. The date and time is calculated
         * based on {@code timeCcdCommitmentStarts}, the term, and units of the CCD offer. For
         * example: {@code 2025-06-01T03:00:00}. The format is defined by RFC 3339.
         *
         * @param timeCcdCommitmentEnds the value to set
         * @return this builder
         */
        public Builder timeCcdCommitmentEnds(java.util.Date timeCcdCommitmentEnds) {
            this.timeCcdCommitmentEnds = timeCcdCommitmentEnds;
            this.__explicitlySet__.add("timeCcdCommitmentEnds");
            return this;
        }
        /** The subscription ID the CCD offer is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The subscription ID the CCD offer is applicable to.
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
         * The root compartment ID. The CCD Commitment is associated with the tenancy root
         * compartment ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The root compartment ID. The CCD Commitment is associated with the tenancy root
         * compartment ID.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The tenancy OCID that you want to apply filler usage to. */
        @com.fasterxml.jackson.annotation.JsonProperty("fillerTenancyId")
        private String fillerTenancyId;

        /**
         * The tenancy OCID that you want to apply filler usage to.
         *
         * @param fillerTenancyId the value to set
         * @return this builder
         */
        public Builder fillerTenancyId(String fillerTenancyId) {
            this.fillerTenancyId = fillerTenancyId;
            this.__explicitlySet__.add("fillerTenancyId");
            return this;
        }
        /** The filler tenancy home region. */
        @com.fasterxml.jackson.annotation.JsonProperty("fillerTenancyHomeRegion")
        private String fillerTenancyHomeRegion;

        /**
         * The filler tenancy home region.
         *
         * @param fillerTenancyHomeRegion the value to set
         * @return this builder
         */
        public Builder fillerTenancyHomeRegion(String fillerTenancyHomeRegion) {
            this.fillerTenancyHomeRegion = fillerTenancyHomeRegion;
            this.__explicitlySet__.add("fillerTenancyHomeRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageEligibility")
        private UsageEligibility usageEligibility;

        public Builder usageEligibility(UsageEligibility usageEligibility) {
            this.usageEligibility = usageEligibility;
            this.__explicitlySet__.add("usageEligibility");
            return this;
        }
        /** Secondary SKUs associated with the main SKU. */
        @com.fasterxml.jackson.annotation.JsonProperty("secondarySkus")
        private java.util.List<SecondarySkus> secondarySkus;

        /**
         * Secondary SKUs associated with the main SKU.
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
         * This state always defaults to {@code Active}. For a detailed and exact state, check the
         * {@code lifecycleDetails} state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * This state always defaults to {@code Active}. For a detailed and exact state, check the
         * {@code lifecycleDetails} state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The CCD commitment's current state. A commitment that's expected to get a dedicated
         * capacity will be in the Awaiting Provisioning state unless the commitment is ended or
         * canceled. Otherwise, the value is determined by {@code timeCcdCommitmentStarts}, {@code
         * timeCcdCommitmentEnds}, and {@code timeTerminated}, with respect to the current time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * The CCD commitment's current state. A commitment that's expected to get a dedicated
         * capacity will be in the Awaiting Provisioning state unless the commitment is ended or
         * canceled. Otherwise, the value is determined by {@code timeCcdCommitmentStarts}, {@code
         * timeCcdCommitmentEnds}, and {@code timeTerminated}, with respect to the current time.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The list of SKUs associated with the commitment and their prices in all currency codes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skuQuantityPriceModel")
        private java.util.List<CommittedSkuQuantityPriceModel> skuQuantityPriceModel;

        /**
         * The list of SKUs associated with the commitment and their prices in all currency codes.
         *
         * @param skuQuantityPriceModel the value to set
         * @return this builder
         */
        public Builder skuQuantityPriceModel(
                java.util.List<CommittedSkuQuantityPriceModel> skuQuantityPriceModel) {
            this.skuQuantityPriceModel = skuQuantityPriceModel;
            this.__explicitlySet__.add("skuQuantityPriceModel");
            return this;
        }
        /**
         * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example:
         * {@code 2025-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example:
         * {@code 2025-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
        private java.util.Date timeTerminated;

        /**
         * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeTerminated the value to set
         * @return this builder
         */
        public Builder timeTerminated(java.util.Date timeTerminated) {
            this.timeTerminated = timeTerminated;
            this.__explicitlySet__.add("timeTerminated");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Entity/User who lastly updated the ccdCommitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
        private String lastUpdatedBy;

        /**
         * Entity/User who lastly updated the ccdCommitment.
         *
         * @param lastUpdatedBy the value to set
         * @return this builder
         */
        public Builder lastUpdatedBy(String lastUpdatedBy) {
            this.lastUpdatedBy = lastUpdatedBy;
            this.__explicitlySet__.add("lastUpdatedBy");
            return this;
        }
        /** The entity that created the CCD commitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The entity that created the CCD commitment.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Entity/User who approved the ccdCommitment. */
        @com.fasterxml.jackson.annotation.JsonProperty("approvedBy")
        private String approvedBy;

        /**
         * Entity/User who approved the ccdCommitment.
         *
         * @param approvedBy the value to set
         * @return this builder
         */
        public Builder approvedBy(String approvedBy) {
            this.approvedBy = approvedBy;
            this.__explicitlySet__.add("approvedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CcdCommitment build() {
            CcdCommitment model =
                    new CcdCommitment(
                            this.id,
                            this.quantity,
                            this.displayName,
                            this.offerId,
                            this.sourceType,
                            this.reclaimTerm,
                            this.reclaimTermUnit,
                            this.timeCcdCommitmentStarts,
                            this.timeCcdCommitmentEnds,
                            this.subscriptionId,
                            this.compartmentId,
                            this.fillerTenancyId,
                            this.fillerTenancyHomeRegion,
                            this.usageEligibility,
                            this.secondarySkus,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.skuQuantityPriceModel,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeTerminated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lastUpdatedBy,
                            this.createdBy,
                            this.approvedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CcdCommitment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("offerId")) {
                this.offerId(model.getOfferId());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("reclaimTerm")) {
                this.reclaimTerm(model.getReclaimTerm());
            }
            if (model.wasPropertyExplicitlySet("reclaimTermUnit")) {
                this.reclaimTermUnit(model.getReclaimTermUnit());
            }
            if (model.wasPropertyExplicitlySet("timeCcdCommitmentStarts")) {
                this.timeCcdCommitmentStarts(model.getTimeCcdCommitmentStarts());
            }
            if (model.wasPropertyExplicitlySet("timeCcdCommitmentEnds")) {
                this.timeCcdCommitmentEnds(model.getTimeCcdCommitmentEnds());
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
            if (model.wasPropertyExplicitlySet("fillerTenancyHomeRegion")) {
                this.fillerTenancyHomeRegion(model.getFillerTenancyHomeRegion());
            }
            if (model.wasPropertyExplicitlySet("usageEligibility")) {
                this.usageEligibility(model.getUsageEligibility());
            }
            if (model.wasPropertyExplicitlySet("secondarySkus")) {
                this.secondarySkus(model.getSecondarySkus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("skuQuantityPriceModel")) {
                this.skuQuantityPriceModel(model.getSkuQuantityPriceModel());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeTerminated")) {
                this.timeTerminated(model.getTimeTerminated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedBy")) {
                this.lastUpdatedBy(model.getLastUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("approvedBy")) {
                this.approvedBy(model.getApprovedBy());
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

    /** The CCD commitment resource OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The CCD commitment resource OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The hourly quantity that the customer is committing to a CCD offer's main SKU. For example,
     * if the quantity is 1000, then you are committing to a 1000 usage quantity value per hour.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Long quantity;

    /**
     * The hourly quantity that the customer is committing to a CCD offer's main SKU. For example,
     * if the quantity is 1000, then you are committing to a 1000 usage quantity value per hour.
     *
     * @return the value
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * The CCD commitment name. Ensure the name is unique for a given subscription ID. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The CCD commitment name. Ensure the name is unique for a given subscription ID. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The CCD offer OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("offerId")
    private final String offerId;

    /**
     * The CCD offer OCID.
     *
     * @return the value
     */
    public String getOfferId() {
        return offerId;
    }

    /** The commercial workflow of the associated CCD offer. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final CcdOffer.SourceType sourceType;

    /**
     * The commercial workflow of the associated CCD offer.
     *
     * @return the value
     */
    public CcdOffer.SourceType getSourceType() {
        return sourceType;
    }

    /**
     * The reclaim term copied from the offer when the commitment is created. The value is measured
     * in {@code reclaimTermUnit}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimTerm")
    private final Long reclaimTerm;

    /**
     * The reclaim term copied from the offer when the commitment is created. The value is measured
     * in {@code reclaimTermUnit}.
     *
     * @return the value
     */
    public Long getReclaimTerm() {
        return reclaimTerm;
    }

    /**
     * The unit used to measure {@code reclaimTerm}, copied from the offer when the commitment is
     * created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimTermUnit")
    private final CcdOffer.ReclaimTermUnit reclaimTermUnit;

    /**
     * The unit used to measure {@code reclaimTerm}, copied from the offer when the commitment is
     * created.
     *
     * @return the value
     */
    public CcdOffer.ReclaimTermUnit getReclaimTermUnit() {
        return reclaimTermUnit;
    }

    /** The date and time the CCD commitment will be effective.The format is defined by RFC 3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentStarts")
    private final java.util.Date timeCcdCommitmentStarts;

    /**
     * The date and time the CCD commitment will be effective.The format is defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCcdCommitmentStarts() {
        return timeCcdCommitmentStarts;
    }

    /**
     * The date and time the CCD commitment will be deactivated. The date and time is calculated
     * based on {@code timeCcdCommitmentStarts}, the term, and units of the CCD offer. For example:
     * {@code 2025-06-01T03:00:00}. The format is defined by RFC 3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCcdCommitmentEnds")
    private final java.util.Date timeCcdCommitmentEnds;

    /**
     * The date and time the CCD commitment will be deactivated. The date and time is calculated
     * based on {@code timeCcdCommitmentStarts}, the term, and units of the CCD offer. For example:
     * {@code 2025-06-01T03:00:00}. The format is defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCcdCommitmentEnds() {
        return timeCcdCommitmentEnds;
    }

    /** The subscription ID the CCD offer is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The subscription ID the CCD offer is applicable to.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The root compartment ID. The CCD Commitment is associated with the tenancy root compartment
     * ID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The root compartment ID. The CCD Commitment is associated with the tenancy root compartment
     * ID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The tenancy OCID that you want to apply filler usage to. */
    @com.fasterxml.jackson.annotation.JsonProperty("fillerTenancyId")
    private final String fillerTenancyId;

    /**
     * The tenancy OCID that you want to apply filler usage to.
     *
     * @return the value
     */
    public String getFillerTenancyId() {
        return fillerTenancyId;
    }

    /** The filler tenancy home region. */
    @com.fasterxml.jackson.annotation.JsonProperty("fillerTenancyHomeRegion")
    private final String fillerTenancyHomeRegion;

    /**
     * The filler tenancy home region.
     *
     * @return the value
     */
    public String getFillerTenancyHomeRegion() {
        return fillerTenancyHomeRegion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usageEligibility")
    private final UsageEligibility usageEligibility;

    public UsageEligibility getUsageEligibility() {
        return usageEligibility;
    }

    /** Secondary SKUs associated with the main SKU. */
    @com.fasterxml.jackson.annotation.JsonProperty("secondarySkus")
    private final java.util.List<SecondarySkus> secondarySkus;

    /**
     * Secondary SKUs associated with the main SKU.
     *
     * @return the value
     */
    public java.util.List<SecondarySkus> getSecondarySkus() {
        return secondarySkus;
    }

    /**
     * This state always defaults to {@code Active}. For a detailed and exact state, check the
     * {@code lifecycleDetails} state.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This state always defaults to {@code Active}. For a detailed and exact state, check the
     * {@code lifecycleDetails} state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * This state always defaults to {@code Active}. For a detailed and exact state, check the
     * {@code lifecycleDetails} state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The CCD commitment's current state. A commitment that's expected to get a dedicated capacity
     * will be in the Awaiting Provisioning state unless the commitment is ended or canceled.
     * Otherwise, the value is determined by {@code timeCcdCommitmentStarts}, {@code
     * timeCcdCommitmentEnds}, and {@code timeTerminated}, with respect to the current time.
     */
    public enum LifecycleDetails implements com.oracle.bmc.http.internal.BmcEnum {
        Current("CURRENT"),
        Ended("ENDED"),
        Canceled("CANCELED"),
        Scheduled("SCHEDULED"),
        AwaitingProvisioning("AWAITING_PROVISIONING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The CCD commitment's current state. A commitment that's expected to get a dedicated capacity
     * will be in the Awaiting Provisioning state unless the commitment is ended or canceled.
     * Otherwise, the value is determined by {@code timeCcdCommitmentStarts}, {@code
     * timeCcdCommitmentEnds}, and {@code timeTerminated}, with respect to the current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * The CCD commitment's current state. A commitment that's expected to get a dedicated capacity
     * will be in the Awaiting Provisioning state unless the commitment is ended or canceled.
     * Otherwise, the value is determined by {@code timeCcdCommitmentStarts}, {@code
     * timeCcdCommitmentEnds}, and {@code timeTerminated}, with respect to the current time.
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The list of SKUs associated with the commitment and their prices in all currency codes. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuQuantityPriceModel")
    private final java.util.List<CommittedSkuQuantityPriceModel> skuQuantityPriceModel;

    /**
     * The list of SKUs associated with the commitment and their prices in all currency codes.
     *
     * @return the value
     */
    public java.util.List<CommittedSkuQuantityPriceModel> getSkuQuantityPriceModel() {
        return skuQuantityPriceModel;
    }

    /**
     * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example: {@code
     * 2025-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example: {@code
     * 2025-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
    private final java.util.Date timeTerminated;

    /**
     * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeTerminated() {
        return timeTerminated;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Entity/User who lastly updated the ccdCommitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
    private final String lastUpdatedBy;

    /**
     * Entity/User who lastly updated the ccdCommitment.
     *
     * @return the value
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /** The entity that created the CCD commitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The entity that created the CCD commitment.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Entity/User who approved the ccdCommitment. */
    @com.fasterxml.jackson.annotation.JsonProperty("approvedBy")
    private final String approvedBy;

    /**
     * Entity/User who approved the ccdCommitment.
     *
     * @return the value
     */
    public String getApprovedBy() {
        return approvedBy;
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
        sb.append("CcdCommitment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", offerId=").append(String.valueOf(this.offerId));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", reclaimTerm=").append(String.valueOf(this.reclaimTerm));
        sb.append(", reclaimTermUnit=").append(String.valueOf(this.reclaimTermUnit));
        sb.append(", timeCcdCommitmentStarts=")
                .append(String.valueOf(this.timeCcdCommitmentStarts));
        sb.append(", timeCcdCommitmentEnds=").append(String.valueOf(this.timeCcdCommitmentEnds));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fillerTenancyId=").append(String.valueOf(this.fillerTenancyId));
        sb.append(", fillerTenancyHomeRegion=")
                .append(String.valueOf(this.fillerTenancyHomeRegion));
        sb.append(", usageEligibility=").append(String.valueOf(this.usageEligibility));
        sb.append(", secondarySkus=").append(String.valueOf(this.secondarySkus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", skuQuantityPriceModel=").append(String.valueOf(this.skuQuantityPriceModel));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeTerminated=").append(String.valueOf(this.timeTerminated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", lastUpdatedBy=").append(String.valueOf(this.lastUpdatedBy));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", approvedBy=").append(String.valueOf(this.approvedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CcdCommitment)) {
            return false;
        }

        CcdCommitment other = (CcdCommitment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.offerId, other.offerId)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.reclaimTerm, other.reclaimTerm)
                && java.util.Objects.equals(this.reclaimTermUnit, other.reclaimTermUnit)
                && java.util.Objects.equals(
                        this.timeCcdCommitmentStarts, other.timeCcdCommitmentStarts)
                && java.util.Objects.equals(this.timeCcdCommitmentEnds, other.timeCcdCommitmentEnds)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fillerTenancyId, other.fillerTenancyId)
                && java.util.Objects.equals(
                        this.fillerTenancyHomeRegion, other.fillerTenancyHomeRegion)
                && java.util.Objects.equals(this.usageEligibility, other.usageEligibility)
                && java.util.Objects.equals(this.secondarySkus, other.secondarySkus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.skuQuantityPriceModel, other.skuQuantityPriceModel)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeTerminated, other.timeTerminated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.lastUpdatedBy, other.lastUpdatedBy)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.approvedBy, other.approvedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.offerId == null ? 43 : this.offerId.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.reclaimTerm == null ? 43 : this.reclaimTerm.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimTermUnit == null ? 43 : this.reclaimTermUnit.hashCode());
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
                        + (this.fillerTenancyHomeRegion == null
                                ? 43
                                : this.fillerTenancyHomeRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.usageEligibility == null ? 43 : this.usageEligibility.hashCode());
        result =
                (result * PRIME)
                        + (this.secondarySkus == null ? 43 : this.secondarySkus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.skuQuantityPriceModel == null
                                ? 43
                                : this.skuQuantityPriceModel.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTerminated == null ? 43 : this.timeTerminated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdatedBy == null ? 43 : this.lastUpdatedBy.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.approvedBy == null ? 43 : this.approvedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
