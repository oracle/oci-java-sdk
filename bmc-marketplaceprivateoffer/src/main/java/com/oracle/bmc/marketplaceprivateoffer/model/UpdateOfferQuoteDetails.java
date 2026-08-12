/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * The information to be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOfferQuoteDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOfferQuoteDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isvCompartmentId",
        "isvPublisherId",
        "description",
        "buyerCompartmentIds",
        "resellerInformation",
        "isvInformation",
        "resourceBundles",
        "buyerAcceptanceDeadline",
        "buyerOfferDuration",
        "freeformTags",
        "definedTags"
    })
    public UpdateOfferQuoteDetails(
            String displayName,
            String isvCompartmentId,
            String isvPublisherId,
            String description,
            java.util.List<String> buyerCompartmentIds,
            ResellerInformation resellerInformation,
            IsvInformation isvInformation,
            java.util.List<ResourceBundle> resourceBundles,
            java.util.Date buyerAcceptanceDeadline,
            String buyerOfferDuration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.isvCompartmentId = isvCompartmentId;
        this.isvPublisherId = isvPublisherId;
        this.description = description;
        this.buyerCompartmentIds = buyerCompartmentIds;
        this.resellerInformation = resellerInformation;
        this.isvInformation = isvInformation;
        this.resourceBundles = resourceBundles;
        this.buyerAcceptanceDeadline = buyerAcceptanceDeadline;
        this.buyerOfferDuration = buyerOfferDuration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Offer quotes identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Offer quotes identifier.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment identifier of the ISV.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isvCompartmentId")
        private String isvCompartmentId;

        /**
         * Compartment identifier of the ISV.
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
         * Description of the offer quote.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the offer quote.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /**
         * A list of resource bundles associated with an offer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceBundles")
        private java.util.List<ResourceBundle> resourceBundles;

        /**
         * A list of resource bundles associated with an offer.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOfferQuoteDetails build() {
            UpdateOfferQuoteDetails model =
                    new UpdateOfferQuoteDetails(
                            this.displayName,
                            this.isvCompartmentId,
                            this.isvPublisherId,
                            this.description,
                            this.buyerCompartmentIds,
                            this.resellerInformation,
                            this.isvInformation,
                            this.resourceBundles,
                            this.buyerAcceptanceDeadline,
                            this.buyerOfferDuration,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOfferQuoteDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isvCompartmentId")) {
                this.isvCompartmentId(model.getIsvCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isvPublisherId")) {
                this.isvPublisherId(model.getIsvPublisherId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("buyerCompartmentIds")) {
                this.buyerCompartmentIds(model.getBuyerCompartmentIds());
            }
            if (model.wasPropertyExplicitlySet("resellerInformation")) {
                this.resellerInformation(model.getResellerInformation());
            }
            if (model.wasPropertyExplicitlySet("isvInformation")) {
                this.isvInformation(model.getIsvInformation());
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
     * Offer quotes identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Offer quotes identifier.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment identifier of the ISV.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isvCompartmentId")
    private final String isvCompartmentId;

    /**
     * Compartment identifier of the ISV.
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
     * Description of the offer quote.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the offer quote.
     * @return the value
     **/
    public String getDescription() {
        return description;
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

    /**
     * A list of resource bundles associated with an offer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceBundles")
    private final java.util.List<ResourceBundle> resourceBundles;

    /**
     * A list of resource bundles associated with an offer.
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
        sb.append("UpdateOfferQuoteDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isvCompartmentId=").append(String.valueOf(this.isvCompartmentId));
        sb.append(", isvPublisherId=").append(String.valueOf(this.isvPublisherId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", buyerCompartmentIds=").append(String.valueOf(this.buyerCompartmentIds));
        sb.append(", resellerInformation=").append(String.valueOf(this.resellerInformation));
        sb.append(", isvInformation=").append(String.valueOf(this.isvInformation));
        sb.append(", resourceBundles=").append(String.valueOf(this.resourceBundles));
        sb.append(", buyerAcceptanceDeadline=")
                .append(String.valueOf(this.buyerAcceptanceDeadline));
        sb.append(", buyerOfferDuration=").append(String.valueOf(this.buyerOfferDuration));
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
        if (!(o instanceof UpdateOfferQuoteDetails)) {
            return false;
        }

        UpdateOfferQuoteDetails other = (UpdateOfferQuoteDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isvCompartmentId, other.isvCompartmentId)
                && java.util.Objects.equals(this.isvPublisherId, other.isvPublisherId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.buyerCompartmentIds, other.buyerCompartmentIds)
                && java.util.Objects.equals(this.resellerInformation, other.resellerInformation)
                && java.util.Objects.equals(this.isvInformation, other.isvInformation)
                && java.util.Objects.equals(this.resourceBundles, other.resourceBundles)
                && java.util.Objects.equals(
                        this.buyerAcceptanceDeadline, other.buyerAcceptanceDeadline)
                && java.util.Objects.equals(this.buyerOfferDuration, other.buyerOfferDuration)
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
                        + (this.isvCompartmentId == null ? 43 : this.isvCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isvPublisherId == null ? 43 : this.isvPublisherId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerCompartmentIds == null
                                ? 43
                                : this.buyerCompartmentIds.hashCode());
        result =
                (result * PRIME)
                        + (this.resellerInformation == null
                                ? 43
                                : this.resellerInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.isvInformation == null ? 43 : this.isvInformation.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
