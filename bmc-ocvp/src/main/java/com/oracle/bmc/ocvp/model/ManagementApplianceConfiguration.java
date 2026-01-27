/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Configuration of management appliance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementApplianceConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementApplianceConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isMetricsCollectionEnabled",
        "isLogIngestionEnabled",
        "supportBundleBucketId",
        "metrics"
    })
    public ManagementApplianceConfiguration(
            Boolean isMetricsCollectionEnabled,
            Boolean isLogIngestionEnabled,
            String supportBundleBucketId,
            java.util.List<String> metrics) {
        super();
        this.isMetricsCollectionEnabled = isMetricsCollectionEnabled;
        this.isLogIngestionEnabled = isLogIngestionEnabled;
        this.supportBundleBucketId = supportBundleBucketId;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Is metrics collection and publishing is enabled for appliance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricsCollectionEnabled")
        private Boolean isMetricsCollectionEnabled;

        /**
         * Is metrics collection and publishing is enabled for appliance.
         *
         * @param isMetricsCollectionEnabled the value to set
         * @return this builder
         */
        public Builder isMetricsCollectionEnabled(Boolean isMetricsCollectionEnabled) {
            this.isMetricsCollectionEnabled = isMetricsCollectionEnabled;
            this.__explicitlySet__.add("isMetricsCollectionEnabled");
            return this;
        }
        /** Is log ingestion from SDDC to OCI enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLogIngestionEnabled")
        private Boolean isLogIngestionEnabled;

        /**
         * Is log ingestion from SDDC to OCI enabled.
         *
         * @param isLogIngestionEnabled the value to set
         * @return this builder
         */
        public Builder isLogIngestionEnabled(Boolean isLogIngestionEnabled) {
            this.isLogIngestionEnabled = isLogIngestionEnabled;
            this.__explicitlySet__.add("isLogIngestionEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * support bundle Object Storage bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportBundleBucketId")
        private String supportBundleBucketId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * support bundle Object Storage bucket.
         *
         * @param supportBundleBucketId the value to set
         * @return this builder
         */
        public Builder supportBundleBucketId(String supportBundleBucketId) {
            this.supportBundleBucketId = supportBundleBucketId;
            this.__explicitlySet__.add("supportBundleBucketId");
            return this;
        }
        /** Array of metrics ids to collect. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<String> metrics;

        /**
         * Array of metrics ids to collect.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<String> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementApplianceConfiguration build() {
            ManagementApplianceConfiguration model =
                    new ManagementApplianceConfiguration(
                            this.isMetricsCollectionEnabled,
                            this.isLogIngestionEnabled,
                            this.supportBundleBucketId,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementApplianceConfiguration model) {
            if (model.wasPropertyExplicitlySet("isMetricsCollectionEnabled")) {
                this.isMetricsCollectionEnabled(model.getIsMetricsCollectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isLogIngestionEnabled")) {
                this.isLogIngestionEnabled(model.getIsLogIngestionEnabled());
            }
            if (model.wasPropertyExplicitlySet("supportBundleBucketId")) {
                this.supportBundleBucketId(model.getSupportBundleBucketId());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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

    /** Is metrics collection and publishing is enabled for appliance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricsCollectionEnabled")
    private final Boolean isMetricsCollectionEnabled;

    /**
     * Is metrics collection and publishing is enabled for appliance.
     *
     * @return the value
     */
    public Boolean getIsMetricsCollectionEnabled() {
        return isMetricsCollectionEnabled;
    }

    /** Is log ingestion from SDDC to OCI enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLogIngestionEnabled")
    private final Boolean isLogIngestionEnabled;

    /**
     * Is log ingestion from SDDC to OCI enabled.
     *
     * @return the value
     */
    public Boolean getIsLogIngestionEnabled() {
        return isLogIngestionEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of support
     * bundle Object Storage bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportBundleBucketId")
    private final String supportBundleBucketId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of support
     * bundle Object Storage bucket.
     *
     * @return the value
     */
    public String getSupportBundleBucketId() {
        return supportBundleBucketId;
    }

    /** Array of metrics ids to collect. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<String> metrics;

    /**
     * Array of metrics ids to collect.
     *
     * @return the value
     */
    public java.util.List<String> getMetrics() {
        return metrics;
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
        sb.append("ManagementApplianceConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isMetricsCollectionEnabled=")
                .append(String.valueOf(this.isMetricsCollectionEnabled));
        sb.append(", isLogIngestionEnabled=").append(String.valueOf(this.isLogIngestionEnabled));
        sb.append(", supportBundleBucketId=").append(String.valueOf(this.supportBundleBucketId));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementApplianceConfiguration)) {
            return false;
        }

        ManagementApplianceConfiguration other = (ManagementApplianceConfiguration) o;
        return java.util.Objects.equals(
                        this.isMetricsCollectionEnabled, other.isMetricsCollectionEnabled)
                && java.util.Objects.equals(this.isLogIngestionEnabled, other.isLogIngestionEnabled)
                && java.util.Objects.equals(this.supportBundleBucketId, other.supportBundleBucketId)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isMetricsCollectionEnabled == null
                                ? 43
                                : this.isMetricsCollectionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLogIngestionEnabled == null
                                ? 43
                                : this.isLogIngestionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.supportBundleBucketId == null
                                ? 43
                                : this.supportBundleBucketId.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
