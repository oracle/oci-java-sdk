/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.pki;

public class PemEncryptedKeyException extends PemEncryptionException {
    PemEncryptedKeyException() {
        super("Private Key is encrypted, but no passphrase configured");
    }
}
