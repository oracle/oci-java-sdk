/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import java.io.*;
import java.util.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.model.*;
import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class ListMultipartUploadPartsRequest {

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
     * The name of the object.
     * <p>
     * Example: `test/object1.log`
     *
     */
    private String objectName;

    /**
     * The upload ID for a multipart upload.
     */
    private String uploadId;

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
        public Builder copy(ListMultipartUploadPartsRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            uploadId(o.getUploadId());
            limit(o.getLimit());
            page(o.getPage());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }
    }
}
