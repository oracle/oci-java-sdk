/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway.responses;

import com.oracle.bmc.apigateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateDeploymentResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * The OCID of the work request. Use
     * {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with
     * this id to track the status
     * of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * id.
     *
     */
    private String opcRequestId;

    /**
     * Location of the resource.
     *
     */
    private String location;

    /**
     * The returned Deployment instance.
     */
    private Deployment deployment;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateDeploymentResponse o) {
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            deployment(o.getDeployment());

            return this;
        }
    }
}
