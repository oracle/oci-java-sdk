/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import java.util.List;
import java.util.Map;

import com.oracle.bmc.responses.BmcResponse;

public class GetOkeResourcePrincipalSessionTokenResponse extends BmcResponse {
    final OkeResourcePrincipalSessionToken body;

    private GetOkeResourcePrincipalSessionTokenResponse(Builder builder) {
        super(builder.__httpStatusCode__);
        this.body = builder.body;
    }

    static class Builder
            implements BmcResponse.Builder<GetOkeResourcePrincipalSessionTokenResponse> {
        private int __httpStatusCode__;
        private Map<String, List<String>> headers;
        OkeResourcePrincipalSessionToken body;

        public BmcResponse.Builder<GetOkeResourcePrincipalSessionTokenResponse> body(
                OkeResourcePrincipalSessionToken body) {
            this.body = body;
            return this;
        }

        @Override
        public BmcResponse.Builder<GetOkeResourcePrincipalSessionTokenResponse> __httpStatusCode__(
                int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        @Override
        public BmcResponse.Builder<GetOkeResourcePrincipalSessionTokenResponse> headers(
                Map<String, List<String>> headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public BmcResponse.Builder<GetOkeResourcePrincipalSessionTokenResponse> copy(
                GetOkeResourcePrincipalSessionTokenResponse o) {
            this.__httpStatusCode__ = o.get__httpStatusCode__();
            this.body = o.body;
            return this;
        }

        @Override
        public GetOkeResourcePrincipalSessionTokenResponse build() {
            return new GetOkeResourcePrincipalSessionTokenResponse(this);
        }
    }
}
