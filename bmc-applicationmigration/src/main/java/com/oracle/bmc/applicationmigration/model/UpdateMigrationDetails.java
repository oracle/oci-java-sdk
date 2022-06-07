/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Provide configuration information about the application in the target environment. Application Migration migrates the
 * application to the target environment only after you provide this information. The information that you must provide varies
 * depending on the type of application that you are migrating.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMigrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateMigrationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "discoveryDetails",
        "isSelectiveMigration",
        "serviceConfig",
        "applicationConfig",
        "freeformTags",
        "definedTags"
    })
    public UpdateMigrationDetails(
            String displayName,
            String description,
            DiscoveryDetails discoveryDetails,
            Boolean isSelectiveMigration,
            java.util.Map<String, ConfigurationField> serviceConfig,
            java.util.Map<String, ConfigurationField> applicationConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.discoveryDetails = discoveryDetails;
        this.isSelectiveMigration = isSelectiveMigration;
        this.serviceConfig = serviceConfig;
        this.applicationConfig = applicationConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryDetails")
        private DiscoveryDetails discoveryDetails;

        public Builder discoveryDetails(DiscoveryDetails discoveryDetails) {
            this.discoveryDetails = discoveryDetails;
            this.__explicitlySet__.add("discoveryDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
        private Boolean isSelectiveMigration;

        public Builder isSelectiveMigration(Boolean isSelectiveMigration) {
            this.isSelectiveMigration = isSelectiveMigration;
            this.__explicitlySet__.add("isSelectiveMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
        private java.util.Map<String, ConfigurationField> serviceConfig;

        public Builder serviceConfig(java.util.Map<String, ConfigurationField> serviceConfig) {
            this.serviceConfig = serviceConfig;
            this.__explicitlySet__.add("serviceConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
        private java.util.Map<String, ConfigurationField> applicationConfig;

        public Builder applicationConfig(
                java.util.Map<String, ConfigurationField> applicationConfig) {
            this.applicationConfig = applicationConfig;
            this.__explicitlySet__.add("applicationConfig");
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

        public UpdateMigrationDetails build() {
            UpdateMigrationDetails __instance__ =
                    new UpdateMigrationDetails(
                            displayName,
                            description,
                            discoveryDetails,
                            isSelectiveMigration,
                            serviceConfig,
                            applicationConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMigrationDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .discoveryDetails(o.getDiscoveryDetails())
                            .isSelectiveMigration(o.getIsSelectiveMigration())
                            .serviceConfig(o.getServiceConfig())
                            .applicationConfig(o.getApplicationConfig())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * User-friendly name of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the migration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("discoveryDetails")
    private final DiscoveryDetails discoveryDetails;

    public DiscoveryDetails getDiscoveryDetails() {
        return discoveryDetails;
    }

    /**
     * If set to {@code true}, Application Migration migrates the application resources selectively depending on the source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
    private final Boolean isSelectiveMigration;

    public Boolean getIsSelectiveMigration() {
        return isSelectiveMigration;
    }

    /**
     * Configuration required to migrate the application. In addition to the key and value, additional fields are provided
     * to describe type type and purpose of each field. Only the value for each key is required when passing configuration to the
     * CreateMigration operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
    private final java.util.Map<String, ConfigurationField> serviceConfig;

    public java.util.Map<String, ConfigurationField> getServiceConfig() {
        return serviceConfig;
    }

    /**
     * Configuration required to migrate the application. In addition to the key and value, additional fields are provided
     * to describe type type and purpose of each field. Only the value for each key is required when passing configuration to the
     * CreateMigration operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
    private final java.util.Map<String, ConfigurationField> applicationConfig;

    public java.util.Map<String, ConfigurationField> getApplicationConfig() {
        return applicationConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateMigrationDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", discoveryDetails=").append(String.valueOf(this.discoveryDetails));
        sb.append(", isSelectiveMigration=").append(String.valueOf(this.isSelectiveMigration));
        sb.append(", serviceConfig=").append(String.valueOf(this.serviceConfig));
        sb.append(", applicationConfig=").append(String.valueOf(this.applicationConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMigrationDetails)) {
            return false;
        }

        UpdateMigrationDetails other = (UpdateMigrationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.discoveryDetails, other.discoveryDetails)
                && java.util.Objects.equals(this.isSelectiveMigration, other.isSelectiveMigration)
                && java.util.Objects.equals(this.serviceConfig, other.serviceConfig)
                && java.util.Objects.equals(this.applicationConfig, other.applicationConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryDetails == null ? 43 : this.discoveryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isSelectiveMigration == null
                                ? 43
                                : this.isSelectiveMigration.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceConfig == null ? 43 : this.serviceConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationConfig == null ? 43 : this.applicationConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
