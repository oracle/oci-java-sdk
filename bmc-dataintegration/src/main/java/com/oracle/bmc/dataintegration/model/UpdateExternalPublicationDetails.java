/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties used to update a published Oracle Cloud Infrastructure Data Flow object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateExternalPublicationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateExternalPublicationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationCompartmentId")
        private String applicationCompartmentId;

        public Builder applicationCompartmentId(String applicationCompartmentId) {
            this.applicationCompartmentId = applicationCompartmentId;
            this.__explicitlySet__.add("applicationCompartmentId");
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
            UpdateExternalPublicationDetails __instance__ =
                    new UpdateExternalPublicationDetails(
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
        public Builder copy(UpdateExternalPublicationDetails o) {
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

    /**
     * The unique OCID of the identifier that is returned after creating the Oracle Cloud Infrastructure Data Flow application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    String applicationId;

    /**
     * The OCID of the compartment where the application is created in the Oracle Cloud Infrastructure Data Flow Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCompartmentId")
    String applicationCompartmentId;

    /**
     * The name of the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The details of the data flow or the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    @com.fasterxml.jackson.annotation.JsonProperty("resourceConfiguration")
    ResourceConfiguration resourceConfiguration;

    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    ConfigurationDetails configurationDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
