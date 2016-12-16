/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.responses;

import java.io.*;
import java.util.*;

import com.oracle.bmc.model.*;
import javax.ws.rs.core.*;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Builder(builderClassName = "Builder")
@Getter
public class HeadObjectResponse {

    /**
     * Echoes back the value passed in in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, please provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The entity tag for the object.
     */
    private String eTag;

    /**
     * The user-defined metadata for the object.
     */
    private Map<String, String> opcMeta;

    /**
     * The object size in bytes.
     */
    private Long contentLength;

    /**
     * Content-MD5 header, per RFC 2616, section 14.15
     */
    private String contentMd5;

    /**
     * Content-Type header, per RFC 2616, section 14.17
     */
    private String contentType;

    /**
     * Content-Language header, per RFC 2616, section 14.12
     */
    private String contentLanguage;

    /**
     * Content-Encoding header, per RFC 2616, section 14.11
     */
    private String contentEncoding;

    /**
     * The object modification time, per RFC 2616, section 14.29
     */
    private Date lastModified;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;
}
