/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/FetchSqlTuningSetExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use FetchSqlTuningSetRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class FetchSqlTuningSetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /** The unique identifier of the Sql tuning set. This is not OCID. */
    private Integer sqlTuningSetId;

    /** The unique identifier of the Sql tuning set. This is not OCID. */
    public Integer getSqlTuningSetId() {
        return sqlTuningSetId;
    }
    /** The details required to fetch the Sql tuning set details. */
    private com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails
            fetchSqlTuningSetDetails;

    /** The details required to fetch the Sql tuning set details. */
    public com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails
            getFetchSqlTuningSetDetails() {
        return fetchSqlTuningSetDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails getBody$() {
        return fetchSqlTuningSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    FetchSqlTuningSetRequest,
                    com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /** The unique identifier of the Sql tuning set. This is not OCID. */
        private Integer sqlTuningSetId = null;

        /**
         * The unique identifier of the Sql tuning set. This is not OCID.
         *
         * @param sqlTuningSetId the value to set
         * @return this builder instance
         */
        public Builder sqlTuningSetId(Integer sqlTuningSetId) {
            this.sqlTuningSetId = sqlTuningSetId;
            return this;
        }

        /** The details required to fetch the Sql tuning set details. */
        private com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails
                fetchSqlTuningSetDetails = null;

        /**
         * The details required to fetch the Sql tuning set details.
         *
         * @param fetchSqlTuningSetDetails the value to set
         * @return this builder instance
         */
        public Builder fetchSqlTuningSetDetails(
                com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails
                        fetchSqlTuningSetDetails) {
            this.fetchSqlTuningSetDetails = fetchSqlTuningSetDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(FetchSqlTuningSetRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            sqlTuningSetId(o.getSqlTuningSetId());
            fetchSqlTuningSetDetails(o.getFetchSqlTuningSetDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of FetchSqlTuningSetRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of FetchSqlTuningSetRequest
         */
        public FetchSqlTuningSetRequest build() {
            FetchSqlTuningSetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.databasemanagement.model.FetchSqlTuningSetDetails body) {
            fetchSqlTuningSetDetails(body);
            return this;
        }

        /**
         * Build the instance of FetchSqlTuningSetRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of FetchSqlTuningSetRequest
         */
        public FetchSqlTuningSetRequest buildWithoutInvocationCallback() {
            FetchSqlTuningSetRequest request = new FetchSqlTuningSetRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.sqlTuningSetId = sqlTuningSetId;
            request.fetchSqlTuningSetDetails = fetchSqlTuningSetDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new FetchSqlTuningSetRequest(managedDatabaseId, sqlTuningSetId,
            // fetchSqlTuningSetDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .sqlTuningSetId(sqlTuningSetId)
                .fetchSqlTuningSetDetails(fetchSqlTuningSetDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",sqlTuningSetId=").append(String.valueOf(this.sqlTuningSetId));
        sb.append(",fetchSqlTuningSetDetails=")
                .append(String.valueOf(this.fetchSqlTuningSetDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchSqlTuningSetRequest)) {
            return false;
        }

        FetchSqlTuningSetRequest other = (FetchSqlTuningSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.sqlTuningSetId, other.sqlTuningSetId)
                && java.util.Objects.equals(
                        this.fetchSqlTuningSetDetails, other.fetchSqlTuningSetDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
                        + (this.sqlTuningSetId == null ? 43 : this.sqlTuningSetId.hashCode());
        result =
                (result * PRIME)
                        + (this.fetchSqlTuningSetDetails == null
                                ? 43
                                : this.fetchSqlTuningSetDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
