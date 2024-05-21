/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateSkillParameterExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSkillParameterRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class UpdateSkillParameterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.UpdateSkillParameterDetails> {

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
     * The name of a Skill Parameter.
     */
    private String parameterName;

    /**
     * The name of a Skill Parameter.
     */
    public String getParameterName() {
        return parameterName;
    }
    /**
     * Property values to update the Skill Parameter.
     */
    private com.oracle.bmc.oda.model.UpdateSkillParameterDetails updateSkillParameterDetails;

    /**
     * Property values to update the Skill Parameter.
     */
    public com.oracle.bmc.oda.model.UpdateSkillParameterDetails getUpdateSkillParameterDetails() {
        return updateSkillParameterDetails;
    }
    /**
     * For optimistic concurrency control in a PUT or DELETE call for
     * a Digital Assistant instance, set the {@code if-match} query parameter
     * to the value of the {@code ETAG} header from a previous GET or POST
     * response for that instance. The service updates or deletes the
     * instance only if the etag that you provide matches the instance's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control in a PUT or DELETE call for
     * a Digital Assistant instance, set the {@code if-match} query parameter
     * to the value of the {@code ETAG} header from a previous GET or POST
     * response for that instance. The service updates or deletes the
     * instance only if the etag that you provide matches the instance's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.oda.model.UpdateSkillParameterDetails getBody$() {
        return updateSkillParameterDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSkillParameterRequest,
                    com.oracle.bmc.oda.model.UpdateSkillParameterDetails> {
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
         * The name of a Skill Parameter.
         */
        private String parameterName = null;

        /**
         * The name of a Skill Parameter.
         * @param parameterName the value to set
         * @return this builder instance
         */
        public Builder parameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }

        /**
         * Property values to update the Skill Parameter.
         */
        private com.oracle.bmc.oda.model.UpdateSkillParameterDetails updateSkillParameterDetails =
                null;

        /**
         * Property values to update the Skill Parameter.
         * @param updateSkillParameterDetails the value to set
         * @return this builder instance
         */
        public Builder updateSkillParameterDetails(
                com.oracle.bmc.oda.model.UpdateSkillParameterDetails updateSkillParameterDetails) {
            this.updateSkillParameterDetails = updateSkillParameterDetails;
            return this;
        }

        /**
         * For optimistic concurrency control in a PUT or DELETE call for
         * a Digital Assistant instance, set the {@code if-match} query parameter
         * to the value of the {@code ETAG} header from a previous GET or POST
         * response for that instance. The service updates or deletes the
         * instance only if the etag that you provide matches the instance's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control in a PUT or DELETE call for
         * a Digital Assistant instance, set the {@code if-match} query parameter
         * to the value of the {@code ETAG} header from a previous GET or POST
         * response for that instance. The service updates or deletes the
         * instance only if the etag that you provide matches the instance's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateSkillParameterRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            skillId(o.getSkillId());
            parameterName(o.getParameterName());
            updateSkillParameterDetails(o.getUpdateSkillParameterDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSkillParameterRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSkillParameterRequest
         */
        public UpdateSkillParameterRequest build() {
            UpdateSkillParameterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.UpdateSkillParameterDetails body) {
            updateSkillParameterDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSkillParameterRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSkillParameterRequest
         */
        public UpdateSkillParameterRequest buildWithoutInvocationCallback() {
            UpdateSkillParameterRequest request = new UpdateSkillParameterRequest();
            request.odaInstanceId = odaInstanceId;
            request.skillId = skillId;
            request.parameterName = parameterName;
            request.updateSkillParameterDetails = updateSkillParameterDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSkillParameterRequest(odaInstanceId, skillId, parameterName, updateSkillParameterDetails, ifMatch, opcRequestId);
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
                .parameterName(parameterName)
                .updateSkillParameterDetails(updateSkillParameterDetails)
                .ifMatch(ifMatch)
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
        sb.append(",parameterName=").append(String.valueOf(this.parameterName));
        sb.append(",updateSkillParameterDetails=")
                .append(String.valueOf(this.updateSkillParameterDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSkillParameterRequest)) {
            return false;
        }

        UpdateSkillParameterRequest other = (UpdateSkillParameterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.skillId, other.skillId)
                && java.util.Objects.equals(this.parameterName, other.parameterName)
                && java.util.Objects.equals(
                        this.updateSkillParameterDetails, other.updateSkillParameterDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
                        + (this.parameterName == null ? 43 : this.parameterName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSkillParameterDetails == null
                                ? 43
                                : this.updateSkillParameterDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
