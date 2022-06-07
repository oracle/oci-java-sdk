/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/SummarizeManagementAgentCountsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeManagementAgentCountsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class SummarizeManagementAgentCountsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment to which a request will be scoped.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The field by which to group Management Agents. Currently, only one groupBy dimension is supported at a time.
     */
    private java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy> groupBy;

    public java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy>
            getGroupBy() {
        return groupBy;
    }
    /**
     * When set to true then agents that have at least one plugin deployed will be returned. When set to false only agents that have no plugins deployed will be returned.
     */
    private Boolean hasPlugins;

    public Boolean getHasPlugins() {
        return hasPlugins;
    }
    /**
     * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
     */
    private com.oracle.bmc.managementagent.model.InstallTypes installType;

    public com.oracle.bmc.managementagent.model.InstallTypes getInstallType() {
        return installType;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeManagementAgentCountsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The OCID of the compartment to which a request will be scoped.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy>
                groupBy = null;

        /**
         * The field by which to group Management Agents. Currently, only one groupBy dimension is supported at a time.
         * @return this builder instance
         */
        public Builder groupBy(
                java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy>
                        groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Singular setter. The field by which to group Management Agents. Currently, only one groupBy dimension is supported at a time.
         * @return this builder instance
         */
        public Builder groupBy(ManagementAgentGroupBy singularValue) {
            return this.groupBy(java.util.Arrays.asList(singularValue));
        }

        private Boolean hasPlugins = null;

        /**
         * When set to true then agents that have at least one plugin deployed will be returned. When set to false only agents that have no plugins deployed will be returned.
         * @return this builder instance
         */
        public Builder hasPlugins(Boolean hasPlugins) {
            this.hasPlugins = hasPlugins;
            return this;
        }

        private com.oracle.bmc.managementagent.model.InstallTypes installType = null;

        /**
         * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
         * @return this builder instance
         */
        public Builder installType(com.oracle.bmc.managementagent.model.InstallTypes installType) {
            this.installType = installType;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(SummarizeManagementAgentCountsRequest o) {
            compartmentId(o.getCompartmentId());
            groupBy(o.getGroupBy());
            hasPlugins(o.getHasPlugins());
            installType(o.getInstallType());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeManagementAgentCountsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeManagementAgentCountsRequest
         */
        public SummarizeManagementAgentCountsRequest build() {
            SummarizeManagementAgentCountsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeManagementAgentCountsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeManagementAgentCountsRequest
         */
        public SummarizeManagementAgentCountsRequest buildWithoutInvocationCallback() {
            SummarizeManagementAgentCountsRequest request =
                    new SummarizeManagementAgentCountsRequest();
            request.compartmentId = compartmentId;
            request.groupBy = groupBy;
            request.hasPlugins = hasPlugins;
            request.installType = installType;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeManagementAgentCountsRequest(compartmentId, groupBy, hasPlugins, installType, page, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .groupBy(groupBy)
                .hasPlugins(hasPlugins)
                .installType(installType)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",hasPlugins=").append(String.valueOf(this.hasPlugins));
        sb.append(",installType=").append(String.valueOf(this.installType));
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
        if (!(o instanceof SummarizeManagementAgentCountsRequest)) {
            return false;
        }

        SummarizeManagementAgentCountsRequest other = (SummarizeManagementAgentCountsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.hasPlugins, other.hasPlugins)
                && java.util.Objects.equals(this.installType, other.installType)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.hasPlugins == null ? 43 : this.hasPlugins.hashCode());
        result = (result * PRIME) + (this.installType == null ? 43 : this.installType.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
