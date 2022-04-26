/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * This resource contains the rules governing what traffic a VTAP mirrors.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VtapCaptureFilterRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VtapCaptureFilterRuleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("trafficDirection")
        private TrafficDirection trafficDirection;

        public Builder trafficDirection(TrafficDirection trafficDirection) {
            this.trafficDirection = trafficDirection;
            this.__explicitlySet__.add("trafficDirection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleAction")
        private RuleAction ruleAction;

        public Builder ruleAction(RuleAction ruleAction) {
            this.ruleAction = ruleAction;
            this.__explicitlySet__.add("ruleAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceCidr")
        private String sourceCidr;

        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            this.__explicitlySet__.add("sourceCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationCidr")
        private String destinationCidr;

        public Builder destinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            this.__explicitlySet__.add("destinationCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
        private IcmpOptions icmpOptions;

        public Builder icmpOptions(IcmpOptions icmpOptions) {
            this.icmpOptions = icmpOptions;
            this.__explicitlySet__.add("icmpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
        private TcpOptions tcpOptions;

        public Builder tcpOptions(TcpOptions tcpOptions) {
            this.tcpOptions = tcpOptions;
            this.__explicitlySet__.add("tcpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
        private UdpOptions udpOptions;

        public Builder udpOptions(UdpOptions udpOptions) {
            this.udpOptions = udpOptions;
            this.__explicitlySet__.add("udpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VtapCaptureFilterRuleDetails build() {
            VtapCaptureFilterRuleDetails __instance__ =
                    new VtapCaptureFilterRuleDetails(
                            trafficDirection,
                            ruleAction,
                            sourceCidr,
                            destinationCidr,
                            protocol,
                            icmpOptions,
                            tcpOptions,
                            udpOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VtapCaptureFilterRuleDetails o) {
            Builder copiedBuilder =
                    trafficDirection(o.getTrafficDirection())
                            .ruleAction(o.getRuleAction())
                            .sourceCidr(o.getSourceCidr())
                            .destinationCidr(o.getDestinationCidr())
                            .protocol(o.getProtocol())
                            .icmpOptions(o.getIcmpOptions())
                            .tcpOptions(o.getTcpOptions())
                            .udpOptions(o.getUdpOptions());

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
     * The traffic direction the VTAP is configured to mirror.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TrafficDirection {
        Ingress("INGRESS"),
        Egress("EGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TrafficDirection> map;

        static {
            map = new java.util.HashMap<>();
            for (TrafficDirection v : TrafficDirection.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TrafficDirection(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrafficDirection create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TrafficDirection', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The traffic direction the VTAP is configured to mirror.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficDirection")
    TrafficDirection trafficDirection;
    /**
     * Include or exclude packets meeting this definition from mirrored traffic.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RuleAction {
        Include("INCLUDE"),
        Exclude("EXCLUDE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RuleAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RuleAction v : RuleAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RuleAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuleAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RuleAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Include or exclude packets meeting this definition from mirrored traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleAction")
    RuleAction ruleAction;

    /**
     * Traffic from this CIDR block to the VTAP source will be mirrored to the VTAP target.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCidr")
    String sourceCidr;

    /**
     * Traffic sent to this CIDR block through the VTAP source will be mirrored to the VTAP target.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCidr")
    String destinationCidr;

    /**
     * The transport protocol used in the filter. If do not choose a protocol, all protocols will be used in the filter.
     * Supported options are:
     *   * 1 = ICMP
     *   * 6 = TCP
     *   * 17 = UDP
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    String protocol;

    @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
    IcmpOptions icmpOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
    TcpOptions tcpOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
    UdpOptions udpOptions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
