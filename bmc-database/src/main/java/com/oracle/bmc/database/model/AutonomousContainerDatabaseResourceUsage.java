/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Associated autonomous container databases usages. <br>
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
        builder = AutonomousContainerDatabaseResourceUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousContainerDatabaseResourceUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "reclaimableCpus",
        "availableCpus",
        "largestProvisionableAutonomousDatabaseInCpus",
        "provisionedCpus",
        "reservedCpus",
        "usedCpus",
        "provisionableCpus",
        "autonomousContainerDatabaseVmUsage",
        "freeformTags",
        "definedTags"
    })
    public AutonomousContainerDatabaseResourceUsage(
            String id,
            String displayName,
            Float reclaimableCpus,
            Float availableCpus,
            Float largestProvisionableAutonomousDatabaseInCpus,
            Float provisionedCpus,
            Float reservedCpus,
            Float usedCpus,
            java.util.List<Float> provisionableCpus,
            java.util.List<AcdAvmResourceStats> autonomousContainerDatabaseVmUsage,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.reclaimableCpus = reclaimableCpus;
        this.availableCpus = availableCpus;
        this.largestProvisionableAutonomousDatabaseInCpus =
                largestProvisionableAutonomousDatabaseInCpus;
        this.provisionedCpus = provisionedCpus;
        this.reservedCpus = reservedCpus;
        this.usedCpus = usedCpus;
        this.provisionableCpus = provisionableCpus;
        this.autonomousContainerDatabaseVmUsage = autonomousContainerDatabaseVmUsage;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Container Database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The user-friendly name for the Autonomous Container Database. The name does not need to
         * be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Container Database. The name does not need to
         * be unique.
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
         * Number of CPUs that are reclaimable or released to the AVMC on Autonomous Container
         * Database restart.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * Number of CPUs that are reclaimable or released to the AVMC on Autonomous Container
         * Database restart.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Float reclaimableCpus) {
            this.reclaimableCpus = reclaimableCpus;
            this.__explicitlySet__.add("reclaimableCpus");
            return this;
        }
        /**
         * CPUs available for provisioning or scaling an Autonomous AI Database in the Autonomous
         * Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Float availableCpus;

        /**
         * CPUs available for provisioning or scaling an Autonomous AI Database in the Autonomous
         * Container Database.
         *
         * @param availableCpus the value to set
         * @return this builder
         */
        public Builder availableCpus(Float availableCpus) {
            this.availableCpus = availableCpus;
            this.__explicitlySet__.add("availableCpus");
            return this;
        }
        /** Largest provisionable ADB in the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "largestProvisionableAutonomousDatabaseInCpus")
        private Float largestProvisionableAutonomousDatabaseInCpus;

        /**
         * Largest provisionable ADB in the Autonomous Container Database.
         *
         * @param largestProvisionableAutonomousDatabaseInCpus the value to set
         * @return this builder
         */
        public Builder largestProvisionableAutonomousDatabaseInCpus(
                Float largestProvisionableAutonomousDatabaseInCpus) {
            this.largestProvisionableAutonomousDatabaseInCpus =
                    largestProvisionableAutonomousDatabaseInCpus;
            this.__explicitlySet__.add("largestProvisionableAutonomousDatabaseInCpus");
            return this;
        }
        /** CPUs / cores assigned to ADBs in the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
        private Float provisionedCpus;

        /**
         * CPUs / cores assigned to ADBs in the Autonomous Container Database.
         *
         * @param provisionedCpus the value to set
         * @return this builder
         */
        public Builder provisionedCpus(Float provisionedCpus) {
            this.provisionedCpus = provisionedCpus;
            this.__explicitlySet__.add("provisionedCpus");
            return this;
        }
        /**
         * CPUs / cores reserved for scalability, resilliency and other overheads. This includes
         * failover, autoscaling and idle instance overhead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
        private Float reservedCpus;

        /**
         * CPUs / cores reserved for scalability, resilliency and other overheads. This includes
         * failover, autoscaling and idle instance overhead.
         *
         * @param reservedCpus the value to set
         * @return this builder
         */
        public Builder reservedCpus(Float reservedCpus) {
            this.reservedCpus = reservedCpus;
            this.__explicitlySet__.add("reservedCpus");
            return this;
        }
        /**
         * CPUs / cores assigned to the Autonomous Container Database. Sum of provisioned, reserved
         * and reclaimable CPUs/ cores.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
        private Float usedCpus;

        /**
         * CPUs / cores assigned to the Autonomous Container Database. Sum of provisioned, reserved
         * and reclaimable CPUs/ cores.
         *
         * @param usedCpus the value to set
         * @return this builder
         */
        public Builder usedCpus(Float usedCpus) {
            this.usedCpus = usedCpus;
            this.__explicitlySet__.add("usedCpus");
            return this;
        }
        /** Valid list of provisionable CPUs for Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionableCpus")
        private java.util.List<Float> provisionableCpus;

        /**
         * Valid list of provisionable CPUs for Autonomous AI Database.
         *
         * @param provisionableCpus the value to set
         * @return this builder
         */
        public Builder provisionableCpus(java.util.List<Float> provisionableCpus) {
            this.provisionableCpus = provisionableCpus;
            this.__explicitlySet__.add("provisionableCpus");
            return this;
        }
        /** List of autonomous container database resource usage per autonomous virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseVmUsage")
        private java.util.List<AcdAvmResourceStats> autonomousContainerDatabaseVmUsage;

        /**
         * List of autonomous container database resource usage per autonomous virtual machine.
         *
         * @param autonomousContainerDatabaseVmUsage the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseVmUsage(
                java.util.List<AcdAvmResourceStats> autonomousContainerDatabaseVmUsage) {
            this.autonomousContainerDatabaseVmUsage = autonomousContainerDatabaseVmUsage;
            this.__explicitlySet__.add("autonomousContainerDatabaseVmUsage");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabaseResourceUsage build() {
            AutonomousContainerDatabaseResourceUsage model =
                    new AutonomousContainerDatabaseResourceUsage(
                            this.id,
                            this.displayName,
                            this.reclaimableCpus,
                            this.availableCpus,
                            this.largestProvisionableAutonomousDatabaseInCpus,
                            this.provisionedCpus,
                            this.reservedCpus,
                            this.usedCpus,
                            this.provisionableCpus,
                            this.autonomousContainerDatabaseVmUsage,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabaseResourceUsage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("largestProvisionableAutonomousDatabaseInCpus")) {
                this.largestProvisionableAutonomousDatabaseInCpus(
                        model.getLargestProvisionableAutonomousDatabaseInCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionedCpus")) {
                this.provisionedCpus(model.getProvisionedCpus());
            }
            if (model.wasPropertyExplicitlySet("reservedCpus")) {
                this.reservedCpus(model.getReservedCpus());
            }
            if (model.wasPropertyExplicitlySet("usedCpus")) {
                this.usedCpus(model.getUsedCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionableCpus")) {
                this.provisionableCpus(model.getProvisionableCpus());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseVmUsage")) {
                this.autonomousContainerDatabaseVmUsage(
                        model.getAutonomousContainerDatabaseVmUsage());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Container Database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The user-friendly name for the Autonomous Container Database. The name does not need to be
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Container Database. The name does not need to be
     * unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Number of CPUs that are reclaimable or released to the AVMC on Autonomous Container Database
     * restart.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * Number of CPUs that are reclaimable or released to the AVMC on Autonomous Container Database
     * restart.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
    }

    /**
     * CPUs available for provisioning or scaling an Autonomous AI Database in the Autonomous
     * Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    private final Float availableCpus;

    /**
     * CPUs available for provisioning or scaling an Autonomous AI Database in the Autonomous
     * Container Database.
     *
     * @return the value
     */
    public Float getAvailableCpus() {
        return availableCpus;
    }

    /** Largest provisionable ADB in the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("largestProvisionableAutonomousDatabaseInCpus")
    private final Float largestProvisionableAutonomousDatabaseInCpus;

    /**
     * Largest provisionable ADB in the Autonomous Container Database.
     *
     * @return the value
     */
    public Float getLargestProvisionableAutonomousDatabaseInCpus() {
        return largestProvisionableAutonomousDatabaseInCpus;
    }

    /** CPUs / cores assigned to ADBs in the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
    private final Float provisionedCpus;

    /**
     * CPUs / cores assigned to ADBs in the Autonomous Container Database.
     *
     * @return the value
     */
    public Float getProvisionedCpus() {
        return provisionedCpus;
    }

    /**
     * CPUs / cores reserved for scalability, resilliency and other overheads. This includes
     * failover, autoscaling and idle instance overhead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
    private final Float reservedCpus;

    /**
     * CPUs / cores reserved for scalability, resilliency and other overheads. This includes
     * failover, autoscaling and idle instance overhead.
     *
     * @return the value
     */
    public Float getReservedCpus() {
        return reservedCpus;
    }

    /**
     * CPUs / cores assigned to the Autonomous Container Database. Sum of provisioned, reserved and
     * reclaimable CPUs/ cores.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
    private final Float usedCpus;

    /**
     * CPUs / cores assigned to the Autonomous Container Database. Sum of provisioned, reserved and
     * reclaimable CPUs/ cores.
     *
     * @return the value
     */
    public Float getUsedCpus() {
        return usedCpus;
    }

    /** Valid list of provisionable CPUs for Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionableCpus")
    private final java.util.List<Float> provisionableCpus;

    /**
     * Valid list of provisionable CPUs for Autonomous AI Database.
     *
     * @return the value
     */
    public java.util.List<Float> getProvisionableCpus() {
        return provisionableCpus;
    }

    /** List of autonomous container database resource usage per autonomous virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseVmUsage")
    private final java.util.List<AcdAvmResourceStats> autonomousContainerDatabaseVmUsage;

    /**
     * List of autonomous container database resource usage per autonomous virtual machine.
     *
     * @return the value
     */
    public java.util.List<AcdAvmResourceStats> getAutonomousContainerDatabaseVmUsage() {
        return autonomousContainerDatabaseVmUsage;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("AutonomousContainerDatabaseResourceUsage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", largestProvisionableAutonomousDatabaseInCpus=")
                .append(String.valueOf(this.largestProvisionableAutonomousDatabaseInCpus));
        sb.append(", provisionedCpus=").append(String.valueOf(this.provisionedCpus));
        sb.append(", reservedCpus=").append(String.valueOf(this.reservedCpus));
        sb.append(", usedCpus=").append(String.valueOf(this.usedCpus));
        sb.append(", provisionableCpus=").append(String.valueOf(this.provisionableCpus));
        sb.append(", autonomousContainerDatabaseVmUsage=")
                .append(String.valueOf(this.autonomousContainerDatabaseVmUsage));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousContainerDatabaseResourceUsage)) {
            return false;
        }

        AutonomousContainerDatabaseResourceUsage other =
                (AutonomousContainerDatabaseResourceUsage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(
                        this.largestProvisionableAutonomousDatabaseInCpus,
                        other.largestProvisionableAutonomousDatabaseInCpus)
                && java.util.Objects.equals(this.provisionedCpus, other.provisionedCpus)
                && java.util.Objects.equals(this.reservedCpus, other.reservedCpus)
                && java.util.Objects.equals(this.usedCpus, other.usedCpus)
                && java.util.Objects.equals(this.provisionableCpus, other.provisionableCpus)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseVmUsage,
                        other.autonomousContainerDatabaseVmUsage)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.largestProvisionableAutonomousDatabaseInCpus == null
                                ? 43
                                : this.largestProvisionableAutonomousDatabaseInCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedCpus == null ? 43 : this.provisionedCpus.hashCode());
        result = (result * PRIME) + (this.reservedCpus == null ? 43 : this.reservedCpus.hashCode());
        result = (result * PRIME) + (this.usedCpus == null ? 43 : this.usedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionableCpus == null ? 43 : this.provisionableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseVmUsage == null
                                ? 43
                                : this.autonomousContainerDatabaseVmUsage.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
