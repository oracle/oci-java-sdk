/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetRepositoryFileLinesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * This API will be deprecated on Wed, 29 Mar 2023 01:00:00 GMT. Please use "/repositories/{repositoryId}/file/lines"
     */
    private String sunset;

    public String getSunset() {
        return sunset;
    }

    /**
     * The returned RepositoryFileLines instance.
     */
    private com.oracle.bmc.devops.model.RepositoryFileLines repositoryFileLines;

    public com.oracle.bmc.devops.model.RepositoryFileLines getRepositoryFileLines() {
        return repositoryFileLines;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "sunset",
        "repositoryFileLines"
    })
    private GetRepositoryFileLinesResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            String sunset,
            com.oracle.bmc.devops.model.RepositoryFileLines repositoryFileLines) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.sunset = sunset;
        this.repositoryFileLines = repositoryFileLines;
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

        private String sunset;

        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        private com.oracle.bmc.devops.model.RepositoryFileLines repositoryFileLines;

        public Builder repositoryFileLines(
                com.oracle.bmc.devops.model.RepositoryFileLines repositoryFileLines) {
            this.repositoryFileLines = repositoryFileLines;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRepositoryFileLinesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            sunset(o.getSunset());
            repositoryFileLines(o.getRepositoryFileLines());

            return this;
        }

        public GetRepositoryFileLinesResponse build() {
            return new GetRepositoryFileLinesResponse(
                    __httpStatusCode__, opcRequestId, etag, sunset, repositoryFileLines);
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
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(",repositoryFileLines=").append(String.valueOf(repositoryFileLines));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRepositoryFileLinesResponse)) {
            return false;
        }

        GetRepositoryFileLinesResponse other = (GetRepositoryFileLinesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(this.repositoryFileLines, other.repositoryFileLines);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryFileLines == null
                                ? 43
                                : this.repositoryFileLines.hashCode());
        return result;
    }
}
