/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.pki;

/**
 * Denotes a type which holds sensitive data and must be erased once it has been used.
 *
 * <h3>Usage Model</h3>
 *
 * Use the try-with-resources idiom to assure the sensitive data is erased after use:
 *
 * <pre>
 *     try ( Sensitive sensitive = ... ) {
 *         // use the sensitive data
 *         ...
 *     }
 * </pre>
 */
interface Sensitive extends AutoCloseable {
    /** Must erase the contents of the passphrase */
    @Override
    void close();
}
