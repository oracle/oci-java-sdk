/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Data Storage information.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataStorage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "allocatedStorageSizeInGBs",
        "dataStorageSizeInGBs",
        "dataStorageSizeLimitInGBs",
        "isAutoExpandStorageEnabled",
        "maxStorageSizeInGBs"
    })
    public DataStorage(
            Integer allocatedStorageSizeInGBs,
            Integer dataStorageSizeInGBs,
            Integer dataStorageSizeLimitInGBs,
            Boolean isAutoExpandStorageEnabled,
            Integer maxStorageSizeInGBs) {
        super();
        this.allocatedStorageSizeInGBs = allocatedStorageSizeInGBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.dataStorageSizeLimitInGBs = dataStorageSizeLimitInGBs;
        this.isAutoExpandStorageEnabled = isAutoExpandStorageEnabled;
        this.maxStorageSizeInGBs = maxStorageSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The actual allocated storage size for the DB System. This may be higher than dataStorageSizeInGBs
         * if an automatic storage expansion has occurred.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedStorageSizeInGBs")
        private Integer allocatedStorageSizeInGBs;

        /**
         * The actual allocated storage size for the DB System. This may be higher than dataStorageSizeInGBs
         * if an automatic storage expansion has occurred.
         *
         * @param allocatedStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder allocatedStorageSizeInGBs(Integer allocatedStorageSizeInGBs) {
            this.allocatedStorageSizeInGBs = allocatedStorageSizeInGBs;
            this.__explicitlySet__.add("allocatedStorageSizeInGBs");
            return this;
        }
        /**
         * User specified size of the data volume. May be less than current allocatedStorageSizeInGBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * User specified size of the data volume. May be less than current allocatedStorageSizeInGBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The absolute limit the DB System's storage size may ever expand to, either manually or automatically.
         * This limit is based based on the initial dataStorageSizeInGBs when the DB System was first created.
         * Both dataStorageSizeInGBs and maxDataStorageSizeInGBs can not exceed this value.
         * <p>
         * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeLimitInGBs")
        private Integer dataStorageSizeLimitInGBs;

        /**
         * The absolute limit the DB System's storage size may ever expand to, either manually or automatically.
         * This limit is based based on the initial dataStorageSizeInGBs when the DB System was first created.
         * Both dataStorageSizeInGBs and maxDataStorageSizeInGBs can not exceed this value.
         * <p>
         * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         *
         * @param dataStorageSizeLimitInGBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeLimitInGBs(Integer dataStorageSizeLimitInGBs) {
            this.dataStorageSizeLimitInGBs = dataStorageSizeLimitInGBs;
            this.__explicitlySet__.add("dataStorageSizeLimitInGBs");
            return this;
        }
        /**
         * Enable/disable automatic storage expansion. When set to true, the DB System will automatically
         * add storage incrementally up to the value specified in maxStorageSizeInGBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExpandStorageEnabled")
        private Boolean isAutoExpandStorageEnabled;

        /**
         * Enable/disable automatic storage expansion. When set to true, the DB System will automatically
         * add storage incrementally up to the value specified in maxStorageSizeInGBs.
         *
         * @param isAutoExpandStorageEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoExpandStorageEnabled(Boolean isAutoExpandStorageEnabled) {
            this.isAutoExpandStorageEnabled = isAutoExpandStorageEnabled;
            this.__explicitlySet__.add("isAutoExpandStorageEnabled");
            return this;
        }
        /**
         * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled
         * is set to true, the DB System will add storage incrementally up to this value.
         * <p>
         * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         * <p>
         * It is not possible to decrease data storage size. You cannot set the maximum data storage size to less
         * than either current DB System dataStorageSizeInGBs or allocatedStorageSizeInGBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxStorageSizeInGBs")
        private Integer maxStorageSizeInGBs;

        /**
         * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled
         * is set to true, the DB System will add storage incrementally up to this value.
         * <p>
         * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         * <p>
         * It is not possible to decrease data storage size. You cannot set the maximum data storage size to less
         * than either current DB System dataStorageSizeInGBs or allocatedStorageSizeInGBs.
         *
         * @param maxStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder maxStorageSizeInGBs(Integer maxStorageSizeInGBs) {
            this.maxStorageSizeInGBs = maxStorageSizeInGBs;
            this.__explicitlySet__.add("maxStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataStorage build() {
            DataStorage model =
                    new DataStorage(
                            this.allocatedStorageSizeInGBs,
                            this.dataStorageSizeInGBs,
                            this.dataStorageSizeLimitInGBs,
                            this.isAutoExpandStorageEnabled,
                            this.maxStorageSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataStorage model) {
            if (model.wasPropertyExplicitlySet("allocatedStorageSizeInGBs")) {
                this.allocatedStorageSizeInGBs(model.getAllocatedStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeLimitInGBs")) {
                this.dataStorageSizeLimitInGBs(model.getDataStorageSizeLimitInGBs());
            }
            if (model.wasPropertyExplicitlySet("isAutoExpandStorageEnabled")) {
                this.isAutoExpandStorageEnabled(model.getIsAutoExpandStorageEnabled());
            }
            if (model.wasPropertyExplicitlySet("maxStorageSizeInGBs")) {
                this.maxStorageSizeInGBs(model.getMaxStorageSizeInGBs());
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
     * The actual allocated storage size for the DB System. This may be higher than dataStorageSizeInGBs
     * if an automatic storage expansion has occurred.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedStorageSizeInGBs")
    private final Integer allocatedStorageSizeInGBs;

    /**
     * The actual allocated storage size for the DB System. This may be higher than dataStorageSizeInGBs
     * if an automatic storage expansion has occurred.
     *
     * @return the value
     **/
    public Integer getAllocatedStorageSizeInGBs() {
        return allocatedStorageSizeInGBs;
    }

    /**
     * User specified size of the data volume. May be less than current allocatedStorageSizeInGBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * User specified size of the data volume. May be less than current allocatedStorageSizeInGBs.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The absolute limit the DB System's storage size may ever expand to, either manually or automatically.
     * This limit is based based on the initial dataStorageSizeInGBs when the DB System was first created.
     * Both dataStorageSizeInGBs and maxDataStorageSizeInGBs can not exceed this value.
     * <p>
     * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
     * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
     * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
     * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeLimitInGBs")
    private final Integer dataStorageSizeLimitInGBs;

    /**
     * The absolute limit the DB System's storage size may ever expand to, either manually or automatically.
     * This limit is based based on the initial dataStorageSizeInGBs when the DB System was first created.
     * Both dataStorageSizeInGBs and maxDataStorageSizeInGBs can not exceed this value.
     * <p>
     * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
     * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
     * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
     * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeLimitInGBs() {
        return dataStorageSizeLimitInGBs;
    }

    /**
     * Enable/disable automatic storage expansion. When set to true, the DB System will automatically
     * add storage incrementally up to the value specified in maxStorageSizeInGBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExpandStorageEnabled")
    private final Boolean isAutoExpandStorageEnabled;

    /**
     * Enable/disable automatic storage expansion. When set to true, the DB System will automatically
     * add storage incrementally up to the value specified in maxStorageSizeInGBs.
     *
     * @return the value
     **/
    public Boolean getIsAutoExpandStorageEnabled() {
        return isAutoExpandStorageEnabled;
    }

    /**
     * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled
     * is set to true, the DB System will add storage incrementally up to this value.
     * <p>
     * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
     * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
     * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
     * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     * <p>
     * It is not possible to decrease data storage size. You cannot set the maximum data storage size to less
     * than either current DB System dataStorageSizeInGBs or allocatedStorageSizeInGBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxStorageSizeInGBs")
    private final Integer maxStorageSizeInGBs;

    /**
     * Maximum storage size this DB System can expand to. When isAutoExpandStorageEnabled
     * is set to true, the DB System will add storage incrementally up to this value.
     * <p>
     * DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
     * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
     * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
     * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     * <p>
     * It is not possible to decrease data storage size. You cannot set the maximum data storage size to less
     * than either current DB System dataStorageSizeInGBs or allocatedStorageSizeInGBs.
     *
     * @return the value
     **/
    public Integer getMaxStorageSizeInGBs() {
        return maxStorageSizeInGBs;
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
        sb.append("DataStorage(");
        sb.append("super=").append(super.toString());
        sb.append("allocatedStorageSizeInGBs=")
                .append(String.valueOf(this.allocatedStorageSizeInGBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", dataStorageSizeLimitInGBs=")
                .append(String.valueOf(this.dataStorageSizeLimitInGBs));
        sb.append(", isAutoExpandStorageEnabled=")
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
        if (!(o instanceof DataStorage)) {
            return false;
        }

        DataStorage other = (DataStorage) o;
        return java.util.Objects.equals(
                        this.allocatedStorageSizeInGBs, other.allocatedStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.dataStorageSizeLimitInGBs, other.dataStorageSizeLimitInGBs)
                && java.util.Objects.equals(
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
                        + (this.allocatedStorageSizeInGBs == null
                                ? 43
                                : this.allocatedStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeLimitInGBs == null
                                ? 43
                                : this.dataStorageSizeLimitInGBs.hashCode());
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
