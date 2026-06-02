/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Vanity domain request detail
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
    builder = CreateVanityDomainDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateVanityDomainDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "originCertRequestType",
        "cdnCertRequestType",
        "vanityDomain",
        "dnsManagedBy",
        "prefix",
        "certificateInfo",
        "changeManagementLink"
    })
    public CreateVanityDomainDetails(
            OriginCertRequestType originCertRequestType,
            CdnCertRequestType cdnCertRequestType,
            String vanityDomain,
            DnsManagedBy dnsManagedBy,
            String prefix,
            CertificateInfo certificateInfo,
            String changeManagementLink) {
        super();
        this.originCertRequestType = originCertRequestType;
        this.cdnCertRequestType = cdnCertRequestType;
        this.vanityDomain = vanityDomain;
        this.dnsManagedBy = dnsManagedBy;
        this.prefix = prefix;
        this.certificateInfo = certificateInfo;
        this.changeManagementLink = changeManagementLink;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The origin request type for which the certificate is generated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originCertRequestType")
        private OriginCertRequestType originCertRequestType;

        /**
         * The origin request type for which the certificate is generated
         * @param originCertRequestType the value to set
         * @return this builder
         **/
        public Builder originCertRequestType(OriginCertRequestType originCertRequestType) {
            this.originCertRequestType = originCertRequestType;
            this.__explicitlySet__.add("originCertRequestType");
            return this;
        }
        /**
         * The cdn request type for which the certificate is generated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cdnCertRequestType")
        private CdnCertRequestType cdnCertRequestType;

        /**
         * The cdn request type for which the certificate is generated
         * @param cdnCertRequestType the value to set
         * @return this builder
         **/
        public Builder cdnCertRequestType(CdnCertRequestType cdnCertRequestType) {
            this.cdnCertRequestType = cdnCertRequestType;
            this.__explicitlySet__.add("cdnCertRequestType");
            return this;
        }
        /**
         * Vanity domain
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vanityDomain")
        private String vanityDomain;

        /**
         * Vanity domain
         * @param vanityDomain the value to set
         * @return this builder
         **/
        public Builder vanityDomain(String vanityDomain) {
            this.vanityDomain = vanityDomain;
            this.__explicitlySet__.add("vanityDomain");
            return this;
        }
        /**
         * The dns is managed by the customer or Oracle
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsManagedBy")
        private DnsManagedBy dnsManagedBy;

        /**
         * The dns is managed by the customer or Oracle
         * @param dnsManagedBy the value to set
         * @return this builder
         **/
        public Builder dnsManagedBy(DnsManagedBy dnsManagedBy) {
            this.dnsManagedBy = dnsManagedBy;
            this.__explicitlySet__.add("dnsManagedBy");
            return this;
        }
        /**
         * The prefix value of the DnsPrefix. Can't be changed after creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The prefix value of the DnsPrefix. Can't be changed after creation
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateInfo")
        private CertificateInfo certificateInfo;

        public Builder certificateInfo(CertificateInfo certificateInfo) {
            this.certificateInfo = certificateInfo;
            this.__explicitlySet__.add("certificateInfo");
            return this;
        }
        /**
         * The cm link that was used to create the DNS prefix
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("changeManagementLink")
        private String changeManagementLink;

        /**
         * The cm link that was used to create the DNS prefix
         * @param changeManagementLink the value to set
         * @return this builder
         **/
        public Builder changeManagementLink(String changeManagementLink) {
            this.changeManagementLink = changeManagementLink;
            this.__explicitlySet__.add("changeManagementLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVanityDomainDetails build() {
            CreateVanityDomainDetails model =
                    new CreateVanityDomainDetails(
                            this.originCertRequestType,
                            this.cdnCertRequestType,
                            this.vanityDomain,
                            this.dnsManagedBy,
                            this.prefix,
                            this.certificateInfo,
                            this.changeManagementLink);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVanityDomainDetails model) {
            if (model.wasPropertyExplicitlySet("originCertRequestType")) {
                this.originCertRequestType(model.getOriginCertRequestType());
            }
            if (model.wasPropertyExplicitlySet("cdnCertRequestType")) {
                this.cdnCertRequestType(model.getCdnCertRequestType());
            }
            if (model.wasPropertyExplicitlySet("vanityDomain")) {
                this.vanityDomain(model.getVanityDomain());
            }
            if (model.wasPropertyExplicitlySet("dnsManagedBy")) {
                this.dnsManagedBy(model.getDnsManagedBy());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("certificateInfo")) {
                this.certificateInfo(model.getCertificateInfo());
            }
            if (model.wasPropertyExplicitlySet("changeManagementLink")) {
                this.changeManagementLink(model.getChangeManagementLink());
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
     * The origin request type for which the certificate is generated
     **/
    public enum OriginCertRequestType {
        RequestCsr("REQUEST_CSR"),
        RequestDv("REQUEST_DV"),
        ;

        private final String value;
        private static java.util.Map<String, OriginCertRequestType> map;

        static {
            map = new java.util.HashMap<>();
            for (OriginCertRequestType v : OriginCertRequestType.values()) {
                map.put(v.getValue(), v);
            }
        }

        OriginCertRequestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OriginCertRequestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OriginCertRequestType: " + key);
        }
    };
    /**
     * The origin request type for which the certificate is generated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originCertRequestType")
    private final OriginCertRequestType originCertRequestType;

    /**
     * The origin request type for which the certificate is generated
     * @return the value
     **/
    public OriginCertRequestType getOriginCertRequestType() {
        return originCertRequestType;
    }

    /**
     * The cdn request type for which the certificate is generated
     **/
    public enum CdnCertRequestType {
        RequestCsr("REQUEST_CSR"),
        RequestDv("REQUEST_DV"),
        ;

        private final String value;
        private static java.util.Map<String, CdnCertRequestType> map;

        static {
            map = new java.util.HashMap<>();
            for (CdnCertRequestType v : CdnCertRequestType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CdnCertRequestType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CdnCertRequestType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CdnCertRequestType: " + key);
        }
    };
    /**
     * The cdn request type for which the certificate is generated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdnCertRequestType")
    private final CdnCertRequestType cdnCertRequestType;

    /**
     * The cdn request type for which the certificate is generated
     * @return the value
     **/
    public CdnCertRequestType getCdnCertRequestType() {
        return cdnCertRequestType;
    }

    /**
     * Vanity domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vanityDomain")
    private final String vanityDomain;

    /**
     * Vanity domain
     * @return the value
     **/
    public String getVanityDomain() {
        return vanityDomain;
    }

    /**
     * The dns is managed by the customer or Oracle
     **/
    public enum DnsManagedBy {
        OracleManaged("ORACLE_MANAGED"),
        CustomerManaged("CUSTOMER_MANAGED"),
        ;

        private final String value;
        private static java.util.Map<String, DnsManagedBy> map;

        static {
            map = new java.util.HashMap<>();
            for (DnsManagedBy v : DnsManagedBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        DnsManagedBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DnsManagedBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DnsManagedBy: " + key);
        }
    };
    /**
     * The dns is managed by the customer or Oracle
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsManagedBy")
    private final DnsManagedBy dnsManagedBy;

    /**
     * The dns is managed by the customer or Oracle
     * @return the value
     **/
    public DnsManagedBy getDnsManagedBy() {
        return dnsManagedBy;
    }

    /**
     * The prefix value of the DnsPrefix. Can't be changed after creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The prefix value of the DnsPrefix. Can't be changed after creation
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateInfo")
    private final CertificateInfo certificateInfo;

    public CertificateInfo getCertificateInfo() {
        return certificateInfo;
    }

    /**
     * The cm link that was used to create the DNS prefix
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("changeManagementLink")
    private final String changeManagementLink;

    /**
     * The cm link that was used to create the DNS prefix
     * @return the value
     **/
    public String getChangeManagementLink() {
        return changeManagementLink;
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
        sb.append("CreateVanityDomainDetails(");
        sb.append("super=").append(super.toString());
        sb.append("originCertRequestType=").append(String.valueOf(this.originCertRequestType));
        sb.append(", cdnCertRequestType=").append(String.valueOf(this.cdnCertRequestType));
        sb.append(", vanityDomain=").append(String.valueOf(this.vanityDomain));
        sb.append(", dnsManagedBy=").append(String.valueOf(this.dnsManagedBy));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", certificateInfo=").append(String.valueOf(this.certificateInfo));
        sb.append(", changeManagementLink=").append(String.valueOf(this.changeManagementLink));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVanityDomainDetails)) {
            return false;
        }

        CreateVanityDomainDetails other = (CreateVanityDomainDetails) o;
        return java.util.Objects.equals(this.originCertRequestType, other.originCertRequestType)
                && java.util.Objects.equals(this.cdnCertRequestType, other.cdnCertRequestType)
                && java.util.Objects.equals(this.vanityDomain, other.vanityDomain)
                && java.util.Objects.equals(this.dnsManagedBy, other.dnsManagedBy)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.certificateInfo, other.certificateInfo)
                && java.util.Objects.equals(this.changeManagementLink, other.changeManagementLink)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originCertRequestType == null
                                ? 43
                                : this.originCertRequestType.hashCode());
        result =
                (result * PRIME)
                        + (this.cdnCertRequestType == null
                                ? 43
                                : this.cdnCertRequestType.hashCode());
        result = (result * PRIME) + (this.vanityDomain == null ? 43 : this.vanityDomain.hashCode());
        result = (result * PRIME) + (this.dnsManagedBy == null ? 43 : this.dnsManagedBy.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateInfo == null ? 43 : this.certificateInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.changeManagementLink == null
                                ? 43
                                : this.changeManagementLink.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
