/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * List of member models (inferenceKey & modelId) to be associated with the model group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MemberModelEntries.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MemberModelEntries
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"memberModelDetails"})
    public MemberModelEntries(java.util.List<MemberModelDetails> memberModelDetails) {
        super();
        this.memberModelDetails = memberModelDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Each List item contains inference key and model ocid. */
        @com.fasterxml.jackson.annotation.JsonProperty("memberModelDetails")
        private java.util.List<MemberModelDetails> memberModelDetails;

        /**
         * Each List item contains inference key and model ocid.
         *
         * @param memberModelDetails the value to set
         * @return this builder
         */
        public Builder memberModelDetails(java.util.List<MemberModelDetails> memberModelDetails) {
            this.memberModelDetails = memberModelDetails;
            this.__explicitlySet__.add("memberModelDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemberModelEntries build() {
            MemberModelEntries model = new MemberModelEntries(this.memberModelDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemberModelEntries model) {
            if (model.wasPropertyExplicitlySet("memberModelDetails")) {
                this.memberModelDetails(model.getMemberModelDetails());
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

    /** Each List item contains inference key and model ocid. */
    @com.fasterxml.jackson.annotation.JsonProperty("memberModelDetails")
    private final java.util.List<MemberModelDetails> memberModelDetails;

    /**
     * Each List item contains inference key and model ocid.
     *
     * @return the value
     */
    public java.util.List<MemberModelDetails> getMemberModelDetails() {
        return memberModelDetails;
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
        sb.append("MemberModelEntries(");
        sb.append("super=").append(super.toString());
        sb.append("memberModelDetails=").append(String.valueOf(this.memberModelDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemberModelEntries)) {
            return false;
        }

        MemberModelEntries other = (MemberModelEntries) o;
        return java.util.Objects.equals(this.memberModelDetails, other.memberModelDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.memberModelDetails == null
                                ? 43
                                : this.memberModelDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
