/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Resource usage by autonomous container database in a particular VM. <br>
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
        builder = AcdAvmResourceStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AcdAvmResourceStats
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "provisionedCpus",
        "usedCpus",
        "reservedCpus",
        "reclaimableCpus"
    })
    public AcdAvmResourceStats(
            String id,
            String displayName,
            Float provisionedCpus,
            Float usedCpus,
            Float reservedCpus,
            Float reclaimableCpus) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.provisionedCpus = provisionedCpus;
        this.usedCpus = usedCpus;
        this.reservedCpus = reservedCpus;
        this.reclaimableCpus = reclaimableCpus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name for the Autonomous VM. The name does not need to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous VM. The name does not need to be unique.
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
         * CPUs/cores assigned to Autonomous Databases for the ACD instance in given Autonomus VM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
        private Float provisionedCpus;

        /**
         * CPUs/cores assigned to Autonomous Databases for the ACD instance in given Autonomus VM.
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
         * CPUs/cores assigned to the ACD instance in given Autonomous VM. Sum of provisioned,
         * reserved and reclaimable CPUs/ cores to the ACD instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
        private Float usedCpus;

        /**
         * CPUs/cores assigned to the ACD instance in given Autonomous VM. Sum of provisioned,
         * reserved and reclaimable CPUs/ cores to the ACD instance.
         *
         * @param usedCpus the value to set
         * @return this builder
         */
        public Builder usedCpus(Float usedCpus) {
            this.usedCpus = usedCpus;
            this.__explicitlySet__.add("usedCpus");
            return this;
        }
        /**
         * CPUs/cores reserved for scalability, resilliency and other overheads. This includes
         * failover, autoscaling and idle instance overhead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
        private Float reservedCpus;

        /**
         * CPUs/cores reserved for scalability, resilliency and other overheads. This includes
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
         * CPUs/cores that continue to be included in the count of OCPUs available to the Autonomous
         * Container Database in given Autonomous VM, even after one of its Autonomous Database is
         * terminated or scaled down. You can release them to the available OCPUs at its parent AVMC
         * level by restarting the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * CPUs/cores that continue to be included in the count of OCPUs available to the Autonomous
         * Container Database in given Autonomous VM, even after one of its Autonomous Database is
         * terminated or scaled down. You can release them to the available OCPUs at its parent AVMC
         * level by restarting the Autonomous Container Database.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Float reclaimableCpus) {
            this.reclaimableCpus = reclaimableCpus;
            this.__explicitlySet__.add("reclaimableCpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AcdAvmResourceStats build() {
            AcdAvmResourceStats model =
                    new AcdAvmResourceStats(
                            this.id,
                            this.displayName,
                            this.provisionedCpus,
                            this.usedCpus,
                            this.reservedCpus,
                            this.reclaimableCpus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AcdAvmResourceStats model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("provisionedCpus")) {
                this.provisionedCpus(model.getProvisionedCpus());
            }
            if (model.wasPropertyExplicitlySet("usedCpus")) {
                this.usedCpus(model.getUsedCpus());
            }
            if (model.wasPropertyExplicitlySet("reservedCpus")) {
                this.reservedCpus(model.getReservedCpus());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the Autonomous VM. The name does not need to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous VM. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** CPUs/cores assigned to Autonomous Databases for the ACD instance in given Autonomus VM. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
    private final Float provisionedCpus;

    /**
     * CPUs/cores assigned to Autonomous Databases for the ACD instance in given Autonomus VM.
     *
     * @return the value
     */
    public Float getProvisionedCpus() {
        return provisionedCpus;
    }

    /**
     * CPUs/cores assigned to the ACD instance in given Autonomous VM. Sum of provisioned, reserved
     * and reclaimable CPUs/ cores to the ACD instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
    private final Float usedCpus;

    /**
     * CPUs/cores assigned to the ACD instance in given Autonomous VM. Sum of provisioned, reserved
     * and reclaimable CPUs/ cores to the ACD instance.
     *
     * @return the value
     */
    public Float getUsedCpus() {
        return usedCpus;
    }

    /**
     * CPUs/cores reserved for scalability, resilliency and other overheads. This includes failover,
     * autoscaling and idle instance overhead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
    private final Float reservedCpus;

    /**
     * CPUs/cores reserved for scalability, resilliency and other overheads. This includes failover,
     * autoscaling and idle instance overhead.
     *
     * @return the value
     */
    public Float getReservedCpus() {
        return reservedCpus;
    }

    /**
     * CPUs/cores that continue to be included in the count of OCPUs available to the Autonomous
     * Container Database in given Autonomous VM, even after one of its Autonomous Database is
     * terminated or scaled down. You can release them to the available OCPUs at its parent AVMC
     * level by restarting the Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * CPUs/cores that continue to be included in the count of OCPUs available to the Autonomous
     * Container Database in given Autonomous VM, even after one of its Autonomous Database is
     * terminated or scaled down. You can release them to the available OCPUs at its parent AVMC
     * level by restarting the Autonomous Container Database.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
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
        sb.append("AcdAvmResourceStats(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", provisionedCpus=").append(String.valueOf(this.provisionedCpus));
        sb.append(", usedCpus=").append(String.valueOf(this.usedCpus));
        sb.append(", reservedCpus=").append(String.valueOf(this.reservedCpus));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AcdAvmResourceStats)) {
            return false;
        }

        AcdAvmResourceStats other = (AcdAvmResourceStats) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.provisionedCpus, other.provisionedCpus)
                && java.util.Objects.equals(this.usedCpus, other.usedCpus)
                && java.util.Objects.equals(this.reservedCpus, other.reservedCpus)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
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
                        + (this.provisionedCpus == null ? 43 : this.provisionedCpus.hashCode());
        result = (result * PRIME) + (this.usedCpus == null ? 43 : this.usedCpus.hashCode());
        result = (result * PRIME) + (this.reservedCpus == null ? 43 : this.reservedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
