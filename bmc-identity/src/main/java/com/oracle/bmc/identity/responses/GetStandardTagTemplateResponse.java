/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetStandardTagTemplateResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned StandardTagNamespaceTemplate instance.
     */
    private com.oracle.bmc.identity.model.StandardTagNamespaceTemplate standardTagNamespaceTemplate;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "standardTagNamespaceTemplate"
    })
    private GetStandardTagTemplateResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.identity.model.StandardTagNamespaceTemplate
                    standardTagNamespaceTemplate) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.standardTagNamespaceTemplate = standardTagNamespaceTemplate;
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
        public Builder copy(GetStandardTagTemplateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            standardTagNamespaceTemplate(o.getStandardTagNamespaceTemplate());

            return this;
        }

        public GetStandardTagTemplateResponse build() {
            return new GetStandardTagTemplateResponse(
                    __httpStatusCode__, opcRequestId, standardTagNamespaceTemplate);
        }
    }
}
