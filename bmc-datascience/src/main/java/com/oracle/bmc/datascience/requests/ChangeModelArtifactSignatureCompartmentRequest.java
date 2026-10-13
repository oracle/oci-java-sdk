/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ChangeModelArtifactSignatureCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeModelArtifactSignatureCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class ChangeModelArtifactSignatureCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails> {

    /** Details for changing the compartment of a model artifact signature. */
    private com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails
            changeModelArtifactSignatureCompartmentDetails;

    /** Details for changing the compartment of a model artifact signature. */
    public com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails
            getChangeModelArtifactSignatureCompartmentDetails() {
        return changeModelArtifactSignatureCompartmentDetails;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model.
     */
    private String modelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model.
     */
    public String getModelId() {
        return modelId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model artifact signature.
     */
    private String artifactSignatureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model artifact signature.
     */
    public String getArtifactSignatureId() {
        return artifactSignatureId;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails
            getBody$() {
        return changeModelArtifactSignatureCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeModelArtifactSignatureCompartmentRequest,
                    com.oracle.bmc.datascience.model
                            .ChangeModelArtifactSignatureCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for changing the compartment of a model artifact signature. */
        private com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails
                changeModelArtifactSignatureCompartmentDetails = null;

        /**
         * Details for changing the compartment of a model artifact signature.
         *
         * @param changeModelArtifactSignatureCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeModelArtifactSignatureCompartmentDetails(
                com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails
                        changeModelArtifactSignatureCompartmentDetails) {
            this.changeModelArtifactSignatureCompartmentDetails =
                    changeModelArtifactSignatureCompartmentDetails;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model.
         */
        private String modelId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model.
         *
         * @param modelId the value to set
         * @return this builder instance
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model artifact signature.
         */
        private String artifactSignatureId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model artifact signature.
         *
         * @param artifactSignatureId the value to set
         * @return this builder instance
         */
        public Builder artifactSignatureId(String artifactSignatureId) {
            this.artifactSignatureId = artifactSignatureId;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeModelArtifactSignatureCompartmentRequest o) {
            changeModelArtifactSignatureCompartmentDetails(
                    o.getChangeModelArtifactSignatureCompartmentDetails());
            modelId(o.getModelId());
            artifactSignatureId(o.getArtifactSignatureId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeModelArtifactSignatureCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeModelArtifactSignatureCompartmentRequest
         */
        public ChangeModelArtifactSignatureCompartmentRequest build() {
            ChangeModelArtifactSignatureCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.datascience.model.ChangeModelArtifactSignatureCompartmentDetails
                        body) {
            changeModelArtifactSignatureCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeModelArtifactSignatureCompartmentRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeModelArtifactSignatureCompartmentRequest
         */
        public ChangeModelArtifactSignatureCompartmentRequest buildWithoutInvocationCallback() {
            ChangeModelArtifactSignatureCompartmentRequest request =
                    new ChangeModelArtifactSignatureCompartmentRequest();
            request.changeModelArtifactSignatureCompartmentDetails =
                    changeModelArtifactSignatureCompartmentDetails;
            request.modelId = modelId;
            request.artifactSignatureId = artifactSignatureId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // ChangeModelArtifactSignatureCompartmentRequest(changeModelArtifactSignatureCompartmentDetails, modelId, artifactSignatureId, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .changeModelArtifactSignatureCompartmentDetails(
                        changeModelArtifactSignatureCompartmentDetails)
                .modelId(modelId)
                .artifactSignatureId(artifactSignatureId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",changeModelArtifactSignatureCompartmentDetails=")
                .append(String.valueOf(this.changeModelArtifactSignatureCompartmentDetails));
        sb.append(",modelId=").append(String.valueOf(this.modelId));
        sb.append(",artifactSignatureId=").append(String.valueOf(this.artifactSignatureId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeModelArtifactSignatureCompartmentRequest)) {
            return false;
        }

        ChangeModelArtifactSignatureCompartmentRequest other =
                (ChangeModelArtifactSignatureCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.changeModelArtifactSignatureCompartmentDetails,
                        other.changeModelArtifactSignatureCompartmentDetails)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.artifactSignatureId, other.artifactSignatureId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.changeModelArtifactSignatureCompartmentDetails == null
                                ? 43
                                : this.changeModelArtifactSignatureCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactSignatureId == null
                                ? 43
                                : this.artifactSignatureId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
