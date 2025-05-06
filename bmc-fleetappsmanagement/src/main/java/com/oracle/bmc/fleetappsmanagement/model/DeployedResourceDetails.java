/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The Filtered List Of Deployed Resources <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeployedResourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeployedResourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mode",
        "resourceName",
        "resourceProvider",
        "resourceType",
        "resourceInstanceList"
    })
    public DeployedResourceDetails(
            String mode,
            String resourceName,
            String resourceProvider,
            String resourceType,
            java.util.List<InstanceSummary> resourceInstanceList) {
        super();
        this.mode = mode;
        this.resourceName = resourceName;
        this.resourceProvider = resourceProvider;
        this.resourceType = resourceType;
        this.resourceInstanceList = resourceInstanceList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The mode of the resource. Example: "managed" */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private String mode;

        /**
         * The mode of the resource. Example: "managed"
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(String mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** The name of the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The name of the Provider */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceProvider")
        private String resourceProvider;

        /**
         * The name of the Provider
         *
         * @param resourceProvider the value to set
         * @return this builder
         */
        public Builder resourceProvider(String resourceProvider) {
            this.resourceProvider = resourceProvider;
            this.__explicitlySet__.add("resourceProvider");
            return this;
        }
        /**
         * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
         * provider](https://registry.terraform.io/providers/oracle/oci/latest/docs). Example:
         * oci_core_instance
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
         * provider](https://registry.terraform.io/providers/oracle/oci/latest/docs). Example:
         * oci_core_instance
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Collection of InstanceSummary */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceInstanceList")
        private java.util.List<InstanceSummary> resourceInstanceList;

        /**
         * Collection of InstanceSummary
         *
         * @param resourceInstanceList the value to set
         * @return this builder
         */
        public Builder resourceInstanceList(java.util.List<InstanceSummary> resourceInstanceList) {
            this.resourceInstanceList = resourceInstanceList;
            this.__explicitlySet__.add("resourceInstanceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployedResourceDetails build() {
            DeployedResourceDetails model =
                    new DeployedResourceDetails(
                            this.mode,
                            this.resourceName,
                            this.resourceProvider,
                            this.resourceType,
                            this.resourceInstanceList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployedResourceDetails model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceProvider")) {
                this.resourceProvider(model.getResourceProvider());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceInstanceList")) {
                this.resourceInstanceList(model.getResourceInstanceList());
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

    /** The mode of the resource. Example: "managed" */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final String mode;

    /**
     * The mode of the resource. Example: "managed"
     *
     * @return the value
     */
    public String getMode() {
        return mode;
    }

    /** The name of the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The name of the Provider */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProvider")
    private final String resourceProvider;

    /**
     * The name of the Provider
     *
     * @return the value
     */
    public String getResourceProvider() {
        return resourceProvider;
    }

    /**
     * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
     * provider](https://registry.terraform.io/providers/oracle/oci/latest/docs). Example:
     * oci_core_instance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The provider resource type. Must be supported by the [Oracle Cloud Infrastructure
     * provider](https://registry.terraform.io/providers/oracle/oci/latest/docs). Example:
     * oci_core_instance
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** Collection of InstanceSummary */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceInstanceList")
    private final java.util.List<InstanceSummary> resourceInstanceList;

    /**
     * Collection of InstanceSummary
     *
     * @return the value
     */
    public java.util.List<InstanceSummary> getResourceInstanceList() {
        return resourceInstanceList;
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
        sb.append("DeployedResourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mode=").append(String.valueOf(this.mode));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceProvider=").append(String.valueOf(this.resourceProvider));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceInstanceList=").append(String.valueOf(this.resourceInstanceList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployedResourceDetails)) {
            return false;
        }

        DeployedResourceDetails other = (DeployedResourceDetails) o;
        return java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceProvider, other.resourceProvider)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceInstanceList, other.resourceInstanceList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceProvider == null ? 43 : this.resourceProvider.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceInstanceList == null
                                ? 43
                                : this.resourceInstanceList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
