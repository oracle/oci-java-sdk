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
public class GetRetentionRuleResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The entity tag (ETag) for the retention rule.
     */
    private String etag;

    /**
     * The time the retention rule was last modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29)
     */
    private java.util.Date lastModified;

    /**
     * The returned RetentionRule instance.
     */
    private com.oracle.bmc.objectstorage.model.RetentionRule retentionRule;

    private GetRetentionRuleResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String etag,
            java.util.Date lastModified,
            com.oracle.bmc.objectstorage.model.RetentionRule retentionRule) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.lastModified = lastModified;
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
        public Builder copy(GetRetentionRuleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            lastModified(o.getLastModified());
            retentionRule(o.getRetentionRule());

            return this;
        }

        public GetRetentionRuleResponse build() {
            return new GetRetentionRuleResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    etag,
                    lastModified,
                    retentionRule);
        }
    }
}
