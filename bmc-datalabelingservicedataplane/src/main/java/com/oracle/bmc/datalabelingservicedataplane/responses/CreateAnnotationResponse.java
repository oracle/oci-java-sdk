/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.responses;

import com.oracle.bmc.datalabelingservicedataplane.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateAnnotationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Annotation instance.
     */
    private com.oracle.bmc.datalabelingservicedataplane.model.Annotation annotation;

    @java.beans.ConstructorProperties({"__httpStatusCode__", "etag", "opcRequestId", "annotation"})
    private CreateAnnotationResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.datalabelingservicedataplane.model.Annotation annotation) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.annotation = annotation;
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
        public Builder copy(CreateAnnotationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            annotation(o.getAnnotation());

            return this;
        }

        public CreateAnnotationResponse build() {
            return new CreateAnnotationResponse(__httpStatusCode__, etag, opcRequestId, annotation);
        }
    }
}
