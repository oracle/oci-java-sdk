/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details for how ESXi hosts are distributed across Fault Domains in a Cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HostDistributionReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostDistributionReportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"faultDomainHostDistributionState"})
    public HostDistributionReportDetails(
            FaultDomainHostDistributionState faultDomainHostDistributionState) {
        super();
        this.faultDomainHostDistributionState = faultDomainHostDistributionState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Current Fault Domain distribution state. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomainHostDistributionState")
        private FaultDomainHostDistributionState faultDomainHostDistributionState;

        /**
         * Current Fault Domain distribution state.
         *
         * @param faultDomainHostDistributionState the value to set
         * @return this builder
         */
        public Builder faultDomainHostDistributionState(
                FaultDomainHostDistributionState faultDomainHostDistributionState) {
            this.faultDomainHostDistributionState = faultDomainHostDistributionState;
            this.__explicitlySet__.add("faultDomainHostDistributionState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostDistributionReportDetails build() {
            HostDistributionReportDetails model =
                    new HostDistributionReportDetails(this.faultDomainHostDistributionState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostDistributionReportDetails model) {
            if (model.wasPropertyExplicitlySet("faultDomainHostDistributionState")) {
                this.faultDomainHostDistributionState(model.getFaultDomainHostDistributionState());
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

    /** Current Fault Domain distribution state. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomainHostDistributionState")
    private final FaultDomainHostDistributionState faultDomainHostDistributionState;

    /**
     * Current Fault Domain distribution state.
     *
     * @return the value
     */
    public FaultDomainHostDistributionState getFaultDomainHostDistributionState() {
        return faultDomainHostDistributionState;
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
        sb.append("HostDistributionReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("faultDomainHostDistributionState=")
                .append(String.valueOf(this.faultDomainHostDistributionState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostDistributionReportDetails)) {
            return false;
        }

        HostDistributionReportDetails other = (HostDistributionReportDetails) o;
        return java.util.Objects.equals(
                        this.faultDomainHostDistributionState,
                        other.faultDomainHostDistributionState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.faultDomainHostDistributionState == null
                                ? 43
                                : this.faultDomainHostDistributionState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
