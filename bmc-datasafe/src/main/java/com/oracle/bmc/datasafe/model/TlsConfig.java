/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to establish a TLS enabled connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TlsConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TlsConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateStoreType")
        private CertificateStoreType certificateStoreType;

        public Builder certificateStoreType(CertificateStoreType certificateStoreType) {
            this.certificateStoreType = certificateStoreType;
            this.__explicitlySet__.add("certificateStoreType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storePassword")
        private String storePassword;

        public Builder storePassword(String storePassword) {
            this.storePassword = storePassword;
            this.__explicitlySet__.add("storePassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreContent")
        private String trustStoreContent;

        public Builder trustStoreContent(String trustStoreContent) {
            this.trustStoreContent = trustStoreContent;
            this.__explicitlySet__.add("trustStoreContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
        private String keyStoreContent;

        public Builder keyStoreContent(String keyStoreContent) {
            this.keyStoreContent = keyStoreContent;
            this.__explicitlySet__.add("keyStoreContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TlsConfig build() {
            TlsConfig __instance__ =
                    new TlsConfig(
                            status,
                            certificateStoreType,
                            storePassword,
                            trustStoreContent,
                            keyStoreContent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TlsConfig o) {
            Builder copiedBuilder =
                    status(o.getStatus())
                            .certificateStoreType(o.getCertificateStoreType())
                            .storePassword(o.getStorePassword())
                            .trustStoreContent(o.getTrustStoreContent())
                            .keyStoreContent(o.getKeyStoreContent());

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

    /**
     * Status to represent whether the database connection is TLS enabled or not.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Status to represent whether the database connection is TLS enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;
    /**
     * The format of the certificate store.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CertificateStoreType {
        Jks("JKS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The format of the certificate store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateStoreType")
    CertificateStoreType certificateStoreType;

    /**
     * The password to read the trust store and key store files, if they are password protected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storePassword")
    String storePassword;

    /**
     * Base64 encoded string of trust store file content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreContent")
    String trustStoreContent;

    /**
     * Base64 encoded string of key store file content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreContent")
    String keyStoreContent;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
