/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Data Storage configuration properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataStorageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isAutoExpandStorageEnabled", "maxStorageSizeInGBs"})
    public DataStorageDetails(Boolean isAutoExpandStorageEnabled, Integer maxStorageSizeInGBs) {
        super();
        this.isAutoExpandStorageEnabled = isAutoExpandStorageEnabled;
        this.maxStorageSizeInGBs = maxStorageSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enable/disable automatic storage expansion. When set to true, the DB System will
         * automatically add storage incrementally up to the value specified in maxStorageSizeInGBs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExpandStorageEnabled")
        private Boolean isAutoExpandStorageEnabled;

        /**
         * Enable/disable automatic storage expansion. When set to true, the DB System will
         * automatically add storage incrementally up to the value specified in maxStorageSizeInGBs.
         *
         * @param isAutoExpandStorageEnabled the value to set
         * @return this builder
         */
        public Builder isAutoExpandStorageEnabled(Boolean isAutoExpandStorageEnabled) {
            this.isAutoExpandStorageEnabled = isAutoExpandStorageEnabled;
            this.__explicitlySet__.add("isAutoExpandStorageEnabled");
            return this;
        }
        /**
         * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled is set
         * to true, the DB System will add storage incrementally up to this value.
         *
         * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         *
         * <p>It is not possible to decrease data storage size. You cannot set the maximum data
         * storage size to less than either current DB System dataStorageSizeInGBs or
         * allocatedStorageSizeInGBs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxStorageSizeInGBs")
        private Integer maxStorageSizeInGBs;

        /**
         * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled is set
         * to true, the DB System will add storage incrementally up to this value.
         *
         * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         *
         * <p>It is not possible to decrease data storage size. You cannot set the maximum data
         * storage size to less than either current DB System dataStorageSizeInGBs or
         * allocatedStorageSizeInGBs.
         *
         * @param maxStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder maxStorageSizeInGBs(Integer maxStorageSizeInGBs) {
            this.maxStorageSizeInGBs = maxStorageSizeInGBs;
            this.__explicitlySet__.add("maxStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataStorageDetails build() {
            DataStorageDetails model =
                    new DataStorageDetails(
                            this.isAutoExpandStorageEnabled, this.maxStorageSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataStorageDetails model) {
            if (model.wasPropertyExplicitlySet("isAutoExpandStorageEnabled")) {
                this.isAutoExpandStorageEnabled(model.getIsAutoExpandStorageEnabled());
            }
            if (model.wasPropertyExplicitlySet("maxStorageSizeInGBs")) {
                this.maxStorageSizeInGBs(model.getMaxStorageSizeInGBs());
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

    /**
     * Enable/disable automatic storage expansion. When set to true, the DB System will
     * automatically add storage incrementally up to the value specified in maxStorageSizeInGBs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExpandStorageEnabled")
    private final Boolean isAutoExpandStorageEnabled;

    /**
     * Enable/disable automatic storage expansion. When set to true, the DB System will
     * automatically add storage incrementally up to the value specified in maxStorageSizeInGBs.
     *
     * @return the value
     */
    public Boolean getIsAutoExpandStorageEnabled() {
        return isAutoExpandStorageEnabled;
    }

    /**
     * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled is set to
     * true, the DB System will add storage incrementally up to this value.
     *
     * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB. DB
     * Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB. DB
     * Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB. DB
     * Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     *
     * <p>It is not possible to decrease data storage size. You cannot set the maximum data storage
     * size to less than either current DB System dataStorageSizeInGBs or allocatedStorageSizeInGBs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxStorageSizeInGBs")
    private final Integer maxStorageSizeInGBs;

    /**
     * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled is set to
     * true, the DB System will add storage incrementally up to this value.
     *
     * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB. DB
     * Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB. DB
     * Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB. DB
     * Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     *
     * <p>It is not possible to decrease data storage size. You cannot set the maximum data storage
     * size to less than either current DB System dataStorageSizeInGBs or allocatedStorageSizeInGBs.
     *
     * @return the value
     */
    public Integer getMaxStorageSizeInGBs() {
        return maxStorageSizeInGBs;
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
        sb.append("DataStorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isAutoExpandStorageEnabled=")
                .append(String.valueOf(this.isAutoExpandStorageEnabled));
        sb.append(", maxStorageSizeInGBs=").append(String.valueOf(this.maxStorageSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataStorageDetails)) {
            return false;
        }

        DataStorageDetails other = (DataStorageDetails) o;
        return java.util.Objects.equals(
                        this.isAutoExpandStorageEnabled, other.isAutoExpandStorageEnabled)
                && java.util.Objects.equals(this.maxStorageSizeInGBs, other.maxStorageSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAutoExpandStorageEnabled == null
                                ? 43
                                : this.isAutoExpandStorageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maxStorageSizeInGBs == null
                                ? 43
                                : this.maxStorageSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
