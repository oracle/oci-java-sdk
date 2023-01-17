/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Attributes to support include/exclude files for triggering build runs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FileFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FileFilter extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filePaths"})
    public FileFilter(java.util.List<String> filePaths) {
        super();
        this.filePaths = filePaths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The file paths/glob pattern for files. */
        @com.fasterxml.jackson.annotation.JsonProperty("filePaths")
        private java.util.List<String> filePaths;

        /**
         * The file paths/glob pattern for files.
         *
         * @param filePaths the value to set
         * @return this builder
         */
        public Builder filePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            this.__explicitlySet__.add("filePaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileFilter build() {
            FileFilter model = new FileFilter(this.filePaths);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileFilter model) {
            if (model.wasPropertyExplicitlySet("filePaths")) {
                this.filePaths(model.getFilePaths());
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

    /** The file paths/glob pattern for files. */
    @com.fasterxml.jackson.annotation.JsonProperty("filePaths")
    private final java.util.List<String> filePaths;

    /**
     * The file paths/glob pattern for files.
     *
     * @return the value
     */
    public java.util.List<String> getFilePaths() {
        return filePaths;
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
        sb.append("FileFilter(");
        sb.append("super=").append(super.toString());
        sb.append("filePaths=").append(String.valueOf(this.filePaths));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileFilter)) {
            return false;
        }

        FileFilter other = (FileFilter) o;
        return java.util.Objects.equals(this.filePaths, other.filePaths) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filePaths == null ? 43 : this.filePaths.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
