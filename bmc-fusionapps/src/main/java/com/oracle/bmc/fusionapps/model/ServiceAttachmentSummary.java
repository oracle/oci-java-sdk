/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Summary of the ServiceInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceAttachmentSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceAttachmentSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "serviceInstanceType",
        "serviceInstanceId",
        "serviceUrl",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "isSkuBased",
        "freeformTags",
        "definedTags"
    })
    public ServiceAttachmentSummary(
            String id,
            String displayName,
            ServiceAttachment.ServiceInstanceType serviceInstanceType,
            String serviceInstanceId,
            String serviceUrl,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ServiceAttachment.LifecycleState lifecycleState,
            String lifecycleDetails,
            Boolean isSkuBased,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.serviceInstanceType = serviceInstanceType;
        this.serviceInstanceId = serviceInstanceId;
        this.serviceUrl = serviceUrl;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.isSkuBased = isSkuBased;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * ServiceInstance Identifier, can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * ServiceInstance Identifier, can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Type of the service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceType")
        private ServiceAttachment.ServiceInstanceType serviceInstanceType;

        /**
         * Type of the service.
         * @param serviceInstanceType the value to set
         * @return this builder
         **/
        public Builder serviceInstanceType(
                ServiceAttachment.ServiceInstanceType serviceInstanceType) {
            this.serviceInstanceType = serviceInstanceType;
            this.__explicitlySet__.add("serviceInstanceType");
            return this;
        }
        /**
         * The ID of the service instance created that can be used to identify this on the service control plane
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceId")
        private String serviceInstanceId;

        /**
         * The ID of the service instance created that can be used to identify this on the service control plane
         * @param serviceInstanceId the value to set
         * @return this builder
         **/
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            this.__explicitlySet__.add("serviceInstanceId");
            return this;
        }
        /**
         * Service URL of the instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
        private String serviceUrl;

        /**
         * Service URL of the instance
         * @param serviceUrl the value to set
         * @return this builder
         **/
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            this.__explicitlySet__.add("serviceUrl");
            return this;
        }
        /**
         * The time the service instance was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the service instance was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the serivce instance was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the serivce instance was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the ServiceInstance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ServiceAttachment.LifecycleState lifecycleState;

        /**
         * The current state of the ServiceInstance.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(ServiceAttachment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Whether this service is provisioned due to the customer being subscribed to a specific SKU
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSkuBased")
        private Boolean isSkuBased;

        /**
         * Whether this service is provisioned due to the customer being subscribed to a specific SKU
         * @param isSkuBased the value to set
         * @return this builder
         **/
        public Builder isSkuBased(Boolean isSkuBased) {
            this.isSkuBased = isSkuBased;
            this.__explicitlySet__.add("isSkuBased");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public ServiceAttachmentSummary build() {
            ServiceAttachmentSummary model =
                    new ServiceAttachmentSummary(
                            this.id,
                            this.displayName,
                            this.serviceInstanceType,
                            this.serviceInstanceId,
                            this.serviceUrl,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.isSkuBased,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceAttachmentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("serviceInstanceType")) {
                this.serviceInstanceType(model.getServiceInstanceType());
            }
            if (model.wasPropertyExplicitlySet("serviceInstanceId")) {
                this.serviceInstanceId(model.getServiceInstanceId());
            }
            if (model.wasPropertyExplicitlySet("serviceUrl")) {
                this.serviceUrl(model.getServiceUrl());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("isSkuBased")) {
                this.isSkuBased(model.getIsSkuBased());
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
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * ServiceInstance Identifier, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * ServiceInstance Identifier, can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Type of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceType")
    private final ServiceAttachment.ServiceInstanceType serviceInstanceType;

    /**
     * Type of the service.
     * @return the value
     **/
    public ServiceAttachment.ServiceInstanceType getServiceInstanceType() {
        return serviceInstanceType;
    }

    /**
     * The ID of the service instance created that can be used to identify this on the service control plane
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceId")
    private final String serviceInstanceId;

    /**
     * The ID of the service instance created that can be used to identify this on the service control plane
     * @return the value
     **/
    public String getServiceInstanceId() {
        return serviceInstanceId;
    }

    /**
     * Service URL of the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
    private final String serviceUrl;

    /**
     * Service URL of the instance
     * @return the value
     **/
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * The time the service instance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the service instance was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the serivce instance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the serivce instance was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the ServiceInstance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ServiceAttachment.LifecycleState lifecycleState;

    /**
     * The current state of the ServiceInstance.
     * @return the value
     **/
    public ServiceAttachment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Whether this service is provisioned due to the customer being subscribed to a specific SKU
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkuBased")
    private final Boolean isSkuBased;

    /**
     * Whether this service is provisioned due to the customer being subscribed to a specific SKU
     * @return the value
     **/
    public Boolean getIsSkuBased() {
        return isSkuBased;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("ServiceAttachmentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", serviceInstanceType=").append(String.valueOf(this.serviceInstanceType));
        sb.append(", serviceInstanceId=").append(String.valueOf(this.serviceInstanceId));
        sb.append(", serviceUrl=").append(String.valueOf(this.serviceUrl));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", isSkuBased=").append(String.valueOf(this.isSkuBased));
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
        if (!(o instanceof ServiceAttachmentSummary)) {
            return false;
        }

        ServiceAttachmentSummary other = (ServiceAttachmentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.serviceInstanceType, other.serviceInstanceType)
                && java.util.Objects.equals(this.serviceInstanceId, other.serviceInstanceId)
                && java.util.Objects.equals(this.serviceUrl, other.serviceUrl)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.isSkuBased, other.isSkuBased)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceInstanceType == null
                                ? 43
                                : this.serviceInstanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceInstanceId == null ? 43 : this.serviceInstanceId.hashCode());
        result = (result * PRIME) + (this.serviceUrl == null ? 43 : this.serviceUrl.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.isSkuBased == null ? 43 : this.isSkuBased.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
