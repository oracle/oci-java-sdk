/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class UpdatePullRequestNotificationPreferenceResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Relative URL of the newly created resource.
     */
    private String location;

    /**
     * Relative URL of the newly created resource.
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned PullRequestNotificationPreference instance.
     */
    private com.oracle.bmc.devops.model.PullRequestNotificationPreference
            pullRequestNotificationPreference;

    /**
     * The returned PullRequestNotificationPreference instance.
     * @return the value
     */
    public com.oracle.bmc.devops.model.PullRequestNotificationPreference
            getPullRequestNotificationPreference() {
        return pullRequestNotificationPreference;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "etag",
        "opcRequestId",
        "pullRequestNotificationPreference"
    })
    private UpdatePullRequestNotificationPreferenceResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String etag,
            String opcRequestId,
            com.oracle.bmc.devops.model.PullRequestNotificationPreference
                    pullRequestNotificationPreference) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.pullRequestNotificationPreference = pullRequestNotificationPreference;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Relative URL of the newly created resource.
         */
        private String location;

        /**
         * Relative URL of the newly created resource.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned PullRequestNotificationPreference instance.
         */
        private com.oracle.bmc.devops.model.PullRequestNotificationPreference
                pullRequestNotificationPreference;

        /**
         * The returned PullRequestNotificationPreference instance.
         * @param pullRequestNotificationPreference the value to set
         * @return this builder
         */
        public Builder pullRequestNotificationPreference(
                com.oracle.bmc.devops.model.PullRequestNotificationPreference
                        pullRequestNotificationPreference) {
            this.pullRequestNotificationPreference = pullRequestNotificationPreference;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdatePullRequestNotificationPreferenceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            pullRequestNotificationPreference(o.getPullRequestNotificationPreference());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdatePullRequestNotificationPreferenceResponse build() {
            return new UpdatePullRequestNotificationPreferenceResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    etag,
                    opcRequestId,
                    pullRequestNotificationPreference);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",pullRequestNotificationPreference=")
                .append(String.valueOf(pullRequestNotificationPreference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePullRequestNotificationPreferenceResponse)) {
            return false;
        }

        UpdatePullRequestNotificationPreferenceResponse other =
                (UpdatePullRequestNotificationPreferenceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.pullRequestNotificationPreference,
                        other.pullRequestNotificationPreference);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestNotificationPreference == null
                                ? 43
                                : this.pullRequestNotificationPreference.hashCode());
        return result;
    }
}
