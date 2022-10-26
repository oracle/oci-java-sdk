/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A library masking format to be used for masking. It can be either a predefined or a user-defined
 * library masking format. It enables reuse of an existing library masking format and helps avoid
 * defining the masking logic again. Use the ListLibraryMaskingFormats operation to view the
 * existing library masking formats. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LibraryMaskingFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LibraryMaskingFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the library masking format. */
        @com.fasterxml.jackson.annotation.JsonProperty("libraryMaskingFormatId")
        private String libraryMaskingFormatId;

        /**
         * The OCID of the library masking format.
         *
         * @param libraryMaskingFormatId the value to set
         * @return this builder
         */
        public Builder libraryMaskingFormatId(String libraryMaskingFormatId) {
            this.libraryMaskingFormatId = libraryMaskingFormatId;
            this.__explicitlySet__.add("libraryMaskingFormatId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LibraryMaskingFormatEntry build() {
            LibraryMaskingFormatEntry model =
                    new LibraryMaskingFormatEntry(this.description, this.libraryMaskingFormatId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LibraryMaskingFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("libraryMaskingFormatId")) {
                this.libraryMaskingFormatId(model.getLibraryMaskingFormatId());
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
    public LibraryMaskingFormatEntry(String description, String libraryMaskingFormatId) {
        super(description);
        this.libraryMaskingFormatId = libraryMaskingFormatId;
    }

    /** The OCID of the library masking format. */
    @com.fasterxml.jackson.annotation.JsonProperty("libraryMaskingFormatId")
    private final String libraryMaskingFormatId;

    /**
     * The OCID of the library masking format.
     *
     * @return the value
     */
    public String getLibraryMaskingFormatId() {
        return libraryMaskingFormatId;
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
        sb.append("LibraryMaskingFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", libraryMaskingFormatId=").append(String.valueOf(this.libraryMaskingFormatId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LibraryMaskingFormatEntry)) {
            return false;
        }

        LibraryMaskingFormatEntry other = (LibraryMaskingFormatEntry) o;
        return java.util.Objects.equals(this.libraryMaskingFormatId, other.libraryMaskingFormatId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.libraryMaskingFormatId == null
                                ? 43
                                : this.libraryMaskingFormatId.hashCode());
        return result;
    }
}
