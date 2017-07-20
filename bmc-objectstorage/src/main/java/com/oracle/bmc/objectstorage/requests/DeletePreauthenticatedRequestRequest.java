/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class DeletePreauthenticatedRequestRequest {

    /**
     * The top-level namespace used for the request.
     */
    private String namespaceName;

    /**
     * The name of the bucket.
     * <p>
     * Example: `my-new-bucket1`
     *
     */
    private String bucketName;

    /**
     * The unique identifier for the pre-authenticated request (PAR). This can be used to manage the PAR
     * such as GET or DELETE the PAR
     *
     */
    private String parId;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DeletePreauthenticatedRequestRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            parId(o.getParId());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }
    }
}
