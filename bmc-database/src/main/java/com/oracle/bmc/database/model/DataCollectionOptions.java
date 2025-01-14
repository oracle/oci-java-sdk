/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Indicates user preferences for the various diagnostic collection options for the VM cluster/Cloud
 * VM cluster/VMBM DBCS. <br>
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
        builder = DataCollectionOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataCollectionOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isDiagnosticsEventsEnabled",
        "isHealthMonitoringEnabled",
        "isIncidentLogsEnabled"
    })
    public DataCollectionOptions(
            Boolean isDiagnosticsEventsEnabled,
            Boolean isHealthMonitoringEnabled,
            Boolean isIncidentLogsEnabled) {
        super();
        this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
        this.isHealthMonitoringEnabled = isHealthMonitoringEnabled;
        this.isIncidentLogsEnabled = isIncidentLogsEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM
         * cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service
         * notifications for guest VM issues. Diagnostic collection also allows Oracle to provide
         * enhanced service and proactive support for your Exadata system. You can enable diagnostic
         * collection during VM cluster/Cloud VM cluster provisioning. You can also disable or
         * enable it at any time using the {@code UpdateVmCluster} or {@code updateCloudVmCluster}
         * API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDiagnosticsEventsEnabled")
        private Boolean isDiagnosticsEventsEnabled;

        /**
         * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM
         * cluster/VMBM DBCS. Enabling diagnostic collection allows you to receive Events service
         * notifications for guest VM issues. Diagnostic collection also allows Oracle to provide
         * enhanced service and proactive support for your Exadata system. You can enable diagnostic
         * collection during VM cluster/Cloud VM cluster provisioning. You can also disable or
         * enable it at any time using the {@code UpdateVmCluster} or {@code updateCloudVmCluster}
         * API.
         *
         * @param isDiagnosticsEventsEnabled the value to set
         * @return this builder
         */
        public Builder isDiagnosticsEventsEnabled(Boolean isDiagnosticsEventsEnabled) {
            this.isDiagnosticsEventsEnabled = isDiagnosticsEventsEnabled;
            this.__explicitlySet__.add("isDiagnosticsEventsEnabled");
            return this;
        }
        /**
         * Indicates whether health monitoring is enabled for the VM cluster / Cloud VM cluster /
         * VMBM DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share
         * it with its operations and support personnel. You may also receive notifications for some
         * events. Collecting health diagnostics enables Oracle to provide proactive support and
         * enhanced service for your system. Optionally enable health monitoring while provisioning
         * a system. You can also disable or enable health monitoring anytime using the {@code
         * UpdateVmCluster}, {@code UpdateCloudVmCluster} or {@code updateDbsystem} API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHealthMonitoringEnabled")
        private Boolean isHealthMonitoringEnabled;

        /**
         * Indicates whether health monitoring is enabled for the VM cluster / Cloud VM cluster /
         * VMBM DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share
         * it with its operations and support personnel. You may also receive notifications for some
         * events. Collecting health diagnostics enables Oracle to provide proactive support and
         * enhanced service for your system. Optionally enable health monitoring while provisioning
         * a system. You can also disable or enable health monitoring anytime using the {@code
         * UpdateVmCluster}, {@code UpdateCloudVmCluster} or {@code updateDbsystem} API.
         *
         * @param isHealthMonitoringEnabled the value to set
         * @return this builder
         */
        public Builder isHealthMonitoringEnabled(Boolean isHealthMonitoringEnabled) {
            this.isHealthMonitoringEnabled = isHealthMonitoringEnabled;
            this.__explicitlySet__.add("isHealthMonitoringEnabled");
            return this;
        }
        /**
         * Indicates whether incident logs and trace collection are enabled for the VM cluster /
         * Cloud VM cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive
         * Events service notifications for guest VM issues, collect incident logs and traces, and
         * use them to diagnose issues and resolve them. Optionally enable incident logs collection
         * while provisioning a system. You can also disable or enable incident logs collection
         * anytime using the {@code UpdateVmCluster}, {@code updateCloudVmCluster} or {@code
         * updateDbsystem} API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncidentLogsEnabled")
        private Boolean isIncidentLogsEnabled;

        /**
         * Indicates whether incident logs and trace collection are enabled for the VM cluster /
         * Cloud VM cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive
         * Events service notifications for guest VM issues, collect incident logs and traces, and
         * use them to diagnose issues and resolve them. Optionally enable incident logs collection
         * while provisioning a system. You can also disable or enable incident logs collection
         * anytime using the {@code UpdateVmCluster}, {@code updateCloudVmCluster} or {@code
         * updateDbsystem} API.
         *
         * @param isIncidentLogsEnabled the value to set
         * @return this builder
         */
        public Builder isIncidentLogsEnabled(Boolean isIncidentLogsEnabled) {
            this.isIncidentLogsEnabled = isIncidentLogsEnabled;
            this.__explicitlySet__.add("isIncidentLogsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataCollectionOptions build() {
            DataCollectionOptions model =
                    new DataCollectionOptions(
                            this.isDiagnosticsEventsEnabled,
                            this.isHealthMonitoringEnabled,
                            this.isIncidentLogsEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataCollectionOptions model) {
            if (model.wasPropertyExplicitlySet("isDiagnosticsEventsEnabled")) {
                this.isDiagnosticsEventsEnabled(model.getIsDiagnosticsEventsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isHealthMonitoringEnabled")) {
                this.isHealthMonitoringEnabled(model.getIsHealthMonitoringEnabled());
            }
            if (model.wasPropertyExplicitlySet("isIncidentLogsEnabled")) {
                this.isIncidentLogsEnabled(model.getIsIncidentLogsEnabled());
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

    /**
     * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM
     * DBCS. Enabling diagnostic collection allows you to receive Events service notifications for
     * guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and
     * proactive support for your Exadata system. You can enable diagnostic collection during VM
     * cluster/Cloud VM cluster provisioning. You can also disable or enable it at any time using
     * the {@code UpdateVmCluster} or {@code updateCloudVmCluster} API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDiagnosticsEventsEnabled")
    private final Boolean isDiagnosticsEventsEnabled;

    /**
     * Indicates whether diagnostic collection is enabled for the VM cluster/Cloud VM cluster/VMBM
     * DBCS. Enabling diagnostic collection allows you to receive Events service notifications for
     * guest VM issues. Diagnostic collection also allows Oracle to provide enhanced service and
     * proactive support for your Exadata system. You can enable diagnostic collection during VM
     * cluster/Cloud VM cluster provisioning. You can also disable or enable it at any time using
     * the {@code UpdateVmCluster} or {@code updateCloudVmCluster} API.
     *
     * @return the value
     */
    public Boolean getIsDiagnosticsEventsEnabled() {
        return isDiagnosticsEventsEnabled;
    }

    /**
     * Indicates whether health monitoring is enabled for the VM cluster / Cloud VM cluster / VMBM
     * DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share it with
     * its operations and support personnel. You may also receive notifications for some events.
     * Collecting health diagnostics enables Oracle to provide proactive support and enhanced
     * service for your system. Optionally enable health monitoring while provisioning a system. You
     * can also disable or enable health monitoring anytime using the {@code UpdateVmCluster},
     * {@code UpdateCloudVmCluster} or {@code updateDbsystem} API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHealthMonitoringEnabled")
    private final Boolean isHealthMonitoringEnabled;

    /**
     * Indicates whether health monitoring is enabled for the VM cluster / Cloud VM cluster / VMBM
     * DBCS. Enabling health monitoring allows Oracle to collect diagnostic data and share it with
     * its operations and support personnel. You may also receive notifications for some events.
     * Collecting health diagnostics enables Oracle to provide proactive support and enhanced
     * service for your system. Optionally enable health monitoring while provisioning a system. You
     * can also disable or enable health monitoring anytime using the {@code UpdateVmCluster},
     * {@code UpdateCloudVmCluster} or {@code updateDbsystem} API.
     *
     * @return the value
     */
    public Boolean getIsHealthMonitoringEnabled() {
        return isHealthMonitoringEnabled;
    }

    /**
     * Indicates whether incident logs and trace collection are enabled for the VM cluster / Cloud
     * VM cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive Events
     * service notifications for guest VM issues, collect incident logs and traces, and use them to
     * diagnose issues and resolve them. Optionally enable incident logs collection while
     * provisioning a system. You can also disable or enable incident logs collection anytime using
     * the {@code UpdateVmCluster}, {@code updateCloudVmCluster} or {@code updateDbsystem} API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncidentLogsEnabled")
    private final Boolean isIncidentLogsEnabled;

    /**
     * Indicates whether incident logs and trace collection are enabled for the VM cluster / Cloud
     * VM cluster / VMBM DBCS. Enabling incident logs collection allows Oracle to receive Events
     * service notifications for guest VM issues, collect incident logs and traces, and use them to
     * diagnose issues and resolve them. Optionally enable incident logs collection while
     * provisioning a system. You can also disable or enable incident logs collection anytime using
     * the {@code UpdateVmCluster}, {@code updateCloudVmCluster} or {@code updateDbsystem} API.
     *
     * @return the value
     */
    public Boolean getIsIncidentLogsEnabled() {
        return isIncidentLogsEnabled;
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
        sb.append("DataCollectionOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isDiagnosticsEventsEnabled=")
                .append(String.valueOf(this.isDiagnosticsEventsEnabled));
        sb.append(", isHealthMonitoringEnabled=")
                .append(String.valueOf(this.isHealthMonitoringEnabled));
        sb.append(", isIncidentLogsEnabled=").append(String.valueOf(this.isIncidentLogsEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataCollectionOptions)) {
            return false;
        }

        DataCollectionOptions other = (DataCollectionOptions) o;
        return java.util.Objects.equals(
                        this.isDiagnosticsEventsEnabled, other.isDiagnosticsEventsEnabled)
                && java.util.Objects.equals(
                        this.isHealthMonitoringEnabled, other.isHealthMonitoringEnabled)
                && java.util.Objects.equals(this.isIncidentLogsEnabled, other.isIncidentLogsEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDiagnosticsEventsEnabled == null
                                ? 43
                                : this.isDiagnosticsEventsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isHealthMonitoringEnabled == null
                                ? 43
                                : this.isHealthMonitoringEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncidentLogsEnabled == null
                                ? 43
                                : this.isIncidentLogsEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
