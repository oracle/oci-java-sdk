/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.014")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetApplianceExportJobResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    /**
     * The returned ApplianceExportJob instance.
     */
    private ApplianceExportJob applianceExportJob;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetApplianceExportJobResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            applianceExportJob(o.getApplianceExportJob());

            return this;
        }
    }
}
