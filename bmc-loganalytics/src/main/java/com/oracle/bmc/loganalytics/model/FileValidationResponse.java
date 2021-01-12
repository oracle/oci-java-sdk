/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FileValidationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FileValidationResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("inputFile")
        private String inputFile;

        public Builder inputFile(String inputFile) {
            this.inputFile = inputFile;
            this.__explicitlySet__.add("inputFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectLocation")
        private String objectLocation;

        public Builder objectLocation(String objectLocation) {
            this.objectLocation = objectLocation;
            this.__explicitlySet__.add("objectLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("files")
        private java.util.List<UploadFileStatus> files;

        public Builder files(java.util.List<UploadFileStatus> files) {
            this.files = files;
            this.__explicitlySet__.add("files");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileValidationResponse build() {
            FileValidationResponse __instance__ =
                    new FileValidationResponse(inputFile, objectLocation, files);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileValidationResponse o) {
            Builder copiedBuilder =
                    inputFile(o.getInputFile())
                            .objectLocation(o.getObjectLocation())
                            .files(o.getFiles());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Input File Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputFile")
    String inputFile;

    /**
     * Object Location where file content is available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectLocation")
    String objectLocation;

    /**
     * List of files inside the given archive file and their corresponding status information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("files")
    java.util.List<UploadFileStatus> files;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
