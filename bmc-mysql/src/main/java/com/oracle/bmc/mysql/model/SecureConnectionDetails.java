/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Secure connection configuration details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecureConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecureConnectionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"certificateId", "certificateGenerationType"})
    public SecureConnectionDetails(
            String certificateId, CertificateGenerationType certificateGenerationType) {
        super();
        this.certificateId = certificateId;
        this.certificateGenerationType = certificateGenerationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the certificate to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The OCID of the certificate to use.
         * @param certificateId the value to set
         * @return this builder
         **/
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /**
         * Select whether to use MySQL Database Service-managed certificate (SYSTEM) or your own certificate (BYOC).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateGenerationType")
        private CertificateGenerationType certificateGenerationType;

        /**
         * Select whether to use MySQL Database Service-managed certificate (SYSTEM) or your own certificate (BYOC).
         *
         * @param certificateGenerationType the value to set
         * @return this builder
         **/
        public Builder certificateGenerationType(
                CertificateGenerationType certificateGenerationType) {
            this.certificateGenerationType = certificateGenerationType;
            this.__explicitlySet__.add("certificateGenerationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecureConnectionDetails build() {
            SecureConnectionDetails model =
                    new SecureConnectionDetails(this.certificateId, this.certificateGenerationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecureConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("certificateGenerationType")) {
                this.certificateGenerationType(model.getCertificateGenerationType());
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
     * The OCID of the certificate to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the certificate to use.
     * @return the value
     **/
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * Select whether to use MySQL Database Service-managed certificate (SYSTEM) or your own certificate (BYOC).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateGenerationType")
    private final CertificateGenerationType certificateGenerationType;

    /**
     * Select whether to use MySQL Database Service-managed certificate (SYSTEM) or your own certificate (BYOC).
     *
     * @return the value
     **/
    public CertificateGenerationType getCertificateGenerationType() {
        return certificateGenerationType;
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
        sb.append("SecureConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", certificateGenerationType=")
                .append(String.valueOf(this.certificateGenerationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecureConnectionDetails)) {
            return false;
        }

        SecureConnectionDetails other = (SecureConnectionDetails) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(
                        this.certificateGenerationType, other.certificateGenerationType)
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
                        + (this.certificateGenerationType == null
                                ? 43
                                : this.certificateGenerationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
