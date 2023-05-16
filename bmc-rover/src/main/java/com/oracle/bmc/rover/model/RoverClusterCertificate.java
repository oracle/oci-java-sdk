/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The certificate response <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RoverClusterCertificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RoverClusterCertificate
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"certificate"})
    public RoverClusterCertificate(String certificate) {
        super();
        this.certificate = certificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The certificate that can be installed on a client to do TLS communication to the cluster
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificate")
        private String certificate;

        /**
         * The certificate that can be installed on a client to do TLS communication to the cluster
         *
         * @param certificate the value to set
         * @return this builder
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            this.__explicitlySet__.add("certificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverClusterCertificate build() {
            RoverClusterCertificate model = new RoverClusterCertificate(this.certificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverClusterCertificate model) {
            if (model.wasPropertyExplicitlySet("certificate")) {
                this.certificate(model.getCertificate());
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

    /** The certificate that can be installed on a client to do TLS communication to the cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("certificate")
    private final String certificate;

    /**
     * The certificate that can be installed on a client to do TLS communication to the cluster
     *
     * @return the value
     */
    public String getCertificate() {
        return certificate;
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
        sb.append("RoverClusterCertificate(");
        sb.append("super=").append(super.toString());
        sb.append("certificate=").append(String.valueOf(this.certificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverClusterCertificate)) {
            return false;
        }

        RoverClusterCertificate other = (RoverClusterCertificate) o;
        return java.util.Objects.equals(this.certificate, other.certificate) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.certificate == null ? 43 : this.certificate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
