/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Error information corresponding to each column that was required but was invalid. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkUploadCellInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkUploadCellInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"columnIndex", "errorInfo"})
    public BulkUploadCellInfo(String columnIndex, String errorInfo) {
        super();
        this.columnIndex = columnIndex;
        this.errorInfo = errorInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Column index as in the given bulk upload file. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
        private String columnIndex;

        /**
         * Column index as in the given bulk upload file.
         *
         * @param columnIndex the value to set
         * @return this builder
         */
        public Builder columnIndex(String columnIndex) {
            this.columnIndex = columnIndex;
            this.__explicitlySet__.add("columnIndex");
            return this;
        }
        /** Error information corresponding to a particular column. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
        private String errorInfo;

        /**
         * Error information corresponding to a particular column.
         *
         * @param errorInfo the value to set
         * @return this builder
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            this.__explicitlySet__.add("errorInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUploadCellInfo build() {
            BulkUploadCellInfo model = new BulkUploadCellInfo(this.columnIndex, this.errorInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUploadCellInfo model) {
            if (model.wasPropertyExplicitlySet("columnIndex")) {
                this.columnIndex(model.getColumnIndex());
            }
            if (model.wasPropertyExplicitlySet("errorInfo")) {
                this.errorInfo(model.getErrorInfo());
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

    /** Column index as in the given bulk upload file. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
    private final String columnIndex;

    /**
     * Column index as in the given bulk upload file.
     *
     * @return the value
     */
    public String getColumnIndex() {
        return columnIndex;
    }

    /** Error information corresponding to a particular column. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
    private final String errorInfo;

    /**
     * Error information corresponding to a particular column.
     *
     * @return the value
     */
    public String getErrorInfo() {
        return errorInfo;
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
        sb.append("BulkUploadCellInfo(");
        sb.append("super=").append(super.toString());
        sb.append("columnIndex=").append(String.valueOf(this.columnIndex));
        sb.append(", errorInfo=").append(String.valueOf(this.errorInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUploadCellInfo)) {
            return false;
        }

        BulkUploadCellInfo other = (BulkUploadCellInfo) o;
        return java.util.Objects.equals(this.columnIndex, other.columnIndex)
                && java.util.Objects.equals(this.errorInfo, other.errorInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.columnIndex == null ? 43 : this.columnIndex.hashCode());
        result = (result * PRIME) + (this.errorInfo == null ? 43 : this.errorInfo.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
