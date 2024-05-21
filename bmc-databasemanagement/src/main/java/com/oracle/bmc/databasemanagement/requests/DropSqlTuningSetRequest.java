/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/DropSqlTuningSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DropSqlTuningSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DropSqlTuningSetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The unique identifier of the Sql tuning set. This is not OCID.
     */
    private Integer sqlTuningSetId;

    /**
     * The unique identifier of the Sql tuning set. This is not OCID.
     */
    public Integer getSqlTuningSetId() {
        return sqlTuningSetId;
    }
    /**
     * The details required to drop a Sql tuning set.
     */
    private com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails dropSqlTuningSetDetails;

    /**
     * The details required to drop a Sql tuning set.
     */
    public com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails
            getDropSqlTuningSetDetails() {
        return dropSqlTuningSetDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails getBody$() {
        return dropSqlTuningSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DropSqlTuningSetRequest,
                    com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The unique identifier of the Sql tuning set. This is not OCID.
         */
        private Integer sqlTuningSetId = null;

        /**
         * The unique identifier of the Sql tuning set. This is not OCID.
         * @param sqlTuningSetId the value to set
         * @return this builder instance
         */
        public Builder sqlTuningSetId(Integer sqlTuningSetId) {
            this.sqlTuningSetId = sqlTuningSetId;
            return this;
        }

        /**
         * The details required to drop a Sql tuning set.
         */
        private com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails
                dropSqlTuningSetDetails = null;

        /**
         * The details required to drop a Sql tuning set.
         * @param dropSqlTuningSetDetails the value to set
         * @return this builder instance
         */
        public Builder dropSqlTuningSetDetails(
                com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails
                        dropSqlTuningSetDetails) {
            this.dropSqlTuningSetDetails = dropSqlTuningSetDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
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
        public Builder copy(DropSqlTuningSetRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            sqlTuningSetId(o.getSqlTuningSetId());
            dropSqlTuningSetDetails(o.getDropSqlTuningSetDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DropSqlTuningSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DropSqlTuningSetRequest
         */
        public DropSqlTuningSetRequest build() {
            DropSqlTuningSetRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.databasemanagement.model.DropSqlTuningSetDetails body) {
            dropSqlTuningSetDetails(body);
            return this;
        }

        /**
         * Build the instance of DropSqlTuningSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DropSqlTuningSetRequest
         */
        public DropSqlTuningSetRequest buildWithoutInvocationCallback() {
            DropSqlTuningSetRequest request = new DropSqlTuningSetRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.sqlTuningSetId = sqlTuningSetId;
            request.dropSqlTuningSetDetails = dropSqlTuningSetDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new DropSqlTuningSetRequest(managedDatabaseId, sqlTuningSetId, dropSqlTuningSetDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .sqlTuningSetId(sqlTuningSetId)
                .dropSqlTuningSetDetails(dropSqlTuningSetDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",sqlTuningSetId=").append(String.valueOf(this.sqlTuningSetId));
        sb.append(",dropSqlTuningSetDetails=").append(String.valueOf(this.dropSqlTuningSetDetails));
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
        if (!(o instanceof DropSqlTuningSetRequest)) {
            return false;
        }

        DropSqlTuningSetRequest other = (DropSqlTuningSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.sqlTuningSetId, other.sqlTuningSetId)
                && java.util.Objects.equals(
                        this.dropSqlTuningSetDetails, other.dropSqlTuningSetDetails)
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
                        + (this.dropSqlTuningSetDetails == null
                                ? 43
                                : this.dropSqlTuningSetDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
