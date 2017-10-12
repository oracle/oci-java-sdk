/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class FailoverDataGuardAssociationRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The database [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     */
    private String databaseId;

    /**
     * The Data Guard association's [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     */
    private String dataGuardAssociationId;

    /**
     * A request to perform a failover, transitioning a standby database into a primary database.
     */
    private FailoverDataGuardAssociationDetails failoverDataGuardAssociationDetails;

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
        public Builder copy(FailoverDataGuardAssociationRequest o) {
            databaseId(o.getDatabaseId());
            dataGuardAssociationId(o.getDataGuardAssociationId());
            failoverDataGuardAssociationDetails(o.getFailoverDataGuardAssociationDetails());
            ifMatch(o.getIfMatch());
            return this;
        }

        /**
         * Build the instance of FailoverDataGuardAssociationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of FailoverDataGuardAssociationRequest
         */
        public FailoverDataGuardAssociationRequest build() {
            FailoverDataGuardAssociationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
