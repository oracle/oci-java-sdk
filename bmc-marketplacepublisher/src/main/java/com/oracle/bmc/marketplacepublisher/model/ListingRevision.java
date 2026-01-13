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
        defaultImpl = ListingRevision.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ServiceListingRevision.class,
            name = "SERVICE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LeadGenListingRevision.class,
            name = "LEAD_GENERATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciListingRevision.class,
            name = "OCI_APPLICATION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ListingRevision extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "listingId",
        "compartmentId",
        "displayName",
        "revisionNumber",
        "headline",
        "tagline",
        "keywords",
        "shortDescription",
        "usageInformation",
        "longDescription",
        "timeCreated",
        "timeUpdated",
        "contentLanguage",
        "supportedlanguages",
        "supportContacts",
        "supportLinks",
        "icon",
        "status",
        "statusNotes",
        "lifecycleState",
        "packageType",
        "extendedMetadata",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    protected ListingRevision(
            String id,
            String listingId,
            String compartmentId,
            String displayName,
            String revisionNumber,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevisionIconAttachment icon,
            Status status,
            String statusNotes,
            LifecycleState lifecycleState,
            PackageType packageType,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.listingId = listingId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.revisionNumber = revisionNumber;
        this.headline = headline;
        this.tagline = tagline;
        this.keywords = keywords;
        this.shortDescription = shortDescription;
        this.usageInformation = usageInformation;
        this.longDescription = longDescription;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.contentLanguage = contentLanguage;
        this.supportedlanguages = supportedlanguages;
        this.supportContacts = supportContacts;
        this.supportLinks = supportLinks;
        this.icon = icon;
        this.status = status;
        this.statusNotes = statusNotes;
        this.lifecycleState = lifecycleState;
        this.packageType = packageType;
        this.extendedMetadata = extendedMetadata;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    /** Unique OCID identifier for the listing revision in Marketplace Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID identifier for the listing revision in Marketplace Publisher.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** The unique identifier for the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier for the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /** The revision number for the listing revision. This is an internal attribute */
    @com.fasterxml.jackson.annotation.JsonProperty("revisionNumber")
    private final String revisionNumber;

    /**
     * The revision number for the listing revision. This is an internal attribute
     *
     * @return the value
     */
    public String getRevisionNumber() {
        return revisionNumber;
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

    /** The tagline of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagline")
    private final String tagline;

    /**
     * The tagline of the listing revision.
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

    /** The time the listing revision was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the listing revision was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the listing revision was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the listing revision was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final ListingRevisionIconAttachment icon;

    public ListingRevisionIconAttachment getIcon() {
        return icon;
    }

    /** The current status for the Listing revision. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        New("NEW"),
        PendingReview("PENDING_REVIEW"),
        ReviewInProgress("REVIEW_IN_PROGRESS"),
        Rejected("REJECTED"),
        Approved("APPROVED"),
        PublishInProgress("PUBLISH_IN_PROGRESS"),
        PublishFailed("PUBLISH_FAILED"),
        Published("PUBLISHED"),
        PublishAsPrivateFailed("PUBLISH_AS_PRIVATE_FAILED"),
        PublishedAsPrivate("PUBLISHED_AS_PRIVATE"),
        PublishAsPrivateInProgress("PUBLISH_AS_PRIVATE_IN_PROGRESS"),
        UnpublishInProgress("UNPUBLISH_IN_PROGRESS"),
        Unpublished("UNPUBLISHED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status for the Listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status for the Listing revision.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Status notes for the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusNotes")
    private final String statusNotes;

    /**
     * Status notes for the listing revision.
     *
     * @return the value
     */
    public String getStatusNotes() {
        return statusNotes;
    }

    /** The current state of the listing revision. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the listing revision.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The listing's package type. Populated from the listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageType packageType;

    /**
     * The listing's package type. Populated from the listing.
     *
     * @return the value
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /** Additional metadata key/value pairs for the listing revision summary. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * Additional metadata key/value pairs for the listing revision summary.
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
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
        sb.append("ListingRevision(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", revisionNumber=").append(String.valueOf(this.revisionNumber));
        sb.append(", headline=").append(String.valueOf(this.headline));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", usageInformation=").append(String.valueOf(this.usageInformation));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(", supportedlanguages=").append(String.valueOf(this.supportedlanguages));
        sb.append(", supportContacts=").append(String.valueOf(this.supportContacts));
        sb.append(", supportLinks=").append(String.valueOf(this.supportLinks));
        sb.append(", icon=").append(String.valueOf(this.icon));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusNotes=").append(String.valueOf(this.statusNotes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
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
        if (!(o instanceof ListingRevision)) {
            return false;
        }

        ListingRevision other = (ListingRevision) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.revisionNumber, other.revisionNumber)
                && java.util.Objects.equals(this.headline, other.headline)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && java.util.Objects.equals(this.keywords, other.keywords)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.usageInformation, other.usageInformation)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.supportedlanguages, other.supportedlanguages)
                && java.util.Objects.equals(this.supportContacts, other.supportContacts)
                && java.util.Objects.equals(this.supportLinks, other.supportLinks)
                && java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusNotes, other.statusNotes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
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
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.revisionNumber == null ? 43 : this.revisionNumber.hashCode());
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.statusNotes == null ? 43 : this.statusNotes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
