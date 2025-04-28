/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * The empty directory volume of a container instance. You can create up to 64 EmptyDir per
 * container instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerEmptyDirVolume.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "volumeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerEmptyDirVolume extends ContainerVolume {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The volume type of the empty directory, can be either File Storage or Memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("backingStore")
        private BackingStore backingStore;

        /**
         * The volume type of the empty directory, can be either File Storage or Memory.
         *
         * @param backingStore the value to set
         * @return this builder
         */
        public Builder backingStore(BackingStore backingStore) {
            this.backingStore = backingStore;
            this.__explicitlySet__.add("backingStore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerEmptyDirVolume build() {
            ContainerEmptyDirVolume model =
                    new ContainerEmptyDirVolume(this.name, this.backingStore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerEmptyDirVolume model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("backingStore")) {
                this.backingStore(model.getBackingStore());
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

    @Deprecated
    public ContainerEmptyDirVolume(String name, BackingStore backingStore) {
        super(name);
        this.backingStore = backingStore;
    }

    /** The volume type of the empty directory, can be either File Storage or Memory. */
    public enum BackingStore implements com.oracle.bmc.http.internal.BmcEnum {
        EphemeralStorage("EPHEMERAL_STORAGE"),
        Memory("MEMORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackingStore.class);

        private final String value;
        private static java.util.Map<String, BackingStore> map;

        static {
            map = new java.util.HashMap<>();
            for (BackingStore v : BackingStore.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackingStore(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackingStore create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackingStore', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The volume type of the empty directory, can be either File Storage or Memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("backingStore")
    private final BackingStore backingStore;

    /**
     * The volume type of the empty directory, can be either File Storage or Memory.
     *
     * @return the value
     */
    public BackingStore getBackingStore() {
        return backingStore;
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
        sb.append("ContainerEmptyDirVolume(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", backingStore=").append(String.valueOf(this.backingStore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerEmptyDirVolume)) {
            return false;
        }

        ContainerEmptyDirVolume other = (ContainerEmptyDirVolume) o;
        return java.util.Objects.equals(this.backingStore, other.backingStore)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backingStore == null ? 43 : this.backingStore.hashCode());
        return result;
    }
}
