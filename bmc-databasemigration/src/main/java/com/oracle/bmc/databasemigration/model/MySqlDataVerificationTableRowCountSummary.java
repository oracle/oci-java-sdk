/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Table row count comparison result line for MySQL migrations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MySqlDataVerificationTableRowCountSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "databaseCombination"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MySqlDataVerificationTableRowCountSummary
        extends DataVerificationTableRowCountSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceRowCount")
        private Integer sourceRowCount;

        public Builder sourceRowCount(Integer sourceRowCount) {
            this.sourceRowCount = sourceRowCount;
            this.__explicitlySet__.add("sourceRowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetRowCount")
        private Integer targetRowCount;

        public Builder targetRowCount(Integer targetRowCount) {
            this.targetRowCount = targetRowCount;
            this.__explicitlySet__.add("targetRowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variancePercent")
        private Double variancePercent;

        public Builder variancePercent(Double variancePercent) {
            this.variancePercent = variancePercent;
            this.__explicitlySet__.add("variancePercent");
            return this;
        }
        /**
         * Time of last statistics collection in the source used for the dictionary-based row count estimate.
         * This value is reported per row because statistics can be collected at different times per object.
         * This timestamp is stored in UTC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSourceStatisticsCollection")
        private java.util.Date timeLastSourceStatisticsCollection;

        /**
         * Time of last statistics collection in the source used for the dictionary-based row count estimate.
         * This value is reported per row because statistics can be collected at different times per object.
         * This timestamp is stored in UTC.
         *
         * @param timeLastSourceStatisticsCollection the value to set
         * @return this builder
         **/
        public Builder timeLastSourceStatisticsCollection(
                java.util.Date timeLastSourceStatisticsCollection) {
            this.timeLastSourceStatisticsCollection = timeLastSourceStatisticsCollection;
            this.__explicitlySet__.add("timeLastSourceStatisticsCollection");
            return this;
        }
        /**
         * Time of last statistics collection in the target used for the dictionary-based row count estimate.
         * This value is reported per row because statistics can be collected at different times per object.
         * This timestamp is stored in UTC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastTargetStatisticsCollection")
        private java.util.Date timeLastTargetStatisticsCollection;

        /**
         * Time of last statistics collection in the target used for the dictionary-based row count estimate.
         * This value is reported per row because statistics can be collected at different times per object.
         * This timestamp is stored in UTC.
         *
         * @param timeLastTargetStatisticsCollection the value to set
         * @return this builder
         **/
        public Builder timeLastTargetStatisticsCollection(
                java.util.Date timeLastTargetStatisticsCollection) {
            this.timeLastTargetStatisticsCollection = timeLastTargetStatisticsCollection;
            this.__explicitlySet__.add("timeLastTargetStatisticsCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDataVerificationTableRowCountSummary build() {
            MySqlDataVerificationTableRowCountSummary model =
                    new MySqlDataVerificationTableRowCountSummary(
                            this.owner,
                            this.tableName,
                            this.sourceRowCount,
                            this.targetRowCount,
                            this.variancePercent,
                            this.timeLastSourceStatisticsCollection,
                            this.timeLastTargetStatisticsCollection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDataVerificationTableRowCountSummary model) {
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("sourceRowCount")) {
                this.sourceRowCount(model.getSourceRowCount());
            }
            if (model.wasPropertyExplicitlySet("targetRowCount")) {
                this.targetRowCount(model.getTargetRowCount());
            }
            if (model.wasPropertyExplicitlySet("variancePercent")) {
                this.variancePercent(model.getVariancePercent());
            }
            if (model.wasPropertyExplicitlySet("timeLastSourceStatisticsCollection")) {
                this.timeLastSourceStatisticsCollection(
                        model.getTimeLastSourceStatisticsCollection());
            }
            if (model.wasPropertyExplicitlySet("timeLastTargetStatisticsCollection")) {
                this.timeLastTargetStatisticsCollection(
                        model.getTimeLastTargetStatisticsCollection());
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
    public MySqlDataVerificationTableRowCountSummary(
            String owner,
            String tableName,
            Integer sourceRowCount,
            Integer targetRowCount,
            Double variancePercent,
            java.util.Date timeLastSourceStatisticsCollection,
            java.util.Date timeLastTargetStatisticsCollection) {
        super(owner, tableName, sourceRowCount, targetRowCount, variancePercent);
        this.timeLastSourceStatisticsCollection = timeLastSourceStatisticsCollection;
        this.timeLastTargetStatisticsCollection = timeLastTargetStatisticsCollection;
    }

    /**
     * Time of last statistics collection in the source used for the dictionary-based row count estimate.
     * This value is reported per row because statistics can be collected at different times per object.
     * This timestamp is stored in UTC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSourceStatisticsCollection")
    private final java.util.Date timeLastSourceStatisticsCollection;

    /**
     * Time of last statistics collection in the source used for the dictionary-based row count estimate.
     * This value is reported per row because statistics can be collected at different times per object.
     * This timestamp is stored in UTC.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSourceStatisticsCollection() {
        return timeLastSourceStatisticsCollection;
    }

    /**
     * Time of last statistics collection in the target used for the dictionary-based row count estimate.
     * This value is reported per row because statistics can be collected at different times per object.
     * This timestamp is stored in UTC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastTargetStatisticsCollection")
    private final java.util.Date timeLastTargetStatisticsCollection;

    /**
     * Time of last statistics collection in the target used for the dictionary-based row count estimate.
     * This value is reported per row because statistics can be collected at different times per object.
     * This timestamp is stored in UTC.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastTargetStatisticsCollection() {
        return timeLastTargetStatisticsCollection;
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
        sb.append("MySqlDataVerificationTableRowCountSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeLastSourceStatisticsCollection=")
                .append(String.valueOf(this.timeLastSourceStatisticsCollection));
        sb.append(", timeLastTargetStatisticsCollection=")
                .append(String.valueOf(this.timeLastTargetStatisticsCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDataVerificationTableRowCountSummary)) {
            return false;
        }

        MySqlDataVerificationTableRowCountSummary other =
                (MySqlDataVerificationTableRowCountSummary) o;
        return java.util.Objects.equals(
                        this.timeLastSourceStatisticsCollection,
                        other.timeLastSourceStatisticsCollection)
                && java.util.Objects.equals(
                        this.timeLastTargetStatisticsCollection,
                        other.timeLastTargetStatisticsCollection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeLastSourceStatisticsCollection == null
                                ? 43
                                : this.timeLastSourceStatisticsCollection.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastTargetStatisticsCollection == null
                                ? 43
                                : this.timeLastTargetStatisticsCollection.hashCode());
        return result;
    }
}
