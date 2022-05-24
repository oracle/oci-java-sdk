/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateTranslatorResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Fully qualified URL for the newly created resource.
     */
    private String location;

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Translator instance.
     */
    private com.oracle.bmc.oda.model.Translator translator;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "location",
        "etag",
        "opcRequestId",
        "translator"
    })
    private CreateTranslatorResponse(
            int __httpStatusCode__,
            String location,
            String etag,
            String opcRequestId,
            com.oracle.bmc.oda.model.Translator translator) {
        super(__httpStatusCode__);
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.translator = translator;
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
        public Builder copy(CreateTranslatorResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            translator(o.getTranslator());

            return this;
        }

        public CreateTranslatorResponse build() {
            return new CreateTranslatorResponse(
                    __httpStatusCode__, location, etag, opcRequestId, translator);
        }
    }
}
