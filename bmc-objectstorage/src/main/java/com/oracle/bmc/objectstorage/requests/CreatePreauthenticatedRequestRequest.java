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
public class CreatePreauthenticatedRequestRequest {

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
     * details for creating the pre-authenticated request.
     */
    private CreatePreauthenticatedRequestDetails createPreauthenticatedRequestDetails;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreatePreauthenticatedRequestRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            createPreauthenticatedRequestDetails(o.getCreatePreauthenticatedRequestDetails());
            opcClientRequestId(o.getOpcClientRequestId());
            return this;
        }
    }
}
