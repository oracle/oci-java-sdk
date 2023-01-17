/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressListenerTlsConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngressListenerTlsConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mode", "serverCertificate", "clientValidation"})
    public IngressListenerTlsConfig(
            Mode mode,
            TlsCertificate serverCertificate,
            IngressListenerClientValidationConfig clientValidation) {
        super();
        this.mode = mode;
        this.serverCertificate = serverCertificate;
        this.clientValidation = clientValidation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * DISABLED: Connection can only be plaintext.
         * PERMISSIVE: Connection can be either plaintext or TLS/mTLS. If the clientValidation.trustedCaBundle property is configured for the listener, mTLS is performed and the client's certificates are validated by the gateway.
         * TLS: Connection can only be TLS.
         * MUTUAL_TLS: Connection can only be MTLS.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * DISABLED: Connection can only be plaintext.
         * PERMISSIVE: Connection can be either plaintext or TLS/mTLS. If the clientValidation.trustedCaBundle property is configured for the listener, mTLS is performed and the client's certificates are validated by the gateway.
         * TLS: Connection can only be TLS.
         * MUTUAL_TLS: Connection can only be MTLS.
         *
         * @param mode the value to set
         * @return this builder
         **/
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
            IngressListenerTlsConfig model =
                    new IngressListenerTlsConfig(
                            this.mode, this.serverCertificate, this.clientValidation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressListenerTlsConfig model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("serverCertificate")) {
                this.serverCertificate(model.getServerCertificate());
            }
            if (model.wasPropertyExplicitlySet("clientValidation")) {
                this.clientValidation(model.getClientValidation());
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
     * DISABLED: Connection can only be plaintext.
     * PERMISSIVE: Connection can be either plaintext or TLS/mTLS. If the clientValidation.trustedCaBundle property is configured for the listener, mTLS is performed and the client's certificates are validated by the gateway.
     * TLS: Connection can only be TLS.
     * MUTUAL_TLS: Connection can only be MTLS.
     *
     **/
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

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

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
    private final Mode mode;

    /**
     * DISABLED: Connection can only be plaintext.
     * PERMISSIVE: Connection can be either plaintext or TLS/mTLS. If the clientValidation.trustedCaBundle property is configured for the listener, mTLS is performed and the client's certificates are validated by the gateway.
     * TLS: Connection can only be TLS.
     * MUTUAL_TLS: Connection can only be MTLS.
     *
     * @return the value
     **/
    public Mode getMode() {
        return mode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serverCertificate")
    private final TlsCertificate serverCertificate;

    public TlsCertificate getServerCertificate() {
        return serverCertificate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clientValidation")
    private final IngressListenerClientValidationConfig clientValidation;

    public IngressListenerClientValidationConfig getClientValidation() {
        return clientValidation;
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
        sb.append("IngressListenerTlsConfig(");
        sb.append("super=").append(super.toString());
        sb.append("mode=").append(String.valueOf(this.mode));
        sb.append(", serverCertificate=").append(String.valueOf(this.serverCertificate));
        sb.append(", clientValidation=").append(String.valueOf(this.clientValidation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressListenerTlsConfig)) {
            return false;
        }

        IngressListenerTlsConfig other = (IngressListenerTlsConfig) o;
        return java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.serverCertificate, other.serverCertificate)
                && java.util.Objects.equals(this.clientValidation, other.clientValidation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result =
                (result * PRIME)
                        + (this.serverCertificate == null ? 43 : this.serverCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.clientValidation == null ? 43 : this.clientValidation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
