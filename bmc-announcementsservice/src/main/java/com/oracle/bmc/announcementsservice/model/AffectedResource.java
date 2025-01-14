/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * The resource affected by the event described in the announcement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AffectedResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AffectedResource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceName",
        "region",
        "additionalProperties"
    })
    public AffectedResource(
            String resourceId,
            String resourceName,
            String region,
            java.util.List<Property> additionalProperties) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.region = region;
        this.additionalProperties = additionalProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the affected resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID of the affected resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The friendly name of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The friendly name of the resource.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The region where the affected resource exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region where the affected resource exists.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Additional properties associated with the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalProperties")
        private java.util.List<Property> additionalProperties;

        /**
         * Additional properties associated with the resource.
         *
         * @param additionalProperties the value to set
         * @return this builder
         */
        public Builder additionalProperties(java.util.List<Property> additionalProperties) {
            this.additionalProperties = additionalProperties;
            this.__explicitlySet__.add("additionalProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AffectedResource build() {
            AffectedResource model =
                    new AffectedResource(
                            this.resourceId,
                            this.resourceName,
                            this.region,
                            this.additionalProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AffectedResource model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("additionalProperties")) {
                this.additionalProperties(model.getAdditionalProperties());
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

    /** The OCID of the affected resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID of the affected resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The friendly name of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The friendly name of the resource.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The region where the affected resource exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region where the affected resource exists.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Additional properties associated with the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalProperties")
    private final java.util.List<Property> additionalProperties;

    /**
     * Additional properties associated with the resource.
     *
     * @return the value
     */
    public java.util.List<Property> getAdditionalProperties() {
        return additionalProperties;
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
        sb.append("AffectedResource(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", additionalProperties=").append(String.valueOf(this.additionalProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AffectedResource)) {
            return false;
        }

        AffectedResource other = (AffectedResource) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.additionalProperties, other.additionalProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalProperties == null
                                ? 43
                                : this.additionalProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
