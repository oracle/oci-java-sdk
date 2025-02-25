/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetConsoleConnectionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetConsoleConnectionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetConsoleConnectionRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The database node [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String dbNodeId;

    /**
     * The database node [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getDbNodeId() {
        return dbNodeId;
    }
    /**
     * The OCID of the console connection.
     */
    private String consoleConnectionId;

    /**
     * The OCID of the console connection.
     */
    public String getConsoleConnectionId() {
        return consoleConnectionId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetConsoleConnectionRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database node [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String dbNodeId = null;

        /**
         * The database node [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param dbNodeId the value to set
         * @return this builder instance
         */
        public Builder dbNodeId(String dbNodeId) {
            this.dbNodeId = dbNodeId;
            return this;
        }

        /**
         * The OCID of the console connection.
         */
        private String consoleConnectionId = null;

        /**
         * The OCID of the console connection.
         * @param consoleConnectionId the value to set
         * @return this builder instance
         */
        public Builder consoleConnectionId(String consoleConnectionId) {
            this.consoleConnectionId = consoleConnectionId;
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
        public Builder copy(GetConsoleConnectionRequest o) {
            dbNodeId(o.getDbNodeId());
            consoleConnectionId(o.getConsoleConnectionId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetConsoleConnectionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetConsoleConnectionRequest
         */
        public GetConsoleConnectionRequest build() {
            GetConsoleConnectionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetConsoleConnectionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetConsoleConnectionRequest
         */
        public GetConsoleConnectionRequest buildWithoutInvocationCallback() {
            GetConsoleConnectionRequest request = new GetConsoleConnectionRequest();
            request.dbNodeId = dbNodeId;
            request.consoleConnectionId = consoleConnectionId;
            return request;
            // new GetConsoleConnectionRequest(dbNodeId, consoleConnectionId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().dbNodeId(dbNodeId).consoleConnectionId(consoleConnectionId);
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
        sb.append(",dbNodeId=").append(String.valueOf(this.dbNodeId));
        sb.append(",consoleConnectionId=").append(String.valueOf(this.consoleConnectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetConsoleConnectionRequest)) {
            return false;
        }

        GetConsoleConnectionRequest other = (GetConsoleConnectionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbNodeId, other.dbNodeId)
                && java.util.Objects.equals(this.consoleConnectionId, other.consoleConnectionId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbNodeId == null ? 43 : this.dbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.consoleConnectionId == null
                                ? 43
                                : this.consoleConnectionId.hashCode());
        return result;
    }
}
