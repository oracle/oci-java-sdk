/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the ordering list of action resources. <br>
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
        builder = ActionOrderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActionOrderDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"actionOrder", "actionResourceId"})
    public ActionOrderDetails(Integer actionOrder, String actionResourceId) {
        super();
        this.actionOrder = actionOrder;
        this.actionResourceId = actionResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The priority order of the action resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionOrder")
        private Integer actionOrder;

        /**
         * The priority order of the action resource.
         *
         * @param actionOrder the value to set
         * @return this builder
         */
        public Builder actionOrder(Integer actionOrder) {
            this.actionOrder = actionOrder;
            this.__explicitlySet__.add("actionOrder");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * action resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionResourceId")
        private String actionResourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * action resource.
         *
         * @param actionResourceId the value to set
         * @return this builder
         */
        public Builder actionResourceId(String actionResourceId) {
            this.actionResourceId = actionResourceId;
            this.__explicitlySet__.add("actionResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActionOrderDetails build() {
            ActionOrderDetails model =
                    new ActionOrderDetails(this.actionOrder, this.actionResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActionOrderDetails model) {
            if (model.wasPropertyExplicitlySet("actionOrder")) {
                this.actionOrder(model.getActionOrder());
            }
            if (model.wasPropertyExplicitlySet("actionResourceId")) {
                this.actionResourceId(model.getActionResourceId());
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

    /** The priority order of the action resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionOrder")
    private final Integer actionOrder;

    /**
     * The priority order of the action resource.
     *
     * @return the value
     */
    public Integer getActionOrder() {
        return actionOrder;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * action resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionResourceId")
    private final String actionResourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * action resource.
     *
     * @return the value
     */
    public String getActionResourceId() {
        return actionResourceId;
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
        sb.append("ActionOrderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("actionOrder=").append(String.valueOf(this.actionOrder));
        sb.append(", actionResourceId=").append(String.valueOf(this.actionResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionOrderDetails)) {
            return false;
        }

        ActionOrderDetails other = (ActionOrderDetails) o;
        return java.util.Objects.equals(this.actionOrder, other.actionOrder)
                && java.util.Objects.equals(this.actionResourceId, other.actionResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionOrder == null ? 43 : this.actionOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.actionResourceId == null ? 43 : this.actionResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
