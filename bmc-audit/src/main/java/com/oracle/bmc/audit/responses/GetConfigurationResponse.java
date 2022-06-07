/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.responses;

import com.oracle.bmc.audit.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
public class GetConfigurationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The returned Configuration instance.
     */
    private com.oracle.bmc.audit.model.Configuration configuration;

    public com.oracle.bmc.audit.model.Configuration getConfiguration() {
        return configuration;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "configuration"})
    private GetConfigurationResponse(
            int __httpStatusCode__, com.oracle.bmc.audit.model.Configuration configuration) {
        super(__httpStatusCode__);
        this.configuration = configuration;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private com.oracle.bmc.audit.model.Configuration configuration;

        public Builder configuration(com.oracle.bmc.audit.model.Configuration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetConfigurationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());

            configuration(o.getConfiguration());

            return this;
        }

        public GetConfigurationResponse build() {
            return new GetConfigurationResponse(__httpStatusCode__, configuration);
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
        sb.append(",configuration=").append(String.valueOf(configuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetConfigurationResponse)) {
            return false;
        }

        GetConfigurationResponse other = (GetConfigurationResponse) o;
        return super.equals(o) && java.util.Objects.equals(this.configuration, other.configuration);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        return result;
    }
}
