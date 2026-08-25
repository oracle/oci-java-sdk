/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Compute capacity reservation ID mappings by domain. For a multi-AD region, domain1, domain2, and
 * domain3 correspond to AD1, AD2, and AD3 respectively. For a single-AD region, domain1, domain2,
 * and domain3 correspond to FD1, FD2, and FD3 respectively. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeCapacityReservations.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeCapacityReservations
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "domain1ReservationId",
        "domain2ReservationId",
        "domain3ReservationId"
    })
    public ComputeCapacityReservations(
            String domain1ReservationId, String domain2ReservationId, String domain3ReservationId) {
        super();
        this.domain1ReservationId = domain1ReservationId;
        this.domain2ReservationId = domain2ReservationId;
        this.domain3ReservationId = domain3ReservationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Capacity reservation OCID corresponding to AD1 for a multi-AD region or FD1 for a
         * single-AD region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain1ReservationId")
        private String domain1ReservationId;

        /**
         * Capacity reservation OCID corresponding to AD1 for a multi-AD region or FD1 for a
         * single-AD region.
         *
         * @param domain1ReservationId the value to set
         * @return this builder
         */
        public Builder domain1ReservationId(String domain1ReservationId) {
            this.domain1ReservationId = domain1ReservationId;
            this.__explicitlySet__.add("domain1ReservationId");
            return this;
        }
        /**
         * Capacity reservation OCID corresponding to AD2 for a multi-AD region or FD2 for a
         * single-AD region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain2ReservationId")
        private String domain2ReservationId;

        /**
         * Capacity reservation OCID corresponding to AD2 for a multi-AD region or FD2 for a
         * single-AD region.
         *
         * @param domain2ReservationId the value to set
         * @return this builder
         */
        public Builder domain2ReservationId(String domain2ReservationId) {
            this.domain2ReservationId = domain2ReservationId;
            this.__explicitlySet__.add("domain2ReservationId");
            return this;
        }
        /**
         * Capacity reservation OCID corresponding to AD3 for a multi-AD region or FD3 for a
         * single-AD region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain3ReservationId")
        private String domain3ReservationId;

        /**
         * Capacity reservation OCID corresponding to AD3 for a multi-AD region or FD3 for a
         * single-AD region.
         *
         * @param domain3ReservationId the value to set
         * @return this builder
         */
        public Builder domain3ReservationId(String domain3ReservationId) {
            this.domain3ReservationId = domain3ReservationId;
            this.__explicitlySet__.add("domain3ReservationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeCapacityReservations build() {
            ComputeCapacityReservations model =
                    new ComputeCapacityReservations(
                            this.domain1ReservationId,
                            this.domain2ReservationId,
                            this.domain3ReservationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeCapacityReservations model) {
            if (model.wasPropertyExplicitlySet("domain1ReservationId")) {
                this.domain1ReservationId(model.getDomain1ReservationId());
            }
            if (model.wasPropertyExplicitlySet("domain2ReservationId")) {
                this.domain2ReservationId(model.getDomain2ReservationId());
            }
            if (model.wasPropertyExplicitlySet("domain3ReservationId")) {
                this.domain3ReservationId(model.getDomain3ReservationId());
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
     * Capacity reservation OCID corresponding to AD1 for a multi-AD region or FD1 for a single-AD
     * region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain1ReservationId")
    private final String domain1ReservationId;

    /**
     * Capacity reservation OCID corresponding to AD1 for a multi-AD region or FD1 for a single-AD
     * region.
     *
     * @return the value
     */
    public String getDomain1ReservationId() {
        return domain1ReservationId;
    }

    /**
     * Capacity reservation OCID corresponding to AD2 for a multi-AD region or FD2 for a single-AD
     * region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain2ReservationId")
    private final String domain2ReservationId;

    /**
     * Capacity reservation OCID corresponding to AD2 for a multi-AD region or FD2 for a single-AD
     * region.
     *
     * @return the value
     */
    public String getDomain2ReservationId() {
        return domain2ReservationId;
    }

    /**
     * Capacity reservation OCID corresponding to AD3 for a multi-AD region or FD3 for a single-AD
     * region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain3ReservationId")
    private final String domain3ReservationId;

    /**
     * Capacity reservation OCID corresponding to AD3 for a multi-AD region or FD3 for a single-AD
     * region.
     *
     * @return the value
     */
    public String getDomain3ReservationId() {
        return domain3ReservationId;
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
        sb.append("ComputeCapacityReservations(");
        sb.append("super=").append(super.toString());
        sb.append("domain1ReservationId=").append(String.valueOf(this.domain1ReservationId));
        sb.append(", domain2ReservationId=").append(String.valueOf(this.domain2ReservationId));
        sb.append(", domain3ReservationId=").append(String.valueOf(this.domain3ReservationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeCapacityReservations)) {
            return false;
        }

        ComputeCapacityReservations other = (ComputeCapacityReservations) o;
        return java.util.Objects.equals(this.domain1ReservationId, other.domain1ReservationId)
                && java.util.Objects.equals(this.domain2ReservationId, other.domain2ReservationId)
                && java.util.Objects.equals(this.domain3ReservationId, other.domain3ReservationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.domain1ReservationId == null
                                ? 43
                                : this.domain1ReservationId.hashCode());
        result =
                (result * PRIME)
                        + (this.domain2ReservationId == null
                                ? 43
                                : this.domain2ReservationId.hashCode());
        result =
                (result * PRIME)
                        + (this.domain3ReservationId == null
                                ? 43
                                : this.domain3ReservationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
