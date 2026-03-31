/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request details for submitting an operating system (OS) patch action on a DB system.
 * Use PRECHECK to validate prerequisites and surface the expected changes without applying them. Use APPLY to install the selected updates. Some updates may require a reboot to take effect.
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
    builder = ExecuteDbSystemOsPatchDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteDbSystemOsPatchDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "dbNodeId"})
    public ExecuteDbSystemOsPatchDetails(Action action, String dbNodeId) {
        super();
        this.action = action;
        this.dbNodeId = dbNodeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operation system (OS) patch action to perform
         * * PRECHECK: No changes applied; runs validation/dry run.
         * * APPLY: Installs updates; may require a reboot (see OS patch history entry details to determine isRebootRequired).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * Operation system (OS) patch action to perform
         * * PRECHECK: No changes applied; runs validation/dry run.
         * * APPLY: Installs updates; may require a reboot (see OS patch history entry details to determine isRebootRequired).
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The OCID of the DB node to target for this patch action. If omitted, the action applies to all nodes in the DB system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeId")
        private String dbNodeId;

        /**
         * The OCID of the DB node to target for this patch action. If omitted, the action applies to all nodes in the DB system.
         * @param dbNodeId the value to set
         * @return this builder
         **/
        public Builder dbNodeId(String dbNodeId) {
            this.dbNodeId = dbNodeId;
            this.__explicitlySet__.add("dbNodeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteDbSystemOsPatchDetails build() {
            ExecuteDbSystemOsPatchDetails model =
                    new ExecuteDbSystemOsPatchDetails(this.action, this.dbNodeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteDbSystemOsPatchDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("dbNodeId")) {
                this.dbNodeId(model.getDbNodeId());
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
     * Operation system (OS) patch action to perform
     * * PRECHECK: No changes applied; runs validation/dry run.
     * * APPLY: Installs updates; may require a reboot (see OS patch history entry details to determine isRebootRequired).
     *
     **/
    public enum Action {
        Precheck("PRECHECK"),
        Apply("APPLY"),
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
    /**
     * Operation system (OS) patch action to perform
     * * PRECHECK: No changes applied; runs validation/dry run.
     * * APPLY: Installs updates; may require a reboot (see OS patch history entry details to determine isRebootRequired).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * Operation system (OS) patch action to perform
     * * PRECHECK: No changes applied; runs validation/dry run.
     * * APPLY: Installs updates; may require a reboot (see OS patch history entry details to determine isRebootRequired).
     *
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The OCID of the DB node to target for this patch action. If omitted, the action applies to all nodes in the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeId")
    private final String dbNodeId;

    /**
     * The OCID of the DB node to target for this patch action. If omitted, the action applies to all nodes in the DB system.
     * @return the value
     **/
    public String getDbNodeId() {
        return dbNodeId;
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
        sb.append("ExecuteDbSystemOsPatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", dbNodeId=").append(String.valueOf(this.dbNodeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteDbSystemOsPatchDetails)) {
            return false;
        }

        ExecuteDbSystemOsPatchDetails other = (ExecuteDbSystemOsPatchDetails) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.dbNodeId, other.dbNodeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.dbNodeId == null ? 43 : this.dbNodeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
