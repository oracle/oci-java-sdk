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
public class PutObjectRequest {

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
     * The content length of the body.
     */
    private Long contentLength;

    /**
     * The object being put to the object store.
     */
    private InputStream putObjectBody;

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
     * 100-continue
     */
    private String expect;

    /**
     * The base-64 encoded MD5 hash of the body.
     */
    private String contentMD5;

    /**
     * The content type of the object.  Defaults to 'application/octet-stream' if not overridden during the PutObject call.
     */
    private String contentType;

    /**
     * The content language of the object.
     */
    private String contentLanguage;

    /**
     * The content encoding of the object.
     */
    private String contentEncoding;

    /**
     * Optional user-defined metadata key and value.
     */
    private Map<String, String> opcMeta;
}
