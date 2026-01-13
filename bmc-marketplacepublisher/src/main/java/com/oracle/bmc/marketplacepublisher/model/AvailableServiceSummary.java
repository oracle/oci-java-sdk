/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Available service provider listing for lead generation listings <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailableServiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailableServiceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "icon",
        "listingId",
        "displayName",
        "shortDescription",
        "tagline"
    })
    public AvailableServiceSummary(
            ListingRevisionIconAttachment icon,
            String listingId,
            String displayName,
            String shortDescription,
            String tagline) {
        super();
        this.icon = icon;
        this.listingId = listingId;
        this.displayName = displayName;
        this.shortDescription = shortDescription;
        this.tagline = tagline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private ListingRevisionIconAttachment icon;

        public Builder icon(ListingRevisionIconAttachment icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }
        /** Listing Id for the listing */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * Listing Id for the listing
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The name of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the listing revision.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the listing revision.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /** The tagline of the listing revision. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

        /**
         * The tagline of the listing revision.
         *
         * @param tagline the value to set
         * @return this builder
         */
        public Builder tagline(String tagline) {
            this.tagline = tagline;
            this.__explicitlySet__.add("tagline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableServiceSummary build() {
            AvailableServiceSummary model =
                    new AvailableServiceSummary(
                            this.icon,
                            this.listingId,
                            this.displayName,
                            this.shortDescription,
                            this.tagline);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableServiceSummary model) {
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("tagline")) {
                this.tagline(model.getTagline());
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

    @com.fasterxml.jackson.annotation.JsonProperty("icon")
    private final ListingRevisionIconAttachment icon;

    public ListingRevisionIconAttachment getIcon() {
        return icon;
    }

    /** Listing Id for the listing */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * Listing Id for the listing
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The name of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the listing revision.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the listing revision. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the listing revision.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
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
        sb.append("AvailableServiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("icon=").append(String.valueOf(this.icon));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", tagline=").append(String.valueOf(this.tagline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableServiceSummary)) {
            return false;
        }

        AvailableServiceSummary other = (AvailableServiceSummary) o;
        return java.util.Objects.equals(this.icon, other.icon)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.tagline, other.tagline)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.icon == null ? 43 : this.icon.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result = (result * PRIME) + (this.tagline == null ? 43 : this.tagline.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
