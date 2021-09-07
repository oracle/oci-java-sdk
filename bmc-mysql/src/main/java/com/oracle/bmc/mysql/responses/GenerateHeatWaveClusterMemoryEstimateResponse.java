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
public class GenerateHeatWaveClusterMemoryEstimateResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned HeatWaveClusterMemoryEstimate instance.
     */
    private com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate heatWaveClusterMemoryEstimate;

    private GenerateHeatWaveClusterMemoryEstimateResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.mysql.model.HeatWaveClusterMemoryEstimate
                    heatWaveClusterMemoryEstimate) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.heatWaveClusterMemoryEstimate = heatWaveClusterMemoryEstimate;
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
        public Builder copy(GenerateHeatWaveClusterMemoryEstimateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            heatWaveClusterMemoryEstimate(o.getHeatWaveClusterMemoryEstimate());

            return this;
        }

        public GenerateHeatWaveClusterMemoryEstimateResponse build() {
            return new GenerateHeatWaveClusterMemoryEstimateResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcWorkRequestId,
                    heatWaveClusterMemoryEstimate);
        }
    }
}
