/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The AWR CPU usage data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwrDatabaseCpuUsageCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "awrResultType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrDatabaseCpuUsageCollection extends AwrQueryResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbQueryTimeInSecs")
        private Double dbQueryTimeInSecs;

        public Builder dbQueryTimeInSecs(Double dbQueryTimeInSecs) {
            this.dbQueryTimeInSecs = dbQueryTimeInSecs;
            this.__explicitlySet__.add("dbQueryTimeInSecs");
            return this;
        }
        /**
         * The number of available CPU cores, which include subcores of multicore and single-core
         * CPUs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("numCpuCores")
        private Integer numCpuCores;

        /**
         * The number of available CPU cores, which include subcores of multicore and single-core
         * CPUs.
         *
         * @param numCpuCores the value to set
         * @return this builder
         */
        public Builder numCpuCores(Integer numCpuCores) {
            this.numCpuCores = numCpuCores;
            this.__explicitlySet__.add("numCpuCores");
            return this;
        }
        /** The number of CPUs available for the database to use. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseCpuCount")
        private Integer databaseCpuCount;

        /**
         * The number of CPUs available for the database to use.
         *
         * @param databaseCpuCount the value to set
         * @return this builder
         */
        public Builder databaseCpuCount(Integer databaseCpuCount) {
            this.databaseCpuCount = databaseCpuCount;
            this.__explicitlySet__.add("databaseCpuCount");
            return this;
        }
        /** The number of available CPUs or processors. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostCpuCount")
        private Double hostCpuCount;

        /**
         * The number of available CPUs or processors.
         *
         * @param hostCpuCount the value to set
         * @return this builder
         */
        public Builder hostCpuCount(Double hostCpuCount) {
            this.hostCpuCount = hostCpuCount;
            this.__explicitlySet__.add("hostCpuCount");
            return this;
        }
        /** A list of AWR CPU usage summary data. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AwrDatabaseCpuUsageSummary> items;

        /**
         * A list of AWR CPU usage summary data.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<AwrDatabaseCpuUsageSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseCpuUsageCollection build() {
            AwrDatabaseCpuUsageCollection model =
                    new AwrDatabaseCpuUsageCollection(
                            this.name,
                            this.version,
                            this.dbQueryTimeInSecs,
                            this.numCpuCores,
                            this.databaseCpuCount,
                            this.hostCpuCount,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseCpuUsageCollection model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("dbQueryTimeInSecs")) {
                this.dbQueryTimeInSecs(model.getDbQueryTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("numCpuCores")) {
                this.numCpuCores(model.getNumCpuCores());
            }
            if (model.wasPropertyExplicitlySet("databaseCpuCount")) {
                this.databaseCpuCount(model.getDatabaseCpuCount());
            }
            if (model.wasPropertyExplicitlySet("hostCpuCount")) {
                this.hostCpuCount(model.getHostCpuCount());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    @Deprecated
    public AwrDatabaseCpuUsageCollection(
            String name,
            String version,
            Double dbQueryTimeInSecs,
            Integer numCpuCores,
            Integer databaseCpuCount,
            Double hostCpuCount,
            java.util.List<AwrDatabaseCpuUsageSummary> items) {
        super(name, version, dbQueryTimeInSecs);
        this.numCpuCores = numCpuCores;
        this.databaseCpuCount = databaseCpuCount;
        this.hostCpuCount = hostCpuCount;
        this.items = items;
    }

    /**
     * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numCpuCores")
    private final Integer numCpuCores;

    /**
     * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
     *
     * @return the value
     */
    public Integer getNumCpuCores() {
        return numCpuCores;
    }

    /** The number of CPUs available for the database to use. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseCpuCount")
    private final Integer databaseCpuCount;

    /**
     * The number of CPUs available for the database to use.
     *
     * @return the value
     */
    public Integer getDatabaseCpuCount() {
        return databaseCpuCount;
    }

    /** The number of available CPUs or processors. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostCpuCount")
    private final Double hostCpuCount;

    /**
     * The number of available CPUs or processors.
     *
     * @return the value
     */
    public Double getHostCpuCount() {
        return hostCpuCount;
    }

    /** A list of AWR CPU usage summary data. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AwrDatabaseCpuUsageSummary> items;

    /**
     * A list of AWR CPU usage summary data.
     *
     * @return the value
     */
    public java.util.List<AwrDatabaseCpuUsageSummary> getItems() {
        return items;
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
        sb.append("AwrDatabaseCpuUsageCollection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", numCpuCores=").append(String.valueOf(this.numCpuCores));
        sb.append(", databaseCpuCount=").append(String.valueOf(this.databaseCpuCount));
        sb.append(", hostCpuCount=").append(String.valueOf(this.hostCpuCount));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseCpuUsageCollection)) {
            return false;
        }

        AwrDatabaseCpuUsageCollection other = (AwrDatabaseCpuUsageCollection) o;
        return java.util.Objects.equals(this.numCpuCores, other.numCpuCores)
                && java.util.Objects.equals(this.databaseCpuCount, other.databaseCpuCount)
                && java.util.Objects.equals(this.hostCpuCount, other.hostCpuCount)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.numCpuCores == null ? 43 : this.numCpuCores.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCpuCount == null ? 43 : this.databaseCpuCount.hashCode());
        result = (result * PRIME) + (this.hostCpuCount == null ? 43 : this.hostCpuCount.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
