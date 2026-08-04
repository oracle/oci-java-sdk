/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * Summary of the offer quotes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OfferQuoteSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OfferQuoteSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "resellerCompartmentId",
        "isvCompartmentId",
        "buyerCompartmentIds",
        "resellerPublisherDisplayName",
        "isvPublisherDisplayName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "offerQuoteStatus",
        "resellerInformation",
        "isvInformation",
        "pricing",
        "buyerAcceptanceDeadline",
        "buyerOfferDuration",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OfferQuoteSummary(
            String id,
            String displayName,
            String resellerCompartmentId,
            String isvCompartmentId,
            java.util.List<String> buyerCompartmentIds,
            String resellerPublisherDisplayName,
            String isvPublisherDisplayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            OfferQuote.LifecycleState lifecycleState,
            String lifecycleDetails,
            OfferQuote.OfferQuoteStatus offerQuoteStatus,
            ResellerInformation resellerInformation,
            IsvInformation isvInformation,
            Pricing pricing,
            java.util.Date buyerAcceptanceDeadline,
            String buyerOfferDuration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.resellerCompartmentId = resellerCompartmentId;
        this.isvCompartmentId = isvCompartmentId;
        this.buyerCompartmentIds = buyerCompartmentIds;
        this.resellerPublisherDisplayName = resellerPublisherDisplayName;
        this.isvPublisherDisplayName = isvPublisherDisplayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.offerQuoteStatus = offerQuoteStatus;
        this.resellerInformation = resellerInformation;
        this.isvInformation = isvInformation;
        this.pricing = pricing;
        this.buyerAcceptanceDeadline = buyerAcceptanceDeadline;
        this.buyerOfferDuration = buyerOfferDuration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Offer quote identifier, can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Offer quote identifier, can be renamed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** OCID of the reseller tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("resellerCompartmentId")
        private String resellerCompartmentId;

        /**
         * OCID of the reseller tenancy.
         *
         * @param resellerCompartmentId the value to set
         * @return this builder
         */
        public Builder resellerCompartmentId(String resellerCompartmentId) {
            this.resellerCompartmentId = resellerCompartmentId;
            this.__explicitlySet__.add("resellerCompartmentId");
            return this;
        }
        /** OCID of the ISV tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("isvCompartmentId")
        private String isvCompartmentId;

        /**
         * OCID of the ISV tenancy.
         *
         * @param isvCompartmentId the value to set
         * @return this builder
         */
        public Builder isvCompartmentId(String isvCompartmentId) {
            this.isvCompartmentId = isvCompartmentId;
            this.__explicitlySet__.add("isvCompartmentId");
            return this;
        }
        /** A list of buyer tenancies. */
        @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentIds")
        private java.util.List<String> buyerCompartmentIds;

        /**
         * A list of buyer tenancies.
         *
         * @param buyerCompartmentIds the value to set
         * @return this builder
         */
        public Builder buyerCompartmentIds(java.util.List<String> buyerCompartmentIds) {
            this.buyerCompartmentIds = buyerCompartmentIds;
            this.__explicitlySet__.add("buyerCompartmentIds");
            return this;
        }
        /** Display name of the reseller publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("resellerPublisherDisplayName")
        private String resellerPublisherDisplayName;

        /**
         * Display name of the reseller publisher.
         *
         * @param resellerPublisherDisplayName the value to set
         * @return this builder
         */
        public Builder resellerPublisherDisplayName(String resellerPublisherDisplayName) {
            this.resellerPublisherDisplayName = resellerPublisherDisplayName;
            this.__explicitlySet__.add("resellerPublisherDisplayName");
            return this;
        }
        /** Display name of the ISV publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("isvPublisherDisplayName")
        private String isvPublisherDisplayName;

        /**
         * Display name of the ISV publisher.
         *
         * @param isvPublisherDisplayName the value to set
         * @return this builder
         */
        public Builder isvPublisherDisplayName(String isvPublisherDisplayName) {
            this.isvPublisherDisplayName = isvPublisherDisplayName;
            this.__explicitlySet__.add("isvPublisherDisplayName");
            return this;
        }
        /** The time the offer quote was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the offer quote was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the offer quote was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the offer quote was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the offer quote. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OfferQuote.LifecycleState lifecycleState;

        /**
         * The current state of the offer quote.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OfferQuote.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Provides detailed information about the current state of the offer quote. For example, if
         * the offer quote is in a failed state this message can include specific validation errors.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Provides detailed information about the current state of the offer quote. For example, if
         * the offer quote is in a failed state this message can include specific validation errors.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The human readable representation of where the offer quote is at in its contract
         * lifecycle.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offerQuoteStatus")
        private OfferQuote.OfferQuoteStatus offerQuoteStatus;

        /**
         * The human readable representation of where the offer quote is at in its contract
         * lifecycle.
         *
         * @param offerQuoteStatus the value to set
         * @return this builder
         */
        public Builder offerQuoteStatus(OfferQuote.OfferQuoteStatus offerQuoteStatus) {
            this.offerQuoteStatus = offerQuoteStatus;
            this.__explicitlySet__.add("offerQuoteStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resellerInformation")
        private ResellerInformation resellerInformation;

        public Builder resellerInformation(ResellerInformation resellerInformation) {
            this.resellerInformation = resellerInformation;
            this.__explicitlySet__.add("resellerInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isvInformation")
        private IsvInformation isvInformation;

        public Builder isvInformation(IsvInformation isvInformation) {
            this.isvInformation = isvInformation;
            this.__explicitlySet__.add("isvInformation");
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
         * The time the offer for the buyer must be accepted by before the offer becomes invalid. An
         * RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("buyerAcceptanceDeadline")
        private java.util.Date buyerAcceptanceDeadline;

        /**
         * The time the offer for the buyer must be accepted by before the offer becomes invalid. An
         * RFC3339 formatted datetime string.
         *
         * @param buyerAcceptanceDeadline the value to set
         * @return this builder
         */
        public Builder buyerAcceptanceDeadline(java.util.Date buyerAcceptanceDeadline) {
            this.buyerAcceptanceDeadline = buyerAcceptanceDeadline;
            this.__explicitlySet__.add("buyerAcceptanceDeadline");
            return this;
        }
        /**
         * Duration the offer for the buyer will be active after its start date. An ISO8601 extended
         * formatted string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("buyerOfferDuration")
        private String buyerOfferDuration;

        /**
         * Duration the offer for the buyer will be active after its start date. An ISO8601 extended
         * formatted string.
         *
         * @param buyerOfferDuration the value to set
         * @return this builder
         */
        public Builder buyerOfferDuration(String buyerOfferDuration) {
            this.buyerOfferDuration = buyerOfferDuration;
            this.__explicitlySet__.add("buyerOfferDuration");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OfferQuoteSummary build() {
            OfferQuoteSummary model =
                    new OfferQuoteSummary(
                            this.id,
                            this.displayName,
                            this.resellerCompartmentId,
                            this.isvCompartmentId,
                            this.buyerCompartmentIds,
                            this.resellerPublisherDisplayName,
                            this.isvPublisherDisplayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.offerQuoteStatus,
                            this.resellerInformation,
                            this.isvInformation,
                            this.pricing,
                            this.buyerAcceptanceDeadline,
                            this.buyerOfferDuration,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OfferQuoteSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resellerCompartmentId")) {
                this.resellerCompartmentId(model.getResellerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isvCompartmentId")) {
                this.isvCompartmentId(model.getIsvCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("buyerCompartmentIds")) {
                this.buyerCompartmentIds(model.getBuyerCompartmentIds());
            }
            if (model.wasPropertyExplicitlySet("resellerPublisherDisplayName")) {
                this.resellerPublisherDisplayName(model.getResellerPublisherDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isvPublisherDisplayName")) {
                this.isvPublisherDisplayName(model.getIsvPublisherDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("offerQuoteStatus")) {
                this.offerQuoteStatus(model.getOfferQuoteStatus());
            }
            if (model.wasPropertyExplicitlySet("resellerInformation")) {
                this.resellerInformation(model.getResellerInformation());
            }
            if (model.wasPropertyExplicitlySet("isvInformation")) {
                this.isvInformation(model.getIsvInformation());
            }
            if (model.wasPropertyExplicitlySet("pricing")) {
                this.pricing(model.getPricing());
            }
            if (model.wasPropertyExplicitlySet("buyerAcceptanceDeadline")) {
                this.buyerAcceptanceDeadline(model.getBuyerAcceptanceDeadline());
            }
            if (model.wasPropertyExplicitlySet("buyerOfferDuration")) {
                this.buyerOfferDuration(model.getBuyerOfferDuration());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Offer quote identifier, can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Offer quote identifier, can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** OCID of the reseller tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("resellerCompartmentId")
    private final String resellerCompartmentId;

    /**
     * OCID of the reseller tenancy.
     *
     * @return the value
     */
    public String getResellerCompartmentId() {
        return resellerCompartmentId;
    }

    /** OCID of the ISV tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("isvCompartmentId")
    private final String isvCompartmentId;

    /**
     * OCID of the ISV tenancy.
     *
     * @return the value
     */
    public String getIsvCompartmentId() {
        return isvCompartmentId;
    }

    /** A list of buyer tenancies. */
    @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentIds")
    private final java.util.List<String> buyerCompartmentIds;

    /**
     * A list of buyer tenancies.
     *
     * @return the value
     */
    public java.util.List<String> getBuyerCompartmentIds() {
        return buyerCompartmentIds;
    }

    /** Display name of the reseller publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("resellerPublisherDisplayName")
    private final String resellerPublisherDisplayName;

    /**
     * Display name of the reseller publisher.
     *
     * @return the value
     */
    public String getResellerPublisherDisplayName() {
        return resellerPublisherDisplayName;
    }

    /** Display name of the ISV publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("isvPublisherDisplayName")
    private final String isvPublisherDisplayName;

    /**
     * Display name of the ISV publisher.
     *
     * @return the value
     */
    public String getIsvPublisherDisplayName() {
        return isvPublisherDisplayName;
    }

    /** The time the offer quote was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the offer quote was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the offer quote was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the offer quote was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the offer quote. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OfferQuote.LifecycleState lifecycleState;

    /**
     * The current state of the offer quote.
     *
     * @return the value
     */
    public OfferQuote.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Provides detailed information about the current state of the offer quote. For example, if the
     * offer quote is in a failed state this message can include specific validation errors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Provides detailed information about the current state of the offer quote. For example, if the
     * offer quote is in a failed state this message can include specific validation errors.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The human readable representation of where the offer quote is at in its contract lifecycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offerQuoteStatus")
    private final OfferQuote.OfferQuoteStatus offerQuoteStatus;

    /**
     * The human readable representation of where the offer quote is at in its contract lifecycle.
     *
     * @return the value
     */
    public OfferQuote.OfferQuoteStatus getOfferQuoteStatus() {
        return offerQuoteStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resellerInformation")
    private final ResellerInformation resellerInformation;

    public ResellerInformation getResellerInformation() {
        return resellerInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("isvInformation")
    private final IsvInformation isvInformation;

    public IsvInformation getIsvInformation() {
        return isvInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pricing")
    private final Pricing pricing;

    public Pricing getPricing() {
        return pricing;
    }

    /**
     * The time the offer for the buyer must be accepted by before the offer becomes invalid. An
     * RFC3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buyerAcceptanceDeadline")
    private final java.util.Date buyerAcceptanceDeadline;

    /**
     * The time the offer for the buyer must be accepted by before the offer becomes invalid. An
     * RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getBuyerAcceptanceDeadline() {
        return buyerAcceptanceDeadline;
    }

    /**
     * Duration the offer for the buyer will be active after its start date. An ISO8601 extended
     * formatted string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("buyerOfferDuration")
    private final String buyerOfferDuration;

    /**
     * Duration the offer for the buyer will be active after its start date. An ISO8601 extended
     * formatted string.
     *
     * @return the value
     */
    public String getBuyerOfferDuration() {
        return buyerOfferDuration;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OfferQuoteSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", resellerCompartmentId=").append(String.valueOf(this.resellerCompartmentId));
        sb.append(", isvCompartmentId=").append(String.valueOf(this.isvCompartmentId));
        sb.append(", buyerCompartmentIds=").append(String.valueOf(this.buyerCompartmentIds));
        sb.append(", resellerPublisherDisplayName=")
                .append(String.valueOf(this.resellerPublisherDisplayName));
        sb.append(", isvPublisherDisplayName=")
                .append(String.valueOf(this.isvPublisherDisplayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", offerQuoteStatus=").append(String.valueOf(this.offerQuoteStatus));
        sb.append(", resellerInformation=").append(String.valueOf(this.resellerInformation));
        sb.append(", isvInformation=").append(String.valueOf(this.isvInformation));
        sb.append(", pricing=").append(String.valueOf(this.pricing));
        sb.append(", buyerAcceptanceDeadline=")
                .append(String.valueOf(this.buyerAcceptanceDeadline));
        sb.append(", buyerOfferDuration=").append(String.valueOf(this.buyerOfferDuration));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OfferQuoteSummary)) {
            return false;
        }

        OfferQuoteSummary other = (OfferQuoteSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resellerCompartmentId, other.resellerCompartmentId)
                && java.util.Objects.equals(this.isvCompartmentId, other.isvCompartmentId)
                && java.util.Objects.equals(this.buyerCompartmentIds, other.buyerCompartmentIds)
                && java.util.Objects.equals(
                        this.resellerPublisherDisplayName, other.resellerPublisherDisplayName)
                && java.util.Objects.equals(
                        this.isvPublisherDisplayName, other.isvPublisherDisplayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.offerQuoteStatus, other.offerQuoteStatus)
                && java.util.Objects.equals(this.resellerInformation, other.resellerInformation)
                && java.util.Objects.equals(this.isvInformation, other.isvInformation)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(
                        this.buyerAcceptanceDeadline, other.buyerAcceptanceDeadline)
                && java.util.Objects.equals(this.buyerOfferDuration, other.buyerOfferDuration)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
                        + (this.resellerCompartmentId == null
                                ? 43
                                : this.resellerCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isvCompartmentId == null ? 43 : this.isvCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerCompartmentIds == null
                                ? 43
                                : this.buyerCompartmentIds.hashCode());
        result =
                (result * PRIME)
                        + (this.resellerPublisherDisplayName == null
                                ? 43
                                : this.resellerPublisherDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isvPublisherDisplayName == null
                                ? 43
                                : this.isvPublisherDisplayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.offerQuoteStatus == null ? 43 : this.offerQuoteStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.resellerInformation == null
                                ? 43
                                : this.resellerInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.isvInformation == null ? 43 : this.isvInformation.hashCode());
        result = (result * PRIME) + (this.pricing == null ? 43 : this.pricing.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerAcceptanceDeadline == null
                                ? 43
                                : this.buyerAcceptanceDeadline.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerOfferDuration == null
                                ? 43
                                : this.buyerOfferDuration.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
