/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.responses;

import com.oracle.bmc.computeinstanceagent.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GetInstanceAgentPluginResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned InstanceAgentPlugin instance.
     */
    private com.oracle.bmc.computeinstanceagent.model.InstanceAgentPlugin instanceAgentPlugin;

    private GetInstanceAgentPluginResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.computeinstanceagent.model.InstanceAgentPlugin instanceAgentPlugin) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.instanceAgentPlugin = instanceAgentPlugin;
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
        public Builder copy(GetInstanceAgentPluginResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            instanceAgentPlugin(o.getInstanceAgentPlugin());

            return this;
        }

        public GetInstanceAgentPluginResponse build() {
            return new GetInstanceAgentPluginResponse(
                    __httpStatusCode__, opcRequestId, instanceAgentPlugin);
        }
    }
}
