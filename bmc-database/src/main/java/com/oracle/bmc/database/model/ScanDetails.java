/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Single Client Access Name (SCAN) details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScanDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ScanDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostname",
        "port",
        "scanListenerPortTcp",
        "scanListenerPortTcpSsl",
        "ips"
    })
    public ScanDetails(
            String hostname,
            Integer port,
            Integer scanListenerPortTcp,
            Integer scanListenerPortTcpSsl,
            java.util.List<String> ips) {
        super();
        this.hostname = hostname;
        this.port = port;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.ips = ips;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The SCAN hostname. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The SCAN hostname.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The SCAN TCPIP port. Default is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The SCAN TCPIP port. Default is 1521.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The SCAN TCPIP port. Default is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
        private Integer scanListenerPortTcp;

        /**
         * The SCAN TCPIP port. Default is 1521.
         *
         * @param scanListenerPortTcp the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = scanListenerPortTcp;
            this.__explicitlySet__.add("scanListenerPortTcp");
            return this;
        }
        /** The SCAN TCPIP SSL port. Default is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
        private Integer scanListenerPortTcpSsl;

        /**
         * The SCAN TCPIP SSL port. Default is 2484.
         *
         * @param scanListenerPortTcpSsl the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            this.__explicitlySet__.add("scanListenerPortTcpSsl");
            return this;
        }
        /** The list of SCAN IP addresses. Three addresses should be provided. */
        @com.fasterxml.jackson.annotation.JsonProperty("ips")
        private java.util.List<String> ips;

        /**
         * The list of SCAN IP addresses. Three addresses should be provided.
         *
         * @param ips the value to set
         * @return this builder
         */
        public Builder ips(java.util.List<String> ips) {
            this.ips = ips;
            this.__explicitlySet__.add("ips");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScanDetails build() {
            ScanDetails model =
                    new ScanDetails(
                            this.hostname,
                            this.port,
                            this.scanListenerPortTcp,
                            this.scanListenerPortTcpSsl,
                            this.ips);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScanDetails model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcp")) {
                this.scanListenerPortTcp(model.getScanListenerPortTcp());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcpSsl")) {
                this.scanListenerPortTcpSsl(model.getScanListenerPortTcpSsl());
            }
            if (model.wasPropertyExplicitlySet("ips")) {
                this.ips(model.getIps());
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

    /** The SCAN hostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The SCAN hostname.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The SCAN TCPIP port. Default is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The SCAN TCPIP port. Default is 1521.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** The SCAN TCPIP port. Default is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
    private final Integer scanListenerPortTcp;

    /**
     * The SCAN TCPIP port. Default is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcp() {
        return scanListenerPortTcp;
    }

    /** The SCAN TCPIP SSL port. Default is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
    private final Integer scanListenerPortTcpSsl;

    /**
     * The SCAN TCPIP SSL port. Default is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcpSsl() {
        return scanListenerPortTcpSsl;
    }

    /** The list of SCAN IP addresses. Three addresses should be provided. */
    @com.fasterxml.jackson.annotation.JsonProperty("ips")
    private final java.util.List<String> ips;

    /**
     * The list of SCAN IP addresses. Three addresses should be provided.
     *
     * @return the value
     */
    public java.util.List<String> getIps() {
        return ips;
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
        sb.append("ScanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", scanListenerPortTcpSsl=").append(String.valueOf(this.scanListenerPortTcpSsl));
        sb.append(", ips=").append(String.valueOf(this.ips));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScanDetails)) {
            return false;
        }

        ScanDetails other = (ScanDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(
                        this.scanListenerPortTcpSsl, other.scanListenerPortTcpSsl)
                && java.util.Objects.equals(this.ips, other.ips)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcp == null
                                ? 43
                                : this.scanListenerPortTcp.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcpSsl == null
                                ? 43
                                : this.scanListenerPortTcpSsl.hashCode());
        result = (result * PRIME) + (this.ips == null ? 43 : this.ips.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
