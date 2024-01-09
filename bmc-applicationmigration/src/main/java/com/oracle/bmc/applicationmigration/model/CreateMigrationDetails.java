/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * While creating a migration, specify the source and the application that you want migrate. Each
 * migration moves a single application from a specified source to a specified Oracle Cloud
 * Infrastructure tenancy. If required, provide the credentials of the application administrator in
 * the source environment. Application Migration uses this information to access the application, as
 * well as discover application artifacts, such as the complete domain configuration along with data
 * sources and other dependencies.
 *
 * <p>You must also assign a name and provide a description for the migration. This helps you to
 * identify the appropriate source environment when you have multiple sources defined.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMigrationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMigrationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "sourceId",
        "applicationName",
        "discoveryDetails",
        "preCreatedTargetDatabaseType",
        "isSelectiveMigration",
        "serviceConfig",
        "applicationConfig",
        "freeformTags",
        "definedTags"
    })
    public CreateMigrationDetails(
            String compartmentId,
            String displayName,
            String description,
            String sourceId,
            String applicationName,
            DiscoveryDetails discoveryDetails,
            TargetDatabaseTypes preCreatedTargetDatabaseType,
            Boolean isSelectiveMigration,
            java.util.Map<String, ConfigurationField> serviceConfig,
            java.util.Map<String, ConfigurationField> applicationConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.sourceId = sourceId;
        this.applicationName = applicationName;
        this.discoveryDetails = discoveryDetails;
        this.preCreatedTargetDatabaseType = preCreatedTargetDatabaseType;
        this.isSelectiveMigration = isSelectiveMigration;
        this.serviceConfig = serviceConfig;
        this.applicationConfig = applicationConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the source.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * User-friendly name of the application. This will be the name of the migrated application
         * in Oracle Cloud Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name of the application. This will be the name of the migrated application
         * in Oracle Cloud Infrastructure.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the application that you are migrating. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the application that you are migrating.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /** Name of the application that you want to migrate from the source environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * Name of the application that you want to migrate from the source environment.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryDetails")
        private DiscoveryDetails discoveryDetails;

        public Builder discoveryDetails(DiscoveryDetails discoveryDetails) {
            this.discoveryDetails = discoveryDetails;
            this.__explicitlySet__.add("discoveryDetails");
            return this;
        }
        /**
         * The pre-existing database type to be used in this migration. Currently, Application
         * migration only supports Oracle Cloud Infrastructure databases and this option is
         * currently available only for {@code JAVA_CLOUD_SERVICE} and {@code
         * WEBLOGIC_CLOUD_SERVICE} target instance types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
        private TargetDatabaseTypes preCreatedTargetDatabaseType;

        /**
         * The pre-existing database type to be used in this migration. Currently, Application
         * migration only supports Oracle Cloud Infrastructure databases and this option is
         * currently available only for {@code JAVA_CLOUD_SERVICE} and {@code
         * WEBLOGIC_CLOUD_SERVICE} target instance types.
         *
         * @param preCreatedTargetDatabaseType the value to set
         * @return this builder
         */
        public Builder preCreatedTargetDatabaseType(
                TargetDatabaseTypes preCreatedTargetDatabaseType) {
            this.preCreatedTargetDatabaseType = preCreatedTargetDatabaseType;
            this.__explicitlySet__.add("preCreatedTargetDatabaseType");
            return this;
        }
        /**
         * If set to {@code true}, Application Migration migrates the application resources
         * selectively depending on the source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
        private Boolean isSelectiveMigration;

        /**
         * If set to {@code true}, Application Migration migrates the application resources
         * selectively depending on the source.
         *
         * @param isSelectiveMigration the value to set
         * @return this builder
         */
        public Builder isSelectiveMigration(Boolean isSelectiveMigration) {
            this.isSelectiveMigration = isSelectiveMigration;
            this.__explicitlySet__.add("isSelectiveMigration");
            return this;
        }
        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
        private java.util.Map<String, ConfigurationField> serviceConfig;

        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         *
         * @param serviceConfig the value to set
         * @return this builder
         */
        public Builder serviceConfig(java.util.Map<String, ConfigurationField> serviceConfig) {
            this.serviceConfig = serviceConfig;
            this.__explicitlySet__.add("serviceConfig");
            return this;
        }
        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
        private java.util.Map<String, ConfigurationField> applicationConfig;

        /**
         * Configuration required to migrate the application. In addition to the key and value,
         * additional fields are provided to describe type type and purpose of each field. Only the
         * value for each key is required when passing configuration to the CreateMigration
         * operation.
         *
         * @param applicationConfig the value to set
         * @return this builder
         */
        public Builder applicationConfig(
                java.util.Map<String, ConfigurationField> applicationConfig) {
            this.applicationConfig = applicationConfig;
            this.__explicitlySet__.add("applicationConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMigrationDetails build() {
            CreateMigrationDetails model =
                    new CreateMigrationDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.sourceId,
                            this.applicationName,
                            this.discoveryDetails,
                            this.preCreatedTargetDatabaseType,
                            this.isSelectiveMigration,
                            this.serviceConfig,
                            this.applicationConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("discoveryDetails")) {
                this.discoveryDetails(model.getDiscoveryDetails());
            }
            if (model.wasPropertyExplicitlySet("preCreatedTargetDatabaseType")) {
                this.preCreatedTargetDatabaseType(model.getPreCreatedTargetDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("isSelectiveMigration")) {
                this.isSelectiveMigration(model.getIsSelectiveMigration());
            }
            if (model.wasPropertyExplicitlySet("serviceConfig")) {
                this.serviceConfig(model.getServiceConfig());
            }
            if (model.wasPropertyExplicitlySet("applicationConfig")) {
                this.applicationConfig(model.getApplicationConfig());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the source.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User-friendly name of the application. This will be the name of the migrated application in
     * Oracle Cloud Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name of the application. This will be the name of the migrated application in
     * Oracle Cloud Infrastructure.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the application that you are migrating. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the application that you are migrating.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /** Name of the application that you want to migrate from the source environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * Name of the application that you want to migrate from the source environment.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("discoveryDetails")
    private final DiscoveryDetails discoveryDetails;

    public DiscoveryDetails getDiscoveryDetails() {
        return discoveryDetails;
    }

    /**
     * The pre-existing database type to be used in this migration. Currently, Application migration
     * only supports Oracle Cloud Infrastructure databases and this option is currently available
     * only for {@code JAVA_CLOUD_SERVICE} and {@code WEBLOGIC_CLOUD_SERVICE} target instance types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
    private final TargetDatabaseTypes preCreatedTargetDatabaseType;

    /**
     * The pre-existing database type to be used in this migration. Currently, Application migration
     * only supports Oracle Cloud Infrastructure databases and this option is currently available
     * only for {@code JAVA_CLOUD_SERVICE} and {@code WEBLOGIC_CLOUD_SERVICE} target instance types.
     *
     * @return the value
     */
    public TargetDatabaseTypes getPreCreatedTargetDatabaseType() {
        return preCreatedTargetDatabaseType;
    }

    /**
     * If set to {@code true}, Application Migration migrates the application resources selectively
     * depending on the source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSelectiveMigration")
    private final Boolean isSelectiveMigration;

    /**
     * If set to {@code true}, Application Migration migrates the application resources selectively
     * depending on the source.
     *
     * @return the value
     */
    public Boolean getIsSelectiveMigration() {
        return isSelectiveMigration;
    }

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
    private final java.util.Map<String, ConfigurationField> serviceConfig;

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     *
     * @return the value
     */
    public java.util.Map<String, ConfigurationField> getServiceConfig() {
        return serviceConfig;
    }

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
    private final java.util.Map<String, ConfigurationField> applicationConfig;

    /**
     * Configuration required to migrate the application. In addition to the key and value,
     * additional fields are provided to describe type type and purpose of each field. Only the
     * value for each key is required when passing configuration to the CreateMigration operation.
     *
     * @return the value
     */
    public java.util.Map<String, ConfigurationField> getApplicationConfig() {
        return applicationConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateMigrationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", discoveryDetails=").append(String.valueOf(this.discoveryDetails));
        sb.append(", preCreatedTargetDatabaseType=")
                .append(String.valueOf(this.preCreatedTargetDatabaseType));
        sb.append(", isSelectiveMigration=").append(String.valueOf(this.isSelectiveMigration));
        sb.append(", serviceConfig=").append(String.valueOf(this.serviceConfig));
        sb.append(", applicationConfig=").append(String.valueOf(this.applicationConfig));
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
        if (!(o instanceof CreateMigrationDetails)) {
            return false;
        }

        CreateMigrationDetails other = (CreateMigrationDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.discoveryDetails, other.discoveryDetails)
                && java.util.Objects.equals(
                        this.preCreatedTargetDatabaseType, other.preCreatedTargetDatabaseType)
                && java.util.Objects.equals(this.isSelectiveMigration, other.isSelectiveMigration)
                && java.util.Objects.equals(this.serviceConfig, other.serviceConfig)
                && java.util.Objects.equals(this.applicationConfig, other.applicationConfig)
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
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryDetails == null ? 43 : this.discoveryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.preCreatedTargetDatabaseType == null
                                ? 43
                                : this.preCreatedTargetDatabaseType.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
