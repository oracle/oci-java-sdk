/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * The results returned by running an HTTP probe.  All times and durations are
 * returned in milliseconds. All times are relative to the POSIX epoch
 * (1970-01-01T00:00Z). Time properties conform to W3C Resource Timing.
 * For more information, see
 * [PerformanceResourceTiming](https://w3c.github.io/resource-timing/#sec-resource-timing)
 * interface.
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
    builder = HttpProbeResultSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HttpProbeResultSummary {
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
        private HttpProbeProtocol protocol;

        public Builder protocol(HttpProbeProtocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connection")
        private TcpConnection connection;

        public Builder connection(TcpConnection connection) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
        private Integer statusCode;

        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            this.__explicitlySet__.add("statusCode");
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

        @com.fasterxml.jackson.annotation.JsonProperty("connectStart")
        private Double connectStart;

        public Builder connectStart(Double connectStart) {
            this.connectStart = connectStart;
            this.__explicitlySet__.add("connectStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secureConnectionStart")
        private Double secureConnectionStart;

        public Builder secureConnectionStart(Double secureConnectionStart) {
            this.secureConnectionStart = secureConnectionStart;
            this.__explicitlySet__.add("secureConnectionStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectEnd")
        private Double connectEnd;

        public Builder connectEnd(Double connectEnd) {
            this.connectEnd = connectEnd;
            this.__explicitlySet__.add("connectEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetchStart")
        private Double fetchStart;

        public Builder fetchStart(Double fetchStart) {
            this.fetchStart = fetchStart;
            this.__explicitlySet__.add("fetchStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestStart")
        private Double requestStart;

        public Builder requestStart(Double requestStart) {
            this.requestStart = requestStart;
            this.__explicitlySet__.add("requestStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseStart")
        private Double responseStart;

        public Builder responseStart(Double responseStart) {
            this.responseStart = responseStart;
            this.__explicitlySet__.add("responseStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseEnd")
        private Double responseEnd;

        public Builder responseEnd(Double responseEnd) {
            this.responseEnd = responseEnd;
            this.__explicitlySet__.add("responseEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Double duration;

        public Builder duration(Double duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encodedBodySize")
        private Integer encodedBodySize;

        public Builder encodedBodySize(Integer encodedBodySize) {
            this.encodedBodySize = encodedBodySize;
            this.__explicitlySet__.add("encodedBodySize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpProbeResultSummary build() {
            HttpProbeResultSummary __instance__ =
                    new HttpProbeResultSummary(
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
                            statusCode,
                            domainLookupStart,
                            domainLookupEnd,
                            connectStart,
                            secureConnectionStart,
                            connectEnd,
                            fetchStart,
                            requestStart,
                            responseStart,
                            responseEnd,
                            duration,
                            encodedBodySize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpProbeResultSummary o) {
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
                            .statusCode(o.getStatusCode())
                            .domainLookupStart(o.getDomainLookupStart())
                            .domainLookupEnd(o.getDomainLookupEnd())
                            .connectStart(o.getConnectStart())
                            .secureConnectionStart(o.getSecureConnectionStart())
                            .connectEnd(o.getConnectEnd())
                            .fetchStart(o.getFetchStart())
                            .requestStart(o.getRequestStart())
                            .responseStart(o.getResponseStart())
                            .responseEnd(o.getResponseEnd())
                            .duration(o.getDuration())
                            .encodedBodySize(o.getEncodedBodySize());

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
     * True if the probe did not complete before the configured `timeoutInSeconds` value.
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
     * The `errorMessage` field provides a message with the error details.
     * * NONE - No error
     * * DNS - DNS errors
     * * TRANSPORT - Transport-related errors, for example a \"TLS certificate expired\" error.
     * * NETWORK - Network-related errors, for example a \"network unreachable\" error.
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
     * The `errorMessage` field provides a message with the error details.
     * * NONE - No error
     * * DNS - DNS errors
     * * TRANSPORT - Transport-related errors, for example a \"TLS certificate expired\" error.
     * * NETWORK - Network-related errors, for example a \"network unreachable\" error.
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
    HttpProbeProtocol protocol;

    @com.fasterxml.jackson.annotation.JsonProperty("connection")
    TcpConnection connection;

    @com.fasterxml.jackson.annotation.JsonProperty("dns")
    DNS dns;

    /**
     * The HTTP response status code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
    Integer statusCode;

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
     * The time immediately before the vantage point starts establishing the connection
     * to the server to retrieve the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectStart")
    Double connectStart;

    /**
     * The time immediately before the vantage point starts the handshake process to
     * secure the current connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secureConnectionStart")
    Double secureConnectionStart;

    /**
     * The time immediately after the vantage point finishes establishing the connection
     * to the server to retrieve the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectEnd")
    Double connectEnd;

    /**
     * The time immediately before the vantage point starts to fetch the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fetchStart")
    Double fetchStart;

    /**
     * The time immediately before the vantage point starts requesting the resource from
     * the server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestStart")
    Double requestStart;

    /**
     * The time immediately after the vantage point's HTTP parser receives the first byte
     * of the response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseStart")
    Double responseStart;

    /**
     * The time immediately after the vantage point receives the last byte of the response
     * or immediately before the transport connection is closed, whichever comes first.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseEnd")
    Double responseEnd;

    /**
     * The total duration from start of request until response is fully consumed or the
     * connection is closed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    Double duration;

    /**
     * The size, in octets, of the payload body prior to removing any applied
     * content-codings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encodedBodySize")
    Integer encodedBodySize;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
