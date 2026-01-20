/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the Resource <br>
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
        builder = ComplianceReportResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceReportResource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceName",
        "resourceType",
        "tenancyId",
        "tenancyName",
        "compartment",
        "resourceRegion",
        "complianceState",
        "products"
    })
    public ComplianceReportResource(
            String resourceId,
            String resourceName,
            String resourceType,
            String tenancyId,
            String tenancyName,
            String compartment,
            String resourceRegion,
            ComplianceState complianceState,
            java.util.List<ComplianceReportProduct> products) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.tenancyId = tenancyId;
        this.tenancyName = tenancyName;
        this.compartment = compartment;
        this.resourceRegion = resourceRegion;
        this.complianceState = complianceState;
        this.products = products;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID to identify the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID to identify the resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** Display name of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * Display name of the resource.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Type of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of the resource.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** TenancyId of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * TenancyId of the resource.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /** Tenancy the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        /**
         * Tenancy the resource belongs to.
         *
         * @param tenancyName the value to set
         * @return this builder
         */
        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }
        /** Compartment the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartment")
        private String compartment;

        /**
         * Compartment the resource belongs to.
         *
         * @param compartment the value to set
         * @return this builder
         */
        public Builder compartment(String compartment) {
            this.compartment = compartment;
            this.__explicitlySet__.add("compartment");
            return this;
        }
        /** The region the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceRegion")
        private String resourceRegion;

        /**
         * The region the resource belongs to.
         *
         * @param resourceRegion the value to set
         * @return this builder
         */
        public Builder resourceRegion(String resourceRegion) {
            this.resourceRegion = resourceRegion;
            this.__explicitlySet__.add("resourceRegion");
            return this;
        }
        /** The last known compliance state of the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * The last known compliance state of the fleet.
         *
         * @param complianceState the value to set
         * @return this builder
         */
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /**
         * Products associated with the Fleet. Only the products belonging to managed targets will
         * be shown.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("products")
        private java.util.List<ComplianceReportProduct> products;

        /**
         * Products associated with the Fleet. Only the products belonging to managed targets will
         * be shown.
         *
         * @param products the value to set
         * @return this builder
         */
        public Builder products(java.util.List<ComplianceReportProduct> products) {
            this.products = products;
            this.__explicitlySet__.add("products");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceReportResource build() {
            ComplianceReportResource model =
                    new ComplianceReportResource(
                            this.resourceId,
                            this.resourceName,
                            this.resourceType,
                            this.tenancyId,
                            this.tenancyName,
                            this.compartment,
                            this.resourceRegion,
                            this.complianceState,
                            this.products);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceReportResource model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("tenancyName")) {
                this.tenancyName(model.getTenancyName());
            }
            if (model.wasPropertyExplicitlySet("compartment")) {
                this.compartment(model.getCompartment());
            }
            if (model.wasPropertyExplicitlySet("resourceRegion")) {
                this.resourceRegion(model.getResourceRegion());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("products")) {
                this.products(model.getProducts());
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

    /** The OCID to identify the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID to identify the resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** Display name of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * Display name of the resource.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Type of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of the resource.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** TenancyId of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * TenancyId of the resource.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /** Tenancy the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    private final String tenancyName;

    /**
     * Tenancy the resource belongs to.
     *
     * @return the value
     */
    public String getTenancyName() {
        return tenancyName;
    }

    /** Compartment the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    private final String compartment;

    /**
     * Compartment the resource belongs to.
     *
     * @return the value
     */
    public String getCompartment() {
        return compartment;
    }

    /** The region the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceRegion")
    private final String resourceRegion;

    /**
     * The region the resource belongs to.
     *
     * @return the value
     */
    public String getResourceRegion() {
        return resourceRegion;
    }

    /** The last known compliance state of the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * The last known compliance state of the fleet.
     *
     * @return the value
     */
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /**
     * Products associated with the Fleet. Only the products belonging to managed targets will be
     * shown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("products")
    private final java.util.List<ComplianceReportProduct> products;

    /**
     * Products associated with the Fleet. Only the products belonging to managed targets will be
     * shown.
     *
     * @return the value
     */
    public java.util.List<ComplianceReportProduct> getProducts() {
        return products;
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
        sb.append("ComplianceReportResource(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", compartment=").append(String.valueOf(this.compartment));
        sb.append(", resourceRegion=").append(String.valueOf(this.resourceRegion));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", products=").append(String.valueOf(this.products));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceReportResource)) {
            return false;
        }

        ComplianceReportResource other = (ComplianceReportResource) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.tenancyName, other.tenancyName)
                && java.util.Objects.equals(this.compartment, other.compartment)
                && java.util.Objects.equals(this.resourceRegion, other.resourceRegion)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.products, other.products)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.tenancyName == null ? 43 : this.tenancyName.hashCode());
        result = (result * PRIME) + (this.compartment == null ? 43 : this.compartment.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceRegion == null ? 43 : this.resourceRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result = (result * PRIME) + (this.products == null ? 43 : this.products.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
