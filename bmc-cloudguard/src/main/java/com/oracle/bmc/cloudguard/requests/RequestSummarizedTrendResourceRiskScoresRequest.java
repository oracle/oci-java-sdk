/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/RequestSummarizedTrendResourceRiskScoresExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RequestSummarizedTrendResourceRiskScoresRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class RequestSummarizedTrendResourceRiskScoresRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails> {

    /**
     * The filter to fetch risk score trend
     */
    private com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails
            requestSummarizedTrendResourceRiskScoresDetails;

    /**
     * The filter to fetch risk score trend
     */
    public com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails
            getRequestSummarizedTrendResourceRiskScoresDetails() {
        return requestSummarizedTrendResourceRiskScoresDetails;
    }
    /**
     * The OCID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to today's current time - 30 days.
     */
    private java.util.Date timeScoreComputedGreaterThanOrEqualTo;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to today's current time - 30 days.
     */
    public java.util.Date getTimeScoreComputedGreaterThanOrEqualTo() {
        return timeScoreComputedGreaterThanOrEqualTo;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to today's current time.
     */
    private java.util.Date timeScoreComputedLessThanOrEqualTo;

    /**
     * End time for a filter. If end time is not specified, end time will be set to today's current time.
     */
    public java.util.Date getTimeScoreComputedLessThanOrEqualTo() {
        return timeScoreComputedLessThanOrEqualTo;
    }
    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the setting of {@code accessLevel}.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * returned depending on the setting of {@code accessLevel}.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     **/
    public enum AccessLevel {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment).
     * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
     *
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * The maximum number of items to return
     */
    private Integer limit;

    /**
     * The maximum number of items to return
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails
            getBody$() {
        return requestSummarizedTrendResourceRiskScoresDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestSummarizedTrendResourceRiskScoresRequest,
                    com.oracle.bmc.cloudguard.model
                            .RequestSummarizedTrendResourceRiskScoresDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The filter to fetch risk score trend
         */
        private com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails
                requestSummarizedTrendResourceRiskScoresDetails = null;

        /**
         * The filter to fetch risk score trend
         * @param requestSummarizedTrendResourceRiskScoresDetails the value to set
         * @return this builder instance
         */
        public Builder requestSummarizedTrendResourceRiskScoresDetails(
                com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails
                        requestSummarizedTrendResourceRiskScoresDetails) {
            this.requestSummarizedTrendResourceRiskScoresDetails =
                    requestSummarizedTrendResourceRiskScoresDetails;
            return this;
        }

        /**
         * The OCID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Start time for a filter. If start time is not specified, start time will be set to today's current time - 30 days.
         */
        private java.util.Date timeScoreComputedGreaterThanOrEqualTo = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to today's current time - 30 days.
         * @param timeScoreComputedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeScoreComputedGreaterThanOrEqualTo(
                java.util.Date timeScoreComputedGreaterThanOrEqualTo) {
            this.timeScoreComputedGreaterThanOrEqualTo = timeScoreComputedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * End time for a filter. If end time is not specified, end time will be set to today's current time.
         */
        private java.util.Date timeScoreComputedLessThanOrEqualTo = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to today's current time.
         * @param timeScoreComputedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeScoreComputedLessThanOrEqualTo(
                java.util.Date timeScoreComputedLessThanOrEqualTo) {
            this.timeScoreComputedLessThanOrEqualTo = timeScoreComputedLessThanOrEqualTo;
            return this;
        }

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed
         * and all compartments and subcompartments in the tenancy are
         * returned depending on the setting of {@code accessLevel}.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed
         * and all compartments and subcompartments in the tenancy are
         * returned depending on the setting of {@code accessLevel}.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
         * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment).
         * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
         *
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
         * Setting this to {@code ACCESSIBLE} returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment).
         * When set to {@code RESTRICTED} permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * The maximum number of items to return
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
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
        public Builder copy(RequestSummarizedTrendResourceRiskScoresRequest o) {
            requestSummarizedTrendResourceRiskScoresDetails(
                    o.getRequestSummarizedTrendResourceRiskScoresDetails());
            compartmentId(o.getCompartmentId());
            timeScoreComputedGreaterThanOrEqualTo(o.getTimeScoreComputedGreaterThanOrEqualTo());
            timeScoreComputedLessThanOrEqualTo(o.getTimeScoreComputedLessThanOrEqualTo());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestSummarizedTrendResourceRiskScoresRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RequestSummarizedTrendResourceRiskScoresRequest
         */
        public RequestSummarizedTrendResourceRiskScoresRequest build() {
            RequestSummarizedTrendResourceRiskScoresRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.cloudguard.model.RequestSummarizedTrendResourceRiskScoresDetails
                        body) {
            requestSummarizedTrendResourceRiskScoresDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestSummarizedTrendResourceRiskScoresRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestSummarizedTrendResourceRiskScoresRequest
         */
        public RequestSummarizedTrendResourceRiskScoresRequest buildWithoutInvocationCallback() {
            RequestSummarizedTrendResourceRiskScoresRequest request =
                    new RequestSummarizedTrendResourceRiskScoresRequest();
            request.requestSummarizedTrendResourceRiskScoresDetails =
                    requestSummarizedTrendResourceRiskScoresDetails;
            request.compartmentId = compartmentId;
            request.timeScoreComputedGreaterThanOrEqualTo = timeScoreComputedGreaterThanOrEqualTo;
            request.timeScoreComputedLessThanOrEqualTo = timeScoreComputedLessThanOrEqualTo;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestSummarizedTrendResourceRiskScoresRequest(requestSummarizedTrendResourceRiskScoresDetails, compartmentId, timeScoreComputedGreaterThanOrEqualTo, timeScoreComputedLessThanOrEqualTo, compartmentIdInSubtree, accessLevel, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .requestSummarizedTrendResourceRiskScoresDetails(
                        requestSummarizedTrendResourceRiskScoresDetails)
                .compartmentId(compartmentId)
                .timeScoreComputedGreaterThanOrEqualTo(timeScoreComputedGreaterThanOrEqualTo)
                .timeScoreComputedLessThanOrEqualTo(timeScoreComputedLessThanOrEqualTo)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",requestSummarizedTrendResourceRiskScoresDetails=")
                .append(String.valueOf(this.requestSummarizedTrendResourceRiskScoresDetails));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",timeScoreComputedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeScoreComputedGreaterThanOrEqualTo));
        sb.append(",timeScoreComputedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeScoreComputedLessThanOrEqualTo));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedTrendResourceRiskScoresRequest)) {
            return false;
        }

        RequestSummarizedTrendResourceRiskScoresRequest other =
                (RequestSummarizedTrendResourceRiskScoresRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestSummarizedTrendResourceRiskScoresDetails,
                        other.requestSummarizedTrendResourceRiskScoresDetails)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.timeScoreComputedGreaterThanOrEqualTo,
                        other.timeScoreComputedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeScoreComputedLessThanOrEqualTo,
                        other.timeScoreComputedLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestSummarizedTrendResourceRiskScoresDetails == null
                                ? 43
                                : this.requestSummarizedTrendResourceRiskScoresDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScoreComputedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeScoreComputedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScoreComputedLessThanOrEqualTo == null
                                ? 43
                                : this.timeScoreComputedLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
