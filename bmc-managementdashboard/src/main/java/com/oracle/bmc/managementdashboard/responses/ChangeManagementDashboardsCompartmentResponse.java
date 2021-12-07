/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.responses;

import com.oracle.bmc.managementdashboard.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ChangeManagementDashboardsCompartmentResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned ManagementDashboard instance.
     */
    private com.oracle.bmc.managementdashboard.model.ManagementDashboard managementDashboard;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "opcWorkRequestId",
        "managementDashboard"
    })
    private ChangeManagementDashboardsCompartmentResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.managementdashboard.model.ManagementDashboard managementDashboard) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.managementDashboard = managementDashboard;
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
        public Builder copy(ChangeManagementDashboardsCompartmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            managementDashboard(o.getManagementDashboard());

            return this;
        }

        public ChangeManagementDashboardsCompartmentResponse build() {
            return new ChangeManagementDashboardsCompartmentResponse(
                    __httpStatusCode__, etag, opcRequestId, opcWorkRequestId, managementDashboard);
        }
    }
}
