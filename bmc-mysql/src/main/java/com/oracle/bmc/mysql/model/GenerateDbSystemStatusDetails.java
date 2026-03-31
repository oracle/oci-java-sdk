/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Parameters for selecting which attributes to include in the DB System status.
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
    builder = GenerateDbSystemStatusDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateDbSystemStatusDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"gtidSetType", "gtidSetToApply", "channelIds"})
    public GenerateDbSystemStatusDetails(
            GtidSetType gtidSetType, String gtidSetToApply, java.util.List<String> channelIds) {
        super();
        this.gtidSetType = gtidSetType;
        this.gtidSetToApply = gtidSetToApply;
        this.channelIds = channelIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether to collect the full set of GTIDs executed on the DB System
         * ([gtid_executed](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_executed))
         * or the set of GTIDs available in the DB System binary logs, not part of
         * ([gtid_purged](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_purged))
         * (GTID_AVAILABLE, which is gtid_executed - gtid_purged).
         * Use GTID_AVAILABLE if gtid_executed is too large to fit in the response.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gtidSetType")
        private GtidSetType gtidSetType;

        /**
         * Specifies whether to collect the full set of GTIDs executed on the DB System
         * ([gtid_executed](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_executed))
         * or the set of GTIDs available in the DB System binary logs, not part of
         * ([gtid_purged](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_purged))
         * (GTID_AVAILABLE, which is gtid_executed - gtid_purged).
         * Use GTID_AVAILABLE if gtid_executed is too large to fit in the response.
         *
         * @param gtidSetType the value to set
         * @return this builder
         **/
        public Builder gtidSetType(GtidSetType gtidSetType) {
            this.gtidSetType = gtidSetType;
            this.__explicitlySet__.add("gtidSetType");
            return this;
        }
        /**
         * Specifies the GTID set to be checked on the DB System to determine whether it has been applied. The result of
         * the check is isGtidSetApplied in the response.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gtidSetToApply")
        private String gtidSetToApply;

        /**
         * Specifies the GTID set to be checked on the DB System to determine whether it has been applied. The result of
         * the check is isGtidSetApplied in the response.
         *
         * @param gtidSetToApply the value to set
         * @return this builder
         **/
        public Builder gtidSetToApply(String gtidSetToApply) {
            this.gtidSetToApply = gtidSetToApply;
            this.__explicitlySet__.add("gtidSetToApply");
            return this;
        }
        /**
         * List of Channel IDs for which to collect status information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("channelIds")
        private java.util.List<String> channelIds;

        /**
         * List of Channel IDs for which to collect status information.
         * @param channelIds the value to set
         * @return this builder
         **/
        public Builder channelIds(java.util.List<String> channelIds) {
            this.channelIds = channelIds;
            this.__explicitlySet__.add("channelIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateDbSystemStatusDetails build() {
            GenerateDbSystemStatusDetails model =
                    new GenerateDbSystemStatusDetails(
                            this.gtidSetType, this.gtidSetToApply, this.channelIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateDbSystemStatusDetails model) {
            if (model.wasPropertyExplicitlySet("gtidSetType")) {
                this.gtidSetType(model.getGtidSetType());
            }
            if (model.wasPropertyExplicitlySet("gtidSetToApply")) {
                this.gtidSetToApply(model.getGtidSetToApply());
            }
            if (model.wasPropertyExplicitlySet("channelIds")) {
                this.channelIds(model.getChannelIds());
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
     * Specifies whether to collect the full set of GTIDs executed on the DB System
     * ([gtid_executed](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_executed))
     * or the set of GTIDs available in the DB System binary logs, not part of
     * ([gtid_purged](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_purged))
     * (GTID_AVAILABLE, which is gtid_executed - gtid_purged).
     * Use GTID_AVAILABLE if gtid_executed is too large to fit in the response.
     *
     **/
    public enum GtidSetType {
        GtidExecuted("GTID_EXECUTED"),
        GtidAvailable("GTID_AVAILABLE"),
        ;

        private final String value;
        private static java.util.Map<String, GtidSetType> map;

        static {
            map = new java.util.HashMap<>();
            for (GtidSetType v : GtidSetType.values()) {
                map.put(v.getValue(), v);
            }
        }

        GtidSetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GtidSetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GtidSetType: " + key);
        }
    };
    /**
     * Specifies whether to collect the full set of GTIDs executed on the DB System
     * ([gtid_executed](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_executed))
     * or the set of GTIDs available in the DB System binary logs, not part of
     * ([gtid_purged](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_purged))
     * (GTID_AVAILABLE, which is gtid_executed - gtid_purged).
     * Use GTID_AVAILABLE if gtid_executed is too large to fit in the response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gtidSetType")
    private final GtidSetType gtidSetType;

    /**
     * Specifies whether to collect the full set of GTIDs executed on the DB System
     * ([gtid_executed](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_executed))
     * or the set of GTIDs available in the DB System binary logs, not part of
     * ([gtid_purged](https://dev.mysql.com/doc/en/replication-options-gtids.html#sysvar_gtid_purged))
     * (GTID_AVAILABLE, which is gtid_executed - gtid_purged).
     * Use GTID_AVAILABLE if gtid_executed is too large to fit in the response.
     *
     * @return the value
     **/
    public GtidSetType getGtidSetType() {
        return gtidSetType;
    }

    /**
     * Specifies the GTID set to be checked on the DB System to determine whether it has been applied. The result of
     * the check is isGtidSetApplied in the response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gtidSetToApply")
    private final String gtidSetToApply;

    /**
     * Specifies the GTID set to be checked on the DB System to determine whether it has been applied. The result of
     * the check is isGtidSetApplied in the response.
     *
     * @return the value
     **/
    public String getGtidSetToApply() {
        return gtidSetToApply;
    }

    /**
     * List of Channel IDs for which to collect status information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelIds")
    private final java.util.List<String> channelIds;

    /**
     * List of Channel IDs for which to collect status information.
     * @return the value
     **/
    public java.util.List<String> getChannelIds() {
        return channelIds;
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
        sb.append("GenerateDbSystemStatusDetails(");
        sb.append("super=").append(super.toString());
        sb.append("gtidSetType=").append(String.valueOf(this.gtidSetType));
        sb.append(", gtidSetToApply=").append(String.valueOf(this.gtidSetToApply));
        sb.append(", channelIds=").append(String.valueOf(this.channelIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateDbSystemStatusDetails)) {
            return false;
        }

        GenerateDbSystemStatusDetails other = (GenerateDbSystemStatusDetails) o;
        return java.util.Objects.equals(this.gtidSetType, other.gtidSetType)
                && java.util.Objects.equals(this.gtidSetToApply, other.gtidSetToApply)
                && java.util.Objects.equals(this.channelIds, other.channelIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gtidSetType == null ? 43 : this.gtidSetType.hashCode());
        result =
                (result * PRIME)
                        + (this.gtidSetToApply == null ? 43 : this.gtidSetToApply.hashCode());
        result = (result * PRIME) + (this.channelIds == null ? 43 : this.channelIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
