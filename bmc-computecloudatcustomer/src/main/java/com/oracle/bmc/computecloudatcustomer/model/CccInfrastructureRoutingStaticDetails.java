/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Static routing information for a rack. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CccInfrastructureRoutingStaticDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CccInfrastructureRoutingStaticDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"uplinkVlan", "uplinkHsrpGroup"})
    public CccInfrastructureRoutingStaticDetails(Integer uplinkVlan, Integer uplinkHsrpGroup) {
        super();
        this.uplinkVlan = uplinkVlan;
        this.uplinkHsrpGroup = uplinkHsrpGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The virtual local area network (VLAN) identifier used to connect to the uplink (only
         * access mode is supported).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkVlan")
        private Integer uplinkVlan;

        /**
         * The virtual local area network (VLAN) identifier used to connect to the uplink (only
         * access mode is supported).
         *
         * @param uplinkVlan the value to set
         * @return this builder
         */
        public Builder uplinkVlan(Integer uplinkVlan) {
            this.uplinkVlan = uplinkVlan;
            this.__explicitlySet__.add("uplinkVlan");
            return this;
        }
        /**
         * The uplink Hot Standby Router Protocol (HSRP) group value for the switch in the Compute
         * Cloud@Customer infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uplinkHsrpGroup")
        private Integer uplinkHsrpGroup;

        /**
         * The uplink Hot Standby Router Protocol (HSRP) group value for the switch in the Compute
         * Cloud@Customer infrastructure.
         *
         * @param uplinkHsrpGroup the value to set
         * @return this builder
         */
        public Builder uplinkHsrpGroup(Integer uplinkHsrpGroup) {
            this.uplinkHsrpGroup = uplinkHsrpGroup;
            this.__explicitlySet__.add("uplinkHsrpGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructureRoutingStaticDetails build() {
            CccInfrastructureRoutingStaticDetails model =
                    new CccInfrastructureRoutingStaticDetails(
                            this.uplinkVlan, this.uplinkHsrpGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructureRoutingStaticDetails model) {
            if (model.wasPropertyExplicitlySet("uplinkVlan")) {
                this.uplinkVlan(model.getUplinkVlan());
            }
            if (model.wasPropertyExplicitlySet("uplinkHsrpGroup")) {
                this.uplinkHsrpGroup(model.getUplinkHsrpGroup());
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
     * The virtual local area network (VLAN) identifier used to connect to the uplink (only access
     * mode is supported).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkVlan")
    private final Integer uplinkVlan;

    /**
     * The virtual local area network (VLAN) identifier used to connect to the uplink (only access
     * mode is supported).
     *
     * @return the value
     */
    public Integer getUplinkVlan() {
        return uplinkVlan;
    }

    /**
     * The uplink Hot Standby Router Protocol (HSRP) group value for the switch in the Compute
     * Cloud@Customer infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uplinkHsrpGroup")
    private final Integer uplinkHsrpGroup;

    /**
     * The uplink Hot Standby Router Protocol (HSRP) group value for the switch in the Compute
     * Cloud@Customer infrastructure.
     *
     * @return the value
     */
    public Integer getUplinkHsrpGroup() {
        return uplinkHsrpGroup;
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
        sb.append("CccInfrastructureRoutingStaticDetails(");
        sb.append("super=").append(super.toString());
        sb.append("uplinkVlan=").append(String.valueOf(this.uplinkVlan));
        sb.append(", uplinkHsrpGroup=").append(String.valueOf(this.uplinkHsrpGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccInfrastructureRoutingStaticDetails)) {
            return false;
        }

        CccInfrastructureRoutingStaticDetails other = (CccInfrastructureRoutingStaticDetails) o;
        return java.util.Objects.equals(this.uplinkVlan, other.uplinkVlan)
                && java.util.Objects.equals(this.uplinkHsrpGroup, other.uplinkHsrpGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uplinkVlan == null ? 43 : this.uplinkVlan.hashCode());
        result =
                (result * PRIME)
                        + (this.uplinkHsrpGroup == null ? 43 : this.uplinkHsrpGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
