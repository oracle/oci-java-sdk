/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.bmc.responses.BmcResponse;

public class GetResourcePrincipalTokenResponse {
    @JsonProperty("resourcePrincipalToken")
    private String resourcePrincipalToken;

    @JsonProperty("servicePrincipalSessionToken")
    private String servicePrincipalSessionToken;

    public String getResourcePrincipalToken() {
        return this.resourcePrincipalToken;
    }

    public String getServicePrincipalSessionToken() {
        return this.servicePrincipalSessionToken;
    }

    @JsonProperty("resourcePrincipalToken")
    public void setResourcePrincipalToken(String resourcePrincipalToken) {
        this.resourcePrincipalToken = resourcePrincipalToken;
    }

    @JsonProperty("servicePrincipalSessionToken")
    public void setServicePrincipalSessionToken(String servicePrincipalSessionToken) {
        this.servicePrincipalSessionToken = servicePrincipalSessionToken;
    }

    static class ResponseWrapper extends BmcResponse {
        final GetResourcePrincipalTokenResponse body;

        private ResponseWrapper(Builder builder) {
            super(builder.__httpStatusCode__, builder.headers);
            this.body = builder.body;
        }

        static class Builder implements BmcResponse.Builder<ResponseWrapper> {
            private int __httpStatusCode__;
            private Map<String, List<String>> headers;
            GetResourcePrincipalTokenResponse body;

            @Override
            public BmcResponse.Builder<ResponseWrapper> __httpStatusCode__(int __httpStatusCode__) {
                this.__httpStatusCode__ = __httpStatusCode__;
                return this;
            }

            @Override
            public BmcResponse.Builder<ResponseWrapper> headers(Map<String, List<String>> headers) {
                this.headers = headers;
                return this;
            }

            @Override
            public BmcResponse.Builder<ResponseWrapper> copy(ResponseWrapper o) {
                this.__httpStatusCode__ = o.get__httpStatusCode__();
                this.body = o.body;
                return this;
            }

            @Override
            public ResponseWrapper build() {
                return new ResponseWrapper(this);
            }
        }
    }
}
