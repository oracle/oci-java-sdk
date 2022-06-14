/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Error information corresponding to each column that was required but was invalid.
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
    builder = BulkUploadCellInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUploadCellInfo {
    @Deprecated
    @java.beans.ConstructorProperties({"columnIndex", "errorInfo"})
    public BulkUploadCellInfo(String columnIndex, String errorInfo) {
        super();
        this.columnIndex = columnIndex;
        this.errorInfo = errorInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Column index as in the given bulk upload file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
        private String columnIndex;

        /**
         * Column index as in the given bulk upload file.
         * @param columnIndex the value to set
         * @return this builder
         **/
        public Builder columnIndex(String columnIndex) {
            this.columnIndex = columnIndex;
            this.__explicitlySet__.add("columnIndex");
            return this;
        }
        /**
         * Error information corresponding to a particular column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
        private String errorInfo;

        /**
         * Error information corresponding to a particular column.
         * @param errorInfo the value to set
         * @return this builder
         **/
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            this.__explicitlySet__.add("errorInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUploadCellInfo build() {
            BulkUploadCellInfo __instance__ = new BulkUploadCellInfo(columnIndex, errorInfo);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUploadCellInfo o) {
            Builder copiedBuilder = columnIndex(o.getColumnIndex()).errorInfo(o.getErrorInfo());

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
     * Column index as in the given bulk upload file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
    private final String columnIndex;

    /**
     * Column index as in the given bulk upload file.
     * @return the value
     **/
    public String getColumnIndex() {
        return columnIndex;
    }

    /**
     * Error information corresponding to a particular column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
    private final String errorInfo;

    /**
     * Error information corresponding to a particular column.
     * @return the value
     **/
    public String getErrorInfo() {
        return errorInfo;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkUploadCellInfo(");
        sb.append("columnIndex=").append(String.valueOf(this.columnIndex));
        sb.append(", errorInfo=").append(String.valueOf(this.errorInfo));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.columnIndex == null ? 43 : this.columnIndex.hashCode());
        result = (result * PRIME) + (this.errorInfo == null ? 43 : this.errorInfo.hashCode());
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
