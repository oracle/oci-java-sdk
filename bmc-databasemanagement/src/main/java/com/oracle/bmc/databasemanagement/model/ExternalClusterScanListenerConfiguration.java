/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a SCAN listener in an external cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalClusterScanListenerConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalClusterScanListenerConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scanName", "networkNumber", "scanPort", "scanProtocol"})
    public ExternalClusterScanListenerConfiguration(
            String scanName, Integer networkNumber, Integer scanPort, ScanProtocol scanProtocol) {
        super();
        this.scanName = scanName;
        this.networkNumber = networkNumber;
        this.scanPort = scanPort;
        this.scanProtocol = scanProtocol;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the SCAN listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanName")
        private String scanName;

        /**
         * The name of the SCAN listener.
         *
         * @param scanName the value to set
         * @return this builder
         */
        public Builder scanName(String scanName) {
            this.scanName = scanName;
            this.__explicitlySet__.add("scanName");
            return this;
        }
        /** The network number from which SCAN VIPs are obtained. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkNumber")
        private Integer networkNumber;

        /**
         * The network number from which SCAN VIPs are obtained.
         *
         * @param networkNumber the value to set
         * @return this builder
         */
        public Builder networkNumber(Integer networkNumber) {
            this.networkNumber = networkNumber;
            this.__explicitlySet__.add("networkNumber");
            return this;
        }
        /** The port number of the SCAN listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanPort")
        private Integer scanPort;

        /**
         * The port number of the SCAN listener.
         *
         * @param scanPort the value to set
         * @return this builder
         */
        public Builder scanPort(Integer scanPort) {
            this.scanPort = scanPort;
            this.__explicitlySet__.add("scanPort");
            return this;
        }
        /** The protocol of the SCAN listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanProtocol")
        private ScanProtocol scanProtocol;

        /**
         * The protocol of the SCAN listener.
         *
         * @param scanProtocol the value to set
         * @return this builder
         */
        public Builder scanProtocol(ScanProtocol scanProtocol) {
            this.scanProtocol = scanProtocol;
            this.__explicitlySet__.add("scanProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalClusterScanListenerConfiguration build() {
            ExternalClusterScanListenerConfiguration model =
                    new ExternalClusterScanListenerConfiguration(
                            this.scanName, this.networkNumber, this.scanPort, this.scanProtocol);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalClusterScanListenerConfiguration model) {
            if (model.wasPropertyExplicitlySet("scanName")) {
                this.scanName(model.getScanName());
            }
            if (model.wasPropertyExplicitlySet("networkNumber")) {
                this.networkNumber(model.getNetworkNumber());
            }
            if (model.wasPropertyExplicitlySet("scanPort")) {
                this.scanPort(model.getScanPort());
            }
            if (model.wasPropertyExplicitlySet("scanProtocol")) {
                this.scanProtocol(model.getScanProtocol());
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

    /** The name of the SCAN listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanName")
    private final String scanName;

    /**
     * The name of the SCAN listener.
     *
     * @return the value
     */
    public String getScanName() {
        return scanName;
    }

    /** The network number from which SCAN VIPs are obtained. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkNumber")
    private final Integer networkNumber;

    /**
     * The network number from which SCAN VIPs are obtained.
     *
     * @return the value
     */
    public Integer getNetworkNumber() {
        return networkNumber;
    }

    /** The port number of the SCAN listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanPort")
    private final Integer scanPort;

    /**
     * The port number of the SCAN listener.
     *
     * @return the value
     */
    public Integer getScanPort() {
        return scanPort;
    }

    /** The protocol of the SCAN listener. */
    public enum ScanProtocol implements com.oracle.bmc.http.internal.BmcEnum {
        Tcp("TCP"),
        Tcps("TCPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScanProtocol.class);

        private final String value;
        private static java.util.Map<String, ScanProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (ScanProtocol v : ScanProtocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScanProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScanProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScanProtocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The protocol of the SCAN listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanProtocol")
    private final ScanProtocol scanProtocol;

    /**
     * The protocol of the SCAN listener.
     *
     * @return the value
     */
    public ScanProtocol getScanProtocol() {
        return scanProtocol;
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
        sb.append("ExternalClusterScanListenerConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("scanName=").append(String.valueOf(this.scanName));
        sb.append(", networkNumber=").append(String.valueOf(this.networkNumber));
        sb.append(", scanPort=").append(String.valueOf(this.scanPort));
        sb.append(", scanProtocol=").append(String.valueOf(this.scanProtocol));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalClusterScanListenerConfiguration)) {
            return false;
        }

        ExternalClusterScanListenerConfiguration other =
                (ExternalClusterScanListenerConfiguration) o;
        return java.util.Objects.equals(this.scanName, other.scanName)
                && java.util.Objects.equals(this.networkNumber, other.networkNumber)
                && java.util.Objects.equals(this.scanPort, other.scanPort)
                && java.util.Objects.equals(this.scanProtocol, other.scanProtocol)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scanName == null ? 43 : this.scanName.hashCode());
        result =
                (result * PRIME)
                        + (this.networkNumber == null ? 43 : this.networkNumber.hashCode());
        result = (result * PRIME) + (this.scanPort == null ? 43 : this.scanPort.hashCode());
        result = (result * PRIME) + (this.scanProtocol == null ? 43 : this.scanProtocol.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
