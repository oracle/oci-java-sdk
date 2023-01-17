/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Enable TLS verification with CA certificate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CaCertVerify.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "tlsVerifyMode"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CaCertVerify extends TlsVerifyConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of OCI certificate service CA bundle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caCertificateBundleId")
        private String caCertificateBundleId;

        /**
         * The OCID of OCI certificate service CA bundle.
         * @param caCertificateBundleId the value to set
         * @return this builder
         **/
        public Builder caCertificateBundleId(String caCertificateBundleId) {
            this.caCertificateBundleId = caCertificateBundleId;
            this.__explicitlySet__.add("caCertificateBundleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CaCertVerify build() {
            CaCertVerify model = new CaCertVerify(this.caCertificateBundleId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CaCertVerify model) {
            if (model.wasPropertyExplicitlySet("caCertificateBundleId")) {
                this.caCertificateBundleId(model.getCaCertificateBundleId());
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

    @Deprecated
    public CaCertVerify(String caCertificateBundleId) {
        super();
        this.caCertificateBundleId = caCertificateBundleId;
    }

    /**
     * The OCID of OCI certificate service CA bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificateBundleId")
    private final String caCertificateBundleId;

    /**
     * The OCID of OCI certificate service CA bundle.
     * @return the value
     **/
    public String getCaCertificateBundleId() {
        return caCertificateBundleId;
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
        sb.append("CaCertVerify(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", caCertificateBundleId=").append(String.valueOf(this.caCertificateBundleId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CaCertVerify)) {
            return false;
        }

        CaCertVerify other = (CaCertVerify) o;
        return java.util.Objects.equals(this.caCertificateBundleId, other.caCertificateBundleId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.caCertificateBundleId == null
                                ? 43
                                : this.caCertificateBundleId.hashCode());
        return result;
    }
}
