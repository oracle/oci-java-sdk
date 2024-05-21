/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A provider service key and its details. A provider service key is an identifier for a provider's
 * virtual circuit.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FastConnectProviderServiceKey.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FastConnectProviderServiceKey
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "bandwidthShapeName", "peeringLocation"})
    public FastConnectProviderServiceKey(
            String name, String bandwidthShapeName, String peeringLocation) {
        super();
        this.name = name;
        this.bandwidthShapeName = bandwidthShapeName;
        this.peeringLocation = peeringLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The service key that the provider gives you when you set up a virtual circuit connection
         * from the provider to Oracle Cloud Infrastructure. Use this value as the {@code providerServiceKeyName}
         * query parameter for
         * {@link #getFastConnectProviderServiceKey(GetFastConnectProviderServiceKeyRequest) getFastConnectProviderServiceKey}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The service key that the provider gives you when you set up a virtual circuit connection
         * from the provider to Oracle Cloud Infrastructure. Use this value as the {@code providerServiceKeyName}
         * query parameter for
         * {@link #getFastConnectProviderServiceKey(GetFastConnectProviderServiceKeyRequest) getFastConnectProviderServiceKey}.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The provisioned data rate of the connection. To get a list of the
         * available bandwidth levels (that is, shapes), see
         * {@link #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest) listFastConnectProviderVirtualCircuitBandwidthShapes}.
         * <p>
         * Example: {@code 10 Gbps}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
        private String bandwidthShapeName;

        /**
         * The provisioned data rate of the connection. To get a list of the
         * available bandwidth levels (that is, shapes), see
         * {@link #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest) listFastConnectProviderVirtualCircuitBandwidthShapes}.
         * <p>
         * Example: {@code 10 Gbps}
         *
         * @param bandwidthShapeName the value to set
         * @return this builder
         **/
        public Builder bandwidthShapeName(String bandwidthShapeName) {
            this.bandwidthShapeName = bandwidthShapeName;
            this.__explicitlySet__.add("bandwidthShapeName");
            return this;
        }
        /**
         * The provider's peering location.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peeringLocation")
        private String peeringLocation;

        /**
         * The provider's peering location.
         * @param peeringLocation the value to set
         * @return this builder
         **/
        public Builder peeringLocation(String peeringLocation) {
            this.peeringLocation = peeringLocation;
            this.__explicitlySet__.add("peeringLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FastConnectProviderServiceKey build() {
            FastConnectProviderServiceKey model =
                    new FastConnectProviderServiceKey(
                            this.name, this.bandwidthShapeName, this.peeringLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FastConnectProviderServiceKey model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("bandwidthShapeName")) {
                this.bandwidthShapeName(model.getBandwidthShapeName());
            }
            if (model.wasPropertyExplicitlySet("peeringLocation")) {
                this.peeringLocation(model.getPeeringLocation());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The service key that the provider gives you when you set up a virtual circuit connection
     * from the provider to Oracle Cloud Infrastructure. Use this value as the {@code providerServiceKeyName}
     * query parameter for
     * {@link #getFastConnectProviderServiceKey(GetFastConnectProviderServiceKeyRequest) getFastConnectProviderServiceKey}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The service key that the provider gives you when you set up a virtual circuit connection
     * from the provider to Oracle Cloud Infrastructure. Use this value as the {@code providerServiceKeyName}
     * query parameter for
     * {@link #getFastConnectProviderServiceKey(GetFastConnectProviderServiceKeyRequest) getFastConnectProviderServiceKey}.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The provisioned data rate of the connection. To get a list of the
     * available bandwidth levels (that is, shapes), see
     * {@link #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest) listFastConnectProviderVirtualCircuitBandwidthShapes}.
     * <p>
     * Example: {@code 10 Gbps}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthShapeName")
    private final String bandwidthShapeName;

    /**
     * The provisioned data rate of the connection. To get a list of the
     * available bandwidth levels (that is, shapes), see
     * {@link #listFastConnectProviderVirtualCircuitBandwidthShapes(ListFastConnectProviderVirtualCircuitBandwidthShapesRequest) listFastConnectProviderVirtualCircuitBandwidthShapes}.
     * <p>
     * Example: {@code 10 Gbps}
     *
     * @return the value
     **/
    public String getBandwidthShapeName() {
        return bandwidthShapeName;
    }

    /**
     * The provider's peering location.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peeringLocation")
    private final String peeringLocation;

    /**
     * The provider's peering location.
     * @return the value
     **/
    public String getPeeringLocation() {
        return peeringLocation;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FastConnectProviderServiceKey(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", bandwidthShapeName=").append(String.valueOf(this.bandwidthShapeName));
        sb.append(", peeringLocation=").append(String.valueOf(this.peeringLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FastConnectProviderServiceKey)) {
            return false;
        }

        FastConnectProviderServiceKey other = (FastConnectProviderServiceKey) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.bandwidthShapeName, other.bandwidthShapeName)
                && java.util.Objects.equals(this.peeringLocation, other.peeringLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.bandwidthShapeName == null
                                ? 43
                                : this.bandwidthShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.peeringLocation == null ? 43 : this.peeringLocation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
