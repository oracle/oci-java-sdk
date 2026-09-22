/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for a publisher. <br>
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
        builder = AdminPublisherSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdminPublisherSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "compartmentName",
        "firstName",
        "lastName",
        "email",
        "registryNamespace",
        "status",
        "legacyId",
        "displayName",
        "description",
        "solutionDescription",
        "yearFounded",
        "employeeCount",
        "modifiedBy",
        "isOracleOwned",
        "isOpnAgreementValidationExempt",
        "partnerPortalOptions",
        "websiteUrl",
        "contactEmail",
        "contactPhone",
        "hqAddress",
        "logo",
        "facebookUrl",
        "twitterUrl",
        "linkedinUrl",
        "publisherType",
        "isAppPublisher",
        "isServicePublisher",
        "timeCreated",
        "timeUpdated",
        "timeExpired",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AdminPublisherSummary(
            String id,
            String compartmentId,
            String compartmentName,
            String firstName,
            String lastName,
            String email,
            String registryNamespace,
            PublisherStatus status,
            String legacyId,
            String displayName,
            String description,
            String solutionDescription,
            Long yearFounded,
            String employeeCount,
            String modifiedBy,
            Boolean isOracleOwned,
            Boolean isOpnAgreementValidationExempt,
            PartnerPortalOptions partnerPortalOptions,
            String websiteUrl,
            String contactEmail,
            String contactPhone,
            String hqAddress,
            UploadData logo,
            String facebookUrl,
            String twitterUrl,
            String linkedinUrl,
            PublisherSummary.PublisherType publisherType,
            Boolean isAppPublisher,
            Boolean isServicePublisher,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeExpired,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.compartmentName = compartmentName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registryNamespace = registryNamespace;
        this.status = status;
        this.legacyId = legacyId;
        this.displayName = displayName;
        this.description = description;
        this.solutionDescription = solutionDescription;
        this.yearFounded = yearFounded;
        this.employeeCount = employeeCount;
        this.modifiedBy = modifiedBy;
        this.isOracleOwned = isOracleOwned;
        this.isOpnAgreementValidationExempt = isOpnAgreementValidationExempt;
        this.partnerPortalOptions = partnerPortalOptions;
        this.websiteUrl = websiteUrl;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.hqAddress = hqAddress;
        this.logo = logo;
        this.facebookUrl = facebookUrl;
        this.twitterUrl = twitterUrl;
        this.linkedinUrl = linkedinUrl;
        this.publisherType = publisherType;
        this.isAppPublisher = isAppPublisher;
        this.isServicePublisher = isServicePublisher;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeExpired = timeExpired;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique OCID identifier for the publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID identifier for the publisher.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The root compartment of the Publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The root compartment of the Publisher.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The root compartment name of the Publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * The root compartment name of the Publisher.
         *
         * @param compartmentName the value to set
         * @return this builder
         */
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }
        /** First Name of the publisher */
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * First Name of the publisher
         *
         * @param firstName the value to set
         * @return this builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /** Last Name of the publisher */
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * Last Name of the publisher
         *
         * @param lastName the value to set
         * @return this builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /** Email address of the publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * Email address of the publisher.
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** The namespace for the publisher registry to persist artifacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("registryNamespace")
        private String registryNamespace;

        /**
         * The namespace for the publisher registry to persist artifacts.
         *
         * @param registryNamespace the value to set
         * @return this builder
         */
        public Builder registryNamespace(String registryNamespace) {
            this.registryNamespace = registryNamespace;
            this.__explicitlySet__.add("registryNamespace");
            return this;
        }
        /** The status for the publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private PublisherStatus status;

        /**
         * The status for the publisher.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(PublisherStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Unique legacy service identifier for the publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
        private String legacyId;

        /**
         * Unique legacy service identifier for the publisher.
         *
         * @param legacyId the value to set
         * @return this builder
         */
        public Builder legacyId(String legacyId) {
            this.legacyId = legacyId;
            this.__explicitlySet__.add("legacyId");
            return this;
        }
        /** The name of the publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the publisher.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description of the publisher. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the publisher.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A description of the publisher solutions. */
        @com.fasterxml.jackson.annotation.JsonProperty("solutionDescription")
        private String solutionDescription;

        /**
         * A description of the publisher solutions.
         *
         * @param solutionDescription the value to set
         * @return this builder
         */
        public Builder solutionDescription(String solutionDescription) {
            this.solutionDescription = solutionDescription;
            this.__explicitlySet__.add("solutionDescription");
            return this;
        }
        /** The year the publisher's company or organization was founded. */
        @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
        private Long yearFounded;

        /**
         * The year the publisher's company or organization was founded.
         *
         * @param yearFounded the value to set
         * @return this builder
         */
        public Builder yearFounded(Long yearFounded) {
            this.yearFounded = yearFounded;
            this.__explicitlySet__.add("yearFounded");
            return this;
        }
        /** Count of employees in publisher's company */
        @com.fasterxml.jackson.annotation.JsonProperty("employeeCount")
        private String employeeCount;

        /**
         * Count of employees in publisher's company
         *
         * @param employeeCount the value to set
         * @return this builder
         */
        public Builder employeeCount(String employeeCount) {
            this.employeeCount = employeeCount;
            this.__explicitlySet__.add("employeeCount");
            return this;
        }
        /** Indicates who modified the publisher data. */
        @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
        private String modifiedBy;

        /**
         * Indicates who modified the publisher data.
         *
         * @param modifiedBy the value to set
         * @return this builder
         */
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            this.__explicitlySet__.add("modifiedBy");
            return this;
        }
        /** Indicates if publisher is Oracle first-party or third-party */
        @com.fasterxml.jackson.annotation.JsonProperty("isOracleOwned")
        private Boolean isOracleOwned;

        /**
         * Indicates if publisher is Oracle first-party or third-party
         *
         * @param isOracleOwned the value to set
         * @return this builder
         */
        public Builder isOracleOwned(Boolean isOracleOwned) {
            this.isOracleOwned = isOracleOwned;
            this.__explicitlySet__.add("isOracleOwned");
            return this;
        }
        /**
         * Indicates whether this publisher is explicitly exempt from OPN and Oracle Cloud
         * Marketplace Agreement validation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOpnAgreementValidationExempt")
        private Boolean isOpnAgreementValidationExempt;

        /**
         * Indicates whether this publisher is explicitly exempt from OPN and Oracle Cloud
         * Marketplace Agreement validation.
         *
         * @param isOpnAgreementValidationExempt the value to set
         * @return this builder
         */
        public Builder isOpnAgreementValidationExempt(Boolean isOpnAgreementValidationExempt) {
            this.isOpnAgreementValidationExempt = isOpnAgreementValidationExempt;
            this.__explicitlySet__.add("isOpnAgreementValidationExempt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partnerPortalOptions")
        private PartnerPortalOptions partnerPortalOptions;

        public Builder partnerPortalOptions(PartnerPortalOptions partnerPortalOptions) {
            this.partnerPortalOptions = partnerPortalOptions;
            this.__explicitlySet__.add("partnerPortalOptions");
            return this;
        }
        /** The publisher's website. */
        @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
        private String websiteUrl;

        /**
         * The publisher's website.
         *
         * @param websiteUrl the value to set
         * @return this builder
         */
        public Builder websiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            this.__explicitlySet__.add("websiteUrl");
            return this;
        }
        /** The public email address of the publisher for customers. */
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The public email address of the publisher for customers.
         *
         * @param contactEmail the value to set
         * @return this builder
         */
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }
        /** The phone number of the publisher in E.164 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        /**
         * The phone number of the publisher in E.164 format.
         *
         * @param contactPhone the value to set
         * @return this builder
         */
        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            this.__explicitlySet__.add("contactPhone");
            return this;
        }
        /** The address of the publisher's headquarters. */
        @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
        private String hqAddress;

        /**
         * The address of the publisher's headquarters.
         *
         * @param hqAddress the value to set
         * @return this builder
         */
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
        /** Publisher's Facebook URL */
        @com.fasterxml.jackson.annotation.JsonProperty("facebookUrl")
        private String facebookUrl;

        /**
         * Publisher's Facebook URL
         *
         * @param facebookUrl the value to set
         * @return this builder
         */
        public Builder facebookUrl(String facebookUrl) {
            this.facebookUrl = facebookUrl;
            this.__explicitlySet__.add("facebookUrl");
            return this;
        }
        /** Publisher's Twitter URL */
        @com.fasterxml.jackson.annotation.JsonProperty("twitterUrl")
        private String twitterUrl;

        /**
         * Publisher's Twitter URL
         *
         * @param twitterUrl the value to set
         * @return this builder
         */
        public Builder twitterUrl(String twitterUrl) {
            this.twitterUrl = twitterUrl;
            this.__explicitlySet__.add("twitterUrl");
            return this;
        }
        /** Publisher's LinkedIn URL */
        @com.fasterxml.jackson.annotation.JsonProperty("linkedinUrl")
        private String linkedinUrl;

        /**
         * Publisher's LinkedIn URL
         *
         * @param linkedinUrl the value to set
         * @return this builder
         */
        public Builder linkedinUrl(String linkedinUrl) {
            this.linkedinUrl = linkedinUrl;
            this.__explicitlySet__.add("linkedinUrl");
            return this;
        }
        /** publisher type. */
        @com.fasterxml.jackson.annotation.JsonProperty("publisherType")
        private PublisherSummary.PublisherType publisherType;

        /**
         * publisher type.
         *
         * @param publisherType the value to set
         * @return this builder
         */
        public Builder publisherType(PublisherSummary.PublisherType publisherType) {
            this.publisherType = publisherType;
            this.__explicitlySet__.add("publisherType");
            return this;
        }
        /** Indicates if publisher has application listings */
        @com.fasterxml.jackson.annotation.JsonProperty("isAppPublisher")
        private Boolean isAppPublisher;

        /**
         * Indicates if publisher has application listings
         *
         * @param isAppPublisher the value to set
         * @return this builder
         */
        public Builder isAppPublisher(Boolean isAppPublisher) {
            this.isAppPublisher = isAppPublisher;
            this.__explicitlySet__.add("isAppPublisher");
            return this;
        }
        /** Indicates if publisher has service listings */
        @com.fasterxml.jackson.annotation.JsonProperty("isServicePublisher")
        private Boolean isServicePublisher;

        /**
         * Indicates if publisher has service listings
         *
         * @param isServicePublisher the value to set
         * @return this builder
         */
        public Builder isServicePublisher(Boolean isServicePublisher) {
            this.isServicePublisher = isServicePublisher;
            this.__explicitlySet__.add("isServicePublisher");
            return this;
        }
        /** The time the publisher was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the publisher was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the publisher was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the publisher was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** the expiry time of the publisher */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
        private java.util.Date timeExpired;

        /**
         * the expiry time of the publisher
         *
         * @param timeExpired the value to set
         * @return this builder
         */
        public Builder timeExpired(java.util.Date timeExpired) {
            this.timeExpired = timeExpired;
            this.__explicitlySet__.add("timeExpired");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminPublisherSummary build() {
            AdminPublisherSummary model =
                    new AdminPublisherSummary(
                            this.id,
                            this.compartmentId,
                            this.compartmentName,
                            this.firstName,
                            this.lastName,
                            this.email,
                            this.registryNamespace,
                            this.status,
                            this.legacyId,
                            this.displayName,
                            this.description,
                            this.solutionDescription,
                            this.yearFounded,
                            this.employeeCount,
                            this.modifiedBy,
                            this.isOracleOwned,
                            this.isOpnAgreementValidationExempt,
                            this.partnerPortalOptions,
                            this.websiteUrl,
                            this.contactEmail,
                            this.contactPhone,
                            this.hqAddress,
                            this.logo,
                            this.facebookUrl,
                            this.twitterUrl,
                            this.linkedinUrl,
                            this.publisherType,
                            this.isAppPublisher,
                            this.isServicePublisher,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeExpired,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminPublisherSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentName")) {
                this.compartmentName(model.getCompartmentName());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("registryNamespace")) {
                this.registryNamespace(model.getRegistryNamespace());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("solutionDescription")) {
                this.solutionDescription(model.getSolutionDescription());
            }
            if (model.wasPropertyExplicitlySet("yearFounded")) {
                this.yearFounded(model.getYearFounded());
            }
            if (model.wasPropertyExplicitlySet("employeeCount")) {
                this.employeeCount(model.getEmployeeCount());
            }
            if (model.wasPropertyExplicitlySet("modifiedBy")) {
                this.modifiedBy(model.getModifiedBy());
            }
            if (model.wasPropertyExplicitlySet("isOracleOwned")) {
                this.isOracleOwned(model.getIsOracleOwned());
            }
            if (model.wasPropertyExplicitlySet("isOpnAgreementValidationExempt")) {
                this.isOpnAgreementValidationExempt(model.getIsOpnAgreementValidationExempt());
            }
            if (model.wasPropertyExplicitlySet("partnerPortalOptions")) {
                this.partnerPortalOptions(model.getPartnerPortalOptions());
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
            if (model.wasPropertyExplicitlySet("isAppPublisher")) {
                this.isAppPublisher(model.getIsAppPublisher());
            }
            if (model.wasPropertyExplicitlySet("isServicePublisher")) {
                this.isServicePublisher(model.getIsServicePublisher());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeExpired")) {
                this.timeExpired(model.getTimeExpired());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Unique OCID identifier for the publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID identifier for the publisher.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The root compartment of the Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The root compartment of the Publisher.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The root compartment name of the Publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * The root compartment name of the Publisher.
     *
     * @return the value
     */
    public String getCompartmentName() {
        return compartmentName;
    }

    /** First Name of the publisher */
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * First Name of the publisher
     *
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }

    /** Last Name of the publisher */
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * Last Name of the publisher
     *
     * @return the value
     */
    public String getLastName() {
        return lastName;
    }

    /** Email address of the publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * Email address of the publisher.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** The namespace for the publisher registry to persist artifacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("registryNamespace")
    private final String registryNamespace;

    /**
     * The namespace for the publisher registry to persist artifacts.
     *
     * @return the value
     */
    public String getRegistryNamespace() {
        return registryNamespace;
    }

    /** The status for the publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final PublisherStatus status;

    /**
     * The status for the publisher.
     *
     * @return the value
     */
    public PublisherStatus getStatus() {
        return status;
    }

    /** Unique legacy service identifier for the publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("legacyId")
    private final String legacyId;

    /**
     * Unique legacy service identifier for the publisher.
     *
     * @return the value
     */
    public String getLegacyId() {
        return legacyId;
    }

    /** The name of the publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the publisher.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description of the publisher. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the publisher.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A description of the publisher solutions. */
    @com.fasterxml.jackson.annotation.JsonProperty("solutionDescription")
    private final String solutionDescription;

    /**
     * A description of the publisher solutions.
     *
     * @return the value
     */
    public String getSolutionDescription() {
        return solutionDescription;
    }

    /** The year the publisher's company or organization was founded. */
    @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
    private final Long yearFounded;

    /**
     * The year the publisher's company or organization was founded.
     *
     * @return the value
     */
    public Long getYearFounded() {
        return yearFounded;
    }

    /** Count of employees in publisher's company */
    @com.fasterxml.jackson.annotation.JsonProperty("employeeCount")
    private final String employeeCount;

    /**
     * Count of employees in publisher's company
     *
     * @return the value
     */
    public String getEmployeeCount() {
        return employeeCount;
    }

    /** Indicates who modified the publisher data. */
    @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
    private final String modifiedBy;

    /**
     * Indicates who modified the publisher data.
     *
     * @return the value
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /** Indicates if publisher is Oracle first-party or third-party */
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleOwned")
    private final Boolean isOracleOwned;

    /**
     * Indicates if publisher is Oracle first-party or third-party
     *
     * @return the value
     */
    public Boolean getIsOracleOwned() {
        return isOracleOwned;
    }

    /**
     * Indicates whether this publisher is explicitly exempt from OPN and Oracle Cloud Marketplace
     * Agreement validation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOpnAgreementValidationExempt")
    private final Boolean isOpnAgreementValidationExempt;

    /**
     * Indicates whether this publisher is explicitly exempt from OPN and Oracle Cloud Marketplace
     * Agreement validation.
     *
     * @return the value
     */
    public Boolean getIsOpnAgreementValidationExempt() {
        return isOpnAgreementValidationExempt;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("partnerPortalOptions")
    private final PartnerPortalOptions partnerPortalOptions;

    public PartnerPortalOptions getPartnerPortalOptions() {
        return partnerPortalOptions;
    }

    /** The publisher's website. */
    @com.fasterxml.jackson.annotation.JsonProperty("websiteUrl")
    private final String websiteUrl;

    /**
     * The publisher's website.
     *
     * @return the value
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /** The public email address of the publisher for customers. */
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The public email address of the publisher for customers.
     *
     * @return the value
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /** The phone number of the publisher in E.164 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    private final String contactPhone;

    /**
     * The phone number of the publisher in E.164 format.
     *
     * @return the value
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /** The address of the publisher's headquarters. */
    @com.fasterxml.jackson.annotation.JsonProperty("hqAddress")
    private final String hqAddress;

    /**
     * The address of the publisher's headquarters.
     *
     * @return the value
     */
    public String getHqAddress() {
        return hqAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    private final UploadData logo;

    public UploadData getLogo() {
        return logo;
    }

    /** Publisher's Facebook URL */
    @com.fasterxml.jackson.annotation.JsonProperty("facebookUrl")
    private final String facebookUrl;

    /**
     * Publisher's Facebook URL
     *
     * @return the value
     */
    public String getFacebookUrl() {
        return facebookUrl;
    }

    /** Publisher's Twitter URL */
    @com.fasterxml.jackson.annotation.JsonProperty("twitterUrl")
    private final String twitterUrl;

    /**
     * Publisher's Twitter URL
     *
     * @return the value
     */
    public String getTwitterUrl() {
        return twitterUrl;
    }

    /** Publisher's LinkedIn URL */
    @com.fasterxml.jackson.annotation.JsonProperty("linkedinUrl")
    private final String linkedinUrl;

    /**
     * Publisher's LinkedIn URL
     *
     * @return the value
     */
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    /** publisher type. */
    @com.fasterxml.jackson.annotation.JsonProperty("publisherType")
    private final PublisherSummary.PublisherType publisherType;

    /**
     * publisher type.
     *
     * @return the value
     */
    public PublisherSummary.PublisherType getPublisherType() {
        return publisherType;
    }

    /** Indicates if publisher has application listings */
    @com.fasterxml.jackson.annotation.JsonProperty("isAppPublisher")
    private final Boolean isAppPublisher;

    /**
     * Indicates if publisher has application listings
     *
     * @return the value
     */
    public Boolean getIsAppPublisher() {
        return isAppPublisher;
    }

    /** Indicates if publisher has service listings */
    @com.fasterxml.jackson.annotation.JsonProperty("isServicePublisher")
    private final Boolean isServicePublisher;

    /**
     * Indicates if publisher has service listings
     *
     * @return the value
     */
    public Boolean getIsServicePublisher() {
        return isServicePublisher;
    }

    /** The time the publisher was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the publisher was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the publisher was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the publisher was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** the expiry time of the publisher */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
    private final java.util.Date timeExpired;

    /**
     * the expiry time of the publisher
     *
     * @return the value
     */
    public java.util.Date getTimeExpired() {
        return timeExpired;
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
        sb.append("AdminPublisherSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", registryNamespace=").append(String.valueOf(this.registryNamespace));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", legacyId=").append(String.valueOf(this.legacyId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", solutionDescription=").append(String.valueOf(this.solutionDescription));
        sb.append(", yearFounded=").append(String.valueOf(this.yearFounded));
        sb.append(", employeeCount=").append(String.valueOf(this.employeeCount));
        sb.append(", modifiedBy=").append(String.valueOf(this.modifiedBy));
        sb.append(", isOracleOwned=").append(String.valueOf(this.isOracleOwned));
        sb.append(", isOpnAgreementValidationExempt=")
                .append(String.valueOf(this.isOpnAgreementValidationExempt));
        sb.append(", partnerPortalOptions=").append(String.valueOf(this.partnerPortalOptions));
        sb.append(", websiteUrl=").append(String.valueOf(this.websiteUrl));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", contactPhone=").append(String.valueOf(this.contactPhone));
        sb.append(", hqAddress=").append(String.valueOf(this.hqAddress));
        sb.append(", logo=").append(String.valueOf(this.logo));
        sb.append(", facebookUrl=").append(String.valueOf(this.facebookUrl));
        sb.append(", twitterUrl=").append(String.valueOf(this.twitterUrl));
        sb.append(", linkedinUrl=").append(String.valueOf(this.linkedinUrl));
        sb.append(", publisherType=").append(String.valueOf(this.publisherType));
        sb.append(", isAppPublisher=").append(String.valueOf(this.isAppPublisher));
        sb.append(", isServicePublisher=").append(String.valueOf(this.isServicePublisher));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeExpired=").append(String.valueOf(this.timeExpired));
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
        if (!(o instanceof AdminPublisherSummary)) {
            return false;
        }

        AdminPublisherSummary other = (AdminPublisherSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.registryNamespace, other.registryNamespace)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.legacyId, other.legacyId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.solutionDescription, other.solutionDescription)
                && java.util.Objects.equals(this.yearFounded, other.yearFounded)
                && java.util.Objects.equals(this.employeeCount, other.employeeCount)
                && java.util.Objects.equals(this.modifiedBy, other.modifiedBy)
                && java.util.Objects.equals(this.isOracleOwned, other.isOracleOwned)
                && java.util.Objects.equals(
                        this.isOpnAgreementValidationExempt, other.isOpnAgreementValidationExempt)
                && java.util.Objects.equals(this.partnerPortalOptions, other.partnerPortalOptions)
                && java.util.Objects.equals(this.websiteUrl, other.websiteUrl)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.contactPhone, other.contactPhone)
                && java.util.Objects.equals(this.hqAddress, other.hqAddress)
                && java.util.Objects.equals(this.logo, other.logo)
                && java.util.Objects.equals(this.facebookUrl, other.facebookUrl)
                && java.util.Objects.equals(this.twitterUrl, other.twitterUrl)
                && java.util.Objects.equals(this.linkedinUrl, other.linkedinUrl)
                && java.util.Objects.equals(this.publisherType, other.publisherType)
                && java.util.Objects.equals(this.isAppPublisher, other.isAppPublisher)
                && java.util.Objects.equals(this.isServicePublisher, other.isServicePublisher)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeExpired, other.timeExpired)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result =
                (result * PRIME)
                        + (this.registryNamespace == null ? 43 : this.registryNamespace.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.legacyId == null ? 43 : this.legacyId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.solutionDescription == null
                                ? 43
                                : this.solutionDescription.hashCode());
        result = (result * PRIME) + (this.yearFounded == null ? 43 : this.yearFounded.hashCode());
        result =
                (result * PRIME)
                        + (this.employeeCount == null ? 43 : this.employeeCount.hashCode());
        result = (result * PRIME) + (this.modifiedBy == null ? 43 : this.modifiedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleOwned == null ? 43 : this.isOracleOwned.hashCode());
        result =
                (result * PRIME)
                        + (this.isOpnAgreementValidationExempt == null
                                ? 43
                                : this.isOpnAgreementValidationExempt.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerPortalOptions == null
                                ? 43
                                : this.partnerPortalOptions.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isAppPublisher == null ? 43 : this.isAppPublisher.hashCode());
        result =
                (result * PRIME)
                        + (this.isServicePublisher == null
                                ? 43
                                : this.isServicePublisher.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeExpired == null ? 43 : this.timeExpired.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
