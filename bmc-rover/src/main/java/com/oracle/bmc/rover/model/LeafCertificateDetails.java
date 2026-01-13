/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The details of leaf certificate <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LeafCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LeafCertificateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"certificateId", "certificatePem"})
    public LeafCertificateDetails(String certificateId, String certificatePem) {
        super();
        this.certificateId = certificateId;
        this.certificatePem = certificatePem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The id of the certificate */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The id of the certificate
         *
         * @param certificateId the value to set
         * @return this builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /** The certificate content in PEM format */
        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        /**
         * The certificate content in PEM format
         *
         * @param certificatePem the value to set
         * @return this builder
         */
        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LeafCertificateDetails build() {
            LeafCertificateDetails model =
                    new LeafCertificateDetails(this.certificateId, this.certificatePem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LeafCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("certificatePem")) {
                this.certificatePem(model.getCertificatePem());
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

    /** The id of the certificate */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The id of the certificate
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
    }

    /** The certificate content in PEM format */
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    private final String certificatePem;

    /**
     * The certificate content in PEM format
     *
     * @return the value
     */
    public String getCertificatePem() {
        return certificatePem;
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
        sb.append("LeafCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", certificatePem=").append(String.valueOf(this.certificatePem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LeafCertificateDetails)) {
            return false;
        }

        LeafCertificateDetails other = (LeafCertificateDetails) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.certificatePem, other.certificatePem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatePem == null ? 43 : this.certificatePem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
