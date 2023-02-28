/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A summary of the IPSec tunnel security association details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TunnelSecurityAssociationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TunnelSecurityAssociationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpeSubnet",
        "oracleSubnet",
        "tunnelSaStatus",
        "tunnelSaErrorInfo",
        "time"
    })
    public TunnelSecurityAssociationSummary(
            String cpeSubnet,
            String oracleSubnet,
            TunnelSaStatus tunnelSaStatus,
            String tunnelSaErrorInfo,
            String time) {
        super();
        this.cpeSubnet = cpeSubnet;
        this.oracleSubnet = oracleSubnet;
        this.tunnelSaStatus = tunnelSaStatus;
        this.tunnelSaErrorInfo = tunnelSaErrorInfo;
        this.time = time;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IP address and mask of the partner subnet used in policy based VPNs or static routes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeSubnet")
        private String cpeSubnet;

        /**
         * The IP address and mask of the partner subnet used in policy based VPNs or static routes.
         *
         * @param cpeSubnet the value to set
         * @return this builder
         */
        public Builder cpeSubnet(String cpeSubnet) {
            this.cpeSubnet = cpeSubnet;
            this.__explicitlySet__.add("cpeSubnet");
            return this;
        }
        /**
         * The IP address and mask of the local subnet used in policy based VPNs or static routes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleSubnet")
        private String oracleSubnet;

        /**
         * The IP address and mask of the local subnet used in policy based VPNs or static routes.
         *
         * @param oracleSubnet the value to set
         * @return this builder
         */
        public Builder oracleSubnet(String oracleSubnet) {
            this.oracleSubnet = oracleSubnet;
            this.__explicitlySet__.add("oracleSubnet");
            return this;
        }
        /** The IPSec tunnel's phase one status. */
        @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaStatus")
        private TunnelSaStatus tunnelSaStatus;

        /**
         * The IPSec tunnel's phase one status.
         *
         * @param tunnelSaStatus the value to set
         * @return this builder
         */
        public Builder tunnelSaStatus(TunnelSaStatus tunnelSaStatus) {
            this.tunnelSaStatus = tunnelSaStatus;
            this.__explicitlySet__.add("tunnelSaStatus");
            return this;
        }
        /**
         * Current state if the IPSec tunnel status is not {@code UP}, including phase one and phase
         * two details and a possible reason the tunnel is not {@code UP}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaErrorInfo")
        private String tunnelSaErrorInfo;

        /**
         * Current state if the IPSec tunnel status is not {@code UP}, including phase one and phase
         * two details and a possible reason the tunnel is not {@code UP}.
         *
         * @param tunnelSaErrorInfo the value to set
         * @return this builder
         */
        public Builder tunnelSaErrorInfo(String tunnelSaErrorInfo) {
            this.tunnelSaErrorInfo = tunnelSaErrorInfo;
            this.__explicitlySet__.add("tunnelSaErrorInfo");
            return this;
        }
        /** Time in the current state, in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private String time;

        /**
         * Time in the current state, in seconds.
         *
         * @param time the value to set
         * @return this builder
         */
        public Builder time(String time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TunnelSecurityAssociationSummary build() {
            TunnelSecurityAssociationSummary model =
                    new TunnelSecurityAssociationSummary(
                            this.cpeSubnet,
                            this.oracleSubnet,
                            this.tunnelSaStatus,
                            this.tunnelSaErrorInfo,
                            this.time);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelSecurityAssociationSummary model) {
            if (model.wasPropertyExplicitlySet("cpeSubnet")) {
                this.cpeSubnet(model.getCpeSubnet());
            }
            if (model.wasPropertyExplicitlySet("oracleSubnet")) {
                this.oracleSubnet(model.getOracleSubnet());
            }
            if (model.wasPropertyExplicitlySet("tunnelSaStatus")) {
                this.tunnelSaStatus(model.getTunnelSaStatus());
            }
            if (model.wasPropertyExplicitlySet("tunnelSaErrorInfo")) {
                this.tunnelSaErrorInfo(model.getTunnelSaErrorInfo());
            }
            if (model.wasPropertyExplicitlySet("time")) {
                this.time(model.getTime());
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

    /** The IP address and mask of the partner subnet used in policy based VPNs or static routes. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeSubnet")
    private final String cpeSubnet;

    /**
     * The IP address and mask of the partner subnet used in policy based VPNs or static routes.
     *
     * @return the value
     */
    public String getCpeSubnet() {
        return cpeSubnet;
    }

    /** The IP address and mask of the local subnet used in policy based VPNs or static routes. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleSubnet")
    private final String oracleSubnet;

    /**
     * The IP address and mask of the local subnet used in policy based VPNs or static routes.
     *
     * @return the value
     */
    public String getOracleSubnet() {
        return oracleSubnet;
    }

    /** The IPSec tunnel's phase one status. */
    public enum TunnelSaStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Initiating("INITIATING"),
        Listening("LISTENING"),
        Up("UP"),
        Down("DOWN"),
        Error("ERROR"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TunnelSaStatus.class);

        private final String value;
        private static java.util.Map<String, TunnelSaStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (TunnelSaStatus v : TunnelSaStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TunnelSaStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TunnelSaStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TunnelSaStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The IPSec tunnel's phase one status. */
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaStatus")
    private final TunnelSaStatus tunnelSaStatus;

    /**
     * The IPSec tunnel's phase one status.
     *
     * @return the value
     */
    public TunnelSaStatus getTunnelSaStatus() {
        return tunnelSaStatus;
    }

    /**
     * Current state if the IPSec tunnel status is not {@code UP}, including phase one and phase two
     * details and a possible reason the tunnel is not {@code UP}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaErrorInfo")
    private final String tunnelSaErrorInfo;

    /**
     * Current state if the IPSec tunnel status is not {@code UP}, including phase one and phase two
     * details and a possible reason the tunnel is not {@code UP}.
     *
     * @return the value
     */
    public String getTunnelSaErrorInfo() {
        return tunnelSaErrorInfo;
    }

    /** Time in the current state, in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final String time;

    /**
     * Time in the current state, in seconds.
     *
     * @return the value
     */
    public String getTime() {
        return time;
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
        sb.append("TunnelSecurityAssociationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("cpeSubnet=").append(String.valueOf(this.cpeSubnet));
        sb.append(", oracleSubnet=").append(String.valueOf(this.oracleSubnet));
        sb.append(", tunnelSaStatus=").append(String.valueOf(this.tunnelSaStatus));
        sb.append(", tunnelSaErrorInfo=").append(String.valueOf(this.tunnelSaErrorInfo));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TunnelSecurityAssociationSummary)) {
            return false;
        }

        TunnelSecurityAssociationSummary other = (TunnelSecurityAssociationSummary) o;
        return java.util.Objects.equals(this.cpeSubnet, other.cpeSubnet)
                && java.util.Objects.equals(this.oracleSubnet, other.oracleSubnet)
                && java.util.Objects.equals(this.tunnelSaStatus, other.tunnelSaStatus)
                && java.util.Objects.equals(this.tunnelSaErrorInfo, other.tunnelSaErrorInfo)
                && java.util.Objects.equals(this.time, other.time)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpeSubnet == null ? 43 : this.cpeSubnet.hashCode());
        result = (result * PRIME) + (this.oracleSubnet == null ? 43 : this.oracleSubnet.hashCode());
        result =
                (result * PRIME)
                        + (this.tunnelSaStatus == null ? 43 : this.tunnelSaStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.tunnelSaErrorInfo == null ? 43 : this.tunnelSaErrorInfo.hashCode());
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
