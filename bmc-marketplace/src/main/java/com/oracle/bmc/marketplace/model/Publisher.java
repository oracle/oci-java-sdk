/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for a publisher.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Publisher.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Publisher {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
        private Long yearFounded;

        public Builder yearFounded(Long yearFounded) {
            this.yearFounded = yearFounded;
            this.__explicitlySet__.add("yearFounded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
        private String websiteUrl;

        public Builder websiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            this.__explicitlySet__.add("websiteUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            this.__explicitlySet__.add("contactPhone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
        private String hqAddress;

        public Builder hqAddress(String hqAddress) {
            this.hqAddress = hqAddress;
            this.__explicitlySet__.add("hqAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logo")
        private UploadData logo;

        public Builder logo(UploadData logo) {
            this.logo = logo;
            this.__explicitlySet__.add("logo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("links")
        private java.util.List<Link> links;

        public Builder links(java.util.List<Link> links) {
            this.links = links;
            this.__explicitlySet__.add("links");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Publisher build() {
            Publisher __instance__ =
                    new Publisher(
                            id,
                            name,
                            description,
                            yearFounded,
                            websiteUrl,
                            contactEmail,
                            contactPhone,
                            hqAddress,
                            logo,
                            links);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Publisher o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .yearFounded(o.getYearFounded())
                            .websiteUrl(o.getWebsiteUrl())
                            .contactEmail(o.getContactEmail())
                            .contactPhone(o.getContactPhone())
                            .hqAddress(o.getHqAddress())
                            .logo(o.getLogo())
                            .links(o.getLinks());

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
     * Unique identifier for the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A description of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The year the publisher's company or organization was founded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
    Long yearFounded;

    /**
     * The publisher's website.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
    String websiteUrl;

    /**
     * The email address of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    String contactEmail;

    /**
     * The phone number of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    String contactPhone;

    /**
     * The address of the publisher's headquarters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
    String hqAddress;

    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    UploadData logo;

    /**
     * Reference links.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("links")
    java.util.List<Link> links;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
