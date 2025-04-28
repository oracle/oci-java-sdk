/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.responses;

import com.oracle.bmc.desktops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class ListDesktopPoolVolumesResponse extends com.oracle.bmc.responses.BmcResponse {
    /** The unique identifier of the request. */
    private String opcRequestId;

    /**
     * The unique identifier of the request.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For pagination. */
    private String opcNextPage;

    /**
     * For pagination.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code DesktopPoolVolumeCollection} instance. */
    private com.oracle.bmc.desktops.model.DesktopPoolVolumeCollection desktopPoolVolumeCollection;

    /**
     * The returned {@code DesktopPoolVolumeCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.desktops.model.DesktopPoolVolumeCollection
            getDesktopPoolVolumeCollection() {
        return desktopPoolVolumeCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "desktopPoolVolumeCollection"
    })
    private ListDesktopPoolVolumesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.desktops.model.DesktopPoolVolumeCollection desktopPoolVolumeCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.desktopPoolVolumeCollection = desktopPoolVolumeCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListDesktopPoolVolumesResponse> {
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

        /** The unique identifier of the request. */
        private String opcRequestId;

        /**
         * The unique identifier of the request.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For pagination. */
        private String opcNextPage;

        /**
         * For pagination.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code DesktopPoolVolumeCollection} instance. */
        private com.oracle.bmc.desktops.model.DesktopPoolVolumeCollection
                desktopPoolVolumeCollection;

        /**
         * The returned {@code DesktopPoolVolumeCollection} instance.
         *
         * @param desktopPoolVolumeCollection the value to set
         * @return this builder
         */
        public Builder desktopPoolVolumeCollection(
                com.oracle.bmc.desktops.model.DesktopPoolVolumeCollection
                        desktopPoolVolumeCollection) {
            this.desktopPoolVolumeCollection = desktopPoolVolumeCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListDesktopPoolVolumesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            desktopPoolVolumeCollection(o.getDesktopPoolVolumeCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListDesktopPoolVolumesResponse build() {
            return new ListDesktopPoolVolumesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    desktopPoolVolumeCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",desktopPoolVolumeCollection=")
                .append(String.valueOf(desktopPoolVolumeCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDesktopPoolVolumesResponse)) {
            return false;
        }

        ListDesktopPoolVolumesResponse other = (ListDesktopPoolVolumesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.desktopPoolVolumeCollection, other.desktopPoolVolumeCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.desktopPoolVolumeCollection == null
                                ? 43
                                : this.desktopPoolVolumeCollection.hashCode());
        return result;
    }
}
