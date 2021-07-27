/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * a subscription summary for a listing resource version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppCatalogSubscriptionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AppCatalogSubscriptionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("publisherName")
        private String publisherName;

        public Builder publisherName(String publisherName) {
            this.publisherName = publisherName;
            this.__explicitlySet__.add("publisherName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
        private String listingResourceVersion;

        public Builder listingResourceVersion(String listingResourceVersion) {
            this.listingResourceVersion = listingResourceVersion;
            this.__explicitlySet__.add("listingResourceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
        private String listingResourceId;

        public Builder listingResourceId(String listingResourceId) {
            this.listingResourceId = listingResourceId;
            this.__explicitlySet__.add("listingResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCatalogSubscriptionSummary build() {
            AppCatalogSubscriptionSummary __instance__ =
                    new AppCatalogSubscriptionSummary(
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
        public Builder copy(AppCatalogSubscriptionSummary o) {
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

    /**
     * Name of the publisher who published this listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherName")
    String publisherName;

    /**
     * The ocid of the listing resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    String listingId;

    /**
     * Listing resource version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceVersion")
    String listingResourceVersion;

    /**
     * Listing resource id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingResourceId")
    String listingResourceId;

    /**
     * The display name of the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The short summary to the listing.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    String summary;

    /**
     * The compartmentID of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Date and time at which the subscription was created, in [RFC3339](https://tools.ietf.org/html/rfc3339) format.
     * Example: {@code 2018-03-20T12:32:53.532Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
