/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details about the host and corresponding certificate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostCertDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostCertDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hostName", "certificate", "privateKey"})
    public HostCertDetails(String hostName, String certificate, String privateKey) {
        super();
        this.hostName = hostName;
        this.certificate = certificate;
        this.privateKey = privateKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Fully qualified domain name (FQDN) of the host
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Fully qualified domain name (FQDN) of the host
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * Certificate value in string format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        /**
         * Certificate value in string format
         * @param certificate the value to set
         * @return this builder
         **/
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }
        /**
         * Private key of the provided certificate
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
        private String privateKey;

        /**
         * Private key of the provided certificate
         * @param privateKey the value to set
         * @return this builder
         **/
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            this.__explicitlySet__.add("privateKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostCertDetails build() {
            HostCertDetails model =
                    new HostCertDetails(this.hostName, this.certificate, this.privateKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostCertDetails model) {
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("certificate")) {
                this.certificate(model.getCertificate());
            }
            if (model.wasPropertyExplicitlySet("privateKey")) {
                this.privateKey(model.getPrivateKey());
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
     * Fully qualified domain name (FQDN) of the host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Fully qualified domain name (FQDN) of the host
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * Certificate value in string format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final String certificate;

    /**
     * Certificate value in string format
     * @return the value
     **/
    public String getCertificate() {
        return certificate;
    }

    /**
     * Private key of the provided certificate
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
    private final String privateKey;

    /**
     * Private key of the provided certificate
     * @return the value
     **/
    public String getPrivateKey() {
        return privateKey;
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
        sb.append("HostCertDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostName=").append(String.valueOf(this.hostName));
        sb.append(", certificate=").append(String.valueOf(this.certificate));
        sb.append(", privateKey=").append(String.valueOf(this.privateKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostCertDetails)) {
            return false;
        }

        HostCertDetails other = (HostCertDetails) o;
        return java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.certificate, other.certificate)
                && java.util.Objects.equals(this.privateKey, other.privateKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result = (result * PRIME) + (this.privateKey == null ? 43 : this.privateKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
