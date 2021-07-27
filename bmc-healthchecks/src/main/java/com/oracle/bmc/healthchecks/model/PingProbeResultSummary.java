/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The results returned by running a ping probe.  All times and durations are
 * returned in milliseconds. All times are relative to the POSIX epoch
 * (1970-01-01T00:00Z).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PingProbeResultSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PingProbeResultSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("probeConfigurationId")
        private String probeConfigurationId;

        public Builder probeConfigurationId(String probeConfigurationId) {
            this.probeConfigurationId = probeConfigurationId;
            this.__explicitlySet__.add("probeConfigurationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private Double startTime;

        public Builder startTime(Double startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointName")
        private String vantagePointName;

        public Builder vantagePointName(String vantagePointName) {
            this.vantagePointName = vantagePointName;
            this.__explicitlySet__.add("vantagePointName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTimedOut")
        private Boolean isTimedOut;

        public Builder isTimedOut(Boolean isTimedOut) {
            this.isTimedOut = isTimedOut;
            this.__explicitlySet__.add("isTimedOut");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
        private Boolean isHealthy;

        public Builder isHealthy(Boolean isHealthy) {
            this.isHealthy = isHealthy;
            this.__explicitlySet__.add("isHealthy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCategory")
        private ErrorCategory errorCategory;

        public Builder errorCategory(ErrorCategory errorCategory) {
            this.errorCategory = errorCategory;
            this.__explicitlySet__.add("errorCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private PingProbeProtocol protocol;

        public Builder protocol(PingProbeProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connection")
        private Connection connection;

        public Builder connection(Connection connection) {
            this.connection = connection;
            this.__explicitlySet__.add("connection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dns")
        private DNS dns;

        public Builder dns(DNS dns) {
            this.dns = dns;
            this.__explicitlySet__.add("dns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainLookupStart")
        private Double domainLookupStart;

        public Builder domainLookupStart(Double domainLookupStart) {
            this.domainLookupStart = domainLookupStart;
            this.__explicitlySet__.add("domainLookupStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainLookupEnd")
        private Double domainLookupEnd;

        public Builder domainLookupEnd(Double domainLookupEnd) {
            this.domainLookupEnd = domainLookupEnd;
            this.__explicitlySet__.add("domainLookupEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latencyInMs")
        private Double latencyInMs;

        public Builder latencyInMs(Double latencyInMs) {
            this.latencyInMs = latencyInMs;
            this.__explicitlySet__.add("latencyInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icmpCode")
        private Integer icmpCode;

        public Builder icmpCode(Integer icmpCode) {
            this.icmpCode = icmpCode;
            this.__explicitlySet__.add("icmpCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PingProbeResultSummary build() {
            PingProbeResultSummary __instance__ =
                    new PingProbeResultSummary(
                            key,
                            probeConfigurationId,
                            startTime,
                            target,
                            vantagePointName,
                            isTimedOut,
                            isHealthy,
                            errorCategory,
                            errorMessage,
                            protocol,
                            connection,
                            dns,
                            domainLookupStart,
                            domainLookupEnd,
                            latencyInMs,
                            icmpCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PingProbeResultSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .probeConfigurationId(o.getProbeConfigurationId())
                            .startTime(o.getStartTime())
                            .target(o.getTarget())
                            .vantagePointName(o.getVantagePointName())
                            .isTimedOut(o.getIsTimedOut())
                            .isHealthy(o.getIsHealthy())
                            .errorCategory(o.getErrorCategory())
                            .errorMessage(o.getErrorMessage())
                            .protocol(o.getProtocol())
                            .connection(o.getConnection())
                            .dns(o.getDns())
                            .domainLookupStart(o.getDomainLookupStart())
                            .domainLookupEnd(o.getDomainLookupEnd())
                            .latencyInMs(o.getLatencyInMs())
                            .icmpCode(o.getIcmpCode());

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
     * A value identifying this specific probe result. The key is only unique within
     * the results of its probe configuration. The key may be reused after 90 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The OCID of the monitor or on-demand probe responsible for creating this result.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("probeConfigurationId")
    String probeConfigurationId;

    /**
     * The date and time the probe was executed, expressed in milliseconds since the
     * POSIX epoch. This field is defined by the PerformanceResourceTiming interface
     * of the W3C Resource Timing specification. For more information, see
     * [Resource Timing](https://w3c.github.io/resource-timing/#sec-resource-timing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    Double startTime;

    /**
     * The target hostname or IP address of the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    String target;

    /**
     * The name of the vantage point that executed the probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointName")
    String vantagePointName;

    /**
     * True if the probe did not complete before the configured {@code timeoutInSeconds} value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTimedOut")
    Boolean isTimedOut;

    /**
     * True if the probe result is determined to be healthy based on probe
     * type-specific criteria.  For HTTP probes, a probe result is considered
     * healthy if the HTTP response code is greater than or equal to 200 and
     * less than 300.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHealthy")
    Boolean isHealthy;
    /**
     * The category of error if an error occurs executing the probe.
     * The {@code errorMessage} field provides a message with the error details.
     * * NONE - No error
     * * DNS - DNS errors
     * * TRANSPORT - Transport-related errors, for example a "TLS certificate expired" error.
     * * NETWORK - Network-related errors, for example a "network unreachable" error.
     * * SYSTEM - Internal system errors.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ErrorCategory {
        None("NONE"),
        Dns("DNS"),
        Transport("TRANSPORT"),
        Network("NETWORK"),
        System("SYSTEM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ErrorCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (ErrorCategory v : ErrorCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ErrorCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ErrorCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ErrorCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The category of error if an error occurs executing the probe.
     * The {@code errorMessage} field provides a message with the error details.
     * * NONE - No error
     * * DNS - DNS errors
     * * TRANSPORT - Transport-related errors, for example a "TLS certificate expired" error.
     * * NETWORK - Network-related errors, for example a "network unreachable" error.
     * * SYSTEM - Internal system errors.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCategory")
    ErrorCategory errorCategory;

    /**
     * The error information indicating why a probe execution failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    PingProbeProtocol protocol;

    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    Connection connection;

    @com.fasterxml.jackson.annotation.JsonProperty("dns")
    DNS dns;

    /**
     * The time immediately before the vantage point starts the domain name lookup for
     * the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLookupStart")
    Double domainLookupStart;

    /**
     * The time immediately before the vantage point finishes the domain name lookup for
     * the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLookupEnd")
    Double domainLookupEnd;

    /**
     * The latency of the probe execution, in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latencyInMs")
    Double latencyInMs;

    /**
     * The ICMP code of the response message.  This field is not used when the protocol
     * is set to TCP.  For more information on ICMP codes, see
     * [Internet Control Message Protocol (ICMP) Parameters](https://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("icmpCode")
    Integer icmpCode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
