/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListWafLogsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWafLogsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListWafLogsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 20}.
     */
    private Integer limit;

    /**
     * The value of the {@code opc-next-page} response header from the previous paginated call.
     */
    private String page;

    /**
     * A filter that matches log entries where the observed event occurred on or after a date and time specified in RFC 3339 format. If unspecified, defaults to two hours before receipt of the request.
     */
    private java.util.Date timeObservedGreaterThanOrEqualTo;

    /**
     * A filter that matches log entries where the observed event occurred before a date and time, specified in RFC 3339 format.
     */
    private java.util.Date timeObservedLessThan;

    /**
     * A full text search for logs.
     */
    private String textContains;

    /**
     * Filters logs by access rule key.
     */
    private java.util.List<String> accessRuleKey;

    /**
     * Filters logs by Web Application Firewall action.
     */
    private java.util.List<Action> action;

    /**
     * Filters logs by Web Application Firewall action.
     **/
    public enum Action {
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
    /**
     * Filters logs by client IP address.
     */
    private java.util.List<String> clientAddress;

    /**
     * Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     */
    private java.util.List<String> countryCode;

    /**
     * Filter logs by country name.
     */
    private java.util.List<String> countryName;

    /**
     * Filter logs by device fingerprint.
     */
    private java.util.List<String> fingerprint;

    /**
     * Filter logs by HTTP method.
     */
    private java.util.List<HttpMethod> httpMethod;

    /**
     * Filter logs by HTTP method.
     **/
    public enum HttpMethod {
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
    /**
     * Filter logs by incident key.
     */
    private java.util.List<String> incidentKey;

    /**
     * Filter by log type. For more information about WAF logs, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
     */
    private java.util.List<LogType> logType;

    /**
     * Filter by log type. For more information about WAF logs, see [Logs](/iaas/Content/WAF/Tasks/logs.htm).
     **/
    public enum LogType {
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
     * Filter by origin IP address.
     */
    private java.util.List<String> originAddress;

    /**
     * Filter by referrer.
     */
    private java.util.List<String> referrer;

    /**
     * Filter by request URL.
     */
    private java.util.List<String> requestUrl;

    /**
     * Filter by response code.
     */
    private java.util.List<Integer> responseCode;

    /**
     * Filter by threat feed key.
     */
    private java.util.List<String> threatFeedKey;

    /**
     * Filter by user agent.
     */
    private java.util.List<String> userAgent;

    /**
     * Filter by protection rule key.
     */
    private java.util.List<String> protectionRuleKey;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWafLogsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> accessRuleKey = null;

        /**
         * Filters logs by access rule key.
         * @return this builder instance
         */
        public Builder accessRuleKey(java.util.List<String> accessRuleKey) {
            this.accessRuleKey = accessRuleKey;
            return this;
        }

        /**
         * Singular setter. Filters logs by access rule key.
         * @return this builder instance
         */
        public Builder accessRuleKey(String singularValue) {
            return this.accessRuleKey(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<Action> action = null;

        /**
         * Filters logs by Web Application Firewall action.
         * @return this builder instance
         */
        public Builder action(java.util.List<Action> action) {
            this.action = action;
            return this;
        }

        /**
         * Singular setter. Filters logs by Web Application Firewall action.
         * @return this builder instance
         */
        public Builder action(Action singularValue) {
            return this.action(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> clientAddress = null;

        /**
         * Filters logs by client IP address.
         * @return this builder instance
         */
        public Builder clientAddress(java.util.List<String> clientAddress) {
            this.clientAddress = clientAddress;
            return this;
        }

        /**
         * Singular setter. Filters logs by client IP address.
         * @return this builder instance
         */
        public Builder clientAddress(String singularValue) {
            return this.clientAddress(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> countryCode = null;

        /**
         * Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
         * @return this builder instance
         */
        public Builder countryCode(java.util.List<String> countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Singular setter. Filters logs by country code. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
         * @return this builder instance
         */
        public Builder countryCode(String singularValue) {
            return this.countryCode(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> countryName = null;

        /**
         * Filter logs by country name.
         * @return this builder instance
         */
        public Builder countryName(java.util.List<String> countryName) {
            this.countryName = countryName;
            return this;
        }

        /**
         * Singular setter. Filter logs by country name.
         * @return this builder instance
         */
        public Builder countryName(String singularValue) {
            return this.countryName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> fingerprint = null;

        /**
         * Filter logs by device fingerprint.
         * @return this builder instance
         */
        public Builder fingerprint(java.util.List<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * Singular setter. Filter logs by device fingerprint.
         * @return this builder instance
         */
        public Builder fingerprint(String singularValue) {
            return this.fingerprint(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<HttpMethod> httpMethod = null;

        /**
         * Filter logs by HTTP method.
         * @return this builder instance
         */
        public Builder httpMethod(java.util.List<HttpMethod> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        /**
         * Singular setter. Filter logs by HTTP method.
         * @return this builder instance
         */
        public Builder httpMethod(HttpMethod singularValue) {
            return this.httpMethod(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> incidentKey = null;

        /**
         * Filter logs by incident key.
         * @return this builder instance
         */
        public Builder incidentKey(java.util.List<String> incidentKey) {
            this.incidentKey = incidentKey;
            return this;
        }

        /**
         * Singular setter. Filter logs by incident key.
         * @return this builder instance
         */
        public Builder incidentKey(String singularValue) {
            return this.incidentKey(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<LogType> logType = null;

        /**
         * Filter by log type. For more information about WAF logs, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         * @return this builder instance
         */
        public Builder logType(java.util.List<LogType> logType) {
            this.logType = logType;
            return this;
        }

        /**
         * Singular setter. Filter by log type. For more information about WAF logs, see [Logs](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/logs.htm).
         * @return this builder instance
         */
        public Builder logType(LogType singularValue) {
            return this.logType(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> originAddress = null;

        /**
         * Filter by origin IP address.
         * @return this builder instance
         */
        public Builder originAddress(java.util.List<String> originAddress) {
            this.originAddress = originAddress;
            return this;
        }

        /**
         * Singular setter. Filter by origin IP address.
         * @return this builder instance
         */
        public Builder originAddress(String singularValue) {
            return this.originAddress(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> referrer = null;

        /**
         * Filter by referrer.
         * @return this builder instance
         */
        public Builder referrer(java.util.List<String> referrer) {
            this.referrer = referrer;
            return this;
        }

        /**
         * Singular setter. Filter by referrer.
         * @return this builder instance
         */
        public Builder referrer(String singularValue) {
            return this.referrer(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> requestUrl = null;

        /**
         * Filter by request URL.
         * @return this builder instance
         */
        public Builder requestUrl(java.util.List<String> requestUrl) {
            this.requestUrl = requestUrl;
            return this;
        }

        /**
         * Singular setter. Filter by request URL.
         * @return this builder instance
         */
        public Builder requestUrl(String singularValue) {
            return this.requestUrl(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<Integer> responseCode = null;

        /**
         * Filter by response code.
         * @return this builder instance
         */
        public Builder responseCode(java.util.List<Integer> responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * Singular setter. Filter by response code.
         * @return this builder instance
         */
        public Builder responseCode(Integer singularValue) {
            return this.responseCode(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> threatFeedKey = null;

        /**
         * Filter by threat feed key.
         * @return this builder instance
         */
        public Builder threatFeedKey(java.util.List<String> threatFeedKey) {
            this.threatFeedKey = threatFeedKey;
            return this;
        }

        /**
         * Singular setter. Filter by threat feed key.
         * @return this builder instance
         */
        public Builder threatFeedKey(String singularValue) {
            return this.threatFeedKey(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> userAgent = null;

        /**
         * Filter by user agent.
         * @return this builder instance
         */
        public Builder userAgent(java.util.List<String> userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        /**
         * Singular setter. Filter by user agent.
         * @return this builder instance
         */
        public Builder userAgent(String singularValue) {
            return this.userAgent(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> protectionRuleKey = null;

        /**
         * Filter by protection rule key.
         * @return this builder instance
         */
        public Builder protectionRuleKey(java.util.List<String> protectionRuleKey) {
            this.protectionRuleKey = protectionRuleKey;
            return this;
        }

        /**
         * Singular setter. Filter by protection rule key.
         * @return this builder instance
         */
        public Builder protectionRuleKey(String singularValue) {
            return this.protectionRuleKey(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWafLogsRequest
         */
        public ListWafLogsRequest build() {
            ListWafLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
