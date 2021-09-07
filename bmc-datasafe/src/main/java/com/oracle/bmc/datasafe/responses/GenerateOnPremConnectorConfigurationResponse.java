/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class GenerateOnPremConnectorConfigurationResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Size of the file.
     */
    private Long contentLength;

    /**
     * The date and time the on-premises connector configuration was last modified, in the format defined by HTTP-date.
     */
    private java.util.Date lastModified;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    private GenerateOnPremConnectorConfigurationResponse(
            int __httpStatusCode__,
            String opcRequestId,
            Long contentLength,
            java.util.Date lastModified,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.contentLength = contentLength;
        this.lastModified = lastModified;
        this.inputStream = inputStream;
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
        public Builder copy(GenerateOnPremConnectorConfigurationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            lastModified(o.getLastModified());
            inputStream(o.getInputStream());

            return this;
        }

        public GenerateOnPremConnectorConfigurationResponse build() {
            return new GenerateOnPremConnectorConfigurationResponse(
                    __httpStatusCode__, opcRequestId, contentLength, lastModified, inputStream);
        }
    }
}
