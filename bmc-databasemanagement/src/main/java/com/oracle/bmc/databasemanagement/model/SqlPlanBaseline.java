/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a SQL plan baseline. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlPlanBaseline.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlPlanBaseline
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "planName",
        "sqlHandle",
        "sqlText",
        "origin",
        "timeCreated",
        "timeLastModified",
        "timeLastExecuted",
        "enabled",
        "accepted",
        "fixed",
        "reproduced",
        "autoPurge",
        "adaptive",
        "module",
        "action",
        "executionPlan"
    })
    public SqlPlanBaseline(
            String planName,
            String sqlHandle,
            String sqlText,
            SqlPlanBaselineOrigin origin,
            java.util.Date timeCreated,
            java.util.Date timeLastModified,
            java.util.Date timeLastExecuted,
            Enabled enabled,
            Accepted accepted,
            Fixed fixed,
            Reproduced reproduced,
            AutoPurge autoPurge,
            Adaptive adaptive,
            String module,
            String action,
            String executionPlan) {
        super();
        this.planName = planName;
        this.sqlHandle = sqlHandle;
        this.sqlText = sqlText;
        this.origin = origin;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
        this.timeLastExecuted = timeLastExecuted;
        this.enabled = enabled;
        this.accepted = accepted;
        this.fixed = fixed;
        this.reproduced = reproduced;
        this.autoPurge = autoPurge;
        this.adaptive = adaptive;
        this.module = module;
        this.action = action;
        this.executionPlan = executionPlan;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique plan identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("planName")
        private String planName;

        /**
         * The unique plan identifier.
         *
         * @param planName the value to set
         * @return this builder
         */
        public Builder planName(String planName) {
            this.planName = planName;
            this.__explicitlySet__.add("planName");
            return this;
        }
        /** The unique SQL identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
        private String sqlHandle;

        /**
         * The unique SQL identifier.
         *
         * @param sqlHandle the value to set
         * @return this builder
         */
        public Builder sqlHandle(String sqlHandle) {
            this.sqlHandle = sqlHandle;
            this.__explicitlySet__.add("sqlHandle");
            return this;
        }
        /** The SQL text. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text.
         *
         * @param sqlText the value to set
         * @return this builder
         */
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }
        /** The origin of the SQL plan baseline. */
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private SqlPlanBaselineOrigin origin;

        /**
         * The origin of the SQL plan baseline.
         *
         * @param origin the value to set
         * @return this builder
         */
        public Builder origin(SqlPlanBaselineOrigin origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }
        /** The date and time when the plan baseline was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the plan baseline was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time when the plan baseline was last modified. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * The date and time when the plan baseline was last modified.
         *
         * @param timeLastModified the value to set
         * @return this builder
         */
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }
        /**
         * The date and time when the plan baseline was last executed.
         *
         * <p>*Note:** For performance reasons, database does not update this value immediately
         * after each execution of the plan baseline. Therefore, the plan baseline may have been
         * executed more recently than this value indicates.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecuted")
        private java.util.Date timeLastExecuted;

        /**
         * The date and time when the plan baseline was last executed.
         *
         * <p>*Note:** For performance reasons, database does not update this value immediately
         * after each execution of the plan baseline. Therefore, the plan baseline may have been
         * executed more recently than this value indicates.
         *
         * @param timeLastExecuted the value to set
         * @return this builder
         */
        public Builder timeLastExecuted(java.util.Date timeLastExecuted) {
            this.timeLastExecuted = timeLastExecuted;
            this.__explicitlySet__.add("timeLastExecuted");
            return this;
        }
        /**
         * Indicates whether the plan baseline is enabled ({@code YES}) or disabled ({@code NO}).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private Enabled enabled;

        /**
         * Indicates whether the plan baseline is enabled ({@code YES}) or disabled ({@code NO}).
         *
         * @param enabled the value to set
         * @return this builder
         */
        public Builder enabled(Enabled enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }
        /** Indicates whether the plan baseline is accepted ({@code YES}) or not ({@code NO}). */
        @com.fasterxml.jackson.annotation.JsonProperty("accepted")
        private Accepted accepted;

        /**
         * Indicates whether the plan baseline is accepted ({@code YES}) or not ({@code NO}).
         *
         * @param accepted the value to set
         * @return this builder
         */
        public Builder accepted(Accepted accepted) {
            this.accepted = accepted;
            this.__explicitlySet__.add("accepted");
            return this;
        }
        /** Indicates whether the plan baseline is fixed ({@code YES}) or not ({@code NO}). */
        @com.fasterxml.jackson.annotation.JsonProperty("fixed")
        private Fixed fixed;

        /**
         * Indicates whether the plan baseline is fixed ({@code YES}) or not ({@code NO}).
         *
         * @param fixed the value to set
         * @return this builder
         */
        public Builder fixed(Fixed fixed) {
            this.fixed = fixed;
            this.__explicitlySet__.add("fixed");
            return this;
        }
        /**
         * Indicates whether the optimizer was able to reproduce the plan ({@code YES}) or not
         * ({@code NO}). The value is set to {@code YES} when a plan is initially added to the plan
         * baseline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reproduced")
        private Reproduced reproduced;

        /**
         * Indicates whether the optimizer was able to reproduce the plan ({@code YES}) or not
         * ({@code NO}). The value is set to {@code YES} when a plan is initially added to the plan
         * baseline.
         *
         * @param reproduced the value to set
         * @return this builder
         */
        public Builder reproduced(Reproduced reproduced) {
            this.reproduced = reproduced;
            this.__explicitlySet__.add("reproduced");
            return this;
        }
        /** Indicates whether the plan baseline is auto-purged ({@code YES}) or not ({@code NO}). */
        @com.fasterxml.jackson.annotation.JsonProperty("autoPurge")
        private AutoPurge autoPurge;

        /**
         * Indicates whether the plan baseline is auto-purged ({@code YES}) or not ({@code NO}).
         *
         * @param autoPurge the value to set
         * @return this builder
         */
        public Builder autoPurge(AutoPurge autoPurge) {
            this.autoPurge = autoPurge;
            this.__explicitlySet__.add("autoPurge");
            return this;
        }
        /**
         * Indicates whether a plan that is automatically captured by SQL plan management is marked
         * adaptive or not.
         *
         * <p>When a new adaptive plan is found for a SQL statement that has an existing SQL plan
         * baseline, that new plan will be added to the SQL plan baseline as an unaccepted plan, and
         * the {@code ADAPTIVE} property will be marked {@code YES}. When this new plan is verified
         * (either manually or via the auto evolve task), the plan will be test executed and the
         * final plan determined at execution will become an accepted plan if its performance is
         * better than the existing plan baseline. At this point, the value of the {@code ADAPTIVE}
         * property is set to {@code NO} since the plan is no longer adaptive, but resolved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adaptive")
        private Adaptive adaptive;

        /**
         * Indicates whether a plan that is automatically captured by SQL plan management is marked
         * adaptive or not.
         *
         * <p>When a new adaptive plan is found for a SQL statement that has an existing SQL plan
         * baseline, that new plan will be added to the SQL plan baseline as an unaccepted plan, and
         * the {@code ADAPTIVE} property will be marked {@code YES}. When this new plan is verified
         * (either manually or via the auto evolve task), the plan will be test executed and the
         * final plan determined at execution will become an accepted plan if its performance is
         * better than the existing plan baseline. At this point, the value of the {@code ADAPTIVE}
         * property is set to {@code NO} since the plan is no longer adaptive, but resolved.
         *
         * @param adaptive the value to set
         * @return this builder
         */
        public Builder adaptive(Adaptive adaptive) {
            this.adaptive = adaptive;
            this.__explicitlySet__.add("adaptive");
            return this;
        }
        /** The application module name. */
        @com.fasterxml.jackson.annotation.JsonProperty("module")
        private String module;

        /**
         * The application module name.
         *
         * @param module the value to set
         * @return this builder
         */
        public Builder module(String module) {
            this.module = module;
            this.__explicitlySet__.add("module");
            return this;
        }
        /** The application action. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The application action.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** The execution plan for the SQL statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlan")
        private String executionPlan;

        /**
         * The execution plan for the SQL statement.
         *
         * @param executionPlan the value to set
         * @return this builder
         */
        public Builder executionPlan(String executionPlan) {
            this.executionPlan = executionPlan;
            this.__explicitlySet__.add("executionPlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanBaseline build() {
            SqlPlanBaseline model =
                    new SqlPlanBaseline(
                            this.planName,
                            this.sqlHandle,
                            this.sqlText,
                            this.origin,
                            this.timeCreated,
                            this.timeLastModified,
                            this.timeLastExecuted,
                            this.enabled,
                            this.accepted,
                            this.fixed,
                            this.reproduced,
                            this.autoPurge,
                            this.adaptive,
                            this.module,
                            this.action,
                            this.executionPlan);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanBaseline model) {
            if (model.wasPropertyExplicitlySet("planName")) {
                this.planName(model.getPlanName());
            }
            if (model.wasPropertyExplicitlySet("sqlHandle")) {
                this.sqlHandle(model.getSqlHandle());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("origin")) {
                this.origin(model.getOrigin());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
            }
            if (model.wasPropertyExplicitlySet("timeLastExecuted")) {
                this.timeLastExecuted(model.getTimeLastExecuted());
            }
            if (model.wasPropertyExplicitlySet("enabled")) {
                this.enabled(model.getEnabled());
            }
            if (model.wasPropertyExplicitlySet("accepted")) {
                this.accepted(model.getAccepted());
            }
            if (model.wasPropertyExplicitlySet("fixed")) {
                this.fixed(model.getFixed());
            }
            if (model.wasPropertyExplicitlySet("reproduced")) {
                this.reproduced(model.getReproduced());
            }
            if (model.wasPropertyExplicitlySet("autoPurge")) {
                this.autoPurge(model.getAutoPurge());
            }
            if (model.wasPropertyExplicitlySet("adaptive")) {
                this.adaptive(model.getAdaptive());
            }
            if (model.wasPropertyExplicitlySet("module")) {
                this.module(model.getModule());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("executionPlan")) {
                this.executionPlan(model.getExecutionPlan());
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

    /** The unique plan identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * The unique plan identifier.
     *
     * @return the value
     */
    public String getPlanName() {
        return planName;
    }

    /** The unique SQL identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
    private final String sqlHandle;

    /**
     * The unique SQL identifier.
     *
     * @return the value
     */
    public String getSqlHandle() {
        return sqlHandle;
    }

    /** The SQL text. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text.
     *
     * @return the value
     */
    public String getSqlText() {
        return sqlText;
    }

    /** The origin of the SQL plan baseline. */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    private final SqlPlanBaselineOrigin origin;

    /**
     * The origin of the SQL plan baseline.
     *
     * @return the value
     */
    public SqlPlanBaselineOrigin getOrigin() {
        return origin;
    }

    /** The date and time when the plan baseline was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the plan baseline was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time when the plan baseline was last modified. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * The date and time when the plan baseline was last modified.
     *
     * @return the value
     */
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    /**
     * The date and time when the plan baseline was last executed.
     *
     * <p>*Note:** For performance reasons, database does not update this value immediately after
     * each execution of the plan baseline. Therefore, the plan baseline may have been executed more
     * recently than this value indicates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecuted")
    private final java.util.Date timeLastExecuted;

    /**
     * The date and time when the plan baseline was last executed.
     *
     * <p>*Note:** For performance reasons, database does not update this value immediately after
     * each execution of the plan baseline. Therefore, the plan baseline may have been executed more
     * recently than this value indicates.
     *
     * @return the value
     */
    public java.util.Date getTimeLastExecuted() {
        return timeLastExecuted;
    }

    /** Indicates whether the plan baseline is enabled ({@code YES}) or disabled ({@code NO}). */
    public enum Enabled implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Enabled.class);

        private final String value;
        private static java.util.Map<String, Enabled> map;

        static {
            map = new java.util.HashMap<>();
            for (Enabled v : Enabled.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Enabled(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Enabled create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Enabled', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the plan baseline is enabled ({@code YES}) or disabled ({@code NO}). */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    private final Enabled enabled;

    /**
     * Indicates whether the plan baseline is enabled ({@code YES}) or disabled ({@code NO}).
     *
     * @return the value
     */
    public Enabled getEnabled() {
        return enabled;
    }

    /** Indicates whether the plan baseline is accepted ({@code YES}) or not ({@code NO}). */
    public enum Accepted implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Accepted.class);

        private final String value;
        private static java.util.Map<String, Accepted> map;

        static {
            map = new java.util.HashMap<>();
            for (Accepted v : Accepted.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Accepted(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Accepted create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Accepted', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the plan baseline is accepted ({@code YES}) or not ({@code NO}). */
    @com.fasterxml.jackson.annotation.JsonProperty("accepted")
    private final Accepted accepted;

    /**
     * Indicates whether the plan baseline is accepted ({@code YES}) or not ({@code NO}).
     *
     * @return the value
     */
    public Accepted getAccepted() {
        return accepted;
    }

    /** Indicates whether the plan baseline is fixed ({@code YES}) or not ({@code NO}). */
    public enum Fixed implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Fixed.class);

        private final String value;
        private static java.util.Map<String, Fixed> map;

        static {
            map = new java.util.HashMap<>();
            for (Fixed v : Fixed.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Fixed(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fixed create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Fixed', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the plan baseline is fixed ({@code YES}) or not ({@code NO}). */
    @com.fasterxml.jackson.annotation.JsonProperty("fixed")
    private final Fixed fixed;

    /**
     * Indicates whether the plan baseline is fixed ({@code YES}) or not ({@code NO}).
     *
     * @return the value
     */
    public Fixed getFixed() {
        return fixed;
    }

    /**
     * Indicates whether the optimizer was able to reproduce the plan ({@code YES}) or not ({@code
     * NO}). The value is set to {@code YES} when a plan is initially added to the plan baseline.
     */
    public enum Reproduced implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Reproduced.class);

        private final String value;
        private static java.util.Map<String, Reproduced> map;

        static {
            map = new java.util.HashMap<>();
            for (Reproduced v : Reproduced.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Reproduced(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Reproduced create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Reproduced', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the optimizer was able to reproduce the plan ({@code YES}) or not ({@code
     * NO}). The value is set to {@code YES} when a plan is initially added to the plan baseline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reproduced")
    private final Reproduced reproduced;

    /**
     * Indicates whether the optimizer was able to reproduce the plan ({@code YES}) or not ({@code
     * NO}). The value is set to {@code YES} when a plan is initially added to the plan baseline.
     *
     * @return the value
     */
    public Reproduced getReproduced() {
        return reproduced;
    }

    /** Indicates whether the plan baseline is auto-purged ({@code YES}) or not ({@code NO}). */
    public enum AutoPurge implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutoPurge.class);

        private final String value;
        private static java.util.Map<String, AutoPurge> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoPurge v : AutoPurge.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoPurge(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoPurge create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoPurge', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the plan baseline is auto-purged ({@code YES}) or not ({@code NO}). */
    @com.fasterxml.jackson.annotation.JsonProperty("autoPurge")
    private final AutoPurge autoPurge;

    /**
     * Indicates whether the plan baseline is auto-purged ({@code YES}) or not ({@code NO}).
     *
     * @return the value
     */
    public AutoPurge getAutoPurge() {
        return autoPurge;
    }

    /**
     * Indicates whether a plan that is automatically captured by SQL plan management is marked
     * adaptive or not.
     *
     * <p>When a new adaptive plan is found for a SQL statement that has an existing SQL plan
     * baseline, that new plan will be added to the SQL plan baseline as an unaccepted plan, and the
     * {@code ADAPTIVE} property will be marked {@code YES}. When this new plan is verified (either
     * manually or via the auto evolve task), the plan will be test executed and the final plan
     * determined at execution will become an accepted plan if its performance is better than the
     * existing plan baseline. At this point, the value of the {@code ADAPTIVE} property is set to
     * {@code NO} since the plan is no longer adaptive, but resolved.
     */
    public enum Adaptive implements com.oracle.bmc.http.internal.BmcEnum {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Adaptive.class);

        private final String value;
        private static java.util.Map<String, Adaptive> map;

        static {
            map = new java.util.HashMap<>();
            for (Adaptive v : Adaptive.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Adaptive(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Adaptive create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Adaptive', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether a plan that is automatically captured by SQL plan management is marked
     * adaptive or not.
     *
     * <p>When a new adaptive plan is found for a SQL statement that has an existing SQL plan
     * baseline, that new plan will be added to the SQL plan baseline as an unaccepted plan, and the
     * {@code ADAPTIVE} property will be marked {@code YES}. When this new plan is verified (either
     * manually or via the auto evolve task), the plan will be test executed and the final plan
     * determined at execution will become an accepted plan if its performance is better than the
     * existing plan baseline. At this point, the value of the {@code ADAPTIVE} property is set to
     * {@code NO} since the plan is no longer adaptive, but resolved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adaptive")
    private final Adaptive adaptive;

    /**
     * Indicates whether a plan that is automatically captured by SQL plan management is marked
     * adaptive or not.
     *
     * <p>When a new adaptive plan is found for a SQL statement that has an existing SQL plan
     * baseline, that new plan will be added to the SQL plan baseline as an unaccepted plan, and the
     * {@code ADAPTIVE} property will be marked {@code YES}. When this new plan is verified (either
     * manually or via the auto evolve task), the plan will be test executed and the final plan
     * determined at execution will become an accepted plan if its performance is better than the
     * existing plan baseline. At this point, the value of the {@code ADAPTIVE} property is set to
     * {@code NO} since the plan is no longer adaptive, but resolved.
     *
     * @return the value
     */
    public Adaptive getAdaptive() {
        return adaptive;
    }

    /** The application module name. */
    @com.fasterxml.jackson.annotation.JsonProperty("module")
    private final String module;

    /**
     * The application module name.
     *
     * @return the value
     */
    public String getModule() {
        return module;
    }

    /** The application action. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The application action.
     *
     * @return the value
     */
    public String getAction() {
        return action;
    }

    /** The execution plan for the SQL statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlan")
    private final String executionPlan;

    /**
     * The execution plan for the SQL statement.
     *
     * @return the value
     */
    public String getExecutionPlan() {
        return executionPlan;
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
        sb.append("SqlPlanBaseline(");
        sb.append("super=").append(super.toString());
        sb.append("planName=").append(String.valueOf(this.planName));
        sb.append(", sqlHandle=").append(String.valueOf(this.sqlHandle));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", origin=").append(String.valueOf(this.origin));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(", timeLastExecuted=").append(String.valueOf(this.timeLastExecuted));
        sb.append(", enabled=").append(String.valueOf(this.enabled));
        sb.append(", accepted=").append(String.valueOf(this.accepted));
        sb.append(", fixed=").append(String.valueOf(this.fixed));
        sb.append(", reproduced=").append(String.valueOf(this.reproduced));
        sb.append(", autoPurge=").append(String.valueOf(this.autoPurge));
        sb.append(", adaptive=").append(String.valueOf(this.adaptive));
        sb.append(", module=").append(String.valueOf(this.module));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", executionPlan=").append(String.valueOf(this.executionPlan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanBaseline)) {
            return false;
        }

        SqlPlanBaseline other = (SqlPlanBaseline) o;
        return java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.sqlHandle, other.sqlHandle)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.timeLastExecuted, other.timeLastExecuted)
                && java.util.Objects.equals(this.enabled, other.enabled)
                && java.util.Objects.equals(this.accepted, other.accepted)
                && java.util.Objects.equals(this.fixed, other.fixed)
                && java.util.Objects.equals(this.reproduced, other.reproduced)
                && java.util.Objects.equals(this.autoPurge, other.autoPurge)
                && java.util.Objects.equals(this.adaptive, other.adaptive)
                && java.util.Objects.equals(this.module, other.module)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.executionPlan, other.executionPlan)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result = (result * PRIME) + (this.sqlHandle == null ? 43 : this.sqlHandle.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecuted == null ? 43 : this.timeLastExecuted.hashCode());
        result = (result * PRIME) + (this.enabled == null ? 43 : this.enabled.hashCode());
        result = (result * PRIME) + (this.accepted == null ? 43 : this.accepted.hashCode());
        result = (result * PRIME) + (this.fixed == null ? 43 : this.fixed.hashCode());
        result = (result * PRIME) + (this.reproduced == null ? 43 : this.reproduced.hashCode());
        result = (result * PRIME) + (this.autoPurge == null ? 43 : this.autoPurge.hashCode());
        result = (result * PRIME) + (this.adaptive == null ? 43 : this.adaptive.hashCode());
        result = (result * PRIME) + (this.module == null ? 43 : this.module.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.executionPlan == null ? 43 : this.executionPlan.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
