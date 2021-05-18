/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import lombok.extern.slf4j.Slf4j;

/**
 * This path provider directly takes a string and returns it.
 */
@Slf4j
public class StringRptPathProvider implements RptPathProvider {

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
