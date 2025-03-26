/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The information required to generate a certificate for a roverNode.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RoverNodeGenerateCertificateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RoverNodeGenerateCertificateDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"csr", "timeCertValidityEnd"})
    public RoverNodeGenerateCertificateDetails(String csr, java.util.Date timeCertValidityEnd) {
        super();
        this.csr = csr;
        this.timeCertValidityEnd = timeCertValidityEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The certificate signing request (in PEM format), max size 10240.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("csr")
        private String csr;

        /**
         * The certificate signing request (in PEM format), max size 10240.
         * @param csr the value to set
         * @return this builder
         **/
        public Builder csr(String csr) {
            this.csr = csr;
            this.__explicitlySet__.add("csr");
            return this;
        }
        /**
         * Time when the generated certificate's validity will end.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCertValidityEnd")
        private java.util.Date timeCertValidityEnd;

        /**
         * Time when the generated certificate's validity will end.
         * @param timeCertValidityEnd the value to set
         * @return this builder
         **/
        public Builder timeCertValidityEnd(java.util.Date timeCertValidityEnd) {
            this.timeCertValidityEnd = timeCertValidityEnd;
            this.__explicitlySet__.add("timeCertValidityEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverNodeGenerateCertificateDetails build() {
            RoverNodeGenerateCertificateDetails model =
                    new RoverNodeGenerateCertificateDetails(this.csr, this.timeCertValidityEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverNodeGenerateCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("csr")) {
                this.csr(model.getCsr());
            }
            if (model.wasPropertyExplicitlySet("timeCertValidityEnd")) {
                this.timeCertValidityEnd(model.getTimeCertValidityEnd());
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
     * The certificate signing request (in PEM format), max size 10240.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csr")
    private final String csr;

    /**
     * The certificate signing request (in PEM format), max size 10240.
     * @return the value
     **/
    public String getCsr() {
        return csr;
    }

    /**
     * Time when the generated certificate's validity will end.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCertValidityEnd")
    private final java.util.Date timeCertValidityEnd;

    /**
     * Time when the generated certificate's validity will end.
     * @return the value
     **/
    public java.util.Date getTimeCertValidityEnd() {
        return timeCertValidityEnd;
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
        sb.append("RoverNodeGenerateCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("csr=").append(String.valueOf(this.csr));
        sb.append(", timeCertValidityEnd=").append(String.valueOf(this.timeCertValidityEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverNodeGenerateCertificateDetails)) {
            return false;
        }

        RoverNodeGenerateCertificateDetails other = (RoverNodeGenerateCertificateDetails) o;
        return java.util.Objects.equals(this.csr, other.csr)
                && java.util.Objects.equals(this.timeCertValidityEnd, other.timeCertValidityEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.csr == null ? 43 : this.csr.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCertValidityEnd == null
                                ? 43
                                : this.timeCertValidityEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
