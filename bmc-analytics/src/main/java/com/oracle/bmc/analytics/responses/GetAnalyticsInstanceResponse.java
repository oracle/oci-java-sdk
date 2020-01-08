/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.analytics.responses;

import com.oracle.bmc.analytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetAnalyticsInstanceResponse {

    /**
     * For optimistic concurrency control. See `if-match`.
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
     * The returned AnalyticsInstance instance.
     */
    private AnalyticsInstance analyticsInstance;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAnalyticsInstanceResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            analyticsInstance(o.getAnalyticsInstance());

            return this;
        }
    }
}
