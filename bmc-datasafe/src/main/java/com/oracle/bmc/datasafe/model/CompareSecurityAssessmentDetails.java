/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details specifying the security assessment used for comparison. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CompareSecurityAssessmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompareSecurityAssessmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"comparisonSecurityAssessmentId"})
    public CompareSecurityAssessmentDetails(String comparisonSecurityAssessmentId) {
        super();
        this.comparisonSecurityAssessmentId = comparisonSecurityAssessmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the security assessment. In this case a security assessment can be another
         * security assessment, a latest assessment or a baseline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("comparisonSecurityAssessmentId")
        private String comparisonSecurityAssessmentId;

        /**
         * The OCID of the security assessment. In this case a security assessment can be another
         * security assessment, a latest assessment or a baseline.
         *
         * @param comparisonSecurityAssessmentId the value to set
         * @return this builder
         */
        public Builder comparisonSecurityAssessmentId(String comparisonSecurityAssessmentId) {
            this.comparisonSecurityAssessmentId = comparisonSecurityAssessmentId;
            this.__explicitlySet__.add("comparisonSecurityAssessmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompareSecurityAssessmentDetails build() {
            CompareSecurityAssessmentDetails model =
                    new CompareSecurityAssessmentDetails(this.comparisonSecurityAssessmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompareSecurityAssessmentDetails model) {
            if (model.wasPropertyExplicitlySet("comparisonSecurityAssessmentId")) {
                this.comparisonSecurityAssessmentId(model.getComparisonSecurityAssessmentId());
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
     * The OCID of the security assessment. In this case a security assessment can be another
     * security assessment, a latest assessment or a baseline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comparisonSecurityAssessmentId")
    private final String comparisonSecurityAssessmentId;

    /**
     * The OCID of the security assessment. In this case a security assessment can be another
     * security assessment, a latest assessment or a baseline.
     *
     * @return the value
     */
    public String getComparisonSecurityAssessmentId() {
        return comparisonSecurityAssessmentId;
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
        sb.append("CompareSecurityAssessmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("comparisonSecurityAssessmentId=")
                .append(String.valueOf(this.comparisonSecurityAssessmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompareSecurityAssessmentDetails)) {
            return false;
        }

        CompareSecurityAssessmentDetails other = (CompareSecurityAssessmentDetails) o;
        return java.util.Objects.equals(
                        this.comparisonSecurityAssessmentId, other.comparisonSecurityAssessmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.comparisonSecurityAssessmentId == null
                                ? 43
                                : this.comparisonSecurityAssessmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
