/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateImportedPackageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateImportedPackageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class UpdateImportedPackageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.UpdateImportedPackageDetails> {

    /** Parameter values required to import the package, with updated values. */
    private com.oracle.bmc.oda.model.UpdateImportedPackageDetails updateImportedPackageDetails;

    /** Parameter values required to import the package, with updated values. */
    public com.oracle.bmc.oda.model.UpdateImportedPackageDetails getUpdateImportedPackageDetails() {
        return updateImportedPackageDetails;
    }
    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Unique Digital Assistant package identifier. */
    private String packageId;

    /** Unique Digital Assistant package identifier. */
    public String getPackageId() {
        return packageId;
    }
    /**
     * Should old skills be replaced by new skills if packageId differs from already imported
     * package?
     */
    private Boolean isReplaceSkills;

    /**
     * Should old skills be replaced by new skills if packageId differs from already imported
     * package?
     */
    public Boolean getIsReplaceSkills() {
        return isReplaceSkills;
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
     * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant instance,
     * set the {@code if-match} query parameter to the value of the {@code ETAG} header from a
     * previous GET or POST response for that instance. The service updates or deletes the instance
     * only if the etag that you provide matches the instance's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant instance,
     * set the {@code if-match} query parameter to the value of the {@code ETAG} header from a
     * previous GET or POST response for that instance. The service updates or deletes the instance
     * only if the etag that you provide matches the instance's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.oda.model.UpdateImportedPackageDetails getBody$() {
        return updateImportedPackageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateImportedPackageRequest,
                    com.oracle.bmc.oda.model.UpdateImportedPackageDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Parameter values required to import the package, with updated values. */
        private com.oracle.bmc.oda.model.UpdateImportedPackageDetails updateImportedPackageDetails =
                null;

        /**
         * Parameter values required to import the package, with updated values.
         *
         * @param updateImportedPackageDetails the value to set
         * @return this builder instance
         */
        public Builder updateImportedPackageDetails(
                com.oracle.bmc.oda.model.UpdateImportedPackageDetails
                        updateImportedPackageDetails) {
            this.updateImportedPackageDetails = updateImportedPackageDetails;
            return this;
        }

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

        /** Unique Digital Assistant package identifier. */
        private String packageId = null;

        /**
         * Unique Digital Assistant package identifier.
         *
         * @param packageId the value to set
         * @return this builder instance
         */
        public Builder packageId(String packageId) {
            this.packageId = packageId;
            return this;
        }

        /**
         * Should old skills be replaced by new skills if packageId differs from already imported
         * package?
         */
        private Boolean isReplaceSkills = null;

        /**
         * Should old skills be replaced by new skills if packageId differs from already imported
         * package?
         *
         * @param isReplaceSkills the value to set
         * @return this builder instance
         */
        public Builder isReplaceSkills(Boolean isReplaceSkills) {
            this.isReplaceSkills = isReplaceSkills;
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
         * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant
         * instance, set the {@code if-match} query parameter to the value of the {@code ETAG}
         * header from a previous GET or POST response for that instance. The service updates or
         * deletes the instance only if the etag that you provide matches the instance's current
         * etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant
         * instance, set the {@code if-match} query parameter to the value of the {@code ETAG}
         * header from a previous GET or POST response for that instance. The service updates or
         * deletes the instance only if the etag that you provide matches the instance's current
         * etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateImportedPackageRequest o) {
            updateImportedPackageDetails(o.getUpdateImportedPackageDetails());
            odaInstanceId(o.getOdaInstanceId());
            packageId(o.getPackageId());
            isReplaceSkills(o.getIsReplaceSkills());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateImportedPackageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateImportedPackageRequest
         */
        public UpdateImportedPackageRequest build() {
            UpdateImportedPackageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.UpdateImportedPackageDetails body) {
            updateImportedPackageDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateImportedPackageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateImportedPackageRequest
         */
        public UpdateImportedPackageRequest buildWithoutInvocationCallback() {
            UpdateImportedPackageRequest request = new UpdateImportedPackageRequest();
            request.updateImportedPackageDetails = updateImportedPackageDetails;
            request.odaInstanceId = odaInstanceId;
            request.packageId = packageId;
            request.isReplaceSkills = isReplaceSkills;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateImportedPackageRequest(updateImportedPackageDetails, odaInstanceId,
            // packageId, isReplaceSkills, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateImportedPackageDetails(updateImportedPackageDetails)
                .odaInstanceId(odaInstanceId)
                .packageId(packageId)
                .isReplaceSkills(isReplaceSkills)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",updateImportedPackageDetails=")
                .append(String.valueOf(this.updateImportedPackageDetails));
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",packageId=").append(String.valueOf(this.packageId));
        sb.append(",isReplaceSkills=").append(String.valueOf(this.isReplaceSkills));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof UpdateImportedPackageRequest)) {
            return false;
        }

        UpdateImportedPackageRequest other = (UpdateImportedPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateImportedPackageDetails, other.updateImportedPackageDetails)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.packageId, other.packageId)
                && java.util.Objects.equals(this.isReplaceSkills, other.isReplaceSkills)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateImportedPackageDetails == null
                                ? 43
                                : this.updateImportedPackageDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.packageId == null ? 43 : this.packageId.hashCode());
        result =
                (result * PRIME)
                        + (this.isReplaceSkills == null ? 43 : this.isReplaceSkills.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
