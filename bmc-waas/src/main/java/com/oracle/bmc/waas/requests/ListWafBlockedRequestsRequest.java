/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListWafBlockedRequestsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListWafBlockedRequestsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ListWafBlockedRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * WAAS policy.
     */
    private String waasPolicyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * WAAS policy.
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
     * A filter that limits returned events to those occurring on or after a date and time,
     * specified in RFC 3339 format. If unspecified, defaults to 30 minutes before receipt of the
     * request.
     */
    private java.util.Date timeObservedGreaterThanOrEqualTo;

    /**
     * A filter that limits returned events to those occurring on or after a date and time,
     * specified in RFC 3339 format. If unspecified, defaults to 30 minutes before receipt of the
     * request.
     */
    public java.util.Date getTimeObservedGreaterThanOrEqualTo() {
        return timeObservedGreaterThanOrEqualTo;
    }
    /**
     * A filter that limits returned events to those occurring before a date and time, specified in
     * RFC 3339 format.
     */
    private java.util.Date timeObservedLessThan;

    /**
     * A filter that limits returned events to those occurring before a date and time, specified in
     * RFC 3339 format.
     */
    public java.util.Date getTimeObservedLessThan() {
        return timeObservedLessThan;
    }
    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code
     * 10}.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated call. If unspecified, defaults to {@code
     * 10}.
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
     * Filter stats by the Web Application Firewall feature that triggered the block action. If
     * unspecified, data for all WAF features will be returned.
     */
    private java.util.List<WafFeature> wafFeature;

    /**
     * Filter stats by the Web Application Firewall feature that triggered the block action. If
     * unspecified, data for all WAF features will be returned.
     */
    public enum WafFeature implements com.oracle.bmc.http.internal.BmcEnum {
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

    /**
     * Filter stats by the Web Application Firewall feature that triggered the block action. If
     * unspecified, data for all WAF features will be returned.
     */
    public java.util.List<WafFeature> getWafFeature() {
        return wafFeature;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWafBlockedRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * WAAS policy.
         */
        private String waasPolicyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * WAAS policy.
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
         * A filter that limits returned events to those occurring on or after a date and time,
         * specified in RFC 3339 format. If unspecified, defaults to 30 minutes before receipt of
         * the request.
         */
        private java.util.Date timeObservedGreaterThanOrEqualTo = null;

        /**
         * A filter that limits returned events to those occurring on or after a date and time,
         * specified in RFC 3339 format. If unspecified, defaults to 30 minutes before receipt of
         * the request.
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
         * A filter that limits returned events to those occurring before a date and time, specified
         * in RFC 3339 format.
         */
        private java.util.Date timeObservedLessThan = null;

        /**
         * A filter that limits returned events to those occurring before a date and time, specified
         * in RFC 3339 format.
         *
         * @param timeObservedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeObservedLessThan(java.util.Date timeObservedLessThan) {
            this.timeObservedLessThan = timeObservedLessThan;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to
         * {@code 10}.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated call. If unspecified, defaults to
         * {@code 10}.
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
         * Filter stats by the Web Application Firewall feature that triggered the block action. If
         * unspecified, data for all WAF features will be returned.
         */
        private java.util.List<WafFeature> wafFeature = null;

        /**
         * Filter stats by the Web Application Firewall feature that triggered the block action. If
         * unspecified, data for all WAF features will be returned.
         *
         * @param wafFeature the value to set
         * @return this builder instance
         */
        public Builder wafFeature(java.util.List<WafFeature> wafFeature) {
            this.wafFeature = wafFeature;
            return this;
        }

        /**
         * Singular setter. Filter stats by the Web Application Firewall feature that triggered the
         * block action. If unspecified, data for all WAF features will be returned.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder wafFeature(WafFeature singularValue) {
            return this.wafFeature(java.util.Arrays.asList(singularValue));
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
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListWafBlockedRequestsRequest
         */
        public ListWafBlockedRequestsRequest build() {
            ListWafBlockedRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWafBlockedRequestsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWafBlockedRequestsRequest
         */
        public ListWafBlockedRequestsRequest buildWithoutInvocationCallback() {
            ListWafBlockedRequestsRequest request = new ListWafBlockedRequestsRequest();
            request.waasPolicyId = waasPolicyId;
            request.opcRequestId = opcRequestId;
            request.timeObservedGreaterThanOrEqualTo = timeObservedGreaterThanOrEqualTo;
            request.timeObservedLessThan = timeObservedLessThan;
            request.limit = limit;
            request.page = page;
            request.wafFeature = wafFeature;
            return request;
            // new ListWafBlockedRequestsRequest(waasPolicyId, opcRequestId,
            // timeObservedGreaterThanOrEqualTo, timeObservedLessThan, limit, page, wafFeature);
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
                .timeObservedGreaterThanOrEqualTo(timeObservedGreaterThanOrEqualTo)
                .timeObservedLessThan(timeObservedLessThan)
                .limit(limit)
                .page(page)
                .wafFeature(wafFeature);
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
        sb.append(",timeObservedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeObservedGreaterThanOrEqualTo));
        sb.append(",timeObservedLessThan=").append(String.valueOf(this.timeObservedLessThan));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",wafFeature=").append(String.valueOf(this.wafFeature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWafBlockedRequestsRequest)) {
            return false;
        }

        ListWafBlockedRequestsRequest other = (ListWafBlockedRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.waasPolicyId, other.waasPolicyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.timeObservedGreaterThanOrEqualTo,
                        other.timeObservedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeObservedLessThan, other.timeObservedLessThan)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.wafFeature, other.wafFeature);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.waasPolicyId == null ? 43 : this.waasPolicyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
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
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.wafFeature == null ? 43 : this.wafFeature.hashCode());
        return result;
    }
}
