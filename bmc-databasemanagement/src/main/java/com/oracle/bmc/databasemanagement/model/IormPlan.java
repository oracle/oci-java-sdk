/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The IORM plan from a storage server. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IormPlan.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IormPlan extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"planStatus", "planObjective", "dbPlan"})
    public IormPlan(
            IormPlanStatusEnum planStatus,
            IormPlanObjectiveEnum planObjective,
            DatabasePlan dbPlan) {
        super();
        this.planStatus = planStatus;
        this.planObjective = planObjective;
        this.dbPlan = dbPlan;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of the IORM plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("planStatus")
        private IormPlanStatusEnum planStatus;

        /**
         * The status of the IORM plan.
         *
         * @param planStatus the value to set
         * @return this builder
         */
        public Builder planStatus(IormPlanStatusEnum planStatus) {
            this.planStatus = planStatus;
            this.__explicitlySet__.add("planStatus");
            return this;
        }
        /** The objective of the IORM plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("planObjective")
        private IormPlanObjectiveEnum planObjective;

        /**
         * The objective of the IORM plan.
         *
         * @param planObjective the value to set
         * @return this builder
         */
        public Builder planObjective(IormPlanObjectiveEnum planObjective) {
            this.planObjective = planObjective;
            this.__explicitlySet__.add("planObjective");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbPlan")
        private DatabasePlan dbPlan;

        public Builder dbPlan(DatabasePlan dbPlan) {
            this.dbPlan = dbPlan;
            this.__explicitlySet__.add("dbPlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IormPlan build() {
            IormPlan model = new IormPlan(this.planStatus, this.planObjective, this.dbPlan);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IormPlan model) {
            if (model.wasPropertyExplicitlySet("planStatus")) {
                this.planStatus(model.getPlanStatus());
            }
            if (model.wasPropertyExplicitlySet("planObjective")) {
                this.planObjective(model.getPlanObjective());
            }
            if (model.wasPropertyExplicitlySet("dbPlan")) {
                this.dbPlan(model.getDbPlan());
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

    /** The status of the IORM plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("planStatus")
    private final IormPlanStatusEnum planStatus;

    /**
     * The status of the IORM plan.
     *
     * @return the value
     */
    public IormPlanStatusEnum getPlanStatus() {
        return planStatus;
    }

    /** The objective of the IORM plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("planObjective")
    private final IormPlanObjectiveEnum planObjective;

    /**
     * The objective of the IORM plan.
     *
     * @return the value
     */
    public IormPlanObjectiveEnum getPlanObjective() {
        return planObjective;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbPlan")
    private final DatabasePlan dbPlan;

    public DatabasePlan getDbPlan() {
        return dbPlan;
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
        sb.append("IormPlan(");
        sb.append("super=").append(super.toString());
        sb.append("planStatus=").append(String.valueOf(this.planStatus));
        sb.append(", planObjective=").append(String.valueOf(this.planObjective));
        sb.append(", dbPlan=").append(String.valueOf(this.dbPlan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IormPlan)) {
            return false;
        }

        IormPlan other = (IormPlan) o;
        return java.util.Objects.equals(this.planStatus, other.planStatus)
                && java.util.Objects.equals(this.planObjective, other.planObjective)
                && java.util.Objects.equals(this.dbPlan, other.dbPlan)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planStatus == null ? 43 : this.planStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.planObjective == null ? 43 : this.planObjective.hashCode());
        result = (result * PRIME) + (this.dbPlan == null ? 43 : this.dbPlan.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
