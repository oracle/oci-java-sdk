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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkUploadResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUploadResponse {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalSupportedRecords",
        "totalSupportedRecordsSaved",
        "totalSupportedDuplicateRecords",
        "totalSupportedFailedLicenseRecords",
        "totalSupportedInvalidRecords",
        "validationErrorInfo",
        "failedLicenseRecordInfo",
        "message"
    })
    public BulkUploadResponse(
            Integer totalSupportedRecords,
            Integer totalSupportedRecordsSaved,
            Integer totalSupportedDuplicateRecords,
            Integer totalSupportedFailedLicenseRecords,
            Integer totalSupportedInvalidRecords,
            java.util.List<BulkUploadValidationErrorInfo> validationErrorInfo,
            java.util.List<BulkUploadFailedRecordInfo> failedLicenseRecordInfo,
            String message) {
        super();
        this.totalSupportedRecords = totalSupportedRecords;
        this.totalSupportedRecordsSaved = totalSupportedRecordsSaved;
        this.totalSupportedDuplicateRecords = totalSupportedDuplicateRecords;
        this.totalSupportedFailedLicenseRecords = totalSupportedFailedLicenseRecords;
        this.totalSupportedInvalidRecords = totalSupportedInvalidRecords;
        this.validationErrorInfo = validationErrorInfo;
        this.failedLicenseRecordInfo = failedLicenseRecordInfo;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of license records which were supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedRecords")
    private final Integer totalSupportedRecords;

    public Integer getTotalSupportedRecords() {
        return totalSupportedRecords;
    }

    /**
     * The number of supported license records that were uploaded successfully.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedRecordsSaved")
    private final Integer totalSupportedRecordsSaved;

    public Integer getTotalSupportedRecordsSaved() {
        return totalSupportedRecordsSaved;
    }

    /**
     * The number of supported license records that were valid but not uploaded since they were duplicates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedDuplicateRecords")
    private final Integer totalSupportedDuplicateRecords;

    public Integer getTotalSupportedDuplicateRecords() {
        return totalSupportedDuplicateRecords;
    }

    /**
     * The number of supported license records that were valid but failed with errors during upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedFailedLicenseRecords")
    private final Integer totalSupportedFailedLicenseRecords;

    public Integer getTotalSupportedFailedLicenseRecords() {
        return totalSupportedFailedLicenseRecords;
    }

    /**
     * The number of supported license records that could not be uploaded since they were invalid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSupportedInvalidRecords")
    private final Integer totalSupportedInvalidRecords;

    public Integer getTotalSupportedInvalidRecords() {
        return totalSupportedInvalidRecords;
    }

    /**
     * Detailed error information corresponding to each supported but invalid row for the uploaded file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationErrorInfo")
    private final java.util.List<BulkUploadValidationErrorInfo> validationErrorInfo;

    public java.util.List<BulkUploadValidationErrorInfo> getValidationErrorInfo() {
        return validationErrorInfo;
    }

    /**
     * Error information corresponding to the supported records which are valid but could not be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedLicenseRecordInfo")
    private final java.util.List<BulkUploadFailedRecordInfo> failedLicenseRecordInfo;

    public java.util.List<BulkUploadFailedRecordInfo> getFailedLicenseRecordInfo() {
        return failedLicenseRecordInfo;
    }

    /**
     * Response message for bulk upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkUploadResponse(");
        sb.append("totalSupportedRecords=").append(String.valueOf(this.totalSupportedRecords));
        sb.append(", totalSupportedRecordsSaved=")
                .append(String.valueOf(this.totalSupportedRecordsSaved));
        sb.append(", totalSupportedDuplicateRecords=")
                .append(String.valueOf(this.totalSupportedDuplicateRecords));
        sb.append(", totalSupportedFailedLicenseRecords=")
                .append(String.valueOf(this.totalSupportedFailedLicenseRecords));
        sb.append(", totalSupportedInvalidRecords=")
                .append(String.valueOf(this.totalSupportedInvalidRecords));
        sb.append(", validationErrorInfo=").append(String.valueOf(this.validationErrorInfo));
        sb.append(", failedLicenseRecordInfo=")
                .append(String.valueOf(this.failedLicenseRecordInfo));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUploadResponse)) {
            return false;
        }

        BulkUploadResponse other = (BulkUploadResponse) o;
        return java.util.Objects.equals(this.totalSupportedRecords, other.totalSupportedRecords)
                && java.util.Objects.equals(
                        this.totalSupportedRecordsSaved, other.totalSupportedRecordsSaved)
                && java.util.Objects.equals(
                        this.totalSupportedDuplicateRecords, other.totalSupportedDuplicateRecords)
                && java.util.Objects.equals(
                        this.totalSupportedFailedLicenseRecords,
                        other.totalSupportedFailedLicenseRecords)
                && java.util.Objects.equals(
                        this.totalSupportedInvalidRecords, other.totalSupportedInvalidRecords)
                && java.util.Objects.equals(this.validationErrorInfo, other.validationErrorInfo)
                && java.util.Objects.equals(
                        this.failedLicenseRecordInfo, other.failedLicenseRecordInfo)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalSupportedRecords == null
                                ? 43
                                : this.totalSupportedRecords.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSupportedRecordsSaved == null
                                ? 43
                                : this.totalSupportedRecordsSaved.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSupportedDuplicateRecords == null
                                ? 43
                                : this.totalSupportedDuplicateRecords.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSupportedFailedLicenseRecords == null
                                ? 43
                                : this.totalSupportedFailedLicenseRecords.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSupportedInvalidRecords == null
                                ? 43
                                : this.totalSupportedInvalidRecords.hashCode());
        result =
                (result * PRIME)
                        + (this.validationErrorInfo == null
                                ? 43
                                : this.validationErrorInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.failedLicenseRecordInfo == null
                                ? 43
                                : this.failedLicenseRecordInfo.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
