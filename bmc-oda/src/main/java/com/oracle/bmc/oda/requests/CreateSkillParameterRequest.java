/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateSkillParameterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateSkillParameterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateSkillParameterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.CreateSkillParameterDetails> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Unique Skill identifier. */
    private String skillId;

    /** Unique Skill identifier. */
    public String getSkillId() {
        return skillId;
    }
    /** Property values for creating the new Skill Parameter. */
    private com.oracle.bmc.oda.model.CreateSkillParameterDetails createSkillParameterDetails;

    /** Property values for creating the new Skill Parameter. */
    public com.oracle.bmc.oda.model.CreateSkillParameterDetails getCreateSkillParameterDetails() {
        return createSkillParameterDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that you can retry the request if there's a
     * timeout or server error without the risk of executing that same action again.
     *
     * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so that you can retry the request if there's a
     * timeout or server error without the risk of executing that same action again.
     *
     * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
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
    public com.oracle.bmc.oda.model.CreateSkillParameterDetails getBody$() {
        return createSkillParameterDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateSkillParameterRequest,
                    com.oracle.bmc.oda.model.CreateSkillParameterDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /** Unique Skill identifier. */
        private String skillId = null;

        /**
         * Unique Skill identifier.
         *
         * @param skillId the value to set
         * @return this builder instance
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        /** Property values for creating the new Skill Parameter. */
        private com.oracle.bmc.oda.model.CreateSkillParameterDetails createSkillParameterDetails =
                null;

        /**
         * Property values for creating the new Skill Parameter.
         *
         * @param createSkillParameterDetails the value to set
         * @return this builder instance
         */
        public Builder createSkillParameterDetails(
                com.oracle.bmc.oda.model.CreateSkillParameterDetails createSkillParameterDetails) {
            this.createSkillParameterDetails = createSkillParameterDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's a
         * timeout or server error without the risk of executing that same action again.
         *
         * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there
         * are conflicting operations. For example, if an instance was deleted and purged from the
         * system, then the service might reject a retry of the original creation request.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's a
         * timeout or server error without the risk of executing that same action again.
         *
         * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there
         * are conflicting operations. For example, if an instance was deleted and purged from the
         * system, then the service might reject a retry of the original creation request.
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
        public Builder copy(CreateSkillParameterRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            skillId(o.getSkillId());
            createSkillParameterDetails(o.getCreateSkillParameterDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateSkillParameterRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateSkillParameterRequest
         */
        public CreateSkillParameterRequest build() {
            CreateSkillParameterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.CreateSkillParameterDetails body) {
            createSkillParameterDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateSkillParameterRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateSkillParameterRequest
         */
        public CreateSkillParameterRequest buildWithoutInvocationCallback() {
            CreateSkillParameterRequest request = new CreateSkillParameterRequest();
            request.odaInstanceId = odaInstanceId;
            request.skillId = skillId;
            request.createSkillParameterDetails = createSkillParameterDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateSkillParameterRequest(odaInstanceId, skillId, createSkillParameterDetails,
            // opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .skillId(skillId)
                .createSkillParameterDetails(createSkillParameterDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",skillId=").append(String.valueOf(this.skillId));
        sb.append(",createSkillParameterDetails=")
                .append(String.valueOf(this.createSkillParameterDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSkillParameterRequest)) {
            return false;
        }

        CreateSkillParameterRequest other = (CreateSkillParameterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.skillId, other.skillId)
                && java.util.Objects.equals(
                        this.createSkillParameterDetails, other.createSkillParameterDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.skillId == null ? 43 : this.skillId.hashCode());
        result =
                (result * PRIME)
                        + (this.createSkillParameterDetails == null
                                ? 43
                                : this.createSkillParameterDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
