/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for the parameters needed to create a publication.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePublicationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePublicationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "listingType",
        "name",
        "shortDescription",
        "longDescription",
        "supportContacts",
        "compartmentId",
        "packageDetails",
        "isAgreementAcknowledged",
        "definedTags",
        "freeformTags"
    })
    public CreatePublicationDetails(
            ListingType listingType,
            String name,
            String shortDescription,
            String longDescription,
            java.util.List<SupportContact> supportContacts,
            String compartmentId,
            CreatePublicationPackage packageDetails,
            Boolean isAgreementAcknowledged,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.listingType = listingType;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.supportContacts = supportContacts;
        this.compartmentId = compartmentId;
        this.packageDetails = packageDetails;
        this.isAgreementAcknowledged = isAgreementAcknowledged;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The publisher category to which the publication belongs. The publisher category informs where the listing appears for use.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingType")
        private ListingType listingType;

        /**
         * The publisher category to which the publication belongs. The publisher category informs where the listing appears for use.
         *
         * @param listingType the value to set
         * @return this builder
         **/
        public Builder listingType(ListingType listingType) {
            this.listingType = listingType;
            this.__explicitlySet__.add("listingType");
            return this;
        }
        /**
         * The name of the publication, which is also used in the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the publication, which is also used in the listing.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A short description of the publication to use in the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the publication to use in the listing.
         * @param shortDescription the value to set
         * @return this builder
         **/
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /**
         * A long description of the publication to use in the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * A long description of the publication to use in the listing.
         * @param longDescription the value to set
         * @return this builder
         **/
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }
        /**
         * Contact information for getting support from the publisher for the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
        private java.util.List<SupportContact> supportContacts;

        /**
         * Contact information for getting support from the publisher for the listing.
         * @param supportContacts the value to set
         * @return this builder
         **/
        public Builder supportContacts(java.util.List<SupportContact> supportContacts) {
            this.supportContacts = supportContacts;
            this.__explicitlySet__.add("supportContacts");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the publication.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the publication.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageDetails")
        private CreatePublicationPackage packageDetails;

        public Builder packageDetails(CreatePublicationPackage packageDetails) {
            this.packageDetails = packageDetails;
            this.__explicitlySet__.add("packageDetails");
            return this;
        }
        /**
         * Whether the publisher acknowledged that they have the right and authority to share the contents of the publication and that they accepted the Oracle terms of use agreements required to create a publication.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAgreementAcknowledged")
        private Boolean isAgreementAcknowledged;

        /**
         * Whether the publisher acknowledged that they have the right and authority to share the contents of the publication and that they accepted the Oracle terms of use agreements required to create a publication.
         *
         * @param isAgreementAcknowledged the value to set
         * @return this builder
         **/
        public Builder isAgreementAcknowledged(Boolean isAgreementAcknowledged) {
            this.isAgreementAcknowledged = isAgreementAcknowledged;
            this.__explicitlySet__.add("isAgreementAcknowledged");
            return this;
        }
        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePublicationDetails build() {
            CreatePublicationDetails model =
                    new CreatePublicationDetails(
                            this.listingType,
                            this.name,
                            this.shortDescription,
                            this.longDescription,
                            this.supportContacts,
                            this.compartmentId,
                            this.packageDetails,
                            this.isAgreementAcknowledged,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePublicationDetails model) {
            if (model.wasPropertyExplicitlySet("listingType")) {
                this.listingType(model.getListingType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("longDescription")) {
                this.longDescription(model.getLongDescription());
            }
            if (model.wasPropertyExplicitlySet("supportContacts")) {
                this.supportContacts(model.getSupportContacts());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("packageDetails")) {
                this.packageDetails(model.getPackageDetails());
            }
            if (model.wasPropertyExplicitlySet("isAgreementAcknowledged")) {
                this.isAgreementAcknowledged(model.getIsAgreementAcknowledged());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * The publisher category to which the publication belongs. The publisher category informs where the listing appears for use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingType")
    private final ListingType listingType;

    /**
     * The publisher category to which the publication belongs. The publisher category informs where the listing appears for use.
     *
     * @return the value
     **/
    public ListingType getListingType() {
        return listingType;
    }

    /**
     * The name of the publication, which is also used in the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the publication, which is also used in the listing.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A short description of the publication to use in the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the publication to use in the listing.
     * @return the value
     **/
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * A long description of the publication to use in the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * A long description of the publication to use in the listing.
     * @return the value
     **/
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Contact information for getting support from the publisher for the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
    private final java.util.List<SupportContact> supportContacts;

    /**
     * Contact information for getting support from the publisher for the listing.
     * @return the value
     **/
    public java.util.List<SupportContact> getSupportContacts() {
        return supportContacts;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the publication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the publication.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("packageDetails")
    private final CreatePublicationPackage packageDetails;

    public CreatePublicationPackage getPackageDetails() {
        return packageDetails;
    }

    /**
     * Whether the publisher acknowledged that they have the right and authority to share the contents of the publication and that they accepted the Oracle terms of use agreements required to create a publication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAgreementAcknowledged")
    private final Boolean isAgreementAcknowledged;

    /**
     * Whether the publisher acknowledged that they have the right and authority to share the contents of the publication and that they accepted the Oracle terms of use agreements required to create a publication.
     *
     * @return the value
     **/
    public Boolean getIsAgreementAcknowledged() {
        return isAgreementAcknowledged;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("CreatePublicationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("listingType=").append(String.valueOf(this.listingType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", supportContacts=").append(String.valueOf(this.supportContacts));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", packageDetails=").append(String.valueOf(this.packageDetails));
        sb.append(", isAgreementAcknowledged=")
                .append(String.valueOf(this.isAgreementAcknowledged));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePublicationDetails)) {
            return false;
        }

        CreatePublicationDetails other = (CreatePublicationDetails) o;
        return java.util.Objects.equals(this.listingType, other.listingType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.supportContacts, other.supportContacts)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.packageDetails, other.packageDetails)
                && java.util.Objects.equals(
                        this.isAgreementAcknowledged, other.isAgreementAcknowledged)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listingType == null ? 43 : this.listingType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.supportContacts == null ? 43 : this.supportContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageDetails == null ? 43 : this.packageDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isAgreementAcknowledged == null
                                ? 43
                                : this.isAgreementAcknowledged.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
