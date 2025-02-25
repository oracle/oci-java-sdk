/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/BulkCreateSensitiveTypesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use BulkCreateSensitiveTypesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class BulkCreateSensitiveTypesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * Details to upload a sensitive types file and create all.
     */
    private java.io.InputStream bulkCreateSensitiveTypesDetails;

    /**
     * Details to upload a sensitive types file and create all.
     */
    public java.io.InputStream getBulkCreateSensitiveTypesDetails() {
        return bulkCreateSensitiveTypesDetails;
    }
    /**
     * A header param to create bulk resources in the specified compartment OCID.
     */
    private String opcCompartmentId;

    /**
     * A header param to create bulk resources in the specified compartment OCID.
     */
    public String getOpcCompartmentId() {
        return opcCompartmentId;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return bulkCreateSensitiveTypesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkCreateSensitiveTypesRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details to upload a sensitive types file and create all.
         */
        private java.io.InputStream bulkCreateSensitiveTypesDetails = null;

        /**
         * Details to upload a sensitive types file and create all.
         * @param bulkCreateSensitiveTypesDetails the value to set
         * @return this builder instance
         */
        public Builder bulkCreateSensitiveTypesDetails(
                java.io.InputStream bulkCreateSensitiveTypesDetails) {
            this.bulkCreateSensitiveTypesDetails = bulkCreateSensitiveTypesDetails;
            return this;
        }

        /**
         * A header param to create bulk resources in the specified compartment OCID.
         */
        private String opcCompartmentId = null;

        /**
         * A header param to create bulk resources in the specified compartment OCID.
         * @param opcCompartmentId the value to set
         * @return this builder instance
         */
        public Builder opcCompartmentId(String opcCompartmentId) {
            this.opcCompartmentId = opcCompartmentId;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(BulkCreateSensitiveTypesRequest o) {
            bulkCreateSensitiveTypesDetails(o.getBulkCreateSensitiveTypesDetails());
            opcCompartmentId(o.getOpcCompartmentId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkCreateSensitiveTypesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of BulkCreateSensitiveTypesRequest
         */
        public BulkCreateSensitiveTypesRequest build() {
            BulkCreateSensitiveTypesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            bulkCreateSensitiveTypesDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkCreateSensitiveTypesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkCreateSensitiveTypesRequest
         */
        public BulkCreateSensitiveTypesRequest buildWithoutInvocationCallback() {
            BulkCreateSensitiveTypesRequest request = new BulkCreateSensitiveTypesRequest();
            request.bulkCreateSensitiveTypesDetails = bulkCreateSensitiveTypesDetails;
            request.opcCompartmentId = opcCompartmentId;
            request.opcRequestId = opcRequestId;
            return request;
            // new BulkCreateSensitiveTypesRequest(bulkCreateSensitiveTypesDetails, opcCompartmentId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bulkCreateSensitiveTypesDetails(bulkCreateSensitiveTypesDetails)
                .opcCompartmentId(opcCompartmentId)
                .opcRequestId(opcRequestId);
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
        sb.append(",bulkCreateSensitiveTypesDetails=")
                .append(String.valueOf(this.bulkCreateSensitiveTypesDetails));
        sb.append(",opcCompartmentId=").append(String.valueOf(this.opcCompartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreateSensitiveTypesRequest)) {
            return false;
        }

        BulkCreateSensitiveTypesRequest other = (BulkCreateSensitiveTypesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.bulkCreateSensitiveTypesDetails, other.bulkCreateSensitiveTypesDetails)
                && java.util.Objects.equals(this.opcCompartmentId, other.opcCompartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bulkCreateSensitiveTypesDetails == null
                                ? 43
                                : this.bulkCreateSensitiveTypesDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcCompartmentId == null ? 43 : this.opcCompartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
