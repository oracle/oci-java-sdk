/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The information of renewed rover node certificate.
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
    builder = RenewCertificateResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RenewCertificateResponse
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"roverNodeId", "certificateDetails"})
    public RenewCertificateResponse(String roverNodeId, CertificateDetails certificateDetails) {
        super();
        this.roverNodeId = roverNodeId;
        this.certificateDetails = certificateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the rover node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("roverNodeId")
        private String roverNodeId;

        /**
         * The id of the rover node.
         * @param roverNodeId the value to set
         * @return this builder
         **/
        public Builder roverNodeId(String roverNodeId) {
            this.roverNodeId = roverNodeId;
            this.__explicitlySet__.add("roverNodeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateDetails")
        private CertificateDetails certificateDetails;

        public Builder certificateDetails(CertificateDetails certificateDetails) {
            this.certificateDetails = certificateDetails;
            this.__explicitlySet__.add("certificateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenewCertificateResponse build() {
            RenewCertificateResponse model =
                    new RenewCertificateResponse(this.roverNodeId, this.certificateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenewCertificateResponse model) {
            if (model.wasPropertyExplicitlySet("roverNodeId")) {
                this.roverNodeId(model.getRoverNodeId());
            }
            if (model.wasPropertyExplicitlySet("certificateDetails")) {
                this.certificateDetails(model.getCertificateDetails());
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
     * The id of the rover node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roverNodeId")
    private final String roverNodeId;

    /**
     * The id of the rover node.
     * @return the value
     **/
    public String getRoverNodeId() {
        return roverNodeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateDetails")
    private final CertificateDetails certificateDetails;

    public CertificateDetails getCertificateDetails() {
        return certificateDetails;
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
        sb.append("RenewCertificateResponse(");
        sb.append("super=").append(super.toString());
        sb.append("roverNodeId=").append(String.valueOf(this.roverNodeId));
        sb.append(", certificateDetails=").append(String.valueOf(this.certificateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenewCertificateResponse)) {
            return false;
        }

        RenewCertificateResponse other = (RenewCertificateResponse) o;
        return java.util.Objects.equals(this.roverNodeId, other.roverNodeId)
                && java.util.Objects.equals(this.certificateDetails, other.certificateDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.roverNodeId == null ? 43 : this.roverNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateDetails == null
                                ? 43
                                : this.certificateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
