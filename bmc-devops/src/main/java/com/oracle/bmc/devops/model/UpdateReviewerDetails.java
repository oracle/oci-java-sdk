/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The reviewer to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateReviewerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateReviewerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"principalId"})
    public UpdateReviewerDetails(String principalId) {
        super();
        this.principalId = principalId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Pull Request reviewer id */
        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private String principalId;

        /**
         * Pull Request reviewer id
         *
         * @param principalId the value to set
         * @return this builder
         */
        public Builder principalId(String principalId) {
            this.principalId = principalId;
            this.__explicitlySet__.add("principalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateReviewerDetails build() {
            UpdateReviewerDetails model = new UpdateReviewerDetails(this.principalId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateReviewerDetails model) {
            if (model.wasPropertyExplicitlySet("principalId")) {
                this.principalId(model.getPrincipalId());
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

    /** Pull Request reviewer id */
    @com.fasterxml.jackson.annotation.JsonProperty("principalId")
    private final String principalId;

    /**
     * Pull Request reviewer id
     *
     * @return the value
     */
    public String getPrincipalId() {
        return principalId;
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
        sb.append("UpdateReviewerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("principalId=").append(String.valueOf(this.principalId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateReviewerDetails)) {
            return false;
        }

        UpdateReviewerDetails other = (UpdateReviewerDetails) o;
        return java.util.Objects.equals(this.principalId, other.principalId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
