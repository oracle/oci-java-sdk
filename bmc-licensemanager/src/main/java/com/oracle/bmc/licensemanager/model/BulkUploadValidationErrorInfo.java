/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Detailed error information corresponding to each column for a particular supported license record that could not be uploaded.
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
    builder = BulkUploadValidationErrorInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BulkUploadValidationErrorInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rowNumber")
        private Integer rowNumber;

        public Builder rowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
            this.__explicitlySet__.add("rowNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowError")
        private java.util.List<BulkUploadCellInfo> rowError;

        public Builder rowError(java.util.List<BulkUploadCellInfo> rowError) {
            this.rowError = rowError;
            this.__explicitlySet__.add("rowError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUploadValidationErrorInfo build() {
            BulkUploadValidationErrorInfo __instance__ =
                    new BulkUploadValidationErrorInfo(rowNumber, productName, rowError);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUploadValidationErrorInfo o) {
            Builder copiedBuilder =
                    rowNumber(o.getRowNumber())
                            .productName(o.getProductName())
                            .rowError(o.getRowError());

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
     * Refers to the license record number as provided in the bulk upload file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowNumber")
    Integer rowNumber;

    /**
     * Product name of invalid row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    String productName;

    /**
     * Error information corresponding to each column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowError")
    java.util.List<BulkUploadCellInfo> rowError;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
