/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for updating a Autonomous Container DatabaseData Guard association for a Autonomous Container Database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAutonomousContainerDatabaseDataGuardAssociationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAutonomousContainerDatabaseDataGuardAssociationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isAutomaticFailoverEnabled"})
    public UpdateAutonomousContainerDatabaseDataGuardAssociationDetails(
            Boolean isAutomaticFailoverEnabled) {
        super();
        this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
        private Boolean isAutomaticFailoverEnabled;

        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
         *
         * @param isAutomaticFailoverEnabled the value to set
         * @return this builder
         **/
        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
            this.__explicitlySet__.add("isAutomaticFailoverEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousContainerDatabaseDataGuardAssociationDetails build() {
            UpdateAutonomousContainerDatabaseDataGuardAssociationDetails model =
                    new UpdateAutonomousContainerDatabaseDataGuardAssociationDetails(
                            this.isAutomaticFailoverEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousContainerDatabaseDataGuardAssociationDetails model) {
            if (model.wasPropertyExplicitlySet("isAutomaticFailoverEnabled")) {
                this.isAutomaticFailoverEnabled(model.getIsAutomaticFailoverEnabled());
            }
            return this;
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
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
    private final Boolean isAutomaticFailoverEnabled;

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     *
     * @return the value
     **/
    public Boolean getIsAutomaticFailoverEnabled() {
        return isAutomaticFailoverEnabled;
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
        sb.append("UpdateAutonomousContainerDatabaseDataGuardAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isAutomaticFailoverEnabled=")
                .append(String.valueOf(this.isAutomaticFailoverEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousContainerDatabaseDataGuardAssociationDetails)) {
            return false;
        }

        UpdateAutonomousContainerDatabaseDataGuardAssociationDetails other =
                (UpdateAutonomousContainerDatabaseDataGuardAssociationDetails) o;
        return java.util.Objects.equals(
                        this.isAutomaticFailoverEnabled, other.isAutomaticFailoverEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAutomaticFailoverEnabled == null
                                ? 43
                                : this.isAutomaticFailoverEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
