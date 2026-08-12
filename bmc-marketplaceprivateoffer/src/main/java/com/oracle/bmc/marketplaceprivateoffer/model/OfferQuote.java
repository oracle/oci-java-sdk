/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * The model for the offer quote details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OfferQuote.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OfferQuote extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "resellerCompartmentId",
        "isvCompartmentId",
        "isvPublisherId",
        "resellerPublisherDisplayName",
        "isvPublisherDisplayName",
        "buyerCompartmentIds",
        "description",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "offerQuoteStatus",
        "resellerInformation",
        "isvInformation",
        "pricing",
        "resourceBundles",
        "buyerAcceptanceDeadline",
        "buyerOfferDuration",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OfferQuote(
            String id,
            String displayName,
            String resellerCompartmentId,
            String isvCompartmentId,
            String isvPublisherId,
            String resellerPublisherDisplayName,
            String isvPublisherDisplayName,
            java.util.List<String> buyerCompartmentIds,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            OfferQuoteStatus offerQuoteStatus,
            ResellerInformation resellerInformation,
            IsvInformation isvInformation,
            Pricing pricing,
            java.util.List<ResourceBundle> resourceBundles,
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
        this.isvPublisherId = isvPublisherId;
        this.resellerPublisherDisplayName = resellerPublisherDisplayName;
        this.isvPublisherDisplayName = isvPublisherDisplayName;
        this.buyerCompartmentIds = buyerCompartmentIds;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.offerQuoteStatus = offerQuoteStatus;
        this.resellerInformation = resellerInformation;
        this.isvInformation = isvInformation;
        this.pricing = pricing;
        this.resourceBundles = resourceBundles;
        this.buyerAcceptanceDeadline = buyerAcceptanceDeadline;
        this.buyerOfferDuration = buyerOfferDuration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Offer quote identifier, can be renamed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Offer quote identifier, can be renamed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * OCID of the reseller tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resellerCompartmentId")
        private String resellerCompartmentId;

        /**
         * OCID of the reseller tenancy.
         * @param resellerCompartmentId the value to set
         * @return this builder
         **/
        public Builder resellerCompartmentId(String resellerCompartmentId) {
            this.resellerCompartmentId = resellerCompartmentId;
            this.__explicitlySet__.add("resellerCompartmentId");
            return this;
        }
        /**
         * OCID of the ISV tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isvCompartmentId")
        private String isvCompartmentId;

        /**
         * OCID of the ISV tenancy.
         * @param isvCompartmentId the value to set
         * @return this builder
         **/
        public Builder isvCompartmentId(String isvCompartmentId) {
            this.isvCompartmentId = isvCompartmentId;
            this.__explicitlySet__.add("isvCompartmentId");
            return this;
        }
        /**
         * Publisher identifier of the ISV.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isvPublisherId")
        private String isvPublisherId;

        /**
         * Publisher identifier of the ISV.
         * @param isvPublisherId the value to set
         * @return this builder
         **/
        public Builder isvPublisherId(String isvPublisherId) {
            this.isvPublisherId = isvPublisherId;
            this.__explicitlySet__.add("isvPublisherId");
            return this;
        }
        /**
         * Display name of the reseller publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resellerPublisherDisplayName")
        private String resellerPublisherDisplayName;

        /**
         * Display name of the reseller publisher.
         * @param resellerPublisherDisplayName the value to set
         * @return this builder
         **/
        public Builder resellerPublisherDisplayName(String resellerPublisherDisplayName) {
            this.resellerPublisherDisplayName = resellerPublisherDisplayName;
            this.__explicitlySet__.add("resellerPublisherDisplayName");
            return this;
        }
        /**
         * Display name of the ISV publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isvPublisherDisplayName")
        private String isvPublisherDisplayName;

        /**
         * Display name of the ISV publisher.
         * @param isvPublisherDisplayName the value to set
         * @return this builder
         **/
        public Builder isvPublisherDisplayName(String isvPublisherDisplayName) {
            this.isvPublisherDisplayName = isvPublisherDisplayName;
            this.__explicitlySet__.add("isvPublisherDisplayName");
            return this;
        }
        /**
         * A list of buyer tenancies.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentIds")
        private java.util.List<String> buyerCompartmentIds;

        /**
         * A list of buyer tenancies.
         * @param buyerCompartmentIds the value to set
         * @return this builder
         **/
        public Builder buyerCompartmentIds(java.util.List<String> buyerCompartmentIds) {
            this.buyerCompartmentIds = buyerCompartmentIds;
            this.__explicitlySet__.add("buyerCompartmentIds");
            return this;
        }
        /**
         * The description of the offer quote.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the offer quote.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The time the offer quote was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the offer quote was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the offer quote was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the offer quote was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the offer quote.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the offer quote.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Provides detailed information about the current state of the offer quote. For example, if the offer quote is in a failed state this message can include specific validation errors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Provides detailed information about the current state of the offer quote. For example, if the offer quote is in a failed state this message can include specific validation errors.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The human readable representation of where the offer quote is at in its contract lifecycle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offerQuoteStatus")
        private OfferQuoteStatus offerQuoteStatus;

        /**
         * The human readable representation of where the offer quote is at in its contract lifecycle.
         * @param offerQuoteStatus the value to set
         * @return this builder
         **/
        public Builder offerQuoteStatus(OfferQuoteStatus offerQuoteStatus) {
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
         * A list of resource bundles associated with an offer quote.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceBundles")
        private java.util.List<ResourceBundle> resourceBundles;

        /**
         * A list of resource bundles associated with an offer quote.
         * @param resourceBundles the value to set
         * @return this builder
         **/
        public Builder resourceBundles(java.util.List<ResourceBundle> resourceBundles) {
            this.resourceBundles = resourceBundles;
            this.__explicitlySet__.add("resourceBundles");
            return this;
        }
        /**
         * The time the offer for the buyer must be accepted by before the offer becomes invalid. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buyerAcceptanceDeadline")
        private java.util.Date buyerAcceptanceDeadline;

        /**
         * The time the offer for the buyer must be accepted by before the offer becomes invalid. An RFC3339 formatted datetime string.
         * @param buyerAcceptanceDeadline the value to set
         * @return this builder
         **/
        public Builder buyerAcceptanceDeadline(java.util.Date buyerAcceptanceDeadline) {
            this.buyerAcceptanceDeadline = buyerAcceptanceDeadline;
            this.__explicitlySet__.add("buyerAcceptanceDeadline");
            return this;
        }
        /**
         * Duration the offer for the buyer will be active after its start date. An ISO8601 extended formatted string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buyerOfferDuration")
        private String buyerOfferDuration;

        /**
         * Duration the offer for the buyer will be active after its start date. An ISO8601 extended formatted string.
         * @param buyerOfferDuration the value to set
         * @return this builder
         **/
        public Builder buyerOfferDuration(String buyerOfferDuration) {
            this.buyerOfferDuration = buyerOfferDuration;
            this.__explicitlySet__.add("buyerOfferDuration");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OfferQuote build() {
            OfferQuote model =
                    new OfferQuote(
                            this.id,
                            this.displayName,
                            this.resellerCompartmentId,
                            this.isvCompartmentId,
                            this.isvPublisherId,
                            this.resellerPublisherDisplayName,
                            this.isvPublisherDisplayName,
                            this.buyerCompartmentIds,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.offerQuoteStatus,
                            this.resellerInformation,
                            this.isvInformation,
                            this.pricing,
                            this.resourceBundles,
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
        public Builder copy(OfferQuote model) {
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
            if (model.wasPropertyExplicitlySet("isvPublisherId")) {
                this.isvPublisherId(model.getIsvPublisherId());
            }
            if (model.wasPropertyExplicitlySet("resellerPublisherDisplayName")) {
                this.resellerPublisherDisplayName(model.getResellerPublisherDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isvPublisherDisplayName")) {
                this.isvPublisherDisplayName(model.getIsvPublisherDisplayName());
            }
            if (model.wasPropertyExplicitlySet("buyerCompartmentIds")) {
                this.buyerCompartmentIds(model.getBuyerCompartmentIds());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("resourceBundles")) {
                this.resourceBundles(model.getResourceBundles());
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
     * Unique identifier that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Offer quote identifier, can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Offer quote identifier, can be renamed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID of the reseller tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resellerCompartmentId")
    private final String resellerCompartmentId;

    /**
     * OCID of the reseller tenancy.
     * @return the value
     **/
    public String getResellerCompartmentId() {
        return resellerCompartmentId;
    }

    /**
     * OCID of the ISV tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isvCompartmentId")
    private final String isvCompartmentId;

    /**
     * OCID of the ISV tenancy.
     * @return the value
     **/
    public String getIsvCompartmentId() {
        return isvCompartmentId;
    }

    /**
     * Publisher identifier of the ISV.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isvPublisherId")
    private final String isvPublisherId;

    /**
     * Publisher identifier of the ISV.
     * @return the value
     **/
    public String getIsvPublisherId() {
        return isvPublisherId;
    }

    /**
     * Display name of the reseller publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resellerPublisherDisplayName")
    private final String resellerPublisherDisplayName;

    /**
     * Display name of the reseller publisher.
     * @return the value
     **/
    public String getResellerPublisherDisplayName() {
        return resellerPublisherDisplayName;
    }

    /**
     * Display name of the ISV publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isvPublisherDisplayName")
    private final String isvPublisherDisplayName;

    /**
     * Display name of the ISV publisher.
     * @return the value
     **/
    public String getIsvPublisherDisplayName() {
        return isvPublisherDisplayName;
    }

    /**
     * A list of buyer tenancies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentIds")
    private final java.util.List<String> buyerCompartmentIds;

    /**
     * A list of buyer tenancies.
     * @return the value
     **/
    public java.util.List<String> getBuyerCompartmentIds() {
        return buyerCompartmentIds;
    }

    /**
     * The description of the offer quote.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the offer quote.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The time the offer quote was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the offer quote was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the offer quote was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the offer quote was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the offer quote.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The current state of the offer quote.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the offer quote.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Provides detailed information about the current state of the offer quote. For example, if the offer quote is in a failed state this message can include specific validation errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Provides detailed information about the current state of the offer quote. For example, if the offer quote is in a failed state this message can include specific validation errors.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The human readable representation of where the offer quote is at in its contract lifecycle.
     **/
    public enum OfferQuoteStatus {
        Draft("DRAFT"),
        PendingIsv("PENDING_ISV"),
        PendingIsvUpdate("PENDING_ISV_UPDATE"),
        PendingReseller("PENDING_RESELLER"),
        ResellerAccepted("RESELLER_ACCEPTED"),
        BuyerAccepted("BUYER_ACCEPTED"),
        Active("ACTIVE"),
        Ended("ENDED"),
        Expired("EXPIRED"),
        FailedSend("FAILED_SEND"),
        FailedAccept("FAILED_ACCEPT"),
        FailedRespond("FAILED_RESPOND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OfferQuoteStatus.class);

        private final String value;
        private static java.util.Map<String, OfferQuoteStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OfferQuoteStatus v : OfferQuoteStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OfferQuoteStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OfferQuoteStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OfferQuoteStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The human readable representation of where the offer quote is at in its contract lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offerQuoteStatus")
    private final OfferQuoteStatus offerQuoteStatus;

    /**
     * The human readable representation of where the offer quote is at in its contract lifecycle.
     * @return the value
     **/
    public OfferQuoteStatus getOfferQuoteStatus() {
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
     * A list of resource bundles associated with an offer quote.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceBundles")
    private final java.util.List<ResourceBundle> resourceBundles;

    /**
     * A list of resource bundles associated with an offer quote.
     * @return the value
     **/
    public java.util.List<ResourceBundle> getResourceBundles() {
        return resourceBundles;
    }

    /**
     * The time the offer for the buyer must be accepted by before the offer becomes invalid. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buyerAcceptanceDeadline")
    private final java.util.Date buyerAcceptanceDeadline;

    /**
     * The time the offer for the buyer must be accepted by before the offer becomes invalid. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getBuyerAcceptanceDeadline() {
        return buyerAcceptanceDeadline;
    }

    /**
     * Duration the offer for the buyer will be active after its start date. An ISO8601 extended formatted string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buyerOfferDuration")
    private final String buyerOfferDuration;

    /**
     * Duration the offer for the buyer will be active after its start date. An ISO8601 extended formatted string.
     * @return the value
     **/
    public String getBuyerOfferDuration() {
        return buyerOfferDuration;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OfferQuote(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", resellerCompartmentId=").append(String.valueOf(this.resellerCompartmentId));
        sb.append(", isvCompartmentId=").append(String.valueOf(this.isvCompartmentId));
        sb.append(", isvPublisherId=").append(String.valueOf(this.isvPublisherId));
        sb.append(", resellerPublisherDisplayName=")
                .append(String.valueOf(this.resellerPublisherDisplayName));
        sb.append(", isvPublisherDisplayName=")
                .append(String.valueOf(this.isvPublisherDisplayName));
        sb.append(", buyerCompartmentIds=").append(String.valueOf(this.buyerCompartmentIds));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", offerQuoteStatus=").append(String.valueOf(this.offerQuoteStatus));
        sb.append(", resellerInformation=").append(String.valueOf(this.resellerInformation));
        sb.append(", isvInformation=").append(String.valueOf(this.isvInformation));
        sb.append(", pricing=").append(String.valueOf(this.pricing));
        sb.append(", resourceBundles=").append(String.valueOf(this.resourceBundles));
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
        if (!(o instanceof OfferQuote)) {
            return false;
        }

        OfferQuote other = (OfferQuote) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resellerCompartmentId, other.resellerCompartmentId)
                && java.util.Objects.equals(this.isvCompartmentId, other.isvCompartmentId)
                && java.util.Objects.equals(this.isvPublisherId, other.isvPublisherId)
                && java.util.Objects.equals(
                        this.resellerPublisherDisplayName, other.resellerPublisherDisplayName)
                && java.util.Objects.equals(
                        this.isvPublisherDisplayName, other.isvPublisherDisplayName)
                && java.util.Objects.equals(this.buyerCompartmentIds, other.buyerCompartmentIds)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.offerQuoteStatus, other.offerQuoteStatus)
                && java.util.Objects.equals(this.resellerInformation, other.resellerInformation)
                && java.util.Objects.equals(this.isvInformation, other.isvInformation)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(this.resourceBundles, other.resourceBundles)
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
                        + (this.isvPublisherId == null ? 43 : this.isvPublisherId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.buyerCompartmentIds == null
                                ? 43
                                : this.buyerCompartmentIds.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
                        + (this.resourceBundles == null ? 43 : this.resourceBundles.hashCode());
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
