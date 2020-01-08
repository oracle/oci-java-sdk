/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateOdaInstanceResponse {

    /**
     * Fully qualified URL for the newly created instance.
     */
    private String location;

    /**
     * For use in a PUT or DELETE `if-match` query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status
     * of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you contact Oracle
     * about this request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned OdaInstance instance.
     */
    private OdaInstance odaInstance;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateOdaInstanceResponse o) {
            location(o.getLocation());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            odaInstance(o.getOdaInstance());

            return this;
        }
    }
}
