/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A listing package for orchestration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OrchestrationListingPackage.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "packageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OrchestrationListingPackage extends ListingPackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pricing")
        private PricingModel pricing;

        public Builder pricing(PricingModel pricing) {
            this.pricing = pricing;
            this.__explicitlySet__.add("pricing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceLink")
        private String resourceLink;

        public Builder resourceLink(String resourceLink) {
            this.resourceLink = resourceLink;
            this.__explicitlySet__.add("resourceLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<OrchestrationVariable> variables;

        public Builder variables(java.util.List<OrchestrationVariable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        public Builder regions(java.util.List<Region> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrchestrationListingPackage build() {
            OrchestrationListingPackage __instance__ =
                    new OrchestrationListingPackage(
                            description,
                            listingId,
                            version,
                            pricing,
                            resourceId,
                            timeCreated,
                            resourceLink,
                            variables,
                            regions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrchestrationListingPackage o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .listingId(o.getListingId())
                            .version(o.getVersion())
                            .pricing(o.getPricing())
                            .resourceId(o.getResourceId())
                            .timeCreated(o.getTimeCreated())
                            .resourceLink(o.getResourceLink())
                            .variables(o.getVariables())
                            .regions(o.getRegions());

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
    public OrchestrationListingPackage(
            String description,
            String listingId,
            String version,
            PricingModel pricing,
            String resourceId,
            java.util.Date timeCreated,
            String resourceLink,
            java.util.List<OrchestrationVariable> variables,
            java.util.List<Region> regions) {
        super(description, listingId, version, pricing, resourceId, timeCreated);
        this.resourceLink = resourceLink;
        this.variables = variables;
        this.regions = regions;
    }

    /**
     * Link to the orchestration resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceLink")
    String resourceLink;

    /**
     * List of variables for the orchestration resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    java.util.List<OrchestrationVariable> variables;

    /**
     * The regions where you can deploy this listing package. (Some packages have restrictions that limit their deployment to United States regions only.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    java.util.List<Region> regions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
