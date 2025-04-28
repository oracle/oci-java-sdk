/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the security action taken on denied traffic. <br>
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
        builder = DeniedSecurityAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeniedSecurityAction extends SecurityAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deniedSecurityActionDetails")
        private DeniedSecurityActionDetails deniedSecurityActionDetails;

        public Builder deniedSecurityActionDetails(
                DeniedSecurityActionDetails deniedSecurityActionDetails) {
            this.deniedSecurityActionDetails = deniedSecurityActionDetails;
            this.__explicitlySet__.add("deniedSecurityActionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeniedSecurityAction build() {
            DeniedSecurityAction model =
                    new DeniedSecurityAction(this.actionType, this.deniedSecurityActionDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeniedSecurityAction model) {
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("deniedSecurityActionDetails")) {
                this.deniedSecurityActionDetails(model.getDeniedSecurityActionDetails());
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
    public DeniedSecurityAction(
            ActionType actionType, DeniedSecurityActionDetails deniedSecurityActionDetails) {
        super(actionType);
        this.deniedSecurityActionDetails = deniedSecurityActionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deniedSecurityActionDetails")
    private final DeniedSecurityActionDetails deniedSecurityActionDetails;

    public DeniedSecurityActionDetails getDeniedSecurityActionDetails() {
        return deniedSecurityActionDetails;
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
        sb.append("DeniedSecurityAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", deniedSecurityActionDetails=")
                .append(String.valueOf(this.deniedSecurityActionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeniedSecurityAction)) {
            return false;
        }

        DeniedSecurityAction other = (DeniedSecurityAction) o;
        return java.util.Objects.equals(
                        this.deniedSecurityActionDetails, other.deniedSecurityActionDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deniedSecurityActionDetails == null
                                ? 43
                                : this.deniedSecurityActionDetails.hashCode());
        return result;
    }
}
