/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A list of Web Application Firewall log entries. Each entry is a JSON object, including a
 * timestamp property and other fields varying based on log type. Logs record what rules and
 * countermeasures are triggered by requests and are used as a basis to move request handling into
 * block mode. For more information about WAF logs, see
 * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WafLog extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "action",
        "captchaAction",
        "captchaExpected",
        "captchaReceived",
        "captchaFailCount",
        "clientAddress",
        "countryName",
        "userAgent",
        "domain",
        "protectionRuleDetections",
        "httpMethod",
        "requestUrl",
        "httpHeaders",
        "referrer",
        "responseCode",
        "responseSize",
        "incidentKey",
        "fingerprint",
        "device",
        "countryCode",
        "requestHeaders",
        "threatFeedKey",
        "accessRuleKey",
        "addressRateLimitingKey",
        "timestamp",
        "logType",
        "originAddress",
        "originResponseTime"
    })
    public WafLog(
            String action,
            String captchaAction,
            String captchaExpected,
            String captchaReceived,
            String captchaFailCount,
            String clientAddress,
            String countryName,
            String userAgent,
            String domain,
            java.util.Map<String, String> protectionRuleDetections,
            String httpMethod,
            String requestUrl,
            java.util.Map<String, String> httpHeaders,
            String referrer,
            Integer responseCode,
            Integer responseSize,
            String incidentKey,
            String fingerprint,
            String device,
            String countryCode,
            java.util.Map<String, String> requestHeaders,
            String threatFeedKey,
            String accessRuleKey,
            String addressRateLimitingKey,
            java.util.Date timestamp,
            String logType,
            String originAddress,
            String originResponseTime) {
        super();
        this.action = action;
        this.captchaAction = captchaAction;
        this.captchaExpected = captchaExpected;
        this.captchaReceived = captchaReceived;
        this.captchaFailCount = captchaFailCount;
        this.clientAddress = clientAddress;
        this.countryName = countryName;
        this.userAgent = userAgent;
        this.domain = domain;
        this.protectionRuleDetections = protectionRuleDetections;
        this.httpMethod = httpMethod;
        this.requestUrl = requestUrl;
        this.httpHeaders = httpHeaders;
        this.referrer = referrer;
        this.responseCode = responseCode;
        this.responseSize = responseSize;
        this.incidentKey = incidentKey;
        this.fingerprint = fingerprint;
        this.device = device;
        this.countryCode = countryCode;
        this.requestHeaders = requestHeaders;
        this.threatFeedKey = threatFeedKey;
        this.accessRuleKey = accessRuleKey;
        this.addressRateLimitingKey = addressRateLimitingKey;
        this.timestamp = timestamp;
        this.logType = logType;
        this.originAddress = originAddress;
        this.originResponseTime = originResponseTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The action taken on the request, either {@code ALLOW}, {@code DETECT}, or {@code BLOCK}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The action taken on the request, either {@code ALLOW}, {@code DETECT}, or {@code BLOCK}.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The CAPTCHA action taken on the request, {@code ALLOW} or {@code BLOCK}. For more
         * information about CAPTCHAs, see {@code UpdateCaptchas}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaAction")
        private String captchaAction;

        /**
         * The CAPTCHA action taken on the request, {@code ALLOW} or {@code BLOCK}. For more
         * information about CAPTCHAs, see {@code UpdateCaptchas}.
         *
         * @param captchaAction the value to set
         * @return this builder
         */
        public Builder captchaAction(String captchaAction) {
            this.captchaAction = captchaAction;
            this.__explicitlySet__.add("captchaAction");
            return this;
        }
        /** The CAPTCHA challenge answer that was expected. */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaExpected")
        private String captchaExpected;

        /**
         * The CAPTCHA challenge answer that was expected.
         *
         * @param captchaExpected the value to set
         * @return this builder
         */
        public Builder captchaExpected(String captchaExpected) {
            this.captchaExpected = captchaExpected;
            this.__explicitlySet__.add("captchaExpected");
            return this;
        }
        /** The CAPTCHA challenge answer that was received. */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaReceived")
        private String captchaReceived;

        /**
         * The CAPTCHA challenge answer that was received.
         *
         * @param captchaReceived the value to set
         * @return this builder
         */
        public Builder captchaReceived(String captchaReceived) {
            this.captchaReceived = captchaReceived;
            this.__explicitlySet__.add("captchaReceived");
            return this;
        }
        /** The number of times the CAPTCHA challenge was failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("captchaFailCount")
        private String captchaFailCount;

        /**
         * The number of times the CAPTCHA challenge was failed.
         *
         * @param captchaFailCount the value to set
         * @return this builder
         */
        public Builder captchaFailCount(String captchaFailCount) {
            this.captchaFailCount = captchaFailCount;
            this.__explicitlySet__.add("captchaFailCount");
            return this;
        }
        /** The IPv4 address of the requesting client. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientAddress")
        private String clientAddress;

        /**
         * The IPv4 address of the requesting client.
         *
         * @param clientAddress the value to set
         * @return this builder
         */
        public Builder clientAddress(String clientAddress) {
            this.clientAddress = clientAddress;
            this.__explicitlySet__.add("clientAddress");
            return this;
        }
        /** The name of the country where the request originated. */
        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        /**
         * The name of the country where the request originated.
         *
         * @param countryName the value to set
         * @return this builder
         */
        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }
        /** The value of the request's {@code User-Agent} header field. */
        @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
        private String userAgent;

        /**
         * The value of the request's {@code User-Agent} header field.
         *
         * @param userAgent the value to set
         * @return this builder
         */
        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            this.__explicitlySet__.add("userAgent");
            return this;
        }
        /** The {@code Host} header data of the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The {@code Host} header data of the request.
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * A map of protection rule keys to detection message details. Detections are requests that
         * matched the criteria of a protection rule but the rule's action was set to {@code
         * DETECT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionRuleDetections")
        private java.util.Map<String, String> protectionRuleDetections;

        /**
         * A map of protection rule keys to detection message details. Detections are requests that
         * matched the criteria of a protection rule but the rule's action was set to {@code
         * DETECT}.
         *
         * @param protectionRuleDetections the value to set
         * @return this builder
         */
        public Builder protectionRuleDetections(
                java.util.Map<String, String> protectionRuleDetections) {
            this.protectionRuleDetections = protectionRuleDetections;
            this.__explicitlySet__.add("protectionRuleDetections");
            return this;
        }
        /** The HTTP method of the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("httpMethod")
        private String httpMethod;

        /**
         * The HTTP method of the request.
         *
         * @param httpMethod the value to set
         * @return this builder
         */
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            this.__explicitlySet__.add("httpMethod");
            return this;
        }
        /** The path and query string of the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestUrl")
        private String requestUrl;

        /**
         * The path and query string of the request.
         *
         * @param requestUrl the value to set
         * @return this builder
         */
        public Builder requestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            this.__explicitlySet__.add("requestUrl");
            return this;
        }
        /** The map of the request's header names to their respective values. */
        @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
        private java.util.Map<String, String> httpHeaders;

        /**
         * The map of the request's header names to their respective values.
         *
         * @param httpHeaders the value to set
         * @return this builder
         */
        public Builder httpHeaders(java.util.Map<String, String> httpHeaders) {
            this.httpHeaders = httpHeaders;
            this.__explicitlySet__.add("httpHeaders");
            return this;
        }
        /** The {@code Referrer} header value of the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("referrer")
        private String referrer;

        /**
         * The {@code Referrer} header value of the request.
         *
         * @param referrer the value to set
         * @return this builder
         */
        public Builder referrer(String referrer) {
            this.referrer = referrer;
            this.__explicitlySet__.add("referrer");
            return this;
        }
        /** The status code of the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
        private Integer responseCode;

        /**
         * The status code of the response.
         *
         * @param responseCode the value to set
         * @return this builder
         */
        public Builder responseCode(Integer responseCode) {
            this.responseCode = responseCode;
            this.__explicitlySet__.add("responseCode");
            return this;
        }
        /** The size in bytes of the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("responseSize")
        private Integer responseSize;

        /**
         * The size in bytes of the response.
         *
         * @param responseSize the value to set
         * @return this builder
         */
        public Builder responseSize(Integer responseSize) {
            this.responseSize = responseSize;
            this.__explicitlySet__.add("responseSize");
            return this;
        }
        /**
         * The incident key of a request. An incident key is generated for each request processed by
         * the Web Application Firewall and is used to idenitfy blocked requests in applicable logs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("incidentKey")
        private String incidentKey;

        /**
         * The incident key of a request. An incident key is generated for each request processed by
         * the Web Application Firewall and is used to idenitfy blocked requests in applicable logs.
         *
         * @param incidentKey the value to set
         * @return this builder
         */
        public Builder incidentKey(String incidentKey) {
            this.incidentKey = incidentKey;
            this.__explicitlySet__.add("incidentKey");
            return this;
        }
        /**
         * The hashed signature of the device's fingerprint. For more information, see {@code
         * DeviceFingerPrintChallenge}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        /**
         * The hashed signature of the device's fingerprint. For more information, see {@code
         * DeviceFingerPrintChallenge}.
         *
         * @param fingerprint the value to set
         * @return this builder
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            this.__explicitlySet__.add("fingerprint");
            return this;
        }
        /** The type of device that the request was made from. */
        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        /**
         * The type of device that the request was made from.
         *
         * @param device the value to set
         * @return this builder
         */
        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }
        /**
         * ISO 3166-1 alpha-2 code of the country from which the request originated. For a list of
         * codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        /**
         * ISO 3166-1 alpha-2 code of the country from which the request originated. For a list of
         * codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
         *
         * @param countryCode the value to set
         * @return this builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }
        /**
         * A map of header names to values of the request sent to the origin, including any headers
         * appended by the Web Application Firewall.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, String> requestHeaders;

        /**
         * A map of header names to values of the request sent to the origin, including any headers
         * appended by the Web Application Firewall.
         *
         * @param requestHeaders the value to set
         * @return this builder
         */
        public Builder requestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }
        /**
         * The {@code ThreatFeed} key that matched the request. For more information about threat
         * feeds, see {@code UpdateThreatFeeds}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threatFeedKey")
        private String threatFeedKey;

        /**
         * The {@code ThreatFeed} key that matched the request. For more information about threat
         * feeds, see {@code UpdateThreatFeeds}.
         *
         * @param threatFeedKey the value to set
         * @return this builder
         */
        public Builder threatFeedKey(String threatFeedKey) {
            this.threatFeedKey = threatFeedKey;
            this.__explicitlySet__.add("threatFeedKey");
            return this;
        }
        /**
         * The {@code AccessRule} key that matched the request. For more information about access
         * rules, see {@code UpdateAccessRules}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessRuleKey")
        private String accessRuleKey;

        /**
         * The {@code AccessRule} key that matched the request. For more information about access
         * rules, see {@code UpdateAccessRules}.
         *
         * @param accessRuleKey the value to set
         * @return this builder
         */
        public Builder accessRuleKey(String accessRuleKey) {
            this.accessRuleKey = accessRuleKey;
            this.__explicitlySet__.add("accessRuleKey");
            return this;
        }
        /**
         * The {@code AddressRateLimiting} key that matched the request. For more information about
         * address rate limiting, see {@code UpdateWafAddressRateLimiting}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimitingKey")
        private String addressRateLimitingKey;

        /**
         * The {@code AddressRateLimiting} key that matched the request. For more information about
         * address rate limiting, see {@code UpdateWafAddressRateLimiting}.
         *
         * @param addressRateLimitingKey the value to set
         * @return this builder
         */
        public Builder addressRateLimitingKey(String addressRateLimitingKey) {
            this.addressRateLimitingKey = addressRateLimitingKey;
            this.__explicitlySet__.add("addressRateLimitingKey");
            return this;
        }
        /** The date and time the Web Application Firewall processed the request and logged it. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the Web Application Firewall processed the request and logged it.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The type of log of the request. For more about log types, see
         * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private String logType;

        /**
         * The type of log of the request. For more about log types, see
         * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         *
         * @param logType the value to set
         * @return this builder
         */
        public Builder logType(String logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }
        /** The address of the origin server where the request was sent. */
        @com.fasterxml.jackson.annotation.JsonProperty("originAddress")
        private String originAddress;

        /**
         * The address of the origin server where the request was sent.
         *
         * @param originAddress the value to set
         * @return this builder
         */
        public Builder originAddress(String originAddress) {
            this.originAddress = originAddress;
            this.__explicitlySet__.add("originAddress");
            return this;
        }
        /** The amount of time it took the origin server to respond to the request, in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("originResponseTime")
        private String originResponseTime;

        /**
         * The amount of time it took the origin server to respond to the request, in seconds.
         *
         * @param originResponseTime the value to set
         * @return this builder
         */
        public Builder originResponseTime(String originResponseTime) {
            this.originResponseTime = originResponseTime;
            this.__explicitlySet__.add("originResponseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafLog build() {
            WafLog model =
                    new WafLog(
                            this.action,
                            this.captchaAction,
                            this.captchaExpected,
                            this.captchaReceived,
                            this.captchaFailCount,
                            this.clientAddress,
                            this.countryName,
                            this.userAgent,
                            this.domain,
                            this.protectionRuleDetections,
                            this.httpMethod,
                            this.requestUrl,
                            this.httpHeaders,
                            this.referrer,
                            this.responseCode,
                            this.responseSize,
                            this.incidentKey,
                            this.fingerprint,
                            this.device,
                            this.countryCode,
                            this.requestHeaders,
                            this.threatFeedKey,
                            this.accessRuleKey,
                            this.addressRateLimitingKey,
                            this.timestamp,
                            this.logType,
                            this.originAddress,
                            this.originResponseTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafLog model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("captchaAction")) {
                this.captchaAction(model.getCaptchaAction());
            }
            if (model.wasPropertyExplicitlySet("captchaExpected")) {
                this.captchaExpected(model.getCaptchaExpected());
            }
            if (model.wasPropertyExplicitlySet("captchaReceived")) {
                this.captchaReceived(model.getCaptchaReceived());
            }
            if (model.wasPropertyExplicitlySet("captchaFailCount")) {
                this.captchaFailCount(model.getCaptchaFailCount());
            }
            if (model.wasPropertyExplicitlySet("clientAddress")) {
                this.clientAddress(model.getClientAddress());
            }
            if (model.wasPropertyExplicitlySet("countryName")) {
                this.countryName(model.getCountryName());
            }
            if (model.wasPropertyExplicitlySet("userAgent")) {
                this.userAgent(model.getUserAgent());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("protectionRuleDetections")) {
                this.protectionRuleDetections(model.getProtectionRuleDetections());
            }
            if (model.wasPropertyExplicitlySet("httpMethod")) {
                this.httpMethod(model.getHttpMethod());
            }
            if (model.wasPropertyExplicitlySet("requestUrl")) {
                this.requestUrl(model.getRequestUrl());
            }
            if (model.wasPropertyExplicitlySet("httpHeaders")) {
                this.httpHeaders(model.getHttpHeaders());
            }
            if (model.wasPropertyExplicitlySet("referrer")) {
                this.referrer(model.getReferrer());
            }
            if (model.wasPropertyExplicitlySet("responseCode")) {
                this.responseCode(model.getResponseCode());
            }
            if (model.wasPropertyExplicitlySet("responseSize")) {
                this.responseSize(model.getResponseSize());
            }
            if (model.wasPropertyExplicitlySet("incidentKey")) {
                this.incidentKey(model.getIncidentKey());
            }
            if (model.wasPropertyExplicitlySet("fingerprint")) {
                this.fingerprint(model.getFingerprint());
            }
            if (model.wasPropertyExplicitlySet("device")) {
                this.device(model.getDevice());
            }
            if (model.wasPropertyExplicitlySet("countryCode")) {
                this.countryCode(model.getCountryCode());
            }
            if (model.wasPropertyExplicitlySet("requestHeaders")) {
                this.requestHeaders(model.getRequestHeaders());
            }
            if (model.wasPropertyExplicitlySet("threatFeedKey")) {
                this.threatFeedKey(model.getThreatFeedKey());
            }
            if (model.wasPropertyExplicitlySet("accessRuleKey")) {
                this.accessRuleKey(model.getAccessRuleKey());
            }
            if (model.wasPropertyExplicitlySet("addressRateLimitingKey")) {
                this.addressRateLimitingKey(model.getAddressRateLimitingKey());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("logType")) {
                this.logType(model.getLogType());
            }
            if (model.wasPropertyExplicitlySet("originAddress")) {
                this.originAddress(model.getOriginAddress());
            }
            if (model.wasPropertyExplicitlySet("originResponseTime")) {
                this.originResponseTime(model.getOriginResponseTime());
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

    /** The action taken on the request, either {@code ALLOW}, {@code DETECT}, or {@code BLOCK}. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The action taken on the request, either {@code ALLOW}, {@code DETECT}, or {@code BLOCK}.
     *
     * @return the value
     */
    public String getAction() {
        return action;
    }

    /**
     * The CAPTCHA action taken on the request, {@code ALLOW} or {@code BLOCK}. For more information
     * about CAPTCHAs, see {@code UpdateCaptchas}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaAction")
    private final String captchaAction;

    /**
     * The CAPTCHA action taken on the request, {@code ALLOW} or {@code BLOCK}. For more information
     * about CAPTCHAs, see {@code UpdateCaptchas}.
     *
     * @return the value
     */
    public String getCaptchaAction() {
        return captchaAction;
    }

    /** The CAPTCHA challenge answer that was expected. */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaExpected")
    private final String captchaExpected;

    /**
     * The CAPTCHA challenge answer that was expected.
     *
     * @return the value
     */
    public String getCaptchaExpected() {
        return captchaExpected;
    }

    /** The CAPTCHA challenge answer that was received. */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaReceived")
    private final String captchaReceived;

    /**
     * The CAPTCHA challenge answer that was received.
     *
     * @return the value
     */
    public String getCaptchaReceived() {
        return captchaReceived;
    }

    /** The number of times the CAPTCHA challenge was failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("captchaFailCount")
    private final String captchaFailCount;

    /**
     * The number of times the CAPTCHA challenge was failed.
     *
     * @return the value
     */
    public String getCaptchaFailCount() {
        return captchaFailCount;
    }

    /** The IPv4 address of the requesting client. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientAddress")
    private final String clientAddress;

    /**
     * The IPv4 address of the requesting client.
     *
     * @return the value
     */
    public String getClientAddress() {
        return clientAddress;
    }

    /** The name of the country where the request originated. */
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    private final String countryName;

    /**
     * The name of the country where the request originated.
     *
     * @return the value
     */
    public String getCountryName() {
        return countryName;
    }

    /** The value of the request's {@code User-Agent} header field. */
    @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
    private final String userAgent;

    /**
     * The value of the request's {@code User-Agent} header field.
     *
     * @return the value
     */
    public String getUserAgent() {
        return userAgent;
    }

    /** The {@code Host} header data of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The {@code Host} header data of the request.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * A map of protection rule keys to detection message details. Detections are requests that
     * matched the criteria of a protection rule but the rule's action was set to {@code DETECT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionRuleDetections")
    private final java.util.Map<String, String> protectionRuleDetections;

    /**
     * A map of protection rule keys to detection message details. Detections are requests that
     * matched the criteria of a protection rule but the rule's action was set to {@code DETECT}.
     *
     * @return the value
     */
    public java.util.Map<String, String> getProtectionRuleDetections() {
        return protectionRuleDetections;
    }

    /** The HTTP method of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("httpMethod")
    private final String httpMethod;

    /**
     * The HTTP method of the request.
     *
     * @return the value
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /** The path and query string of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestUrl")
    private final String requestUrl;

    /**
     * The path and query string of the request.
     *
     * @return the value
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /** The map of the request's header names to their respective values. */
    @com.fasterxml.jackson.annotation.JsonProperty("httpHeaders")
    private final java.util.Map<String, String> httpHeaders;

    /**
     * The map of the request's header names to their respective values.
     *
     * @return the value
     */
    public java.util.Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    /** The {@code Referrer} header value of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("referrer")
    private final String referrer;

    /**
     * The {@code Referrer} header value of the request.
     *
     * @return the value
     */
    public String getReferrer() {
        return referrer;
    }

    /** The status code of the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    private final Integer responseCode;

    /**
     * The status code of the response.
     *
     * @return the value
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /** The size in bytes of the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseSize")
    private final Integer responseSize;

    /**
     * The size in bytes of the response.
     *
     * @return the value
     */
    public Integer getResponseSize() {
        return responseSize;
    }

    /**
     * The incident key of a request. An incident key is generated for each request processed by the
     * Web Application Firewall and is used to idenitfy blocked requests in applicable logs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incidentKey")
    private final String incidentKey;

    /**
     * The incident key of a request. An incident key is generated for each request processed by the
     * Web Application Firewall and is used to idenitfy blocked requests in applicable logs.
     *
     * @return the value
     */
    public String getIncidentKey() {
        return incidentKey;
    }

    /**
     * The hashed signature of the device's fingerprint. For more information, see {@code
     * DeviceFingerPrintChallenge}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

    /**
     * The hashed signature of the device's fingerprint. For more information, see {@code
     * DeviceFingerPrintChallenge}.
     *
     * @return the value
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /** The type of device that the request was made from. */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    private final String device;

    /**
     * The type of device that the request was made from.
     *
     * @return the value
     */
    public String getDevice() {
        return device;
    }

    /**
     * ISO 3166-1 alpha-2 code of the country from which the request originated. For a list of
     * codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    /**
     * ISO 3166-1 alpha-2 code of the country from which the request originated. For a list of
     * codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     *
     * @return the value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * A map of header names to values of the request sent to the origin, including any headers
     * appended by the Web Application Firewall.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    private final java.util.Map<String, String> requestHeaders;

    /**
     * A map of header names to values of the request sent to the origin, including any headers
     * appended by the Web Application Firewall.
     *
     * @return the value
     */
    public java.util.Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * The {@code ThreatFeed} key that matched the request. For more information about threat feeds,
     * see {@code UpdateThreatFeeds}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threatFeedKey")
    private final String threatFeedKey;

    /**
     * The {@code ThreatFeed} key that matched the request. For more information about threat feeds,
     * see {@code UpdateThreatFeeds}.
     *
     * @return the value
     */
    public String getThreatFeedKey() {
        return threatFeedKey;
    }

    /**
     * The {@code AccessRule} key that matched the request. For more information about access rules,
     * see {@code UpdateAccessRules}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessRuleKey")
    private final String accessRuleKey;

    /**
     * The {@code AccessRule} key that matched the request. For more information about access rules,
     * see {@code UpdateAccessRules}.
     *
     * @return the value
     */
    public String getAccessRuleKey() {
        return accessRuleKey;
    }

    /**
     * The {@code AddressRateLimiting} key that matched the request. For more information about
     * address rate limiting, see {@code UpdateWafAddressRateLimiting}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addressRateLimitingKey")
    private final String addressRateLimitingKey;

    /**
     * The {@code AddressRateLimiting} key that matched the request. For more information about
     * address rate limiting, see {@code UpdateWafAddressRateLimiting}.
     *
     * @return the value
     */
    public String getAddressRateLimitingKey() {
        return addressRateLimitingKey;
    }

    /** The date and time the Web Application Firewall processed the request and logged it. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the Web Application Firewall processed the request and logged it.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The type of log of the request. For more about log types, see
     * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final String logType;

    /**
     * The type of log of the request. For more about log types, see
     * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     *
     * @return the value
     */
    public String getLogType() {
        return logType;
    }

    /** The address of the origin server where the request was sent. */
    @com.fasterxml.jackson.annotation.JsonProperty("originAddress")
    private final String originAddress;

    /**
     * The address of the origin server where the request was sent.
     *
     * @return the value
     */
    public String getOriginAddress() {
        return originAddress;
    }

    /** The amount of time it took the origin server to respond to the request, in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("originResponseTime")
    private final String originResponseTime;

    /**
     * The amount of time it took the origin server to respond to the request, in seconds.
     *
     * @return the value
     */
    public String getOriginResponseTime() {
        return originResponseTime;
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
        sb.append("WafLog(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", captchaAction=").append(String.valueOf(this.captchaAction));
        sb.append(", captchaExpected=").append(String.valueOf(this.captchaExpected));
        sb.append(", captchaReceived=").append(String.valueOf(this.captchaReceived));
        sb.append(", captchaFailCount=").append(String.valueOf(this.captchaFailCount));
        sb.append(", clientAddress=").append(String.valueOf(this.clientAddress));
        sb.append(", countryName=").append(String.valueOf(this.countryName));
        sb.append(", userAgent=").append(String.valueOf(this.userAgent));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", protectionRuleDetections=")
                .append(String.valueOf(this.protectionRuleDetections));
        sb.append(", httpMethod=").append(String.valueOf(this.httpMethod));
        sb.append(", requestUrl=").append(String.valueOf(this.requestUrl));
        sb.append(", httpHeaders=").append(String.valueOf(this.httpHeaders));
        sb.append(", referrer=").append(String.valueOf(this.referrer));
        sb.append(", responseCode=").append(String.valueOf(this.responseCode));
        sb.append(", responseSize=").append(String.valueOf(this.responseSize));
        sb.append(", incidentKey=").append(String.valueOf(this.incidentKey));
        sb.append(", fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(", device=").append(String.valueOf(this.device));
        sb.append(", countryCode=").append(String.valueOf(this.countryCode));
        sb.append(", requestHeaders=").append(String.valueOf(this.requestHeaders));
        sb.append(", threatFeedKey=").append(String.valueOf(this.threatFeedKey));
        sb.append(", accessRuleKey=").append(String.valueOf(this.accessRuleKey));
        sb.append(", addressRateLimitingKey=").append(String.valueOf(this.addressRateLimitingKey));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", originAddress=").append(String.valueOf(this.originAddress));
        sb.append(", originResponseTime=").append(String.valueOf(this.originResponseTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WafLog)) {
            return false;
        }

        WafLog other = (WafLog) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.captchaAction, other.captchaAction)
                && java.util.Objects.equals(this.captchaExpected, other.captchaExpected)
                && java.util.Objects.equals(this.captchaReceived, other.captchaReceived)
                && java.util.Objects.equals(this.captchaFailCount, other.captchaFailCount)
                && java.util.Objects.equals(this.clientAddress, other.clientAddress)
                && java.util.Objects.equals(this.countryName, other.countryName)
                && java.util.Objects.equals(this.userAgent, other.userAgent)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(
                        this.protectionRuleDetections, other.protectionRuleDetections)
                && java.util.Objects.equals(this.httpMethod, other.httpMethod)
                && java.util.Objects.equals(this.requestUrl, other.requestUrl)
                && java.util.Objects.equals(this.httpHeaders, other.httpHeaders)
                && java.util.Objects.equals(this.referrer, other.referrer)
                && java.util.Objects.equals(this.responseCode, other.responseCode)
                && java.util.Objects.equals(this.responseSize, other.responseSize)
                && java.util.Objects.equals(this.incidentKey, other.incidentKey)
                && java.util.Objects.equals(this.fingerprint, other.fingerprint)
                && java.util.Objects.equals(this.device, other.device)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.requestHeaders, other.requestHeaders)
                && java.util.Objects.equals(this.threatFeedKey, other.threatFeedKey)
                && java.util.Objects.equals(this.accessRuleKey, other.accessRuleKey)
                && java.util.Objects.equals(
                        this.addressRateLimitingKey, other.addressRateLimitingKey)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.originAddress, other.originAddress)
                && java.util.Objects.equals(this.originResponseTime, other.originResponseTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaAction == null ? 43 : this.captchaAction.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaExpected == null ? 43 : this.captchaExpected.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaReceived == null ? 43 : this.captchaReceived.hashCode());
        result =
                (result * PRIME)
                        + (this.captchaFailCount == null ? 43 : this.captchaFailCount.hashCode());
        result =
                (result * PRIME)
                        + (this.clientAddress == null ? 43 : this.clientAddress.hashCode());
        result = (result * PRIME) + (this.countryName == null ? 43 : this.countryName.hashCode());
        result = (result * PRIME) + (this.userAgent == null ? 43 : this.userAgent.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionRuleDetections == null
                                ? 43
                                : this.protectionRuleDetections.hashCode());
        result = (result * PRIME) + (this.httpMethod == null ? 43 : this.httpMethod.hashCode());
        result = (result * PRIME) + (this.requestUrl == null ? 43 : this.requestUrl.hashCode());
        result = (result * PRIME) + (this.httpHeaders == null ? 43 : this.httpHeaders.hashCode());
        result = (result * PRIME) + (this.referrer == null ? 43 : this.referrer.hashCode());
        result = (result * PRIME) + (this.responseCode == null ? 43 : this.responseCode.hashCode());
        result = (result * PRIME) + (this.responseSize == null ? 43 : this.responseSize.hashCode());
        result = (result * PRIME) + (this.incidentKey == null ? 43 : this.incidentKey.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.device == null ? 43 : this.device.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result =
                (result * PRIME)
                        + (this.requestHeaders == null ? 43 : this.requestHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.threatFeedKey == null ? 43 : this.threatFeedKey.hashCode());
        result =
                (result * PRIME)
                        + (this.accessRuleKey == null ? 43 : this.accessRuleKey.hashCode());
        result =
                (result * PRIME)
                        + (this.addressRateLimitingKey == null
                                ? 43
                                : this.addressRateLimitingKey.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result =
                (result * PRIME)
                        + (this.originAddress == null ? 43 : this.originAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.originResponseTime == null
                                ? 43
                                : this.originResponseTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
