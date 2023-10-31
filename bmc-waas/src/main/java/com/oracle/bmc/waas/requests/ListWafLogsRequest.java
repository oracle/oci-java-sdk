/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListWafLogsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWafLogsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ListWafLogsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    public String getWaasPolicyId() {
        return waasPolicyId;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code
     * 20}.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code
     * 20}.
     */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous paginated call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous paginated call. */
    public String getPage() {
        return page;
    }
    /**
     * A filter that matches log entries where the observed event occurred on or after a date and
     * time specified in RFC 3339 format. If unspecified, defaults to two hours before receipt of
     * the request.
     */
    private java.util.Date timeObservedGreaterThanOrEqualTo;

    /**
     * A filter that matches log entries where the observed event occurred on or after a date and
     * time specified in RFC 3339 format. If unspecified, defaults to two hours before receipt of
     * the request.
     */
    public java.util.Date getTimeObservedGreaterThanOrEqualTo() {
        return timeObservedGreaterThanOrEqualTo;
    }
    /**
     * A filter that matches log entries where the observed event occurred before a date and time,
     * specified in RFC 3339 format.
     */
    private java.util.Date timeObservedLessThan;

    /**
     * A filter that matches log entries where the observed event occurred before a date and time,
     * specified in RFC 3339 format.
     */
    public java.util.Date getTimeObservedLessThan() {
        return timeObservedLessThan;
    }
    /** A full text search for logs. */
    private String textContains;

    /** A full text search for logs. */
    public String getTextContains() {
        return textContains;
    }
    /** Filters logs by access rule key. */
    private java.util.List<String> accessRuleKey;

    /** Filters logs by access rule key. */
    public java.util.List<String> getAccessRuleKey() {
        return accessRuleKey;
    }
    /** Filters logs by Web Application Firewall action. */
    private java.util.List<Action> action;

    /** Filters logs by Web Application Firewall action. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Block("BLOCK"),
        Detect("DETECT"),
        Bypass("BYPASS"),
        Log("LOG"),
        Redirected("REDIRECTED"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };

    /** Filters logs by Web Application Firewall action. */
    public java.util.List<Action> getAction() {
        return action;
    }
    /** Filters logs by client IP address. */
    private java.util.List<String> clientAddress;

    /** Filters logs by client IP address. */
    public java.util.List<String> getClientAddress() {
        return clientAddress;
    }
    /**
     * Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list of
     * codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     */
    private java.util.List<String> countryCode;

    /**
     * Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list of
     * codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     */
    public java.util.List<String> getCountryCode() {
        return countryCode;
    }
    /** Filter logs by country name. */
    private java.util.List<String> countryName;

    /** Filter logs by country name. */
    public java.util.List<String> getCountryName() {
        return countryName;
    }
    /** Filter logs by device fingerprint. */
    private java.util.List<String> fingerprint;

    /** Filter logs by device fingerprint. */
    public java.util.List<String> getFingerprint() {
        return fingerprint;
    }
    /** Filter logs by HTTP method. */
    private java.util.List<HttpMethod> httpMethod;

    /** Filter logs by HTTP method. */
    public enum HttpMethod implements com.oracle.bmc.http.internal.BmcEnum {
        Options("OPTIONS"),
        Get("GET"),
        Head("HEAD"),
        Post("POST"),
        Put("PUT"),
        Delete("DELETE"),
        Trace("TRACE"),
        Connect("CONNECT"),
        ;

        private final String value;
        private static java.util.Map<String, HttpMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (HttpMethod v : HttpMethod.values()) {
                map.put(v.getValue(), v);
            }
        }

        HttpMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HttpMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid HttpMethod: " + key);
        }
    };

    /** Filter logs by HTTP method. */
    public java.util.List<HttpMethod> getHttpMethod() {
        return httpMethod;
    }
    /** Filter logs by incident key. */
    private java.util.List<String> incidentKey;

    /** Filter logs by incident key. */
    public java.util.List<String> getIncidentKey() {
        return incidentKey;
    }
    /**
     * Filter by log type. For more information about WAF logs, see
     * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     */
    private java.util.List<LogType> logType;

    /**
     * Filter by log type. For more information about WAF logs, see
     * [Logs](/iaas/Content/WAF/Tasks/logs.htm).
     */
    public enum LogType implements com.oracle.bmc.http.internal.BmcEnum {
        Access("ACCESS"),
        ProtectionRules("PROTECTION_RULES"),
        JsChallenge("JS_CHALLENGE"),
        Captcha("CAPTCHA"),
        AccessRules("ACCESS_RULES"),
        ThreatFeeds("THREAT_FEEDS"),
        HumanInteractionChallenge("HUMAN_INTERACTION_CHALLENGE"),
        DeviceFingerprintChallenge("DEVICE_FINGERPRINT_CHALLENGE"),
        AddressRateLimiting("ADDRESS_RATE_LIMITING"),
        ;

        private final String value;
        private static java.util.Map<String, LogType> map;

        static {
            map = new java.util.HashMap<>();
            for (LogType v : LogType.values()) {
                map.put(v.getValue(), v);
            }
        }

        LogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LogType: " + key);
        }
    };

    /**
     * Filter by log type. For more information about WAF logs, see
     * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     */
    public java.util.List<LogType> getLogType() {
        return logType;
    }
    /** Filter by origin IP address. */
    private java.util.List<String> originAddress;

    /** Filter by origin IP address. */
    public java.util.List<String> getOriginAddress() {
        return originAddress;
    }
    /** Filter by referrer. */
    private java.util.List<String> referrer;

    /** Filter by referrer. */
    public java.util.List<String> getReferrer() {
        return referrer;
    }
    /** Filter by request URL. */
    private java.util.List<String> requestUrl;

    /** Filter by request URL. */
    public java.util.List<String> getRequestUrl() {
        return requestUrl;
    }
    /** Filter by response code. */
    private java.util.List<Integer> responseCode;

    /** Filter by response code. */
    public java.util.List<Integer> getResponseCode() {
        return responseCode;
    }
    /** Filter by threat feed key. */
    private java.util.List<String> threatFeedKey;

    /** Filter by threat feed key. */
    public java.util.List<String> getThreatFeedKey() {
        return threatFeedKey;
    }
    /** Filter by user agent. */
    private java.util.List<String> userAgent;

    /** Filter by user agent. */
    public java.util.List<String> getUserAgent() {
        return userAgent;
    }
    /** Filter by protection rule key. */
    private java.util.List<String> protectionRuleKey;

    /** Filter by protection rule key. */
    public java.util.List<String> getProtectionRuleKey() {
        return protectionRuleKey;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWafLogsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS
         * policy.
         */
        private String waasPolicyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS
         * policy.
         *
         * @param waasPolicyId the value to set
         * @return this builder instance
         */
        public Builder waasPolicyId(String waasPolicyId) {
            this.waasPolicyId = waasPolicyId;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to
         * {@code 20}.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to
         * {@code 20}.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous paginated call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous paginated call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * A filter that matches log entries where the observed event occurred on or after a date
         * and time specified in RFC 3339 format. If unspecified, defaults to two hours before
         * receipt of the request.
         */
        private java.util.Date timeObservedGreaterThanOrEqualTo = null;

        /**
         * A filter that matches log entries where the observed event occurred on or after a date
         * and time specified in RFC 3339 format. If unspecified, defaults to two hours before
         * receipt of the request.
         *
         * @param timeObservedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeObservedGreaterThanOrEqualTo(
                java.util.Date timeObservedGreaterThanOrEqualTo) {
            this.timeObservedGreaterThanOrEqualTo = timeObservedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * A filter that matches log entries where the observed event occurred before a date and
         * time, specified in RFC 3339 format.
         */
        private java.util.Date timeObservedLessThan = null;

        /**
         * A filter that matches log entries where the observed event occurred before a date and
         * time, specified in RFC 3339 format.
         *
         * @param timeObservedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeObservedLessThan(java.util.Date timeObservedLessThan) {
            this.timeObservedLessThan = timeObservedLessThan;
            return this;
        }

        /** A full text search for logs. */
        private String textContains = null;

        /**
         * A full text search for logs.
         *
         * @param textContains the value to set
         * @return this builder instance
         */
        public Builder textContains(String textContains) {
            this.textContains = textContains;
            return this;
        }

        /** Filters logs by access rule key. */
        private java.util.List<String> accessRuleKey = null;

        /**
         * Filters logs by access rule key.
         *
         * @param accessRuleKey the value to set
         * @return this builder instance
         */
        public Builder accessRuleKey(java.util.List<String> accessRuleKey) {
            this.accessRuleKey = accessRuleKey;
            return this;
        }

        /**
         * Singular setter. Filters logs by access rule key.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder accessRuleKey(String singularValue) {
            return this.accessRuleKey(java.util.Arrays.asList(singularValue));
        }

        /** Filters logs by Web Application Firewall action. */
        private java.util.List<Action> action = null;

        /**
         * Filters logs by Web Application Firewall action.
         *
         * @param action the value to set
         * @return this builder instance
         */
        public Builder action(java.util.List<Action> action) {
            this.action = action;
            return this;
        }

        /**
         * Singular setter. Filters logs by Web Application Firewall action.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder action(Action singularValue) {
            return this.action(java.util.Arrays.asList(singularValue));
        }

        /** Filters logs by client IP address. */
        private java.util.List<String> clientAddress = null;

        /**
         * Filters logs by client IP address.
         *
         * @param clientAddress the value to set
         * @return this builder instance
         */
        public Builder clientAddress(java.util.List<String> clientAddress) {
            this.clientAddress = clientAddress;
            return this;
        }

        /**
         * Singular setter. Filters logs by client IP address.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder clientAddress(String singularValue) {
            return this.clientAddress(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list
         * of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
         */
        private java.util.List<String> countryCode = null;

        /**
         * Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list
         * of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
         *
         * @param countryCode the value to set
         * @return this builder instance
         */
        public Builder countryCode(java.util.List<String> countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Singular setter. Filters logs by country code. Country codes are in ISO 3166-1 alpha-2
         * format. For a list of codes, see [ISO's
         * website](https://www.iso.org/obp/ui/#search/code/).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder countryCode(String singularValue) {
            return this.countryCode(java.util.Arrays.asList(singularValue));
        }

        /** Filter logs by country name. */
        private java.util.List<String> countryName = null;

        /**
         * Filter logs by country name.
         *
         * @param countryName the value to set
         * @return this builder instance
         */
        public Builder countryName(java.util.List<String> countryName) {
            this.countryName = countryName;
            return this;
        }

        /**
         * Singular setter. Filter logs by country name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder countryName(String singularValue) {
            return this.countryName(java.util.Arrays.asList(singularValue));
        }

        /** Filter logs by device fingerprint. */
        private java.util.List<String> fingerprint = null;

        /**
         * Filter logs by device fingerprint.
         *
         * @param fingerprint the value to set
         * @return this builder instance
         */
        public Builder fingerprint(java.util.List<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * Singular setter. Filter logs by device fingerprint.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fingerprint(String singularValue) {
            return this.fingerprint(java.util.Arrays.asList(singularValue));
        }

        /** Filter logs by HTTP method. */
        private java.util.List<HttpMethod> httpMethod = null;

        /**
         * Filter logs by HTTP method.
         *
         * @param httpMethod the value to set
         * @return this builder instance
         */
        public Builder httpMethod(java.util.List<HttpMethod> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * Singular setter. Filter logs by HTTP method.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder httpMethod(HttpMethod singularValue) {
            return this.httpMethod(java.util.Arrays.asList(singularValue));
        }

        /** Filter logs by incident key. */
        private java.util.List<String> incidentKey = null;

        /**
         * Filter logs by incident key.
         *
         * @param incidentKey the value to set
         * @return this builder instance
         */
        public Builder incidentKey(java.util.List<String> incidentKey) {
            this.incidentKey = incidentKey;
            return this;
        }

        /**
         * Singular setter. Filter logs by incident key.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder incidentKey(String singularValue) {
            return this.incidentKey(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter by log type. For more information about WAF logs, see
         * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         */
        private java.util.List<LogType> logType = null;

        /**
         * Filter by log type. For more information about WAF logs, see
         * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         *
         * @param logType the value to set
         * @return this builder instance
         */
        public Builder logType(java.util.List<LogType> logType) {
            this.logType = logType;
            return this;
        }

        /**
         * Singular setter. Filter by log type. For more information about WAF logs, see
         * [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder logType(LogType singularValue) {
            return this.logType(java.util.Arrays.asList(singularValue));
        }

        /** Filter by origin IP address. */
        private java.util.List<String> originAddress = null;

        /**
         * Filter by origin IP address.
         *
         * @param originAddress the value to set
         * @return this builder instance
         */
        public Builder originAddress(java.util.List<String> originAddress) {
            this.originAddress = originAddress;
            return this;
        }

        /**
         * Singular setter. Filter by origin IP address.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder originAddress(String singularValue) {
            return this.originAddress(java.util.Arrays.asList(singularValue));
        }

        /** Filter by referrer. */
        private java.util.List<String> referrer = null;

        /**
         * Filter by referrer.
         *
         * @param referrer the value to set
         * @return this builder instance
         */
        public Builder referrer(java.util.List<String> referrer) {
            this.referrer = referrer;
            return this;
        }

        /**
         * Singular setter. Filter by referrer.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder referrer(String singularValue) {
            return this.referrer(java.util.Arrays.asList(singularValue));
        }

        /** Filter by request URL. */
        private java.util.List<String> requestUrl = null;

        /**
         * Filter by request URL.
         *
         * @param requestUrl the value to set
         * @return this builder instance
         */
        public Builder requestUrl(java.util.List<String> requestUrl) {
            this.requestUrl = requestUrl;
            return this;
        }

        /**
         * Singular setter. Filter by request URL.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder requestUrl(String singularValue) {
            return this.requestUrl(java.util.Arrays.asList(singularValue));
        }

        /** Filter by response code. */
        private java.util.List<Integer> responseCode = null;

        /**
         * Filter by response code.
         *
         * @param responseCode the value to set
         * @return this builder instance
         */
        public Builder responseCode(java.util.List<Integer> responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * Singular setter. Filter by response code.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder responseCode(Integer singularValue) {
            return this.responseCode(java.util.Arrays.asList(singularValue));
        }

        /** Filter by threat feed key. */
        private java.util.List<String> threatFeedKey = null;

        /**
         * Filter by threat feed key.
         *
         * @param threatFeedKey the value to set
         * @return this builder instance
         */
        public Builder threatFeedKey(java.util.List<String> threatFeedKey) {
            this.threatFeedKey = threatFeedKey;
            return this;
        }

        /**
         * Singular setter. Filter by threat feed key.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder threatFeedKey(String singularValue) {
            return this.threatFeedKey(java.util.Arrays.asList(singularValue));
        }

        /** Filter by user agent. */
        private java.util.List<String> userAgent = null;

        /**
         * Filter by user agent.
         *
         * @param userAgent the value to set
         * @return this builder instance
         */
        public Builder userAgent(java.util.List<String> userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /**
         * Singular setter. Filter by user agent.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder userAgent(String singularValue) {
            return this.userAgent(java.util.Arrays.asList(singularValue));
        }

        /** Filter by protection rule key. */
        private java.util.List<String> protectionRuleKey = null;

        /**
         * Filter by protection rule key.
         *
         * @param protectionRuleKey the value to set
         * @return this builder instance
         */
        public Builder protectionRuleKey(java.util.List<String> protectionRuleKey) {
            this.protectionRuleKey = protectionRuleKey;
            return this;
        }

        /**
         * Singular setter. Filter by protection rule key.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder protectionRuleKey(String singularValue) {
            return this.protectionRuleKey(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListWafLogsRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            timeObservedGreaterThanOrEqualTo(o.getTimeObservedGreaterThanOrEqualTo());
            timeObservedLessThan(o.getTimeObservedLessThan());
            textContains(o.getTextContains());
            accessRuleKey(o.getAccessRuleKey());
            action(o.getAction());
            clientAddress(o.getClientAddress());
            countryCode(o.getCountryCode());
            countryName(o.getCountryName());
            fingerprint(o.getFingerprint());
            httpMethod(o.getHttpMethod());
            incidentKey(o.getIncidentKey());
            logType(o.getLogType());
            originAddress(o.getOriginAddress());
            referrer(o.getReferrer());
            requestUrl(o.getRequestUrl());
            responseCode(o.getResponseCode());
            threatFeedKey(o.getThreatFeedKey());
            userAgent(o.getUserAgent());
            protectionRuleKey(o.getProtectionRuleKey());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWafLogsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListWafLogsRequest
         */
        public ListWafLogsRequest build() {
            ListWafLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWafLogsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWafLogsRequest
         */
        public ListWafLogsRequest buildWithoutInvocationCallback() {
            ListWafLogsRequest request = new ListWafLogsRequest();
            request.waasPolicyId = waasPolicyId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.timeObservedGreaterThanOrEqualTo = timeObservedGreaterThanOrEqualTo;
            request.timeObservedLessThan = timeObservedLessThan;
            request.textContains = textContains;
            request.accessRuleKey = accessRuleKey;
            request.action = action;
            request.clientAddress = clientAddress;
            request.countryCode = countryCode;
            request.countryName = countryName;
            request.fingerprint = fingerprint;
            request.httpMethod = httpMethod;
            request.incidentKey = incidentKey;
            request.logType = logType;
            request.originAddress = originAddress;
            request.referrer = referrer;
            request.requestUrl = requestUrl;
            request.responseCode = responseCode;
            request.threatFeedKey = threatFeedKey;
            request.userAgent = userAgent;
            request.protectionRuleKey = protectionRuleKey;
            return request;
            // new ListWafLogsRequest(waasPolicyId, opcRequestId, limit, page,
            // timeObservedGreaterThanOrEqualTo, timeObservedLessThan, textContains, accessRuleKey,
            // action, clientAddress, countryCode, countryName, fingerprint, httpMethod,
            // incidentKey, logType, originAddress, referrer, requestUrl, responseCode,
            // threatFeedKey, userAgent, protectionRuleKey);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .waasPolicyId(waasPolicyId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .timeObservedGreaterThanOrEqualTo(timeObservedGreaterThanOrEqualTo)
                .timeObservedLessThan(timeObservedLessThan)
                .textContains(textContains)
                .accessRuleKey(accessRuleKey)
                .action(action)
                .clientAddress(clientAddress)
                .countryCode(countryCode)
                .countryName(countryName)
                .fingerprint(fingerprint)
                .httpMethod(httpMethod)
                .incidentKey(incidentKey)
                .logType(logType)
                .originAddress(originAddress)
                .referrer(referrer)
                .requestUrl(requestUrl)
                .responseCode(responseCode)
                .threatFeedKey(threatFeedKey)
                .userAgent(userAgent)
                .protectionRuleKey(protectionRuleKey);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",waasPolicyId=").append(String.valueOf(this.waasPolicyId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",timeObservedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeObservedGreaterThanOrEqualTo));
        sb.append(",timeObservedLessThan=").append(String.valueOf(this.timeObservedLessThan));
        sb.append(",textContains=").append(String.valueOf(this.textContains));
        sb.append(",accessRuleKey=").append(String.valueOf(this.accessRuleKey));
        sb.append(",action=").append(String.valueOf(this.action));
        sb.append(",clientAddress=").append(String.valueOf(this.clientAddress));
        sb.append(",countryCode=").append(String.valueOf(this.countryCode));
        sb.append(",countryName=").append(String.valueOf(this.countryName));
        sb.append(",fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(",httpMethod=").append(String.valueOf(this.httpMethod));
        sb.append(",incidentKey=").append(String.valueOf(this.incidentKey));
        sb.append(",logType=").append(String.valueOf(this.logType));
        sb.append(",originAddress=").append(String.valueOf(this.originAddress));
        sb.append(",referrer=").append(String.valueOf(this.referrer));
        sb.append(",requestUrl=").append(String.valueOf(this.requestUrl));
        sb.append(",responseCode=").append(String.valueOf(this.responseCode));
        sb.append(",threatFeedKey=").append(String.valueOf(this.threatFeedKey));
        sb.append(",userAgent=").append(String.valueOf(this.userAgent));
        sb.append(",protectionRuleKey=").append(String.valueOf(this.protectionRuleKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWafLogsRequest)) {
            return false;
        }

        ListWafLogsRequest other = (ListWafLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.waasPolicyId, other.waasPolicyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.timeObservedGreaterThanOrEqualTo,
                        other.timeObservedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeObservedLessThan, other.timeObservedLessThan)
                && java.util.Objects.equals(this.textContains, other.textContains)
                && java.util.Objects.equals(this.accessRuleKey, other.accessRuleKey)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.clientAddress, other.clientAddress)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.countryName, other.countryName)
                && java.util.Objects.equals(this.fingerprint, other.fingerprint)
                && java.util.Objects.equals(this.httpMethod, other.httpMethod)
                && java.util.Objects.equals(this.incidentKey, other.incidentKey)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.originAddress, other.originAddress)
                && java.util.Objects.equals(this.referrer, other.referrer)
                && java.util.Objects.equals(this.requestUrl, other.requestUrl)
                && java.util.Objects.equals(this.responseCode, other.responseCode)
                && java.util.Objects.equals(this.threatFeedKey, other.threatFeedKey)
                && java.util.Objects.equals(this.userAgent, other.userAgent)
                && java.util.Objects.equals(this.protectionRuleKey, other.protectionRuleKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.waasPolicyId == null ? 43 : this.waasPolicyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.timeObservedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeObservedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeObservedLessThan == null
                                ? 43
                                : this.timeObservedLessThan.hashCode());
        result = (result * PRIME) + (this.textContains == null ? 43 : this.textContains.hashCode());
        result =
                (result * PRIME)
                        + (this.accessRuleKey == null ? 43 : this.accessRuleKey.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.clientAddress == null ? 43 : this.clientAddress.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result = (result * PRIME) + (this.countryName == null ? 43 : this.countryName.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.httpMethod == null ? 43 : this.httpMethod.hashCode());
        result = (result * PRIME) + (this.incidentKey == null ? 43 : this.incidentKey.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result =
                (result * PRIME)
                        + (this.originAddress == null ? 43 : this.originAddress.hashCode());
        result = (result * PRIME) + (this.referrer == null ? 43 : this.referrer.hashCode());
        result = (result * PRIME) + (this.requestUrl == null ? 43 : this.requestUrl.hashCode());
        result = (result * PRIME) + (this.responseCode == null ? 43 : this.responseCode.hashCode());
        result =
                (result * PRIME)
                        + (this.threatFeedKey == null ? 43 : this.threatFeedKey.hashCode());
        result = (result * PRIME) + (this.userAgent == null ? 43 : this.userAgent.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionRuleKey == null ? 43 : this.protectionRuleKey.hashCode());
        return result;
    }
}
