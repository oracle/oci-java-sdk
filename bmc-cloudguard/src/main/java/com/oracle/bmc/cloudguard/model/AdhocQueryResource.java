/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details about the adhoc resources for which query needs to be run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdhocQueryResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdhocQueryResource extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"region", "resourceIds", "resourceType"})
    public AdhocQueryResource(
            String region, java.util.List<String> resourceIds, String resourceType) {
        super();
        this.region = region;
        this.resourceIds = resourceIds;
        this.resourceType = resourceType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Region in which adhoc query needs to be run
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region in which adhoc query needs to be run
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * List of OCIDs on which query needs to be run
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
        private java.util.List<String> resourceIds;

        /**
         * List of OCIDs on which query needs to be run
         * @param resourceIds the value to set
         * @return this builder
         **/
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            this.__explicitlySet__.add("resourceIds");
            return this;
        }
        /**
         * Type of resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of resource
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdhocQueryResource build() {
            AdhocQueryResource model =
                    new AdhocQueryResource(this.region, this.resourceIds, this.resourceType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdhocQueryResource model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("resourceIds")) {
                this.resourceIds(model.getResourceIds());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
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
     * Region in which adhoc query needs to be run
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region in which adhoc query needs to be run
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * List of OCIDs on which query needs to be run
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
    private final java.util.List<String> resourceIds;

    /**
     * List of OCIDs on which query needs to be run
     * @return the value
     **/
    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * Type of resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of resource
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
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
        sb.append("AdhocQueryResource(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", resourceIds=").append(String.valueOf(this.resourceIds));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdhocQueryResource)) {
            return false;
        }

        AdhocQueryResource other = (AdhocQueryResource) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.resourceIds, other.resourceIds)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.resourceIds == null ? 43 : this.resourceIds.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
