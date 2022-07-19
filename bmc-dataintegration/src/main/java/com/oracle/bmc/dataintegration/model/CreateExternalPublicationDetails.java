/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties used to publish an Oracle Cloud Infrastructure Data Flow object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateExternalPublicationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateExternalPublicationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationId",
        "applicationCompartmentId",
        "displayName",
        "description",
        "resourceConfiguration",
        "configurationDetails"
    })
    public CreateExternalPublicationDetails(
            String applicationId,
            String applicationCompartmentId,
            String displayName,
            String description,
            ResourceConfiguration resourceConfiguration,
            ConfigurationDetails configurationDetails) {
        super();
        this.applicationId = applicationId;
        this.applicationCompartmentId = applicationCompartmentId;
        this.displayName = displayName;
        this.description = description;
        this.resourceConfiguration = resourceConfiguration;
        this.configurationDetails = configurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique OCID of the identifier that is returned after creating the Oracle Cloud Infrastructure Data Flow application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The unique OCID of the identifier that is returned after creating the Oracle Cloud Infrastructure Data Flow application.
         * @param applicationId the value to set
         * @return this builder
         **/
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /**
         * The OCID of the compartment where the application is created in the Oracle Cloud Infrastructure Data Flow Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationCompartmentId")
        private String applicationCompartmentId;

        /**
         * The OCID of the compartment where the application is created in the Oracle Cloud Infrastructure Data Flow Service.
         * @param applicationCompartmentId the value to set
         * @return this builder
         **/
        public Builder applicationCompartmentId(String applicationCompartmentId) {
            this.applicationCompartmentId = applicationCompartmentId;
            this.__explicitlySet__.add("applicationCompartmentId");
            return this;
        }
        /**
         * The name of the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the application.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The details of the data flow or the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The details of the data flow or the application.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceConfiguration")
        private ResourceConfiguration resourceConfiguration;

        public Builder resourceConfiguration(ResourceConfiguration resourceConfiguration) {
            this.resourceConfiguration = resourceConfiguration;
            this.__explicitlySet__.add("resourceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private ConfigurationDetails configurationDetails;

        public Builder configurationDetails(ConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalPublicationDetails build() {
            CreateExternalPublicationDetails __instance__ =
                    new CreateExternalPublicationDetails(
                            applicationId,
                            applicationCompartmentId,
                            displayName,
                            description,
                            resourceConfiguration,
                            configurationDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalPublicationDetails o) {
            Builder copiedBuilder =
                    applicationId(o.getApplicationId())
                            .applicationCompartmentId(o.getApplicationCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .resourceConfiguration(o.getResourceConfiguration())
                            .configurationDetails(o.getConfigurationDetails());

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
     * The unique OCID of the identifier that is returned after creating the Oracle Cloud Infrastructure Data Flow application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The unique OCID of the identifier that is returned after creating the Oracle Cloud Infrastructure Data Flow application.
     * @return the value
     **/
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The OCID of the compartment where the application is created in the Oracle Cloud Infrastructure Data Flow Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCompartmentId")
    private final String applicationCompartmentId;

    /**
     * The OCID of the compartment where the application is created in the Oracle Cloud Infrastructure Data Flow Service.
     * @return the value
     **/
    public String getApplicationCompartmentId() {
        return applicationCompartmentId;
    }

    /**
     * The name of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the application.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The details of the data flow or the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The details of the data flow or the application.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceConfiguration")
    private final ResourceConfiguration resourceConfiguration;

    public ResourceConfiguration getResourceConfiguration() {
        return resourceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final ConfigurationDetails configurationDetails;

    public ConfigurationDetails getConfigurationDetails() {
        return configurationDetails;
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
        sb.append("CreateExternalPublicationDetails(");
        sb.append("applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", applicationCompartmentId=")
                .append(String.valueOf(this.applicationCompartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceConfiguration=").append(String.valueOf(this.resourceConfiguration));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalPublicationDetails)) {
            return false;
        }

        CreateExternalPublicationDetails other = (CreateExternalPublicationDetails) o;
        return java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(
                        this.applicationCompartmentId, other.applicationCompartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceConfiguration, other.resourceConfiguration)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationCompartmentId == null
                                ? 43
                                : this.applicationCompartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceConfiguration == null
                                ? 43
                                : this.resourceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
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
