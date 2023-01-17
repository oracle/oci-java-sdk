/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.requests;

import com.oracle.bmc.cims.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cims/UpdateIncidentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateIncidentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class UpdateIncidentRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.cims.model.UpdateIncident> {

    /**
     * Unique identifier for the support ticket.
     */
    private String incidentKey;

    /**
     * Unique identifier for the support ticket.
     */
    public String getIncidentKey() {
        return incidentKey;
    }
    /**
     * The Customer Support Identifier associated with the support account.
     */
    private String csi;

    /**
     * The Customer Support Identifier associated with the support account.
     */
    public String getCsi() {
        return csi;
    }
    /**
     * Details about the support ticket being updated.
     */
    private com.oracle.bmc.cims.model.UpdateIncident updateIncidentDetails;

    /**
     * Details about the support ticket being updated.
     */
    public com.oracle.bmc.cims.model.UpdateIncident getUpdateIncidentDetails() {
        return updateIncidentDetails;
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
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.cims.model.UpdateIncident getBody$() {
        return updateIncidentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIncidentRequest, com.oracle.bmc.cims.model.UpdateIncident> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique identifier for the support ticket.
         */
        private String incidentKey = null;

        /**
         * Unique identifier for the support ticket.
         * @param incidentKey the value to set
         * @return this builder instance
         */
        public Builder incidentKey(String incidentKey) {
            this.incidentKey = incidentKey;
            return this;
        }

        /**
         * The Customer Support Identifier associated with the support account.
         */
        private String csi = null;

        /**
         * The Customer Support Identifier associated with the support account.
         * @param csi the value to set
         * @return this builder instance
         */
        public Builder csi(String csi) {
            this.csi = csi;
            return this;
        }

        /**
         * Details about the support ticket being updated.
         */
        private com.oracle.bmc.cims.model.UpdateIncident updateIncidentDetails = null;

        /**
         * Details about the support ticket being updated.
         * @param updateIncidentDetails the value to set
         * @return this builder instance
         */
        public Builder updateIncidentDetails(
                com.oracle.bmc.cims.model.UpdateIncident updateIncidentDetails) {
            this.updateIncidentDetails = updateIncidentDetails;
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
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateIncidentRequest o) {
            incidentKey(o.getIncidentKey());
            csi(o.getCsi());
            updateIncidentDetails(o.getUpdateIncidentDetails());
            ocid(o.getOcid());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            homeregion(o.getHomeregion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIncidentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateIncidentRequest
         */
        public UpdateIncidentRequest build() {
            UpdateIncidentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.cims.model.UpdateIncident body) {
            updateIncidentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIncidentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIncidentRequest
         */
        public UpdateIncidentRequest buildWithoutInvocationCallback() {
            UpdateIncidentRequest request = new UpdateIncidentRequest();
            request.incidentKey = incidentKey;
            request.csi = csi;
            request.updateIncidentDetails = updateIncidentDetails;
            request.ocid = ocid;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.homeregion = homeregion;
            return request;
            // new UpdateIncidentRequest(incidentKey, csi, updateIncidentDetails, ocid, opcRequestId, ifMatch, homeregion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .incidentKey(incidentKey)
                .csi(csi)
                .updateIncidentDetails(updateIncidentDetails)
                .ocid(ocid)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
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
        sb.append(",incidentKey=").append(String.valueOf(this.incidentKey));
        sb.append(",csi=").append(String.valueOf(this.csi));
        sb.append(",updateIncidentDetails=").append(String.valueOf(this.updateIncidentDetails));
        sb.append(",ocid=").append(String.valueOf(this.ocid));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",homeregion=").append(String.valueOf(this.homeregion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIncidentRequest)) {
            return false;
        }

        UpdateIncidentRequest other = (UpdateIncidentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.incidentKey, other.incidentKey)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.updateIncidentDetails, other.updateIncidentDetails)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.homeregion, other.homeregion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.incidentKey == null ? 43 : this.incidentKey.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIncidentDetails == null
                                ? 43
                                : this.updateIncidentDetails.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.homeregion == null ? 43 : this.homeregion.hashCode());
        return result;
    }
}
