/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of database security feature usage available on a given compartment. <br>
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
        builder = SecurityFeatureSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityFeatureSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "targetId",
        "assessmentId",
        "unifiedAudit",
        "fineGrainedAudit",
        "traditionalAudit",
        "databaseVault",
        "privilegeAnalysis",
        "tablespaceEncryption",
        "columnEncryption",
        "networkEncryption",
        "passwordAuthentication",
        "globalAuthentication",
        "externalAuthentication",
        "freeformTags",
        "definedTags"
    })
    public SecurityFeatureSummary(
            String compartmentId,
            String targetId,
            String assessmentId,
            UnifiedAudit unifiedAudit,
            FineGrainedAudit fineGrainedAudit,
            TraditionalAudit traditionalAudit,
            DatabaseVault databaseVault,
            PrivilegeAnalysis privilegeAnalysis,
            TablespaceEncryption tablespaceEncryption,
            ColumnEncryption columnEncryption,
            NetworkEncryption networkEncryption,
            PasswordAuthentication passwordAuthentication,
            GlobalAuthentication globalAuthentication,
            ExternalAuthentication externalAuthentication,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.assessmentId = assessmentId;
        this.unifiedAudit = unifiedAudit;
        this.fineGrainedAudit = fineGrainedAudit;
        this.traditionalAudit = traditionalAudit;
        this.databaseVault = databaseVault;
        this.privilegeAnalysis = privilegeAnalysis;
        this.tablespaceEncryption = tablespaceEncryption;
        this.columnEncryption = columnEncryption;
        this.networkEncryption = networkEncryption;
        this.passwordAuthentication = passwordAuthentication;
        this.globalAuthentication = globalAuthentication;
        this.externalAuthentication = externalAuthentication;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The OCID of the assessment that generates this security feature usage result. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * The OCID of the assessment that generates this security feature usage result.
         *
         * @param assessmentId the value to set
         * @return this builder
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }
        /** The usage of security feature - Unified Audit. */
        @com.fasterxml.jackson.annotation.JsonProperty("unifiedAudit")
        private UnifiedAudit unifiedAudit;

        /**
         * The usage of security feature - Unified Audit.
         *
         * @param unifiedAudit the value to set
         * @return this builder
         */
        public Builder unifiedAudit(UnifiedAudit unifiedAudit) {
            this.unifiedAudit = unifiedAudit;
            this.__explicitlySet__.add("unifiedAudit");
            return this;
        }
        /** The usage of security feature - Fine Grained Audit. */
        @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAudit")
        private FineGrainedAudit fineGrainedAudit;

        /**
         * The usage of security feature - Fine Grained Audit.
         *
         * @param fineGrainedAudit the value to set
         * @return this builder
         */
        public Builder fineGrainedAudit(FineGrainedAudit fineGrainedAudit) {
            this.fineGrainedAudit = fineGrainedAudit;
            this.__explicitlySet__.add("fineGrainedAudit");
            return this;
        }
        /** The usage of security feature - Traditional Audit. */
        @com.fasterxml.jackson.annotation.JsonProperty("traditionalAudit")
        private TraditionalAudit traditionalAudit;

        /**
         * The usage of security feature - Traditional Audit.
         *
         * @param traditionalAudit the value to set
         * @return this builder
         */
        public Builder traditionalAudit(TraditionalAudit traditionalAudit) {
            this.traditionalAudit = traditionalAudit;
            this.__explicitlySet__.add("traditionalAudit");
            return this;
        }
        /** The usage of security feature - Database Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVault")
        private DatabaseVault databaseVault;

        /**
         * The usage of security feature - Database Vault.
         *
         * @param databaseVault the value to set
         * @return this builder
         */
        public Builder databaseVault(DatabaseVault databaseVault) {
            this.databaseVault = databaseVault;
            this.__explicitlySet__.add("databaseVault");
            return this;
        }
        /** The usage of security feature - Privilege Analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegeAnalysis")
        private PrivilegeAnalysis privilegeAnalysis;

        /**
         * The usage of security feature - Privilege Analysis.
         *
         * @param privilegeAnalysis the value to set
         * @return this builder
         */
        public Builder privilegeAnalysis(PrivilegeAnalysis privilegeAnalysis) {
            this.privilegeAnalysis = privilegeAnalysis;
            this.__explicitlySet__.add("privilegeAnalysis");
            return this;
        }
        /** The usage of security feature - Tablespace Encryption. */
        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceEncryption")
        private TablespaceEncryption tablespaceEncryption;

        /**
         * The usage of security feature - Tablespace Encryption.
         *
         * @param tablespaceEncryption the value to set
         * @return this builder
         */
        public Builder tablespaceEncryption(TablespaceEncryption tablespaceEncryption) {
            this.tablespaceEncryption = tablespaceEncryption;
            this.__explicitlySet__.add("tablespaceEncryption");
            return this;
        }
        /** The usage of security feature - Column Encryption. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnEncryption")
        private ColumnEncryption columnEncryption;

        /**
         * The usage of security feature - Column Encryption.
         *
         * @param columnEncryption the value to set
         * @return this builder
         */
        public Builder columnEncryption(ColumnEncryption columnEncryption) {
            this.columnEncryption = columnEncryption;
            this.__explicitlySet__.add("columnEncryption");
            return this;
        }
        /** The usage of security feature - Network Encryption. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkEncryption")
        private NetworkEncryption networkEncryption;

        /**
         * The usage of security feature - Network Encryption.
         *
         * @param networkEncryption the value to set
         * @return this builder
         */
        public Builder networkEncryption(NetworkEncryption networkEncryption) {
            this.networkEncryption = networkEncryption;
            this.__explicitlySet__.add("networkEncryption");
            return this;
        }
        /** The usage of security feature - Password Authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordAuthentication")
        private PasswordAuthentication passwordAuthentication;

        /**
         * The usage of security feature - Password Authentication.
         *
         * @param passwordAuthentication the value to set
         * @return this builder
         */
        public Builder passwordAuthentication(PasswordAuthentication passwordAuthentication) {
            this.passwordAuthentication = passwordAuthentication;
            this.__explicitlySet__.add("passwordAuthentication");
            return this;
        }
        /** The usage of security feature - Global Authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("globalAuthentication")
        private GlobalAuthentication globalAuthentication;

        /**
         * The usage of security feature - Global Authentication.
         *
         * @param globalAuthentication the value to set
         * @return this builder
         */
        public Builder globalAuthentication(GlobalAuthentication globalAuthentication) {
            this.globalAuthentication = globalAuthentication;
            this.__explicitlySet__.add("globalAuthentication");
            return this;
        }
        /** The usage of security feature - External Authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalAuthentication")
        private ExternalAuthentication externalAuthentication;

        /**
         * The usage of security feature - External Authentication.
         *
         * @param externalAuthentication the value to set
         * @return this builder
         */
        public Builder externalAuthentication(ExternalAuthentication externalAuthentication) {
            this.externalAuthentication = externalAuthentication;
            this.__explicitlySet__.add("externalAuthentication");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityFeatureSummary build() {
            SecurityFeatureSummary model =
                    new SecurityFeatureSummary(
                            this.compartmentId,
                            this.targetId,
                            this.assessmentId,
                            this.unifiedAudit,
                            this.fineGrainedAudit,
                            this.traditionalAudit,
                            this.databaseVault,
                            this.privilegeAnalysis,
                            this.tablespaceEncryption,
                            this.columnEncryption,
                            this.networkEncryption,
                            this.passwordAuthentication,
                            this.globalAuthentication,
                            this.externalAuthentication,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityFeatureSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("unifiedAudit")) {
                this.unifiedAudit(model.getUnifiedAudit());
            }
            if (model.wasPropertyExplicitlySet("fineGrainedAudit")) {
                this.fineGrainedAudit(model.getFineGrainedAudit());
            }
            if (model.wasPropertyExplicitlySet("traditionalAudit")) {
                this.traditionalAudit(model.getTraditionalAudit());
            }
            if (model.wasPropertyExplicitlySet("databaseVault")) {
                this.databaseVault(model.getDatabaseVault());
            }
            if (model.wasPropertyExplicitlySet("privilegeAnalysis")) {
                this.privilegeAnalysis(model.getPrivilegeAnalysis());
            }
            if (model.wasPropertyExplicitlySet("tablespaceEncryption")) {
                this.tablespaceEncryption(model.getTablespaceEncryption());
            }
            if (model.wasPropertyExplicitlySet("columnEncryption")) {
                this.columnEncryption(model.getColumnEncryption());
            }
            if (model.wasPropertyExplicitlySet("networkEncryption")) {
                this.networkEncryption(model.getNetworkEncryption());
            }
            if (model.wasPropertyExplicitlySet("passwordAuthentication")) {
                this.passwordAuthentication(model.getPasswordAuthentication());
            }
            if (model.wasPropertyExplicitlySet("globalAuthentication")) {
                this.globalAuthentication(model.getGlobalAuthentication());
            }
            if (model.wasPropertyExplicitlySet("externalAuthentication")) {
                this.externalAuthentication(model.getExternalAuthentication());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The OCID of the assessment that generates this security feature usage result. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * The OCID of the assessment that generates this security feature usage result.
     *
     * @return the value
     */
    public String getAssessmentId() {
        return assessmentId;
    }

    /** The usage of security feature - Unified Audit. */
    public enum UnifiedAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UnifiedAudit.class);

        private final String value;
        private static java.util.Map<String, UnifiedAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (UnifiedAudit v : UnifiedAudit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UnifiedAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UnifiedAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UnifiedAudit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Unified Audit. */
    @com.fasterxml.jackson.annotation.JsonProperty("unifiedAudit")
    private final UnifiedAudit unifiedAudit;

    /**
     * The usage of security feature - Unified Audit.
     *
     * @return the value
     */
    public UnifiedAudit getUnifiedAudit() {
        return unifiedAudit;
    }

    /** The usage of security feature - Fine Grained Audit. */
    public enum FineGrainedAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FineGrainedAudit.class);

        private final String value;
        private static java.util.Map<String, FineGrainedAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (FineGrainedAudit v : FineGrainedAudit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FineGrainedAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FineGrainedAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FineGrainedAudit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Fine Grained Audit. */
    @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAudit")
    private final FineGrainedAudit fineGrainedAudit;

    /**
     * The usage of security feature - Fine Grained Audit.
     *
     * @return the value
     */
    public FineGrainedAudit getFineGrainedAudit() {
        return fineGrainedAudit;
    }

    /** The usage of security feature - Traditional Audit. */
    public enum TraditionalAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TraditionalAudit.class);

        private final String value;
        private static java.util.Map<String, TraditionalAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (TraditionalAudit v : TraditionalAudit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TraditionalAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TraditionalAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TraditionalAudit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Traditional Audit. */
    @com.fasterxml.jackson.annotation.JsonProperty("traditionalAudit")
    private final TraditionalAudit traditionalAudit;

    /**
     * The usage of security feature - Traditional Audit.
     *
     * @return the value
     */
    public TraditionalAudit getTraditionalAudit() {
        return traditionalAudit;
    }

    /** The usage of security feature - Database Vault. */
    public enum DatabaseVault implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseVault.class);

        private final String value;
        private static java.util.Map<String, DatabaseVault> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseVault v : DatabaseVault.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseVault(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseVault create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseVault', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Database Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVault")
    private final DatabaseVault databaseVault;

    /**
     * The usage of security feature - Database Vault.
     *
     * @return the value
     */
    public DatabaseVault getDatabaseVault() {
        return databaseVault;
    }

    /** The usage of security feature - Privilege Analysis. */
    public enum PrivilegeAnalysis implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PrivilegeAnalysis.class);

        private final String value;
        private static java.util.Map<String, PrivilegeAnalysis> map;

        static {
            map = new java.util.HashMap<>();
            for (PrivilegeAnalysis v : PrivilegeAnalysis.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrivilegeAnalysis(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrivilegeAnalysis create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrivilegeAnalysis', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Privilege Analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegeAnalysis")
    private final PrivilegeAnalysis privilegeAnalysis;

    /**
     * The usage of security feature - Privilege Analysis.
     *
     * @return the value
     */
    public PrivilegeAnalysis getPrivilegeAnalysis() {
        return privilegeAnalysis;
    }

    /** The usage of security feature - Tablespace Encryption. */
    public enum TablespaceEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TablespaceEncryption.class);

        private final String value;
        private static java.util.Map<String, TablespaceEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (TablespaceEncryption v : TablespaceEncryption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TablespaceEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TablespaceEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TablespaceEncryption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Tablespace Encryption. */
    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceEncryption")
    private final TablespaceEncryption tablespaceEncryption;

    /**
     * The usage of security feature - Tablespace Encryption.
     *
     * @return the value
     */
    public TablespaceEncryption getTablespaceEncryption() {
        return tablespaceEncryption;
    }

    /** The usage of security feature - Column Encryption. */
    public enum ColumnEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ColumnEncryption.class);

        private final String value;
        private static java.util.Map<String, ColumnEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (ColumnEncryption v : ColumnEncryption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ColumnEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ColumnEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ColumnEncryption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Column Encryption. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnEncryption")
    private final ColumnEncryption columnEncryption;

    /**
     * The usage of security feature - Column Encryption.
     *
     * @return the value
     */
    public ColumnEncryption getColumnEncryption() {
        return columnEncryption;
    }

    /** The usage of security feature - Network Encryption. */
    public enum NetworkEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkEncryption.class);

        private final String value;
        private static java.util.Map<String, NetworkEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkEncryption v : NetworkEncryption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkEncryption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Network Encryption. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkEncryption")
    private final NetworkEncryption networkEncryption;

    /**
     * The usage of security feature - Network Encryption.
     *
     * @return the value
     */
    public NetworkEncryption getNetworkEncryption() {
        return networkEncryption;
    }

    /** The usage of security feature - Password Authentication. */
    public enum PasswordAuthentication implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PasswordAuthentication.class);

        private final String value;
        private static java.util.Map<String, PasswordAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (PasswordAuthentication v : PasswordAuthentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PasswordAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PasswordAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PasswordAuthentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Password Authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordAuthentication")
    private final PasswordAuthentication passwordAuthentication;

    /**
     * The usage of security feature - Password Authentication.
     *
     * @return the value
     */
    public PasswordAuthentication getPasswordAuthentication() {
        return passwordAuthentication;
    }

    /** The usage of security feature - Global Authentication. */
    public enum GlobalAuthentication implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GlobalAuthentication.class);

        private final String value;
        private static java.util.Map<String, GlobalAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (GlobalAuthentication v : GlobalAuthentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GlobalAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GlobalAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GlobalAuthentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - Global Authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("globalAuthentication")
    private final GlobalAuthentication globalAuthentication;

    /**
     * The usage of security feature - Global Authentication.
     *
     * @return the value
     */
    public GlobalAuthentication getGlobalAuthentication() {
        return globalAuthentication;
    }

    /** The usage of security feature - External Authentication. */
    public enum ExternalAuthentication implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExternalAuthentication.class);

        private final String value;
        private static java.util.Map<String, ExternalAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (ExternalAuthentication v : ExternalAuthentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExternalAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExternalAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExternalAuthentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The usage of security feature - External Authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalAuthentication")
    private final ExternalAuthentication externalAuthentication;

    /**
     * The usage of security feature - External Authentication.
     *
     * @return the value
     */
    public ExternalAuthentication getExternalAuthentication() {
        return externalAuthentication;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("SecurityFeatureSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", unifiedAudit=").append(String.valueOf(this.unifiedAudit));
        sb.append(", fineGrainedAudit=").append(String.valueOf(this.fineGrainedAudit));
        sb.append(", traditionalAudit=").append(String.valueOf(this.traditionalAudit));
        sb.append(", databaseVault=").append(String.valueOf(this.databaseVault));
        sb.append(", privilegeAnalysis=").append(String.valueOf(this.privilegeAnalysis));
        sb.append(", tablespaceEncryption=").append(String.valueOf(this.tablespaceEncryption));
        sb.append(", columnEncryption=").append(String.valueOf(this.columnEncryption));
        sb.append(", networkEncryption=").append(String.valueOf(this.networkEncryption));
        sb.append(", passwordAuthentication=").append(String.valueOf(this.passwordAuthentication));
        sb.append(", globalAuthentication=").append(String.valueOf(this.globalAuthentication));
        sb.append(", externalAuthentication=").append(String.valueOf(this.externalAuthentication));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityFeatureSummary)) {
            return false;
        }

        SecurityFeatureSummary other = (SecurityFeatureSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.unifiedAudit, other.unifiedAudit)
                && java.util.Objects.equals(this.fineGrainedAudit, other.fineGrainedAudit)
                && java.util.Objects.equals(this.traditionalAudit, other.traditionalAudit)
                && java.util.Objects.equals(this.databaseVault, other.databaseVault)
                && java.util.Objects.equals(this.privilegeAnalysis, other.privilegeAnalysis)
                && java.util.Objects.equals(this.tablespaceEncryption, other.tablespaceEncryption)
                && java.util.Objects.equals(this.columnEncryption, other.columnEncryption)
                && java.util.Objects.equals(this.networkEncryption, other.networkEncryption)
                && java.util.Objects.equals(
                        this.passwordAuthentication, other.passwordAuthentication)
                && java.util.Objects.equals(this.globalAuthentication, other.globalAuthentication)
                && java.util.Objects.equals(
                        this.externalAuthentication, other.externalAuthentication)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.unifiedAudit == null ? 43 : this.unifiedAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.fineGrainedAudit == null ? 43 : this.fineGrainedAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.traditionalAudit == null ? 43 : this.traditionalAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVault == null ? 43 : this.databaseVault.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeAnalysis == null ? 43 : this.privilegeAnalysis.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceEncryption == null
                                ? 43
                                : this.tablespaceEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.columnEncryption == null ? 43 : this.columnEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEncryption == null ? 43 : this.networkEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordAuthentication == null
                                ? 43
                                : this.passwordAuthentication.hashCode());
        result =
                (result * PRIME)
                        + (this.globalAuthentication == null
                                ? 43
                                : this.globalAuthentication.hashCode());
        result =
                (result * PRIME)
                        + (this.externalAuthentication == null
                                ? 43
                                : this.externalAuthentication.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
