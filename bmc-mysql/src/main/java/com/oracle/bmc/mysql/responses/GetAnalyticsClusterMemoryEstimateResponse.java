/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.responses;

import com.oracle.bmc.mysql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetAnalyticsClusterMemoryEstimateResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned AnalyticsClusterMemoryEstimate instance.
     */
    private AnalyticsClusterMemoryEstimate analyticsClusterMemoryEstimate;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAnalyticsClusterMemoryEstimateResponse o) {
            opcRequestId(o.getOpcRequestId());
            analyticsClusterMemoryEstimate(o.getAnalyticsClusterMemoryEstimate());

            return this;
        }
    }
}
