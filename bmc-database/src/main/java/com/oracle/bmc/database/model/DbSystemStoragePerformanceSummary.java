/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Representation of storage performance summary per shapeType .
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DbSystemStoragePerformanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemStoragePerformanceSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shapeType",
        "dataStoragePerformanceList",
        "recoStoragePerformanceList"
    })
    public DbSystemStoragePerformanceSummary(
            ShapeType shapeType,
            java.util.List<StoragePerformanceDetails> dataStoragePerformanceList,
            java.util.List<StoragePerformanceDetails> recoStoragePerformanceList) {
        super();
        this.shapeType = shapeType;
        this.dataStoragePerformanceList = dataStoragePerformanceList;
        this.recoStoragePerformanceList = recoStoragePerformanceList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ShapeType of the DbSystems,INTEL or AMD
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeType")
        private ShapeType shapeType;

        /**
         * ShapeType of the DbSystems,INTEL or AMD
         * @param shapeType the value to set
         * @return this builder
         **/
        public Builder shapeType(ShapeType shapeType) {
            this.shapeType = shapeType;
            this.__explicitlySet__.add("shapeType");
            return this;
        }
        /**
         * List of storage performance for the DATA disks
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePerformanceList")
        private java.util.List<StoragePerformanceDetails> dataStoragePerformanceList;

        /**
         * List of storage performance for the DATA disks
         * @param dataStoragePerformanceList the value to set
         * @return this builder
         **/
        public Builder dataStoragePerformanceList(
                java.util.List<StoragePerformanceDetails> dataStoragePerformanceList) {
            this.dataStoragePerformanceList = dataStoragePerformanceList;
            this.__explicitlySet__.add("dataStoragePerformanceList");
            return this;
        }
        /**
         * List of storage performance for the RECO disks
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoStoragePerformanceList")
        private java.util.List<StoragePerformanceDetails> recoStoragePerformanceList;

        /**
         * List of storage performance for the RECO disks
         * @param recoStoragePerformanceList the value to set
         * @return this builder
         **/
        public Builder recoStoragePerformanceList(
                java.util.List<StoragePerformanceDetails> recoStoragePerformanceList) {
            this.recoStoragePerformanceList = recoStoragePerformanceList;
            this.__explicitlySet__.add("recoStoragePerformanceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemStoragePerformanceSummary build() {
            DbSystemStoragePerformanceSummary model =
                    new DbSystemStoragePerformanceSummary(
                            this.shapeType,
                            this.dataStoragePerformanceList,
                            this.recoStoragePerformanceList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemStoragePerformanceSummary model) {
            if (model.wasPropertyExplicitlySet("shapeType")) {
                this.shapeType(model.getShapeType());
            }
            if (model.wasPropertyExplicitlySet("dataStoragePerformanceList")) {
                this.dataStoragePerformanceList(model.getDataStoragePerformanceList());
            }
            if (model.wasPropertyExplicitlySet("recoStoragePerformanceList")) {
                this.recoStoragePerformanceList(model.getRecoStoragePerformanceList());
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
     * ShapeType of the DbSystems,INTEL or AMD
     **/
    public enum ShapeType {
        Amd("AMD"),
        Intel("INTEL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShapeType.class);

        private final String value;
        private static java.util.Map<String, ShapeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeType v : ShapeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ShapeType of the DbSystems,INTEL or AMD
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeType")
    private final ShapeType shapeType;

    /**
     * ShapeType of the DbSystems,INTEL or AMD
     * @return the value
     **/
    public ShapeType getShapeType() {
        return shapeType;
    }

    /**
     * List of storage performance for the DATA disks
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePerformanceList")
    private final java.util.List<StoragePerformanceDetails> dataStoragePerformanceList;

    /**
     * List of storage performance for the DATA disks
     * @return the value
     **/
    public java.util.List<StoragePerformanceDetails> getDataStoragePerformanceList() {
        return dataStoragePerformanceList;
    }

    /**
     * List of storage performance for the RECO disks
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoStoragePerformanceList")
    private final java.util.List<StoragePerformanceDetails> recoStoragePerformanceList;

    /**
     * List of storage performance for the RECO disks
     * @return the value
     **/
    public java.util.List<StoragePerformanceDetails> getRecoStoragePerformanceList() {
        return recoStoragePerformanceList;
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
        sb.append("DbSystemStoragePerformanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("shapeType=").append(String.valueOf(this.shapeType));
        sb.append(", dataStoragePerformanceList=")
                .append(String.valueOf(this.dataStoragePerformanceList));
        sb.append(", recoStoragePerformanceList=")
                .append(String.valueOf(this.recoStoragePerformanceList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemStoragePerformanceSummary)) {
            return false;
        }

        DbSystemStoragePerformanceSummary other = (DbSystemStoragePerformanceSummary) o;
        return java.util.Objects.equals(this.shapeType, other.shapeType)
                && java.util.Objects.equals(
                        this.dataStoragePerformanceList, other.dataStoragePerformanceList)
                && java.util.Objects.equals(
                        this.recoStoragePerformanceList, other.recoStoragePerformanceList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeType == null ? 43 : this.shapeType.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStoragePerformanceList == null
                                ? 43
                                : this.dataStoragePerformanceList.hashCode());
        result =
                (result * PRIME)
                        + (this.recoStoragePerformanceList == null
                                ? 43
                                : this.recoStoragePerformanceList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
