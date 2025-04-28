/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSecurityFeaturesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSecurityFeaturesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSecurityFeaturesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /** A filter to return only items related to a specific target OCID. */
    private String targetId;

    /** A filter to return only items related to a specific target OCID. */
    public String getTargetId() {
        return targetId;
    }
    /**
     * A filter to return only the targets with the DB security feature - Unified Audit
     * enabled/disabled.
     */
    private TargetsWithUnifiedAudit targetsWithUnifiedAudit;

    /**
     * A filter to return only the targets with the DB security feature - Unified Audit
     * enabled/disabled.
     */
    public enum TargetsWithUnifiedAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithUnifiedAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithUnifiedAudit v : TargetsWithUnifiedAudit.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithUnifiedAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithUnifiedAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithUnifiedAudit: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Unified Audit
     * enabled/disabled.
     */
    public TargetsWithUnifiedAudit getTargetsWithUnifiedAudit() {
        return targetsWithUnifiedAudit;
    }
    /**
     * A filter to return only the targets with the DB security feature - Fine Grained Audit
     * enabled/disabled.
     */
    private TargetsWithFineGrainedAudit targetsWithFineGrainedAudit;

    /**
     * A filter to return only the targets with the DB security feature - Fine Grained Audit
     * enabled/disabled.
     */
    public enum TargetsWithFineGrainedAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithFineGrainedAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithFineGrainedAudit v : TargetsWithFineGrainedAudit.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithFineGrainedAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithFineGrainedAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithFineGrainedAudit: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Fine Grained Audit
     * enabled/disabled.
     */
    public TargetsWithFineGrainedAudit getTargetsWithFineGrainedAudit() {
        return targetsWithFineGrainedAudit;
    }
    /**
     * A filter to return only the targets with the DB security feature - Traditional Audit
     * enabled/disabled.
     */
    private TargetsWithTraditionalAudit targetsWithTraditionalAudit;

    /**
     * A filter to return only the targets with the DB security feature - Traditional Audit
     * enabled/disabled.
     */
    public enum TargetsWithTraditionalAudit implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithTraditionalAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithTraditionalAudit v : TargetsWithTraditionalAudit.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithTraditionalAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithTraditionalAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithTraditionalAudit: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Traditional Audit
     * enabled/disabled.
     */
    public TargetsWithTraditionalAudit getTargetsWithTraditionalAudit() {
        return targetsWithTraditionalAudit;
    }
    /**
     * A filter to return only the targets with the DB security feature - Database Vault
     * enabled/disabled.
     */
    private TargetsWithDatabaseVault targetsWithDatabaseVault;

    /**
     * A filter to return only the targets with the DB security feature - Database Vault
     * enabled/disabled.
     */
    public enum TargetsWithDatabaseVault implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithDatabaseVault> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithDatabaseVault v : TargetsWithDatabaseVault.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithDatabaseVault(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithDatabaseVault create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithDatabaseVault: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Database Vault
     * enabled/disabled.
     */
    public TargetsWithDatabaseVault getTargetsWithDatabaseVault() {
        return targetsWithDatabaseVault;
    }
    /**
     * A filter to return only the targets with the DB security feature - Privilege Analysis
     * enabled/disabled.
     */
    private TargetsWithPrivilegeAnalysis targetsWithPrivilegeAnalysis;

    /**
     * A filter to return only the targets with the DB security feature - Privilege Analysis
     * enabled/disabled.
     */
    public enum TargetsWithPrivilegeAnalysis implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithPrivilegeAnalysis> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithPrivilegeAnalysis v : TargetsWithPrivilegeAnalysis.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithPrivilegeAnalysis(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithPrivilegeAnalysis create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithPrivilegeAnalysis: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Privilege Analysis
     * enabled/disabled.
     */
    public TargetsWithPrivilegeAnalysis getTargetsWithPrivilegeAnalysis() {
        return targetsWithPrivilegeAnalysis;
    }
    /**
     * A filter to return only the targets with the DB security feature - Tablespace Encryption
     * enabled/disabled.
     */
    private TargetsWithTablespaceEncryption targetsWithTablespaceEncryption;

    /**
     * A filter to return only the targets with the DB security feature - Tablespace Encryption
     * enabled/disabled.
     */
    public enum TargetsWithTablespaceEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithTablespaceEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithTablespaceEncryption v : TargetsWithTablespaceEncryption.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithTablespaceEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithTablespaceEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithTablespaceEncryption: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Tablespace Encryption
     * enabled/disabled.
     */
    public TargetsWithTablespaceEncryption getTargetsWithTablespaceEncryption() {
        return targetsWithTablespaceEncryption;
    }
    /**
     * A filter to return only the targets that enable the DB security feature - Column Encryption
     * enabled/disabled.
     */
    private TargetsWithColumnEncryption targetsWithColumnEncryption;

    /**
     * A filter to return only the targets that enable the DB security feature - Column Encryption
     * enabled/disabled.
     */
    public enum TargetsWithColumnEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithColumnEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithColumnEncryption v : TargetsWithColumnEncryption.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithColumnEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithColumnEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithColumnEncryption: " + key);
        }
    };

    /**
     * A filter to return only the targets that enable the DB security feature - Column Encryption
     * enabled/disabled.
     */
    public TargetsWithColumnEncryption getTargetsWithColumnEncryption() {
        return targetsWithColumnEncryption;
    }
    /**
     * A filter to return only the targets with the DB security feature - Network Encryption
     * enabled/disabled.
     */
    private TargetsWithNetworkEncryption targetsWithNetworkEncryption;

    /**
     * A filter to return only the targets with the DB security feature - Network Encryption
     * enabled/disabled.
     */
    public enum TargetsWithNetworkEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithNetworkEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithNetworkEncryption v : TargetsWithNetworkEncryption.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithNetworkEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithNetworkEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithNetworkEncryption: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Network Encryption
     * enabled/disabled.
     */
    public TargetsWithNetworkEncryption getTargetsWithNetworkEncryption() {
        return targetsWithNetworkEncryption;
    }
    /**
     * A filter to return only the targets with the DB security feature - Password Authentication
     * enabled/disabled.
     */
    private TargetsWithPasswordAuthentication targetsWithPasswordAuthentication;

    /**
     * A filter to return only the targets with the DB security feature - Password Authentication
     * enabled/disabled.
     */
    public enum TargetsWithPasswordAuthentication implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithPasswordAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithPasswordAuthentication v : TargetsWithPasswordAuthentication.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithPasswordAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithPasswordAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithPasswordAuthentication: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Password Authentication
     * enabled/disabled.
     */
    public TargetsWithPasswordAuthentication getTargetsWithPasswordAuthentication() {
        return targetsWithPasswordAuthentication;
    }
    /**
     * A filter to return only the targets with the DB security feature - Global Authentication
     * enabled/disabled.
     */
    private TargetsWithGlobalAuthentication targetsWithGlobalAuthentication;

    /**
     * A filter to return only the targets with the DB security feature - Global Authentication
     * enabled/disabled.
     */
    public enum TargetsWithGlobalAuthentication implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithGlobalAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithGlobalAuthentication v : TargetsWithGlobalAuthentication.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithGlobalAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithGlobalAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithGlobalAuthentication: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - Global Authentication
     * enabled/disabled.
     */
    public TargetsWithGlobalAuthentication getTargetsWithGlobalAuthentication() {
        return targetsWithGlobalAuthentication;
    }
    /**
     * A filter to return only the targets with the DB security feature - External Authentication
     * enabled/disabled.
     */
    private TargetsWithExternalAuthentication targetsWithExternalAuthentication;

    /**
     * A filter to return only the targets with the DB security feature - External Authentication
     * enabled/disabled.
     */
    public enum TargetsWithExternalAuthentication implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, TargetsWithExternalAuthentication> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetsWithExternalAuthentication v : TargetsWithExternalAuthentication.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetsWithExternalAuthentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetsWithExternalAuthentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetsWithExternalAuthentication: " + key);
        }
    };

    /**
     * A filter to return only the targets with the DB security feature - External Authentication
     * enabled/disabled.
     */
    public TargetsWithExternalAuthentication getTargetsWithExternalAuthentication() {
        return targetsWithExternalAuthentication;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSecurityFeaturesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A filter to return only resources that match the specified compartment OCID. */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /** A filter to return only items related to a specific target OCID. */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Unified Audit
         * enabled/disabled.
         */
        private TargetsWithUnifiedAudit targetsWithUnifiedAudit = null;

        /**
         * A filter to return only the targets with the DB security feature - Unified Audit
         * enabled/disabled.
         *
         * @param targetsWithUnifiedAudit the value to set
         * @return this builder instance
         */
        public Builder targetsWithUnifiedAudit(TargetsWithUnifiedAudit targetsWithUnifiedAudit) {
            this.targetsWithUnifiedAudit = targetsWithUnifiedAudit;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Fine Grained Audit
         * enabled/disabled.
         */
        private TargetsWithFineGrainedAudit targetsWithFineGrainedAudit = null;

        /**
         * A filter to return only the targets with the DB security feature - Fine Grained Audit
         * enabled/disabled.
         *
         * @param targetsWithFineGrainedAudit the value to set
         * @return this builder instance
         */
        public Builder targetsWithFineGrainedAudit(
                TargetsWithFineGrainedAudit targetsWithFineGrainedAudit) {
            this.targetsWithFineGrainedAudit = targetsWithFineGrainedAudit;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Traditional Audit
         * enabled/disabled.
         */
        private TargetsWithTraditionalAudit targetsWithTraditionalAudit = null;

        /**
         * A filter to return only the targets with the DB security feature - Traditional Audit
         * enabled/disabled.
         *
         * @param targetsWithTraditionalAudit the value to set
         * @return this builder instance
         */
        public Builder targetsWithTraditionalAudit(
                TargetsWithTraditionalAudit targetsWithTraditionalAudit) {
            this.targetsWithTraditionalAudit = targetsWithTraditionalAudit;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Database Vault
         * enabled/disabled.
         */
        private TargetsWithDatabaseVault targetsWithDatabaseVault = null;

        /**
         * A filter to return only the targets with the DB security feature - Database Vault
         * enabled/disabled.
         *
         * @param targetsWithDatabaseVault the value to set
         * @return this builder instance
         */
        public Builder targetsWithDatabaseVault(TargetsWithDatabaseVault targetsWithDatabaseVault) {
            this.targetsWithDatabaseVault = targetsWithDatabaseVault;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Privilege Analysis
         * enabled/disabled.
         */
        private TargetsWithPrivilegeAnalysis targetsWithPrivilegeAnalysis = null;

        /**
         * A filter to return only the targets with the DB security feature - Privilege Analysis
         * enabled/disabled.
         *
         * @param targetsWithPrivilegeAnalysis the value to set
         * @return this builder instance
         */
        public Builder targetsWithPrivilegeAnalysis(
                TargetsWithPrivilegeAnalysis targetsWithPrivilegeAnalysis) {
            this.targetsWithPrivilegeAnalysis = targetsWithPrivilegeAnalysis;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Tablespace Encryption
         * enabled/disabled.
         */
        private TargetsWithTablespaceEncryption targetsWithTablespaceEncryption = null;

        /**
         * A filter to return only the targets with the DB security feature - Tablespace Encryption
         * enabled/disabled.
         *
         * @param targetsWithTablespaceEncryption the value to set
         * @return this builder instance
         */
        public Builder targetsWithTablespaceEncryption(
                TargetsWithTablespaceEncryption targetsWithTablespaceEncryption) {
            this.targetsWithTablespaceEncryption = targetsWithTablespaceEncryption;
            return this;
        }

        /**
         * A filter to return only the targets that enable the DB security feature - Column
         * Encryption enabled/disabled.
         */
        private TargetsWithColumnEncryption targetsWithColumnEncryption = null;

        /**
         * A filter to return only the targets that enable the DB security feature - Column
         * Encryption enabled/disabled.
         *
         * @param targetsWithColumnEncryption the value to set
         * @return this builder instance
         */
        public Builder targetsWithColumnEncryption(
                TargetsWithColumnEncryption targetsWithColumnEncryption) {
            this.targetsWithColumnEncryption = targetsWithColumnEncryption;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Network Encryption
         * enabled/disabled.
         */
        private TargetsWithNetworkEncryption targetsWithNetworkEncryption = null;

        /**
         * A filter to return only the targets with the DB security feature - Network Encryption
         * enabled/disabled.
         *
         * @param targetsWithNetworkEncryption the value to set
         * @return this builder instance
         */
        public Builder targetsWithNetworkEncryption(
                TargetsWithNetworkEncryption targetsWithNetworkEncryption) {
            this.targetsWithNetworkEncryption = targetsWithNetworkEncryption;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Password
         * Authentication enabled/disabled.
         */
        private TargetsWithPasswordAuthentication targetsWithPasswordAuthentication = null;

        /**
         * A filter to return only the targets with the DB security feature - Password
         * Authentication enabled/disabled.
         *
         * @param targetsWithPasswordAuthentication the value to set
         * @return this builder instance
         */
        public Builder targetsWithPasswordAuthentication(
                TargetsWithPasswordAuthentication targetsWithPasswordAuthentication) {
            this.targetsWithPasswordAuthentication = targetsWithPasswordAuthentication;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - Global Authentication
         * enabled/disabled.
         */
        private TargetsWithGlobalAuthentication targetsWithGlobalAuthentication = null;

        /**
         * A filter to return only the targets with the DB security feature - Global Authentication
         * enabled/disabled.
         *
         * @param targetsWithGlobalAuthentication the value to set
         * @return this builder instance
         */
        public Builder targetsWithGlobalAuthentication(
                TargetsWithGlobalAuthentication targetsWithGlobalAuthentication) {
            this.targetsWithGlobalAuthentication = targetsWithGlobalAuthentication;
            return this;
        }

        /**
         * A filter to return only the targets with the DB security feature - External
         * Authentication enabled/disabled.
         */
        private TargetsWithExternalAuthentication targetsWithExternalAuthentication = null;

        /**
         * A filter to return only the targets with the DB security feature - External
         * Authentication enabled/disabled.
         *
         * @param targetsWithExternalAuthentication the value to set
         * @return this builder instance
         */
        public Builder targetsWithExternalAuthentication(
                TargetsWithExternalAuthentication targetsWithExternalAuthentication) {
            this.targetsWithExternalAuthentication = targetsWithExternalAuthentication;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListSecurityFeaturesRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            targetId(o.getTargetId());
            targetsWithUnifiedAudit(o.getTargetsWithUnifiedAudit());
            targetsWithFineGrainedAudit(o.getTargetsWithFineGrainedAudit());
            targetsWithTraditionalAudit(o.getTargetsWithTraditionalAudit());
            targetsWithDatabaseVault(o.getTargetsWithDatabaseVault());
            targetsWithPrivilegeAnalysis(o.getTargetsWithPrivilegeAnalysis());
            targetsWithTablespaceEncryption(o.getTargetsWithTablespaceEncryption());
            targetsWithColumnEncryption(o.getTargetsWithColumnEncryption());
            targetsWithNetworkEncryption(o.getTargetsWithNetworkEncryption());
            targetsWithPasswordAuthentication(o.getTargetsWithPasswordAuthentication());
            targetsWithGlobalAuthentication(o.getTargetsWithGlobalAuthentication());
            targetsWithExternalAuthentication(o.getTargetsWithExternalAuthentication());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSecurityFeaturesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSecurityFeaturesRequest
         */
        public ListSecurityFeaturesRequest build() {
            ListSecurityFeaturesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSecurityFeaturesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSecurityFeaturesRequest
         */
        public ListSecurityFeaturesRequest buildWithoutInvocationCallback() {
            ListSecurityFeaturesRequest request = new ListSecurityFeaturesRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.targetId = targetId;
            request.targetsWithUnifiedAudit = targetsWithUnifiedAudit;
            request.targetsWithFineGrainedAudit = targetsWithFineGrainedAudit;
            request.targetsWithTraditionalAudit = targetsWithTraditionalAudit;
            request.targetsWithDatabaseVault = targetsWithDatabaseVault;
            request.targetsWithPrivilegeAnalysis = targetsWithPrivilegeAnalysis;
            request.targetsWithTablespaceEncryption = targetsWithTablespaceEncryption;
            request.targetsWithColumnEncryption = targetsWithColumnEncryption;
            request.targetsWithNetworkEncryption = targetsWithNetworkEncryption;
            request.targetsWithPasswordAuthentication = targetsWithPasswordAuthentication;
            request.targetsWithGlobalAuthentication = targetsWithGlobalAuthentication;
            request.targetsWithExternalAuthentication = targetsWithExternalAuthentication;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListSecurityFeaturesRequest(compartmentId, compartmentIdInSubtree, accessLevel,
            // targetId, targetsWithUnifiedAudit, targetsWithFineGrainedAudit,
            // targetsWithTraditionalAudit, targetsWithDatabaseVault, targetsWithPrivilegeAnalysis,
            // targetsWithTablespaceEncryption, targetsWithColumnEncryption,
            // targetsWithNetworkEncryption, targetsWithPasswordAuthentication,
            // targetsWithGlobalAuthentication, targetsWithExternalAuthentication, opcRequestId,
            // limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .targetId(targetId)
                .targetsWithUnifiedAudit(targetsWithUnifiedAudit)
                .targetsWithFineGrainedAudit(targetsWithFineGrainedAudit)
                .targetsWithTraditionalAudit(targetsWithTraditionalAudit)
                .targetsWithDatabaseVault(targetsWithDatabaseVault)
                .targetsWithPrivilegeAnalysis(targetsWithPrivilegeAnalysis)
                .targetsWithTablespaceEncryption(targetsWithTablespaceEncryption)
                .targetsWithColumnEncryption(targetsWithColumnEncryption)
                .targetsWithNetworkEncryption(targetsWithNetworkEncryption)
                .targetsWithPasswordAuthentication(targetsWithPasswordAuthentication)
                .targetsWithGlobalAuthentication(targetsWithGlobalAuthentication)
                .targetsWithExternalAuthentication(targetsWithExternalAuthentication)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",targetsWithUnifiedAudit=").append(String.valueOf(this.targetsWithUnifiedAudit));
        sb.append(",targetsWithFineGrainedAudit=")
                .append(String.valueOf(this.targetsWithFineGrainedAudit));
        sb.append(",targetsWithTraditionalAudit=")
                .append(String.valueOf(this.targetsWithTraditionalAudit));
        sb.append(",targetsWithDatabaseVault=")
                .append(String.valueOf(this.targetsWithDatabaseVault));
        sb.append(",targetsWithPrivilegeAnalysis=")
                .append(String.valueOf(this.targetsWithPrivilegeAnalysis));
        sb.append(",targetsWithTablespaceEncryption=")
                .append(String.valueOf(this.targetsWithTablespaceEncryption));
        sb.append(",targetsWithColumnEncryption=")
                .append(String.valueOf(this.targetsWithColumnEncryption));
        sb.append(",targetsWithNetworkEncryption=")
                .append(String.valueOf(this.targetsWithNetworkEncryption));
        sb.append(",targetsWithPasswordAuthentication=")
                .append(String.valueOf(this.targetsWithPasswordAuthentication));
        sb.append(",targetsWithGlobalAuthentication=")
                .append(String.valueOf(this.targetsWithGlobalAuthentication));
        sb.append(",targetsWithExternalAuthentication=")
                .append(String.valueOf(this.targetsWithExternalAuthentication));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSecurityFeaturesRequest)) {
            return false;
        }

        ListSecurityFeaturesRequest other = (ListSecurityFeaturesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.targetsWithUnifiedAudit, other.targetsWithUnifiedAudit)
                && java.util.Objects.equals(
                        this.targetsWithFineGrainedAudit, other.targetsWithFineGrainedAudit)
                && java.util.Objects.equals(
                        this.targetsWithTraditionalAudit, other.targetsWithTraditionalAudit)
                && java.util.Objects.equals(
                        this.targetsWithDatabaseVault, other.targetsWithDatabaseVault)
                && java.util.Objects.equals(
                        this.targetsWithPrivilegeAnalysis, other.targetsWithPrivilegeAnalysis)
                && java.util.Objects.equals(
                        this.targetsWithTablespaceEncryption, other.targetsWithTablespaceEncryption)
                && java.util.Objects.equals(
                        this.targetsWithColumnEncryption, other.targetsWithColumnEncryption)
                && java.util.Objects.equals(
                        this.targetsWithNetworkEncryption, other.targetsWithNetworkEncryption)
                && java.util.Objects.equals(
                        this.targetsWithPasswordAuthentication,
                        other.targetsWithPasswordAuthentication)
                && java.util.Objects.equals(
                        this.targetsWithGlobalAuthentication, other.targetsWithGlobalAuthentication)
                && java.util.Objects.equals(
                        this.targetsWithExternalAuthentication,
                        other.targetsWithExternalAuthentication)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithUnifiedAudit == null
                                ? 43
                                : this.targetsWithUnifiedAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithFineGrainedAudit == null
                                ? 43
                                : this.targetsWithFineGrainedAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithTraditionalAudit == null
                                ? 43
                                : this.targetsWithTraditionalAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithDatabaseVault == null
                                ? 43
                                : this.targetsWithDatabaseVault.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithPrivilegeAnalysis == null
                                ? 43
                                : this.targetsWithPrivilegeAnalysis.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithTablespaceEncryption == null
                                ? 43
                                : this.targetsWithTablespaceEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithColumnEncryption == null
                                ? 43
                                : this.targetsWithColumnEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithNetworkEncryption == null
                                ? 43
                                : this.targetsWithNetworkEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithPasswordAuthentication == null
                                ? 43
                                : this.targetsWithPasswordAuthentication.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithGlobalAuthentication == null
                                ? 43
                                : this.targetsWithGlobalAuthentication.hashCode());
        result =
                (result * PRIME)
                        + (this.targetsWithExternalAuthentication == null
                                ? 43
                                : this.targetsWithExternalAuthentication.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
