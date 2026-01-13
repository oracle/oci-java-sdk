/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateVolumeGroupBackupResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code VolumeGroupBackup} instance. */
    private com.oracle.bmc.core.model.VolumeGroupBackup volumeGroupBackup;

    /**
     * The returned {@code VolumeGroupBackup} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.core.model.VolumeGroupBackup getVolumeGroupBackup() {
        return volumeGroupBackup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "volumeGroupBackup"
    })
    private UpdateVolumeGroupBackupResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            com.oracle.bmc.core.model.VolumeGroupBackup volumeGroupBackup) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.volumeGroupBackup = volumeGroupBackup;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateVolumeGroupBackupResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code VolumeGroupBackup} instance. */
        private com.oracle.bmc.core.model.VolumeGroupBackup volumeGroupBackup;

        /**
         * The returned {@code VolumeGroupBackup} instance.
         *
         * @param volumeGroupBackup the value to set
         * @return this builder
         */
        public Builder volumeGroupBackup(
                com.oracle.bmc.core.model.VolumeGroupBackup volumeGroupBackup) {
            this.volumeGroupBackup = volumeGroupBackup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateVolumeGroupBackupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            volumeGroupBackup(o.getVolumeGroupBackup());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateVolumeGroupBackupResponse build() {
            return new UpdateVolumeGroupBackupResponse(
                    __httpStatusCode__, headers, etag, volumeGroupBackup);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",volumeGroupBackup=").append(String.valueOf(volumeGroupBackup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVolumeGroupBackupResponse)) {
            return false;
        }

        UpdateVolumeGroupBackupResponse other = (UpdateVolumeGroupBackupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.volumeGroupBackup, other.volumeGroupBackup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.volumeGroupBackup == null ? 43 : this.volumeGroupBackup.hashCode());
        return result;
    }
}
