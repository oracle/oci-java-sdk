/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information about the replace CA Bundle of the rover node. <br>
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
        builder = ReplaceCertificateAuthorityResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplaceCertificateAuthorityResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"roverNodeId", "replaceCaDetails"})
    public ReplaceCertificateAuthorityResponse(
            String roverNodeId, ReplaceCaDetails replaceCaDetails) {
        super();
        this.roverNodeId = roverNodeId;
        this.replaceCaDetails = replaceCaDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** rover node ocid */
        @com.fasterxml.jackson.annotation.JsonProperty("roverNodeId")
        private String roverNodeId;

        /**
         * rover node ocid
         *
         * @param roverNodeId the value to set
         * @return this builder
         */
        public Builder roverNodeId(String roverNodeId) {
            this.roverNodeId = roverNodeId;
            this.__explicitlySet__.add("roverNodeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replaceCaDetails")
        private ReplaceCaDetails replaceCaDetails;

        public Builder replaceCaDetails(ReplaceCaDetails replaceCaDetails) {
            this.replaceCaDetails = replaceCaDetails;
            this.__explicitlySet__.add("replaceCaDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplaceCertificateAuthorityResponse build() {
            ReplaceCertificateAuthorityResponse model =
                    new ReplaceCertificateAuthorityResponse(
                            this.roverNodeId, this.replaceCaDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplaceCertificateAuthorityResponse model) {
            if (model.wasPropertyExplicitlySet("roverNodeId")) {
                this.roverNodeId(model.getRoverNodeId());
            }
            if (model.wasPropertyExplicitlySet("replaceCaDetails")) {
                this.replaceCaDetails(model.getReplaceCaDetails());
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

    /** rover node ocid */
    @com.fasterxml.jackson.annotation.JsonProperty("roverNodeId")
    private final String roverNodeId;

    /**
     * rover node ocid
     *
     * @return the value
     */
    public String getRoverNodeId() {
        return roverNodeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replaceCaDetails")
    private final ReplaceCaDetails replaceCaDetails;

    public ReplaceCaDetails getReplaceCaDetails() {
        return replaceCaDetails;
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
        sb.append("ReplaceCertificateAuthorityResponse(");
        sb.append("super=").append(super.toString());
        sb.append("roverNodeId=").append(String.valueOf(this.roverNodeId));
        sb.append(", replaceCaDetails=").append(String.valueOf(this.replaceCaDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplaceCertificateAuthorityResponse)) {
            return false;
        }

        ReplaceCertificateAuthorityResponse other = (ReplaceCertificateAuthorityResponse) o;
        return java.util.Objects.equals(this.roverNodeId, other.roverNodeId)
                && java.util.Objects.equals(this.replaceCaDetails, other.replaceCaDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.roverNodeId == null ? 43 : this.roverNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.replaceCaDetails == null ? 43 : this.replaceCaDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
