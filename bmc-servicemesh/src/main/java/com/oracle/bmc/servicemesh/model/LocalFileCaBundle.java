/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * CA Bundle from the filesystem.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LocalFileCaBundle.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LocalFileCaBundle extends CaBundle {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the secret.
         * For Kubernetes this will be the name of an opaque Kubernetes secret with key ca.crt.
         * For other platforms the secret must be mounted at: /etc/oci/secrets/${secretName}/ca.crt
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretName")
        private String secretName;

        /**
         * Name of the secret.
         * For Kubernetes this will be the name of an opaque Kubernetes secret with key ca.crt.
         * For other platforms the secret must be mounted at: /etc/oci/secrets/${secretName}/ca.crt
         *
         * @param secretName the value to set
         * @return this builder
         **/
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            this.__explicitlySet__.add("secretName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LocalFileCaBundle build() {
            LocalFileCaBundle __instance__ = new LocalFileCaBundle(secretName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LocalFileCaBundle o) {
            Builder copiedBuilder = secretName(o.getSecretName());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public LocalFileCaBundle(String secretName) {
        super();
        this.secretName = secretName;
    }

    /**
     * Name of the secret.
     * For Kubernetes this will be the name of an opaque Kubernetes secret with key ca.crt.
     * For other platforms the secret must be mounted at: /etc/oci/secrets/${secretName}/ca.crt
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    private final String secretName;

    /**
     * Name of the secret.
     * For Kubernetes this will be the name of an opaque Kubernetes secret with key ca.crt.
     * For other platforms the secret must be mounted at: /etc/oci/secrets/${secretName}/ca.crt
     *
     * @return the value
     **/
    public String getSecretName() {
        return secretName;
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
        sb.append("LocalFileCaBundle(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretName=").append(String.valueOf(this.secretName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocalFileCaBundle)) {
            return false;
        }

        LocalFileCaBundle other = (LocalFileCaBundle) o;
        return java.util.Objects.equals(this.secretName, other.secretName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretName == null ? 43 : this.secretName.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
