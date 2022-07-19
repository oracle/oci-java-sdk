/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration tablespace settings valid for ADB-D target type using remap feature
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ADBServerlesTablespaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "targetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ADBServerlesTablespaceDetails extends TargetTypeTablespaceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of tablespace at target to which the source database tablespace need to be remapped.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remapTarget")
        private RemapTarget remapTarget;

        /**
         * Name of tablespace at target to which the source database tablespace need to be remapped.
         *
         * @param remapTarget the value to set
         * @return this builder
         **/
        public Builder remapTarget(RemapTarget remapTarget) {
            this.remapTarget = remapTarget;
            this.__explicitlySet__.add("remapTarget");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ADBServerlesTablespaceDetails build() {
            ADBServerlesTablespaceDetails __instance__ =
                    new ADBServerlesTablespaceDetails(remapTarget);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ADBServerlesTablespaceDetails o) {
            Builder copiedBuilder = remapTarget(o.getRemapTarget());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @Deprecated
    public ADBServerlesTablespaceDetails(RemapTarget remapTarget) {
        super();
        this.remapTarget = remapTarget;
    }

    /**
     * Name of tablespace at target to which the source database tablespace need to be remapped.
     *
     **/
    public enum RemapTarget {
        Data("DATA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RemapTarget.class);

        private final String value;
        private static java.util.Map<String, RemapTarget> map;

        static {
            map = new java.util.HashMap<>();
            for (RemapTarget v : RemapTarget.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RemapTarget(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RemapTarget create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RemapTarget', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Name of tablespace at target to which the source database tablespace need to be remapped.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remapTarget")
    private final RemapTarget remapTarget;

    /**
     * Name of tablespace at target to which the source database tablespace need to be remapped.
     *
     * @return the value
     **/
    public RemapTarget getRemapTarget() {
        return remapTarget;
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
        sb.append("ADBServerlesTablespaceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", remapTarget=").append(String.valueOf(this.remapTarget));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ADBServerlesTablespaceDetails)) {
            return false;
        }

        ADBServerlesTablespaceDetails other = (ADBServerlesTablespaceDetails) o;
        return java.util.Objects.equals(this.remapTarget, other.remapTarget)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.remapTarget == null ? 43 : this.remapTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
