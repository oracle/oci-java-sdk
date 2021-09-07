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
public class GetReplicationPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * The returned ReplicationPolicy instance.
     */
    private com.oracle.bmc.objectstorage.model.ReplicationPolicy replicationPolicy;

    private GetReplicationPolicyResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcClientRequestId,
            com.oracle.bmc.objectstorage.model.ReplicationPolicy replicationPolicy) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.replicationPolicy = replicationPolicy;
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
        public Builder copy(GetReplicationPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            replicationPolicy(o.getReplicationPolicy());

            return this;
        }

        public GetReplicationPolicyResponse build() {
            return new GetReplicationPolicyResponse(
                    __httpStatusCode__, opcRequestId, opcClientRequestId, replicationPolicy);
        }
    }
}
