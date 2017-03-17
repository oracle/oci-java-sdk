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
public class ListObjectsRequest {

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
     * Object names returned by a list query must start with prefix
     */
    private String prefix;

    /**
     * Object names returned by a list query must be greater or equal to this parameter
     */
    private String start;

    /**
     * Object names returned by a list query must be strictly less than this parameter
     */
    private String end;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * When this parameter is set, only objects whose names do not contain the delimiter character
     * (after an optionally specified prefix) are returned. Scanned objects whose names contain the
     * delimiter have part of their name up to the last occurrence of the delimiter (after the optional
     * prefix) returned as a set of prefixes. Note that only '/' is a supported delimiter character at
     * this time.
     *
     */
    private String delimiter;

    /**
     * Object summary in list of objects includes the 'name' field.   This parameter may also include 'size'
     * (object size in bytes), 'md5', and 'timeCreated' (object creation date and time) fields.
     * Value of this parameter should be a comma separated, case-insensitive list of those field names.
     * For example 'name,timeCreated,md5'
     *
     */
    private String fields;

    /**
     * The client request ID for tracing
     */
    private String opcClientRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListObjectsRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            prefix(o.getPrefix());
            start(o.getStart());
            end(o.getEnd());
            limit(o.getLimit());
            delimiter(o.getDelimiter());
            fields(o.getFields());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }
    }
}
