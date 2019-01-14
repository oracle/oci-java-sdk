/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.internal;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ObjectStorageUtils {

    public static String getIfNoneMatchHeader(boolean allowOverwrite) {
        return allowOverwrite ? null : "*";
    }
}
