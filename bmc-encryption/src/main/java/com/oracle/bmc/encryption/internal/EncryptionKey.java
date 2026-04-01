/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

public final class EncryptionKey {
    public final String region;
    public final String vaultId;
    public final String masterKeyId;
    public final String encryptedDataKey;

    @java.beans.ConstructorProperties({"region", "vaultId", "masterKeyId", "encryptedDataKey"})
    public EncryptionKey(
            String region, String vaultId, String masterKeyId, String encryptedDataKey) {
        this.region = region;
        this.vaultId = vaultId;
        this.masterKeyId = masterKeyId;
        this.encryptedDataKey = encryptedDataKey;
    }

    public String getRegion() {
        return this.region;
    }

    public String getVaultId() {
        return this.vaultId;
    }

    public String getMasterKeyId() {
        return this.masterKeyId;
    }

    public String getEncryptedDataKey() {
        return this.encryptedDataKey;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof EncryptionKey)) return false;
        final EncryptionKey other = (EncryptionKey) o;
        final Object this$region = this.getRegion();
        final Object other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region))
            return false;
        final Object this$vaultId = this.getVaultId();
        final Object other$vaultId = other.getVaultId();
        if (this$vaultId == null ? other$vaultId != null : !this$vaultId.equals(other$vaultId))
            return false;
        final Object this$masterKeyId = this.getMasterKeyId();
        final Object other$masterKeyId = other.getMasterKeyId();
        if (this$masterKeyId == null
                ? other$masterKeyId != null
                : !this$masterKeyId.equals(other$masterKeyId)) return false;
        final Object this$encryptedDataKey = this.getEncryptedDataKey();
        final Object other$encryptedDataKey = other.getEncryptedDataKey();
        if (this$encryptedDataKey == null
                ? other$encryptedDataKey != null
                : !this$encryptedDataKey.equals(other$encryptedDataKey)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $region = this.getRegion();
        result = result * PRIME + ($region == null ? 43 : $region.hashCode());
        final Object $vaultId = this.getVaultId();
        result = result * PRIME + ($vaultId == null ? 43 : $vaultId.hashCode());
        final Object $masterKeyId = this.getMasterKeyId();
        result = result * PRIME + ($masterKeyId == null ? 43 : $masterKeyId.hashCode());
        final Object $encryptedDataKey = this.getEncryptedDataKey();
        result = result * PRIME + ($encryptedDataKey == null ? 43 : $encryptedDataKey.hashCode());
        return result;
    }

    public String toString() {
        return "EncryptionKey(region="
                + this.getRegion()
                + ", vaultId="
                + this.getVaultId()
                + ", masterKeyId="
                + this.getMasterKeyId()
                + ", encryptedDataKey="
                + this.getEncryptedDataKey()
                + ")";
    }
}
