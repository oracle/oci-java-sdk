/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * A list of Web Application Firewall log entries. Each entry is a JSON object, including a timestamp property and other fields varying based on log type. Logs record what rules and countermeasures are triggered by requests and are used as a basis to move request handling into block mode. For more information about WAF logs, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WafLog {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaAction")
        private String captchaAction;

        public Builder captchaAction(String captchaAction) {
            this.captchaAction = captchaAction;
            this.__explicitlySet__.add("captchaAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaExpected")
        private String captchaExpected;

        public Builder captchaExpected(String captchaExpected) {
            this.captchaExpected = captchaExpected;
            this.__explicitlySet__.add("captchaExpected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaReceived")
        private String captchaReceived;

        public Builder captchaReceived(String captchaReceived) {
            this.captchaReceived = captchaReceived;
            this.__explicitlySet__.add("captchaReceived");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captchaFailCount")
        private String captchaFailCount;

        public Builder captchaFailCount(String captchaFailCount) {
            this.captchaFailCount = captchaFailCount;
            this.__explicitlySet__.add("captchaFailCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientAddress")
        private String clientAddress;

        public Builder clientAddress(String clientAddress) {
            this.clientAddress = clientAddress;
            this.__explicitlySet__.add("clientAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
        private String userAgent;

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            this.__explicitlySet__.add("userAgent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionRuleDetections")
        private java.util.Map<String, String> protectionRuleDetections;

        public Builder protectionRuleDetections(
                java.util.Map<String, String> protectionRuleDetections) {
            this.protectionRuleDetections = protectionRuleDetections;
            this.__explicitlySet__.add("protectionRuleDetections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpMethod")
        private String httpMethod;

        public Builder httpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            this.__explicitlySet__.add("httpMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestUrl")
        private String requestUrl;

        public Builder requestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            this.__explicitlySet__.add("requestUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
        private java.util.Map<String, String> httpHeaders;

        public Builder httpHeaders(java.util.Map<String, String> httpHeaders) {
            this.httpHeaders = httpHeaders;
            this.__explicitlySet__.add("httpHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referrer")
        private String referrer;

        public Builder referrer(String referrer) {
            this.referrer = referrer;
            this.__explicitlySet__.add("referrer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
        private Integer responseCode;

        public Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            this.__explicitlySet__.add("responseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseSize")
        private Integer responseSize;

        public Builder responseSize(Integer responseSize) {
            this.responseSize = responseSize;
            this.__explicitlySet__.add("responseSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("incidentKey")
        private String incidentKey;

        public Builder incidentKey(String incidentKey) {
            this.incidentKey = incidentKey;
            this.__explicitlySet__.add("incidentKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            this.__explicitlySet__.add("fingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, String> requestHeaders;

        public Builder requestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threatFeedKey")
        private String threatFeedKey;

        public Builder threatFeedKey(String threatFeedKey) {
            this.threatFeedKey = threatFeedKey;
            this.__explicitlySet__.add("threatFeedKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessRuleKey")
        private String accessRuleKey;

        public Builder accessRuleKey(String accessRuleKey) {
            this.accessRuleKey = accessRuleKey;
            this.__explicitlySet__.add("accessRuleKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimitingKey")
        private String addressRateLimitingKey;

        public Builder addressRateLimitingKey(String addressRateLimitingKey) {
            this.addressRateLimitingKey = addressRateLimitingKey;
            this.__explicitlySet__.add("addressRateLimitingKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private String logType;

        public Builder logType(String logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originAddress")
        private String originAddress;

        public Builder originAddress(String originAddress) {
            this.originAddress = originAddress;
            this.__explicitlySet__.add("originAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originResponseTime")
        private String originResponseTime;

        public Builder originResponseTime(String originResponseTime) {
            this.originResponseTime = originResponseTime;
            this.__explicitlySet__.add("originResponseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafLog build() {
            WafLog __instance__ =
                    new WafLog(
                            action,
                            captchaAction,
                            captchaExpected,
                            captchaReceived,
                            captchaFailCount,
                            clientAddress,
                            countryName,
                            userAgent,
                            domain,
                            protectionRuleDetections,
                            httpMethod,
                            requestUrl,
                            httpHeaders,
                            referrer,
                            responseCode,
                            responseSize,
                            incidentKey,
                            fingerprint,
                            device,
                            countryCode,
                            requestHeaders,
                            threatFeedKey,
                            accessRuleKey,
                            addressRateLimitingKey,
                            timestamp,
                            logType,
                            originAddress,
                            originResponseTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafLog o) {
            Builder copiedBuilder =
                    action(o.getAction())
                            .captchaAction(o.getCaptchaAction())
                            .captchaExpected(o.getCaptchaExpected())
                            .captchaReceived(o.getCaptchaReceived())
                            .captchaFailCount(o.getCaptchaFailCount())
                            .clientAddress(o.getClientAddress())
                            .countryName(o.getCountryName())
                            .userAgent(o.getUserAgent())
                            .domain(o.getDomain())
                            .protectionRuleDetections(o.getProtectionRuleDetections())
                            .httpMethod(o.getHttpMethod())
                            .requestUrl(o.getRequestUrl())
                            .httpHeaders(o.getHttpHeaders())
                            .referrer(o.getReferrer())
                            .responseCode(o.getResponseCode())
                            .responseSize(o.getResponseSize())
                            .incidentKey(o.getIncidentKey())
                            .fingerprint(o.getFingerprint())
                            .device(o.getDevice())
                            .countryCode(o.getCountryCode())
                            .requestHeaders(o.getRequestHeaders())
                            .threatFeedKey(o.getThreatFeedKey())
                            .accessRuleKey(o.getAccessRuleKey())
                            .addressRateLimitingKey(o.getAddressRateLimitingKey())
                            .timestamp(o.getTimestamp())
                            .logType(o.getLogType())
                            .originAddress(o.getOriginAddress())
                            .originResponseTime(o.getOriginResponseTime());

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
     * The action taken on the request, either `ALLOW`, `DETECT`, or `BLOCK`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    String action;

    /**
     * The CAPTCHA action taken on the request, `ALLOW` or `BLOCK`. For more information about
     * CAPTCHAs, see `UpdateCaptchas`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaAction")
    String captchaAction;

    /**
     * The CAPTCHA challenge answer that was expected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaExpected")
    String captchaExpected;

    /**
     * The CAPTCHA challenge answer that was received.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaReceived")
    String captchaReceived;

    /**
     * The number of times the CAPTCHA challenge was failed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFailCount")
    String captchaFailCount;

    /**
     * The IPv4 address of the requesting client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientAddress")
    String clientAddress;

    /**
     * The name of the country where the request originated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    String countryName;

    /**
     * The value of the request's `User-Agent` header field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    String userAgent;

    /**
     * The `Host` header data of the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * A map of protection rule keys to detection message details. Detections are
     * requests that matched the criteria of a protection rule but the rule's
     * action was set to `DETECT`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionRuleDetections")
    java.util.Map<String, String> protectionRuleDetections;

    /**
     * The HTTP method of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpMethod")
    String httpMethod;

    /**
     * The path and query string of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestUrl")
    String requestUrl;

    /**
     * The map of the request's header names to their respective values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
    java.util.Map<String, String> httpHeaders;

    /**
     * The `Referrer` header value of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    String referrer;

    /**
     * The status code of the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    Integer responseCode;

    /**
     * The size in bytes of the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseSize")
    Integer responseSize;

    /**
     * The incident key of a request. An incident key is generated for
     * each request processed by the Web Application Firewall and is used to
     * idenitfy blocked requests in applicable logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incidentKey")
    String incidentKey;

    /**
     * The hashed signature of the device's fingerprint. For more information,
     * see `DeviceFingerPrintChallenge`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    String fingerprint;

    /**
     * The type of device that the request was made from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    String device;

    /**
     * ISO 3166-1 alpha-2 code of the country from which the request originated.
     * For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    String countryCode;

    /**
     * A map of header names to values of the request sent to the origin, including any headers
     * appended by the Web Application Firewall.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    java.util.Map<String, String> requestHeaders;

    /**
     * The `ThreatFeed` key that matched the request. For more information about
     * threat feeds, see `UpdateThreatFeeds`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatFeedKey")
    String threatFeedKey;

    /**
     * The `AccessRule` key that matched the request. For more information about
     * access rules, see `UpdateAccessRules`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessRuleKey")
    String accessRuleKey;

    /**
     * The `AddressRateLimiting` key that matched the request. For more information
     * about address rate limiting, see `UpdateWafAddressRateLimiting`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimitingKey")
    String addressRateLimitingKey;

    /**
     * The date and time the Web Application Firewall processed the request and logged it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    /**
     * The type of log of the request. For more about log types, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    String logType;

    /**
     * The address of the origin server where the request was sent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originAddress")
    String originAddress;

    /**
     * The amount of time it took the origin server to respond to the request, in seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originResponseTime")
    String originResponseTime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
