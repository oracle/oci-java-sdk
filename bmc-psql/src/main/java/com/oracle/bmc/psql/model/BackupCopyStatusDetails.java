/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Backup Copy Status details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BackupCopyStatusDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupCopyStatusDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "stateDetails", "backupId", "region"})
    public BackupCopyStatusDetails(
            State state, String stateDetails, String backupId, String region) {
        super();
        this.state = state;
        this.stateDetails = stateDetails;
        this.backupId = backupId;
        this.region = region;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Copy States */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * Copy States
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** A message describing the current state of copy in more detail */
        @com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
        private String stateDetails;

        /**
         * A message describing the current state of copy in more detail
         *
         * @param stateDetails the value to set
         * @return this builder
         */
        public Builder stateDetails(String stateDetails) {
            this.stateDetails = stateDetails;
            this.__explicitlySet__.add("stateDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup in the source region
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupId")
        private String backupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup in the source region
         *
         * @param backupId the value to set
         * @return this builder
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            this.__explicitlySet__.add("backupId");
            return this;
        }
        /** Region name of the remote region */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region name of the remote region
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupCopyStatusDetails build() {
            BackupCopyStatusDetails model =
                    new BackupCopyStatusDetails(
                            this.state, this.stateDetails, this.backupId, this.region);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupCopyStatusDetails model) {
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("stateDetails")) {
                this.stateDetails(model.getStateDetails());
            }
            if (model.wasPropertyExplicitlySet("backupId")) {
                this.backupId(model.getBackupId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
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

    /** Copy States */
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        NotStarted("NOT_STARTED"),
        Copying("COPYING"),
        Copied("COPIED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Copy States */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * Copy States
     *
     * @return the value
     */
    public State getState() {
        return state;
    }

    /** A message describing the current state of copy in more detail */
    @com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
    private final String stateDetails;

    /**
     * A message describing the current state of copy in more detail
     *
     * @return the value
     */
    public String getStateDetails() {
        return stateDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup in the source region
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    private final String backupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup in the source region
     *
     * @return the value
     */
    public String getBackupId() {
        return backupId;
    }

    /** Region name of the remote region */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region name of the remote region
     *
     * @return the value
     */
    public String getRegion() {
        return region;
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
        sb.append("BackupCopyStatusDetails(");
        sb.append("super=").append(super.toString());
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", stateDetails=").append(String.valueOf(this.stateDetails));
        sb.append(", backupId=").append(String.valueOf(this.backupId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupCopyStatusDetails)) {
            return false;
        }

        BackupCopyStatusDetails other = (BackupCopyStatusDetails) o;
        return java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.stateDetails, other.stateDetails)
                && java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.region, other.region)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.stateDetails == null ? 43 : this.stateDetails.hashCode());
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
