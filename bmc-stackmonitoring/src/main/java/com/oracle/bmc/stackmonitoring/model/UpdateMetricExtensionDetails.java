/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about updating a metric extension resource <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMetricExtensionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMetricExtensionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "collectionRecurrences",
        "metricList",
        "queryProperties"
    })
    public UpdateMetricExtensionDetails(
            String displayName,
            String description,
            String collectionRecurrences,
            java.util.List<Metric> metricList,
            MetricExtensionUpdateQueryProperties queryProperties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.collectionRecurrences = collectionRecurrences;
        this.metricList = metricList;
        this.queryProperties = queryProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Metric Extension resource display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Metric Extension resource display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the metric extension. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the metric extension.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Schedule of metric extension should use RFC 5545 format -> recur-rule-part =
         * "FREQ";"INTERVAL" where FREQ rule part identifies the type of recurrence rule. Valid
         * values are "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval
         * of a minute, an hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionRecurrences")
        private String collectionRecurrences;

        /**
         * Schedule of metric extension should use RFC 5545 format -> recur-rule-part =
         * "FREQ";"INTERVAL" where FREQ rule part identifies the type of recurrence rule. Valid
         * values are "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval
         * of a minute, an hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
         *
         * @param collectionRecurrences the value to set
         * @return this builder
         */
        public Builder collectionRecurrences(String collectionRecurrences) {
            this.collectionRecurrences = collectionRecurrences;
            this.__explicitlySet__.add("collectionRecurrences");
            return this;
        }
        /** List of metrics which are part of this metric extension */
        @com.fasterxml.jackson.annotation.JsonProperty("metricList")
        private java.util.List<Metric> metricList;

        /**
         * List of metrics which are part of this metric extension
         *
         * @param metricList the value to set
         * @return this builder
         */
        public Builder metricList(java.util.List<Metric> metricList) {
            this.metricList = metricList;
            this.__explicitlySet__.add("metricList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryProperties")
        private MetricExtensionUpdateQueryProperties queryProperties;

        public Builder queryProperties(MetricExtensionUpdateQueryProperties queryProperties) {
            this.queryProperties = queryProperties;
            this.__explicitlySet__.add("queryProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMetricExtensionDetails build() {
            UpdateMetricExtensionDetails model =
                    new UpdateMetricExtensionDetails(
                            this.displayName,
                            this.description,
                            this.collectionRecurrences,
                            this.metricList,
                            this.queryProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMetricExtensionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("collectionRecurrences")) {
                this.collectionRecurrences(model.getCollectionRecurrences());
            }
            if (model.wasPropertyExplicitlySet("metricList")) {
                this.metricList(model.getMetricList());
            }
            if (model.wasPropertyExplicitlySet("queryProperties")) {
                this.queryProperties(model.getQueryProperties());
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

    /** Metric Extension resource display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Metric Extension resource display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the metric extension. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the metric extension.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Schedule of metric extension should use RFC 5545 format -> recur-rule-part =
     * "FREQ";"INTERVAL" where FREQ rule part identifies the type of recurrence rule. Valid values
     * are "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval of a minute,
     * an hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionRecurrences")
    private final String collectionRecurrences;

    /**
     * Schedule of metric extension should use RFC 5545 format -> recur-rule-part =
     * "FREQ";"INTERVAL" where FREQ rule part identifies the type of recurrence rule. Valid values
     * are "MINUTELY","HOURLY","DAILY" to specify repeating events based on an interval of a minute,
     * an hour and a day or more. Example- FREQ=DAILY;INTERVAL=1
     *
     * @return the value
     */
    public String getCollectionRecurrences() {
        return collectionRecurrences;
    }

    /** List of metrics which are part of this metric extension */
    @com.fasterxml.jackson.annotation.JsonProperty("metricList")
    private final java.util.List<Metric> metricList;

    /**
     * List of metrics which are part of this metric extension
     *
     * @return the value
     */
    public java.util.List<Metric> getMetricList() {
        return metricList;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryProperties")
    private final MetricExtensionUpdateQueryProperties queryProperties;

    public MetricExtensionUpdateQueryProperties getQueryProperties() {
        return queryProperties;
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
        sb.append("UpdateMetricExtensionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", collectionRecurrences=").append(String.valueOf(this.collectionRecurrences));
        sb.append(", metricList=").append(String.valueOf(this.metricList));
        sb.append(", queryProperties=").append(String.valueOf(this.queryProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMetricExtensionDetails)) {
            return false;
        }

        UpdateMetricExtensionDetails other = (UpdateMetricExtensionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.collectionRecurrences, other.collectionRecurrences)
                && java.util.Objects.equals(this.metricList, other.metricList)
                && java.util.Objects.equals(this.queryProperties, other.queryProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionRecurrences == null
                                ? 43
                                : this.collectionRecurrences.hashCode());
        result = (result * PRIME) + (this.metricList == null ? 43 : this.metricList.hashCode());
        result =
                (result * PRIME)
                        + (this.queryProperties == null ? 43 : this.queryProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
