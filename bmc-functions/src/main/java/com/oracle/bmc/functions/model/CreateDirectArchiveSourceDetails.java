/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Source details for creating the archive based function from Direct Archive. This allows the API
 * caller to directly upload the function code as a base64-encoded archive file. It is useful when
 * the caller wants to provide the code inline during function creation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDirectArchiveSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "archiveSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDirectArchiveSourceDetails extends CreateArchiveSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The base64-encoded archive file of the function code. The archive file must contain all
         * the files for the function. Please refer to functions documentation for maximum allowed
         * size and supported archive formats.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("archiveFile")
        private byte[] archiveFile;

        /**
         * The base64-encoded archive file of the function code. The archive file must contain all
         * the files for the function. Please refer to functions documentation for maximum allowed
         * size and supported archive formats.
         *
         * @param archiveFile the value to set
         * @return this builder
         */
        public Builder archiveFile(byte[] archiveFile) {
            this.archiveFile = archiveFile;
            this.__explicitlySet__.add("archiveFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDirectArchiveSourceDetails build() {
            CreateDirectArchiveSourceDetails model =
                    new CreateDirectArchiveSourceDetails(this.archiveFile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDirectArchiveSourceDetails model) {
            if (model.wasPropertyExplicitlySet("archiveFile")) {
                this.archiveFile(model.getArchiveFile());
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
    public CreateDirectArchiveSourceDetails(byte[] archiveFile) {
        super();
        this.archiveFile = archiveFile;
    }

    /**
     * The base64-encoded archive file of the function code. The archive file must contain all the
     * files for the function. Please refer to functions documentation for maximum allowed size and
     * supported archive formats.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("archiveFile")
    private final byte[] archiveFile;

    /**
     * The base64-encoded archive file of the function code. The archive file must contain all the
     * files for the function. Please refer to functions documentation for maximum allowed size and
     * supported archive formats.
     *
     * @return the value
     */
    public byte[] getArchiveFile() {
        return archiveFile;
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
        sb.append("CreateDirectArchiveSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", archiveFile=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.archiveFile)
                                : (String.valueOf(this.archiveFile)
                                        + (this.archiveFile != null
                                                ? " (byte[" + this.archiveFile.length + "])"
                                                : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDirectArchiveSourceDetails)) {
            return false;
        }

        CreateDirectArchiveSourceDetails other = (CreateDirectArchiveSourceDetails) o;
        return java.util.Arrays.equals(this.archiveFile, other.archiveFile) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + java.util.Arrays.hashCode(this.archiveFile);
        return result;
    }
}
