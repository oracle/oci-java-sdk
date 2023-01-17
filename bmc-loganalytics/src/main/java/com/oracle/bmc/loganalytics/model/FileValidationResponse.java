/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Response object containing details about file upload eligibility.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FileValidationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FileValidationResponse
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inputFile", "objectLocation", "files"})
    public FileValidationResponse(
            String inputFile, String objectLocation, java.util.List<UploadFileStatus> files) {
        super();
        this.inputFile = inputFile;
        this.objectLocation = objectLocation;
        this.files = files;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Input File Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputFile")
        private String inputFile;

        /**
         * Input File Name.
         * @param inputFile the value to set
         * @return this builder
         **/
        public Builder inputFile(String inputFile) {
            this.inputFile = inputFile;
            this.__explicitlySet__.add("inputFile");
            return this;
        }
        /**
         * Object Location where file content is available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectLocation")
        private String objectLocation;

        /**
         * Object Location where file content is available.
         * @param objectLocation the value to set
         * @return this builder
         **/
        public Builder objectLocation(String objectLocation) {
            this.objectLocation = objectLocation;
            this.__explicitlySet__.add("objectLocation");
            return this;
        }
        /**
         * List of files inside the given archive file and their corresponding status information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("files")
        private java.util.List<UploadFileStatus> files;

        /**
         * List of files inside the given archive file and their corresponding status information.
         * @param files the value to set
         * @return this builder
         **/
        public Builder files(java.util.List<UploadFileStatus> files) {
            this.files = files;
            this.__explicitlySet__.add("files");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileValidationResponse build() {
            FileValidationResponse model =
                    new FileValidationResponse(this.inputFile, this.objectLocation, this.files);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileValidationResponse model) {
            if (model.wasPropertyExplicitlySet("inputFile")) {
                this.inputFile(model.getInputFile());
            }
            if (model.wasPropertyExplicitlySet("objectLocation")) {
                this.objectLocation(model.getObjectLocation());
            }
            if (model.wasPropertyExplicitlySet("files")) {
                this.files(model.getFiles());
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
     * Input File Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputFile")
    private final String inputFile;

    /**
     * Input File Name.
     * @return the value
     **/
    public String getInputFile() {
        return inputFile;
    }

    /**
     * Object Location where file content is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectLocation")
    private final String objectLocation;

    /**
     * Object Location where file content is available.
     * @return the value
     **/
    public String getObjectLocation() {
        return objectLocation;
    }

    /**
     * List of files inside the given archive file and their corresponding status information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("files")
    private final java.util.List<UploadFileStatus> files;

    /**
     * List of files inside the given archive file and their corresponding status information.
     * @return the value
     **/
    public java.util.List<UploadFileStatus> getFiles() {
        return files;
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
        sb.append("FileValidationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("inputFile=").append(String.valueOf(this.inputFile));
        sb.append(", objectLocation=").append(String.valueOf(this.objectLocation));
        sb.append(", files=").append(String.valueOf(this.files));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileValidationResponse)) {
            return false;
        }

        FileValidationResponse other = (FileValidationResponse) o;
        return java.util.Objects.equals(this.inputFile, other.inputFile)
                && java.util.Objects.equals(this.objectLocation, other.objectLocation)
                && java.util.Objects.equals(this.files, other.files)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.inputFile == null ? 43 : this.inputFile.hashCode());
        result =
                (result * PRIME)
                        + (this.objectLocation == null ? 43 : this.objectLocation.hashCode());
        result = (result * PRIME) + (this.files == null ? 43 : this.files.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
