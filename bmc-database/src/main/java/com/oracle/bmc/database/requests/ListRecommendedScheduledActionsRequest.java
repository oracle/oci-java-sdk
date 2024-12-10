/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListRecommendedScheduledActionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRecommendedScheduledActionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListRecommendedScheduledActionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Scheduling Policy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String schedulingPolicyId;

    /**
     * The Scheduling Policy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getSchedulingPolicyId() {
        return schedulingPolicyId;
    }
    /**
     * The target resource [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) the scheduled actions will be for.
     */
    private String schedulingPolicyTargetResourceId;

    /**
     * The target resource [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) the scheduled actions will be for.
     */
    public String getSchedulingPolicyTargetResourceId() {
        return schedulingPolicyTargetResourceId;
    }
    /**
     * The scheduling plan intent the scheduled actions will be for.
     */
    private PlanIntent planIntent;

    /**
     * The scheduling plan intent the scheduled actions will be for.
     **/
    public enum PlanIntent {
        ExadataInfrastructureFullSoftwareUpdate("EXADATA_INFRASTRUCTURE_FULL_SOFTWARE_UPDATE"),
        ;

        private final String value;
        private static java.util.Map<String, PlanIntent> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanIntent v : PlanIntent.values()) {
                map.put(v.getValue(), v);
            }
        }

        PlanIntent(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanIntent create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PlanIntent: " + key);
        }
    };

    /**
     * The scheduling plan intent the scheduled actions will be for.
     */
    public PlanIntent getPlanIntent() {
        return planIntent;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The maximum number of items to return per page.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * The pagination token to continue listing from.
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecommendedScheduledActionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Scheduling Policy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String schedulingPolicyId = null;

        /**
         * The Scheduling Policy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param schedulingPolicyId the value to set
         * @return this builder instance
         */
        public Builder schedulingPolicyId(String schedulingPolicyId) {
            this.schedulingPolicyId = schedulingPolicyId;
            return this;
        }

        /**
         * The target resource [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) the scheduled actions will be for.
         */
        private String schedulingPolicyTargetResourceId = null;

        /**
         * The target resource [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) the scheduled actions will be for.
         * @param schedulingPolicyTargetResourceId the value to set
         * @return this builder instance
         */
        public Builder schedulingPolicyTargetResourceId(String schedulingPolicyTargetResourceId) {
            this.schedulingPolicyTargetResourceId = schedulingPolicyTargetResourceId;
            return this;
        }

        /**
         * The scheduling plan intent the scheduled actions will be for.
         */
        private PlanIntent planIntent = null;

        /**
         * The scheduling plan intent the scheduled actions will be for.
         * @param planIntent the value to set
         * @return this builder instance
         */
        public Builder planIntent(PlanIntent planIntent) {
            this.planIntent = planIntent;
            return this;
        }

        /**
         * The maximum number of items to return per page.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token to continue listing from.
         */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
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
        public Builder copy(ListRecommendedScheduledActionsRequest o) {
            schedulingPolicyId(o.getSchedulingPolicyId());
            schedulingPolicyTargetResourceId(o.getSchedulingPolicyTargetResourceId());
            planIntent(o.getPlanIntent());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRecommendedScheduledActionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListRecommendedScheduledActionsRequest
         */
        public ListRecommendedScheduledActionsRequest build() {
            ListRecommendedScheduledActionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRecommendedScheduledActionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRecommendedScheduledActionsRequest
         */
        public ListRecommendedScheduledActionsRequest buildWithoutInvocationCallback() {
            ListRecommendedScheduledActionsRequest request =
                    new ListRecommendedScheduledActionsRequest();
            request.schedulingPolicyId = schedulingPolicyId;
            request.schedulingPolicyTargetResourceId = schedulingPolicyTargetResourceId;
            request.planIntent = planIntent;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListRecommendedScheduledActionsRequest(schedulingPolicyId, schedulingPolicyTargetResourceId, planIntent, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .schedulingPolicyId(schedulingPolicyId)
                .schedulingPolicyTargetResourceId(schedulingPolicyTargetResourceId)
                .planIntent(planIntent)
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
        sb.append(",schedulingPolicyId=").append(String.valueOf(this.schedulingPolicyId));
        sb.append(",schedulingPolicyTargetResourceId=")
                .append(String.valueOf(this.schedulingPolicyTargetResourceId));
        sb.append(",planIntent=").append(String.valueOf(this.planIntent));
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
        if (!(o instanceof ListRecommendedScheduledActionsRequest)) {
            return false;
        }

        ListRecommendedScheduledActionsRequest other = (ListRecommendedScheduledActionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.schedulingPolicyId, other.schedulingPolicyId)
                && java.util.Objects.equals(
                        this.schedulingPolicyTargetResourceId,
                        other.schedulingPolicyTargetResourceId)
                && java.util.Objects.equals(this.planIntent, other.planIntent)
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
                        + (this.schedulingPolicyId == null
                                ? 43
                                : this.schedulingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulingPolicyTargetResourceId == null
                                ? 43
                                : this.schedulingPolicyTargetResourceId.hashCode());
        result = (result * PRIME) + (this.planIntent == null ? 43 : this.planIntent.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
