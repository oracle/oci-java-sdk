/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.common.ClientBuilderBase;

public class BaseAsyncClient extends BaseClient implements AutoCloseable {

    protected BaseAsyncClient(
            ClientBuilderBase<?, ?> builder,
            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider, null);
    }
}
