/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdatePrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdatePrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdatePrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails> {

    /** The Object Storage namespace used for the request. */
    private String namespaceName;

    /** The Object Storage namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the private endpoint. Avoid entering confidential information. Example: {@code
     * my-new-pe-1}
     */
    private String peName;

    /**
     * The name of the private endpoint. Avoid entering confidential information. Example: {@code
     * my-new-pe-1}
     */
    public String getPeName() {
        return peName;
    }
    /** Request object for updating the Private Endpoint. */
    private com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails
            updatePrivateEndpointDetails;

    /** Request object for updating the Private Endpoint. */
    public com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails
            getUpdatePrivateEndpointDetails() {
        return updatePrivateEndpointDetails;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails getBody$() {
        return updatePrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePrivateEndpointRequest,
                    com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Object Storage namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the private endpoint. Avoid entering confidential information. Example:
         * {@code my-new-pe-1}
         */
        private String peName = null;

        /**
         * The name of the private endpoint. Avoid entering confidential information. Example:
         * {@code my-new-pe-1}
         *
         * @param peName the value to set
         * @return this builder instance
         */
        public Builder peName(String peName) {
            this.peName = peName;
            return this;
        }

        /** Request object for updating the Private Endpoint. */
        private com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails
                updatePrivateEndpointDetails = null;

        /**
         * Request object for updating the Private Endpoint.
         *
         * @param updatePrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder updatePrivateEndpointDetails(
                com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails
                        updatePrivateEndpointDetails) {
            this.updatePrivateEndpointDetails = updatePrivateEndpointDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         */
        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
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
        public Builder copy(UpdatePrivateEndpointRequest o) {
            namespaceName(o.getNamespaceName());
            peName(o.getPeName());
            updatePrivateEndpointDetails(o.getUpdatePrivateEndpointDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePrivateEndpointRequest
         */
        public UpdatePrivateEndpointRequest build() {
            UpdatePrivateEndpointRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.objectstorage.model.UpdatePrivateEndpointDetails body) {
            updatePrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePrivateEndpointRequest
         */
        public UpdatePrivateEndpointRequest buildWithoutInvocationCallback() {
            UpdatePrivateEndpointRequest request = new UpdatePrivateEndpointRequest();
            request.namespaceName = namespaceName;
            request.peName = peName;
            request.updatePrivateEndpointDetails = updatePrivateEndpointDetails;
            request.opcClientRequestId = opcClientRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePrivateEndpointRequest(namespaceName, peName, updatePrivateEndpointDetails,
            // opcClientRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .peName(peName)
                .updatePrivateEndpointDetails(updatePrivateEndpointDetails)
                .opcClientRequestId(opcClientRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",peName=").append(String.valueOf(this.peName));
        sb.append(",updatePrivateEndpointDetails=")
                .append(String.valueOf(this.updatePrivateEndpointDetails));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePrivateEndpointRequest)) {
            return false;
        }

        UpdatePrivateEndpointRequest other = (UpdatePrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.peName, other.peName)
                && java.util.Objects.equals(
                        this.updatePrivateEndpointDetails, other.updatePrivateEndpointDetails)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.peName == null ? 43 : this.peName.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePrivateEndpointDetails == null
                                ? 43
                                : this.updatePrivateEndpointDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
