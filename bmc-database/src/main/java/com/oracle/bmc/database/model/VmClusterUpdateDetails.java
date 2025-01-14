/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details specifying which maintenance update to apply to the VM Cluster and which action is to be
 * performed by the maintenance update. Applies to Exadata Cloud@Customer instances only. <br>
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
        builder = VmClusterUpdateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VmClusterUpdateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"updateId", "updateAction", "giSoftwareImageId"})
    public VmClusterUpdateDetails(
            String updateId, UpdateAction updateAction, String giSoftwareImageId) {
        super();
        this.updateId = updateId;
        this.updateAction = updateAction;
        this.giSoftwareImageId = giSoftwareImageId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * maintenance update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("updateId")
        private String updateId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * maintenance update.
         *
         * @param updateId the value to set
         * @return this builder
         */
        public Builder updateId(String updateId) {
            this.updateId = updateId;
            this.__explicitlySet__.add("updateId");
            return this;
        }
        /** The update action to perform. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
        private UpdateAction updateAction;

        /**
         * The update action to perform.
         *
         * @param updateAction the value to set
         * @return this builder
         */
        public Builder updateAction(UpdateAction updateAction) {
            this.updateAction = updateAction;
            this.__explicitlySet__.add("updateAction");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * grid infrastructure software image. This is a database software image of the type {@code
         * GRID_IMAGE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("giSoftwareImageId")
        private String giSoftwareImageId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * grid infrastructure software image. This is a database software image of the type {@code
         * GRID_IMAGE}.
         *
         * @param giSoftwareImageId the value to set
         * @return this builder
         */
        public Builder giSoftwareImageId(String giSoftwareImageId) {
            this.giSoftwareImageId = giSoftwareImageId;
            this.__explicitlySet__.add("giSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmClusterUpdateDetails build() {
            VmClusterUpdateDetails model =
                    new VmClusterUpdateDetails(
                            this.updateId, this.updateAction, this.giSoftwareImageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmClusterUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("updateId")) {
                this.updateId(model.getUpdateId());
            }
            if (model.wasPropertyExplicitlySet("updateAction")) {
                this.updateAction(model.getUpdateAction());
            }
            if (model.wasPropertyExplicitlySet("giSoftwareImageId")) {
                this.giSoftwareImageId(model.getGiSoftwareImageId());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * maintenance update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateId")
    private final String updateId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * maintenance update.
     *
     * @return the value
     */
    public String getUpdateId() {
        return updateId;
    }

    /** The update action to perform. */
    public enum UpdateAction implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The update action to perform. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateAction")
    private final UpdateAction updateAction;

    /**
     * The update action to perform.
     *
     * @return the value
     */
    public UpdateAction getUpdateAction() {
        return updateAction;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a grid
     * infrastructure software image. This is a database software image of the type {@code
     * GRID_IMAGE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("giSoftwareImageId")
    private final String giSoftwareImageId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a grid
     * infrastructure software image. This is a database software image of the type {@code
     * GRID_IMAGE}.
     *
     * @return the value
     */
    public String getGiSoftwareImageId() {
        return giSoftwareImageId;
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
        sb.append("VmClusterUpdateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("updateId=").append(String.valueOf(this.updateId));
        sb.append(", updateAction=").append(String.valueOf(this.updateAction));
        sb.append(", giSoftwareImageId=").append(String.valueOf(this.giSoftwareImageId));
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
                && java.util.Objects.equals(this.giSoftwareImageId, other.giSoftwareImageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.updateId == null ? 43 : this.updateId.hashCode());
        result = (result * PRIME) + (this.updateAction == null ? 43 : this.updateAction.hashCode());
        result =
                (result * PRIME)
                        + (this.giSoftwareImageId == null ? 43 : this.giSoftwareImageId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
