/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ListRecommendationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRecommendationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ListRecommendationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS
     * policy.
     */
    private String waasPolicyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS
     * policy.
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
     * A filter that matches recommended protection rules based on the selected action. If
     * unspecified, rules with any action type are returned.
     */
    private RecommendedAction recommendedAction;

    /**
     * A filter that matches recommended protection rules based on the selected action. If
     * unspecified, rules with any action type are returned.
     */
    public enum RecommendedAction implements com.oracle.bmc.http.internal.BmcEnum {
        Detect("DETECT"),
        Block("BLOCK"),
        ;

        private final String value;
        private static java.util.Map<String, RecommendedAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RecommendedAction v : RecommendedAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        RecommendedAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecommendedAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RecommendedAction: " + key);
        }
    };

    /**
     * A filter that matches recommended protection rules based on the selected action. If
     * unspecified, rules with any action type are returned.
     */
    public RecommendedAction getRecommendedAction() {
        return recommendedAction;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecommendationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WAAS policy.
         */
        private String waasPolicyId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * A filter that matches recommended protection rules based on the selected action. If
         * unspecified, rules with any action type are returned.
         */
        private RecommendedAction recommendedAction = null;

        /**
         * A filter that matches recommended protection rules based on the selected action. If
         * unspecified, rules with any action type are returned.
         *
         * @param recommendedAction the value to set
         * @return this builder instance
         */
        public Builder recommendedAction(RecommendedAction recommendedAction) {
            this.recommendedAction = recommendedAction;
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
        public Builder copy(ListRecommendationsRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            opcRequestId(o.getOpcRequestId());
            recommendedAction(o.getRecommendedAction());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRecommendationsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRecommendationsRequest
         */
        public ListRecommendationsRequest build() {
            ListRecommendationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRecommendationsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRecommendationsRequest
         */
        public ListRecommendationsRequest buildWithoutInvocationCallback() {
            ListRecommendationsRequest request = new ListRecommendationsRequest();
            request.waasPolicyId = waasPolicyId;
            request.opcRequestId = opcRequestId;
            request.recommendedAction = recommendedAction;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListRecommendationsRequest(waasPolicyId, opcRequestId, recommendedAction, limit,
            // page);
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
                .recommendedAction(recommendedAction)
                .limit(limit)
                .page(page);
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
        sb.append(",recommendedAction=").append(String.valueOf(this.recommendedAction));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRecommendationsRequest)) {
            return false;
        }

        ListRecommendationsRequest other = (ListRecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.waasPolicyId, other.waasPolicyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.recommendedAction, other.recommendedAction)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.waasPolicyId == null ? 43 : this.waasPolicyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedAction == null ? 43 : this.recommendedAction.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
