/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * Create a domain details
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
    builder = CreateDomainDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDomainDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
        private String homeRegion;

        public Builder homeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            this.__explicitlySet__.add("homeRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private String licenseType;

        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHiddenOnLogin")
        private Boolean isHiddenOnLogin;

        public Builder isHiddenOnLogin(Boolean isHiddenOnLogin) {
            this.isHiddenOnLogin = isHiddenOnLogin;
            this.__explicitlySet__.add("isHiddenOnLogin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminFirstName")
        private String adminFirstName;

        public Builder adminFirstName(String adminFirstName) {
            this.adminFirstName = adminFirstName;
            this.__explicitlySet__.add("adminFirstName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminLastName")
        private String adminLastName;

        public Builder adminLastName(String adminLastName) {
            this.adminLastName = adminLastName;
            this.__explicitlySet__.add("adminLastName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminUserName")
        private String adminUserName;

        public Builder adminUserName(String adminUserName) {
            this.adminUserName = adminUserName;
            this.__explicitlySet__.add("adminUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNotificationBypassed")
        private Boolean isNotificationBypassed;

        public Builder isNotificationBypassed(Boolean isNotificationBypassed) {
            this.isNotificationBypassed = isNotificationBypassed;
            this.__explicitlySet__.add("isNotificationBypassed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrimaryEmailRequired")
        private Boolean isPrimaryEmailRequired;

        public Builder isPrimaryEmailRequired(Boolean isPrimaryEmailRequired) {
            this.isPrimaryEmailRequired = isPrimaryEmailRequired;
            this.__explicitlySet__.add("isPrimaryEmailRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDomainDetails build() {
            CreateDomainDetails __instance__ =
                    new CreateDomainDetails(
                            compartmentId,
                            displayName,
                            description,
                            homeRegion,
                            licenseType,
                            isHiddenOnLogin,
                            adminFirstName,
                            adminLastName,
                            adminUserName,
                            adminEmail,
                            isNotificationBypassed,
                            isPrimaryEmailRequired,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDomainDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .homeRegion(o.getHomeRegion())
                            .licenseType(o.getLicenseType())
                            .isHiddenOnLogin(o.getIsHiddenOnLogin())
                            .adminFirstName(o.getAdminFirstName())
                            .adminLastName(o.getAdminLastName())
                            .adminUserName(o.getAdminUserName())
                            .adminEmail(o.getAdminEmail())
                            .isNotificationBypassed(o.getIsNotificationBypassed())
                            .isPrimaryEmailRequired(o.getIsPrimaryEmailRequired())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the Compartment where domain is created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The mutable display name of the domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Domain entity description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The region's name identifier. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
    String homeRegion;

    /**
     * The License type of Domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    String licenseType;

    /**
     * Indicates whether domain is hidden on login screen or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenOnLogin")
    Boolean isHiddenOnLogin;

    /**
     * The admin first name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminFirstName")
    String adminFirstName;

    /**
     * The admin last name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminLastName")
    String adminLastName;

    /**
     * The admin user name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUserName")
    String adminUserName;

    /**
     * The admin email address
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    String adminEmail;

    /**
     * Indicates if admin user created in IDCS stripe would like to receive notification like welcome email
     * or not.
     * Required field only if admin information is provided, otherwise optional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNotificationBypassed")
    Boolean isNotificationBypassed;

    /**
     * Optional field to indicate whether users in the domain are required to have a primary email address or not
     * Defaults to true
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimaryEmailRequired")
    Boolean isPrimaryEmailRequired;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
