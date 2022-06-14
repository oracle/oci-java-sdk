/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OrchestrationListingPackage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "packageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OrchestrationListingPackage extends ListingPackage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private OperatingSystem operatingSystem;

        public Builder operatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * Link to the orchestration resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceLink")
        private String resourceLink;

        /**
         * Link to the orchestration resource.
         * @param resourceLink the value to set
         * @return this builder
         **/
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = resourceLink;
            this.__explicitlySet__.add("resourceLink");
            return this;
        }
        /**
         * List of variables for the orchestration resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<OrchestrationVariable> variables;

        /**
         * List of variables for the orchestration resource.
         * @param variables the value to set
         * @return this builder
         **/
        public Builder variables(java.util.List<OrchestrationVariable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }
        /**
         * The regions where you can deploy this listing package. (Some packages have restrictions that limit their deployment to United States regions only.)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        /**
         * The regions where you can deploy this listing package. (Some packages have restrictions that limit their deployment to United States regions only.)
         *
         * @param regions the value to set
         * @return this builder
         **/
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
                            operatingSystem,
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
                            .operatingSystem(o.getOperatingSystem())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public OrchestrationListingPackage(
            String description,
            String listingId,
            String version,
            PricingModel pricing,
            String resourceId,
            java.util.Date timeCreated,
            OperatingSystem operatingSystem,
            String resourceLink,
            java.util.List<OrchestrationVariable> variables,
            java.util.List<Region> regions) {
        super(description, listingId, version, pricing, resourceId, timeCreated, operatingSystem);
        this.resourceLink = resourceLink;
        this.variables = variables;
        this.regions = regions;
    }

    /**
     * Link to the orchestration resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceLink")
    private final String resourceLink;

    /**
     * Link to the orchestration resource.
     * @return the value
     **/
    public String getResourceLink() {
        return resourceLink;
    }

    /**
     * List of variables for the orchestration resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<OrchestrationVariable> variables;

    /**
     * List of variables for the orchestration resource.
     * @return the value
     **/
    public java.util.List<OrchestrationVariable> getVariables() {
        return variables;
    }

    /**
     * The regions where you can deploy this listing package. (Some packages have restrictions that limit their deployment to United States regions only.)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<Region> regions;

    /**
     * The regions where you can deploy this listing package. (Some packages have restrictions that limit their deployment to United States regions only.)
     *
     * @return the value
     **/
    public java.util.List<Region> getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OrchestrationListingPackage(");
        sb.append("super=").append(super.toString());
        sb.append(", resourceLink=").append(String.valueOf(this.resourceLink));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrchestrationListingPackage)) {
            return false;
        }

        OrchestrationListingPackage other = (OrchestrationListingPackage) o;
        return java.util.Objects.equals(this.resourceLink, other.resourceLink)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceLink == null ? 43 : this.resourceLink.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
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
