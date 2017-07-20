/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListPreauthenticatedRequestsRequest {

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
     * Pre-authenticated requests returned by the list must have object names starting with prefix
     */
    private String objectNamePrefix;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page at which to start retrieving results.
     */
    private String page;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPreauthenticatedRequestsRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectNamePrefix(o.getObjectNamePrefix());
            limit(o.getLimit());
            page(o.getPage());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }
    }
}
