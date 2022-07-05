/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

public class DataKey {
    public final String ciphertext;
    public final String plaintext;
    public final String plaintextChecksum;

    @java.beans.ConstructorProperties({"ciphertext", "plaintext", "plaintextChecksum"})
    public DataKey(String ciphertext, String plaintext, String plaintextChecksum) {
        this.ciphertext = ciphertext;
        this.plaintext = plaintext;
        this.plaintextChecksum = plaintextChecksum;
    }

    public String getCiphertext() {
        return this.ciphertext;
    }

    public String getPlaintext() {
        return this.plaintext;
    }

    public String getPlaintextChecksum() {
        return this.plaintextChecksum;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DataKey)) return false;
        final DataKey other = (DataKey) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$ciphertext = this.getCiphertext();
        final Object other$ciphertext = other.getCiphertext();
        if (this$ciphertext == null
                ? other$ciphertext != null
                : !this$ciphertext.equals(other$ciphertext)) return false;
        final Object this$plaintext = this.getPlaintext();
        final Object other$plaintext = other.getPlaintext();
        if (this$plaintext == null
                ? other$plaintext != null
                : !this$plaintext.equals(other$plaintext)) return false;
        final Object this$plaintextChecksum = this.getPlaintextChecksum();
        final Object other$plaintextChecksum = other.getPlaintextChecksum();
        if (this$plaintextChecksum == null
                ? other$plaintextChecksum != null
                : !this$plaintextChecksum.equals(other$plaintextChecksum)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DataKey;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $ciphertext = this.getCiphertext();
        result = result * PRIME + ($ciphertext == null ? 43 : $ciphertext.hashCode());
        final Object $plaintext = this.getPlaintext();
        result = result * PRIME + ($plaintext == null ? 43 : $plaintext.hashCode());
        final Object $plaintextChecksum = this.getPlaintextChecksum();
        result = result * PRIME + ($plaintextChecksum == null ? 43 : $plaintextChecksum.hashCode());
        return result;
    }

    public String toString() {
        return "DataKey(ciphertext="
                + this.getCiphertext()
                + ", plaintext="
                + this.getPlaintext()
                + ", plaintextChecksum="
                + this.getPlaintextChecksum()
                + ")";
    }
}
