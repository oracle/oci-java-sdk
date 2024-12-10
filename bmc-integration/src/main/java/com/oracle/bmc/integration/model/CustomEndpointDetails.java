/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Details for a custom endpoint for the integration instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomEndpointDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomEndpointDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostname",
        "managedType",
        "dnsZoneName",
        "dnsType",
        "certificateSecretId",
        "certificateSecretVersion",
        "alias"
    })
    public CustomEndpointDetails(
            String hostname,
            ManagedType managedType,
            String dnsZoneName,
            DnsType dnsType,
            String certificateSecretId,
            Integer certificateSecretVersion,
            String alias) {
        super();
        this.hostname = hostname;
        this.managedType = managedType;
        this.dnsZoneName = dnsZoneName;
        this.dnsType = dnsType;
        this.certificateSecretId = certificateSecretId;
        this.certificateSecretVersion = certificateSecretVersion;
        this.alias = alias;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A custom hostname to be used for the integration instance URL, in FQDN format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * A custom hostname to be used for the integration instance URL, in FQDN format.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * Indicates if custom endpoint is managed by oracle or customer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedType")
        private ManagedType managedType;

        /**
         * Indicates if custom endpoint is managed by oracle or customer.
         * @param managedType the value to set
         * @return this builder
         **/
        public Builder managedType(ManagedType managedType) {
            this.managedType = managedType;
            this.__explicitlySet__.add("managedType");
            return this;
        }
        /**
         * DNS Zone name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZoneName")
        private String dnsZoneName;

        /**
         * DNS Zone name
         * @param dnsZoneName the value to set
         * @return this builder
         **/
        public Builder dnsZoneName(String dnsZoneName) {
            this.dnsZoneName = dnsZoneName;
            this.__explicitlySet__.add("dnsZoneName");
            return this;
        }
        /**
         * Type of DNS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsType")
        private DnsType dnsType;

        /**
         * Type of DNS.
         * @param dnsType the value to set
         * @return this builder
         **/
        public Builder dnsType(DnsType dnsType) {
            this.dnsType = dnsType;
            this.__explicitlySet__.add("dnsType");
            return this;
        }
        /**
         * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for the custom hostname.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretId")
        private String certificateSecretId;

        /**
         * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for the custom hostname.
         *
         * @param certificateSecretId the value to set
         * @return this builder
         **/
        public Builder certificateSecretId(String certificateSecretId) {
            this.certificateSecretId = certificateSecretId;
            this.__explicitlySet__.add("certificateSecretId");
            return this;
        }
        /**
         * The secret version used for the certificate-secret-id (if certificate-secret-id is specified).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretVersion")
        private Integer certificateSecretVersion;

        /**
         * The secret version used for the certificate-secret-id (if certificate-secret-id is specified).
         *
         * @param certificateSecretVersion the value to set
         * @return this builder
         **/
        public Builder certificateSecretVersion(Integer certificateSecretVersion) {
            this.certificateSecretVersion = certificateSecretVersion;
            this.__explicitlySet__.add("certificateSecretVersion");
            return this;
        }
        /**
         * When creating the DNS CNAME record for the custom hostname, this value must be specified in the rdata.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * When creating the DNS CNAME record for the custom hostname, this value must be specified in the rdata.
         *
         * @param alias the value to set
         * @return this builder
         **/
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomEndpointDetails build() {
            CustomEndpointDetails model =
                    new CustomEndpointDetails(
                            this.hostname,
                            this.managedType,
                            this.dnsZoneName,
                            this.dnsType,
                            this.certificateSecretId,
                            this.certificateSecretVersion,
                            this.alias);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomEndpointDetails model) {
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("managedType")) {
                this.managedType(model.getManagedType());
            }
            if (model.wasPropertyExplicitlySet("dnsZoneName")) {
                this.dnsZoneName(model.getDnsZoneName());
            }
            if (model.wasPropertyExplicitlySet("dnsType")) {
                this.dnsType(model.getDnsType());
            }
            if (model.wasPropertyExplicitlySet("certificateSecretId")) {
                this.certificateSecretId(model.getCertificateSecretId());
            }
            if (model.wasPropertyExplicitlySet("certificateSecretVersion")) {
                this.certificateSecretVersion(model.getCertificateSecretVersion());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
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
     * A custom hostname to be used for the integration instance URL, in FQDN format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * A custom hostname to be used for the integration instance URL, in FQDN format.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * Indicates if custom endpoint is managed by oracle or customer.
     **/
    public enum ManagedType {
        OracleManaged("ORACLE_MANAGED"),
        CustomerManaged("CUSTOMER_MANAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagedType.class);

        private final String value;
        private static java.util.Map<String, ManagedType> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedType v : ManagedType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagedType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagedType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates if custom endpoint is managed by oracle or customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedType")
    private final ManagedType managedType;

    /**
     * Indicates if custom endpoint is managed by oracle or customer.
     * @return the value
     **/
    public ManagedType getManagedType() {
        return managedType;
    }

    /**
     * DNS Zone name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZoneName")
    private final String dnsZoneName;

    /**
     * DNS Zone name
     * @return the value
     **/
    public String getDnsZoneName() {
        return dnsZoneName;
    }

    /**
     * Type of DNS.
     **/
    public enum DnsType {
        Oci("OCI"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DnsType.class);

        private final String value;
        private static java.util.Map<String, DnsType> map;

        static {
            map = new java.util.HashMap<>();
            for (DnsType v : DnsType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DnsType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DnsType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DnsType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of DNS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsType")
    private final DnsType dnsType;

    /**
     * Type of DNS.
     * @return the value
     **/
    public DnsType getDnsType() {
        return dnsType;
    }

    /**
     * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for the custom hostname.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretId")
    private final String certificateSecretId;

    /**
     * Optional OCID of a vault/secret containing a private SSL certificate bundle to be used for the custom hostname.
     *
     * @return the value
     **/
    public String getCertificateSecretId() {
        return certificateSecretId;
    }

    /**
     * The secret version used for the certificate-secret-id (if certificate-secret-id is specified).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateSecretVersion")
    private final Integer certificateSecretVersion;

    /**
     * The secret version used for the certificate-secret-id (if certificate-secret-id is specified).
     *
     * @return the value
     **/
    public Integer getCertificateSecretVersion() {
        return certificateSecretVersion;
    }

    /**
     * When creating the DNS CNAME record for the custom hostname, this value must be specified in the rdata.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * When creating the DNS CNAME record for the custom hostname, this value must be specified in the rdata.
     *
     * @return the value
     **/
    public String getAlias() {
        return alias;
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
        sb.append("CustomEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostname=").append(String.valueOf(this.hostname));
        sb.append(", managedType=").append(String.valueOf(this.managedType));
        sb.append(", dnsZoneName=").append(String.valueOf(this.dnsZoneName));
        sb.append(", dnsType=").append(String.valueOf(this.dnsType));
        sb.append(", certificateSecretId=").append(String.valueOf(this.certificateSecretId));
        sb.append(", certificateSecretVersion=")
                .append(String.valueOf(this.certificateSecretVersion));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomEndpointDetails)) {
            return false;
        }

        CustomEndpointDetails other = (CustomEndpointDetails) o;
        return java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.managedType, other.managedType)
                && java.util.Objects.equals(this.dnsZoneName, other.dnsZoneName)
                && java.util.Objects.equals(this.dnsType, other.dnsType)
                && java.util.Objects.equals(this.certificateSecretId, other.certificateSecretId)
                && java.util.Objects.equals(
                        this.certificateSecretVersion, other.certificateSecretVersion)
                && java.util.Objects.equals(this.alias, other.alias)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.managedType == null ? 43 : this.managedType.hashCode());
        result = (result * PRIME) + (this.dnsZoneName == null ? 43 : this.dnsZoneName.hashCode());
        result = (result * PRIME) + (this.dnsType == null ? 43 : this.dnsType.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateSecretId == null
                                ? 43
                                : this.certificateSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateSecretVersion == null
                                ? 43
                                : this.certificateSecretVersion.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
