/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details of the available and consumed CPU cores of the Autonomous Exadata Infrastructure
 * instance, including consumption by database workload type. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OCPUs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OCPUs extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalCpu", "consumedCpu", "byWorkloadType"})
    public OCPUs(Float totalCpu, Float consumedCpu, WorkloadType byWorkloadType) {
        super();
        this.totalCpu = totalCpu;
        this.consumedCpu = consumedCpu;
        this.byWorkloadType = byWorkloadType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of OCPUs in the Autonomous Exadata Infrastructure instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpu")
        private Float totalCpu;

        /**
         * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
         *
         * @param totalCpu the value to set
         * @return this builder
         */
        public Builder totalCpu(Float totalCpu) {
            this.totalCpu = totalCpu;
            this.__explicitlySet__.add("totalCpu");
            return this;
        }
        /** The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumedCpu")
        private Float consumedCpu;

        /**
         * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
         *
         * @param consumedCpu the value to set
         * @return this builder
         */
        public Builder consumedCpu(Float consumedCpu) {
            this.consumedCpu = consumedCpu;
            this.__explicitlySet__.add("consumedCpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("byWorkloadType")
        private WorkloadType byWorkloadType;

        public Builder byWorkloadType(WorkloadType byWorkloadType) {
            this.byWorkloadType = byWorkloadType;
            this.__explicitlySet__.add("byWorkloadType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OCPUs build() {
            OCPUs model = new OCPUs(this.totalCpu, this.consumedCpu, this.byWorkloadType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OCPUs model) {
            if (model.wasPropertyExplicitlySet("totalCpu")) {
                this.totalCpu(model.getTotalCpu());
            }
            if (model.wasPropertyExplicitlySet("consumedCpu")) {
                this.consumedCpu(model.getConsumedCpu());
            }
            if (model.wasPropertyExplicitlySet("byWorkloadType")) {
                this.byWorkloadType(model.getByWorkloadType());
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

    /** The total number of OCPUs in the Autonomous Exadata Infrastructure instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpu")
    private final Float totalCpu;

    /**
     * The total number of OCPUs in the Autonomous Exadata Infrastructure instance.
     *
     * @return the value
     */
    public Float getTotalCpu() {
        return totalCpu;
    }

    /** The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumedCpu")
    private final Float consumedCpu;

    /**
     * The total number of consumed OCPUs in the Autonomous Exadata Infrastructure instance.
     *
     * @return the value
     */
    public Float getConsumedCpu() {
        return consumedCpu;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("byWorkloadType")
    private final WorkloadType byWorkloadType;

    public WorkloadType getByWorkloadType() {
        return byWorkloadType;
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
        sb.append("OCPUs(");
        sb.append("super=").append(super.toString());
        sb.append("totalCpu=").append(String.valueOf(this.totalCpu));
        sb.append(", consumedCpu=").append(String.valueOf(this.consumedCpu));
        sb.append(", byWorkloadType=").append(String.valueOf(this.byWorkloadType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OCPUs)) {
            return false;
        }

        OCPUs other = (OCPUs) o;
        return java.util.Objects.equals(this.totalCpu, other.totalCpu)
                && java.util.Objects.equals(this.consumedCpu, other.consumedCpu)
                && java.util.Objects.equals(this.byWorkloadType, other.byWorkloadType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCpu == null ? 43 : this.totalCpu.hashCode());
        result = (result * PRIME) + (this.consumedCpu == null ? 43 : this.consumedCpu.hashCode());
        result =
                (result * PRIME)
                        + (this.byWorkloadType == null ? 43 : this.byWorkloadType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
