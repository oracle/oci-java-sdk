/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details reqired to set baseline assessment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UserAssessmentBaseLineDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserAssessmentBaseLineDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"assessmentIds"})
    public UserAssessmentBaseLineDetails(java.util.List<String> assessmentIds) {
        super();
        this.assessmentIds = assessmentIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of user assessment OCIDs that need to be updated while setting the baseline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentIds")
        private java.util.List<String> assessmentIds;

        /**
         * The list of user assessment OCIDs that need to be updated while setting the baseline.
         * @param assessmentIds the value to set
         * @return this builder
         **/
        public Builder assessmentIds(java.util.List<String> assessmentIds) {
            this.assessmentIds = assessmentIds;
            this.__explicitlySet__.add("assessmentIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserAssessmentBaseLineDetails build() {
            UserAssessmentBaseLineDetails __instance__ =
                    new UserAssessmentBaseLineDetails(assessmentIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserAssessmentBaseLineDetails o) {
            Builder copiedBuilder = assessmentIds(o.getAssessmentIds());

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

    /**
     * The list of user assessment OCIDs that need to be updated while setting the baseline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentIds")
    private final java.util.List<String> assessmentIds;

    /**
     * The list of user assessment OCIDs that need to be updated while setting the baseline.
     * @return the value
     **/
    public java.util.List<String> getAssessmentIds() {
        return assessmentIds;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserAssessmentBaseLineDetails(");
        sb.append("assessmentIds=").append(String.valueOf(this.assessmentIds));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserAssessmentBaseLineDetails)) {
            return false;
        }

        UserAssessmentBaseLineDetails other = (UserAssessmentBaseLineDetails) o;
        return java.util.Objects.equals(this.assessmentIds, other.assessmentIds)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.assessmentIds == null ? 43 : this.assessmentIds.hashCode());
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
