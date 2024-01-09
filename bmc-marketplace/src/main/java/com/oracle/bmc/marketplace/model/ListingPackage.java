/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A base object for all types of listing packages. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "packageType",
        defaultImpl = ListingPackage.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ContainerListingPackage.class,
            name = "CONTAINER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OrchestrationListingPackage.class,
            name = "ORCHESTRATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ImageListingPackage.class,
            name = "IMAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = KubernetesListingPackage.class,
            name = "KUBERNETES")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ListingPackage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "listingId",
        "version",
        "pricing",
        "resourceId",
        "timeCreated",
        "operatingSystem",
        "regions"
    })
    protected ListingPackage(
            String description,
            String listingId,
            String version,
            PricingModel pricing,
            String resourceId,
            java.util.Date timeCreated,
            OperatingSystem operatingSystem,
            java.util.List<Region> regions) {
        super();
        this.description = description;
        this.listingId = listingId;
        this.version = version;
        this.pricing = pricing;
        this.resourceId = resourceId;
        this.timeCreated = timeCreated;
        this.operatingSystem = operatingSystem;
        this.regions = regions;
    }

    /** Description of this package. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of this package.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The ID of the listing this package belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The ID of the listing this package belongs to.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The package version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pricing")
    private final PricingModel pricing;

    public PricingModel getPricing() {
        return pricing;
    }

    /** The unique identifier for the package resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The unique identifier for the package resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The date and time this listing package was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time this listing package was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final OperatingSystem operatingSystem;

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * The regions where you can deploy the listing package. (Some packages have restrictions that
     * limit their deployment to United States regions only.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<Region> regions;

    /**
     * The regions where you can deploy the listing package. (Some packages have restrictions that
     * limit their deployment to United States regions only.)
     *
     * @return the value
     */
    public java.util.List<Region> getRegions() {
        return regions;
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
        sb.append("ListingPackage(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", pricing=").append(String.valueOf(this.pricing));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingPackage)) {
            return false;
        }

        ListingPackage other = (ListingPackage) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.pricing, other.pricing)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(this.regions, other.regions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.pricing == null ? 43 : this.pricing.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
