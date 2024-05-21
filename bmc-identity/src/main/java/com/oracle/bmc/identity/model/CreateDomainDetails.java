/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) Details for creating an identity domain.
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
    builder = CreateDomainDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDomainDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "homeRegion",
        "licenseType",
        "isHiddenOnLogin",
        "adminFirstName",
        "adminLastName",
        "adminUserName",
        "adminEmail",
        "isNotificationBypassed",
        "isPrimaryEmailRequired",
        "freeformTags",
        "definedTags"
    })
    public CreateDomainDetails(
            String compartmentId,
            String displayName,
            String description,
            String homeRegion,
            String licenseType,
            Boolean isHiddenOnLogin,
            String adminFirstName,
            String adminLastName,
            String adminUserName,
            String adminEmail,
            Boolean isNotificationBypassed,
            Boolean isPrimaryEmailRequired,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.homeRegion = homeRegion;
        this.licenseType = licenseType;
        this.isHiddenOnLogin = isHiddenOnLogin;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminUserName = adminUserName;
        this.adminEmail = adminEmail;
        this.isNotificationBypassed = isNotificationBypassed;
        this.isPrimaryEmailRequired = isPrimaryEmailRequired;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment where the identity domain is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the identity domain is created.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The mutable display name of the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The mutable display name of the identity domain.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The identity domain description. You can have an empty description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The identity domain description. You can have an empty description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The region's name identifier. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         * <p>
         * Example: {@code us-phoenix-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
        private String homeRegion;

        /**
         * The region's name identifier. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         * <p>
         * Example: {@code us-phoenix-1}
         *
         * @param homeRegion the value to set
         * @return this builder
         **/
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            this.__explicitlySet__.add("homeRegion");
            return this;
        }
        /**
         * The license type of the identity domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private String licenseType;

        /**
         * The license type of the identity domain.
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /**
         * Indicates whether the identity domain is hidden on the sign-in screen or not.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHiddenOnLogin")
        private Boolean isHiddenOnLogin;

        /**
         * Indicates whether the identity domain is hidden on the sign-in screen or not.
         *
         * @param isHiddenOnLogin the value to set
         * @return this builder
         **/
        public Builder isHiddenOnLogin(Boolean isHiddenOnLogin) {
            this.isHiddenOnLogin = isHiddenOnLogin;
            this.__explicitlySet__.add("isHiddenOnLogin");
            return this;
        }
        /**
         * The administrator's first name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminFirstName")
        private String adminFirstName;

        /**
         * The administrator's first name.
         * @param adminFirstName the value to set
         * @return this builder
         **/
        public Builder adminFirstName(String adminFirstName) {
            this.adminFirstName = adminFirstName;
            this.__explicitlySet__.add("adminFirstName");
            return this;
        }
        /**
         * The administrator's last name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminLastName")
        private String adminLastName;

        /**
         * The administrator's last name.
         * @param adminLastName the value to set
         * @return this builder
         **/
        public Builder adminLastName(String adminLastName) {
            this.adminLastName = adminLastName;
            this.__explicitlySet__.add("adminLastName");
            return this;
        }
        /**
         * The administrator's user name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminUserName")
        private String adminUserName;

        /**
         * The administrator's user name.
         * @param adminUserName the value to set
         * @return this builder
         **/
        public Builder adminUserName(String adminUserName) {
            this.adminUserName = adminUserName;
            this.__explicitlySet__.add("adminUserName");
            return this;
        }
        /**
         * The administrator's email address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        /**
         * The administrator's email address.
         * @param adminEmail the value to set
         * @return this builder
         **/
        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }
        /**
         * Indicates whether or not the administrator user created in the IDCS stripe would like to receive notifications like a welcome email.
         * This field is required only if admin information is provided. This field is otherwise optional.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isNotificationBypassed")
        private Boolean isNotificationBypassed;

        /**
         * Indicates whether or not the administrator user created in the IDCS stripe would like to receive notifications like a welcome email.
         * This field is required only if admin information is provided. This field is otherwise optional.
         *
         * @param isNotificationBypassed the value to set
         * @return this builder
         **/
        public Builder isNotificationBypassed(Boolean isNotificationBypassed) {
            this.isNotificationBypassed = isNotificationBypassed;
            this.__explicitlySet__.add("isNotificationBypassed");
            return this;
        }
        /**
         * Optional field to indicate whether users in the identity domain are required to have a primary email address or not. The default is true.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimaryEmailRequired")
        private Boolean isPrimaryEmailRequired;

        /**
         * Optional field to indicate whether users in the identity domain are required to have a primary email address or not. The default is true.
         *
         * @param isPrimaryEmailRequired the value to set
         * @return this builder
         **/
        public Builder isPrimaryEmailRequired(Boolean isPrimaryEmailRequired) {
            this.isPrimaryEmailRequired = isPrimaryEmailRequired;
            this.__explicitlySet__.add("isPrimaryEmailRequired");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDomainDetails build() {
            CreateDomainDetails model =
                    new CreateDomainDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.homeRegion,
                            this.licenseType,
                            this.isHiddenOnLogin,
                            this.adminFirstName,
                            this.adminLastName,
                            this.adminUserName,
                            this.adminEmail,
                            this.isNotificationBypassed,
                            this.isPrimaryEmailRequired,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDomainDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("homeRegion")) {
                this.homeRegion(model.getHomeRegion());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("isHiddenOnLogin")) {
                this.isHiddenOnLogin(model.getIsHiddenOnLogin());
            }
            if (model.wasPropertyExplicitlySet("adminFirstName")) {
                this.adminFirstName(model.getAdminFirstName());
            }
            if (model.wasPropertyExplicitlySet("adminLastName")) {
                this.adminLastName(model.getAdminLastName());
            }
            if (model.wasPropertyExplicitlySet("adminUserName")) {
                this.adminUserName(model.getAdminUserName());
            }
            if (model.wasPropertyExplicitlySet("adminEmail")) {
                this.adminEmail(model.getAdminEmail());
            }
            if (model.wasPropertyExplicitlySet("isNotificationBypassed")) {
                this.isNotificationBypassed(model.getIsNotificationBypassed());
            }
            if (model.wasPropertyExplicitlySet("isPrimaryEmailRequired")) {
                this.isPrimaryEmailRequired(model.getIsPrimaryEmailRequired());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the compartment where the identity domain is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the identity domain is created.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The mutable display name of the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The mutable display name of the identity domain.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The identity domain description. You can have an empty description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The identity domain description. You can have an empty description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The region's name identifier. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
    private final String homeRegion;

    /**
     * The region's name identifier. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     * @return the value
     **/
    public String getHomeRegion() {
        return homeRegion;
    }

    /**
     * The license type of the identity domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final String licenseType;

    /**
     * The license type of the identity domain.
     * @return the value
     **/
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * Indicates whether the identity domain is hidden on the sign-in screen or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenOnLogin")
    private final Boolean isHiddenOnLogin;

    /**
     * Indicates whether the identity domain is hidden on the sign-in screen or not.
     *
     * @return the value
     **/
    public Boolean getIsHiddenOnLogin() {
        return isHiddenOnLogin;
    }

    /**
     * The administrator's first name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminFirstName")
    private final String adminFirstName;

    /**
     * The administrator's first name.
     * @return the value
     **/
    public String getAdminFirstName() {
        return adminFirstName;
    }

    /**
     * The administrator's last name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminLastName")
    private final String adminLastName;

    /**
     * The administrator's last name.
     * @return the value
     **/
    public String getAdminLastName() {
        return adminLastName;
    }

    /**
     * The administrator's user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUserName")
    private final String adminUserName;

    /**
     * The administrator's user name.
     * @return the value
     **/
    public String getAdminUserName() {
        return adminUserName;
    }

    /**
     * The administrator's email address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    /**
     * The administrator's email address.
     * @return the value
     **/
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * Indicates whether or not the administrator user created in the IDCS stripe would like to receive notifications like a welcome email.
     * This field is required only if admin information is provided. This field is otherwise optional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNotificationBypassed")
    private final Boolean isNotificationBypassed;

    /**
     * Indicates whether or not the administrator user created in the IDCS stripe would like to receive notifications like a welcome email.
     * This field is required only if admin information is provided. This field is otherwise optional.
     *
     * @return the value
     **/
    public Boolean getIsNotificationBypassed() {
        return isNotificationBypassed;
    }

    /**
     * Optional field to indicate whether users in the identity domain are required to have a primary email address or not. The default is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimaryEmailRequired")
    private final Boolean isPrimaryEmailRequired;

    /**
     * Optional field to indicate whether users in the identity domain are required to have a primary email address or not. The default is true.
     *
     * @return the value
     **/
    public Boolean getIsPrimaryEmailRequired() {
        return isPrimaryEmailRequired;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateDomainDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", homeRegion=").append(String.valueOf(this.homeRegion));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", isHiddenOnLogin=").append(String.valueOf(this.isHiddenOnLogin));
        sb.append(", adminFirstName=").append(String.valueOf(this.adminFirstName));
        sb.append(", adminLastName=").append(String.valueOf(this.adminLastName));
        sb.append(", adminUserName=").append(String.valueOf(this.adminUserName));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", isNotificationBypassed=").append(String.valueOf(this.isNotificationBypassed));
        sb.append(", isPrimaryEmailRequired=").append(String.valueOf(this.isPrimaryEmailRequired));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDomainDetails)) {
            return false;
        }

        CreateDomainDetails other = (CreateDomainDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.homeRegion, other.homeRegion)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.isHiddenOnLogin, other.isHiddenOnLogin)
                && java.util.Objects.equals(this.adminFirstName, other.adminFirstName)
                && java.util.Objects.equals(this.adminLastName, other.adminLastName)
                && java.util.Objects.equals(this.adminUserName, other.adminUserName)
                && java.util.Objects.equals(this.adminEmail, other.adminEmail)
                && java.util.Objects.equals(
                        this.isNotificationBypassed, other.isNotificationBypassed)
                && java.util.Objects.equals(
                        this.isPrimaryEmailRequired, other.isPrimaryEmailRequired)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.homeRegion == null ? 43 : this.homeRegion.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.isHiddenOnLogin == null ? 43 : this.isHiddenOnLogin.hashCode());
        result =
                (result * PRIME)
                        + (this.adminFirstName == null ? 43 : this.adminFirstName.hashCode());
        result =
                (result * PRIME)
                        + (this.adminLastName == null ? 43 : this.adminLastName.hashCode());
        result =
                (result * PRIME)
                        + (this.adminUserName == null ? 43 : this.adminUserName.hashCode());
        result = (result * PRIME) + (this.adminEmail == null ? 43 : this.adminEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.isNotificationBypassed == null
                                ? 43
                                : this.isNotificationBypassed.hashCode());
        result =
                (result * PRIME)
                        + (this.isPrimaryEmailRequired == null
                                ? 43
                                : this.isPrimaryEmailRequired.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
