/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.responses;

import com.oracle.bmc.mysql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class CreateConfigurationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The URI for the entity being described in the response body.
     */
    private String location;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * The returned Configuration instance.
     */
    private com.oracle.bmc.mysql.model.Configuration configuration;

    private CreateConfigurationResponse(
            int __httpStatusCode__,
            String location,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.mysql.model.Configuration configuration) {
        super(__httpStatusCode__);
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.configuration = configuration;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateConfigurationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            configuration(o.getConfiguration());

            return this;
        }

        public CreateConfigurationResponse build() {
            return new CreateConfigurationResponse(
                    __httpStatusCode__,
                    location,
                    etag,
                    opcRequestId,
                    opcWorkRequestId,
                    configuration);
        }
    }
}
