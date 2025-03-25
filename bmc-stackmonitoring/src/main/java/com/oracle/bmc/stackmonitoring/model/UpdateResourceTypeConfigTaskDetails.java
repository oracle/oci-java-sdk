/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Update the availability metrics and the handler configuration for
 * the telegraf/collectd resource types.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateResourceTypeConfigTaskDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateResourceTypeConfigTaskDetails extends MonitoredResourceTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of the handler.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("handlerType")
        private HandlerType handlerType;

        /**
         * Type of the handler.
         * @param handlerType the value to set
         * @return this builder
         **/
        public Builder handlerType(HandlerType handlerType) {
            this.handlerType = handlerType;
            this.__explicitlySet__.add("handlerType");
            return this;
        }
        /**
         * A collection of resource type configuration details. User can provide
         * availability proxy metrics list for resource types along with the
         * telegraf/collectd handler configuration for the resource types.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesConfiguration")
        private java.util.List<ResourceTypeConfigDetails> resourceTypesConfiguration;

        /**
         * A collection of resource type configuration details. User can provide
         * availability proxy metrics list for resource types along with the
         * telegraf/collectd handler configuration for the resource types.
         *
         * @param resourceTypesConfiguration the value to set
         * @return this builder
         **/
        public Builder resourceTypesConfiguration(
                java.util.List<ResourceTypeConfigDetails> resourceTypesConfiguration) {
            this.resourceTypesConfiguration = resourceTypesConfiguration;
            this.__explicitlySet__.add("resourceTypesConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateResourceTypeConfigTaskDetails build() {
            UpdateResourceTypeConfigTaskDetails model =
                    new UpdateResourceTypeConfigTaskDetails(
                            this.handlerType, this.resourceTypesConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateResourceTypeConfigTaskDetails model) {
            if (model.wasPropertyExplicitlySet("handlerType")) {
                this.handlerType(model.getHandlerType());
            }
            if (model.wasPropertyExplicitlySet("resourceTypesConfiguration")) {
                this.resourceTypesConfiguration(model.getResourceTypesConfiguration());
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

    @Deprecated
    public UpdateResourceTypeConfigTaskDetails(
            HandlerType handlerType,
            java.util.List<ResourceTypeConfigDetails> resourceTypesConfiguration) {
        super();
        this.handlerType = handlerType;
        this.resourceTypesConfiguration = resourceTypesConfiguration;
    }

    /**
     * Type of the handler.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("handlerType")
    private final HandlerType handlerType;

    /**
     * Type of the handler.
     * @return the value
     **/
    public HandlerType getHandlerType() {
        return handlerType;
    }

    /**
     * A collection of resource type configuration details. User can provide
     * availability proxy metrics list for resource types along with the
     * telegraf/collectd handler configuration for the resource types.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypesConfiguration")
    private final java.util.List<ResourceTypeConfigDetails> resourceTypesConfiguration;

    /**
     * A collection of resource type configuration details. User can provide
     * availability proxy metrics list for resource types along with the
     * telegraf/collectd handler configuration for the resource types.
     *
     * @return the value
     **/
    public java.util.List<ResourceTypeConfigDetails> getResourceTypesConfiguration() {
        return resourceTypesConfiguration;
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
        sb.append("UpdateResourceTypeConfigTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", handlerType=").append(String.valueOf(this.handlerType));
        sb.append(", resourceTypesConfiguration=")
                .append(String.valueOf(this.resourceTypesConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateResourceTypeConfigTaskDetails)) {
            return false;
        }

        UpdateResourceTypeConfigTaskDetails other = (UpdateResourceTypeConfigTaskDetails) o;
        return java.util.Objects.equals(this.handlerType, other.handlerType)
                && java.util.Objects.equals(
                        this.resourceTypesConfiguration, other.resourceTypesConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.handlerType == null ? 43 : this.handlerType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypesConfiguration == null
                                ? 43
                                : this.resourceTypesConfiguration.hashCode());
        return result;
    }
}
