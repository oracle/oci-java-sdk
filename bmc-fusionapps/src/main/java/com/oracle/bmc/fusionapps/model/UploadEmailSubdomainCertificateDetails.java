/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Add certificate for email subdomain
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UploadEmailSubdomainCertificateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UploadEmailSubdomainCertificateDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"commonName", "certificatePem", "certificateChainPem"})
    public UploadEmailSubdomainCertificateDetails(
            String commonName, String certificatePem, String certificateChainPem) {
        super();
        this.commonName = commonName;
        this.certificatePem = certificatePem;
        this.certificateChainPem = certificateChainPem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * fully qualified host name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        /**
         * fully qualified host name
         * @param commonName the value to set
         * @return this builder
         **/
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }
        /**
         * Certificate PEM
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        /**
         * Certificate PEM
         * @param certificatePem the value to set
         * @return this builder
         **/
        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }
        /**
         * Certificate chain PEM, including intermediate and root
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateChainPem")
        private String certificateChainPem;

        /**
         * Certificate chain PEM, including intermediate and root
         * @param certificateChainPem the value to set
         * @return this builder
         **/
        public Builder certificateChainPem(String certificateChainPem) {
            this.certificateChainPem = certificateChainPem;
            this.__explicitlySet__.add("certificateChainPem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadEmailSubdomainCertificateDetails build() {
            UploadEmailSubdomainCertificateDetails model =
                    new UploadEmailSubdomainCertificateDetails(
                            this.commonName, this.certificatePem, this.certificateChainPem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadEmailSubdomainCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("commonName")) {
                this.commonName(model.getCommonName());
            }
            if (model.wasPropertyExplicitlySet("certificatePem")) {
                this.certificatePem(model.getCertificatePem());
            }
            if (model.wasPropertyExplicitlySet("certificateChainPem")) {
                this.certificateChainPem(model.getCertificateChainPem());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * fully qualified host name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    /**
     * fully qualified host name
     * @return the value
     **/
    public String getCommonName() {
        return commonName;
    }

    /**
     * Certificate PEM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    private final String certificatePem;

    /**
     * Certificate PEM
     * @return the value
     **/
    public String getCertificatePem() {
        return certificatePem;
    }

    /**
     * Certificate chain PEM, including intermediate and root
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateChainPem")
    private final String certificateChainPem;

    /**
     * Certificate chain PEM, including intermediate and root
     * @return the value
     **/
    public String getCertificateChainPem() {
        return certificateChainPem;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UploadEmailSubdomainCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("commonName=").append(String.valueOf(this.commonName));
        sb.append(", certificatePem=").append(String.valueOf(this.certificatePem));
        sb.append(", certificateChainPem=").append(String.valueOf(this.certificateChainPem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadEmailSubdomainCertificateDetails)) {
            return false;
        }

        UploadEmailSubdomainCertificateDetails other = (UploadEmailSubdomainCertificateDetails) o;
        return java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.certificatePem, other.certificatePem)
                && java.util.Objects.equals(this.certificateChainPem, other.certificateChainPem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatePem == null ? 43 : this.certificatePem.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateChainPem == null
                                ? 43
                                : this.certificateChainPem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
