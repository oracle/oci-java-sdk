/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details about what actions to perform and using what patch to the specified target.
 * This is part of an update request that is applied to a version field on the target such
 * as DB system, Database Home, etc.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"patchId", "databaseSoftwareImageId", "action"})
    public PatchDetails(String patchId, String databaseSoftwareImageId, Action action) {
        super();
        this.patchId = patchId;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         * @param patchId the value to set
         * @return this builder
         **/
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database software image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database software image.
         * @param databaseSoftwareImageId the value to set
         * @return this builder
         **/
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }
        /**
         * The action to perform on the patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to perform on the patch.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchDetails build() {
            PatchDetails model =
                    new PatchDetails(this.patchId, this.databaseSoftwareImageId, this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchDetails model) {
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     * @return the value
     **/
    public String getPatchId() {
        return patchId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database software image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database software image.
     * @return the value
     **/
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /**
     * The action to perform on the patch.
     **/
    public enum Action {
        Apply("APPLY"),
        Precheck("PRECHECK"),
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
     * The action to perform on the patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to perform on the patch.
     * @return the value
     **/
    public Action getAction() {
        return action;
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
        sb.append("PatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("patchId=").append(String.valueOf(this.patchId));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchDetails)) {
            return false;
        }

        PatchDetails other = (PatchDetails) o;
        return java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
