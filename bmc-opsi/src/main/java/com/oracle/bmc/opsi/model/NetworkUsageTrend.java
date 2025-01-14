/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data samples. <br>
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
        builder = NetworkUsageTrend.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkUsageTrend
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "endTimestamp",
        "allNetworkReadInMbps",
        "allNetworkWriteInMbps",
        "allNetworkIoInMbps"
    })
    public NetworkUsageTrend(
            java.util.Date endTimestamp,
            Double allNetworkReadInMbps,
            Double allNetworkWriteInMbps,
            Double allNetworkIoInMbps) {
        super();
        this.endTimestamp = endTimestamp;
        this.allNetworkReadInMbps = allNetworkReadInMbps;
        this.allNetworkWriteInMbps = allNetworkWriteInMbps;
        this.allNetworkIoInMbps = allNetworkIoInMbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The timestamp in which the current sampling period ends in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         *
         * @param endTimestamp the value to set
         * @return this builder
         */
        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }
        /** Network read in Mbps. */
        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkReadInMbps")
        private Double allNetworkReadInMbps;

        /**
         * Network read in Mbps.
         *
         * @param allNetworkReadInMbps the value to set
         * @return this builder
         */
        public Builder allNetworkReadInMbps(Double allNetworkReadInMbps) {
            this.allNetworkReadInMbps = allNetworkReadInMbps;
            this.__explicitlySet__.add("allNetworkReadInMbps");
            return this;
        }
        /** Network write in Mbps. */
        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkWriteInMbps")
        private Double allNetworkWriteInMbps;

        /**
         * Network write in Mbps.
         *
         * @param allNetworkWriteInMbps the value to set
         * @return this builder
         */
        public Builder allNetworkWriteInMbps(Double allNetworkWriteInMbps) {
            this.allNetworkWriteInMbps = allNetworkWriteInMbps;
            this.__explicitlySet__.add("allNetworkWriteInMbps");
            return this;
        }
        /** Network input/output in Mbps. */
        @com.fasterxml.jackson.annotation.JsonProperty("allNetworkIoInMbps")
        private Double allNetworkIoInMbps;

        /**
         * Network input/output in Mbps.
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

        public NetworkUsageTrend build() {
            NetworkUsageTrend model =
                    new NetworkUsageTrend(
                            this.endTimestamp,
                            this.allNetworkReadInMbps,
                            this.allNetworkWriteInMbps,
                            this.allNetworkIoInMbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkUsageTrend model) {
            if (model.wasPropertyExplicitlySet("endTimestamp")) {
                this.endTimestamp(model.getEndTimestamp());
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

    /** The timestamp in which the current sampling period ends in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    private final java.util.Date endTimestamp;

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /** Network read in Mbps. */
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkReadInMbps")
    private final Double allNetworkReadInMbps;

    /**
     * Network read in Mbps.
     *
     * @return the value
     */
    public Double getAllNetworkReadInMbps() {
        return allNetworkReadInMbps;
    }

    /** Network write in Mbps. */
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkWriteInMbps")
    private final Double allNetworkWriteInMbps;

    /**
     * Network write in Mbps.
     *
     * @return the value
     */
    public Double getAllNetworkWriteInMbps() {
        return allNetworkWriteInMbps;
    }

    /** Network input/output in Mbps. */
    @com.fasterxml.jackson.annotation.JsonProperty("allNetworkIoInMbps")
    private final Double allNetworkIoInMbps;

    /**
     * Network input/output in Mbps.
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
        sb.append("NetworkUsageTrend(");
        sb.append("super=").append(super.toString());
        sb.append("endTimestamp=").append(String.valueOf(this.endTimestamp));
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
        if (!(o instanceof NetworkUsageTrend)) {
            return false;
        }

        NetworkUsageTrend other = (NetworkUsageTrend) o;
        return java.util.Objects.equals(this.endTimestamp, other.endTimestamp)
                && java.util.Objects.equals(this.allNetworkReadInMbps, other.allNetworkReadInMbps)
                && java.util.Objects.equals(this.allNetworkWriteInMbps, other.allNetworkWriteInMbps)
                && java.util.Objects.equals(this.allNetworkIoInMbps, other.allNetworkIoInMbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endTimestamp == null ? 43 : this.endTimestamp.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
