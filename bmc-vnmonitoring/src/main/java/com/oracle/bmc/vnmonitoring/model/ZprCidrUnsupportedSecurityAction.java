/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the security action taken when zpr cidr policy is not supported. <br>
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
        builder = ZprCidrUnsupportedSecurityAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "action")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ZprCidrUnsupportedSecurityAction extends SecurityAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("zprCidrUnsupportedSecurityActionDetails")
        private ZprCidrUnsupportedSecurityActionDetails zprCidrUnsupportedSecurityActionDetails;

        public Builder zprCidrUnsupportedSecurityActionDetails(
                ZprCidrUnsupportedSecurityActionDetails zprCidrUnsupportedSecurityActionDetails) {
            this.zprCidrUnsupportedSecurityActionDetails = zprCidrUnsupportedSecurityActionDetails;
            this.__explicitlySet__.add("zprCidrUnsupportedSecurityActionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZprCidrUnsupportedSecurityAction build() {
            ZprCidrUnsupportedSecurityAction model =
                    new ZprCidrUnsupportedSecurityAction(
                            this.actionType, this.zprCidrUnsupportedSecurityActionDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZprCidrUnsupportedSecurityAction model) {
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("zprCidrUnsupportedSecurityActionDetails")) {
                this.zprCidrUnsupportedSecurityActionDetails(
                        model.getZprCidrUnsupportedSecurityActionDetails());
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
    public ZprCidrUnsupportedSecurityAction(
            ActionType actionType,
            ZprCidrUnsupportedSecurityActionDetails zprCidrUnsupportedSecurityActionDetails) {
        super(actionType);
        this.zprCidrUnsupportedSecurityActionDetails = zprCidrUnsupportedSecurityActionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("zprCidrUnsupportedSecurityActionDetails")
    private final ZprCidrUnsupportedSecurityActionDetails zprCidrUnsupportedSecurityActionDetails;

    public ZprCidrUnsupportedSecurityActionDetails getZprCidrUnsupportedSecurityActionDetails() {
        return zprCidrUnsupportedSecurityActionDetails;
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
        sb.append("ZprCidrUnsupportedSecurityAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", zprCidrUnsupportedSecurityActionDetails=")
                .append(String.valueOf(this.zprCidrUnsupportedSecurityActionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZprCidrUnsupportedSecurityAction)) {
            return false;
        }

        ZprCidrUnsupportedSecurityAction other = (ZprCidrUnsupportedSecurityAction) o;
        return java.util.Objects.equals(
                        this.zprCidrUnsupportedSecurityActionDetails,
                        other.zprCidrUnsupportedSecurityActionDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.zprCidrUnsupportedSecurityActionDetails == null
                                ? 43
                                : this.zprCidrUnsupportedSecurityActionDetails.hashCode());
        return result;
    }
}
