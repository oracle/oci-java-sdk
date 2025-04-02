/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateMlApplicationInstanceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency
     * Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     */
    private String etag;

    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency
     * Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
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

    /** The URI that identifies the entity described in the response body. */
    private String contentLocation;

    /**
     * The URI that identifies the entity described in the response body.
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work
     * request. Use
     * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work
     * request. Use
     * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
     * with this ID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The returned {@code MlApplicationInstance} instance. */
    private com.oracle.bmc.datascience.model.MlApplicationInstance mlApplicationInstance;

    /**
     * The returned {@code MlApplicationInstance} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datascience.model.MlApplicationInstance getMlApplicationInstance() {
        return mlApplicationInstance;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "location",
        "contentLocation",
        "opcRequestId",
        "opcWorkRequestId",
        "mlApplicationInstance"
    })
    private CreateMlApplicationInstanceResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String location,
            String contentLocation,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.datascience.model.MlApplicationInstance mlApplicationInstance) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.location = location;
        this.contentLocation = contentLocation;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.mlApplicationInstance = mlApplicationInstance;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateMlApplicationInstanceResponse> {
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
         * Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         */
        private String etag;

        /**
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency
         * Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
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

        /** The URI that identifies the entity described in the response body. */
        private String contentLocation;

        /**
         * The URI that identifies the entity described in the response body.
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
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
         * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work
         * request. Use
         * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/API/Concepts/identifiers.htm) of the work
         * request. Use
         * [GetWorkRequest](https://docs.oracle.com/iaas/api/#/en/workrequests/20160918/WorkRequest/GetWorkRequest)
         * with this ID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The returned {@code MlApplicationInstance} instance. */
        private com.oracle.bmc.datascience.model.MlApplicationInstance mlApplicationInstance;

        /**
         * The returned {@code MlApplicationInstance} instance.
         *
         * @param mlApplicationInstance the value to set
         * @return this builder
         */
        public Builder mlApplicationInstance(
                com.oracle.bmc.datascience.model.MlApplicationInstance mlApplicationInstance) {
            this.mlApplicationInstance = mlApplicationInstance;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateMlApplicationInstanceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            mlApplicationInstance(o.getMlApplicationInstance());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateMlApplicationInstanceResponse build() {
            return new CreateMlApplicationInstanceResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    location,
                    contentLocation,
                    opcRequestId,
                    opcWorkRequestId,
                    mlApplicationInstance);
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
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",mlApplicationInstance=").append(String.valueOf(mlApplicationInstance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMlApplicationInstanceResponse)) {
            return false;
        }

        CreateMlApplicationInstanceResponse other = (CreateMlApplicationInstanceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(
                        this.mlApplicationInstance, other.mlApplicationInstance);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationInstance == null
                                ? 43
                                : this.mlApplicationInstance.hashCode());
        return result;
    }
}
