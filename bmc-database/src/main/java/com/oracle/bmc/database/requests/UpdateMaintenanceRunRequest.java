/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateMaintenanceRunExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMaintenanceRunRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateMaintenanceRunRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateMaintenanceRunDetails> {

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
    /**
     * Request to update the properties of a maintenance run.
     */
    private com.oracle.bmc.database.model.UpdateMaintenanceRunDetails updateMaintenanceRunDetails;

    /**
     * Request to update the properties of a maintenance run.
     */
    public com.oracle.bmc.database.model.UpdateMaintenanceRunDetails
            getUpdateMaintenanceRunDetails() {
        return updateMaintenanceRunDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.UpdateMaintenanceRunDetails getBody$() {
        return updateMaintenanceRunDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMaintenanceRunRequest,
                    com.oracle.bmc.database.model.UpdateMaintenanceRunDetails> {
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
         * Request to update the properties of a maintenance run.
         */
        private com.oracle.bmc.database.model.UpdateMaintenanceRunDetails
                updateMaintenanceRunDetails = null;

        /**
         * Request to update the properties of a maintenance run.
         * @param updateMaintenanceRunDetails the value to set
         * @return this builder instance
         */
        public Builder updateMaintenanceRunDetails(
                com.oracle.bmc.database.model.UpdateMaintenanceRunDetails
                        updateMaintenanceRunDetails) {
            this.updateMaintenanceRunDetails = updateMaintenanceRunDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateMaintenanceRunRequest o) {
            maintenanceRunId(o.getMaintenanceRunId());
            updateMaintenanceRunDetails(o.getUpdateMaintenanceRunDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMaintenanceRunRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateMaintenanceRunRequest
         */
        public UpdateMaintenanceRunRequest build() {
            UpdateMaintenanceRunRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.UpdateMaintenanceRunDetails body) {
            updateMaintenanceRunDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMaintenanceRunRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMaintenanceRunRequest
         */
        public UpdateMaintenanceRunRequest buildWithoutInvocationCallback() {
            UpdateMaintenanceRunRequest request = new UpdateMaintenanceRunRequest();
            request.maintenanceRunId = maintenanceRunId;
            request.updateMaintenanceRunDetails = updateMaintenanceRunDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateMaintenanceRunRequest(maintenanceRunId, updateMaintenanceRunDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maintenanceRunId(maintenanceRunId)
                .updateMaintenanceRunDetails(updateMaintenanceRunDetails)
                .ifMatch(ifMatch);
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
        sb.append(",updateMaintenanceRunDetails=")
                .append(String.valueOf(this.updateMaintenanceRunDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMaintenanceRunRequest)) {
            return false;
        }

        UpdateMaintenanceRunRequest other = (UpdateMaintenanceRunRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maintenanceRunId, other.maintenanceRunId)
                && java.util.Objects.equals(
                        this.updateMaintenanceRunDetails, other.updateMaintenanceRunDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maintenanceRunId == null ? 43 : this.maintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMaintenanceRunDetails == null
                                ? 43
                                : this.updateMaintenanceRunDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
