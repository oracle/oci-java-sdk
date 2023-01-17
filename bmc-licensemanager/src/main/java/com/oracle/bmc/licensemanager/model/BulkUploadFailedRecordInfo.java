/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Error information for a valid license record that could not be uploaded. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkUploadFailedRecordInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BulkUploadFailedRecordInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rowNumber", "productName", "error"})
    public BulkUploadFailedRecordInfo(Integer rowNumber, String productName, String error) {
        super();
        this.rowNumber = rowNumber;
        this.productName = productName;
        this.error = error;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Refers to the license record number as provided in the bulk upload file. */
        @com.fasterxml.jackson.annotation.JsonProperty("rowNumber")
        private Integer rowNumber;

        /**
         * Refers to the license record number as provided in the bulk upload file.
         *
         * @param rowNumber the value to set
         * @return this builder
         */
        public Builder rowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
            this.__explicitlySet__.add("rowNumber");
            return this;
        }
        /** Product name of the failed row. */
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * Product name of the failed row.
         *
         * @param productName the value to set
         * @return this builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /** Failed license record error information. */
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private String error;

        /**
         * Failed license record error information.
         *
         * @param error the value to set
         * @return this builder
         */
        public Builder error(String error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUploadFailedRecordInfo build() {
            BulkUploadFailedRecordInfo model =
                    new BulkUploadFailedRecordInfo(this.rowNumber, this.productName, this.error);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUploadFailedRecordInfo model) {
            if (model.wasPropertyExplicitlySet("rowNumber")) {
                this.rowNumber(model.getRowNumber());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
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

    /** Refers to the license record number as provided in the bulk upload file. */
    @com.fasterxml.jackson.annotation.JsonProperty("rowNumber")
    private final Integer rowNumber;

    /**
     * Refers to the license record number as provided in the bulk upload file.
     *
     * @return the value
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    /** Product name of the failed row. */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * Product name of the failed row.
     *
     * @return the value
     */
    public String getProductName() {
        return productName;
    }

    /** Failed license record error information. */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final String error;

    /**
     * Failed license record error information.
     *
     * @return the value
     */
    public String getError() {
        return error;
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
        sb.append("BulkUploadFailedRecordInfo(");
        sb.append("super=").append(super.toString());
        sb.append("rowNumber=").append(String.valueOf(this.rowNumber));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUploadFailedRecordInfo)) {
            return false;
        }

        BulkUploadFailedRecordInfo other = (BulkUploadFailedRecordInfo) o;
        return java.util.Objects.equals(this.rowNumber, other.rowNumber)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.error, other.error)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rowNumber == null ? 43 : this.rowNumber.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
