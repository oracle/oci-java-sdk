/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode
@lombok.Getter
public class UpdateVolumeGroupBackupResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * The returned VolumeGroupBackup instance.
     */
    private com.oracle.bmc.core.model.VolumeGroupBackup volumeGroupBackup;

    private UpdateVolumeGroupBackupResponse(
            int __httpStatusCode__,
            String etag,
            com.oracle.bmc.core.model.VolumeGroupBackup volumeGroupBackup) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.volumeGroupBackup = volumeGroupBackup;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateVolumeGroupBackupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            volumeGroupBackup(o.getVolumeGroupBackup());

            return this;
        }

        public UpdateVolumeGroupBackupResponse build() {
            return new UpdateVolumeGroupBackupResponse(__httpStatusCode__, etag, volumeGroupBackup);
        }
    }
}
