/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * The Ordering Service Node details to be added <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateOsnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOsnDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ad", "ocpuAllocationParam"})
    public CreateOsnDetails(
            AvailabilityDomain.Ads ad, OcpuAllocationNumberParam ocpuAllocationParam) {
        super();
        this.ad = ad;
        this.ocpuAllocationParam = ocpuAllocationParam;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Availability Domain to place new OSN */
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private AvailabilityDomain.Ads ad;

        /**
         * Availability Domain to place new OSN
         *
         * @param ad the value to set
         * @return this builder
         */
        public Builder ad(AvailabilityDomain.Ads ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
        private OcpuAllocationNumberParam ocpuAllocationParam;

        public Builder ocpuAllocationParam(OcpuAllocationNumberParam ocpuAllocationParam) {
            this.ocpuAllocationParam = ocpuAllocationParam;
            this.__explicitlySet__.add("ocpuAllocationParam");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOsnDetails build() {
            CreateOsnDetails model = new CreateOsnDetails(this.ad, this.ocpuAllocationParam);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOsnDetails model) {
            if (model.wasPropertyExplicitlySet("ad")) {
                this.ad(model.getAd());
            }
            if (model.wasPropertyExplicitlySet("ocpuAllocationParam")) {
                this.ocpuAllocationParam(model.getOcpuAllocationParam());
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

    /** Availability Domain to place new OSN */
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final AvailabilityDomain.Ads ad;

    /**
     * Availability Domain to place new OSN
     *
     * @return the value
     */
    public AvailabilityDomain.Ads getAd() {
        return ad;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
    private final OcpuAllocationNumberParam ocpuAllocationParam;

    public OcpuAllocationNumberParam getOcpuAllocationParam() {
        return ocpuAllocationParam;
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
        sb.append("CreateOsnDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ad=").append(String.valueOf(this.ad));
        sb.append(", ocpuAllocationParam=").append(String.valueOf(this.ocpuAllocationParam));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOsnDetails)) {
            return false;
        }

        CreateOsnDetails other = (CreateOsnDetails) o;
        return java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.ocpuAllocationParam, other.ocpuAllocationParam)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuAllocationParam == null
                                ? 43
                                : this.ocpuAllocationParam.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
