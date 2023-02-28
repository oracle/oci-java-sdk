/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdatePluggableDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdatePluggableDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdatePluggableDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails> {

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String pluggableDatabaseId;

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getPluggableDatabaseId() {
        return pluggableDatabaseId;
    }
    /** Request to perform pluggable database update. */
    private com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails
            updatePluggableDatabaseDetails;

    /** Request to perform pluggable database update. */
    public com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails
            getUpdatePluggableDatabaseDetails() {
        return updatePluggableDatabaseDetails;
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
    public com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails getBody$() {
        return updatePluggableDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePluggableDatabaseRequest,
                    com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String pluggableDatabaseId = null;

        /**
         * The database
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param pluggableDatabaseId the value to set
         * @return this builder instance
         */
        public Builder pluggableDatabaseId(String pluggableDatabaseId) {
            this.pluggableDatabaseId = pluggableDatabaseId;
            return this;
        }

        /** Request to perform pluggable database update. */
        private com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails
                updatePluggableDatabaseDetails = null;

        /**
         * Request to perform pluggable database update.
         *
         * @param updatePluggableDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder updatePluggableDatabaseDetails(
                com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails
                        updatePluggableDatabaseDetails) {
            this.updatePluggableDatabaseDetails = updatePluggableDatabaseDetails;
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
        public Builder copy(UpdatePluggableDatabaseRequest o) {
            pluggableDatabaseId(o.getPluggableDatabaseId());
            updatePluggableDatabaseDetails(o.getUpdatePluggableDatabaseDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePluggableDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePluggableDatabaseRequest
         */
        public UpdatePluggableDatabaseRequest build() {
            UpdatePluggableDatabaseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.UpdatePluggableDatabaseDetails body) {
            updatePluggableDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePluggableDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePluggableDatabaseRequest
         */
        public UpdatePluggableDatabaseRequest buildWithoutInvocationCallback() {
            UpdatePluggableDatabaseRequest request = new UpdatePluggableDatabaseRequest();
            request.pluggableDatabaseId = pluggableDatabaseId;
            request.updatePluggableDatabaseDetails = updatePluggableDatabaseDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePluggableDatabaseRequest(pluggableDatabaseId,
            // updatePluggableDatabaseDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pluggableDatabaseId(pluggableDatabaseId)
                .updatePluggableDatabaseDetails(updatePluggableDatabaseDetails)
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
        sb.append(",pluggableDatabaseId=").append(String.valueOf(this.pluggableDatabaseId));
        sb.append(",updatePluggableDatabaseDetails=")
                .append(String.valueOf(this.updatePluggableDatabaseDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePluggableDatabaseRequest)) {
            return false;
        }

        UpdatePluggableDatabaseRequest other = (UpdatePluggableDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pluggableDatabaseId, other.pluggableDatabaseId)
                && java.util.Objects.equals(
                        this.updatePluggableDatabaseDetails, other.updatePluggableDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pluggableDatabaseId == null
                                ? 43
                                : this.pluggableDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePluggableDatabaseDetails == null
                                ? 43
                                : this.updatePluggableDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
