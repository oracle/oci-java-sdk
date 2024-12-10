/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Analytics Instance metadata (summary view).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyticsInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyticsInstanceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "compartmentId",
        "lifecycleState",
        "featureSet",
        "capacity",
        "licenseType",
        "emailNotification",
        "networkEndpointDetails",
        "serviceUrl",
        "definedTags",
        "freeformTags",
        "systemTags",
        "timeCreated",
        "timeUpdated"
    })
    public AnalyticsInstanceSummary(
            String id,
            String name,
            String description,
            String compartmentId,
            AnalyticsInstanceLifecycleState lifecycleState,
            FeatureSet featureSet,
            Capacity capacity,
            LicenseType licenseType,
            String emailNotification,
            NetworkEndpointDetails networkEndpointDetails,
            String serviceUrl,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.featureSet = featureSet;
        this.capacity = capacity;
        this.licenseType = licenseType;
        this.emailNotification = emailNotification;
        this.networkEndpointDetails = networkEndpointDetails;
        this.serviceUrl = serviceUrl;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The resource OCID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The resource OCID.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the Analytics instance. This name must be unique in the tenancy and cannot be changed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Analytics instance. This name must be unique in the tenancy and cannot be changed.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Optional description.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Optional description.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The OCID of the compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The current state of an instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AnalyticsInstanceLifecycleState lifecycleState;

        /**
         * The current state of an instance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AnalyticsInstanceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Analytics feature set.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("featureSet")
        private FeatureSet featureSet;

        /**
         * Analytics feature set.
         *
         * @param featureSet the value to set
         * @return this builder
         **/
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
        /**
         * The license used for the service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private LicenseType licenseType;

        /**
         * The license used for the service.
         *
         * @param licenseType the value to set
         * @return this builder
         **/
        public Builder licenseType(LicenseType licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /**
         * Email address receiving notifications.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailNotification")
        private String emailNotification;

        /**
         * Email address receiving notifications.
         *
         * @param emailNotification the value to set
         * @return this builder
         **/
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
        /**
         * URL of the Analytics service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
        private String serviceUrl;

        /**
         * URL of the Analytics service.
         *
         * @param serviceUrl the value to set
         * @return this builder
         **/
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            this.__explicitlySet__.add("serviceUrl");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * System tags for this resource. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"key": "value"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The date and time the instance was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the instance was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the instance was last updated (in the format defined by RFC3339).
         * This timestamp represents updates made through this API. External events do not
         * influence it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the instance was last updated (in the format defined by RFC3339).
         * This timestamp represents updates made through this API. External events do not
         * influence it.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyticsInstanceSummary build() {
            AnalyticsInstanceSummary model =
                    new AnalyticsInstanceSummary(
                            this.id,
                            this.name,
                            this.description,
                            this.compartmentId,
                            this.lifecycleState,
                            this.featureSet,
                            this.capacity,
                            this.licenseType,
                            this.emailNotification,
                            this.networkEndpointDetails,
                            this.serviceUrl,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyticsInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("featureSet")) {
                this.featureSet(model.getFeatureSet());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("emailNotification")) {
                this.emailNotification(model.getEmailNotification());
            }
            if (model.wasPropertyExplicitlySet("networkEndpointDetails")) {
                this.networkEndpointDetails(model.getNetworkEndpointDetails());
            }
            if (model.wasPropertyExplicitlySet("serviceUrl")) {
                this.serviceUrl(model.getServiceUrl());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The resource OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The resource OCID.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the Analytics instance. This name must be unique in the tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Analytics instance. This name must be unique in the tenancy and cannot be changed.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Optional description.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Optional description.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The current state of an instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AnalyticsInstanceLifecycleState lifecycleState;

    /**
     * The current state of an instance.
     *
     * @return the value
     **/
    public AnalyticsInstanceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Analytics feature set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("featureSet")
    private final FeatureSet featureSet;

    /**
     * Analytics feature set.
     *
     * @return the value
     **/
    public FeatureSet getFeatureSet() {
        return featureSet;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Capacity capacity;

    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * The license used for the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final LicenseType licenseType;

    /**
     * The license used for the service.
     *
     * @return the value
     **/
    public LicenseType getLicenseType() {
        return licenseType;
    }

    /**
     * Email address receiving notifications.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailNotification")
    private final String emailNotification;

    /**
     * Email address receiving notifications.
     *
     * @return the value
     **/
    public String getEmailNotification() {
        return emailNotification;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
    private final NetworkEndpointDetails networkEndpointDetails;

    public NetworkEndpointDetails getNetworkEndpointDetails() {
        return networkEndpointDetails;
    }

    /**
     * URL of the Analytics service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
    private final String serviceUrl;

    /**
     * URL of the Analytics service.
     *
     * @return the value
     **/
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * System tags for this resource. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The date and time the instance was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the instance was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the instance was last updated (in the format defined by RFC3339).
     * This timestamp represents updates made through this API. External events do not
     * influence it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the instance was last updated (in the format defined by RFC3339).
     * This timestamp represents updates made through this API. External events do not
     * influence it.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AnalyticsInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", featureSet=").append(String.valueOf(this.featureSet));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", emailNotification=").append(String.valueOf(this.emailNotification));
        sb.append(", networkEndpointDetails=").append(String.valueOf(this.networkEndpointDetails));
        sb.append(", serviceUrl=").append(String.valueOf(this.serviceUrl));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyticsInstanceSummary)) {
            return false;
        }

        AnalyticsInstanceSummary other = (AnalyticsInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.featureSet, other.featureSet)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.emailNotification, other.emailNotification)
                && java.util.Objects.equals(
                        this.networkEndpointDetails, other.networkEndpointDetails)
                && java.util.Objects.equals(this.serviceUrl, other.serviceUrl)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.featureSet == null ? 43 : this.featureSet.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.emailNotification == null ? 43 : this.emailNotification.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEndpointDetails == null
                                ? 43
                                : this.networkEndpointDetails.hashCode());
        result = (result * PRIME) + (this.serviceUrl == null ? 43 : this.serviceUrl.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
