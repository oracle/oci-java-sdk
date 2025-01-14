/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateNotebookSessionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency
     * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     */
    private String etag;

    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency
     * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The URI that identifies the entity described in the response body. */
    private String location;

    /**
     * The URI that identifies the entity described in the response body.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the
     * work request. Use
     * [GetWorkRequest](https://docs.cloud.oracle.com/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the
     * work request. Use
     * [GetWorkRequest](https://docs.cloud.oracle.com/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The returned {@code NotebookSession} instance. */
    private com.oracle.bmc.datascience.model.NotebookSession notebookSession;

    /**
     * The returned {@code NotebookSession} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datascience.model.NotebookSession getNotebookSession() {
        return notebookSession;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "location",
        "opcRequestId",
        "opcWorkRequestId",
        "notebookSession"
    })
    private CreateNotebookSessionResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String location,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.datascience.model.NotebookSession notebookSession) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.notebookSession = notebookSession;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateNotebookSessionResponse> {
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

        /**
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency
         * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         */
        private String etag;

        /**
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency
         * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The URI that identifies the entity described in the response body. */
        private String location;

        /**
         * The URI that identifies the entity described in the response body.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of
         * the work request. Use
         * [GetWorkRequest](https://docs.cloud.oracle.com/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of
         * the work request. Use
         * [GetWorkRequest](https://docs.cloud.oracle.com/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The returned {@code NotebookSession} instance. */
        private com.oracle.bmc.datascience.model.NotebookSession notebookSession;

        /**
         * The returned {@code NotebookSession} instance.
         *
         * @param notebookSession the value to set
         * @return this builder
         */
        public Builder notebookSession(
                com.oracle.bmc.datascience.model.NotebookSession notebookSession) {
            this.notebookSession = notebookSession;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateNotebookSessionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            notebookSession(o.getNotebookSession());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateNotebookSessionResponse build() {
            return new CreateNotebookSessionResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    location,
                    opcRequestId,
                    opcWorkRequestId,
                    notebookSession);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",notebookSession=").append(String.valueOf(notebookSession));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNotebookSessionResponse)) {
            return false;
        }

        CreateNotebookSessionResponse other = (CreateNotebookSessionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.notebookSession, other.notebookSession);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSession == null ? 43 : this.notebookSession.hashCode());
        return result;
    }
}
