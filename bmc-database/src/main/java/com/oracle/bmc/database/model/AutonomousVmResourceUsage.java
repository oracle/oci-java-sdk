/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous VM usage statistics. <br>
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
        builder = AutonomousVmResourceUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousVmResourceUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "usedCpus",
        "availableCpus",
        "reclaimableCpus",
        "provisionedCpus",
        "reservedCpus",
        "autonomousContainerDatabaseUsage"
    })
    public AutonomousVmResourceUsage(
            String id,
            String displayName,
            Float usedCpus,
            Float availableCpus,
            Float reclaimableCpus,
            Float provisionedCpus,
            Float reservedCpus,
            java.util.List<AvmAcdResourceStats> autonomousContainerDatabaseUsage) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.usedCpus = usedCpus;
        this.availableCpus = availableCpus;
        this.reclaimableCpus = reclaimableCpus;
        this.provisionedCpus = provisionedCpus;
        this.reservedCpus = reservedCpus;
        this.autonomousContainerDatabaseUsage = autonomousContainerDatabaseUsage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM Cluster.
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
         * The user-friendly name for the Autonomous VM cluster. The name does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous VM cluster. The name does not need to be
         * unique.
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
         * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud
         * Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
        private Float usedCpus;

        /**
         * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud
         * Autonomous VM cluster.
         *
         * @param usedCpus the value to set
         * @return this builder
         */
        public Builder usedCpus(Float usedCpus) {
            this.usedCpus = usedCpus;
            this.__explicitlySet__.add("usedCpus");
            return this;
        }
        /** The number of CPU cores available. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Float availableCpus;

        /**
         * The number of CPU cores available.
         *
         * @param availableCpus the value to set
         * @return this builder
         */
        public Builder availableCpus(Float availableCpus) {
            this.availableCpus = availableCpus;
            this.__explicitlySet__.add("availableCpus");
            return this;
        }
        /**
         * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available OCPUs at its parent AVMC level by restarting
         * the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available OCPUs at its parent AVMC level by restarting
         * the Autonomous Container Database.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Float reclaimableCpus) {
            this.reclaimableCpus = reclaimableCpus;
            this.__explicitlySet__.add("reclaimableCpus");
            return this;
        }
        /** The number of CPUs provisioned in an Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
        private Float provisionedCpus;

        /**
         * The number of CPUs provisioned in an Autonomous VM Cluster.
         *
         * @param provisionedCpus the value to set
         * @return this builder
         */
        public Builder provisionedCpus(Float provisionedCpus) {
            this.provisionedCpus = provisionedCpus;
            this.__explicitlySet__.add("provisionedCpus");
            return this;
        }
        /** The number of CPUs reserved in an Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
        private Float reservedCpus;

        /**
         * The number of CPUs reserved in an Autonomous VM Cluster.
         *
         * @param reservedCpus the value to set
         * @return this builder
         */
        public Builder reservedCpus(Float reservedCpus) {
            this.reservedCpus = reservedCpus;
            this.__explicitlySet__.add("reservedCpus");
            return this;
        }
        /** Associated Autonomous Container Database Usages. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseUsage")
        private java.util.List<AvmAcdResourceStats> autonomousContainerDatabaseUsage;

        /**
         * Associated Autonomous Container Database Usages.
         *
         * @param autonomousContainerDatabaseUsage the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseUsage(
                java.util.List<AvmAcdResourceStats> autonomousContainerDatabaseUsage) {
            this.autonomousContainerDatabaseUsage = autonomousContainerDatabaseUsage;
            this.__explicitlySet__.add("autonomousContainerDatabaseUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousVmResourceUsage build() {
            AutonomousVmResourceUsage model =
                    new AutonomousVmResourceUsage(
                            this.id,
                            this.displayName,
                            this.usedCpus,
                            this.availableCpus,
                            this.reclaimableCpus,
                            this.provisionedCpus,
                            this.reservedCpus,
                            this.autonomousContainerDatabaseUsage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousVmResourceUsage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("usedCpus")) {
                this.usedCpus(model.getUsedCpus());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionedCpus")) {
                this.provisionedCpus(model.getProvisionedCpus());
            }
            if (model.wasPropertyExplicitlySet("reservedCpus")) {
                this.reservedCpus(model.getReservedCpus());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseUsage")) {
                this.autonomousContainerDatabaseUsage(model.getAutonomousContainerDatabaseUsage());
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
     * Autonomous VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM Cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud Autonomous
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
    private final Float usedCpus;

    /**
     * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud Autonomous
     * VM cluster.
     *
     * @return the value
     */
    public Float getUsedCpus() {
        return usedCpus;
    }

    /** The number of CPU cores available. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    private final Float availableCpus;

    /**
     * The number of CPU cores available.
     *
     * @return the value
     */
    public Float getAvailableCpus() {
        return availableCpus;
    }

    /**
     * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
     * Container Database even after one of its Autonomous Database is terminated or scaled down.
     * You can release them to the available OCPUs at its parent AVMC level by restarting the
     * Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
     * Container Database even after one of its Autonomous Database is terminated or scaled down.
     * You can release them to the available OCPUs at its parent AVMC level by restarting the
     * Autonomous Container Database.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
    }

    /** The number of CPUs provisioned in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
    private final Float provisionedCpus;

    /**
     * The number of CPUs provisioned in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Float getProvisionedCpus() {
        return provisionedCpus;
    }

    /** The number of CPUs reserved in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
    private final Float reservedCpus;

    /**
     * The number of CPUs reserved in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Float getReservedCpus() {
        return reservedCpus;
    }

    /** Associated Autonomous Container Database Usages. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseUsage")
    private final java.util.List<AvmAcdResourceStats> autonomousContainerDatabaseUsage;

    /**
     * Associated Autonomous Container Database Usages.
     *
     * @return the value
     */
    public java.util.List<AvmAcdResourceStats> getAutonomousContainerDatabaseUsage() {
        return autonomousContainerDatabaseUsage;
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
        sb.append("AutonomousVmResourceUsage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", usedCpus=").append(String.valueOf(this.usedCpus));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", provisionedCpus=").append(String.valueOf(this.provisionedCpus));
        sb.append(", reservedCpus=").append(String.valueOf(this.reservedCpus));
        sb.append(", autonomousContainerDatabaseUsage=")
                .append(String.valueOf(this.autonomousContainerDatabaseUsage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousVmResourceUsage)) {
            return false;
        }

        AutonomousVmResourceUsage other = (AutonomousVmResourceUsage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.usedCpus, other.usedCpus)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(this.provisionedCpus, other.provisionedCpus)
                && java.util.Objects.equals(this.reservedCpus, other.reservedCpus)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseUsage,
                        other.autonomousContainerDatabaseUsage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.usedCpus == null ? 43 : this.usedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedCpus == null ? 43 : this.provisionedCpus.hashCode());
        result = (result * PRIME) + (this.reservedCpus == null ? 43 : this.reservedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseUsage == null
                                ? 43
                                : this.autonomousContainerDatabaseUsage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
