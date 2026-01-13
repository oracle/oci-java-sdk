/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Time-based pause details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PreviousTaskInstanceRunOnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PreviousTaskInstanceRunOnDetails extends RunOnDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Previous Task Instance Details */
        @com.fasterxml.jackson.annotation.JsonProperty("previousTaskInstanceDetails")
        private java.util.List<PreviousTaskInstanceDetails> previousTaskInstanceDetails;

        /**
         * Previous Task Instance Details
         *
         * @param previousTaskInstanceDetails the value to set
         * @return this builder
         */
        public Builder previousTaskInstanceDetails(
                java.util.List<PreviousTaskInstanceDetails> previousTaskInstanceDetails) {
            this.previousTaskInstanceDetails = previousTaskInstanceDetails;
            this.__explicitlySet__.add("previousTaskInstanceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreviousTaskInstanceRunOnDetails build() {
            PreviousTaskInstanceRunOnDetails model =
                    new PreviousTaskInstanceRunOnDetails(this.previousTaskInstanceDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreviousTaskInstanceRunOnDetails model) {
            if (model.wasPropertyExplicitlySet("previousTaskInstanceDetails")) {
                this.previousTaskInstanceDetails(model.getPreviousTaskInstanceDetails());
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

    @Deprecated
    public PreviousTaskInstanceRunOnDetails(
            java.util.List<PreviousTaskInstanceDetails> previousTaskInstanceDetails) {
        super();
        this.previousTaskInstanceDetails = previousTaskInstanceDetails;
    }

    /** Previous Task Instance Details */
    @com.fasterxml.jackson.annotation.JsonProperty("previousTaskInstanceDetails")
    private final java.util.List<PreviousTaskInstanceDetails> previousTaskInstanceDetails;

    /**
     * Previous Task Instance Details
     *
     * @return the value
     */
    public java.util.List<PreviousTaskInstanceDetails> getPreviousTaskInstanceDetails() {
        return previousTaskInstanceDetails;
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
        sb.append("PreviousTaskInstanceRunOnDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", previousTaskInstanceDetails=")
                .append(String.valueOf(this.previousTaskInstanceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreviousTaskInstanceRunOnDetails)) {
            return false;
        }

        PreviousTaskInstanceRunOnDetails other = (PreviousTaskInstanceRunOnDetails) o;
        return java.util.Objects.equals(
                        this.previousTaskInstanceDetails, other.previousTaskInstanceDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.previousTaskInstanceDetails == null
                                ? 43
                                : this.previousTaskInstanceDetails.hashCode());
        return result;
    }
}
