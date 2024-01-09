/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create an ODA Private Endpoint Scan Proxy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOdaPrivateEndpointScanProxyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOdaPrivateEndpointScanProxyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scanListenerType", "protocol", "scanListenerInfos"})
    public CreateOdaPrivateEndpointScanProxyDetails(
            OdaPrivateEndpointScanProxy.ScanListenerType scanListenerType,
            OdaPrivateEndpointScanProxy.Protocol protocol,
            java.util.List<ScanListenerInfo> scanListenerInfos) {
        super();
        this.scanListenerType = scanListenerType;
        this.protocol = protocol;
        this.scanListenerInfos = scanListenerInfos;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type indicating whether Scan listener is specified by its FQDN or list of IPs */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerType")
        private OdaPrivateEndpointScanProxy.ScanListenerType scanListenerType;

        /**
         * Type indicating whether Scan listener is specified by its FQDN or list of IPs
         *
         * @param scanListenerType the value to set
         * @return this builder
         */
        public Builder scanListenerType(
                OdaPrivateEndpointScanProxy.ScanListenerType scanListenerType) {
            this.scanListenerType = scanListenerType;
            this.__explicitlySet__.add("scanListenerType");
            return this;
        }
        /**
         * The protocol used for communication between client, scanProxy and RAC's scan listeners
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private OdaPrivateEndpointScanProxy.Protocol protocol;

        /**
         * The protocol used for communication between client, scanProxy and RAC's scan listeners
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(OdaPrivateEndpointScanProxy.Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * The FQDN/IPs and port information of customer's Real Application Cluster (RAC)'s SCAN
         * listeners.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerInfos")
        private java.util.List<ScanListenerInfo> scanListenerInfos;

        /**
         * The FQDN/IPs and port information of customer's Real Application Cluster (RAC)'s SCAN
         * listeners.
         *
         * @param scanListenerInfos the value to set
         * @return this builder
         */
        public Builder scanListenerInfos(java.util.List<ScanListenerInfo> scanListenerInfos) {
            this.scanListenerInfos = scanListenerInfos;
            this.__explicitlySet__.add("scanListenerInfos");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOdaPrivateEndpointScanProxyDetails build() {
            CreateOdaPrivateEndpointScanProxyDetails model =
                    new CreateOdaPrivateEndpointScanProxyDetails(
                            this.scanListenerType, this.protocol, this.scanListenerInfos);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOdaPrivateEndpointScanProxyDetails model) {
            if (model.wasPropertyExplicitlySet("scanListenerType")) {
                this.scanListenerType(model.getScanListenerType());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("scanListenerInfos")) {
                this.scanListenerInfos(model.getScanListenerInfos());
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

    /** Type indicating whether Scan listener is specified by its FQDN or list of IPs */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerType")
    private final OdaPrivateEndpointScanProxy.ScanListenerType scanListenerType;

    /**
     * Type indicating whether Scan listener is specified by its FQDN or list of IPs
     *
     * @return the value
     */
    public OdaPrivateEndpointScanProxy.ScanListenerType getScanListenerType() {
        return scanListenerType;
    }

    /** The protocol used for communication between client, scanProxy and RAC's scan listeners */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final OdaPrivateEndpointScanProxy.Protocol protocol;

    /**
     * The protocol used for communication between client, scanProxy and RAC's scan listeners
     *
     * @return the value
     */
    public OdaPrivateEndpointScanProxy.Protocol getProtocol() {
        return protocol;
    }

    /**
     * The FQDN/IPs and port information of customer's Real Application Cluster (RAC)'s SCAN
     * listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerInfos")
    private final java.util.List<ScanListenerInfo> scanListenerInfos;

    /**
     * The FQDN/IPs and port information of customer's Real Application Cluster (RAC)'s SCAN
     * listeners.
     *
     * @return the value
     */
    public java.util.List<ScanListenerInfo> getScanListenerInfos() {
        return scanListenerInfos;
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
        sb.append("CreateOdaPrivateEndpointScanProxyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("scanListenerType=").append(String.valueOf(this.scanListenerType));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", scanListenerInfos=").append(String.valueOf(this.scanListenerInfos));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOdaPrivateEndpointScanProxyDetails)) {
            return false;
        }

        CreateOdaPrivateEndpointScanProxyDetails other =
                (CreateOdaPrivateEndpointScanProxyDetails) o;
        return java.util.Objects.equals(this.scanListenerType, other.scanListenerType)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.scanListenerInfos, other.scanListenerInfos)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scanListenerType == null ? 43 : this.scanListenerType.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerInfos == null ? 43 : this.scanListenerInfos.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
