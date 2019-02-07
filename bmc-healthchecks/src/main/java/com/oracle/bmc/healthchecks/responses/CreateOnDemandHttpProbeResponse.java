/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.responses;

import com.oracle.bmc.healthchecks.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateOnDemandHttpProbeResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The URL for fetching probe results.
     */
    private String location;

    /**
     * The returned HttpProbe instance.
     */
    private HttpProbe httpProbe;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateOnDemandHttpProbeResponse o) {
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            httpProbe(o.getHttpProbe());

            return this;
        }
    }
}
