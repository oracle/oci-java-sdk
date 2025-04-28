/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Manages resource allocation among databases. Besides the name, at least one other property must
 * be available. <br>
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
        builder = DatabasePlanDirective.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabasePlanDirective
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "share",
        "level",
        "allocation",
        "limit",
        "isFlashCacheOn",
        "isPmemCacheOn",
        "isFlashLogOn",
        "isPmemLogOn",
        "flashCacheLimit",
        "flashCacheMin",
        "flashCacheSize",
        "pmemCacheLimit",
        "pmemCacheMin",
        "pmemCacheSize",
        "asmCluster",
        "type",
        "role"
    })
    public DatabasePlanDirective(
            String name,
            Integer share,
            Integer level,
            Integer allocation,
            Integer limit,
            Boolean isFlashCacheOn,
            Boolean isPmemCacheOn,
            Boolean isFlashLogOn,
            Boolean isPmemLogOn,
            String flashCacheLimit,
            String flashCacheMin,
            String flashCacheSize,
            String pmemCacheLimit,
            String pmemCacheMin,
            String pmemCacheSize,
            String asmCluster,
            DatabasePlanTypeEnum type,
            DatabasePlanRoleEnum role) {
        super();
        this.name = name;
        this.share = share;
        this.level = level;
        this.allocation = allocation;
        this.limit = limit;
        this.isFlashCacheOn = isFlashCacheOn;
        this.isPmemCacheOn = isPmemCacheOn;
        this.isFlashLogOn = isFlashLogOn;
        this.isPmemLogOn = isPmemLogOn;
        this.flashCacheLimit = flashCacheLimit;
        this.flashCacheMin = flashCacheMin;
        this.flashCacheSize = flashCacheSize;
        this.pmemCacheLimit = pmemCacheLimit;
        this.pmemCacheMin = pmemCacheMin;
        this.pmemCacheSize = pmemCacheSize;
        this.asmCluster = asmCluster;
        this.type = type;
        this.role = role;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of a database or a profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of a database or a profile.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The relative priority of a database in the database plan. A higher share value implies
         * higher priority and more access to the I/O resources. Use either share or (level,
         * allocation). All plan directives in a database plan should use the same setting.
         * Share-based resource allocation is the recommended method for a database plan.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("share")
        private Integer share;

        /**
         * The relative priority of a database in the database plan. A higher share value implies
         * higher priority and more access to the I/O resources. Use either share or (level,
         * allocation). All plan directives in a database plan should use the same setting.
         * Share-based resource allocation is the recommended method for a database plan.
         *
         * @param share the value to set
         * @return this builder
         */
        public Builder share(Integer share) {
            this.share = share;
            this.__explicitlySet__.add("share");
            return this;
        }
        /**
         * The allocation level. Valid values are from 1 to 8. Resources are allocated to level 1
         * first, and then remaining resources are allocated to level 2, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Integer level;

        /**
         * The allocation level. Valid values are from 1 to 8. Resources are allocated to level 1
         * first, and then remaining resources are allocated to level 2, and so on.
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(Integer level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /** The resource allocation as a percentage (0-100) within the level. */
        @com.fasterxml.jackson.annotation.JsonProperty("allocation")
        private Integer allocation;

        /**
         * The resource allocation as a percentage (0-100) within the level.
         *
         * @param allocation the value to set
         * @return this builder
         */
        public Builder allocation(Integer allocation) {
            this.allocation = allocation;
            this.__explicitlySet__.add("allocation");
            return this;
        }
        /** The maximum I/O utilization limit as a percentage of the available resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private Integer limit;

        /**
         * The maximum I/O utilization limit as a percentage of the available resources.
         *
         * @param limit the value to set
         * @return this builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }
        /**
         * Controls use of Exadata Smart Flash Cache by a database. This ensures that cache space is
         * reserved for mission-critical databases. flashcache=off is invalid in a directive that
         * contains the flashcachemin, flashcachelimit, or flashcachesize attributes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlashCacheOn")
        private Boolean isFlashCacheOn;

        /**
         * Controls use of Exadata Smart Flash Cache by a database. This ensures that cache space is
         * reserved for mission-critical databases. flashcache=off is invalid in a directive that
         * contains the flashcachemin, flashcachelimit, or flashcachesize attributes.
         *
         * @param isFlashCacheOn the value to set
         * @return this builder
         */
        public Builder isFlashCacheOn(Boolean isFlashCacheOn) {
            this.isFlashCacheOn = isFlashCacheOn;
            this.__explicitlySet__.add("isFlashCacheOn");
            return this;
        }
        /**
         * Controls use of the persistent memory (PMEM) cache by a database. This ensures that cache
         * space is reserved for mission-critical databases. pmemcache=off is invalid in a directive
         * that contains the pmemcachemin, pmemcachelimit, or pmemcachesize attributes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPmemCacheOn")
        private Boolean isPmemCacheOn;

        /**
         * Controls use of the persistent memory (PMEM) cache by a database. This ensures that cache
         * space is reserved for mission-critical databases. pmemcache=off is invalid in a directive
         * that contains the pmemcachemin, pmemcachelimit, or pmemcachesize attributes.
         *
         * @param isPmemCacheOn the value to set
         * @return this builder
         */
        public Builder isPmemCacheOn(Boolean isPmemCacheOn) {
            this.isPmemCacheOn = isPmemCacheOn;
            this.__explicitlySet__.add("isPmemCacheOn");
            return this;
        }
        /**
         * Controls use of Exadata Smart Flash Log by a database. This ensures that Exadata Smart
         * Flash Log is reserved for mission-critical databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlashLogOn")
        private Boolean isFlashLogOn;

        /**
         * Controls use of Exadata Smart Flash Log by a database. This ensures that Exadata Smart
         * Flash Log is reserved for mission-critical databases.
         *
         * @param isFlashLogOn the value to set
         * @return this builder
         */
        public Builder isFlashLogOn(Boolean isFlashLogOn) {
            this.isFlashLogOn = isFlashLogOn;
            this.__explicitlySet__.add("isFlashLogOn");
            return this;
        }
        /**
         * Controls use of persistent memory logging (PMEM log) by a database. This ensures that
         * PMEM log is reserved for mission-critical databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPmemLogOn")
        private Boolean isPmemLogOn;

        /**
         * Controls use of persistent memory logging (PMEM log) by a database. This ensures that
         * PMEM log is reserved for mission-critical databases.
         *
         * @param isPmemLogOn the value to set
         * @return this builder
         */
        public Builder isPmemLogOn(Boolean isPmemLogOn) {
            this.isPmemLogOn = isPmemLogOn;
            this.__explicitlySet__.add("isPmemLogOn");
            return this;
        }
        /**
         * Defines a soft limit for space usage in Exadata Smart Flash Cache. If the cache is not
         * full, the limit can be exceeded. You specify the value for flashcachelimit in bytes. You
         * can also use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to specify
         * larger values. For example, 300M, 150G, or 1T. The value for flashcachelimit must be at
         * least 4 MB. The flashcachelimit and flashcachesize attributes cannot be specified in the
         * same directive. The value for flashcachelimit cannot be smaller than flashcachemin, if it
         * is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
        private String flashCacheLimit;

        /**
         * Defines a soft limit for space usage in Exadata Smart Flash Cache. If the cache is not
         * full, the limit can be exceeded. You specify the value for flashcachelimit in bytes. You
         * can also use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to specify
         * larger values. For example, 300M, 150G, or 1T. The value for flashcachelimit must be at
         * least 4 MB. The flashcachelimit and flashcachesize attributes cannot be specified in the
         * same directive. The value for flashcachelimit cannot be smaller than flashcachemin, if it
         * is specified.
         *
         * @param flashCacheLimit the value to set
         * @return this builder
         */
        public Builder flashCacheLimit(String flashCacheLimit) {
            this.flashCacheLimit = flashCacheLimit;
            this.__explicitlySet__.add("flashCacheLimit");
            return this;
        }
        /**
         * Specifies a minimum guaranteed space allocation in Exadata Smart Flash Cache. You specify
         * the value for flashcachemin in bytes. You can also use the suffixes M (megabytes), G
         * (gigabytes), or T (terabytes) to specify larger values. For example, 300M, 150G, or 1T.
         * The value for flashcachemin must be at least 4 MB. In any plan, the sum of all
         * flashcachemin values cannot exceed the size of Exadata Smart Flash Cache. If
         * flashcachelimit is specified, then the value for flashcachemin cannot exceed
         * flashcachelimit. If flashcachesize is specified, then the value for flashcachemin cannot
         * exceed flashcachesize.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flashCacheMin")
        private String flashCacheMin;

        /**
         * Specifies a minimum guaranteed space allocation in Exadata Smart Flash Cache. You specify
         * the value for flashcachemin in bytes. You can also use the suffixes M (megabytes), G
         * (gigabytes), or T (terabytes) to specify larger values. For example, 300M, 150G, or 1T.
         * The value for flashcachemin must be at least 4 MB. In any plan, the sum of all
         * flashcachemin values cannot exceed the size of Exadata Smart Flash Cache. If
         * flashcachelimit is specified, then the value for flashcachemin cannot exceed
         * flashcachelimit. If flashcachesize is specified, then the value for flashcachemin cannot
         * exceed flashcachesize.
         *
         * @param flashCacheMin the value to set
         * @return this builder
         */
        public Builder flashCacheMin(String flashCacheMin) {
            this.flashCacheMin = flashCacheMin;
            this.__explicitlySet__.add("flashCacheMin");
            return this;
        }
        /**
         * Defines a hard limit for space usage in Exadata Smart Flash Cache. The limit cannot be
         * exceeded, even if the cache is not full. In an IORM plan, if the size of Exadata Smart
         * Flash Cache can accommodate all of the flashcachemin and flashcachesize allocations, then
         * each flashcachesize definition represents a guaranteed space allocation. However,
         * starting with Oracle Exadata System Software release 19.2.0 you can use the
         * flashcachesize attribute to over-provision space in Exadata Smart Flash Cache.
         * Consequently, if the size of Exadata Smart Flash Cache cannot accommodate all of the
         * flashcachemin and flashcachesize allocations, then only flashcachemin is guaranteed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flashCacheSize")
        private String flashCacheSize;

        /**
         * Defines a hard limit for space usage in Exadata Smart Flash Cache. The limit cannot be
         * exceeded, even if the cache is not full. In an IORM plan, if the size of Exadata Smart
         * Flash Cache can accommodate all of the flashcachemin and flashcachesize allocations, then
         * each flashcachesize definition represents a guaranteed space allocation. However,
         * starting with Oracle Exadata System Software release 19.2.0 you can use the
         * flashcachesize attribute to over-provision space in Exadata Smart Flash Cache.
         * Consequently, if the size of Exadata Smart Flash Cache cannot accommodate all of the
         * flashcachemin and flashcachesize allocations, then only flashcachemin is guaranteed.
         *
         * @param flashCacheSize the value to set
         * @return this builder
         */
        public Builder flashCacheSize(String flashCacheSize) {
            this.flashCacheSize = flashCacheSize;
            this.__explicitlySet__.add("flashCacheSize");
            return this;
        }
        /**
         * Defines a soft limit for space usage in the persistent memory (PMEM) cache. If the cache
         * is not full, the limit can be exceeded. You specify the value for pmemcachelimit in
         * bytes. You can also use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to
         * specify larger values. For example, 300M, 150G, or 1T. The value for pmemcachelimit must
         * be at least 4 MB. The pmemcachelimit and pmemcachesize attributes cannot be specified in
         * the same directive. The value for pmemcachelimit cannot be smaller than pmemcachemin, if
         * it is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pmemCacheLimit")
        private String pmemCacheLimit;

        /**
         * Defines a soft limit for space usage in the persistent memory (PMEM) cache. If the cache
         * is not full, the limit can be exceeded. You specify the value for pmemcachelimit in
         * bytes. You can also use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to
         * specify larger values. For example, 300M, 150G, or 1T. The value for pmemcachelimit must
         * be at least 4 MB. The pmemcachelimit and pmemcachesize attributes cannot be specified in
         * the same directive. The value for pmemcachelimit cannot be smaller than pmemcachemin, if
         * it is specified.
         *
         * @param pmemCacheLimit the value to set
         * @return this builder
         */
        public Builder pmemCacheLimit(String pmemCacheLimit) {
            this.pmemCacheLimit = pmemCacheLimit;
            this.__explicitlySet__.add("pmemCacheLimit");
            return this;
        }
        /**
         * Specifies a minimum guaranteed space allocation in the persistent memory (PMEM) cache.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pmemCacheMin")
        private String pmemCacheMin;

        /**
         * Specifies a minimum guaranteed space allocation in the persistent memory (PMEM) cache.
         *
         * @param pmemCacheMin the value to set
         * @return this builder
         */
        public Builder pmemCacheMin(String pmemCacheMin) {
            this.pmemCacheMin = pmemCacheMin;
            this.__explicitlySet__.add("pmemCacheMin");
            return this;
        }
        /**
         * Defines a hard limit for space usage in the persistent memory (PMEM) cache. The limit
         * cannot be exceeded, even if the cache is not full. In an IORM plan, if the size of the
         * PMEM cache can accommodate all of the pmemcachemin and pmemcachesize allocations, then
         * each pmemcachesize definition represents a guaranteed space allocation. However, you can
         * use the pmemcachesize attribute to over-provision space in the PMEM cache. Consequently,
         * if the PMEM cache size cannot accommodate all of the pmemcachemin and pmemcachesize
         * allocations, then only pmemcachemin is guaranteed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pmemCacheSize")
        private String pmemCacheSize;

        /**
         * Defines a hard limit for space usage in the persistent memory (PMEM) cache. The limit
         * cannot be exceeded, even if the cache is not full. In an IORM plan, if the size of the
         * PMEM cache can accommodate all of the pmemcachemin and pmemcachesize allocations, then
         * each pmemcachesize definition represents a guaranteed space allocation. However, you can
         * use the pmemcachesize attribute to over-provision space in the PMEM cache. Consequently,
         * if the PMEM cache size cannot accommodate all of the pmemcachemin and pmemcachesize
         * allocations, then only pmemcachemin is guaranteed.
         *
         * @param pmemCacheSize the value to set
         * @return this builder
         */
        public Builder pmemCacheSize(String pmemCacheSize) {
            this.pmemCacheSize = pmemCacheSize;
            this.__explicitlySet__.add("pmemCacheSize");
            return this;
        }
        /**
         * Starting with Oracle Exadata System Software release 19.1.0, you can use the asmcluster
         * attribute to distinguish between databases with the same name running in different Oracle
         * ASM clusters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("asmCluster")
        private String asmCluster;

        /**
         * Starting with Oracle Exadata System Software release 19.1.0, you can use the asmcluster
         * attribute to distinguish between databases with the same name running in different Oracle
         * ASM clusters.
         *
         * @param asmCluster the value to set
         * @return this builder
         */
        public Builder asmCluster(String asmCluster) {
            this.asmCluster = asmCluster;
            this.__explicitlySet__.add("asmCluster");
            return this;
        }
        /**
         * Enables you to create a profile or template, to ease management and configuration of
         * resource plans in environments with many databases.
         *
         * <p>- type=database: Specifies a directive that applies to a specific database. If type in
         * not specified, then the directive defaults to the database type. - type=profile:
         * Specifies a directive that applies to a profile rather than a specific database.
         *
         * <p>To associate a database with an IORM profile, you must set the database initialization
         * parameter db_performance_profile to the value of the profile name. Databases that map to
         * a profile inherit the settings specified in the profile.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DatabasePlanTypeEnum type;

        /**
         * Enables you to create a profile or template, to ease management and configuration of
         * resource plans in environments with many databases.
         *
         * <p>- type=database: Specifies a directive that applies to a specific database. If type in
         * not specified, then the directive defaults to the database type. - type=profile:
         * Specifies a directive that applies to a profile rather than a specific database.
         *
         * <p>To associate a database with an IORM profile, you must set the database initialization
         * parameter db_performance_profile to the value of the profile name. Databases that map to
         * a profile inherit the settings specified in the profile.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DatabasePlanTypeEnum type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Enables you to specify different plan directives based on the Oracle Data Guard database
         * role.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private DatabasePlanRoleEnum role;

        /**
         * Enables you to specify different plan directives based on the Oracle Data Guard database
         * role.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(DatabasePlanRoleEnum role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabasePlanDirective build() {
            DatabasePlanDirective model =
                    new DatabasePlanDirective(
                            this.name,
                            this.share,
                            this.level,
                            this.allocation,
                            this.limit,
                            this.isFlashCacheOn,
                            this.isPmemCacheOn,
                            this.isFlashLogOn,
                            this.isPmemLogOn,
                            this.flashCacheLimit,
                            this.flashCacheMin,
                            this.flashCacheSize,
                            this.pmemCacheLimit,
                            this.pmemCacheMin,
                            this.pmemCacheSize,
                            this.asmCluster,
                            this.type,
                            this.role);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabasePlanDirective model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("share")) {
                this.share(model.getShare());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("allocation")) {
                this.allocation(model.getAllocation());
            }
            if (model.wasPropertyExplicitlySet("limit")) {
                this.limit(model.getLimit());
            }
            if (model.wasPropertyExplicitlySet("isFlashCacheOn")) {
                this.isFlashCacheOn(model.getIsFlashCacheOn());
            }
            if (model.wasPropertyExplicitlySet("isPmemCacheOn")) {
                this.isPmemCacheOn(model.getIsPmemCacheOn());
            }
            if (model.wasPropertyExplicitlySet("isFlashLogOn")) {
                this.isFlashLogOn(model.getIsFlashLogOn());
            }
            if (model.wasPropertyExplicitlySet("isPmemLogOn")) {
                this.isPmemLogOn(model.getIsPmemLogOn());
            }
            if (model.wasPropertyExplicitlySet("flashCacheLimit")) {
                this.flashCacheLimit(model.getFlashCacheLimit());
            }
            if (model.wasPropertyExplicitlySet("flashCacheMin")) {
                this.flashCacheMin(model.getFlashCacheMin());
            }
            if (model.wasPropertyExplicitlySet("flashCacheSize")) {
                this.flashCacheSize(model.getFlashCacheSize());
            }
            if (model.wasPropertyExplicitlySet("pmemCacheLimit")) {
                this.pmemCacheLimit(model.getPmemCacheLimit());
            }
            if (model.wasPropertyExplicitlySet("pmemCacheMin")) {
                this.pmemCacheMin(model.getPmemCacheMin());
            }
            if (model.wasPropertyExplicitlySet("pmemCacheSize")) {
                this.pmemCacheSize(model.getPmemCacheSize());
            }
            if (model.wasPropertyExplicitlySet("asmCluster")) {
                this.asmCluster(model.getAsmCluster());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
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

    /** The name of a database or a profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of a database or a profile.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The relative priority of a database in the database plan. A higher share value implies higher
     * priority and more access to the I/O resources. Use either share or (level, allocation). All
     * plan directives in a database plan should use the same setting. Share-based resource
     * allocation is the recommended method for a database plan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("share")
    private final Integer share;

    /**
     * The relative priority of a database in the database plan. A higher share value implies higher
     * priority and more access to the I/O resources. Use either share or (level, allocation). All
     * plan directives in a database plan should use the same setting. Share-based resource
     * allocation is the recommended method for a database plan.
     *
     * @return the value
     */
    public Integer getShare() {
        return share;
    }

    /**
     * The allocation level. Valid values are from 1 to 8. Resources are allocated to level 1 first,
     * and then remaining resources are allocated to level 2, and so on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Integer level;

    /**
     * The allocation level. Valid values are from 1 to 8. Resources are allocated to level 1 first,
     * and then remaining resources are allocated to level 2, and so on.
     *
     * @return the value
     */
    public Integer getLevel() {
        return level;
    }

    /** The resource allocation as a percentage (0-100) within the level. */
    @com.fasterxml.jackson.annotation.JsonProperty("allocation")
    private final Integer allocation;

    /**
     * The resource allocation as a percentage (0-100) within the level.
     *
     * @return the value
     */
    public Integer getAllocation() {
        return allocation;
    }

    /** The maximum I/O utilization limit as a percentage of the available resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

    /**
     * The maximum I/O utilization limit as a percentage of the available resources.
     *
     * @return the value
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Controls use of Exadata Smart Flash Cache by a database. This ensures that cache space is
     * reserved for mission-critical databases. flashcache=off is invalid in a directive that
     * contains the flashcachemin, flashcachelimit, or flashcachesize attributes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlashCacheOn")
    private final Boolean isFlashCacheOn;

    /**
     * Controls use of Exadata Smart Flash Cache by a database. This ensures that cache space is
     * reserved for mission-critical databases. flashcache=off is invalid in a directive that
     * contains the flashcachemin, flashcachelimit, or flashcachesize attributes.
     *
     * @return the value
     */
    public Boolean getIsFlashCacheOn() {
        return isFlashCacheOn;
    }

    /**
     * Controls use of the persistent memory (PMEM) cache by a database. This ensures that cache
     * space is reserved for mission-critical databases. pmemcache=off is invalid in a directive
     * that contains the pmemcachemin, pmemcachelimit, or pmemcachesize attributes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPmemCacheOn")
    private final Boolean isPmemCacheOn;

    /**
     * Controls use of the persistent memory (PMEM) cache by a database. This ensures that cache
     * space is reserved for mission-critical databases. pmemcache=off is invalid in a directive
     * that contains the pmemcachemin, pmemcachelimit, or pmemcachesize attributes.
     *
     * @return the value
     */
    public Boolean getIsPmemCacheOn() {
        return isPmemCacheOn;
    }

    /**
     * Controls use of Exadata Smart Flash Log by a database. This ensures that Exadata Smart Flash
     * Log is reserved for mission-critical databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlashLogOn")
    private final Boolean isFlashLogOn;

    /**
     * Controls use of Exadata Smart Flash Log by a database. This ensures that Exadata Smart Flash
     * Log is reserved for mission-critical databases.
     *
     * @return the value
     */
    public Boolean getIsFlashLogOn() {
        return isFlashLogOn;
    }

    /**
     * Controls use of persistent memory logging (PMEM log) by a database. This ensures that PMEM
     * log is reserved for mission-critical databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPmemLogOn")
    private final Boolean isPmemLogOn;

    /**
     * Controls use of persistent memory logging (PMEM log) by a database. This ensures that PMEM
     * log is reserved for mission-critical databases.
     *
     * @return the value
     */
    public Boolean getIsPmemLogOn() {
        return isPmemLogOn;
    }

    /**
     * Defines a soft limit for space usage in Exadata Smart Flash Cache. If the cache is not full,
     * the limit can be exceeded. You specify the value for flashcachelimit in bytes. You can also
     * use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to specify larger values. For
     * example, 300M, 150G, or 1T. The value for flashcachelimit must be at least 4 MB. The
     * flashcachelimit and flashcachesize attributes cannot be specified in the same directive. The
     * value for flashcachelimit cannot be smaller than flashcachemin, if it is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
    private final String flashCacheLimit;

    /**
     * Defines a soft limit for space usage in Exadata Smart Flash Cache. If the cache is not full,
     * the limit can be exceeded. You specify the value for flashcachelimit in bytes. You can also
     * use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to specify larger values. For
     * example, 300M, 150G, or 1T. The value for flashcachelimit must be at least 4 MB. The
     * flashcachelimit and flashcachesize attributes cannot be specified in the same directive. The
     * value for flashcachelimit cannot be smaller than flashcachemin, if it is specified.
     *
     * @return the value
     */
    public String getFlashCacheLimit() {
        return flashCacheLimit;
    }

    /**
     * Specifies a minimum guaranteed space allocation in Exadata Smart Flash Cache. You specify the
     * value for flashcachemin in bytes. You can also use the suffixes M (megabytes), G (gigabytes),
     * or T (terabytes) to specify larger values. For example, 300M, 150G, or 1T. The value for
     * flashcachemin must be at least 4 MB. In any plan, the sum of all flashcachemin values cannot
     * exceed the size of Exadata Smart Flash Cache. If flashcachelimit is specified, then the value
     * for flashcachemin cannot exceed flashcachelimit. If flashcachesize is specified, then the
     * value for flashcachemin cannot exceed flashcachesize.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flashCacheMin")
    private final String flashCacheMin;

    /**
     * Specifies a minimum guaranteed space allocation in Exadata Smart Flash Cache. You specify the
     * value for flashcachemin in bytes. You can also use the suffixes M (megabytes), G (gigabytes),
     * or T (terabytes) to specify larger values. For example, 300M, 150G, or 1T. The value for
     * flashcachemin must be at least 4 MB. In any plan, the sum of all flashcachemin values cannot
     * exceed the size of Exadata Smart Flash Cache. If flashcachelimit is specified, then the value
     * for flashcachemin cannot exceed flashcachelimit. If flashcachesize is specified, then the
     * value for flashcachemin cannot exceed flashcachesize.
     *
     * @return the value
     */
    public String getFlashCacheMin() {
        return flashCacheMin;
    }

    /**
     * Defines a hard limit for space usage in Exadata Smart Flash Cache. The limit cannot be
     * exceeded, even if the cache is not full. In an IORM plan, if the size of Exadata Smart Flash
     * Cache can accommodate all of the flashcachemin and flashcachesize allocations, then each
     * flashcachesize definition represents a guaranteed space allocation. However, starting with
     * Oracle Exadata System Software release 19.2.0 you can use the flashcachesize attribute to
     * over-provision space in Exadata Smart Flash Cache. Consequently, if the size of Exadata Smart
     * Flash Cache cannot accommodate all of the flashcachemin and flashcachesize allocations, then
     * only flashcachemin is guaranteed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flashCacheSize")
    private final String flashCacheSize;

    /**
     * Defines a hard limit for space usage in Exadata Smart Flash Cache. The limit cannot be
     * exceeded, even if the cache is not full. In an IORM plan, if the size of Exadata Smart Flash
     * Cache can accommodate all of the flashcachemin and flashcachesize allocations, then each
     * flashcachesize definition represents a guaranteed space allocation. However, starting with
     * Oracle Exadata System Software release 19.2.0 you can use the flashcachesize attribute to
     * over-provision space in Exadata Smart Flash Cache. Consequently, if the size of Exadata Smart
     * Flash Cache cannot accommodate all of the flashcachemin and flashcachesize allocations, then
     * only flashcachemin is guaranteed.
     *
     * @return the value
     */
    public String getFlashCacheSize() {
        return flashCacheSize;
    }

    /**
     * Defines a soft limit for space usage in the persistent memory (PMEM) cache. If the cache is
     * not full, the limit can be exceeded. You specify the value for pmemcachelimit in bytes. You
     * can also use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to specify larger
     * values. For example, 300M, 150G, or 1T. The value for pmemcachelimit must be at least 4 MB.
     * The pmemcachelimit and pmemcachesize attributes cannot be specified in the same directive.
     * The value for pmemcachelimit cannot be smaller than pmemcachemin, if it is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pmemCacheLimit")
    private final String pmemCacheLimit;

    /**
     * Defines a soft limit for space usage in the persistent memory (PMEM) cache. If the cache is
     * not full, the limit can be exceeded. You specify the value for pmemcachelimit in bytes. You
     * can also use the suffixes M (megabytes), G (gigabytes), or T (terabytes) to specify larger
     * values. For example, 300M, 150G, or 1T. The value for pmemcachelimit must be at least 4 MB.
     * The pmemcachelimit and pmemcachesize attributes cannot be specified in the same directive.
     * The value for pmemcachelimit cannot be smaller than pmemcachemin, if it is specified.
     *
     * @return the value
     */
    public String getPmemCacheLimit() {
        return pmemCacheLimit;
    }

    /** Specifies a minimum guaranteed space allocation in the persistent memory (PMEM) cache. */
    @com.fasterxml.jackson.annotation.JsonProperty("pmemCacheMin")
    private final String pmemCacheMin;

    /**
     * Specifies a minimum guaranteed space allocation in the persistent memory (PMEM) cache.
     *
     * @return the value
     */
    public String getPmemCacheMin() {
        return pmemCacheMin;
    }

    /**
     * Defines a hard limit for space usage in the persistent memory (PMEM) cache. The limit cannot
     * be exceeded, even if the cache is not full. In an IORM plan, if the size of the PMEM cache
     * can accommodate all of the pmemcachemin and pmemcachesize allocations, then each
     * pmemcachesize definition represents a guaranteed space allocation. However, you can use the
     * pmemcachesize attribute to over-provision space in the PMEM cache. Consequently, if the PMEM
     * cache size cannot accommodate all of the pmemcachemin and pmemcachesize allocations, then
     * only pmemcachemin is guaranteed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pmemCacheSize")
    private final String pmemCacheSize;

    /**
     * Defines a hard limit for space usage in the persistent memory (PMEM) cache. The limit cannot
     * be exceeded, even if the cache is not full. In an IORM plan, if the size of the PMEM cache
     * can accommodate all of the pmemcachemin and pmemcachesize allocations, then each
     * pmemcachesize definition represents a guaranteed space allocation. However, you can use the
     * pmemcachesize attribute to over-provision space in the PMEM cache. Consequently, if the PMEM
     * cache size cannot accommodate all of the pmemcachemin and pmemcachesize allocations, then
     * only pmemcachemin is guaranteed.
     *
     * @return the value
     */
    public String getPmemCacheSize() {
        return pmemCacheSize;
    }

    /**
     * Starting with Oracle Exadata System Software release 19.1.0, you can use the asmcluster
     * attribute to distinguish between databases with the same name running in different Oracle ASM
     * clusters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asmCluster")
    private final String asmCluster;

    /**
     * Starting with Oracle Exadata System Software release 19.1.0, you can use the asmcluster
     * attribute to distinguish between databases with the same name running in different Oracle ASM
     * clusters.
     *
     * @return the value
     */
    public String getAsmCluster() {
        return asmCluster;
    }

    /**
     * Enables you to create a profile or template, to ease management and configuration of resource
     * plans in environments with many databases.
     *
     * <p>- type=database: Specifies a directive that applies to a specific database. If type in not
     * specified, then the directive defaults to the database type. - type=profile: Specifies a
     * directive that applies to a profile rather than a specific database.
     *
     * <p>To associate a database with an IORM profile, you must set the database initialization
     * parameter db_performance_profile to the value of the profile name. Databases that map to a
     * profile inherit the settings specified in the profile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DatabasePlanTypeEnum type;

    /**
     * Enables you to create a profile or template, to ease management and configuration of resource
     * plans in environments with many databases.
     *
     * <p>- type=database: Specifies a directive that applies to a specific database. If type in not
     * specified, then the directive defaults to the database type. - type=profile: Specifies a
     * directive that applies to a profile rather than a specific database.
     *
     * <p>To associate a database with an IORM profile, you must set the database initialization
     * parameter db_performance_profile to the value of the profile name. Databases that map to a
     * profile inherit the settings specified in the profile.
     *
     * @return the value
     */
    public DatabasePlanTypeEnum getType() {
        return type;
    }

    /**
     * Enables you to specify different plan directives based on the Oracle Data Guard database
     * role.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final DatabasePlanRoleEnum role;

    /**
     * Enables you to specify different plan directives based on the Oracle Data Guard database
     * role.
     *
     * @return the value
     */
    public DatabasePlanRoleEnum getRole() {
        return role;
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
        sb.append("DatabasePlanDirective(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", share=").append(String.valueOf(this.share));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", allocation=").append(String.valueOf(this.allocation));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", isFlashCacheOn=").append(String.valueOf(this.isFlashCacheOn));
        sb.append(", isPmemCacheOn=").append(String.valueOf(this.isPmemCacheOn));
        sb.append(", isFlashLogOn=").append(String.valueOf(this.isFlashLogOn));
        sb.append(", isPmemLogOn=").append(String.valueOf(this.isPmemLogOn));
        sb.append(", flashCacheLimit=").append(String.valueOf(this.flashCacheLimit));
        sb.append(", flashCacheMin=").append(String.valueOf(this.flashCacheMin));
        sb.append(", flashCacheSize=").append(String.valueOf(this.flashCacheSize));
        sb.append(", pmemCacheLimit=").append(String.valueOf(this.pmemCacheLimit));
        sb.append(", pmemCacheMin=").append(String.valueOf(this.pmemCacheMin));
        sb.append(", pmemCacheSize=").append(String.valueOf(this.pmemCacheSize));
        sb.append(", asmCluster=").append(String.valueOf(this.asmCluster));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabasePlanDirective)) {
            return false;
        }

        DatabasePlanDirective other = (DatabasePlanDirective) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.share, other.share)
                && java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.allocation, other.allocation)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.isFlashCacheOn, other.isFlashCacheOn)
                && java.util.Objects.equals(this.isPmemCacheOn, other.isPmemCacheOn)
                && java.util.Objects.equals(this.isFlashLogOn, other.isFlashLogOn)
                && java.util.Objects.equals(this.isPmemLogOn, other.isPmemLogOn)
                && java.util.Objects.equals(this.flashCacheLimit, other.flashCacheLimit)
                && java.util.Objects.equals(this.flashCacheMin, other.flashCacheMin)
                && java.util.Objects.equals(this.flashCacheSize, other.flashCacheSize)
                && java.util.Objects.equals(this.pmemCacheLimit, other.pmemCacheLimit)
                && java.util.Objects.equals(this.pmemCacheMin, other.pmemCacheMin)
                && java.util.Objects.equals(this.pmemCacheSize, other.pmemCacheSize)
                && java.util.Objects.equals(this.asmCluster, other.asmCluster)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.role, other.role)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.share == null ? 43 : this.share.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.allocation == null ? 43 : this.allocation.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.isFlashCacheOn == null ? 43 : this.isFlashCacheOn.hashCode());
        result =
                (result * PRIME)
                        + (this.isPmemCacheOn == null ? 43 : this.isPmemCacheOn.hashCode());
        result = (result * PRIME) + (this.isFlashLogOn == null ? 43 : this.isFlashLogOn.hashCode());
        result = (result * PRIME) + (this.isPmemLogOn == null ? 43 : this.isPmemLogOn.hashCode());
        result =
                (result * PRIME)
                        + (this.flashCacheLimit == null ? 43 : this.flashCacheLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.flashCacheMin == null ? 43 : this.flashCacheMin.hashCode());
        result =
                (result * PRIME)
                        + (this.flashCacheSize == null ? 43 : this.flashCacheSize.hashCode());
        result =
                (result * PRIME)
                        + (this.pmemCacheLimit == null ? 43 : this.pmemCacheLimit.hashCode());
        result = (result * PRIME) + (this.pmemCacheMin == null ? 43 : this.pmemCacheMin.hashCode());
        result =
                (result * PRIME)
                        + (this.pmemCacheSize == null ? 43 : this.pmemCacheSize.hashCode());
        result = (result * PRIME) + (this.asmCluster == null ? 43 : this.asmCluster.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
