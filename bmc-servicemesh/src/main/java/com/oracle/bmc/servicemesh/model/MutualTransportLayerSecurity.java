/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Mutual TLS settings used when communicating with other virtual services or ingress gateways within the mesh.
 *
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
    builder = MutualTransportLayerSecurity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MutualTransportLayerSecurity
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"certificateId", "maximumValidity", "mode"})
    public MutualTransportLayerSecurity(String certificateId, Integer maximumValidity, Mode mode) {
        super();
        this.certificateId = certificateId;
        this.maximumValidity = maximumValidity;
        this.mode = mode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
         *
         * @param certificateId the value to set
         * @return this builder
         **/
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /**
         * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
         * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
         * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
         * will be renewed every 30 days.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
        private Integer maximumValidity;

        /**
         * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
         * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
         * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
         * will be renewed every 30 days.
         *
         * @param maximumValidity the value to set
         * @return this builder
         **/
        public Builder maximumValidity(Integer maximumValidity) {
            this.maximumValidity = maximumValidity;
            this.__explicitlySet__.add("maximumValidity");
            return this;
        }
        /**
         * DISABLED: Connection is not tunneled.
         * PERMISSIVE: Connection can be either plaintext or an mTLS tunnel.
         * STRICT: Connection is an mTLS tunnel.  Clients without a valid certificate will be rejected.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * DISABLED: Connection is not tunneled.
         * PERMISSIVE: Connection can be either plaintext or an mTLS tunnel.
         * STRICT: Connection is an mTLS tunnel.  Clients without a valid certificate will be rejected.
         *
         * @param mode the value to set
         * @return this builder
         **/
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MutualTransportLayerSecurity build() {
            MutualTransportLayerSecurity model =
                    new MutualTransportLayerSecurity(
                            this.certificateId, this.maximumValidity, this.mode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MutualTransportLayerSecurity model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("maximumValidity")) {
                this.maximumValidity(model.getMaximumValidity());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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
     * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the certificate resource that will be used for mTLS authentication with other virtual services in the mesh.
     *
     * @return the value
     **/
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
     * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
     * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
     * will be renewed every 30 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumValidity")
    private final Integer maximumValidity;

    /**
     * The number of days the mTLS certificate is valid.  This value should be less than the Maximum Validity Duration
     * for Certificates (Days) setting on the Certificate Authority associated with this Mesh.  The certificate will
     * be automatically renewed after 2/3 of the validity period, so a certificate with a maximum validity of 45 days
     * will be renewed every 30 days.
     *
     * @return the value
     **/
    public Integer getMaximumValidity() {
        return maximumValidity;
    }

    /**
     * DISABLED: Connection is not tunneled.
     * PERMISSIVE: Connection can be either plaintext or an mTLS tunnel.
     * STRICT: Connection is an mTLS tunnel.  Clients without a valid certificate will be rejected.
     *
     **/
    public enum Mode {
        Disabled("DISABLED"),
        Permissive("PERMISSIVE"),
        Strict("STRICT"),

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
     * DISABLED: Connection is not tunneled.
     * PERMISSIVE: Connection can be either plaintext or an mTLS tunnel.
     * STRICT: Connection is an mTLS tunnel.  Clients without a valid certificate will be rejected.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * DISABLED: Connection is not tunneled.
     * PERMISSIVE: Connection can be either plaintext or an mTLS tunnel.
     * STRICT: Connection is an mTLS tunnel.  Clients without a valid certificate will be rejected.
     *
     * @return the value
     **/
    public Mode getMode() {
        return mode;
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
        sb.append("MutualTransportLayerSecurity(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", maximumValidity=").append(String.valueOf(this.maximumValidity));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MutualTransportLayerSecurity)) {
            return false;
        }

        MutualTransportLayerSecurity other = (MutualTransportLayerSecurity) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.maximumValidity, other.maximumValidity)
                && java.util.Objects.equals(this.mode, other.mode)
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
                        + (this.maximumValidity == null ? 43 : this.maximumValidity.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
