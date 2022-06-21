/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * SSLForwardProxy used on the firewall policy rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SslForwardProxyProfile.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SslForwardProxyProfile extends DecryptionProfile {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to block sessions if server's certificate is expired.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isExpiredCertificateBlocked")
        private Boolean isExpiredCertificateBlocked;

        /**
         * Whether to block sessions if server's certificate is expired.
         * @param isExpiredCertificateBlocked the value to set
         * @return this builder
         **/
        public Builder isExpiredCertificateBlocked(Boolean isExpiredCertificateBlocked) {
            this.isExpiredCertificateBlocked = isExpiredCertificateBlocked;
            this.__explicitlySet__.add("isExpiredCertificateBlocked");
            return this;
        }
        /**
         * Whether to block sessions if server's certificate is issued by an untrusted certificate authority (CA).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUntrustedIssuerBlocked")
        private Boolean isUntrustedIssuerBlocked;

        /**
         * Whether to block sessions if server's certificate is issued by an untrusted certificate authority (CA).
         * @param isUntrustedIssuerBlocked the value to set
         * @return this builder
         **/
        public Builder isUntrustedIssuerBlocked(Boolean isUntrustedIssuerBlocked) {
            this.isUntrustedIssuerBlocked = isUntrustedIssuerBlocked;
            this.__explicitlySet__.add("isUntrustedIssuerBlocked");
            return this;
        }
        /**
         * Whether to block sessions if the revocation status check for server's certificate
         * does not succeed within the maximum allowed time (defaulting to 5 seconds).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRevocationStatusTimeoutBlocked")
        private Boolean isRevocationStatusTimeoutBlocked;

        /**
         * Whether to block sessions if the revocation status check for server's certificate
         * does not succeed within the maximum allowed time (defaulting to 5 seconds).
         *
         * @param isRevocationStatusTimeoutBlocked the value to set
         * @return this builder
         **/
        public Builder isRevocationStatusTimeoutBlocked(Boolean isRevocationStatusTimeoutBlocked) {
            this.isRevocationStatusTimeoutBlocked = isRevocationStatusTimeoutBlocked;
            this.__explicitlySet__.add("isRevocationStatusTimeoutBlocked");
            return this;
        }
        /**
         * Whether to block sessions if SSL version is not supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedVersionBlocked")
        private Boolean isUnsupportedVersionBlocked;

        /**
         * Whether to block sessions if SSL version is not supported.
         * @param isUnsupportedVersionBlocked the value to set
         * @return this builder
         **/
        public Builder isUnsupportedVersionBlocked(Boolean isUnsupportedVersionBlocked) {
            this.isUnsupportedVersionBlocked = isUnsupportedVersionBlocked;
            this.__explicitlySet__.add("isUnsupportedVersionBlocked");
            return this;
        }
        /**
         * Whether to block sessions if SSL cipher suite is not supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedCipherBlocked")
        private Boolean isUnsupportedCipherBlocked;

        /**
         * Whether to block sessions if SSL cipher suite is not supported.
         * @param isUnsupportedCipherBlocked the value to set
         * @return this builder
         **/
        public Builder isUnsupportedCipherBlocked(Boolean isUnsupportedCipherBlocked) {
            this.isUnsupportedCipherBlocked = isUnsupportedCipherBlocked;
            this.__explicitlySet__.add("isUnsupportedCipherBlocked");
            return this;
        }
        /**
         * Whether to block sessions if the revocation status check for server's certificate results in "unknown".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnknownRevocationStatusBlocked")
        private Boolean isUnknownRevocationStatusBlocked;

        /**
         * Whether to block sessions if the revocation status check for server's certificate results in "unknown".
         * @param isUnknownRevocationStatusBlocked the value to set
         * @return this builder
         **/
        public Builder isUnknownRevocationStatusBlocked(Boolean isUnknownRevocationStatusBlocked) {
            this.isUnknownRevocationStatusBlocked = isUnknownRevocationStatusBlocked;
            this.__explicitlySet__.add("isUnknownRevocationStatusBlocked");
            return this;
        }
        /**
         * Whether to block sessions if the server's certificate uses extensions other than key usage and/or extended key usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areCertificateExtensionsRestricted")
        private Boolean areCertificateExtensionsRestricted;

        /**
         * Whether to block sessions if the server's certificate uses extensions other than key usage and/or extended key usage.
         * @param areCertificateExtensionsRestricted the value to set
         * @return this builder
         **/
        public Builder areCertificateExtensionsRestricted(
                Boolean areCertificateExtensionsRestricted) {
            this.areCertificateExtensionsRestricted = areCertificateExtensionsRestricted;
            this.__explicitlySet__.add("areCertificateExtensionsRestricted");
            return this;
        }
        /**
         * Whether to automatically append SAN to impersonating certificate if server certificate is missing SAN.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoIncludeAltName")
        private Boolean isAutoIncludeAltName;

        /**
         * Whether to automatically append SAN to impersonating certificate if server certificate is missing SAN.
         * @param isAutoIncludeAltName the value to set
         * @return this builder
         **/
        public Builder isAutoIncludeAltName(Boolean isAutoIncludeAltName) {
            this.isAutoIncludeAltName = isAutoIncludeAltName;
            this.__explicitlySet__.add("isAutoIncludeAltName");
            return this;
        }
        /**
         * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOutOfCapacityBlocked")
        private Boolean isOutOfCapacityBlocked;

        /**
         * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
         * @param isOutOfCapacityBlocked the value to set
         * @return this builder
         **/
        public Builder isOutOfCapacityBlocked(Boolean isOutOfCapacityBlocked) {
            this.isOutOfCapacityBlocked = isOutOfCapacityBlocked;
            this.__explicitlySet__.add("isOutOfCapacityBlocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SslForwardProxyProfile build() {
            SslForwardProxyProfile __instance__ =
                    new SslForwardProxyProfile(
                            isExpiredCertificateBlocked,
                            isUntrustedIssuerBlocked,
                            isRevocationStatusTimeoutBlocked,
                            isUnsupportedVersionBlocked,
                            isUnsupportedCipherBlocked,
                            isUnknownRevocationStatusBlocked,
                            areCertificateExtensionsRestricted,
                            isAutoIncludeAltName,
                            isOutOfCapacityBlocked);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SslForwardProxyProfile o) {
            Builder copiedBuilder =
                    isExpiredCertificateBlocked(o.getIsExpiredCertificateBlocked())
                            .isUntrustedIssuerBlocked(o.getIsUntrustedIssuerBlocked())
                            .isRevocationStatusTimeoutBlocked(
                                    o.getIsRevocationStatusTimeoutBlocked())
                            .isUnsupportedVersionBlocked(o.getIsUnsupportedVersionBlocked())
                            .isUnsupportedCipherBlocked(o.getIsUnsupportedCipherBlocked())
                            .isUnknownRevocationStatusBlocked(
                                    o.getIsUnknownRevocationStatusBlocked())
                            .areCertificateExtensionsRestricted(
                                    o.getAreCertificateExtensionsRestricted())
                            .isAutoIncludeAltName(o.getIsAutoIncludeAltName())
                            .isOutOfCapacityBlocked(o.getIsOutOfCapacityBlocked());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public SslForwardProxyProfile(
            Boolean isExpiredCertificateBlocked,
            Boolean isUntrustedIssuerBlocked,
            Boolean isRevocationStatusTimeoutBlocked,
            Boolean isUnsupportedVersionBlocked,
            Boolean isUnsupportedCipherBlocked,
            Boolean isUnknownRevocationStatusBlocked,
            Boolean areCertificateExtensionsRestricted,
            Boolean isAutoIncludeAltName,
            Boolean isOutOfCapacityBlocked) {
        super();
        this.isExpiredCertificateBlocked = isExpiredCertificateBlocked;
        this.isUntrustedIssuerBlocked = isUntrustedIssuerBlocked;
        this.isRevocationStatusTimeoutBlocked = isRevocationStatusTimeoutBlocked;
        this.isUnsupportedVersionBlocked = isUnsupportedVersionBlocked;
        this.isUnsupportedCipherBlocked = isUnsupportedCipherBlocked;
        this.isUnknownRevocationStatusBlocked = isUnknownRevocationStatusBlocked;
        this.areCertificateExtensionsRestricted = areCertificateExtensionsRestricted;
        this.isAutoIncludeAltName = isAutoIncludeAltName;
        this.isOutOfCapacityBlocked = isOutOfCapacityBlocked;
    }

    /**
     * Whether to block sessions if server's certificate is expired.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isExpiredCertificateBlocked")
    private final Boolean isExpiredCertificateBlocked;

    /**
     * Whether to block sessions if server's certificate is expired.
     * @return the value
     **/
    public Boolean getIsExpiredCertificateBlocked() {
        return isExpiredCertificateBlocked;
    }

    /**
     * Whether to block sessions if server's certificate is issued by an untrusted certificate authority (CA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUntrustedIssuerBlocked")
    private final Boolean isUntrustedIssuerBlocked;

    /**
     * Whether to block sessions if server's certificate is issued by an untrusted certificate authority (CA).
     * @return the value
     **/
    public Boolean getIsUntrustedIssuerBlocked() {
        return isUntrustedIssuerBlocked;
    }

    /**
     * Whether to block sessions if the revocation status check for server's certificate
     * does not succeed within the maximum allowed time (defaulting to 5 seconds).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRevocationStatusTimeoutBlocked")
    private final Boolean isRevocationStatusTimeoutBlocked;

    /**
     * Whether to block sessions if the revocation status check for server's certificate
     * does not succeed within the maximum allowed time (defaulting to 5 seconds).
     *
     * @return the value
     **/
    public Boolean getIsRevocationStatusTimeoutBlocked() {
        return isRevocationStatusTimeoutBlocked;
    }

    /**
     * Whether to block sessions if SSL version is not supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedVersionBlocked")
    private final Boolean isUnsupportedVersionBlocked;

    /**
     * Whether to block sessions if SSL version is not supported.
     * @return the value
     **/
    public Boolean getIsUnsupportedVersionBlocked() {
        return isUnsupportedVersionBlocked;
    }

    /**
     * Whether to block sessions if SSL cipher suite is not supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedCipherBlocked")
    private final Boolean isUnsupportedCipherBlocked;

    /**
     * Whether to block sessions if SSL cipher suite is not supported.
     * @return the value
     **/
    public Boolean getIsUnsupportedCipherBlocked() {
        return isUnsupportedCipherBlocked;
    }

    /**
     * Whether to block sessions if the revocation status check for server's certificate results in "unknown".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnknownRevocationStatusBlocked")
    private final Boolean isUnknownRevocationStatusBlocked;

    /**
     * Whether to block sessions if the revocation status check for server's certificate results in "unknown".
     * @return the value
     **/
    public Boolean getIsUnknownRevocationStatusBlocked() {
        return isUnknownRevocationStatusBlocked;
    }

    /**
     * Whether to block sessions if the server's certificate uses extensions other than key usage and/or extended key usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areCertificateExtensionsRestricted")
    private final Boolean areCertificateExtensionsRestricted;

    /**
     * Whether to block sessions if the server's certificate uses extensions other than key usage and/or extended key usage.
     * @return the value
     **/
    public Boolean getAreCertificateExtensionsRestricted() {
        return areCertificateExtensionsRestricted;
    }

    /**
     * Whether to automatically append SAN to impersonating certificate if server certificate is missing SAN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoIncludeAltName")
    private final Boolean isAutoIncludeAltName;

    /**
     * Whether to automatically append SAN to impersonating certificate if server certificate is missing SAN.
     * @return the value
     **/
    public Boolean getIsAutoIncludeAltName() {
        return isAutoIncludeAltName;
    }

    /**
     * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOutOfCapacityBlocked")
    private final Boolean isOutOfCapacityBlocked;

    /**
     * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
     * @return the value
     **/
    public Boolean getIsOutOfCapacityBlocked() {
        return isOutOfCapacityBlocked;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SslForwardProxyProfile(");
        sb.append("super=").append(super.toString());
        sb.append(", isExpiredCertificateBlocked=")
                .append(String.valueOf(this.isExpiredCertificateBlocked));
        sb.append(", isUntrustedIssuerBlocked=")
                .append(String.valueOf(this.isUntrustedIssuerBlocked));
        sb.append(", isRevocationStatusTimeoutBlocked=")
                .append(String.valueOf(this.isRevocationStatusTimeoutBlocked));
        sb.append(", isUnsupportedVersionBlocked=")
                .append(String.valueOf(this.isUnsupportedVersionBlocked));
        sb.append(", isUnsupportedCipherBlocked=")
                .append(String.valueOf(this.isUnsupportedCipherBlocked));
        sb.append(", isUnknownRevocationStatusBlocked=")
                .append(String.valueOf(this.isUnknownRevocationStatusBlocked));
        sb.append(", areCertificateExtensionsRestricted=")
                .append(String.valueOf(this.areCertificateExtensionsRestricted));
        sb.append(", isAutoIncludeAltName=").append(String.valueOf(this.isAutoIncludeAltName));
        sb.append(", isOutOfCapacityBlocked=").append(String.valueOf(this.isOutOfCapacityBlocked));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SslForwardProxyProfile)) {
            return false;
        }

        SslForwardProxyProfile other = (SslForwardProxyProfile) o;
        return java.util.Objects.equals(
                        this.isExpiredCertificateBlocked, other.isExpiredCertificateBlocked)
                && java.util.Objects.equals(
                        this.isUntrustedIssuerBlocked, other.isUntrustedIssuerBlocked)
                && java.util.Objects.equals(
                        this.isRevocationStatusTimeoutBlocked,
                        other.isRevocationStatusTimeoutBlocked)
                && java.util.Objects.equals(
                        this.isUnsupportedVersionBlocked, other.isUnsupportedVersionBlocked)
                && java.util.Objects.equals(
                        this.isUnsupportedCipherBlocked, other.isUnsupportedCipherBlocked)
                && java.util.Objects.equals(
                        this.isUnknownRevocationStatusBlocked,
                        other.isUnknownRevocationStatusBlocked)
                && java.util.Objects.equals(
                        this.areCertificateExtensionsRestricted,
                        other.areCertificateExtensionsRestricted)
                && java.util.Objects.equals(this.isAutoIncludeAltName, other.isAutoIncludeAltName)
                && java.util.Objects.equals(
                        this.isOutOfCapacityBlocked, other.isOutOfCapacityBlocked)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isExpiredCertificateBlocked == null
                                ? 43
                                : this.isExpiredCertificateBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUntrustedIssuerBlocked == null
                                ? 43
                                : this.isUntrustedIssuerBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isRevocationStatusTimeoutBlocked == null
                                ? 43
                                : this.isRevocationStatusTimeoutBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnsupportedVersionBlocked == null
                                ? 43
                                : this.isUnsupportedVersionBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnsupportedCipherBlocked == null
                                ? 43
                                : this.isUnsupportedCipherBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnknownRevocationStatusBlocked == null
                                ? 43
                                : this.isUnknownRevocationStatusBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.areCertificateExtensionsRestricted == null
                                ? 43
                                : this.areCertificateExtensionsRestricted.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoIncludeAltName == null
                                ? 43
                                : this.isAutoIncludeAltName.hashCode());
        result =
                (result * PRIME)
                        + (this.isOutOfCapacityBlocked == null
                                ? 43
                                : this.isOutOfCapacityBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
