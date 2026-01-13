/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A listing package for orchestration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OrchestrationListingPackage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "packageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<Region> regions;

        public Builder regions(java.util.List<Region> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /** Link to the orchestration resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceLink")
        private String resourceLink;

        /**
         * Link to the orchestration resource.
         *
         * @param resourceLink the value to set
         * @return this builder
         */
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = resourceLink;
            this.__explicitlySet__.add("resourceLink");
            return this;
        }
        /** List of variables for the orchestration resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<OrchestrationVariable> variables;

        /**
         * List of variables for the orchestration resource.
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.List<OrchestrationVariable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrchestrationListingPackage build() {
            OrchestrationListingPackage model =
                    new OrchestrationListingPackage(
                            this.description,
                            this.listingId,
                            this.version,
                            this.pricing,
                            this.resourceId,
                            this.timeCreated,
                            this.operatingSystem,
                            this.regions,
                            this.resourceLink,
                            this.variables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrchestrationListingPackage model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("pricing")) {
                this.pricing(model.getPricing());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("resourceLink")) {
                this.resourceLink(model.getResourceLink());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
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
    public OrchestrationListingPackage(
            String description,
            String listingId,
            String version,
            PricingModel pricing,
            String resourceId,
            java.util.Date timeCreated,
            OperatingSystem operatingSystem,
            java.util.List<Region> regions,
            String resourceLink,
            java.util.List<OrchestrationVariable> variables) {
        super(
                description,
                listingId,
                version,
                pricing,
                resourceId,
                timeCreated,
                operatingSystem,
                regions);
        this.resourceLink = resourceLink;
        this.variables = variables;
    }

    /** Link to the orchestration resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceLink")
    private final String resourceLink;

    /**
     * Link to the orchestration resource.
     *
     * @return the value
     */
    public String getResourceLink() {
        return resourceLink;
    }

    /** List of variables for the orchestration resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<OrchestrationVariable> variables;

    /**
     * List of variables for the orchestration resource.
     *
     * @return the value
     */
    public java.util.List<OrchestrationVariable> getVariables() {
        return variables;
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
        sb.append("OrchestrationListingPackage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceLink=").append(String.valueOf(this.resourceLink));
        sb.append(", variables=").append(String.valueOf(this.variables));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceLink == null ? 43 : this.resourceLink.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        return result;
    }
}
