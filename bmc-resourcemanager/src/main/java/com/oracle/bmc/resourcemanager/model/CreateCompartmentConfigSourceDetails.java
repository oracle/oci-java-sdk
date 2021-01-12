/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Property details for uploading the specified compartment as the configuration source.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCompartmentConfigSourceDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateCompartmentConfigSourceDetails extends CreateConfigSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("servicesToDiscover")
        private java.util.List<String> servicesToDiscover;

        public Builder servicesToDiscover(java.util.List<String> servicesToDiscover) {
            this.servicesToDiscover = servicesToDiscover;
            this.__explicitlySet__.add("servicesToDiscover");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCompartmentConfigSourceDetails build() {
            CreateCompartmentConfigSourceDetails __instance__ =
                    new CreateCompartmentConfigSourceDetails(
                            workingDirectory, compartmentId, region, servicesToDiscover);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompartmentConfigSourceDetails o) {
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to use for creating the stack.
     * The new stack will include definitions for supported resource types in scope of the specified compartment OCID (tenancy level for root compartment, compartment level otherwise).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The region to use for creating the stack. The new stack will include definitions for
     * supported resource types in this region.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;

    /**
     * Filter for [services to use with Resource Discovery](https://www.terraform.io/docs/providers/oci/guides/resource_discovery.html#services).
     * For example, \"database\" limits resource discovery to resource types within the Database service.
     * The specified services must be in scope of the given compartment OCID (tenancy level for root compartment, compartment level otherwise).
     * If not specified, then all services at the scope of the given compartment OCID are used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servicesToDiscover")
    java.util.List<String> servicesToDiscover;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
