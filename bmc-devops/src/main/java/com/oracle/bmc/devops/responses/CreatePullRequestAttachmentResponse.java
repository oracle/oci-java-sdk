/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class CreatePullRequestAttachmentResponse extends com.oracle.bmc.responses.BmcResponse {
    /** Relative URL of the newly created resource. */
    private String contentLocation;

    /**
     * Relative URL of the newly created resource.
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /** Relative URL of the newly created resource. */
    private String location;

    /**
     * Relative URL of the newly created resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code PullRequestAttachment} instance. */
    private com.oracle.bmc.devops.model.PullRequestAttachment pullRequestAttachment;

    /**
     * The returned {@code PullRequestAttachment} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.devops.model.PullRequestAttachment getPullRequestAttachment() {
        return pullRequestAttachment;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "contentLocation",
        "location",
        "opcRequestId",
        "etag",
        "pullRequestAttachment"
    })
    private CreatePullRequestAttachmentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String contentLocation,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.devops.model.PullRequestAttachment pullRequestAttachment) {
        super(__httpStatusCode__, headers);
        this.contentLocation = contentLocation;
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.pullRequestAttachment = pullRequestAttachment;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreatePullRequestAttachmentResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** Relative URL of the newly created resource. */
        private String contentLocation;

        /**
         * Relative URL of the newly created resource.
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /** Relative URL of the newly created resource. */
        private String location;

        /**
         * Relative URL of the newly created resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code PullRequestAttachment} instance. */
        private com.oracle.bmc.devops.model.PullRequestAttachment pullRequestAttachment;

        /**
         * The returned {@code PullRequestAttachment} instance.
         *
         * @param pullRequestAttachment the value to set
         * @return this builder
         */
        public Builder pullRequestAttachment(
                com.oracle.bmc.devops.model.PullRequestAttachment pullRequestAttachment) {
            this.pullRequestAttachment = pullRequestAttachment;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreatePullRequestAttachmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            contentLocation(o.getContentLocation());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            pullRequestAttachment(o.getPullRequestAttachment());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreatePullRequestAttachmentResponse build() {
            return new CreatePullRequestAttachmentResponse(
                    __httpStatusCode__,
                    headers,
                    contentLocation,
                    location,
                    opcRequestId,
                    etag,
                    pullRequestAttachment);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",pullRequestAttachment=").append(String.valueOf(pullRequestAttachment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePullRequestAttachmentResponse)) {
            return false;
        }

        CreatePullRequestAttachmentResponse other = (CreatePullRequestAttachmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.pullRequestAttachment, other.pullRequestAttachment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestAttachment == null
                                ? 43
                                : this.pullRequestAttachment.hashCode());
        return result;
    }
}
