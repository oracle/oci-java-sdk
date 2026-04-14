/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for setting a retention date or legal hold. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LockDurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LockDurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"coolOffDuration", "lockDuration", "lockMode"})
    public LockDurationDetails(Integer coolOffDuration, Integer lockDuration, LockMode lockMode) {
        super();
        this.coolOffDuration = coolOffDuration;
        this.lockDuration = lockDuration;
        this.lockMode = lockMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * For snapshots in compliance mode, a cooling-off period (measured in days) begins. During
         * this time, you can still edit or remove the lock. Once this period ends, the snapshot
         * becomes immutable until the specified retention date expires, permanently preventing any
         * deletion or modification. The cool off duration can be set for a minimum of 0 days and a
         * maximum of 365. It defaults to 14 days if not set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("coolOffDuration")
        private Integer coolOffDuration;

        /**
         * For snapshots in compliance mode, a cooling-off period (measured in days) begins. During
         * this time, you can still edit or remove the lock. Once this period ends, the snapshot
         * becomes immutable until the specified retention date expires, permanently preventing any
         * deletion or modification. The cool off duration can be set for a minimum of 0 days and a
         * maximum of 365. It defaults to 14 days if not set.
         *
         * @param coolOffDuration the value to set
         * @return this builder
         */
        public Builder coolOffDuration(Integer coolOffDuration) {
            this.coolOffDuration = coolOffDuration;
            this.__explicitlySet__.add("coolOffDuration");
            return this;
        }
        /**
         * The retention period (measured in days) defines how long a snapshot remains locked,
         * preventing user modifications or deletions. In governance mode this period can be
         * adjusted, but in compliance mode it becomes permanent after a cool-off period. Snapshots
         * can be locked for a minimum of 0 days and a maximum of 36,500 days. A value of 0 days
         * stands for an indefinite retention period and it is used for a legal hold.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lockDuration")
        private Integer lockDuration;

        /**
         * The retention period (measured in days) defines how long a snapshot remains locked,
         * preventing user modifications or deletions. In governance mode this period can be
         * adjusted, but in compliance mode it becomes permanent after a cool-off period. Snapshots
         * can be locked for a minimum of 0 days and a maximum of 36,500 days. A value of 0 days
         * stands for an indefinite retention period and it is used for a legal hold.
         *
         * @param lockDuration the value to set
         * @return this builder
         */
        public Builder lockDuration(Integer lockDuration) {
            this.lockDuration = lockDuration;
            this.__explicitlySet__.add("lockDuration");
            return this;
        }
        /**
         * Can be GOVERNANCE or COMPLIANCE. GOVERNANCE MODE: locks snapshots based on either a
         * retention period or a legal hold. COMPLIANCE MODE: the customer can only remove the
         * snapshot during its cooling-off period. Once that time ends, the snapshot becomes
         * immutable; customers cannot delete or modify it until its set retention date passes.
         * After the snapshot is locked, customers can only increase its retention period.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lockMode")
        private LockMode lockMode;

        /**
         * Can be GOVERNANCE or COMPLIANCE. GOVERNANCE MODE: locks snapshots based on either a
         * retention period or a legal hold. COMPLIANCE MODE: the customer can only remove the
         * snapshot during its cooling-off period. Once that time ends, the snapshot becomes
         * immutable; customers cannot delete or modify it until its set retention date passes.
         * After the snapshot is locked, customers can only increase its retention period.
         *
         * @param lockMode the value to set
         * @return this builder
         */
        public Builder lockMode(LockMode lockMode) {
            this.lockMode = lockMode;
            this.__explicitlySet__.add("lockMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LockDurationDetails build() {
            LockDurationDetails model =
                    new LockDurationDetails(this.coolOffDuration, this.lockDuration, this.lockMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LockDurationDetails model) {
            if (model.wasPropertyExplicitlySet("coolOffDuration")) {
                this.coolOffDuration(model.getCoolOffDuration());
            }
            if (model.wasPropertyExplicitlySet("lockDuration")) {
                this.lockDuration(model.getLockDuration());
            }
            if (model.wasPropertyExplicitlySet("lockMode")) {
                this.lockMode(model.getLockMode());
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
     * For snapshots in compliance mode, a cooling-off period (measured in days) begins. During this
     * time, you can still edit or remove the lock. Once this period ends, the snapshot becomes
     * immutable until the specified retention date expires, permanently preventing any deletion or
     * modification. The cool off duration can be set for a minimum of 0 days and a maximum of 365.
     * It defaults to 14 days if not set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coolOffDuration")
    private final Integer coolOffDuration;

    /**
     * For snapshots in compliance mode, a cooling-off period (measured in days) begins. During this
     * time, you can still edit or remove the lock. Once this period ends, the snapshot becomes
     * immutable until the specified retention date expires, permanently preventing any deletion or
     * modification. The cool off duration can be set for a minimum of 0 days and a maximum of 365.
     * It defaults to 14 days if not set.
     *
     * @return the value
     */
    public Integer getCoolOffDuration() {
        return coolOffDuration;
    }

    /**
     * The retention period (measured in days) defines how long a snapshot remains locked,
     * preventing user modifications or deletions. In governance mode this period can be adjusted,
     * but in compliance mode it becomes permanent after a cool-off period. Snapshots can be locked
     * for a minimum of 0 days and a maximum of 36,500 days. A value of 0 days stands for an
     * indefinite retention period and it is used for a legal hold.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockDuration")
    private final Integer lockDuration;

    /**
     * The retention period (measured in days) defines how long a snapshot remains locked,
     * preventing user modifications or deletions. In governance mode this period can be adjusted,
     * but in compliance mode it becomes permanent after a cool-off period. Snapshots can be locked
     * for a minimum of 0 days and a maximum of 36,500 days. A value of 0 days stands for an
     * indefinite retention period and it is used for a legal hold.
     *
     * @return the value
     */
    public Integer getLockDuration() {
        return lockDuration;
    }

    /**
     * Can be GOVERNANCE or COMPLIANCE. GOVERNANCE MODE: locks snapshots based on either a retention
     * period or a legal hold. COMPLIANCE MODE: the customer can only remove the snapshot during its
     * cooling-off period. Once that time ends, the snapshot becomes immutable; customers cannot
     * delete or modify it until its set retention date passes. After the snapshot is locked,
     * customers can only increase its retention period.
     */
    public enum LockMode implements com.oracle.bmc.http.internal.BmcEnum {
        Governance("GOVERNANCE"),
        Compliance("COMPLIANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LockMode.class);

        private final String value;
        private static java.util.Map<String, LockMode> map;

        static {
            map = new java.util.HashMap<>();
            for (LockMode v : LockMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LockMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LockMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LockMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Can be GOVERNANCE or COMPLIANCE. GOVERNANCE MODE: locks snapshots based on either a retention
     * period or a legal hold. COMPLIANCE MODE: the customer can only remove the snapshot during its
     * cooling-off period. Once that time ends, the snapshot becomes immutable; customers cannot
     * delete or modify it until its set retention date passes. After the snapshot is locked,
     * customers can only increase its retention period.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockMode")
    private final LockMode lockMode;

    /**
     * Can be GOVERNANCE or COMPLIANCE. GOVERNANCE MODE: locks snapshots based on either a retention
     * period or a legal hold. COMPLIANCE MODE: the customer can only remove the snapshot during its
     * cooling-off period. Once that time ends, the snapshot becomes immutable; customers cannot
     * delete or modify it until its set retention date passes. After the snapshot is locked,
     * customers can only increase its retention period.
     *
     * @return the value
     */
    public LockMode getLockMode() {
        return lockMode;
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
        sb.append("LockDurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("coolOffDuration=").append(String.valueOf(this.coolOffDuration));
        sb.append(", lockDuration=").append(String.valueOf(this.lockDuration));
        sb.append(", lockMode=").append(String.valueOf(this.lockMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LockDurationDetails)) {
            return false;
        }

        LockDurationDetails other = (LockDurationDetails) o;
        return java.util.Objects.equals(this.coolOffDuration, other.coolOffDuration)
                && java.util.Objects.equals(this.lockDuration, other.lockDuration)
                && java.util.Objects.equals(this.lockMode, other.lockMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.coolOffDuration == null ? 43 : this.coolOffDuration.hashCode());
        result = (result * PRIME) + (this.lockDuration == null ? 43 : this.lockDuration.hashCode());
        result = (result * PRIME) + (this.lockMode == null ? 43 : this.lockMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
