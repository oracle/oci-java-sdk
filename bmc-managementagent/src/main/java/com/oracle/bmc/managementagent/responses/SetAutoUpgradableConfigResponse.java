/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.responses;

import com.oracle.bmc.managementagent.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class SetAutoUpgradableConfigResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned AutoUpgradableConfig instance.
     */
    private com.oracle.bmc.managementagent.model.AutoUpgradableConfig autoUpgradableConfig;

    public com.oracle.bmc.managementagent.model.AutoUpgradableConfig getAutoUpgradableConfig() {
        return autoUpgradableConfig;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "autoUpgradableConfig"
    })
    private SetAutoUpgradableConfigResponse(
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

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.managementagent.model.AutoUpgradableConfig autoUpgradableConfig;

        public Builder autoUpgradableConfig(
                com.oracle.bmc.managementagent.model.AutoUpgradableConfig autoUpgradableConfig) {
            this.autoUpgradableConfig = autoUpgradableConfig;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SetAutoUpgradableConfigResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            autoUpgradableConfig(o.getAutoUpgradableConfig());

            return this;
        }

        public SetAutoUpgradableConfigResponse build() {
            return new SetAutoUpgradableConfigResponse(
                    __httpStatusCode__, opcRequestId, autoUpgradableConfig);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",autoUpgradableConfig=").append(String.valueOf(autoUpgradableConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetAutoUpgradableConfigResponse)) {
            return false;
        }

        SetAutoUpgradableConfigResponse other = (SetAutoUpgradableConfigResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.autoUpgradableConfig, other.autoUpgradableConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.autoUpgradableConfig == null
                                ? 43
                                : this.autoUpgradableConfig.hashCode());
        return result;
    }
}
