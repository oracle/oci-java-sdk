/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetMaintenanceRunExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMaintenanceRunRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetMaintenanceRunRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The maintenance run OCID.
     */
    private String maintenanceRunId;

    /**
     * The maintenance run OCID.
     */
    public String getMaintenanceRunId() {
        return maintenanceRunId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMaintenanceRunRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The maintenance run OCID.
         */
        private String maintenanceRunId = null;

        /**
         * The maintenance run OCID.
         * @param maintenanceRunId the value to set
         * @return this builder instance
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            this.maintenanceRunId = maintenanceRunId;
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
        public Builder copy(GetMaintenanceRunRequest o) {
            maintenanceRunId(o.getMaintenanceRunId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMaintenanceRunRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMaintenanceRunRequest
         */
        public GetMaintenanceRunRequest build() {
            GetMaintenanceRunRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMaintenanceRunRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMaintenanceRunRequest
         */
        public GetMaintenanceRunRequest buildWithoutInvocationCallback() {
            GetMaintenanceRunRequest request = new GetMaintenanceRunRequest();
            request.maintenanceRunId = maintenanceRunId;
            return request;
            // new GetMaintenanceRunRequest(maintenanceRunId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().maintenanceRunId(maintenanceRunId);
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
        sb.append(",maintenanceRunId=").append(String.valueOf(this.maintenanceRunId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaintenanceRunRequest)) {
            return false;
        }

        GetMaintenanceRunRequest other = (GetMaintenanceRunRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maintenanceRunId, other.maintenanceRunId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maintenanceRunId == null ? 43 : this.maintenanceRunId.hashCode());
        return result;
    }
}
