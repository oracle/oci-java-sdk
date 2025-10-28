/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for Database member in an Automatic DR configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutomaticDrConfigurationMemberDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutomaticDrConfigurationMemberDatabaseDetails
        extends CreateAutomaticDrConfigurationMemberDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * A flag indicating if the automatic switchover should be enabled for the Database member
         * in the Automatic DR configuration.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoSwitchoverEnabled")
        private Boolean isAutoSwitchoverEnabled;

        /**
         * A flag indicating if the automatic switchover should be enabled for the Database member
         * in the Automatic DR configuration.
         *
         * <p>Example: {@code false}
         *
         * @param isAutoSwitchoverEnabled the value to set
         * @return this builder
         */
        public Builder isAutoSwitchoverEnabled(Boolean isAutoSwitchoverEnabled) {
            this.isAutoSwitchoverEnabled = isAutoSwitchoverEnabled;
            this.__explicitlySet__.add("isAutoSwitchoverEnabled");
            return this;
        }
        /**
         * A flag indicating if the automatic failover should be enabled for the Database member in
         * the Automatic DR configuration.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoFailoverEnabled")
        private Boolean isAutoFailoverEnabled;

        /**
         * A flag indicating if the automatic failover should be enabled for the Database member in
         * the Automatic DR configuration.
         *
         * <p>Example: {@code false}
         *
         * @param isAutoFailoverEnabled the value to set
         * @return this builder
         */
        public Builder isAutoFailoverEnabled(Boolean isAutoFailoverEnabled) {
            this.isAutoFailoverEnabled = isAutoFailoverEnabled;
            this.__explicitlySet__.add("isAutoFailoverEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutomaticDrConfigurationMemberDatabaseDetails build() {
            CreateAutomaticDrConfigurationMemberDatabaseDetails model =
                    new CreateAutomaticDrConfigurationMemberDatabaseDetails(
                            this.memberId,
                            this.isAutoSwitchoverEnabled,
                            this.isAutoFailoverEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutomaticDrConfigurationMemberDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("isAutoSwitchoverEnabled")) {
                this.isAutoSwitchoverEnabled(model.getIsAutoSwitchoverEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAutoFailoverEnabled")) {
                this.isAutoFailoverEnabled(model.getIsAutoFailoverEnabled());
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
    public CreateAutomaticDrConfigurationMemberDatabaseDetails(
            String memberId, Boolean isAutoSwitchoverEnabled, Boolean isAutoFailoverEnabled) {
        super(memberId);
        this.isAutoSwitchoverEnabled = isAutoSwitchoverEnabled;
        this.isAutoFailoverEnabled = isAutoFailoverEnabled;
    }

    /**
     * A flag indicating if the automatic switchover should be enabled for the Database member in
     * the Automatic DR configuration.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoSwitchoverEnabled")
    private final Boolean isAutoSwitchoverEnabled;

    /**
     * A flag indicating if the automatic switchover should be enabled for the Database member in
     * the Automatic DR configuration.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsAutoSwitchoverEnabled() {
        return isAutoSwitchoverEnabled;
    }

    /**
     * A flag indicating if the automatic failover should be enabled for the Database member in the
     * Automatic DR configuration.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoFailoverEnabled")
    private final Boolean isAutoFailoverEnabled;

    /**
     * A flag indicating if the automatic failover should be enabled for the Database member in the
     * Automatic DR configuration.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsAutoFailoverEnabled() {
        return isAutoFailoverEnabled;
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
        sb.append("CreateAutomaticDrConfigurationMemberDatabaseDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isAutoSwitchoverEnabled=")
                .append(String.valueOf(this.isAutoSwitchoverEnabled));
        sb.append(", isAutoFailoverEnabled=").append(String.valueOf(this.isAutoFailoverEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutomaticDrConfigurationMemberDatabaseDetails)) {
            return false;
        }

        CreateAutomaticDrConfigurationMemberDatabaseDetails other =
                (CreateAutomaticDrConfigurationMemberDatabaseDetails) o;
        return java.util.Objects.equals(this.isAutoSwitchoverEnabled, other.isAutoSwitchoverEnabled)
                && java.util.Objects.equals(this.isAutoFailoverEnabled, other.isAutoFailoverEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isAutoSwitchoverEnabled == null
                                ? 43
                                : this.isAutoSwitchoverEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoFailoverEnabled == null
                                ? 43
                                : this.isAutoFailoverEnabled.hashCode());
        return result;
    }
}
