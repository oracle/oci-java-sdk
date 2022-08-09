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
public final class Publisher extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * Unique identifier for the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the publisher.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the publisher.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A description of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the publisher.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The year the publisher's company or organization was founded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
        private Long yearFounded;

        /**
         * The year the publisher's company or organization was founded.
         * @param yearFounded the value to set
         * @return this builder
         **/
        public Builder yearFounded(Long yearFounded) {
            this.yearFounded = yearFounded;
            this.__explicitlySet__.add("yearFounded");
            return this;
        }
        /**
         * The publisher's website.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
        private String websiteUrl;

        /**
         * The publisher's website.
         * @param websiteUrl the value to set
         * @return this builder
         **/
        public Builder websiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            this.__explicitlySet__.add("websiteUrl");
            return this;
        }
        /**
         * The email address of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The email address of the publisher.
         * @param contactEmail the value to set
         * @return this builder
         **/
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }
        /**
         * The phone number of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        /**
         * The phone number of the publisher.
         * @param contactPhone the value to set
         * @return this builder
         **/
        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            this.__explicitlySet__.add("contactPhone");
            return this;
        }
        /**
         * The address of the publisher's headquarters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
        private String hqAddress;

        /**
         * The address of the publisher's headquarters.
         * @param hqAddress the value to set
         * @return this builder
         **/
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
        /**
         * Reference links.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("links")
        private java.util.List<Link> links;

        /**
         * Reference links.
         * @param links the value to set
         * @return this builder
         **/
        public Builder links(java.util.List<Link> links) {
            this.links = links;
            this.__explicitlySet__.add("links");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Publisher build() {
            Publisher model =
                    new Publisher(
                            this.id,
                            this.name,
                            this.description,
                            this.yearFounded,
                            this.websiteUrl,
                            this.contactEmail,
                            this.contactPhone,
                            this.hqAddress,
                            this.logo,
                            this.links);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Publisher model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("yearFounded")) {
                this.yearFounded(model.getYearFounded());
            }
            if (model.wasPropertyExplicitlySet("websiteUrl")) {
                this.websiteUrl(model.getWebsiteUrl());
            }
            if (model.wasPropertyExplicitlySet("contactEmail")) {
                this.contactEmail(model.getContactEmail());
            }
            if (model.wasPropertyExplicitlySet("contactPhone")) {
                this.contactPhone(model.getContactPhone());
            }
            if (model.wasPropertyExplicitlySet("hqAddress")) {
                this.hqAddress(model.getHqAddress());
            }
            if (model.wasPropertyExplicitlySet("logo")) {
                this.logo(model.getLogo());
            }
            if (model.wasPropertyExplicitlySet("links")) {
                this.links(model.getLinks());
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
     * Unique identifier for the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the publisher.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the publisher.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A description of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the publisher.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The year the publisher's company or organization was founded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
    private final Long yearFounded;

    /**
     * The year the publisher's company or organization was founded.
     * @return the value
     **/
    public Long getYearFounded() {
        return yearFounded;
    }

    /**
     * The publisher's website.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
    private final String websiteUrl;

    /**
     * The publisher's website.
     * @return the value
     **/
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     * The email address of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The email address of the publisher.
     * @return the value
     **/
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * The phone number of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    private final String contactPhone;

    /**
     * The phone number of the publisher.
     * @return the value
     **/
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * The address of the publisher's headquarters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
    private final String hqAddress;

    /**
     * The address of the publisher's headquarters.
     * @return the value
     **/
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

    /**
     * Reference links.
     * @return the value
     **/
    public java.util.List<Link> getLinks() {
        return links;
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
        sb.append("Publisher(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
