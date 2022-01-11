/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Detailed Tunnel SA
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TunnelSecurityAssociationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TunnelSecurityAssociationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cpeSubnet")
        private String cpeSubnet;

        public Builder cpeSubnet(String cpeSubnet) {
            this.cpeSubnet = cpeSubnet;
            this.__explicitlySet__.add("cpeSubnet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleSubnet")
        private String oracleSubnet;

        public Builder oracleSubnet(String oracleSubnet) {
            this.oracleSubnet = oracleSubnet;
            this.__explicitlySet__.add("oracleSubnet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaStatus")
        private TunnelSaStatus tunnelSaStatus;

        public Builder tunnelSaStatus(TunnelSaStatus tunnelSaStatus) {
            this.tunnelSaStatus = tunnelSaStatus;
            this.__explicitlySet__.add("tunnelSaStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaErrorInfo")
        private String tunnelSaErrorInfo;

        public Builder tunnelSaErrorInfo(String tunnelSaErrorInfo) {
            this.tunnelSaErrorInfo = tunnelSaErrorInfo;
            this.__explicitlySet__.add("tunnelSaErrorInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private String time;

        public Builder time(String time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TunnelSecurityAssociationSummary build() {
            TunnelSecurityAssociationSummary __instance__ =
                    new TunnelSecurityAssociationSummary(
                            cpeSubnet, oracleSubnet, tunnelSaStatus, tunnelSaErrorInfo, time);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelSecurityAssociationSummary o) {
            Builder copiedBuilder =
                    cpeSubnet(o.getCpeSubnet())
                            .oracleSubnet(o.getOracleSubnet())
                            .tunnelSaStatus(o.getTunnelSaStatus())
                            .tunnelSaErrorInfo(o.getTunnelSaErrorInfo())
                            .time(o.getTime());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * IP and mask of the Partner Subnet for Policy Based VPNs or Static Routes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeSubnet")
    String cpeSubnet;

    /**
     * IP and mask of the Local Subnet for Policy Based VPNs or Static Routes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleSubnet")
    String oracleSubnet;
    /**
     * Phase 1 Status of the Tunnel
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TunnelSaStatus {
        Initiating("INITIATING"),
        Listening("LISTENING"),
        Up("UP"),
        Down("DOWN"),
        Error("ERROR"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Phase 1 Status of the Tunnel
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaStatus")
    TunnelSaStatus tunnelSaStatus;

    /**
     * Current state if status is not up, including phase1/phase2 and possible reason for tunnel not up
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tunnelSaErrorInfo")
    String tunnelSaErrorInfo;

    /**
     * Seconds in current state
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    String time;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
