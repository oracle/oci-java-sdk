/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Synchronization Statistics for a VectorStore File Sync operation or for a VectorStore Connector
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FileSyncStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FileSyncStatistics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalFilesSynced", "syncStatsByFileType"})
    public FileSyncStatistics(
            Integer totalFilesSynced, java.util.Map<String, Integer> syncStatsByFileType) {
        super();
        this.totalFilesSynced = totalFilesSynced;
        this.syncStatsByFileType = syncStatsByFileType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total number of files synchronized from the datasource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalFilesSynced")
        private Integer totalFilesSynced;

        /**
         * The total number of files synchronized from the datasource.
         * @param totalFilesSynced the value to set
         * @return this builder
         **/
        public Builder totalFilesSynced(Integer totalFilesSynced) {
            this.totalFilesSynced = totalFilesSynced;
            this.__explicitlySet__.add("totalFilesSynced");
            return this;
        }
        /**
         * FileSync Statistics for different file types.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("syncStatsByFileType")
        private java.util.Map<String, Integer> syncStatsByFileType;

        /**
         * FileSync Statistics for different file types.
         * @param syncStatsByFileType the value to set
         * @return this builder
         **/
        public Builder syncStatsByFileType(java.util.Map<String, Integer> syncStatsByFileType) {
            this.syncStatsByFileType = syncStatsByFileType;
            this.__explicitlySet__.add("syncStatsByFileType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileSyncStatistics build() {
            FileSyncStatistics model =
                    new FileSyncStatistics(this.totalFilesSynced, this.syncStatsByFileType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileSyncStatistics model) {
            if (model.wasPropertyExplicitlySet("totalFilesSynced")) {
                this.totalFilesSynced(model.getTotalFilesSynced());
            }
            if (model.wasPropertyExplicitlySet("syncStatsByFileType")) {
                this.syncStatsByFileType(model.getSyncStatsByFileType());
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
     * The total number of files synchronized from the datasource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalFilesSynced")
    private final Integer totalFilesSynced;

    /**
     * The total number of files synchronized from the datasource.
     * @return the value
     **/
    public Integer getTotalFilesSynced() {
        return totalFilesSynced;
    }

    /**
     * FileSync Statistics for different file types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("syncStatsByFileType")
    private final java.util.Map<String, Integer> syncStatsByFileType;

    /**
     * FileSync Statistics for different file types.
     * @return the value
     **/
    public java.util.Map<String, Integer> getSyncStatsByFileType() {
        return syncStatsByFileType;
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
        sb.append("FileSyncStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("totalFilesSynced=").append(String.valueOf(this.totalFilesSynced));
        sb.append(", syncStatsByFileType=").append(String.valueOf(this.syncStatsByFileType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileSyncStatistics)) {
            return false;
        }

        FileSyncStatistics other = (FileSyncStatistics) o;
        return java.util.Objects.equals(this.totalFilesSynced, other.totalFilesSynced)
                && java.util.Objects.equals(this.syncStatsByFileType, other.syncStatsByFileType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalFilesSynced == null ? 43 : this.totalFilesSynced.hashCode());
        result =
                (result * PRIME)
                        + (this.syncStatsByFileType == null
                                ? 43
                                : this.syncStatsByFileType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
