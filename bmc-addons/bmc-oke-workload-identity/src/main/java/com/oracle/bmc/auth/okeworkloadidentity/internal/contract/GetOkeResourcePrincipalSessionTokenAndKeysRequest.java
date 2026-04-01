/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal.contract;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/** @Immutable */
/**
 * Marker request for proxymux endpoint to obtain a new resource principal token and ephemeral key pair.
 */
@JsonInclude(NON_NULL)
public class GetOkeResourcePrincipalSessionTokenAndKeysRequest {
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOkeResourcePrincipalSessionTokenAndKeysRequest)) {
            return false;
        }
        GetOkeResourcePrincipalSessionTokenAndKeysRequest other =
                (GetOkeResourcePrincipalSessionTokenAndKeysRequest) o;
        return other.canEqual(this);
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetOkeResourcePrincipalSessionTokenAndKeysRequest;
    }
}
