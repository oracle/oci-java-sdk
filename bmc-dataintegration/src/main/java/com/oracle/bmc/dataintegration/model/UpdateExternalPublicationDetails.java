/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties used to update a published Oracle Cloud Infrastructure Data Flow object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateExternalPublicationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateExternalPublicationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationId",
        "applicationCompartmentId",
        "displayName",
        "description",
        "resourceConfiguration",
        "configurationDetails"
    })
    public UpdateExternalPublicationDetails(
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
         * The unique OCID of the identifier that is returned after creating the Oracle Cloud
         * Infrastructure Data Flow application.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The unique OCID of the identifier that is returned after creating the Oracle Cloud
         * Infrastructure Data Flow application.
         *
         * @param applicationId the value to set
         * @return this builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /**
         * The OCID of the compartment where the application is created in the Oracle Cloud
         * Infrastructure Data Flow Service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationCompartmentId")
        private String applicationCompartmentId;

        /**
         * The OCID of the compartment where the application is created in the Oracle Cloud
         * Infrastructure Data Flow Service.
         *
         * @param applicationCompartmentId the value to set
         * @return this builder
         */
        public Builder applicationCompartmentId(String applicationCompartmentId) {
            this.applicationCompartmentId = applicationCompartmentId;
            this.__explicitlySet__.add("applicationCompartmentId");
            return this;
        }
        /** The name of the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the application.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The details of the data flow or the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The details of the data flow or the application.
         *
         * @param description the value to set
         * @return this builder
         */
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

        public UpdateExternalPublicationDetails build() {
            UpdateExternalPublicationDetails model =
                    new UpdateExternalPublicationDetails(
                            this.applicationId,
                            this.applicationCompartmentId,
                            this.displayName,
                            this.description,
                            this.resourceConfiguration,
                            this.configurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExternalPublicationDetails model) {
            if (model.wasPropertyExplicitlySet("applicationId")) {
                this.applicationId(model.getApplicationId());
            }
            if (model.wasPropertyExplicitlySet("applicationCompartmentId")) {
                this.applicationCompartmentId(model.getApplicationCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceConfiguration")) {
                this.resourceConfiguration(model.getResourceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
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
     * The unique OCID of the identifier that is returned after creating the Oracle Cloud
     * Infrastructure Data Flow application.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The unique OCID of the identifier that is returned after creating the Oracle Cloud
     * Infrastructure Data Flow application.
     *
     * @return the value
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The OCID of the compartment where the application is created in the Oracle Cloud
     * Infrastructure Data Flow Service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCompartmentId")
    private final String applicationCompartmentId;

    /**
     * The OCID of the compartment where the application is created in the Oracle Cloud
     * Infrastructure Data Flow Service.
     *
     * @return the value
     */
    public String getApplicationCompartmentId() {
        return applicationCompartmentId;
    }

    /** The name of the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the application.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The details of the data flow or the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The details of the data flow or the application.
     *
     * @return the value
     */
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateExternalPublicationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", applicationCompartmentId=")
                .append(String.valueOf(this.applicationCompartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceConfiguration=").append(String.valueOf(this.resourceConfiguration));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExternalPublicationDetails)) {
            return false;
        }

        UpdateExternalPublicationDetails other = (UpdateExternalPublicationDetails) o;
        return java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(
                        this.applicationCompartmentId, other.applicationCompartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceConfiguration, other.resourceConfiguration)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
