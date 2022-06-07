/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned AnnouncementsPreferencesSummary instance.
     */
    private com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
            announcementsPreferencesSummary;

    public com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
            getAnnouncementsPreferencesSummary() {
        return announcementsPreferencesSummary;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "announcementsPreferencesSummary"
    })
    private UpdateAnnouncementsPreferenceResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                    announcementsPreferencesSummary) {
        super(__httpStatusCode__);
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

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.announcementsservice.model.AnnouncementsPreferencesSummary
                announcementsPreferencesSummary;

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
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            announcementsPreferencesSummary(o.getAnnouncementsPreferencesSummary());

            return this;
        }

        public UpdateAnnouncementsPreferenceResponse build() {
            return new UpdateAnnouncementsPreferenceResponse(
                    __httpStatusCode__, opcRequestId, etag, announcementsPreferencesSummary);
        }
    }

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
