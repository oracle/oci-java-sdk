/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details of the cloud service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceDetailResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceDetailResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "serviceId",
        "displayName",
        "currentArtifactPath",
        "serviceType",
        "serviceUrl",
        "status",
        "additionalDetails"
    })
    public ServiceDetailResponse(
            String instanceId,
            String serviceId,
            String displayName,
            String currentArtifactPath,
            String serviceType,
            String serviceUrl,
            String status,
            AdditionalDetails additionalDetails) {
        super();
        this.instanceId = instanceId;
        this.serviceId = serviceId;
        this.displayName = displayName;
        this.currentArtifactPath = currentArtifactPath;
        this.serviceType = serviceType;
        this.serviceUrl = serviceUrl;
        this.status = status;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID for the service instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * ID for the service instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** ID for the service */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceId")
        private String serviceId;

        /**
         * ID for the service
         *
         * @param serviceId the value to set
         * @return this builder
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            this.__explicitlySet__.add("serviceId");
            return this;
        }
        /** name of the service */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * name of the service
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** name of the service */
        @com.fasterxml.jackson.annotation.JsonProperty("currentArtifactPath")
        private String currentArtifactPath;

        /**
         * name of the service
         *
         * @param currentArtifactPath the value to set
         * @return this builder
         */
        public Builder currentArtifactPath(String currentArtifactPath) {
            this.currentArtifactPath = currentArtifactPath;
            this.__explicitlySet__.add("currentArtifactPath");
            return this;
        }
        /** name of the cloud service */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private String serviceType;

        /**
         * name of the cloud service
         *
         * @param serviceType the value to set
         * @return this builder
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }
        /** url for the service */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
        private String serviceUrl;

        /**
         * url for the service
         *
         * @param serviceUrl the value to set
         * @return this builder
         */
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            this.__explicitlySet__.add("serviceUrl");
            return this;
        }
        /** state of the service */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * state of the service
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private AdditionalDetails additionalDetails;

        public Builder additionalDetails(AdditionalDetails additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceDetailResponse build() {
            ServiceDetailResponse model =
                    new ServiceDetailResponse(
                            this.instanceId,
                            this.serviceId,
                            this.displayName,
                            this.currentArtifactPath,
                            this.serviceType,
                            this.serviceUrl,
                            this.status,
                            this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceDetailResponse model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("serviceId")) {
                this.serviceId(model.getServiceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("currentArtifactPath")) {
                this.currentArtifactPath(model.getCurrentArtifactPath());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("serviceUrl")) {
                this.serviceUrl(model.getServiceUrl());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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

    /** ID for the service instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * ID for the service instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** ID for the service */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceId")
    private final String serviceId;

    /**
     * ID for the service
     *
     * @return the value
     */
    public String getServiceId() {
        return serviceId;
    }

    /** name of the service */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * name of the service
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** name of the service */
    @com.fasterxml.jackson.annotation.JsonProperty("currentArtifactPath")
    private final String currentArtifactPath;

    /**
     * name of the service
     *
     * @return the value
     */
    public String getCurrentArtifactPath() {
        return currentArtifactPath;
    }

    /** name of the cloud service */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final String serviceType;

    /**
     * name of the cloud service
     *
     * @return the value
     */
    public String getServiceType() {
        return serviceType;
    }

    /** url for the service */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
    private final String serviceUrl;

    /**
     * url for the service
     *
     * @return the value
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /** state of the service */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * state of the service
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final AdditionalDetails additionalDetails;

    public AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("ServiceDetailResponse(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", serviceId=").append(String.valueOf(this.serviceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", currentArtifactPath=").append(String.valueOf(this.currentArtifactPath));
        sb.append(", serviceType=").append(String.valueOf(this.serviceType));
        sb.append(", serviceUrl=").append(String.valueOf(this.serviceUrl));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceDetailResponse)) {
            return false;
        }

        ServiceDetailResponse other = (ServiceDetailResponse) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.serviceId, other.serviceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.currentArtifactPath, other.currentArtifactPath)
                && java.util.Objects.equals(this.serviceType, other.serviceType)
                && java.util.Objects.equals(this.serviceUrl, other.serviceUrl)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.serviceId == null ? 43 : this.serviceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.currentArtifactPath == null
                                ? 43
                                : this.currentArtifactPath.hashCode());
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + (this.serviceUrl == null ? 43 : this.serviceUrl.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
