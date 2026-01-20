/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for retrieving the alarm state entries. Filter retrieved alarm state
 * entries by status value and dimension key-value pairs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RetrieveDimensionStatesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RetrieveDimensionStatesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensionFilters", "status"})
    public RetrieveDimensionStatesDetails(
            java.util.Map<String, String> dimensionFilters,
            AlarmDimensionStatesEntry.Status status) {
        super();
        this.dimensionFilters = dimensionFilters;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A filter to return only alarm state entries that match the exact set of specified
         * dimension key-value pairs. If you specify {@code "availabilityDomain": "phx-ad-1"} but
         * the alarm state entry corresponds to the set {@code "availabilityDomain": "phx-ad-1"} and
         * {@code "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}, then no results are
         * returned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionFilters")
        private java.util.Map<String, String> dimensionFilters;

        /**
         * A filter to return only alarm state entries that match the exact set of specified
         * dimension key-value pairs. If you specify {@code "availabilityDomain": "phx-ad-1"} but
         * the alarm state entry corresponds to the set {@code "availabilityDomain": "phx-ad-1"} and
         * {@code "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}, then no results are
         * returned.
         *
         * @param dimensionFilters the value to set
         * @return this builder
         */
        public Builder dimensionFilters(java.util.Map<String, String> dimensionFilters) {
            this.dimensionFilters = dimensionFilters;
            this.__explicitlySet__.add("dimensionFilters");
            return this;
        }
        /**
         * A filter to return only alarm state entries that match the status value. Example: {@code
         * FIRING}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AlarmDimensionStatesEntry.Status status;

        /**
         * A filter to return only alarm state entries that match the status value. Example: {@code
         * FIRING}
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(AlarmDimensionStatesEntry.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetrieveDimensionStatesDetails build() {
            RetrieveDimensionStatesDetails model =
                    new RetrieveDimensionStatesDetails(this.dimensionFilters, this.status);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetrieveDimensionStatesDetails model) {
            if (model.wasPropertyExplicitlySet("dimensionFilters")) {
                this.dimensionFilters(model.getDimensionFilters());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
     * A filter to return only alarm state entries that match the exact set of specified dimension
     * key-value pairs. If you specify {@code "availabilityDomain": "phx-ad-1"} but the alarm state
     * entry corresponds to the set {@code "availabilityDomain": "phx-ad-1"} and {@code
     * "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}, then no results are returned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionFilters")
    private final java.util.Map<String, String> dimensionFilters;

    /**
     * A filter to return only alarm state entries that match the exact set of specified dimension
     * key-value pairs. If you specify {@code "availabilityDomain": "phx-ad-1"} but the alarm state
     * entry corresponds to the set {@code "availabilityDomain": "phx-ad-1"} and {@code
     * "resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}, then no results are returned.
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensionFilters() {
        return dimensionFilters;
    }

    /**
     * A filter to return only alarm state entries that match the status value. Example: {@code
     * FIRING}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AlarmDimensionStatesEntry.Status status;

    /**
     * A filter to return only alarm state entries that match the status value. Example: {@code
     * FIRING}
     *
     * @return the value
     */
    public AlarmDimensionStatesEntry.Status getStatus() {
        return status;
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
        sb.append("RetrieveDimensionStatesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionFilters=").append(String.valueOf(this.dimensionFilters));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrieveDimensionStatesDetails)) {
            return false;
        }

        RetrieveDimensionStatesDetails other = (RetrieveDimensionStatesDetails) o;
        return java.util.Objects.equals(this.dimensionFilters, other.dimensionFilters)
                && java.util.Objects.equals(this.status, other.status)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dimensionFilters == null ? 43 : this.dimensionFilters.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
