/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher listing revision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "listingType",
        defaultImpl = CreateListingRevisionDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateOciListingRevisionDetails.class,
            name = "OCI_APPLICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateServiceListingRevisionDetails.class,
            name = "SERVICE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateLeadGenListingRevisionDetails.class,
            name = "LEAD_GENERATION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateListingRevisionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "listingId",
        "headline",
        "tagline",
        "keywords",
        "shortDescription",
        "usageInformation",
        "longDescription",
        "contentLanguage",
        "supportedlanguages",
        "supportContacts",
        "supportLinks",
        "status",
        "freeformTags",
        "definedTags"
    })
    protected CreateListingRevisionDetails(
            String displayName,
            String listingId,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevision.Status status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.listingId = listingId;
        this.headline = headline;
        this.tagline = tagline;
        this.keywords = keywords;
        this.shortDescription = shortDescription;
        this.usageInformation = usageInformation;
        this.longDescription = longDescription;
        this.contentLanguage = contentLanguage;
        this.supportedlanguages = supportedlanguages;
        this.supportContacts = supportContacts;
        this.supportLinks = supportLinks;
        this.status = status;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /** The name for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name for the listing revision.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The unique identifier for the listing this revision belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The unique identifier for the listing this revision belongs to.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** Single line introduction for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("headline")
    private final String headline;

    /**
     * Single line introduction for the listing revision.
     *
     * @return the value
     */
    public String getHeadline() {
        return headline;
    }

    /** The tagline for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    private final String tagline;

    /**
     * The tagline for the listing revision.
     *
     * @return the value
     */
    public String getTagline() {
        return tagline;
    }

    /** Keywords associated with the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    private final String keywords;

    /**
     * Keywords associated with the listing revision.
     *
     * @return the value
     */
    public String getKeywords() {
        return keywords;
    }

    /** A short description for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description for the listing revision.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /** Usage information for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
    private final String usageInformation;

    /**
     * Usage information for the listing revision.
     *
     * @return the value
     */
    public String getUsageInformation() {
        return usageInformation;
    }

    /** A long description for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * A long description for the listing revision.
     *
     * @return the value
     */
    public String getLongDescription() {
        return longDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    private final LanguageItem contentLanguage;

    public LanguageItem getContentLanguage() {
        return contentLanguage;
    }

    /** Languages supported by the publisher for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
    private final java.util.List<LanguageItem> supportedlanguages;

    /**
     * Languages supported by the publisher for the listing revision.
     *
     * @return the value
     */
    public java.util.List<LanguageItem> getSupportedlanguages() {
        return supportedlanguages;
    }

    /** Contact information to use to get support from the publisher for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
    private final java.util.List<SupportContact> supportContacts;

    /**
     * Contact information to use to get support from the publisher for the listing revision.
     *
     * @return the value
     */
    public java.util.List<SupportContact> getSupportContacts() {
        return supportContacts;
    }

    /** Links to support resources for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
    private final java.util.List<NamedLink> supportLinks;

    /**
     * Links to support resources for the listing revision.
     *
     * @return the value
     */
    public java.util.List<NamedLink> getSupportLinks() {
        return supportLinks;
    }

    /** The current status of the Listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ListingRevision.Status status;

    /**
     * The current status of the Listing revision.
     *
     * @return the value
     */
    public ListingRevision.Status getStatus() {
        return status;
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
        sb.append("CreateListingRevisionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", headline=").append(String.valueOf(this.headline));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", usageInformation=").append(String.valueOf(this.usageInformation));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(", supportedlanguages=").append(String.valueOf(this.supportedlanguages));
        sb.append(", supportContacts=").append(String.valueOf(this.supportContacts));
        sb.append(", supportLinks=").append(String.valueOf(this.supportLinks));
        sb.append(", status=").append(String.valueOf(this.status));
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
        if (!(o instanceof CreateListingRevisionDetails)) {
            return false;
        }

        CreateListingRevisionDetails other = (CreateListingRevisionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.headline, other.headline)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.keywords, other.keywords)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.usageInformation, other.usageInformation)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.supportedlanguages, other.supportedlanguages)
                && java.util.Objects.equals(this.supportContacts, other.supportContacts)
                && java.util.Objects.equals(this.supportLinks, other.supportLinks)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.headline == null ? 43 : this.headline.hashCode());
        result = (result * PRIME) + (this.tagline == null ? 43 : this.tagline.hashCode());
        result = (result * PRIME) + (this.keywords == null ? 43 : this.keywords.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.usageInformation == null ? 43 : this.usageInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedlanguages == null
                                ? 43
                                : this.supportedlanguages.hashCode());
        result =
                (result * PRIME)
                        + (this.supportContacts == null ? 43 : this.supportContacts.hashCode());
        result = (result * PRIME) + (this.supportLinks == null ? 43 : this.supportLinks.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
