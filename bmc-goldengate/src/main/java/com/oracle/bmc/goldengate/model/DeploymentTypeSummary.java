/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The meta-data specific on particular deployment type represented by deploymentType field. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeploymentTypeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DeploymentTypeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "category",
        "displayName",
        "deploymentType",
        "connectionTypes",
        "sourceTechnologies",
        "targetTechnologies",
        "oggVersion"
    })
    public DeploymentTypeSummary(
            Category category,
            String displayName,
            DeploymentType deploymentType,
            java.util.List<ConnectionType> connectionTypes,
            java.util.List<String> sourceTechnologies,
            java.util.List<String> targetTechnologies,
            String oggVersion) {
        super();
        this.category = category;
        this.displayName = displayName;
        this.deploymentType = deploymentType;
        this.connectionTypes = connectionTypes;
        this.sourceTechnologies = sourceTechnologies;
        this.targetTechnologies = targetTechnologies;
        this.oggVersion = oggVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The deployment category defines the broad separation of the deployment type into
         * categories. Currently the separation is 'DATA_REPLICATION' and 'STREAM_ANALYTICS'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * The deployment category defines the broad separation of the deployment type into
         * categories. Currently the separation is 'DATA_REPLICATION' and 'STREAM_ANALYTICS'.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The type of deployment, the value determines the exact 'type' of service executed in the
         * Deployment. NOTE: Use of the value 'OGG' is maintained for backward compatibility
         * purposes. Its use is discouraged in favor of the equivalent 'DATABASE_ORACLE' value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The type of deployment, the value determines the exact 'type' of service executed in the
         * Deployment. NOTE: Use of the value 'OGG' is maintained for backward compatibility
         * purposes. Its use is discouraged in favor of the equivalent 'DATABASE_ORACLE' value.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /** An array of connectionTypes. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionTypes")
        private java.util.List<ConnectionType> connectionTypes;

        /**
         * An array of connectionTypes.
         *
         * @param connectionTypes the value to set
         * @return this builder
         */
        public Builder connectionTypes(java.util.List<ConnectionType> connectionTypes) {
            this.connectionTypes = connectionTypes;
            this.__explicitlySet__.add("connectionTypes");
            return this;
        }
        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTechnologies")
        private java.util.List<String> sourceTechnologies;

        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         *
         * @param sourceTechnologies the value to set
         * @return this builder
         */
        public Builder sourceTechnologies(java.util.List<String> sourceTechnologies) {
            this.sourceTechnologies = sourceTechnologies;
            this.__explicitlySet__.add("sourceTechnologies");
            return this;
        }
        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetTechnologies")
        private java.util.List<String> targetTechnologies;

        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         *
         * @param targetTechnologies the value to set
         * @return this builder
         */
        public Builder targetTechnologies(java.util.List<String> targetTechnologies) {
            this.targetTechnologies = targetTechnologies;
            this.__explicitlySet__.add("targetTechnologies");
            return this;
        }
        /** Version of OGG */
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         */
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentTypeSummary build() {
            DeploymentTypeSummary model =
                    new DeploymentTypeSummary(
                            this.category,
                            this.displayName,
                            this.deploymentType,
                            this.connectionTypes,
                            this.sourceTechnologies,
                            this.targetTechnologies,
                            this.oggVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentTypeSummary model) {
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("connectionTypes")) {
                this.connectionTypes(model.getConnectionTypes());
            }
            if (model.wasPropertyExplicitlySet("sourceTechnologies")) {
                this.sourceTechnologies(model.getSourceTechnologies());
            }
            if (model.wasPropertyExplicitlySet("targetTechnologies")) {
                this.targetTechnologies(model.getTargetTechnologies());
            }
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
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
     * The deployment category defines the broad separation of the deployment type into categories.
     * Currently the separation is 'DATA_REPLICATION' and 'STREAM_ANALYTICS'.
     */
    public enum Category implements com.oracle.bmc.http.internal.BmcEnum {
        DataReplication("DATA_REPLICATION"),
        StreamAnalytics("STREAM_ANALYTICS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The deployment category defines the broad separation of the deployment type into categories.
     * Currently the separation is 'DATA_REPLICATION' and 'STREAM_ANALYTICS'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * The deployment category defines the broad separation of the deployment type into categories.
     * Currently the separation is 'DATA_REPLICATION' and 'STREAM_ANALYTICS'.
     *
     * @return the value
     */
    public Category getCategory() {
        return category;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of deployment, the value determines the exact 'type' of service executed in the
     * Deployment. NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.
     * Its use is discouraged in favor of the equivalent 'DATABASE_ORACLE' value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The type of deployment, the value determines the exact 'type' of service executed in the
     * Deployment. NOTE: Use of the value 'OGG' is maintained for backward compatibility purposes.
     * Its use is discouraged in favor of the equivalent 'DATABASE_ORACLE' value.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /** An array of connectionTypes. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionTypes")
    private final java.util.List<ConnectionType> connectionTypes;

    /**
     * An array of connectionTypes.
     *
     * @return the value
     */
    public java.util.List<ConnectionType> getConnectionTypes() {
        return connectionTypes;
    }

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTechnologies")
    private final java.util.List<String> sourceTechnologies;

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     *
     * @return the value
     */
    public java.util.List<String> getSourceTechnologies() {
        return sourceTechnologies;
    }

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetTechnologies")
    private final java.util.List<String> targetTechnologies;

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     *
     * @return the value
     */
    public java.util.List<String> getTargetTechnologies() {
        return targetTechnologies;
    }

    /** Version of OGG */
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     */
    public String getOggVersion() {
        return oggVersion;
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
        sb.append("DeploymentTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", connectionTypes=").append(String.valueOf(this.connectionTypes));
        sb.append(", sourceTechnologies=").append(String.valueOf(this.sourceTechnologies));
        sb.append(", targetTechnologies=").append(String.valueOf(this.targetTechnologies));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentTypeSummary)) {
            return false;
        }

        DeploymentTypeSummary other = (DeploymentTypeSummary) o;
        return java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.connectionTypes, other.connectionTypes)
                && java.util.Objects.equals(this.sourceTechnologies, other.sourceTechnologies)
                && java.util.Objects.equals(this.targetTechnologies, other.targetTechnologies)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionTypes == null ? 43 : this.connectionTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTechnologies == null
                                ? 43
                                : this.sourceTechnologies.hashCode());
        result =
                (result * PRIME)
                        + (this.targetTechnologies == null
                                ? 43
                                : this.targetTechnologies.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
