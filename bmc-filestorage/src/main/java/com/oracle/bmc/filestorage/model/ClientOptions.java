/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage.model;

/**
 * NFS export options applied to a specified set of
 * clients. Only governs access through the associated
 * export. Access to the same file system through a different
 * export (on the same or different mount target) will be governed
 * by that export's export options.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClientOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ClientOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requirePrivilegedSourcePort")
        private Boolean requirePrivilegedSourcePort;

        public Builder requirePrivilegedSourcePort(Boolean requirePrivilegedSourcePort) {
            this.requirePrivilegedSourcePort = requirePrivilegedSourcePort;
            this.__explicitlySet__.add("requirePrivilegedSourcePort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("access")
        private Access access;

        public Builder access(Access access) {
            this.access = access;
            this.__explicitlySet__.add("access");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identitySquash")
        private IdentitySquash identitySquash;

        public Builder identitySquash(IdentitySquash identitySquash) {
            this.identitySquash = identitySquash;
            this.__explicitlySet__.add("identitySquash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("anonymousUid")
        private Long anonymousUid;

        public Builder anonymousUid(Long anonymousUid) {
            this.anonymousUid = anonymousUid;
            this.__explicitlySet__.add("anonymousUid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("anonymousGid")
        private Long anonymousGid;

        public Builder anonymousGid(Long anonymousGid) {
            this.anonymousGid = anonymousGid;
            this.__explicitlySet__.add("anonymousGid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClientOptions build() {
            ClientOptions __instance__ =
                    new ClientOptions(
                            source,
                            requirePrivilegedSourcePort,
                            access,
                            identitySquash,
                            anonymousUid,
                            anonymousGid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClientOptions o) {
            Builder copiedBuilder =
                    source(o.getSource())
                            .requirePrivilegedSourcePort(o.getRequirePrivilegedSourcePort())
                            .access(o.getAccess())
                            .identitySquash(o.getIdentitySquash())
                            .anonymousUid(o.getAnonymousUid())
                            .anonymousGid(o.getAnonymousGid());

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
     * Clients these options should apply to. Must be a either
     * single IPv4 address or single IPv4 CIDR block.
     * <p>
     **Note:** Access will also be limited by any applicable VCN
     * security rules and the ability to route IP packets to the
     * mount target. Mount targets do not have Internet-routable IP addresses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    String source;

    /**
     * If `true`, clients accessing the file system through this
     * export must connect from a privileged source port. If
     * unspecified, defaults to `true`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requirePrivilegedSourcePort")
    Boolean requirePrivilegedSourcePort;
    /**
     * Type of access to grant clients using the file system
     * through this export. If unspecified defaults to `READ_ONLY`.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Access {
        ReadWrite("READ_WRITE"),
        ReadOnly("READ_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Access> map;

        static {
            map = new java.util.HashMap<>();
            for (Access v : Access.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Access(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Access create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Access', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of access to grant clients using the file system
     * through this export. If unspecified defaults to `READ_ONLY`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("access")
    Access access;
    /**
     * Used when clients accessing the file system through this export
     * have their UID and GID remapped to 'anonymousUid' and
     * 'anonymousGid'. If `ALL`, all users and groups are remapped;
     * if `ROOT`, only the root user and group (UID/GID 0) are
     * remapped; if `NONE`, no remapping is done. If unspecified,
     * defaults to `ROOT`.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum IdentitySquash {
        None("NONE"),
        Root("ROOT"),
        All("ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, IdentitySquash> map;

        static {
            map = new java.util.HashMap<>();
            for (IdentitySquash v : IdentitySquash.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdentitySquash(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdentitySquash create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdentitySquash', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Used when clients accessing the file system through this export
     * have their UID and GID remapped to 'anonymousUid' and
     * 'anonymousGid'. If `ALL`, all users and groups are remapped;
     * if `ROOT`, only the root user and group (UID/GID 0) are
     * remapped; if `NONE`, no remapping is done. If unspecified,
     * defaults to `ROOT`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identitySquash")
    IdentitySquash identitySquash;

    /**
     * UID value to remap to when squashing a client UID (see
     * identitySquash for more details.) If unspecified, defaults
     * to `65534`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anonymousUid")
    Long anonymousUid;

    /**
     * GID value to remap to when squashing a client GID (see
     * identitySquash for more details.) If unspecified defaults
     * to `65534`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anonymousGid")
    Long anonymousGid;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
