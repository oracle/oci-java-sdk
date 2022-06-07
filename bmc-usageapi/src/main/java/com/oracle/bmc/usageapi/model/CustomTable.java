/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The saved custom table.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CustomTable.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomTable {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "savedReportId", "compartmentId", "savedCustomTable"})
    public CustomTable(
            String id,
            String savedReportId,
            String compartmentId,
            SavedCustomTable savedCustomTable) {
        super();
        this.id = id;
        this.savedReportId = savedReportId;
        this.compartmentId = compartmentId;
        this.savedCustomTable = savedCustomTable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedReportId")
        private String savedReportId;

        public Builder savedReportId(String savedReportId) {
            this.savedReportId = savedReportId;
            this.__explicitlySet__.add("savedReportId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedCustomTable")
        private SavedCustomTable savedCustomTable;

        public Builder savedCustomTable(SavedCustomTable savedCustomTable) {
            this.savedCustomTable = savedCustomTable;
            this.__explicitlySet__.add("savedCustomTable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomTable build() {
            CustomTable __instance__ =
                    new CustomTable(id, savedReportId, compartmentId, savedCustomTable);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomTable o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .savedReportId(o.getSavedReportId())
                            .compartmentId(o.getCompartmentId())
                            .savedCustomTable(o.getSavedCustomTable());

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
     * The custom table OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The custom table associated saved report OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedReportId")
    private final String savedReportId;

    public String getSavedReportId() {
        return savedReportId;
    }

    /**
     * The custom table compartment OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("savedCustomTable")
    private final SavedCustomTable savedCustomTable;

    public SavedCustomTable getSavedCustomTable() {
        return savedCustomTable;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomTable(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", savedReportId=").append(String.valueOf(this.savedReportId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", savedCustomTable=").append(String.valueOf(this.savedCustomTable));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomTable)) {
            return false;
        }

        CustomTable other = (CustomTable) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.savedReportId, other.savedReportId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.savedCustomTable, other.savedCustomTable)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.savedReportId == null ? 43 : this.savedReportId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.savedCustomTable == null ? 43 : this.savedCustomTable.hashCode());
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
