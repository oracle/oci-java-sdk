/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateBucketRequest {

    /**
     * The top-level namespace used for the request.
     */
    private String namespaceName;

    /**
     * Request object for creating a bucket.
     */
    private CreateBucketDetails createBucketDetails;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateBucketRequest o) {
            namespaceName(o.getNamespaceName());
            createBucketDetails(o.getCreateBucketDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }
    }
}
