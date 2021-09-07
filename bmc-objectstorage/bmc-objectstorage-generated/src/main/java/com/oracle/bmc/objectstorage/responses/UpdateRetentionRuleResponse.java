/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class UpdateRetentionRuleResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The entity tag (ETag) for the retention rule that was updated.
     */
    private String etag;

    /**
     * The returned RetentionRule instance.
     */
    private com.oracle.bmc.objectstorage.model.RetentionRule retentionRule;

    private UpdateRetentionRuleResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String etag,
            com.oracle.bmc.objectstorage.model.RetentionRule retentionRule) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.retentionRule = retentionRule;
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
        public Builder copy(UpdateRetentionRuleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            retentionRule(o.getRetentionRule());

            return this;
        }

        public UpdateRetentionRuleResponse build() {
            return new UpdateRetentionRuleResponse(
                    __httpStatusCode__, opcClientRequestId, opcRequestId, etag, retentionRule);
        }
    }
}
