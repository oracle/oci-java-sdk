/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Compartment to use for creating the stack.
 * The new stack will include definitions for supported resource types in this compartment.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CompartmentConfigSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CompartmentConfigSource extends ConfigSource {
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to use
         * for creating the stack. The new stack will include definitions for supported
         * resource types in this compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to use
         * for creating the stack. The new stack will include definitions for supported
         * resource types in this compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The region to use for creating the stack. The new stack will include definitions for
         * supported resource types in this region.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region to use for creating the stack. The new stack will include definitions for
         * supported resource types in this region.
         *
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * Filter for [services to use with Resource Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
         * For example, "database" limits resource discovery to resource types within the Database service.
         * The specified services must be in scope of the given compartment OCID (tenancy level for root compartment, compartment level otherwise).
         * If not specified, then all services at the scope of the given compartment OCID are used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("servicesToDiscover")
        private java.util.List<String> servicesToDiscover;

        /**
         * Filter for [services to use with Resource Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
         * For example, "database" limits resource discovery to resource types within the Database service.
         * The specified services must be in scope of the given compartment OCID (tenancy level for root compartment, compartment level otherwise).
         * If not specified, then all services at the scope of the given compartment OCID are used.
         *
         * @param servicesToDiscover the value to set
         * @return this builder
         **/
        public Builder servicesToDiscover(java.util.List<String> servicesToDiscover) {
            this.servicesToDiscover = servicesToDiscover;
            this.__explicitlySet__.add("servicesToDiscover");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompartmentConfigSource build() {
            CompartmentConfigSource __instance__ =
                    new CompartmentConfigSource(
                            workingDirectory, compartmentId, region, servicesToDiscover);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompartmentConfigSource o) {
            Builder copiedBuilder =
                    workingDirectory(o.getWorkingDirectory())
                            .compartmentId(o.getCompartmentId())
                            .region(o.getRegion())
                            .servicesToDiscover(o.getServicesToDiscover());

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

    @Deprecated
    public CompartmentConfigSource(
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to use
     * for creating the stack. The new stack will include definitions for supported
     * resource types in this compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to use
     * for creating the stack. The new stack will include definitions for supported
     * resource types in this compartment.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The region to use for creating the stack. The new stack will include definitions for
     * supported resource types in this region.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region to use for creating the stack. The new stack will include definitions for
     * supported resource types in this region.
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * Filter for [services to use with Resource Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     * For example, "database" limits resource discovery to resource types within the Database service.
     * The specified services must be in scope of the given compartment OCID (tenancy level for root compartment, compartment level otherwise).
     * If not specified, then all services at the scope of the given compartment OCID are used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicesToDiscover")
    private final java.util.List<String> servicesToDiscover;

    /**
     * Filter for [services to use with Resource Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     * For example, "database" limits resource discovery to resource types within the Database service.
     * The specified services must be in scope of the given compartment OCID (tenancy level for root compartment, compartment level otherwise).
     * If not specified, then all services at the scope of the given compartment OCID are used.
     *
     * @return the value
     **/
    public java.util.List<String> getServicesToDiscover() {
        return servicesToDiscover;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompartmentConfigSource(");
        sb.append("super=").append(super.toString());
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", servicesToDiscover=").append(String.valueOf(this.servicesToDiscover));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompartmentConfigSource)) {
            return false;
        }

        CompartmentConfigSource other = (CompartmentConfigSource) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.servicesToDiscover, other.servicesToDiscover)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
