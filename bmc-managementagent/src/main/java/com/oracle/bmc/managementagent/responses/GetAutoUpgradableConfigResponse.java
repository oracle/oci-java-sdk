/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.responses;

import com.oracle.bmc.managementagent.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetAutoUpgradableConfigResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned AutoUpgradableConfig instance.
     */
    private com.oracle.bmc.managementagent.model.AutoUpgradableConfig autoUpgradableConfig;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "autoUpgradableConfig"
    })
    private GetAutoUpgradableConfigResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.managementagent.model.AutoUpgradableConfig autoUpgradableConfig) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.autoUpgradableConfig = autoUpgradableConfig;
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
        public Builder copy(GetAutoUpgradableConfigResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            autoUpgradableConfig(o.getAutoUpgradableConfig());

            return this;
        }

        public GetAutoUpgradableConfigResponse build() {
            return new GetAutoUpgradableConfigResponse(
                    __httpStatusCode__, opcRequestId, autoUpgradableConfig);
        }
    }
}
