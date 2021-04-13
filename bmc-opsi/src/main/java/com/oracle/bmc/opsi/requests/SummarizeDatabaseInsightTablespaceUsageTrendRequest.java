/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightTablespaceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeDatabaseInsightTablespaceUsageTrendRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class SummarizeDatabaseInsightTablespaceUsageTrendRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * Specify time period in ISO 8601 format with respect to current time.
     * Default is last 30 days represented by P30D.
     * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
     * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
     *
     */
    private String analysisTimeInterval;

    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together.
     * If analysisTimeInterval is specified, this parameter is ignored.
     *
     */
    private java.util.Date timeIntervalStart;

    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd are used together.
     * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     *
     */
    private java.util.Date timeIntervalEnd;

    /**
     * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    private String databaseId;

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     *
     */
    private String id;

    /**
     * For list pagination. The value of the `opc-next-page` response header from
     * the previous \"List\" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated \"List\" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: `50`
     *
     */
    private Integer limit;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest, java.lang.Void> {
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
        public Builder copy(SummarizeDatabaseInsightTablespaceUsageTrendRequest o) {
            compartmentId(o.getCompartmentId());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            databaseId(o.getDatabaseId());
            id(o.getId());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeDatabaseInsightTablespaceUsageTrendRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeDatabaseInsightTablespaceUsageTrendRequest
         */
        public SummarizeDatabaseInsightTablespaceUsageTrendRequest build() {
            SummarizeDatabaseInsightTablespaceUsageTrendRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
