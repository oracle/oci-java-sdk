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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Publisher.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Publisher {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "yearFounded",
        "websiteUrl",
        "contactEmail",
        "contactPhone",
        "hqAddress",
        "logo",
        "links"
    })
    public Publisher(
            String id,
            String name,
            String description,
            Long yearFounded,
            String websiteUrl,
            String contactEmail,
            String contactPhone,
            String hqAddress,
            UploadData logo,
            java.util.List<Link> links) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.yearFounded = yearFounded;
        this.websiteUrl = websiteUrl;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.hqAddress = hqAddress;
        this.logo = logo;
        this.links = links;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique identifier for the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The name of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A description of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The year the publisher's company or organization was founded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
    private final Long yearFounded;

    public Long getYearFounded() {
        return yearFounded;
    }

    /**
     * The publisher's website.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
    private final String websiteUrl;

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     * The email address of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * The phone number of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    private final String contactPhone;

    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * The address of the publisher's headquarters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
    private final String hqAddress;

    public String getHqAddress() {
        return hqAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    private final UploadData logo;

    public UploadData getLogo() {
        return logo;
    }

    /**
     * Reference links.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("links")
    private final java.util.List<Link> links;

    public java.util.List<Link> getLinks() {
        return links;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Publisher(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", yearFounded=").append(String.valueOf(this.yearFounded));
        sb.append(", websiteUrl=").append(String.valueOf(this.websiteUrl));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", contactPhone=").append(String.valueOf(this.contactPhone));
        sb.append(", hqAddress=").append(String.valueOf(this.hqAddress));
        sb.append(", logo=").append(String.valueOf(this.logo));
        sb.append(", links=").append(String.valueOf(this.links));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Publisher)) {
            return false;
        }

        Publisher other = (Publisher) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.yearFounded, other.yearFounded)
                && java.util.Objects.equals(this.websiteUrl, other.websiteUrl)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.contactPhone, other.contactPhone)
                && java.util.Objects.equals(this.hqAddress, other.hqAddress)
                && java.util.Objects.equals(this.logo, other.logo)
                && java.util.Objects.equals(this.links, other.links)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.yearFounded == null ? 43 : this.yearFounded.hashCode());
        result = (result * PRIME) + (this.websiteUrl == null ? 43 : this.websiteUrl.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
        result = (result * PRIME) + (this.contactPhone == null ? 43 : this.contactPhone.hashCode());
        result = (result * PRIME) + (this.hqAddress == null ? 43 : this.hqAddress.hashCode());
        result = (result * PRIME) + (this.logo == null ? 43 : this.logo.hashCode());
        result = (result * PRIME) + (this.links == null ? 43 : this.links.hashCode());
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
