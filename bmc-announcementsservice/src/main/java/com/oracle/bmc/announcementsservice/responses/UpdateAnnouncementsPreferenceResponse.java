/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class UpdateAnnouncementsPreferenceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned AnnouncementsPreferencesSummary instance.
     */
    private com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
            announcementsPreferencesSummary;

    /**
     * The returned AnnouncementsPreferencesSummary instance.
     * @return the value
     */
    public com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
            getAnnouncementsPreferencesSummary() {
        return announcementsPreferencesSummary;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "announcementsPreferencesSummary"
    })
    private UpdateAnnouncementsPreferenceResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                    announcementsPreferencesSummary) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.announcementsPreferencesSummary = announcementsPreferencesSummary;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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

        /**
         * The returned AnnouncementsPreferencesSummary instance.
         */
        private com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                announcementsPreferencesSummary;

        /**
         * The returned AnnouncementsPreferencesSummary instance.
         * @param announcementsPreferencesSummary the value to set
         * @return this builder
         */
        public Builder announcementsPreferencesSummary(
                com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                        announcementsPreferencesSummary) {
            this.announcementsPreferencesSummary = announcementsPreferencesSummary;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAnnouncementsPreferenceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            announcementsPreferencesSummary(o.getAnnouncementsPreferencesSummary());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateAnnouncementsPreferenceResponse build() {
            return new UpdateAnnouncementsPreferenceResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    etag,
                    announcementsPreferencesSummary);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",announcementsPreferencesSummary=")
                .append(String.valueOf(announcementsPreferencesSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAnnouncementsPreferenceResponse)) {
            return false;
        }

        UpdateAnnouncementsPreferenceResponse other = (UpdateAnnouncementsPreferenceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.announcementsPreferencesSummary,
                        other.announcementsPreferencesSummary);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.announcementsPreferencesSummary == null
                                ? 43
                                : this.announcementsPreferencesSummary.hashCode());
        return result;
    }
}
