/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for a publisher details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Publisher.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Publisher extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "publisherStatus",
        "notificationEmail",
        "opnMembership",
        "privateOfferAccountDetails",
        "id",
        "compartmentId",
        "registryNamespace",
        "legacyId",
        "displayName",
        "description",
        "yearFounded",
        "websiteUrl",
        "contactEmail",
        "contactPhone",
        "hqAddress",
        "logo",
        "facebookUrl",
        "twitterUrl",
        "linkedinUrl",
        "publisherType",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Publisher(
            PublisherStatus publisherStatus,
            String notificationEmail,
            OpnMembership opnMembership,
            PrivateOfferAccountDetails privateOfferAccountDetails,
            String id,
            String compartmentId,
            String registryNamespace,
            String legacyId,
            String displayName,
            String description,
            Long yearFounded,
            String websiteUrl,
            String contactEmail,
            String contactPhone,
            String hqAddress,
            UploadData logo,
            String facebookUrl,
            String twitterUrl,
            String linkedinUrl,
            PublisherType publisherType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.publisherStatus = publisherStatus;
        this.notificationEmail = notificationEmail;
        this.opnMembership = opnMembership;
        this.privateOfferAccountDetails = privateOfferAccountDetails;
        this.id = id;
        this.compartmentId = compartmentId;
        this.registryNamespace = registryNamespace;
        this.legacyId = legacyId;
        this.displayName = displayName;
        this.description = description;
        this.yearFounded = yearFounded;
        this.websiteUrl = websiteUrl;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.hqAddress = hqAddress;
        this.logo = logo;
        this.facebookUrl = facebookUrl;
        this.twitterUrl = twitterUrl;
        this.linkedinUrl = linkedinUrl;
        this.publisherType = publisherType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * publisher status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherStatus")
        private PublisherStatus publisherStatus;

        /**
         * publisher status.
         * @param publisherStatus the value to set
         * @return this builder
         **/
        public Builder publisherStatus(PublisherStatus publisherStatus) {
            this.publisherStatus = publisherStatus;
            this.__explicitlySet__.add("publisherStatus");
            return this;
        }
        /**
         * The private email address of the publisher product team.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationEmail")
        private String notificationEmail;

        /**
         * The private email address of the publisher product team.
         * @param notificationEmail the value to set
         * @return this builder
         **/
        public Builder notificationEmail(String notificationEmail) {
            this.notificationEmail = notificationEmail;
            this.__explicitlySet__.add("notificationEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opnMembership")
        private OpnMembership opnMembership;

        public Builder opnMembership(OpnMembership opnMembership) {
            this.opnMembership = opnMembership;
            this.__explicitlySet__.add("opnMembership");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateOfferAccountDetails")
        private PrivateOfferAccountDetails privateOfferAccountDetails;

        public Builder privateOfferAccountDetails(
                PrivateOfferAccountDetails privateOfferAccountDetails) {
            this.privateOfferAccountDetails = privateOfferAccountDetails;
            this.__explicitlySet__.add("privateOfferAccountDetails");
            return this;
        }
        /**
         * Unique OCID identifier for the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID identifier for the publisher.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The root compartment of the Publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The root compartment of the Publisher.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The namespace for the publisher registry to persist artifacts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("registryNamespace")
        private String registryNamespace;

        /**
         * The namespace for the publisher registry to persist artifacts.
         * @param registryNamespace the value to set
         * @return this builder
         **/
        public Builder registryNamespace(String registryNamespace) {
            this.registryNamespace = registryNamespace;
            this.__explicitlySet__.add("registryNamespace");
            return this;
        }
        /**
         * Unique legacy service identifier for the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
        private String legacyId;

        /**
         * Unique legacy service identifier for the publisher.
         * @param legacyId the value to set
         * @return this builder
         **/
        public Builder legacyId(String legacyId) {
            this.legacyId = legacyId;
            this.__explicitlySet__.add("legacyId");
            return this;
        }
        /**
         * The name of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the publisher.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
         * The public email address of the publisher for customers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The public email address of the publisher for customers.
         * @param contactEmail the value to set
         * @return this builder
         **/
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }
        /**
         * The phone number of the publisher in E.164 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        /**
         * The phone number of the publisher in E.164 format.
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
         * Publisher's Facebook URL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("facebookUrl")
        private String facebookUrl;

        /**
         * Publisher's Facebook URL
         * @param facebookUrl the value to set
         * @return this builder
         **/
        public Builder facebookUrl(String facebookUrl) {
            this.facebookUrl = facebookUrl;
            this.__explicitlySet__.add("facebookUrl");
            return this;
        }
        /**
         * Publisher's Twitter URL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("twitterUrl")
        private String twitterUrl;

        /**
         * Publisher's Twitter URL
         * @param twitterUrl the value to set
         * @return this builder
         **/
        public Builder twitterUrl(String twitterUrl) {
            this.twitterUrl = twitterUrl;
            this.__explicitlySet__.add("twitterUrl");
            return this;
        }
        /**
         * Publisher's LinkedIn URL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("linkedinUrl")
        private String linkedinUrl;

        /**
         * Publisher's LinkedIn URL
         * @param linkedinUrl the value to set
         * @return this builder
         **/
        public Builder linkedinUrl(String linkedinUrl) {
            this.linkedinUrl = linkedinUrl;
            this.__explicitlySet__.add("linkedinUrl");
            return this;
        }
        /**
         * publisher type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publisherType")
        private PublisherType publisherType;

        /**
         * publisher type.
         * @param publisherType the value to set
         * @return this builder
         **/
        public Builder publisherType(PublisherType publisherType) {
            this.publisherType = publisherType;
            this.__explicitlySet__.add("publisherType");
            return this;
        }
        /**
         * The time the publisher was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the publisher was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the publisher was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the publisher was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Publisher build() {
            Publisher model =
                    new Publisher(
                            this.publisherStatus,
                            this.notificationEmail,
                            this.opnMembership,
                            this.privateOfferAccountDetails,
                            this.id,
                            this.compartmentId,
                            this.registryNamespace,
                            this.legacyId,
                            this.displayName,
                            this.description,
                            this.yearFounded,
                            this.websiteUrl,
                            this.contactEmail,
                            this.contactPhone,
                            this.hqAddress,
                            this.logo,
                            this.facebookUrl,
                            this.twitterUrl,
                            this.linkedinUrl,
                            this.publisherType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Publisher model) {
            if (model.wasPropertyExplicitlySet("publisherStatus")) {
                this.publisherStatus(model.getPublisherStatus());
            }
            if (model.wasPropertyExplicitlySet("notificationEmail")) {
                this.notificationEmail(model.getNotificationEmail());
            }
            if (model.wasPropertyExplicitlySet("opnMembership")) {
                this.opnMembership(model.getOpnMembership());
            }
            if (model.wasPropertyExplicitlySet("privateOfferAccountDetails")) {
                this.privateOfferAccountDetails(model.getPrivateOfferAccountDetails());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("registryNamespace")) {
                this.registryNamespace(model.getRegistryNamespace());
            }
            if (model.wasPropertyExplicitlySet("legacyId")) {
                this.legacyId(model.getLegacyId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("facebookUrl")) {
                this.facebookUrl(model.getFacebookUrl());
            }
            if (model.wasPropertyExplicitlySet("twitterUrl")) {
                this.twitterUrl(model.getTwitterUrl());
            }
            if (model.wasPropertyExplicitlySet("linkedinUrl")) {
                this.linkedinUrl(model.getLinkedinUrl());
            }
            if (model.wasPropertyExplicitlySet("publisherType")) {
                this.publisherType(model.getPublisherType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * publisher status.
     **/
    public enum PublisherStatus {
        New("NEW"),
        Approved("APPROVED"),
        Suspended("SUSPENDED"),
        Removed("REMOVED"),
        Rejected("REJECTED"),
        Contacted("CONTACTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PublisherStatus.class);

        private final String value;
        private static java.util.Map<String, PublisherStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PublisherStatus v : PublisherStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublisherStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublisherStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublisherStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * publisher status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherStatus")
    private final PublisherStatus publisherStatus;

    /**
     * publisher status.
     * @return the value
     **/
    public PublisherStatus getPublisherStatus() {
        return publisherStatus;
    }

    /**
     * The private email address of the publisher product team.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationEmail")
    private final String notificationEmail;

    /**
     * The private email address of the publisher product team.
     * @return the value
     **/
    public String getNotificationEmail() {
        return notificationEmail;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("opnMembership")
    private final OpnMembership opnMembership;

    public OpnMembership getOpnMembership() {
        return opnMembership;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateOfferAccountDetails")
    private final PrivateOfferAccountDetails privateOfferAccountDetails;

    public PrivateOfferAccountDetails getPrivateOfferAccountDetails() {
        return privateOfferAccountDetails;
    }

    /**
     * Unique OCID identifier for the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID identifier for the publisher.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The root compartment of the Publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The root compartment of the Publisher.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The namespace for the publisher registry to persist artifacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("registryNamespace")
    private final String registryNamespace;

    /**
     * The namespace for the publisher registry to persist artifacts.
     * @return the value
     **/
    public String getRegistryNamespace() {
        return registryNamespace;
    }

    /**
     * Unique legacy service identifier for the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
    private final String legacyId;

    /**
     * Unique legacy service identifier for the publisher.
     * @return the value
     **/
    public String getLegacyId() {
        return legacyId;
    }

    /**
     * The name of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the publisher.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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
     * The public email address of the publisher for customers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The public email address of the publisher for customers.
     * @return the value
     **/
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * The phone number of the publisher in E.164 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    private final String contactPhone;

    /**
     * The phone number of the publisher in E.164 format.
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
     * Publisher's Facebook URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facebookUrl")
    private final String facebookUrl;

    /**
     * Publisher's Facebook URL
     * @return the value
     **/
    public String getFacebookUrl() {
        return facebookUrl;
    }

    /**
     * Publisher's Twitter URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("twitterUrl")
    private final String twitterUrl;

    /**
     * Publisher's Twitter URL
     * @return the value
     **/
    public String getTwitterUrl() {
        return twitterUrl;
    }

    /**
     * Publisher's LinkedIn URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("linkedinUrl")
    private final String linkedinUrl;

    /**
     * Publisher's LinkedIn URL
     * @return the value
     **/
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    /**
     * publisher type.
     **/
    public enum PublisherType {
        Internal("INTERNAL"),
        External("EXTERNAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PublisherType.class);

        private final String value;
        private static java.util.Map<String, PublisherType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublisherType v : PublisherType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublisherType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublisherType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublisherType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * publisher type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publisherType")
    private final PublisherType publisherType;

    /**
     * publisher type.
     * @return the value
     **/
    public PublisherType getPublisherType() {
        return publisherType;
    }

    /**
     * The time the publisher was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the publisher was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the publisher was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the publisher was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("publisherStatus=").append(String.valueOf(this.publisherStatus));
        sb.append(", notificationEmail=").append(String.valueOf(this.notificationEmail));
        sb.append(", opnMembership=").append(String.valueOf(this.opnMembership));
        sb.append(", privateOfferAccountDetails=")
                .append(String.valueOf(this.privateOfferAccountDetails));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", registryNamespace=").append(String.valueOf(this.registryNamespace));
        sb.append(", legacyId=").append(String.valueOf(this.legacyId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", yearFounded=").append(String.valueOf(this.yearFounded));
        sb.append(", websiteUrl=").append(String.valueOf(this.websiteUrl));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", contactPhone=").append(String.valueOf(this.contactPhone));
        sb.append(", hqAddress=").append(String.valueOf(this.hqAddress));
        sb.append(", logo=").append(String.valueOf(this.logo));
        sb.append(", facebookUrl=").append(String.valueOf(this.facebookUrl));
        sb.append(", twitterUrl=").append(String.valueOf(this.twitterUrl));
        sb.append(", linkedinUrl=").append(String.valueOf(this.linkedinUrl));
        sb.append(", publisherType=").append(String.valueOf(this.publisherType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof Publisher)) {
            return false;
        }

        Publisher other = (Publisher) o;
        return java.util.Objects.equals(this.publisherStatus, other.publisherStatus)
                && java.util.Objects.equals(this.notificationEmail, other.notificationEmail)
                && java.util.Objects.equals(this.opnMembership, other.opnMembership)
                && java.util.Objects.equals(
                        this.privateOfferAccountDetails, other.privateOfferAccountDetails)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.registryNamespace, other.registryNamespace)
                && java.util.Objects.equals(this.legacyId, other.legacyId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.yearFounded, other.yearFounded)
                && java.util.Objects.equals(this.websiteUrl, other.websiteUrl)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.contactPhone, other.contactPhone)
                && java.util.Objects.equals(this.hqAddress, other.hqAddress)
                && java.util.Objects.equals(this.logo, other.logo)
                && java.util.Objects.equals(this.facebookUrl, other.facebookUrl)
                && java.util.Objects.equals(this.twitterUrl, other.twitterUrl)
                && java.util.Objects.equals(this.linkedinUrl, other.linkedinUrl)
                && java.util.Objects.equals(this.publisherType, other.publisherType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.publisherStatus == null ? 43 : this.publisherStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationEmail == null ? 43 : this.notificationEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.opnMembership == null ? 43 : this.opnMembership.hashCode());
        result =
                (result * PRIME)
                        + (this.privateOfferAccountDetails == null
                                ? 43
                                : this.privateOfferAccountDetails.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.registryNamespace == null ? 43 : this.registryNamespace.hashCode());
        result = (result * PRIME) + (this.legacyId == null ? 43 : this.legacyId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.yearFounded == null ? 43 : this.yearFounded.hashCode());
        result = (result * PRIME) + (this.websiteUrl == null ? 43 : this.websiteUrl.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
        result = (result * PRIME) + (this.contactPhone == null ? 43 : this.contactPhone.hashCode());
        result = (result * PRIME) + (this.hqAddress == null ? 43 : this.hqAddress.hashCode());
        result = (result * PRIME) + (this.logo == null ? 43 : this.logo.hashCode());
        result = (result * PRIME) + (this.facebookUrl == null ? 43 : this.facebookUrl.hashCode());
        result = (result * PRIME) + (this.twitterUrl == null ? 43 : this.twitterUrl.hashCode());
        result = (result * PRIME) + (this.linkedinUrl == null ? 43 : this.linkedinUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.publisherType == null ? 43 : this.publisherType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
