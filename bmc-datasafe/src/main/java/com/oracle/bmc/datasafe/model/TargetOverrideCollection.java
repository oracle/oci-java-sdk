/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Collection of target override summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TargetOverrideCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetOverrideCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetsCount",
        "targetsOverridingCount",
        "targetsConformingCount",
        "targetsOverridingPaidUsageCount",
        "targetsOverridingOnlineMonthsCount",
        "targetsOverridingOfflineMonthsCount",
        "items"
    })
    public TargetOverrideCollection(
            Integer targetsCount,
            Integer targetsOverridingCount,
            Integer targetsConformingCount,
            Integer targetsOverridingPaidUsageCount,
            Integer targetsOverridingOnlineMonthsCount,
            Integer targetsOverridingOfflineMonthsCount,
            java.util.List<TargetOverrideSummary> items) {
        super();
        this.targetsCount = targetsCount;
        this.targetsOverridingCount = targetsOverridingCount;
        this.targetsConformingCount = targetsConformingCount;
        this.targetsOverridingPaidUsageCount = targetsOverridingPaidUsageCount;
        this.targetsOverridingOnlineMonthsCount = targetsOverridingOnlineMonthsCount;
        this.targetsOverridingOfflineMonthsCount = targetsOverridingOfflineMonthsCount;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of target databases within the target database group. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        /**
         * Number of target databases within the target database group.
         *
         * @param targetsCount the value to set
         * @return this builder
         */
        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = targetsCount;
            this.__explicitlySet__.add("targetsCount");
            return this;
        }
        /**
         * Number of target databases within the target database group that override the audit
         * profile of the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingCount")
        private Integer targetsOverridingCount;

        /**
         * Number of target databases within the target database group that override the audit
         * profile of the target database group.
         *
         * @param targetsOverridingCount the value to set
         * @return this builder
         */
        public Builder targetsOverridingCount(Integer targetsOverridingCount) {
            this.targetsOverridingCount = targetsOverridingCount;
            this.__explicitlySet__.add("targetsOverridingCount");
            return this;
        }
        /**
         * Number of target databases within the target database group that conform with the audit
         * profile of the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsConformingCount")
        private Integer targetsConformingCount;

        /**
         * Number of target databases within the target database group that conform with the audit
         * profile of the target database group.
         *
         * @param targetsConformingCount the value to set
         * @return this builder
         */
        public Builder targetsConformingCount(Integer targetsConformingCount) {
            this.targetsConformingCount = targetsConformingCount;
            this.__explicitlySet__.add("targetsConformingCount");
            return this;
        }
        /**
         * Number of target databases within the group that override the paid usage setting of the
         * audit profile for the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingPaidUsageCount")
        private Integer targetsOverridingPaidUsageCount;

        /**
         * Number of target databases within the group that override the paid usage setting of the
         * audit profile for the target database group.
         *
         * @param targetsOverridingPaidUsageCount the value to set
         * @return this builder
         */
        public Builder targetsOverridingPaidUsageCount(Integer targetsOverridingPaidUsageCount) {
            this.targetsOverridingPaidUsageCount = targetsOverridingPaidUsageCount;
            this.__explicitlySet__.add("targetsOverridingPaidUsageCount");
            return this;
        }
        /**
         * Number of target databases within the group that override the online retention setting of
         * the audit profile for the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingOnlineMonthsCount")
        private Integer targetsOverridingOnlineMonthsCount;

        /**
         * Number of target databases within the group that override the online retention setting of
         * the audit profile for the target database group.
         *
         * @param targetsOverridingOnlineMonthsCount the value to set
         * @return this builder
         */
        public Builder targetsOverridingOnlineMonthsCount(
                Integer targetsOverridingOnlineMonthsCount) {
            this.targetsOverridingOnlineMonthsCount = targetsOverridingOnlineMonthsCount;
            this.__explicitlySet__.add("targetsOverridingOnlineMonthsCount");
            return this;
        }
        /**
         * Number of target databases within the group that override the offline retention setting
         * of the audit profile for the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingOfflineMonthsCount")
        private Integer targetsOverridingOfflineMonthsCount;

        /**
         * Number of target databases within the group that override the offline retention setting
         * of the audit profile for the target database group.
         *
         * @param targetsOverridingOfflineMonthsCount the value to set
         * @return this builder
         */
        public Builder targetsOverridingOfflineMonthsCount(
                Integer targetsOverridingOfflineMonthsCount) {
            this.targetsOverridingOfflineMonthsCount = targetsOverridingOfflineMonthsCount;
            this.__explicitlySet__.add("targetsOverridingOfflineMonthsCount");
            return this;
        }
        /** Array of target database override summary. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<TargetOverrideSummary> items;

        /**
         * Array of target database override summary.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<TargetOverrideSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetOverrideCollection build() {
            TargetOverrideCollection model =
                    new TargetOverrideCollection(
                            this.targetsCount,
                            this.targetsOverridingCount,
                            this.targetsConformingCount,
                            this.targetsOverridingPaidUsageCount,
                            this.targetsOverridingOnlineMonthsCount,
                            this.targetsOverridingOfflineMonthsCount,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetOverrideCollection model) {
            if (model.wasPropertyExplicitlySet("targetsCount")) {
                this.targetsCount(model.getTargetsCount());
            }
            if (model.wasPropertyExplicitlySet("targetsOverridingCount")) {
                this.targetsOverridingCount(model.getTargetsOverridingCount());
            }
            if (model.wasPropertyExplicitlySet("targetsConformingCount")) {
                this.targetsConformingCount(model.getTargetsConformingCount());
            }
            if (model.wasPropertyExplicitlySet("targetsOverridingPaidUsageCount")) {
                this.targetsOverridingPaidUsageCount(model.getTargetsOverridingPaidUsageCount());
            }
            if (model.wasPropertyExplicitlySet("targetsOverridingOnlineMonthsCount")) {
                this.targetsOverridingOnlineMonthsCount(
                        model.getTargetsOverridingOnlineMonthsCount());
            }
            if (model.wasPropertyExplicitlySet("targetsOverridingOfflineMonthsCount")) {
                this.targetsOverridingOfflineMonthsCount(
                        model.getTargetsOverridingOfflineMonthsCount());
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

    /** Number of target databases within the target database group. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    private final Integer targetsCount;

    /**
     * Number of target databases within the target database group.
     *
     * @return the value
     */
    public Integer getTargetsCount() {
        return targetsCount;
    }

    /**
     * Number of target databases within the target database group that override the audit profile
     * of the target database group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingCount")
    private final Integer targetsOverridingCount;

    /**
     * Number of target databases within the target database group that override the audit profile
     * of the target database group.
     *
     * @return the value
     */
    public Integer getTargetsOverridingCount() {
        return targetsOverridingCount;
    }

    /**
     * Number of target databases within the target database group that conform with the audit
     * profile of the target database group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsConformingCount")
    private final Integer targetsConformingCount;

    /**
     * Number of target databases within the target database group that conform with the audit
     * profile of the target database group.
     *
     * @return the value
     */
    public Integer getTargetsConformingCount() {
        return targetsConformingCount;
    }

    /**
     * Number of target databases within the group that override the paid usage setting of the audit
     * profile for the target database group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingPaidUsageCount")
    private final Integer targetsOverridingPaidUsageCount;

    /**
     * Number of target databases within the group that override the paid usage setting of the audit
     * profile for the target database group.
     *
     * @return the value
     */
    public Integer getTargetsOverridingPaidUsageCount() {
        return targetsOverridingPaidUsageCount;
    }

    /**
     * Number of target databases within the group that override the online retention setting of the
     * audit profile for the target database group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingOnlineMonthsCount")
    private final Integer targetsOverridingOnlineMonthsCount;

    /**
     * Number of target databases within the group that override the online retention setting of the
     * audit profile for the target database group.
     *
     * @return the value
     */
    public Integer getTargetsOverridingOnlineMonthsCount() {
        return targetsOverridingOnlineMonthsCount;
    }

    /**
     * Number of target databases within the group that override the offline retention setting of
     * the audit profile for the target database group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetsOverridingOfflineMonthsCount")
    private final Integer targetsOverridingOfflineMonthsCount;

    /**
     * Number of target databases within the group that override the offline retention setting of
     * the audit profile for the target database group.
     *
     * @return the value
     */
    public Integer getTargetsOverridingOfflineMonthsCount() {
        return targetsOverridingOfflineMonthsCount;
    }

    /** Array of target database override summary. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<TargetOverrideSummary> items;

    /**
     * Array of target database override summary.
     *
     * @return the value
     */
    public java.util.List<TargetOverrideSummary> getItems() {
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
        sb.append("TargetOverrideCollection(");
        sb.append("super=").append(super.toString());
        sb.append("targetsCount=").append(String.valueOf(this.targetsCount));
        sb.append(", targetsOverridingCount=").append(String.valueOf(this.targetsOverridingCount));
        sb.append(", targetsConformingCount=").append(String.valueOf(this.targetsConformingCount));
        sb.append(", targetsOverridingPaidUsageCount=")
                .append(String.valueOf(this.targetsOverridingPaidUsageCount));
        sb.append(", targetsOverridingOnlineMonthsCount=")
                .append(String.valueOf(this.targetsOverridingOnlineMonthsCount));
        sb.append(", targetsOverridingOfflineMonthsCount=")
                .append(String.valueOf(this.targetsOverridingOfflineMonthsCount));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetOverrideCollection)) {
            return false;
        }

        TargetOverrideCollection other = (TargetOverrideCollection) o;
        return java.util.Objects.equals(this.targetsCount, other.targetsCount)
                && java.util.Objects.equals(
                        this.targetsOverridingCount, other.targetsOverridingCount)
                && java.util.Objects.equals(
                        this.targetsConformingCount, other.targetsConformingCount)
                && java.util.Objects.equals(
                        this.targetsOverridingPaidUsageCount, other.targetsOverridingPaidUsageCount)
                && java.util.Objects.equals(
                        this.targetsOverridingOnlineMonthsCount,
                        other.targetsOverridingOnlineMonthsCount)
                && java.util.Objects.equals(
                        this.targetsOverridingOfflineMonthsCount,
                        other.targetsOverridingOfflineMonthsCount)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetsCount == null ? 43 : this.targetsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsOverridingCount == null
                                ? 43
                                : this.targetsOverridingCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsConformingCount == null
                                ? 43
                                : this.targetsConformingCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsOverridingPaidUsageCount == null
                                ? 43
                                : this.targetsOverridingPaidUsageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsOverridingOnlineMonthsCount == null
                                ? 43
                                : this.targetsOverridingOnlineMonthsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsOverridingOfflineMonthsCount == null
                                ? 43
                                : this.targetsOverridingOfflineMonthsCount.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
