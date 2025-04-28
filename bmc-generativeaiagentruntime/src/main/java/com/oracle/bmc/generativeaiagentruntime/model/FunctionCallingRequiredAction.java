/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Represents an action for submitting function call outputs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FunctionCallingRequiredAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "requiredActionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FunctionCallingRequiredAction extends RequiredAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionId")
        private String actionId;

        public Builder actionId(String actionId) {
            this.actionId = actionId;
            this.__explicitlySet__.add("actionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functionCall")
        private FunctionCall functionCall;

        public Builder functionCall(FunctionCall functionCall) {
            this.functionCall = functionCall;
            this.__explicitlySet__.add("functionCall");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionCallingRequiredAction build() {
            FunctionCallingRequiredAction model =
                    new FunctionCallingRequiredAction(this.actionId, this.functionCall);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionCallingRequiredAction model) {
            if (model.wasPropertyExplicitlySet("actionId")) {
                this.actionId(model.getActionId());
            }
            if (model.wasPropertyExplicitlySet("functionCall")) {
                this.functionCall(model.getFunctionCall());
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
    public FunctionCallingRequiredAction(String actionId, FunctionCall functionCall) {
        super(actionId);
        this.functionCall = functionCall;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("functionCall")
    private final FunctionCall functionCall;

    public FunctionCall getFunctionCall() {
        return functionCall;
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
        sb.append("FunctionCallingRequiredAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionCall=").append(String.valueOf(this.functionCall));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionCallingRequiredAction)) {
            return false;
        }

        FunctionCallingRequiredAction other = (FunctionCallingRequiredAction) o;
        return java.util.Objects.equals(this.functionCall, other.functionCall)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionCall == null ? 43 : this.functionCall.hashCode());
        return result;
    }
}
