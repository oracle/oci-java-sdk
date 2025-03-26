/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import org.slf4j.Logger;

/**
 * This path provider directly takes a string and returns it.
 */
public class StringRptPathProvider implements RptPathProvider {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(StringRptPathProvider.class);
    private final String path;

    /**
     * Constructor of StringRptPathProvider.
     *
     * @param path string that represents the path for resource principal token.
     */
    public StringRptPathProvider(String path) {
        this.path = path;
        LOG.debug("Found String RPT Path Provider with path {}", path);
    }

    @Override
    public String getPath() {
        return path;
    }
}
