/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * User-defined service variables set only at DB system initialization. These variables cannot be changed later at runtime.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InitializationVariables.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InitializationVariables
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lowerCaseTableNames"})
    public InitializationVariables(LowerCaseTableNames lowerCaseTableNames) {
        super();
        this.lowerCaseTableNames = lowerCaseTableNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         *
         * Represents the MySQL server system variable lower_case_table_names (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_lower_case_table_names).
         * <p>
         * lowerCaseTableNames controls case-sensitivity of tables and schema names and how they are stored in the DB System.
         * <p>
         * Valid values are:
         *   - CASE_SENSITIVE - (default) Table and schema name comparisons are case-sensitive and stored as specified. (lower_case_table_names=0)
         *   - CASE_INSENSITIVE_LOWERCASE - Table and schema name comparisons are not case-sensitive and stored in lowercase. (lower_case_table_names=1)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lowerCaseTableNames")
        private LowerCaseTableNames lowerCaseTableNames;

        /**
         *
         * Represents the MySQL server system variable lower_case_table_names (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_lower_case_table_names).
         * <p>
         * lowerCaseTableNames controls case-sensitivity of tables and schema names and how they are stored in the DB System.
         * <p>
         * Valid values are:
         *   - CASE_SENSITIVE - (default) Table and schema name comparisons are case-sensitive and stored as specified. (lower_case_table_names=0)
         *   - CASE_INSENSITIVE_LOWERCASE - Table and schema name comparisons are not case-sensitive and stored in lowercase. (lower_case_table_names=1)
         *
         * @param lowerCaseTableNames the value to set
         * @return this builder
         **/
        public Builder lowerCaseTableNames(LowerCaseTableNames lowerCaseTableNames) {
            this.lowerCaseTableNames = lowerCaseTableNames;
            this.__explicitlySet__.add("lowerCaseTableNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InitializationVariables build() {
            InitializationVariables model = new InitializationVariables(this.lowerCaseTableNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitializationVariables model) {
            if (model.wasPropertyExplicitlySet("lowerCaseTableNames")) {
                this.lowerCaseTableNames(model.getLowerCaseTableNames());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     *
     * Represents the MySQL server system variable lower_case_table_names (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_lower_case_table_names).
     * <p>
     * lowerCaseTableNames controls case-sensitivity of tables and schema names and how they are stored in the DB System.
     * <p>
     * Valid values are:
     *   - CASE_SENSITIVE - (default) Table and schema name comparisons are case-sensitive and stored as specified. (lower_case_table_names=0)
     *   - CASE_INSENSITIVE_LOWERCASE - Table and schema name comparisons are not case-sensitive and stored in lowercase. (lower_case_table_names=1)
     *
     **/
    public enum LowerCaseTableNames {
        CaseSensitive("CASE_SENSITIVE"),
        CaseInsensitiveLowercase("CASE_INSENSITIVE_LOWERCASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LowerCaseTableNames.class);

        private final String value;
        private static java.util.Map<String, LowerCaseTableNames> map;

        static {
            map = new java.util.HashMap<>();
            for (LowerCaseTableNames v : LowerCaseTableNames.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LowerCaseTableNames(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LowerCaseTableNames create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LowerCaseTableNames', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     *
     * Represents the MySQL server system variable lower_case_table_names (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_lower_case_table_names).
     * <p>
     * lowerCaseTableNames controls case-sensitivity of tables and schema names and how they are stored in the DB System.
     * <p>
     * Valid values are:
     *   - CASE_SENSITIVE - (default) Table and schema name comparisons are case-sensitive and stored as specified. (lower_case_table_names=0)
     *   - CASE_INSENSITIVE_LOWERCASE - Table and schema name comparisons are not case-sensitive and stored in lowercase. (lower_case_table_names=1)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerCaseTableNames")
    private final LowerCaseTableNames lowerCaseTableNames;

    /**
     *
     * Represents the MySQL server system variable lower_case_table_names (https://dev.mysql.com/doc/refman/8.0/en/server-system-variables.html#sysvar_lower_case_table_names).
     * <p>
     * lowerCaseTableNames controls case-sensitivity of tables and schema names and how they are stored in the DB System.
     * <p>
     * Valid values are:
     *   - CASE_SENSITIVE - (default) Table and schema name comparisons are case-sensitive and stored as specified. (lower_case_table_names=0)
     *   - CASE_INSENSITIVE_LOWERCASE - Table and schema name comparisons are not case-sensitive and stored in lowercase. (lower_case_table_names=1)
     *
     * @return the value
     **/
    public LowerCaseTableNames getLowerCaseTableNames() {
        return lowerCaseTableNames;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InitializationVariables(");
        sb.append("super=").append(super.toString());
        sb.append("lowerCaseTableNames=").append(String.valueOf(this.lowerCaseTableNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitializationVariables)) {
            return false;
        }

        InitializationVariables other = (InitializationVariables) o;
        return java.util.Objects.equals(this.lowerCaseTableNames, other.lowerCaseTableNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lowerCaseTableNames == null
                                ? 43
                                : this.lowerCaseTableNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
