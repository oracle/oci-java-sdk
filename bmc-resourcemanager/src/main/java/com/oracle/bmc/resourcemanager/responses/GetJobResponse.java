/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetJobResponse {

    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * The returned Job instance.
     */
    private Job job;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetJobResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            job(o.getJob());

            return this;
        }
    }
}
