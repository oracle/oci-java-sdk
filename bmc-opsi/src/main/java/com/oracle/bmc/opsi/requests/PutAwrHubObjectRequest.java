/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/PutAwrHubObjectExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use PutAwrHubObjectRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class PutAwrHubObjectRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The object to be uploaded to the Awr Hub. */
    private java.io.InputStream putAwrHubObjectBody;

    /** The object to be uploaded to the Awr Hub. */
    public java.io.InputStream getPutAwrHubObjectBody() {
        return putAwrHubObjectBody;
    }
    /** Unique Awr Hub Source identifier */
    private String awrHubSourceId;

    /** Unique Awr Hub Source identifier */
    public String getAwrHubSourceId() {
        return awrHubSourceId;
    }
    /** Unique Awr Hub Object identifier */
    private String objectName;

    /** Unique Awr Hub Object identifier */
    public String getObjectName() {
        return objectName;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return putAwrHubObjectBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutAwrHubObjectRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The object to be uploaded to the Awr Hub. */
        private java.io.InputStream putAwrHubObjectBody = null;

        /**
         * The object to be uploaded to the Awr Hub.
         *
         * @param putAwrHubObjectBody the value to set
         * @return this builder instance
         */
        public Builder putAwrHubObjectBody(java.io.InputStream putAwrHubObjectBody) {
            this.putAwrHubObjectBody = putAwrHubObjectBody;
            return this;
        }

        /** Unique Awr Hub Source identifier */
        private String awrHubSourceId = null;

        /**
         * Unique Awr Hub Source identifier
         *
         * @param awrHubSourceId the value to set
         * @return this builder instance
         */
        public Builder awrHubSourceId(String awrHubSourceId) {
            this.awrHubSourceId = awrHubSourceId;
            return this;
        }

        /** Unique Awr Hub Object identifier */
        private String objectName = null;

        /**
         * Unique Awr Hub Object identifier
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(PutAwrHubObjectRequest o) {
            putAwrHubObjectBody(o.getPutAwrHubObjectBody());
            awrHubSourceId(o.getAwrHubSourceId());
            objectName(o.getObjectName());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutAwrHubObjectRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PutAwrHubObjectRequest
         */
        public PutAwrHubObjectRequest build() {
            PutAwrHubObjectRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            putAwrHubObjectBody(body);
            return this;
        }

        /**
         * Build the instance of PutAwrHubObjectRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutAwrHubObjectRequest
         */
        public PutAwrHubObjectRequest buildWithoutInvocationCallback() {
            PutAwrHubObjectRequest request = new PutAwrHubObjectRequest();
            request.putAwrHubObjectBody = putAwrHubObjectBody;
            request.awrHubSourceId = awrHubSourceId;
            request.objectName = objectName;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new PutAwrHubObjectRequest(putAwrHubObjectBody, awrHubSourceId, objectName, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .putAwrHubObjectBody(putAwrHubObjectBody)
                .awrHubSourceId(awrHubSourceId)
                .objectName(objectName)
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
        sb.append(",putAwrHubObjectBody=").append(String.valueOf(this.putAwrHubObjectBody));
        sb.append(",awrHubSourceId=").append(String.valueOf(this.awrHubSourceId));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
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
        if (!(o instanceof PutAwrHubObjectRequest)) {
            return false;
        }

        PutAwrHubObjectRequest other = (PutAwrHubObjectRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.putAwrHubObjectBody, other.putAwrHubObjectBody)
                && java.util.Objects.equals(this.awrHubSourceId, other.awrHubSourceId)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.putAwrHubObjectBody == null
                                ? 43
                                : this.putAwrHubObjectBody.hashCode());
        result =
                (result * PRIME)
                        + (this.awrHubSourceId == null ? 43 : this.awrHubSourceId.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
