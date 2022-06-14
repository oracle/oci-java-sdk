/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ExportSkillExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ExportSkillRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ExportSkillRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.oda.model.ExportSkillDetails> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    /**
     * Unique Digital Assistant instance identifier.
     */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * Unique Skill identifier.
     */
    private String skillId;

    /**
     * Unique Skill identifier.
     */
    public String getSkillId() {
        return skillId;
    }
    /**
     * Where in Object Storage to export the Skill to.
     */
    private com.oracle.bmc.oda.model.ExportSkillDetails exportSkillDetails;

    /**
     * Where in Object Storage to export the Skill to.
     */
    public com.oracle.bmc.oda.model.ExportSkillDetails getExportSkillDetails() {
        return exportSkillDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
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
    public com.oracle.bmc.oda.model.ExportSkillDetails getBody$() {
        return exportSkillDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExportSkillRequest, com.oracle.bmc.oda.model.ExportSkillDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Digital Assistant instance identifier.
         */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /**
         * Unique Skill identifier.
         */
        private String skillId = null;

        /**
         * Unique Skill identifier.
         * @param skillId the value to set
         * @return this builder instance
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        /**
         * Where in Object Storage to export the Skill to.
         */
        private com.oracle.bmc.oda.model.ExportSkillDetails exportSkillDetails = null;

        /**
         * Where in Object Storage to export the Skill to.
         * @param exportSkillDetails the value to set
         * @return this builder instance
         */
        public Builder exportSkillDetails(
                com.oracle.bmc.oda.model.ExportSkillDetails exportSkillDetails) {
            this.exportSkillDetails = exportSkillDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
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
        public Builder copy(ExportSkillRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            skillId(o.getSkillId());
            exportSkillDetails(o.getExportSkillDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportSkillRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ExportSkillRequest
         */
        public ExportSkillRequest build() {
            ExportSkillRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.ExportSkillDetails body) {
            exportSkillDetails(body);
            return this;
        }

        /**
         * Build the instance of ExportSkillRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportSkillRequest
         */
        public ExportSkillRequest buildWithoutInvocationCallback() {
            ExportSkillRequest request = new ExportSkillRequest();
            request.odaInstanceId = odaInstanceId;
            request.skillId = skillId;
            request.exportSkillDetails = exportSkillDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ExportSkillRequest(odaInstanceId, skillId, exportSkillDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .skillId(skillId)
                .exportSkillDetails(exportSkillDetails)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",skillId=").append(String.valueOf(this.skillId));
        sb.append(",exportSkillDetails=").append(String.valueOf(this.exportSkillDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportSkillRequest)) {
            return false;
        }

        ExportSkillRequest other = (ExportSkillRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.skillId, other.skillId)
                && java.util.Objects.equals(this.exportSkillDetails, other.exportSkillDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
                        + (this.exportSkillDetails == null
                                ? 43
                                : this.exportSkillDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
