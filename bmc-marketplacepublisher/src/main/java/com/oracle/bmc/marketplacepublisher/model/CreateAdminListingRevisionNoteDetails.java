/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for an Oracle Cloud Infrastructure Marketplace Publisher listing revision note.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAdminListingRevisionNoteDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAdminListingRevisionNoteDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"listingRevisionId", "noteDetails"})
    public CreateAdminListingRevisionNoteDetails(String listingRevisionId, String noteDetails) {
        super();
        this.listingRevisionId = listingRevisionId;
        this.noteDetails = noteDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the listing revision that the specified note belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
        private String listingRevisionId;

        /**
         * The unique identifier of the listing revision that the specified note belongs to.
         * @param listingRevisionId the value to set
         * @return this builder
         **/
        public Builder listingRevisionId(String listingRevisionId) {
            this.listingRevisionId = listingRevisionId;
            this.__explicitlySet__.add("listingRevisionId");
            return this;
        }
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAdminListingRevisionNoteDetails build() {
            CreateAdminListingRevisionNoteDetails model =
                    new CreateAdminListingRevisionNoteDetails(
                            this.listingRevisionId, this.noteDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAdminListingRevisionNoteDetails model) {
            if (model.wasPropertyExplicitlySet("listingRevisionId")) {
                this.listingRevisionId(model.getListingRevisionId());
            }
            if (model.wasPropertyExplicitlySet("noteDetails")) {
                this.noteDetails(model.getNoteDetails());
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
     * The unique identifier of the listing revision that the specified note belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingRevisionId")
    private final String listingRevisionId;

    /**
     * The unique identifier of the listing revision that the specified note belongs to.
     * @return the value
     **/
    public String getListingRevisionId() {
        return listingRevisionId;
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
        sb.append("CreateAdminListingRevisionNoteDetails(");
        sb.append("super=").append(super.toString());
        sb.append("listingRevisionId=").append(String.valueOf(this.listingRevisionId));
        sb.append(", noteDetails=").append(String.valueOf(this.noteDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAdminListingRevisionNoteDetails)) {
            return false;
        }

        CreateAdminListingRevisionNoteDetails other = (CreateAdminListingRevisionNoteDetails) o;
        return java.util.Objects.equals(this.listingRevisionId, other.listingRevisionId)
                && java.util.Objects.equals(this.noteDetails, other.noteDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.listingRevisionId == null ? 43 : this.listingRevisionId.hashCode());
        result = (result * PRIME) + (this.noteDetails == null ? 43 : this.noteDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
