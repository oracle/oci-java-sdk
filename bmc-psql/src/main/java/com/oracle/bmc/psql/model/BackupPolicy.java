/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * PostgreSQL database system backup policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = BackupPolicy.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DailyBackupPolicy.class,
        name = "DAILY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = WeeklyBackupPolicy.class,
        name = "WEEKLY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NoneBackupPolicy.class,
        name = "NONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MonthlyBackupPolicy.class,
        name = "MONTHLY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BackupPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionDays"})
    protected BackupPolicy(Integer retentionDays) {
        super();
        this.retentionDays = retentionDays;
    }

    /**
     * How many days the data should be stored after the database system deletion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
    private final Integer retentionDays;

    /**
     * How many days the data should be stored after the database system deletion.
     * @return the value
     **/
    public Integer getRetentionDays() {
        return retentionDays;
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
        sb.append("BackupPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("retentionDays=").append(String.valueOf(this.retentionDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupPolicy)) {
            return false;
        }

        BackupPolicy other = (BackupPolicy) o;
        return java.util.Objects.equals(this.retentionDays, other.retentionDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.retentionDays == null ? 43 : this.retentionDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The kind of backup policy.
     **/
    public enum Kind {
        Daily("DAILY"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Kind.class);

        private final String value;
        private static java.util.Map<String, Kind> map;

        static {
            map = new java.util.HashMap<>();
            for (Kind v : Kind.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Kind create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Kind', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
