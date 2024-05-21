/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * Summary of the Offers.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OfferSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OfferSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "buyerCompartmentId",
        "sellerCompartmentId",
        "timeCreated",
        "timeUpdated",
        "timeAcceptBy",
        "timeAccepted",
        "timeStartDate",
        "timeOfferEnd",
        "lifecycleState",
        "lifecycleDetails",
        "offerStatus",
        "buyerInformation",
        "sellerInformation",
        "pricing",
        "freeformTags",
        "definedTags"
    })
    public OfferSummary(
            String id,
            String displayName,
            String buyerCompartmentId,
            String sellerCompartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeAcceptBy,
            java.util.Date timeAccepted,
            java.util.Date timeStartDate,
            java.util.Date timeOfferEnd,
            Offer.LifecycleState lifecycleState,
            String lifecycleDetails,
            Offer.OfferStatus offerStatus,
            BuyerInformation buyerInformation,
            SellerInformation sellerInformation,
            Pricing pricing,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.buyerCompartmentId = buyerCompartmentId;
        this.sellerCompartmentId = sellerCompartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeAcceptBy = timeAcceptBy;
        this.timeAccepted = timeAccepted;
        this.timeStartDate = timeStartDate;
        this.timeOfferEnd = timeOfferEnd;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.offerStatus = offerStatus;
        this.buyerInformation = buyerInformation;
        this.sellerInformation = sellerInformation;
        this.pricing = pricing;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Offer Identifier, can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Offer Identifier, can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Ocid of the buyer tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentId")
        private String buyerCompartmentId;

        /**
         * Ocid of the buyer tenancy.
         * @param buyerCompartmentId the value to set
         * @return this builder
         **/
        public Builder buyerCompartmentId(String buyerCompartmentId) {
            this.buyerCompartmentId = buyerCompartmentId;
            this.__explicitlySet__.add("buyerCompartmentId");
            return this;
        }
        /**
         * Ocid of the seller tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sellerCompartmentId")
        private String sellerCompartmentId;

        /**
         * Ocid of the seller tenancy.
         * @param sellerCompartmentId the value to set
         * @return this builder
         **/
        public Builder sellerCompartmentId(String sellerCompartmentId) {
            this.sellerCompartmentId = sellerCompartmentId;
            this.__explicitlySet__.add("sellerCompartmentId");
            return this;
        }
        /**
         * The time the the Offer was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Offer was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the Offer was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Offer was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the Offer must be accepted by the Buyer before the Offer becomes invalid. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAcceptBy")
        private java.util.Date timeAcceptBy;

        /**
         * The time the Offer must be accepted by the Buyer before the Offer becomes invalid. An RFC3339 formatted datetime string
         * @param timeAcceptBy the value to set
         * @return this builder
         **/
        public Builder timeAcceptBy(java.util.Date timeAcceptBy) {
            this.timeAcceptBy = timeAcceptBy;
            this.__explicitlySet__.add("timeAcceptBy");
            return this;
        }
        /**
         * The time the Offer was accepted by the Buyer of the Offer. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * The time the Offer was accepted by the Buyer of the Offer. An RFC3339 formatted datetime string
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * The time the Offer will become active after it has been accepted by the Buyer. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStartDate")
        private java.util.Date timeStartDate;

        /**
         * The time the Offer will become active after it has been accepted by the Buyer. An RFC3339 formatted datetime string
         * @param timeStartDate the value to set
         * @return this builder
         **/
        public Builder timeStartDate(java.util.Date timeStartDate) {
            this.timeStartDate = timeStartDate;
            this.__explicitlySet__.add("timeStartDate");
            return this;
        }
        /**
         * The time the accepted Offer will end. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfferEnd")
        private java.util.Date timeOfferEnd;

        /**
         * The time the accepted Offer will end. An RFC3339 formatted datetime string
         * @param timeOfferEnd the value to set
         * @return this builder
         **/
        public Builder timeOfferEnd(java.util.Date timeOfferEnd) {
            this.timeOfferEnd = timeOfferEnd;
            this.__explicitlySet__.add("timeOfferEnd");
            return this;
        }
        /**
         * The current state of the Offer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Offer.LifecycleState lifecycleState;

        /**
         * The current state of the Offer.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Offer.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The human readable representation of where the offer is at in it's contract lifecycle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offerStatus")
        private Offer.OfferStatus offerStatus;

        /**
         * The human readable representation of where the offer is at in it's contract lifecycle.
         * @param offerStatus the value to set
         * @return this builder
         **/
        public Builder offerStatus(Offer.OfferStatus offerStatus) {
            this.offerStatus = offerStatus;
            this.__explicitlySet__.add("offerStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("buyerInformation")
        private BuyerInformation buyerInformation;

        public Builder buyerInformation(BuyerInformation buyerInformation) {
            this.buyerInformation = buyerInformation;
            this.__explicitlySet__.add("buyerInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sellerInformation")
        private SellerInformation sellerInformation;

        public Builder sellerInformation(SellerInformation sellerInformation) {
            this.sellerInformation = sellerInformation;
            this.__explicitlySet__.add("sellerInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pricing")
        private Pricing pricing;

        public Builder pricing(Pricing pricing) {
            this.pricing = pricing;
            this.__explicitlySet__.add("pricing");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public OfferSummary build() {
            OfferSummary model =
                    new OfferSummary(
                            this.id,
                            this.displayName,
                            this.buyerCompartmentId,
                            this.sellerCompartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeAcceptBy,
                            this.timeAccepted,
                            this.timeStartDate,
                            this.timeOfferEnd,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.offerStatus,
                            this.buyerInformation,
                            this.sellerInformation,
                            this.pricing,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OfferSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("buyerCompartmentId")) {
                this.buyerCompartmentId(model.getBuyerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sellerCompartmentId")) {
                this.sellerCompartmentId(model.getSellerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeAcceptBy")) {
                this.timeAcceptBy(model.getTimeAcceptBy());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStartDate")) {
                this.timeStartDate(model.getTimeStartDate());
            }
            if (model.wasPropertyExplicitlySet("timeOfferEnd")) {
                this.timeOfferEnd(model.getTimeOfferEnd());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("offerStatus")) {
                this.offerStatus(model.getOfferStatus());
            }
            if (model.wasPropertyExplicitlySet("buyerInformation")) {
                this.buyerInformation(model.getBuyerInformation());
            }
            if (model.wasPropertyExplicitlySet("sellerInformation")) {
                this.sellerInformation(model.getSellerInformation());
            }
            if (model.wasPropertyExplicitlySet("pricing")) {
                this.pricing(model.getPricing());
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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Offer Identifier, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Offer Identifier, can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Ocid of the buyer tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentId")
    private final String buyerCompartmentId;

    /**
     * Ocid of the buyer tenancy.
     * @return the value
     **/
    public String getBuyerCompartmentId() {
        return buyerCompartmentId;
    }

    /**
     * Ocid of the seller tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sellerCompartmentId")
    private final String sellerCompartmentId;

    /**
     * Ocid of the seller tenancy.
     * @return the value
     **/
    public String getSellerCompartmentId() {
        return sellerCompartmentId;
    }

    /**
     * The time the the Offer was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Offer was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Offer was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Offer was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the Offer must be accepted by the Buyer before the Offer becomes invalid. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAcceptBy")
    private final java.util.Date timeAcceptBy;

    /**
     * The time the Offer must be accepted by the Buyer before the Offer becomes invalid. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeAcceptBy() {
        return timeAcceptBy;
    }

    /**
     * The time the Offer was accepted by the Buyer of the Offer. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * The time the Offer was accepted by the Buyer of the Offer. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * The time the Offer will become active after it has been accepted by the Buyer. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStartDate")
    private final java.util.Date timeStartDate;

    /**
     * The time the Offer will become active after it has been accepted by the Buyer. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeStartDate() {
        return timeStartDate;
    }

    /**
     * The time the accepted Offer will end. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfferEnd")
    private final java.util.Date timeOfferEnd;

    /**
     * The time the accepted Offer will end. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeOfferEnd() {
        return timeOfferEnd;
    }

    /**
     * The current state of the Offer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Offer.LifecycleState lifecycleState;

    /**
     * The current state of the Offer.
     * @return the value
     **/
    public Offer.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The human readable representation of where the offer is at in it's contract lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offerStatus")
    private final Offer.OfferStatus offerStatus;

    /**
     * The human readable representation of where the offer is at in it's contract lifecycle.
     * @return the value
     **/
    public Offer.OfferStatus getOfferStatus() {
        return offerStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("buyerInformation")
    private final BuyerInformation buyerInformation;

    public BuyerInformation getBuyerInformation() {
        return buyerInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sellerInformation")
    private final SellerInformation sellerInformation;

    public SellerInformation getSellerInformation() {
        return sellerInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pricing")
    private final Pricing pricing;

    public Pricing getPricing() {
        return pricing;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("OfferSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", buyerCompartmentId=").append(String.valueOf(this.buyerCompartmentId));
        sb.append(", sellerCompartmentId=").append(String.valueOf(this.sellerCompartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeAcceptBy=").append(String.valueOf(this.timeAcceptBy));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStartDate=").append(String.valueOf(this.timeStartDate));
        sb.append(", timeOfferEnd=").append(String.valueOf(this.timeOfferEnd));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", offerStatus=").append(String.valueOf(this.offerStatus));
        sb.append(", buyerInformation=").append(String.valueOf(this.buyerInformation));
        sb.append(", sellerInformation=").append(String.valueOf(this.sellerInformation));
        sb.append(", pricing=").append(String.valueOf(this.pricing));
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
        if (!(o instanceof OfferSummary)) {
            return false;
        }

        OfferSummary other = (OfferSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.buyerCompartmentId, other.buyerCompartmentId)
                && java.util.Objects.equals(this.sellerCompartmentId, other.sellerCompartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeAcceptBy, other.timeAcceptBy)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStartDate, other.timeStartDate)
                && java.util.Objects.equals(this.timeOfferEnd, other.timeOfferEnd)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.offerStatus, other.offerStatus)
                && java.util.Objects.equals(this.buyerInformation, other.buyerInformation)
                && java.util.Objects.equals(this.sellerInformation, other.sellerInformation)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerCompartmentId == null
                                ? 43
                                : this.buyerCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sellerCompartmentId == null
                                ? 43
                                : this.sellerCompartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeAcceptBy == null ? 43 : this.timeAcceptBy.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartDate == null ? 43 : this.timeStartDate.hashCode());
        result = (result * PRIME) + (this.timeOfferEnd == null ? 43 : this.timeOfferEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.offerStatus == null ? 43 : this.offerStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerInformation == null ? 43 : this.buyerInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.sellerInformation == null ? 43 : this.sellerInformation.hashCode());
        result = (result * PRIME) + (this.pricing == null ? 43 : this.pricing.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
