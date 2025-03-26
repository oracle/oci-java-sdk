/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Resource type configuration details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceTypeConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceTypeConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceType",
        "availabilityMetricsConfig",
        "handlerConfig"
    })
    public ResourceTypeConfigDetails(
            String resourceType,
            AvailabilityMetricsDetails availabilityMetricsConfig,
            AgentExtensionHandlerConfiguration handlerConfig) {
        super();
        this.resourceType = resourceType;
        this.availabilityMetricsConfig = availabilityMetricsConfig;
        this.handlerConfig = handlerConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Resource type.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityMetricsConfig")
        private AvailabilityMetricsDetails availabilityMetricsConfig;

        public Builder availabilityMetricsConfig(
                AvailabilityMetricsDetails availabilityMetricsConfig) {
            this.availabilityMetricsConfig = availabilityMetricsConfig;
            this.__explicitlySet__.add("availabilityMetricsConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("handlerConfig")
        private AgentExtensionHandlerConfiguration handlerConfig;

        public Builder handlerConfig(AgentExtensionHandlerConfiguration handlerConfig) {
            this.handlerConfig = handlerConfig;
            this.__explicitlySet__.add("handlerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTypeConfigDetails build() {
            ResourceTypeConfigDetails model =
                    new ResourceTypeConfigDetails(
                            this.resourceType, this.availabilityMetricsConfig, this.handlerConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTypeConfigDetails model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("availabilityMetricsConfig")) {
                this.availabilityMetricsConfig(model.getAvailabilityMetricsConfig());
            }
            if (model.wasPropertyExplicitlySet("handlerConfig")) {
                this.handlerConfig(model.getHandlerConfig());
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

    /** Resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Resource type.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityMetricsConfig")
    private final AvailabilityMetricsDetails availabilityMetricsConfig;

    public AvailabilityMetricsDetails getAvailabilityMetricsConfig() {
        return availabilityMetricsConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("handlerConfig")
    private final AgentExtensionHandlerConfiguration handlerConfig;

    public AgentExtensionHandlerConfiguration getHandlerConfig() {
        return handlerConfig;
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
        sb.append("ResourceTypeConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", availabilityMetricsConfig=")
                .append(String.valueOf(this.availabilityMetricsConfig));
        sb.append(", handlerConfig=").append(String.valueOf(this.handlerConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTypeConfigDetails)) {
            return false;
        }

        ResourceTypeConfigDetails other = (ResourceTypeConfigDetails) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(
                        this.availabilityMetricsConfig, other.availabilityMetricsConfig)
                && java.util.Objects.equals(this.handlerConfig, other.handlerConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityMetricsConfig == null
                                ? 43
                                : this.availabilityMetricsConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.handlerConfig == null ? 43 : this.handlerConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
