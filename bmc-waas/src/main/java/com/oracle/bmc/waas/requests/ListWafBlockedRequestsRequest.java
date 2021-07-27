/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListWafBlockedRequestsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWafBlockedRequestsRequest.
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
public class ListWafBlockedRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * A filter that limits returned events to those occurring on or after a date and time, specified in RFC 3339 format. If unspecified, defaults to 30 minutes before receipt of the request.
     */
    private java.util.Date timeObservedGreaterThanOrEqualTo;

    /**
     * A filter that limits returned events to those occurring before a date and time, specified in RFC 3339 format.
     */
    private java.util.Date timeObservedLessThan;

    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code 10}.
     */
    private Integer limit;

    /**
     * The value of the {@code opc-next-page} response header from the previous paginated call.
     */
    private String page;

    /**
     * Filter stats by the Web Application Firewall feature that triggered the block action. If unspecified, data for all WAF features will be returned.
     */
    private java.util.List<WafFeature> wafFeature;

    /**
     * Filter stats by the Web Application Firewall feature that triggered the block action. If unspecified, data for all WAF features will be returned.
     **/
    public enum WafFeature {
        ProtectionRules("PROTECTION_RULES"),
        JsChallenge("JS_CHALLENGE"),
        AccessRules("ACCESS_RULES"),
        ThreatFeeds("THREAT_FEEDS"),
        HumanInteractionChallenge("HUMAN_INTERACTION_CHALLENGE"),
        DeviceFingerprintChallenge("DEVICE_FINGERPRINT_CHALLENGE"),
        Captcha("CAPTCHA"),
        AddressRateLimiting("ADDRESS_RATE_LIMITING"),
        ;

        private final String value;
        private static java.util.Map<String, WafFeature> map;

        static {
            map = new java.util.HashMap<>();
            for (WafFeature v : WafFeature.values()) {
                map.put(v.getValue(), v);
            }
        }

        WafFeature(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WafFeature create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WafFeature: " + key);
        }
    };

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWafBlockedRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(ListWafBlockedRequestsRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            opcRequestId(o.getOpcRequestId());
            timeObservedGreaterThanOrEqualTo(o.getTimeObservedGreaterThanOrEqualTo());
            timeObservedLessThan(o.getTimeObservedLessThan());
            limit(o.getLimit());
            page(o.getPage());
            wafFeature(o.getWafFeature());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWafBlockedRequestsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWafBlockedRequestsRequest
         */
        public ListWafBlockedRequestsRequest build() {
            ListWafBlockedRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
