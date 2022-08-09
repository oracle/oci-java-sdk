/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetMaintenanceRunHistoryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMaintenanceRunHistoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetMaintenanceRunHistoryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The maintenance run history OCID.
     */
    private String maintenanceRunHistoryId;

    /**
     * The maintenance run history OCID.
     */
    public String getMaintenanceRunHistoryId() {
        return maintenanceRunHistoryId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMaintenanceRunHistoryRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The maintenance run history OCID.
         */
        private String maintenanceRunHistoryId = null;

        /**
         * The maintenance run history OCID.
         * @param maintenanceRunHistoryId the value to set
         * @return this builder instance
         */
        public Builder maintenanceRunHistoryId(String maintenanceRunHistoryId) {
            this.maintenanceRunHistoryId = maintenanceRunHistoryId;
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
        public Builder copy(GetMaintenanceRunHistoryRequest o) {
            maintenanceRunHistoryId(o.getMaintenanceRunHistoryId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMaintenanceRunHistoryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMaintenanceRunHistoryRequest
         */
        public GetMaintenanceRunHistoryRequest build() {
            GetMaintenanceRunHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMaintenanceRunHistoryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMaintenanceRunHistoryRequest
         */
        public GetMaintenanceRunHistoryRequest buildWithoutInvocationCallback() {
            GetMaintenanceRunHistoryRequest request = new GetMaintenanceRunHistoryRequest();
            request.maintenanceRunHistoryId = maintenanceRunHistoryId;
            return request;
            // new GetMaintenanceRunHistoryRequest(maintenanceRunHistoryId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().maintenanceRunHistoryId(maintenanceRunHistoryId);
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
        sb.append(",maintenanceRunHistoryId=").append(String.valueOf(this.maintenanceRunHistoryId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaintenanceRunHistoryRequest)) {
            return false;
        }

        GetMaintenanceRunHistoryRequest other = (GetMaintenanceRunHistoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.maintenanceRunHistoryId, other.maintenanceRunHistoryId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maintenanceRunHistoryId == null
                                ? 43
                                : this.maintenanceRunHistoryId.hashCode());
        return result;
    }
}
