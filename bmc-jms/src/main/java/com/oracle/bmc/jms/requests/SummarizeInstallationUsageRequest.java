/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeInstallationUsageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeInstallationUsageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class SummarizeInstallationUsageRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Fleet.
     */
    private String fleetId;

    /**
     * The vendor of the related Java Runtime.
     */
    private String jreVendor;

    /**
     * The distribution of the related Java Runtime.
     */
    private String jreDistribution;

    /**
     * The version of the related Java Runtime.
     */
    private String jreVersion;

    /**
     * The file system path of the installation.
     */
    private String installationPath;

    /**
     * The Fleet-unique identifier of the related application.
     */
    private String applicationId;

    /**
     * The Fleet-unique identifier of the related managed instance.
     */
    private String managedInstanceId;

    /**
     * Additional fields to include into the returned model on top of the required ones.
     * This parameter can also include 'approximateApplicationCount' and 'approximateManagedInstanceCount'.
     * For example 'approximateApplicationCount,approximateManagedInstanceCount'.
     *
     */
    private java.util.List<com.oracle.bmc.jms.model.SummarizeInstallationUsageFields> fields;

    /**
     * The start of the time period during which resources are searched (formatted according to RFC3339).
     */
    private java.util.Date timeStart;

    /**
     * The end of the time period during which resources are searched (formatted according to RFC3339).
     */
    private java.util.Date timeEnd;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The sort order, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.jms.model.SortOrder sortOrder;

    /**
     * The field to sort installation views. Only one sort order may be provided.
     * Default order for _timeFirstSeen_, _timeLastSeen_, and _jreVersion_, _approximateApplicationCount_
     * and _approximateManagedInstanceCount_  is **descending**.
     * Default order for _jreDistribution_ and _jreVendor_ is **ascending**. If no value is specified _timeLastSeen_ is default.
     *
     */
    private com.oracle.bmc.jms.model.InstallationSortBy sortBy;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeInstallationUsageRequest, java.lang.Void> {
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
        public Builder copy(SummarizeInstallationUsageRequest o) {
            fleetId(o.getFleetId());
            jreVendor(o.getJreVendor());
            jreDistribution(o.getJreDistribution());
            jreVersion(o.getJreVersion());
            installationPath(o.getInstallationPath());
            applicationId(o.getApplicationId());
            managedInstanceId(o.getManagedInstanceId());
            fields(o.getFields());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeInstallationUsageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeInstallationUsageRequest
         */
        public SummarizeInstallationUsageRequest build() {
            SummarizeInstallationUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
