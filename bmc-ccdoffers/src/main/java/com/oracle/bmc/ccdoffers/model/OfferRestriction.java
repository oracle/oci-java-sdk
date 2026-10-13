/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * CCD offer applicability restrictions. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OfferRestriction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OfferRestriction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"region", "availabilityDomain", "subscriptionIds"})
    public OfferRestriction(
            String region, String availabilityDomain, java.util.List<String> subscriptionIds) {
        super();
        this.region = region;
        this.availabilityDomain = availabilityDomain;
        this.subscriptionIds = subscriptionIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The region the CCD offer is applicable to. For example, a CCD offer applicable only to
         * us-ashburn-1.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region the CCD offer is applicable to. For example, a CCD offer applicable only to
         * us-ashburn-1.
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
         * The Availability Domain the CCD offer is applicable to. If you are setting {@code
         * availabilityDomain}, ensure to also set the {@code region} property value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The Availability Domain the CCD offer is applicable to. If you are setting {@code
         * availabilityDomain}, ensure to also set the {@code region} property value.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The subscription OCIDs the CCD offer is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        /**
         * The subscription OCIDs the CCD offer is applicable to.
         *
         * @param subscriptionIds the value to set
         * @return this builder
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OfferRestriction build() {
            OfferRestriction model =
                    new OfferRestriction(
                            this.region, this.availabilityDomain, this.subscriptionIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OfferRestriction model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("subscriptionIds")) {
                this.subscriptionIds(model.getSubscriptionIds());
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

    /**
     * The region the CCD offer is applicable to. For example, a CCD offer applicable only to
     * us-ashburn-1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region the CCD offer is applicable to. For example, a CCD offer applicable only to
     * us-ashburn-1.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The Availability Domain the CCD offer is applicable to. If you are setting {@code
     * availabilityDomain}, ensure to also set the {@code region} property value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The Availability Domain the CCD offer is applicable to. If you are setting {@code
     * availabilityDomain}, ensure to also set the {@code region} property value.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The subscription OCIDs the CCD offer is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    private final java.util.List<String> subscriptionIds;

    /**
     * The subscription OCIDs the CCD offer is applicable to.
     *
     * @return the value
     */
    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
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
        sb.append("OfferRestriction(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subscriptionIds=").append(String.valueOf(this.subscriptionIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OfferRestriction)) {
            return false;
        }

        OfferRestriction other = (OfferRestriction) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subscriptionIds, other.subscriptionIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionIds == null ? 43 : this.subscriptionIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
