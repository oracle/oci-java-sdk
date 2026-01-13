/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Shows details about the last recycle performed on this host. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecycleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecycleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"recycleLevel", "computeHostGroupId"})
    public RecycleDetails(RecycleLevel recycleLevel, String computeHostGroupId) {
        super();
        this.recycleLevel = recycleLevel;
        this.computeHostGroupId = computeHostGroupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Preferred recycle level for hosts associated with the reservation config. * {@code
         * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This
         * is the default behavior.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recycleLevel")
        private RecycleLevel recycleLevel;

        /**
         * Preferred recycle level for hosts associated with the reservation config. * {@code
         * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This
         * is the default behavior.
         *
         * @param recycleLevel the value to set
         * @return this builder
         */
        public Builder recycleLevel(RecycleLevel recycleLevel) {
            this.recycleLevel = recycleLevel;
            this.__explicitlySet__.add("recycleLevel");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute host group this host was attached to at the time of recycle.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeHostGroupId")
        private String computeHostGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute host group this host was attached to at the time of recycle.
         *
         * @param computeHostGroupId the value to set
         * @return this builder
         */
        public Builder computeHostGroupId(String computeHostGroupId) {
            this.computeHostGroupId = computeHostGroupId;
            this.__explicitlySet__.add("computeHostGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecycleDetails build() {
            RecycleDetails model = new RecycleDetails(this.recycleLevel, this.computeHostGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecycleDetails model) {
            if (model.wasPropertyExplicitlySet("recycleLevel")) {
                this.recycleLevel(model.getRecycleLevel());
            }
            if (model.wasPropertyExplicitlySet("computeHostGroupId")) {
                this.computeHostGroupId(model.getComputeHostGroupId());
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
     * Preferred recycle level for hosts associated with the reservation config. * {@code
     * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This is
     * the default behavior.
     */
    public enum RecycleLevel implements com.oracle.bmc.http.internal.BmcEnum {
        SkipRecycle("SKIP_RECYCLE"),
        FullRecycle("FULL_RECYCLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RecycleLevel.class);

        private final String value;
        private static java.util.Map<String, RecycleLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (RecycleLevel v : RecycleLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecycleLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecycleLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecycleLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Preferred recycle level for hosts associated with the reservation config. * {@code
     * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This is
     * the default behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recycleLevel")
    private final RecycleLevel recycleLevel;

    /**
     * Preferred recycle level for hosts associated with the reservation config. * {@code
     * SKIP_RECYCLE} - Skips host wipe. * {@code FULL_RECYCLE} - Does not skip host wipe. This is
     * the default behavior.
     *
     * @return the value
     */
    public RecycleLevel getRecycleLevel() {
        return recycleLevel;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute host group this host was attached to at the time of recycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeHostGroupId")
    private final String computeHostGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute host group this host was attached to at the time of recycle.
     *
     * @return the value
     */
    public String getComputeHostGroupId() {
        return computeHostGroupId;
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
        sb.append("RecycleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("recycleLevel=").append(String.valueOf(this.recycleLevel));
        sb.append(", computeHostGroupId=").append(String.valueOf(this.computeHostGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecycleDetails)) {
            return false;
        }

        RecycleDetails other = (RecycleDetails) o;
        return java.util.Objects.equals(this.recycleLevel, other.recycleLevel)
                && java.util.Objects.equals(this.computeHostGroupId, other.computeHostGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.recycleLevel == null ? 43 : this.recycleLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHostGroupId == null
                                ? 43
                                : this.computeHostGroupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
