/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary information about an inventory target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InventoryRecordSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InventoryRecordSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "targetName",
        "version",
        "targetResourceId",
        "targetResourceName",
        "compartmentId",
        "targetProductId",
        "targetProductName",
        "osType",
        "architecture",
        "properties",
        "components",
        "installedPatches",
        "timeCreated",
        "timeUpdated",
        "lifecycleState"
    })
    public InventoryRecordSummary(
            String targetId,
            String targetName,
            String version,
            String targetResourceId,
            String targetResourceName,
            String compartmentId,
            String targetProductId,
            String targetProductName,
            String osType,
            String architecture,
            java.util.List<InventoryRecordProperty> properties,
            java.util.List<InventoryRecordComponent> components,
            java.util.List<InventoryRecordPatchDetails> installedPatches,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            InventoryRecord.LifecycleState lifecycleState) {
        super();
        this.targetId = targetId;
        this.targetName = targetName;
        this.version = version;
        this.targetResourceId = targetResourceId;
        this.targetResourceName = targetResourceName;
        this.compartmentId = compartmentId;
        this.targetProductId = targetProductId;
        this.targetProductName = targetProductName;
        this.osType = osType;
        this.architecture = architecture;
        this.properties = properties;
        this.components = components;
        this.installedPatches = installedPatches;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Inventory target. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the Inventory target.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Name of the target */
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        /**
         * Name of the target
         *
         * @param targetName the value to set
         * @return this builder
         */
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /** Version of the product on the target */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of the product on the target
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** OCID of the resource associated with the target */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * OCID of the resource associated with the target
         *
         * @param targetResourceId the value to set
         * @return this builder
         */
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /** Name of the resource associated with the target */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceName")
        private String targetResourceName;

        /**
         * Name of the resource associated with the target
         *
         * @param targetResourceName the value to set
         * @return this builder
         */
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = targetResourceName;
            this.__explicitlySet__.add("targetResourceName");
            return this;
        }
        /** OCID of the compartment to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of the product installed at the target path */
        @com.fasterxml.jackson.annotation.JsonProperty("targetProductId")
        private String targetProductId;

        /**
         * OCID of the product installed at the target path
         *
         * @param targetProductId the value to set
         * @return this builder
         */
        public Builder targetProductId(String targetProductId) {
            this.targetProductId = targetProductId;
            this.__explicitlySet__.add("targetProductId");
            return this;
        }
        /** Name of the product installed at the target path */
        @com.fasterxml.jackson.annotation.JsonProperty("targetProductName")
        private String targetProductName;

        /**
         * Name of the product installed at the target path
         *
         * @param targetProductName the value to set
         * @return this builder
         */
        public Builder targetProductName(String targetProductName) {
            this.targetProductName = targetProductName;
            this.__explicitlySet__.add("targetProductName");
            return this;
        }
        /** OS installed on the resource associated with the target */
        @com.fasterxml.jackson.annotation.JsonProperty("osType")
        private String osType;

        /**
         * OS installed on the resource associated with the target
         *
         * @param osType the value to set
         * @return this builder
         */
        public Builder osType(String osType) {
            this.osType = osType;
            this.__explicitlySet__.add("osType");
            return this;
        }
        /** Architecture of the resource associated with the target */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * Architecture of the resource associated with the target
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** List of target properties */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<InventoryRecordProperty> properties;

        /**
         * List of target properties
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<InventoryRecordProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /** List of target components */
        @com.fasterxml.jackson.annotation.JsonProperty("components")
        private java.util.List<InventoryRecordComponent> components;

        /**
         * List of target components
         *
         * @param components the value to set
         * @return this builder
         */
        public Builder components(java.util.List<InventoryRecordComponent> components) {
            this.components = components;
            this.__explicitlySet__.add("components");
            return this;
        }
        /** List of details on the patches currently installed on the target */
        @com.fasterxml.jackson.annotation.JsonProperty("installedPatches")
        private java.util.List<InventoryRecordPatchDetails> installedPatches;

        /**
         * List of details on the patches currently installed on the target
         *
         * @param installedPatches the value to set
         * @return this builder
         */
        public Builder installedPatches(
                java.util.List<InventoryRecordPatchDetails> installedPatches) {
            this.installedPatches = installedPatches;
            this.__explicitlySet__.add("installedPatches");
            return this;
        }
        /** The time this resource was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time this resource was last updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Inventory target. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private InventoryRecord.LifecycleState lifecycleState;

        /**
         * The current state of the Inventory target.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(InventoryRecord.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventoryRecordSummary build() {
            InventoryRecordSummary model =
                    new InventoryRecordSummary(
                            this.targetId,
                            this.targetName,
                            this.version,
                            this.targetResourceId,
                            this.targetResourceName,
                            this.compartmentId,
                            this.targetProductId,
                            this.targetProductName,
                            this.osType,
                            this.architecture,
                            this.properties,
                            this.components,
                            this.installedPatches,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventoryRecordSummary model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetName")) {
                this.targetName(model.getTargetName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("targetResourceId")) {
                this.targetResourceId(model.getTargetResourceId());
            }
            if (model.wasPropertyExplicitlySet("targetResourceName")) {
                this.targetResourceName(model.getTargetResourceName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetProductId")) {
                this.targetProductId(model.getTargetProductId());
            }
            if (model.wasPropertyExplicitlySet("targetProductName")) {
                this.targetProductName(model.getTargetProductName());
            }
            if (model.wasPropertyExplicitlySet("osType")) {
                this.osType(model.getOsType());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("components")) {
                this.components(model.getComponents());
            }
            if (model.wasPropertyExplicitlySet("installedPatches")) {
                this.installedPatches(model.getInstalledPatches());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** The OCID of the Inventory target. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the Inventory target.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Name of the target */
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

    /**
     * Name of the target
     *
     * @return the value
     */
    public String getTargetName() {
        return targetName;
    }

    /** Version of the product on the target */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of the product on the target
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** OCID of the resource associated with the target */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * OCID of the resource associated with the target
     *
     * @return the value
     */
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /** Name of the resource associated with the target */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceName")
    private final String targetResourceName;

    /**
     * Name of the resource associated with the target
     *
     * @return the value
     */
    public String getTargetResourceName() {
        return targetResourceName;
    }

    /** OCID of the compartment to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID of the product installed at the target path */
    @com.fasterxml.jackson.annotation.JsonProperty("targetProductId")
    private final String targetProductId;

    /**
     * OCID of the product installed at the target path
     *
     * @return the value
     */
    public String getTargetProductId() {
        return targetProductId;
    }

    /** Name of the product installed at the target path */
    @com.fasterxml.jackson.annotation.JsonProperty("targetProductName")
    private final String targetProductName;

    /**
     * Name of the product installed at the target path
     *
     * @return the value
     */
    public String getTargetProductName() {
        return targetProductName;
    }

    /** OS installed on the resource associated with the target */
    @com.fasterxml.jackson.annotation.JsonProperty("osType")
    private final String osType;

    /**
     * OS installed on the resource associated with the target
     *
     * @return the value
     */
    public String getOsType() {
        return osType;
    }

    /** Architecture of the resource associated with the target */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * Architecture of the resource associated with the target
     *
     * @return the value
     */
    public String getArchitecture() {
        return architecture;
    }

    /** List of target properties */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<InventoryRecordProperty> properties;

    /**
     * List of target properties
     *
     * @return the value
     */
    public java.util.List<InventoryRecordProperty> getProperties() {
        return properties;
    }

    /** List of target components */
    @com.fasterxml.jackson.annotation.JsonProperty("components")
    private final java.util.List<InventoryRecordComponent> components;

    /**
     * List of target components
     *
     * @return the value
     */
    public java.util.List<InventoryRecordComponent> getComponents() {
        return components;
    }

    /** List of details on the patches currently installed on the target */
    @com.fasterxml.jackson.annotation.JsonProperty("installedPatches")
    private final java.util.List<InventoryRecordPatchDetails> installedPatches;

    /**
     * List of details on the patches currently installed on the target
     *
     * @return the value
     */
    public java.util.List<InventoryRecordPatchDetails> getInstalledPatches() {
        return installedPatches;
    }

    /** The time this resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time this resource was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Inventory target. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final InventoryRecord.LifecycleState lifecycleState;

    /**
     * The current state of the Inventory target.
     *
     * @return the value
     */
    public InventoryRecord.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("InventoryRecordSummary(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", targetResourceName=").append(String.valueOf(this.targetResourceName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetProductId=").append(String.valueOf(this.targetProductId));
        sb.append(", targetProductName=").append(String.valueOf(this.targetProductName));
        sb.append(", osType=").append(String.valueOf(this.osType));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", components=").append(String.valueOf(this.components));
        sb.append(", installedPatches=").append(String.valueOf(this.installedPatches));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventoryRecordSummary)) {
            return false;
        }

        InventoryRecordSummary other = (InventoryRecordSummary) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(this.targetResourceName, other.targetResourceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetProductId, other.targetProductId)
                && java.util.Objects.equals(this.targetProductName, other.targetProductName)
                && java.util.Objects.equals(this.osType, other.osType)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.components, other.components)
                && java.util.Objects.equals(this.installedPatches, other.installedPatches)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceName == null
                                ? 43
                                : this.targetResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetProductId == null ? 43 : this.targetProductId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetProductName == null ? 43 : this.targetProductName.hashCode());
        result = (result * PRIME) + (this.osType == null ? 43 : this.osType.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.components == null ? 43 : this.components.hashCode());
        result =
                (result * PRIME)
                        + (this.installedPatches == null ? 43 : this.installedPatches.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
