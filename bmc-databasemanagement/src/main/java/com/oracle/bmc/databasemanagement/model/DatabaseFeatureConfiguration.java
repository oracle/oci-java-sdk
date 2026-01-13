/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external database feature configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "feature",
        defaultImpl = DatabaseFeatureConfiguration.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseDiagnosticsAndManagementFeatureConfiguration.class,
            name = "DIAGNOSTICS_AND_MANAGEMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseLifecycleFeatureConfiguration.class,
            name = "DB_LIFECYCLE_MANAGEMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseSqlWatchFeatureConfiguration.class,
            name = "SQLWATCH")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DatabaseFeatureConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "featureStatus",
        "connectorDetails",
        "databaseConnectionDetails"
    })
    protected DatabaseFeatureConfiguration(
            FeatureStatus featureStatus,
            ConnectorDetails connectorDetails,
            DatabaseConnectionDetails databaseConnectionDetails) {
        super();
        this.featureStatus = featureStatus;
        this.connectorDetails = connectorDetails;
        this.databaseConnectionDetails = databaseConnectionDetails;
    }

    /** The list of statuses for Database Management features. */
    public enum FeatureStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        NotEnabled("NOT_ENABLED"),
        Unsupported("UNSUPPORTED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),
        Failed("FAILED"),
        EnabledWithWarnings("ENABLED_WITH_WARNINGS"),
        PendingDisable("PENDING_DISABLE"),
        Enabling("ENABLING"),
        Disabling("DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FeatureStatus.class);

        private final String value;
        private static java.util.Map<String, FeatureStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (FeatureStatus v : FeatureStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FeatureStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FeatureStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FeatureStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The list of statuses for Database Management features. */
    @com.fasterxml.jackson.annotation.JsonProperty("featureStatus")
    private final FeatureStatus featureStatus;

    /**
     * The list of statuses for Database Management features.
     *
     * @return the value
     */
    public FeatureStatus getFeatureStatus() {
        return featureStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectorDetails")
    private final ConnectorDetails connectorDetails;

    public ConnectorDetails getConnectorDetails() {
        return connectorDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionDetails")
    private final DatabaseConnectionDetails databaseConnectionDetails;

    public DatabaseConnectionDetails getDatabaseConnectionDetails() {
        return databaseConnectionDetails;
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
        sb.append("DatabaseFeatureConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("featureStatus=").append(String.valueOf(this.featureStatus));
        sb.append(", connectorDetails=").append(String.valueOf(this.connectorDetails));
        sb.append(", databaseConnectionDetails=")
                .append(String.valueOf(this.databaseConnectionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseFeatureConfiguration)) {
            return false;
        }

        DatabaseFeatureConfiguration other = (DatabaseFeatureConfiguration) o;
        return java.util.Objects.equals(this.featureStatus, other.featureStatus)
                && java.util.Objects.equals(this.connectorDetails, other.connectorDetails)
                && java.util.Objects.equals(
                        this.databaseConnectionDetails, other.databaseConnectionDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.featureStatus == null ? 43 : this.featureStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorDetails == null ? 43 : this.connectorDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseConnectionDetails == null
                                ? 43
                                : this.databaseConnectionDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
