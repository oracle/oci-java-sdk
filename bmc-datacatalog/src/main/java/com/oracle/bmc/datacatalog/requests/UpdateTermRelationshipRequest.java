/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateTermRelationshipExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateTermRelationshipRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class UpdateTermRelationshipRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique glossary key. */
    private String glossaryKey;

    /** Unique glossary key. */
    public String getGlossaryKey() {
        return glossaryKey;
    }
    /** Unique glossary term key. */
    private String termKey;

    /** Unique glossary term key. */
    public String getTermKey() {
        return termKey;
    }
    /** Unique glossary term relationship key. */
    private String termRelationshipKey;

    /** Unique glossary term relationship key. */
    public String getTermRelationshipKey() {
        return termRelationshipKey;
    }
    /** The information to be updated in the term relationship. */
    private com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails
            updateTermRelationshipDetails;

    /** The information to be updated in the term relationship. */
    public com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails
            getUpdateTermRelationshipDetails() {
        return updateTermRelationshipDetails;
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
    public com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails getBody$() {
        return updateTermRelationshipDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTermRelationshipRequest,
                    com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Unique glossary key. */
        private String glossaryKey = null;

        /**
         * Unique glossary key.
         *
         * @param glossaryKey the value to set
         * @return this builder instance
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            return this;
        }

        /** Unique glossary term key. */
        private String termKey = null;

        /**
         * Unique glossary term key.
         *
         * @param termKey the value to set
         * @return this builder instance
         */
        public Builder termKey(String termKey) {
            this.termKey = termKey;
            return this;
        }

        /** Unique glossary term relationship key. */
        private String termRelationshipKey = null;

        /**
         * Unique glossary term relationship key.
         *
         * @param termRelationshipKey the value to set
         * @return this builder instance
         */
        public Builder termRelationshipKey(String termRelationshipKey) {
            this.termRelationshipKey = termRelationshipKey;
            return this;
        }

        /** The information to be updated in the term relationship. */
        private com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails
                updateTermRelationshipDetails = null;

        /**
         * The information to be updated in the term relationship.
         *
         * @param updateTermRelationshipDetails the value to set
         * @return this builder instance
         */
        public Builder updateTermRelationshipDetails(
                com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails
                        updateTermRelationshipDetails) {
            this.updateTermRelationshipDetails = updateTermRelationshipDetails;
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
        public Builder copy(UpdateTermRelationshipRequest o) {
            catalogId(o.getCatalogId());
            glossaryKey(o.getGlossaryKey());
            termKey(o.getTermKey());
            termRelationshipKey(o.getTermRelationshipKey());
            updateTermRelationshipDetails(o.getUpdateTermRelationshipDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTermRelationshipRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTermRelationshipRequest
         */
        public UpdateTermRelationshipRequest build() {
            UpdateTermRelationshipRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacatalog.model.UpdateTermRelationshipDetails body) {
            updateTermRelationshipDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTermRelationshipRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTermRelationshipRequest
         */
        public UpdateTermRelationshipRequest buildWithoutInvocationCallback() {
            UpdateTermRelationshipRequest request = new UpdateTermRelationshipRequest();
            request.catalogId = catalogId;
            request.glossaryKey = glossaryKey;
            request.termKey = termKey;
            request.termRelationshipKey = termRelationshipKey;
            request.updateTermRelationshipDetails = updateTermRelationshipDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateTermRelationshipRequest(catalogId, glossaryKey, termKey,
            // termRelationshipKey, updateTermRelationshipDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .glossaryKey(glossaryKey)
                .termKey(termKey)
                .termRelationshipKey(termRelationshipKey)
                .updateTermRelationshipDetails(updateTermRelationshipDetails)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(",termKey=").append(String.valueOf(this.termKey));
        sb.append(",termRelationshipKey=").append(String.valueOf(this.termRelationshipKey));
        sb.append(",updateTermRelationshipDetails=")
                .append(String.valueOf(this.updateTermRelationshipDetails));
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
        if (!(o instanceof UpdateTermRelationshipRequest)) {
            return false;
        }

        UpdateTermRelationshipRequest other = (UpdateTermRelationshipRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && java.util.Objects.equals(this.termRelationshipKey, other.termRelationshipKey)
                && java.util.Objects.equals(
                        this.updateTermRelationshipDetails, other.updateTermRelationshipDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result =
                (result * PRIME)
                        + (this.termRelationshipKey == null
                                ? 43
                                : this.termRelationshipKey.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTermRelationshipDetails == null
                                ? 43
                                : this.updateTermRelationshipDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
