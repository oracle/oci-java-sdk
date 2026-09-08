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

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomainHostDistributionState")
        private FaultDomainHostDistributionState faultDomainHostDistributionState;

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

    /** */
    public enum FaultDomainHostDistributionState implements com.oracle.bmc.http.internal.BmcEnum {
        EvenlyDistributed("EVENLY_DISTRIBUTED"),
        UnevenlyDistributed("UNEVENLY_DISTRIBUTED"),
        Unsupported("UNSUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FaultDomainHostDistributionState.class);

        private final String value;
        private static java.util.Map<String, FaultDomainHostDistributionState> map;

        static {
            map = new java.util.HashMap<>();
            for (FaultDomainHostDistributionState v : FaultDomainHostDistributionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FaultDomainHostDistributionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FaultDomainHostDistributionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FaultDomainHostDistributionState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("faultDomainHostDistributionState")
    private final FaultDomainHostDistributionState faultDomainHostDistributionState;

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
