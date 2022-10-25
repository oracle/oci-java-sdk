/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.requests;

import com.oracle.bmc.cloudbridge.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudbridge/ImportInventoryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ImportInventoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
public class ImportInventoryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudbridge.model.ImportInventoryDetails> {

    /**
     * The file input to create resources.
     */
    private com.oracle.bmc.cloudbridge.model.ImportInventoryDetails importInventoryDetails;

    /**
     * The file input to create resources.
     */
    public com.oracle.bmc.cloudbridge.model.ImportInventoryDetails getImportInventoryDetails() {
        return importInventoryDetails;
    }
    /**
     * Inventory OCID.
     */
    private String inventoryId;

    /**
     * Inventory OCID.
     */
    public String getInventoryId() {
        return inventoryId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing the same action again. Retry tokens expire after 24
     * hours, but can be invalidated before 24 hours due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing the same action again. Retry tokens expire after 24
     * hours, but can be invalidated before 24 hours due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.cloudbridge.model.ImportInventoryDetails getBody$() {
        return importInventoryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ImportInventoryRequest,
                    com.oracle.bmc.cloudbridge.model.ImportInventoryDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The file input to create resources.
         */
        private com.oracle.bmc.cloudbridge.model.ImportInventoryDetails importInventoryDetails =
                null;

        /**
         * The file input to create resources.
         * @param importInventoryDetails the value to set
         * @return this builder instance
         */
        public Builder importInventoryDetails(
                com.oracle.bmc.cloudbridge.model.ImportInventoryDetails importInventoryDetails) {
            this.importInventoryDetails = importInventoryDetails;
            return this;
        }

        /**
         * Inventory OCID.
         */
        private String inventoryId = null;

        /**
         * Inventory OCID.
         * @param inventoryId the value to set
         * @return this builder instance
         */
        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after 24
         * hours, but can be invalidated before 24 hours due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after 24
         * hours, but can be invalidated before 24 hours due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ImportInventoryRequest o) {
            importInventoryDetails(o.getImportInventoryDetails());
            inventoryId(o.getInventoryId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ImportInventoryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ImportInventoryRequest
         */
        public ImportInventoryRequest build() {
            ImportInventoryRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.cloudbridge.model.ImportInventoryDetails body) {
            importInventoryDetails(body);
            return this;
        }

        /**
         * Build the instance of ImportInventoryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ImportInventoryRequest
         */
        public ImportInventoryRequest buildWithoutInvocationCallback() {
            ImportInventoryRequest request = new ImportInventoryRequest();
            request.importInventoryDetails = importInventoryDetails;
            request.inventoryId = inventoryId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new ImportInventoryRequest(importInventoryDetails, inventoryId, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .importInventoryDetails(importInventoryDetails)
                .inventoryId(inventoryId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",importInventoryDetails=").append(String.valueOf(this.importInventoryDetails));
        sb.append(",inventoryId=").append(String.valueOf(this.inventoryId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportInventoryRequest)) {
            return false;
        }

        ImportInventoryRequest other = (ImportInventoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.importInventoryDetails, other.importInventoryDetails)
                && java.util.Objects.equals(this.inventoryId, other.inventoryId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.importInventoryDetails == null
                                ? 43
                                : this.importInventoryDetails.hashCode());
        result = (result * PRIME) + (this.inventoryId == null ? 43 : this.inventoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
