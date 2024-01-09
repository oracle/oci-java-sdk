/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for upgrading a database to a specific Oracle Database version. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpgradeDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpgradeDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "databaseUpgradeSourceDetails"})
    public UpgradeDatabaseDetails(
            Action action, DatabaseUpgradeSourceBase databaseUpgradeSourceDetails) {
        super();
        this.action = action;
        this.databaseUpgradeSourceDetails = databaseUpgradeSourceDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The database upgrade action. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The database upgrade action.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseUpgradeSourceDetails")
        private DatabaseUpgradeSourceBase databaseUpgradeSourceDetails;

        public Builder databaseUpgradeSourceDetails(
                DatabaseUpgradeSourceBase databaseUpgradeSourceDetails) {
            this.databaseUpgradeSourceDetails = databaseUpgradeSourceDetails;
            this.__explicitlySet__.add("databaseUpgradeSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeDatabaseDetails build() {
            UpgradeDatabaseDetails model =
                    new UpgradeDatabaseDetails(this.action, this.databaseUpgradeSourceDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("databaseUpgradeSourceDetails")) {
                this.databaseUpgradeSourceDetails(model.getDatabaseUpgradeSourceDetails());
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

    /** The database upgrade action. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Precheck("PRECHECK"),
        Upgrade("UPGRADE"),
        Rollback("ROLLBACK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /** The database upgrade action. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The database upgrade action.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseUpgradeSourceDetails")
    private final DatabaseUpgradeSourceBase databaseUpgradeSourceDetails;

    public DatabaseUpgradeSourceBase getDatabaseUpgradeSourceDetails() {
        return databaseUpgradeSourceDetails;
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
        sb.append("UpgradeDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", databaseUpgradeSourceDetails=")
                .append(String.valueOf(this.databaseUpgradeSourceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeDatabaseDetails)) {
            return false;
        }

        UpgradeDatabaseDetails other = (UpgradeDatabaseDetails) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(
                        this.databaseUpgradeSourceDetails, other.databaseUpgradeSourceDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseUpgradeSourceDetails == null
                                ? 43
                                : this.databaseUpgradeSourceDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
