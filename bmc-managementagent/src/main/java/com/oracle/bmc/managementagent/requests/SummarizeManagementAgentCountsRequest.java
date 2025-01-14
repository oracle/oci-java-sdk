/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/SummarizeManagementAgentCountsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeManagementAgentCountsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class SummarizeManagementAgentCountsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment to which a request will be scoped. */
    private String compartmentId;

    /** The OCID of the compartment to which a request will be scoped. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The field by which to group Management Agents. Currently, only one groupBy dimension is
     * supported at a time.
     */
    private java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy> groupBy;

    /**
     * The field by which to group Management Agents. Currently, only one groupBy dimension is
     * supported at a time.
     */
    public java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy>
            getGroupBy() {
        return groupBy;
    }
    /**
     * When set to true then agents that have at least one plugin deployed will be returned. When
     * set to false only agents that have no plugins deployed will be returned.
     */
    private Boolean hasPlugins;

    /**
     * When set to true then agents that have at least one plugin deployed will be returned. When
     * set to false only agents that have no plugins deployed will be returned.
     */
    public Boolean getHasPlugins() {
        return hasPlugins;
    }
    /**
     * A filter to return either agents or gateway types depending upon install type selected by
     * user. By default both install type will be returned.
     */
    private com.oracle.bmc.managementagent.model.InstallTypes installType;

    /**
     * A filter to return either agents or gateway types depending upon install type selected by
     * user. By default both install type will be returned.
     */
    public com.oracle.bmc.managementagent.model.InstallTypes getInstallType() {
        return installType;
    }
    /**
     * if set to true then it fetches resources for all compartments where user has access to else
     * only on the compartment specified.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * if set to true then it fetches resources for all compartments where user has access to else
     * only on the compartment specified.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeManagementAgentCountsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment to which a request will be scoped. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment to which a request will be scoped.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The field by which to group Management Agents. Currently, only one groupBy dimension is
         * supported at a time.
         */
        private java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy>
                groupBy = null;

        /**
         * The field by which to group Management Agents. Currently, only one groupBy dimension is
         * supported at a time.
         *
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(
                java.util.List<com.oracle.bmc.managementagent.model.ManagementAgentGroupBy>
                        groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Singular setter. The field by which to group Management Agents. Currently, only one
         * groupBy dimension is supported at a time.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder groupBy(ManagementAgentGroupBy singularValue) {
            return this.groupBy(java.util.Arrays.asList(singularValue));
        }

        /**
         * When set to true then agents that have at least one plugin deployed will be returned.
         * When set to false only agents that have no plugins deployed will be returned.
         */
        private Boolean hasPlugins = null;

        /**
         * When set to true then agents that have at least one plugin deployed will be returned.
         * When set to false only agents that have no plugins deployed will be returned.
         *
         * @param hasPlugins the value to set
         * @return this builder instance
         */
        public Builder hasPlugins(Boolean hasPlugins) {
            this.hasPlugins = hasPlugins;
            return this;
        }

        /**
         * A filter to return either agents or gateway types depending upon install type selected by
         * user. By default both install type will be returned.
         */
        private com.oracle.bmc.managementagent.model.InstallTypes installType = null;

        /**
         * A filter to return either agents or gateway types depending upon install type selected by
         * user. By default both install type will be returned.
         *
         * @param installType the value to set
         * @return this builder instance
         */
        public Builder installType(com.oracle.bmc.managementagent.model.InstallTypes installType) {
            this.installType = installType;
            return this;
        }

        /**
         * if set to true then it fetches resources for all compartments where user has access to
         * else only on the compartment specified.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * if set to true then it fetches resources for all compartments where user has access to
         * else only on the compartment specified.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(SummarizeManagementAgentCountsRequest o) {
            compartmentId(o.getCompartmentId());
            groupBy(o.getGroupBy());
            hasPlugins(o.getHasPlugins());
            installType(o.getInstallType());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeManagementAgentCountsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
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
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
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
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeManagementAgentCountsRequest(compartmentId, groupBy, hasPlugins,
            // installType, compartmentIdInSubtree, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .groupBy(groupBy)
                .hasPlugins(hasPlugins)
                .installType(installType)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .page(page)
                .opcRequestId(opcRequestId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",hasPlugins=").append(String.valueOf(this.hasPlugins));
        sb.append(",installType=").append(String.valueOf(this.installType));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
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
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
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
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
