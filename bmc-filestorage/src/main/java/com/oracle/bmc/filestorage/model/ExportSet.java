/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage.model;

/**
 * A set of file systems to export through one or more mount
 * targets. Composed of zero or more export resources.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExportSet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
        private Long maxFsStatBytes;

        public Builder maxFsStatBytes(Long maxFsStatBytes) {
            this.maxFsStatBytes = maxFsStatBytes;
            this.__explicitlySet__.add("maxFsStatBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
        private Long maxFsStatFiles;

        public Builder maxFsStatFiles(Long maxFsStatFiles) {
            this.maxFsStatFiles = maxFsStatFiles;
            this.__explicitlySet__.add("maxFsStatFiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportSet build() {
            ExportSet __instance__ =
                    new ExportSet(
                            availabilityDomain,
                            compartmentId,
                            displayName,
                            id,
                            lifecycleState,
                            maxFsStatBytes,
                            maxFsStatFiles,
                            timeCreated,
                            vcnId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportSet o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .maxFsStatBytes(o.getMaxFsStatBytes())
                            .maxFsStatFiles(o.getMaxFsStatFiles())
                            .timeCreated(o.getTimeCreated())
                            .vcnId(o.getVcnId());

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

    /**
     * The availability domain the export set is in. May be unset
     * as a blank or NULL value.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment that contains the export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My export set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The current state of the export set.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the export set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Controls the maximum `tbytes`, `fbytes`, and `abytes`,
     * values reported by `NFS FSSTAT` calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * `tbytes` value reported by `FSSTAT` will be
     * `maxFsStatBytes`. The value of `fbytes` and `abytes` will be
     * `maxFsStatBytes` minus the metered size of the file
     * system. If the metered size is larger than `maxFsStatBytes`,
     * then `fbytes` and `abytes` will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatBytes")
    Long maxFsStatBytes;

    /**
     * Controls the maximum `tfiles`, `ffiles`, and `afiles`
     * values reported by `NFS FSSTAT` calls through any associated
     * mount targets. This is an advanced feature. For most
     * applications, use the default value. The
     * `tfiles` value reported by `FSSTAT` will be
     * `maxFsStatFiles`. The value of `ffiles` and `afiles` will be
     * `maxFsStatFiles` minus the metered size of the file
     * system. If the metered size is larger than `maxFsStatFiles`,
     * then `ffiles` and `afiles` will both be '0'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxFsStatFiles")
    Long maxFsStatFiles;

    /**
     * The date and time the export set was created, expressed
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The OCID of the virtual cloud network (VCN) the export set is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
