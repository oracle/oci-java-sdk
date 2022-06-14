/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Describes resources of a given type within a package.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceTypeMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceTypeMetadata {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceType", "properties"})
    public ResourceTypeMetadata(String resourceType, java.util.List<MetadataProperty> properties) {
        super();
        this.resourceType = resourceType;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the resource described by this metadata object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of the resource described by this metadata object.
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Any properties needed to describe the content and its usage for this resource type, and within the containing package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<MetadataProperty> properties;

        /**
         * Any properties needed to describe the content and its usage for this resource type, and within the containing package.
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.List<MetadataProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTypeMetadata build() {
            ResourceTypeMetadata __instance__ = new ResourceTypeMetadata(resourceType, properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTypeMetadata o) {
            Builder copiedBuilder = resourceType(o.getResourceType()).properties(o.getProperties());

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
     * The type of the resource described by this metadata object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of the resource described by this metadata object.
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Any properties needed to describe the content and its usage for this resource type, and within the containing package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<MetadataProperty> properties;

    /**
     * Any properties needed to describe the content and its usage for this resource type, and within the containing package.
     * @return the value
     **/
    public java.util.List<MetadataProperty> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResourceTypeMetadata(");
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTypeMetadata)) {
            return false;
        }

        ResourceTypeMetadata other = (ResourceTypeMetadata) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
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
