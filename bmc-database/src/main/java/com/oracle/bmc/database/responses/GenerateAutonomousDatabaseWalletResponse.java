/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GenerateAutonomousDatabaseWalletResponse {

    /**
     * Size of the file.
     */
    private Long contentLength;

    /**
     * For optimistic concurrency control. See `if-match`.
     */
    private String etag;

    /**
     * The date and time the wallet was created, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    private java.util.Date lastModified;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GenerateAutonomousDatabaseWalletResponse o) {
            contentLength(o.getContentLength());
            etag(o.getEtag());
            lastModified(o.getLastModified());
            opcRequestId(o.getOpcRequestId());
            inputStream(o.getInputStream());

            return this;
        }
    }
}
