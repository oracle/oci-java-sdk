/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetNamespaceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetNamespaceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetNamespaceRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) or the compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
     *
     */
    private String compartmentId;

    /**
     * This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) or the compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetNamespaceRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The client request ID for tracing.
         */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) or the compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
         *
         */
        private String compartmentId = null;

        /**
         * This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) or the compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
        public Builder copy(GetNamespaceRequest o) {
            opcClientRequestId(o.getOpcClientRequestId());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetNamespaceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetNamespaceRequest
         */
        public GetNamespaceRequest build() {
            GetNamespaceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetNamespaceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetNamespaceRequest
         */
        public GetNamespaceRequest buildWithoutInvocationCallback() {
            GetNamespaceRequest request = new GetNamespaceRequest();
            request.opcClientRequestId = opcClientRequestId;
            request.compartmentId = compartmentId;
            return request;
            // new GetNamespaceRequest(opcClientRequestId, compartmentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().opcClientRequestId(opcClientRequestId).compartmentId(compartmentId);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetNamespaceRequest)) {
            return false;
        }

        GetNamespaceRequest other = (GetNamespaceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
