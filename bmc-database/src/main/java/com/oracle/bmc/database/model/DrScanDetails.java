/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Single Client Access Name (SCAN) details for Disaster recovery network.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrScanDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DrScanDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostname", "scanListenerPortTcp", "ips"})
    public DrScanDetails(String hostname, Integer scanListenerPortTcp, java.util.List<String> ips) {
        super();
        this.hostname = hostname;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.ips = ips;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Disaster recovery SCAN hostname.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The Disaster recovery SCAN hostname.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The Disaster recovery SCAN TCPIP port. Default is 1521.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
        private Integer scanListenerPortTcp;

        /**
         * The Disaster recovery SCAN TCPIP port. Default is 1521.
         * @param scanListenerPortTcp the value to set
         * @return this builder
         **/
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = scanListenerPortTcp;
            this.__explicitlySet__.add("scanListenerPortTcp");
            return this;
        }
        /**
         * The list of Disaster recovery SCAN IP addresses. Three addresses should be provided.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ips")
        private java.util.List<String> ips;

        /**
         * The list of Disaster recovery SCAN IP addresses. Three addresses should be provided.
         * @param ips the value to set
         * @return this builder
         **/
        public Builder ips(java.util.List<String> ips) {
            this.ips = ips;
            this.__explicitlySet__.add("ips");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrScanDetails build() {
            DrScanDetails model =
                    new DrScanDetails(this.hostname, this.scanListenerPortTcp, this.ips);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrScanDetails model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcp")) {
                this.scanListenerPortTcp(model.getScanListenerPortTcp());
            }
            if (model.wasPropertyExplicitlySet("ips")) {
                this.ips(model.getIps());
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
     * The Disaster recovery SCAN hostname.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The Disaster recovery SCAN hostname.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The Disaster recovery SCAN TCPIP port. Default is 1521.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
    private final Integer scanListenerPortTcp;

    /**
     * The Disaster recovery SCAN TCPIP port. Default is 1521.
     * @return the value
     **/
    public Integer getScanListenerPortTcp() {
        return scanListenerPortTcp;
    }

    /**
     * The list of Disaster recovery SCAN IP addresses. Three addresses should be provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ips")
    private final java.util.List<String> ips;

    /**
     * The list of Disaster recovery SCAN IP addresses. Three addresses should be provided.
     * @return the value
     **/
    public java.util.List<String> getIps() {
        return ips;
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
        sb.append("DrScanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", ips=").append(String.valueOf(this.ips));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrScanDetails)) {
            return false;
        }

        DrScanDetails other = (DrScanDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(this.ips, other.ips)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcp == null
                                ? 43
                                : this.scanListenerPortTcp.hashCode());
        result = (result * PRIME) + (this.ips == null ? 43 : this.ips.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
