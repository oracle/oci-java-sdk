/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * Purge parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PurgeQueueDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PurgeQueueDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"purgeType"})
    public PurgeQueueDetails(PurgeType purgeType) {
        super();
        this.purgeType = purgeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of the purge to perform:
         * - NORMAL - purge only normal queue
         * - DLQ - purge only DLQ
         * - BOTH - purge both normal queue and DLQ
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeType")
        private PurgeType purgeType;

        /**
         * Type of the purge to perform:
         * - NORMAL - purge only normal queue
         * - DLQ - purge only DLQ
         * - BOTH - purge both normal queue and DLQ
         *
         * @param purgeType the value to set
         * @return this builder
         **/
        public Builder purgeType(PurgeType purgeType) {
            this.purgeType = purgeType;
            this.__explicitlySet__.add("purgeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PurgeQueueDetails build() {
            PurgeQueueDetails model = new PurgeQueueDetails(this.purgeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PurgeQueueDetails model) {
            if (model.wasPropertyExplicitlySet("purgeType")) {
                this.purgeType(model.getPurgeType());
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
     * Type of the purge to perform:
     * - NORMAL - purge only normal queue
     * - DLQ - purge only DLQ
     * - BOTH - purge both normal queue and DLQ
     *
     **/
    public enum PurgeType {
        Normal("NORMAL"),
        Dlq("DLQ"),
        Both("BOTH"),
        ;

        private final String value;
        private static java.util.Map<String, PurgeType> map;

        static {
            map = new java.util.HashMap<>();
            for (PurgeType v : PurgeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PurgeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PurgeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PurgeType: " + key);
        }
    };
    /**
     * Type of the purge to perform:
     * - NORMAL - purge only normal queue
     * - DLQ - purge only DLQ
     * - BOTH - purge both normal queue and DLQ
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeType")
    private final PurgeType purgeType;

    /**
     * Type of the purge to perform:
     * - NORMAL - purge only normal queue
     * - DLQ - purge only DLQ
     * - BOTH - purge both normal queue and DLQ
     *
     * @return the value
     **/
    public PurgeType getPurgeType() {
        return purgeType;
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
        sb.append("PurgeQueueDetails(");
        sb.append("super=").append(super.toString());
        sb.append("purgeType=").append(String.valueOf(this.purgeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurgeQueueDetails)) {
            return false;
        }

        PurgeQueueDetails other = (PurgeQueueDetails) o;
        return java.util.Objects.equals(this.purgeType, other.purgeType) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.purgeType == null ? 43 : this.purgeType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
