/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The AWR CPU usage data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbCpuUsageCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "awrResultType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbCpuUsageCollection extends AwrQueryResult {
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

        @com.fasterxml.jackson.annotation.JsonProperty("queryKey")
        private String queryKey;

        public Builder queryKey(String queryKey) {
            this.queryKey = queryKey;
            this.__explicitlySet__.add("queryKey");
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
         * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numCpuCores")
        private Integer numCpuCores;

        /**
         * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
         * @param numCpuCores the value to set
         * @return this builder
         **/
        public Builder numCpuCores(Integer numCpuCores) {
            this.numCpuCores = numCpuCores;
            this.__explicitlySet__.add("numCpuCores");
            return this;
        }
        /**
         * The number of CPUs available for the database to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private Integer cpuCount;

        /**
         * The number of CPUs available for the database to use.
         * @param cpuCount the value to set
         * @return this builder
         **/
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }
        /**
         * The number of available CPUs or processors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numCpus")
        private Double numCpus;

        /**
         * The number of available CPUs or processors.
         * @param numCpus the value to set
         * @return this builder
         **/
        public Builder numCpus(Double numCpus) {
            this.numCpus = numCpus;
            this.__explicitlySet__.add("numCpus");
            return this;
        }
        /**
         * A list of AWR CPU usage summary data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AwrDbCpuUsageSummary> items;

        /**
         * A list of AWR CPU usage summary data.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<AwrDbCpuUsageSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbCpuUsageCollection build() {
            AwrDbCpuUsageCollection model =
                    new AwrDbCpuUsageCollection(
                            this.name,
                            this.version,
                            this.queryKey,
                            this.dbQueryTimeInSecs,
                            this.numCpuCores,
                            this.cpuCount,
                            this.numCpus,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbCpuUsageCollection model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("queryKey")) {
                this.queryKey(model.getQueryKey());
            }
            if (model.wasPropertyExplicitlySet("dbQueryTimeInSecs")) {
                this.dbQueryTimeInSecs(model.getDbQueryTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("numCpuCores")) {
                this.numCpuCores(model.getNumCpuCores());
            }
            if (model.wasPropertyExplicitlySet("cpuCount")) {
                this.cpuCount(model.getCpuCount());
            }
            if (model.wasPropertyExplicitlySet("numCpus")) {
                this.numCpus(model.getNumCpus());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    @Deprecated
    public AwrDbCpuUsageCollection(
            String name,
            String version,
            String queryKey,
            Double dbQueryTimeInSecs,
            Integer numCpuCores,
            Integer cpuCount,
            Double numCpus,
            java.util.List<AwrDbCpuUsageSummary> items) {
        super(name, version, queryKey, dbQueryTimeInSecs);
        this.numCpuCores = numCpuCores;
        this.cpuCount = cpuCount;
        this.numCpus = numCpus;
        this.items = items;
    }

    /**
     * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numCpuCores")
    private final Integer numCpuCores;

    /**
     * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
     * @return the value
     **/
    public Integer getNumCpuCores() {
        return numCpuCores;
    }

    /**
     * The number of CPUs available for the database to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final Integer cpuCount;

    /**
     * The number of CPUs available for the database to use.
     * @return the value
     **/
    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * The number of available CPUs or processors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numCpus")
    private final Double numCpus;

    /**
     * The number of available CPUs or processors.
     * @return the value
     **/
    public Double getNumCpus() {
        return numCpus;
    }

    /**
     * A list of AWR CPU usage summary data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AwrDbCpuUsageSummary> items;

    /**
     * A list of AWR CPU usage summary data.
     * @return the value
     **/
    public java.util.List<AwrDbCpuUsageSummary> getItems() {
        return items;
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
        sb.append("AwrDbCpuUsageCollection(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", numCpuCores=").append(String.valueOf(this.numCpuCores));
        sb.append(", cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", numCpus=").append(String.valueOf(this.numCpus));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbCpuUsageCollection)) {
            return false;
        }

        AwrDbCpuUsageCollection other = (AwrDbCpuUsageCollection) o;
        return java.util.Objects.equals(this.numCpuCores, other.numCpuCores)
                && java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.numCpus, other.numCpus)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.numCpuCores == null ? 43 : this.numCpuCores.hashCode());
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result = (result * PRIME) + (this.numCpus == null ? 43 : this.numCpus.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
