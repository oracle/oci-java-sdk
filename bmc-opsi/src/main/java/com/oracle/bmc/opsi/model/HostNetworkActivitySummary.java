/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Network Activity Summary metric for the host <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HostNetworkActivitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostNetworkActivitySummary extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Name of the network interface */
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
        private String interfaceName;

        /**
         * Name of the network interface
         *
         * @param interfaceName the value to set
         * @return this builder
         */
        public Builder interfaceName(String interfaceName) {
            this.interfaceName = interfaceName;
            this.__explicitlySet__.add("interfaceName");
            return this;
        }
        /** All network interfaces read rate in Mbps */
        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkReadInMbps")
        private Double allNetworkReadInMbps;

        /**
         * All network interfaces read rate in Mbps
         *
         * @param allNetworkReadInMbps the value to set
         * @return this builder
         */
        public Builder allNetworkReadInMbps(Double allNetworkReadInMbps) {
            this.allNetworkReadInMbps = allNetworkReadInMbps;
            this.__explicitlySet__.add("allNetworkReadInMbps");
            return this;
        }
        /** All network interfaces write rate in Mbps */
        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkWriteInMbps")
        private Double allNetworkWriteInMbps;

        /**
         * All network interfaces write rate in Mbps
         *
         * @param allNetworkWriteInMbps the value to set
         * @return this builder
         */
        public Builder allNetworkWriteInMbps(Double allNetworkWriteInMbps) {
            this.allNetworkWriteInMbps = allNetworkWriteInMbps;
            this.__explicitlySet__.add("allNetworkWriteInMbps");
            return this;
        }
        /** All network interfaces IO rate in Mbps */
        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkIoInMbps")
        private Double allNetworkIoInMbps;

        /**
         * All network interfaces IO rate in Mbps
         *
         * @param allNetworkIoInMbps the value to set
         * @return this builder
         */
        public Builder allNetworkIoInMbps(Double allNetworkIoInMbps) {
            this.allNetworkIoInMbps = allNetworkIoInMbps;
            this.__explicitlySet__.add("allNetworkIoInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostNetworkActivitySummary build() {
            HostNetworkActivitySummary model =
                    new HostNetworkActivitySummary(
                            this.timeCollected,
                            this.interfaceName,
                            this.allNetworkReadInMbps,
                            this.allNetworkWriteInMbps,
                            this.allNetworkIoInMbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostNetworkActivitySummary model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("interfaceName")) {
                this.interfaceName(model.getInterfaceName());
            }
            if (model.wasPropertyExplicitlySet("allNetworkReadInMbps")) {
                this.allNetworkReadInMbps(model.getAllNetworkReadInMbps());
            }
            if (model.wasPropertyExplicitlySet("allNetworkWriteInMbps")) {
                this.allNetworkWriteInMbps(model.getAllNetworkWriteInMbps());
            }
            if (model.wasPropertyExplicitlySet("allNetworkIoInMbps")) {
                this.allNetworkIoInMbps(model.getAllNetworkIoInMbps());
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

    @Deprecated
    public HostNetworkActivitySummary(
            java.util.Date timeCollected,
            String interfaceName,
            Double allNetworkReadInMbps,
            Double allNetworkWriteInMbps,
            Double allNetworkIoInMbps) {
        super(timeCollected);
        this.interfaceName = interfaceName;
        this.allNetworkReadInMbps = allNetworkReadInMbps;
        this.allNetworkWriteInMbps = allNetworkWriteInMbps;
        this.allNetworkIoInMbps = allNetworkIoInMbps;
    }

    /** Name of the network interface */
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceName")
    private final String interfaceName;

    /**
     * Name of the network interface
     *
     * @return the value
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /** All network interfaces read rate in Mbps */
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkReadInMbps")
    private final Double allNetworkReadInMbps;

    /**
     * All network interfaces read rate in Mbps
     *
     * @return the value
     */
    public Double getAllNetworkReadInMbps() {
        return allNetworkReadInMbps;
    }

    /** All network interfaces write rate in Mbps */
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkWriteInMbps")
    private final Double allNetworkWriteInMbps;

    /**
     * All network interfaces write rate in Mbps
     *
     * @return the value
     */
    public Double getAllNetworkWriteInMbps() {
        return allNetworkWriteInMbps;
    }

    /** All network interfaces IO rate in Mbps */
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkIoInMbps")
    private final Double allNetworkIoInMbps;

    /**
     * All network interfaces IO rate in Mbps
     *
     * @return the value
     */
    public Double getAllNetworkIoInMbps() {
        return allNetworkIoInMbps;
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
        sb.append("HostNetworkActivitySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", interfaceName=").append(String.valueOf(this.interfaceName));
        sb.append(", allNetworkReadInMbps=").append(String.valueOf(this.allNetworkReadInMbps));
        sb.append(", allNetworkWriteInMbps=").append(String.valueOf(this.allNetworkWriteInMbps));
        sb.append(", allNetworkIoInMbps=").append(String.valueOf(this.allNetworkIoInMbps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostNetworkActivitySummary)) {
            return false;
        }

        HostNetworkActivitySummary other = (HostNetworkActivitySummary) o;
        return java.util.Objects.equals(this.interfaceName, other.interfaceName)
                && java.util.Objects.equals(this.allNetworkReadInMbps, other.allNetworkReadInMbps)
                && java.util.Objects.equals(this.allNetworkWriteInMbps, other.allNetworkWriteInMbps)
                && java.util.Objects.equals(this.allNetworkIoInMbps, other.allNetworkIoInMbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.interfaceName == null ? 43 : this.interfaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.allNetworkReadInMbps == null
                                ? 43
                                : this.allNetworkReadInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.allNetworkWriteInMbps == null
                                ? 43
                                : this.allNetworkWriteInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.allNetworkIoInMbps == null
                                ? 43
                                : this.allNetworkIoInMbps.hashCode());
        return result;
    }
}
