/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSecurityPolicyEntryStatesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSecurityPolicyEntryStatesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSecurityPolicyEntryStatesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the security policy deployment resource.
     */
    private String securityPolicyDeploymentId;

    /**
     * The OCID of the security policy deployment resource.
     */
    public String getSecurityPolicyDeploymentId() {
        return securityPolicyDeploymentId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * The current state of the security policy deployment.
     */
    private com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateDeploymentStatus deploymentStatus;

    /**
     * The current state of the security policy deployment.
     */
    public com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateDeploymentStatus
            getDeploymentStatus() {
        return deploymentStatus;
    }
    /**
     * An optional filter to return only resources that match the specified security policy entry OCID.
     */
    private String securityPolicyEntryId;

    /**
     * An optional filter to return only resources that match the specified security policy entry OCID.
     */
    public String getSecurityPolicyEntryId() {
        return securityPolicyEntryId;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSecurityPolicyEntryStatesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the security policy deployment resource.
         */
        private String securityPolicyDeploymentId = null;

        /**
         * The OCID of the security policy deployment resource.
         * @param securityPolicyDeploymentId the value to set
         * @return this builder instance
         */
        public Builder securityPolicyDeploymentId(String securityPolicyDeploymentId) {
            this.securityPolicyDeploymentId = securityPolicyDeploymentId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The current state of the security policy deployment.
         */
        private com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateDeploymentStatus
                deploymentStatus = null;

        /**
         * The current state of the security policy deployment.
         * @param deploymentStatus the value to set
         * @return this builder instance
         */
        public Builder deploymentStatus(
                com.oracle.bmc.datasafe.model.SecurityPolicyEntryStateDeploymentStatus
                        deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * An optional filter to return only resources that match the specified security policy entry OCID.
         */
        private String securityPolicyEntryId = null;

        /**
         * An optional filter to return only resources that match the specified security policy entry OCID.
         * @param securityPolicyEntryId the value to set
         * @return this builder instance
         */
        public Builder securityPolicyEntryId(String securityPolicyEntryId) {
            this.securityPolicyEntryId = securityPolicyEntryId;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ListSecurityPolicyEntryStatesRequest o) {
            securityPolicyDeploymentId(o.getSecurityPolicyDeploymentId());
            limit(o.getLimit());
            page(o.getPage());
            deploymentStatus(o.getDeploymentStatus());
            securityPolicyEntryId(o.getSecurityPolicyEntryId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSecurityPolicyEntryStatesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSecurityPolicyEntryStatesRequest
         */
        public ListSecurityPolicyEntryStatesRequest build() {
            ListSecurityPolicyEntryStatesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSecurityPolicyEntryStatesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSecurityPolicyEntryStatesRequest
         */
        public ListSecurityPolicyEntryStatesRequest buildWithoutInvocationCallback() {
            ListSecurityPolicyEntryStatesRequest request =
                    new ListSecurityPolicyEntryStatesRequest();
            request.securityPolicyDeploymentId = securityPolicyDeploymentId;
            request.limit = limit;
            request.page = page;
            request.deploymentStatus = deploymentStatus;
            request.securityPolicyEntryId = securityPolicyEntryId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSecurityPolicyEntryStatesRequest(securityPolicyDeploymentId, limit, page, deploymentStatus, securityPolicyEntryId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityPolicyDeploymentId(securityPolicyDeploymentId)
                .limit(limit)
                .page(page)
                .deploymentStatus(deploymentStatus)
                .securityPolicyEntryId(securityPolicyEntryId)
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
        sb.append(",securityPolicyDeploymentId=")
                .append(String.valueOf(this.securityPolicyDeploymentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",deploymentStatus=").append(String.valueOf(this.deploymentStatus));
        sb.append(",securityPolicyEntryId=").append(String.valueOf(this.securityPolicyEntryId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSecurityPolicyEntryStatesRequest)) {
            return false;
        }

        ListSecurityPolicyEntryStatesRequest other = (ListSecurityPolicyEntryStatesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.securityPolicyDeploymentId, other.securityPolicyDeploymentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.deploymentStatus, other.deploymentStatus)
                && java.util.Objects.equals(this.securityPolicyEntryId, other.securityPolicyEntryId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityPolicyDeploymentId == null
                                ? 43
                                : this.securityPolicyDeploymentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentStatus == null ? 43 : this.deploymentStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPolicyEntryId == null
                                ? 43
                                : this.securityPolicyEntryId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
