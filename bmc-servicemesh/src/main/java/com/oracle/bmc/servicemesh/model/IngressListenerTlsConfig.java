/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * TLS enforcement config for the ingress listener.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressListenerTlsConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IngressListenerTlsConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serverCertificate")
        private TlsCertificate serverCertificate;

        public Builder serverCertificate(TlsCertificate serverCertificate) {
            this.serverCertificate = serverCertificate;
            this.__explicitlySet__.add("serverCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientValidation")
        private IngressListenerClientValidationConfig clientValidation;

        public Builder clientValidation(IngressListenerClientValidationConfig clientValidation) {
            this.clientValidation = clientValidation;
            this.__explicitlySet__.add("clientValidation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressListenerTlsConfig build() {
            IngressListenerTlsConfig __instance__ =
                    new IngressListenerTlsConfig(mode, serverCertificate, clientValidation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressListenerTlsConfig o) {
            Builder copiedBuilder =
                    mode(o.getMode())
                            .serverCertificate(o.getServerCertificate())
                            .clientValidation(o.getClientValidation());

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
     * DISABLED: Connection can only be plaintext.
     * PERMISSIVE: Connection can be either plaintext or TLS/mTLS. If the clientValidation.trustedCaBundle property is configured for the listener, mTLS is performed and the client's certificates are validated by the gateway.
     * TLS: Connection can only be TLS.
     * MUTUAL_TLS: Connection can only be MTLS.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Mode {
        Disabled("DISABLED"),
        Permissive("PERMISSIVE"),
        Tls("TLS"),
        MutualTls("MUTUAL_TLS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * DISABLED: Connection can only be plaintext.
     * PERMISSIVE: Connection can be either plaintext or TLS/mTLS. If the clientValidation.trustedCaBundle property is configured for the listener, mTLS is performed and the client's certificates are validated by the gateway.
     * TLS: Connection can only be TLS.
     * MUTUAL_TLS: Connection can only be MTLS.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    Mode mode;

    @com.fasterxml.jackson.annotation.JsonProperty("serverCertificate")
    TlsCertificate serverCertificate;

    @com.fasterxml.jackson.annotation.JsonProperty("clientValidation")
    IngressListenerClientValidationConfig clientValidation;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
