/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbHomePatchHistoryEntryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDbHomePatchHistoryEntryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetDbHomePatchHistoryEntryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Database Home
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String dbHomeId;

    /**
     * The Database Home
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getDbHomeId() {
        return dbHomeId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * patch history entry.
     */
    private String patchHistoryEntryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * patch history entry.
     */
    public String getPatchHistoryEntryId() {
        return patchHistoryEntryId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDbHomePatchHistoryEntryRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Database Home
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String dbHomeId = null;

        /**
         * The Database Home
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param dbHomeId the value to set
         * @return this builder instance
         */
        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * patch history entry.
         */
        private String patchHistoryEntryId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * patch history entry.
         *
         * @param patchHistoryEntryId the value to set
         * @return this builder instance
         */
        public Builder patchHistoryEntryId(String patchHistoryEntryId) {
            this.patchHistoryEntryId = patchHistoryEntryId;
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
        public Builder copy(GetDbHomePatchHistoryEntryRequest o) {
            dbHomeId(o.getDbHomeId());
            patchHistoryEntryId(o.getPatchHistoryEntryId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDbHomePatchHistoryEntryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDbHomePatchHistoryEntryRequest
         */
        public GetDbHomePatchHistoryEntryRequest build() {
            GetDbHomePatchHistoryEntryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDbHomePatchHistoryEntryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDbHomePatchHistoryEntryRequest
         */
        public GetDbHomePatchHistoryEntryRequest buildWithoutInvocationCallback() {
            GetDbHomePatchHistoryEntryRequest request = new GetDbHomePatchHistoryEntryRequest();
            request.dbHomeId = dbHomeId;
            request.patchHistoryEntryId = patchHistoryEntryId;
            return request;
            // new GetDbHomePatchHistoryEntryRequest(dbHomeId, patchHistoryEntryId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().dbHomeId(dbHomeId).patchHistoryEntryId(patchHistoryEntryId);
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
        sb.append(",dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(",patchHistoryEntryId=").append(String.valueOf(this.patchHistoryEntryId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDbHomePatchHistoryEntryRequest)) {
            return false;
        }

        GetDbHomePatchHistoryEntryRequest other = (GetDbHomePatchHistoryEntryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.patchHistoryEntryId, other.patchHistoryEntryId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result =
                (result * PRIME)
                        + (this.patchHistoryEntryId == null
                                ? 43
                                : this.patchHistoryEntryId.hashCode());
        return result;
    }
}
