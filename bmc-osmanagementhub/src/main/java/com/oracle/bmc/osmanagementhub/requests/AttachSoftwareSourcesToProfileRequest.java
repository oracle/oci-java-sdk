/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AttachSoftwareSourcesToProfileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * AttachSoftwareSourcesToProfileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class AttachSoftwareSourcesToProfileRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * registration profile.
     */
    private String profileId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * registration profile.
     */
    public String getProfileId() {
        return profileId;
    }
    /**
     * The software source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach to
     * the profile
     */
    private com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails
            attachSoftwareSourcesToProfileDetails;

    /**
     * The software source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach to
     * the profile
     */
    public com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails
            getAttachSoftwareSourcesToProfileDetails() {
        return attachSoftwareSourcesToProfileDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
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
    public com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails getBody$() {
        return attachSoftwareSourcesToProfileDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AttachSoftwareSourcesToProfileRequest,
                    com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * registration profile.
         */
        private String profileId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * registration profile.
         *
         * @param profileId the value to set
         * @return this builder instance
         */
        public Builder profileId(String profileId) {
            this.profileId = profileId;
            return this;
        }

        /**
         * The software source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach
         * to the profile
         */
        private com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails
                attachSoftwareSourcesToProfileDetails = null;

        /**
         * The software source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to attach
         * to the profile
         *
         * @param attachSoftwareSourcesToProfileDetails the value to set
         * @return this builder instance
         */
        public Builder attachSoftwareSourcesToProfileDetails(
                com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails
                        attachSoftwareSourcesToProfileDetails) {
            this.attachSoftwareSourcesToProfileDetails = attachSoftwareSourcesToProfileDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
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
        public Builder copy(AttachSoftwareSourcesToProfileRequest o) {
            profileId(o.getProfileId());
            attachSoftwareSourcesToProfileDetails(o.getAttachSoftwareSourcesToProfileDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AttachSoftwareSourcesToProfileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AttachSoftwareSourcesToProfileRequest
         */
        public AttachSoftwareSourcesToProfileRequest build() {
            AttachSoftwareSourcesToProfileRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.osmanagementhub.model.AttachSoftwareSourcesToProfileDetails body) {
            attachSoftwareSourcesToProfileDetails(body);
            return this;
        }

        /**
         * Build the instance of AttachSoftwareSourcesToProfileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AttachSoftwareSourcesToProfileRequest
         */
        public AttachSoftwareSourcesToProfileRequest buildWithoutInvocationCallback() {
            AttachSoftwareSourcesToProfileRequest request =
                    new AttachSoftwareSourcesToProfileRequest();
            request.profileId = profileId;
            request.attachSoftwareSourcesToProfileDetails = attachSoftwareSourcesToProfileDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new AttachSoftwareSourcesToProfileRequest(profileId,
            // attachSoftwareSourcesToProfileDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .profileId(profileId)
                .attachSoftwareSourcesToProfileDetails(attachSoftwareSourcesToProfileDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",profileId=").append(String.valueOf(this.profileId));
        sb.append(",attachSoftwareSourcesToProfileDetails=")
                .append(String.valueOf(this.attachSoftwareSourcesToProfileDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachSoftwareSourcesToProfileRequest)) {
            return false;
        }

        AttachSoftwareSourcesToProfileRequest other = (AttachSoftwareSourcesToProfileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.profileId, other.profileId)
                && java.util.Objects.equals(
                        this.attachSoftwareSourcesToProfileDetails,
                        other.attachSoftwareSourcesToProfileDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.profileId == null ? 43 : this.profileId.hashCode());
        result =
                (result * PRIME)
                        + (this.attachSoftwareSourcesToProfileDetails == null
                                ? 43
                                : this.attachSoftwareSourcesToProfileDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
