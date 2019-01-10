/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;

/**
 * A region provider has the API to return the region.
 * <p>
 * An {@link AbstractAuthenticationDetailsProvider} can also implements this interface
 * as a way to bootstrap a client during initialization using the Region returned
 * by this interface.
 */
public interface RegionProvider {
    /**
     * Returns the region.
     *
     * @return Region object.
     */
    Region getRegion();
}
