/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * kmsKeyInfo
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KmsKeyInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class KmsKeyInfo {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeKeyId",
        "activeKeyVersion",
        "scheduledKeyId",
        "scheduledKeyVersion",
        "currentKeyLifecycleState",
        "scheduledLifecycleState",
        "scheduledKeyStatus"
    })
    public KmsKeyInfo(
            String activeKeyId,
            String activeKeyVersion,
            String scheduledKeyId,
            String scheduledKeyVersion,
            String currentKeyLifecycleState,
            String scheduledLifecycleState,
            ScheduledKeyStatus scheduledKeyStatus) {
        super();
        this.activeKeyId = activeKeyId;
        this.activeKeyVersion = activeKeyVersion;
        this.scheduledKeyId = scheduledKeyId;
        this.scheduledKeyVersion = scheduledKeyVersion;
        this.currentKeyLifecycleState = currentKeyLifecycleState;
        this.scheduledLifecycleState = scheduledLifecycleState;
        this.scheduledKeyStatus = scheduledKeyStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * current BYOK keyId facp is using
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeKeyId")
        private String activeKeyId;

        /**
         * current BYOK keyId facp is using
         * @param activeKeyId the value to set
         * @return this builder
         **/
        public Builder activeKeyId(String activeKeyId) {
            this.activeKeyId = activeKeyId;
            this.__explicitlySet__.add("activeKeyId");
            return this;
        }
        /**
         * current key version facp is using
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeKeyVersion")
        private String activeKeyVersion;

        /**
         * current key version facp is using
         * @param activeKeyVersion the value to set
         * @return this builder
         **/
        public Builder activeKeyVersion(String activeKeyVersion) {
            this.activeKeyVersion = activeKeyVersion;
            this.__explicitlySet__.add("activeKeyVersion");
            return this;
        }
        /**
         * scheduled keyId to be updated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledKeyId")
        private String scheduledKeyId;

        /**
         * scheduled keyId to be updated
         * @param scheduledKeyId the value to set
         * @return this builder
         **/
        public Builder scheduledKeyId(String scheduledKeyId) {
            this.scheduledKeyId = scheduledKeyId;
            this.__explicitlySet__.add("scheduledKeyId");
            return this;
        }
        /**
         * scheduled key version to be updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledKeyVersion")
        private String scheduledKeyVersion;

        /**
         * scheduled key version to be updated.
         * @param scheduledKeyVersion the value to set
         * @return this builder
         **/
        public Builder scheduledKeyVersion(String scheduledKeyVersion) {
            this.scheduledKeyVersion = scheduledKeyVersion;
            this.__explicitlySet__.add("scheduledKeyVersion");
            return this;
        }
        /**
         * current key lifeCycleState
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentKeyLifecycleState")
        private String currentKeyLifecycleState;

        /**
         * current key lifeCycleState
         * @param currentKeyLifecycleState the value to set
         * @return this builder
         **/
        public Builder currentKeyLifecycleState(String currentKeyLifecycleState) {
            this.currentKeyLifecycleState = currentKeyLifecycleState;
            this.__explicitlySet__.add("currentKeyLifecycleState");
            return this;
        }
        /**
         * scheduled key lifeCycle state to be updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledLifecycleState")
        private String scheduledLifecycleState;

        /**
         * scheduled key lifeCycle state to be updated.
         * @param scheduledLifecycleState the value to set
         * @return this builder
         **/
        public Builder scheduledLifecycleState(String scheduledLifecycleState) {
            this.scheduledLifecycleState = scheduledLifecycleState;
            this.__explicitlySet__.add("scheduledLifecycleState");
            return this;
        }
        /**
         * the scheduled key status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledKeyStatus")
        private ScheduledKeyStatus scheduledKeyStatus;

        /**
         * the scheduled key status
         * @param scheduledKeyStatus the value to set
         * @return this builder
         **/
        public Builder scheduledKeyStatus(ScheduledKeyStatus scheduledKeyStatus) {
            this.scheduledKeyStatus = scheduledKeyStatus;
            this.__explicitlySet__.add("scheduledKeyStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KmsKeyInfo build() {
            KmsKeyInfo __instance__ =
                    new KmsKeyInfo(
                            activeKeyId,
                            activeKeyVersion,
                            scheduledKeyId,
                            scheduledKeyVersion,
                            currentKeyLifecycleState,
                            scheduledLifecycleState,
                            scheduledKeyStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KmsKeyInfo o) {
            Builder copiedBuilder =
                    activeKeyId(o.getActiveKeyId())
                            .activeKeyVersion(o.getActiveKeyVersion())
                            .scheduledKeyId(o.getScheduledKeyId())
                            .scheduledKeyVersion(o.getScheduledKeyVersion())
                            .currentKeyLifecycleState(o.getCurrentKeyLifecycleState())
                            .scheduledLifecycleState(o.getScheduledLifecycleState())
                            .scheduledKeyStatus(o.getScheduledKeyStatus());

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

    /**
     * current BYOK keyId facp is using
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeKeyId")
    private final String activeKeyId;

    /**
     * current BYOK keyId facp is using
     * @return the value
     **/
    public String getActiveKeyId() {
        return activeKeyId;
    }

    /**
     * current key version facp is using
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeKeyVersion")
    private final String activeKeyVersion;

    /**
     * current key version facp is using
     * @return the value
     **/
    public String getActiveKeyVersion() {
        return activeKeyVersion;
    }

    /**
     * scheduled keyId to be updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledKeyId")
    private final String scheduledKeyId;

    /**
     * scheduled keyId to be updated
     * @return the value
     **/
    public String getScheduledKeyId() {
        return scheduledKeyId;
    }

    /**
     * scheduled key version to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledKeyVersion")
    private final String scheduledKeyVersion;

    /**
     * scheduled key version to be updated.
     * @return the value
     **/
    public String getScheduledKeyVersion() {
        return scheduledKeyVersion;
    }

    /**
     * current key lifeCycleState
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentKeyLifecycleState")
    private final String currentKeyLifecycleState;

    /**
     * current key lifeCycleState
     * @return the value
     **/
    public String getCurrentKeyLifecycleState() {
        return currentKeyLifecycleState;
    }

    /**
     * scheduled key lifeCycle state to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledLifecycleState")
    private final String scheduledLifecycleState;

    /**
     * scheduled key lifeCycle state to be updated.
     * @return the value
     **/
    public String getScheduledLifecycleState() {
        return scheduledLifecycleState;
    }

    /**
     * the scheduled key status
     **/
    public enum ScheduledKeyStatus {
        Scheduling("SCHEDULING"),
        Updating("UPDATING"),
        Failed("FAILED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, ScheduledKeyStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ScheduledKeyStatus v : ScheduledKeyStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        ScheduledKeyStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScheduledKeyStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ScheduledKeyStatus: " + key);
        }
    };
    /**
     * the scheduled key status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledKeyStatus")
    private final ScheduledKeyStatus scheduledKeyStatus;

    /**
     * the scheduled key status
     * @return the value
     **/
    public ScheduledKeyStatus getScheduledKeyStatus() {
        return scheduledKeyStatus;
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
        sb.append("KmsKeyInfo(");
        sb.append("activeKeyId=").append(String.valueOf(this.activeKeyId));
        sb.append(", activeKeyVersion=").append(String.valueOf(this.activeKeyVersion));
        sb.append(", scheduledKeyId=").append(String.valueOf(this.scheduledKeyId));
        sb.append(", scheduledKeyVersion=").append(String.valueOf(this.scheduledKeyVersion));
        sb.append(", currentKeyLifecycleState=")
                .append(String.valueOf(this.currentKeyLifecycleState));
        sb.append(", scheduledLifecycleState=")
                .append(String.valueOf(this.scheduledLifecycleState));
        sb.append(", scheduledKeyStatus=").append(String.valueOf(this.scheduledKeyStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KmsKeyInfo)) {
            return false;
        }

        KmsKeyInfo other = (KmsKeyInfo) o;
        return java.util.Objects.equals(this.activeKeyId, other.activeKeyId)
                && java.util.Objects.equals(this.activeKeyVersion, other.activeKeyVersion)
                && java.util.Objects.equals(this.scheduledKeyId, other.scheduledKeyId)
                && java.util.Objects.equals(this.scheduledKeyVersion, other.scheduledKeyVersion)
                && java.util.Objects.equals(
                        this.currentKeyLifecycleState, other.currentKeyLifecycleState)
                && java.util.Objects.equals(
                        this.scheduledLifecycleState, other.scheduledLifecycleState)
                && java.util.Objects.equals(this.scheduledKeyStatus, other.scheduledKeyStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.activeKeyId == null ? 43 : this.activeKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.activeKeyVersion == null ? 43 : this.activeKeyVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledKeyId == null ? 43 : this.scheduledKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledKeyVersion == null
                                ? 43
                                : this.scheduledKeyVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.currentKeyLifecycleState == null
                                ? 43
                                : this.currentKeyLifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledLifecycleState == null
                                ? 43
                                : this.scheduledLifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledKeyStatus == null
                                ? 43
                                : this.scheduledKeyStatus.hashCode());
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
