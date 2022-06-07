/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.requests;

import com.oracle.bmc.cims.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cims/CreateIncidentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateIncidentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class CreateIncidentRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.cims.model.CreateIncident> {

    /**
     * Incident information
     */
    private com.oracle.bmc.cims.model.CreateIncident createIncidentDetails;

    public com.oracle.bmc.cims.model.CreateIncident getCreateIncidentDetails() {
        return createIncidentDetails;
    }
    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
     */
    private String ocid;

    public String getOcid() {
        return ocid;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The region of the tenancy.
     */
    private String homeregion;

    public String getHomeregion() {
        return homeregion;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.cims.model.CreateIncident getBody$() {
        return createIncidentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateIncidentRequest, com.oracle.bmc.cims.model.CreateIncident> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private com.oracle.bmc.cims.model.CreateIncident createIncidentDetails = null;

        /**
         * Incident information
         * @return this builder instance
         */
        public Builder createIncidentDetails(
                com.oracle.bmc.cims.model.CreateIncident createIncidentDetails) {
            this.createIncidentDetails = createIncidentDetails;
            return this;
        }

        private String ocid = null;

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
         * @return this builder instance
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String homeregion = null;

        /**
         * The region of the tenancy.
         * @return this builder instance
         */
        public Builder homeregion(String homeregion) {
            this.homeregion = homeregion;
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
        public Builder copy(CreateIncidentRequest o) {
            createIncidentDetails(o.getCreateIncidentDetails());
            ocid(o.getOcid());
            opcRequestId(o.getOpcRequestId());
            homeregion(o.getHomeregion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateIncidentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateIncidentRequest
         */
        public CreateIncidentRequest build() {
            CreateIncidentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.cims.model.CreateIncident body) {
            createIncidentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateIncidentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateIncidentRequest
         */
        public CreateIncidentRequest buildWithoutInvocationCallback() {
            CreateIncidentRequest request = new CreateIncidentRequest();
            request.createIncidentDetails = createIncidentDetails;
            request.ocid = ocid;
            request.opcRequestId = opcRequestId;
            request.homeregion = homeregion;
            return request;
            // new CreateIncidentRequest(createIncidentDetails, ocid, opcRequestId, homeregion);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .createIncidentDetails(createIncidentDetails)
                .ocid(ocid)
                .opcRequestId(opcRequestId)
                .homeregion(homeregion);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",createIncidentDetails=").append(String.valueOf(this.createIncidentDetails));
        sb.append(",ocid=").append(String.valueOf(this.ocid));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",homeregion=").append(String.valueOf(this.homeregion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIncidentRequest)) {
            return false;
        }

        CreateIncidentRequest other = (CreateIncidentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.createIncidentDetails, other.createIncidentDetails)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.homeregion, other.homeregion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createIncidentDetails == null
                                ? 43
                                : this.createIncidentDetails.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.homeregion == null ? 43 : this.homeregion.hashCode());
        return result;
    }
}
