/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * a subscription for a listing resource version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppCatalogSubscription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppCatalogSubscription {
    @Deprecated
    @java.beans.ConstructorProperties({
        "publisherName",
        "listingId",
        "listingResourceVersion",
        "listingResourceId",
        "displayName",
        "summary",
        "compartmentId",
        "timeCreated"
    })
    public AppCatalogSubscription(
            String publisherName,
            String listingId,
            String listingResourceVersion,
            String listingResourceId,
            String displayName,
            String summary,
            String compartmentId,
            java.util.Date timeCreated) {
        super();
        this.publisherName = publisherName;
        this.listingId = listingId;
        this.listingResourceVersion = listingResourceVersion;
        this.listingResourceId = listingResourceId;
        this.displayName = displayName;
        this.summary = summary;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the publisher who published this listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherName")
        private String publisherName;

        /**
         * Name of the publisher who published this listing.
         * @param publisherName the value to set
         * @return this builder
         **/
        public Builder publisherName(String publisherName) {
            this.publisherName = publisherName;
            this.__explicitlySet__.add("publisherName");
            return this;
        }
        /**
         * The ocid of the listing resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The ocid of the listing resource.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * Listing resource version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        /**
         * Listing resource version.
         * @param listingResourceVersion the value to set
         * @return this builder
         **/
        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }
        /**
         * Listing resource id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
        private String listingResourceId;

        /**
         * Listing resource id.
         * @param listingResourceId the value to set
         * @return this builder
         **/
        public Builder listingResourceId(String listingResourceId) {
            this.listingResourceId = listingResourceId;
            this.__explicitlySet__.add("listingResourceId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The short summary to the listing.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * The short summary to the listing.
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * The compartmentID of the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartmentID of the subscription.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Date and time at which the subscription was created, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time at which the subscription was created, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
         * Example: {@code 2018-03-20T12:32:53.532Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogSubscription build() {
            AppCatalogSubscription __instance__ =
                    new AppCatalogSubscription(
                            publisherName,
                            listingId,
                            listingResourceVersion,
                            listingResourceId,
                            displayName,
                            summary,
                            compartmentId,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCatalogSubscription o) {
            Builder copiedBuilder =
                    publisherName(o.getPublisherName())
                            .listingId(o.getListingId())
                            .listingResourceVersion(o.getListingResourceVersion())
                            .listingResourceId(o.getListingResourceId())
                            .displayName(o.getDisplayName())
                            .summary(o.getSummary())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Name of the publisher who published this listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherName")
    private final String publisherName;

    /**
     * Name of the publisher who published this listing.
     * @return the value
     **/
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * The ocid of the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The ocid of the listing resource.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * Listing resource version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    private final String listingResourceVersion;

    /**
     * Listing resource version.
     * @return the value
     **/
    public String getListingResourceVersion() {
        return listingResourceVersion;
    }

    /**
     * Listing resource id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
    private final String listingResourceId;

    /**
     * Listing resource id.
     * @return the value
     **/
    public String getListingResourceId() {
        return listingResourceId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The short summary to the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * The short summary to the listing.
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    /**
     * The compartmentID of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartmentID of the subscription.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Date and time at which the subscription was created, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time at which the subscription was created, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("AppCatalogSubscription(");
        sb.append("publisherName=").append(String.valueOf(this.publisherName));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", listingResourceVersion=").append(String.valueOf(this.listingResourceVersion));
        sb.append(", listingResourceId=").append(String.valueOf(this.listingResourceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppCatalogSubscription)) {
            return false;
        }

        AppCatalogSubscription other = (AppCatalogSubscription) o;
        return java.util.Objects.equals(this.publisherName, other.publisherName)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(
                        this.listingResourceVersion, other.listingResourceVersion)
                && java.util.Objects.equals(this.listingResourceId, other.listingResourceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.publisherName == null ? 43 : this.publisherName.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceVersion == null
                                ? 43
                                : this.listingResourceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.listingResourceId == null ? 43 : this.listingResourceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
