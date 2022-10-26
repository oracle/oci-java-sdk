/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The IORM settings of the Exadata DB system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataIormConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExadataIormConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lifecycleState",
        "lifecycleDetails",
        "objective",
        "dbPlans"
    })
    public ExadataIormConfig(
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Objective objective,
            java.util.List<DbIormConfig> dbPlans) {
        super();
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.objective = objective;
        this.dbPlans = dbPlans;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The current state of IORM configuration for the Exadata DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of IORM configuration for the Exadata DB system.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current {@code lifecycleState}. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current {@code lifecycleState}.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current value for the IORM objective. The default is {@code AUTO}. */
        @com.fasterxml.jackson.annotation.JsonProperty("objective")
        private Objective objective;

        /**
         * The current value for the IORM objective. The default is {@code AUTO}.
         *
         * @param objective the value to set
         * @return this builder
         */
        public Builder objective(Objective objective) {
            this.objective = objective;
            this.__explicitlySet__.add("objective");
            return this;
        }
        /** An array of IORM settings for all the database in the Exadata DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPlans")
        private java.util.List<DbIormConfig> dbPlans;

        /**
         * An array of IORM settings for all the database in the Exadata DB system.
         *
         * @param dbPlans the value to set
         * @return this builder
         */
        public Builder dbPlans(java.util.List<DbIormConfig> dbPlans) {
            this.dbPlans = dbPlans;
            this.__explicitlySet__.add("dbPlans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataIormConfig build() {
            ExadataIormConfig model =
                    new ExadataIormConfig(
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.objective,
                            this.dbPlans);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataIormConfig model) {
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
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

    /** The current state of IORM configuration for the Exadata DB system. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Bootstrapping("BOOTSTRAPPING"),
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Updating("UPDATING"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of IORM configuration for the Exadata DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of IORM configuration for the Exadata DB system.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current {@code lifecycleState}. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current {@code lifecycleState}.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current value for the IORM objective. The default is {@code AUTO}. */
    public enum Objective implements com.oracle.bmc.http.internal.BmcEnum {
        LowLatency("LOW_LATENCY"),
        HighThroughput("HIGH_THROUGHPUT"),
        Balanced("BALANCED"),
        Auto("AUTO"),
        Basic("BASIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Objective.class);

        private final String value;
        private static java.util.Map<String, Objective> map;

        static {
            map = new java.util.HashMap<>();
            for (Objective v : Objective.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Objective', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current value for the IORM objective. The default is {@code AUTO}. */
    @com.fasterxml.jackson.annotation.JsonProperty("objective")
    private final Objective objective;

    /**
     * The current value for the IORM objective. The default is {@code AUTO}.
     *
     * @return the value
     */
    public Objective getObjective() {
        return objective;
    }

    /** An array of IORM settings for all the database in the Exadata DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPlans")
    private final java.util.List<DbIormConfig> dbPlans;

    /**
     * An array of IORM settings for all the database in the Exadata DB system.
     *
     * @return the value
     */
    public java.util.List<DbIormConfig> getDbPlans() {
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
        sb.append("ExadataIormConfig(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", objective=").append(String.valueOf(this.objective));
        sb.append(", dbPlans=").append(String.valueOf(this.dbPlans));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataIormConfig)) {
            return false;
        }

        ExadataIormConfig other = (ExadataIormConfig) o;
        return java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.objective, other.objective)
                && java.util.Objects.equals(this.dbPlans, other.dbPlans)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.objective == null ? 43 : this.objective.hashCode());
        result = (result * PRIME) + (this.dbPlans == null ? 43 : this.dbPlans.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
