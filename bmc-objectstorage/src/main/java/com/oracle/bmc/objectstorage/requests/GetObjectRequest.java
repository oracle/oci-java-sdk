/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
public class GetObjectRequest {

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
     * Example: `test/test1`
     *
     */
    private String objectName;

    /**
     * The entity tag to match.
     */
    private String ifMatch;

    /**
     * The entity tag to avoid matching. The only valid value is \u2018*\u2019, which indicates that the request should fail if the object already exists.
     *
     */
    private String ifNoneMatch;

    /**
     * The client request ID for tracing
     */
    private String opcClientRequestId;

    /**
     * Optional byte range to fetch. Follows https://tools.ietf.org/html/rfc7233#section-2.1.
     * Note, only one byte range is supported.
     *
     */
    private Range range;
}
