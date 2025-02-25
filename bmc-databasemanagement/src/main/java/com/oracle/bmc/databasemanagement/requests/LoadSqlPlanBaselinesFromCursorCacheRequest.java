/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/LoadSqlPlanBaselinesFromCursorCacheExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use LoadSqlPlanBaselinesFromCursorCacheRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class LoadSqlPlanBaselinesFromCursorCacheRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .LoadSqlPlanBaselinesFromCursorCacheDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The details of SQL statements and plans to be loaded from cursor cache.
     */
    private com.oracle.bmc.databasemanagement.model.LoadSqlPlanBaselinesFromCursorCacheDetails
            loadSqlPlanBaselinesFromCursorCacheDetails;

    /**
     * The details of SQL statements and plans to be loaded from cursor cache.
     */
    public com.oracle.bmc.databasemanagement.model.LoadSqlPlanBaselinesFromCursorCacheDetails
            getLoadSqlPlanBaselinesFromCursorCacheDetails() {
        return loadSqlPlanBaselinesFromCursorCacheDetails;
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
    public com.oracle.bmc.databasemanagement.model.LoadSqlPlanBaselinesFromCursorCacheDetails
            getBody$() {
        return loadSqlPlanBaselinesFromCursorCacheDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    LoadSqlPlanBaselinesFromCursorCacheRequest,
                    com.oracle.bmc.databasemanagement.model
                            .LoadSqlPlanBaselinesFromCursorCacheDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The details of SQL statements and plans to be loaded from cursor cache.
         */
        private com.oracle.bmc.databasemanagement.model.LoadSqlPlanBaselinesFromCursorCacheDetails
                loadSqlPlanBaselinesFromCursorCacheDetails = null;

        /**
         * The details of SQL statements and plans to be loaded from cursor cache.
         * @param loadSqlPlanBaselinesFromCursorCacheDetails the value to set
         * @return this builder instance
         */
        public Builder loadSqlPlanBaselinesFromCursorCacheDetails(
                com.oracle.bmc.databasemanagement.model.LoadSqlPlanBaselinesFromCursorCacheDetails
                        loadSqlPlanBaselinesFromCursorCacheDetails) {
            this.loadSqlPlanBaselinesFromCursorCacheDetails =
                    loadSqlPlanBaselinesFromCursorCacheDetails;
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
        public Builder copy(LoadSqlPlanBaselinesFromCursorCacheRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            loadSqlPlanBaselinesFromCursorCacheDetails(
                    o.getLoadSqlPlanBaselinesFromCursorCacheDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of LoadSqlPlanBaselinesFromCursorCacheRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of LoadSqlPlanBaselinesFromCursorCacheRequest
         */
        public LoadSqlPlanBaselinesFromCursorCacheRequest build() {
            LoadSqlPlanBaselinesFromCursorCacheRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.LoadSqlPlanBaselinesFromCursorCacheDetails
                        body) {
            loadSqlPlanBaselinesFromCursorCacheDetails(body);
            return this;
        }

        /**
         * Build the instance of LoadSqlPlanBaselinesFromCursorCacheRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of LoadSqlPlanBaselinesFromCursorCacheRequest
         */
        public LoadSqlPlanBaselinesFromCursorCacheRequest buildWithoutInvocationCallback() {
            LoadSqlPlanBaselinesFromCursorCacheRequest request =
                    new LoadSqlPlanBaselinesFromCursorCacheRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.loadSqlPlanBaselinesFromCursorCacheDetails =
                    loadSqlPlanBaselinesFromCursorCacheDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new LoadSqlPlanBaselinesFromCursorCacheRequest(managedDatabaseId, loadSqlPlanBaselinesFromCursorCacheDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .loadSqlPlanBaselinesFromCursorCacheDetails(
                        loadSqlPlanBaselinesFromCursorCacheDetails)
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",loadSqlPlanBaselinesFromCursorCacheDetails=")
                .append(String.valueOf(this.loadSqlPlanBaselinesFromCursorCacheDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadSqlPlanBaselinesFromCursorCacheRequest)) {
            return false;
        }

        LoadSqlPlanBaselinesFromCursorCacheRequest other =
                (LoadSqlPlanBaselinesFromCursorCacheRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.loadSqlPlanBaselinesFromCursorCacheDetails,
                        other.loadSqlPlanBaselinesFromCursorCacheDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.loadSqlPlanBaselinesFromCursorCacheDetails == null
                                ? 43
                                : this.loadSqlPlanBaselinesFromCursorCacheDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
