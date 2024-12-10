/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to enable the Diagnostics and Management feature.
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
    builder = DatabaseDiagnosticsAndManagementFeatureConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "feature"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseDiagnosticsAndManagementFeatureConfiguration
        extends DatabaseFeatureConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("featureStatus")
        private FeatureStatus featureStatus;

        public Builder featureStatus(FeatureStatus featureStatus) {
            this.featureStatus = featureStatus;
            this.__explicitlySet__.add("featureStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectorDetails")
        private ConnectorDetails connectorDetails;

        public Builder connectorDetails(ConnectorDetails connectorDetails) {
            this.connectorDetails = connectorDetails;
            this.__explicitlySet__.add("connectorDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionDetails")
        private DatabaseConnectionDetails databaseConnectionDetails;

        public Builder databaseConnectionDetails(
                DatabaseConnectionDetails databaseConnectionDetails) {
            this.databaseConnectionDetails = databaseConnectionDetails;
            this.__explicitlySet__.add("databaseConnectionDetails");
            return this;
        }
        /**
         * The Oracle license model that applies to the external database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the external database.
         *
         * @param licenseModel the value to set
         * @return this builder
         **/
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseDiagnosticsAndManagementFeatureConfiguration build() {
            DatabaseDiagnosticsAndManagementFeatureConfiguration model =
                    new DatabaseDiagnosticsAndManagementFeatureConfiguration(
                            this.featureStatus,
                            this.connectorDetails,
                            this.databaseConnectionDetails,
                            this.licenseModel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseDiagnosticsAndManagementFeatureConfiguration model) {
            if (model.wasPropertyExplicitlySet("featureStatus")) {
                this.featureStatus(model.getFeatureStatus());
            }
            if (model.wasPropertyExplicitlySet("connectorDetails")) {
                this.connectorDetails(model.getConnectorDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseConnectionDetails")) {
                this.databaseConnectionDetails(model.getDatabaseConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
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
    public DatabaseDiagnosticsAndManagementFeatureConfiguration(
            FeatureStatus featureStatus,
            ConnectorDetails connectorDetails,
            DatabaseConnectionDetails databaseConnectionDetails,
            LicenseModel licenseModel) {
        super(featureStatus, connectorDetails, databaseConnectionDetails);
        this.licenseModel = licenseModel;
    }

    /**
     * The Oracle license model that applies to the external database.
     *
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle license model that applies to the external database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the external database.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
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
        sb.append("DatabaseDiagnosticsAndManagementFeatureConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseDiagnosticsAndManagementFeatureConfiguration)) {
            return false;
        }

        DatabaseDiagnosticsAndManagementFeatureConfiguration other =
                (DatabaseDiagnosticsAndManagementFeatureConfiguration) o;
        return java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        return result;
    }
}
