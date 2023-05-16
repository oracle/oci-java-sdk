/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * IORM Setting details for this Exadata System to be updated <br>
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
        builder = ExadataIormConfigUpdateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadataIormConfigUpdateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objective", "dbPlans"})
    public ExadataIormConfigUpdateDetails(
            Objective objective, java.util.List<DbIormConfigUpdateDetail> dbPlans) {
        super();
        this.objective = objective;
        this.dbPlans = dbPlans;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Value for the IORM objective Default is "Auto" */
        @com.fasterxml.jackson.annotation.JsonProperty("objective")
        private Objective objective;

        /**
         * Value for the IORM objective Default is "Auto"
         *
         * @param objective the value to set
         * @return this builder
         */
        public Builder objective(Objective objective) {
            this.objective = objective;
            this.__explicitlySet__.add("objective");
            return this;
        }
        /** Array of IORM Setting for all the database in this Exadata DB System */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPlans")
        private java.util.List<DbIormConfigUpdateDetail> dbPlans;

        /**
         * Array of IORM Setting for all the database in this Exadata DB System
         *
         * @param dbPlans the value to set
         * @return this builder
         */
        public Builder dbPlans(java.util.List<DbIormConfigUpdateDetail> dbPlans) {
            this.dbPlans = dbPlans;
            this.__explicitlySet__.add("dbPlans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataIormConfigUpdateDetails build() {
            ExadataIormConfigUpdateDetails model =
                    new ExadataIormConfigUpdateDetails(this.objective, this.dbPlans);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataIormConfigUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("objective")) {
                this.objective(model.getObjective());
            }
            if (model.wasPropertyExplicitlySet("dbPlans")) {
                this.dbPlans(model.getDbPlans());
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

    /** Value for the IORM objective Default is "Auto" */
    public enum Objective implements com.oracle.bmc.http.internal.BmcEnum {
        LowLatency("LOW_LATENCY"),
        HighThroughput("HIGH_THROUGHPUT"),
        Balanced("BALANCED"),
        Auto("AUTO"),
        Basic("BASIC"),
        ;

        private final String value;
        private static java.util.Map<String, Objective> map;

        static {
            map = new java.util.HashMap<>();
            for (Objective v : Objective.values()) {
                map.put(v.getValue(), v);
            }
        }

        Objective(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Objective create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Objective: " + key);
        }
    };
    /** Value for the IORM objective Default is "Auto" */
    @com.fasterxml.jackson.annotation.JsonProperty("objective")
    private final Objective objective;

    /**
     * Value for the IORM objective Default is "Auto"
     *
     * @return the value
     */
    public Objective getObjective() {
        return objective;
    }

    /** Array of IORM Setting for all the database in this Exadata DB System */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPlans")
    private final java.util.List<DbIormConfigUpdateDetail> dbPlans;

    /**
     * Array of IORM Setting for all the database in this Exadata DB System
     *
     * @return the value
     */
    public java.util.List<DbIormConfigUpdateDetail> getDbPlans() {
        return dbPlans;
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
        sb.append("ExadataIormConfigUpdateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("objective=").append(String.valueOf(this.objective));
        sb.append(", dbPlans=").append(String.valueOf(this.dbPlans));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataIormConfigUpdateDetails)) {
            return false;
        }

        ExadataIormConfigUpdateDetails other = (ExadataIormConfigUpdateDetails) o;
        return java.util.Objects.equals(this.objective, other.objective)
                && java.util.Objects.equals(this.dbPlans, other.dbPlans)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objective == null ? 43 : this.objective.hashCode());
        result = (result * PRIME) + (this.dbPlans == null ? 43 : this.dbPlans.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
