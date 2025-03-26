/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher review listing revision.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubmitListingRevisionForReviewDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubmitListingRevisionForReviewDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"noteDetails", "areInternalTenancyLaunchAllowed"})
    public SubmitListingRevisionForReviewDetails(
            String noteDetails, Boolean areInternalTenancyLaunchAllowed) {
        super();
        this.noteDetails = noteDetails;
        this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Notes provided for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("noteDetails")
        private String noteDetails;

        /**
         * Notes provided for the listing revision.
         * @param noteDetails the value to set
         * @return this builder
         **/
        public Builder noteDetails(String noteDetails) {
            this.noteDetails = noteDetails;
            this.__explicitlySet__.add("noteDetails");
            return this;
        }
        /**
         * Identifies whether publisher allows internal tenancy launches for the listing revision.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areInternalTenancyLaunchAllowed")
        private Boolean areInternalTenancyLaunchAllowed;

        /**
         * Identifies whether publisher allows internal tenancy launches for the listing revision.
         * @param areInternalTenancyLaunchAllowed the value to set
         * @return this builder
         **/
        public Builder areInternalTenancyLaunchAllowed(Boolean areInternalTenancyLaunchAllowed) {
            this.areInternalTenancyLaunchAllowed = areInternalTenancyLaunchAllowed;
            this.__explicitlySet__.add("areInternalTenancyLaunchAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubmitListingRevisionForReviewDetails build() {
            SubmitListingRevisionForReviewDetails model =
                    new SubmitListingRevisionForReviewDetails(
                            this.noteDetails, this.areInternalTenancyLaunchAllowed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubmitListingRevisionForReviewDetails model) {
            if (model.wasPropertyExplicitlySet("noteDetails")) {
                this.noteDetails(model.getNoteDetails());
            }
            if (model.wasPropertyExplicitlySet("areInternalTenancyLaunchAllowed")) {
                this.areInternalTenancyLaunchAllowed(model.getAreInternalTenancyLaunchAllowed());
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
     * Notes provided for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noteDetails")
    private final String noteDetails;

    /**
     * Notes provided for the listing revision.
     * @return the value
     **/
    public String getNoteDetails() {
        return noteDetails;
    }

    /**
     * Identifies whether publisher allows internal tenancy launches for the listing revision.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areInternalTenancyLaunchAllowed")
    private final Boolean areInternalTenancyLaunchAllowed;

    /**
     * Identifies whether publisher allows internal tenancy launches for the listing revision.
     * @return the value
     **/
    public Boolean getAreInternalTenancyLaunchAllowed() {
        return areInternalTenancyLaunchAllowed;
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
        sb.append("SubmitListingRevisionForReviewDetails(");
        sb.append("super=").append(super.toString());
        sb.append("noteDetails=").append(String.valueOf(this.noteDetails));
        sb.append(", areInternalTenancyLaunchAllowed=")
                .append(String.valueOf(this.areInternalTenancyLaunchAllowed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitListingRevisionForReviewDetails)) {
            return false;
        }

        SubmitListingRevisionForReviewDetails other = (SubmitListingRevisionForReviewDetails) o;
        return java.util.Objects.equals(this.noteDetails, other.noteDetails)
                && java.util.Objects.equals(
                        this.areInternalTenancyLaunchAllowed, other.areInternalTenancyLaunchAllowed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.noteDetails == null ? 43 : this.noteDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.areInternalTenancyLaunchAllowed == null
                                ? 43
                                : this.areInternalTenancyLaunchAllowed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
