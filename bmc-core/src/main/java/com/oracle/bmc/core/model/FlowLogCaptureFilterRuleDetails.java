/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The set of rules governing what traffic the VCN flow log collects.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FlowLogCaptureFilterRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FlowLogCaptureFilterRuleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "priority",
        "samplingRate",
        "sourceCidr",
        "destinationCidr",
        "protocol",
        "icmpOptions",
        "tcpOptions",
        "udpOptions",
        "flowLogType",
        "ruleAction"
    })
    public FlowLogCaptureFilterRuleDetails(
            Boolean isEnabled,
            Integer priority,
            Integer samplingRate,
            String sourceCidr,
            String destinationCidr,
            String protocol,
            IcmpOptions icmpOptions,
            TcpOptions tcpOptions,
            UdpOptions udpOptions,
            FlowLogType flowLogType,
            RuleAction ruleAction) {
        super();
        this.isEnabled = isEnabled;
        this.priority = priority;
        this.samplingRate = samplingRate;
        this.sourceCidr = sourceCidr;
        this.destinationCidr = destinationCidr;
        this.protocol = protocol;
        this.icmpOptions = icmpOptions;
        this.tcpOptions = tcpOptions;
        this.udpOptions = udpOptions;
        this.flowLogType = flowLogType;
        this.ruleAction = ruleAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether a VCN flow log capture filter rule is enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether a VCN flow log capture filter rule is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * A lower number indicates a higher priority, range 0-9. Each rule must have a distinct priority.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * A lower number indicates a higher priority, range 0-9. Each rule must have a distinct priority.
         *
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * Sampling interval as {@code 1} of {@code X}, where {@code X} is an integer not greater than {@code 100000}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("samplingRate")
        private Integer samplingRate;

        /**
         * Sampling interval as {@code 1} of {@code X}, where {@code X} is an integer not greater than {@code 100000}.
         *
         * @param samplingRate the value to set
         * @return this builder
         **/
        public Builder samplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            this.__explicitlySet__.add("samplingRate");
            return this;
        }
        /**
         * Traffic from this CIDR will be captured in the VCN flow log.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceCidr")
        private String sourceCidr;

        /**
         * Traffic from this CIDR will be captured in the VCN flow log.
         *
         * @param sourceCidr the value to set
         * @return this builder
         **/
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            this.__explicitlySet__.add("sourceCidr");
            return this;
        }
        /**
         * Traffic to this CIDR will be captured in the VCN flow log.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCidr")
        private String destinationCidr;

        /**
         * Traffic to this CIDR will be captured in the VCN flow log.
         *
         * @param destinationCidr the value to set
         * @return this builder
         **/
        public Builder destinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            this.__explicitlySet__.add("destinationCidr");
            return this;
        }
        /**
         * The transport protocol the filter uses.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The transport protocol the filter uses.
         *
         * @param protocol the value to set
         * @return this builder
         **/
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
        /**
         * Type or types of VCN flow logs to store. {@code ALL} includes records for both accepted traffic and
         * rejected traffic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("flowLogType")
        private FlowLogType flowLogType;

        /**
         * Type or types of VCN flow logs to store. {@code ALL} includes records for both accepted traffic and
         * rejected traffic.
         *
         * @param flowLogType the value to set
         * @return this builder
         **/
        public Builder flowLogType(FlowLogType flowLogType) {
            this.flowLogType = flowLogType;
            this.__explicitlySet__.add("flowLogType");
            return this;
        }
        /**
         * Include or exclude a {@code ruleAction} object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleAction")
        private RuleAction ruleAction;

        /**
         * Include or exclude a {@code ruleAction} object.
         *
         * @param ruleAction the value to set
         * @return this builder
         **/
        public Builder ruleAction(RuleAction ruleAction) {
            this.ruleAction = ruleAction;
            this.__explicitlySet__.add("ruleAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlowLogCaptureFilterRuleDetails build() {
            FlowLogCaptureFilterRuleDetails model =
                    new FlowLogCaptureFilterRuleDetails(
                            this.isEnabled,
                            this.priority,
                            this.samplingRate,
                            this.sourceCidr,
                            this.destinationCidr,
                            this.protocol,
                            this.icmpOptions,
                            this.tcpOptions,
                            this.udpOptions,
                            this.flowLogType,
                            this.ruleAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlowLogCaptureFilterRuleDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("samplingRate")) {
                this.samplingRate(model.getSamplingRate());
            }
            if (model.wasPropertyExplicitlySet("sourceCidr")) {
                this.sourceCidr(model.getSourceCidr());
            }
            if (model.wasPropertyExplicitlySet("destinationCidr")) {
                this.destinationCidr(model.getDestinationCidr());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("icmpOptions")) {
                this.icmpOptions(model.getIcmpOptions());
            }
            if (model.wasPropertyExplicitlySet("tcpOptions")) {
                this.tcpOptions(model.getTcpOptions());
            }
            if (model.wasPropertyExplicitlySet("udpOptions")) {
                this.udpOptions(model.getUdpOptions());
            }
            if (model.wasPropertyExplicitlySet("flowLogType")) {
                this.flowLogType(model.getFlowLogType());
            }
            if (model.wasPropertyExplicitlySet("ruleAction")) {
                this.ruleAction(model.getRuleAction());
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
     * Indicates whether a VCN flow log capture filter rule is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether a VCN flow log capture filter rule is enabled.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * A lower number indicates a higher priority, range 0-9. Each rule must have a distinct priority.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * A lower number indicates a higher priority, range 0-9. Each rule must have a distinct priority.
     *
     * @return the value
     **/
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sampling interval as {@code 1} of {@code X}, where {@code X} is an integer not greater than {@code 100000}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("samplingRate")
    private final Integer samplingRate;

    /**
     * Sampling interval as {@code 1} of {@code X}, where {@code X} is an integer not greater than {@code 100000}.
     *
     * @return the value
     **/
    public Integer getSamplingRate() {
        return samplingRate;
    }

    /**
     * Traffic from this CIDR will be captured in the VCN flow log.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCidr")
    private final String sourceCidr;

    /**
     * Traffic from this CIDR will be captured in the VCN flow log.
     *
     * @return the value
     **/
    public String getSourceCidr() {
        return sourceCidr;
    }

    /**
     * Traffic to this CIDR will be captured in the VCN flow log.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCidr")
    private final String destinationCidr;

    /**
     * Traffic to this CIDR will be captured in the VCN flow log.
     *
     * @return the value
     **/
    public String getDestinationCidr() {
        return destinationCidr;
    }

    /**
     * The transport protocol the filter uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The transport protocol the filter uses.
     *
     * @return the value
     **/
    public String getProtocol() {
        return protocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
    private final IcmpOptions icmpOptions;

    public IcmpOptions getIcmpOptions() {
        return icmpOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
    private final TcpOptions tcpOptions;

    public TcpOptions getTcpOptions() {
        return tcpOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
    private final UdpOptions udpOptions;

    public UdpOptions getUdpOptions() {
        return udpOptions;
    }

    /**
     * Type or types of VCN flow logs to store. {@code ALL} includes records for both accepted traffic and
     * rejected traffic.
     *
     **/
    public enum FlowLogType {
        All("ALL"),
        Reject("REJECT"),
        Accept("ACCEPT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FlowLogType.class);

        private final String value;
        private static java.util.Map<String, FlowLogType> map;

        static {
            map = new java.util.HashMap<>();
            for (FlowLogType v : FlowLogType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FlowLogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FlowLogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FlowLogType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type or types of VCN flow logs to store. {@code ALL} includes records for both accepted traffic and
     * rejected traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flowLogType")
    private final FlowLogType flowLogType;

    /**
     * Type or types of VCN flow logs to store. {@code ALL} includes records for both accepted traffic and
     * rejected traffic.
     *
     * @return the value
     **/
    public FlowLogType getFlowLogType() {
        return flowLogType;
    }

    /**
     * Include or exclude a {@code ruleAction} object.
     *
     **/
    public enum RuleAction {
        Include("INCLUDE"),
        Exclude("EXCLUDE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RuleAction.class);

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
     * Include or exclude a {@code ruleAction} object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleAction")
    private final RuleAction ruleAction;

    /**
     * Include or exclude a {@code ruleAction} object.
     *
     * @return the value
     **/
    public RuleAction getRuleAction() {
        return ruleAction;
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
        sb.append("FlowLogCaptureFilterRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", samplingRate=").append(String.valueOf(this.samplingRate));
        sb.append(", sourceCidr=").append(String.valueOf(this.sourceCidr));
        sb.append(", destinationCidr=").append(String.valueOf(this.destinationCidr));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", icmpOptions=").append(String.valueOf(this.icmpOptions));
        sb.append(", tcpOptions=").append(String.valueOf(this.tcpOptions));
        sb.append(", udpOptions=").append(String.valueOf(this.udpOptions));
        sb.append(", flowLogType=").append(String.valueOf(this.flowLogType));
        sb.append(", ruleAction=").append(String.valueOf(this.ruleAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlowLogCaptureFilterRuleDetails)) {
            return false;
        }

        FlowLogCaptureFilterRuleDetails other = (FlowLogCaptureFilterRuleDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.samplingRate, other.samplingRate)
                && java.util.Objects.equals(this.sourceCidr, other.sourceCidr)
                && java.util.Objects.equals(this.destinationCidr, other.destinationCidr)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.icmpOptions, other.icmpOptions)
                && java.util.Objects.equals(this.tcpOptions, other.tcpOptions)
                && java.util.Objects.equals(this.udpOptions, other.udpOptions)
                && java.util.Objects.equals(this.flowLogType, other.flowLogType)
                && java.util.Objects.equals(this.ruleAction, other.ruleAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.samplingRate == null ? 43 : this.samplingRate.hashCode());
        result = (result * PRIME) + (this.sourceCidr == null ? 43 : this.sourceCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationCidr == null ? 43 : this.destinationCidr.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.icmpOptions == null ? 43 : this.icmpOptions.hashCode());
        result = (result * PRIME) + (this.tcpOptions == null ? 43 : this.tcpOptions.hashCode());
        result = (result * PRIME) + (this.udpOptions == null ? 43 : this.udpOptions.hashCode());
        result = (result * PRIME) + (this.flowLogType == null ? 43 : this.flowLogType.hashCode());
        result = (result * PRIME) + (this.ruleAction == null ? 43 : this.ruleAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
