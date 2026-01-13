/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The convertStandbyDatabaseType request parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConvertStandbyDatabaseTypeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConvertStandbyDatabaseTypeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseAdminPassword",
        "standbyConversionType",
        "snapshotDurationInDays"
    })
    public ConvertStandbyDatabaseTypeDetails(
            String databaseAdminPassword,
            StandbyConversionType standbyConversionType,
            Integer snapshotDurationInDays) {
        super();
        this.databaseAdminPassword = databaseAdminPassword;
        this.standbyConversionType = standbyConversionType;
        this.snapshotDurationInDays = snapshotDurationInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The administrator password of the primary database in this Data Guard association.
         *
         * <p>*The password MUST be the same as the primary admin password.**
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        /**
         * The administrator password of the primary database in this Data Guard association.
         *
         * <p>*The password MUST be the same as the primary admin password.**
         *
         * @param databaseAdminPassword the value to set
         * @return this builder
         */
        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }
        /**
         * Defines the conversion type of the standby database. Specify this to convert a physical
         * standby to a snapshot standby and vice versa.
         *
         * <p>Valid standbyConversionType: - SNAPSHOT - PHYSICAL
         */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyConversionType")
        private StandbyConversionType standbyConversionType;

        /**
         * Defines the conversion type of the standby database. Specify this to convert a physical
         * standby to a snapshot standby and vice versa.
         *
         * <p>Valid standbyConversionType: - SNAPSHOT - PHYSICAL
         *
         * @param standbyConversionType the value to set
         * @return this builder
         */
        public Builder standbyConversionType(StandbyConversionType standbyConversionType) {
            this.standbyConversionType = standbyConversionType;
            this.__explicitlySet__.add("standbyConversionType");
            return this;
        }
        /**
         * SnapshotDurationInDays is the duration in day(s) after which the Snapshot Standby
         * Database will get converted back to Physical Standby. The minimum value of
         * snapshotDurationInDays is 3 days and maximum value is 14 days. Default value will be 7
         * days if not provided in the Request.
         *
         * <p>This field is only applicable if the requested database role is snapshot standby.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotDurationInDays")
        private Integer snapshotDurationInDays;

        /**
         * SnapshotDurationInDays is the duration in day(s) after which the Snapshot Standby
         * Database will get converted back to Physical Standby. The minimum value of
         * snapshotDurationInDays is 3 days and maximum value is 14 days. Default value will be 7
         * days if not provided in the Request.
         *
         * <p>This field is only applicable if the requested database role is snapshot standby.
         *
         * @param snapshotDurationInDays the value to set
         * @return this builder
         */
        public Builder snapshotDurationInDays(Integer snapshotDurationInDays) {
            this.snapshotDurationInDays = snapshotDurationInDays;
            this.__explicitlySet__.add("snapshotDurationInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConvertStandbyDatabaseTypeDetails build() {
            ConvertStandbyDatabaseTypeDetails model =
                    new ConvertStandbyDatabaseTypeDetails(
                            this.databaseAdminPassword,
                            this.standbyConversionType,
                            this.snapshotDurationInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConvertStandbyDatabaseTypeDetails model) {
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("standbyConversionType")) {
                this.standbyConversionType(model.getStandbyConversionType());
            }
            if (model.wasPropertyExplicitlySet("snapshotDurationInDays")) {
                this.snapshotDurationInDays(model.getSnapshotDurationInDays());
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
     * The administrator password of the primary database in this Data Guard association.
     *
     * <p>*The password MUST be the same as the primary admin password.**
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final String databaseAdminPassword;

    /**
     * The administrator password of the primary database in this Data Guard association.
     *
     * <p>*The password MUST be the same as the primary admin password.**
     *
     * @return the value
     */
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword;
    }

    /**
     * Defines the conversion type of the standby database. Specify this to convert a physical
     * standby to a snapshot standby and vice versa.
     *
     * <p>Valid standbyConversionType: - SNAPSHOT - PHYSICAL
     */
    public enum StandbyConversionType implements com.oracle.bmc.http.internal.BmcEnum {
        Snapshot("SNAPSHOT"),
        Physical("PHYSICAL"),
        ;

        private final String value;
        private static java.util.Map<String, StandbyConversionType> map;

        static {
            map = new java.util.HashMap<>();
            for (StandbyConversionType v : StandbyConversionType.values()) {
                map.put(v.getValue(), v);
            }
        }

        StandbyConversionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StandbyConversionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StandbyConversionType: " + key);
        }
    };
    /**
     * Defines the conversion type of the standby database. Specify this to convert a physical
     * standby to a snapshot standby and vice versa.
     *
     * <p>Valid standbyConversionType: - SNAPSHOT - PHYSICAL
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyConversionType")
    private final StandbyConversionType standbyConversionType;

    /**
     * Defines the conversion type of the standby database. Specify this to convert a physical
     * standby to a snapshot standby and vice versa.
     *
     * <p>Valid standbyConversionType: - SNAPSHOT - PHYSICAL
     *
     * @return the value
     */
    public StandbyConversionType getStandbyConversionType() {
        return standbyConversionType;
    }

    /**
     * SnapshotDurationInDays is the duration in day(s) after which the Snapshot Standby Database
     * will get converted back to Physical Standby. The minimum value of snapshotDurationInDays is 3
     * days and maximum value is 14 days. Default value will be 7 days if not provided in the
     * Request.
     *
     * <p>This field is only applicable if the requested database role is snapshot standby.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotDurationInDays")
    private final Integer snapshotDurationInDays;

    /**
     * SnapshotDurationInDays is the duration in day(s) after which the Snapshot Standby Database
     * will get converted back to Physical Standby. The minimum value of snapshotDurationInDays is 3
     * days and maximum value is 14 days. Default value will be 7 days if not provided in the
     * Request.
     *
     * <p>This field is only applicable if the requested database role is snapshot standby.
     *
     * @return the value
     */
    public Integer getSnapshotDurationInDays() {
        return snapshotDurationInDays;
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
        sb.append("ConvertStandbyDatabaseTypeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseAdminPassword=").append("<redacted>");
        sb.append(", standbyConversionType=").append(String.valueOf(this.standbyConversionType));
        sb.append(", snapshotDurationInDays=").append(String.valueOf(this.snapshotDurationInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConvertStandbyDatabaseTypeDetails)) {
            return false;
        }

        ConvertStandbyDatabaseTypeDetails other = (ConvertStandbyDatabaseTypeDetails) o;
        return java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && java.util.Objects.equals(this.standbyConversionType, other.standbyConversionType)
                && java.util.Objects.equals(
                        this.snapshotDurationInDays, other.snapshotDurationInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseAdminPassword == null
                                ? 43
                                : this.databaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyConversionType == null
                                ? 43
                                : this.standbyConversionType.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotDurationInDays == null
                                ? 43
                                : this.snapshotDurationInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
