/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Sandbox snapshot resource representation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SandboxSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxSnapshot
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "projectId",
        "sandboxId",
        "runtime",
        "expirationDuration",
        "sizeBytes",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "timeExpires"
    })
    public SandboxSnapshot(
            String id,
            String displayName,
            String projectId,
            String sandboxId,
            String runtime,
            String expirationDuration,
            Long sizeBytes,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeExpires) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.projectId = projectId;
        this.sandboxId = sandboxId;
        this.runtime = runtime;
        this.expirationDuration = expirationDuration;
        this.sizeBytes = sizeBytes;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeExpires = timeExpires;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sandbox snapshot identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Sandbox snapshot identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name for the sandbox snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for the sandbox snapshot.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Project identifier that the sandbox snapshot belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * Project identifier that the sandbox snapshot belongs to.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /** Identifier of the sandbox used to create the sandbox snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("sandboxId")
        private String sandboxId;

        /**
         * Identifier of the sandbox used to create the sandbox snapshot.
         *
         * @param sandboxId the value to set
         * @return this builder
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            this.__explicitlySet__.add("sandboxId");
            return this;
        }
        /** Runtime identifier for the sandbox snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("runtime")
        private String runtime;

        /**
         * Runtime identifier for the sandbox snapshot.
         *
         * @param runtime the value to set
         * @return this builder
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            this.__explicitlySet__.add("runtime");
            return this;
        }
        /**
         * Duration after creation before the sandbox snapshot expires, in ISO 8601 duration format.
         * For example, {@code P7D} for 7 days or {@code PT24H} for 24 hours.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expirationDuration")
        private String expirationDuration;

        /**
         * Duration after creation before the sandbox snapshot expires, in ISO 8601 duration format.
         * For example, {@code P7D} for 7 days or {@code PT24H} for 24 hours.
         *
         * @param expirationDuration the value to set
         * @return this builder
         */
        public Builder expirationDuration(String expirationDuration) {
            this.expirationDuration = expirationDuration;
            this.__explicitlySet__.add("expirationDuration");
            return this;
        }
        /** Size of the sandbox snapshot archive in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeBytes")
        private Long sizeBytes;

        /**
         * Size of the sandbox snapshot archive in bytes.
         *
         * @param sizeBytes the value to set
         * @return this builder
         */
        public Builder sizeBytes(Long sizeBytes) {
            this.sizeBytes = sizeBytes;
            this.__explicitlySet__.add("sizeBytes");
            return this;
        }
        /** The current state of the SandboxSnapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the SandboxSnapshot.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The date and time the sandbox snapshot was created, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the sandbox snapshot was created, in RFC 3339 format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the sandbox snapshot was last updated, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the sandbox snapshot was last updated, in RFC 3339 format.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The date and time the sandbox snapshot expires, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The date and time the sandbox snapshot expires, in RFC 3339 format.
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxSnapshot build() {
            SandboxSnapshot model =
                    new SandboxSnapshot(
                            this.id,
                            this.displayName,
                            this.projectId,
                            this.sandboxId,
                            this.runtime,
                            this.expirationDuration,
                            this.sizeBytes,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeExpires);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxSnapshot model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("sandboxId")) {
                this.sandboxId(model.getSandboxId());
            }
            if (model.wasPropertyExplicitlySet("runtime")) {
                this.runtime(model.getRuntime());
            }
            if (model.wasPropertyExplicitlySet("expirationDuration")) {
                this.expirationDuration(model.getExpirationDuration());
            }
            if (model.wasPropertyExplicitlySet("sizeBytes")) {
                this.sizeBytes(model.getSizeBytes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
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

    /** Sandbox snapshot identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Sandbox snapshot identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name for the sandbox snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for the sandbox snapshot.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Project identifier that the sandbox snapshot belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * Project identifier that the sandbox snapshot belongs to.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /** Identifier of the sandbox used to create the sandbox snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("sandboxId")
    private final String sandboxId;

    /**
     * Identifier of the sandbox used to create the sandbox snapshot.
     *
     * @return the value
     */
    public String getSandboxId() {
        return sandboxId;
    }

    /** Runtime identifier for the sandbox snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("runtime")
    private final String runtime;

    /**
     * Runtime identifier for the sandbox snapshot.
     *
     * @return the value
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * Duration after creation before the sandbox snapshot expires, in ISO 8601 duration format. For
     * example, {@code P7D} for 7 days or {@code PT24H} for 24 hours.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDuration")
    private final String expirationDuration;

    /**
     * Duration after creation before the sandbox snapshot expires, in ISO 8601 duration format. For
     * example, {@code P7D} for 7 days or {@code PT24H} for 24 hours.
     *
     * @return the value
     */
    public String getExpirationDuration() {
        return expirationDuration;
    }

    /** Size of the sandbox snapshot archive in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeBytes")
    private final Long sizeBytes;

    /**
     * Size of the sandbox snapshot archive in bytes.
     *
     * @return the value
     */
    public Long getSizeBytes() {
        return sizeBytes;
    }

    /** The current state of the SandboxSnapshot. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    /** The current state of the SandboxSnapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the SandboxSnapshot.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time the sandbox snapshot was created, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the sandbox snapshot was created, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the sandbox snapshot was last updated, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the sandbox snapshot was last updated, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time the sandbox snapshot expires, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The date and time the sandbox snapshot expires, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
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
        sb.append("SandboxSnapshot(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", sandboxId=").append(String.valueOf(this.sandboxId));
        sb.append(", runtime=").append(String.valueOf(this.runtime));
        sb.append(", expirationDuration=").append(String.valueOf(this.expirationDuration));
        sb.append(", sizeBytes=").append(String.valueOf(this.sizeBytes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxSnapshot)) {
            return false;
        }

        SandboxSnapshot other = (SandboxSnapshot) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.runtime, other.runtime)
                && java.util.Objects.equals(this.expirationDuration, other.expirationDuration)
                && java.util.Objects.equals(this.sizeBytes, other.sizeBytes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result = (result * PRIME) + (this.runtime == null ? 43 : this.runtime.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDuration == null
                                ? 43
                                : this.expirationDuration.hashCode());
        result = (result * PRIME) + (this.sizeBytes == null ? 43 : this.sizeBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
