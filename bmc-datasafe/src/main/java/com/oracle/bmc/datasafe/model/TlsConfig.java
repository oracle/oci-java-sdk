/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to establish a TLS enabled connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TlsConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TlsConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "certificateStoreType",
        "storePassword",
        "trustStoreContent",
        "keyStoreContent"
    })
    public TlsConfig(
            Status status,
            CertificateStoreType certificateStoreType,
            String storePassword,
            String trustStoreContent,
            String keyStoreContent) {
        super();
        this.status = status;
        this.certificateStoreType = certificateStoreType;
        this.storePassword = storePassword;
        this.trustStoreContent = trustStoreContent;
        this.keyStoreContent = keyStoreContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Status to represent whether the database connection is TLS enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status to represent whether the database connection is TLS enabled or not.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The format of the certificate store. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateStoreType")
        private CertificateStoreType certificateStoreType;

        /**
         * The format of the certificate store.
         *
         * @param certificateStoreType the value to set
         * @return this builder
         */
        public Builder certificateStoreType(CertificateStoreType certificateStoreType) {
            this.certificateStoreType = certificateStoreType;
            this.__explicitlySet__.add("certificateStoreType");
            return this;
        }
        /**
         * The password to read the trust store and key store files, if they are password protected.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storePassword")
        private String storePassword;

        /**
         * The password to read the trust store and key store files, if they are password protected.
         *
         * @param storePassword the value to set
         * @return this builder
         */
        public Builder storePassword(String storePassword) {
            this.storePassword = storePassword;
            this.__explicitlySet__.add("storePassword");
            return this;
        }
        /** Base64 encoded string of trust store file content. */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreContent")
        private String trustStoreContent;

        /**
         * Base64 encoded string of trust store file content.
         *
         * @param trustStoreContent the value to set
         * @return this builder
         */
        public Builder trustStoreContent(String trustStoreContent) {
            this.trustStoreContent = trustStoreContent;
            this.__explicitlySet__.add("trustStoreContent");
            return this;
        }
        /** Base64 encoded string of key store file content. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
        private String keyStoreContent;

        /**
         * Base64 encoded string of key store file content.
         *
         * @param keyStoreContent the value to set
         * @return this builder
         */
        public Builder keyStoreContent(String keyStoreContent) {
            this.keyStoreContent = keyStoreContent;
            this.__explicitlySet__.add("keyStoreContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TlsConfig build() {
            TlsConfig model =
                    new TlsConfig(
                            this.status,
                            this.certificateStoreType,
                            this.storePassword,
                            this.trustStoreContent,
                            this.keyStoreContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TlsConfig model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("certificateStoreType")) {
                this.certificateStoreType(model.getCertificateStoreType());
            }
            if (model.wasPropertyExplicitlySet("storePassword")) {
                this.storePassword(model.getStorePassword());
            }
            if (model.wasPropertyExplicitlySet("trustStoreContent")) {
                this.trustStoreContent(model.getTrustStoreContent());
            }
            if (model.wasPropertyExplicitlySet("keyStoreContent")) {
                this.keyStoreContent(model.getKeyStoreContent());
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

    /** Status to represent whether the database connection is TLS enabled or not. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status to represent whether the database connection is TLS enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status to represent whether the database connection is TLS enabled or not.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The format of the certificate store. */
    public enum CertificateStoreType implements com.oracle.bmc.http.internal.BmcEnum {
        Jks("JKS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CertificateStoreType.class);

        private final String value;
        private static java.util.Map<String, CertificateStoreType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateStoreType v : CertificateStoreType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CertificateStoreType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateStoreType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CertificateStoreType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The format of the certificate store. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateStoreType")
    private final CertificateStoreType certificateStoreType;

    /**
     * The format of the certificate store.
     *
     * @return the value
     */
    public CertificateStoreType getCertificateStoreType() {
        return certificateStoreType;
    }

    /** The password to read the trust store and key store files, if they are password protected. */
    @com.fasterxml.jackson.annotation.JsonProperty("storePassword")
    private final String storePassword;

    /**
     * The password to read the trust store and key store files, if they are password protected.
     *
     * @return the value
     */
    public String getStorePassword() {
        return storePassword;
    }

    /** Base64 encoded string of trust store file content. */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreContent")
    private final String trustStoreContent;

    /**
     * Base64 encoded string of trust store file content.
     *
     * @return the value
     */
    public String getTrustStoreContent() {
        return trustStoreContent;
    }

    /** Base64 encoded string of key store file content. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
    private final String keyStoreContent;

    /**
     * Base64 encoded string of key store file content.
     *
     * @return the value
     */
    public String getKeyStoreContent() {
        return keyStoreContent;
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
        sb.append("TlsConfig(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", certificateStoreType=").append(String.valueOf(this.certificateStoreType));
        sb.append(", storePassword=").append("<redacted>");
        sb.append(", trustStoreContent=").append(String.valueOf(this.trustStoreContent));
        sb.append(", keyStoreContent=").append(String.valueOf(this.keyStoreContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TlsConfig)) {
            return false;
        }

        TlsConfig other = (TlsConfig) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.certificateStoreType, other.certificateStoreType)
                && java.util.Objects.equals(this.storePassword, other.storePassword)
                && java.util.Objects.equals(this.trustStoreContent, other.trustStoreContent)
                && java.util.Objects.equals(this.keyStoreContent, other.keyStoreContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateStoreType == null
                                ? 43
                                : this.certificateStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.storePassword == null ? 43 : this.storePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreContent == null ? 43 : this.trustStoreContent.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreContent == null ? 43 : this.keyStoreContent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
