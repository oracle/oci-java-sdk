/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetFileDiffResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * This API will be deprecated on Wed, 29 Mar 2023 01:00:00 GMT. Please use "/repositories/{repositoryId}/file/diffs"
     */
    private String sunset;

    public String getSunset() {
        return sunset;
    }

    /**
     * The returned FileDiffResponse instance.
     */
    private com.oracle.bmc.devops.model.FileDiffResponse fileDiffResponse;

    public com.oracle.bmc.devops.model.FileDiffResponse getFileDiffResponse() {
        return fileDiffResponse;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "sunset",
        "fileDiffResponse"
    })
    private GetFileDiffResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            String sunset,
            com.oracle.bmc.devops.model.FileDiffResponse fileDiffResponse) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.sunset = sunset;
        this.fileDiffResponse = fileDiffResponse;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String sunset;

        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        private com.oracle.bmc.devops.model.FileDiffResponse fileDiffResponse;

        public Builder fileDiffResponse(
                com.oracle.bmc.devops.model.FileDiffResponse fileDiffResponse) {
            this.fileDiffResponse = fileDiffResponse;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetFileDiffResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            sunset(o.getSunset());
            fileDiffResponse(o.getFileDiffResponse());

            return this;
        }

        public GetFileDiffResponse build() {
            return new GetFileDiffResponse(
                    __httpStatusCode__, etag, opcRequestId, sunset, fileDiffResponse);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(",fileDiffResponse=").append(String.valueOf(fileDiffResponse));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFileDiffResponse)) {
            return false;
        }

        GetFileDiffResponse other = (GetFileDiffResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(this.fileDiffResponse, other.fileDiffResponse);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.fileDiffResponse == null ? 43 : this.fileDiffResponse.hashCode());
        return result;
    }
}
