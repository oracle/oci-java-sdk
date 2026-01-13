/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details of the request to upload the CA signed certificates to GSMs and generate wallets for GSMs
 * of the Globally distributed database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"caSignedCertificate"})
    public UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails(
            String caSignedCertificate) {
        super();
        this.caSignedCertificate = caSignedCertificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The CA signed certificate key. */
        @com.fasterxml.jackson.annotation.JsonProperty("caSignedCertificate")
        private String caSignedCertificate;

        /**
         * The CA signed certificate key.
         *
         * @param caSignedCertificate the value to set
         * @return this builder
         */
        public Builder caSignedCertificate(String caSignedCertificate) {
            this.caSignedCertificate = caSignedCertificate;
            this.__explicitlySet__.add("caSignedCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails build() {
            UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails model =
                    new UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails(
                            this.caSignedCertificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails model) {
            if (model.wasPropertyExplicitlySet("caSignedCertificate")) {
                this.caSignedCertificate(model.getCaSignedCertificate());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The CA signed certificate key. */
    @com.fasterxml.jackson.annotation.JsonProperty("caSignedCertificate")
    private final String caSignedCertificate;

    /**
     * The CA signed certificate key.
     *
     * @return the value
     */
    public String getCaSignedCertificate() {
        return caSignedCertificate;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails(");
        sb.append("super=").append(super.toString());
        sb.append("caSignedCertificate=").append(String.valueOf(this.caSignedCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails)) {
            return false;
        }

        UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails other =
                (UploadDistributedDatabaseSignedCertificateAndGenerateWalletDetails) o;
        return java.util.Objects.equals(this.caSignedCertificate, other.caSignedCertificate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.caSignedCertificate == null
                                ? 43
                                : this.caSignedCertificate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
