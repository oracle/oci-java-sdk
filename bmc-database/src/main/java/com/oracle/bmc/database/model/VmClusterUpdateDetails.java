/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details specifying which maintenance update to apply to the VM Cluster and which action is to be performed by the maintenance update. Applies to Exadata Cloud@Customer instances only.
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
    builder = VmClusterUpdateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VmClusterUpdateDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"updateId", "updateAction"})
    public VmClusterUpdateDetails(String updateId, UpdateAction updateAction) {
        super();
        this.updateId = updateId;
        this.updateAction = updateAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateId")
        private String updateId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
         * @param updateId the value to set
         * @return this builder
         **/
        public Builder updateId(String updateId) {
            this.updateId = updateId;
            this.__explicitlySet__.add("updateId");
            return this;
        }
        /**
         * The update action to perform.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
        private UpdateAction updateAction;

        /**
         * The update action to perform.
         * @param updateAction the value to set
         * @return this builder
         **/
        public Builder updateAction(UpdateAction updateAction) {
            this.updateAction = updateAction;
            this.__explicitlySet__.add("updateAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmClusterUpdateDetails build() {
            VmClusterUpdateDetails __instance__ =
                    new VmClusterUpdateDetails(updateId, updateAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmClusterUpdateDetails o) {
            Builder copiedBuilder = updateId(o.getUpdateId()).updateAction(o.getUpdateAction());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateId")
    private final String updateId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
     * @return the value
     **/
    public String getUpdateId() {
        return updateId;
    }

    /**
     * The update action to perform.
     **/
    public enum UpdateAction {
        RollingApply("ROLLING_APPLY"),
        Precheck("PRECHECK"),
        Rollback("ROLLBACK"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateAction> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateAction v : UpdateAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateAction: " + key);
        }
    };
    /**
     * The update action to perform.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
    private final UpdateAction updateAction;

    /**
     * The update action to perform.
     * @return the value
     **/
    public UpdateAction getUpdateAction() {
        return updateAction;
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
        sb.append("VmClusterUpdateDetails(");
        sb.append("updateId=").append(String.valueOf(this.updateId));
        sb.append(", updateAction=").append(String.valueOf(this.updateAction));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmClusterUpdateDetails)) {
            return false;
        }

        VmClusterUpdateDetails other = (VmClusterUpdateDetails) o;
        return java.util.Objects.equals(this.updateId, other.updateId)
                && java.util.Objects.equals(this.updateAction, other.updateAction)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.updateId == null ? 43 : this.updateId.hashCode());
        result = (result * PRIME) + (this.updateAction == null ? 43 : this.updateAction.hashCode());
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
