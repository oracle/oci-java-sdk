/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Customer's Real Application Cluster (RAC)'s SCAN listener FQDN, port or list IPs and their ports.
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScanListenerInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScanListenerInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scanListenerFqdn", "scanListenerIp", "scanListenerPort"})
    public ScanListenerInfo(
            String scanListenerFqdn, String scanListenerIp, Integer scanListenerPort) {
        super();
        this.scanListenerFqdn = scanListenerFqdn;
        this.scanListenerIp = scanListenerIp;
        this.scanListenerPort = scanListenerPort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** FQDN of the customer's Real Application Cluster (RAC)'s SCAN listeners. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerFqdn")
        private String scanListenerFqdn;

        /**
         * FQDN of the customer's Real Application Cluster (RAC)'s SCAN listeners.
         *
         * @param scanListenerFqdn the value to set
         * @return this builder
         */
        public Builder scanListenerFqdn(String scanListenerFqdn) {
            this.scanListenerFqdn = scanListenerFqdn;
            this.__explicitlySet__.add("scanListenerFqdn");
            return this;
        }
        /** A SCAN listener's IP of the customer's Real Application Cluster (RAC). */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerIp")
        private String scanListenerIp;

        /**
         * A SCAN listener's IP of the customer's Real Application Cluster (RAC).
         *
         * @param scanListenerIp the value to set
         * @return this builder
         */
        public Builder scanListenerIp(String scanListenerIp) {
            this.scanListenerIp = scanListenerIp;
            this.__explicitlySet__.add("scanListenerIp");
            return this;
        }
        /**
         * The port that customer's Real Application Cluster (RAC)'s SCAN listeners are listening
         * on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPort")
        private Integer scanListenerPort;

        /**
         * The port that customer's Real Application Cluster (RAC)'s SCAN listeners are listening
         * on.
         *
         * @param scanListenerPort the value to set
         * @return this builder
         */
        public Builder scanListenerPort(Integer scanListenerPort) {
            this.scanListenerPort = scanListenerPort;
            this.__explicitlySet__.add("scanListenerPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScanListenerInfo build() {
            ScanListenerInfo model =
                    new ScanListenerInfo(
                            this.scanListenerFqdn, this.scanListenerIp, this.scanListenerPort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScanListenerInfo model) {
            if (model.wasPropertyExplicitlySet("scanListenerFqdn")) {
                this.scanListenerFqdn(model.getScanListenerFqdn());
            }
            if (model.wasPropertyExplicitlySet("scanListenerIp")) {
                this.scanListenerIp(model.getScanListenerIp());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPort")) {
                this.scanListenerPort(model.getScanListenerPort());
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

    /** FQDN of the customer's Real Application Cluster (RAC)'s SCAN listeners. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerFqdn")
    private final String scanListenerFqdn;

    /**
     * FQDN of the customer's Real Application Cluster (RAC)'s SCAN listeners.
     *
     * @return the value
     */
    public String getScanListenerFqdn() {
        return scanListenerFqdn;
    }

    /** A SCAN listener's IP of the customer's Real Application Cluster (RAC). */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerIp")
    private final String scanListenerIp;

    /**
     * A SCAN listener's IP of the customer's Real Application Cluster (RAC).
     *
     * @return the value
     */
    public String getScanListenerIp() {
        return scanListenerIp;
    }

    /**
     * The port that customer's Real Application Cluster (RAC)'s SCAN listeners are listening on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPort")
    private final Integer scanListenerPort;

    /**
     * The port that customer's Real Application Cluster (RAC)'s SCAN listeners are listening on.
     *
     * @return the value
     */
    public Integer getScanListenerPort() {
        return scanListenerPort;
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
        sb.append("ScanListenerInfo(");
        sb.append("super=").append(super.toString());
        sb.append("scanListenerFqdn=").append(String.valueOf(this.scanListenerFqdn));
        sb.append(", scanListenerIp=").append(String.valueOf(this.scanListenerIp));
        sb.append(", scanListenerPort=").append(String.valueOf(this.scanListenerPort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScanListenerInfo)) {
            return false;
        }

        ScanListenerInfo other = (ScanListenerInfo) o;
        return java.util.Objects.equals(this.scanListenerFqdn, other.scanListenerFqdn)
                && java.util.Objects.equals(this.scanListenerIp, other.scanListenerIp)
                && java.util.Objects.equals(this.scanListenerPort, other.scanListenerPort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scanListenerFqdn == null ? 43 : this.scanListenerFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerIp == null ? 43 : this.scanListenerIp.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPort == null ? 43 : this.scanListenerPort.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
