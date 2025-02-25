/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details of an action member.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ActionMember.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ActionMember extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"memberOrder", "memberId", "estimatedTimeInMins"})
    public ActionMember(Integer memberOrder, String memberId, Integer estimatedTimeInMins) {
        super();
        this.memberOrder = memberOrder;
        this.memberId = memberId;
        this.estimatedTimeInMins = estimatedTimeInMins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The order of the action member in a scheduled action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memberOrder")
        private Integer memberOrder;

        /**
         * The order of the action member in a scheduled action.
         * @param memberOrder the value to set
         * @return this builder
         **/
        public Builder memberOrder(Integer memberOrder) {
            this.memberOrder = memberOrder;
            this.__explicitlySet__.add("memberOrder");
            return this;
        }
        /**
         * The ocid of the action member.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        /**
         * The ocid of the action member.
         * @param memberId the value to set
         * @return this builder
         **/
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * The estimated time for the intended action member.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
        private Integer estimatedTimeInMins;

        /**
         * The estimated time for the intended action member.
         * @param estimatedTimeInMins the value to set
         * @return this builder
         **/
        public Builder estimatedTimeInMins(Integer estimatedTimeInMins) {
            this.estimatedTimeInMins = estimatedTimeInMins;
            this.__explicitlySet__.add("estimatedTimeInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActionMember build() {
            ActionMember model =
                    new ActionMember(this.memberOrder, this.memberId, this.estimatedTimeInMins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActionMember model) {
            if (model.wasPropertyExplicitlySet("memberOrder")) {
                this.memberOrder(model.getMemberOrder());
            }
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("estimatedTimeInMins")) {
                this.estimatedTimeInMins(model.getEstimatedTimeInMins());
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
     * The order of the action member in a scheduled action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memberOrder")
    private final Integer memberOrder;

    /**
     * The order of the action member in a scheduled action.
     * @return the value
     **/
    public Integer getMemberOrder() {
        return memberOrder;
    }

    /**
     * The ocid of the action member.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memberId")
    private final String memberId;

    /**
     * The ocid of the action member.
     * @return the value
     **/
    public String getMemberId() {
        return memberId;
    }

    /**
     * The estimated time for the intended action member.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
    private final Integer estimatedTimeInMins;

    /**
     * The estimated time for the intended action member.
     * @return the value
     **/
    public Integer getEstimatedTimeInMins() {
        return estimatedTimeInMins;
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
        sb.append("ActionMember(");
        sb.append("super=").append(super.toString());
        sb.append("memberOrder=").append(String.valueOf(this.memberOrder));
        sb.append(", memberId=").append(String.valueOf(this.memberId));
        sb.append(", estimatedTimeInMins=").append(String.valueOf(this.estimatedTimeInMins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionMember)) {
            return false;
        }

        ActionMember other = (ActionMember) o;
        return java.util.Objects.equals(this.memberOrder, other.memberOrder)
                && java.util.Objects.equals(this.memberId, other.memberId)
                && java.util.Objects.equals(this.estimatedTimeInMins, other.estimatedTimeInMins)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.memberOrder == null ? 43 : this.memberOrder.hashCode());
        result = (result * PRIME) + (this.memberId == null ? 43 : this.memberId.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedTimeInMins == null
                                ? 43
                                : this.estimatedTimeInMins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
