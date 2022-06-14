/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.requests;

import com.oracle.bmc.cims.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cims/ValidateUserExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ValidateUserRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class ValidateUserRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Customer Support Identifier number for the support account.
     */
    private String csi;

    /**
     * The Customer Support Identifier number for the support account.
     */
    public String getCsi() {
        return csi;
    }
    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
     */
    private String ocid;

    /**
     * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
     */
    public String getOcid() {
        return ocid;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The kind of support request.
     */
    private String problemType;

    /**
     * The kind of support request.
     */
    public String getProblemType() {
        return problemType;
    }
    /**
     * The region of the tenancy.
     */
    private String homeregion;

    /**
     * The region of the tenancy.
     */
    public String getHomeregion() {
        return homeregion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateUserRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Customer Support Identifier number for the support account.
         */
        private String csi = null;

        /**
         * The Customer Support Identifier number for the support account.
         * @param csi the value to set
         * @return this builder instance
         */
        public Builder csi(String csi) {
            this.csi = csi;
            return this;
        }

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
         */
        private String ocid = null;

        /**
         * User OCID for Oracle Identity Cloud Service (IDCS) users who also have a federated Oracle Cloud Infrastructure account.
         * @param ocid the value to set
         * @return this builder instance
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The kind of support request.
         */
        private String problemType = null;

        /**
         * The kind of support request.
         * @param problemType the value to set
         * @return this builder instance
         */
        public Builder problemType(String problemType) {
            this.problemType = problemType;
            return this;
        }

        /**
         * The region of the tenancy.
         */
        private String homeregion = null;

        /**
         * The region of the tenancy.
         * @param homeregion the value to set
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
        public Builder copy(ValidateUserRequest o) {
            csi(o.getCsi());
            ocid(o.getOcid());
            opcRequestId(o.getOpcRequestId());
            problemType(o.getProblemType());
            homeregion(o.getHomeregion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateUserRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ValidateUserRequest
         */
        public ValidateUserRequest build() {
            ValidateUserRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ValidateUserRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateUserRequest
         */
        public ValidateUserRequest buildWithoutInvocationCallback() {
            ValidateUserRequest request = new ValidateUserRequest();
            request.csi = csi;
            request.ocid = ocid;
            request.opcRequestId = opcRequestId;
            request.problemType = problemType;
            request.homeregion = homeregion;
            return request;
            // new ValidateUserRequest(csi, ocid, opcRequestId, problemType, homeregion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .csi(csi)
                .ocid(ocid)
                .opcRequestId(opcRequestId)
                .problemType(problemType)
                .homeregion(homeregion);
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
        sb.append(",csi=").append(String.valueOf(this.csi));
        sb.append(",ocid=").append(String.valueOf(this.ocid));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",problemType=").append(String.valueOf(this.problemType));
        sb.append(",homeregion=").append(String.valueOf(this.homeregion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateUserRequest)) {
            return false;
        }

        ValidateUserRequest other = (ValidateUserRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && java.util.Objects.equals(this.homeregion, other.homeregion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result = (result * PRIME) + (this.homeregion == null ? 43 : this.homeregion.hashCode());
        return result;
    }
}
