/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UpdateIPSecConnectionTunnelSharedSecretRequest
        extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the IPSec connection.
     */
    private String ipscId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the tunnel.
     */
    private String tunnelId;

    /**
     * Details object for updating a IPSec connection tunnel's sharedSecret.
     */
    private UpdateIPSecConnectionTunnelSharedSecretDetails
            updateIPSecConnectionTunnelSharedSecretDetails;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the `if-match`
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateIPSecConnectionTunnelSharedSecretRequest o) {
            ipscId(o.getIpscId());
            tunnelId(o.getTunnelId());
            updateIPSecConnectionTunnelSharedSecretDetails(
                    o.getUpdateIPSecConnectionTunnelSharedSecretDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of UpdateIPSecConnectionTunnelSharedSecretRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateIPSecConnectionTunnelSharedSecretRequest
         */
        public UpdateIPSecConnectionTunnelSharedSecretRequest build() {
            UpdateIPSecConnectionTunnelSharedSecretRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
