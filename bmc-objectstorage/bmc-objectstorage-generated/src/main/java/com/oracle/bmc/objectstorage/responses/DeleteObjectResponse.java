/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class DeleteObjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The time the object was deleted, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * The {@code versionId} of the delete marker created as a result of the DELETE Object.
     * If the request contains a specific {@code versionId}, then this response header will be the same as the requested {@code versionId} of the object that was deleted.
     *
     */
    private String versionId;

    /**
     * This is {@code true} if the deleted object is a delete marker, otherwise {@code false}
     *
     */
    private Boolean isDeleteMarker;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcClientRequestId",
        "opcRequestId",
        "lastModified",
        "versionId",
        "isDeleteMarker"
    })
    private DeleteObjectResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            java.util.Date lastModified,
            String versionId,
            Boolean isDeleteMarker) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.lastModified = lastModified;
        this.versionId = versionId;
        this.isDeleteMarker = isDeleteMarker;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeleteObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            lastModified(o.getLastModified());
            versionId(o.getVersionId());
            isDeleteMarker(o.getIsDeleteMarker());

            return this;
        }

        public DeleteObjectResponse build() {
            return new DeleteObjectResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    lastModified,
                    versionId,
                    isDeleteMarker);
        }
    }
}
