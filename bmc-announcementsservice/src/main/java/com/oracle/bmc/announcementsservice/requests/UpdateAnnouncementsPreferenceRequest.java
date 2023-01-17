/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/UpdateAnnouncementsPreferenceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAnnouncementsPreferenceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class UpdateAnnouncementsPreferenceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails> {

    /** The ID of the preference. */
    private String preferenceId;

    /** The ID of the preference. */
    public String getPreferenceId() {
        return preferenceId;
    }
    /**
     * The object that contains details about tenancy preferences for receiving announcements by
     * email.
     */
    private com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails
            announcementsPreferenceDetails;

    /**
     * The object that contains details about tenancy preferences for receiving announcements by
     * email.
     */
    public com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails
            getAnnouncementsPreferenceDetails() {
        return announcementsPreferenceDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The locking version, used for optimistic concurrency control. */
    private String ifMatch;

    /** The locking version, used for optimistic concurrency control. */
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
    public com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails
            getBody$() {
        return announcementsPreferenceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAnnouncementsPreferenceRequest,
                    com.oracle.bmc.announcementsservice.model
                            .UpdateAnnouncementsPreferencesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the preference. */
        private String preferenceId = null;

        /**
         * The ID of the preference.
         *
         * @param preferenceId the value to set
         * @return this builder instance
         */
        public Builder preferenceId(String preferenceId) {
            this.preferenceId = preferenceId;
            return this;
        }

        /**
         * The object that contains details about tenancy preferences for receiving announcements by
         * email.
         */
        private com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails
                announcementsPreferenceDetails = null;

        /**
         * The object that contains details about tenancy preferences for receiving announcements by
         * email.
         *
         * @param announcementsPreferenceDetails the value to set
         * @return this builder instance
         */
        public Builder announcementsPreferenceDetails(
                com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails
                        announcementsPreferenceDetails) {
            this.announcementsPreferenceDetails = announcementsPreferenceDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the complete request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The locking version, used for optimistic concurrency control. */
        private String ifMatch = null;

        /**
         * The locking version, used for optimistic concurrency control.
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
        public Builder copy(UpdateAnnouncementsPreferenceRequest o) {
            preferenceId(o.getPreferenceId());
            announcementsPreferenceDetails(o.getAnnouncementsPreferenceDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAnnouncementsPreferenceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAnnouncementsPreferenceRequest
         */
        public UpdateAnnouncementsPreferenceRequest build() {
            UpdateAnnouncementsPreferenceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.announcementsservice.model.UpdateAnnouncementsPreferencesDetails
                        body) {
            announcementsPreferenceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAnnouncementsPreferenceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAnnouncementsPreferenceRequest
         */
        public UpdateAnnouncementsPreferenceRequest buildWithoutInvocationCallback() {
            UpdateAnnouncementsPreferenceRequest request =
                    new UpdateAnnouncementsPreferenceRequest();
            request.preferenceId = preferenceId;
            request.announcementsPreferenceDetails = announcementsPreferenceDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateAnnouncementsPreferenceRequest(preferenceId,
            // announcementsPreferenceDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .preferenceId(preferenceId)
                .announcementsPreferenceDetails(announcementsPreferenceDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",preferenceId=").append(String.valueOf(this.preferenceId));
        sb.append(",announcementsPreferenceDetails=")
                .append(String.valueOf(this.announcementsPreferenceDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAnnouncementsPreferenceRequest)) {
            return false;
        }

        UpdateAnnouncementsPreferenceRequest other = (UpdateAnnouncementsPreferenceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.preferenceId, other.preferenceId)
                && java.util.Objects.equals(
                        this.announcementsPreferenceDetails, other.announcementsPreferenceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.preferenceId == null ? 43 : this.preferenceId.hashCode());
        result =
                (result * PRIME)
                        + (this.announcementsPreferenceDetails == null
                                ? 43
                                : this.announcementsPreferenceDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
