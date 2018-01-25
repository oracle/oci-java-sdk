/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.Region;

/**
 * A region provider has the API to return the region.
 */
public interface RegionProvider {
    /**
     * Returns the region.
     *
     * @return Region object.
     */
    Region getRegion();
}
