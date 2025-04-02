/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * An administrative feature that allows you to restrict root level access from clients that try to
 * access your Lustre file system as root. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RootSquashConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RootSquashConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "identitySquash",
        "squashUid",
        "squashGid",
        "clientExceptions"
    })
    public RootSquashConfiguration(
            IdentitySquash identitySquash,
            Long squashUid,
            Long squashGid,
            java.util.List<String> clientExceptions) {
        super();
        this.identitySquash = identitySquash;
        this.squashUid = squashUid;
        this.squashGid = squashGid;
        this.clientExceptions = clientExceptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Used when clients accessing the Lustre file system have their UID and GID remapped to
         * {@code squashUid} and {@code squashGid}. If {@code ROOT}, only the root user and group
         * (UID/GID 0) are remapped; if {@code NONE}, no remapping is done. If unspecified, defaults
         * to {@code NONE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identitySquash")
        private IdentitySquash identitySquash;

        /**
         * Used when clients accessing the Lustre file system have their UID and GID remapped to
         * {@code squashUid} and {@code squashGid}. If {@code ROOT}, only the root user and group
         * (UID/GID 0) are remapped; if {@code NONE}, no remapping is done. If unspecified, defaults
         * to {@code NONE}.
         *
         * @param identitySquash the value to set
         * @return this builder
         */
        public Builder identitySquash(IdentitySquash identitySquash) {
            this.identitySquash = identitySquash;
            this.__explicitlySet__.add("identitySquash");
            return this;
        }
        /**
         * The UID value to remap to when squashing a client UID. See {@code identitySquash} for
         * more details. If unspecified, defaults to {@code 65534}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("squashUid")
        private Long squashUid;

        /**
         * The UID value to remap to when squashing a client UID. See {@code identitySquash} for
         * more details. If unspecified, defaults to {@code 65534}.
         *
         * @param squashUid the value to set
         * @return this builder
         */
        public Builder squashUid(Long squashUid) {
            this.squashUid = squashUid;
            this.__explicitlySet__.add("squashUid");
            return this;
        }
        /**
         * The GID value to remap to when squashing a client GID. See {@code identitySquash} for
         * more details. If unspecified, defaults to {@code 65534}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("squashGid")
        private Long squashGid;

        /**
         * The GID value to remap to when squashing a client GID. See {@code identitySquash} for
         * more details. If unspecified, defaults to {@code 65534}.
         *
         * @param squashGid the value to set
         * @return this builder
         */
        public Builder squashGid(Long squashGid) {
            this.squashGid = squashGid;
            this.__explicitlySet__.add("squashGid");
            return this;
        }
        /**
         * A list of NIDs allowed with this lustre file system not to be squashed. A maximum of 10
         * is allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientExceptions")
        private java.util.List<String> clientExceptions;

        /**
         * A list of NIDs allowed with this lustre file system not to be squashed. A maximum of 10
         * is allowed.
         *
         * @param clientExceptions the value to set
         * @return this builder
         */
        public Builder clientExceptions(java.util.List<String> clientExceptions) {
            this.clientExceptions = clientExceptions;
            this.__explicitlySet__.add("clientExceptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RootSquashConfiguration build() {
            RootSquashConfiguration model =
                    new RootSquashConfiguration(
                            this.identitySquash,
                            this.squashUid,
                            this.squashGid,
                            this.clientExceptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RootSquashConfiguration model) {
            if (model.wasPropertyExplicitlySet("identitySquash")) {
                this.identitySquash(model.getIdentitySquash());
            }
            if (model.wasPropertyExplicitlySet("squashUid")) {
                this.squashUid(model.getSquashUid());
            }
            if (model.wasPropertyExplicitlySet("squashGid")) {
                this.squashGid(model.getSquashGid());
            }
            if (model.wasPropertyExplicitlySet("clientExceptions")) {
                this.clientExceptions(model.getClientExceptions());
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
     * Used when clients accessing the Lustre file system have their UID and GID remapped to {@code
     * squashUid} and {@code squashGid}. If {@code ROOT}, only the root user and group (UID/GID 0)
     * are remapped; if {@code NONE}, no remapping is done. If unspecified, defaults to {@code
     * NONE}.
     */
    public enum IdentitySquash implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Root("ROOT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdentitySquash.class);

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
     * Used when clients accessing the Lustre file system have their UID and GID remapped to {@code
     * squashUid} and {@code squashGid}. If {@code ROOT}, only the root user and group (UID/GID 0)
     * are remapped; if {@code NONE}, no remapping is done. If unspecified, defaults to {@code
     * NONE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identitySquash")
    private final IdentitySquash identitySquash;

    /**
     * Used when clients accessing the Lustre file system have their UID and GID remapped to {@code
     * squashUid} and {@code squashGid}. If {@code ROOT}, only the root user and group (UID/GID 0)
     * are remapped; if {@code NONE}, no remapping is done. If unspecified, defaults to {@code
     * NONE}.
     *
     * @return the value
     */
    public IdentitySquash getIdentitySquash() {
        return identitySquash;
    }

    /**
     * The UID value to remap to when squashing a client UID. See {@code identitySquash} for more
     * details. If unspecified, defaults to {@code 65534}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("squashUid")
    private final Long squashUid;

    /**
     * The UID value to remap to when squashing a client UID. See {@code identitySquash} for more
     * details. If unspecified, defaults to {@code 65534}.
     *
     * @return the value
     */
    public Long getSquashUid() {
        return squashUid;
    }

    /**
     * The GID value to remap to when squashing a client GID. See {@code identitySquash} for more
     * details. If unspecified, defaults to {@code 65534}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("squashGid")
    private final Long squashGid;

    /**
     * The GID value to remap to when squashing a client GID. See {@code identitySquash} for more
     * details. If unspecified, defaults to {@code 65534}.
     *
     * @return the value
     */
    public Long getSquashGid() {
        return squashGid;
    }

    /**
     * A list of NIDs allowed with this lustre file system not to be squashed. A maximum of 10 is
     * allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientExceptions")
    private final java.util.List<String> clientExceptions;

    /**
     * A list of NIDs allowed with this lustre file system not to be squashed. A maximum of 10 is
     * allowed.
     *
     * @return the value
     */
    public java.util.List<String> getClientExceptions() {
        return clientExceptions;
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
        sb.append("RootSquashConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("identitySquash=").append(String.valueOf(this.identitySquash));
        sb.append(", squashUid=").append(String.valueOf(this.squashUid));
        sb.append(", squashGid=").append(String.valueOf(this.squashGid));
        sb.append(", clientExceptions=").append(String.valueOf(this.clientExceptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RootSquashConfiguration)) {
            return false;
        }

        RootSquashConfiguration other = (RootSquashConfiguration) o;
        return java.util.Objects.equals(this.identitySquash, other.identitySquash)
                && java.util.Objects.equals(this.squashUid, other.squashUid)
                && java.util.Objects.equals(this.squashGid, other.squashGid)
                && java.util.Objects.equals(this.clientExceptions, other.clientExceptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.identitySquash == null ? 43 : this.identitySquash.hashCode());
        result = (result * PRIME) + (this.squashUid == null ? 43 : this.squashUid.hashCode());
        result = (result * PRIME) + (this.squashGid == null ? 43 : this.squashGid.hashCode());
        result =
                (result * PRIME)
                        + (this.clientExceptions == null ? 43 : this.clientExceptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
