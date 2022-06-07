/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVolumeBackupResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * The returned VolumeBackup instance.
     */
    private com.oracle.bmc.core.model.VolumeBackup volumeBackup;

    public com.oracle.bmc.core.model.VolumeBackup getVolumeBackup() {
        return volumeBackup;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "etag", "volumeBackup"})
    private UpdateVolumeBackupResponse(
            int __httpStatusCode__,
            String etag,
            com.oracle.bmc.core.model.VolumeBackup volumeBackup) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.volumeBackup = volumeBackup;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private com.oracle.bmc.core.model.VolumeBackup volumeBackup;

        public Builder volumeBackup(com.oracle.bmc.core.model.VolumeBackup volumeBackup) {
            this.volumeBackup = volumeBackup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateVolumeBackupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            volumeBackup(o.getVolumeBackup());

            return this;
        }

        public UpdateVolumeBackupResponse build() {
            return new UpdateVolumeBackupResponse(__httpStatusCode__, etag, volumeBackup);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",volumeBackup=").append(String.valueOf(volumeBackup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeBackupResponse)) {
            return false;
        }

        UpdateVolumeBackupResponse other = (UpdateVolumeBackupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.volumeBackup, other.volumeBackup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.volumeBackup == null ? 43 : this.volumeBackup.hashCode());
        return result;
    }
}
