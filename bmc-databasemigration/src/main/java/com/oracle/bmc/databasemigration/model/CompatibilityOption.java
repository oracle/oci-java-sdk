/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Compatibility option. FORCE_INNODB - Change CREATE TABLE statements to use the InnoDB storage
 * engine for any tables that do not already use it. SKIP_INVALID_ACCOUNTS - Remove user accounts
 * created with external authentication plugins that are not supported in MySQL HeatWave Service.
 * STRIP_DEFINERS - Remove the DEFINER clause from views, routines, events, and triggers, so these
 * objects are created with the default definer. STRIP_RESTRICTED_GRANTS - Remove specific
 * privileges that are restricted by MySQL HeatWave Service from GRANT statements, so users and
 * their roles cannot be given these privileges STRIP_TABLESPACES - Remove the TABLESPACE clause
 * from CREATE TABLE statements, so all tables are created in their default tablespaces.
 * IGNORE_WILDCARD_GRANTS - Ignore errors from grants on schemas with wildcards, which are
 * interpreted differently in systems where the partial_revokes system variable is enabled.
 * STRIP_INVALID_GRANTS - Strip grant statements which would fail when users are loaded. Such as
 * grants referring to a specific routine which does not exist.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public enum CompatibilityOption implements com.oracle.bmc.http.internal.BmcEnum {
    ForceInnodb("FORCE_INNODB"),
    SkipInvalidAccounts("SKIP_INVALID_ACCOUNTS"),
    StripDefiners("STRIP_DEFINERS"),
    StripRestrictedGrants("STRIP_RESTRICTED_GRANTS"),
    StripTablespaces("STRIP_TABLESPACES"),
    IgnoreWildcardGrants("IGNORE_WILDCARD_GRANTS"),
    StripInvalidGrants("STRIP_INVALID_GRANTS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CompatibilityOption.class);

    private final String value;
    private static java.util.Map<String, CompatibilityOption> map;

    static {
        map = new java.util.HashMap<>();
        for (CompatibilityOption v : CompatibilityOption.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CompatibilityOption(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CompatibilityOption create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CompatibilityOption', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
