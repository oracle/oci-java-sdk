/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update the cross-region Disaster Recovery (DR) details of the Standby Autonomous Database on shared Exadata infrastructure.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChangeDisasterRecoveryConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeDisasterRecoveryConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"disasterRecoveryType"})
    public ChangeDisasterRecoveryConfigurationDetails(DisasterRecoveryType disasterRecoveryType) {
        super();
        this.disasterRecoveryType = disasterRecoveryType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates the disaster recovery (DR) type of the Shared Autonomous Database.
         * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time objective (RTO) during failover or switchover.
         * Backup-based DR type provides lower cost DR with a slower RTO during failover or switchover.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryType")
        private DisasterRecoveryType disasterRecoveryType;

        /**
         * Indicates the disaster recovery (DR) type of the Shared Autonomous Database.
         * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time objective (RTO) during failover or switchover.
         * Backup-based DR type provides lower cost DR with a slower RTO during failover or switchover.
         *
         * @param disasterRecoveryType the value to set
         * @return this builder
         **/
        public Builder disasterRecoveryType(DisasterRecoveryType disasterRecoveryType) {
            this.disasterRecoveryType = disasterRecoveryType;
            this.__explicitlySet__.add("disasterRecoveryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeDisasterRecoveryConfigurationDetails build() {
            ChangeDisasterRecoveryConfigurationDetails model =
                    new ChangeDisasterRecoveryConfigurationDetails(this.disasterRecoveryType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeDisasterRecoveryConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("disasterRecoveryType")) {
                this.disasterRecoveryType(model.getDisasterRecoveryType());
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
     * Indicates the disaster recovery (DR) type of the Shared Autonomous Database.
     * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time objective (RTO) during failover or switchover.
     * Backup-based DR type provides lower cost DR with a slower RTO during failover or switchover.
     *
     **/
    public enum DisasterRecoveryType {
        Adg("ADG"),
        BackupBased("BACKUP_BASED"),
        ;

        private final String value;
        private static java.util.Map<String, DisasterRecoveryType> map;

        static {
            map = new java.util.HashMap<>();
            for (DisasterRecoveryType v : DisasterRecoveryType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DisasterRecoveryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DisasterRecoveryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DisasterRecoveryType: " + key);
        }
    };
    /**
     * Indicates the disaster recovery (DR) type of the Shared Autonomous Database.
     * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time objective (RTO) during failover or switchover.
     * Backup-based DR type provides lower cost DR with a slower RTO during failover or switchover.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryType")
    private final DisasterRecoveryType disasterRecoveryType;

    /**
     * Indicates the disaster recovery (DR) type of the Shared Autonomous Database.
     * Autonomous Data Guard (ADG) DR type provides business critical DR with a faster recovery time objective (RTO) during failover or switchover.
     * Backup-based DR type provides lower cost DR with a slower RTO during failover or switchover.
     *
     * @return the value
     **/
    public DisasterRecoveryType getDisasterRecoveryType() {
        return disasterRecoveryType;
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
        sb.append("ChangeDisasterRecoveryConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("disasterRecoveryType=").append(String.valueOf(this.disasterRecoveryType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDisasterRecoveryConfigurationDetails)) {
            return false;
        }

        ChangeDisasterRecoveryConfigurationDetails other =
                (ChangeDisasterRecoveryConfigurationDetails) o;
        return java.util.Objects.equals(this.disasterRecoveryType, other.disasterRecoveryType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.disasterRecoveryType == null
                                ? 43
                                : this.disasterRecoveryType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
