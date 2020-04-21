/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io;

import java.io.InputStream;

/**
 * Interface describing an InputStream that can safely be duplicated from its start and used
 * in a thread-safe manner.
 * <p>
 * Add this to any class that extends {@link InputStream} and can safely duplicate that stream.
 * Duplicate streams can be used, for example, when uploading objects to object storage to allow
 * for parallel uploads.
 */
public interface DuplicatableInputStream {

    /**
     * Produces a duplicate stream of the source (from its start) that can be used in parallel
     * to the original stream (ie, thread safe).
     * @return A new input stream instance.
     */
    InputStream duplicate();
}
