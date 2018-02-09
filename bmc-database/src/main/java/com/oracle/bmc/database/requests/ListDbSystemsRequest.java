/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListDbSystemsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The compartment [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * The OCID of the backup. Specify a backupId to list only the DB Systems that support creating a database using this backup in this compartment.
     */
    private String backupId;

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
        public Builder copy(ListDbSystemsRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            backupId(o.getBackupId());
            return this;
        }

        /**
         * Build the instance of ListDbSystemsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDbSystemsRequest
         */
        public ListDbSystemsRequest build() {
            ListDbSystemsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
