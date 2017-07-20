/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UploadPartRequest {

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
     * The part number that identifies the object part currently being uploaded.
     */
    private Integer uploadPartNum;

    /**
     * The content length of the body.
     */
    private Long contentLength;

    /**
     * The part being uploaded to the Object Storage Service.
     */
    private java.io.InputStream uploadPartBody;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * The entity tag to match. For creating and committing a multipart upload to an object, this is the entity tag of the target object.
     * For uploading a part, this is the entity tag of the target part.
     *
     */
    private String ifMatch;

    /**
     * The entity tag to avoid matching. The only valid value is \u2018*\u2019, which indicates that the request should fail if the object already exists.
     * For creating and committing a multipart upload, this is the entity tag of the target object. For uploading a part, this is the entity tag
     * of the target part.
     *
     */
    private String ifNoneMatch;

    /**
     * 100-continue
     */
    private String expect;

    /**
     * The base-64 encoded MD5 hash of the body.
     */
    private String contentMD5;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UploadPartRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            uploadId(o.getUploadId());
            uploadPartNum(o.getUploadPartNum());
            contentLength(o.getContentLength());
            uploadPartBody(o.getUploadPartBody());
            opcClientRequestId(o.getOpcClientRequestId());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            expect(o.getExpect());
            contentMD5(o.getContentMD5());
            return this;
        }
    }
}
