/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Summary information for a resource associated with a stack or job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssociatedResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedResourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceName",
        "resourceType",
        "attributes",
        "timeCreated",
        "region",
        "resourceAddress"
    })
    public AssociatedResourceSummary(
            String resourceId,
            String resourceName,
            String resourceType,
            java.util.Map<String, String> attributes,
            java.util.Date timeCreated,
            String region,
            String resourceAddress) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.attributes = attributes;
        this.timeCreated = timeCreated;
        this.region = region;
        this.resourceAddress = resourceAddress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Unique identifier for the resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Name of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Name of the resource.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * Resource type. For more information about resource types supported for the Oracle Cloud
         * Infrastructure (OCI) provider, see [Oracle Cloud Infrastructure
         * Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Resource type. For more information about resource types supported for the Oracle Cloud
         * Infrastructure (OCI) provider, see [Oracle Cloud Infrastructure
         * Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Resource attribute values. Each value is represented as a key-value pair. Example: {@code
         * {"state": "AVAILABLE"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.Map<String, String> attributes;

        /**
         * Resource attribute values. Each value is represented as a key-value pair. Example: {@code
         * {"state": "AVAILABLE"}}
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /**
         * The date and time when the stack was created. Format is defined by RFC3339. Example:
         * {@code 2022-07-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the stack was created. Format is defined by RFC3339. Example:
         * {@code 2022-07-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Resource region. For information about regions, see [Regions and Availability
         * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). Example:
         * {@code us-phoenix-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Resource region. For information about regions, see [Regions and Availability
         * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). Example:
         * {@code us-phoenix-1}
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Terraform resource address. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAddress")
        private String resourceAddress;

        /**
         * Terraform resource address.
         *
         * @param resourceAddress the value to set
         * @return this builder
         */
        public Builder resourceAddress(String resourceAddress) {
            this.resourceAddress = resourceAddress;
            this.__explicitlySet__.add("resourceAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedResourceSummary build() {
            AssociatedResourceSummary model =
                    new AssociatedResourceSummary(
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.attributes,
                            this.timeCreated,
                            this.region,
                            this.resourceAddress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedResourceSummary model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("resourceAddress")) {
                this.resourceAddress(model.getResourceAddress());
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

    /** Unique identifier for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Unique identifier for the resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Name of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Name of the resource.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Resource type. For more information about resource types supported for the Oracle Cloud
     * Infrastructure (OCI) provider, see [Oracle Cloud Infrastructure
     * Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Resource type. For more information about resource types supported for the Oracle Cloud
     * Infrastructure (OCI) provider, see [Oracle Cloud Infrastructure
     * Provider](https://registry.terraform.io/providers/oracle/oci/latest/docs).
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Resource attribute values. Each value is represented as a key-value pair. Example: {@code
     * {"state": "AVAILABLE"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.Map<String, String> attributes;

    /**
     * Resource attribute values. Each value is represented as a key-value pair. Example: {@code
     * {"state": "AVAILABLE"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * The date and time when the stack was created. Format is defined by RFC3339. Example: {@code
     * 2022-07-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the stack was created. Format is defined by RFC3339. Example: {@code
     * 2022-07-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Resource region. For information about regions, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). Example: {@code
     * us-phoenix-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Resource region. For information about regions, see [Regions and Availability
     * Domains](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm). Example: {@code
     * us-phoenix-1}
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Terraform resource address. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAddress")
    private final String resourceAddress;

    /**
     * Terraform resource address.
     *
     * @return the value
     */
    public String getResourceAddress() {
        return resourceAddress;
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
        sb.append("AssociatedResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", resourceAddress=").append(String.valueOf(this.resourceAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedResourceSummary)) {
            return false;
        }

        AssociatedResourceSummary other = (AssociatedResourceSummary) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.resourceAddress, other.resourceAddress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceAddress == null ? 43 : this.resourceAddress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
