/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * TLS certificate from the filesystem. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LocalFileTlsCertificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LocalFileTlsCertificate extends TlsCertificate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the secret. For Kubernetes this is the name of the Kubernetes secret of type tls.
         * For other platforms the secrets must be mounted at:
         * /etc/oci/secrets/${secretName}/tls.{key,crt}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretName")
        private String secretName;

        /**
         * Name of the secret. For Kubernetes this is the name of the Kubernetes secret of type tls.
         * For other platforms the secrets must be mounted at:
         * /etc/oci/secrets/${secretName}/tls.{key,crt}
         *
         * @param secretName the value to set
         * @return this builder
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            this.__explicitlySet__.add("secretName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LocalFileTlsCertificate build() {
            LocalFileTlsCertificate model = new LocalFileTlsCertificate(this.secretName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LocalFileTlsCertificate model) {
            if (model.wasPropertyExplicitlySet("secretName")) {
                this.secretName(model.getSecretName());
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

    @Deprecated
    public LocalFileTlsCertificate(String secretName) {
        super();
        this.secretName = secretName;
    }

    /**
     * Name of the secret. For Kubernetes this is the name of the Kubernetes secret of type tls. For
     * other platforms the secrets must be mounted at: /etc/oci/secrets/${secretName}/tls.{key,crt}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    private final String secretName;

    /**
     * Name of the secret. For Kubernetes this is the name of the Kubernetes secret of type tls. For
     * other platforms the secrets must be mounted at: /etc/oci/secrets/${secretName}/tls.{key,crt}
     *
     * @return the value
     */
    public String getSecretName() {
        return secretName;
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
        sb.append("LocalFileTlsCertificate(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretName=").append(String.valueOf(this.secretName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocalFileTlsCertificate)) {
            return false;
        }

        LocalFileTlsCertificate other = (LocalFileTlsCertificate) o;
        return java.util.Objects.equals(this.secretName, other.secretName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretName == null ? 43 : this.secretName.hashCode());
        return result;
    }
}
