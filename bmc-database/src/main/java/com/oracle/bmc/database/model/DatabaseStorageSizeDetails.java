/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The database storage size details. This database option is supported for the Exadata VM cluster
 * on Exascale Infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseStorageSizeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseStorageSizeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataStorageSizeInGBs", "recoStorageSizeInGBs"})
    public DatabaseStorageSizeDetails(Integer dataStorageSizeInGBs, Integer recoStorageSizeInGBs) {
        super();
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.recoStorageSizeInGBs = recoStorageSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The DATA storage size, in gigabytes, that is applicable for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * The DATA storage size, in gigabytes, that is applicable for the database.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /** The RECO storage size, in gigabytes, that is applicable for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
        private Integer recoStorageSizeInGBs;

        /**
         * The RECO storage size, in gigabytes, that is applicable for the database.
         *
         * @param recoStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder recoStorageSizeInGBs(Integer recoStorageSizeInGBs) {
            this.recoStorageSizeInGBs = recoStorageSizeInGBs;
            this.__explicitlySet__.add("recoStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseStorageSizeDetails build() {
            DatabaseStorageSizeDetails model =
                    new DatabaseStorageSizeDetails(
                            this.dataStorageSizeInGBs, this.recoStorageSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseStorageSizeDetails model) {
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("recoStorageSizeInGBs")) {
                this.recoStorageSizeInGBs(model.getRecoStorageSizeInGBs());
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

    /** The DATA storage size, in gigabytes, that is applicable for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The DATA storage size, in gigabytes, that is applicable for the database.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /** The RECO storage size, in gigabytes, that is applicable for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
    private final Integer recoStorageSizeInGBs;

    /**
     * The RECO storage size, in gigabytes, that is applicable for the database.
     *
     * @return the value
     */
    public Integer getRecoStorageSizeInGBs() {
        return recoStorageSizeInGBs;
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
        sb.append("DatabaseStorageSizeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", recoStorageSizeInGBs=").append(String.valueOf(this.recoStorageSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseStorageSizeDetails)) {
            return false;
        }

        DatabaseStorageSizeDetails other = (DatabaseStorageSizeDetails) o;
        return java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.recoStorageSizeInGBs, other.recoStorageSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.recoStorageSizeInGBs == null
                                ? 43
                                : this.recoStorageSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
