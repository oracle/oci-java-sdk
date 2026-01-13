/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Details pertaining to a scan proxy instance created for a scan listener FQDN/IPs <br>
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
        builder = OdaPrivateEndpointScanProxySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OdaPrivateEndpointScanProxySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "scanListenerType",
        "protocol",
        "scanListenerInfos",
        "lifecycleState",
        "timeCreated"
    })
    public OdaPrivateEndpointScanProxySummary(
            String id,
            OdaPrivateEndpointScanProxy.ScanListenerType scanListenerType,
            OdaPrivateEndpointScanProxy.Protocol protocol,
            java.util.List<ScanListenerInfo> scanListenerInfos,
            OdaPrivateEndpointScanProxy.LifecycleState lifecycleState,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.scanListenerType = scanListenerType;
        this.protocol = protocol;
        this.scanListenerInfos = scanListenerInfos;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ODA Private Endpoint Scan Proxy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ODA Private Endpoint Scan Proxy.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
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
        /** The current state of the ODA Private Endpoint Scan Proxy. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OdaPrivateEndpointScanProxy.LifecycleState lifecycleState;

        /**
         * The current state of the ODA Private Endpoint Scan Proxy.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OdaPrivateEndpointScanProxy.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * When the resource was created. A date-time string as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the resource was created. A date-time string as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdaPrivateEndpointScanProxySummary build() {
            OdaPrivateEndpointScanProxySummary model =
                    new OdaPrivateEndpointScanProxySummary(
                            this.id,
                            this.scanListenerType,
                            this.protocol,
                            this.scanListenerInfos,
                            this.lifecycleState,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdaPrivateEndpointScanProxySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("scanListenerType")) {
                this.scanListenerType(model.getScanListenerType());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("scanListenerInfos")) {
                this.scanListenerInfos(model.getScanListenerInfos());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ODA
     * Private Endpoint Scan Proxy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ODA
     * Private Endpoint Scan Proxy.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** The current state of the ODA Private Endpoint Scan Proxy. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OdaPrivateEndpointScanProxy.LifecycleState lifecycleState;

    /**
     * The current state of the ODA Private Endpoint Scan Proxy.
     *
     * @return the value
     */
    public OdaPrivateEndpointScanProxy.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * When the resource was created. A date-time string as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the resource was created. A date-time string as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("OdaPrivateEndpointScanProxySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", scanListenerType=").append(String.valueOf(this.scanListenerType));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", scanListenerInfos=").append(String.valueOf(this.scanListenerInfos));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdaPrivateEndpointScanProxySummary)) {
            return false;
        }

        OdaPrivateEndpointScanProxySummary other = (OdaPrivateEndpointScanProxySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.scanListenerType, other.scanListenerType)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.scanListenerInfos, other.scanListenerInfos)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerType == null ? 43 : this.scanListenerType.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerInfos == null ? 43 : this.scanListenerInfos.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
