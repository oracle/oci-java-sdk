/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The CCD commitment applicability restrictions. If the CCD offer has been created with any region-
 * or AD-specific offer restriction, then it will be honored first over the usage eligibility
 * criteria. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageEligibility.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageEligibility
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentIds",
        "region",
        "availabilityDomain",
        "tenancyIds"
    })
    public UsageEligibility(
            java.util.List<String> compartmentIds,
            String region,
            String availabilityDomain,
            java.util.List<String> tenancyIds) {
        super();
        this.compartmentIds = compartmentIds;
        this.region = region;
        this.availabilityDomain = availabilityDomain;
        this.tenancyIds = tenancyIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The compartment OCID the CCD commitment is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentIds")
        private java.util.List<String> compartmentIds;

        /**
         * The compartment OCID the CCD commitment is applicable to.
         *
         * @param compartmentIds the value to set
         * @return this builder
         */
        public Builder compartmentIds(java.util.List<String> compartmentIds) {
            this.compartmentIds = compartmentIds;
            this.__explicitlySet__.add("compartmentIds");
            return this;
        }
        /**
         * The region the CCD commitment is applicable to. If the CCD offer has already been
         * restricted to any specific region, then the offer will supersede this input.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region the CCD commitment is applicable to. If the CCD offer has already been
         * restricted to any specific region, then the offer will supersede this input.
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
         * The Availability Domain the CCD is applicable to. If you're setting the {@code
         * availabilityDomain}, ensure to also set the {@code region} property value. If the CCD
         * offer has already been restricted to a specific Availability Domain, then the offer will
         * supersede this input.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The Availability Domain the CCD is applicable to. If you're setting the {@code
         * availabilityDomain}, ensure to also set the {@code region} property value. If the CCD
         * offer has already been restricted to a specific Availability Domain, then the offer will
         * supersede this input.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The tenancy IDs the CCD commitment is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyIds")
        private java.util.List<String> tenancyIds;

        /**
         * The tenancy IDs the CCD commitment is applicable to.
         *
         * @param tenancyIds the value to set
         * @return this builder
         */
        public Builder tenancyIds(java.util.List<String> tenancyIds) {
            this.tenancyIds = tenancyIds;
            this.__explicitlySet__.add("tenancyIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageEligibility build() {
            UsageEligibility model =
                    new UsageEligibility(
                            this.compartmentIds,
                            this.region,
                            this.availabilityDomain,
                            this.tenancyIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageEligibility model) {
            if (model.wasPropertyExplicitlySet("compartmentIds")) {
                this.compartmentIds(model.getCompartmentIds());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("tenancyIds")) {
                this.tenancyIds(model.getTenancyIds());
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

    /** The compartment OCID the CCD commitment is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentIds")
    private final java.util.List<String> compartmentIds;

    /**
     * The compartment OCID the CCD commitment is applicable to.
     *
     * @return the value
     */
    public java.util.List<String> getCompartmentIds() {
        return compartmentIds;
    }

    /**
     * The region the CCD commitment is applicable to. If the CCD offer has already been restricted
     * to any specific region, then the offer will supersede this input.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region the CCD commitment is applicable to. If the CCD offer has already been restricted
     * to any specific region, then the offer will supersede this input.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The Availability Domain the CCD is applicable to. If you're setting the {@code
     * availabilityDomain}, ensure to also set the {@code region} property value. If the CCD offer
     * has already been restricted to a specific Availability Domain, then the offer will supersede
     * this input.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The Availability Domain the CCD is applicable to. If you're setting the {@code
     * availabilityDomain}, ensure to also set the {@code region} property value. If the CCD offer
     * has already been restricted to a specific Availability Domain, then the offer will supersede
     * this input.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The tenancy IDs the CCD commitment is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyIds")
    private final java.util.List<String> tenancyIds;

    /**
     * The tenancy IDs the CCD commitment is applicable to.
     *
     * @return the value
     */
    public java.util.List<String> getTenancyIds() {
        return tenancyIds;
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
        sb.append("UsageEligibility(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentIds=").append(String.valueOf(this.compartmentIds));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", tenancyIds=").append(String.valueOf(this.tenancyIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageEligibility)) {
            return false;
        }

        UsageEligibility other = (UsageEligibility) o;
        return java.util.Objects.equals(this.compartmentIds, other.compartmentIds)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.tenancyIds, other.tenancyIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentIds == null ? 43 : this.compartmentIds.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.tenancyIds == null ? 43 : this.tenancyIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
