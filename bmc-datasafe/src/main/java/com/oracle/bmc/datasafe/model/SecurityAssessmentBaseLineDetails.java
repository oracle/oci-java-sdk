/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details required to set the baseline for the assessment. <br>
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
        builder = SecurityAssessmentBaseLineDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityAssessmentBaseLineDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"assessmentIds"})
    public SecurityAssessmentBaseLineDetails(java.util.List<String> assessmentIds) {
        super();
        this.assessmentIds = assessmentIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of OCIDs for the security assessments that need to be updated while setting the
         * baseline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentIds")
        private java.util.List<String> assessmentIds;

        /**
         * The list of OCIDs for the security assessments that need to be updated while setting the
         * baseline.
         *
         * @param assessmentIds the value to set
         * @return this builder
         */
        public Builder assessmentIds(java.util.List<String> assessmentIds) {
            this.assessmentIds = assessmentIds;
            this.__explicitlySet__.add("assessmentIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentBaseLineDetails build() {
            SecurityAssessmentBaseLineDetails model =
                    new SecurityAssessmentBaseLineDetails(this.assessmentIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentBaseLineDetails model) {
            if (model.wasPropertyExplicitlySet("assessmentIds")) {
                this.assessmentIds(model.getAssessmentIds());
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
     * The list of OCIDs for the security assessments that need to be updated while setting the
     * baseline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentIds")
    private final java.util.List<String> assessmentIds;

    /**
     * The list of OCIDs for the security assessments that need to be updated while setting the
     * baseline.
     *
     * @return the value
     */
    public java.util.List<String> getAssessmentIds() {
        return assessmentIds;
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
        sb.append("SecurityAssessmentBaseLineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentIds=").append(String.valueOf(this.assessmentIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAssessmentBaseLineDetails)) {
            return false;
        }

        SecurityAssessmentBaseLineDetails other = (SecurityAssessmentBaseLineDetails) o;
        return java.util.Objects.equals(this.assessmentIds, other.assessmentIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.assessmentIds == null ? 43 : this.assessmentIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
