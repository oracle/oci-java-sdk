/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.011")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetTransferApplianceCertificateAuthorityCertificateResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    /**
     * The returned TransferApplianceCertificate instance.
     */
    private TransferApplianceCertificate transferApplianceCertificate;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTransferApplianceCertificateAuthorityCertificateResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            transferApplianceCertificate(o.getTransferApplianceCertificate());

            return this;
        }
    }
}
