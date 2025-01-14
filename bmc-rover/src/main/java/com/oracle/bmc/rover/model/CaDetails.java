/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information about the detailed CA bundle content of the rover node. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CaDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"caBundlePem", "certificateMaxValidityDuration"})
    public CaDetails(String caBundlePem, String certificateMaxValidityDuration) {
        super();
        this.caBundlePem = caBundlePem;
        this.certificateMaxValidityDuration = certificateMaxValidityDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Plain text certificate chain in PEM format for the subordinate CA associated with given
         * roverNode.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caBundlePem")
        private String caBundlePem;

        /**
         * Plain text certificate chain in PEM format for the subordinate CA associated with given
         * roverNode.
         *
         * @param caBundlePem the value to set
         * @return this builder
         */
        public Builder caBundlePem(String caBundlePem) {
            this.caBundlePem = caBundlePem;
            this.__explicitlySet__.add("caBundlePem");
            return this;
        }
        /**
         * Max validity of leaf certificates issued by the CA associated with given node, in days,
         * in ISO 8601 format, example "P365D".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateMaxValidityDuration")
        private String certificateMaxValidityDuration;

        /**
         * Max validity of leaf certificates issued by the CA associated with given node, in days,
         * in ISO 8601 format, example "P365D".
         *
         * @param certificateMaxValidityDuration the value to set
         * @return this builder
         */
        public Builder certificateMaxValidityDuration(String certificateMaxValidityDuration) {
            this.certificateMaxValidityDuration = certificateMaxValidityDuration;
            this.__explicitlySet__.add("certificateMaxValidityDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CaDetails build() {
            CaDetails model = new CaDetails(this.caBundlePem, this.certificateMaxValidityDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CaDetails model) {
            if (model.wasPropertyExplicitlySet("caBundlePem")) {
                this.caBundlePem(model.getCaBundlePem());
            }
            if (model.wasPropertyExplicitlySet("certificateMaxValidityDuration")) {
                this.certificateMaxValidityDuration(model.getCertificateMaxValidityDuration());
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

    /**
     * Plain text certificate chain in PEM format for the subordinate CA associated with given
     * roverNode.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caBundlePem")
    private final String caBundlePem;

    /**
     * Plain text certificate chain in PEM format for the subordinate CA associated with given
     * roverNode.
     *
     * @return the value
     */
    public String getCaBundlePem() {
        return caBundlePem;
    }

    /**
     * Max validity of leaf certificates issued by the CA associated with given node, in days, in
     * ISO 8601 format, example "P365D".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateMaxValidityDuration")
    private final String certificateMaxValidityDuration;

    /**
     * Max validity of leaf certificates issued by the CA associated with given node, in days, in
     * ISO 8601 format, example "P365D".
     *
     * @return the value
     */
    public String getCertificateMaxValidityDuration() {
        return certificateMaxValidityDuration;
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
        sb.append("CaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("caBundlePem=").append(String.valueOf(this.caBundlePem));
        sb.append(", certificateMaxValidityDuration=")
                .append(String.valueOf(this.certificateMaxValidityDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CaDetails)) {
            return false;
        }

        CaDetails other = (CaDetails) o;
        return java.util.Objects.equals(this.caBundlePem, other.caBundlePem)
                && java.util.Objects.equals(
                        this.certificateMaxValidityDuration, other.certificateMaxValidityDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.caBundlePem == null ? 43 : this.caBundlePem.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateMaxValidityDuration == null
                                ? 43
                                : this.certificateMaxValidityDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
