/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Creation details for a configuration source based on the specified compartment. <br>
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
        builder = CreateCompartmentConfigSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCompartmentConfigSourceDetails extends CreateConfigSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to use for creating the stack. The new stack will include definitions
         * for supported resource types in scope of the specified compartment OCID (tenancy level
         * for root compartment, compartment level otherwise).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment to use for creating the stack. The new stack will include definitions
         * for supported resource types in scope of the specified compartment OCID (tenancy level
         * for root compartment, compartment level otherwise).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The region to use for creating the stack. The new stack will include definitions for
         * supported resource types in this region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region to use for creating the stack. The new stack will include definitions for
         * supported resource types in this region.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Filter for [services to use with Resource
         * Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
         * For example, "database" limits resource discovery to resource types within the Database
         * service. The specified services must be in scope of the given compartment OCID (tenancy
         * level for root compartment, compartment level otherwise). If not specified, then all
         * services at the scope of the given compartment OCID are used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("servicesToDiscover")
        private java.util.List<String> servicesToDiscover;

        /**
         * Filter for [services to use with Resource
         * Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
         * For example, "database" limits resource discovery to resource types within the Database
         * service. The specified services must be in scope of the given compartment OCID (tenancy
         * level for root compartment, compartment level otherwise). If not specified, then all
         * services at the scope of the given compartment OCID are used.
         *
         * @param servicesToDiscover the value to set
         * @return this builder
         */
        public Builder servicesToDiscover(java.util.List<String> servicesToDiscover) {
            this.servicesToDiscover = servicesToDiscover;
            this.__explicitlySet__.add("servicesToDiscover");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCompartmentConfigSourceDetails build() {
            CreateCompartmentConfigSourceDetails model =
                    new CreateCompartmentConfigSourceDetails(
                            this.workingDirectory,
                            this.compartmentId,
                            this.region,
                            this.servicesToDiscover);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompartmentConfigSourceDetails model) {
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("servicesToDiscover")) {
                this.servicesToDiscover(model.getServicesToDiscover());
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

    @Deprecated
    public CreateCompartmentConfigSourceDetails(
            String workingDirectory,
            String compartmentId,
            String region,
            java.util.List<String> servicesToDiscover) {
        super(workingDirectory);
        this.compartmentId = compartmentId;
        this.region = region;
        this.servicesToDiscover = servicesToDiscover;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to use for creating the stack. The new stack will include definitions for
     * supported resource types in scope of the specified compartment OCID (tenancy level for root
     * compartment, compartment level otherwise).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment to use for creating the stack. The new stack will include definitions for
     * supported resource types in scope of the specified compartment OCID (tenancy level for root
     * compartment, compartment level otherwise).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The region to use for creating the stack. The new stack will include definitions for
     * supported resource types in this region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region to use for creating the stack. The new stack will include definitions for
     * supported resource types in this region.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * Filter for [services to use with Resource
     * Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     * For example, "database" limits resource discovery to resource types within the Database
     * service. The specified services must be in scope of the given compartment OCID (tenancy level
     * for root compartment, compartment level otherwise). If not specified, then all services at
     * the scope of the given compartment OCID are used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicesToDiscover")
    private final java.util.List<String> servicesToDiscover;

    /**
     * Filter for [services to use with Resource
     * Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     * For example, "database" limits resource discovery to resource types within the Database
     * service. The specified services must be in scope of the given compartment OCID (tenancy level
     * for root compartment, compartment level otherwise). If not specified, then all services at
     * the scope of the given compartment OCID are used.
     *
     * @return the value
     */
    public java.util.List<String> getServicesToDiscover() {
        return servicesToDiscover;
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
        sb.append("CreateCompartmentConfigSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", servicesToDiscover=").append(String.valueOf(this.servicesToDiscover));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCompartmentConfigSourceDetails)) {
            return false;
        }

        CreateCompartmentConfigSourceDetails other = (CreateCompartmentConfigSourceDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.servicesToDiscover, other.servicesToDiscover)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.servicesToDiscover == null
                                ? 43
                                : this.servicesToDiscover.hashCode());
        return result;
    }
}
