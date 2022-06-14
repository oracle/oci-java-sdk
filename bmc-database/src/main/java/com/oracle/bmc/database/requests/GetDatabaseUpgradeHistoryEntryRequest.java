/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDatabaseUpgradeHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDatabaseUpgradeHistoryEntryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetDatabaseUpgradeHistoryEntryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String databaseId;

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDatabaseId() {
        return databaseId;
    }
    /**
     * The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String upgradeHistoryEntryId;

    /**
     * The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getUpgradeHistoryEntryId() {
        return upgradeHistoryEntryId;
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
                    GetDatabaseUpgradeHistoryEntryRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String databaseId = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String upgradeHistoryEntryId = null;

        /**
         * The database/db system upgrade History [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param upgradeHistoryEntryId the value to set
         * @return this builder instance
         */
        public Builder upgradeHistoryEntryId(String upgradeHistoryEntryId) {
            this.upgradeHistoryEntryId = upgradeHistoryEntryId;
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
        public Builder copy(GetDatabaseUpgradeHistoryEntryRequest o) {
            databaseId(o.getDatabaseId());
            upgradeHistoryEntryId(o.getUpgradeHistoryEntryId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDatabaseUpgradeHistoryEntryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseUpgradeHistoryEntryRequest
         */
        public GetDatabaseUpgradeHistoryEntryRequest build() {
            GetDatabaseUpgradeHistoryEntryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDatabaseUpgradeHistoryEntryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDatabaseUpgradeHistoryEntryRequest
         */
        public GetDatabaseUpgradeHistoryEntryRequest buildWithoutInvocationCallback() {
            GetDatabaseUpgradeHistoryEntryRequest request =
                    new GetDatabaseUpgradeHistoryEntryRequest();
            request.databaseId = databaseId;
            request.upgradeHistoryEntryId = upgradeHistoryEntryId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDatabaseUpgradeHistoryEntryRequest(databaseId, upgradeHistoryEntryId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseId(databaseId)
                .upgradeHistoryEntryId(upgradeHistoryEntryId)
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
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",upgradeHistoryEntryId=").append(String.valueOf(this.upgradeHistoryEntryId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDatabaseUpgradeHistoryEntryRequest)) {
            return false;
        }

        GetDatabaseUpgradeHistoryEntryRequest other = (GetDatabaseUpgradeHistoryEntryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.upgradeHistoryEntryId, other.upgradeHistoryEntryId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeHistoryEntryId == null
                                ? 43
                                : this.upgradeHistoryEntryId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
