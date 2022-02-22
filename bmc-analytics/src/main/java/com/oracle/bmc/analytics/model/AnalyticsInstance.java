/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Analytics Instance metadata.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyticsInstance.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AnalyticsInstance {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AnalyticsInstanceLifecycleState lifecycleState;

        public Builder lifecycleState(AnalyticsInstanceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("featureSet")
        private FeatureSet featureSet;

        public Builder featureSet(FeatureSet featureSet) {
            this.featureSet = featureSet;
            this.__explicitlySet__.add("featureSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Capacity capacity;

        public Builder capacity(Capacity capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private LicenseType licenseType;

        public Builder licenseType(LicenseType licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailNotification")
        private String emailNotification;

        public Builder emailNotification(String emailNotification) {
            this.emailNotification = emailNotification;
            this.__explicitlySet__.add("emailNotification");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
        private NetworkEndpointDetails networkEndpointDetails;

        public Builder networkEndpointDetails(NetworkEndpointDetails networkEndpointDetails) {
            this.networkEndpointDetails = networkEndpointDetails;
            this.__explicitlySet__.add("networkEndpointDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateAccessChannels")
        private java.util.Map<String, PrivateAccessChannel> privateAccessChannels;

        public Builder privateAccessChannels(
                java.util.Map<String, PrivateAccessChannel> privateAccessChannels) {
            this.privateAccessChannels = privateAccessChannels;
            this.__explicitlySet__.add("privateAccessChannels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vanityUrlDetails")
        private java.util.Map<String, VanityUrlDetails> vanityUrlDetails;

        public Builder vanityUrlDetails(java.util.Map<String, VanityUrlDetails> vanityUrlDetails) {
            this.vanityUrlDetails = vanityUrlDetails;
            this.__explicitlySet__.add("vanityUrlDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
        private String serviceUrl;

        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            this.__explicitlySet__.add("serviceUrl");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyticsInstance build() {
            AnalyticsInstance __instance__ =
                    new AnalyticsInstance(
                            id,
                            name,
                            description,
                            compartmentId,
                            lifecycleState,
                            featureSet,
                            capacity,
                            licenseType,
                            emailNotification,
                            networkEndpointDetails,
                            privateAccessChannels,
                            vanityUrlDetails,
                            serviceUrl,
                            definedTags,
                            freeformTags,
                            kmsKeyId,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyticsInstance o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .featureSet(o.getFeatureSet())
                            .capacity(o.getCapacity())
                            .licenseType(o.getLicenseType())
                            .emailNotification(o.getEmailNotification())
                            .networkEndpointDetails(o.getNetworkEndpointDetails())
                            .privateAccessChannels(o.getPrivateAccessChannels())
                            .vanityUrlDetails(o.getVanityUrlDetails())
                            .serviceUrl(o.getServiceUrl())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags())
                            .kmsKeyId(o.getKmsKeyId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The resource OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the Analytics instance. This name must be unique in the tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Optional description.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The OCID of the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The current state of an instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AnalyticsInstanceLifecycleState lifecycleState;

    /**
     * Analytics feature set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("featureSet")
    FeatureSet featureSet;

    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    Capacity capacity;

    /**
     * The license used for the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    LicenseType licenseType;

    /**
     * Email address receiving notifications.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailNotification")
    String emailNotification;

    @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
    NetworkEndpointDetails networkEndpointDetails;

    /**
     * Map of PrivateAccessChannel unique identifier key as KEY and PrivateAccessChannel Object as VALUE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateAccessChannels")
    java.util.Map<String, PrivateAccessChannel> privateAccessChannels;

    /**
     * Map of VanityUrl unique identifier key as KEY and VanityUrl Object as VALUE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vanityUrlDetails")
    java.util.Map<String, VanityUrlDetails> vanityUrlDetails;

    /**
     * URL of the Analytics service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
    String serviceUrl;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the OCI Vault Key encrypting the customer data stored in this Analytics instance. A null value indicates Oracle managed default encryption.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * The date and time the instance was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the instance was last updated (in the format defined by RFC3339).
     * This timestamp represents updates made through this API. External events do not
     * influence it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
