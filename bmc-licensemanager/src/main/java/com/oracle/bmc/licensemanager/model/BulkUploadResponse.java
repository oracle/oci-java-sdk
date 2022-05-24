/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The bulk upload response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkUploadResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BulkUploadResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedRecords")
        private Integer totalSupportedRecords;

        public Builder totalSupportedRecords(Integer totalSupportedRecords) {
            this.totalSupportedRecords = totalSupportedRecords;
            this.__explicitlySet__.add("totalSupportedRecords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedRecordsSaved")
        private Integer totalSupportedRecordsSaved;

        public Builder totalSupportedRecordsSaved(Integer totalSupportedRecordsSaved) {
            this.totalSupportedRecordsSaved = totalSupportedRecordsSaved;
            this.__explicitlySet__.add("totalSupportedRecordsSaved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedDuplicateRecords")
        private Integer totalSupportedDuplicateRecords;

        public Builder totalSupportedDuplicateRecords(Integer totalSupportedDuplicateRecords) {
            this.totalSupportedDuplicateRecords = totalSupportedDuplicateRecords;
            this.__explicitlySet__.add("totalSupportedDuplicateRecords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedFailedLicenseRecords")
        private Integer totalSupportedFailedLicenseRecords;

        public Builder totalSupportedFailedLicenseRecords(
                Integer totalSupportedFailedLicenseRecords) {
            this.totalSupportedFailedLicenseRecords = totalSupportedFailedLicenseRecords;
            this.__explicitlySet__.add("totalSupportedFailedLicenseRecords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedInvalidRecords")
        private Integer totalSupportedInvalidRecords;

        public Builder totalSupportedInvalidRecords(Integer totalSupportedInvalidRecords) {
            this.totalSupportedInvalidRecords = totalSupportedInvalidRecords;
            this.__explicitlySet__.add("totalSupportedInvalidRecords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationErrorInfo")
        private java.util.List<BulkUploadValidationErrorInfo> validationErrorInfo;

        public Builder validationErrorInfo(
                java.util.List<BulkUploadValidationErrorInfo> validationErrorInfo) {
            this.validationErrorInfo = validationErrorInfo;
            this.__explicitlySet__.add("validationErrorInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedLicenseRecordInfo")
        private java.util.List<BulkUploadFailedRecordInfo> failedLicenseRecordInfo;

        public Builder failedLicenseRecordInfo(
                java.util.List<BulkUploadFailedRecordInfo> failedLicenseRecordInfo) {
            this.failedLicenseRecordInfo = failedLicenseRecordInfo;
            this.__explicitlySet__.add("failedLicenseRecordInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUploadResponse build() {
            BulkUploadResponse __instance__ =
                    new BulkUploadResponse(
                            totalSupportedRecords,
                            totalSupportedRecordsSaved,
                            totalSupportedDuplicateRecords,
                            totalSupportedFailedLicenseRecords,
                            totalSupportedInvalidRecords,
                            validationErrorInfo,
                            failedLicenseRecordInfo,
                            message);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUploadResponse o) {
            Builder copiedBuilder =
                    totalSupportedRecords(o.getTotalSupportedRecords())
                            .totalSupportedRecordsSaved(o.getTotalSupportedRecordsSaved())
                            .totalSupportedDuplicateRecords(o.getTotalSupportedDuplicateRecords())
                            .totalSupportedFailedLicenseRecords(
                                    o.getTotalSupportedFailedLicenseRecords())
                            .totalSupportedInvalidRecords(o.getTotalSupportedInvalidRecords())
                            .validationErrorInfo(o.getValidationErrorInfo())
                            .failedLicenseRecordInfo(o.getFailedLicenseRecordInfo())
                            .message(o.getMessage());

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
     * The number of license records which were supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedRecords")
    Integer totalSupportedRecords;

    /**
     * The number of supported license records that were uploaded successfully.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedRecordsSaved")
    Integer totalSupportedRecordsSaved;

    /**
     * The number of supported license records that were valid but not uploaded since they were duplicates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedDuplicateRecords")
    Integer totalSupportedDuplicateRecords;

    /**
     * The number of supported license records that were valid but failed with errors during upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedFailedLicenseRecords")
    Integer totalSupportedFailedLicenseRecords;

    /**
     * The number of supported license records that could not be uploaded since they were invalid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedInvalidRecords")
    Integer totalSupportedInvalidRecords;

    /**
     * Detailed error information corresponding to each supported but invalid row for the uploaded file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationErrorInfo")
    java.util.List<BulkUploadValidationErrorInfo> validationErrorInfo;

    /**
     * Error information corresponding to the supported records which are valid but could not be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedLicenseRecordInfo")
    java.util.List<BulkUploadFailedRecordInfo> failedLicenseRecordInfo;

    /**
     * Response message for bulk upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
