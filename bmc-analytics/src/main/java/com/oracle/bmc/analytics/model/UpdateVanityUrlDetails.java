/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Input payload to update a vanity url.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateVanityUrlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateVanityUrlDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "passphrase",
        "privateKey",
        "publicCertificate",
        "caCertificate"
    })
    public UpdateVanityUrlDetails(
            String passphrase, String privateKey, String publicCertificate, String caCertificate) {
        super();
        this.passphrase = passphrase;
        this.privateKey = privateKey;
        this.publicCertificate = publicCertificate;
        this.caCertificate = caCertificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Passphrase for the PEM Private key (if any).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        /**
         * Passphrase for the PEM Private key (if any).
         *
         * @param passphrase the value to set
         * @return this builder
         **/
        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }
        /**
         * PEM Private key for HTTPS connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
        private String privateKey;

        /**
         * PEM Private key for HTTPS connections.
         *
         * @param privateKey the value to set
         * @return this builder
         **/
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            this.__explicitlySet__.add("privateKey");
            return this;
        }
        /**
         * PEM certificate for HTTPS connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        /**
         * PEM certificate for HTTPS connections.
         *
         * @param publicCertificate the value to set
         * @return this builder
         **/
        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = publicCertificate;
            this.__explicitlySet__.add("publicCertificate");
            return this;
        }
        /**
         * PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        /**
         * PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
         *
         * @param caCertificate the value to set
         * @return this builder
         **/
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            this.__explicitlySet__.add("caCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVanityUrlDetails build() {
            UpdateVanityUrlDetails model =
                    new UpdateVanityUrlDetails(
                            this.passphrase,
                            this.privateKey,
                            this.publicCertificate,
                            this.caCertificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVanityUrlDetails model) {
            if (model.wasPropertyExplicitlySet("passphrase")) {
                this.passphrase(model.getPassphrase());
            }
            if (model.wasPropertyExplicitlySet("privateKey")) {
                this.privateKey(model.getPrivateKey());
            }
            if (model.wasPropertyExplicitlySet("publicCertificate")) {
                this.publicCertificate(model.getPublicCertificate());
            }
            if (model.wasPropertyExplicitlySet("caCertificate")) {
                this.caCertificate(model.getCaCertificate());
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
     * Passphrase for the PEM Private key (if any).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    private final String passphrase;

    /**
     * Passphrase for the PEM Private key (if any).
     *
     * @return the value
     **/
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * PEM Private key for HTTPS connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
    private final String privateKey;

    /**
     * PEM Private key for HTTPS connections.
     *
     * @return the value
     **/
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * PEM certificate for HTTPS connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
    private final String publicCertificate;

    /**
     * PEM certificate for HTTPS connections.
     *
     * @return the value
     **/
    public String getPublicCertificate() {
        return publicCertificate;
    }

    /**
     * PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    private final String caCertificate;

    /**
     * PEM CA certificate(s) for HTTPS connections. This may include multiple PEM certificates.
     *
     * @return the value
     **/
    public String getCaCertificate() {
        return caCertificate;
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
        sb.append("UpdateVanityUrlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("passphrase=").append(String.valueOf(this.passphrase));
        sb.append(", privateKey=").append(String.valueOf(this.privateKey));
        sb.append(", publicCertificate=").append(String.valueOf(this.publicCertificate));
        sb.append(", caCertificate=").append(String.valueOf(this.caCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVanityUrlDetails)) {
            return false;
        }

        UpdateVanityUrlDetails other = (UpdateVanityUrlDetails) o;
        return java.util.Objects.equals(this.passphrase, other.passphrase)
                && java.util.Objects.equals(this.privateKey, other.privateKey)
                && java.util.Objects.equals(this.publicCertificate, other.publicCertificate)
                && java.util.Objects.equals(this.caCertificate, other.caCertificate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.passphrase == null ? 43 : this.passphrase.hashCode());
        result = (result * PRIME) + (this.privateKey == null ? 43 : this.privateKey.hashCode());
        result =
                (result * PRIME)
                        + (this.publicCertificate == null ? 43 : this.publicCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.caCertificate == null ? 43 : this.caCertificate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
