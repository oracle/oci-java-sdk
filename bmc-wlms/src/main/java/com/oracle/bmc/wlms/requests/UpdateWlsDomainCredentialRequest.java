/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.requests;

import com.oracle.bmc.wlms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/wlms/UpdateWlsDomainCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateWlsDomainCredentialRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
public class UpdateWlsDomainCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebLogic domain.
     */
    private String wlsDomainId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * WebLogic domain.
     */
    public String getWlsDomainId() {
        return wlsDomainId;
    }
    /** The type of the credentials. */
    private CredentialType credentialType;

    /** The type of the credentials. */
    public enum CredentialType implements com.oracle.bmc.http.internal.BmcEnum {
        WeblogicAdminUser("weblogicAdminUser"),
        NodemanagerUser("nodemanagerUser"),
        ;

        private final String value;
        private static java.util.Map<String, CredentialType> map;

        static {
            map = new java.util.HashMap<>();
            for (CredentialType v : CredentialType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CredentialType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CredentialType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CredentialType: " + key);
        }
    };

    /** The type of the credentials. */
    public CredentialType getCredentialType() {
        return credentialType;
    }
    /** The WebLogic domain credentials. */
    private com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails
            updateWlsDomainCredentialDetails;

    /** The WebLogic domain credentials. */
    public com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails
            getUpdateWlsDomainCredentialDetails() {
        return updateWlsDomainCredentialDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the ETag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the ETag you provide matches the
     * resource's current ETag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the ETag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the ETag you provide matches the
     * resource's current ETag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails getBody$() {
        return updateWlsDomainCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateWlsDomainCredentialRequest,
                    com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebLogic domain.
         */
        private String wlsDomainId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * WebLogic domain.
         *
         * @param wlsDomainId the value to set
         * @return this builder instance
         */
        public Builder wlsDomainId(String wlsDomainId) {
            this.wlsDomainId = wlsDomainId;
            return this;
        }

        /** The type of the credentials. */
        private CredentialType credentialType = null;

        /**
         * The type of the credentials.
         *
         * @param credentialType the value to set
         * @return this builder instance
         */
        public Builder credentialType(CredentialType credentialType) {
            this.credentialType = credentialType;
            return this;
        }

        /** The WebLogic domain credentials. */
        private com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails
                updateWlsDomainCredentialDetails = null;

        /**
         * The WebLogic domain credentials.
         *
         * @param updateWlsDomainCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder updateWlsDomainCredentialDetails(
                com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails
                        updateWlsDomainCredentialDetails) {
            this.updateWlsDomainCredentialDetails = updateWlsDomainCredentialDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the ETag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the ETag you provide
         * matches the resource's current ETag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the ETag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the ETag you provide
         * matches the resource's current ETag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateWlsDomainCredentialRequest o) {
            wlsDomainId(o.getWlsDomainId());
            credentialType(o.getCredentialType());
            updateWlsDomainCredentialDetails(o.getUpdateWlsDomainCredentialDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateWlsDomainCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateWlsDomainCredentialRequest
         */
        public UpdateWlsDomainCredentialRequest build() {
            UpdateWlsDomainCredentialRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.wlms.model.UpdateWlsDomainCredentialDetails body) {
            updateWlsDomainCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateWlsDomainCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateWlsDomainCredentialRequest
         */
        public UpdateWlsDomainCredentialRequest buildWithoutInvocationCallback() {
            UpdateWlsDomainCredentialRequest request = new UpdateWlsDomainCredentialRequest();
            request.wlsDomainId = wlsDomainId;
            request.credentialType = credentialType;
            request.updateWlsDomainCredentialDetails = updateWlsDomainCredentialDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateWlsDomainCredentialRequest(wlsDomainId, credentialType,
            // updateWlsDomainCredentialDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .wlsDomainId(wlsDomainId)
                .credentialType(credentialType)
                .updateWlsDomainCredentialDetails(updateWlsDomainCredentialDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",wlsDomainId=").append(String.valueOf(this.wlsDomainId));
        sb.append(",credentialType=").append(String.valueOf(this.credentialType));
        sb.append(",updateWlsDomainCredentialDetails=")
                .append(String.valueOf(this.updateWlsDomainCredentialDetails));
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
        if (!(o instanceof UpdateWlsDomainCredentialRequest)) {
            return false;
        }

        UpdateWlsDomainCredentialRequest other = (UpdateWlsDomainCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.wlsDomainId, other.wlsDomainId)
                && java.util.Objects.equals(this.credentialType, other.credentialType)
                && java.util.Objects.equals(
                        this.updateWlsDomainCredentialDetails,
                        other.updateWlsDomainCredentialDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.wlsDomainId == null ? 43 : this.wlsDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialType == null ? 43 : this.credentialType.hashCode());
        result =
                (result * PRIME)
                        + (this.updateWlsDomainCredentialDetails == null
                                ? 43
                                : this.updateWlsDomainCredentialDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
