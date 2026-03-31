/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Pre-Migration extended advisor report check item update.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAdvisorReportCheckDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAdvisorReportCheckDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isReviewed"})
    public UpdateAdvisorReportCheckDetails(Boolean isReviewed) {
        super();
        this.isReviewed = isReviewed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * User flag for advisor report check.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReviewed")
        private Boolean isReviewed;

        /**
         * User flag for advisor report check.
         *
         * @param isReviewed the value to set
         * @return this builder
         **/
        public Builder isReviewed(Boolean isReviewed) {
            this.isReviewed = isReviewed;
            this.__explicitlySet__.add("isReviewed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAdvisorReportCheckDetails build() {
            UpdateAdvisorReportCheckDetails model =
                    new UpdateAdvisorReportCheckDetails(this.isReviewed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAdvisorReportCheckDetails model) {
            if (model.wasPropertyExplicitlySet("isReviewed")) {
                this.isReviewed(model.getIsReviewed());
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
     * User flag for advisor report check.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReviewed")
    private final Boolean isReviewed;

    /**
     * User flag for advisor report check.
     *
     * @return the value
     **/
    public Boolean getIsReviewed() {
        return isReviewed;
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
        sb.append("UpdateAdvisorReportCheckDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isReviewed=").append(String.valueOf(this.isReviewed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAdvisorReportCheckDetails)) {
            return false;
        }

        UpdateAdvisorReportCheckDetails other = (UpdateAdvisorReportCheckDetails) o;
        return java.util.Objects.equals(this.isReviewed, other.isReviewed) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isReviewed == null ? 43 : this.isReviewed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
