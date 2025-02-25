/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The information about new Offers.
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
    builder = CreateOfferDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOfferDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "sellerCompartmentId",
        "buyerCompartmentId",
        "description",
        "internalNotes",
        "timeStartDate",
        "duration",
        "timeAcceptBy",
        "pricing",
        "buyerInformation",
        "sellerInformation",
        "resourceBundles",
        "customFields",
        "freeformTags",
        "definedTags"
    })
    public CreateOfferDetails(
            String displayName,
            String sellerCompartmentId,
            String buyerCompartmentId,
            String description,
            String internalNotes,
            java.util.Date timeStartDate,
            String duration,
            java.util.Date timeAcceptBy,
            Pricing pricing,
            BuyerInformation buyerInformation,
            SellerInformation sellerInformation,
            java.util.List<ResourceBundle> resourceBundles,
            java.util.List<CustomField> customFields,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.sellerCompartmentId = sellerCompartmentId;
        this.buyerCompartmentId = buyerCompartmentId;
        this.description = description;
        this.internalNotes = internalNotes;
        this.timeStartDate = timeStartDate;
        this.duration = duration;
        this.timeAcceptBy = timeAcceptBy;
        this.pricing = pricing;
        this.buyerInformation = buyerInformation;
        this.sellerInformation = sellerInformation;
        this.resourceBundles = resourceBundles;
        this.customFields = customFields;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Offers Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Offers Identifier
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier of the seller
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sellerCompartmentId")
        private String sellerCompartmentId;

        /**
         * Compartment Identifier of the seller
         * @param sellerCompartmentId the value to set
         * @return this builder
         **/
        public Builder sellerCompartmentId(String sellerCompartmentId) {
            this.sellerCompartmentId = sellerCompartmentId;
            this.__explicitlySet__.add("sellerCompartmentId");
            return this;
        }
        /**
         * Compartment Identifier of the buyer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentId")
        private String buyerCompartmentId;

        /**
         * Compartment Identifier of the buyer
         * @param buyerCompartmentId the value to set
         * @return this builder
         **/
        public Builder buyerCompartmentId(String buyerCompartmentId) {
            this.buyerCompartmentId = buyerCompartmentId;
            this.__explicitlySet__.add("buyerCompartmentId");
            return this;
        }
        /**
         * Description of the Offer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Offer
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Internal notes of the Offer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalNotes")
        private String internalNotes;

        /**
         * Internal notes of the Offer
         * @param internalNotes the value to set
         * @return this builder
         **/
        public Builder internalNotes(String internalNotes) {
            this.internalNotes = internalNotes;
            this.__explicitlySet__.add("internalNotes");
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
         * Duration the Offer will be active after its start date. An ISO8601 extended formatted string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private String duration;

        /**
         * Duration the Offer will be active after its start date. An ISO8601 extended formatted string.
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(String duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
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

        @com.fasterxml.jackson.annotation.JsonProperty("pricing")
        private Pricing pricing;

        public Builder pricing(Pricing pricing) {
            this.pricing = pricing;
            this.__explicitlySet__.add("pricing");
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
        /**
         * A list of Resource Bundles associated with an Offer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceBundles")
        private java.util.List<ResourceBundle> resourceBundles;

        /**
         * A list of Resource Bundles associated with an Offer.
         * @param resourceBundles the value to set
         * @return this builder
         **/
        public Builder resourceBundles(java.util.List<ResourceBundle> resourceBundles) {
            this.resourceBundles = resourceBundles;
            this.__explicitlySet__.add("resourceBundles");
            return this;
        }
        /**
         * A list of key value pairs specified by the seller
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customFields")
        private java.util.List<CustomField> customFields;

        /**
         * A list of key value pairs specified by the seller
         * @param customFields the value to set
         * @return this builder
         **/
        public Builder customFields(java.util.List<CustomField> customFields) {
            this.customFields = customFields;
            this.__explicitlySet__.add("customFields");
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

        public CreateOfferDetails build() {
            CreateOfferDetails model =
                    new CreateOfferDetails(
                            this.displayName,
                            this.sellerCompartmentId,
                            this.buyerCompartmentId,
                            this.description,
                            this.internalNotes,
                            this.timeStartDate,
                            this.duration,
                            this.timeAcceptBy,
                            this.pricing,
                            this.buyerInformation,
                            this.sellerInformation,
                            this.resourceBundles,
                            this.customFields,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOfferDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sellerCompartmentId")) {
                this.sellerCompartmentId(model.getSellerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("buyerCompartmentId")) {
                this.buyerCompartmentId(model.getBuyerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("internalNotes")) {
                this.internalNotes(model.getInternalNotes());
            }
            if (model.wasPropertyExplicitlySet("timeStartDate")) {
                this.timeStartDate(model.getTimeStartDate());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("timeAcceptBy")) {
                this.timeAcceptBy(model.getTimeAcceptBy());
            }
            if (model.wasPropertyExplicitlySet("pricing")) {
                this.pricing(model.getPricing());
            }
            if (model.wasPropertyExplicitlySet("buyerInformation")) {
                this.buyerInformation(model.getBuyerInformation());
            }
            if (model.wasPropertyExplicitlySet("sellerInformation")) {
                this.sellerInformation(model.getSellerInformation());
            }
            if (model.wasPropertyExplicitlySet("resourceBundles")) {
                this.resourceBundles(model.getResourceBundles());
            }
            if (model.wasPropertyExplicitlySet("customFields")) {
                this.customFields(model.getCustomFields());
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
     * Offers Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Offers Identifier
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier of the seller
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sellerCompartmentId")
    private final String sellerCompartmentId;

    /**
     * Compartment Identifier of the seller
     * @return the value
     **/
    public String getSellerCompartmentId() {
        return sellerCompartmentId;
    }

    /**
     * Compartment Identifier of the buyer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buyerCompartmentId")
    private final String buyerCompartmentId;

    /**
     * Compartment Identifier of the buyer
     * @return the value
     **/
    public String getBuyerCompartmentId() {
        return buyerCompartmentId;
    }

    /**
     * Description of the Offer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Offer
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Internal notes of the Offer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalNotes")
    private final String internalNotes;

    /**
     * Internal notes of the Offer
     * @return the value
     **/
    public String getInternalNotes() {
        return internalNotes;
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
     * Duration the Offer will be active after its start date. An ISO8601 extended formatted string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final String duration;

    /**
     * Duration the Offer will be active after its start date. An ISO8601 extended formatted string.
     * @return the value
     **/
    public String getDuration() {
        return duration;
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

    @com.fasterxml.jackson.annotation.JsonProperty("pricing")
    private final Pricing pricing;

    public Pricing getPricing() {
        return pricing;
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

    /**
     * A list of Resource Bundles associated with an Offer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceBundles")
    private final java.util.List<ResourceBundle> resourceBundles;

    /**
     * A list of Resource Bundles associated with an Offer.
     * @return the value
     **/
    public java.util.List<ResourceBundle> getResourceBundles() {
        return resourceBundles;
    }

    /**
     * A list of key value pairs specified by the seller
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customFields")
    private final java.util.List<CustomField> customFields;

    /**
     * A list of key value pairs specified by the seller
     * @return the value
     **/
    public java.util.List<CustomField> getCustomFields() {
        return customFields;
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
        sb.append("CreateOfferDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", sellerCompartmentId=").append(String.valueOf(this.sellerCompartmentId));
        sb.append(", buyerCompartmentId=").append(String.valueOf(this.buyerCompartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", internalNotes=").append(String.valueOf(this.internalNotes));
        sb.append(", timeStartDate=").append(String.valueOf(this.timeStartDate));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", timeAcceptBy=").append(String.valueOf(this.timeAcceptBy));
        sb.append(", pricing=").append(String.valueOf(this.pricing));
        sb.append(", buyerInformation=").append(String.valueOf(this.buyerInformation));
        sb.append(", sellerInformation=").append(String.valueOf(this.sellerInformation));
        sb.append(", resourceBundles=").append(String.valueOf(this.resourceBundles));
        sb.append(", customFields=").append(String.valueOf(this.customFields));
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
        if (!(o instanceof CreateOfferDetails)) {
            return false;
        }

        CreateOfferDetails other = (CreateOfferDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sellerCompartmentId, other.sellerCompartmentId)
                && java.util.Objects.equals(this.buyerCompartmentId, other.buyerCompartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.internalNotes, other.internalNotes)
                && java.util.Objects.equals(this.timeStartDate, other.timeStartDate)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.timeAcceptBy, other.timeAcceptBy)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(this.buyerInformation, other.buyerInformation)
                && java.util.Objects.equals(this.sellerInformation, other.sellerInformation)
                && java.util.Objects.equals(this.resourceBundles, other.resourceBundles)
                && java.util.Objects.equals(this.customFields, other.customFields)
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
                        + (this.sellerCompartmentId == null
                                ? 43
                                : this.sellerCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerCompartmentId == null
                                ? 43
                                : this.buyerCompartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.internalNotes == null ? 43 : this.internalNotes.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartDate == null ? 43 : this.timeStartDate.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result = (result * PRIME) + (this.timeAcceptBy == null ? 43 : this.timeAcceptBy.hashCode());
        result = (result * PRIME) + (this.pricing == null ? 43 : this.pricing.hashCode());
        result =
                (result * PRIME)
                        + (this.buyerInformation == null ? 43 : this.buyerInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.sellerInformation == null ? 43 : this.sellerInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceBundles == null ? 43 : this.resourceBundles.hashCode());
        result = (result * PRIME) + (this.customFields == null ? 43 : this.customFields.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
