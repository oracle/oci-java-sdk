/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The set of parameters used in an SPM evolve task. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SpmEvolveTaskParameters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SpmEvolveTaskParameters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alternatePlanSources",
        "alternatePlanBaselines",
        "alternatePlanLimit",
        "arePlansAutoAccepted",
        "allowedTimeLimit"
    })
    public SpmEvolveTaskParameters(
            java.util.List<AlternatePlanSources> alternatePlanSources,
            java.util.List<AlternatePlanBaselines> alternatePlanBaselines,
            Integer alternatePlanLimit,
            Boolean arePlansAutoAccepted,
            Integer allowedTimeLimit) {
        super();
        this.alternatePlanSources = alternatePlanSources;
        this.alternatePlanBaselines = alternatePlanBaselines;
        this.alternatePlanLimit = alternatePlanLimit;
        this.arePlansAutoAccepted = arePlansAutoAccepted;
        this.allowedTimeLimit = allowedTimeLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Determines which sources to search for additional plans. */
        @com.fasterxml.jackson.annotation.JsonProperty("alternatePlanSources")
        private java.util.List<AlternatePlanSources> alternatePlanSources;

        /**
         * Determines which sources to search for additional plans.
         *
         * @param alternatePlanSources the value to set
         * @return this builder
         */
        public Builder alternatePlanSources(
                java.util.List<AlternatePlanSources> alternatePlanSources) {
            this.alternatePlanSources = alternatePlanSources;
            this.__explicitlySet__.add("alternatePlanSources");
            return this;
        }
        /** Determines which alternative plans should be loaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("alternatePlanBaselines")
        private java.util.List<AlternatePlanBaselines> alternatePlanBaselines;

        /**
         * Determines which alternative plans should be loaded.
         *
         * @param alternatePlanBaselines the value to set
         * @return this builder
         */
        public Builder alternatePlanBaselines(
                java.util.List<AlternatePlanBaselines> alternatePlanBaselines) {
            this.alternatePlanBaselines = alternatePlanBaselines;
            this.__explicitlySet__.add("alternatePlanBaselines");
            return this;
        }
        /**
         * Specifies the maximum number of plans to load in total (that is, not the limit for each
         * SQL statement). A value of zero indicates {@code UNLIMITED} number of plans.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alternatePlanLimit")
        private Integer alternatePlanLimit;

        /**
         * Specifies the maximum number of plans to load in total (that is, not the limit for each
         * SQL statement). A value of zero indicates {@code UNLIMITED} number of plans.
         *
         * @param alternatePlanLimit the value to set
         * @return this builder
         */
        public Builder alternatePlanLimit(Integer alternatePlanLimit) {
            this.alternatePlanLimit = alternatePlanLimit;
            this.__explicitlySet__.add("alternatePlanLimit");
            return this;
        }
        /** Specifies whether to accept recommended plans automatically. */
        @com.fasterxml.jackson.annotation.JsonProperty("arePlansAutoAccepted")
        private Boolean arePlansAutoAccepted;

        /**
         * Specifies whether to accept recommended plans automatically.
         *
         * @param arePlansAutoAccepted the value to set
         * @return this builder
         */
        public Builder arePlansAutoAccepted(Boolean arePlansAutoAccepted) {
            this.arePlansAutoAccepted = arePlansAutoAccepted;
            this.__explicitlySet__.add("arePlansAutoAccepted");
            return this;
        }
        /** The global time limit in seconds. This is the total time allowed for the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTimeLimit")
        private Integer allowedTimeLimit;

        /**
         * The global time limit in seconds. This is the total time allowed for the task.
         *
         * @param allowedTimeLimit the value to set
         * @return this builder
         */
        public Builder allowedTimeLimit(Integer allowedTimeLimit) {
            this.allowedTimeLimit = allowedTimeLimit;
            this.__explicitlySet__.add("allowedTimeLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpmEvolveTaskParameters build() {
            SpmEvolveTaskParameters model =
                    new SpmEvolveTaskParameters(
                            this.alternatePlanSources,
                            this.alternatePlanBaselines,
                            this.alternatePlanLimit,
                            this.arePlansAutoAccepted,
                            this.allowedTimeLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpmEvolveTaskParameters model) {
            if (model.wasPropertyExplicitlySet("alternatePlanSources")) {
                this.alternatePlanSources(model.getAlternatePlanSources());
            }
            if (model.wasPropertyExplicitlySet("alternatePlanBaselines")) {
                this.alternatePlanBaselines(model.getAlternatePlanBaselines());
            }
            if (model.wasPropertyExplicitlySet("alternatePlanLimit")) {
                this.alternatePlanLimit(model.getAlternatePlanLimit());
            }
            if (model.wasPropertyExplicitlySet("arePlansAutoAccepted")) {
                this.arePlansAutoAccepted(model.getArePlansAutoAccepted());
            }
            if (model.wasPropertyExplicitlySet("allowedTimeLimit")) {
                this.allowedTimeLimit(model.getAllowedTimeLimit());
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

    /** */
    public enum AlternatePlanSources implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        AutomaticWorkloadRepository("AUTOMATIC_WORKLOAD_REPOSITORY"),
        CursorCache("CURSOR_CACHE"),
        SqlTuningSet("SQL_TUNING_SET"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AlternatePlanSources.class);

        private final String value;
        private static java.util.Map<String, AlternatePlanSources> map;

        static {
            map = new java.util.HashMap<>();
            for (AlternatePlanSources v : AlternatePlanSources.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AlternatePlanSources(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AlternatePlanSources create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AlternatePlanSources', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Determines which sources to search for additional plans. */
    @com.fasterxml.jackson.annotation.JsonProperty("alternatePlanSources")
    private final java.util.List<AlternatePlanSources> alternatePlanSources;

    /**
     * Determines which sources to search for additional plans.
     *
     * @return the value
     */
    public java.util.List<AlternatePlanSources> getAlternatePlanSources() {
        return alternatePlanSources;
    }

    /** */
    public enum AlternatePlanBaselines implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        Existing("EXISTING"),
        New("NEW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AlternatePlanBaselines.class);

        private final String value;
        private static java.util.Map<String, AlternatePlanBaselines> map;

        static {
            map = new java.util.HashMap<>();
            for (AlternatePlanBaselines v : AlternatePlanBaselines.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AlternatePlanBaselines(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AlternatePlanBaselines create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AlternatePlanBaselines', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Determines which alternative plans should be loaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("alternatePlanBaselines")
    private final java.util.List<AlternatePlanBaselines> alternatePlanBaselines;

    /**
     * Determines which alternative plans should be loaded.
     *
     * @return the value
     */
    public java.util.List<AlternatePlanBaselines> getAlternatePlanBaselines() {
        return alternatePlanBaselines;
    }

    /**
     * Specifies the maximum number of plans to load in total (that is, not the limit for each SQL
     * statement). A value of zero indicates {@code UNLIMITED} number of plans.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alternatePlanLimit")
    private final Integer alternatePlanLimit;

    /**
     * Specifies the maximum number of plans to load in total (that is, not the limit for each SQL
     * statement). A value of zero indicates {@code UNLIMITED} number of plans.
     *
     * @return the value
     */
    public Integer getAlternatePlanLimit() {
        return alternatePlanLimit;
    }

    /** Specifies whether to accept recommended plans automatically. */
    @com.fasterxml.jackson.annotation.JsonProperty("arePlansAutoAccepted")
    private final Boolean arePlansAutoAccepted;

    /**
     * Specifies whether to accept recommended plans automatically.
     *
     * @return the value
     */
    public Boolean getArePlansAutoAccepted() {
        return arePlansAutoAccepted;
    }

    /** The global time limit in seconds. This is the total time allowed for the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTimeLimit")
    private final Integer allowedTimeLimit;

    /**
     * The global time limit in seconds. This is the total time allowed for the task.
     *
     * @return the value
     */
    public Integer getAllowedTimeLimit() {
        return allowedTimeLimit;
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
        sb.append("SpmEvolveTaskParameters(");
        sb.append("super=").append(super.toString());
        sb.append("alternatePlanSources=").append(String.valueOf(this.alternatePlanSources));
        sb.append(", alternatePlanBaselines=").append(String.valueOf(this.alternatePlanBaselines));
        sb.append(", alternatePlanLimit=").append(String.valueOf(this.alternatePlanLimit));
        sb.append(", arePlansAutoAccepted=").append(String.valueOf(this.arePlansAutoAccepted));
        sb.append(", allowedTimeLimit=").append(String.valueOf(this.allowedTimeLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpmEvolveTaskParameters)) {
            return false;
        }

        SpmEvolveTaskParameters other = (SpmEvolveTaskParameters) o;
        return java.util.Objects.equals(this.alternatePlanSources, other.alternatePlanSources)
                && java.util.Objects.equals(
                        this.alternatePlanBaselines, other.alternatePlanBaselines)
                && java.util.Objects.equals(this.alternatePlanLimit, other.alternatePlanLimit)
                && java.util.Objects.equals(this.arePlansAutoAccepted, other.arePlansAutoAccepted)
                && java.util.Objects.equals(this.allowedTimeLimit, other.allowedTimeLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.alternatePlanSources == null
                                ? 43
                                : this.alternatePlanSources.hashCode());
        result =
                (result * PRIME)
                        + (this.alternatePlanBaselines == null
                                ? 43
                                : this.alternatePlanBaselines.hashCode());
        result =
                (result * PRIME)
                        + (this.alternatePlanLimit == null
                                ? 43
                                : this.alternatePlanLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.arePlansAutoAccepted == null
                                ? 43
                                : this.arePlansAutoAccepted.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedTimeLimit == null ? 43 : this.allowedTimeLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
