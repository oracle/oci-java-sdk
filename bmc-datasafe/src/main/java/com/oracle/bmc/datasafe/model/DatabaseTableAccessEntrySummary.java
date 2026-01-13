/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of DatabaseTableAccessEntry Object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseTableAccessEntrySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseTableAccessEntrySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "grantee",
        "grantFromRole",
        "accessType",
        "tableSchema",
        "tableName",
        "privilegeType",
        "targetId",
        "accessThroughObject",
        "privilege",
        "privilegeGrantable",
        "columnName",
        "grantor",
        "areAllTablesAccessible",
        "isAccessConstrainedByView",
        "isAccessConstrainedByLabelSecurity",
        "isAccessConstrainedByDatabaseVault",
        "isAccessConstrainedByVirtualPrivateDatabase",
        "isAccessConstrainedByRedaction",
        "isAccessConstrainedByRealApplicationSecurity",
        "isAccessConstrainedBySqlFirewall",
        "isSensitive"
    })
    public DatabaseTableAccessEntrySummary(
            String key,
            String grantee,
            String grantFromRole,
            AccessType accessType,
            String tableSchema,
            String tableName,
            String privilegeType,
            String targetId,
            String accessThroughObject,
            PrivilegeName privilege,
            PrivilegeGrantableOption privilegeGrantable,
            String columnName,
            String grantor,
            Boolean areAllTablesAccessible,
            Boolean isAccessConstrainedByView,
            Boolean isAccessConstrainedByLabelSecurity,
            Boolean isAccessConstrainedByDatabaseVault,
            Boolean isAccessConstrainedByVirtualPrivateDatabase,
            Boolean isAccessConstrainedByRedaction,
            Boolean isAccessConstrainedByRealApplicationSecurity,
            Boolean isAccessConstrainedBySqlFirewall,
            Boolean isSensitive) {
        super();
        this.key = key;
        this.grantee = grantee;
        this.grantFromRole = grantFromRole;
        this.accessType = accessType;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.privilegeType = privilegeType;
        this.targetId = targetId;
        this.accessThroughObject = accessThroughObject;
        this.privilege = privilege;
        this.privilegeGrantable = privilegeGrantable;
        this.columnName = columnName;
        this.grantor = grantor;
        this.areAllTablesAccessible = areAllTablesAccessible;
        this.isAccessConstrainedByView = isAccessConstrainedByView;
        this.isAccessConstrainedByLabelSecurity = isAccessConstrainedByLabelSecurity;
        this.isAccessConstrainedByDatabaseVault = isAccessConstrainedByDatabaseVault;
        this.isAccessConstrainedByVirtualPrivateDatabase =
                isAccessConstrainedByVirtualPrivateDatabase;
        this.isAccessConstrainedByRedaction = isAccessConstrainedByRedaction;
        this.isAccessConstrainedByRealApplicationSecurity =
                isAccessConstrainedByRealApplicationSecurity;
        this.isAccessConstrainedBySqlFirewall = isAccessConstrainedBySqlFirewall;
        this.isSensitive = isSensitive;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies the table access report. It is numeric and unique within a
         * security policy report.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies the table access report. It is numeric and unique within a
         * security policy report.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Grantee is the user who can access the table */
        @com.fasterxml.jackson.annotation.JsonProperty("grantee")
        private String grantee;

        /**
         * Grantee is the user who can access the table
         *
         * @param grantee the value to set
         * @return this builder
         */
        public Builder grantee(String grantee) {
            this.grantee = grantee;
            this.__explicitlySet__.add("grantee");
            return this;
        }
        /**
         * This can be empty in case of direct grant, in case of indirect grant, this attribute
         * displays the name of the role which is granted to the user though which the user has
         * access to the table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grantFromRole")
        private String grantFromRole;

        /**
         * This can be empty in case of direct grant, in case of indirect grant, this attribute
         * displays the name of the role which is granted to the user though which the user has
         * access to the table.
         *
         * @param grantFromRole the value to set
         * @return this builder
         */
        public Builder grantFromRole(String grantFromRole) {
            this.grantFromRole = grantFromRole;
            this.__explicitlySet__.add("grantFromRole");
            return this;
        }
        /**
         * The type of the access the user has on the table, there can be one or more from SELECT,
         * UPDATE, INSERT, OWNER or DELETE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessType")
        private AccessType accessType;

        /**
         * The type of the access the user has on the table, there can be one or more from SELECT,
         * UPDATE, INSERT, OWNER or DELETE.
         *
         * @param accessType the value to set
         * @return this builder
         */
        public Builder accessType(AccessType accessType) {
            this.accessType = accessType;
            this.__explicitlySet__.add("accessType");
            return this;
        }
        /** Name of the schema the table belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("tableSchema")
        private String tableSchema;

        /**
         * Name of the schema the table belongs to.
         *
         * @param tableSchema the value to set
         * @return this builder
         */
        public Builder tableSchema(String tableSchema) {
            this.tableSchema = tableSchema;
            this.__explicitlySet__.add("tableSchema");
            return this;
        }
        /** Name of the database table the user has access to. */
        @com.fasterxml.jackson.annotation.JsonProperty("tableName")
        private String tableName;

        /**
         * Name of the database table the user has access to.
         *
         * @param tableName the value to set
         * @return this builder
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            this.__explicitlySet__.add("tableName");
            return this;
        }
        /**
         * Type of the privilege user has, this includes System Privilege, Schema Privilege, Object
         * Privilege, Column Privilege, Owner or Schema Privilege on a schema.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegeType")
        private String privilegeType;

        /**
         * Type of the privilege user has, this includes System Privilege, Schema Privilege, Object
         * Privilege, Column Privilege, Owner or Schema Privilege on a schema.
         *
         * @param privilegeType the value to set
         * @return this builder
         */
        public Builder privilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            this.__explicitlySet__.add("privilegeType");
            return this;
        }
        /** The OCID of the of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * A non-null value in this field indicates the object through which user has access to
         * table, possible values could be table or view.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessThroughObject")
        private String accessThroughObject;

        /**
         * A non-null value in this field indicates the object through which user has access to
         * table, possible values could be table or view.
         *
         * @param accessThroughObject the value to set
         * @return this builder
         */
        public Builder accessThroughObject(String accessThroughObject) {
            this.accessThroughObject = accessThroughObject;
            this.__explicitlySet__.add("accessThroughObject");
            return this;
        }
        /** Name of the privilege. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilege")
        private PrivilegeName privilege;

        /**
         * Name of the privilege.
         *
         * @param privilege the value to set
         * @return this builder
         */
        public Builder privilege(PrivilegeName privilege) {
            this.privilege = privilege;
            this.__explicitlySet__.add("privilege");
            return this;
        }
        /**
         * Whether grantee can grant this privilege to other users. Privileges can be granted to a
         * user or role with GRANT_OPTION or ADMIN_OPTION
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegeGrantable")
        private PrivilegeGrantableOption privilegeGrantable;

        /**
         * Whether grantee can grant this privilege to other users. Privileges can be granted to a
         * user or role with GRANT_OPTION or ADMIN_OPTION
         *
         * @param privilegeGrantable the value to set
         * @return this builder
         */
        public Builder privilegeGrantable(PrivilegeGrantableOption privilegeGrantable) {
            this.privilegeGrantable = privilegeGrantable;
            this.__explicitlySet__.add("privilegeGrantable");
            return this;
        }
        /** If there are column level privileges on a table or view. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * If there are column level privileges on a table or view.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** The one who granted this privilege. */
        @com.fasterxml.jackson.annotation.JsonProperty("grantor")
        private String grantor;

        /**
         * The one who granted this privilege.
         *
         * @param grantor the value to set
         * @return this builder
         */
        public Builder grantor(String grantor) {
            this.grantor = grantor;
            this.__explicitlySet__.add("grantor");
            return this;
        }
        /** Indicates whether the user has access to all the tables in the schema. */
        @com.fasterxml.jackson.annotation.JsonProperty("areAllTablesAccessible")
        private Boolean areAllTablesAccessible;

        /**
         * Indicates whether the user has access to all the tables in the schema.
         *
         * @param areAllTablesAccessible the value to set
         * @return this builder
         */
        public Builder areAllTablesAccessible(Boolean areAllTablesAccessible) {
            this.areAllTablesAccessible = areAllTablesAccessible;
            this.__explicitlySet__.add("areAllTablesAccessible");
            return this;
        }
        /** Indicates whether the access is constrained on a table via a view. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByView")
        private Boolean isAccessConstrainedByView;

        /**
         * Indicates whether the access is constrained on a table via a view.
         *
         * @param isAccessConstrainedByView the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedByView(Boolean isAccessConstrainedByView) {
            this.isAccessConstrainedByView = isAccessConstrainedByView;
            this.__explicitlySet__.add("isAccessConstrainedByView");
            return this;
        }
        /** Indicates whether the table access is constrained via Oracle Label Security. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByLabelSecurity")
        private Boolean isAccessConstrainedByLabelSecurity;

        /**
         * Indicates whether the table access is constrained via Oracle Label Security.
         *
         * @param isAccessConstrainedByLabelSecurity the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedByLabelSecurity(
                Boolean isAccessConstrainedByLabelSecurity) {
            this.isAccessConstrainedByLabelSecurity = isAccessConstrainedByLabelSecurity;
            this.__explicitlySet__.add("isAccessConstrainedByLabelSecurity");
            return this;
        }
        /** Indicates whether the table access is constrained via Oracle Database Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByDatabaseVault")
        private Boolean isAccessConstrainedByDatabaseVault;

        /**
         * Indicates whether the table access is constrained via Oracle Database Vault.
         *
         * @param isAccessConstrainedByDatabaseVault the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedByDatabaseVault(
                Boolean isAccessConstrainedByDatabaseVault) {
            this.isAccessConstrainedByDatabaseVault = isAccessConstrainedByDatabaseVault;
            this.__explicitlySet__.add("isAccessConstrainedByDatabaseVault");
            return this;
        }
        /** Indicates whether the table access is constrained via Virtual Private Database. */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isAccessConstrainedByVirtualPrivateDatabase")
        private Boolean isAccessConstrainedByVirtualPrivateDatabase;

        /**
         * Indicates whether the table access is constrained via Virtual Private Database.
         *
         * @param isAccessConstrainedByVirtualPrivateDatabase the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedByVirtualPrivateDatabase(
                Boolean isAccessConstrainedByVirtualPrivateDatabase) {
            this.isAccessConstrainedByVirtualPrivateDatabase =
                    isAccessConstrainedByVirtualPrivateDatabase;
            this.__explicitlySet__.add("isAccessConstrainedByVirtualPrivateDatabase");
            return this;
        }
        /** Indicates whether the table access is constrained via Oracle Data Redaction. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByRedaction")
        private Boolean isAccessConstrainedByRedaction;

        /**
         * Indicates whether the table access is constrained via Oracle Data Redaction.
         *
         * @param isAccessConstrainedByRedaction the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedByRedaction(Boolean isAccessConstrainedByRedaction) {
            this.isAccessConstrainedByRedaction = isAccessConstrainedByRedaction;
            this.__explicitlySet__.add("isAccessConstrainedByRedaction");
            return this;
        }
        /** Indicates whether the table access is constrained via Real Application Security. */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "isAccessConstrainedByRealApplicationSecurity")
        private Boolean isAccessConstrainedByRealApplicationSecurity;

        /**
         * Indicates whether the table access is constrained via Real Application Security.
         *
         * @param isAccessConstrainedByRealApplicationSecurity the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedByRealApplicationSecurity(
                Boolean isAccessConstrainedByRealApplicationSecurity) {
            this.isAccessConstrainedByRealApplicationSecurity =
                    isAccessConstrainedByRealApplicationSecurity;
            this.__explicitlySet__.add("isAccessConstrainedByRealApplicationSecurity");
            return this;
        }
        /** Indicates whether the table access is constrained via Oracle Database SQL Firewall. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedBySqlFirewall")
        private Boolean isAccessConstrainedBySqlFirewall;

        /**
         * Indicates whether the table access is constrained via Oracle Database SQL Firewall.
         *
         * @param isAccessConstrainedBySqlFirewall the value to set
         * @return this builder
         */
        public Builder isAccessConstrainedBySqlFirewall(Boolean isAccessConstrainedBySqlFirewall) {
            this.isAccessConstrainedBySqlFirewall = isAccessConstrainedBySqlFirewall;
            this.__explicitlySet__.add("isAccessConstrainedBySqlFirewall");
            return this;
        }
        /** Indicates whether the table is marked as sensitive. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * Indicates whether the table is marked as sensitive.
         *
         * @param isSensitive the value to set
         * @return this builder
         */
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseTableAccessEntrySummary build() {
            DatabaseTableAccessEntrySummary model =
                    new DatabaseTableAccessEntrySummary(
                            this.key,
                            this.grantee,
                            this.grantFromRole,
                            this.accessType,
                            this.tableSchema,
                            this.tableName,
                            this.privilegeType,
                            this.targetId,
                            this.accessThroughObject,
                            this.privilege,
                            this.privilegeGrantable,
                            this.columnName,
                            this.grantor,
                            this.areAllTablesAccessible,
                            this.isAccessConstrainedByView,
                            this.isAccessConstrainedByLabelSecurity,
                            this.isAccessConstrainedByDatabaseVault,
                            this.isAccessConstrainedByVirtualPrivateDatabase,
                            this.isAccessConstrainedByRedaction,
                            this.isAccessConstrainedByRealApplicationSecurity,
                            this.isAccessConstrainedBySqlFirewall,
                            this.isSensitive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseTableAccessEntrySummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("grantee")) {
                this.grantee(model.getGrantee());
            }
            if (model.wasPropertyExplicitlySet("grantFromRole")) {
                this.grantFromRole(model.getGrantFromRole());
            }
            if (model.wasPropertyExplicitlySet("accessType")) {
                this.accessType(model.getAccessType());
            }
            if (model.wasPropertyExplicitlySet("tableSchema")) {
                this.tableSchema(model.getTableSchema());
            }
            if (model.wasPropertyExplicitlySet("tableName")) {
                this.tableName(model.getTableName());
            }
            if (model.wasPropertyExplicitlySet("privilegeType")) {
                this.privilegeType(model.getPrivilegeType());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("accessThroughObject")) {
                this.accessThroughObject(model.getAccessThroughObject());
            }
            if (model.wasPropertyExplicitlySet("privilege")) {
                this.privilege(model.getPrivilege());
            }
            if (model.wasPropertyExplicitlySet("privilegeGrantable")) {
                this.privilegeGrantable(model.getPrivilegeGrantable());
            }
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("grantor")) {
                this.grantor(model.getGrantor());
            }
            if (model.wasPropertyExplicitlySet("areAllTablesAccessible")) {
                this.areAllTablesAccessible(model.getAreAllTablesAccessible());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedByView")) {
                this.isAccessConstrainedByView(model.getIsAccessConstrainedByView());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedByLabelSecurity")) {
                this.isAccessConstrainedByLabelSecurity(
                        model.getIsAccessConstrainedByLabelSecurity());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedByDatabaseVault")) {
                this.isAccessConstrainedByDatabaseVault(
                        model.getIsAccessConstrainedByDatabaseVault());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedByVirtualPrivateDatabase")) {
                this.isAccessConstrainedByVirtualPrivateDatabase(
                        model.getIsAccessConstrainedByVirtualPrivateDatabase());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedByRedaction")) {
                this.isAccessConstrainedByRedaction(model.getIsAccessConstrainedByRedaction());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedByRealApplicationSecurity")) {
                this.isAccessConstrainedByRealApplicationSecurity(
                        model.getIsAccessConstrainedByRealApplicationSecurity());
            }
            if (model.wasPropertyExplicitlySet("isAccessConstrainedBySqlFirewall")) {
                this.isAccessConstrainedBySqlFirewall(model.getIsAccessConstrainedBySqlFirewall());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
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
     * The unique key that identifies the table access report. It is numeric and unique within a
     * security policy report.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies the table access report. It is numeric and unique within a
     * security policy report.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Grantee is the user who can access the table */
    @com.fasterxml.jackson.annotation.JsonProperty("grantee")
    private final String grantee;

    /**
     * Grantee is the user who can access the table
     *
     * @return the value
     */
    public String getGrantee() {
        return grantee;
    }

    /**
     * This can be empty in case of direct grant, in case of indirect grant, this attribute displays
     * the name of the role which is granted to the user though which the user has access to the
     * table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grantFromRole")
    private final String grantFromRole;

    /**
     * This can be empty in case of direct grant, in case of indirect grant, this attribute displays
     * the name of the role which is granted to the user though which the user has access to the
     * table.
     *
     * @return the value
     */
    public String getGrantFromRole() {
        return grantFromRole;
    }

    /**
     * The type of the access the user has on the table, there can be one or more from SELECT,
     * UPDATE, INSERT, OWNER or DELETE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessType")
    private final AccessType accessType;

    /**
     * The type of the access the user has on the table, there can be one or more from SELECT,
     * UPDATE, INSERT, OWNER or DELETE.
     *
     * @return the value
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /** Name of the schema the table belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableSchema")
    private final String tableSchema;

    /**
     * Name of the schema the table belongs to.
     *
     * @return the value
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /** Name of the database table the user has access to. */
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

    /**
     * Name of the database table the user has access to.
     *
     * @return the value
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Type of the privilege user has, this includes System Privilege, Schema Privilege, Object
     * Privilege, Column Privilege, Owner or Schema Privilege on a schema.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeType")
    private final String privilegeType;

    /**
     * Type of the privilege user has, this includes System Privilege, Schema Privilege, Object
     * Privilege, Column Privilege, Owner or Schema Privilege on a schema.
     *
     * @return the value
     */
    public String getPrivilegeType() {
        return privilegeType;
    }

    /** The OCID of the of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * A non-null value in this field indicates the object through which user has access to table,
     * possible values could be table or view.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessThroughObject")
    private final String accessThroughObject;

    /**
     * A non-null value in this field indicates the object through which user has access to table,
     * possible values could be table or view.
     *
     * @return the value
     */
    public String getAccessThroughObject() {
        return accessThroughObject;
    }

    /** Name of the privilege. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilege")
    private final PrivilegeName privilege;

    /**
     * Name of the privilege.
     *
     * @return the value
     */
    public PrivilegeName getPrivilege() {
        return privilege;
    }

    /**
     * Whether grantee can grant this privilege to other users. Privileges can be granted to a user
     * or role with GRANT_OPTION or ADMIN_OPTION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeGrantable")
    private final PrivilegeGrantableOption privilegeGrantable;

    /**
     * Whether grantee can grant this privilege to other users. Privileges can be granted to a user
     * or role with GRANT_OPTION or ADMIN_OPTION
     *
     * @return the value
     */
    public PrivilegeGrantableOption getPrivilegeGrantable() {
        return privilegeGrantable;
    }

    /** If there are column level privileges on a table or view. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * If there are column level privileges on a table or view.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** The one who granted this privilege. */
    @com.fasterxml.jackson.annotation.JsonProperty("grantor")
    private final String grantor;

    /**
     * The one who granted this privilege.
     *
     * @return the value
     */
    public String getGrantor() {
        return grantor;
    }

    /** Indicates whether the user has access to all the tables in the schema. */
    @com.fasterxml.jackson.annotation.JsonProperty("areAllTablesAccessible")
    private final Boolean areAllTablesAccessible;

    /**
     * Indicates whether the user has access to all the tables in the schema.
     *
     * @return the value
     */
    public Boolean getAreAllTablesAccessible() {
        return areAllTablesAccessible;
    }

    /** Indicates whether the access is constrained on a table via a view. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByView")
    private final Boolean isAccessConstrainedByView;

    /**
     * Indicates whether the access is constrained on a table via a view.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedByView() {
        return isAccessConstrainedByView;
    }

    /** Indicates whether the table access is constrained via Oracle Label Security. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByLabelSecurity")
    private final Boolean isAccessConstrainedByLabelSecurity;

    /**
     * Indicates whether the table access is constrained via Oracle Label Security.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedByLabelSecurity() {
        return isAccessConstrainedByLabelSecurity;
    }

    /** Indicates whether the table access is constrained via Oracle Database Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByDatabaseVault")
    private final Boolean isAccessConstrainedByDatabaseVault;

    /**
     * Indicates whether the table access is constrained via Oracle Database Vault.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedByDatabaseVault() {
        return isAccessConstrainedByDatabaseVault;
    }

    /** Indicates whether the table access is constrained via Virtual Private Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByVirtualPrivateDatabase")
    private final Boolean isAccessConstrainedByVirtualPrivateDatabase;

    /**
     * Indicates whether the table access is constrained via Virtual Private Database.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedByVirtualPrivateDatabase() {
        return isAccessConstrainedByVirtualPrivateDatabase;
    }

    /** Indicates whether the table access is constrained via Oracle Data Redaction. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByRedaction")
    private final Boolean isAccessConstrainedByRedaction;

    /**
     * Indicates whether the table access is constrained via Oracle Data Redaction.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedByRedaction() {
        return isAccessConstrainedByRedaction;
    }

    /** Indicates whether the table access is constrained via Real Application Security. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedByRealApplicationSecurity")
    private final Boolean isAccessConstrainedByRealApplicationSecurity;

    /**
     * Indicates whether the table access is constrained via Real Application Security.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedByRealApplicationSecurity() {
        return isAccessConstrainedByRealApplicationSecurity;
    }

    /** Indicates whether the table access is constrained via Oracle Database SQL Firewall. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessConstrainedBySqlFirewall")
    private final Boolean isAccessConstrainedBySqlFirewall;

    /**
     * Indicates whether the table access is constrained via Oracle Database SQL Firewall.
     *
     * @return the value
     */
    public Boolean getIsAccessConstrainedBySqlFirewall() {
        return isAccessConstrainedBySqlFirewall;
    }

    /** Indicates whether the table is marked as sensitive. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * Indicates whether the table is marked as sensitive.
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
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
        sb.append("DatabaseTableAccessEntrySummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", grantee=").append(String.valueOf(this.grantee));
        sb.append(", grantFromRole=").append(String.valueOf(this.grantFromRole));
        sb.append(", accessType=").append(String.valueOf(this.accessType));
        sb.append(", tableSchema=").append(String.valueOf(this.tableSchema));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", privilegeType=").append(String.valueOf(this.privilegeType));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", accessThroughObject=").append(String.valueOf(this.accessThroughObject));
        sb.append(", privilege=").append(String.valueOf(this.privilege));
        sb.append(", privilegeGrantable=").append(String.valueOf(this.privilegeGrantable));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", grantor=").append(String.valueOf(this.grantor));
        sb.append(", areAllTablesAccessible=").append(String.valueOf(this.areAllTablesAccessible));
        sb.append(", isAccessConstrainedByView=")
                .append(String.valueOf(this.isAccessConstrainedByView));
        sb.append(", isAccessConstrainedByLabelSecurity=")
                .append(String.valueOf(this.isAccessConstrainedByLabelSecurity));
        sb.append(", isAccessConstrainedByDatabaseVault=")
                .append(String.valueOf(this.isAccessConstrainedByDatabaseVault));
        sb.append(", isAccessConstrainedByVirtualPrivateDatabase=")
                .append(String.valueOf(this.isAccessConstrainedByVirtualPrivateDatabase));
        sb.append(", isAccessConstrainedByRedaction=")
                .append(String.valueOf(this.isAccessConstrainedByRedaction));
        sb.append(", isAccessConstrainedByRealApplicationSecurity=")
                .append(String.valueOf(this.isAccessConstrainedByRealApplicationSecurity));
        sb.append(", isAccessConstrainedBySqlFirewall=")
                .append(String.valueOf(this.isAccessConstrainedBySqlFirewall));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseTableAccessEntrySummary)) {
            return false;
        }

        DatabaseTableAccessEntrySummary other = (DatabaseTableAccessEntrySummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.grantee, other.grantee)
                && java.util.Objects.equals(this.grantFromRole, other.grantFromRole)
                && java.util.Objects.equals(this.accessType, other.accessType)
                && java.util.Objects.equals(this.tableSchema, other.tableSchema)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.privilegeType, other.privilegeType)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.accessThroughObject, other.accessThroughObject)
                && java.util.Objects.equals(this.privilege, other.privilege)
                && java.util.Objects.equals(this.privilegeGrantable, other.privilegeGrantable)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.grantor, other.grantor)
                && java.util.Objects.equals(
                        this.areAllTablesAccessible, other.areAllTablesAccessible)
                && java.util.Objects.equals(
                        this.isAccessConstrainedByView, other.isAccessConstrainedByView)
                && java.util.Objects.equals(
                        this.isAccessConstrainedByLabelSecurity,
                        other.isAccessConstrainedByLabelSecurity)
                && java.util.Objects.equals(
                        this.isAccessConstrainedByDatabaseVault,
                        other.isAccessConstrainedByDatabaseVault)
                && java.util.Objects.equals(
                        this.isAccessConstrainedByVirtualPrivateDatabase,
                        other.isAccessConstrainedByVirtualPrivateDatabase)
                && java.util.Objects.equals(
                        this.isAccessConstrainedByRedaction, other.isAccessConstrainedByRedaction)
                && java.util.Objects.equals(
                        this.isAccessConstrainedByRealApplicationSecurity,
                        other.isAccessConstrainedByRealApplicationSecurity)
                && java.util.Objects.equals(
                        this.isAccessConstrainedBySqlFirewall,
                        other.isAccessConstrainedBySqlFirewall)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result =
                (result * PRIME)
                        + (this.grantFromRole == null ? 43 : this.grantFromRole.hashCode());
        result = (result * PRIME) + (this.accessType == null ? 43 : this.accessType.hashCode());
        result = (result * PRIME) + (this.tableSchema == null ? 43 : this.tableSchema.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeType == null ? 43 : this.privilegeType.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.accessThroughObject == null
                                ? 43
                                : this.accessThroughObject.hashCode());
        result = (result * PRIME) + (this.privilege == null ? 43 : this.privilege.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeGrantable == null
                                ? 43
                                : this.privilegeGrantable.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.grantor == null ? 43 : this.grantor.hashCode());
        result =
                (result * PRIME)
                        + (this.areAllTablesAccessible == null
                                ? 43
                                : this.areAllTablesAccessible.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedByView == null
                                ? 43
                                : this.isAccessConstrainedByView.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedByLabelSecurity == null
                                ? 43
                                : this.isAccessConstrainedByLabelSecurity.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedByDatabaseVault == null
                                ? 43
                                : this.isAccessConstrainedByDatabaseVault.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedByVirtualPrivateDatabase == null
                                ? 43
                                : this.isAccessConstrainedByVirtualPrivateDatabase.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedByRedaction == null
                                ? 43
                                : this.isAccessConstrainedByRedaction.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedByRealApplicationSecurity == null
                                ? 43
                                : this.isAccessConstrainedByRealApplicationSecurity.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessConstrainedBySqlFirewall == null
                                ? 43
                                : this.isAccessConstrainedBySqlFirewall.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
